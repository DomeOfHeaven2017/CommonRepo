package com.wx.repos.base.extension

import android.content.Context
import android.widget.Toast

/**
 * author: DomeOfHeaven
 * date : 2021/2/21
 * desc :
 */

fun Context.showShotToast(msg : String){
    Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
}
fun Context.showLongToast(msg : String){
    Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
}
