package funcons.truffle.entities;

import funcons.algebras.collections.MapAlg;
import funcons.algebras.entities.BindingAlg;
import funcons.truffle.nodes.CLStatementNode;

public interface TruffleBindingFactory extends
        MapAlg<CLStatementNode>,
        BindingAlg<CLStatementNode> {


    @Override
    default CLStatementNode id(java.lang.String s) {
        //return (env, given) -> vf.string(s);
        return null; // TODO
    }

    @Override
    default CLStatementNode nameId(java.lang.String namespace, java.lang.String id) {
//        return (env, given) -> vf.tuple(vf.string(namespace), vf.string(id));
        return null; // TODO
    }

    @Override
    default CLStatementNode bindValue(CLStatementNode id, CLStatementNode exp) {
//        return (env, given) -> {
//            IMapWriter mw = vf.mapWriter();
//
//            mw.put(id.eval(env, given), exp.eval(env, given));
//            return mw.done();
//        };
        return null; // TODO
    }

    @Override
    default CLStatementNode boundValue(CLStatementNode id) {
//        return (env, given) -> env.get((IValue) id.eval(env, given));
        return null; // TODO
    }

    @Override
    default CLStatementNode scope(CLStatementNode localBindings, CLStatementNode exp) {
//        return (env, given) -> {
//            IMap local = (IMap) localBindings.eval(env, given);
//            return exp.eval(env.join(local), given);
//        };
        return null; // TODO
    }

    @Override
    default CLStatementNode closure(CLStatementNode x, CLStatementNode environment) {
//        return (env, given) ->
//                x.eval((IMap) environment.eval(env, given), given);
        return null; // TODO
    }

    @Override
    default CLStatementNode environment() {
//        return (env, given) -> vf.mapWriter().done();
        return null; // TODO
    }

    @Override
    default CLStatementNode accum(CLStatementNode environment, CLStatementNode decl) {
//        return (env, given) -> {
//            IValue currentEnv = environment.eval(env, given);
//            return scope((e, g) -> currentEnv, mapOver(decl, (e, g) -> currentEnv)).eval(env, given);
//        };
        return null; // TODO
    }
}
