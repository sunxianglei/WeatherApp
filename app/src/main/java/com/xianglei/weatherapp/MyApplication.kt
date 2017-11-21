package com.xianglei.weatherapp

import android.app.Application
import com.xianglei.weatherapp.extensions.DelegatesExtensions

/**
 * Created by Administrator on 2017/11/19.
 */
class MyApplication : Application() {
    companion object {
        var instance: MyApplication by DelegatesExtensions.notNullSingValueVar()
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}