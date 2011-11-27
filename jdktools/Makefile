export HY_HDK=$(ROOT_DIR)/target/hdk

all: setup compile

setup:
	$(SHELL) setup.sh
	
compile:
	$(MAKE) -C ./modules/jpda/src/main/native/jdwp/unix/agent/
	$(MAKE) -C ./modules/jpda/src/main/native/jdwp/unix/transport/dt_socket/
	$(MAKE) -C ./modules/samsa/src/main/native/samsa/unix/
	
