package com.wx.repos.base.image.loader

import android.widget.ImageView

/**
 *Created by wx on 19-9-22
 *Description :
 */
interface IImageLoader {

    /**
     * 加载到ImageView
     * @param view ImageView
     * @param url image link
     * @param onSuccess  image load success
     * @param onError image load error
     */
    fun loadImage(
        view : ImageView,
        url : String,
        onSuccess : () -> Unit = {},
        onError : (error : Exception) -> Unit = {}
    )
    /**
     * 加载缩略图
     * @param view ImageView
     * @param url image link
     * @param onSuccess  image load success
     * @param onError image load error
     */
    fun loadThumbnail(
        view : ImageView,
        url : String,
        onSuccess : () -> Unit = {},
        onError : (error : Exception) -> Unit = {}
    )

    /**
     * 加载视频缩略图
     * @param view ImageView
     * @param url image link
     * @param onSuccess  image load success
     * @param onError image load error
     */
    fun loadVideoCover(
        view : ImageView,
        url : String,
        onSuccess : () -> Unit = {},
        onError : (error : Exception) -> Unit = {}
    )
}