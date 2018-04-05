package funcons.truffle.controlflow;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.algebras.controlflow.ExceptionAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.values.Abs;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.IMap;
import io.usethesource.vallang.IValue;


@NodeInfo(description = "Exception PrefereOver Node")
public class ExceptionPrefereOverNode extends Node implements CLExecuteNode {

    private final FunctionAlg<CLExecuteNode> falg;
    private final ExceptionAlg<CLExecuteNode> ealg;
    @Node.Child
    private CLExecuteNode a1;

    @Node.Child
    private CLExecuteNode a2;

    public ExceptionPrefereOverNode(CLExecuteNode a1, CLExecuteNode a2, FunctionAlg<CLExecuteNode> falg, ExceptionAlg<CLExecuteNode> ealg) {
        this.a1 = a1;
        this.a2 = a2;
        this.falg = falg;
        this.ealg = ealg;
    }

    @Override
    public IValue buildAST(IMap env, IValue given) throws FunconException {
        return falg.abs(ealg.else_(
                ((Abs<CLExecuteNode>) a1.buildAST(env, given)).body(),
                ((Abs<CLExecuteNode>) a2.buildAST(env, given)).body()
        )).buildAST(env, given);
    }
}
