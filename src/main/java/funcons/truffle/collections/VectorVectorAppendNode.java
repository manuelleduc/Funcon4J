package funcons.truffle.collections;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.IList;
import io.usethesource.vallang.IMap;
import io.usethesource.vallang.IValue;


@NodeInfo(description = "Vectore VectorAppend Node")
public class VectorVectorAppendNode extends Node implements CLExecuteNode {

    @Child
    private CLExecuteNode vector1;

    @Child
    private CLExecuteNode vector2;

    public VectorVectorAppendNode(CLExecuteNode vector1, CLExecuteNode vector2) {
        this.vector1 = vector1;
        this.vector2 = vector2;
    }

    @Override
    public IValue buildAST(IMap env, IValue given) throws FunconException {
        final IList vector1Val = (IList) vector1.buildAST(env, given);
        final IList vector2Val = (IList) vector2.buildAST(env, given);
        return vector1Val.concat(vector2Val);
    }
}
