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
        this.language = language;
    }

    public TruffleLanguage.Env getEnv() {
        return env;
    }

}
