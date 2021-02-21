package com.wx.repos.base.extension

import android.util.Patterns

/**
 * author: DomeOfHeaven
 * date : 2021/2/21
 * desc :
 */

fun String?.isValid() : Boolean =
    this != null && !this.equals("null", true)
            && this.trim().isNotEmpty()

fun String.isEmail() : Boolean =
    this.isNotEmpty() && Patterns.EMAIL_ADDRESS.matcher(this).matches()

fun String.isPhoneNumber() : Boolean = false

