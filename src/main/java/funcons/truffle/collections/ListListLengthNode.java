package funcons.truffle.collections;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.IList;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "List ListLength Node")
public class ListListLengthNode extends Node implements CLExecuteNode {

    ValueFactory vf = ValueFactory.getInstance();


    @Node.Child
    private CLExecuteNode list;

    public ListListLengthNode(CLExecuteNode list) {
        this.list = list;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
////        return vf.integer(((IList) list.buildAST()).length());
//        return this;
//    }
}
