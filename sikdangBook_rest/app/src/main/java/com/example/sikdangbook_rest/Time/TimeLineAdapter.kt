package com.example.sikdangbook_rest.Time

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sikdangbook_rest.R

class TimeLineAdapter(var context: Context): RecyclerView.Adapter<TimeLineAdapter.Holder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {

        val view = LayoutInflater.from(context).inflate(R.layout.timeline, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind()
    }

    override fun getItemCount(): Int {
        return 2
    }

    inner class Holder(itemView: View):RecyclerView.ViewHolder(itemView){

        public fun bind(){

        }

    }


}