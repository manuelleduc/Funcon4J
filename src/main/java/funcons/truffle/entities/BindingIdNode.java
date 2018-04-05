package funcons.truffle.entities;

import funcons.truffle.nodes.FNCExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Binding Id Node")
public class BindingIdNode extends Node implements FNCExecuteNode {
    private final String s;

    private final ValueFactory vf = ValueFactory.getInstance();

    public BindingIdNode(String s) {
        this.s = s;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return vf.string(s);
//    }
}
