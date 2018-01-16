package com.example.kotlinrecyclerview.MyApp
import android.app.Application
import com.facebook.drawee.backends.pipeline.Fresco
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by 小社会 on 2017/12/14,0014.
 */
class App : Application() {
    override fun onCreate() {
        super.onCreate()
        Fresco.initialize(this)
    }
}