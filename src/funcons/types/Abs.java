package funcons.types;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Abs<E> implements Value {

    private final E body;

    public Abs(E body) {
        this.body = body;
    }

    public E body() {
        return body;
    }

    @Override
    public boolean equals(Object o) {
        throw new NotImplementedException();
    }

    @Override
    public int hashCode() {
        throw new NotImplementedException();
    }
}
