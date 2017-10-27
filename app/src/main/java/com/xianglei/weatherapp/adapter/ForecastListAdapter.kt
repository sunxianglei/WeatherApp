package com.xianglei.weatherapp.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView
import com.xianglei.weatherapp.domain.Forecast.ForecastList

/**
 * Created by sheng on 2017/10/26.
 */
class ForecastListAdapter(val weekForecast : ForecastList) : RecyclerView.Adapter<ForecastListAdapter.ViewHolder>(){
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(weekForecast.daily[position]){
            holder.textView.text = "$date - $description - $high/$low"
        }
    }

    override fun getItemCount(): Int {
        return weekForecast.daily.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(TextView(parent.context))
    }

    class ViewHolder(val textView:TextView) : RecyclerView.ViewHolder(textView)
}