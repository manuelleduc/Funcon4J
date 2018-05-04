package funcons.truffle.values;

import com.oracle.truffle.api.frame.VirtualFrame;
import funcons.algebras.values.StringAlg;
import funcons.helper.RascalCLStringFactory;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCLanguage;
import funcons.truffle.nodes.FNCStatementNode;
import funcons.values.signals.RunTimeFunconException;
import io.usethesource.vallang.IValueFactory;
import io.usethesource.vallang.impl.persistent.ValueFactory;

public interface TruffleStringFactory extends StringAlg<FNCExecuteNode> {


    IValueFactory vf = ValueFactory.getInstance();

    @Override
    default FNCExecuteNode string(String s) {
        return new String_(s);
    }

    @Override
    default FNCExecuteNode char_(Character c) {
//        return (env, given) -> vf.string(c);
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode camlLightString(String s) {
        return new CamlLightString(s);
    }

    @Override
    default FNCExecuteNode camlLightChar(String s) {
        return new CamlLightChar(s);

    }

    @Override
    default FNCExecuteNode stringAppend(FNCExecuteNode str1, FNCExecuteNode str2) {
//        return (env, given) ->
//                ((IString) str1.eval(env, given))
//                        .concat((IString) str2.eval(env, given));
        return new StringAppend(str1, str2);
    }

    class StringAppend implements FNCExecuteNode {
        private final FNCExecuteNode str1;
        private final FNCExecuteNode str2;

        StringAppend(FNCExecuteNode str1, FNCExecuteNode str2) {
            this.str1 = str1;
            this.str2 = str2;
        }

        @Override
        public FNCStatementNode buildAST(FNCLanguage language) throws RunTimeFunconException {
            return new StringStringAppendNode((FNCExpressionNode) str1.buildAST(language), (FNCExpressionNode) str2.buildAST(language));
        }
    }

    class String_ implements FNCExecuteNode {
        private final String s;

        public String_(String s) {
            this.s = s;
        }

        @Override
        public FNCStatementNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new StringStringNode(s);
        }
    }

    class CamlLightString implements FNCExecuteNode {
        private final String s;

        public CamlLightString(String s) {
            this.s = s;
        }

        @Override
        public FNCStatementNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new StringCamlLightStringNode(s);
        }
    }

    class CamlLightChar implements FNCExecuteNode {
        private final String s;

        public CamlLightChar(String s) {
            this.s = s;
        }

        @Override
        public FNCStatementNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new StringCamlLightCharNode(s);
        }
    }
}

