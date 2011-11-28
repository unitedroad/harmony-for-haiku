ifdef VM_HOME
else
VM_HOME = ../../
endif

ifdef DRLVM_HOME
DRLVM_HOME = ./
else
DRLVM_HOME = ../../../
endif

HYTHR_VERSION = _0.1#calculated from hy.no.thr in ../common_resources/make/properties.xml

include $(DRLVM_HOME)defines.mk
INCLUDES =  -I$(VM_HOME)include \
  -I$(VM_HOME)port/include \
  -I$(VM_HOME)thread/src \
  -I$(DRLVM_HOME)build/deploy/include \
 
THREAD_DEFINES = -DAPR_DECLARE_STATIC 

CFLAGS += $(THREAD_DEFINES)

ifeq ($(OS),HAIKU)
HAIKUDEP = -lhaikuundef
endif

OBJECTS = thread_init.o thread_native_attrs.o thread_native_basic.o \
  thread_native_condvar.o thread_native_fat_monitor.o \
  thread_native_groups.o thread_native_interrupt.o thread_native_iterator.o \
  thread_native_latch.o thread_native_park.o thread_native_semaphore.o \
  thread_native_state.o thread_native_suspend.o thread_native_thin_monitor.o \
  thread_native_tls.o thread_ncai_common.o\
  linux/os_condvar.o 
  
all: $(OBJECTS)
	$(SLD) -Wl,-init -Wl,hythread_library_init -Wl,--version-script,$(VM_HOME)/thread/src/hythr$(HYTHR_VERSION).exp $(SLDFLAGS) -o libhythr.so $(OBJECTS) \
	-L$(DRLVM_HOME)$(ENV)build/deploy/jdk/jre/bin/default $(HAIKUDEP) \
	-L$(DRLVM_HOME)$(ENV)build/deploy/lib $(SLDEXTRAFLAGS) -lport -lapr-1 $(SLDSYSLIBS)
	cp libhythr.so $(DRLVM_HOME)$(ENV)build/deploy/jdk/jre/bin/default
	
clean: 
	rm -f libhythr.so $(OBJECTS)
