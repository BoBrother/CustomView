package com.example.shiping.presenter

import com.example.shiping.Bean.beans
import com.example.shiping.modle.HomeModle
import com.example.shiping.modle.HomeModles
import com.example.shiping.view.HomeView
import java.lang.ref.WeakReference

/**
 * Created by 小社会 on 2017/12/15,0015.
 */
class HomePresenter {
    lateinit var homeview:WeakReference<HomeView>
    internal lateinit var hmd :HomeModles //modle层

    constructor(homeview: HomeView) {
        datach(homeview)
        this.hmd = HomeModles()
    }
    fun play(){
        hmd.getdata(object :HomeModle{
            override fun Succers(bs: beans) {
                if (homeview!=null){

                    homeview.get()!!.Succers(bs)
                }
            }

            override fun Flide(e: Exception) {
                  if(homeview!=null){
                      homeview.get()!!.Flide(e)

                  }
            }

        })


    }
    // 绑定 内存泄漏
    fun datach(view: HomeView) {
        homeview = WeakReference(view)
    }

    //解绑
    fun data() {
        homeview.clear()
    }

}