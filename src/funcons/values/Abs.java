package funcons.values;

import funcons.values.properties.Value;
import org.rascalmpl.value.IAnnotatable;
import org.rascalmpl.value.IValue;
import org.rascalmpl.value.IWithKeywordParameters;
import org.rascalmpl.value.type.Type;
import org.rascalmpl.value.type.TypeFactory;
import org.rascalmpl.value.visitors.IValueVisitor;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Abs<E> implements Value, IValue {

    private final E body;

    public Abs(E body) {
        this.body = body;
    }

    public E body() {
        return body;
    }

    @Override
    public boolean equals(Object o) {
        return o == this;
    }

    @Override
    public int hashCode() {
        throw new NotImplementedException();
    }

    @Override
    public java.lang.String toString() {
        return "ABS: " + body.toString();
    }

    /* UNSUPPORTED */ // TODO
    @Override
    public Type getType() {
        return TypeFactory.getInstance().valueType();
    }

    @Override
    public <T, E extends Throwable> T accept(IValueVisitor<T, E> v) throws E {
        return null;
    }

    @Override
    public boolean isEqual(IValue other) {
        return false;
    }

    @Override
    public boolean isAnnotatable() {
        return false;
    }

    @Override
    public IAnnotatable<? extends IValue> asAnnotatable() {
        return null;
    }

    @Override
    public boolean mayHaveKeywordParameters() {
        return false;
    }

    @Override
    public IWithKeywordParameters<? extends IValue> asWithKeywordParameters() {
        return null;
    }
}
