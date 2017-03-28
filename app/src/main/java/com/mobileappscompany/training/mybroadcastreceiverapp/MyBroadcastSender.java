package com.mobileappscompany.training.mybroadcastreceiverapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBroadcastSender extends BroadcastReceiver {
    public MyBroadcastSender() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "MyBroSe", Toast.LENGTH_SHORT).show();
    }
}
