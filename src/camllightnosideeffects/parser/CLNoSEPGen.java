package camllightnosideeffects.parser;

import camllightnosideeffects.NoSEAlg;
import noa.syntax.PGen;

public class CLNoSEPGen {
    public static void main(String[] args) {
        PGen pgen = new PGen(camllight.parser.Tokens.class, NoSEAlg.class);
        pgen.generate("CLNoSE", "camllightnoeffects.parser", "", true); // TODO the path parameter seems to be completely ignored???
    }
}
