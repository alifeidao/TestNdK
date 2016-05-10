package com.feidao.ndk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.feidao.jni.One;

public class MainActivity extends AppCompatActivity {
    private TextView txt1_1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1_1 = (TextView)findViewById(R.id.txt_one_1);
        txt1_1.setText(One.getStrFromJNI());
    }
}
