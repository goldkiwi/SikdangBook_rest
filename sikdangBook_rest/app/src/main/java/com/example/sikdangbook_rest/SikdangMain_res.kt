package com.example.sikdangbook_rest

import android.content.pm.ActivityInfo
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.sikdangbook_rest.Table.TableFloorVPAdapter
import com.example.sikdangbook_rest.Time.TimeSelectDialog
import java.text.SimpleDateFormat
import java.util.*

class SikdangMain_res:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        setContentView(R.layout.sikdangmain_res)
        val time = System.currentTimeMillis()
        val dateFormat = SimpleDateFormat("kk:mm")
        val curTime = dateFormat.format(Date(time))
        Log.d("확인 시간 정상 확인", curTime.toString())
        val myToast = Toast.makeText(this, curTime.toString(), Toast.LENGTH_SHORT).show()


        //각 층 들어가는 뷰페이저
        var tableFloorVP:ViewPager2 = findViewById(R.id.tableFloorVP)
        var vpAdapter = TableFloorVPAdapter(this)
        tableFloorVP.adapter = vpAdapter

        var timeselectBtn: Button = findViewById(R.id.timeselectBtn)
        timeselectBtn.setOnClickListener {
            var customDialog = TimeSelectDialog(this)
            customDialog!!.show()
        }



    }



}