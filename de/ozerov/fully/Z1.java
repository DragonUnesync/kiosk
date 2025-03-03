package de.ozerov.fully;

import A.g;
import B3.q;
import N.e;
import V0.r;
import Z1.c;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.preference.Preference;
import android.util.Log;
import b3.C0528a;
import com.samsung.android.knox.EnterpriseDeviceManager;
import d4.k;
import java.io.File;
import java.io.FileOutputStream;
import n2.a;

public final /* synthetic */ class Z1 implements Preference.OnPreferenceClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10529a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0695f2 f10530b;

    public /* synthetic */ Z1(C0695f2 f2Var, int i) {
        this.f10529a = i;
        this.f10530b = f2Var;
    }

    public final boolean onPreferenceClick(Preference preference) {
        C0695f2 f2Var = this.f10530b;
        switch (this.f10529a) {
            case 0:
                int i = C0695f2.f10625d0;
                f2Var.getClass();
                try {
                    f2Var.startActivity(new Intent("android.settings.WIFI_SETTINGS"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return true;
            case 1:
                C0798w4.b(false, f2Var.f10627V, f2Var.f10626U);
                return true;
            case 2:
                C0794w0.G0(f2Var.f10627V);
                return true;
            case 3:
                int i8 = C0695f2.f10625d0;
                f2Var.getClass();
                new C0718j1().T(f2Var.f10627V.l(), "launcherItemSelector");
                return true;
            case 4:
                int i9 = C0695f2.f10625d0;
                f2Var.getClass();
                new C0762q3().T(f2Var.f10627V.l(), "scheduleItemSelector");
                return true;
            case 5:
                int i10 = C0695f2.f10625d0;
                f2Var.getClass();
                V2 v22 = new V2();
                v22.f10441p1 = "mainPlaylist";
                v22.T(f2Var.f10627V.l(), "playlistItemSelector");
                return true;
            case 6:
                int i11 = C0695f2.f10625d0;
                f2Var.getClass();
                V2 v23 = new V2();
                v23.f10441p1 = "screensaverPlaylist";
                v23.f10442q1 = "Manage Screensaver Playlist";
                v23.T(f2Var.f10627V.l(), "playlistItemSelector");
                return true;
            case 7:
                int i12 = C0695f2.f10625d0;
                f2Var.getClass();
                U4 u42 = new U4();
                u42.f10427p1 = "mainWebAutomation";
                u42.f10428q1 = "Web Automation";
                u42.T(f2Var.f10627V.l(), "webAutomationSelector");
                return true;
            case 8:
                if (f2Var.f10626U.u().booleanValue() && f2Var.f10626U.J1().booleanValue()) {
                    f2Var.f10627V.f9960y1.b();
                }
                FullyActivity fullyActivity = f2Var.f10627V;
                r rVar = new r(fullyActivity, 1);
                k kVar = (k) rVar.f5587c;
                if (kVar.K1().isEmpty()) {
                    a.b1(fullyActivity, "Please set the Remote Admin Password first");
                } else {
                    C0692f fVar = new C0692f();
                    fVar.f9865o1 = "Add Device to Cloud";
                    fVar.f9868r1 = "Cancel";
                    fVar.f9867q1 = "OK";
                    fVar.Q();
                    fVar.f9872y1 = true;
                    c cVar = (c) kVar.f9767W;
                    fVar.f10619B1 = cVar.r("cloudAccountEmail", "");
                    if (cVar.r("cloudAccountDeviceAlias", "").isEmpty()) {
                        fVar.f10618A1 = C0794w0.t(fullyActivity);
                    } else {
                        fVar.f10618A1 = cVar.r("cloudAccountDeviceAlias", "");
                    }
                    fVar.f9863m1 = new U0.c(12);
                    fVar.f9862l1 = new g(rVar, 11, fVar);
                    fVar.T(fullyActivity.l(), "AddDeviceToCloudDialog");
                }
                return true;
            case 9:
                int i13 = C0695f2.f10625d0;
                f2Var.getClass();
                try {
                    if (a.z0()) {
                        f2Var.startActivity(new Intent("android.settings.WEBVIEW_SETTINGS"));
                    }
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
                return true;
            case 10:
                int i14 = C0695f2.f10625d0;
                f2Var.getClass();
                try {
                    f2Var.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + f2Var.f10627V.getPackageName())));
                } catch (ActivityNotFoundException unused) {
                    a.a1(1, f2Var.f10627V, "Unable to find the market app");
                }
                return true;
            case 11:
                int i15 = C0695f2.f10625d0;
                f2Var.getClass();
                try {
                    f2Var.startActivity(new Intent("android.settings.DREAM_SETTINGS"));
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
                return true;
            case 12:
                ((ClipboardManager) f2Var.f10627V.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Fully Device ID", P.i(f2Var.f10627V)));
                a.b1(f2Var.f10627V, "Device ID has been copied to clipboard");
                FullyActivity fullyActivity2 = f2Var.f10627V;
                String i16 = P.i(fullyActivity2);
                String y8 = e.y("fully-deviceID-", i16, ".txt");
                File file = new File(a.c0(fullyActivity2, (String) null), y8);
                if (a.w0(fullyActivity2, file)) {
                    if (!P.B()) {
                        Log.e("P", "External storage is not writable for " + file.getAbsolutePath());
                        a.b1(fullyActivity2, "External storage is not writable");
                    } else if (!a.h0(fullyActivity2) && a.y0()) {
                        fullyActivity2.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}, 1006);
                        a.b1(fullyActivity2, "Please grant permissions and try again");
                    }
                    return true;
                }
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    fileOutputStream.write(i16.getBytes());
                    fileOutputStream.close();
                    a.a1(1, fullyActivity2, "Device ID written to file " + file.getAbsolutePath());
                } catch (Exception e10) {
                    Q0.g.x(e10, Q0.g.s("Failed to write deviceID to file ", y8, " due to "), "P");
                }
                return true;
            case 13:
                int i17 = C0695f2.f10625d0;
                f2Var.getClass();
                try {
                    f2Var.startActivity(new Intent("android.settings.SETTINGS"));
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                return true;
            case EnterpriseDeviceManager.KNOX_2_3:
                FullyActivity fullyActivity3 = f2Var.f10627V;
                boolean z = Z0.f10525a;
                Log.d("Z0", "activateEmlLicense");
                new C0686e(4, fullyActivity3).execute(new Void[0]);
                return true;
            case EnterpriseDeviceManager.KNOX_2_4:
                FullyActivity fullyActivity4 = f2Var.f10627V;
                boolean z6 = Z0.f10525a;
                Log.d("Z0", "activateSklLicense");
                new C0723k0(new k((Context) fullyActivity4, 1), (C0780t4) fullyActivity4).execute(new Void[0]);
                return true;
            case EnterpriseDeviceManager.KNOX_2_4_1:
                FullyActivity fullyActivity5 = f2Var.f10627V;
                q qVar = fullyActivity5.f9931T0;
                qVar.getClass();
                if (a.u0()) {
                    qVar.x(new File(a.c0(fullyActivity5, (String) null), "fully-single-app-settings.json"), "manual");
                } else {
                    Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
                    intent.addCategory("android.intent.category.OPENABLE");
                    intent.setType("application/json");
                    intent.putExtra("android.intent.extra.TITLE", "fully-single-app-settings.json");
                    fullyActivity5.startActivityForResult(intent, 1023);
                }
                return true;
            case EnterpriseDeviceManager.KNOX_2_5:
                FullyActivity fullyActivity6 = f2Var.f10627V;
                q qVar2 = fullyActivity6.f9931T0;
                Dialog dialog = f2Var.getPreferenceScreen().getDialog();
                W1 w1 = new W1(f2Var, 1);
                qVar2.getClass();
                if (a.u0()) {
                    C0528a aVar = new C0528a();
                    aVar.f8653a = 0;
                    aVar.f8655c = 0;
                    aVar.f8658g = new String[]{"json"};
                    d3.g gVar = new d3.g((Activity) qVar2.f449U, aVar);
                    gVar.setTitle("Select JSON File to Import");
                    gVar.f9745h0 = "Import".toString();
                    gVar.f9739b0 = new g(qVar2, 12, w1);
                    if (dialog != null) {
                        gVar.f9749l0 = dialog.getWindow();
                    }
                    gVar.show();
                } else {
                    Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
                    intent2.addCategory("android.intent.category.OPENABLE");
                    intent2.setType("application/json");
                    fullyActivity6.startActivityForResult(intent2, 1024);
                }
                return true;
            case EnterpriseDeviceManager.KNOX_2_5_1:
                int i18 = C0695f2.f10625d0;
                f2Var.getClass();
                AlertDialog.Builder builder = new AlertDialog.Builder(f2Var.f10627V);
                builder.setTitle("Attention!");
                builder.setMessage("You are going to unregister Fully as device owner. Do you know what you are doing?");
                builder.setCancelable(false);
                builder.setPositiveButton("OK", new C0683d2(f2Var, 0));
                builder.setNegativeButton(17039360, new V(13));
                a.Z0(builder.create());
                return true;
            case EnterpriseDeviceManager.KNOX_2_6:
                int i19 = C0695f2.f10625d0;
                f2Var.getClass();
                AlertDialog.Builder builder2 = new AlertDialog.Builder(f2Var.f10627V);
                builder2.setTitle("Attention!");
                builder2.setMessage("You are going to reset all settings. This will replace any individual Fully settings by their default values and CAN'T BE UNDONE. Continue?");
                builder2.setCancelable(false);
                builder2.setPositiveButton("OK", new C0683d2(f2Var, 1));
                builder2.setNegativeButton(17039360, new V(14));
                a.Z0(builder2.create());
                return true;
            default:
                f2Var.f10627V.f9933V0.n(true, true, (Runnable) null);
                return true;
        }
    }
}
