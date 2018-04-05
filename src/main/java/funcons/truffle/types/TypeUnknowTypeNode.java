package funcons.truffle.types;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.values.Null;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.IMap;
import io.usethesource.vallang.IValue;
import io.usethesource.vallang.impl.persistent.ValueFactory;


@NodeInfo(description = "Type UnknowType Node")
public class TypeUnknowTypeNode extends Node implements CLExecuteNode {

    ValueFactory vf = ValueFactory.getInstance();


    @Override
    public IValue buildAST(IMap env, IValue given) throws FunconException {
        return vf.string("UnknownType");
    }
}
