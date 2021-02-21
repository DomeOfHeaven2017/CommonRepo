package com.wx.repos.base.extension

import android.app.Activity

/**
 * author: DomeOfHeaven
 * date : 2021/2/21
 * desc :
 */

inline fun <reified T : Any> Activity.getValue(
    key : String, default : T? = null) = lazy{
    val value = intent?.extras?.get(key)
    if (value is T) value else default
}

inline fun <reified T : Any> Activity.getValueNonNull(
    key : String, default : T? = null) = lazy{
    val value = intent?.extras?.get(key)
    requireNotNull((if (value is T) value else default)){key}
}

