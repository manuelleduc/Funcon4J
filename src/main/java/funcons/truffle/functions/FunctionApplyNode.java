package funcons.truffle.functions;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.algebras.entities.SupplyGivenAlg;
import funcons.values.Abs;
import funcons.values.Null;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.IMap;
import io.usethesource.vallang.IValue;

@NodeInfo(description = "Function Apply Node")
public class FunctionApplyNode extends Node implements CLExecuteNode {
    private final SupplyGivenAlg<CLExecuteNode> salg;
    @Node.Child
    private CLExecuteNode abs;

    @Node.Child
    private CLExecuteNode arg;

    public FunctionApplyNode(CLExecuteNode abs, CLExecuteNode arg, SupplyGivenAlg<CLExecuteNode> salg) {
        this.abs = abs;
        this.arg = arg;

        this.salg = salg;
    }

    @Override
    public IValue eval(IMap env, Null given) throws FunconException {
        final CLExecuteNode s = ((Abs<CLExecuteNode>) abs.eval(env, given)).body();
        return salg.supply(arg, s).eval(env, given);
    }
}
