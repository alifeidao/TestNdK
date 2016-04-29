
#include <string.h>
#include <jni.h>


jstring
Java_com_feidao_jni_One_11_getStrFromJNI( JNIEnv* env,
                                                  jobject thiz )
{
    return (*env)->NewStringUTF(env, "hello world!");
}
