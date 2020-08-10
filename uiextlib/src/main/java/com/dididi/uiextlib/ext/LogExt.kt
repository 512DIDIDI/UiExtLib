package com.dididi.uiextlib.ext

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.dididi.uiextlib.BuildConfig
import com.dididi.uiextlib.ext.LogExt.DEBUG


/**
 * @author dididi(yechao)
 * @since 09/10/2019
 * @describe 日志工具类
 */

object LogExt {
    /**
     * 在application里初始化 可以使用自己项目的[BuildConfig.DEBUG]
     */
    var DEBUG = true
}

//最长日志行数
private const val LOG_MAX_LENGTH = 2000

fun Context.toast(value: String?) {
    Toast.makeText(this, value, Toast.LENGTH_SHORT).show()
}

fun Fragment.toast(value: CharSequence?) = this.activity!!.toast(value.toString())

fun Any.logV(content: String, tag: String = this.javaClass.simpleName) {
    log(content) { start, end ->
        Log.v(tag, content.substring(start, end))
    }
}

fun Any.logD(content: String, tag: String = this.javaClass.simpleName) {
    log(content) { start, end ->
        Log.d(tag, content.substring(start, end))
    }
}

fun Any.logI(content: String, tag: String = this.javaClass.simpleName) {
    log(content) { start, end ->
        Log.i(tag, content.substring(start, end))
    }
}

fun Any.logW(content: String, tag: String = this.javaClass.simpleName) {
    log(content) { start, end ->
        Log.w(tag, content.substring(start, end))
    }
}

fun Any.logE(content: String, tag: String = this.javaClass.simpleName) {
    log(content) { start, end ->
        Log.e(tag, content.substring(start, end))
    }
}

private fun log(content: String, log: (Int, Int) -> Unit) {
    if (DEBUG) {
        //增加log日志的长度
        val strLength = content.length
        var start = 0
        var end = LOG_MAX_LENGTH
        for (i in 0..100) {
            if (strLength > end) {
                log(start, end)
                start = end
                end += LOG_MAX_LENGTH
            } else {
                log(start, strLength)
                break
            }
        }
    }
}


