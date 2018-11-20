package com.android.appdevuitls;

import android.app.Application;

import com.android.application.AppUtils;

public class MyApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        AppUtils.init(this);
    }
}
