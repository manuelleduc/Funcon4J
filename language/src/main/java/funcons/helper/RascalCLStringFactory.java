package funcons.helper;

import io.usethesource.vallang.IString;
import io.usethesource.vallang.IValueFactory;

import java.util.ArrayList;
import java.util.Iterator;

public class RascalCLStringFactory {
    public static IString clChar(IValueFactory vf, java.lang.String s) {
        if (s.length() == 1) {
            return vf.string(s.charAt(0));
        }
        if (s.length() == 4) {
            return vf.string((char)Integer.parseInt(s.substring(1, s.length())));
        }
        if (s.equals("\\\\")) {
            return vf.string('\\');
        }
        if (s.equals("\\`")) {
            return vf.string('`');
        }
        if (s.equals("\\n")) {
            return vf.string('\n');
        }
        if (s.equals("\\r")) {
            return vf.string('\r');
        }
        if (s.equals("\\t")) {
            return vf.string('\t');
        }
        if (s.equals("\\b")) {
            return vf.string('\b');
        }

        throw new UnsupportedOperationException();
    }

    public static IString clString(IValueFactory vf, java.lang.String s) {
        return vf.string(filterCamlLightEscapes(s));
    }

    private static java.lang.String filterCamlLightEscapes(java.lang.String s) {
        StringBuilder sb = new StringBuilder();
        Iterator<Character> charIt = charIterator(s);

        while(charIt.hasNext()) {
            java.lang.Character c = charIt.next();

            if (c.equals('\\')) {
                c = handleEscape(charIt);
            }

            sb.append(c);
        }

        return sb.toString();
    }

    private static Iterator<java.lang.Character> charIterator(java.lang.String s) {
        java.util.List<java.lang.Character> cs = new ArrayList<>();
        for (java.lang.Character c : s.toCharArray()) {
            cs.add(c);
        }
        return cs.iterator();
    }

    private static java.lang.Character handleEscape(Iterator<java.lang.Character> charIt) {
        Character c = charIt.next();

        if (!Character.isDigit(c)) {
            return getCamlLightEscape(c);
        }

        return (char)Integer.parseInt("" + c + charIt.next() + charIt.next());
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

        throw new UnsupportedOperationException("char: " + c);
    }
}
