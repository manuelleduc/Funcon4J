package funcons.truffle.collections;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.IMap;
import io.usethesource.vallang.IValue;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Map Union Node")
public class MapUnionNode extends Node implements CLExecuteNode {
    public static final ValueFactory vf = ValueFactory.getInstance();


    private final CLExecuteNode map1;
    private final CLExecuteNode map2;

    public MapUnionNode(CLExecuteNode map1, CLExecuteNode map2) {
        this.map1 = map1;
        this.map2 = map2;
    }

    @Override
    public IValue buildAST(IMap env, IValue given) throws FunconException {
        final IMap m1 = (IMap) map1.buildAST(env, given);
        final IMap m2 = (IMap) map2.buildAST(env, given);
        return m1.join(m2);
    }

}
