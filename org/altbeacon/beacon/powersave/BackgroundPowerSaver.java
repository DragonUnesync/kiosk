package org.altbeacon.beacon.powersave;

import android.annotation.TargetApi;
import android.content.Context;

@TargetApi(18)
@Deprecated
public class BackgroundPowerSaver extends BackgroundPowerSaverInternal {
    public BackgroundPowerSaver(Context context) {
        super(context);
    }

    @Deprecated
    public BackgroundPowerSaver(Context context, boolean z) {
        this(context);
    }
}
