package funcons.truffle.functions;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.algebras.functions.CurryAlg;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.IMap;
import io.usethesource.vallang.IValue;

@NodeInfo(description = "Curry Curry Node")
public class CurryCurryNode extends Node implements CLExecuteNode {
    @Child
    private CLExecuteNode a;

    private CurryAlg<CLExecuteNode> alg;

    public CurryCurryNode(CLExecuteNode a, CurryAlg<CLExecuteNode> alg) {
        this.a = a;
        this.alg = alg;
    }

    @Override
    public IValue buildAST(IMap env, IValue given) throws FunconException {
        final CLExecuteNode clExecuteNode = alg.partialApp(a, (e, g) -> given);
        return clExecuteNode.buildAST(env, given);
    }
}
