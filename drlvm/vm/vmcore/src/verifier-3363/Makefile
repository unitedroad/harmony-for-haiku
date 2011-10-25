ifdef VM_HOME
else
VM_HOME = ../../../
endif

ifdef DRLVM_HOME
DRLVM_HOME = ./
else
DRLVM_HOME = ../../../../
endif

include $(DRLVM_HOME)defines.mk
INCLUDES = -I$(VM_HOME)include \
  -I$(VM_HOME)vmcore/include \
  
VERIFIER_DEFINES = -DBUILDING_VM

CFLAGS +=  $(VERIFIER_DEFINES)
  
OBJECTS = base/context_base.o base/context_x.o base/tpool.o \
  base/ver.o base/vf_resolve.o \
  java5/context_5.o \
  java6/context_6.o \

ifeq (CFG_IS_DEBUG,true)
OBJECTS += x_verifier/recompute.o x_verifier/write_attr.o x_verifier/x_verifier.o
endif

all: $(OBJECTS)
	$(AR) $(ARFLAGS) libverifier.a $(OBJECTS)
	cp libverifier.a $(DRLVM_HOME)$(ENV)build/deploy/lib
	
clean:
	rm -f libverifier.a $(OBJECTS)
  
