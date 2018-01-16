package com.example.kotlinrecyclerview.apdata
import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.kotlinrecyclerview.R
import com.example.kotlinrecyclerview.bean.beans


/**
 * Created by 小社会 on 2017/12/14,0014.
 */
class KolintApdata (context1: Context) : RecyclerView.Adapter<KolintApdata.IViewHodler>() {
   var context :Context=context1
    var list : ArrayList<beans> = ArrayList()

    fun addData(bn : beans) {

        list.addAll(bn.result)

        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): IViewHodler {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.


        var view = LayoutInflater.from(context).inflate(R.layout.rvlayout,parent,false)

        return IViewHodler(view)


    }



    override fun onBindViewHolder(holder: IViewHodler?, position: Int) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        holder!!.item_textview.setText(list.get(position).name)

        Glide.with(context).load(list.get(position).coverImg).into(holder!!.item_imageview)


    }



    override fun getItemCount(): Int {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return list.size
    }


    class IViewHodler(view : View) : RecyclerView.ViewHolder(view) {


         var item_imageview : ImageView
         var item_textview : TextView

        init {
            item_imageview = view.findViewById(R.id.iv)
            item_textview = view.findViewById<TextView>(R.id.tv)
        }

    }

}