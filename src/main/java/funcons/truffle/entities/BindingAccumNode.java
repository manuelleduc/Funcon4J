package funcons.truffle.entities;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.algebras.collections.MapAlg;
import funcons.algebras.entities.BindingAlg;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.IMap;
import io.usethesource.vallang.IValue;

@NodeInfo(description = "Binding Accum Node")
public class BindingAccumNode extends Node implements CLExecuteNode {

    private final BindingAlg<CLExecuteNode> balg;
    private final MapAlg<CLExecuteNode> malg;
    @Node.Child
    private CLExecuteNode environment;

    @Node.Child
    private CLExecuteNode decl;

    public BindingAccumNode(CLExecuteNode environment, CLExecuteNode decl, BindingAlg<CLExecuteNode> balg, MapAlg<CLExecuteNode> malg) {
        this.environment = environment;
        this.decl = decl;
        this.balg = balg;
        this.malg = malg;
    }

    @Override
    public IValue buildAST(IMap env, IValue given) throws FunconException {
        final IValue currentEnv = environment.buildAST(env, given);
        return balg.scope((e, g) -> currentEnv, malg.mapOver(decl, (e, g) -> currentEnv)).buildAST(env, given);

    }
}
