package com.yeluodev.lib.utils.imageloader;

import android.content.Context;

/**
 * 图片加载的抽象类
 * 作者：yeluodev
 * 创建时间：2016/9/26 17:23
 * 修改时间：2016/9/26 17:23
 */
public abstract class BaseImageLoaderProvider {
    public abstract void loadImage(Context context, ImageLoader loader);
}
