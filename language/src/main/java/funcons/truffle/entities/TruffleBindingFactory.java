package funcons.truffle.entities;

import funcons.algebras.collections.MapAlg;
import funcons.algebras.entities.BindingAlg;
import funcons.truffle.nodes.FNCBuildAST;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCLanguage;
import funcons.values.signals.RunTimeFunconException;

public interface TruffleBindingFactory extends
        MapAlg<FNCBuildAST>,
        BindingAlg<FNCBuildAST> {


    @Override
    default FNCBuildAST id(java.lang.String s) {
        return new Id(s);
    }

    @Override
    default FNCBuildAST nameId(java.lang.String namespace, java.lang.String id) {
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
    default FNCBuildAST bindValue(FNCBuildAST id, FNCBuildAST exp) {
        return new BindValue(id, exp);
    }

    @Override
    default FNCBuildAST boundValue(FNCBuildAST id) {
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
    default FNCBuildAST scope(FNCBuildAST localBindings, FNCBuildAST exp) {
        return new Scope(localBindings, exp);
    }

    @Override
    default FNCBuildAST closure(FNCBuildAST x, FNCBuildAST environment) {
        return new Closure(x, environment);
    }

    @Override
    default FNCBuildAST environment() {
        return new Environment();
    }

    @Override
    default FNCBuildAST accum(FNCBuildAST environment, FNCBuildAST decl) {
        return new Accum(environment, decl, this);
    }


    class Environment implements FNCBuildAST {
        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new BindingEnvironmentNode();
        }
    }

    class Closure implements FNCBuildAST {
        private final FNCBuildAST x;
        private final FNCBuildAST environment;

        public Closure(FNCBuildAST x, FNCBuildAST environment) {
            this.x = x;
            this.environment = environment;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new BindingClosureNode((FNCExpressionNode) x, (FNCExpressionNode) environment);
        }
    }

    class Scope implements FNCBuildAST {
        private final FNCBuildAST localBindings;
        private final FNCBuildAST exp;

        public Scope(FNCBuildAST localBindings, FNCBuildAST exp) {
            this.localBindings = localBindings;
            this.exp = exp;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new BindingScopeNode(localBindings.buildAST(l), exp.buildAST(l));
        }
    }

    class BoundValue implements FNCBuildAST {
        private final FNCBuildAST id;

        public BoundValue(FNCBuildAST id) {
            this.id = id;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new BindingBoundValueNode(id.buildAST(l));
        }
    }

    class BindValue implements FNCBuildAST {
        private final FNCBuildAST id;
        private final FNCBuildAST exp;

        public BindValue(FNCBuildAST id, FNCBuildAST exp) {
            this.id = id;
            this.exp = exp;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {

            return new BindingBindValueNode(id.buildAST(l), exp.buildAST(l));
        }
    }

    class Id implements FNCBuildAST {
        private final String s;

        public Id(String s) {
            this.s = s;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new BindingIdNode(s);
        }
    }

    class Accum implements FNCBuildAST {
        private final FNCBuildAST environment;
        private final FNCBuildAST decl;
        private final TruffleBindingFactory alg;

        public Accum(FNCBuildAST environment, FNCBuildAST decl, TruffleBindingFactory alg) {
            this.environment = environment;
            this.decl = decl;
            this.alg = alg;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            final FNCExpressionNode currentEnv = environment.buildAST(l);
            final FNCBuildAST scope = alg.scope((n) -> currentEnv, alg.mapOver(decl, (m) -> currentEnv));
            return scope.buildAST(l);
        }
    }
}
