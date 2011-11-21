#!/bin/sh
BASE_DIR=${PWD}
HY_HDK=$BASE_DIR/deploy
INCLUDE_DIR=$HY_HDK/include

if [ ! -d deploy ]
then
  mkdir -p deploy
  mkdir deploy/lib
  mkdir -p deploy/jdk/lib
  mkdir -p deploy/jdk/jre/bin
  mkdir deploy/jdk/jre/lib
  
  cp -a make-depends/build deploy
  
  #check-depends
  #luni
  #check-depends
  #-copy-includes
  OLDDIR=${PWD}
  mkdir $INCLUDE_DIR
  cd $BASE_DIR/modules/luni/src/main/native/include
  cp -a vmi.h $INCLUDE_DIR
  cp -a hyvmls.h $INCLUDE_DIR
  cp -a hysocket.h $INCLUDE_DIR
  cp -a gp.h $INCLUDE_DIR
  cp -a fdlibm.h $INCLUDE_DIR
  cp -a hymagic.h $INCLUDE_DIR
  cp -a vmizip.h $INCLUDE_DIR
  
  cp -a jni.h $INCLUDE_DIR
  cp -a jni_types.h $INCLUDE_DIR
  cp -a jvmti.h $INCLUDE_DIR
  cp -a jvmti_types.h $INCLUDE_DIR
  
  
  #portlib
  #check-depends
  cd $BASE_DIR/modules/portlib/src/main/native/include/shared
  cp -a hyport.h $INCLUDE_DIR
  cp -a hycomp.h $INCLUDE_DIR
  cp -a hyporterror.h $INCLUDE_DIR
  cp -a hypool.h $INCLUDE_DIR
  cp -a exceptions.h $INCLUDE_DIR
  cp -a iohelp.h $INCLUDE_DIR
  cp -a libglob.h $INCLUDE_DIR
  cp -a strhelp.h $INCLUDE_DIR
  cp -a utf8decode.h $INCLUDE_DIR
  cp -a utf8encode.h $INCLUDE_DIR
  
  cd $BASE_DIR/modules/portlib/src/main/native/include/unix
  cp -a hymutex.h $INCLUDE_DIR
  cp -a hysock.h $INCLUDE_DIR
  cp -a hyportpg.h $INCLUDE_DIR
  
  #-copy-thread-include
  cd $BASE_DIR/modules/portlib/src/main/native/include/shared
  cp -a hythread.h $INCLUDE_DIR
  
  #archive
  #check-depends
  #-copy-zipsup-include
  cd $BASE_DIR/modules/archive/src/main/native/include/shared
  cp -a zipsup.h $INCLUDE_DIR
  
fi
