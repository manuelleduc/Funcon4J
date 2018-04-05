package funcons.truffle.entities;

import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.algebras.collections.MapAlg;
import funcons.algebras.entities.BindingAlg;

public interface TruffleBindingFactory extends
        MapAlg<FNCExecuteNode>,
        BindingAlg<FNCExecuteNode> {


    @Override
    default FNCExecuteNode id(java.lang.String s) {
        return new BindingIdNode(s);
    }

    @Override
    default FNCExecuteNode nameId(java.lang.String namespace, java.lang.String id) {
//        return (env, given) -> vf.tuple(vf.string(namespace), vf.string(id));
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode bindValue(FNCExecuteNode id, FNCExecuteNode exp) {
        return new BindingBindValueNode(id, exp); // TODO
    }

    @Override
    default FNCExecuteNode boundValue(FNCExecuteNode id) {
//        return (env, given) -> env.get((IValue) id.eval(env, given));
        return new BindingBoundValueNode(id);
    }

    @Override
    default FNCExecuteNode scope(FNCExecuteNode localBindings, FNCExecuteNode exp) {
//        return (env, given) -> {
//            IMap local = (IMap) localBindings.eval(env, given);
//            return exp.eval(env.join(local), given);
//        };
        return new BindingScopeNode(localBindings, exp); // TODO
    }

    @Override
    default FNCExecuteNode closure(FNCExecuteNode x, FNCExecuteNode environment) {
//        return (env, given) ->
//                x.eval((IMap) environment.eval(env, given), given);
        return new BindingClosureNode(x,environment);
    }

    @Override
    default FNCExecuteNode environment() {
        return new BindingEnvironmentNode();
    }

    @Override
    default FNCExecuteNode accum(FNCExecuteNode environment, FNCExecuteNode decl) {
        return new BindingAccumNode(environment, (FNCExpressionNode) decl, this, this);
    }
}
