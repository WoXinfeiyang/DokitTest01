package com.fxj.dokittest01

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.Button

class FpsTestActivity: Activity(), View.OnClickListener {
    var btn01:Button?=null
    var btn02:Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_fps_test_activity)
        btn01=findViewById(R.id.fps_test_btn01)
        btn02=findViewById(R.id.fps_test_btn02)

        btn01?.setOnClickListener(this)
        btn02?.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val id=v?.id
        if(id==R.id.fps_test_btn01){
            Thread.sleep(2500)
            btn02?.visibility=View.VISIBLE
            btn01?.visibility=View.GONE
        }else if(id==R.id.fps_test_btn02){
            Thread.sleep(2500)
            btn01?.visibility=View.VISIBLE
            btn02?.visibility=View.GONE
        }
    }
}