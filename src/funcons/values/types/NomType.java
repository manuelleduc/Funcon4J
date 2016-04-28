package funcons.values.types;

import funcons.values.Value;

public class NomType extends Type {

    private final Token token;

    public NomType(Value name, Token token) {
        super(name.toString()); // TODO Hacky?
        this.token = token;
    }

    @Override
    public int hashCode() {
        return token.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof NomType && ((NomType)obj).token.equals(this.token);
    }
}
