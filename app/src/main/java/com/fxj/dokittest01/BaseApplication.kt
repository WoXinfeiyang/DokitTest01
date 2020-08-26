package com.fxj.dokittest01

import android.app.Application
import androidx.multidex.MultiDex
import com.didichuxing.doraemonkit.DoraemonKit

class BaseApplication:Application() {
    override fun onCreate() {
        super.onCreate()
        MultiDex.install(this);
        //测试环境:a49842eeebeb1989b3f9565eb12c276b
        //线上环境:749a0600b5e48dd77cf8ee680be7b1b7
        val debugProductId="a49842eeebeb1989b3f9565eb12c276b"
        val releaseProductId="749a0600b5e48dd77cf8ee680be7b1b7"
        DoraemonKit.install(this,debugProductId);
    }
}