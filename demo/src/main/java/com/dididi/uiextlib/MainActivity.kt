package com.dididi.uiextlib

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dididi.uiextlib.ext.logD
import com.dididi.uiextlib.ext.showLoading
import com.dididi.uiextlib.ext.showSnackBar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        logD("onCreate")
        showLoading()
        showSnackBar("hello")
    }
}
