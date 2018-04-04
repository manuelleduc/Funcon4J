package funcons.truffle.values;

import camllight.truffle.nodes.CLExecuteNode;
import funcons.algebras.values.StringAlg;

public interface TruffleStringFactory extends StringAlg<CLExecuteNode> {

    @Override
    default CLExecuteNode string(String s) {
//        return (env, given) -> vf.string(s);
        return null; // TODO
    }

    @Override
    default CLExecuteNode char_(Character c) {
//        return (env, given) -> vf.string(c);
        return null; // TODO
    }

    @Override
    default CLExecuteNode camlLightString(String s) {
//        return (env, given) -> funcons.helper.RascalCLStringFactory.clString(vf, s);
        return null; // TODO
    }

    @Override
    default CLExecuteNode camlLightChar(String s) {
//        return (env, given) -> funcons.helper.RascalCLStringFactory.clChar(vf, s);
        return null; // TODO

    }

    @Override
    default CLExecuteNode stringAppend(CLExecuteNode str1, CLExecuteNode str2) {
//        return (env, given) ->
//                ((IString) str1.eval(env, given))
//                        .concat((IString) str2.eval(env, given));
        return null; // TODO
    }
}

