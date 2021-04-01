package com.example.sikdangbook_rest.Table

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.widget.TextView
import com.example.sikdangbook_rest.R

class TableStateNotBookedDialog(context: Context): Dialog(context) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tablestatenotbooked_dialog)

        var xtv: TextView = findViewById(R.id.XTV)
        xtv.setOnClickListener {
            this.dismiss()
        }

    }

}