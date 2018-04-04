package funcons.values.properties;

import io.usethesource.vallang.*;
import io.usethesource.vallang.type.Type;
import io.usethesource.vallang.type.TypeFactory;
import io.usethesource.vallang.visitors.IValueVisitor;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public interface ExternalRascalValue extends IExternalValue {
    TypeFactory typeFactory = TypeFactory.getInstance();

    @Override
    default Type getType() {
        return typeFactory.externalType(typeFactory.valueType());
    }

    @Override
    default IConstructor encodeAsConstructor() {
        throw new NotImplementedException();
    }

    @Override
    default <T, E extends Throwable> T accept(IValueVisitor<T, E> v) throws E {
        return null;
        //throw new NotImplementedException(); // TODO
    }

    @Override
    default boolean isAnnotatable() {
        throw new NotImplementedException();
    }

    @Override
    default IAnnotatable<? extends IValue> asAnnotatable() {
        throw new NotImplementedException();
    }

    @Override
    default boolean mayHaveKeywordParameters() {
        throw new NotImplementedException();
    }

    @Override
    default IWithKeywordParameters<? extends IValue> asWithKeywordParameters() {
        throw new NotImplementedException();
    }
}
