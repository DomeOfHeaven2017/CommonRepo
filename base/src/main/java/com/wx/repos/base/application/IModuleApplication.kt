package com.wx.repos.base.application

import android.app.Application

/**
 *Created by wx on 19-10-8
 *Description :
 */
interface IModuleApplication {

    fun initConfig(application: Application)
}