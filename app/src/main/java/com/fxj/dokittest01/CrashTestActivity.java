package com.fxj.dokittest01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class CrashTestActivity extends AppCompatActivity {

    private Integer integer=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crash_test);
        int result =integer.compareTo(Integer.valueOf(1));
        TextView crashText=findViewById(R.id.tv_crash);
        crashText.setText(String.valueOf(result));
    }
}