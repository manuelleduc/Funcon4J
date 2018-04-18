package funcons.truffle.nodes;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.interop.TruffleObject;

import java.math.BigInteger;

public class FNCContext {

    private final TruffleLanguage.Env env;
    private final FNCFunctionRegistry functionRegistry;

    private FNCFunctionRegistry registry;
    private FNCLanguage language;


    public FNCFunctionRegistry getRegistry() {
        return registry;
    }

    public void initRegistry(FNCLanguage language) {
        this.language = language;
        this.registry = new FNCFunctionRegistry(language);
    }

    public FNCContext(FNCLanguage language, TruffleLanguage.Env env) {
        this.env = env;
//        this.input = new BufferedReader(new InputStreamReader(env.in()));
//        this.output = new PrintWriter(env.out(), true);
        this.language = language;
//        this.allocationReporter = env.lookup(AllocationReporter.class);
        this.functionRegistry = new FNCFunctionRegistry(language);
//        installBuiltins();
//
//        this.emptyShape = LAYOUT.createShape(SLObjectType.SINGLETON);
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

//    public static FNCContext getInstance() {
//        return instance;
//    }

    public FNCLanguage getLanguage() {
        return language;
    }

    public FNCFunctionRegistry getFunctionRegistry() {
        return functionRegistry;
    }

    public TruffleLanguage.Env getEnv() {
        return env;
    }
}
