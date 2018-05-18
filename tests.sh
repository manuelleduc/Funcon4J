#!/bin/bash

export JAVA_HOME=/home/mleduc/jdk/graalvm-1.0.0-rc1

# Build the language package and its dependencies
mvn package -DskipTests -am -pl language -f pom.xml

mvn -am -pl launcher compile

mvn -pl launcher test