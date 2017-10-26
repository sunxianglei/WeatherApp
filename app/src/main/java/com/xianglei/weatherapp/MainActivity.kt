package com.xianglei.weatherapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.xianglei.weatherapp.adapter.ForecastListAdapter
import kotlinx.android.synthetic.main.activity_main.*

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
        rlv_forecast.adapter = ForecastListAdapter(items)
    }
}
