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
        return null; // TODO
    }

    @Override
    default CLExecuteNode bindValue(CLExecuteNode id, CLExecuteNode exp) {
        return new BindingBindValueNode(id, exp); // TODO
    }

    @Override
    default CLExecuteNode boundValue(CLExecuteNode id) {
//        return (env, given) -> env.get((IValue) id.eval(env, given));
        return null; // TODO
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
        return null; // TODO
    }

    @Override
    default CLExecuteNode environment() {
        return new BindingEnvironmentNode();
    }

    @Override
    default CLExecuteNode accum(CLExecuteNode environment, CLExecuteNode decl) {
//        return (env, given) -> {
//            IValue currentEnv = environment.eval(env, given);
//            return scope((e, g) -> currentEnv, mapOver(decl, (e, g) -> currentEnv)).eval(env, given);
//        };
        return null; // TODO
    }
}
