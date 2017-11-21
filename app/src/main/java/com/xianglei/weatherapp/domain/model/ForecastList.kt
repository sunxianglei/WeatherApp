package com.xianglei.weatherapp.domain.model

/**
 * 天气数据解析类（解析服务端的数据，封装成自己需要的数据类）
 * Created by sheng on 2017/10/27.
 */
data class ForecastList(val city: String, val country: String, val daily: List<Forecast>)
data class Forecast(val date: String, val description: String, val high: Int, val low: Int, val iconUrl: String)
