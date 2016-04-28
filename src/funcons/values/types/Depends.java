package funcons.values.types;

public class Depends extends Type {

    private final Type type1, type2;

    public Depends(Type type1, Type type2) {
        super("Depends: " + type1.name + " " + type2.name);
        this.type1 = type1;
        this.type2 = type2;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Depends &&
                ((Depends) o).type1.equals(this.type1) &&
                ((Depends) o).type2.equals(this.type2);
    }
}
