package com.example.smaik.appget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String name = intent.getStringExtra("name");
        String surname = intent.getStringExtra("surname");
        Intent mainIntent = new Intent(context, MainActivity.class);
        mainIntent.putExtra("name", name);
        mainIntent.putExtra("surname", surname);
        mainIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(mainIntent);
    }
}
