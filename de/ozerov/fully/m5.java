package de.ozerov.fully;

import N5.f;
import Z1.c;
import android.app.Dialog;
import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import d4.k;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import n2.a;

public class m5 extends E {

    /* renamed from: A1  reason: collision with root package name */
    public final f f10806A1 = new f(10, this);

    public m5() {
        Q();
        this.f9873z1 = false;
        this.f9865o1 = "Configure Wifi";
        this.f9868r1 = "Cancel";
        this.f9867q1 = "Save";
        Q();
        this.f9872y1 = false;
    }

    public final void A() {
        try {
            this.f9851g1.unregisterReceiver(this.f10806A1);
        } catch (IllegalArgumentException unused) {
        }
        super.A();
    }

    public final void D() {
        super.D();
        W();
    }

    public final Dialog P(Bundle bundle) {
        Dialog P8 = super.P(bundle);
        P8.setOnShowListener(new l5(this));
        return P8;
    }

    public final View U() {
        return (LinearLayout) this.f9851g1.getLayoutInflater().inflate(2131558605, (ViewGroup) null);
    }

    public final void V() {
        if (this.f9862l1 != null && this.f9852h1 != null) {
            k kVar = new k((Context) this.f9851g1, 1);
            EditText editText = (EditText) this.f9852h1.findViewById(2131362645);
            Spinner spinner = (Spinner) this.f9852h1.findViewById(2131362647);
            if (spinner.getSelectedItemPosition() == 0 || spinner.getSelectedItem() == null) {
                kVar.V2("wifiSelectorKey", "");
                kVar.V2("wifiSelectorSSID", "");
                a.b1(this.f9851g1, "Wifi Configuration Removed");
            } else {
                kVar.V2("wifiSelectorKey", editText.getText().toString());
                kVar.V2("wifiSelectorSSID", spinner.getSelectedItem().toString());
                String U8 = C0794w0.U(this.f9851g1);
                if (!U8.equals("\"" + kVar.E2() + "\"")) {
                    C0794w0.c(this.f9851g1, kVar.E2(), ((c) kVar.f9767W).r("wifiSelectorKey", ""), "WPA_PSK", (String) null, (String) null);
                }
            }
            this.f9862l1.i((String) null);
            Objects.toString(spinner.getSelectedItem());
            editText.getText().toString();
        }
    }

    public final void W() {
        k kVar = new k((Context) this.f9851g1, 1);
        View view = this.f9852h1;
        if (view != null) {
            EditText editText = (EditText) view.findViewById(2131362645);
            Spinner spinner = (Spinner) this.f9852h1.findViewById(2131362647);
            if (!a.y0() || this.f9851g1.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) {
                List<ScanResult> scanResults = ((WifiManager) this.f9851g1.getApplicationContext().getSystemService("wifi")).getScanResults();
                ArrayList arrayList = new ArrayList();
                arrayList.add("Select Network");
                int i = 0;
                int i8 = 1;
                for (ScanResult next : scanResults) {
                    if (!arrayList.contains(next.SSID) && !next.SSID.trim().isEmpty()) {
                        arrayList.add(next.SSID);
                        if (kVar.E2().equals(next.SSID)) {
                            i = i8;
                        }
                        i8++;
                    }
                }
                if (arrayList.size() == 1) {
                    a.b1(this.f9851g1, "No Wifi networks found");
                    arrayList.clear();
                    arrayList.add("No networks found");
                }
                ArrayAdapter arrayAdapter = new ArrayAdapter(this.f9851g1, 17367048, arrayList);
                arrayAdapter.setDropDownViewResource(17367049);
                spinner.setAdapter(arrayAdapter);
                spinner.setSelection(i);
            } else {
                a.a1(1, this.f9851g1, "Can't get available Wifi networks due to missing location permission");
            }
            editText.setText(((c) kVar.f9767W).r("wifiSelectorKey", ""));
        }
    }
}
