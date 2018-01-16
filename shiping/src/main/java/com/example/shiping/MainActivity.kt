package com.example.shiping

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.shiping.Bean.beans
import com.example.shiping.Homeapdata.apdata
import com.example.shiping.presenter.HomePresenter
import com.example.shiping.view.HomeView

class MainActivity : AppCompatActivity(), HomeView{

   lateinit var ap:apdata//适配器
    lateinit var rv: RecyclerView
    lateinit var hp:HomePresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        hp = HomePresenter(this)
        hp.play()
    }

    override fun Succers(bs: beans) {
        val manager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        ap =  apdata(this)
        rv!!.setLayoutManager(manager);
        rv!!.setAdapter(ap)
        ap.addData(bs)
    }

    override fun Flide(e: Exception) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    //内存泄漏
    override fun onDestroy() {
        super.onDestroy()
        //解绑
        hp.data()
    }

}
