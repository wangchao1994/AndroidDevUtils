package com.android.appdevuitls;

import android.app.Application;

import com.android.application.AppUtils;
import com.android.crash.CrashHandlerUtil;

public class MyApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        AppUtils.init(this);
        CrashHandlerUtil crashHandlerUtil = CrashHandlerUtil.getInstance();
        crashHandlerUtil.init(this);
        crashHandlerUtil.setCrashTip("很抱歉，程序出现异常，即将退出！");
    }
}
