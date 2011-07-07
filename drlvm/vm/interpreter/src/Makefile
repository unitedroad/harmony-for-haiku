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
INCLUDES = -I$(DRLVM_HOME)deploy/include \
  -I$(VM_HOME)vmcore/src/util/linux/include \
  -I$(VM_HOME)include \
  -I$(VM_HOME)port/include \
  -I$(VM_HOME)port/src/encoder/ia32_em64t \
  -I$(VM_HOME)vmcore/include \
  -I$(VM_HOME)vmcore/src/util/ia32/base_natives \
  -I$(VM_HOME)vmcore/src/lil/ia32/include \
  


all: interp_exports.o interp_native_ia32.o interp_stack_trace.o interp_vm_helpers.o interp_vm_helpers.h interpreter.o interpreter_ti.o 
	$(AS) $(ASFLAGS) invokeJNI_ia32.asm 
