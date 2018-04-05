package funcons.truffle.values;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.IValueFactory;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "String String Node")
public class StringStringNode extends Node
        implements CLExecuteNode {

    IValueFactory vf = ValueFactory.getInstance();
    private final String s;

    public StringStringNode(String s) {
        this.s = s;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return vf.string(s);
//    }
}
