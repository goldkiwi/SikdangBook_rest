package com.example.sikdangbook_rest.Table

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

//SikdangMain_res 에서 사용
class TableFloorVPAdapter(fa:FragmentActivity): FragmentStateAdapter(fa) {
    //가계 층수
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        var tableFloorFragment = TableFloorFragment(position)
        return tableFloorFragment
    }


    public fun bind(){
        val time = System.currentTimeMillis()
        //val dateFormat = SimpleDateFormat("yyyy-mm-dd hh:mm:ss")
        //val curTime = dateFormat.format(Date(time))
    }
}