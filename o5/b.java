package O5;

import B3.q;
import Q0.g;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import de.ozerov.fully.FullyActivity;
import de.ozerov.fully.U0;
import java.util.HashMap;
import n2.a;
import org.json.JSONException;
import org.json.JSONObject;

public final class b extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public FullyActivity f3663a;

    /* renamed from: b  reason: collision with root package name */
    public int f3664b;

    /* renamed from: c  reason: collision with root package name */
    public int f3665c;

    public final void onReceive(Context context, Intent intent) {
        int i;
        int i8;
        if (intent != null && intent.getExtras() != null) {
            a.o0(intent);
            FullyActivity fullyActivity = this.f3663a;
            fullyActivity.f9929R0.H();
            try {
                i8 = intent.getIntExtra("plugged", -1);
                i = intent.getIntExtra("level", -1);
            } catch (Exception e) {
                g.x(e, new StringBuilder("Failed to ge the battery extras due to "), "b");
                i = -1;
                i8 = -1;
            }
            int i9 = this.f3664b;
            if (i != i9) {
                if (i9 != -1) {
                    U0.e("onBatteryLevelChanged", a.E("$level", String.valueOf(i)));
                    q qVar = fullyActivity.f9935X0;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("level", i);
                    } catch (JSONException e8) {
                        e8.printStackTrace();
                    }
                    qVar.b0("onBatteryLevelChanged", jSONObject);
                }
                this.f3664b = i;
            }
            if (i8 != this.f3665c) {
                if (i8 != -1) {
                    if ((i8 & 1) != 0) {
                        U0.e("pluggedAC", (HashMap) null);
                        fullyActivity.f9935X0.b0("pluggedAC", (JSONObject) null);
                    }
                    if ((i8 & 2) != 0) {
                        U0.e("pluggedUSB", (HashMap) null);
                        fullyActivity.f9935X0.b0("pluggedUSB", (JSONObject) null);
                    }
                    if ((i8 & 4) != 0) {
                        U0.e("pluggedWireless", (HashMap) null);
                        fullyActivity.f9935X0.b0("pluggedWireless", (JSONObject) null);
                    }
                    if (i8 == 0) {
                        U0.e("unplugged", (HashMap) null);
                        fullyActivity.f9935X0.b0("unplugged", (JSONObject) null);
                    }
                }
                this.f3665c = i8;
            }
        }
    }
}
