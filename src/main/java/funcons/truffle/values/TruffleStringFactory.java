package funcons.truffle.values;

import funcons.algebras.values.StringAlg;
import funcons.truffle.nodes.CLStatementNode;

public interface TruffleStringFactory extends StringAlg<CLStatementNode> {

    @Override
    default CLStatementNode string(String s) {
//        return (env, given) -> vf.string(s);
        return null; // TODO
    }

    @Override
    default CLStatementNode char_(Character c) {
//        return (env, given) -> vf.string(c);
        return null; // TODO
    }

    @Override
    default CLStatementNode camlLightString(String s) {
//        return (env, given) -> funcons.helper.RascalCLStringFactory.clString(vf, s);
        return null; // TODO
    }

    @Override
    default CLStatementNode camlLightChar(String s) {
//        return (env, given) -> funcons.helper.RascalCLStringFactory.clChar(vf, s);
        return null; // TODO

    }

    @Override
    default CLStatementNode stringAppend(CLStatementNode str1, CLStatementNode str2) {
//        return (env, given) ->
//                ((IString) str1.eval(env, given))
//                        .concat((IString) str2.eval(env, given));
        return null; // TODO
    }
}

