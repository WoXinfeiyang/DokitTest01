package com.fxj.dokittest01

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.didichuxing.doraemonkit.DoraemonKit

class MainActivity : Activity(), View.OnClickListener {
    var mainBtn02:Button?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.btn_main_btn01).setOnClickListener(this)

        mainBtn02=findViewById<Button>(R.id.btn_main_btn02);
        mainBtn02?.setOnClickListener(this)
        if(DoraemonKit.isShow){
            mainBtn02?.setText("隐藏DoKit入口")
        }else{
            mainBtn02?.setText("显示DoKit入口")
        }


    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_main_btn01->{
                DoraemonKit.showToolPanel()
            }
            R.id.btn_main_btn02->{
                if(DoraemonKit.isShow){
                    DoraemonKit.hide()
                }else{
                    DoraemonKit.show()
                }
            }
        }
    }


}