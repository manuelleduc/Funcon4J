package funcons.truffle.entities;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.values.Null;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.IMap;
import io.usethesource.vallang.IValue;


@NodeInfo(description = "Binding Scope Node")
public class BindingScopeNode extends Node implements CLExecuteNode {

    @Node.Child
    private CLExecuteNode localBindings;

    @Node.Child
    private CLExecuteNode exp;

    public BindingScopeNode(CLExecuteNode localBindings, CLExecuteNode exp) {
        this.localBindings = localBindings;
        this.exp = exp;
    }

    @Override
    public IValue eval(IMap env, Null given) throws FunconException {
        final IMap local = (IMap) localBindings.eval(env, given);
        return exp.eval(env.join(local), given);
    }
}
