package com.wx.repos.base.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 *  author : DomeOfHeaven
 *  date : 2020/9/30 14:14
 *  desc :
 */

abstract class BaseActivity : AppCompatActivity(), IUiInit {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initBeforeView()

        setContentView(getContentId())

        initView()

        initData()
    }
}