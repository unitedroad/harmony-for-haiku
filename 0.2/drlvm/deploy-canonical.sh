#!/bin/sh

DRLVM_HOME=./

if [  -e ${DRLVM_HOME}deploy ]
then
  rm -r ${DRLVM_HOME}deploy
fi

mkdir ${DRLVM_HOME}deploy

cp -r ${DRLVM_HOME}build/${ENV}deploy/** ${DRLVM_HOME}/deploy

shopt -s nullglob

for javabinary in ${DRLVM_HOME}${ENV}deploy/jdk/jre/bin/java*; \
do 
  chmod ugo+x ${javabinary}; 
done
