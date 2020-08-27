package com.fxj.dokittest01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MemoryLeakTestActivity : AppCompatActivity() {

    val TAG: String =MemoryLeakTestActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG,"onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memory_leak_test)
    }

    override fun onDestroy() {
        Log.d(TAG,"onDestroy")
        super.onDestroy()
        MemoryLeakTestUtil.memoryLeakTest(this@MemoryLeakTestActivity)
    }
}