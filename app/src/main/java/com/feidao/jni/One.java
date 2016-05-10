package com.feidao.jni;

/**
 * Created by dell on 2016/5/10.
 */
public class One {
    static{
        System.loadLibrary("one_1");
    }

    public native static String getStrFromJNI();
}