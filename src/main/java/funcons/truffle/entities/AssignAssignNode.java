package funcons.truffle.entities;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.algebras.values.NullAlg;
import funcons.values.Variable;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.IMap;
import io.usethesource.vallang.IValue;


@NodeInfo(description = "Assign Assign Node")
public class AssignAssignNode extends Node implements CLExecuteNode {

    private final NullAlg<CLExecuteNode> nalg;
    @Node.Child
    private CLExecuteNode var;

    @Node.Child
    private CLExecuteNode x;

    public AssignAssignNode(CLExecuteNode var, CLExecuteNode x, NullAlg<CLExecuteNode> nalg) {
        this.var = var;
        this.x = x;
        this.nalg = nalg;
    }

    @Override
    public IValue buildAST(IMap env, IValue given) throws FunconException {
        ((Variable) var.buildAST(env, given)).store(x.buildAST(env, given));
        return nalg.null_().buildAST(env, given);
    }
}
