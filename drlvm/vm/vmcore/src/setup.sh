#!/bin/bash

DRLVM_HOME=../../../

source ${DRLVM_HOME}commons.sh
ICU_LIB_PACKAGE="icu-4.4.1-r1a3-x86-gcc4-2011-05-29.zip"
ICU_DEVEL_PACKAGE="icu-devel-4.4.1-2010-07-26.zip"
ICU_DIR=${ENV_SEMIS_DIR}icu/


setupvmcore ()
{
#icu
if [ ! -e ${ICU_DIR} ]
then 
  mkdir ${ICU_DIR}
fi
if [ ! -e ${ICU_DIR}${ICU_LIB_PACKAGE} ]
then
wget ${HAIKU_3RDPARTY_BASE_URL}${ICU_LIB_PACKAGE} --directory-prefix=${ICU_DIR}
fi
if [ ! -e ${ICU_DIR}${ICU_DEVEL_PACKAGE} ]
then
wget ${HAIKU_3RDPARTY_BASE_URL}${ICU_DEVEL_PACKAGE} --directory-prefix=${ICU_DIR}
fi

#icu lib
unzip -u -o ${ICU_DIR}${ICU_LIB_PACKAGE}  libicudata.so.44 \
libicui18n.so.44 libicuio.so.44 \
libicule.so.44 libiculx.so.44 \
libicutu.so.44 libicuuc.so.44 \
-d ${ENV_DEPLOY_DIR}${ENV}${DEPLOY_BIN_SUFFIX} 
#ln -sf ${ENV_DEPLOY_DIR}${ENV}${DEPLOY_BIN_SUFFIX}libicuuc.so.44 ${ENV_DEPLOY_DIR}${ENV}${DEPLOY_BIN_SUFFIX}libicuuc.so
SAVEDPWD=$(pwd)
cd ${ENV_DEPLOY_DIR}${ENV}${DEPLOY_BIN_SUFFIX}
ln -sf libicuuc.so.44 libicuuc.so
cd ${SAVEDPWD}
#icu include
unzip -u -o -j ${ICU_DIR}${ICU_DEVEL_PACKAGE} 'develop/headers/3rdparty/**' -d ${ENV_DEPLOY_DIR}${ENV}include/unicode
cat ../include/version_svn_tag_orig.h|sed -e 's/@svn.revision@/'${SVN_REVISION}'/'	\
-e 's/@harmony.java.runtime.version@/'${HARMONY_JAVA_RUNTIME_VERSION}'/' \
-e 's/@harmony.java.specification.version@/'${HARMONY_JAVA_SPECIFICATION_VERSION}'/' \
> ../include/version_svn_tag.h


}

setupvmcore
