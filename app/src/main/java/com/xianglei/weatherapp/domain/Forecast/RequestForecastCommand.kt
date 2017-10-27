package com.xianglei.weatherapp.domain.Forecast

import com.xianglei.weatherapp.domain.Command

/**
 * Created by sheng on 2017/10/27.
 */
class RequestForecastCommand(val zipCode: String): Command<ForecastList>{

    override fun execute(): ForecastList {
        val forecastRequest = ForecastRequest(zipCode)
        return ForecastDataMapper().convertFromDataModel(forecastRequest.execute())
    }

}