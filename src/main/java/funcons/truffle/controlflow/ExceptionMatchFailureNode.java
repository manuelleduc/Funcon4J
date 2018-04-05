package funcons.truffle.controlflow;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.values.cl.CLMatchFailureException;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.IValueFactory;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Exception MatchFailure Node")
public class ExceptionMatchFailureNode extends Node implements CLExecuteNode {

    IValueFactory vf = ValueFactory.getInstance();


//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return new CLMatchFailureException(vf);
//    }
}
