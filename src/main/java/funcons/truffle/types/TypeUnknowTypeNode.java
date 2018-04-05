package funcons.truffle.types;

import funcons.truffle.nodes.FNCExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import io.usethesource.vallang.impl.persistent.ValueFactory;


@NodeInfo(description = "Type UnknowType Node")
public class TypeUnknowTypeNode extends Node implements FNCExecuteNode {

    ValueFactory vf = ValueFactory.getInstance();


//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return vf.string("UnknownType");
//    }
}
