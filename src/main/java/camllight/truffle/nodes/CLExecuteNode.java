package camllight.truffle.nodes;

import com.oracle.truffle.api.nodes.NodeInterface;
import funcons.values.Null;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.IMap;
import io.usethesource.vallang.IValue;

public interface CLExecuteNode extends NodeInterface {
    IValue buildAST(IMap env, IValue given) throws FunconException;
}
