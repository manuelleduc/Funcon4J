package funcons.truffle.entities;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.values.Null;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.IMap;
import io.usethesource.vallang.IMapWriter;
import io.usethesource.vallang.IValue;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Binding Bind Value Node")
public class BindingBindValueNode extends Node implements CLExecuteNode {
    private final CLExecuteNode id;
    private final CLExecuteNode exp;

    private final ValueFactory vf = ValueFactory.getInstance();

    public BindingBindValueNode(CLExecuteNode id, CLExecuteNode exp) {
        this.id = id;
        this.exp = exp;
    }

    @Override
    public IValue eval(IMap env, Null given) throws FunconException {
        final IMapWriter mw = vf.mapWriter();
        final IValue eval = id.eval(env, given);
        final IValue eval1 = exp.eval(env, given);
        mw.put(eval, eval1);
        return mw.done();
    }
}
