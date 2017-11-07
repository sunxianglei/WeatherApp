package com.xianglei.weatherapp.extensions

import android.content.Context
import android.widget.Toast

/**
 * Created by sheng on 2017/10/30.
 */

private var toast: Toast? = null

fun Context.toastOnce(text: CharSequence){
    if(null == toast){
        toast = Toast.makeText(this, text, Toast.LENGTH_SHORT)
    }else{
        toast?.setText(text)
    }
    toast?.show()
}