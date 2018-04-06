package funcons.truffle.nodes;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.interop.TruffleObject;

import java.math.BigInteger;

public class FNCContext {

    private final static FNCContext instance = new FNCContext();

    private FNCFunctionRegistry registry;
    private FNCLanguage language;


    public FNCFunctionRegistry getRegistry() {
        return registry;
    }

    public void initRegistry(FNCLanguage language) {
        this.language = language;
        this.registry = new FNCFunctionRegistry(language);
    }

    private FNCContext() {
    }

    public static Object fromForeignValue(Object a) {
        if (a instanceof Long || a instanceof BigInteger || a instanceof String || a instanceof Boolean) {
            return a;
        } else if (a instanceof Character) {
            return String.valueOf(a);
        } else if (a instanceof Number) {
            return fromForeignNumber(a);
        } else if (a instanceof TruffleObject) {
            return a;
        } else if (a instanceof FNCContext) {
            return a;
        }
        CompilerDirectives.transferToInterpreter();
        throw new IllegalStateException(a + " is not a Truffle value");
    }

    @CompilerDirectives.TruffleBoundary
    private static long fromForeignNumber(Object a) {
        return ((Number) a).longValue();
    }

    public static FNCContext getInstance() {
        return instance;
    }

    public FNCLanguage getLanguage() {
        return language;
    }
}
