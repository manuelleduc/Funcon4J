package funcons.truffle.functions;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.values.Abs;
import funcons.values.Null;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.IMap;
import io.usethesource.vallang.IValue;


@NodeInfo(description = "Function Abs Node")
public class FunctionAbsNode extends Node implements CLExecuteNode {

    @Child
    private CLExecuteNode exp;

    public FunctionAbsNode(CLExecuteNode exp) {
        this.exp = exp;
    }

    @Override
    public IValue eval(IMap env, Null given) throws FunconException {
        return new Abs<>(exp);
    }
}
