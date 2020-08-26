package com.fxj.dokittest01

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.didichuxing.doraemonkit.DoraemonKit

class MainActivity : Activity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.btn_main_btn01).setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_main_btn01->{
                DoraemonKit.showToolPanel()
            }
        }
    }


}