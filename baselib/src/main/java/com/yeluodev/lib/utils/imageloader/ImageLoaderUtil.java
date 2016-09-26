package com.yeluodev.lib.utils.imageloader;

import android.content.Context;

/**
 * 图片加载工具
 * 作者：yeluodev
 * 创建时间：2016/9/26 17:34
 * 修改时间：2016/9/26 17:34
 */
public class ImageLoaderUtil {
    public static final int PIC_LARGE = 0;
    public static final int PIC_MEDIUM = 1;
    public static final int PIC_SMALL = 2;

    public static final int LOAD_STRATEGY_NORMAL = 0;
    public static final int LOAD_STRATEGY_ONLY_WIFI = 1;

    private static ImageLoaderUtil mInstance;
    private BaseImageLoaderProvider mProvider;

    private ImageLoaderUtil(){
        mProvider = new PicassoImageLoaderProvider();
    }

    public static ImageLoaderUtil getInstance(){
        if(mInstance==null){
            synchronized (ImageLoaderUtil.class){
                if(mInstance==null){
                    mInstance = new ImageLoaderUtil();
                    return mInstance;
                }
            }
        }
        return mInstance;
    }

    public void loadImage(Context context, ImageLoader loader){
        mProvider.loadImage(context,loader);
    }
}
