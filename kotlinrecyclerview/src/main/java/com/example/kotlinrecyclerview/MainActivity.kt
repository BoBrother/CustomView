package com.example.kotlinrecyclerview
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.kotlinrecyclerview.Presenter.presenter
import com.example.kotlinrecyclerview.apdata.KolintApdata
import com.example.kotlinrecyclerview.bean.beans
import com.example.kotlinrecyclerview.view.ViewIn

class MainActivity : AppCompatActivity(),ViewIn {

    lateinit var  kn : KolintApdata //适配器
     private  var rv_main : RecyclerView? = null; //RecyclerView
     lateinit var    pt : presenter  //p层
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rv_main = findViewById(R.id.rv_main);
        pt = presenter(this)
        pt.xinyuayn()
    }
    override fun Succers(bn: beans) {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

        val manager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        kn =  KolintApdata(this)
        rv_main!!.setLayoutManager(manager);
        rv_main!!.setAdapter(kn)
        kn.addData(bn)
    }


    override fun Filde(e: Exception) {

    }

    //内存泄漏
     override fun onDestroy() {
        super.onDestroy()
        //解绑
        pt.data()
    }
}


