package funcons.truffle.collections;

import funcons.truffle.nodes.FNCExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;


@NodeInfo(description = "Tuple Project Node")
public class TupleProjectNode extends Node implements FNCExecuteNode {
    @Child
    private FNCExecuteNode index;

    @Child
    private FNCExecuteNode tup;

    public TupleProjectNode(FNCExecuteNode index, FNCExecuteNode tup) {
        this.index = index;
        this.tup = tup;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return ((IList) tup.buildAST())
//                .get(((IInteger) index.buildAST()).intValue());
//    }
}
