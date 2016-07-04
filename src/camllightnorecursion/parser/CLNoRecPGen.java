package camllightnorecursion.parser;

import camllightnorecursion.NoRecAlg;
import noa.syntax.PGen;

public class CLNoRecPGen {
    public static void main(String[] args) {
        PGen pgen = new PGen(camllight.parser.Tokens.class, NoRecAlg.class);
        pgen.generate("CLNoRec", "camllightnorecursion.parser", "", true); // TODO the path parameter seems to be completely ignored???
    }
}
