package com.feidao.ndk.jni;

/**
 * Created by feidao on 2016/5/10.
 */
public class Three {
    static{
        System.loadLibrary("three");
    }

    public static native String add(double a, double b);
}
