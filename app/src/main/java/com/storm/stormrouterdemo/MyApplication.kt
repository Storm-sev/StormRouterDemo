package com.storm.stormrouterdemo

import android.app.Application
import android.content.Context
import android.content.pm.ApplicationInfo
import com.alibaba.android.arouter.launcher.ARouter

class MyApplication : Application() {

    companion object{
        lateinit var appContext: Context;

        //判断当前应用是否是debug状态
        fun isApkInDebug(): Boolean {
            return try {
                val info: ApplicationInfo = appContext.getApplicationInfo()
                info.flags and ApplicationInfo.FLAG_DEBUGGABLE != 0
            } catch (e: Exception) {
                false
            }
        }

    }


    override fun onCreate() {
        super.onCreate()
        appContext = this

        initARouter();
    }

    private fun initARouter() {
        if (isApkInDebug()){
            ARouter.openLog();
            ARouter.openDebug();
        }
        ARouter.init(this)
    }


    override fun onTerminate() {
        super.onTerminate()
        // 写在ondestory 会报错
        ARouter.getInstance().destroy();
    }



}