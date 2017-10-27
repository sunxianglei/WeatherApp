package com.xianglei.weatherapp.domain.Forecast

import com.xianglei.weatherapp.data.Forecast
import com.xianglei.weatherapp.data.ForecastResult
import java.text.DateFormat
import java.util.*
import com.xianglei.weatherapp.domain.Forecast.Forecast as ModelForecast

/**
 * Created by sheng on 2017/10/27.
 */
class ForecastDataMapper{

    fun convertFromDataModel(forecastResult: ForecastResult): ForecastList{
        return ForecastList(forecastResult.city.name, forecastResult.city.country,
                convertForecastToDomain(forecastResult.list))
    }

    private fun convertForecastToDomain(list: List<Forecast>): List<ModelForecast>{
        return list.map { convertForecastItemToDomain(it) }
    }

    private fun convertForecastItemToDomain(forecast: Forecast): ModelForecast{
        return ModelForecast(convertDate(forecast.dt), forecast.weather[0].description, forecast.temp.max.toInt(), forecast.temp.min.toInt())
    }

    private fun convertDate(date: Long): String{
        val df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.getDefault())
        return df.format(date * 1000)
    }
}