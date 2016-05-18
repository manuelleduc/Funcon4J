package funcons.values;

import java.util.ArrayList;
import java.util.Iterator;

public class CLString extends String {
    public CLString(java.lang.String s) {
        super(filterCamlLightEscapes(s));
    }

    private static java.lang.String filterCamlLightEscapes(java.lang.String s) {
        StringBuilder sb = new StringBuilder();

        java.util.List<java.lang.Character> cs = new ArrayList<>();
        for (java.lang.Character c : s.toCharArray()) {
            cs.add(c);
        }
        Iterator<java.lang.Character> charIt = cs.iterator();

        while(charIt.hasNext()) {
            java.lang.Character c = charIt.next();

            if (c.equals('\\')) {
                sb.append(handleEscape(charIt));
                continue;
            }

            sb.append(c);
        }

        return sb.toString();
    }

    private static java.lang.Character handleEscape(Iterator<java.lang.Character> charIt) {
        if (!charIt.hasNext()) {
            throw new UnsupportedOperationException();
        }

        Character c = charIt.next();

        if (!Character.isDigit(c)) {
            return getCamlLightEscape(c);
        }

        java.lang.String asciiCode = "" + c;
        for (int i = 0; i < 2; i++) {
            if (!charIt.hasNext()) {
                throw new UnsupportedOperationException();
            }
            c = charIt.next();
            if (!Character.isDigit(c)) {
                throw new UnsupportedOperationException();
            }

            asciiCode += c;
        }
        return (char)Integer.parseInt(asciiCode);
    }

    private static java.lang.Character getCamlLightEscape(java.lang.Character c) {
        if (c.equals('\\')) {
            return '\\';
        }
        if (c.equals('"')) {
            return '"';
        }
        if (c.equals('n')) {
            return '\n';
        }
        if (c.equals('r')) {
            return '\r';
        }
        if (c.equals('t')) {
            return '\t';
        }
        if (c.equals('b')) {
            return '\b';
        }

        throw new UnsupportedOperationException();
    }
}
