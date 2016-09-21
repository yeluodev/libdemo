package com.yeluodev.lib.base;

import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.view.View;

/**
 * Fragment基类
 * 作者：yeluodev
 * 创建时间：2016/9/21 17:57
 * 修改时间：2016/9/21 17:57
 */
public class BaseFragment extends Fragment {

    /**
     * 通过xml查找相应的ID，通用方法
     * @param id
     * @param <T>
     * @return
     */
    protected <T extends View> T $(@IdRes int id) {
        return (T) getActivity().findViewById(id);
    }
}
