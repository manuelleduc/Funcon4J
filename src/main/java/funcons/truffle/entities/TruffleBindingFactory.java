package funcons.truffle.entities;

import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.FrameSlot;
import funcons.algebras.collections.MapAlg;
import funcons.algebras.entities.BindingAlg;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCLexicalScope;

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

    /**
     * bind-value(I,E) is a declaration funcon used to compute the single-point environment
     *
     * @param id
     * @param exp
     * @return
     */
    @Override
    default FNCExecuteNode bindValue(FNCExecuteNode id, FNCExecuteNode exp) {
        System.out.println("BIND VALUE " + id + " " + exp);
        final String name = "HAHA";
        final FrameSlot frameSlot = new FrameDescriptor().findOrAddFrameSlot(name);
        new FNCLexicalScope(null).locals.put(name, frameSlot);

        return BindingBindValueNodeGen.create((FNCExpressionNode) exp, frameSlot);// (FNCExpressionNode) localBindings, (FNCExpressionNode) exp);
    }

    @Override
    default FNCExecuteNode boundValue(FNCExecuteNode id) {
        return new BindingBoundValueNode((FNCExpressionNode) id);
    }

    /**
     * scope(D,X) executes the declaration D to compute an environment ρ1, then binds the identifiers in the domain of
     * ρ1 locally in the computation X, letting these bindings override the bindings represented by the current
     * environment ρ. This funcon is lifted in its first argument, whereas the rule for the computation of its second
     * argument has to be explicitly specified, since the environment is not merely propagated. Rule (40) applies only
     * when V is a value, which is independent of the current context.
     *
     * @param localBindings
     * @param exp
     * @return
     */
    @Override
    default FNCExecuteNode scope(FNCExecuteNode localBindings, FNCExecuteNode exp) {

        System.out.println("SCOPE " + localBindings + " " + exp);
        final String name = "HAHA";
        final FrameSlot frameSlot = new FrameDescriptor().findOrAddFrameSlot(name);
        new FNCLexicalScope(null).locals.put(name, frameSlot);

        return BindingScopeNodeGen.create((FNCExpressionNode) exp, frameSlot);
    }

    @Override
    default FNCExecuteNode closure(FNCExecuteNode x, FNCExecuteNode environment) {
//        return (env, given) ->
//                x.eval((IMap) environment.eval(env, given), given);
        return new BindingClosureNode(x, environment);
    }

    @Override
    default FNCExecuteNode environment() {
        return new BindingEnvironmentNode();
    }

    @Override
    default FNCExecuteNode accum(FNCExecuteNode environment, FNCExecuteNode decl) {
//        return new BindingAccumNode(environment, (FNCExpressionNode) decl, this, this);
        final FNCExecuteNode currentEnv = environment.buildAST();
        return scope(currentEnv, mapOver(decl, currentEnv)).buildAST();
    }
}
