package funcons.truffle.auxiliary;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.algebras.values.NullAlg;
import funcons.values.Null;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.IMap;
import io.usethesource.vallang.IValue;


@NodeInfo(description = "Print Print Node")
public class PrintPrintNode extends Node implements CLExecuteNode {

    @Child
    private CLExecuteNode x;

    private NullAlg<CLExecuteNode> alg;

    public PrintPrintNode(CLExecuteNode x, NullAlg<CLExecuteNode> alg) {
        this.x = x;
        this.alg = alg;
    }

    @Override
    public IValue eval(IMap env, Null given) throws FunconException {
        System.out.println(x.eval(env, given));
        return alg.null_().eval(env, given);
    }
}
