package com.wx.repos.base.image.loader

import android.widget.ImageView
import coil.imageLoader
import coil.request.ImageRequest
import java.lang.IllegalArgumentException

/**
 *  author : DomeOfHeaven
 *  date : 2020/9/30 16:26
 *  desc :
 */
class CoilImageLoader : IImageLoader {
    override fun loadImage(
        view: ImageView,
        url: String,
        onSuccess: () -> Unit,
        onError: (error: Exception) -> Unit
    ) {

    }

    override fun loadThumbnail(
        view: ImageView,
        url: String,
        onSuccess: () -> Unit,
        onError: (error: Exception) -> Unit
    ) {

    }

    override fun loadVideoCover(
        view: ImageView,
        url: String,
        onSuccess: () -> Unit,
        onError: (error: Exception) -> Unit
    ) {

    }


}