package com.wx.repos.base.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.IdRes
import androidx.fragment.app.Fragment

/**
 *  author : DomeOfHeaven
 *  date : 2020/9/30 14:20
 *  desc :
 */
abstract class BaseFragment : Fragment(), IUiInit {

    private lateinit var mRootView: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initBeforeView()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mRootView = inflater.inflate(getContentId(), container, false)
        return mRootView
    }

    protected fun <T : View> findViewById(@IdRes id: Int): T {
        return mRootView.findViewById(id)
    }
}