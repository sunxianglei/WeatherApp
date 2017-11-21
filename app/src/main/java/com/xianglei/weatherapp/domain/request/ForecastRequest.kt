package com.xianglei.weatherapp.domain.request

import com.google.gson.Gson
import com.xianglei.weatherapp.data.model.ForecastResult
import java.net.URL

/**
 * 天气请求类
 * Created by sheng on 2017/10/26.
 */
class ForecastRequest(val zipCode : String){
    companion object {
        private val APP_ID = "b1b15e88fa797225412429c1c50c122a1"
        private val URL = "http://samples.openweathermap.org/data/2.5/forecast/daily?id=524901&appid=b1b15e88fa797225412429c1c50c122a1"
    }

    fun execute() : ForecastResult {
        val forecastJsonStr = URL(URL).readText()
        return Gson().fromJson(forecastJsonStr, ForecastResult::class.java)
    }
}