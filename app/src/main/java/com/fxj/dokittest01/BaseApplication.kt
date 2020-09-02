package com.fxj.dokittest01

import android.app.Application
import androidx.multidex.MultiDex
import com.didichuxing.doraemonkit.DoraemonKit
import com.didichuxing.doraemonkit.kit.AbstractKit
import com.fxj.dokittest01.outKit.SettingsKit
import java.util.*

class BaseApplication:Application() {
    override fun onCreate() {
        super.onCreate()
        MultiDex.install(this);

        DoraemonKit.setAwaysShowMainIcon(false);/*是否显示入口icon*/

        val outKitMap:LinkedHashMap<String, MutableList<AbstractKit>> = linkedMapOf()
        outKitMap["外部工具"] = mutableListOf<AbstractKit>(SettingsKit())

        //测试环境:a49842eeebeb1989b3f9565eb12c276b
        //线上环境:749a0600b5e48dd77cf8ee680be7b1b7
        val debugProductId:String="a49842eeebeb1989b3f9565eb12c276b"
        val releaseProductId="749a0600b5e48dd77cf8ee680be7b1b7"
        DoraemonKit.install(this,outKitMap,debugProductId);
    }
}