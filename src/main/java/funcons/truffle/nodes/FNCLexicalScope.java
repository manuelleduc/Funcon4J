package funcons.truffle.nodes;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.frame.Frame;
import com.oracle.truffle.api.frame.FrameSlot;
import com.oracle.truffle.api.interop.*;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeUtil;
import com.oracle.truffle.api.nodes.NodeVisitor;
import com.oracle.truffle.api.nodes.RootNode;

import java.util.*;

public class FNCLexicalScope {
    private final Node current;
    private final FNCStatementNode block;
    private final FNCStatementNode parentBlock;
    private final RootNode root;
    private FNCLexicalScope parent;
    private Map<String, FrameSlot> varSlots;

    private FNCLexicalScope(Node current, FNCStatementNode block, FNCStatementNode parentBlock) {
        this.current = current;
        this.block = block;
        this.parentBlock = parentBlock;
        this.root = null;
    }

    public Object getArguments(Frame frame) {
        if (root == null) {
            // No arguments for block scope
            return null;
        }
        // The slots give us names of the arguments:
        Map<String, FrameSlot> argSlots = collectArgs(block);
        // The frame's arguments array give us the argument values:
        Object[] args = (frame != null) ? frame.getArguments() : null;
        // Create a TruffleObject having the arguments as properties:
        return new VariablesMapObject(argSlots, args, frame);
    }

    /**
     * Create a new functional SL lexical scope.
     *
     * @param current the current node, or <code>null</code> when it would be above the block
     * @param block   a nearest block enclosing the current node
     * @param root    a functional root node for top-most block
     */
    private FNCLexicalScope(Node current, FNCStatementNode block, RootNode root) {
        this.current = current;
        this.block = block;
        this.parentBlock = null;
        this.root = root;
    }

    public Node getNode() {
        if (root != null) {
            return root;
        } else {
            return block;
        }
    }

    public static FNCLexicalScope createScope(Node node) {
        FNCStatementNode block = getParentBlock(node);
        if (block == null) {
            // We're in the root.
            block = findChildrenBlock(node);
            if (block == null) {
                // Corrupted SL AST, no block was found
//                assert node.getRootNode() instanceof FNCEE : "Corrupted SL AST under " + node;
                return new FNCLexicalScope(null, null, (FNCStatementNode) null);
            }
            node = null; // node is above the block
        }
        // Test if there is a parent block. If not, we're in the root scope.
        FNCStatementNode parentBlock = getParentBlock(block);
        if (parentBlock == null) {
            return new FNCLexicalScope(node, block, block.getRootNode());
        } else {
            return new FNCLexicalScope(node, block, parentBlock);
        }
    }

    private static FNCStatementNode findChildrenBlock(Node node) {
        FNCStatementNode[] blockPtr = new FNCStatementNode[1];
        node.accept(new NodeVisitor() {
            @Override
            public boolean visit(Node n) {
                if (n instanceof FNCStatementNode) {
                    blockPtr[0] = (FNCStatementNode) n;
                    return false;
                } else {
                    return true;
                }
            }
        });
        return blockPtr[0];
    }

    public FNCLexicalScope findParent() {
        if (parentBlock == null) {
            // This was a root scope.
            return null;
        }
        if (parent == null) {
            Node node = block;
            FNCStatementNode newBlock = parentBlock;
            // Test if there is a next parent block. If not, we're in the root scope.
            FNCStatementNode newParentBlock = getParentBlock(newBlock);
            if (newParentBlock == null) {
                parent = null;
            } else {
                parent = null;
            }
        }
        return parent;
    }

    private static FNCStatementNode getParentBlock(Node node) {
        FNCStatementNode block;
        Node parent = node.getParent();
        // Find a nearest block node.
        while (parent != null && !(parent instanceof FNCStatementNode)) {
            parent = parent.getParent();
        }
        if (parent != null) {
            block = (FNCStatementNode) parent;
        } else {
            block = null;
        }
        return block;
    }

