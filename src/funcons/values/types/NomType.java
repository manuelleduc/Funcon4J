package funcons.values.types;

import funcons.values.Value;

public class NomType implements Value {

    private final Token token;
    private final Value name;

    public NomType(Value name, Token token) {
        this.token = token;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return token.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof NomType && ((NomType)obj).token.equals(this.token);
    }

    @Override
    public String toString() {
        return "NomType: " + name.toString();
    }
}
