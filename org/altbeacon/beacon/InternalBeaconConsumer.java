package org.altbeacon.beacon;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;

public interface InternalBeaconConsumer {
    boolean bindService(Intent intent, ServiceConnection serviceConnection, int i);

    Context getApplicationContext();

    void onBeaconServiceConnect();

    void unbindService(ServiceConnection serviceConnection);
}
