package funcons.truffle.collections;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.IListWriter;
import io.usethesource.vallang.IMap;
import io.usethesource.vallang.IValue;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Map MapDomain Node")
public class MapMapDomainNode extends Node implements CLExecuteNode {

    ValueFactory vf = ValueFactory.getInstance();


    @Node.Child
    private CLExecuteNode map;

    public MapMapDomainNode(CLExecuteNode map) {
        this.map = map;
    }

    @Override
    public IValue buildAST(IMap env, IValue given) throws FunconException {
        final IMap m = (IMap) map.buildAST(env, given);
        final IListWriter lw = vf.listWriter();
        m.forEach(lw::append);
        return lw.done();
    }
}
