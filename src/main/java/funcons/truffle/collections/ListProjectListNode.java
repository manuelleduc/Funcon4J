package funcons.truffle.collections;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.IInteger;
import io.usethesource.vallang.IList;
import io.usethesource.vallang.IMap;
import io.usethesource.vallang.IValue;

@NodeInfo(description = "List ProjectList Node")
public class ListProjectListNode extends Node implements CLExecuteNode {

    @Node.Child
    private CLExecuteNode index;

    @Node.Child
    private CLExecuteNode list;

    public ListProjectListNode(CLExecuteNode index, CLExecuteNode list) {
        this.index = index;
        this.list = list;
    }

    @Override
    public IValue buildAST(IMap env, IValue given) throws FunconException {
        final IInteger i = (IInteger) index.buildAST(env, given);
        final IList l = (IList) list.buildAST(env, given);
        return l.get(i.intValue());
    }
}
