package funcons.algebras;

public interface StringAlg<E> extends BoolAlg<E> {
    E string(java.lang.String s);
    E camlLightString(java.lang.String s);
}
