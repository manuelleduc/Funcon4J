#OPTS="-Dgraal.Dump= -Dgraal.MethodFilter=* -Dgraal.TruffleBackgroundCompilation=false -Dgraal.TraceTruffleCompilation=true -Dgraal.TraceTruffleCompilationDetails=true"
OPTS=""

mvn clean package  -DskipTests -am  -pl launcher,language

/home/mleduc/jdk/graalvm-1.0.0-rc1/bin/java -XX:+UseJVMCICompiler $OPTS -Dtruffle.class.path.append=/home/mleduc/dev/java/Funcon4J/language/target/funconlang.jar -classpath /home/mleduc/dev/java/Funcon4J/launcher/target/launcher-1.0-SNAPSHOT.jar:commons/target/commons-1.0-SNAPSHOT.jar camllight.CamlLightTruffle
