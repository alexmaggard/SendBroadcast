package com.maggard.sendbroadcast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SendBroadcastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_broadcast);
    }

    //onclick method
    public void sendBroadcast(View view) {
        //first create implicit intent
        Intent i = new Intent();
        i.setAction("com.maggard.sendbroadcast");
        //makes intent broadcast compatible with all versions
        i.setFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
        sendBroadcast(i);
    }
}
