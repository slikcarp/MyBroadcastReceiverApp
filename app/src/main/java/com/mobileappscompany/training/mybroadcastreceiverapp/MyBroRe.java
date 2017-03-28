package com.mobileappscompany.training.mybroadcastreceiverapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBroRe extends BroadcastReceiver {
    public MyBroRe() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "MyBroRe", Toast.LENGTH_SHORT).show();
    }
}
