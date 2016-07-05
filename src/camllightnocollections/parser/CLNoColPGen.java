package camllightnocollections.parser;


import camllightnocollections.NoCollectionsAlg;
import noa.syntax.PGen;

public class CLNoColPGen {
    public static void main(String[] args) {
        PGen pgen = new PGen(camllight.parser.Tokens.class, NoCollectionsAlg.class);
        pgen.generate("CLNoCol", "camllightnocollections.parser", "", true); // TODO the path parameter seems to be completely ignored???
    }
}
