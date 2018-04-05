package funcons.truffle.controlflow;

import funcons.truffle.nodes.FNCExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import io.usethesource.vallang.IValueFactory;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Exception MatchFailure Node")
public class ExceptionMatchFailureNode extends Node implements FNCExecuteNode {

    IValueFactory vf = ValueFactory.getInstance();


//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return new CLMatchFailureException(vf);
//    }
}
