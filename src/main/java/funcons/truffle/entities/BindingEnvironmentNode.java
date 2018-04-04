package funcons.truffle.entities;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.values.Null;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.IMap;
import io.usethesource.vallang.IValue;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Binding Environment Node")
public class BindingEnvironmentNode extends Node implements CLExecuteNode {
    ValueFactory vf = ValueFactory.getInstance();

    @Override
    public IValue eval(IMap env, Null given) throws FunconException {
        return vf.mapWriter().done();
    }
}
