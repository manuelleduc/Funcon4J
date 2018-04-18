package funcons.truffle.nodes;

import com.oracle.truffle.api.RootCallTarget;
import com.oracle.truffle.api.Truffle;

import java.util.HashMap;
import java.util.Map;

public class FNCFunctionRegistry {
    private final Map<String, FNCFunction> functions = new HashMap<>();


    private final FNCLanguage language;

    public FNCFunctionRegistry(FNCLanguage language) {
        this.language = language;
    }

    public FNCFunction lookup(String name, boolean createIfNotPresent) {
        final FNCFunction result1 = functions.get(name);
        final FNCFunction result;
        if (result1 == null && createIfNotPresent) {
            result = new FNCFunction(language, name);
            functions.put(name, result);
        } else {
            result = result1;
        }
        return result;
    }

    public FNCFunction register(final String name, final FNCRootNode rootNode) {
        final FNCFunction function = lookup(name, true);
        final RootCallTarget callTarget = Truffle.getRuntime().createCallTarget(rootNode);
        function.setCallTarget(callTarget);
        return function;
    }

}
