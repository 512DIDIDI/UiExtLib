package com.dididi.uiextlib

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dididi.uiextlib.ui.BrushDrawingView
import kotlinx.android.synthetic.main.activity_brush.*


/**
 * @author dididi(yechao)
 * @since 10/08/2020
 * @describe
 */

class BrushActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_brush)
        activityBrushBrushView.apply {
            paintMode = BrushDrawingView.PaintMode.PAINT
            paintColor = Color.RED
            paintWidth = 30f
            paintOpacity = 200
            brushDrawingListener = object:BrushDrawingView.OnBrushDrawingListener{
                override fun addView(brushDrawingView: BrushDrawingView) {
                }

                override fun removeView(brushDrawingView: BrushDrawingView) {
                }

                override fun startDrawing() {
                }

                override fun stopDrawing() {
                }
            }
//            undo()
//            redo()
//            clearAll()
        }

    }
}