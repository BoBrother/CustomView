package com.example.shiping.Homeapdata

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.shiping.Bean.Item6
import com.example.shiping.Bean.beans
import com.example.shiping.R

/**
 * Created by 小社会 on 2017/12/15,0015.
 */
class apdata (context1: Context): RecyclerView.Adapter<apdata.ViewHolder>() {

    lateinit var  context:  Context
    var  list:ArrayList<Item6> = ArrayList()

    fun addData(bs: beans){
        list.addAll(bs.ret.list)
        notifyDataSetChanged()

    }
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        var view =LayoutInflater.from(context).inflate(R.layout.apdata_layout,parent,false)
        return  ViewHolder(view)

    }
    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {

        holder!!.tv_home.setText(list.get(position).title)
        /*val uri = Uri.parse(list.get(position).childList.get(0).pic)
        val controller = Fresco.newDraweeControllerBuilder()
                .setUri(uri)
                .setAutoPlayAnimations(true)
                .build()
       // holder!!.setController(controller)
        holder.iv_home.setCon*/
        Glide.with(context).load(list.get(position).childList.get(0).pic).into(holder!!.iv_home)


    }


    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

        return  list.size
    }

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view)

    {

        lateinit var iv_home: ImageView
        lateinit var tv_home:TextView

        init {
            iv_home = view.findViewById(R.id.iv_home)
            tv_home = view.findViewById(R.id.tv_home)
        }

    }


}