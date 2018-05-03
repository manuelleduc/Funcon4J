package funcons.truffle.entities;

import com.oracle.truffle.api.frame.FrameSlot;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCFunctionRegistry;
import funcons.truffle.nodes.FNCLanguage;
import funcons.truffle.nodes.FNCRootNode;
import io.usethesource.vallang.IString;


/**
 * is a declaration funcon used to compute the single-point envi- ronment that maps I to the value of E
 */
@NodeInfo(description = "Binding Bind Value Node")
//@NodeChild("valueNode")
//@NodeField(name = "slot", type = FrameSlot.class)
public class BindingBindValueNode extends FNCExpressionNode {
    private final FNCLanguage language;

    @Child
    private FNCExpressionNode id;

    @Child
    private FNCExpressionNode exp;

    public BindingBindValueNode(FNCLanguage l, FNCExpressionNode id, FNCExpressionNode exp) {

        super();
        this.language = l;
        this.id = id;
        this.exp = exp;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
//        final FNCFunctionRegistry registry = language.getContextReference().get().getRegistry();
//        final Object o = id.executeGeneric(frame);
//        final String value = ((IString) o).getValue();
//        final FNCRootNode rootNode = new FNCRootNode(language, exp);
//        return registry.register(value, rootNode);

        Object value = this.exp.executeGeneric(frame);
        Object name = this.id.executeGeneric(frame);
        FrameSlot frameDescriptor = frame.getFrameDescriptor().findOrAddFrameSlot(name);
        frame.setObject(frameDescriptor, value);
        return value;
    }


//    protected abstract FrameSlot getSlot();
//
//    @Specialization(guards = "isIntOrIllegal(frame)")
//    protected IInteger writeIInteger(VirtualFrame frame, IInteger value) {
//        System.out.println("call writeIInteger");
//        /* Initialize type on first write of the local variable. No-op if kind is already Long. */
//        getSlot().setKind(FrameSlotKind.Int);
//
//        frame.setInt(getSlot(), value.intValue());
//
//
//        return value;
//    }
//
//
//    @Specialization(guards = "isBooleanOrIllegal(frame)")
//    protected IBool writeIBool(VirtualFrame frame, IBool value) {
//        System.out.println("call writeIIBool");
//        /* Initialize type on first write of the local variable. No-op if kind is already Long. */
//        getSlot().setKind(FrameSlotKind.Boolean);
//
//        frame.setBoolean(getSlot(), value.getValue());
//        return value;
//    }
//
//    /**
//     * Generic write method that works for all possible types.
//     * <p>
//     * Why is this method annotated with {@link Specialization} and not {@link Fallback}? For a
//     * {@link Fallback} method, the Truffle DSL generated code would try all other specializations
//     * first before calling this method. We know that all these specializations would fail their
//     * guards, so there is no point in calling them. Since this method takes a value of type
//     * {@link Object}, it is guaranteed to never fail, i.e., once we are in this specialization the
//     * node will never be re-specialized.
//     */
//    @Specialization(replaces = {"writeIInteger", "writeIBool"})
//    protected Object write(VirtualFrame frame, Object value) {
//        System.out.println("call write");
//        /*
//         * Regardless of the type before, the new and final type of the local variable is Object.
//         * Changing the slot kind also discards compiled code, because the variable type is
//         * important when the compiler optimizes a method.
//         *
//         * No-op if kind is already Object.
//         */
//        getSlot().setKind(FrameSlotKind.Object);
//
//        frame.setObject(getSlot(), value);
//        return value;
//    }
//
//    /**
//     * Guard function that the local variable has the type {@code long}.
//     *
//     * @param frame The parameter seems unnecessary, but it is required: Without the parameter, the
//     *              Truffle DSL would not check the guard on every execution of the specialization.
//     *              Guards without parameters are assumed to be pure, but our guard depends on the
//     *              slot kind which can change.
//     */
//    protected boolean isIntOrIllegal(@SuppressWarnings("unused") VirtualFrame frame) {
//        return getSlot().getKind() == FrameSlotKind.Int || getSlot().getKind() == FrameSlotKind.Illegal;
//    }
//
//
//    protected boolean isBooleanOrIllegal(@SuppressWarnings("unused") VirtualFrame frame) {
//        return getSlot().getKind() == FrameSlotKind.Boolean || getSlot().getKind() == FrameSlotKind.Illegal;
//    }
//
//    @Override
//    public String toString() {
//        return "BindingBindValueNode{}";
//    }
}
