package O5;

import Z1.c;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.util.Log;
import d4.k;
import de.ozerov.fully.C0794w0;
import java.util.List;
import n2.a;

public final class h extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public long f3680a;

    public final void onReceive(Context context, Intent intent) {
        if (intent != null && intent.getAction() != null && intent.getAction().equals("android.net.wifi.SCAN_RESULTS")) {
            if ((!a.y0() || context.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) && (!a.p0() || context.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0)) {
                Log.i("h", "Wifi scan got SCAN_RESULTS_AVAILABLE_ACTION");
                k kVar = new k(context, 1);
                if (this.f3680a == -1 || System.currentTimeMillis() - this.f3680a > 20000) {
                    boolean isEmpty = kVar.E2().isEmpty();
                    c cVar = (c) kVar.f9767W;
                    if (!isEmpty) {
                        String U8 = C0794w0.U(context);
                        if (!U8.equals("\"" + kVar.E2() + "\"")) {
                            List<ScanResult> scanResults = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getScanResults();
                            kVar.E2();
                            scanResults.size();
                            for (ScanResult scanResult : scanResults) {
                                if (kVar.E2().equals(scanResult.SSID)) {
                                    C0794w0.c(context, kVar.E2(), cVar.r("wifiSelectorKey", ""), "WPA_PSK", (String) null, (String) null);
                                    this.f3680a = System.currentTimeMillis();
                                    return;
                                }
                            }
                            kVar.E2();
                            return;
                        }
                    }
                    if (!kVar.F2().isEmpty()) {
                        String U9 = C0794w0.U(context);
                        if (!U9.equals("\"" + kVar.F2() + "\"")) {
                            List<ScanResult> scanResults2 = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getScanResults();
                            Log.i("h", "Looking for " + kVar.F2() + " in new ScanResults size:" + scanResults2.size());
                            for (ScanResult next : scanResults2) {
                                if (kVar.F2().equals(next.SSID)) {
                                    Log.i("h", "SSID found, trying to connect to: " + next.SSID);
                                    C0794w0.c(context, kVar.F2(), cVar.r("wifiKey", ""), cVar.r("wifiType", "WPA_PSK"), cVar.r("wifiEnterpriseIdentity", ""), cVar.r("wifiEnterprisePassword", ""));
                                    this.f3680a = System.currentTimeMillis();
                                    return;
                                }
                            }
                            Log.w("h", "Wifi network not found " + kVar.F2());
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            Log.e("h", "No permissions for getting Wifi scan results granted yet");
        }
    }
}
