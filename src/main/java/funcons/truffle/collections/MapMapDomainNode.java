package funcons.truffle.collections;

import funcons.truffle.nodes.FNCExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Map MapDomain Node")
public class MapMapDomainNode extends Node implements FNCExecuteNode {

    ValueFactory vf = ValueFactory.getInstance();


    @Node.Child
    private FNCExecuteNode map;

    public MapMapDomainNode(FNCExecuteNode map) {
        this.map = map;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
////        final IMap m = (IMap) map.buildAST();
////        final IListWriter lw = vf.listWriter();
////        m.forEach(lw::append);
////        return lw.done();
//        return this;
//    }
}
