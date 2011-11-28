OS = HAIKU
DEBUG_BUILD = 1# probably we should remove it from make and let configure do its work
ifeq ($(DEBUG_BUILD),1)
CFG_IS_DEBUG = true# cfg.is.debug is true (not 1) in build-native.xml
endif
ENV = 
CC=gcc
AS=$(CC)
CXX=$(CC)
CPP=$(CXX)
SLD = $(CC) #Shared Library linker
AR = ar
ARFLAGS_DEF = rvs
ARFLAGS = $(ARFLAGS_DEF)
MAKE=make
ASFLAGS=-Wa,--fatal-warnings -c -x assembler-with-cpp -g
SLDFLAGS = -shared #implied args added by ant-contrib while creating library
#ifeq($(DEBUG_BUILD),1)
SLDFLAGS += -g
#endif

SLDSYSLIBS = -Wl,-Bdynamic -lstdc++ #-lm -ldl -lrt -lpthread 
SLDEXTRAFLAGS =# -Wl,-Bdynamic We will replace this variable with another one

DEFINES =-DHAIKU -DPLATFORM_POSIX -D_LARGEFILE64_SOURCE -D_REENTRANT -D__SMP__ -D_IA32_

PROC_FAMILY = ia32
#defaults in ant build process, can be changed/removed
#ifeq($(DEBUG_BUILD),1)
DEFINES += -D_DEBUG
#endif

WARNINGS = -w1 

OPT_FLAGS = -O2 -O0
 
COMMON_INCLUDES =   -I$(VM_HOME)include \
   -I$(VM_HOME)port/include \

DEBUG_FLAGS = -g -ggdb3

#FLAGS = -fPIC -fno-exceptions
FLAGS = -fno-exceptions# -mno-tls-direct-seg-refs

CXX_WARNINGS = -Wno-deprecated 

CXX_MISCFLAGS = -x c++

CFLAGS = $(DEFINES) $(INCLUDES) $(OPT_FLAGS) $(DEBUG_FLAGS) $(FLAGS)

CXXFLAGS = $(CFLAGS) $(CXX_WARNINGS) $(CXX_MISCFLAGS)

