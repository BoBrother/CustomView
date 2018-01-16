package com.example.kotlinrecyclerview.Presenter
import com.example.kotlinrecyclerview.MainActivity
import com.example.kotlinrecyclerview.bean.beans
import com.example.kotlinrecyclerview.modle.Modle
import com.example.kotlinrecyclerview.modle.Modles
import com.example.kotlinrecyclerview.view.ViewIn
import java.lang.ref.WeakReference
/**
 * Created by 小社会 on 2017/12/14,0014.
 */
class presenter  {
    //类怎嫩特  最近的
     lateinit var  wr :WeakReference<ViewIn>
    //阴特no  内部的
     internal lateinit var md :Modles
    //坑死chua可特 构造器
    constructor(wr: ViewIn) {
        datach(wr as MainActivity)
        this.md = Modles()
    }


    fun xinyuayn(){
        md.getdata(object :Modle{
            //噢博瑞特
            override fun Filde(e: Exception) {
                wr.get()!!.Filde(e)
            }

            override fun Succers(bn: beans) {
               wr.get()!!.Succers(bn)
            }

        })
    }

    // 绑定 内存泄漏
    fun datach(view: MainActivity) {
        wr = WeakReference(view)
    }

    //解绑
    fun data() {
        wr.clear()
    }

}