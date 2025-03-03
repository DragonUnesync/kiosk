package de.ozerov.fully;

import N.e;
import Q0.g;
import Z1.c;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import android.preference.PreferenceGroup;
import android.preference.PreferenceManager;
import android.preference.PreferenceScreen;
import d4.k;
import j$.util.Objects;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import n2.a;

/* renamed from: de.ozerov.fully.s0  reason: case insensitive filesystem */
public final class C0770s0 {

    /* renamed from: a  reason: collision with root package name */
    public PreferenceScreen f10938a;

    /* renamed from: b  reason: collision with root package name */
    public final Activity f10939b;

    /* renamed from: c  reason: collision with root package name */
    public final SharedPreferences f10940c;

    /* renamed from: d  reason: collision with root package name */
    public final k f10941d;
    public ArrayList e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList f10942f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList f10943g;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList f10944h;
    public final ArrayList i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList f10945j = new ArrayList();

    public C0770s0(Activity activity) {
        this.f10939b = activity;
        this.f10941d = new k((Context) activity, 1);
        this.f10940c = PreferenceManager.getDefaultSharedPreferences(activity);
    }

    public static Preference a(Preference preference, String str) {
        if (preference.getKey() != null && preference.getKey().equals(str)) {
            return preference;
        }
        if (!(preference instanceof PreferenceCategory) && !(preference instanceof PreferenceScreen)) {
            return null;
        }
        PreferenceGroup preferenceGroup = (PreferenceGroup) preference;
        int preferenceCount = preferenceGroup.getPreferenceCount();
        for (int i8 = 0; i8 < preferenceCount; i8++) {
            Preference a8 = a(preferenceGroup.getPreference(i8), str);
            if (a8 != null) {
                return a8;
            }
        }
        return null;
    }

    public static void b(Preference preference, String str, String str2, ArrayList arrayList) {
        String str3;
        if (preference != null) {
            int i8 = 0;
            if (preference instanceof PreferenceScreen) {
                StringBuilder B8 = e.B(str2, "/");
                B8.append(preference.getKey());
                String sb = B8.toString();
                if (str.equals(sb) || sb.startsWith(str)) {
                    PreferenceGroup preferenceGroup = (PreferenceGroup) preference;
                    if (preferenceGroup.getPreferenceCount() > 0) {
                        Preference preference2 = preferenceGroup.getPreference(0);
                        if ((preference2 instanceof MyPreferenceCategory) && (str3 = ((MyPreferenceCategory) preference2).f10114U) != null) {
                            preference.setSummary(str3);
                        }
                    }
                    preference.getKey();
                    arrayList.add(preference);
                }
                if (str.startsWith(sb) || str.isEmpty()) {
                    preference.getKey();
                    while (true) {
                        PreferenceGroup preferenceGroup2 = (PreferenceGroup) preference;
                        if (i8 < preferenceGroup2.getPreferenceCount()) {
                            b(preferenceGroup2.getPreference(i8), str, sb, arrayList);
                            i8++;
                        } else {
                            return;
                        }
                    }
                }
            } else if (preference instanceof PreferenceCategory) {
                while (true) {
                    PreferenceGroup preferenceGroup3 = (PreferenceGroup) preference;
                    if (i8 < preferenceGroup3.getPreferenceCount()) {
                        b(preferenceGroup3.getPreference(i8), str, str2, arrayList);
                        i8++;
                    } else {
                        return;
                    }
                }
            } else if (str.equals(str2) || str.isEmpty()) {
                Objects.toString(preference.getTitle());
                arrayList.add(preference);
            }
        }
    }

