package funcons.truffle.nodes;

import com.oracle.truffle.api.TruffleLanguage;

public class FNCContext {

    private final TruffleLanguage.Env env;

    private FNCLanguage language;


    public void initRegistry(FNCLanguage language) {
        this.language = language;
    }

    public FNCContext(FNCLanguage language, TruffleLanguage.Env env) {
        this.env = env;
//        this.input = new BufferedReader(new InputStreamReader(env.in()));
//        this.output = new PrintWriter(env.out(), true);
        this.language = language;
//        this.allocationReporter = env.lookup(AllocationReporter.class);

//        installBuiltins();
//
//        this.emptyShape = LAYOUT.createShape(SLObjectType.SINGLETON);
    }


    public FNCLanguage getLanguage() {
        return language;
    }


    public TruffleLanguage.Env getEnv() {
        return env;
    }

}
