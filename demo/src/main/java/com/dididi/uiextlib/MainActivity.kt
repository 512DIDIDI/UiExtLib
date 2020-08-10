package com.dididi.uiextlib

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dididi.uiextlib.ext.dismissAllLoading
import com.dididi.uiextlib.ext.showLoading
import com.dididi.uiextlib.ext.showSnackBar
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        activityMainShowDialog.setOnClickListener {
            showLoading()
        }
        activityMainCloseDialog.setOnClickListener {
            dismissAllLoading()
        }
        activityMainShowSnackBar.setOnClickListener {
            showSnackBar("hello")
        }
        activityMainBrushView.setOnClickListener {
            startActivity(Intent(this,BrushActivity::class.java))
        }

    }
}
