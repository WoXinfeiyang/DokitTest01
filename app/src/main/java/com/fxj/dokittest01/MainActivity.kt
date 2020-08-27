package com.fxj.dokittest01

import android.app.Activity
import android.content.Intent
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

        findViewById<Button>(R.id.btn_main_btn03).setOnClickListener(this)

        findViewById<Button>(R.id.btn_main_btn04).setOnClickListener(this)

        findViewById<Button>(R.id.btn_main_btn05).setOnClickListener(this)
        findViewById<Button>(R.id.btn_main_btn06).setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_main_btn01->{
                DoraemonKit.showToolPanel()
            }
            R.id.btn_main_btn02->{
                if(DoraemonKit.isShow){
                    DoraemonKit.hide()
                    mainBtn02?.setText("显示DoKit入口")
                }else{
                    DoraemonKit.show()
                    mainBtn02?.setText("隐藏DoKit入口")
                }
            }
            R.id.btn_main_btn03->{
                var intent=Intent()
                intent.setClass(this@MainActivity,FpsTestActivity::class.java)
                startActivity(intent)
            }

            R.id.btn_main_btn04->{
                var intent=Intent()
                intent.setClass(this@MainActivity,ANRTestActivity::class.java)
                startActivity(intent)
            }
            R.id.btn_main_btn05->{
                var intent=Intent()
                intent.setClass(this@MainActivity,CrashTestActivity::class.java)
                startActivity(intent)
            }
            R.id.btn_main_btn06->{
                var intent=Intent()
                intent.setClass(this@MainActivity,MemoryLeakTestActivity::class.java)
                startActivity(intent)
            }
        }
    }


}