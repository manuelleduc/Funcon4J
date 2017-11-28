package funcons.values.types;

import funcons.values.properties.ExternalRascalValue;
import io.usethesource.vallang.IValue;

public class Token implements ExternalRascalValue {
    private static Integer tokenCount = 0;

    private final Integer identifier;

    public Token() {
        identifier = tokenCount;
        tokenCount++;
    }

    @Override
    public int hashCode() {
        return identifier.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Token && ((Token)obj).identifier.equals(this.identifier);
    }

    @Override
    public boolean isEqual(IValue other) {
        return equals(other);
    }

	@Override
	public boolean match(IValue other) {
		// TODO Auto-generated method stub
		return false;
	}
}