    public String getName() {
        if (root != null) {
            return root.getName();
        } else {
            return "block";
        }
    }

    private static Map<String, FrameSlot> collectArgs(Node block) {
        // Arguments are pushed to frame slots at the beginning of the function block.
        // To collect argument slots, search for SLReadArgumentNode inside of
        // SLWriteLocalVariableNode.
        Map<String, FrameSlot> args = new LinkedHashMap<>(4);
        NodeUtil.forEachChild(block, new NodeVisitor() {

//            private SLWriteLocalVariableNode wn; // The current write node containing a slot

            @Override
            public boolean visit(Node node) {
                // When there is a write node, search for SLReadArgumentNode among its children:
//                if (node instanceof SLWriteLocalVariableNode) {
//                    wn = (SLWriteLocalVariableNode) node;
//                    boolean all = NodeUtil.forEachChild(node, this);
//                    wn = null;
//                    return all;
//                } else if (wn != null && (node instanceof SLReadArgumentNode)) {
//                    FrameSlot slot = wn.getSlot();
//                    String name = Objects.toString(slot.getIdentifier());
//                    assert !args.containsKey(name) : name + " argument exists already.";
//                    args.put(name, slot);
//                    return true;
//                } else if (wn == null && (node instanceof SLStatementNode)) {
//                    // A different SL node - we're done.
//                    return false;
//                } else {
//                    return NodeUtil.forEachChild(node, this);
//                }

                throw new RuntimeException("Not implemented");
            }
        });
        return args;
    }

    private Map<String, FrameSlot> getVars() {
        if (varSlots == null) {
            if (current != null) {
                varSlots = collectVars(block, current);
            } else if (block != null) {
                // Provide the arguments only when the current node is above the block
                varSlots = collectArgs(block);
            } else {
                varSlots = Collections.emptyMap();
            }
        }
        return varSlots;
    }

    private Map<String, FrameSlot> collectVars(Node varsBlock, Node currentNode) {
        // Variables are slot-based.
        // To collect declared variables, traverse the block's AST and find slots associated
        // with SLWriteLocalVariableNode. The traversal stops when we hit the current node.
        Map<String, FrameSlot> slots = new LinkedHashMap<>(4);
        NodeUtil.forEachChild(varsBlock, new NodeVisitor() {
            @Override
            public boolean visit(Node node) {
                if (node == currentNode) {
                    return false;
                }
                // Do not enter any nested blocks.
                if (!(node instanceof FNCStatementNode)) {
                    boolean all = NodeUtil.forEachChild(node, this);
                    if (!all) {
                        return false;
                    }
                }
                // Write to a variable is a declaration unless it exists already in a parent scope.
//                if (node instanceof SLWriteLocalVariableNode) {
//                    SLWriteLocalVariableNode wn = (SLWriteLocalVariableNode) node;
//                    String name = Objects.toString(wn.getSlot().getIdentifier());
//                    if (!hasParentVar(name)) {
//                        slots.put(name, wn.getSlot());
//                    }
//                }
                return true;
            }
        });
        return slots;
    }

    public Object getVariables(Frame frame) {
        Map<String, FrameSlot> vars = getVars();
        Object[] args = null;
        // Use arguments when the current node is above the block
        if (current == null) {
            args = (frame != null) ? frame.getArguments() : null;
        }
        return new VariablesMapObject(vars, args, frame);
    }

    static final class VariablesMapObject implements TruffleObject {

        final Map<String, ? extends FrameSlot> slots;
        final Object[] args;
        final Frame frame;

        private VariablesMapObject(Map<String, ? extends FrameSlot> slots, Object[] args, Frame frame) {
            this.slots = slots;
            this.args = args;
            this.frame = frame;
        }

        @Override
        public ForeignAccess getForeignAccess() {
            return null;
        }

        public static boolean isInstance(TruffleObject obj) {
            return obj instanceof VariablesMapObject;
        }

