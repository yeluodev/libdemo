package com.yeluodev.lib.utils;

/**
 * 字符串工具类
 * 作者：yeluodev
 * 创建时间：2016/8/22 16:06
 * 修改时间：2016/8/22 16:06
 */
public class StringUtil {

    private StringUtil(){
        throw new AssertionError();
    }

    /**
     * 创建字符串方法，当需要组装2个以上的字符串时请使用这个方法
     * @param element
     * @return 拼接后的字符串
     */
    public static String buildString(Object... element) {
        StringBuffer sb = new StringBuffer();
        for (Object str : element) {
            sb.append(str);
        }
        return sb.toString();
    }
}
