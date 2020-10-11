package com.wx.repos.base.image.ImageLoadAdapter

import android.widget.ImageView
import coil.imageLoader
import coil.load
import coil.request.ImageRequest
import com.wx.lib_base.image.ImageLoadAdapter.IImageLoader
import com.wx.lib_base.image.ImageLoadAdapter.IImageResLoadListener
import java.lang.IllegalArgumentException

/**
 *  author : DomeOfHeaven
 *  date : 2020/9/30 16:26
 *  desc :
 */
class CoilImageLoader : IImageLoader {
    override fun loadImage(imageView: ImageView, url: String, listener: IImageResLoadListener?) {
        if (url.isEmpty()) {
            listener?.onLoadFailed(IllegalArgumentException("invalid url params !!"))
            return
        }
        val request = ImageRequest.Builder(imageView.context)
            .data(url)
            .target(

            )
            .build()
        imageView.context.imageLoader.enqueue(request)
    }

    override fun loadThumbnail(
        imageView: ImageView,
        url: String,
        listener: IImageResLoadListener?
    ) {

    }

}