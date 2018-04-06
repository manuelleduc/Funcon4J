package funcons.truffle.nodes;

import com.oracle.truffle.api.RootCallTarget;
import com.oracle.truffle.api.Truffle;
import funcons.truffle.functions.FunctionAbs;

import java.util.HashMap;
import java.util.Map;

public class FNCFunctionRegistry {
    private final Map<String, FunctionAbs> functions = new HashMap<>();

    private final FNCLanguage language;

    public FNCFunctionRegistry(FNCLanguage language) {
        this.language = language;
    }

    public FunctionAbs lookup(String name, boolean createIfNotPresent) {
        final FunctionAbs result1 = functions.get(name);
        final FunctionAbs result;
        if (result1 == null && createIfNotPresent) {
            result = new FunctionAbs(language, name);
            functions.put(name, result);
        } else {
            result = result1;
        }
        return result;
    }

    public FunctionAbs register(String name, FNCRootNode rootNode) {
        final FunctionAbs function = lookup(name, true);
        final RootCallTarget callTarget = Truffle.getRuntime().createCallTarget(rootNode);
        function.setCallTarget(callTarget);
        return function;
    }
}
