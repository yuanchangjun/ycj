#!/bin/sh

mkdir -p target/classes/

javac -encoding "utf-8" -d target/classes -classpath lib/servlet-api.jar SRC/main/java/com/bodejidi/*.java
