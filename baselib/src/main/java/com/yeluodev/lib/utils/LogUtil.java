package com.yeluodev.lib.utils;

import com.orhanobut.logger.Logger;

/**
 * 日志打印
 * 作者：yeluodev
 * 创建时间：2016/5/30 16:34
 * 修改时间：2016/5/30 16:34
 */
public class LogUtil {
    private static boolean DEBUG = true;

    private LogUtil(){
        throw new AssertionError();
    }

    /**
     * 打印信息
     * @param info
     */
    public static void i(String info){
        if(DEBUG){
            Logger.i(info);
        }
    }
}
