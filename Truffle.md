# Truffle specific notes

This document summarize the technical details specific to the PoC of the integration of Truffle on the Funcon4J 
framework and its intégration with the CamlLight family.

## Dependencies

- graalvm Jdk8 19.3.1
- truffle 19.3.1

## Structure

 - The maven modules structure is inspired from [simplelanguage](https://github.com/graalvm/simplelanguage/), a language implementation example proposed by the Truffle dev team.
 - [funcons.truffle.TruffleAllFactory](funcons/truffle/TruffleAllFactory.java), equivalent to [funcons.interpreter.AllFactory](funcons/interpreter/AllFactory.java) but with Truffle specific implementations.

## Architecture

Instead of directly returning an evaluation result ([funcons.carriers.IEval](funcons/carriers/IEval.java)) the execution of the Truffle algebra return an AST builder ([funcons.truffle.nodes.FNCBuildAST](funcons/truffle/nodes/FNCBuildAST.java)).
This build is then executed to obtain an Truffle specific AST that can then be executed to obtain the final result of the interpretation.
This is where we benefit from the performance enhancements offered by Truffle.

[funcons.truffle.nodes.FNCExpressionNode](funcons/truffle/nodes/FNCExpressionNode.java) is the parent class of all the classes of the resulting AST.
So far, the subclasses of FNCExpressionNode are independent of each other and could ba packaged in independent language modules. 

Finally,  some Truffle specific annotations such are `@Child/@Children` annotation and `@Specialization` are introduced on some FNCExpression node.



## Compiling

```bash
mvn clean package -DskipTests
```

## Testing

In the [language module](./language), the [tests.truffle](language/src/test/java/tests/truffle) package is a clone of the [tests.reference](language/src/test/java/tests/truffle) test suite, adapted to run the test with the Truffle PoC.

Unsing intelliJ (and eclipse or another modern IDE supporting maven), a right-click on the [tests.truffle](language/src/test/java/tests/truffle) packing then running all the tests is probably enough to run the test suite.

The interesting jvm options are `-Dgraalvm.locatorDisabled=true -XX:-UseJVMCIClassLoader`.


Using maven, the usual `mvn test` is working as usual.