package funcons.truffle.entities;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.IMapWriter;
import io.usethesource.vallang.IValue;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Binding Bind Value Node")
public class BindingBindValueNode extends Node implements CLExecuteNode {

    @Child
    private CLExecuteNode id;

    @Child
    private CLExecuteNode exp;

    private final ValueFactory vf = ValueFactory.getInstance();

    public BindingBindValueNode(CLExecuteNode id, CLExecuteNode exp) {
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
