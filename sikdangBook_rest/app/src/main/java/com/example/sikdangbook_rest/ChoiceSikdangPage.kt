package com.example.sikdangbook_rest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sikdangbook_rest.R

class ChoiceSikdangPage:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.choice_sikdang_page)
        var mySikdangRV:RecyclerView = findViewById(R.id.mySikdangRV)
        var choiceMySikdangRVAdapter = ChoiceMySikdangRVAdapter(this)
        mySikdangRV.adapter = choiceMySikdangRVAdapter

        var RVLayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        mySikdangRV.layoutManager=RVLayoutManager
        mySikdangRV.setHasFixedSize(true)

    }
}