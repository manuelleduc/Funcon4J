package funcons.values;

import java.lang.*;
import java.lang.String;

public class Char implements Value {
    private java.lang.Character value;

    public Char(java.lang.Character c) {
        value = c;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Char && ((Char)obj).value.equals(value);
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
