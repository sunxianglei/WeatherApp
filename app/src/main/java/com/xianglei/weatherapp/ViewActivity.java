package com.xianglei.weatherapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.xianglei.weatherapp.view.PeriodProgress;

/**
 * Created by sheng on 2017/11/16.
 */

public class ViewActivity extends AppCompatActivity {

    private String[] name = {"申购", "配号", "中签缴款", "完成"};
    private String[] time = {"10-16", "10-17", "2017-10-20", "10-21"};
    private Boolean[] isFinish = {true, false ,false, false};

    private PeriodProgress mPeriodProgress;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        mPeriodProgress = findViewById(R.id.progress);
        mPeriodProgress.setData(name, time, isFinish);
    }
}
