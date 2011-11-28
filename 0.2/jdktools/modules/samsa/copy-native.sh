#!/bin/sh

mkdir -p ${HY_HDK}jdk/bin

cp ${HY_HDK}lib/samsa ${HY_HDK}/jdk/bin/javac
chmod 755  ${HY_HDK}/jdk/bin/javac

cp ${HY_HDK}/lib/samsa ${HY_HDK}/jdk/bin/javah
chmod 755  ${HY_HDK}/jdk/bin/javah

cp ${HY_HDK}/lib/samsa ${HY_HDK}/jdk/bin/javadoc
chmod 755  ${HY_HDK}/jdk/bin/javadoc

cp ${HY_HDK}/lib/samsa ${HY_HDK}/jdk/bin/javap
chmod 755  ${HY_HDK}/jdk/bin/javap

cp ${HY_HDK}/lib/samsa ${HY_HDK}/jdk/bin/jarsigner
chmod 755  ${HY_HDK}/jdk/bin/jarsigner

cp ${HY_HDK}/lib/samsa ${HY_HDK}/jdk/bin/keytool
chmod 755  ${HY_HDK}/jdk/bin/keytool

cp ${HY_HDK}/lib/samsa ${HY_HDK}/jdk/bin/unpack200
chmod 755  ${HY_HDK}/jdk/bin/unpack200

cp ${HY_HDK}/lib/samsa ${HY_HDK}/jdk/bin/jar
chmod 755  ${HY_HDK}/jdk/bin/jar

cp ${HY_HDK}/lib/samsa ${HY_HDK}/jdk/bin/jdb
chmod 755  ${HY_HDK}/jdk/bin/jdb

cp ${HY_HDK}/lib/samsa ${HY_HDK}/jdk/jre/bin/keytool
chmod 755  ${HY_HDK}/jdk/jre/bin/keytool

cp ${HY_HDK}/lib/samsa ${HY_HDK}/jdk/jre/bin/unpack200
chmod 755  ${HY_HDK}/jdk/jre/bin/unpack200

cp ${HY_HDK}/lib/samsa ${HY_HDK}/jdk/jre/bin/pack200
chmod 755  ${HY_HDK}/jdk/jre/bin/pack200





