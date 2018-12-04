# FunCon4j: Executable Funcons through Object Algebras

## Import

This is a standard maven project.

**Remark** Graal JVM RC9 is required to run the Truffle parts (see https://www.graalvm.org/downloads/).

## Execution

### Tests
All the unit test are located in [language's maven test directory](./language/src/test/java/).

### Execution
#### CamlLight

Either with Oracle's JDK 1.8 or GraalVM RC9.
```
java camllight.CamlLight
```

#### CamlLight + Truffle

All the instructions below are executed using GraalVM RC9.

Simple execution:

```
java -XX:-UseJVMCIClassLoader camllight.CamlLightTruffle
```

Execution with dump options.

First `idealgraphvisualizer` (available in the bin directory of GraalVM RC9 distribution) must be started.

Then:

```
java -XX:-UseJVMCIClassLoader -Dgraal.Dump= -Dgraal.MethodFilter=* \
-Dgraal.TruffleBackgroundCompilation=false -Dgraal.TraceTruffleCompilation=true \
-Dgraal.TraceTruffleCompilationDetails=true camllight.CamlLightTruffle
```

During the execution, if hotspot compilation are triggered by Truffle, a dumps directory will be created, and idealgraphvisualizer will display the nodes of the intermediate representation


**Complementary jvm options**

`-Dgraal.TraceTrufflePerformanceWarnings=true` display warnings in the logs when performance issue are detected by truffle at runtime.

Exhaustive options list: https://github.com/oracle/graal/blob/master/compiler/src/org.graalvm.compiler.truffle.compiler/src/org/graalvm/compiler/truffle/compiler/TruffleCompilerOptions.java

# Useful resources

- https://github.com/graalvm/simplelanguage/: the reference implementation, highly documented.
-  http://chrisseaton.com/truffleruby/jokerconf17/
- https://zeroturnaround.com/rebellabs/graal-and-truffle-for-polyglot-languages-on-jvm/
- **Comprehensive slides:** http://lafo.ssw.uni-linz.ac.at/papers/2017_PLDI_GraalTutorial.pdf
- **Publications:**  https://github.com/oracle/graal/blob/master/docs/Publications.md
- https://gitter.im/graalvm/graal-core Active online chat of the community, highly unstructured but with a lot of informative conversations.