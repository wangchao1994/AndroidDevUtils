package com.android.appdevuitls;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.android.net.AppNetworkMgr;

public class NetWorkConnectChangeReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        boolean networkConnected = AppNetworkMgr.isNetworkConnected(context);
    }
}
