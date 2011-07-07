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
  -I$(VM_HOME)port/src/thread/include \
  -I$(DRLVM_HOME)/deploy/include
  
PORT_DEFINES = -DAPR_DECLARE_EXPORT -DBUILDING_VM

CFLAGS += $(PORT_DEFINES)
  
all: disasm/linux/disasm.o file_io/linux/canonical.o  file_io/linux/filepath.o \
  misc/linux/dso.o  misc/linux/execname.o  misc/linux/sysencoding.o  misc/linux/sysinfo.o \
  misc/linux/timer.o misc/linux/timezone.o misc/linux/user.o \
  vmem/linux/port_vmem.o \
  atomic/linux/port_atomic.o \
  thread/linux/port_thread_tls_find.o \
  thread/linux/thread_os.o \
  thread/linux/thread_ia32.o \
  logger/logger.o logger/logparams.o \
  tl/memory_pool.o \
  time/misc_platform_natives.o \
  malloc/port_malloc.o malloc/port_malloc_registrar.o \


  
  

