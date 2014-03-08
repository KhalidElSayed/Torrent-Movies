#include <jni.h>
#include <string.h>
#include <android/log.h>
#include <math.h>

#define DEBUG_TAG "NDKSetupActivity"

void Java_com_jayway_ndksetup_NDKSetupActivity_printLog(JNIEnv * env, jobject this, jstring logString){
    jboolean isCopy;
    const char * szLogString = (*env)->GetStringUTFChars(env, logString, &isCopy);

    __android_log_print(ANDROID_LOG_DEBUG, DEBUG_TAG, "NDK: %s", szLogString);

    (*env)->ReleaseStringUTFChars(env, logString, szLogString);
}

jint Java_com_jayway_ndksetup_NDKSetupActivity_fibonacci(JNIEnv * env, jobject this, jint value){
	if (value <= 1) return value;
	return Java_com_jayway_ndksetup_NDKSetupActivity_fibonacci(env, this, value-1)
            + Java_com_jayway_ndksetup_NDKSetupActivity_fibonacci(env, this, value-2);
}