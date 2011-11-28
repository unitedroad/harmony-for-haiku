DRLVM_HOME = ./
VM_HOME = $(DRLVM_HOME)vm/
include defines.mk

BASEDIR = $(CURDIR)

all: setup compile deploy deploy-canonical

setup:
	$(SHELL) setup.sh

.PHONY: setup

compile:
	$(MAKE) -C $(VM_HOME)port/src/encoder/
	$(MAKE) -C $(VM_HOME)port/src/ -f Makefile_haikuundef 
	$(MAKE) -C $(VM_HOME)port/src/
	$(MAKE) -C $(VM_HOME)port/src/ -f Makefile_ch
	$(MAKE) -C $(VM_HOME)thread/src/
	$(MAKE) -C $(VM_HOME)vmcore/src/verifier-3363/
	$(MAKE) -C $(VM_HOME)vmcore/src/ #libharmonyvm
	$(MAKE) -C $(VM_HOME)interpreter/src/
	$(MAKE) -C $(VM_HOME)em/src/
	$(MAKE) -C $(VM_HOME)vmi/src/
	$(MAKE) -C $(VM_HOME)jitrino/src/
	$(MAKE) -C $(VM_HOME)gc_gen/src/

.PHONY: compile

deploy:
	cp $(VM_HOME)include/jni_types.h ${DRLVM_HOME}build/$(ENV)deploy/jdk/include
	cp $(VM_HOME)include/jvmti_types.h ${DRLVM_HOME}build/$(ENV)deploy/jdk/include
	cp $(VM_HOME)include/ncai_types.h ${DRLVM_HOME}build/$(ENV)deploy/jdk/include
	cp $(VM_HOME)include/jvmti.h ${DRLVM_HOME}build/$(ENV)deploy/jdk/include
	cp $(VM_HOME)include/ncai.h ${DRLVM_HOME}build/$(ENV)deploy/jdk/include
#	<delete quiet="yes"> \
#	<fileset dir="${drlvm.bin.dir}" includes="*" excludes="*hythr*"> \
#    <not><different targetdir="${drlvm.deploy.dir}/jdk/jre/bin"/>
	cp $(DRLVM_HOME)build/${ENV}deploy/jdk/jre/bin/default/libhythr.so \
	$(DRLVM_HOME)build/${ENV}deploy/jdk/jre/bin/
	cp $(DRLVM_HOME)make/resources/harmonyvm.properties \
	$(DRLVM_HOME)build/${ENV}deploy/jdk/jre/bin/default/ 
	cat $(DRLVM_HOME)make/resources/readme.txt|sed -e 's/@{hy.os}/Haiku/' \
	-e 's/@{hy.arch}/x86/' > $(DRLVM_HOME)build/${ENV}deploy/jdk/jre/README
#	fixcrlf $(DRLVM_HOME)${ENV}deploy/jdk/jre/README	
	for javabinary in ${wildcard $(DRLVM_HOME)build/${ENV}deploy/jdk/jre/bin/java*}; \
	do \
		chmod ugo+x $$javabinary; \
	done
	
.PHONY: deploy
deploy-canonical:
	$(SHELL) deploy-canonical.sh
.PHONY: deploy-canonical

clean:
	$(MAKE) -C $(VM_HOME)port/src/encoder/ clean
	$(MAKE) -C $(VM_HOME)port/src/ clean	
	$(MAKE) -C $(VM_HOME)port/src/ -f Makefile_haikuundef clean
	$(MAKE) -C $(VM_HOME)port/src/ -f Makefile_ch clean
	$(MAKE) -C $(VM_HOME)thread/src/ clean
	$(MAKE) -C $(VM_HOME)vmcore/src/verifier-3363/ clean
	$(MAKE) -C $(VM_HOME)vmcore/src/ clean #libharmonyvm
	$(MAKE) -C $(VM_HOME)interpreter/src/ clean
	$(MAKE) -C $(VM_HOME)em/src/ clean
	$(MAKE) -C $(VM_HOME)vmi/src/ clean
	$(MAKE) -C $(VM_HOME)jitrino/src/ clean
	$(MAKE) -C $(VM_HOME)gc_gen/src/ clean
