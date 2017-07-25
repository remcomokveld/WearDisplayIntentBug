package com.sample.weardisplayintentbug;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Example shell activity which simply broadcasts to our receiver and exits.
 */
public class MyStubBroadcastActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        for (int i = 0; i < 10; i++) {
            Intent intent = new Intent();
            intent.setAction("com.sample.weardisplayintentbug.SHOW_NOTIFICATION");
            intent.putExtra(MyPostNotificationReceiver.CONTENT_KEY, getString(R.string.title));
            sendBroadcast(intent);
        }
        finish();
    }
}
