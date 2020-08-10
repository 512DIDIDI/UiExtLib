package com.dididi.uiextlib.ext

import android.graphics.Bitmap
import android.graphics.Matrix


/**
 * @author dididi(yechao)
 * @since 10/08/2020
 * @describe bitmap扩展类
 */

/**
 * 旋转图片
 */
fun Bitmap.rotateImage(degree:Float): Bitmap {
    return Matrix().let {
        it.postRotate(degree)
        Bitmap.createBitmap(this,0,0,this.width,this.height,it,true)
    }
}