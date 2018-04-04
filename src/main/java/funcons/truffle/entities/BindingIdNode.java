package funcons.truffle.entities;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.values.Null;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.IMap;
import io.usethesource.vallang.IValue;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Binding Id Node")
public class BindingIdNode extends Node implements CLExecuteNode {
    private final String s;

    private final ValueFactory vf = ValueFactory.getInstance();

    public BindingIdNode(String s) {
        this.s = s;
    }

    @Override
    public IValue eval(IMap env, Null given) throws FunconException {
        return vf.string(s);
    }
}
