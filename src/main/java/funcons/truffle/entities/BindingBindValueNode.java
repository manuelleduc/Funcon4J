package funcons.truffle.entities;

import funcons.truffle.nodes.FNCExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Binding Bind Value Node")
public class BindingBindValueNode extends Node implements FNCExecuteNode {

    @Child
    private FNCExecuteNode id;

    @Child
    private FNCExecuteNode exp;

    private final ValueFactory vf = ValueFactory.getInstance();

    public BindingBindValueNode(FNCExecuteNode id, FNCExecuteNode exp) {
        this.id = id;
        this.exp = exp;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        final IMapWriter mw = vf.mapWriter();
//        final IValue eval = id.buildAST();
//        final IValue eval1 = exp.buildAST();
//        mw.put(eval, eval1);
//        return mw.done();
//    }
}
