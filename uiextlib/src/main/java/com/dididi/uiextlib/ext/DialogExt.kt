package com.dididi.uiextlib.ext

import android.app.Activity
import android.app.Dialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.PopupMenu
import androidx.annotation.LayoutRes
import androidx.annotation.MenuRes
import androidx.annotation.StyleRes
import androidx.fragment.app.Fragment
import com.dididi.uiextlib.R
import com.google.android.material.snackbar.BaseTransientBottomBar
import com.google.android.material.snackbar.Snackbar


/**
 * @author dididi(叶超)
 * @email yc512yc@163.com
 * @since 05/11/2019
 * @describe 弹窗拓展类
 */

private val dialogs = arrayListOf<Dialog>()
private val popupMenus = arrayListOf<PopupMenu>()

/**
 * loading框显示
 * @param resId 支持lottie 可参考[R.layout.dialog_loading]来实现
 * @param themeResId dialog样式
 */
fun Context.showLoading(
    @LayoutRes resId: Int = R.layout.dialog_loading,
    @StyleRes themeResId:Int = R.style.custom_dialog,
    isCancelable:Boolean = true,
    isCanceledOnTouchOutside:Boolean = false
) =
    Dialog(this, themeResId).apply {
        val view = LayoutInflater
            .from(this@showLoading)
            .inflate(resId, null, false)
        setContentView(view)
        setCanceledOnTouchOutside(isCanceledOnTouchOutside)
        setCancelable(isCancelable)
        dialogs.add(this)
        show()
    }

fun Fragment.showLoading(
    @LayoutRes resId: Int = R.layout.dialog_loading,
    @StyleRes themeResId:Int = R.style.custom_dialog,
    isCancelable:Boolean = true,
    isCanceledOnTouchOutside:Boolean = false
) =
    this.activity!!.showLoading(resId,themeResId,isCancelable,isCanceledOnTouchOutside)

/**
 * 关闭所有弹出框
 */
fun dismissAllLoading() = dialogs.forEach {
    it.dismiss()
}

/**
 * 收藏页面popupMenu显示
 */
fun Context.showPopupMenu(parentView: View, @MenuRes menuRes: Int) =
    PopupMenu(this, parentView).apply {
        menuInflater.inflate(menuRes, menu)
        show()
    }

fun Fragment.showPopupMenu(parentView: View, @MenuRes menuRes: Int) =
    this.activity!!.showPopupMenu(parentView, menuRes)

/**
 * 关闭所有popupmenu
 */
fun dismissAllPopupMenu() = popupMenus.forEach {
    it.dismiss()
}

/**
 * snackBar
 */
fun Activity.showSnackBar(message: String) {
    val view = findViewById<View>(android.R.id.content)
    Snackbar.make(view, message, BaseTransientBottomBar.LENGTH_SHORT).show()
}

fun Fragment.showSnackBar(message: String) {
    val view = this.activity!!.findViewById<View>(android.R.id.content)
    Snackbar.make(view, message, BaseTransientBottomBar.LENGTH_SHORT).show()
}

