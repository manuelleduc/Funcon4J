package camllight.parser;

import noa.syntax.Level;
import noa.syntax.Skip;
import noa.syntax.Token;

public interface Tokens {
    @Token("[0-9]+")
    static int numtoken(String src) {
        return Integer.parseInt(src);
    }

    @Token("'false' | 'true'")
    static boolean booltoken(String src) {
        return src.equals("true");
    }

    @Token("'_'")
    static String wildcardtoken(String src) {
        return src;
    }

    @Token("[ ]+") @Skip
    void ws();

    @Token("'[' [ ]* ']'")
    static String emptylisttoken(String src) {
        return src;
    }

    @Token("'(' [ ]* ')'")
    static String nulltoken(String src) {
        return src;
    }

    @Token("[a-zA-Z_][a-zA-Z_0-9]*") @Level(0)
    static String idtoken(String src) {
        return src;
    }
}