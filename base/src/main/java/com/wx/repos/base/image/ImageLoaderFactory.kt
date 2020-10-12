package com.wx.repos.base.image

import com.wx.repos.base.image.loader.CoilImageLoader
import com.wx.repos.base.image.loader.GlideImageLoader

/**
 * author: DomeOfHeaven
 * date : 2020/10/12
 * desc :
 */
object ImageLoaderFactory {

    const val COIL = 0
    const val GLIDE = 1

    fun getImageLoader(type : Int) = when(type) {
        COIL -> CoilImageLoader()
        GLIDE -> GlideImageLoader()
        else -> CoilImageLoader()
    }
}