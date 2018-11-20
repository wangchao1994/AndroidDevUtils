package com.android.phone;

import android.os.Build;

/**
 * @Description:主要功能:andoid 版本工具，用于判断当前版本是否大于某个版本
 */

public class AndroidVersionUtil {
    /**
     * 是否在4.4.2版本及以上
     *
     * @return 是否在4.4.2版本及以上
     */
    public static boolean isKitkat() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT;
    }

    /**
     * 是否在5.0.1版本及以上
     *
     * @return 是否在5.0.1版本及以上
     */
    public static boolean isLollipop() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP;
    }

    /**
     * 是否在6.0版本及以上
     * @return 是否在6.0版本及以上
     */
    public static boolean isM(){
        return Build.VERSION.SDK_INT >=  Build.VERSION_CODES.M;
    }

    /**
     * 是否在7.0版本及以上
     * @return 是否在7.0版本及以上
     */
    public static boolean isN(){
        return  Build.VERSION.SDK_INT >=  Build.VERSION_CODES.N;
    }
}
