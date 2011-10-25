
VM_HOME ?= ../../


DRLVM_HOME ?= ../../../


include $(DRLVM_HOME)defines.mk
INCLUDES = -I$(VM_HOME)vmcore/include \
  -I$(VM_HOME)include \
  -I$(VM_HOME)port/include \
  -I$(VM_HOME)port/src/encoder/ia32_em64t \
  -I$(VM_HOME)vmcore/include \
  -I$(VM_HOME)vmcore/src/util/linux/include \
  -I$(VM_HOME)jitrino/src/dynopt \
  -I$(VM_HOME)jitrino/src/main \
  -I$(VM_HOME)jitrino/src/shared \
  -I$(VM_HOME)jitrino/src/optimizer \
  -I$(VM_HOME)jitrino/src/optimizer/ssa \
  -I$(VM_HOME)jitrino/src/optimizer/abcd \
  -I$(VM_HOME)jitrino/src/translator \
  -I$(VM_HOME)jitrino/src/translator/java \
  -I$(VM_HOME)jitrino/src/vm \
  -I$(VM_HOME)jitrino/src/codegenerator \
  -I$(VM_HOME)jitrino/src/codegenerator/ia32 \
  -I$(VM_HOME)jitrino/src/codegenerator/jet \
  -I$(DRLVM_HOME)build/deploy/include \
  
  
JITRINO_DEBUG_DEFINES = -DJIT_LOGS -DJIT_STATS

JITRINO_DEFINES = -DPROJECT_JITRINO #-D_MBCS -D_REENTRANT -D_HAS_ITERATOR_DEBUGGING=0 -D_SECURE_SCL=0

ifeq ($(DEBUG_BUILD),1)
JITRINO_DEFINES += $(JITRINO_DEBUG_DEFINES)
endif
 
CXXFLAGS += $(JITRINO_DEFINES) -fmessage-length=0 -Wall -Wno-uninitialized -fno-exceptions -fPIC 

