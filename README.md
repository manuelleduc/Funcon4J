# FunCon4j: Executable Funcons through Object Algebras

This repo is an artifact of my thesis on creating reusable language implementations. FunCon4J is a library of FunCons build with the Object Algebra design pattern. On basis of FunCon4J extensible and reusable programming languages can be defined. To showcase this the entire dynamic semantics of Caml Light is implemented on FunCon4J. 

## How to build

Import the project through maven

## How to use

* `camllight.CamlLight` how to run Caml Light programs (albeit with somewhat different syntax, and brackets to force correct precedence)
* `camllight.parser.CLPgen` how to generate a parser for Caml Light
* `camllightnocollections.CamlLightNoCollections` demonstrates a language variant of Caml Light with no collections.
* `camllightnorecursion.CamlLightNoRecursion` demonstrates a language variant of Caml Light with no recursion.
* `camllightnosideeffects.CamlLightNoSideEffects` demonstrates a language variant of Caml Light with no side effects.

## Benchs

**Compilation**

```bash
mvn package -DskipTests -f pom.xml
```

**Execution**

Options: 
- `-Dtruffle.class.path.append=./language/target/language-1.0-SNAPSHOT-jar-with-dependencies.jar`