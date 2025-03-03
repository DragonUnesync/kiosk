package de.ozerov.fully;

import A.e;
import B.j0;
import B3.m;
import B3.n;
import B3.q;
import D2.o;
import N5.f;
import N5.k;
import P5.O;
import Q.h;
import Q0.g;
import R2.c;
import U.d;
import U.p;
import V0.r;
import Z1.a;
import a1.C0410a;
import a1.C0412c;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.admin.DevicePolicyManager;
import android.app.admin.SystemUpdateInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.nfc.NfcAdapter;
import android.os.Bundle;
import android.os.Handler;
import android.os.PowerManager;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.support.v4.media.session.b;
import android.telephony.TelephonyManager;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextClock;
import androidx.appcompat.widget.Toolbar;
import b3.C0528a;
import com.bumptech.glide.j;
import com.samsung.android.knox.license.EnterpriseLicenseManager;
import com.samsung.android.knox.license.KnoxEnterpriseLicenseManager;
import de.ozerov.fully.motiondetector.MotionDetectorService;
import de.ozerov.fully.motiondetector.MotionDetectorServiceX;
import de.ozerov.fully.receiver.BootReceiver;
import de.ozerov.fully.receiver.CrashTestReceiver;
import de.ozerov.fully.remoteadmin.RemoteAdminService;
import h.C1000A;
import h.C1007H;
import h.C1012M;
import j$.util.Objects;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Timer;
import k2.C1160q;
import o.s1;
import org.altbeacon.beacon.BeaconManager;
import org.altbeacon.beacon.Identifier;
import org.altbeacon.beacon.Region;
import org.altbeacon.beacon.service.RangedBeacon;
import org.json.JSONObject;
import u.C1455O;

public class FullyActivity extends C0780t4 {

    /* renamed from: D1  reason: collision with root package name */
    public static long f9907D1 = -1;

    /* renamed from: E1  reason: collision with root package name */
    public static final /* synthetic */ int f9908E1 = 0;

    /* renamed from: A0  reason: collision with root package name */
    public final K2 f9909A0 = new K2(this, this);

    /* renamed from: A1  reason: collision with root package name */
    public final k f9910A1 = new k(this, RemoteAdminService.class, 1);

    /* renamed from: B0  reason: collision with root package name */
    public final c f9911B0 = new c(this);

    /* renamed from: B1  reason: collision with root package name */
    public final C0410a f9912B1 = new C0410a(20);

    /* renamed from: C0  reason: collision with root package name */
    public final Q3 f9913C0 = new Q3(this);

    /* renamed from: C1  reason: collision with root package name */
    public final k f9914C1 = new k(this, SoundMeterService.class, 2);

    /* renamed from: D0  reason: collision with root package name */
    public final r f9915D0 = new r(this, 2);

    /* renamed from: E0  reason: collision with root package name */
    public N1 f9916E0;

    /* renamed from: F0  reason: collision with root package name */
    public i5 f9917F0;

    /* renamed from: G0  reason: collision with root package name */
    public TouchableFrameLayout f9918G0;

    /* renamed from: H0  reason: collision with root package name */
    public d f9919H0;

    /* renamed from: I0  reason: collision with root package name */
    public O f9920I0;

    /* renamed from: J0  reason: collision with root package name */
    public C0528a f9921J0;

    /* renamed from: K0  reason: collision with root package name */
    public W3 f9922K0;

    /* renamed from: L0  reason: collision with root package name */
    public C0674c f9923L0;

    /* renamed from: M0  reason: collision with root package name */
    public h f9924M0;

    /* renamed from: N0  reason: collision with root package name */
    public C0674c f9925N0;

    /* renamed from: O0  reason: collision with root package name */
    public j f9926O0;

    /* renamed from: P0  reason: collision with root package name */
    public O1 f9927P0;

    /* renamed from: Q0  reason: collision with root package name */
    public V4 f9928Q0;

    /* renamed from: R0  reason: collision with root package name */
    public c f9929R0;

    /* renamed from: S0  reason: collision with root package name */
    public o f9930S0;

    /* renamed from: T0  reason: collision with root package name */
    public q f9931T0;

    /* renamed from: U0  reason: collision with root package name */
    public C0770s0 f9932U0;

    /* renamed from: V0  reason: collision with root package name */
    public j0 f9933V0;

    /* renamed from: W0  reason: collision with root package name */
    public C1455O f9934W0;

    /* renamed from: X0  reason: collision with root package name */
    public q f9935X0;

    /* renamed from: Y0  reason: collision with root package name */
    public C0410a f9936Y0;

    /* renamed from: Z0  reason: collision with root package name */
    public A3 f9937Z0;

    /* renamed from: a1  reason: collision with root package name */
    public e f9938a1;

    /* renamed from: b1  reason: collision with root package name */
    public K2 f9939b1;

    /* renamed from: c1  reason: collision with root package name */
    public Z1.c f9940c1;

    /* renamed from: d1  reason: collision with root package name */
    public s1 f9941d1;

    /* renamed from: e1  reason: collision with root package name */
    public a f9942e1;

    /* renamed from: f1  reason: collision with root package name */
    public C0797w3 f9943f1;

    /* renamed from: g1  reason: collision with root package name */
    public E3 f9944g1;

    /* renamed from: h1  reason: collision with root package name */
    public C0703g4 f9945h1;

    /* renamed from: i1  reason: collision with root package name */
    public C0674c f9946i1;

    /* renamed from: j1  reason: collision with root package name */
    public K2 f9947j1;

    /* renamed from: k1  reason: collision with root package name */
    public C7.d f9948k1;

    /* renamed from: l1  reason: collision with root package name */
    public G2 f9949l1;

    /* renamed from: m1  reason: collision with root package name */
    public J0 f9950m1;

    /* renamed from: n1  reason: collision with root package name */
    public C0674c f9951n1;

    /* renamed from: o1  reason: collision with root package name */
    public E3 f9952o1;

    /* renamed from: p1  reason: collision with root package name */
    public Y3 f9953p1;

    /* renamed from: q1  reason: collision with root package name */
    public boolean f9954q1 = false;

    /* renamed from: r1  reason: collision with root package name */
    public boolean f9955r1 = false;
    public int s1;
    public final Handler t1 = new Handler();

    /* renamed from: u1  reason: collision with root package name */
    public long f9956u1 = 0;

    /* renamed from: v1  reason: collision with root package name */
    public long f9957v1;
    public long w1 = 0;

    /* renamed from: x1  reason: collision with root package name */
    public k f9958x1;

    /* renamed from: y0  reason: collision with root package name */
    public final String f9959y0 = getClass().getSimpleName();

    /* renamed from: y1  reason: collision with root package name */
    public final S f9960y1 = new L(this, CloudService.class);

    /* renamed from: z0  reason: collision with root package name */
    public d4.k f9961z0;

    /* renamed from: z1  reason: collision with root package name */
    public final k f9962z1 = new k(this, TaskProtectorService.class, 3);

    static {
        System.loadLibrary("mycpp");
    }

    public static void D(FullyActivity fullyActivity, Intent intent, int i, Bundle bundle) {
        fullyActivity.getClass();
        try {
            super.startActivityForResult(intent, i, bundle);
        } catch (SecurityException e) {
            Log.w(fullyActivity.f9959y0, "Can't start intent " + n2.a.o0(intent) + " due to " + e.getMessage());
        }
    }

