package com.example.someapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static {
        Log.e("jni", "starting");
        System.loadLibrary("new_code");
        Log.e("jni", "finished");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tvv = findViewById(R.id.tv);
        tvv.setOnClickListener(view -> tvv.setText(NewMethod()));
    }

    public native String NewMethod();

}