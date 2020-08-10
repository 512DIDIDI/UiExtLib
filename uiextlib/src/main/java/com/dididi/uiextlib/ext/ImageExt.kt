package com.dididi.uiextlib.ext

import android.graphics.Bitmap
import android.graphics.Matrix
import android.media.ExifInterface
import java.io.IOException


/**
 * @author dididi(yechao)
 * @since 10/08/2020
 * @describe 图片相关信息
 */

/**
 * 通过exif信息来获取相片旋转信息
 */
fun getPictureDegree(path: String): Int {
    val exifInterface = ExifInterface(path)
    return try {
        when (exifInterface.getAttributeInt(
            ExifInterface.TAG_ORIENTATION,
            ExifInterface.ORIENTATION_NORMAL
        )) {
            ExifInterface.ORIENTATION_ROTATE_90 -> 90
            ExifInterface.ORIENTATION_ROTATE_180 -> 180
            ExifInterface.ORIENTATION_ROTATE_270 -> 270
            else -> 0
        }
    } catch (e: IOException) {
        e.printStackTrace()
        0
    }
}