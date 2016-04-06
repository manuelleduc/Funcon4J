package funcons.types;

public class Abs<E> implements Value {

    private final E body;

    public Abs(E body) {
        this.body = body;
    }

    public E body() {
        return body;
    }
}
