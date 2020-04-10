package com.dididi.uiextlib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dididi.uiextlib.ext.dismissAllLoading
import com.dididi.uiextlib.ext.showLoading
import com.dididi.uiextlib.ext.showPopupMenu

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showLoading()
    }
}
