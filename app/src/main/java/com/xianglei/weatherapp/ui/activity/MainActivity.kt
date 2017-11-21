package com.xianglei.weatherapp.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.xianglei.weatherapp.R
import com.xianglei.weatherapp.domain.command.RequestForecastCommand
import com.xianglei.weatherapp.extensions.toastOnce
import com.xianglei.weatherapp.ui.adapter.ForecastListAdapter
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.async
import org.jetbrains.anko.uiThread

class MainActivity : AppCompatActivity() {

    private val items = listOf<String>(
            "Mon 6/23 - Sunny - 31/17",
            "Tue 6/24 - Cloudy - 23/16",
            "Mon 6/25 - Rainy - 22/11"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rlv_forecast.layoutManager = LinearLayoutManager(this)
    }

    override fun onResume() {
        super.onResume()
        async{
            val weekForecast = RequestForecastCommand("94043").execute()
            uiThread {
                rlv_forecast.adapter = ForecastListAdapter(weekForecast, { view, position -> toastOnce("position" + position) })
            }
        }
    }
}
