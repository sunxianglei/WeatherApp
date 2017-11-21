package com.xianglei.weatherapp.domain.datamapper

import com.xianglei.weatherapp.data.model.Forecast
import com.xianglei.weatherapp.data.model.ForecastResult
import com.xianglei.weatherapp.domain.model.ForecastList
import java.text.DateFormat
import java.util.*
import com.xianglei.weatherapp.domain.model.Forecast as ModelForecast

/**
 * Created by sheng on 2017/10/27.
 */
class ForecastDataMapper{

    fun convertFromDataModel(forecastResult: ForecastResult): ForecastList {
        return ForecastList(forecastResult.city.name, forecastResult.city.country,
                convertForecastToDomain(forecastResult.list))
    }

    private fun convertForecastToDomain(list: List<Forecast>): List<ModelForecast>{
        return list.map { convertForecastItemToDomain(it) }
    }

    private fun convertForecastItemToDomain(forecast: Forecast): ModelForecast{
        return ModelForecast(convertDate(forecast.dt), forecast.weather[0].description,
                forecast.temp.max.toInt(), forecast.temp.min.toInt(), generateIconUrl(forecast.weather[0].icon))
    }

    private fun generateIconUrl(iconCode: String): String{
        return "http://openweathermap.org/img/w/$iconCode.png"
    }

    private fun convertDate(date: Long): String{
        val df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.getDefault())
        return df.format(date * 1000)
    }
}