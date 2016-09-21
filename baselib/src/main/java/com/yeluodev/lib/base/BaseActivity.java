package com.yeluodev.lib.base;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Activity基类
 * 作者：yeluodev
 * 创建时间：2016/9/21 17:52
 * 修改时间：2016/9/21 17:52
 */
public class BaseActivity extends AppCompatActivity {

    /**
     * 通过xml查找相应的ID，通用方法
     * @param id
     * @param <T>
     * @return
     */
    protected <T extends View> T $(@IdRes int id) {
        return (T) findViewById(id);
    }
}
