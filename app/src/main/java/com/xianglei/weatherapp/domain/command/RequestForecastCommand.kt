package com.xianglei.weatherapp.domain.command

import com.xianglei.weatherapp.domain.model.ForecastList
import com.xianglei.weatherapp.domain.datamapper.ForecastDataMapper
import com.xianglei.weatherapp.domain.request.ForecastRequest

/**
 * Created by sheng on 2017/10/27.
 */
class RequestForecastCommand(val zipCode: String): Command<ForecastList> {

    override fun execute(): ForecastList {
        val forecastRequest = ForecastRequest(zipCode)
        return ForecastDataMapper().convertFromDataModel(forecastRequest.execute())
    }

}