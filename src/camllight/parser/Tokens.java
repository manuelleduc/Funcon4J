package camllight.parser;

import noa.syntax.Level;
import noa.syntax.Skip;
import noa.syntax.Token;

public interface Tokens {
    @Token("[0-9]+")
    static int num(String src) {
        return Integer.parseInt(src);
    }

    @Token("'false' | 'true'")
    static boolean bool(String src) {
        return src.equals("true");
    }

    @Token("[ ]+") @Skip
    void ws();

    @Token("[a-z]+") @Level(0)
    static String id(String src) {
        return src;
    }
}