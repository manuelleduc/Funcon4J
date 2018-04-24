package funcons.truffle.values;

import com.oracle.truffle.api.frame.VirtualFrame;
import funcons.algebras.values.StringAlg;
import funcons.helper.RascalCLStringFactory;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCLanguage;
import funcons.truffle.nodes.FNCStatementNode;
import funcons.values.signals.RunTimeFunconException;
import io.usethesource.vallang.impl.persistent.ValueFactory;

public interface TruffleStringFactory extends StringAlg<FNCExecuteNode> {

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
//        return (env, given) -> funcons.helper.RascalCLStringFactory.clString(vf, s);
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode camlLightChar(String s) {
//        return (env, given) -> funcons.helper.RascalCLStringFactory.clChar(vf, s);
        return l -> new FNCExpressionNode() {
            @Override
            public Object executeGeneric(VirtualFrame frame) {
                return RascalCLStringFactory.clChar(ValueFactory.getInstance(), s);
            }
        };

    }

    @Override
    default FNCExecuteNode stringAppend(FNCExecuteNode str1, FNCExecuteNode str2) {
//        return (env, given) ->
//                ((IString) str1.eval(env, given))
//                        .concat((IString) str2.eval(env, given));
        throw new RuntimeException("Not implemented");
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
}

