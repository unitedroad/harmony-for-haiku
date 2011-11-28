VM_HOME ?= ../../

DRLVM_HOME ?= ../../../

include $(DRLVM_HOME)defines.mk
INCLUDES = -I$(VM_HOME)include \
  -I$(VM_HOME)port/include \
  -I$(VM_HOME)vmcore/include \
  -I$(VM_HOME)vmcore/src/util/linux/include \
  -I$(VM_HOME)vmcore/src/util/ia32/base_natives \
  -I$(VM_HOME)port/src/encoder/ia32_em64t \
  -I$(VM_HOME)vmcore/src/lil/ia32/include \
  -I$(DRLVM_HOME)build/deploy/include \
  
CXXFLAGS += -DBUILDING_VM -DAPR_DECLARE_STATIC -D_IA32_

ifeq ($(OS),HAIKU)
HAIKUDEP = -lhaikuundef
endif

OBJECTS = class_support/Assertion_Registry.o class_support/C_Interface.o \
  class_support/Class.o class_support/Class_File_Loader.o \
  class_support/Environment.o class_support/Initialize.o \
  class_support/Prepare.o class_support/Resolve.o \
  class_support/String_Pool.o class_support/Verifier_stub.o \
  class_support/class_impl.o class_support/classloader.o \
  class_support/inline_info.o class_support/java_type.o \
  class_support/manifest.o class_support/method.o class_support/type.o \
  class_support/type_access.o \
  exception/exceptions.o exception/exceptions_impl.o \
  exception/exceptions_int.o exception/exceptions_jit.o \
  init/finalize.o init/finalizer_thread.o init/parse_arguments.o \
  init/properties.o init/ref_enqueue_thread.o init/vm.o init/vm_init.o \
  init/vm_properties.o init/vm_shutdown.o \
  gc/dll_gc.o gc/root_set_enum_common.o gc/stop_the_world_root_set_enum.o \
  interpreter/interp_exports.o interpreter/interp_imports.o \
  jit/bit_vector.o jit/compile.o jit/dll_jit.o jit/dump.o \
  jit/ini.o jit/jit_runtime_support.o jit/native_overrides.o \
  jit/primitives_support.o jit/rt_helper_info.o \
  jni/jni.o jni/jni_array.o jni/jni_field.o jni/jni_method.o jni/jni_utils.o \
  jvmti/jvmti.o jvmti/jvmti_break.o jvmti/jvmti_break_intf.o \
  jvmti/jvmti_capability.o jvmti/jvmti_class.o jvmti/jvmti_dasm.o \
  jvmti/jvmti_enumerate.o jvmti/jvmti_event.o jvmti/jvmti_extension.o \
  jvmti/jvmti_field.o jvmti/jvmti_general.o jvmti/jvmti_heap.o \
  jvmti/jvmti_internal.o jvmti/jvmti_jni.o jvmti/jvmti_locals.o \
  jvmti/jvmti_mem.o jvmti/jvmti_method.o jvmti/jvmti_object.o \
  jvmti/jvmti_pop_frame.o jvmti/jvmti_property.o jvmti/jvmti_rawmon.o \
  jvmti/jvmti_roots.o jvmti/jvmti_stack.o jvmti/jvmti_step.o jvmti/jvmti_tags.o \
  jvmti/jvmti_thread.o jvmti/jvmti_thread_group.o jvmti/jvmti_timer.o \
  jvmti/jvmti_trace.o jvmti/jvmti_watch.o \
  ncai/ncai.o ncai/ncai_break.o ncai/ncai_event.o ncai/ncai_memory.o \
  ncai/ncai_methods.o ncai/ncai_modules.o ncai/ncai_registers.o ncai/ncai_signals.o \
  ncai/ncai_stack.o ncai/ncai_step.o ncai/ncai_thread.o \
  object/object_handles.o object/vm_arrays.o \
  reflection/annotations.o reflection/reflection.o \
  stack/native_stack.o stack/stack_trace.o \
  thread/atomics_common.o thread/lock_manager.o thread/mon_enter_exit.o \
  thread/object_generic.o thread/thread_dump.o thread/thread_generic.o \
  thread/thread_java_attrs.o thread/thread_java_basic.o thread/thread_java_interrupt.o \
  thread/thread_java_iterator.o thread/thread_java_monitors.o thread/thread_java_park.o \
  thread/thread_java_suspend.o thread/thread_manager.o thread/thread_ti_instr.o \
  thread/thread_ti_monitors.o thread/thread_ti_others.o thread/thread_ti_timing.o \
  thread/verify_stack_enumeration.o \
  thread/helpers/thread_helpers_ia32.o \
  util/bytereader.o util/crash_dump.o util/jarfile_support.o util/mem_alloc.o \
  util/natives_support.o util/signals.o util/vm_stats.o util/vm_strings.o \
  lil/lil.o lil/lil_code_generator.o lil/lil_code_generator_utils.o \
  lil/stack_iterator/m2n.o lil/stack_iterator/stack_iterator.o \
  kernel_classes/native/Runtime_lnx.o \
  kernel_classes/native/java_lang_EMThreadSupport.o \
  kernel_classes/native/java_lang_FinalizerThread.o \
  kernel_classes/native/java_lang_System.o kernel_classes/native/java_lang_VMClassRegistry.o \
  kernel_classes/native/java_lang_VMExecutionEngine.o \
  kernel_classes/native/java_lang_VMMemoryManager.o \
  kernel_classes/native/java_lang_VMThreadManager.o \
  kernel_classes/native/java_lang_reflect_VMField.o \
  kernel_classes/native/java_lang_reflect_VMReflection.o \
  kernel_classes/native/java_util_concurrent_locks_LockSupport.o \
  kernel_classes/native/org_apache_harmony_drlvm_VMHelper.o \
  kernel_classes/native/org_apache_harmony_drlvm_VMHelperFastPath.o \
  kernel_classes/native/org_apache_harmony_kernel_vm_VM.o \
  kernel_classes/native/org_apache_harmony_lang_management_ClassLoadingMXBeanImpl.o \
  kernel_classes/native/org_apache_harmony_lang_management_CompilationMXBeanImpl.o \
  kernel_classes/native/org_apache_harmony_lang_management_GarbageCollectorMXBeanImpl.o \
  kernel_classes/native/org_apache_harmony_lang_management_MemoryMXBeanImpl.o \
  kernel_classes/native/org_apache_harmony_lang_management_MemoryManagerMXBeanImpl.o \
  kernel_classes/native/org_apache_harmony_lang_management_MemoryNotificationThread.o \
  kernel_classes/native/org_apache_harmony_lang_management_MemoryNotificationThreadShutdown.o \
  kernel_classes/native/org_apache_harmony_lang_management_MemoryPoolMXBeanImpl.o \
  kernel_classes/native/org_apache_harmony_lang_management_RuntimeMXBeanImpl.o \
  kernel_classes/native/org_apache_harmony_lang_management_ThreadMXBeanImpl.o \
  kernel_classes/native/org_apache_harmony_util_concurrent_Atomics.o \
  kernel_classes/native/org_apache_harmony_vm_VMDebug.o \
  kernel_classes/native/org_apache_harmony_vm_VMGenericsAndAnnotations.o \
  kernel_classes/native/org_apache_harmony_vm_VMStack.o \
  ../../vmstart/src/compmgr/component_manager_impl.o \
  util/ia32/base/compile_IA32.o util/ia32/base/ini_iA32.o \
  util/ia32/base/jit_lock_rt_support_ia32.o util/ia32/base/jit_runtime_support_ia32.o \
  util/ia32/base/optimize_ia32.o \
  util/ia32/base_natives/java_lang_thread_ia32.o \
  ncai/utils/ncai_step_ia32.o ncai/utils/ncai_utils_ia32.o \
  ncai/utils/ncai_modules_linux.o ncai/utils/ncai_utils_linux.o \
  util/linux/crash_dump_os.o util/linux/os_wrapper.o \
  lil/ia32/lil_code_generator_ia32.o lil/ia32/m2n_ia32.o lil/ia32/stack_iterator_ia32.o \


.PHONY: setup
all: setup $(OBJECTS) 
	$(SLD) -Wl,--version-script=$(SOURCE_DIR)../build/vmcore.exp $(SLDFLAGS) -o libharmonyvm.so \
	$(OBJECTS) -L$(DRLVM_HOME)$(ENV)build/deploy/jdk/jre/bin/default -lhythr -licuuc -lch $(HAIKUDEP) \
	-L$(DRLVM_HOME)../classlib/deploy/jdk/jre/bin/ -lhyzlib \
	-L$(DRLVM_HOME)$(ENV)build/deploy/lib $(SLDEXTRAFLAGS)  $(SLDSYSLIBS) -lgcc \
	-lport -lencoder  -lverifier -lapr-1
	cp libharmonyvm.so $(DRLVM_HOME)$(ENV)build/deploy/jdk/jre/bin/default

setup:
	$(SHELL) setup.sh
	
clean: 
	rm -f libharmonyvm.so $(OBJECTS)












 
