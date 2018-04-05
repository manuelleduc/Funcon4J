package funcons.truffle.auxiliary;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.IInteger;
import io.usethesource.vallang.IMap;
import io.usethesource.vallang.IValue;

@NodeInfo(description = "IntoFloatConversion IntToFloat Node")
public class IntoFloatConversionIntToFloatNode extends Node implements CLExecuteNode {

    @Child
    private CLExecuteNode i;

    public IntoFloatConversionIntToFloatNode(CLExecuteNode i) {
        this.i = i;
    }

    @Override
    public IValue buildAST(IMap env, IValue given) throws FunconException {
        return ((IInteger) i.buildAST(env, given)).toReal(5);
    }
}
