package funcons.truffle.auxiliary;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.values.Null;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.IMap;
import io.usethesource.vallang.IReal;
import io.usethesource.vallang.IValue;

@NodeInfo(description = "IntoFloatConversion FloatToInto Node")
public class IntoFloatConversionFloatToIntoNode extends Node implements CLExecuteNode {

    @Child
    private CLExecuteNode f;

    public IntoFloatConversionFloatToIntoNode(CLExecuteNode f) {
        this.f = f;
    }

    @Override
    public IValue eval(IMap env, Null given) throws FunconException {
        return ((IReal) f.eval(env, given)).toInteger();
    }
}
