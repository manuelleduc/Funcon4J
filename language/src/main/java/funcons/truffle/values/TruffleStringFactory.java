package funcons.truffle.values;

import funcons.algebras.values.StringAlg;
import funcons.truffle.nodes.FNCBuildAST;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCLanguage;
import funcons.values.signals.RunTimeFunconException;
import io.usethesource.vallang.IValueFactory;
import io.usethesource.vallang.impl.persistent.ValueFactory;

public interface TruffleStringFactory extends StringAlg<FNCBuildAST> {


    IValueFactory vf = ValueFactory.getInstance();

    @Override
    default FNCBuildAST string(String s) {
        return new String_(s);
    }

    @Override
    default FNCBuildAST char_(Character c) {
//        return (env, given) -> vf.string(c);
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCBuildAST camlLightString(String s) {
        return new CamlLightString(s);
    }

    @Override
    default FNCBuildAST camlLightChar(String s) {
        return new CamlLightChar(s);

    }

    @Override
    default FNCBuildAST stringAppend(FNCBuildAST str1, FNCBuildAST str2) {
//        return (env, given) ->
//                ((IString) str1.eval(env, given))
//                        .concat((IString) str2.eval(env, given));
        return new StringAppend(str1, str2);
    }

    class StringAppend implements FNCBuildAST {
        private final FNCBuildAST str1;
        private final FNCBuildAST str2;

        StringAppend(FNCBuildAST str1, FNCBuildAST str2) {
            this.str1 = str1;
            this.str2 = str2;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage language) throws RunTimeFunconException {
            return new StringStringAppendNode(str1.buildAST(language), str2.buildAST(language));
        }
    }

    class String_ implements FNCBuildAST {
        private final String s;

        public String_(String s) {
            this.s = s;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new StringStringNode(s);
        }
    }

    class CamlLightString implements FNCBuildAST {
        private final String s;

        public CamlLightString(String s) {
            this.s = s;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new StringCamlLightStringNode(s);
        }
    }

    class CamlLightChar implements FNCBuildAST {
        private final String s;

        public CamlLightChar(String s) {
            this.s = s;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new StringCamlLightCharNode(s);
        }
    }
}

