package com.xianglei.weatherapp.request

import com.google.gson.Gson
import com.xianglei.weatherapp.data.ForecastResult
import java.net.URL

/**
 * 天气请求类
 * Created by sheng on 2017/10/26.
 */
class ForecastRequest(val cityname : String, val dtype : String = "", val format : Int = 1){
    companion object {
        private val APP_ID = "20029b4a09af765bb4830524d7161c3c"
        private val URL_1 = "http://v.juhe.cn/weather/index"
    }

    fun execute() : ForecastResult{
        val url = "$URL_1?cityname=$cityname&dtype=$dtype&format=$format&key=$APP_ID"
        val forecastJsonStr = URL(url).readText()
        return Gson().fromJson(forecastJsonStr, ForecastResult::class.java)
    }
}