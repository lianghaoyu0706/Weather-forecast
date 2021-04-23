package com.example.sunnyweatherr

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication:Application() {
    companion object{
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
        const val TOKEN="348aBVrQiX00tCLN"
    }

    override fun onCreate() {
        super.onCreate()
        context=applicationContext
    }
}