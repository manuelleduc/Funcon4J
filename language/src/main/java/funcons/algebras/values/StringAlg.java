package funcons.algebras.values;

public interface StringAlg<E> {
    E string(java.lang.String s);
    E char_(java.lang.Character c);
    E camlLightString(java.lang.String s);
    E camlLightChar(java.lang.String s);
    E stringAppend(E str1, E str2);
}
