package com.xianglei.weatherapp.domain.command

/**
 * 执行请求接口
 * Created by sheng on 2017/10/27.
 */
interface Command<T>{
    fun execute(): T
}