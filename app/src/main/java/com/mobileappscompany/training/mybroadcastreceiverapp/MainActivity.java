package com.mobileappscompany.training.mybroadcastreceiverapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String MY_BRO_RE = "MyBroRe";
    public static final String MY_EXT_BRO_RE = "MyExternalBroRe";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendBroadcastReceiver(View view) {
        Intent i = new Intent();
        i.setAction(MY_BRO_RE);
        sendBroadcast(i);
    }

    public void sendExternalBroadcastReceiver(View view) {
        Intent i = new Intent();
        i.setAction(MY_EXT_BRO_RE);
        i.putExtra("parameter", "Hi external broadcast receiver");
        sendBroadcast(i);
    }

    public void sendPlainBroadcastReceiver(View view) {
        Intent i = new Intent();
        i.setAction("Bob");
        i.putExtra("parameter", "Hi plain broadcast receiver");
        sendBroadcast(i);
    }
}
