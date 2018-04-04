package funcons.truffle.collections;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.values.Null;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.IList;
import io.usethesource.vallang.IMap;
import io.usethesource.vallang.IValue;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Vector VectoreLength Node")
public class VectorVectorLengthNode extends Node implements CLExecuteNode {

    @Node.Child
    private CLExecuteNode vector;

    ValueFactory vf = ValueFactory.getInstance();

    public VectorVectorLengthNode(CLExecuteNode vector) {
        this.vector = vector;
    }

    @Override
    public IValue eval(IMap env, Null given) throws FunconException {
        return vf.integer(((IList) vector.eval(env, given)).length());
    }
}
