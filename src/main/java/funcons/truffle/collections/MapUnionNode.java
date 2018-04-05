package funcons.truffle.collections;

import funcons.truffle.nodes.FNCExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Map Union Node")
public class MapUnionNode extends Node implements FNCExecuteNode {
    public static final ValueFactory vf = ValueFactory.getInstance();


    private final FNCExecuteNode map1;
    private final FNCExecuteNode map2;

    public MapUnionNode(FNCExecuteNode map1, FNCExecuteNode map2) {
        this.map1 = map1;
        this.map2 = map2;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        final IMap m1 = (IMap) map1.buildAST();
//        final IMap m2 = (IMap) map2.buildAST();
//        return m1.join(m2);
//    }

}
