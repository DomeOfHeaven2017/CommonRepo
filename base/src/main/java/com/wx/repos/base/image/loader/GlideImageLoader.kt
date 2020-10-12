package com.wx.repos.base.image.loader

import android.graphics.drawable.Drawable
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target
import com.wx.repos.base.common.Constants
import java.lang.IllegalArgumentException

/**
 *Created by wx on 19-9-22
 *Description :
 */
class GlideImageLoader : IImageLoader {
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