package com.fxj.dokittest01.outKit

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.util.Log
import com.didichuxing.doraemonkit.kit.AbstractKit
import com.didichuxing.doraemonkit.kit.Category
import com.fxj.dokittest01.R
import com.fxj.dokittest01.SettingsActivity

class SettingsKit:AbstractKit() {

    companion object{
        val TAG:String=SettingsKit::class.toString()
    }
    override val category: Int
        get() = Category.BIZ

    override val name: Int
        get() = R.string.settings_activity_name

    override val icon: Int
        get() = R.mipmap.dk_sys_info

    override fun onClick(context: Context?) {
        Log.d(TAG,"##onClick##context=${context}")
        var intent: Intent =Intent()
        intent.setClass(context,SettingsActivity::class.java)
        if(context !is Activity){
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        }
        context?.startActivity(intent)
    }

    override fun onAppInit(context: Context?) {
        Log.d(TAG,"##onAppInit##context=${context}")
    }

}