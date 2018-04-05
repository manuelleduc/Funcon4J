package funcons.truffle.values;

import funcons.truffle.nodes.FNCExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import io.usethesource.vallang.IValueFactory;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "String String Node")
public class StringStringNode extends Node
        implements FNCExecuteNode {

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
