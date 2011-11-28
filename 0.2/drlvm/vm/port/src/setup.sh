#!/bin/sh

#These variables should probably be moved to commons.sh
#common file metadata 
TAR_GZ_EXT=.tar.gz
#TMP_DIR=tmp/


#main depends url
DEPENDS_URL=http://svn.apache.org/repos/asf/harmony/standard/depends/

#deploy directory
DRLVM_HOME=../../../

source ${DRLVM_HOME}commons.sh

APR_DIR=${ENV_SEMIS_DIR}apr/
#APR
APR_URL=http://archive.apache.org/dist/apr/
APR_PREFIX=apr-1.3.9
APR_FILE=${APR_PREFIX}${TAR_GZ_EXT}

#URL for latest config file
CONFIG_GUESS_URL="http://git.savannah.gnu.org/gitweb/?p=config.git;a=blob_plain;f=config.guess;hb=HEAD"
CONFIG_SUB_URL="http://git.savannah.gnu.org/gitweb/?p=config.git;a=blob_plain;f=config.sub;hb=HEAD"

setupapr ()
{
	if [ ! -e ${DEPENDS_DIR}${APR_FILE} ]
	then	
	  wget ${APR_URL}${APR_FILE} --directory-prefix=${DEPENDS_DIR}
	fi
	if [ ! -e ${APR_DIR} ]
	then
	  mkdir ${APR_DIR}
	fi
	tar -zxvf ${DEPENDS_DIR}${APR_FILE} -C ${APR_DIR}
	wget ${CONFIG_GUESS_URL} -O${APR_DIR}${APR_PREFIX}/build/config.guess #we need to cat apr.h
	wget ${CONFIG_SUB_URL} -O${APR_DIR}${APR_PREFIX}/build/config.sub     #config.guess and config.sub
	SAVEDPWD=$(pwd)
	cd ${APR_DIR}${APR_PREFIX}
	echo $(pwd)
	sh configure
	cd include
	$(cat apr.h|sed 's/#define APR_HAS_OS_UUID           1/#define APR_HAS_OS_UUID           0/' | \
	sed 's/APR_HAS_POSIXSEM_SERIALIZE        0/APR_HAS_POSIXSEM_SERIALIZE        1/'| \
	sed 's/#define APR_HAS_PROC_PTHREAD_SERIALIZE    0/#define APR_HAS_PROC_PTHREAD_SERIALIZE    1/' >> apr.h.tmp)
	mv apr.h.tmp apr.h
	cd ..
	make
	cd ${SAVEDPWD}
	#sed 's/${DEPLOY_DIR}include/	
	cp ${APR_DIR}${APR_PREFIX}/include/*.h ${ENV_DEPLOY_DIR}include/
	cp ${APR_DIR}${APR_PREFIX}/.libs/libapr-1.a ${ENV_DEPLOY_DIR}lib/
	
	
	return
}

setupapr
