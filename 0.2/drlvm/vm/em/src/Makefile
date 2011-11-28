ifdef VM_HOME
else
VM_HOME = ../../
endif

ifdef DRLVM_HOME
DRLVM_HOME = ./
else
DRLVM_HOME = ../../../
endif

include $(DRLVM_HOME)defines.mk
INCLUDES = -I$(VM_HOME)include \
  -I$(VM_HOME)port/include \
  -I$(VM_HOME)vmcore/src/util/linux/include \
  -I$(VM_HOME)vmcore/include \
  -Isrc/em \
  -I$(DRLVM_HOME)build/deploy/include 
  
EM_DEFINES = -D_IA32_
  
CFLAGS += $(EM_DEFINES)

OBJECTS = DrlEMImpl.o EBProfileCollector.o EdgeProfileCollector.o \
  MTable.o NValueProfileCollector.o em_intf.o method_lookup.o
  
all: $(OBJECTS) 
	$(SLD) --version-script=$(SOURCE_DIR)../build/em.exp $(SLDFLAGS) -o libem.so \
	$(OBJECTS) -L$(DRLVM_HOME)$(ENV)build/deploy/jdk/jre/bin/default -lharmonyvm -lhythr \
	-L$(DRLVM_HOME)$(ENV)build/deploy/lib -lport -lapr-1 \
	 $(SLDEXTRAFLAGS)  $(SLDSYSLIBS) -lz
	 cp libem.so $(DRLVM_HOME)$(ENV)build/deploy/jdk/jre/bin/default

clean: 
	rm -f libem.so $(OBJECTS)
