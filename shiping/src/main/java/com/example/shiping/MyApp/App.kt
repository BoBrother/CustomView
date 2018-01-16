package com.example.shiping.MyApp

import android.app.Application
import com.facebook.drawee.backends.pipeline.Fresco

/**
 * Created by 小社会 on 2017/12/15,0015.
 */
class App : Application() {

    override fun onCreate() {
        super.onCreate()
        Fresco.initialize(this)
    }

}