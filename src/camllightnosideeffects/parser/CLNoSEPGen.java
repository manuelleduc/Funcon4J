package camllightnosideeffects.parser;

import camllightnosideeffects.NoSideEffectsAlg;
import noa.syntax.PGen;

public class CLNoSEPGen {
    public static void main(String[] args) {
        PGen pgen = new PGen(camllight.parser.Tokens.class, NoSideEffectsAlg.class);
        pgen.generate("CLNoSE", "camllightwithoutsideeffects.parser", "", true); // TODO the path parameter seems to be completely ignored???
    }
}
