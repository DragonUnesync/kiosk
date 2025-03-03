package de.ozerov.fully;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import n2.a;

public class GetProvisioningModeActivity extends Activity {
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if ("android.app.action.GET_PROVISIONING_MODE".equals(getIntent().getAction())) {
            Log.i("GetProvisioningModeActivity", "Selected device owner provisioning for " + a.o0(getIntent()));
            C0794w0.q0(0, "GetProvisioningModeActivity", "Selected device owner provisioning for " + a.o0(getIntent()));
            Intent intent = new Intent();
            intent.putExtra("android.app.extra.PROVISIONING_MODE", 1);
            intent.putExtra("android.app.extra.PROVISIONING_SKIP_EDUCATION_SCREENS", true);
            setResult(-1, intent);
            finish();
            return;
        }
        Log.i("GetProvisioningModeActivity", "Ignore intent " + a.o0(getIntent()));
        C0794w0.q0(0, "GetProvisioningModeActivity", "Ignore intent " + a.o0(getIntent()));
        setResult(-1, new Intent());
        finish();
    }
}
