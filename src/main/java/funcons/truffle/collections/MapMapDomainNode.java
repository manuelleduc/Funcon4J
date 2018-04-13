package funcons.truffle.collections;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Map MapDomain Node")
public class MapMapDomainNode extends FNCExpressionNode  {

    ValueFactory vf = ValueFactory.getInstance();


    @Child
    FNCExpressionNode map;

    public MapMapDomainNode(FNCExpressionNode map) {
        this.map = map;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        throw new RuntimeException("executeGeneric not implemented");
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
