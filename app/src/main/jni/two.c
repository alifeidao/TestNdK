
#include <string.h>
#include "com_feidao_ndk_jni_Two.h"

JNIEXPORT jstring JNICALL Java_com_feidao_ndk_jni_Two_getStrFromJNI(JNIEnv *env, jobject obj){
    return (*env)->NewStringUTF(env, "you are welcome!");

}
