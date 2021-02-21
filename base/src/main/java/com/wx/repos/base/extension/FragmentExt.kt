package com.wx.repos.base.extension

import androidx.fragment.app.Fragment

/**
 * author: DomeOfHeaven
 * date : 2021/2/21
 * desc :
 */

inline fun <reified T: Any> Fragment.getValue(key: String, default: T? = null) = lazy {
    val value = arguments?.get(key)
    if (value is T) value else default
}

inline fun <reified T : Any> Fragment.getValueNonNull(Key: String, default: T? = null) = lazy {
    val value = arguments?.get(Key)
    requireNotNull(if (value is T) value else default) { Key }
}
