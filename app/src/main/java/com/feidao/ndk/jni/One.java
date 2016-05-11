package com.feidao.ndk.jni;

/**
 * Created by feidao on 2016/5/10.
 */
public class One {
    static{
         System.loadLibrary("one");

    }

    public static native String getStrFromJNI();
}