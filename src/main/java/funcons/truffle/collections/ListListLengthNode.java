package funcons.truffle.collections;

import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "List ListLength Node")
public class ListListLengthNode extends Node implements FNCExecuteNode {

    ValueFactory vf = ValueFactory.getInstance();


    @Child
    FNCExpressionNode list;

    public ListListLengthNode(FNCExpressionNode list) {
        this.list = list;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
////        return vf.integer(((IList) list.buildAST()).length());
//        return this;
//    }
}
