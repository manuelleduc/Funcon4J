package funcons.truffle.recursion;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.algebras.collections.ListAlg;
import funcons.algebras.collections.MapAlg;
import funcons.algebras.entities.BindingAlg;
import funcons.algebras.values.IntAlg;
import funcons.algebras.values.NullAlg;
import funcons.values.recursion.Fwd;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.IInteger;
import io.usethesource.vallang.IMap;
import io.usethesource.vallang.IValue;

@NodeInfo(description = "Recursive SetForwards Node")
public class RecursiveSetForwardsNode extends Node implements CLExecuteNode {

    private final MapAlg<CLExecuteNode> malg;
    private final ListAlg<CLExecuteNode> lalg;
    private final IntAlg<CLExecuteNode> ialg;
    private final BindingAlg<CLExecuteNode> balg;
    private final NullAlg<CLExecuteNode> nalg;
    @Node.Child
    private CLExecuteNode idFwdMap;

    public RecursiveSetForwardsNode(CLExecuteNode idFwdMap, MapAlg<CLExecuteNode> malg,
                                    ListAlg<CLExecuteNode> lalg, IntAlg<CLExecuteNode> ialg,
                                    BindingAlg<CLExecuteNode> balg,

                                    NullAlg<CLExecuteNode> nalg) {
        this.idFwdMap = idFwdMap;
        this.malg = malg;
        this.lalg = lalg;
        this.ialg = ialg;
        this.balg = balg;
        this.nalg = nalg;
    }

    @Override
    public IValue buildAST(IMap env, IValue given) throws FunconException {
        IValue mapVal = idFwdMap.buildAST(env, given);
        IValue mapKeys = malg.mapDomain((e, g) -> mapVal).buildAST(env, given);
        int length = ((IInteger) lalg.listLength((e, g) -> mapKeys).buildAST(env, given)).intValue();

        for (int i = 0; i < length; i++) {
            IValue id = lalg.projectList(ialg.lit(i), (e, g) -> mapKeys).buildAST(env, given);
            IValue v = balg.boundValue((e, g) -> id).buildAST(env, given);
            if (v == null) {
                v = nalg.undefined().buildAST(env, given);
            }
            Fwd fwd = (Fwd) malg.mapGet((e, g) -> mapVal, (e, g) -> id).buildAST(env, given);
            fwd.add(v);
        }

        return nalg.null_().buildAST(env, given);
    }
}
