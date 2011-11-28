ifdef VM_HOME
else
VM_HOME = ../../
endif

ifdef DRLVM_HOME
DRLVM_HOME = ./
else
DRLVM_HOME = ../../../
endif

SOURCE_DIR = ./

include $(DRLVM_HOME)defines.mk
INCLUDES = -I$(VM_HOME)include \
  -I$(VM_HOME)port/include \
  -I$(VM_HOME)vmcore/include \
  -I$(VM_HOME)vmcore/src/util/linux/include \
  -I$(DRLVM_HOME)../classlib/deploy/include \
  -I$(DRLVM_HOME)build/deploy/include \
    
OBJECTS = j9vmls.o vmi.o   
    
all: $(OBJECTS)
	$(SLD) -Wl,--version-script=$(SOURCE_DIR)vmi.exp $(SLDFLAGS) -o libvmi.so \
	$(OBJECTS) -L$(DRLVM_HOME)../classlib/deploy/lib/ -lhyzip -lhypool \
	-L$(DRLVM_HOME)$(ENV)../classlib/deploy/jdk/jre/bin -lhyprt  
	cp libvmi.so $(DRLVM_HOME)$(ENV)build/deploy/jdk/jre/bin/default
	
clean: 
	rm -f libvmi.so $(OBJECTS)
