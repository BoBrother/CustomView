package com.example.shiping.view

import com.example.shiping.Bean.beans
import retrofit2.http.GET
import rx.Observable

/**
 * Created by 小社会 on 2017/12/15,0015.
 */
interface HomeGet {
    //http://api.svipmovie.com/front/homePageApi/homePage.do
    @GET("front/homePageApi/homePage.do")
    fun getdata() : Observable<beans>

}