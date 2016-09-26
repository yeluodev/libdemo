package com.yeluodev.lib.utils.imageloader;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;

/**
 * Picasso加载图片
 * 作者：yeluodev
 * 创建时间：2016/9/26 17:39
 * 修改时间：2016/9/26 17:39
 */
public class PicassoImageLoaderProvider extends BaseImageLoaderProvider{

    @Override
    public void loadImage(Context context, ImageLoader loader) {
        loadNormal(context,loader);
    }

    /**
     * 使用Picasso加载图片（无占位图）
     * @param context
     * @param img
     */
    private void loadNormal(Context context, ImageLoader img) {
        RequestCreator req;
        if (TextUtils.isEmpty(img.getUrl())) {
            req = Picasso.with(context)
                    .load(img.getRes());
        } else {
            req = Picasso.with(context)
                    .load(img.getUrl());
        }

        if(img.getPlaceHolder()!=0){
            req = req.placeholder(img.getPlaceHolder());
        }

        if (img.isFitType()) {
            req = req.fit();
        }

        req.config(Bitmap.Config.RGB_565).into(img.getImageView());
    }
}
