package com.example.sikdangbook_rest.Table

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import com.example.sikdangbook_rest.R

class TableStateIsBookedDialog(context: Context): Dialog(context) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tablestateisbooked_dialog)
    }
}