package com.example.kotlinrecyclerview.modle

import android.location.Location
import com.example.kotlinrecyclerview.view.RetrofitUnitl
import com.example.kotlinrecyclerview.view.ViewObj
import io.reactivex.internal.util.HalfSerializer.onNext
import okhttp3.OkHttpClient
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers


/**
 * Created by 小社会 on 2017/12/14,0014.
 */
class Modles {

    fun getdata(modle: Modle) {

       var ok = OkHttpClient.Builder()
       RetrofitUnitl.getInstance("http://www.babybuy100.com", ok.build())
               .setCreate<ViewObj>(ViewObj::class.java)
               .getdata()
               .observeOn(AndroidSchedulers.mainThread())
               .subscribeOn(Schedulers.io())
               .subscribe {
                  next ->
                  modle.Succers(next!!)
                }


    }

}
