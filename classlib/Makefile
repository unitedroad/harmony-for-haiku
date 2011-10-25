export HY_HDK=$(CURDIR)/deploy

all: setup compile

fetch-depends:
	$(MAKE) -C ./modules/archive/src/main/native/zlib/unix/ -f Makefile_depends

.PHONY: compile setup clean-modules setup-clean

compile:
#portlib build-native 
	$(MAKE) -C ./modules/portlib/src/main/native/common/unix/
	$(MAKE) -C ./modules/portlib/src/main/native/pool/unix/
	$(MAKE) -C ./modules/portlib/src/main/native/thread/unix/
	$(MAKE) -C ./modules/portlib/src/main/native/thread/unix/ -f Makefile_copylib	
#	$(MAKE) -C ./modules/portlib/src/main/native/thrstub/unix/
	$(MAKE) -C ./modules/portlib/src/main/native/port/unix/
#luni build-native-core
	$(MAKE) -C ./modules/luni/src/main/native/vmi/unix/
	$(MAKE) -C ./modules/luni/src/main/native/vmi/unix/ -f Makefile_copylib	
#archive build-native
	$(MAKE) -C ./modules/archive/src/main/native/zip/unix/
	$(MAKE) -C ./make-depends/fetch-depends/ -f Makefile_archive
	$(MAKE) -C ./modules/archive/src/main/native/zlib/unix/
	$(MAKE) -C ./modules/archive/src/main/native/archive/unix/
#luni -build-native-secondary
#-build-native-secondary1
	$(MAKE) -C ./make-depends/fetch-depends/ -f Makefile_luni
	$(MAKE) -C ./modules/luni/src/main/native/fdlibm/unix/
	$(MAKE) -C ./modules/luni/src/main/native/luni/unix/
	$(MAKE) -C ./modules/luni/src/main/native/vmls/unix/
#-build-hyzip unless="hy.skip.zip.api"
#	$(MAKE) -C ./modules/luni/src/main/native/hyzip/unix/
#-build-native-secondary2

	$(MAKE) -C ./modules/luni/src/main/native/launcher/unix/
	
setup:
	$(SHELL) -x setup.sh
	
clean: clean-modules setup-clean

clean-modules:
#portlib build-native 
	$(MAKE) -C ./modules/portlib/src/main/native/common/unix/ clean
	$(MAKE) -C ./modules/portlib/src/main/native/pool/unix/  clean
	$(MAKE) -C ./modules/portlib/src/main/native/thread/unix/  clean
#	$(MAKE) -C ./modules/portlib/src/main/native/thrstub/unix/  clean
	$(MAKE) -C ./modules/portlib/src/main/native/port/unix/  clean
#luni build-native-core
	$(MAKE) -C ./modules/luni/src/main/native/vmi/unix/  clean
#archive build-native
	$(MAKE) -C ./modules/archive/src/main/native/zip/unix/  clean
#	$(MAKE) -C ./make/fetch-depends/ -f Makefile_archive  clean
	$(MAKE) -C ./modules/archive/src/main/native/zlib/unix/  clean
	$(MAKE) -C ./modules/archive/src/main/native/archive/unix/  clean
#luni -build-native-secondary
#-build-native-secondary1
#	$(MAKE) -C ./make/fetch-depends/ -f Makefile_luni  clean
	$(MAKE) -C ./modules/luni/src/main/native/fdlibm/unix/  clean
	$(MAKE) -C ./modules/luni/src/main/native/luni/unix/  clean
	$(MAKE) -C ./modules/luni/src/main/native/vmls/unix/  clean
#-build-hyzip unless="hy.skip.zip.api"
#	$(MAKE) -C ./modules/luni/src/main/native/hyzip/unix/  clean
#-build-native-secondary2

	$(MAKE) -C ./modules/luni/src/main/native/launcher/unix/  clean
	
setup-clean:
	rm -r deploy

