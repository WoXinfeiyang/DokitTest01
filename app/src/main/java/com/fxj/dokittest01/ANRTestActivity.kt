package com.fxj.dokittest01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock

class ANRTestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anr_test)
        SystemClock.sleep(20*1000)
    }
}