package funcons.truffle.values;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.IMap;
import io.usethesource.vallang.IValue;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Bool Equal Node")
public class BoolEqualNode extends Node implements CLExecuteNode {
    ValueFactory vf = ValueFactory.getInstance();

    @Child
    private CLExecuteNode e1;

    @Child
    private CLExecuteNode e2;

    public BoolEqualNode(CLExecuteNode e1, CLExecuteNode e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    @Override
    public IValue buildAST(IMap env, IValue given) throws FunconException {
        return vf.bool(e1.buildAST(env, given).isEqual(e2.buildAST(env, given)));
    }
}
