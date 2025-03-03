package de.ozerov.fully;

import R2.c;
import U.p;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebStorage;
import android.widget.AdapterView;
import androidx.appcompat.widget.SwitchCompat;
import b3.C0528a;
import com.samsung.android.knox.EnterpriseDeviceManager;
import d3.g;
import d4.k;
import java.io.File;
import n2.a;

public final /* synthetic */ class L1 implements AdapterView.OnItemClickListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ N1 f10073U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ FullyActivity f10074V;

    public /* synthetic */ L1(N1 n12, FullyActivity fullyActivity) {
        this.f10073U = n12;
        this.f10074V = fullyActivity;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j7) {
        N1 n12 = this.f10073U;
        n12.getClass();
        FullyActivity fullyActivity = this.f10074V;
        if (!fullyActivity.f9921J0.i()) {
            c cVar = new c(fullyActivity, 29, n12);
            String str = ((J1) n12.f10160d.get(i)).f10020a;
            char c8 = 65535;
            switch (str.hashCode()) {
                case -2139206057:
                    if (str.equals("managePlaylist")) {
                        c8 = 0;
                        break;
                    }
                    break;
                case -1920025855:
                    if (str.equals("showDeviceInfo")) {
                        c8 = 1;
                        break;
                    }
                    break;
                case -1477009863:
                    if (str.equals("clearWebItems")) {
                        c8 = 2;
                        break;
                    }
                    break;
                case -1447616218:
                    if (str.equals("enableKiosk")) {
                        c8 = 3;
                        break;
                    }
                    break;
                case -1004684575:
                    if (str.equals("disableKiosk")) {
                        c8 = 4;
                        break;
                    }
                    break;
                case -852085810:
                    if (str.equals("migration")) {
                        c8 = 5;
                        break;
                    }
                    break;
                case -759238347:
                    if (str.equals("clearCache")) {
                        c8 = 6;
                        break;
                    }
                    break;
                case -505062682:
                    if (str.equals("openFile")) {
                        c8 = 7;
                        break;
                    }
                    break;
                case -185768912:
                    if (str.equals("gotoStartURL")) {
                        c8 = 8;
                        break;
                    }
                    break;
                case 3127582:
                    if (str.equals("exit")) {
                        c8 = 9;
                        break;
                    }
                    break;
                case 23620091:
                    if (str.equals("addToHome")) {
                        c8 = 10;
                        break;
                    }
                    break;
                case 94921639:
                    if (str.equals("crash")) {
                        c8 = 11;
                        break;
                    }
                    break;
                case 193527498:
                    if (str.equals("rateFully")) {
                        c8 = 12;
                        break;
                    }
                    break;
                case 483482804:
                    if (str.equals("singleAppManager")) {
                        c8 = 13;
                        break;
                    }
                    break;
                case 746581438:
                    if (str.equals("requestPermission")) {
                        c8 = 14;
                        break;
                    }
                    break;
                case 1203617803:
                    if (str.equals("getLicense")) {
                        c8 = 15;
                        break;
                    }
                    break;
                case 1434631203:
                    if (str.equals("settings")) {
                        c8 = 16;
                        break;
                    }
                    break;
                case 1572949979:
                    if (str.equals("clearAllCookies")) {
                        c8 = 17;
                        break;
                    }
                    break;
            }
            switch (c8) {
                case 0:
                    fullyActivity.C();
                    C0528a aVar = fullyActivity.f9921J0;
                    aVar.n(3);
                    ((FullyActivity) aVar.f8656d).f9916E0.a();
                    aVar.j();
                    throw null;
                case 1:
                    C0794w0.G0(fullyActivity);
                    return;
                case 2:
                    AlertDialog.Builder builder = new AlertDialog.Builder(fullyActivity);
                    builder.setTitle("Select Items to Delete");
                    View inflate = ((LayoutInflater) fullyActivity.getSystemService("layout_inflater")).inflate(2131558442, (ViewGroup) null);
                    builder.setView(inflate);
                    builder.setCancelable(true);
                    builder.setPositiveButton("Delete", new K1(cVar, (SwitchCompat) inflate.findViewById(2131361956), (SwitchCompat) inflate.findViewById(2131362144), (SwitchCompat) inflate.findViewById(2131362633), (SwitchCompat) inflate.findViewById(2131361923), (SwitchCompat) inflate.findViewById(2131362117), (SwitchCompat) inflate.findViewById(2131362415)));
                    builder.setNegativeButton("Cancel", new V(1));
                    a.Z0(builder.create());
                    return;
                case 3:
                    k kVar = fullyActivity.f9961z0;
                    kVar.getClass();
                    kVar.R2("kioskMode", true);
                    fullyActivity.f9952o1.c();
                    return;
                case 4:
                    fullyActivity.f9921J0.g();
                    return;
                case 5:
                    fullyActivity.C();
                    C0528a aVar2 = fullyActivity.f9921J0;
                    aVar2.n(3);
                    ((FullyActivity) aVar2.f8656d).f9916E0.a();
                    aVar2.j();
                    C0813z1 z1Var = new C0813z1();
                    z1Var.f9853i1 = new p(23, (Object) cVar);
                    z1Var.T(fullyActivity.l(), "localFilesMigrationSelector");
                    return;
                case 6:
                    fullyActivity.f9917F0.c();
                    try {
                        WebStorage.getInstance().deleteAllData();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    a.b1(fullyActivity, fullyActivity.getString(2131951963));
                    return;
                case 7:
                    C0528a aVar3 = new C0528a();
                    aVar3.f8653a = 0;
                    aVar3.f8655c = 0;
                    aVar3.f8656d = new File("/sdcard/Download");
                    aVar3.f8657f = new File("/sdcard/Download");
                    g gVar = new g(fullyActivity, aVar3);
                    gVar.setTitle("Pick a file to open");
                    gVar.f9745h0 = "Open".toString();
                    gVar.f9739b0 = new androidx.camera.lifecycle.c(7, cVar);
                    gVar.f9749l0 = fullyActivity.getWindow();
                    gVar.show();
                    return;
                case 8:
                    fullyActivity.C();
                    fullyActivity.f9921J0.c();
                    fullyActivity.f9951n1.getClass();
                    return;
                case 9:
                    fullyActivity.f9921J0.g();
                    return;
                case 10:
                    fullyActivity.f9917F0.a();
                    return;
                case 11:
                    throw new IllegalStateException("Test crash exception");
                case 12:
                    try {
                        fullyActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + fullyActivity.getPackageName())));
                    } catch (ActivityNotFoundException unused) {
                        a.a1(1, fullyActivity, "Unable to find the market app");
                    }
                    fullyActivity.f9921J0.c();
                    return;
                case 13:
                    fullyActivity.C();
                    fullyActivity.B(new J3());
                    n12.a();
                    return;
                case EnterpriseDeviceManager.KNOX_2_3:
                    int i8 = NotificationService.f10166V;
                    ProvisioningActivity.f(fullyActivity, new ComponentName(fullyActivity.getApplicationContext(), NotificationService.class));
                    return;
                case EnterpriseDeviceManager.KNOX_2_4:
                    n12.a();
                    fullyActivity.f9924M0.i(true, true);
                    return;
                case EnterpriseDeviceManager.KNOX_2_4_1:
                    if (!fullyActivity.y("preferences")) {
                        if (fullyActivity.f9961z0.Y1().booleanValue()) {
                            fullyActivity.f9958x1.c();
                        }
                        fullyActivity.C();
                        fullyActivity.getFragmentManager().beginTransaction().replace(2131362391, new C0695f2(), "preferences").addToBackStack("preferences").commitAllowingStateLoss();
                    }
                    fullyActivity.f9921J0.n(0);
                    n12.a();
                    return;
                case EnterpriseDeviceManager.KNOX_2_5:
                    CookieManager.getInstance().removeAllCookies((ValueCallback) null);
                    return;
                default:
                    a.b1(fullyActivity, "Feature " + str + " not found");
                    return;
            }
        }
    }
}
