package com.example.sikdangbook_rest.Time

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sikdangbook_rest.R

class TimeSelectDialog(context: Context): Dialog(context)  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.timeselect_dialog)



        var timeRV : RecyclerView = findViewById(R.id.timeRV)
        var timeRVAdapter = TimeLineAdapter(context)
        timeRV.adapter = timeRVAdapter



        var timeLM = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        timeRV.layoutManager=timeLM
        timeRV.setHasFixedSize(true)
    }



}