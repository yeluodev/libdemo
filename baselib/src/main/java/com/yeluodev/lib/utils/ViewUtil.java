package com.yeluodev.lib.utils;

import android.view.View;
import android.view.ViewGroup;

/**
 * ui工具类
 * 作者：yeluodev
 * 创建时间：2016/6/7 16:57
 * 修改时间：2016/6/7 16:57
 */
public class ViewUtil {

    /**
     * 让该工具类不可实例化
     */
    private ViewUtil(){
        throw new AssertionError();
    }

    /**
     * 移除View
     * @param view
     */
    public static void removeFromSuperView(View view) {
        ViewGroup parent = (ViewGroup) view.getParent();
        if (parent != null)
            parent.removeView(view);
    }
}
