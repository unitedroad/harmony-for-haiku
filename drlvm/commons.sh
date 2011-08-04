#this file should be included only after the declaration of DRLVM_HOME
ENV= #This is not being used everywhere, but it should be so we stay safe
ENV_DEPLOY_DIR=${DRLVM_HOME}build/${ENV}deploy/
ENV_DEPENDS_DIR=${ENV_DEPLOY_DIR}${ENV}depends/
ENV_SEMIS_DIR=${ENV_DEPLOY_DIR}${ENV}semis/
DEPLOY_DIR=${DRLVM_HOME}build/deploy/
DEPENDS_DIR=${DEPLOY_DIR}depends/
SEMIS_DIR=${DEPLOY_DIR}semis/
DEPLOY_BIN_SUFFIX=jdk/jre/bin/default/
DEPLOY_LIB_SUFFIX=lib/
HARMONY_VERSION=991881
SVN_REVISION=${HARMONY_VERSION}
HARMONY_JAVA_VERSION=6.0
HARMONY_JAVA_RUNTIME_VERSION=1.6.0 #harmony ant build does it in if clause
HARMONY_JAVA_SPECIFICATION_VERSION=1.6 #this too
HAIKU_3RDPARTY_BASE_URL="http://haiku-files.org/files/optional-packages/"



