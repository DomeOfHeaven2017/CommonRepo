package com.wx.repos.base.ui

/**
 *  author : DomeOfHeaven
 *  date : 2020/9/30 14:13
 *  desc :
 */
interface IUiInit {
    /**
     * 在View前的初始化
     */
    fun initBeforeView() : Unit
    /**
     * 获取布局ID
     */
    fun getContentId() : Int
    /**
     * 初始化View,绑定控件
     */
    fun initView() : Unit
    /**
     * 初始化数据
     */
    fun initData() : Unit
}