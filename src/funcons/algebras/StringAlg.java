package funcons.algebras;

public interface StringAlg<E> extends BoolAlg<E> {
    E string(java.lang.String s);
    E char_(java.lang.Character c);
    E camlLightString(java.lang.String s);
    E camlLightChar(java.lang.String s);
}
