package funcons.truffle.values;

import funcons.truffle.nodes.FNCExecuteNode;
import funcons.algebras.values.StringAlg;

public interface TruffleStringFactory extends StringAlg<FNCExecuteNode> {

    @Override
    default FNCExecuteNode string(String s) {
        return new StringStringNode(s);
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
        throw new RuntimeException("Not implemented");

    }

    @Override
    default FNCExecuteNode stringAppend(FNCExecuteNode str1, FNCExecuteNode str2) {
//        return (env, given) ->
//                ((IString) str1.eval(env, given))
//                        .concat((IString) str2.eval(env, given));
        throw new RuntimeException("Not implemented");
    }
}

