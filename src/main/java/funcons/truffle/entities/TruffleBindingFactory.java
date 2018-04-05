package funcons.truffle.entities;

import camllight.truffle.nodes.CLExecuteNode;
import funcons.algebras.collections.MapAlg;
import funcons.algebras.entities.BindingAlg;

public interface TruffleBindingFactory extends
        MapAlg<CLExecuteNode>,
        BindingAlg<CLExecuteNode> {


    @Override
    default CLExecuteNode id(java.lang.String s) {
        return new BindingIdNode(s);
    }

    @Override
    default CLExecuteNode nameId(java.lang.String namespace, java.lang.String id) {
//        return (env, given) -> vf.tuple(vf.string(namespace), vf.string(id));
        throw new RuntimeException("Not implemented");
    }

    @Override
    default CLExecuteNode bindValue(CLExecuteNode id, CLExecuteNode exp) {
        return new BindingBindValueNode(id, exp); // TODO
    }

    @Override
    default CLExecuteNode boundValue(CLExecuteNode id) {
//        return (env, given) -> env.get((IValue) id.eval(env, given));
        return new BindingBoundValueNode(id);
    }

    @Override
    default CLExecuteNode scope(CLExecuteNode localBindings, CLExecuteNode exp) {
//        return (env, given) -> {
//            IMap local = (IMap) localBindings.eval(env, given);
//            return exp.eval(env.join(local), given);
//        };
        return new BindingScopeNode(localBindings, exp); // TODO
    }

    @Override
    default CLExecuteNode closure(CLExecuteNode x, CLExecuteNode environment) {
//        return (env, given) ->
//                x.eval((IMap) environment.eval(env, given), given);
        return new BindingClosureNode(x,environment);
    }

    @Override
    default CLExecuteNode environment() {
        return new BindingEnvironmentNode();
    }

    @Override
    default CLExecuteNode accum(CLExecuteNode environment, CLExecuteNode decl) {
        return new BindingAccumNode(environment, decl, this, this);
    }
}
