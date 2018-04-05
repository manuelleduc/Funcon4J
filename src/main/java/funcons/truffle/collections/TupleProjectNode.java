package funcons.truffle.collections;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.IInteger;
import io.usethesource.vallang.IList;
import io.usethesource.vallang.IMap;
import io.usethesource.vallang.IValue;


@NodeInfo(description = "Tuple Project Node")
public class TupleProjectNode extends Node implements CLExecuteNode {
    @Child
    private CLExecuteNode index;

    @Child
    private CLExecuteNode tup;

    public TupleProjectNode(CLExecuteNode index, CLExecuteNode tup) {
        this.index = index;
        this.tup = tup;
    }

    @Override
    public IValue buildAST(IMap env, IValue given) throws FunconException {
        return ((IList) tup.buildAST(env, given))
                .get(((IInteger) index.buildAST(env, given)).intValue());
    }
}
