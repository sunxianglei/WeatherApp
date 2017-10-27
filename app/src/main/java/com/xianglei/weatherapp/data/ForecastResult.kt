package com.xianglei.weatherapp.data

/**
 * 天气数据类（服务端返回数据）
 * Created by sheng on 2017/10/26.
 */
data class ForecastResult(val city: City, val list: List<Forecast>)
data class City(val geoname_id: Long, val name: String, val country: String)
data class Forecast(val dt: Long, val temp: Temperature, val weather: List<Weather>)
data class Temperature(val day: Float, val min: Float, val max: Float)
data class Weather(val id: Int, val description: String)
