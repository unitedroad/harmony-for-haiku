VM_HOME ?= ../../../


ifdef DRLVM_HOME
DRLVM_HOME = ./
else
DRLVM_HOME = ../../../../
endif

include $(DRLVM_HOME)defines.mk

INCLUDES = $(COMMON_INCLUDES)

OBJECTS = ia32_em64t/dec_base.o ia32_em64t/enc_base.o ia32_em64t/enc_tabl.o ia32_em64t/encoder.o
all: $(OBJECTS) 
	$(AR) $(ARFLAGS) libencoder.a $(OBJECTS)
	cp libencoder.a $(DRLVM_HOME)$(ENV)build/deploy/lib
	
clean: 
	rm -f libencoder.a $(OBJECTS)
