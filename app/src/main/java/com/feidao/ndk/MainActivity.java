package com.feidao.ndk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.feidao.ndk.jni.One;
import com.feidao.ndk.jni.Two;

public class MainActivity extends AppCompatActivity {
    private TextView txt1;
    private TextView txt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1 = (TextView)findViewById(R.id.txt_one);
        txt1.setText(One.getStrFromJNI());
        txt2 = (TextView)findViewById(R.id.txt_two);
        txt2.setText(Two.getStrFromJNI());
    }
}
