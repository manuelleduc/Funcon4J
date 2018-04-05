package funcons.truffle.nodes;

import com.oracle.truffle.api.nodes.NodeInterface;

public interface FNCExecuteNode extends NodeInterface {
    default FNCExecuteNode buildAST() {
        System.out.println("BuildAST: " + toString());
        return this;
    }

//    default Object executeGeneric(VirtualFrame frame) {
//        System.out.println("executeGeneric: " + toString());
//        throw new RuntimeException("Execute void not implemented");
//    }
}
