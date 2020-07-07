package com.dididi.uiextlib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dididi.uiextlib.ext.log
import com.dididi.uiextlib.ext.showLoading

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        log("onCreate")
        showLoading()
    }
}