    public static ArrayList c(Preference preference, int i8) {
        ArrayList arrayList = new ArrayList();
        if ((preference instanceof PreferenceCategory) || (preference instanceof PreferenceScreen)) {
            PreferenceGroup preferenceGroup = (PreferenceGroup) preference;
            int preferenceCount = preferenceGroup.getPreferenceCount();
            for (int i9 = 0; i9 < preferenceCount; i9++) {
                arrayList.addAll(c(preferenceGroup.getPreference(i9), i8));
            }
        }
        if ((preference instanceof SwitchPref) && preference.getKey() != null && (((SwitchPref) preference).f10347U & i8) > 0) {
            arrayList.add(preference.getKey());
        }
        if ((preference instanceof TextPref) && preference.getKey() != null && (((TextPref) preference).f10367U & i8) > 0) {
            arrayList.add(preference.getKey());
        }
        if ((preference instanceof ListPref) && preference.getKey() != null && (((ListPref) preference).f10084U & i8) > 0) {
            arrayList.add(preference.getKey());
        }
        if ((preference instanceof ClickPref) && preference.getKey() != null && (i8 & ((ClickPref) preference).f9833U) > 0) {
            arrayList.add(preference.getKey());
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [java.lang.Object, de.ozerov.fully.v0] */
    public static ArrayList f(String str, Preference preference, String str2, String str3) {
        String str4;
        String str5;
        ArrayList arrayList = new ArrayList();
        if (preference == null) {
            return arrayList;
        }
        boolean z = preference instanceof PreferenceCategory;
        if (!z) {
            if (str2.isEmpty()) {
                str2 = preference.getKey();
            } else {
                StringBuilder B8 = e.B(str2, ":");
                B8.append(preference.getKey());
                str2 = B8.toString();
            }
        }
        String str6 = "";
        if (z && preference.getTitle() != null) {
            if (!str3.isEmpty()) {
                str5 = str3.concat(" > ");
            } else {
                str5 = str6;
            }
            StringBuilder r8 = g.r(str5);
            r8.append(preference.getTitle());
            str3 = r8.toString();
        }
        int i8 = 0;
        if (z || (preference instanceof PreferenceScreen)) {
            PreferenceGroup preferenceGroup = (PreferenceGroup) preference;
            int preferenceCount = preferenceGroup.getPreferenceCount();
            for (int i9 = 0; i9 < preferenceCount; i9++) {
                arrayList.addAll(f(str, preferenceGroup.getPreference(i9), str2, str3));
            }
        }
        if (preference.getKey() != null && ((preference.getTitle() == null || !preference.getTitle().toString().contains("JSON")) && !z)) {
            if (preference.getKey().toLowerCase().equals(str)) {
                i8 = 3;
            }
            if (preference.getTitle() != null && preference.getTitle().toString().toLowerCase().startsWith(str)) {
                i8 += 3;
            } else if (preference.getTitle() != null && preference.getTitle().toString().toLowerCase().contains(str)) {
                i8 += 2;
            }
            if (preference.getTitle() != null && preference.getTitle().toString().toLowerCase().contains(str) && (preference instanceof PreferenceScreen)) {
                i8++;
            }
            if (preference.getSummary() != null && preference.getSummary().toString().toLowerCase().contains(str)) {
                i8++;
            }
            if (i8 > 0) {
                if (preference.getTitle() == null) {
                    str4 = str6;
                } else {
                    str4 = preference.getTitle().toString();
                }
                if (preference.getSummary() != null) {
                    str6 = preference.getSummary().toString();
                }
                ? obj = new Object();
                obj.f11003a = i8;
                obj.f11004b = str2;
                obj.f11006d = str3;
                obj.f11005c = str4;
                obj.e = str6;
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static boolean j(Preference preference, ArrayList arrayList, Preference preference2) {
        if (preference == null) {
            return false;
        }
        if ((preference instanceof PreferenceCategory) || (preference instanceof PreferenceScreen)) {
            PreferenceGroup preferenceGroup = (PreferenceGroup) preference;
            int preferenceCount = preferenceGroup.getPreferenceCount();
            int i8 = 0;
            while (i8 < preferenceCount) {
                if (j(preferenceGroup.getPreference(i8), arrayList, preference)) {
                    i8--;
                    preferenceCount--;
                }
                i8++;
            }
        }
        if (!(preference2 instanceof PreferenceGroup) || arrayList == null || !arrayList.contains(preference.getKey())) {
            return false;
        }
        preference.getKey();
        preference2.getKey();
        ((PreferenceGroup) preference2).removePreference(preference);
        return true;
    }

    public final String d(String str) {
        Preference a8 = a(this.f10938a, str);
        if (a8 == null || a8.getTitle() == null) {
            return null;
        }
        return a8.getTitle().toString();
    }

    public final ArrayList e() {
        String[] strArr = A.f9779a;
        String[] strArr2 = A.f9780b;
        ArrayList arrayList = new ArrayList(16);
        Collections.addAll(arrayList, strArr);
        Collections.addAll(arrayList, strArr2);
        String[] f12 = a.f1(a.f1((String[]) arrayList.toArray(new String[arrayList.size()]), ((c) this.f10941d.f9767W).r("showHiddenPrefsList", "").split(",")), A.f9781c);
        String[] strArr3 = (String[]) this.i.toArray(new String[0]);
        ArrayList arrayList2 = new ArrayList(f12.length + strArr3.length);
        Collections.addAll(arrayList2, f12);
        Collections.addAll(arrayList2, strArr3);
        return new ArrayList(Arrays.asList((String[]) arrayList2.toArray(new String[arrayList2.size()])));
    }

    public final String g(String str) {
        Preference a8 = a(this.f10938a, str);
        if (a8 == null || a8.getSummary() == null) {
            return null;
        }
        return a8.getSummary().toString();
    }

    public final void h(C0780t4 t4Var) {
        if (t4Var.w()) {
            try {
                k kVar = this.f10941d;
                c cVar = (c) kVar.f9767W;
                ((SharedPreferences) cVar.f6955V).contains("startURL");
                if (!((SharedPreferences) cVar.f6955V).contains("screensaverWallpaperURL")) {
                    kVar.V2("screensaverWallpaperURL", "fully://color#000000");
                }
                Class<?> cls = Class.forName("android.preference.PreferenceManager");
                Class cls2 = Integer.TYPE;
                Method method = cls.getMethod("inflateFromResource", new Class[]{Context.class, cls2, PreferenceScreen.class});
                Object[] objArr = {t4Var, 2132148232, null};
                PreferenceScreen preferenceScreen = (PreferenceScreen) method.invoke((PreferenceManager) cls.getConstructor(new Class[]{Activity.class, cls2}).newInstance(new Object[]{t4Var, 100}), objArr);
                this.f10938a = preferenceScreen;
                l(preferenceScreen);
                this.f10942f = c(this.f10938a, 2);
                this.e = c(this.f10938a, 1);
                this.f10944h = c(this.f10938a, 8);
                this.f10943g = e();
                c(this.f10938a, 4);
                j(this.f10938a, this.e, (Preference) null);
                j(this.f10938a, this.f10943g, (Preference) null);
                i(this.f10938a);
            } catch (Exception e8) {
                e8.printStackTrace();
                a.b1(t4Var, "Failed to read preferences");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:283:0x05f8, code lost:
        if (r10.r1() != 2) goto L_0x05fa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x064d  */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x0716  */
    /* JADX WARNING: Removed duplicated region for block: B:337:0x07a3  */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x07ac  */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x087e  */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x0887  */
    /* JADX WARNING: Removed duplicated region for block: B:424:0x096e  */
    /* JADX WARNING: Removed duplicated region for block: B:432:0x09a7  */
    /* JADX WARNING: Removed duplicated region for block: B:440:0x09de  */
    /* JADX WARNING: Removed duplicated region for block: B:450:0x0a1b  */
    /* JADX WARNING: Removed duplicated region for block: B:451:0x0a20  */
    /* JADX WARNING: Removed duplicated region for block: B:479:0x0a9c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(android.preference.Preference r40) {
        /*
            r39 = this;
            r1 = r39
            r2 = r40
            r3 = 2
            r4 = 0
            r5 = 1
            java.lang.String r0 = "settingsRemoteAdmin"
            a(r2, r0)
            java.lang.String r0 = "setRemoveSystemUI"
            android.preference.Preference r0 = a(r2, r0)
            java.lang.String r6 = "appearance"
            if (r0 == 0) goto L_0x001f
            android.preference.Preference r7 = a(r2, r6)
            android.preference.PreferenceGroup r7 = (android.preference.PreferenceGroup) r7
            r7.removePreference(r0)
        L_0x001f:
            java.lang.String r0 = "rateFully"
            android.preference.Preference r0 = a(r2, r0)
            java.lang.String r7 = "otherThings"
            if (r0 == 0) goto L_0x0032
            android.preference.Preference r8 = a(r2, r7)
            android.preference.PreferenceGroup r8 = (android.preference.PreferenceGroup) r8
            r8.removePreference(r0)
        L_0x0032:
            java.lang.String r0 = "showVersionInfo"
            android.preference.Preference r0 = a(r2, r0)
            if (r0 == 0) goto L_0x0043
            android.preference.Preference r8 = a(r2, r7)
            android.preference.PreferenceGroup r8 = (android.preference.PreferenceGroup) r8
            r8.removePreference(r0)
        L_0x0043:
            java.lang.String r0 = "enableVersionInfo"
            android.preference.Preference r0 = a(r2, r0)
            if (r0 == 0) goto L_0x0054
            android.preference.Preference r8 = a(r2, r7)
            android.preference.PreferenceGroup r8 = (android.preference.PreferenceGroup) r8
            r8.removePreference(r0)
        L_0x0054:
            java.lang.String r0 = "confirmExit"
            android.preference.Preference r0 = a(r2, r0)
            android.app.Activity r8 = r1.f10939b
            if (r0 == 0) goto L_0x006d
            boolean r9 = de.ozerov.fully.P.y(r8)
            if (r9 == 0) goto L_0x006d
            android.preference.Preference r9 = a(r2, r7)
            android.preference.PreferenceGroup r9 = (android.preference.PreferenceGroup) r9
            r9.removePreference(r0)
        L_0x006d:
            java.lang.String r0 = "movementBeaconList"
            android.preference.Preference r9 = a(r2, r0)
            if (r9 == 0) goto L_0x0086
            android.bluetooth.BluetoothAdapter r0 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()     // Catch:{ Exception -> 0x007f }
            if (r0 != 0) goto L_0x0086
            r9.setEnabled(r4)     // Catch:{ Exception -> 0x007f }
            goto L_0x0086
        L_0x007f:
            r0 = move-exception
            r0.printStackTrace()
            r9.setEnabled(r4)
        L_0x0086:
            java.lang.String r0 = "movementBeaconDistance"
            android.preference.Preference r9 = a(r2, r0)
            if (r9 == 0) goto L_0x009f
            android.bluetooth.BluetoothAdapter r0 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()     // Catch:{ Exception -> 0x0098 }
            if (r0 != 0) goto L_0x009f
            r9.setEnabled(r4)     // Catch:{ Exception -> 0x0098 }
            goto L_0x009f
        L_0x0098:
            r0 = move-exception
            r0.printStackTrace()
            r9.setEnabled(r4)
        L_0x009f:
            java.lang.String r0 = "detectIBeacons"
            android.preference.Preference r9 = a(r2, r0)
            if (r9 == 0) goto L_0x00b8
            android.bluetooth.BluetoothAdapter r0 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()     // Catch:{ Exception -> 0x00b1 }
            if (r0 != 0) goto L_0x00b8
            r9.setEnabled(r4)     // Catch:{ Exception -> 0x00b1 }
            goto L_0x00b8
        L_0x00b1:
            r0 = move-exception
            r0.printStackTrace()
            r9.setEnabled(r4)
        L_0x00b8:
            java.lang.String r0 = "volumeLicenseKey"
            android.preference.Preference r0 = a(r2, r0)
            java.lang.String r9 = ""
            d4.k r10 = r1.f10941d
            if (r0 == 0) goto L_0x00df
            java.lang.Object r11 = r10.f9767W
            Z1.c r11 = (Z1.c) r11
            java.lang.String r12 = "volumeLicenseStatus"
            java.lang.String r11 = r11.r(r12, r9)
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto L_0x00df
            java.lang.Object r11 = r10.f9767W
            Z1.c r11 = (Z1.c) r11
            java.lang.String r11 = r11.r(r12, r9)
            r0.setSummary(r11)
        L_0x00df:
            java.lang.String r0 = "proximityScreenOff"
            android.preference.Preference r0 = a(r2, r0)
            if (r0 == 0) goto L_0x0117
            java.lang.String r11 = "power"
            java.lang.Object r11 = r8.getSystemService(r11)     // Catch:{ Exception -> 0x0113 }
            android.os.PowerManager r11 = (android.os.PowerManager) r11     // Catch:{ Exception -> 0x0113 }
            r12 = 32
            boolean r11 = r11.isWakeLockLevelSupported(r12)     // Catch:{ Exception -> 0x0113 }
            if (r11 != 0) goto L_0x0117
            r0.setEnabled(r4)     // Catch:{ Exception -> 0x0113 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0113 }
            r11.<init>()     // Catch:{ Exception -> 0x0113 }
            java.lang.CharSequence r12 = r0.getSummary()     // Catch:{ Exception -> 0x0113 }
            r11.append(r12)     // Catch:{ Exception -> 0x0113 }
            java.lang.String r12 = " (Android 5+ with proximity sensor required)"
            r11.append(r12)     // Catch:{ Exception -> 0x0113 }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x0113 }
            r0.setSummary(r11)     // Catch:{ Exception -> 0x0113 }
            goto L_0x0117
        L_0x0113:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0117:
            java.lang.String r0 = "phoneSpeaker"
            android.preference.Preference r0 = a(r2, r0)
            if (r0 == 0) goto L_0x014b
            android.content.pm.PackageManager r11 = r8.getPackageManager()     // Catch:{ Exception -> 0x0147 }
            java.lang.String r12 = "android.hardware.telephony"
            boolean r11 = r11.hasSystemFeature(r12)     // Catch:{ Exception -> 0x0147 }
            if (r11 != 0) goto L_0x014b
            r0.setEnabled(r4)     // Catch:{ Exception -> 0x0147 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0147 }
            r11.<init>()     // Catch:{ Exception -> 0x0147 }
            java.lang.CharSequence r12 = r0.getSummary()     // Catch:{ Exception -> 0x0147 }
            r11.append(r12)     // Catch:{ Exception -> 0x0147 }
            java.lang.String r12 = " (Telephony support required)"
            r11.append(r12)     // Catch:{ Exception -> 0x0147 }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x0147 }
            r0.setSummary(r11)     // Catch:{ Exception -> 0x0147 }
            goto L_0x014b
        L_0x0147:
            r0 = move-exception
            r0.printStackTrace()
        L_0x014b:
            java.lang.String r0 = "ignoreMotionWhenMoving"
            android.preference.Preference r0 = a(r2, r0)
            java.lang.String r11 = "sensor"
            if (r0 == 0) goto L_0x0177
            java.lang.Object r12 = r8.getSystemService(r11)     // Catch:{ Exception -> 0x0173 }
            android.hardware.SensorManager r12 = (android.hardware.SensorManager) r12     // Catch:{ Exception -> 0x0173 }
            java.util.List r13 = r12.getSensorList(r5)     // Catch:{ Exception -> 0x0173 }
            int r13 = r13.size()     // Catch:{ Exception -> 0x0173 }
            if (r13 >= r5) goto L_0x0177
            java.util.List r12 = r12.getSensorList(r3)     // Catch:{ Exception -> 0x0173 }
            int r12 = r12.size()     // Catch:{ Exception -> 0x0173 }
            if (r12 >= r5) goto L_0x0177
            r0.setEnabled(r4)     // Catch:{ Exception -> 0x0173 }
            goto L_0x0177
        L_0x0173:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0177:
            java.lang.String r0 = "accelerometerSensitivity"
            android.preference.Preference r0 = a(r2, r0)
            if (r0 == 0) goto L_0x0197
            java.lang.Object r12 = r8.getSystemService(r11)     // Catch:{ Exception -> 0x0193 }
            android.hardware.SensorManager r12 = (android.hardware.SensorManager) r12     // Catch:{ Exception -> 0x0193 }
            java.util.List r12 = r12.getSensorList(r5)     // Catch:{ Exception -> 0x0193 }
            int r12 = r12.size()     // Catch:{ Exception -> 0x0193 }
            if (r12 >= r5) goto L_0x0197
            r0.setEnabled(r4)     // Catch:{ Exception -> 0x0193 }
            goto L_0x0197
        L_0x0193:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0197:
            java.lang.String r0 = "compassSensitivity"
            android.preference.Preference r0 = a(r2, r0)
            if (r0 == 0) goto L_0x01b7
            java.lang.Object r11 = r8.getSystemService(r11)     // Catch:{ Exception -> 0x01b3 }
            android.hardware.SensorManager r11 = (android.hardware.SensorManager) r11     // Catch:{ Exception -> 0x01b3 }
            java.util.List r11 = r11.getSensorList(r3)     // Catch:{ Exception -> 0x01b3 }
            int r11 = r11.size()     // Catch:{ Exception -> 0x01b3 }
            if (r11 >= r5) goto L_0x01b7
            r0.setEnabled(r4)     // Catch:{ Exception -> 0x01b3 }
            goto L_0x01b7
        L_0x01b3:
            r0 = move-exception
            r0.printStackTrace()
        L_0x01b7:
            java.lang.String r0 = "kioskExitGesture"
            a(r2, r0)
            java.lang.String r11 = "cameraCaptureUploads"
            android.preference.Preference r12 = a(r2, r11)
            if (r12 == 0) goto L_0x01e8
            android.content.Intent r13 = new android.content.Intent
            java.lang.String r14 = "android.media.action.IMAGE_CAPTURE"
            r13.<init>(r14)
            android.content.pm.PackageManager r14 = r8.getPackageManager()
            android.content.ComponentName r13 = r13.resolveActivity(r14)
            if (r13 != 0) goto L_0x01e8
            r12.setEnabled(r4)
            r13 = r12
            de.ozerov.fully.SwitchPref r13 = (de.ozerov.fully.SwitchPref) r13
            r13.setChecked(r4)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = " (Android camera support required)"
            Q0.g.w(r12, r13, r14)
        L_0x01e8:
            java.lang.String r12 = "videoCaptureUploads"
            android.preference.Preference r13 = a(r2, r12)
            if (r13 == 0) goto L_0x0214
            android.content.Intent r14 = new android.content.Intent
            java.lang.String r15 = "android.media.action.VIDEO_CAPTURE"
            r14.<init>(r15)
            android.content.pm.PackageManager r15 = r8.getPackageManager()
            android.content.ComponentName r14 = r14.resolveActivity(r15)
            if (r14 != 0) goto L_0x0214
            r13.setEnabled(r4)
            r14 = r13
            de.ozerov.fully.SwitchPref r14 = (de.ozerov.fully.SwitchPref) r14
            r14.setChecked(r4)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = " (Android camcorder support required)"
            Q0.g.w(r13, r14, r15)
        L_0x0214:
            java.lang.String r13 = "audioRecordUploads"
            android.preference.Preference r14 = a(r2, r13)
            if (r14 == 0) goto L_0x0240
            android.content.Intent r15 = new android.content.Intent
            java.lang.String r3 = "android.provider.MediaStore.RECORD_SOUND"
            r15.<init>(r3)
            android.content.pm.PackageManager r3 = r8.getPackageManager()
            android.content.ComponentName r3 = r15.resolveActivity(r3)
            if (r3 != 0) goto L_0x0240
            r14.setEnabled(r4)
            r3 = r14
            de.ozerov.fully.SwitchPref r3 = (de.ozerov.fully.SwitchPref) r3
            r3.setChecked(r4)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r15 = " (Android audio records support required)"
            Q0.g.w(r14, r3, r15)
        L_0x0240:
            java.lang.String r3 = "android.permission.DISABLE_KEYGUARD"
            int r3 = j0.f.a(r8, r3)
            if (r3 == 0) goto L_0x025e
            java.lang.String r3 = "forceScreenUnlock"
            android.preference.Preference r3 = a(r2, r3)
            if (r3 == 0) goto L_0x025e
            java.lang.StringBuilder r14 = Q0.g.q(r3, r4)
            java.lang.String r15 = " (disabled in many Fire OS)"
            Q0.g.w(r3, r14, r15)
            de.ozerov.fully.SwitchPref r3 = (de.ozerov.fully.SwitchPref) r3
            r3.setChecked(r4)
        L_0x025e:
            boolean r3 = de.ozerov.fully.P.D(r8)
            java.lang.String r14 = "preventSleepWhileScreenOff"
            if (r3 == 0) goto L_0x027a
            android.preference.Preference r3 = a(r2, r14)
            if (r3 == 0) goto L_0x027a
            java.lang.StringBuilder r15 = Q0.g.q(r3, r4)
            java.lang.String r5 = " (disabled in Fire OS)"
            Q0.g.w(r3, r15, r5)
            de.ozerov.fully.SwitchPref r3 = (de.ozerov.fully.SwitchPref) r3
            r3.setChecked(r4)
        L_0x027a:
            boolean r3 = de.ozerov.fully.P.z()
            if (r3 == 0) goto L_0x02bc
            java.lang.String r21 = "showSleepScheduleSelector"
            java.lang.String r22 = "keepSleepingIfUnplugged"
            java.lang.String r16 = "kioskMode"
            java.lang.String r17 = "timeToScreenOffV2"
            java.lang.String r18 = "screenOffInDarkness"
            java.lang.String r19 = "sleepOnPowerConnect"
            java.lang.String r20 = "sleepOnPowerDisconnect"
            java.lang.String r23 = "lockSafeMode"
            java.lang.String r24 = "disableCamera"
            java.lang.String[] r3 = new java.lang.String[]{r16, r17, r18, r19, r20, r21, r22, r23, r24}
            r5 = 0
        L_0x0297:
            r15 = 9
            if (r5 >= r15) goto L_0x02bc
            r15 = r3[r5]
            android.preference.Preference r15 = a(r2, r15)
            if (r15 == 0) goto L_0x02b6
            java.lang.StringBuilder r1 = Q0.g.q(r15, r4)
            java.lang.String r4 = " (disabled for ChromeOS)"
            Q0.g.w(r15, r1, r4)
            boolean r1 = r15 instanceof de.ozerov.fully.SwitchPref
            if (r1 == 0) goto L_0x02b6
            de.ozerov.fully.SwitchPref r15 = (de.ozerov.fully.SwitchPref) r15
            r1 = 0
            r15.setChecked(r1)
        L_0x02b6:
            r1 = 1
            int r5 = r5 + r1
            r1 = r39
            r4 = 0
            goto L_0x0297
        L_0x02bc:
            boolean r1 = n2.a.p0()
            if (r1 == 0) goto L_0x030f
            boolean r1 = de.ozerov.fully.P.x(r8)
            if (r1 == 0) goto L_0x030f
            boolean r1 = android.provider.Settings.canDrawOverlays(r8)
            if (r1 != 0) goto L_0x030f
            java.lang.String r23 = "timeToClearSingleAppData"
            java.lang.String r24 = "timeToRegainFocus"
            java.lang.String r17 = "kioskMode"
            java.lang.String r18 = "forceScreenOrientationGlobal"
            java.lang.String r19 = "forceImmersive"
            java.lang.String r20 = "batteryWarning"
            java.lang.String r21 = "motionDetection"
            java.lang.String r22 = "touchesOtherAppsBreakIdle"
            java.lang.String r25 = "restartOnCrash"
            java.lang.String r26 = "restartAfterUpdate"
            java.lang.String[] r1 = new java.lang.String[]{r17, r18, r19, r20, r21, r22, r23, r24, r25, r26}
            r3 = 0
        L_0x02e7:
            r4 = 10
            if (r3 >= r4) goto L_0x030f
            r4 = r1[r3]
            java.lang.String r5 = "kioskMode"
            r4.equals(r5)
            android.preference.Preference r4 = a(r2, r4)
            if (r4 == 0) goto L_0x030c
            r5 = 0
            java.lang.StringBuilder r15 = Q0.g.q(r4, r5)
            java.lang.String r5 = " (not available in Android Go Edition with Android 10+)"
            Q0.g.w(r4, r15, r5)
            boolean r5 = r4 instanceof de.ozerov.fully.SwitchPref
            if (r5 == 0) goto L_0x030c
            de.ozerov.fully.SwitchPref r4 = (de.ozerov.fully.SwitchPref) r4
            r5 = 0
            r4.setChecked(r5)
        L_0x030c:
            r4 = 1
            int r3 = r3 + r4
            goto L_0x02e7
        L_0x030f:
            java.lang.String r1 = "renderInCutoutArea"
            android.preference.Preference r1 = a(r2, r1)
            if (r1 == 0) goto L_0x0330
            boolean r3 = n2.a.C0()
            if (r3 != 0) goto L_0x0330
            r3 = 0
            r1.setEnabled(r3)
            android.preference.Preference r3 = a(r2, r7)
            if (r3 == 0) goto L_0x0330
            android.preference.Preference r3 = a(r2, r7)
            android.preference.PreferenceGroup r3 = (android.preference.PreferenceGroup) r3
            r3.removePreference(r1)
        L_0x0330:
            java.lang.String r1 = "mdmApnConfig"
            android.preference.Preference r1 = a(r2, r1)
            java.lang.String r3 = " (Android 9+)"
            if (r1 == 0) goto L_0x0349
            boolean r4 = n2.a.C0()
            if (r4 != 0) goto L_0x0349
            r4 = 0
            java.lang.StringBuilder r5 = Q0.g.q(r1, r4)
            Q0.g.w(r1, r5, r3)
            goto L_0x034a
        L_0x0349:
            r4 = 0
        L_0x034a:
            java.lang.String r1 = "mdmLockTaskHomeButton"
            android.preference.Preference r1 = a(r2, r1)
            if (r1 == 0) goto L_0x035f
            boolean r5 = n2.a.C0()
            if (r5 != 0) goto L_0x035f
            java.lang.StringBuilder r5 = Q0.g.q(r1, r4)
            Q0.g.w(r1, r5, r3)
        L_0x035f:
            java.lang.String r1 = "mdmLockTaskOverviewButton"
            android.preference.Preference r1 = a(r2, r1)
            if (r1 == 0) goto L_0x0374
            boolean r5 = n2.a.C0()
            if (r5 != 0) goto L_0x0374
            java.lang.StringBuilder r5 = Q0.g.q(r1, r4)
            Q0.g.w(r1, r5, r3)
        L_0x0374:
            java.lang.String r1 = "mdmLockTaskNotifications"
            android.preference.Preference r1 = a(r2, r1)
            if (r1 == 0) goto L_0x0389
            boolean r5 = n2.a.C0()
            if (r5 != 0) goto L_0x0389
            java.lang.StringBuilder r5 = Q0.g.q(r1, r4)
            Q0.g.w(r1, r5, r3)
        L_0x0389:
            java.lang.String r1 = "mdmLockTaskSystemInfo"
            android.preference.Preference r1 = a(r2, r1)
            if (r1 == 0) goto L_0x039e
            boolean r5 = n2.a.C0()
            if (r5 != 0) goto L_0x039e
            java.lang.StringBuilder r5 = Q0.g.q(r1, r4)
            Q0.g.w(r1, r5, r3)
        L_0x039e:
            java.lang.String r1 = "mdmLockTaskKeyguard"
            android.preference.Preference r1 = a(r2, r1)
            if (r1 == 0) goto L_0x03b3
            boolean r5 = n2.a.C0()
            if (r5 != 0) goto L_0x03b3
            java.lang.StringBuilder r5 = Q0.g.q(r1, r4)
            Q0.g.w(r1, r5, r3)
        L_0x03b3:
            java.lang.String r1 = "mdmLockTaskGlobalActions"
            android.preference.Preference r1 = a(r2, r1)
            if (r1 == 0) goto L_0x03c8
            boolean r5 = n2.a.C0()
            if (r5 != 0) goto L_0x03c8
            java.lang.StringBuilder r5 = Q0.g.q(r1, r4)
            Q0.g.w(r1, r5, r3)
        L_0x03c8:
            java.lang.String r1 = "mdmTimeToClearLauncherAppData"
            android.preference.Preference r1 = a(r2, r1)
            if (r1 == 0) goto L_0x03dd
            boolean r5 = n2.a.C0()
            if (r5 != 0) goto L_0x03dd
            java.lang.StringBuilder r5 = Q0.g.q(r1, r4)
            Q0.g.w(r1, r5, r3)
        L_0x03dd:
            java.lang.String r1 = "mdmTimeToClearSingleAppData"
            android.preference.Preference r1 = a(r2, r1)
            if (r1 == 0) goto L_0x03f2
            boolean r5 = n2.a.C0()
            if (r5 != 0) goto L_0x03f2
            java.lang.StringBuilder r5 = Q0.g.q(r1, r4)
            Q0.g.w(r1, r5, r3)
        L_0x03f2:
            java.lang.String r1 = "formAutoComplete"
            android.preference.Preference r1 = a(r2, r1)
            java.lang.String r3 = "categoryWebAdvanced"
            if (r1 == 0) goto L_0x0414
            boolean r5 = n2.a.B0()
            if (r5 == 0) goto L_0x0414
            r1.setEnabled(r4)
            android.preference.Preference r4 = a(r2, r3)
            if (r4 == 0) goto L_0x0414
            android.preference.Preference r4 = a(r2, r3)
            android.preference.PreferenceGroup r4 = (android.preference.PreferenceGroup) r4
            r4.removePreference(r1)
        L_0x0414:
            java.lang.String r1 = "runInForeground"
            android.preference.Preference r1 = a(r2, r1)
            if (r1 == 0) goto L_0x0437
            boolean r4 = n2.a.B0()
            if (r4 == 0) goto L_0x0437
            r4 = 0
            r1.setEnabled(r4)
            r4 = r1
            de.ozerov.fully.SwitchPref r4 = (de.ozerov.fully.SwitchPref) r4
            r5 = 1
            r4.setChecked(r5)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = " (always enabled in Android 8+)"
            Q0.g.w(r1, r4, r5)
        L_0x0437:
            java.lang.String r1 = "hotspotMode"
            android.preference.Preference r1 = a(r2, r1)
            if (r1 == 0) goto L_0x0450
            boolean r4 = n2.a.B0()
            if (r4 != 0) goto L_0x0450
            r4 = 0
            java.lang.StringBuilder r5 = Q0.g.q(r1, r4)
            java.lang.String r15 = " (Android 8+ required)"
            Q0.g.w(r1, r5, r15)
            goto L_0x0451
        L_0x0450:
            r4 = 0
        L_0x0451:
            java.lang.String r1 = "lockSafeMode"
            android.preference.Preference r1 = a(r2, r1)
            if (r1 == 0) goto L_0x0472
            boolean r5 = n2.a.B0()
            if (r5 == 0) goto L_0x0472
            r1.setEnabled(r4)
            r5 = r1
            de.ozerov.fully.SwitchPref r5 = (de.ozerov.fully.SwitchPref) r5
            r5.setChecked(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = " (in Android 8+ requires device provisioning)"
            Q0.g.w(r1, r4, r5)
        L_0x0472:
            java.lang.String r1 = "disableCamera"
            android.preference.Preference r1 = a(r2, r1)
            java.lang.String r4 = " (in Android 10+ only available on provisioned devices)"
            if (r1 == 0) goto L_0x049a
            boolean r5 = n2.a.p0()
            if (r5 == 0) goto L_0x049a
            boolean r5 = de.ozerov.fully.C0794w0.Z(r8)
            if (r5 != 0) goto L_0x049a
            r5 = 0
            r1.setEnabled(r5)
            r15 = r1
            de.ozerov.fully.SwitchPref r15 = (de.ozerov.fully.SwitchPref) r15
            r15.setChecked(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            Q0.g.w(r1, r5, r4)
        L_0x049a:
            java.lang.String r1 = "resetWifiOnDisconnection"
            android.preference.Preference r1 = a(r2, r1)
            if (r1 == 0) goto L_0x04c0
            boolean r5 = n2.a.p0()
            if (r5 == 0) goto L_0x04c0
            boolean r5 = de.ozerov.fully.C0794w0.Z(r8)
            if (r5 != 0) goto L_0x04c0
            r5 = 0
            r1.setEnabled(r5)
            r15 = r1
            de.ozerov.fully.SwitchPref r15 = (de.ozerov.fully.SwitchPref) r15
            r15.setChecked(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            Q0.g.w(r1, r5, r4)
        L_0x04c0:
            java.lang.String r1 = "wifiMode"
            android.preference.Preference r1 = a(r2, r1)
            if (r1 == 0) goto L_0x04dd
            boolean r5 = n2.a.p0()
            if (r5 == 0) goto L_0x04dd
            boolean r5 = de.ozerov.fully.C0794w0.Z(r8)
            if (r5 != 0) goto L_0x04dd
            r5 = 0
            java.lang.StringBuilder r15 = Q0.g.q(r1, r5)
            Q0.g.w(r1, r15, r4)
            goto L_0x04de
        L_0x04dd:
            r5 = 0
        L_0x04de:
            java.lang.String r1 = "killOtherApps"
            android.preference.Preference r1 = a(r2, r1)
            if (r1 == 0) goto L_0x04ff
            boolean r4 = n2.a.F0()
            if (r4 == 0) goto L_0x04ff
            r1.setEnabled(r5)
            r4 = r1
            de.ozerov.fully.SwitchPref r4 = (de.ozerov.fully.SwitchPref) r4
            r4.setChecked(r5)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = " (not possible in Android 14+)"
            Q0.g.w(r1, r4, r5)
        L_0x04ff:
            a(r2, r0)
            java.lang.String r0 = "kioskWifiPinAction"
            android.preference.Preference r0 = a(r2, r0)
            java.lang.String r1 = "0"
            if (r0 == 0) goto L_0x0580
            boolean r4 = n2.a.p0()
            if (r4 == 0) goto L_0x0580
            boolean r4 = de.ozerov.fully.C0794w0.Z(r8)
            if (r4 != 0) goto L_0x0580
            de.ozerov.fully.ListPref r0 = (de.ozerov.fully.ListPref) r0
            java.lang.CharSequence[] r4 = r0.getEntryValues()
            java.lang.CharSequence[] r5 = r0.getEntries()
            r17 = r13
            r15 = 0
        L_0x0525:
            int r13 = r4.length
            if (r15 >= r13) goto L_0x0579
            r13 = r4[r15]
            r18 = r12
            java.lang.String r12 = "1"
            boolean r13 = r13.equals(r12)
            if (r13 == 0) goto L_0x056c
            r19 = r11
            r13 = 1
            int r11 = r15 + 1
            r20 = r7
            int r7 = r4.length
            int r7 = r7 - r13
            int r7 = r7 - r15
            java.lang.System.arraycopy(r4, r11, r4, r15, r7)
            int r7 = r5.length
            int r7 = r7 - r13
            int r7 = r7 - r15
            java.lang.System.arraycopy(r5, r11, r5, r15, r7)
            int r7 = r4.length
            int r7 = r7 - r13
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r7)
            java.lang.CharSequence[] r4 = (java.lang.CharSequence[]) r4
            int r7 = r5.length
            int r7 = r7 - r13
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r7)
            java.lang.CharSequence[] r5 = (java.lang.CharSequence[]) r5
            r0.setEntryValues(r4)
            r0.setEntries(r5)
            java.lang.String r7 = r0.getValue()
            boolean r7 = r7.equals(r12)
            if (r7 == 0) goto L_0x056a
            r0.setValue(r1)
        L_0x056a:
            r7 = 1
            goto L_0x0571
        L_0x056c:
            r20 = r7
            r19 = r11
            goto L_0x056a
        L_0x0571:
            int r15 = r15 + r7
            r12 = r18
            r11 = r19
            r7 = r20
            goto L_0x0525
        L_0x0579:
            r20 = r7
            r19 = r11
            r18 = r12
            goto L_0x0588
        L_0x0580:
            r20 = r7
            r19 = r11
            r18 = r12
            r17 = r13
        L_0x0588:
            java.lang.String r0 = "motionCameraId"
            android.preference.Preference r4 = a(r2, r0)
            if (r4 == 0) goto L_0x0645
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5.add(r9)
            java.lang.String r0 = "Default Camera (Front)"
            r7.add(r0)
            android.content.Context r0 = r8.getApplicationContext()
            java.lang.String r9 = "camera"
            java.lang.Object r0 = r0.getSystemService(r9)
            android.hardware.camera2.CameraManager r0 = (android.hardware.camera2.CameraManager) r0
            if (r0 == 0) goto L_0x062c
            java.lang.String[] r9 = r0.getCameraIdList()     // Catch:{ Exception -> 0x05e6, Error -> 0x05e4 }
            int r11 = r9.length     // Catch:{ Exception -> 0x05e6, Error -> 0x05e4 }
            r12 = 0
        L_0x05b6:
            if (r12 >= r11) goto L_0x062c
            r13 = r9[r12]     // Catch:{ Exception -> 0x05e6, Error -> 0x05e4 }
            android.hardware.camera2.CameraCharacteristics r15 = r0.getCameraCharacteristics(r13)     // Catch:{ Exception -> 0x05e6, Error -> 0x05e4 }
            r21 = r0
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.LENS_FACING     // Catch:{ Exception -> 0x05e6, Error -> 0x05e4 }
            java.lang.Object r0 = r15.get(r0)     // Catch:{ Exception -> 0x05e6, Error -> 0x05e4 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x05e6, Error -> 0x05e4 }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x05e6, Error -> 0x05e4 }
            r22 = r9
            android.hardware.camera2.CameraCharacteristics$Key r9 = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL     // Catch:{ Exception -> 0x05e6, Error -> 0x05e4 }
            java.lang.Object r9 = r15.get(r9)     // Catch:{ Exception -> 0x05e6, Error -> 0x05e4 }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ Exception -> 0x05e6, Error -> 0x05e4 }
            int r9 = r9.intValue()     // Catch:{ Exception -> 0x05e6, Error -> 0x05e4 }
            java.lang.String r15 = "Unknown"
            r23 = r11
            r11 = 1
            if (r0 != r11) goto L_0x05e8
            java.lang.String r15 = "Back"
            goto L_0x05e8
        L_0x05e4:
            r0 = move-exception
            goto L_0x0629
        L_0x05e6:
            r0 = move-exception
            goto L_0x0629
        L_0x05e8:
            if (r0 != 0) goto L_0x05ec
            java.lang.String r15 = "Front"
        L_0x05ec:
            r11 = 2
            if (r0 == r11) goto L_0x05f2
            r0 = 4
            if (r9 != r0) goto L_0x05fc
        L_0x05f2:
            java.lang.String r15 = "External, often not supported"
            int r0 = r10.r1()     // Catch:{ Exception -> 0x05e6, Error -> 0x05e4 }
            if (r0 == r11) goto L_0x05fc
        L_0x05fa:
            r9 = 1
            goto L_0x0621
        L_0x05fc:
            r5.add(r13)     // Catch:{ Exception -> 0x05e6, Error -> 0x05e4 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x05e6, Error -> 0x05e4 }
            r0.<init>()     // Catch:{ Exception -> 0x05e6, Error -> 0x05e4 }
            java.lang.String r9 = "Camera #"
            r0.append(r9)     // Catch:{ Exception -> 0x05e6, Error -> 0x05e4 }
            r0.append(r13)     // Catch:{ Exception -> 0x05e6, Error -> 0x05e4 }
            java.lang.String r9 = " ("
            r0.append(r9)     // Catch:{ Exception -> 0x05e6, Error -> 0x05e4 }
            r0.append(r15)     // Catch:{ Exception -> 0x05e6, Error -> 0x05e4 }
            java.lang.String r9 = ")"
            r0.append(r9)     // Catch:{ Exception -> 0x05e6, Error -> 0x05e4 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x05e6, Error -> 0x05e4 }
            r7.add(r0)     // Catch:{ Exception -> 0x05e6, Error -> 0x05e4 }
            goto L_0x05fa
        L_0x0621:
            int r12 = r12 + r9
            r0 = r21
            r9 = r22
            r11 = r23
            goto L_0x05b6
        L_0x0629:
            r0.printStackTrace()
        L_0x062c:
            de.ozerov.fully.ListPref r4 = (de.ozerov.fully.ListPref) r4
            r9 = 0
            java.lang.String[] r0 = new java.lang.String[r9]
            java.lang.Object[] r0 = r5.toArray(r0)
            java.lang.CharSequence[] r0 = (java.lang.CharSequence[]) r0
            r4.setEntryValues(r0)
            java.lang.String[] r0 = new java.lang.String[r9]
            java.lang.Object[] r0 = r7.toArray(r0)
            java.lang.CharSequence[] r0 = (java.lang.CharSequence[]) r0
            r4.setEntries(r0)
        L_0x0645:
            java.lang.String r0 = "displayMode"
            android.preference.Preference r0 = a(r2, r0)
            if (r0 == 0) goto L_0x06e0
            boolean r4 = n2.a.y0()
            if (r4 == 0) goto L_0x06d5
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4.add(r1)
            java.lang.String r1 = "Default"
            r5.add(r1)
            java.lang.String r1 = "window"
            java.lang.Object r1 = r8.getSystemService(r1)
            android.view.WindowManager r1 = (android.view.WindowManager) r1
            android.view.Display r1 = r1.getDefaultDisplay()
            android.view.Display$Mode[] r1 = r1.getSupportedModes()
            if (r1 == 0) goto L_0x06bb
            int r6 = r1.length
            r7 = 0
        L_0x0679:
            if (r7 >= r6) goto L_0x06bb
            r9 = r1[r7]
            int r11 = r9.getPhysicalWidth()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            int r12 = r9.getPhysicalHeight()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            float r13 = r9.getRefreshRate()
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            r15 = 3
            java.lang.Object[] r15 = new java.lang.Object[r15]
            r16 = 0
            r15[r16] = r11
            r11 = 1
            r15[r11] = r12
            r12 = 2
            r15[r12] = r13
            java.lang.String r13 = "%dx%d @%.1ffps"
            java.lang.String r13 = java.lang.String.format(r13, r15)
            r9.getModeId()
            int r9 = r9.getModeId()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r4.add(r9)
            r5.add(r13)
            int r7 = r7 + r11
            goto L_0x0679
        L_0x06bb:
            de.ozerov.fully.ListPref r0 = (de.ozerov.fully.ListPref) r0
            r1 = 0
            java.lang.String[] r6 = new java.lang.String[r1]
            java.lang.Object[] r4 = r4.toArray(r6)
            java.lang.CharSequence[] r4 = (java.lang.CharSequence[]) r4
            r0.setEntryValues(r4)
            java.lang.String[] r4 = new java.lang.String[r1]
            java.lang.Object[] r1 = r5.toArray(r4)
            java.lang.CharSequence[] r1 = (java.lang.CharSequence[]) r1
            r0.setEntries(r1)
            goto L_0x06e0
        L_0x06d5:
            android.preference.Preference r1 = a(r2, r6)
            android.preference.PreferenceGroup r1 = (android.preference.PreferenceGroup) r1
            if (r1 == 0) goto L_0x06e0
            r1.removePreference(r0)
        L_0x06e0:
            java.lang.String r0 = "selectWebViewImpl"
            android.preference.Preference r0 = a(r2, r0)
            if (r0 == 0) goto L_0x06f7
            boolean r1 = n2.a.z0()
            if (r1 != 0) goto L_0x06f7
            android.preference.Preference r1 = a(r2, r3)
            android.preference.PreferenceGroup r1 = (android.preference.PreferenceGroup) r1
            r1.removePreference(r0)
        L_0x06f7:
            android.preference.Preference r0 = a(r2, r14)
            if (r0 == 0) goto L_0x070e
            boolean r1 = n2.a.y0()
            if (r1 != 0) goto L_0x070e
            java.lang.String r1 = "categoryPowerSettings"
            android.preference.Preference r1 = a(r2, r1)
            android.preference.PreferenceGroup r1 = (android.preference.PreferenceGroup) r1
            r1.removePreference(r0)
        L_0x070e:
            boolean r0 = de.ozerov.fully.P.y(r8)
            java.lang.String r1 = "unlockAndroidTvPrefs"
            if (r0 == 0) goto L_0x077c
            java.lang.String r35 = "screensaverBrightness"
            java.lang.String r36 = "screenBrightness"
            java.lang.String r21 = "disableStatusBar"
            java.lang.String r22 = "disableHomeButton"
            java.lang.String r23 = "disableOtherApps"
            java.lang.String r24 = "lockSafeMode"
            java.lang.String r25 = "disableCamera"
            java.lang.String r26 = "disableVolumeButtons"
            java.lang.String r27 = "settingsMotionDetection"
            java.lang.String r28 = "sleepSchedule"
            java.lang.String r29 = "showSleepScheduleSelector"
            java.lang.String r30 = "keepSleepingIfUnplugged"
            java.lang.String r31 = "sleepOnPowerConnect"
            java.lang.String r32 = "sleepOnPowerDisconnect"
            java.lang.String r33 = "timeToScreenOffV2"
            java.lang.String r34 = "batteryWarning"
            java.lang.String r37 = "selectWebViewImpl"
            java.lang.String r38 = "forceDeviceAdmin"
            java.lang.String[] r0 = new java.lang.String[]{r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38}
            r3 = 0
        L_0x073f:
            r4 = 18
            if (r3 >= r4) goto L_0x077c
            r4 = r0[r3]
            android.preference.Preference r4 = a(r2, r4)
            if (r4 == 0) goto L_0x076d
            java.lang.Object r5 = r10.f9767W
            Z1.c r5 = (Z1.c) r5
            r6 = 0
            boolean r5 = r5.n(r1, r6)
            if (r5 != 0) goto L_0x076f
            r4.setEnabled(r6)
            boolean r5 = r4 instanceof de.ozerov.fully.SwitchPref
            if (r5 == 0) goto L_0x0763
            r5 = r4
            de.ozerov.fully.SwitchPref r5 = (de.ozerov.fully.SwitchPref) r5
            r5.setChecked(r6)
        L_0x0763:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = " (disabled in Android TV)"
            Q0.g.w(r4, r5, r6)
        L_0x076d:
            r4 = 1
            goto L_0x077a
        L_0x076f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = " (this option is likely incompatible with Android TV)"
            Q0.g.w(r4, r5, r6)
            goto L_0x076d
        L_0x077a:
            int r3 = r3 + r4
            goto L_0x073f
        L_0x077c:
            boolean r0 = de.ozerov.fully.P.y(r8)
            if (r0 != 0) goto L_0x0793
            android.preference.Preference r0 = a(r2, r1)
            if (r0 == 0) goto L_0x0793
            r1 = r20
            android.preference.Preference r1 = a(r2, r1)
            android.preference.PreferenceGroup r1 = (android.preference.PreferenceGroup) r1
            r1.removePreference(r0)
        L_0x0793:
            java.lang.String r0 = "settingsMqtt"
            android.preference.Preference r0 = a(r2, r0)
            java.lang.String r1 = " (Android 7+)"
            if (r0 == 0) goto L_0x07ac
            boolean r3 = n2.a.z0()
            if (r3 != 0) goto L_0x07ac
            r3 = 0
            java.lang.StringBuilder r4 = Q0.g.q(r0, r3)
            Q0.g.w(r0, r4, r1)
            goto L_0x07ad
        L_0x07ac:
            r3 = 0
        L_0x07ad:
            java.lang.String r0 = "lockscreenWallpaperUrl"
            android.preference.Preference r0 = a(r2, r0)
            if (r0 == 0) goto L_0x07c2
            boolean r4 = n2.a.z0()
            if (r4 != 0) goto L_0x07c2
            java.lang.StringBuilder r4 = Q0.g.q(r0, r3)
            Q0.g.w(r0, r4, r1)
        L_0x07c2:
            java.lang.String r0 = "videoPlayerEngine"
            android.preference.Preference r0 = a(r2, r0)
            if (r0 == 0) goto L_0x07d7
            boolean r4 = n2.a.z0()
            if (r4 != 0) goto L_0x07d7
            java.lang.StringBuilder r4 = Q0.g.q(r0, r3)
            Q0.g.w(r0, r4, r1)
        L_0x07d7:
            java.lang.String r0 = "mdmDisableStatusBar"
            android.preference.Preference r0 = a(r2, r0)
            java.lang.String r4 = " (Android 6+)"
            if (r0 == 0) goto L_0x07ee
            boolean r5 = n2.a.y0()
            if (r5 != 0) goto L_0x07ee
            java.lang.StringBuilder r5 = Q0.g.q(r0, r3)
            Q0.g.w(r0, r5, r4)
        L_0x07ee:
            java.lang.String r0 = "mdmDisableSafeModeBoot"
            android.preference.Preference r0 = a(r2, r0)
            if (r0 == 0) goto L_0x0803
            boolean r5 = n2.a.y0()
            if (r5 != 0) goto L_0x0803
            java.lang.StringBuilder r5 = Q0.g.q(r0, r3)
            Q0.g.w(r0, r5, r4)
        L_0x0803:
            java.lang.String r0 = "mdmSystemUpdatePolicy"
            android.preference.Preference r0 = a(r2, r0)
            if (r0 == 0) goto L_0x0818
            boolean r5 = n2.a.y0()
            if (r5 != 0) goto L_0x0818
            java.lang.StringBuilder r5 = Q0.g.q(r0, r3)
            Q0.g.w(r0, r5, r4)
        L_0x0818:
            java.lang.String r0 = "mdmRuntimePermissionPolicy"
            android.preference.Preference r0 = a(r2, r0)
            if (r0 == 0) goto L_0x082d
            boolean r5 = n2.a.y0()
            if (r5 != 0) goto L_0x082d
            java.lang.StringBuilder r5 = Q0.g.q(r0, r3)
            Q0.g.w(r0, r5, r4)
        L_0x082d:
            java.lang.String r0 = "mdmAppsToDisable"
            android.preference.Preference r0 = a(r2, r0)
            if (r0 == 0) goto L_0x0842
            boolean r4 = n2.a.z0()
            if (r4 != 0) goto L_0x0842
            java.lang.StringBuilder r4 = Q0.g.q(r0, r3)
            Q0.g.w(r0, r4, r1)
        L_0x0842:
            java.lang.String r0 = "mdmRebootTime"
            android.preference.Preference r0 = a(r2, r0)
            if (r0 == 0) goto L_0x0857
            boolean r4 = n2.a.z0()
            if (r4 != 0) goto L_0x0857
            java.lang.StringBuilder r4 = Q0.g.q(r0, r3)
            Q0.g.w(r0, r4, r1)
        L_0x0857:
            java.lang.String r0 = "forceSwipeUnlock"
            android.preference.Preference r0 = a(r2, r0)
            if (r0 == 0) goto L_0x086e
            boolean r1 = n2.a.B0()
            if (r1 != 0) goto L_0x086e
            java.lang.StringBuilder r1 = Q0.g.q(r0, r3)
            java.lang.String r3 = " (Android 8+)"
            Q0.g.w(r0, r1, r3)
        L_0x086e:
            java.lang.String r0 = "safeBrowsing"
            android.preference.Preference r0 = a(r2, r0)
            java.lang.String r1 = " (Android 8.1+)"
            if (r0 == 0) goto L_0x0887
            boolean r3 = n2.a.A0()
            if (r3 != 0) goto L_0x0887
            r3 = 0
            java.lang.StringBuilder r4 = Q0.g.q(r0, r3)
            Q0.g.w(r0, r4, r1)
            goto L_0x0888
        L_0x0887:
            r3 = 0
        L_0x0888:
            java.lang.String r0 = "formAutoFill"
            android.preference.Preference r0 = a(r2, r0)
            if (r0 == 0) goto L_0x089d
            boolean r4 = n2.a.A0()
            if (r4 != 0) goto L_0x089d
            java.lang.StringBuilder r4 = Q0.g.q(r0, r3)
            Q0.g.w(r0, r4, r1)
        L_0x089d:
            java.lang.String r0 = "appAutoFill"
            android.preference.Preference r0 = a(r2, r0)
            if (r0 == 0) goto L_0x08b4
            boolean r1 = n2.a.B0()
            if (r1 != 0) goto L_0x08b4
            java.lang.StringBuilder r1 = Q0.g.q(r0, r3)
            java.lang.String r3 = " (Android 8.0+)"
            Q0.g.w(r0, r1, r3)
        L_0x08b4:
            java.lang.String r0 = "loadContentZipFileUrl"
            a(r2, r0)
            java.lang.String r0 = "showPrintButton"
            a(r2, r0)
            java.lang.String r0 = "clientCaUrl"
            a(r2, r0)
            java.lang.String r0 = "clientCaPassword"
            a(r2, r0)
            java.lang.String r0 = "showLocalPdfFiles"
            a(r2, r0)
            java.lang.String r0 = "thirdPartyCookies"
            a(r2, r0)
            java.lang.String r0 = "webviewMixedContent"
            a(r2, r0)
            java.lang.String r0 = "webcamAccess"
            a(r2, r0)
            java.lang.String r0 = "microphoneAccess"
            a(r2, r0)
            java.lang.String r0 = "navigationBarColor"
            a(r2, r0)
            java.lang.String r0 = "statusBarColor"
            a(r2, r0)
            java.lang.String r0 = "fileUploads"
            a(r2, r0)
            r1 = r19
            a(r2, r1)
            r1 = r18
            a(r2, r1)
            r1 = r17
            a(r2, r1)
            java.lang.String r0 = "kioskAppBlacklist"
            a(r2, r0)
            java.lang.String r0 = "disableStatusBar"
            android.preference.Preference r0 = a(r2, r0)
            java.lang.String r1 = ", read FAQ for Android 12+"
            if (r0 == 0) goto L_0x091c
            boolean r3 = n2.a.r0()
            if (r3 == 0) goto L_0x091c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            Q0.g.w(r0, r3, r1)
        L_0x091c:
            if (r0 == 0) goto L_0x0934
            boolean r3 = n2.a.B0()
            if (r3 == 0) goto L_0x0934
            boolean r3 = de.ozerov.fully.Z0.f()
            if (r3 == 0) goto L_0x0934
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = ", use KNOX features for better Status Bar protection"
            Q0.g.w(r0, r3, r4)
        L_0x0934:
            java.lang.String r0 = "disablePowerButton"
            android.preference.Preference r0 = a(r2, r0)
            if (r0 == 0) goto L_0x094a
            boolean r3 = n2.a.r0()
            if (r3 == 0) goto L_0x094a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            Q0.g.w(r0, r3, r1)
        L_0x094a:
            if (r0 == 0) goto L_0x0962
            boolean r1 = n2.a.B0()
            if (r1 == 0) goto L_0x0962
            boolean r1 = de.ozerov.fully.Z0.f()
            if (r1 == 0) goto L_0x0962
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = ", use KNOX features for better Power Button protection"
            Q0.g.w(r0, r1, r3)
        L_0x0962:
            java.lang.String r0 = "removeNavigationBar"
            android.preference.Preference r0 = a(r2, r0)
            java.lang.String r1 = " (requires special permission, check our FAQs)"
            java.lang.String r3 = " (not possible in Android 11+)"
            if (r0 == 0) goto L_0x099f
            boolean r4 = n2.a.q0()
            if (r4 == 0) goto L_0x0987
            r4 = 0
            r0.setEnabled(r4)
            r5 = r0
            de.ozerov.fully.SwitchPref r5 = (de.ozerov.fully.SwitchPref) r5
            r5.setChecked(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            Q0.g.w(r0, r5, r3)
            goto L_0x099f
        L_0x0987:
            r4 = 0
            boolean r5 = de.ozerov.fully.C0794w0.k0(r8)
            if (r5 != 0) goto L_0x099f
            r0.setEnabled(r4)
            r5 = r0
            de.ozerov.fully.SwitchPref r5 = (de.ozerov.fully.SwitchPref) r5
            r5.setChecked(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            Q0.g.w(r0, r4, r1)
        L_0x099f:
            java.lang.String r0 = "removeStatusBar"
            android.preference.Preference r0 = a(r2, r0)
            if (r0 == 0) goto L_0x09d8
            boolean r4 = n2.a.q0()
            if (r4 == 0) goto L_0x09c0
            r4 = 0
            r0.setEnabled(r4)
            r1 = r0
            de.ozerov.fully.SwitchPref r1 = (de.ozerov.fully.SwitchPref) r1
            r1.setChecked(r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            Q0.g.w(r0, r1, r3)
            goto L_0x09d8
        L_0x09c0:
            r4 = 0
            boolean r3 = de.ozerov.fully.C0794w0.k0(r8)
            if (r3 != 0) goto L_0x09d8
            r0.setEnabled(r4)
            r3 = r0
            de.ozerov.fully.SwitchPref r3 = (de.ozerov.fully.SwitchPref) r3
            r3.setChecked(r4)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            Q0.g.w(r0, r3, r1)
        L_0x09d8:
            boolean r0 = n2.a.E0()
            if (r0 == 0) goto L_0x0a0d
            java.lang.String r0 = "screensaverDaydream"
            android.preference.Preference r0 = a(r2, r0)
            if (r0 == 0) goto L_0x09fa
            r1 = 0
            r0.setEnabled(r1)
            r3 = r0
            de.ozerov.fully.SwitchPref r3 = (de.ozerov.fully.SwitchPref) r3
            r3.setChecked(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = " (not possible in Android 13+)"
            Q0.g.w(r0, r1, r3)
        L_0x09fa:
            java.lang.String r0 = "daydreamSettings"
            android.preference.Preference r0 = a(r2, r0)
            if (r0 == 0) goto L_0x0a0d
            java.lang.String r1 = "screenSaver"
            android.preference.Preference r1 = a(r2, r1)
            android.preference.PreferenceGroup r1 = (android.preference.PreferenceGroup) r1
            r1.removePreference(r0)
        L_0x0a0d:
            java.lang.String r0 = "rootSettings"
            android.preference.Preference r0 = a(r2, r0)
            if (r0 == 0) goto L_0x0a20
            boolean r1 = de.ozerov.fully.P.A(r8)
            if (r1 != 0) goto L_0x0a20
            r1 = 0
            r0.setEnabled(r1)
            goto L_0x0a21
        L_0x0a20:
            r1 = 0
        L_0x0a21:
            java.lang.String r0 = "mdmSettings"
            android.preference.Preference r0 = a(r2, r0)
            if (r0 == 0) goto L_0x0a32
            boolean r3 = de.ozerov.fully.C0794w0.Z(r8)
            if (r3 != 0) goto L_0x0a32
            r0.setEnabled(r1)
        L_0x0a32:
            java.lang.String r0 = "knoxSettings"
            android.preference.Preference r0 = a(r2, r0)
            if (r0 == 0) goto L_0x0a4c
            boolean r1 = de.ozerov.fully.Z0.f()
            if (r1 == 0) goto L_0x0a41
            goto L_0x0a4c
        L_0x0a41:
            java.lang.String r1 = "mainScreen"
            android.preference.Preference r1 = a(r2, r1)
            android.preference.PreferenceGroup r1 = (android.preference.PreferenceGroup) r1
            r1.removePreference(r0)
        L_0x0a4c:
            java.lang.String r0 = "knoxSetForceAutoStartUpState"
            android.preference.Preference r0 = a(r2, r0)
            java.lang.String r1 = "knoxSettingsCategory"
            if (r0 == 0) goto L_0x0a6d
            boolean r3 = de.ozerov.fully.Z0.f()
            if (r3 == 0) goto L_0x0a6d
            java.lang.String r3 = "com.samsung.android.knox.permission.KNOX_CUSTOM_SYSTEM"
            boolean r3 = de.ozerov.fully.Z0.c(r3)
            if (r3 != 0) goto L_0x0a6d
            android.preference.Preference r3 = a(r2, r1)
            android.preference.PreferenceGroup r3 = (android.preference.PreferenceGroup) r3
            r3.removePreference(r0)
        L_0x0a6d:
            java.lang.String r0 = "knoxApnConfig"
            android.preference.Preference r0 = a(r2, r0)
            if (r0 == 0) goto L_0x0a8c
            boolean r3 = de.ozerov.fully.Z0.f()
            if (r3 == 0) goto L_0x0a8c
            java.lang.String r3 = "com.samsung.android.knox.permission.KNOX_APN"
            boolean r3 = de.ozerov.fully.Z0.c(r3)
            if (r3 != 0) goto L_0x0a8c
            android.preference.Preference r1 = a(r2, r1)
            android.preference.PreferenceGroup r1 = (android.preference.PreferenceGroup) r1
            r1.removePreference(r0)
        L_0x0a8c:
            java.util.HashMap r0 = de.ozerov.fully.A.f9782d
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0a96:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0ab4
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            android.preference.Preference r3 = a(r2, r1)
            if (r3 == 0) goto L_0x0a96
            java.util.HashMap r4 = de.ozerov.fully.A.f9782d
            java.lang.Object r1 = r4.get(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r3.setSummary(r1)
            goto L_0x0a96
        L_0x0ab4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.C0770s0.i(android.preference.Preference):void");
    }

    public final String k(String str) {
        String replace = str.replace("$short_name", "Fully").replace("$schema", "fully");
        k kVar = this.f10941d;
        return replace.replace("$cloud_name", ((c) kVar.f9767W).r("cloudName", "Fully Cloud")).replace("$account_url", ((c) kVar.f9767W).r("cloudAccountUrl", "fully-kiosk.com/cloud")).replace("$settings_prefix", "fully-single-app").replace("$tap_count", String.valueOf(kVar.m2())).replace("$max_brightness", String.valueOf(C0794w0.I(this.f10939b)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006c, code lost:
        r6 = (de.ozerov.fully.ListPref) r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(android.preference.Preference r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x0003
            return
        L_0x0003:
            boolean r0 = r6 instanceof android.preference.PreferenceCategory
            r1 = 0
            if (r0 != 0) goto L_0x000c
            boolean r0 = r6 instanceof android.preference.PreferenceScreen
            if (r0 == 0) goto L_0x0020
        L_0x000c:
            r0 = r6
            android.preference.PreferenceGroup r0 = (android.preference.PreferenceGroup) r0
            int r2 = r0.getPreferenceCount()
            r3 = 0
        L_0x0014:
            if (r3 >= r2) goto L_0x0020
            android.preference.Preference r4 = r0.getPreference(r3)
            r5.l(r4)
            int r3 = r3 + 1
            goto L_0x0014
        L_0x0020:
            java.lang.CharSequence r0 = r6.getTitle()
            if (r0 == 0) goto L_0x0035
            java.lang.CharSequence r0 = r6.getTitle()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r5.k(r0)
            r6.setTitle(r0)
        L_0x0035:
            java.lang.CharSequence r0 = r6.getSummary()     // Catch:{ Exception -> 0x0064 }
            if (r0 == 0) goto L_0x0068
            java.lang.CharSequence r0 = r6.getSummary()     // Catch:{ Exception -> 0x0064 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0064 }
            java.lang.String r0 = r5.k(r0)     // Catch:{ Exception -> 0x0064 }
            r6.setSummary(r0)     // Catch:{ Exception -> 0x0064 }
            boolean r0 = n2.a.z0()     // Catch:{ Exception -> 0x0064 }
            if (r0 == 0) goto L_0x0068
            java.lang.CharSequence r0 = r6.getSummary()     // Catch:{ Exception -> 0x0064 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0064 }
            java.lang.String r2 = "Daydream"
            java.lang.String r3 = "Screensaver"
            java.lang.String r0 = r0.replace(r2, r3)     // Catch:{ Exception -> 0x0064 }
            r6.setSummary(r0)     // Catch:{ Exception -> 0x0064 }
            goto L_0x0068
        L_0x0064:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0068:
            boolean r0 = r6 instanceof de.ozerov.fully.ListPref
            if (r0 == 0) goto L_0x0089
            de.ozerov.fully.ListPref r6 = (de.ozerov.fully.ListPref) r6
            java.lang.CharSequence[] r0 = r6.getEntries()
            if (r0 == 0) goto L_0x0089
        L_0x0074:
            int r2 = r0.length
            if (r1 >= r2) goto L_0x0086
            r2 = r0[r1]
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r5.k(r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L_0x0074
        L_0x0086:
            r6.setEntries(r0)
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.C0770s0.l(android.preference.Preference):void");
    }

    public final boolean m(String str, Boolean bool) {
        Class<?> cls;
        if (this.f10942f.contains(str) || this.e.contains(str)) {
            return false;
        }
        Map<String, ?> all = this.f10940c.getAll();
        if (all.get(str) != null) {
            cls = all.get(str).getClass();
        } else {
            cls = null;
        }
        Class<?> cls2 = bool.getClass();
        if (cls != null && !cls.equals(cls2)) {
            return false;
        }
        this.f10941d.R2(str, bool.booleanValue());
        return true;
    }

    public final boolean n(String str, String str2) {
        Class<?> cls;
        int i8;
        if (this.f10942f.contains(str) || this.e.contains(str)) {
            return false;
        }
        Map<String, ?> all = this.f10940c.getAll();
        if (all.get(str) != null) {
            cls = all.get(str).getClass();
        } else {
            cls = null;
        }
        Class<?> cls2 = str2.getClass();
        k kVar = this.f10941d;
        if (cls != null && cls.equals(Integer.class)) {
            try {
                if (str2.startsWith("#")) {
                    i8 = Color.parseColor(str2);
                } else if (str2.startsWith("0x")) {
                    i8 = Color.parseColor(str2.replace("0x", "#"));
                } else {
                    i8 = Integer.parseInt(str2);
                }
                kVar.S2(i8, str);
                return true;
            } catch (Exception e8) {
                e8.printStackTrace();
                return false;
            }
        } else if (cls != null && !cls.equals(cls2)) {
            return false;
        } else {
            kVar.V2(str, str2.replaceAll("(\r\n)", "\n"));
            return true;
        }
    }
}
