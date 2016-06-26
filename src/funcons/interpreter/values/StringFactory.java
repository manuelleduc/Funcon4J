package funcons.interpreter.values;

import funcons.algebras.values.StringAlg;
import funcons.carriers.IEval;
import org.rascalmpl.value.IString;
import org.rascalmpl.value.IValueFactory;
import org.rascalmpl.value.impl.fast.ValueFactory;

public interface StringFactory extends StringAlg<IEval> {
    IValueFactory vf = ValueFactory.getInstance();

    @Override
    default IEval string(String s) {
        return (env, given) -> vf.string(s);
    }

    @Override
    default IEval char_(Character c) {
        return (env, given) -> vf.string(c);
    }

    @Override
    default IEval camlLightString(String s) {
        return (env, given) -> funcons.helper.RascalCLStringFactory.clString(vf, s);
    }

    @Override
    default IEval camlLightChar(String s) {
        return (env, given) -> funcons.helper.RascalCLStringFactory.clChar(vf, s);
    }

    @Override
    default IEval stringAppend(IEval str1, IEval str2) {
        return (env, given) ->
                ((IString)str1.eval(env, given))
                    .concat((IString)str2.eval(env, given));
    }
}
