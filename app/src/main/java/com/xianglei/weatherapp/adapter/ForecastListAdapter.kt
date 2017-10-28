package com.xianglei.weatherapp.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import com.xianglei.weatherapp.R
import com.xianglei.weatherapp.`interface`.OnItemClickListener
import com.xianglei.weatherapp.domain.Forecast.Forecast
import com.xianglei.weatherapp.domain.Forecast.ForecastList
import com.xianglei.weatherapp.extensions.ctx
import kotlinx.android.synthetic.main.item_forecast.view.*
import org.jetbrains.anko.find

/**
 * Created by sheng on 2017/10/26.
 */
class ForecastListAdapter(val weekForecast : ForecastList, val itemClickListener: OnItemClickListener<Forecast>)
    : RecyclerView.Adapter<ForecastListAdapter.ViewHolder>(){
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(weekForecast.daily[position]){
        }
    }

    override fun getItemCount(): Int {
        return weekForecast.daily.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.ctx).inflate(R.layout.item_forecast, parent, false)
        return ViewHolder(view, itemClickListener)
    }

    class ViewHolder(val view:View, val itemClickListener: OnItemClickListener<Forecast>) : RecyclerView.ViewHolder(view){

        private val iconIv: ImageView
        private val dateTv: TextView
        private val descriptionTv: TextView
        private val maxTemperatureTv: TextView
        private val minTemperatureTv: TextView

        init{
            iconIv = view.find(R.id.iv_icon)
            dateTv = view.find(R.id.tv_date)
            descriptionTv = view.find(R.id.tv_description)
            maxTemperatureTv = view.find(R.id.tv_maxTemperature)
            minTemperatureTv = view.find(R.id.tv_minTemperature)
        }

        fun bindForecast(forecast: Forecast){
            with(forecast){
                Picasso.with(itemView.ctx).load(iconUrl).into(iconIv)
                dateTv.text = date
                descriptionTv.text = description
                maxTemperatureTv.text = "$high"
                minTemperatureTv.text = "$low"
            }
        }
    }

}