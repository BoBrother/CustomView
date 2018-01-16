package com.example.kotlinrecyclerview.view


import com.example.kotlinrecyclerview.bean.beans
import retrofit2.http.GET
import rx.Observable

/**
 * Created by 小社会 on 2017/12/14,0014.
 */
interface ViewObj {
    @GET("/API/getShopOverview.ashx")
    fun getdata() : Observable<beans>
    //http://www.babybuy100.com/API/getShopOverview.ashx
}