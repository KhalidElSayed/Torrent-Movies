LOCAL_PATH := $(call my-dir)

# define vars for library that will be build statically.
include $(CLEAR_VARS)
LOCAL_MODULE    := ndksetup
LOCAL_SRC_FILES := native.c

# Optional compiler flags.
LOCAL_LDLIBS := -llog
include $(BUILD_SHARED_LIBRARY)  