    public final Bundle E() {
        boolean z;
        SystemUpdateInfo systemUpdateInfo;
        Bundle bundle = new Bundle();
        bundle.putString("appStartTime", (String) this.f9919H0.f5259X);
        bundle.putString("topFragmentTag", u());
        bundle.putBoolean("maintenanceMode", this.f9942e1.f6946a);
        bundle.putBoolean("kioskMode", this.f9921J0.f8654b);
        bundle.putBoolean("kioskLocked", this.f9921J0.i());
        if (C0813z1.f11119p1) {
            bundle.putBoolean("localFilesAlert", true);
        }
        bundle.putLong("lastUserInteractionTime", this.f9945h1.f10653f);
        bundle.putBoolean("motionDetectorStarted", this.f9958x1.f());
        bundle.putBoolean("isMenuOpen", this.f9916E0.b());
        bundle.putBoolean("isInScreensaver", this.f9943f1.f11044c);
        bundle.putBoolean("isInDaydream", this.f9943f1.f11046f);
        bundle.putBoolean("isLicensed", h.f4003X);
        bundle.putBoolean("isInForcedSleep", this.f9944g1.f9883c);
        if (!this.f9961z0.Q1().booleanValue() || !P.f10240j) {
            z = false;
        } else {
            z = true;
        }
        bundle.putBoolean("isRooted", z);
        bundle.putInt("displayWidthPixels", C0794w0.v(this));
        bundle.putInt("displayHeightPixels", C0794w0.u(this));
        if (this.f9961z0.z1().booleanValue()) {
            bundle.putBoolean("mqttConnected", this.f9935X0.Q());
        }
        bundle.putBoolean("scopedStorage", !n2.a.u0());
        if (this.f9961z0.u().booleanValue()) {
            bundle.putString("cloudStatus", CloudService.f9835j0);
        }
        if (this.f9913C0.f10299d != null) {
            bundle.putString("soundUrlPlaying", this.f9913C0.f10299d);
        }
        ArrayList arrayList = I1.f10008a;
        if (!C0794w0.Z(this) || !n2.a.B0()) {
            systemUpdateInfo = null;
        } else {
            systemUpdateInfo = ((DevicePolicyManager) getSystemService("device_policy")).getPendingSystemUpdate(DeviceOwnerReceiver.a(this));
        }
        if (systemUpdateInfo != null && n2.a.B0()) {
            bundle.putString("systemUpdateReceived", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date(systemUpdateInfo.getReceivedTime())));
            bundle.putInt("systemUpdateSecurityPatchState", systemUpdateInfo.getSecurityPatchState());
        }
        bundle.putBoolean("systemSigned", C0794w0.j0(this, getPackageName()));
        return bundle;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i;
        s1 s1Var = this.f9941d1;
        s1Var.getClass();
        if (keyEvent.getAction() == 0 && !((FullyActivity) s1Var.f14070a).v()) {
            d4.k kVar = (d4.k) s1Var.f14071b;
            if (((Z1.c) kVar.f9767W).n("barcodeScanListenKeys", false)) {
                if (!(keyEvent.getKeyCode() == 66 || keyEvent.getUnicodeChar() == 0)) {
                    s1Var.f14074f = ((String) s1Var.f14074f) + ((char) keyEvent.getUnicodeChar());
                }
                if (keyEvent.getKeyCode() == 66) {
                    s1Var.a((String) s1Var.f14074f, (String) null, kVar.q());
                    s1Var.f14074f = "";
                }
            }
        }
        if (keyEvent.getKeyCode() == 25 && keyEvent.getAction() == 1) {
            int i8 = TouchableFrameLayout.f10402i0;
            if (System.currentTimeMillis() - TouchableFrameLayout.f10401h0 >= 3000 || (i = TouchableFrameLayout.f10403j0) != 1) {
                TouchableFrameLayout.f10403j0 = 0;
            } else {
                TouchableFrameLayout.f10403j0 = i + 1;
            }
            U0.e("volumeDown", (HashMap) null);
            this.f9935X0.b0("volumeDown", (JSONObject) null);
        }
        if (keyEvent.getKeyCode() == 24 && keyEvent.getAction() == 1) {
            TouchableFrameLayout.f10403j0 = 1;
            TouchableFrameLayout.f10401h0 = System.currentTimeMillis();
            U0.e("volumeUp", (HashMap) null);
            this.f9935X0.b0("volumeUp", (JSONObject) null);
        }
        if (keyEvent.getKeyCode() == 82 && keyEvent.getAction() == 1) {
            if (this.f9916E0.b() || (this.f9921J0.f8654b && !this.f9961z0.b0().equals(getResources().getString(2131951775)))) {
                this.f9921J0.c();
            } else {
                this.f9916E0.c();
            }
            return true;
        }
        List asList = Arrays.asList(new Integer[]{25, 24});
        if (asList.contains(Integer.valueOf(keyEvent.getKeyCode())) && this.f9961z0.G().booleanValue() && this.f9921J0.i()) {
            return true;
        }
        asList.contains(Integer.valueOf(keyEvent.getKeyCode()));
        return super.dispatchKeyEvent(keyEvent);
    }

    public final int getTaskId() {
        try {
            return super.getTaskId();
        } catch (Exception unused) {
            return -1;
        }
    }

    public final boolean moveTaskToBack(boolean z) {
        try {
            return super.moveTaskToBack(z);
        } catch (Exception e) {
            Log.e(this.f9959y0, "moveTaskToBack failed: " + e.getMessage());
            return false;
        }
    }

    public native void nativeCrash();

    /* JADX WARNING: type inference failed for: r2v9, types: [android.webkit.ValueCallback, android.net.Uri, java.lang.String] */
    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: type inference failed for: r2v12 */
    public final void onActivityResult(int i, int i8, Intent intent) {
        Uri data;
        ? r22;
        int i9 = i;
        int i10 = i8;
        super.onActivityResult(i, i8, intent);
        if (i9 == 1023) {
            q qVar = this.f9931T0;
            qVar.getClass();
            if (i10 == -1 && intent != null) {
                Uri data2 = intent.getData();
                Objects.toString(data2);
                if (data2 != null) {
                    String L8 = n2.a.L(this, data2);
                    if (L8 == null) {
                        Log.e("FullySettingsExportImport", "Failed to get filename for URI " + data2.toString());
                        n2.a.b1((Activity) qVar.f449U, "Failed to get filename for " + data2.toString());
                    } else {
                        new Thread(new C0776t0(qVar, this, data2, L8, 0)).start();
                    }
                }
            }
        }
        if (i9 == 1024) {
            q qVar2 = this.f9931T0;
            qVar2.getClass();
            if (i10 == -1 && intent != null) {
                Uri data3 = intent.getData();
                Objects.toString(data3);
                if (data3 != null) {
                    String L9 = n2.a.L(this, data3);
                    if (L9 == null) {
                        Log.e("FullySettingsExportImport", "Failed to get filename for URI " + data3);
                        n2.a.b1((Activity) qVar2.f449U, "Failed to get filename for " + data3);
                    } else {
                        new Thread(new C0776t0(qVar2, this, data3, L9, 1)).start();
                    }
                }
            }
        }
        if (i9 != 1025) {
            if (i9 == 1026) {
                ArrayList arrayList = U0.i;
                Log.i("JsInterface", "Return from the startActivityForResult() call with code " + i10);
                HashMap hashMap = new HashMap();
                hashMap.put("$code", String.valueOf(i8));
                hashMap.put("$data", n2.a.N(intent).toString().replace("\\/", "/"));
                U0.e("onActivityResult", hashMap);
            }
            if (i9 == 1015) {
                ArrayList arrayList2 = I1.f10008a;
                if (C0794w0.Z(this)) {
                    DeviceOwnerReceiver.a(this);
                    if (!((DevicePolicyManager) getSystemService("device_policy")).isActivePasswordSufficient()) {
                        n2.a.b1(this, "Lock screen protection does not match the device security policy, disabling apps");
                        if (C0794w0.Z(this)) {
                            DevicePolicyManager devicePolicyManager = (DevicePolicyManager) getSystemService("device_policy");
                            ComponentName a8 = DeviceOwnerReceiver.a(this);
                            PackageManager packageManager = getPackageManager();
                            d4.k kVar = new d4.k((Context) this, 1);
                            if (((Z1.c) kVar.f9767W).r("emmHiddenPackages", "").isEmpty()) {
                                List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(new Intent("android.app.action.SET_NEW_PASSWORD"), 0);
                                ArrayList arrayList3 = new ArrayList();
                                for (ResolveInfo resolveInfo : queryIntentActivities) {
                                    arrayList3.add(resolveInfo.activityInfo.packageName);
                                }
                                List<PackageInfo> installedPackages = packageManager.getInstalledPackages(0);
                                ArrayList arrayList4 = new ArrayList();
                                for (PackageInfo next : installedPackages) {
                                    if (arrayList3.contains(next.packageName)) {
                                        Log.i("I1", "Package " + next.packageName + " is settings");
                                    } else if (devicePolicyManager.isApplicationHidden(a8, next.packageName)) {
                                        Log.i("I1", "Package " + next.packageName + " is hidden");
                                    } else if (next.packageName.equals(getApplicationContext().getPackageName())) {
                                        Log.i("I1", "Package " + next.packageName + " is my own");
                                    } else if (C0794w0.F(this, next.packageName) == null) {
                                        Log.i("I1", "Package " + next.packageName + " has no launcher");
                                    } else {
                                        Log.i("I1", "Package " + next.packageName + " is going to be disabled");
                                        devicePolicyManager.setApplicationHidden(a8, next.packageName, true);
                                        arrayList4.add(next.packageName);
                                    }
                                }
                                kVar.V2("emmHiddenPackages", n2.a.H0(arrayList4));
                                Log.i("I1", "Save disabled packages: " + n2.a.H0(arrayList4));
                            }
                        }
                    } else {
                        n2.a.b1(this, "Enabling apps");
                        I1.d(this);
                    }
                }
            }
            if (i9 == 1011) {
                V4 v4 = this.f9928Q0;
                v4.getClass();
                ArrayList arrayList5 = new ArrayList();
                if (v4.f10454n == null) {
                    Log.w("V4", "onUploadFiles failed as uploadCallback=null");
                } else {
                    if (intent == null || (intent.getDataString() == null && intent.getClipData() == null)) {
                        String str = v4.f10455o;
                        if (str != null) {
                            if (!n2.a.v0(str)) {
                                arrayList5.add(v4.f10458r);
                            } else {
                                n2.a.w(v4.f10455o);
                            }
                        }
                        String str2 = v4.f10456p;
                        if (str2 != null) {
                            if (!n2.a.v0(str2)) {
                                arrayList5.add(v4.f10458r);
                            } else {
                                n2.a.w(v4.f10456p);
                            }
                        }
                        String str3 = v4.f10457q;
                        if (str3 != null) {
                            if (!n2.a.v0(str3)) {
                                arrayList5.add(v4.f10460t);
                            } else {
                                n2.a.w(v4.f10457q);
                            }
                        }
                    } else {
                        String dataString = intent.getDataString();
                        if (dataString != null) {
                            arrayList5.add(Uri.parse(dataString));
                            if (v4.f10455o != null && !dataString.equals(v4.f10458r.toString())) {
                                n2.a.w(v4.f10455o);
                            }
                            if (v4.f10456p != null && !dataString.equals(v4.f10459s.toString())) {
                                n2.a.w(v4.f10456p);
                            }
                            if (v4.f10457q != null && !dataString.equals(v4.f10460t.toString())) {
                                n2.a.w(v4.f10457q);
                            }
                        } else if (intent.getClipData() != null) {
                            int itemCount = intent.getClipData().getItemCount();
                            for (int i11 = 0; i11 < itemCount; i11++) {
                                arrayList5.add(intent.getClipData().getItemAt(i11).getUri());
                                Objects.toString(intent.getClipData().getItemAt(i11).getUri());
                            }
                        } else {
                            n2.a.w(v4.f10455o);
                            n2.a.w(v4.f10456p);
                            n2.a.w(v4.f10457q);
                        }
                    }
                    do {
                    } while (arrayList5.remove((Object) null));
                    if (!arrayList5.isEmpty()) {
                        v4.f10454n.onReceiveValue((Uri[]) arrayList5.toArray(new Uri[0]));
                        r22 = 0;
                    } else {
                        r22 = 0;
                        v4.f10454n.onReceiveValue((Object) null);
                    }
                    v4.f10454n = r22;
                    v4.f10455o = r22;
                    v4.f10456p = r22;
                    v4.f10457q = r22;
                    v4.f10458r = r22;
                    v4.f10459s = r22;
                    v4.f10460t = r22;
                }
            }
            if (i9 == 1019 && n2.a.z0() && intent != null && (data = intent.getData()) != null) {
                grantUriPermission(getPackageName(), data, 3);
                getContentResolver().takePersistableUriPermission(data, intent.getFlags() & 3);
            }
            if (i9 == 1017 && n2.a.y0() && !((PowerManager) getApplicationContext().getSystemService("power")).isIgnoringBatteryOptimizations(getPackageName())) {
                n2.a.b1(this, "Failed to get Prevent Device from Sleep permission for Fully");
            }
            if (i9 == 1021 && n2.a.q0()) {
                C0813z1.V(this);
            }
            if (i9 == 1002 && n2.a.y0() && (this.f9961z0.Z().booleanValue() || this.f9955r1)) {
                C0794w0.l0(this, this.f9961z0.a0().booleanValue());
            }
            if (i9 == 1001 && n2.a.y0()) {
                if (!Settings.canDrawOverlays(this)) {
                    n2.a.b1(this, "Please give Fully required permissions in order to use the selected features.");
                } else {
                    if (this.f9961z0.s1().booleanValue()) {
                        this.f9958x1.b();
                    }
                    this.f9922K0.k();
                    this.f9929R0.H();
                    this.f9953p1.b();
                }
            }
            if (i9 == 1009) {
                C0794w0.X(this);
                C0794w0.Y(this);
                if (!C0794w0.X(this)) {
                    n2.a.b1(this, "Failed to get device admin permission for Fully");
                } else {
                    Z0.b(this);
                }
            }
            if (i9 == 1010) {
                C0794w0.X(this);
                C0794w0.Y(this);
                if (!C0794w0.Y(this)) {
                    n2.a.b1(this, "Failed to get device admin permission for Fully");
                    return;
                }
                if (C0794w0.Y(this) && C0794w0.X(this)) {
                    ((DevicePolicyManager) getSystemService("device_policy")).removeActiveAdmin(new ComponentName(getApplicationContext(), MyDeviceAdmin.class));
                }
                if (this.f9961z0.c0().booleanValue() && ((Z1.c) this.f9961z0.f9767W).n("lockSafeMode", false) && !this.f9961z0.d0().isEmpty() && ((C0794w0.Y(this) || C0794w0.Z(this)) && !P.N(this, this.f9961z0.d0()))) {
                    n2.a.b1(this, "Failed to set the Kiosk PIN for the Safe Mode lock");
                }
                if (this.f9961z0.c0().booleanValue() && ((Z1.c) this.f9961z0.f9767W).n("disableCamera", false) && (C0794w0.Y(this) || C0794w0.Z(this))) {
                    P.M(this, true);
                }
                Z0.b(this);
                return;
            }
            return;
        }
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0087, code lost:
        r0 = r3.f9917F0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBackPressed() {
        /*
            r3 = this;
            de.ozerov.fully.w3 r0 = r3.f9943f1
            r1 = 0
            r0.f11046f = r1
            Z1.a r0 = r3.f9942e1
            boolean r0 = r0.f6946a
            if (r0 == 0) goto L_0x000c
            return
        L_0x000c:
            de.ozerov.fully.N1 r0 = r3.f9916E0
            r0.b()
            de.ozerov.fully.N1 r0 = r3.f9916E0
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x0020
            b3.a r0 = r3.f9921J0
            r0.c()
            goto L_0x0107
        L_0x0020:
            de.ozerov.fully.i5 r0 = r3.f9917F0
            boolean r0 = r0.m()
            if (r0 == 0) goto L_0x003d
            de.ozerov.fully.i5 r0 = r3.f9917F0
            de.ozerov.fully.g5 r0 = r0.f10711d
            if (r0 == 0) goto L_0x0107
            de.ozerov.fully.m2 r0 = r0.f10665h
            if (r0 == 0) goto L_0x0107
            boolean r1 = r0 instanceof de.ozerov.fully.C0743n2
            if (r1 == 0) goto L_0x0107
            de.ozerov.fully.n2 r0 = (de.ozerov.fully.C0743n2) r0
            r0.b()
            goto L_0x0107
        L_0x003d:
            de.ozerov.fully.V4 r0 = r3.f9928Q0
            de.ozerov.fully.n r0 = r0.f10445c
            if (r0 == 0) goto L_0x0052
            boolean r0 = r0.l()
            if (r0 == 0) goto L_0x0052
            de.ozerov.fully.V4 r0 = r3.f9928Q0
            de.ozerov.fully.n r0 = r0.f10445c
            r0.i()
            goto L_0x0107
        L_0x0052:
            boolean r0 = r3.v()
            if (r0 == 0) goto L_0x0078
            androidx.fragment.app.L r0 = r3.l()
            java.lang.String r1 = r3.u()
            androidx.fragment.app.v r0 = r0.C(r1)
            boolean r1 = r0 instanceof de.ozerov.fully.C0811z
            if (r1 == 0) goto L_0x006f
            de.ozerov.fully.z r0 = (de.ozerov.fully.C0811z) r0
            r0.b()
            goto L_0x0107
        L_0x006f:
            boolean r0 = r3.f10980u0
            if (r0 == 0) goto L_0x0107
            r3.C()
            goto L_0x0107
        L_0x0078:
            d4.k r0 = r3.f9961z0
            java.lang.Object r0 = r0.f9767W
            Z1.c r0 = (Z1.c) r0
            java.lang.String r1 = "enableBackButton"
            r2 = 1
            boolean r0 = r0.n(r1, r2)
            if (r0 == 0) goto L_0x00c0
            de.ozerov.fully.i5 r0 = r3.f9917F0
            de.ozerov.fully.g5 r1 = r0.f10711d
            if (r1 == 0) goto L_0x00c0
            de.ozerov.fully.MyWebView r1 = r1.f10664g
            if (r1 == 0) goto L_0x0098
            boolean r1 = r1.canGoBack()
            if (r1 == 0) goto L_0x0098
            goto L_0x009e
        L_0x0098:
            de.ozerov.fully.g5 r0 = r0.f10711d
            boolean r0 = r0.f10668l
            if (r0 == 0) goto L_0x00c0
        L_0x009e:
            de.ozerov.fully.i5 r0 = r3.f9917F0
            de.ozerov.fully.g5 r1 = r0.f10711d
            if (r1 == 0) goto L_0x00b4
            de.ozerov.fully.MyWebView r1 = r1.f10664g
            if (r1 == 0) goto L_0x00b4
            boolean r1 = r1.canGoBack()
            if (r1 == 0) goto L_0x00b4
            de.ozerov.fully.g5 r0 = r0.f10711d
            r0.c()
            goto L_0x0107
        L_0x00b4:
            de.ozerov.fully.g5 r1 = r0.f10711d
            if (r1 == 0) goto L_0x0107
            boolean r2 = r1.f10668l
            if (r2 == 0) goto L_0x0107
            r0.e(r1)
            goto L_0x0107
        L_0x00c0:
            android.content.Intent r0 = r3.getIntent()
            if (r0 == 0) goto L_0x00e4
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r0 = r0.getAction()
            if (r0 == 0) goto L_0x00e4
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r0 = r0.getAction()
            java.lang.String r1 = "android.intent.action.VIEW"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00e4
            r3.moveTaskToBack(r2)
            goto L_0x0107
        L_0x00e4:
            boolean r0 = de.ozerov.fully.P.y(r3)
            if (r0 == 0) goto L_0x00fe
            b3.a r0 = r3.f9921J0
            boolean r0 = r0.f8654b
            if (r0 != 0) goto L_0x00fe
            de.ozerov.fully.N1 r0 = r3.f9916E0
            boolean r0 = r0.b()
            if (r0 != 0) goto L_0x00fe
            de.ozerov.fully.N1 r0 = r3.f9916E0
            r0.c()
            goto L_0x0107
        L_0x00fe:
            b3.a r0 = r3.f9921J0
            boolean r0 = r0.f8654b
            if (r0 != 0) goto L_0x0107
            r3.moveTaskToBack(r2)
        L_0x0107:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.FullyActivity.onBackPressed():void");
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        N1 n12 = this.f9916E0;
        if (n12 != null) {
            n12.f10159c.setBehindWidth(n2.a.p(280.0f, n12.e));
        }
        if (this.f9961z0.N1().booleanValue() || this.f9961z0.O1().booleanValue()) {
            C0794w0.u0(this, this.f9961z0.N1().booleanValue(), this.f9961z0.O1().booleanValue());
        }
    }

    /* JADX WARNING: type inference failed for: r0v39, types: [b3.a, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v52, types: [u.O, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v54, types: [java.lang.Object, B3.q] */
    /* JADX WARNING: type inference failed for: r0v98, types: [O5.h, android.content.BroadcastReceiver] */
    /* JADX WARNING: type inference failed for: r4v13, types: [android.content.BroadcastReceiver, O5.b] */
    /* JADX WARNING: type inference failed for: r0v108, types: [android.content.BroadcastReceiver, O5.a] */
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        Class cls;
        boolean z;
        ActivityManager activityManager;
        List<ActivityManager.AppTask> appTasks;
        CharSequence charSequence;
        long currentTimeMillis = System.currentTimeMillis();
        f9907D1 = currentTimeMillis;
        this.f9957v1 = currentTimeMillis;
        this.f9961z0 = new d4.k((Context) this, 1);
        this.f9932U0 = new C0770s0(this);
        this.f9931T0 = new q((Activity) this);
        Intent intent = getIntent();
        if (intent != null) {
            Log.i(this.f9959y0, n2.a.o0(intent));
            Bundle extras = intent.getExtras();
            if (extras != null && extras.containsKey("isLauncher")) {
                this.f9954q1 = intent.getBooleanExtra("isLauncher", false);
            }
            if (extras != null && extras.containsKey("isDaydream")) {
                this.f9955r1 = intent.getBooleanExtra("isDaydream", false);
            }
        }
        Log.i(this.f9959y0, "onCreate (isLauncher " + this.f9954q1 + " isDaydream " + this.f9955r1 + ") TaskID=" + getTaskId());

        try {
            for (ActivityManager.AppTask next : ((ActivityManager) getSystemService("activity")).getAppTasks()) {
                Intent e = next.getTaskInfo().baseIntent;
                int i = next.getTaskInfo().id;
                Objects.toString(e);
                if (!(next.getTaskInfo().id == getTaskId() || e.getComponent() == null || !e.getComponent().getClassName().equals(FullyActivity.class.getName()))) {
                    if (e.hasCategory("android.intent.category.HOME")) {
                        String str3 = "FullyActivity started by " + n2.a.o0(intent) + " launched already on another task by " + n2.a.o0(e);
                        Log.w(this.f9959y0, str3);
                        C0794w0.q0(1, this.f9959y0, str3);
                    } else {
                        String str4 = "FullyActivity started by " + n2.a.o0(intent) + " launched already on another task by " + n2.a.o0(e);
                        Log.w(this.f9959y0, str4);
                        C0794w0.q0(1, this.f9959y0, str4);
                    }
                }
            }
        } catch (Exception e8) {
            g.x(e8, new StringBuilder("Failed to get task list due to "), this.f9959y0);
        }
        C1160q.J(this);
        super.onCreate(bundle);
        if (this.f9961z0.c0().booleanValue() && ((Z1.c) this.f9961z0.f9767W).n("disableScreenshots", false)) {
            getWindow().setFlags(8192, 8192);
        }
        try {
            setContentView(2131558429);
            try {
                getResources().getResourceEntryName(this.s1);
            } catch (Exception e9) {
                e9.getMessage();
            }
            if (System.currentTimeMillis() < 1704063600000L) {
                n2.a.b1(this, "System time isn't set properly. Many app functions will fail!");
            }
            if (!(intent == null || intent.getStringExtra("reason") == null)) {
                n2.a.b1(this, "Fully restarts after " + intent.getStringExtra("reason"));
            }
            new W0(this);
            if (((Z1.c) this.f9961z0.f9767W).q("firstAppInstallVersionCode", 0) == 0) {
                str2 = ", ver. 1.17.1 (101362), first app start, Device ID " + P.i(this);
            } else {
                str2 = ", ver. 1.17.1 (101362)";
            }
            if (intent != null && intent.getStringExtra("reason") != null) {
                C0794w0.q0(1, this.f9959y0, "Restart app after " + intent.getStringExtra("reason") + str2);
            } else if (this.f9954q1) {
                C0794w0.q0(0, this.f9959y0, "Start app as launcher" + str2);
            } else {
                C0794w0.q0(0, this.f9959y0, "Start app normally" + str2);
            }
            this.f9961z0.Q2();
            PreferenceManager.getDefaultSharedPreferences(this);
            this.f9932U0.h(this);
            if (!((Z1.c) this.f9961z0.f9767W).n("isSettingImportedFromAssets", false)) {
                q qVar = this.f9931T0;
                qVar.getClass();
                try {
                    qVar.P(((Activity) qVar.f449U).getAssets().open("fully-single-app-auto-settings.json"), "assets://fully-single-app-auto-settings.json", 0);
                } catch (Exception unused) {
                }
                d4.k kVar = this.f9961z0;
                kVar.getClass();
                kVar.R2("isSettingImportedFromAssets", true);
            }
            this.f9931T0.V();
            if (((Z1.c) this.f9961z0.f9767W).n("autoImportSettings", true)) {
                this.f9931T0.m();
                this.f9931T0.V();
            }
            C0770s0 s0Var = this.f9932U0;
            ArrayList c8 = C0770s0.c(s0Var.f10938a, 2);
            SharedPreferences.Editor edit = s0Var.f10940c.edit();
            Iterator it = c8.iterator();
            while (it.hasNext()) {
                edit.remove((String) it.next());
            }
            edit.commit();
            PreferenceManager.setDefaultValues(s0Var.f10939b, 2132148232, true);
            d4.k kVar2 = this.f9961z0;
            kVar2.getClass();
            kVar2.R2("isRunning", true);
            if (this.f9961z0.u2().booleanValue()) {
                C0794w0.W(this);
                if (C0794w0.f11017a && C0794w0.f11018b != null) {
                    C0794w0.a();
                    C0794w0.f11018b.f11061k++;
                }
            }
            Toolbar toolbar = (Toolbar) findViewById(2131361842);
            C1000A a8 = (C1000A) j();
            if (a8.f12077d0 instanceof Activity) {
                a8.C();
                b bVar = a8.f12082i0;
                if (!(bVar instanceof C1012M)) {
                    a8.f12083j0 = null;
                    if (bVar != null) {
                        bVar.x();
                    }
                    a8.f12082i0 = null;
                    if (toolbar != null) {
                        Object obj = a8.f12077d0;
                        if (obj instanceof Activity) {
                            charSequence = ((Activity) obj).getTitle();
                        } else {
                            charSequence = a8.f12084k0;
                        }
                        C1007H h5 = new C1007H(toolbar, charSequence, a8.f12080g0);
                        a8.f12082i0 = h5;
                        a8.f12080g0.f12237V = h5.f12115c;
                        toolbar.setBackInvokedCallbackEnabled(true);
                    } else {
                        a8.f12080g0.f12237V = null;
                    }
                    a8.b();
                } else {
                    throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
                }
            }
            ? obj2 = new Object();
            obj2.f8653a = 3;
            obj2.f8654b = false;
            obj2.f8655c = -1;
            obj2.f8657f = new f(6, obj2);
            obj2.f8656d = this;
            obj2.e = this.f9961z0;
            this.f9921J0 = obj2;
            this.f9919H0 = new d(this);
            this.f9920I0 = new O(this);
            this.f9933V0 = new j0((Activity) this);
            this.f9922K0 = new W3(this);
            this.f9924M0 = new h(this);
            this.f9925N0 = new C0674c(this, 3);
            this.f9926O0 = new j(this);
            this.f9923L0 = new C0674c(this, 0);
            this.f9927P0 = new O1(this);
            this.f9929R0 = new c((Context) this, 25);
            this.f9930S0 = new o(10, (Object) this);
            this.f9928Q0 = new V4(this);
            ? obj3 = new Object();
            obj3.f15529a = new Region("AllFullyBeacons", (Identifier) null, (Identifier) null, (Identifier) null);
            obj3.f15533f = new G(obj3);
            obj3.f15530b = this;
            obj3.f15531c = new d4.k((Context) this, 1);
            this.f9934W0 = obj3;
            this.f9916E0 = new N1(this);
            ? obj4 = new Object();
            obj4.f451W = this;
            obj4.f452X = new d4.k((Context) this, 1);
            this.f9935X0 = obj4;
            C0410a aVar = new C0410a(24);
            new d4.k((Context) this, 1);
            this.f9936Y0 = aVar;
            this.f9937Z0 = new A3(this);
            this.f9938a1 = new e(this);
            this.f9939b1 = new K2(this, 1);
            this.f9940c1 = new Z1.c(this, 12);
            this.f9949l1 = new G2(this);
            this.f9950m1 = new J0(this);
            this.f9951n1 = new C0674c(this, 2);
            this.f9952o1 = new E3(this, 0);
            this.f9941d1 = new s1(this);
            this.f9942e1 = new a(this);
            this.f9953p1 = new Y3(this);
            this.f9943f1 = new C0797w3(this);
            this.f9944g1 = new E3(this, 1);
            this.f9945h1 = new C0703g4(this);
            this.f9946i1 = new C0674c(this, 1);
            this.f9947j1 = new K2(this, 0);
            this.f9948k1 = new C7.d(this);
            if (new d4.k((Context) this, 1).r1() == 2) {
                cls = MotionDetectorServiceX.class;
            } else {
                cls = MotionDetectorService.class;
            }
            this.f9958x1 = new k(this, cls, 0);
            this.f9917F0 = new i5(this, this.f9928Q0, 2131362639);
            CrashTestReceiver.a(this);
            C0528a aVar2 = this.f9921J0;
            d4.k kVar3 = (d4.k) aVar2.e;
            boolean booleanValue = kVar3.c0().booleanValue();
            FullyActivity fullyActivity = (FullyActivity) aVar2.f8656d;
            if (!booleanValue || (!fullyActivity.f9954q1 && kVar3.C().booleanValue())) {
                z = false;
            } else {
                z = true;
            }
            aVar2.f8654b = z;
            aVar2.n(aVar2.f8653a);
            L0.c.a(fullyActivity).b((f) aVar2.f8657f, new IntentFilter("com.fullykiosk.singleapp.action.put_pin"));
            aVar2.j();
            if (aVar2.f8654b && !n2.a.y0() && (activityManager = (ActivityManager) fullyActivity.getSystemService("activity")) != null && (appTasks = activityManager.getAppTasks()) != null && !appTasks.isEmpty()) {
                appTasks.get(0).setExcludeFromRecents(true);
            }
            String str5 = new String(Base64.decode("Tm9uLWdlbnVpbmUgQVBLIGRldGVjdGVk", 2));
            if (((Z1.c) kVar3.f9767W).q("hourCounter", 0) > 24) {
                ArrayList P8 = C0794w0.P(fullyActivity, fullyActivity.getPackageName());
                if (P8 != null) {
                    Iterator it2 = P8.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        String str6 = (String) it2.next();
                        if (!str6.startsWith("bf9a9e13ed7140af")) {
                            if (!str6.startsWith("d37f91d2af566ba3")) {
                                if (!str6.startsWith("0f473fad30885b84")) {
                                    if (!str6.startsWith("faddfdff0cee615a")) {
                                        if (!str6.startsWith("2d370c21f5dfd553")) {
                                            if (str6.startsWith("4867371cf34affca")) {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                n2.a.b1(fullyActivity, str5);
                Log.w("", str5);
                fullyActivity.f9919H0.d(true);
            }
            g5.f10658x = 0;
            d dVar = this.f9919H0;
            dVar.getClass();
            dVar.f5259X = new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.getDefault()).format(new Date(System.currentTimeMillis()));
            W3 w32 = this.f9922K0;
            w32.e();
            C0794w0.b(w32.f10477b);
            w32.k();
            O o2 = this.f9920I0;
            FullyActivity fullyActivity2 = o2.f10171a;
            L0.c.a(fullyActivity2).b(o2.f10188t, new IntentFilter("com.fullykiosk.singleapp.event.keyboard_hide"));
            L0.c.a(fullyActivity2).b(o2.f10189u, new IntentFilter("com.fullykiosk.singleapp.event.keyboard_show"));
            L0.c.a(fullyActivity2).b(o2.f10191w, new IntentFilter("com.fullykiosk.singleapp.event.pin_dialog_hide"));
            L0.c.a(fullyActivity2).b(o2.f10192x, new IntentFilter("com.fullykiosk.singleapp.event.pin_dialog_show"));
            L0.c.a(fullyActivity2).b(o2.z, new IntentFilter("com.fullykiosk.singleapp.event.wifi_dialog_hide"));
            L0.c.a(fullyActivity2).b(o2.f10168A, new IntentFilter("com.fullykiosk.singleapp.event.wifi_dialog_show"));
            L0.c.a(fullyActivity2).b(o2.f10169B, new IntentFilter("com.fullykiosk.singleapp.event.foreground_app"));
            L0.c.a(fullyActivity2).b(o2.f10170C, new IntentFilter("com.fullykiosk.singleapp.event.background_app"));
            o2.f10176g = new O5.c(fullyActivity2, 8);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.fullykiosk.singleapp.action.motion_detected");
            intentFilter.addAction("com.fullykiosk.singleapp.action.darkness_detected");
            intentFilter.addAction("com.fullykiosk.singleapp.action.faces_detected");
            intentFilter.addAction("com.fullykiosk.singleapp.action.movement_detected");
            L0.c.a(fullyActivity2).b(o2.f10176g, intentFilter);
            O5.c cVar = new O5.c(fullyActivity2, 5);
            o2.f10173c = cVar;
            o2.a(cVar, new IntentFilter("android.intent.action.SCREEN_OFF"));
            O5.c cVar2 = new O5.c(fullyActivity2, 6);
            o2.f10174d = cVar2;
            o2.a(cVar2, new IntentFilter("android.intent.action.SCREEN_ON"));
            O5.c cVar3 = new O5.c(fullyActivity2, 7);
            o2.e = cVar3;
            o2.a(cVar3, new IntentFilter("android.intent.action.USER_PRESENT"));
            o2.f10185q = new O5.g(fullyActivity2);
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("android.media.VOLUME_CHANGED_ACTION");
            intentFilter2.addAction("android.intent.action.HEADSET_PLUG");
            o2.a(o2.f10185q, intentFilter2);
            O5.c cVar4 = new O5.c(fullyActivity2, 1);
            o2.f10186r = cVar4;
            o2.a(cVar4, new IntentFilter("android.app.action.INTERRUPTION_FILTER_CHANGED"));
            IntentFilter intentFilter3 = new IntentFilter();
            intentFilter3.addAction("android.net.wifi.supplicant.CONNECTION_CHANGE");
            intentFilter3.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            O5.d dVar2 = new O5.d(fullyActivity2, 0);
            o2.f10175f = dVar2;
            o2.a(dVar2, intentFilter3);
            if (Z0.f()) {
                O5.d dVar3 = new O5.d(fullyActivity2, 1);
                o2.f10177h = dVar3;
                dVar3.f3670c = new p(18, (Object) o2);
                IntentFilter intentFilter4 = new IntentFilter();
                intentFilter4.addAction(EnterpriseLicenseManager.ACTION_LICENSE_STATUS);
                intentFilter4.addAction(KnoxEnterpriseLicenseManager.ACTION_LICENSE_STATUS);
                fullyActivity2.registerReceiver(dVar3, intentFilter4, fullyActivity2.getPackageName() + ".KNOX_SUPPORT_PERMISSION", (Handler) null);
            }
            ? broadcastReceiver = new BroadcastReceiver();
            broadcastReceiver.f3680a = -1;
            o2.i = broadcastReceiver;
            o2.a(broadcastReceiver, new IntentFilter("android.net.wifi.SCAN_RESULTS"));
            ? broadcastReceiver2 = new BroadcastReceiver();
            broadcastReceiver2.f3664b = -1;
            broadcastReceiver2.f3665c = -1;
            broadcastReceiver2.f3663a = fullyActivity2;
            try {
                broadcastReceiver2.f3665c = fullyActivity2.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("plugged", -1);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            o2.f10178j = broadcastReceiver2;
            o2.a(broadcastReceiver2, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            o2.f10179k = new O5.f(fullyActivity2);
            IntentFilter intentFilter5 = new IntentFilter();
            intentFilter5.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter5.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
            o2.a(o2.f10179k, intentFilter5);
            o2.f10180l = new O5.c(fullyActivity2, 3);
            IntentFilter intentFilter6 = new IntentFilter();
            intentFilter6.addAction("android.intent.action.PACKAGE_ADDED");
            intentFilter6.addAction("android.intent.action.PACKAGE_REPLACED");
            intentFilter6.addAction("android.intent.action.PACKAGE_REMOVED");
            intentFilter6.addDataScheme("package");
            o2.a(o2.f10180l, intentFilter6);
            o2.f10181m = new O5.c(fullyActivity2, 4);
            IntentFilter intentFilter7 = new IntentFilter();
            intentFilter7.addAction("com.fullykiosk.singleapp.action.install_complete");
            intentFilter7.addAction("com.fullykiosk.singleapp.action.uninstall_complete");
            o2.a(o2.f10181m, intentFilter7);
            O5.c cVar5 = new O5.c();
            cVar5.f3667b = fullyActivity2;
            o2.f10182n = cVar5;
            IntentFilter intentFilter8 = new IntentFilter();
            intentFilter8.addAction("android.intent.action.DREAMING_STARTED");
            intentFilter8.addAction("android.intent.action.DREAMING_STOPPED");
            o2.a(o2.f10182n, intentFilter8);
            ? broadcastReceiver3 = new BroadcastReceiver();
            broadcastReceiver3.f3662a = fullyActivity2;
            o2.f10183o = broadcastReceiver3;
            o2.a(broadcastReceiver3, new IntentFilter("com.fullykiosk.singleapp.action.alarm"));
            o2.f10184p = new O5.c(fullyActivity2, 0);
            IntentFilter intentFilter9 = new IntentFilter("com.fullykiosk.singleapp.action.check_kiosk_pin");
            intentFilter9.addCategory("android.intent.category.DEFAULT");
            o2.a(o2.f10184p, intentFilter9);
            o2.a(o2.f10187s, new IntentFilter("android.hardware.usb.action.USB_DEVICE_ATTACHED"));
            d dVar4 = this.f9919H0;
            dVar4.getClass();
            try {
                dVar4.f5260Y = new Timer();
                ((Timer) dVar4.f5260Y).schedule(new O(1, dVar4), 3600000, 3600000);
            } catch (Exception e11) {
                g.x(e11, new StringBuilder("Failed to schedule a timer task due to "), "ActivityHelper");
            }
            TouchableFrameLayout touchableFrameLayout = (TouchableFrameLayout) findViewById(2131362223);
            this.f9918G0 = touchableFrameLayout;
            touchableFrameLayout.setFullyActivity(this);
            this.f9952o1.a();
            if (this.f9961z0.Z().booleanValue()) {
                C0794w0.K0(this, this.f9961z0.Z().booleanValue());
            }
            if (((Z1.c) this.f9961z0.f9767W).n("showMenuHint", true) && !this.f9955r1) {
                if (this.f9921J0.f8654b && (this.f9954q1 || P.y(this))) {
                    n2.a.a1(0, this, getString(2131951966));
                    if (this.f9961z0.d0().equals("1234") && h.f4003X) {
                        n2.a.a1(1, this, getString(2131951964));
                    }
                } else if (this.f9921J0.f8654b && !this.f9954q1) {
                    n2.a.a1(1, this, getString(2131951967));
                } else if (P.y(this)) {
                    n.f(findViewById(16908290), "Welcome! Swipe from left or press and HOLD the back button for menu and settings", 10000).h();
                } else {
                    n2.a.a1(1, this, getString(2131951965));
                    try {
                        Resources resources = getResources();
                        int identifier = getResources().getIdentifier("config_navBarInteractionMode", "integer", "android");
                        if (identifier > 0 && resources.getInteger(identifier) == 2) {
                            n.f(findViewById(16908290), "Gesture navigation is enabled in Android. You have to hold short at left edge before swiping out the menu", 10000).h();
                        }
                    } catch (Exception unused2) {
                    }
                }
            }
            n2.a.Q0(P.t(this));
            if (P.f10237f == null) {
                P.R(this);
            }
            ((Z1.c) this.f9961z0.f9767W).n("showMenuHint", true);
            if (P.D(this) && this.f9921J0.f8654b && this.f9961z0.C().booleanValue() && !C0794w0.i0(this, MyAccessibilityService.class)) {
                n2.a.b1(this, "Home Button protection can be broken, check the Detect Home Button option in Fire OS Accessibility Settings");
            }
            if (P.y(this)) {
                n2.a.a1(1, this, "It's impossible to enable the single app mode on Android TV devices");
            }
            P.D(this);
            int i8 = DeviceOwnerReceiver.f9861a;
            if (!C0794w0.Z(this)) {
                try {
                    getPackageManager().setComponentEnabledSetting(DeviceOwnerReceiver.a(this), 2, 1);
                } catch (Exception e12) {
                    g.x(e12, new StringBuilder("Failed to disable DeviceOwnerReceiver due to "), "DeviceOwnerReceiver");
                }
            }
            this.f9949l1.e = true;
            P.v(intent);
            if (getIntent() == null || getIntent().getAction() == null || !getIntent().getAction().equals("com.fullykiosk.singleapp.action.start_screensaver")) {
                N1 n12 = this.f9916E0;
                n12.getClass();
                boolean C02 = n2.a.C0();
                FullyActivity fullyActivity3 = n12.e;
                if (!C02 || !C0794w0.g0(fullyActivity3)) {
                    C0528a aVar3 = fullyActivity3.f9921J0;
                    aVar3.n(3);
                    ((FullyActivity) aVar3.f8656d).f9916E0.a();
                    aVar3.j();
                }
                B(new J3());
            } else {
                this.f9943f1.e();
            }
            if (!this.f9961z0.c0().booleanValue()) {
                C0798w4.b(true, this, this.f9961z0);
            }
            if (!BootReceiver.a(this) && this.f9961z0.c0().booleanValue() && this.f9961z0.g2().booleanValue() && !this.f9961z0.e2().isEmpty() && ((Z1.c) this.f9961z0.f9767W).n("singleAppWaitBootCompleted", false)) {
                ((FullyActivity) this.f9919H0.f5257V).findViewById(2131362125).setVisibility(8);
            }
            d dVar5 = this.f9919H0;
            FullyActivity fullyActivity4 = (FullyActivity) dVar5.f5257V;
            d4.k kVar4 = (d4.k) dVar5.f5258W;
            if (!((Z1.c) kVar4.f9767W).r("appToRunOnStart", "").isEmpty()) {
                for (String str7 : n2.a.e1(((Z1.c) kVar4.f9767W).r("appToRunOnStart", ""))) {
                    try {
                        fullyActivity4.startActivity(C0794w0.F(fullyActivity4, str7));
                        n2.a.b1(fullyActivity4, "Starting " + str7 + " ...");
                    } catch (Exception unused3) {
                        n2.a.b1(fullyActivity4, "Failed to start " + str7);
                    }
                }
                new Handler().postDelayed(new C0680d(dVar5, 0), 500);
            }
            new Handler().postDelayed(new C0741n0(this, 2), 1000);
        } catch (Exception e13) {
            Exception exc = e13;
            StringBuilder sb = new StringBuilder("setContentView failed with theme ");
            try {
                str = getResources().getResourceEntryName(this.s1);
            } catch (Exception e14) {
                str = e14.getMessage();
            }
            sb.append(str);
            String sb2 = sb.toString();
            C0794w0.q0(2, this.f9959y0, sb2);
            Log.e(this.f9959y0, sb2);
            throw exc;
        }
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        C0674c cVar = this.f9923L0;
        d4.k kVar = cVar.f10574b;
        if (((Z1.c) kVar.f9767W).n("showBackButton", true)) {
            menu.add(0, 0, 0, "Back").setIcon(2131230949).setShowAsAction(2);
        }
        Z1.c cVar2 = (Z1.c) kVar.f9767W;
        if (cVar2.n("showForwardButton", true)) {
            menu.add(0, 1, 0, "Forward").setIcon(2131230950).setShowAsAction(2);
        }
        if (cVar2.n("showRefreshButton", false)) {
            menu.add(0, 4, 0, "Refresh").setIcon(2131231000).setShowAsAction(2);
        }
        if (cVar2.n("showHomeButton", true)) {
            menu.add(0, 2, 0, "Home").setIcon(2131230978).setShowAsAction(2);
        }
        if (cVar2.n("showPrintButton", false)) {
            menu.add(0, 3, 0, "Print").setIcon(2131230998).setShowAsAction(2);
        }
        if (cVar2.n("showShareButton", false)) {
            menu.add(0, 6, 0, "Share").setIcon(2131231004).setShowAsAction(2);
        }
        if (cVar2.n("showQrScanButton", false)) {
            menu.add(0, 7, 0, "Scan QR").setIcon(2131230999).setShowAsAction(2);
        }
        if (cVar2.n("showWifiButton", false)) {
            menu.add(0, 9, 0, "Wifi").setIcon(2131231016).setShowAsAction(2);
        }
        if (cVar2.n("showKioskQuitButton", false)) {
            menu.add(0, 8, 0, "Exit").setIcon(2131230969).setShowAsAction(2);
        }
        if (!kVar.N2(cVar2.r("actionBarCustomButtonUrl", "")).isEmpty()) {
            menu.add(0, 5, 0, "Custom").setIcon(2131231008).setShowAsAction(2);
        }
        boolean n4 = cVar2.n("showTime", false);
        FullyActivity fullyActivity = cVar.f10573a;
        if (n4) {
            TextClock textClock = new TextClock(fullyActivity);
            textClock.setTextColor(fullyActivity.getResources().getColor(2131099718));
            textClock.setOnClickListener((View.OnClickListener) null);
            textClock.setPadding(8, 0, 12, 0);
            textClock.setTypeface((Typeface) null, 1);
            textClock.setTextSize(16.0f);
            textClock.setFormat12Hour("hh:mm a");
            textClock.setFormat24Hour("HH:mm");
            menu.add(0, 10, 1, "TIME").setActionView(textClock).setShowAsAction(2);
        }
        if (kVar.W1().booleanValue() && kVar.l() == 100) {
            Toolbar toolbar = (Toolbar) fullyActivity.findViewById(2131361842);
            if (toolbar != null) {
                new Handler().postDelayed(new C0412c((Object) cVar, 1, (Object) toolbar), 500);
            }
        } else if (kVar.W1().booleanValue() && kVar.l() != 100) {
            float l8 = ((float) kVar.l()) / 100.0f;
            LinearLayout linearLayout = (LinearLayout) fullyActivity.findViewById(2131361964);
            linearLayout.removeAllViews();
            for (int i = 0; i < menu.size(); i++) {
                MenuItem item = menu.getItem(i);
                if (item.getIcon() != null) {
                    ImageButton imageButton = new ImageButton(fullyActivity, (AttributeSet) null, 16973956);
                    imageButton.setImageDrawable(item.getIcon());
                    imageButton.setContentDescription(item.getTitle());
                    float f8 = 28.0f * l8;
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(n2.a.p(f8, fullyActivity), n2.a.p(f8, fullyActivity));
                    layoutParams.setMarginEnd(n2.a.p(l8 * 16.0f, fullyActivity));
                    imageButton.setLayoutParams(layoutParams);
                    imageButton.setColorFilter(kVar.j());
                    imageButton.setBackgroundResource(2131230852);
                    imageButton.setOnClickListener(new m(cVar, 1, item));
                    linearLayout.addView(imageButton);
                }
            }
        }
        return true;
    }

    public final void onDestroy() {
        int i;
        C0740n nVar;
        this.f10982w0 = true;
        if (this.f9954q1) {
            String str = this.f9959y0;
            Log.i(str, "onDestroy as Launcher TaskID=" + getTaskId());
        } else {
            String str2 = this.f9959y0;
            Log.i(str2, "onDestroy as App TaskID=" + getTaskId());
        }
        C0798w4.a();
        C0794w0.h();
        this.f9962z1.c();
        this.f9958x1.c();
        this.f9960y1.c();
        this.f9910A1.c();
        this.f9912B1.getClass();
        this.f9914C1.c();
        C0794w0.v0(this);
        C0794w0.w0(this);
        C0767r3 r3Var = (C0767r3) this.f9929R0.f4337W;
        if (r3Var != null) {
            r3Var.b();
        }
        d4.k kVar = this.f9953p1.f10516c;
        synchronized (kVar) {
            C0767r3 r3Var2 = (C0767r3) kVar.f9767W;
            if (r3Var2 != null) {
                r3Var2.b();
            }
        }
        this.f9930S0.t();
        this.f10979t0.d0();
        this.f10979t0.c0();
        this.f10979t0.f0();
        O o2 = this.f9920I0;
        FullyActivity fullyActivity = o2.f10171a;
        L0.c.a(fullyActivity).d(o2.f10188t);
        L0.c.a(fullyActivity).d(o2.f10189u);
        L0.c.a(fullyActivity).d(o2.f10191w);
        L0.c.a(fullyActivity).d(o2.f10192x);
        L0.c.a(fullyActivity).d(o2.z);
        L0.c.a(fullyActivity).d(o2.f10168A);
        L0.c.a(fullyActivity).d(o2.f10169B);
        L0.c.a(fullyActivity).d(o2.f10170C);
        O5.c cVar = o2.f10173c;
        if (cVar != null) {
            fullyActivity.unregisterReceiver(cVar);
        }
        O5.c cVar2 = o2.f10174d;
        if (cVar2 != null) {
            fullyActivity.unregisterReceiver(cVar2);
        }
        O5.c cVar3 = o2.e;
        if (cVar3 != null) {
            fullyActivity.unregisterReceiver(cVar3);
        }
        O5.d dVar = o2.f10175f;
        if (dVar != null) {
            fullyActivity.unregisterReceiver(dVar);
        }
        O5.c cVar4 = o2.f10186r;
        if (cVar4 != null) {
            fullyActivity.unregisterReceiver(cVar4);
        }
        if (o2.f10176g != null) {
            L0.c.a(fullyActivity).d(o2.f10176g);
        }
        O5.d dVar2 = o2.f10177h;
        if (dVar2 != null) {
            fullyActivity.unregisterReceiver(dVar2);
        }
        O5.h hVar = o2.i;
        if (hVar != null) {
            fullyActivity.unregisterReceiver(hVar);
        }
        O5.b bVar = o2.f10178j;
        if (bVar != null) {
            fullyActivity.unregisterReceiver(bVar);
        }
        O5.f fVar = o2.f10179k;
        if (fVar != null) {
            fullyActivity.unregisterReceiver(fVar);
        }
        O5.c cVar5 = o2.f10180l;
        if (cVar5 != null) {
            fullyActivity.unregisterReceiver(cVar5);
        }
        O5.c cVar6 = o2.f10181m;
        if (cVar6 != null) {
            fullyActivity.unregisterReceiver(cVar6);
        }
        O5.c cVar7 = o2.f10182n;
        if (cVar7 != null) {
            fullyActivity.unregisterReceiver(cVar7);
        }
        O5.a aVar = o2.f10183o;
        if (aVar != null) {
            fullyActivity.unregisterReceiver(aVar);
        }
        O5.g gVar = o2.f10185q;
        if (gVar != null) {
            fullyActivity.unregisterReceiver(gVar);
        }
        O5.c cVar8 = o2.f10184p;
        if (cVar8 != null) {
            fullyActivity.unregisterReceiver(cVar8);
        }
        fullyActivity.unregisterReceiver(o2.f10187s);
        G2 g22 = this.f9949l1;
        Handler handler = g22.f9975l;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            g22.f9975l = null;
        }
        Handler handler2 = g22.f9972h;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages((Object) null);
            g22.f9972h = null;
        }
        Handler handler3 = g22.i;
        if (handler3 != null) {
            handler3.removeCallbacksAndMessages((Object) null);
            g22.i = null;
        }
        Handler handler4 = g22.f9978o;
        if (handler4 != null) {
            handler4.removeCallbacksAndMessages((Object) null);
            g22.f9978o = null;
        }
        Handler handler5 = g22.f9973j;
        if (handler5 != null) {
            handler5.removeCallbacksAndMessages((Object) null);
            g22.f9973j = null;
        }
        C0703g4 g4Var = this.f9945h1;
        g4Var.f10651c.removeCallbacksAndMessages((Object) null);
        g4Var.f10652d.removeCallbacksAndMessages((Object) null);
        g4Var.f10654g.removeCallbacksAndMessages((Object) null);
        g4Var.f10656j.removeCallbacksAndMessages((Object) null);
        g4Var.f10655h.removeCallbacksAndMessages((Object) null);
        g4Var.i.removeCallbacksAndMessages((Object) null);
        g4Var.f10657k.removeCallbacksAndMessages((Object) null);
        J0 j02 = this.f9950m1;
        Timer timer = j02.f10017b;
        if (timer != null) {
            timer.cancel();
            j02.f10017b.purge();
            j02.f10017b = null;
        }
        W3 w32 = this.f9922K0;
        w32.getClass();
        new Handler().postDelayed(new T3(w32, 3), 3000);
        w32.f10486m.removeCallbacksAndMessages((Object) null);
        w32.f10485l.removeCallbacksAndMessages((Object) null);
        w32.f10484k.removeCallbacksAndMessages((Object) null);
        w32.b();
        this.f9924M0.getClass();
        this.f9925N0.getClass();
        C0767r3 r3Var3 = (C0767r3) this.f9926O0.f9010X;
        if (r3Var3 != null) {
            r3Var3.b();
        }
        C0740n nVar2 = this.f9928Q0.f10445c;
        if (nVar2 != null) {
            nVar2.b();
        }
        this.f9917F0.d();
        a aVar2 = this.f9942e1;
        C0767r3 r3Var4 = (C0767r3) aVar2.f6950f;
        if (r3Var4 != null) {
            r3Var4.b();
        }
        C0767r3 r3Var5 = (C0767r3) aVar2.f6951g;
        if (r3Var5 != null) {
            r3Var5.b();
        }
        C0767r3 r3Var6 = (C0767r3) aVar2.f6952h;
        if (r3Var6 != null) {
            r3Var6.b();
        }
        aVar2.f6950f = null;
        aVar2.f6951g = null;
        aVar2.f6952h = null;
        i5 i5Var = (i5) aVar2.e;
        if (i5Var != null) {
            i5Var.d();
        }
        V4 v4 = (V4) aVar2.f6949d;
        if (!(v4 == null || (nVar = v4.f10445c) == null)) {
            nVar.b();
        }
        this.f9935X0.q0();
        this.f9936Y0.getClass();
        this.f9937Z0.d();
        e eVar = this.f9938a1;
        FullyActivity fullyActivity2 = (FullyActivity) eVar.f12c;
        if (fullyActivity2.f9957v1 >= f9907D1) {
            eVar.c();
        }
        L0.c.a(fullyActivity2).d((I2) eVar.e);
        L0.c.a(fullyActivity2).d((I2) eVar.f14f);
        L0.c.a(fullyActivity2).d((I2) eVar.f15g);
        K2 k22 = this.f9939b1;
        PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) k22.f10051W;
        if (wakeLock != null) {
            wakeLock.release();
            k22.f10051W = null;
        }
        this.f9940c1.getClass();
        this.f9913C0.c();
        d dVar3 = this.f9919H0;
        Timer timer2 = (Timer) dVar3.f5260Y;
        if (timer2 != null) {
            timer2.cancel();
            ((Timer) dVar3.f5260Y).purge();
            dVar3.f5260Y = null;
        }
        Handler handler6 = (Handler) dVar3.f5261Z;
        if (handler6 != null) {
            handler6.removeCallbacksAndMessages((Object) null);
            dVar3.f5261Z = null;
        }
        C0797w3 w3Var = this.f9943f1;
        w3Var.i.removeCallbacksAndMessages((Object) null);
        w3Var.f11047g.removeCallbacksAndMessages((Object) null);
        FullyActivity fullyActivity3 = w3Var.f11042a;
        L0.c.a(fullyActivity3).d(w3Var.f11045d);
        L0.c.a(fullyActivity3).d(w3Var.e);
        s1 s1Var = this.f9941d1;
        f fVar2 = (f) s1Var.f14075g;
        if (fVar2 != null) {
            ((FullyActivity) s1Var.f14070a).unregisterReceiver(fVar2);
            s1Var.f14075g = null;
        }
        K2 k23 = this.f9947j1;
        k23.getClass();
        boolean r02 = n2.a.r0();
        FullyActivity fullyActivity4 = (FullyActivity) k23.f10050V;
        if (!r02 || n2.a.b0(fullyActivity4) < 31 || fullyActivity4.checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
            try {
                if (((J2) k23.f10051W) != null) {
                    ((TelephonyManager) fullyActivity4.getSystemService("phone")).listen((J2) k23.f10051W, 0);
                    k23.f10051W = null;
                }
            } catch (Exception e) {
                g.z(e, new StringBuilder("Unregistering PhoneStateListener failed due to "), "K2");
            }
        }
        this.f9946i1.getClass();
        C0528a aVar3 = this.f9921J0;
        FullyActivity fullyActivity5 = (FullyActivity) aVar3.f8656d;
        L0.c.a(fullyActivity5).d((f) aVar3.f8657f);
        NotificationManager notificationManager = (NotificationManager) fullyActivity5.getSystemService("notification");
        if (n2.a.y0() && notificationManager.isNotificationPolicyAccessGranted() && (i = aVar3.f8655c) != -1) {
            notificationManager.setInterruptionFilter(i);
            aVar3.f8655c = -1;
        }
        Y.b();
        c cVar9 = this.f9911B0;
        Iterator it = ((M.m) cVar9.f4337W).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str3 = (String) entry.getKey();
            PendingIntent pendingIntent = (PendingIntent) entry.getValue();
            if (pendingIntent != null) {
                ((AlarmManager) ((FullyActivity) cVar9.f4336V).getSystemService("alarm")).cancel(pendingIntent);
            }
            it.remove();
        }
        this.f9927P0.c();
        C1455O o8 = this.f9934W0;
        BeaconManager beaconManager = (BeaconManager) o8.f15532d;
        if (beaconManager != null) {
            beaconManager.stopRangingBeacons((Region) o8.f15529a);
            ((BeaconManager) o8.f15532d).removeRangeNotifier((G) o8.f15533f);
        }
        int i8 = LoadContentZipFileJobService.f10085V;
        ((JobScheduler) getSystemService("jobscheduler")).cancel(8653);
        if (this.f9961z0.u2().booleanValue()) {
            C0794w0.e();
        }
        if (this.f9961z0.N1().booleanValue() && C0794w0.k0(this) && !n2.a.q0()) {
            C0794w0.B0(0, 0, 0, 0);
        }
        if (this.f9961z0.K().booleanValue()) {
            n2.a.b1(this, "Destroy");
        }
        n2.a.C(new File(getCacheDir(), "uploads"));
        boolean z = CrashTestReceiver.f10932a;
        Context applicationContext = getApplicationContext();
        ((AlarmManager) applicationContext.getSystemService("alarm")).cancel(PendingIntent.getBroadcast(applicationContext, 433433, new Intent(applicationContext, CrashTestReceiver.class), 335544320));
        if (this.f9961z0.c0().booleanValue() && !this.f9919H0.f5256U) {
            d.h(this, "Abnormal Termination", 1500);
        }
        this.f9932U0.f10938a = null;
        super.onDestroy();
    }

    public final boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        if (i != 4 || (this.f9921J0.f8654b && !this.f9961z0.b0().equals(getResources().getString(2131951775)))) {
            return super.onKeyLongPress(i, keyEvent);
        }
        this.f9916E0.c();
        return true;
    }

    public final void onMultiWindowModeChanged(boolean z) {
        super.onMultiWindowModeChanged(z);
        Log.w(this.f9959y0, "onMultiWindowModeChanged: " + z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0340, code lost:
        if (r9 > ((long) r1)) goto L_0x0342;
     */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x03a3  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x03ad  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x03c6  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x03e2  */
    /* JADX WARNING: Removed duplicated region for block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:192:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0266  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onNewIntent(android.content.Intent r14) {
        /*
            r13 = this;
            java.lang.String r0 = "lollipopKioskRestartDelay"
            java.lang.String r1 = "minNfcUrlReadInterval"
            super.onNewIntent(r14)
            r2 = 0
            if (r14 == 0) goto L_0x002e
            android.os.Bundle r3 = r14.getExtras()
            if (r3 == 0) goto L_0x001e
            java.lang.String r4 = "isLauncher"
            boolean r5 = r3.containsKey(r4)
            if (r5 == 0) goto L_0x001e
            boolean r4 = r14.getBooleanExtra(r4, r2)
            r13.f9954q1 = r4
        L_0x001e:
            if (r3 == 0) goto L_0x002e
            java.lang.String r4 = "isDaydream"
            boolean r3 = r3.containsKey(r4)
            if (r3 == 0) goto L_0x002e
            boolean r3 = r14.getBooleanExtra(r4, r2)
            r13.f9955r1 = r3
        L_0x002e:
            if (r14 == 0) goto L_0x0460
            java.lang.String r3 = r14.getAction()
            if (r3 != 0) goto L_0x0038
            goto L_0x0460
        L_0x0038:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "onNewIntent TaskID="
            r3.<init>(r4)
            int r4 = r13.getTaskId()
            r3.append(r4)
            java.lang.String r4 = " "
            r3.append(r4)
            java.lang.String r4 = n2.a.o0(r14)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = r13.f9959y0
            android.util.Log.i(r4, r3)
            java.lang.String r3 = "action"
            java.lang.String r5 = r14.getStringExtra(r3)
            if (r5 == 0) goto L_0x006a
            java.lang.String r3 = r14.getStringExtra(r3)
            r14.setAction(r3)
        L_0x006a:
            r13.setIntent(r14)
            d4.k r3 = r13.f9961z0
            java.lang.Boolean r3 = r3.K()
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x008e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Got new intent "
            r3.<init>(r5)
            java.lang.String r5 = r14.getAction()
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            n2.a.b1(r13, r3)
        L_0x008e:
            java.util.ArrayList r3 = de.ozerov.fully.U0.i
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String r5 = r14.getAction()
            java.lang.String r6 = "$action"
            r3.put(r6, r5)
            java.lang.String r5 = "$intent"
            java.lang.String r6 = n2.a.o0(r14)
            r3.put(r5, r6)
            org.json.JSONObject r5 = n2.a.N(r14)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "\\/"
            java.lang.String r7 = "/"
            java.lang.String r5 = r5.replace(r6, r7)
            java.lang.String r6 = "$extras"
            r3.put(r6, r5)
            java.lang.String r5 = "onNewIntent"
            de.ozerov.fully.U0.e(r5, r3)
            boolean r3 = r13.f9955r1
            r5 = 1
            if (r3 == 0) goto L_0x00d6
            d4.k r3 = r13.f9961z0
            java.lang.Boolean r3 = r3.a0()
            boolean r3 = r3.booleanValue()
            de.ozerov.fully.C0794w0.l0(r13, r3)
            B3.q.s0(r13, r5, r5)
        L_0x00d6:
            java.lang.String r3 = r14.getAction()
            java.lang.String r6 = "com.fullykiosk.singleapp.action.start_screensaver"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x00e7
            de.ozerov.fully.w3 r3 = r13.f9943f1
            r3.e()
        L_0x00e7:
            java.lang.String r3 = r14.getAction()
            java.lang.String r6 = "com.fullykiosk.singleapp.action.stop_screensaver"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x00f8
            de.ozerov.fully.w3 r3 = r13.f9943f1
            r3.f()
        L_0x00f8:
            java.lang.String r3 = r14.getAction()
            java.lang.String r6 = "com.fullykiosk.singleapp.action.put_text"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x012d
            java.lang.String r3 = "text"
            java.lang.String r3 = r14.getStringExtra(r3)
            if (r3 == 0) goto L_0x012d
            java.lang.String r6 = "Text injected:"
            java.lang.String r6 = r6.concat(r3)
            n2.a.b1(r13, r6)
            de.ozerov.fully.i5 r6 = r13.f9917F0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "javascript:(function() { if (document.getElementsByTagName('input').length) document.getElementsByTagName('input')[0].value='"
            r7.<init>(r8)
            r7.append(r3)
            java.lang.String r3 = "' })();void(0);"
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            r6.n(r3, r2)
        L_0x012d:
            java.lang.String r3 = r14.getAction()
            java.lang.String r6 = "com.fullykiosk.singleapp.action.barcode"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x0168
            java.lang.String r3 = "code"
            java.lang.String r3 = r14.getStringExtra(r3)
            if (r3 != 0) goto L_0x0153
            d4.k r3 = r13.f9961z0
            java.lang.String r6 = ""
            java.lang.Object r3 = r3.f9767W
            Z1.c r3 = (Z1.c) r3
            java.lang.String r7 = "barcodeScanBroadcastExtra"
            java.lang.String r3 = r3.r(r7, r6)
            java.lang.String r3 = r14.getStringExtra(r3)
        L_0x0153:
            org.json.JSONObject r6 = n2.a.O(r14)
            java.lang.String r6 = r6.toString()
            o.s1 r7 = r13.f9941d1
            java.lang.Object r8 = r7.f14071b
            d4.k r8 = (d4.k) r8
            java.lang.String r8 = r8.q()
            r7.a(r3, r6, r8)
        L_0x0168:
            java.lang.String r3 = r13.getPackageName()
            java.lang.String r6 = "com.onsovis.epro3.pocketPatrol"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x01c2
            java.lang.String r3 = r14.getAction()
            java.lang.String r6 = "com.fullykiosk.singleapp.action.back"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x01c2
            java.lang.String r3 = "Return from pocketScan"
            android.util.Log.i(r4, r3)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String r4 = "scanCode"
            java.lang.String r6 = r14.getStringExtra(r4)
            if (r6 == 0) goto L_0x019b
            java.lang.String r6 = "$scanCode"
            java.lang.String r4 = r14.getStringExtra(r4)
            r3.put(r6, r4)
        L_0x019b:
            java.lang.String r4 = "scanId"
            java.lang.String r6 = r14.getStringExtra(r4)
            if (r6 == 0) goto L_0x01ac
            java.lang.String r6 = "$scanId"
            java.lang.String r4 = r14.getStringExtra(r4)
            r3.put(r6, r4)
        L_0x01ac:
            java.lang.String r4 = "scanTs"
            java.lang.String r6 = r14.getStringExtra(r4)
            if (r6 == 0) goto L_0x01bd
            java.lang.String r6 = "$scanTs"
            java.lang.String r4 = r14.getStringExtra(r4)
            r3.put(r6, r4)
        L_0x01bd:
            java.lang.String r4 = "backFromPocketScan"
            de.ozerov.fully.U0.e(r4, r3)
        L_0x01c2:
            java.lang.String r3 = r14.getAction()
            java.lang.String r4 = "com.fullykiosk.singleapp.action.notification_click"
            boolean r3 = r3.equals(r4)
            java.lang.String r4 = "order"
            java.lang.String r6 = "preferences"
            if (r3 == 0) goto L_0x01f3
            boolean r0 = r13.y(r6)
            if (r0 != 0) goto L_0x01e3
            boolean r0 = r13.y(r4)
            if (r0 != 0) goto L_0x01e3
            b3.a r0 = r13.f9921J0
            r0.c()
        L_0x01e3:
            android.net.Uri r14 = r14.getData()
            if (r14 == 0) goto L_0x01f2
            de.ozerov.fully.i5 r0 = r13.f9917F0
            java.lang.String r14 = r14.toString()
            r0.n(r14, r2)
        L_0x01f2:
            return
        L_0x01f3:
            java.lang.String r3 = r14.getAction()
            java.lang.String r7 = "com.fullykiosk.singleapp.action.bring_to_foreground"
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L_0x02d4
            de.ozerov.fully.G2 r0 = r13.f9949l1
            r0.getClass()
            java.lang.String r1 = "currentApp"
            java.lang.String r1 = r14.getStringExtra(r1)
            d4.k r3 = r0.f9967b
            if (r1 == 0) goto L_0x021c
            java.lang.String r4 = "killOtherApps"
            java.lang.Object r5 = r3.f9767W
            Z1.c r5 = (Z1.c) r5
            boolean r2 = r5.n(r4, r2)
            if (r2 == 0) goto L_0x021c
            r0.f9969d = r1
        L_0x021c:
            java.lang.String r2 = "lastGoodAppPackage"
            java.lang.String r2 = r14.getStringExtra(r2)
            java.lang.String r4 = "lastGoodAppComponent"
            java.lang.String r14 = r14.getStringExtra(r4)
            java.lang.Boolean r4 = r3.c0()
            boolean r4 = r4.booleanValue()
            java.lang.String r5 = "OtherAppManager"
            r6 = 0
            de.ozerov.fully.FullyActivity r7 = r0.f9966a
            if (r4 == 0) goto L_0x0253
            java.lang.Boolean r4 = r3.g2()
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0253
            java.lang.String r3 = r3.e2()     // Catch:{ Exception -> 0x024e }
            android.content.Intent r3 = n2.a.P0(r3)     // Catch:{ Exception -> 0x024e }
            java.lang.String r3 = de.ozerov.fully.C0794w0.K(r7, r3)     // Catch:{ Exception -> 0x024e }
            goto L_0x0254
        L_0x024e:
            java.lang.String r3 = "Failed to parse the single app intent"
            android.util.Log.e(r5, r3)
        L_0x0253:
            r3 = r6
        L_0x0254:
            if (r2 == 0) goto L_0x02d3
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto L_0x02d3
            java.lang.String r4 = r7.getPackageName()
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L_0x02d3
            if (r1 == 0) goto L_0x0278
            java.lang.String r4 = "com.amazon.firelauncher"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x02d3
            java.lang.String r4 = "com.amazon.tv.launcher"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x02d3
        L_0x0278:
            boolean r1 = r2.equals(r3)
            if (r1 != 0) goto L_0x02d3
            android.content.Intent r1 = de.ozerov.fully.C0794w0.F(r7, r2)
            if (r1 == 0) goto L_0x0288
            android.content.ComponentName r6 = r1.getComponent()
        L_0x0288:
            if (r1 == 0) goto L_0x02be
            if (r6 == 0) goto L_0x02be
            C7.d r3 = r7.f9948k1
            java.lang.Object r3 = r3.f736Z
            java.lang.String[] r3 = (java.lang.String[]) r3
            boolean r2 = n2.a.M0(r2, r3)
            if (r2 != 0) goto L_0x02be
            C7.d r2 = r7.f9948k1
            boolean r2 = r2.t(r6)
            if (r2 != 0) goto L_0x02be
            if (r14 == 0) goto L_0x02ae
            C7.d r2 = r7.f9948k1
            android.content.ComponentName r14 = android.content.ComponentName.unflattenFromString(r14)
            boolean r14 = r2.t(r14)
            if (r14 != 0) goto L_0x02be
        L_0x02ae:
            android.content.Intent r14 = new android.content.Intent
            r14.<init>()
            r14.setComponent(r6)
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r14.setFlags(r1)
            r0.f9968c = r14
            goto L_0x02d3
        L_0x02be:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "Launch intent not found or blacklisted for "
            r14.<init>(r0)
            java.lang.String r0 = n2.a.o0(r1)
            r14.append(r0)
            java.lang.String r14 = r14.toString()
            android.util.Log.w(r5, r14)
        L_0x02d3:
            return
        L_0x02d4:
            java.lang.String r3 = r14.getAction()
            java.lang.String r7 = "com.fullykiosk.singleapp.action.exit"
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L_0x02e6
            U.d r14 = r13.f9919H0
            r14.d(r5)
            return
        L_0x02e6:
            java.lang.String r3 = r14.getAction()
            java.lang.String r7 = "android.intent.action.VIEW"
            boolean r3 = r3.equals(r7)
            java.lang.String r7 = "0"
            java.lang.String r8 = "android.nfc.action.NDEF_DISCOVERED"
            if (r3 != 0) goto L_0x0342
            java.lang.String r3 = r14.getAction()
            boolean r3 = r3.equals(r8)
            if (r3 == 0) goto L_0x038a
            d4.k r3 = r13.f9961z0
            java.lang.Boolean r3 = r3.F1()
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x038a
            d4.k r3 = r13.f9961z0
            r3.getClass()
            java.lang.Object r3 = r3.f9767W     // Catch:{ Exception -> 0x031e }
            Z1.c r3 = (Z1.c) r3     // Catch:{ Exception -> 0x031e }
            java.lang.String r3 = r3.r(r1, r7)     // Catch:{ Exception -> 0x031e }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ Exception -> 0x031e }
            goto L_0x0320
        L_0x031e:
            r3 = 0
        L_0x0320:
            if (r3 == 0) goto L_0x0342
            long r9 = java.lang.System.currentTimeMillis()
            long r11 = r13.w1
            long r9 = r9 - r11
            d4.k r3 = r13.f9961z0
            r3.getClass()
            java.lang.Object r3 = r3.f9767W     // Catch:{ Exception -> 0x033b }
            Z1.c r3 = (Z1.c) r3     // Catch:{ Exception -> 0x033b }
            java.lang.String r1 = r3.r(r1, r7)     // Catch:{ Exception -> 0x033b }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ Exception -> 0x033b }
            goto L_0x033d
        L_0x033b:
            r1 = 0
        L_0x033d:
            long r11 = (long) r1
            int r1 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r1 <= 0) goto L_0x038a
        L_0x0342:
            java.lang.String r1 = r14.getAction()
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x0352
            long r9 = java.lang.System.currentTimeMillis()
            r13.w1 = r9
        L_0x0352:
            de.ozerov.fully.i5 r1 = r13.f9917F0
            de.ozerov.fully.g5 r1 = r1.f10711d
            if (r1 == 0) goto L_0x035c
            de.ozerov.fully.MyWebView r1 = r1.f10664g
            r1.f10123c0 = r5
        L_0x035c:
            android.net.Uri r1 = r14.getData()
            if (r1 == 0) goto L_0x038a
            de.ozerov.fully.i5 r3 = r13.f9917F0
            java.lang.String r9 = r1.toString()
            r3.n(r9, r2)
            de.ozerov.fully.G2 r3 = r13.f9949l1
            r3.f9970f = r5
            java.lang.String r3 = r14.getAction()
            boolean r3 = r3.equals(r8)
            if (r3 == 0) goto L_0x038a
            B3.q r3 = r13.f9935X0
            java.lang.String r5 = "data"
            java.lang.String r1 = r1.toString()
            org.json.JSONObject r1 = n2.a.D(r5, r1)
            java.lang.String r5 = "onNfcRead"
            r3.b0(r5, r1)
        L_0x038a:
            de.ozerov.fully.P.v(r14)
            boolean r1 = r13.f9954q1
            if (r1 == 0) goto L_0x03d2
            java.lang.String r1 = r14.getAction()
            java.lang.String r3 = "android.intent.action.MAIN"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x03d2
            android.net.Uri r1 = r14.getData()
            if (r1 == 0) goto L_0x03ad
            de.ozerov.fully.i5 r3 = r13.f9917F0
            java.lang.String r1 = r1.toString()
            r3.n(r1, r2)
            goto L_0x03c0
        L_0x03ad:
            d4.k r1 = r13.f9961z0
            java.lang.String r3 = "kioskHomeStartURL"
            java.lang.Object r1 = r1.f9767W
            Z1.c r1 = (Z1.c) r1
            boolean r1 = r1.n(r3, r2)
            if (r1 == 0) goto L_0x03c0
            de.ozerov.fully.c r1 = r13.f9951n1
            r1.getClass()
        L_0x03c0:
            boolean r1 = r13.y(r6)
            if (r1 != 0) goto L_0x03c9
            r13.y(r4)
        L_0x03c9:
            U.d r1 = r13.f9919H0
            r1.j()
            de.ozerov.fully.G2 r1 = r13.f9949l1
            r1.f9970f = r2
        L_0x03d2:
            boolean r1 = r13.f9954q1
            if (r1 == 0) goto L_0x0460
            java.lang.String r14 = r14.getAction()
            java.lang.String r1 = "com.fullykiosk.singleapp.action.onboot"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x0460
            de.ozerov.fully.W3 r14 = r13.f9922K0
            r14.e()
            b3.a r14 = r13.f9921J0
            boolean r14 = r14.i()
            if (r14 == 0) goto L_0x03f5
            de.ozerov.fully.W3.a(r13)
            de.ozerov.fully.C0794w0.b(r13)
        L_0x03f5:
            d4.k r14 = r13.f9961z0
            java.lang.Boolean r14 = r14.Z()
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x040e
            d4.k r14 = r13.f9961z0
            java.lang.Boolean r14 = r14.Z()
            boolean r14 = r14.booleanValue()
            de.ozerov.fully.C0794w0.K0(r13, r14)
        L_0x040e:
            U.d r14 = r13.f9919H0
            r14.l()
            d4.k r14 = r13.f9961z0
            java.lang.Boolean r14 = r14.S()
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x0460
            boolean r14 = n2.a.y0()
            if (r14 != 0) goto L_0x0460
            d4.k r14 = r13.f9961z0
            r14.getClass()
            java.lang.Object r14 = r14.f9767W     // Catch:{ Exception -> 0x0437 }
            Z1.c r14 = (Z1.c) r14     // Catch:{ Exception -> 0x0437 }
            java.lang.String r14 = r14.r(r0, r7)     // Catch:{ Exception -> 0x0437 }
            int r14 = java.lang.Integer.parseInt(r14)     // Catch:{ Exception -> 0x0437 }
            goto L_0x0439
        L_0x0437:
            r14 = 0
        L_0x0439:
            if (r14 < 0) goto L_0x0460
            android.os.Handler r14 = new android.os.Handler
            r14.<init>()
            U.d r1 = r13.f9919H0
            j$.util.Objects.requireNonNull(r1)
            de.ozerov.fully.d r3 = new de.ozerov.fully.d
            r4 = 2
            r3.<init>(r1, r4)
            d4.k r1 = r13.f9961z0
            r1.getClass()
            java.lang.Object r1 = r1.f9767W     // Catch:{ Exception -> 0x045c }
            Z1.c r1 = (Z1.c) r1     // Catch:{ Exception -> 0x045c }
            java.lang.String r0 = r1.r(r0, r7)     // Catch:{ Exception -> 0x045c }
            int r2 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x045c }
        L_0x045c:
            long r0 = (long) r2
            r14.postDelayed(r3, r0)
        L_0x0460:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.FullyActivity.onNewIntent(android.content.Intent):void");
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (!this.f9923L0.c(menuItem)) {
            return super.onOptionsItemSelected(menuItem);
        }
        return true;
    }

    public final void onPause() {
        long j7;
        NfcAdapter nfcAdapter;
        super.onPause();
        if (this.f9961z0.F1().booleanValue() && (nfcAdapter = P.f10233a) != null) {
            nfcAdapter.disableForegroundDispatch(this);
            P.f10233a = null;
        }
        if (this.f9956u1 != 0) {
            Z1.c cVar = (Z1.c) this.f9961z0.f9767W;
            cVar.getClass();
            try {
                j7 = ((SharedPreferences) cVar.f6955V).getLong("foregroundMillis", 0);
            } catch (Exception unused) {
                j7 = 0;
            }
            this.f9961z0.U2("foregroundMillis", (System.currentTimeMillis() - this.f9956u1) + j7);
            this.f9956u1 = 0;
        }
        if (((Z1.c) this.f9961z0.f9767W).n("pauseWebviewOnPause", false)) {
            this.f9917F0.o();
        }
        C0740n nVar = this.f9928Q0.f10445c;
        if (nVar != null) {
            nVar.q();
        }
        this.t1.removeCallbacksAndMessages((Object) null);
        this.f9945h1.f10655h.removeCallbacksAndMessages((Object) null);
        this.f9945h1.c();
        this.f9945h1.a();
        if (this.f9961z0.K().booleanValue()) {
            n2.a.b1(this, "Pause");
        }
        if (!this.f9962z1.f10066a && !isFinishing() && this.f9921J0.i() && this.f9961z0.D().booleanValue()) {
            C7.d dVar = this.f9948k1;
            if (((String[]) dVar.f735Y).length == 0 && ((String) dVar.f734X) == null && !this.f9943f1.f11046f) {
                Log.w(this.f9959y0, "Block changing task in onPause");
                this.f9919H0.i();
            }
        }
        this.f9922K0.k();
        this.f9926O0.n();
        this.f9949l1.getClass();
        C0794w0.N0(this);
    }

    public final void onPostResume() {
        int i;
        KeyguardManager keyguardManager;
        super.onPostResume();
        this.f9945h1.d();
        C0703g4 g4Var = this.f9945h1;
        g4Var.f10652d.removeCallbacksAndMessages((Object) null);
        d4.k kVar = g4Var.f10650b;
        kVar.getClass();
        try {
            Integer.parseInt(((Z1.c) kVar.f9767W).r("rewindEachSeconds", "0"));
        } catch (Exception unused) {
        }
        C0703g4 g4Var2 = this.f9945h1;
        Handler handler = g4Var2.f10655h;
        handler.removeCallbacksAndMessages((Object) null);
        d4.k kVar2 = g4Var2.f10650b;
        if (kVar2.n2() > 0) {
            i = kVar2.n2();
        } else {
            try {
                i = Integer.parseInt(((Z1.c) kVar2.f9767W).r("mdmTimeToClearLauncherAppData", "0"));
            } catch (Exception unused2) {
                i = 0;
            }
        }
        if (i > 0) {
            handler.postDelayed(new C0691e4(g4Var2, 3), ((long) i) * 1000);
        }
        this.f9945h1.b();
        this.f9956u1 = System.currentTimeMillis();
        if (this.f9961z0.F1().booleanValue()) {
            P.P(this);
        }
        if (this.f9961z0.s1().booleanValue() && !y("preferences")) {
            this.f9958x1.b();
        }
        C0797w3 w3Var = this.f9943f1;
        if (w3Var.f11046f) {
            FullyActivity fullyActivity = w3Var.f11042a;
            if (!fullyActivity.f9955r1) {
                U0.e("onDaydreamStop", (HashMap) null);
                fullyActivity.f9935X0.b0("onDaydreamStop", (JSONObject) null);
                w3Var.f11046f = false;
                w3Var.a();
            }
        }
        d dVar = this.f9919H0;
        Handler handler2 = (Handler) dVar.f5261Z;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages((Object) null);
            dVar.f5261Z = null;
        }
        if (!x("preferences") && !x("welcome") && !x("order")) {
            if (this.f9933V0.m()) {
                j0 j0Var = this.f9933V0;
                C0674c cVar = this.f9951n1;
                Objects.requireNonNull(cVar);
                j0Var.n(true, false, new C0753p0(cVar, 0));
            } else {
                this.f9921J0.q(new C0741n0(this, 3));
            }
        }
        this.f9922K0.k();
        this.f9922K0.e();
        this.f9926O0.n();
        if (((Z1.c) this.f9961z0.f9767W).n("forceSwipeUnlock", false) && C0794w0.g0(this) && n2.a.B0() && (keyguardManager = (KeyguardManager) getSystemService("keyguard")) != null) {
            keyguardManager.requestDismissKeyguard(this, new C0675c0());
        }
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 1008) {
            this.f9926O0.f9007U = true;
        }
        if (n2.a.y0() && iArr.length > 0) {
            for (int i8 = 0; i8 < strArr.length; i8++) {
                if (iArr[i8] == -1 && !shouldShowRequestPermissionRationale(strArr[i8])) {
                    this.f9933V0.g(strArr[i8]);
                }
            }
        }
        if (i == 1008 && iArr.length > 0) {
            for (int i9 = 0; i9 < strArr.length; i9++) {
                if (strArr[i9].equals("android.permission.ACCESS_COARSE_LOCATION") && iArr[i9] == 0 && !this.f9961z0.F2().isEmpty()) {
                    String U8 = C0794w0.U(this);
                    if (!U8.equals("\"" + this.f9961z0.F2() + "\"")) {
                        C0794w0.I0(this);
                    }
                }
            }
        }
        if (i == 1008 && iArr.length > 0) {
            for (int i10 = 0; i10 < strArr.length; i10++) {
                if (strArr[i10].equals("android.permission.ACCESS_FINE_LOCATION") && iArr[i10] == 0) {
                    this.f9934W0.n();
                }
            }
        }
        if (i == 1008 && iArr.length > 0) {
            for (int i11 = 0; i11 < strArr.length; i11++) {
                if (strArr[i11].equals("android.permission.CAMERA") && iArr[i11] == 0 && this.f9961z0.s1().booleanValue()) {
                    this.f9958x1.b();
                }
            }
        }
        if (i == 1008 && n2.a.y0()) {
            for (int i12 = 0; i12 < strArr.length; i12++) {
                if (strArr[i12].equals("android.permission.RECORD_AUDIO") && iArr[i12] == 0 && this.f9961z0.t1().booleanValue()) {
                    this.f9914C1.b();
                }
            }
        }
        if (i == 1008 && n2.a.r0()) {
            for (int i13 = 0; i13 < strArr.length; i13++) {
                if (strArr[i13].equals("android.permission.BLUETOOTH_CONNECT") && iArr[i13] == 0 && !this.f9961z0.B().isEmpty()) {
                    C0794w0.z0(this, this.f9961z0.B());
                }
            }
        }
        if (i == 1008 && n2.a.r0()) {
            for (int i14 = 0; i14 < strArr.length; i14++) {
                if (strArr[i14].equals("android.permission.BLUETOOTH_SCAN") && iArr[i14] == 0) {
                    this.f9934W0.n();
                }
            }
        }
        if (i == 1007 && iArr.length > 0) {
            for (int i15 = 0; i15 < strArr.length; i15++) {
                if (strArr[i15].equals("android.permission.READ_EXTERNAL_STORAGE") && iArr[i15] == 0) {
                    this.f9924M0.i(false, false);
                    if (((Z1.c) this.f9961z0.f9767W).n("autoImportSettings", true)) {
                        this.f9931T0.m();
                        this.f9952o1.a();
                    }
                }
                if (strArr[i15].equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
                    int i16 = iArr[i15];
                }
            }
        }
    }

    public final void onResume() {
        super.onResume();
        if (C0794w0.Z(this) && this.f9921J0.i() && this.f9961z0.n1().booleanValue()) {
            startLockTask();
        }
        if (!this.f9916E0.b()) {
            this.f9917F0.q();
        }
        if (!this.f9943f1.f11044c) {
            Handler handler = this.t1;
            handler.removeCallbacksAndMessages((Object) null);
            handler.postDelayed(new C0741n0(this, 0), (long) (this.f9961z0.P() + 200));
        }
        q.e0();
        this.f9922K0.b();
        new Handler().post(new C0741n0(this, 1));
    }

    public final void onStart() {
        super.onStart();
        if (this.f9961z0.s1().booleanValue() && ((Z1.c) this.f9961z0.f9767W).n("pauseMotionInBackground", false) && !this.f9944g1.f9883c) {
            this.f9958x1.b();
        }
        this.f9943f1.c();
        this.f9943f1.b();
        this.f9948k1.z((String) null);
    }

    public final void onStop() {
        String str;
        g5 g5Var;
        C0737m2 m2Var;
        super.onStop();
        if (this.f9917F0.m() && (g5Var = this.f9917F0.f10711d) != null && (m2Var = g5Var.f10665h) != null && (m2Var instanceof C0743n2)) {
            ((C0743n2) m2Var).b();
        }
        if (!this.f9961z0.c2().booleanValue()) {
            this.f9961z0.Z1().booleanValue();
        }
        if (this.f9961z0.K().booleanValue()) {
            n2.a.b1(this, "Stop");
        }
        ComponentName q7 = C0794w0.q(this, 1000);
        if (q7 != null) {
            str = q7.getPackageName();
        } else {
            str = C0794w0.r(this);
        }
        if (this.f9961z0.s1().booleanValue() && ((Z1.c) this.f9961z0.f9767W).n("pauseMotionInBackground", false) && !this.f9943f1.f11046f && ((str != null && !str.equals(getPackageName())) || (C0794w0.h0(this) && !n2.a.y0()))) {
            this.f9958x1.c();
        }
        if (!isFinishing() && this.f9921J0.i() && this.f9961z0.D().booleanValue() && !this.f9943f1.f11046f && str != null && !this.f9948k1.v(str) && !this.f9948k1.u(q7)) {
            Log.w(this.f9959y0, "Block changing task to app: " + str + " component: " + q7);
            if (this.f9961z0.K().booleanValue()) {
                n2.a.b1(this, "Block changing task to ".concat(str));
            }
            this.f9919H0.i();
            if (((Z1.c) this.f9961z0.f9767W).n("killOtherApps", false)) {
                this.f9949l1.f9969d = str;
            }
        }
        if (!isFinishing() && this.f9955r1) {
            this.f9919H0.b();
        }
        this.f9922K0.e();
    }

    public final void onUserInteraction() {
        C0703g4 g4Var = this.f9945h1;
        g4Var.getClass();
        g4Var.f10653f = System.currentTimeMillis();
        this.f9945h1.d();
        C0703g4 g4Var2 = this.f9945h1;
        g4Var2.f10652d.removeCallbacksAndMessages((Object) null);
        d4.k kVar = g4Var2.f10650b;
        kVar.getClass();
        try {
            Integer.parseInt(((Z1.c) kVar.f9767W).r("rewindEachSeconds", "0"));
        } catch (Exception unused) {
        }
        this.f9945h1.c();
        this.f9945h1.a();
        this.f9945h1.b();
        this.f9943f1.c();
        this.f9943f1.b();
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        W3 w32 = this.f9922K0;
        w32.e = z;
        if (!z) {
            FullyActivity fullyActivity = w32.f10477b;
            if (fullyActivity.f9921J0.i() && w32.f10478c.E().booleanValue()) {
                W3.a(fullyActivity);
                w32.f10484k.postDelayed(new T3(w32, 5), 300);
            }
        }
        w32.i();
        if (z && y("preferences")) {
            C0794w0.A0(this, true, true);
        } else if (z) {
            C0794w0.A0(this, this.f9961z0.Z1().booleanValue(), this.f9961z0.c2().booleanValue());
        }
    }

    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        if (!((Z1.c) this.f9961z0.f9767W).n("disableContextMenu", true) || !this.f9921J0.i()) {
            return super.onWindowStartingActionMode(callback, i);
        }
        return new ActionMode();
    }

    public final void setTheme(int i) {
        super.setTheme(i);
        this.s1 = i;
    }

    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (intent.getData() != null) {
            Uri data = intent.getData();
            data.toString();
            data.getHost();
            if (data.getHost() != null) {
                data.getHost().equals("www.fully-kiosk.com");
            }
        }
        G2 g22 = this.f9949l1;
        if (g22 != null) {
            C0747o0 o0Var = new C0747o0(this, intent, i, bundle, 0);
            FullyActivity fullyActivity = g22.f9966a;
            String K4 = C0794w0.K(fullyActivity, intent);
            ResolveInfo resolveActivity = fullyActivity.getPackageManager().resolveActivity(intent, 65536);
            if (resolveActivity != null) {
                String str = resolveActivity.activityInfo.name;
            }
            if (K4 != null && !K4.equals(fullyActivity.getPackageName())) {
                if (System.currentTimeMillis() > g22.f9976m + RangedBeacon.DEFAULT_MAX_TRACKING_AGE) {
                    g22.f9977n = 0;
                } else {
                    g22.f9977n++;
                }
                g22.f9976m = System.currentTimeMillis();
                if (g22.f9977n <= 9 || !((Z1.c) g22.f9967b.f9767W).n("enableAppPanicDetection", true) || !fullyActivity.f9921J0.i()) {
                    Handler handler = g22.f9978o;
                    if (handler != null) {
                        handler.removeCallbacksAndMessages((Object) null);
                        g22.f9978o = null;
                    }
                    fullyActivity.f9948k1.z(K4);
                    fullyActivity.f9919H0.e(K4, o0Var);
                    return;
                }
                Log.w("OtherAppManager", "Paused due to app panic when starting ".concat(K4));
                Handler handler2 = g22.f9978o;
                if (handler2 == null) {
                    n2.a.a1(1, fullyActivity, "Lots of app starts. Maybe some app needs whitelisting? Pausing for 15 seconds...");
                } else if (handler2 != null) {
                    handler2.removeCallbacksAndMessages((Object) null);
                    g22.f9978o = null;
                }
                Handler handler3 = new Handler();
                g22.f9978o = handler3;
                handler3.postDelayed(new B7.e(g22, K4, o0Var, intent, 6), 15000);
            } else if (K4 != null) {
                fullyActivity.f9919H0.e(K4, o0Var);
            }
        } else {
            super.startActivityForResult(intent, i, bundle);
        }
    }

    public final void z() {
        this.f9960y1.e(false, false);
    }

    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        super.onMultiWindowModeChanged(z, configuration);
        Log.w(this.f9959y0, "onMultiWindowModeChanged: " + z);
    }

    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        if (!((Z1.c) this.f9961z0.f9767W).n("disableContextMenu", true) || !this.f9921J0.i()) {
            return super.onWindowStartingActionMode(callback);
        }
        return new ActionMode();
    }
}
