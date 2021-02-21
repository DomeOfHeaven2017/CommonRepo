package com.wx.repos.base.extension

import android.view.View
import com.google.android.material.snackbar.Snackbar

/**
 * author: DomeOfHeaven
 * date : 2021/2/21
 * desc :
 */

fun View.show() {
    this.visibility = View.VISIBLE
}

fun View.hide() {
    this.visibility = View.INVISIBLE
}

fun View.remove() {
    this.visibility = View.GONE
}

fun View.showShotSnackbar(msg : String){
    Snackbar.make(this, msg, Snackbar.LENGTH_SHORT).show()
}
fun View.showLongSnackbar(msg : String){
    Snackbar.make(this, msg, Snackbar.LENGTH_LONG).show()
}
