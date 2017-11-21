package com.xianglei.weatherapp.ui.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import com.xianglei.weatherapp.R
import com.xianglei.weatherapp.domain.model.Forecast
import com.xianglei.weatherapp.domain.model.ForecastList
import com.xianglei.weatherapp.extensions.ctx
import kotlinx.android.synthetic.main.item_forecast.view.*

/**
 * Created by sheng on 2017/10/26.
 */
class ForecastListAdapter(private val weekForecast : ForecastList, private val itemClick: (View, Int) -> Unit)
    : RecyclerView.Adapter<ForecastListAdapter.ViewHolder>(){
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindForecast(weekForecast.daily[position], position)
    }

    override fun getItemCount(): Int {
        return weekForecast.daily.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.ctx).inflate(R.layout.item_forecast, parent, false)
        return ViewHolder(view, itemClick)
    }

    class ViewHolder(private val view:View, private val itemClick: (View, Int) -> Unit) : RecyclerView.ViewHolder(view){

        fun bindForecast(forecast: Forecast, position: Int){
            with(forecast){
                Picasso.with(view.ctx).load(iconUrl).into(view.iv_icon)
                view.tv_date.text = date
                view.tv_description.text = description
                view.tv_maxTemperature.text = "$high"
                view.tv_minTemperature.text = "$low"
                view.setOnClickListener({ itemClick(view, position) })
            }
        }
    }

}