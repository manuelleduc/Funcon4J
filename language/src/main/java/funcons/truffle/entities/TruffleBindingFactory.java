package funcons.truffle.entities;

import com.oracle.truffle.api.frame.FrameDescriptor;
import funcons.algebras.collections.MapAlg;
import funcons.algebras.entities.BindingAlg;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCLanguage;
import funcons.truffle.nodes.FNCStatementNode;
import funcons.values.signals.RunTimeFunconException;

public interface TruffleBindingFactory extends
        MapAlg<FNCExecuteNode>,
        BindingAlg<FNCExecuteNode> {


    @Override
    default FNCExecuteNode id(java.lang.String s) {
        return new Id(s);
    }

    @Override
    default FNCExecuteNode nameId(java.lang.String namespace, java.lang.String id) {
        throw new RuntimeException("Not implemented");
    }

    /**
     * Bind Value associate the exp value to the id
     *
     * @param id
     * @param exp
     * @return
     */
    @Override
    default FNCExecuteNode bindValue(FNCExecuteNode id, FNCExecuteNode exp) {
        return new BindValue(id, exp);
    }

    @Override
    default FNCExecuteNode boundValue(FNCExecuteNode id) {
        return new BoundValue(id);
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
        return new Scope(localBindings, exp);
    }

    @Override
    default FNCExecuteNode closure(FNCExecuteNode x, FNCExecuteNode environment) {
        return new Closure(x, environment);
    }

    @Override
    default FNCExecuteNode environment() {
        return new Environment();
    }

    @Override
    default FNCExecuteNode accum(FNCExecuteNode environment, FNCExecuteNode decl) {
        return new Accum(environment, decl, this);
    }


    class Environment implements FNCExecuteNode {
        @Override
        public FNCStatementNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new BindingEnvironmentNode();
        }
    }

    class Closure implements FNCExecuteNode {
        private final FNCExecuteNode x;
        private final FNCExecuteNode environment;

        public Closure(FNCExecuteNode x, FNCExecuteNode environment) {
            this.x = x;
            this.environment = environment;
        }

        @Override
        public FNCStatementNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new BindingClosureNode((FNCExpressionNode) x, (FNCExpressionNode) environment);
        }
    }

    class Scope implements FNCExecuteNode {
        private final FNCExecuteNode localBindings;
        private final FNCExecuteNode exp;

        public Scope(FNCExecuteNode localBindings, FNCExecuteNode exp) {
            this.localBindings = localBindings;
            this.exp = exp;
        }

        @Override
        public FNCStatementNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new BindingScopeNode((FNCExpressionNode) localBindings.buildAST(l), (FNCExpressionNode) exp.buildAST(l));
        }
    }

    class BoundValue implements FNCExecuteNode {
        private final FNCExecuteNode id;

        public BoundValue(FNCExecuteNode id) {
            this.id = id;
        }

        @Override
        public FNCStatementNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new BindingBoundValueNode((FNCExpressionNode) id.buildAST(l));
        }
    }

    class BindValue implements FNCExecuteNode {
        private final FNCExecuteNode id;
        private final FNCExecuteNode exp;

        public BindValue(FNCExecuteNode id, FNCExecuteNode exp) {
            this.id = id;
            this.exp = exp;
        }

        @Override
        public FNCStatementNode buildAST(FNCLanguage l) throws RunTimeFunconException {

            return new BindingBindValueNode((FNCExpressionNode) id.buildAST(l), (FNCExpressionNode) exp.buildAST(l));
        }
    }

    class Id implements FNCExecuteNode {
        private final String s;

        public Id(String s) {
            this.s = s;
        }

        @Override
        public FNCStatementNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new BindingIdNode(s);
        }
    }

    class Accum implements FNCExecuteNode {
        private final FNCExecuteNode environment;
        private final FNCExecuteNode decl;
        private final TruffleBindingFactory alg;

        public Accum(FNCExecuteNode environment, FNCExecuteNode decl, TruffleBindingFactory alg) {
            this.environment = environment;
            this.decl = decl;
            this.alg = alg;
        }

        @Override
        public FNCStatementNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            final FNCStatementNode currentEnv = environment.buildAST(l);
            final FNCExecuteNode scope = alg.scope((n) -> currentEnv, alg.mapOver(decl, (m) -> currentEnv));
            return scope.buildAST(l);
        }
    }
}
