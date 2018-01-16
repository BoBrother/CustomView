package com.example.shiping.modle

import com.example.shiping.view.HomeGet
import com.example.shiping.view.RetrofitUnitl
import okhttp3.OkHttpClient
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

/**
 * Created by 小社会 on 2017/12/15,0015.
 */
open class HomeModles {
    var done: Boolean = false
    fun getdata(homeModle: HomeModle) {

        var ok = OkHttpClient.Builder()
        RetrofitUnitl.getInstance("http://api.svipmovie.com", ok.build())
                .setCreate<HomeGet>(HomeGet::class.java)
                .getdata()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe {
                    next ->
                    homeModle.Succers(next!!)
                }



    }

    suspend fun onError(t: Throwable) {
        if (!done) {
            consumer.onError(t)
        }
    }


}