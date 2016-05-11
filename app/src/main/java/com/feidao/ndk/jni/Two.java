package com.feidao.ndk.jni;

/**
 * Created by feidao on 2016/5/10.
 */
public class Two {
    static{
        System.loadLibrary("two");
    }

    public static native String getStrFromJNI();
}
