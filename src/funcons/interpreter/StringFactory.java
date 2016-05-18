package funcons.interpreter;

import funcons.algebras.StringAlg;
import funcons.carriers.IEval;
import funcons.values.Char;
import funcons.values.cl.CLChar;
import funcons.values.cl.CLString;
import funcons.values.String;

public interface StringFactory extends BoolFactory, StringAlg<IEval> {
    @Override
    default IEval string(java.lang.String s) {
        return (env, forwards, store, given) -> new String(s);
    }

    @Override
    default IEval char_(Character c) {
        return (env, forwards, store, given) -> new Char(c);
    }

    @Override
    default IEval camlLightString(java.lang.String s) {
        return (env, forwards, store, given) -> new CLString(s);
    }

    @Override
    default IEval camlLightChar(java.lang.String s) {
        return (env, forwards, store, given) -> new CLChar(s);
    }
}
