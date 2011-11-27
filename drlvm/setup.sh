#!/bin/sh

#deploy directory
DRLVM_HOME=./

source ${DRLVM_HOME}commons.sh

setup ()
{
	setupenvdeploydir
}

setupenvdeploydir ()
{
	if [ ! -e ${ENV_DEPENDS_DIR} ]
	then  
	  mkdir -p ${ENV_DEPENDS_DIR}
	fi
	
	if [ ! -e ${ENV_SEMIS_DIR} ]
	then
	  mkdir ${ENV_SEMIS_DIR}
	fi
	
	if [ ! -e ${ENV_DEPLOY_DIR}include/ ]
	then
	  mkdir ${ENV_DEPLOY_DIR}include/
	fi
	
	if [ ! -e ${ENV_DEPLOY_DIR}lib/ ]
	then
	  mkdir ${ENV_DEPLOY_DIR}lib/
	fi
	
	if [ ! -e ${ENV_DEPLOY_DIR}jdk/include/ ]
	then
	  mkdir -p ${ENV_DEPLOY_DIR}jdk/include/
	fi

	if [ ! -e ${ENV_DEPLOY_DIR}jdk/jre/bin/default/ ]
	then
	  mkdir -p ${ENV_DEPLOY_DIR}jdk/jre/bin/default/
	fi
	
	return
}

copyhdk ()
{
	cp -r ${DRLVM_HOME}../classlib/deploy/** ${ENV_DEPLOY_DIR}
}

setup
copyhdk