        @MessageResolution(receiverType = VariablesMapObject.class)
        static final class VariablesMapMessageResolution {

            @Resolve(message = "HAS_KEYS")
            abstract static class VarsMapHasKeysNode extends Node {

                public Object access(VariablesMapObject varMap) {
                    assert varMap != null;
                    return true;
                }
            }

            @Resolve(message = "KEYS")
            abstract static class VarsMapKeysNode extends Node {

                @CompilerDirectives.TruffleBoundary
                public Object access(VariablesMapObject varMap) {
                    return new VariableNamesObject(varMap.slots.keySet());
                }
            }

            @Resolve(message = "KEY_INFO")
            abstract static class KeyInfoNode extends Node {

                @CompilerDirectives.TruffleBoundary
                public int access(VariablesMapObject varMap, String name) {
                    if (varMap.frame == null) {
                        return KeyInfo.READABLE;
                    }
                    FrameSlot slot = varMap.slots.get(name);
                    if (slot != null) {
                        return KeyInfo.READABLE | KeyInfo.MODIFIABLE;
                    }
                    return KeyInfo.NONE;
                }
            }

            @Resolve(message = "READ")
            abstract static class VarsMapReadNode extends Node {

                @CompilerDirectives.TruffleBoundary
                public Object access(VariablesMapObject varMap, String name) {
//                    if (varMap.frame == null) {
//                        return SLNull.SINGLETON;
//                    }
                    FrameSlot slot = varMap.slots.get(name);
                    if (slot == null) {
                        throw UnknownIdentifierException.raise(name);
                    } else {
                        Object value;
                        if (varMap.args != null && varMap.args.length > slot.getIndex()) {
                            value = varMap.args[slot.getIndex()];
                        } else {
                            value = varMap.frame.getValue(slot);
                        }
                        return value;
                    }
                }
            }

            @Resolve(message = "WRITE")
            abstract static class VarsMapWriteNode extends Node {

                @CompilerDirectives.TruffleBoundary
                public Object access(VariablesMapObject varMap, String name, Object value) {
                    if (varMap.frame == null) {
                        throw UnsupportedMessageException.raise(Message.WRITE);
                    }
                    FrameSlot slot = varMap.slots.get(name);
                    if (slot == null) {
                        throw UnknownIdentifierException.raise(name);
                    } else {
                        if (varMap.args != null && varMap.args.length > slot.getIndex()) {
                            varMap.args[slot.getIndex()] = value;
                        } else {
                            varMap.frame.setObject(slot, value);
                        }
                        return value;
                    }
                }
            }
        }
    }

    static final class VariableNamesObject implements TruffleObject {

        final List<String> names;

        private VariableNamesObject(Set<String> names) {
            this.names = new ArrayList<>(names);
        }

        @Override
        public ForeignAccess getForeignAccess() {
            return null;
        }

        public static boolean isInstance(TruffleObject obj) {
            return obj instanceof VariableNamesObject;
        }

        @MessageResolution(receiverType = VariableNamesObject.class)
        static final class VariableNamesMessageResolution {

            @Resolve(message = "HAS_SIZE")
            abstract static class VarNamesHasSizeNode extends Node {

                @SuppressWarnings("unused")
                public Object access(VariableNamesObject varNames) {
                    return true;
                }
            }

            @Resolve(message = "GET_SIZE")
            abstract static class VarNamesGetSizeNode extends Node {

                public Object access(VariableNamesObject varNames) {
                    return varNames.names.size();
                }
            }

            @Resolve(message = "READ")
            abstract static class VarNamesReadNode extends Node {

                @CompilerDirectives.TruffleBoundary
                public Object access(VariableNamesObject varNames, int index) {
                    try {
                        return varNames.names.get(index);
                    } catch (IndexOutOfBoundsException ioob) {
                        throw UnknownIdentifierException.raise(Integer.toString(index));
                    }
                }
            }

        }
    }
}
