package com.dididi.uiextlib.ext
import android.graphics.Bitmap
import android.graphics.Canvas
import android.view.View
import kotlinx.coroutines.*
import kotlinx.coroutines.channels.actor


/**
 * @author dididi(yechao)
 * @since 24/03/2020
 * @describe view的拓展函数
 */

/**
 * view防止重复点击
 */
@ObsoleteCoroutinesApi
fun View.onSingleClick(delay: Long = 1500L, action: suspend (View) -> Unit) {
    val eventActor = GlobalScope.actor<Unit>(Dispatchers.Main) {
        //利用channel来依次处理action函数
        for (unit in channel) {
            action(this@onSingleClick)
            delay(delay)
        }
    }
    setOnClickListener {
        eventActor.offer(Unit)
    }
}

/**
 * 获取view的bitmap，截取view的当前画面
 */
fun View.getBitmap(): Bitmap {
    val bitmap = Bitmap.createBitmap(this.width, this.height, Bitmap.Config.ARGB_8888)
    val canvas = Canvas(bitmap)
    this.draw(canvas)
    return bitmap
}
