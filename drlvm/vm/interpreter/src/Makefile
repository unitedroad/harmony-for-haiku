VM_HOME ?= ../../

DRLVM_HOME ?= ../../../


SOURCE_DIR ?= ./#Location of interpreter makefile

include $(DRLVM_HOME)defines.mk
INCLUDES = -I$(VM_HOME)vmcore/src/util/linux/include \
  -I$(VM_HOME)include \
  -I$(VM_HOME)port/include \
  -I$(VM_HOME)port/src/encoder/ia32_em64t \
  -I$(VM_HOME)vmcore/include \
  -I$(VM_HOME)vmcore/src/util/ia32/base_natives \
  -I$(VM_HOME)vmcore/src/lil/ia32/include \
  -I$(DRLVM_HOME)$(ENV)build/deploy/include \
  

OBJECTS = interp_exports.o interp_native_ia32.o interp_stack_trace.o interp_vm_helpers.o \
  interpreter.o interpreter_ti.o

all:  $(OBJECTS)
	$(AS) $(ASFLAGS) invokeJNI_ia32.asm
#$(LINKER) --version-script=$(VM_HOME)interpreter/build/interpreter.exp 
	$(SLD) -Wl,--version-script=$(SOURCE_DIR)../build/interpreter.exp $(SLDFLAGS) -o libinterpreter.so \
	$(OBJECTS) -L$(DRLVM_HOME)$(ENV)build/deploy/jdk/jre/bin/default -lharmonyvm -lhythr $(SLDEXTRAFLAGS)  $(SLDSYSLIBS)  
	cp libinterpreter.so $(DRLVM_HOME)$(ENV)build/deploy/jdk/jre/bin/default
	cp  ../interpreter.emconf $(DRLVM_HOME)$(ENV)build/deploy/jdk/jre/bin/default
	
clean: 
	rm -f libinterpreter.so $(OBJECTS)
