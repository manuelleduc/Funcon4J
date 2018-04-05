package funcons.truffle.functions;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.algebras.entities.BindingAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.values.Abs;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.IMap;
import io.usethesource.vallang.IValue;


@NodeInfo(description = "Function Close Node")
public class FunctionCloseNode extends Node implements CLExecuteNode {
    private final BindingAlg<CLExecuteNode> alg;
    private final FunctionAlg<CLExecuteNode> falg;
    @Child
    private CLExecuteNode abs;

    public FunctionCloseNode(CLExecuteNode abs, BindingAlg<CLExecuteNode> alg, FunctionAlg<CLExecuteNode> falg) {
        this.abs = abs;
        this.alg = alg;

        this.falg = falg;
    }

    @Override
    public IValue buildAST(IMap env, IValue given) throws FunconException {
        return falg.abs(alg.closure(
                ((Abs<CLExecuteNode>) abs.buildAST(env, given)).body(),
                (e, g) -> env)).buildAST(env, given);
    }
}