OBJECTS = dynopt/EdgeProfiler.o dynopt/StaticProfiler.o dynopt/ValueProfiler.o \
  main/CompilationContext.o main/JITInstanceContext.o main/Jitrino.o \
  main/Log.o main/PMF.o \
  shared/Algorithms.o shared/Arena.o shared/BitSet.o \
  shared/ControlFlowGraph.o shared/CountWriters.o shared/Dominator.o \
  shared/FixFileName.o shared/Interval.o shared/LoopTree.o \
  shared/MemoryAttribute.o shared/MemoryManager.o shared/PrintDotFile.o \
  shared/Type.o shared/VMMagic.o shared/XTimer.o shared/methodtable.o \
  shared/mkernel.o \
  optimizer/CSEHash.o optimizer/CodeGenerator.o optimizer/CodeSelectors.o \
  optimizer/FastArrayFilling.o optimizer/FlowGraph.o optimizer/HLOAPIMagics.o \
  optimizer/IRBuilder.o optimizer/Inst.o optimizer/Loop.o \
  optimizer/LoopUtils.o optimizer/Opcode.o optimizer/Opnd.o \
  optimizer/aliasanalyzer.o optimizer/codelowerer.o optimizer/constantfolder.o \
  optimizer/dabce.o optimizer/deadcodeeliminator.o optimizer/devirtualizer.o \
  optimizer/escanalyzer.o optimizer/escapeanalyzer.o \
  optimizer/gcmanagedpointeranalyzer.o optimizer/globalcodemotion.o \
  optimizer/globalopndanalyzer.o optimizer/hashvaluenumberer.o \
  optimizer/helper_inliner.o optimizer/inliner.o optimizer/lazyexceptionopt.o \
  optimizer/loop_unroll.o optimizer/memoryopt.o optimizer/multiplybyconstant.o \
  optimizer/optimizer.o optimizer/optpass.o optimizer/osr.o \
  optimizer/pidgenerator.o optimizer/reassociate.o optimizer/simplifier.o \
  optimizer/simplifytaus.o optimizer/syncopt.o optimizer/tailduplicator.o \
  optimizer/throwopt.o optimizer/walkers.o \
  optimizer/ssa/SSA.o \
  optimizer/abcd/abcdbounds.o optimizer/abcd/classic_abcd.o \
  optimizer/abcd/classic_abcd_solver.o optimizer/abcd/insertpi.o \
  translator/TranslatorIntfc.o \
  translator/java/JavaByteCodeParser.o translator/java/JavaByteCodeTranslator.o \
  translator/java/JavaFlowGraphBuilder.o translator/java/JavaLabelPrepass.o \
  translator/java/JavaTranslator.o \
  vm/EMInterface.o vm/JITInterface.o vm/VMInterface.o \
  codegenerator/RuntimeInterface.o \
  codegenerator/ia32/Ia32APIMagics.o codegenerator/ia32/Ia32BBPolling.o \
  codegenerator/ia32/Ia32BranchTrans.o codegenerator/ia32/Ia32CFG.o \
  codegenerator/ia32/Ia32CallingConvention.o codegenerator/ia32/Ia32CgUtils.o \
  codegenerator/ia32/Ia32CodeEmitter.o codegenerator/ia32/Ia32CodeGenerator.o \
  codegenerator/ia32/Ia32CodeLayout.o \
  codegenerator/ia32/Ia32CodeLayoutBottomUp.o \
  codegenerator/ia32/Ia32CodeLayoutTopDown.o \
  codegenerator/ia32/Ia32CodeSelector.o \
  codegenerator/ia32/Ia32ComplexAddrFormLoader.o \
  codegenerator/ia32/Ia32Constraint.o \
  codegenerator/ia32/Ia32ConstraintsResolver.o \
  codegenerator/ia32/Ia32CopyExpansion.o codegenerator/ia32/Ia32DCE.o \
  codegenerator/ia32/Ia32EarlyPropagation.o codegenerator/ia32/Ia32Encoder.o \
  codegenerator/ia32/Ia32FastArrayFilling.o codegenerator/ia32/Ia32GCMap.o \
  codegenerator/ia32/Ia32GCSafePoints.o \
  codegenerator/ia32/Ia32GlobalPropagation.o \
  codegenerator/ia32/Ia32I8Lowerer.o codegenerator/ia32/Ia32IRConstants.o \
  codegenerator/ia32/Ia32IRManager.o codegenerator/ia32/Ia32Inst.o \
  codegenerator/ia32/Ia32InstCodeSelector.o \
  codegenerator/ia32/Ia32InternalProfiler.o \
  codegenerator/ia32/Ia32InternalTrace.o codegenerator/ia32/Ia32LightJNI.o \
  codegenerator/ia32/Ia32PeepHole.o codegenerator/ia32/Ia32Printer.o \
  codegenerator/ia32/Ia32ProfileUtils.o codegenerator/ia32/Ia32RCE.o \
  codegenerator/ia32/Ia32RegAlloc0.o codegenerator/ia32/Ia32RegAlloc2.o \
  codegenerator/ia32/Ia32RegAlloc3.o codegenerator/ia32/Ia32RegAllocCheck.o \
  codegenerator/ia32/Ia32RuntimeInterface.o codegenerator/ia32/Ia32SpillGen.o \
  codegenerator/ia32/Ia32StackInfo.o codegenerator/ia32/Ia32StackLayout.o \
  codegenerator/ia32/Ia32Tls.o codegenerator/ia32/Ia32WebMaker.o \
  codegenerator/ia32/Ia32i586InstsExpansion.o \
  jet/arith_rt.o jet/bcproc.o jet/cg.o jet/cg_arith.o \
  jet/cg_br.o jet/cg_dbg.o jet/cg_fld_arr.o jet/cg_ia32.o jet/cg_instr.o \
  jet/cg_meth.o jet/cg_obj.o jet/cg_regs.o jet/cg_stk.o jet/compiler.o \
  jet/csig.o jet/enc.o jet/enc_ia32.o jet/jdefs.o jet/jet.o jet/jframe.o \
  jet/magics.o jet/mib.o jet/rt.o jet/rt_ia32.o jet/sconsts.o jet/stats.o \
  jet/trace.o \
  
all: $(OBJECTS)
	$(SLD) -Wl,--version-script=$(SOURCE_DIR)../build/jitrino.exp $(SLDFLAGS) -o libjitrino.so \
	$(OBJECTS)
	cp  libjitrino.so $(DRLVM_HOME)$(ENV)build/deploy/jdk/jre/bin/default
	cp $(VM_HOME)jitrino/config/$(PROC_FAMILY)/client.emconf  $(VM_HOME)jitrino/config/$(PROC_FAMILY)/opt.emconf  \
	$(VM_HOME)jitrino/config/$(PROC_FAMILY)/server_aggressive.emconf  $(VM_HOME)jitrino/config/$(PROC_FAMILY)/ti.emconf \
	$(VM_HOME)jitrino/config/$(PROC_FAMILY)/jet.emconf $(VM_HOME)jitrino/config/$(PROC_FAMILY)/server.emconf \
	$(VM_HOME)jitrino/config/$(PROC_FAMILY)/server_static.emconf $(DRLVM_HOME)$(ENV)build/deploy/jdk/jre/bin/default
	
clean: 
	rm -f libjitrino.so $(OBJECTS)









