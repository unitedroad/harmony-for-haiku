CC=gcc
AS=$(CC)
CXX=$(CC)
CPP=$(CXX)
MAKE=make
ASFLAGS=-Wa,--fatal-warnings -c -x assembler-with-cpp -g

DEFINES =-DHAIKU -DPLATFORM_POSIX -D_LARGEFILE64_SOURCE -D_REENTRANT

WARNINGS = -w1 

OPT_FLAGS = -O2 -O0
 
COMMON_INCLUDES =   -I$(VM_HOME)include \
   -I$(VM_HOME)port/include \

DEBUG_FLAGS = -g -ggdb3

#FLAGS = -fPIC -fno-exceptions
FLAGS = -fno-exceptions

CXX_WARNINGS = -Wno-deprecated 

CXX_MISCFLAGS = -x c++

CFLAGS = $(DEFINES) $(INCLUDES) $(OPT_FLAGS) $(DEBUG_FLAGS) $(FLAGS)

CXXFLAGS = $(CFLAGS) $(CXX_WARNINGS) $(CXX_MISCFLAGS)

