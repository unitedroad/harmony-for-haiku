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

INCLUDES = $(COMMON_INCLUDES)

all: ia32_em64t/dec_base.o ia32_em64t/enc_base.o ia32_em64t/enc_tabl.o ia32_em64t/encoder.o
