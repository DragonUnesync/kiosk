package de.ozerov.fully;

import Q0.g;
import Z1.c;
import android.app.Activity;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import d4.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import n2.a;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class I1 {

    /* renamed from: a  reason: collision with root package name */
    public static final ArrayList f10008a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public static String f10009b = null;

    public static void a(Context context) {
        JSONArray jSONArray;
        Context context2 = context;
        k kVar = new k(context2, 1);
        if (C0794w0.Z(context)) {
            DevicePolicyManager devicePolicyManager = (DevicePolicyManager) context2.getSystemService("device_policy");
            ComponentName a8 = DeviceOwnerReceiver.a(context);
            if (a.y0()) {
                c cVar = (c) kVar.f9767W;
                if (!cVar.r("emmAppPermissions", "").trim().isEmpty()) {
                    try {
                        jSONArray = new JSONArray(cVar.r("emmAppPermissions", ""));
                    } catch (Exception e) {
                        Log.e("I1", "JSON parser failed");
                        e.printStackTrace();
                        jSONArray = null;
                    }
                    if (jSONArray != null) {
                        int i = 0;
                        while (i < jSONArray.length()) {
                            try {
                                JSONObject jSONObject = jSONArray.getJSONObject(i);
                                JSONArray jSONArray2 = jSONObject.getJSONArray("permissions");
                                String string = jSONObject.getString("packageId");
                                int i8 = 0;
                                while (i8 < jSONArray2.length()) {
                                    try {
                                        JSONObject jSONObject2 = jSONArray2.getJSONObject(i8);
                                        String string2 = jSONObject2.getString("permissionId");
                                        int parseInt = Integer.parseInt(jSONObject2.getString("state"));
                                        if (parseInt < 0 || parseInt > 2) {
                                            Log.w("I1", "Wrong grant state " + parseInt + " ignored for " + string2 + " package " + string);
                                            i8++;
                                            Context context3 = context;
                                        } else {
                                            boolean equals = string2.equals("android.permission.ENTER_LOCK_TASK_MODE");
                                            ArrayList arrayList = f10008a;
                                            if (equals && parseInt == 1) {
                                                if (!arrayList.contains(string)) {
                                                    arrayList.add(string);
                                                }
                                                Log.i("I1", "Successfully whitelisted lock task for package" + string + " state: " + parseInt);
                                                i8++;
                                                Context context32 = context;
                                            } else if (!string2.equals("android.permission.ENTER_LOCK_TASK_MODE") || parseInt != 0) {
                                                try {
                                                    context.getPackageManager().getPermissionInfo(string2, 128);
                                                    try {
                                                        devicePolicyManager.setPermissionGrantState(a8, string, string2, parseInt);
                                                        Log.i("I1", "Successfully set permission " + string2 + " for package" + string + " state: " + parseInt);
                                                    } catch (Exception unused) {
                                                        Log.w("I1", "Failed to set permission " + string2 + " for package" + string + " state: " + parseInt);
                                                    }
                                                } catch (PackageManager.NameNotFoundException unused2) {
                                                }
                                                i8++;
                                                Context context322 = context;
                                            } else {
                                                arrayList.remove(string);
                                                Log.i("I1", "Successfully un-whitelisted lock task for package" + string + " state: " + parseInt);
                                                i8++;
                                                Context context3222 = context;
                                            }
                                        }
                                    } catch (Exception e8) {
                                        g.z(e8, new StringBuilder("Failed parsing packagePermissionList due to "), "I1");
                                    }
                                }
                            } catch (Exception e9) {
                                g.z(e9, new StringBuilder("Failed parsing permissionsArray due to "), "I1");
                            }
                            i++;
                            Context context4 = context;
                        }
                        return;
                    }
                    return;
                }
                Log.w("I1", "Empty emmAppPermissions");
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v16, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v18, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v19, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v20, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v21, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v22, resolved type: java.lang.String[]} */
    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.String] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:360|361) */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x02c0, code lost:
        de.ozerov.fully.C0669b0.r(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x02cb, code lost:
        if (de.ozerov.fully.C0669b0.u(r3, r5, de.ozerov.fully.C0669b0.b(r8), r0) != false) goto L_0x02f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x02cd, code lost:
        r7 = "Failed to update existing APN " + de.ozerov.fully.C0669b0.g(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x02e2, code lost:
        r9 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x02e4, code lost:
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:?, code lost:
        n2.a.b1(r9, r7);
        android.util.Log.w("I1", r7);
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x02eb, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x02ec, code lost:
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x02f1, code lost:
        r9 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x02f3, code lost:
        r6.remove(r8);
        r7 = true;
        r26 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x049d, code lost:
        r0 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x049e, code lost:
        if (r0 == 0) goto L_0x04b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x04a1, code lost:
        if (r0 == 1) goto L_0x04ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x04a3, code lost:
        if (r0 == 2) goto L_0x04a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x04a5, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x04a7, code lost:
        r0 = android.app.admin.SystemUpdatePolicy.createWindowedInstallPolicy(1320, 120);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x04ac, code lost:
        r0 = android.app.admin.SystemUpdatePolicy.createPostponeInstallPolicy();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x04b1, code lost:
        r0 = android.app.admin.SystemUpdatePolicy.createAutomaticInstallPolicy();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x04b5, code lost:
        if (r0 == null) goto L_0x04be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x04b7, code lost:
        r3.setSystemUpdatePolicy(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:?, code lost:
        r10 = new java.lang.StringBuilder();
        r11 = r16;
        r10.append(r11);
        r10.append(r8);
        android.util.Log.e("I1", r10.toString());
        n2.a.b1(r9, r11 + r8);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:360:0x066e */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x02a6 A[Catch:{ Exception -> 0x026a }] */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0308 A[Catch:{ Exception -> 0x02eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x03d9 A[Catch:{ Exception -> 0x0390 }] */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x03e1 A[Catch:{ Exception -> 0x0390 }] */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0411 A[Catch:{ Exception -> 0x040e }] */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x041e  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x04d5 A[Catch:{ Exception -> 0x040e }] */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x04d7 A[Catch:{ Exception -> 0x040e }] */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x04e6 A[Catch:{ Exception -> 0x040e }] */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x04e8 A[Catch:{ Exception -> 0x040e }] */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x0505 A[SYNTHETIC, Splitter:B:277:0x0505] */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x05a4 A[SYNTHETIC, Splitter:B:303:0x05a4] */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x05b3 A[Catch:{ Exception -> 0x05b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x05e4 A[SYNTHETIC, Splitter:B:318:0x05e4] */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x05eb A[Catch:{ Exception -> 0x040e }] */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x05fc A[SYNTHETIC, Splitter:B:324:0x05fc] */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x0600 A[Catch:{ Exception -> 0x040e }] */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x060f A[Catch:{ Exception -> 0x0622 }] */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x062d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x065b A[Catch:{ Exception -> 0x040e }] */
    /* JADX WARNING: Removed duplicated region for block: B:368:0x06b5  */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x06ca  */
    /* JADX WARNING: Removed duplicated region for block: B:379:0x035c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:382:0x0301 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f4 A[Catch:{ Exception -> 0x012f }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0137 A[Catch:{ Exception -> 0x012f }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(de.ozerov.fully.FullyActivity r29) {
        /*
            r1 = r29
            java.lang.String r2 = "Failed to enable "
            java.lang.String r3 = "mdmDisableUsbStorage"
            java.lang.String r4 = ""
            java.lang.String r5 = "carrierEnabled"
            java.lang.String r6 = "operatorNumeric"
            java.lang.String r7 = "apnName"
            java.lang.String r8 = "roamingProtocol"
            java.lang.String r9 = "protocol"
            java.lang.String r10 = "apnTypeBitmask"
            java.lang.String r11 = "="
            java.lang.String r12 = "entryName"
            java.lang.String r13 = " due to "
            java.lang.String r14 = "I1"
            d4.k r15 = new d4.k
            r16 = r2
            r2 = 1
            r15.<init>((android.content.Context) r1, (int) r2)
            java.lang.Object r0 = r15.f9767W
            r2 = r0
            Z1.c r2 = (Z1.c) r2
            r17 = r3
            R2.c r3 = r1.f9911B0
            boolean r0 = de.ozerov.fully.C0794w0.Z(r29)
            if (r0 == 0) goto L_0x06e2
            java.lang.String r0 = "device_policy"
            java.lang.Object r0 = r1.getSystemService(r0)
            r18 = r3
            r3 = r0
            android.app.admin.DevicePolicyManager r3 = (android.app.admin.DevicePolicyManager) r3
            r19 = r5
            android.content.ComponentName r5 = de.ozerov.fully.DeviceOwnerReceiver.a(r29)
            a(r29)     // Catch:{ Exception -> 0x0699 }
            java.lang.String r0 = "user"
            java.lang.Object r0 = r1.getSystemService(r0)     // Catch:{ Exception -> 0x00d9 }
            android.os.UserManager r0 = (android.os.UserManager) r0     // Catch:{ Exception -> 0x00d9 }
            android.os.Bundle r1 = r0.getUserRestrictions()     // Catch:{ Exception -> 0x00d9 }
            java.util.Set r0 = r1.keySet()     // Catch:{ Exception -> 0x00d9 }
            java.util.Iterator r20 = r0.iterator()     // Catch:{ Exception -> 0x00d9 }
        L_0x005b:
            boolean r0 = r20.hasNext()     // Catch:{ Exception -> 0x00d9 }
            if (r0 == 0) goto L_0x00dc
            java.lang.Object r0 = r20.next()     // Catch:{ Exception -> 0x00d9 }
            r21 = r6
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x00d6 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00d6 }
            r0.<init>()     // Catch:{ Exception -> 0x00d6 }
            r22 = r7
            java.lang.String r7 = "User restriction found: "
            r0.append(r7)     // Catch:{ Exception -> 0x00e1 }
            r0.append(r6)     // Catch:{ Exception -> 0x00e1 }
            r0.append(r11)     // Catch:{ Exception -> 0x00e1 }
            java.lang.Object r7 = r1.get(r6)     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x00e1 }
            r0.append(r7)     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00e1 }
            android.util.Log.i(r14, r0)     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r0 = "no_add_user"
            boolean r0 = r6.equals(r0)     // Catch:{ Exception -> 0x00aa }
            if (r0 != 0) goto L_0x00ac
            java.lang.String r0 = "no_add_managed_profile"
            boolean r0 = r6.equals(r0)     // Catch:{ Exception -> 0x00aa }
            if (r0 != 0) goto L_0x00ac
            java.lang.String r0 = "no_oem_unlock"
            boolean r0 = r6.equals(r0)     // Catch:{ Exception -> 0x00aa }
            if (r0 != 0) goto L_0x00ac
            r3.clearUserRestriction(r5, r6)     // Catch:{ Exception -> 0x00aa }
            goto L_0x00ac
        L_0x00aa:
            r0 = move-exception
            goto L_0x00af
        L_0x00ac:
            r23 = r1
            goto L_0x00cf
        L_0x00af:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e1 }
            r7.<init>()     // Catch:{ Exception -> 0x00e1 }
            r23 = r1
            java.lang.String r1 = "Failed to clear user restriction "
            r7.append(r1)     // Catch:{ Exception -> 0x00e1 }
            r7.append(r6)     // Catch:{ Exception -> 0x00e1 }
            r7.append(r13)     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x00e1 }
            r7.append(r0)     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r0 = r7.toString()     // Catch:{ Exception -> 0x00e1 }
            android.util.Log.w(r14, r0)     // Catch:{ Exception -> 0x00e1 }
        L_0x00cf:
            r6 = r21
            r7 = r22
            r1 = r23
            goto L_0x005b
        L_0x00d6:
            r22 = r7
            goto L_0x00e1
        L_0x00d9:
            r21 = r6
            goto L_0x00d6
        L_0x00dc:
            r21 = r6
            r22 = r7
            goto L_0x00e6
        L_0x00e1:
            java.lang.String r0 = "Failed to get the list of user restrictions"
            android.util.Log.e(r14, r0)     // Catch:{ Exception -> 0x012f }
        L_0x00e6:
            java.lang.String r0 = "mdmAddUserRestrictions"
            java.lang.String r0 = r2.r(r0, r4)     // Catch:{ Exception -> 0x012f }
            java.lang.String[] r1 = n2.a.e1(r0)     // Catch:{ Exception -> 0x012f }
            int r6 = r1.length     // Catch:{ Exception -> 0x012f }
            r7 = 0
        L_0x00f2:
            if (r7 >= r6) goto L_0x0131
            r23 = r6
            r6 = r1[r7]     // Catch:{ Exception -> 0x012f }
            r3.addUserRestriction(r5, r6)     // Catch:{ Exception -> 0x00ff }
            r25 = r1
        L_0x00fd:
            r1 = 1
            goto L_0x0123
        L_0x00ff:
            r0 = move-exception
            r24 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x012f }
            r0.<init>()     // Catch:{ Exception -> 0x012f }
            r25 = r1
            java.lang.String r1 = "Failed to add user restriction "
            r0.append(r1)     // Catch:{ Exception -> 0x012f }
            r0.append(r6)     // Catch:{ Exception -> 0x012f }
            r0.append(r13)     // Catch:{ Exception -> 0x012f }
            java.lang.String r1 = r24.getMessage()     // Catch:{ Exception -> 0x012f }
            r0.append(r1)     // Catch:{ Exception -> 0x012f }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x012f }
            android.util.Log.w(r14, r0)     // Catch:{ Exception -> 0x012f }
            goto L_0x00fd
        L_0x0123:
            int r7 = r7 + r1
            r6 = r23
            r1 = r25
            goto L_0x00f2
        L_0x0129:
            r9 = r29
        L_0x012b:
            r6 = r18
            goto L_0x069d
        L_0x012f:
            r0 = move-exception
            goto L_0x0129
        L_0x0131:
            boolean r0 = n2.a.C0()     // Catch:{ Exception -> 0x012f }
            if (r0 == 0) goto L_0x03d9
            java.lang.Boolean r0 = r15.n1()     // Catch:{ Exception -> 0x012f }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x012f }
            if (r0 == 0) goto L_0x0186
            java.lang.String r0 = "mdmLockTaskHomeButton"
            r6 = 0
            boolean r0 = r2.n(r0, r6)     // Catch:{ Exception -> 0x012f }
            if (r0 == 0) goto L_0x014e
            r20 = 4
            r0 = 4
            goto L_0x014f
        L_0x014e:
            r0 = 0
        L_0x014f:
            java.lang.String r7 = "mdmLockTaskOverviewButton"
            boolean r7 = r2.n(r7, r6)     // Catch:{ Exception -> 0x012f }
            if (r7 == 0) goto L_0x0159
            r0 = 12
        L_0x0159:
            java.lang.String r6 = "mdmLockTaskGlobalActions"
            r7 = 1
            boolean r6 = r2.n(r6, r7)     // Catch:{ Exception -> 0x012f }
            if (r6 == 0) goto L_0x0164
            r0 = r0 | 16
        L_0x0164:
            java.lang.String r6 = "mdmLockTaskNotifications"
            r7 = 0
            boolean r6 = r2.n(r6, r7)     // Catch:{ Exception -> 0x012f }
            if (r6 == 0) goto L_0x016f
            r0 = r0 | 6
        L_0x016f:
            java.lang.String r6 = "mdmLockTaskSystemInfo"
            boolean r6 = r2.n(r6, r7)     // Catch:{ Exception -> 0x012f }
            if (r6 == 0) goto L_0x0179
            r6 = 1
            r0 = r0 | r6
        L_0x0179:
            java.lang.String r6 = "mdmLockTaskKeyguard"
            boolean r6 = r2.n(r6, r7)     // Catch:{ Exception -> 0x012f }
            if (r6 == 0) goto L_0x0183
            r0 = r0 | 32
        L_0x0183:
            r3.setLockTaskFeatures(r5, r0)     // Catch:{ Exception -> 0x012f }
        L_0x0186:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Exception -> 0x012f }
            java.lang.String r6 = "mdmApnConfig"
            java.lang.String r6 = r2.r(r6, r4)     // Catch:{ Exception -> 0x03d6 }
            java.lang.String r6 = r6.trim()     // Catch:{ Exception -> 0x012f }
            java.lang.String[] r6 = n2.a.e1(r6)     // Catch:{ Exception -> 0x012f }
            java.util.List r6 = java.util.Arrays.asList(r6)     // Catch:{ Exception -> 0x012f }
            r0.<init>(r6)     // Catch:{ Exception -> 0x012f }
            java.util.List r6 = r3.getOverrideApns(r5)     // Catch:{ Exception -> 0x012f }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ Exception -> 0x012f }
            r26 = 0
        L_0x01a7:
            boolean r0 = r7.hasNext()     // Catch:{ Exception -> 0x012f }
            if (r0 == 0) goto L_0x0393
            java.lang.Object r0 = r7.next()     // Catch:{ Exception -> 0x012f }
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x012f }
            java.lang.String r0 = ";"
            java.util.HashMap r0 = n2.a.d1(r1, r0, r11)     // Catch:{ Exception -> 0x036a }
            de.ozerov.fully.C0669b0.j()     // Catch:{ Exception -> 0x036a }
            r24 = r7
            android.telephony.data.ApnSetting$Builder r7 = de.ozerov.fully.C0669b0.d()     // Catch:{ Exception -> 0x0330 }
            boolean r25 = r0.containsKey(r12)     // Catch:{ Exception -> 0x0330 }
            if (r25 == 0) goto L_0x0339
            java.lang.Object r25 = r0.get(r12)     // Catch:{ Exception -> 0x0330 }
            java.lang.String r25 = (java.lang.String) r25     // Catch:{ Exception -> 0x0330 }
            boolean r25 = r25.isEmpty()     // Catch:{ Exception -> 0x0330 }
            if (r25 != 0) goto L_0x0339
            java.lang.Object r25 = r0.get(r12)     // Catch:{ Exception -> 0x0330 }
            r27 = r11
            r11 = r25
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x01f6 }
            r7.setEntryName(r11)     // Catch:{ Exception -> 0x01f6 }
            boolean r11 = r0.containsKey(r10)     // Catch:{ Exception -> 0x01f6 }
            if (r11 == 0) goto L_0x0203
            java.lang.Object r11 = r0.get(r10)     // Catch:{ Exception -> 0x01f6 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x01f6 }
            int r11 = java.lang.Integer.parseInt(r11)     // Catch:{ Exception -> 0x01f6 }
            r7.setApnTypeBitmask(r11)     // Catch:{ Exception -> 0x01f6 }
            goto L_0x0206
        L_0x01f6:
            r0 = move-exception
            r25 = r8
            r28 = r9
        L_0x01fb:
            r11 = r22
            r9 = r29
            r22 = r21
            goto L_0x036e
        L_0x0203:
            r7.setApnTypeBitmask(17)     // Catch:{ Exception -> 0x01f6 }
        L_0x0206:
            boolean r11 = r0.containsKey(r9)     // Catch:{ Exception -> 0x01f6 }
            if (r11 == 0) goto L_0x0219
            java.lang.Object r11 = r0.get(r9)     // Catch:{ Exception -> 0x01f6 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x01f6 }
            int r11 = java.lang.Integer.parseInt(r11)     // Catch:{ Exception -> 0x01f6 }
            r7.setProtocol(r11)     // Catch:{ Exception -> 0x01f6 }
        L_0x0219:
            boolean r11 = r0.containsKey(r8)     // Catch:{ Exception -> 0x01f6 }
            if (r11 == 0) goto L_0x022c
            java.lang.Object r11 = r0.get(r8)     // Catch:{ Exception -> 0x01f6 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x01f6 }
            int r11 = java.lang.Integer.parseInt(r11)     // Catch:{ Exception -> 0x01f6 }
            r7.setRoamingProtocol(r11)     // Catch:{ Exception -> 0x01f6 }
        L_0x022c:
            r11 = r22
            boolean r22 = r0.containsKey(r11)     // Catch:{ Exception -> 0x024d }
            if (r22 == 0) goto L_0x0251
            java.lang.Object r22 = r0.get(r11)     // Catch:{ Exception -> 0x024d }
            r25 = r8
            r8 = r22
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x0244 }
            r7.setApnName(r8)     // Catch:{ Exception -> 0x0244 }
        L_0x0241:
            r8 = r21
            goto L_0x0254
        L_0x0244:
            r0 = move-exception
        L_0x0245:
            r28 = r9
            r22 = r21
        L_0x0249:
            r9 = r29
            goto L_0x036e
        L_0x024d:
            r0 = move-exception
            r25 = r8
            goto L_0x0245
        L_0x0251:
            r25 = r8
            goto L_0x0241
        L_0x0254:
            boolean r21 = r0.containsKey(r8)     // Catch:{ Exception -> 0x026e }
            if (r21 == 0) goto L_0x0272
            java.lang.Object r21 = r0.get(r8)     // Catch:{ Exception -> 0x026e }
            r22 = r8
            r8 = r21
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x026a }
            r7.setOperatorNumeric(r8)     // Catch:{ Exception -> 0x026a }
        L_0x0267:
            r8 = r19
            goto L_0x0275
        L_0x026a:
            r0 = move-exception
        L_0x026b:
            r28 = r9
            goto L_0x0249
        L_0x026e:
            r0 = move-exception
            r22 = r8
            goto L_0x026b
        L_0x0272:
            r22 = r8
            goto L_0x0267
        L_0x0275:
            boolean r19 = r0.containsKey(r8)     // Catch:{ Exception -> 0x028f }
            if (r19 == 0) goto L_0x0293
            java.lang.Object r0 = r0.get(r8)     // Catch:{ Exception -> 0x028f }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x028f }
            r19 = r8
            java.lang.String r8 = "false"
            boolean r0 = r0.equals(r8)     // Catch:{ Exception -> 0x026a }
            if (r0 == 0) goto L_0x0295
            r7.setCarrierEnabled(false)     // Catch:{ Exception -> 0x026a }
            goto L_0x0298
        L_0x028f:
            r0 = move-exception
            r19 = r8
            goto L_0x026b
        L_0x0293:
            r19 = r8
        L_0x0295:
            r7.setCarrierEnabled(true)     // Catch:{ Exception -> 0x026a }
        L_0x0298:
            android.telephony.data.ApnSetting r0 = r7.build()     // Catch:{ Exception -> 0x026a }
            java.util.Iterator r7 = r6.iterator()     // Catch:{ Exception -> 0x026a }
        L_0x02a0:
            boolean r8 = r7.hasNext()     // Catch:{ Exception -> 0x026a }
            if (r8 == 0) goto L_0x0301
            java.lang.Object r8 = r7.next()     // Catch:{ Exception -> 0x026a }
            android.telephony.data.ApnSetting r8 = de.ozerov.fully.C0669b0.f(r8)     // Catch:{ Exception -> 0x026a }
            r21 = r7
            java.lang.String r7 = r8.getEntryName()     // Catch:{ Exception -> 0x026a }
            r28 = r9
            java.lang.String r9 = r0.getEntryName()     // Catch:{ Exception -> 0x02ee }
            boolean r7 = r7.equals(r9)     // Catch:{ Exception -> 0x02ee }
            if (r7 == 0) goto L_0x02fa
            r0.getEntryName()     // Catch:{ Exception -> 0x02ee }
            int r7 = r8.getId()     // Catch:{ Exception -> 0x02ee }
            boolean r7 = r3.updateOverrideApn(r5, r7, r0)     // Catch:{ Exception -> 0x02ee }
            if (r7 != 0) goto L_0x02f1
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02ee }
            r7.<init>()     // Catch:{ Exception -> 0x02ee }
            java.lang.String r9 = "Failed to update existing APN "
            r7.append(r9)     // Catch:{ Exception -> 0x02ee }
            java.lang.String r9 = r0.getEntryName()     // Catch:{ Exception -> 0x02ee }
            r7.append(r9)     // Catch:{ Exception -> 0x02ee }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x02ee }
            r9 = r29
            n2.a.b1(r9, r7)     // Catch:{ Exception -> 0x02eb }
            android.util.Log.w(r14, r7)     // Catch:{ Exception -> 0x02eb }
            goto L_0x02f3
        L_0x02eb:
            r0 = move-exception
            goto L_0x036e
        L_0x02ee:
            r0 = move-exception
            goto L_0x0249
        L_0x02f1:
            r9 = r29
        L_0x02f3:
            r6.remove(r8)     // Catch:{ Exception -> 0x02eb }
            r7 = 1
            r26 = 1
            goto L_0x0306
        L_0x02fa:
            r9 = r29
            r7 = r21
            r9 = r28
            goto L_0x02a0
        L_0x0301:
            r28 = r9
            r9 = r29
            r7 = 0
        L_0x0306:
            if (r7 != 0) goto L_0x035c
            r0.getEntryName()     // Catch:{ Exception -> 0x02eb }
            int r7 = r3.addOverrideApn(r5, r0)     // Catch:{ Exception -> 0x02eb }
            r8 = -1
            if (r7 != r8) goto L_0x032d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02eb }
            r7.<init>()     // Catch:{ Exception -> 0x02eb }
            java.lang.String r8 = "Failed to add new APN "
            r7.append(r8)     // Catch:{ Exception -> 0x02eb }
            java.lang.String r0 = r0.getEntryName()     // Catch:{ Exception -> 0x02eb }
            r7.append(r0)     // Catch:{ Exception -> 0x02eb }
            java.lang.String r0 = r7.toString()     // Catch:{ Exception -> 0x02eb }
            n2.a.b1(r9, r0)     // Catch:{ Exception -> 0x02eb }
            android.util.Log.w(r14, r0)     // Catch:{ Exception -> 0x02eb }
        L_0x032d:
            r26 = 1
            goto L_0x035c
        L_0x0330:
            r0 = move-exception
        L_0x0331:
            r25 = r8
            r28 = r9
            r27 = r11
            goto L_0x01fb
        L_0x0339:
            r25 = r8
            r28 = r9
            r27 = r11
            r11 = r22
            r9 = r29
            r22 = r21
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02eb }
            r0.<init>()     // Catch:{ Exception -> 0x02eb }
            java.lang.String r7 = "Ignore APN config line without entryName "
            r0.append(r7)     // Catch:{ Exception -> 0x02eb }
            r0.append(r1)     // Catch:{ Exception -> 0x02eb }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x02eb }
            android.util.Log.w(r14, r0)     // Catch:{ Exception -> 0x02eb }
            n2.a.b1(r9, r0)     // Catch:{ Exception -> 0x02eb }
        L_0x035c:
            r21 = r22
            r7 = r24
            r8 = r25
            r9 = r28
            r22 = r11
            r11 = r27
            goto L_0x01a7
        L_0x036a:
            r0 = move-exception
            r24 = r7
            goto L_0x0331
        L_0x036e:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0390 }
            r7.<init>()     // Catch:{ Exception -> 0x0390 }
            java.lang.String r8 = "Failed to parse APN config: "
            r7.append(r8)     // Catch:{ Exception -> 0x0390 }
            r7.append(r1)     // Catch:{ Exception -> 0x0390 }
            r7.append(r13)     // Catch:{ Exception -> 0x0390 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x0390 }
            r7.append(r0)     // Catch:{ Exception -> 0x0390 }
            java.lang.String r0 = r7.toString()     // Catch:{ Exception -> 0x0390 }
            n2.a.b1(r9, r0)     // Catch:{ Exception -> 0x0390 }
            android.util.Log.e(r14, r0)     // Catch:{ Exception -> 0x0390 }
            goto L_0x035c
        L_0x0390:
            r0 = move-exception
            goto L_0x012b
        L_0x0393:
            r9 = r29
            java.util.Iterator r0 = r6.iterator()     // Catch:{ Exception -> 0x0390 }
        L_0x0399:
            boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x0390 }
            if (r1 == 0) goto L_0x03d0
            java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x0390 }
            android.telephony.data.ApnSetting r1 = de.ozerov.fully.C0669b0.f(r1)     // Catch:{ Exception -> 0x0390 }
            r1.getEntryName()     // Catch:{ Exception -> 0x0390 }
            int r6 = r1.getId()     // Catch:{ Exception -> 0x0390 }
            boolean r6 = r3.removeOverrideApn(r5, r6)     // Catch:{ Exception -> 0x0390 }
            if (r6 != 0) goto L_0x0399
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0390 }
            r6.<init>()     // Catch:{ Exception -> 0x0390 }
            java.lang.String r7 = "Failed to remove existing APN"
            r6.append(r7)     // Catch:{ Exception -> 0x0390 }
            java.lang.String r1 = r1.getEntryName()     // Catch:{ Exception -> 0x0390 }
            r6.append(r1)     // Catch:{ Exception -> 0x0390 }
            java.lang.String r1 = r6.toString()     // Catch:{ Exception -> 0x0390 }
            n2.a.b1(r9, r1)     // Catch:{ Exception -> 0x0390 }
            android.util.Log.w(r14, r1)     // Catch:{ Exception -> 0x0390 }
            goto L_0x0399
        L_0x03d0:
            r1 = r26
            r3.setOverrideApnsEnabled(r5, r1)     // Catch:{ Exception -> 0x0390 }
            goto L_0x03db
        L_0x03d6:
            r0 = move-exception
            goto L_0x0129
        L_0x03d9:
            r9 = r29
        L_0x03db:
            boolean r0 = n2.a.z0()     // Catch:{ Exception -> 0x0390 }
            if (r0 == 0) goto L_0x0411
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Exception -> 0x0390 }
            java.lang.String r1 = "mdmAppsToDisable"
            java.lang.String r1 = r2.r(r1, r4)     // Catch:{ Exception -> 0x0390 }
            java.lang.String[] r1 = n2.a.e1(r1)     // Catch:{ Exception -> 0x0390 }
            java.util.List r1 = java.util.Arrays.asList(r1)     // Catch:{ Exception -> 0x0390 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0390 }
            r1 = 0
            java.lang.String[] r6 = new java.lang.String[r1]     // Catch:{ Exception -> 0x0390 }
            java.lang.Object[] r0 = r0.toArray(r6)     // Catch:{ Exception -> 0x0390 }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ Exception -> 0x0390 }
            r3.setPackagesSuspended(r5, r0, true)     // Catch:{ Exception -> 0x0390 }
            java.lang.String r0 = "mdmReboot"
            java.lang.String r1 = "mdmRebootTime"
            java.lang.String r1 = r2.r(r1, r4)     // Catch:{ Exception -> 0x0390 }
            r6 = r18
            r6.v0(r0, r1)     // Catch:{ Exception -> 0x040e }
            goto L_0x0413
        L_0x040e:
            r0 = move-exception
            goto L_0x069d
        L_0x0411:
            r6 = r18
        L_0x0413:
            boolean r0 = n2.a.y0()     // Catch:{ Exception -> 0x040e }
            java.lang.String r1 = "1"
            java.lang.String r7 = "0"
            r8 = 2
            if (r0 == 0) goto L_0x04be
            java.lang.String r0 = "wifi_device_owner_configs_lockdown"
            java.lang.String r10 = "mdmWifDeviceOwnerConfigsLockdown"
            java.lang.String r10 = r2.r(r10, r7)     // Catch:{ Exception -> 0x040e }
            r3.setGlobalSetting(r5, r0, r10)     // Catch:{ Exception -> 0x040e }
            java.lang.Boolean r0 = r15.m1()     // Catch:{ Exception -> 0x040e }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x040e }
            if (r0 == 0) goto L_0x043d
            b3.a r0 = r9.f9921J0     // Catch:{ Exception -> 0x040e }
            boolean r0 = r0.i()     // Catch:{ Exception -> 0x040e }
            if (r0 == 0) goto L_0x043d
            r0 = 1
            goto L_0x043e
        L_0x043d:
            r0 = 0
        L_0x043e:
            r3.setStatusBarDisabled(r5, r0)     // Catch:{ Exception -> 0x040e }
            java.lang.String r0 = "mdmDisableKeyguard"
            r10 = 0
            boolean r0 = r2.n(r0, r10)     // Catch:{ Exception -> 0x040e }
            r3.setKeyguardDisabled(r5, r0)     // Catch:{ Exception -> 0x040e }
            java.lang.String r0 = "mdmDisableSafeModeBoot"
            r10 = 1
            boolean r0 = r2.n(r0, r10)     // Catch:{ Exception -> 0x040e }
            java.lang.String r10 = "no_safe_boot"
            if (r0 == 0) goto L_0x045a
            r3.addUserRestriction(r5, r10)     // Catch:{ Exception -> 0x040e }
            goto L_0x045d
        L_0x045a:
            r3.clearUserRestriction(r5, r10)     // Catch:{ Exception -> 0x040e }
        L_0x045d:
            java.lang.String r0 = "mdmRuntimePermissionPolicy"
            java.lang.String r0 = r2.r(r0, r7)     // Catch:{ Exception -> 0x046f }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x046f }
            if (r0 < 0) goto L_0x0473
            if (r0 > r8) goto L_0x0473
            r3.setPermissionPolicy(r5, r0)     // Catch:{ Exception -> 0x046f }
            goto L_0x0473
        L_0x046f:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ Exception -> 0x040e }
        L_0x0473:
            java.lang.String r0 = "mdmSystemUpdatePolicy"
            java.lang.String r0 = r2.r(r0, r7)     // Catch:{ Exception -> 0x048b }
            int r10 = r0.hashCode()     // Catch:{ Exception -> 0x048b }
            switch(r10) {
                case 48: goto L_0x0495;
                case 49: goto L_0x048d;
                case 50: goto L_0x0481;
                default: goto L_0x0480;
            }     // Catch:{ Exception -> 0x048b }
        L_0x0480:
            goto L_0x049d
        L_0x0481:
            java.lang.String r10 = "2"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x048b }
            if (r0 == 0) goto L_0x049d
            r0 = 2
            goto L_0x049e
        L_0x048b:
            r0 = move-exception
            goto L_0x04bb
        L_0x048d:
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x048b }
            if (r0 == 0) goto L_0x049d
            r0 = 1
            goto L_0x049e
        L_0x0495:
            boolean r0 = r0.equals(r7)     // Catch:{ Exception -> 0x048b }
            if (r0 == 0) goto L_0x049d
            r0 = 0
            goto L_0x049e
        L_0x049d:
            r0 = -1
        L_0x049e:
            if (r0 == 0) goto L_0x04b1
            r10 = 1
            if (r0 == r10) goto L_0x04ac
            if (r0 == r8) goto L_0x04a7
            r0 = 0
            goto L_0x04b5
        L_0x04a7:
            android.app.admin.SystemUpdatePolicy r0 = android.app.admin.SystemUpdatePolicy.createWindowedInstallPolicy(1320, 120)     // Catch:{ Exception -> 0x048b }
            goto L_0x04b5
        L_0x04ac:
            android.app.admin.SystemUpdatePolicy r0 = android.app.admin.SystemUpdatePolicy.createPostponeInstallPolicy()     // Catch:{ Exception -> 0x048b }
            goto L_0x04b5
        L_0x04b1:
            android.app.admin.SystemUpdatePolicy r0 = android.app.admin.SystemUpdatePolicy.createAutomaticInstallPolicy()     // Catch:{ Exception -> 0x048b }
        L_0x04b5:
            if (r0 == 0) goto L_0x04be
            r3.setSystemUpdatePolicy(r5, r0)     // Catch:{ Exception -> 0x048b }
            goto L_0x04be
        L_0x04bb:
            r0.printStackTrace()     // Catch:{ Exception -> 0x040e }
        L_0x04be:
            e(r29)     // Catch:{ Exception -> 0x040e }
            java.lang.String r0 = "mdmDisableScreenCapture"
            r10 = 0
            boolean r0 = r2.n(r0, r10)     // Catch:{ Exception -> 0x040e }
            r3.setScreenCaptureDisabled(r5, r0)     // Catch:{ Exception -> 0x040e }
            java.lang.String r0 = "usb_mass_storage_enabled"
            r11 = r17
            boolean r12 = r2.n(r11, r10)     // Catch:{ Exception -> 0x040e }
            if (r12 == 0) goto L_0x04d7
            r10 = r7
            goto L_0x04d8
        L_0x04d7:
            r10 = r1
        L_0x04d8:
            r3.setGlobalSetting(r5, r0, r10)     // Catch:{ Exception -> 0x040e }
            java.lang.String r0 = "adb_enabled"
            java.lang.String r10 = "mdmDisableADB"
            r12 = 1
            boolean r10 = r2.n(r10, r12)     // Catch:{ Exception -> 0x040e }
            if (r10 == 0) goto L_0x04e8
            r10 = r7
            goto L_0x04e9
        L_0x04e8:
            r10 = r1
        L_0x04e9:
            r3.setGlobalSetting(r5, r0, r10)     // Catch:{ Exception -> 0x040e }
            java.lang.String r0 = "stay_on_while_plugged_in"
            java.lang.String r10 = "mdmStayOnWhilePluggedIn"
            java.lang.String r10 = r2.r(r10, r7)     // Catch:{ Exception -> 0x040e }
            r3.setGlobalSetting(r5, r0, r10)     // Catch:{ Exception -> 0x040e }
            java.lang.String r0 = r15.o1()     // Catch:{ Exception -> 0x040e }
            java.lang.String r10 = "http://"
            boolean r0 = r0.startsWith(r10)     // Catch:{ Exception -> 0x040e }
            java.lang.String r10 = "Failed to set global proxy for "
            if (r0 != 0) goto L_0x0566
            java.lang.String r0 = r15.o1()     // Catch:{ Exception -> 0x040e }
            java.lang.String r12 = "https://"
            boolean r0 = r0.startsWith(r12)     // Catch:{ Exception -> 0x040e }
            if (r0 == 0) goto L_0x0512
            goto L_0x0566
        L_0x0512:
            java.lang.String r0 = r15.o1()     // Catch:{ Exception -> 0x040e }
            boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x040e }
            if (r0 != 0) goto L_0x0597
            java.lang.String r0 = r15.o1()     // Catch:{ Exception -> 0x053b }
            java.lang.String r12 = ":"
            java.lang.String[] r0 = r0.split(r12)     // Catch:{ Exception -> 0x053b }
            int r12 = r0.length     // Catch:{ Exception -> 0x053b }
            if (r12 != r8) goto L_0x053d
            r8 = 0
            r12 = r0[r8]     // Catch:{ Exception -> 0x053b }
            r8 = 1
            r0 = r0[r8]     // Catch:{ Exception -> 0x053b }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x053b }
            android.net.ProxyInfo r0 = android.net.ProxyInfo.buildDirectProxy(r12, r0)     // Catch:{ Exception -> 0x053b }
            r3.setRecommendedGlobalProxy(r5, r0)     // Catch:{ Exception -> 0x053b }
            goto L_0x0597
        L_0x053b:
            r0 = move-exception
            goto L_0x0545
        L_0x053d:
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ Exception -> 0x053b }
            java.lang.String r8 = "Parsing for host:port failed"
            r0.<init>(r8)     // Catch:{ Exception -> 0x053b }
            throw r0     // Catch:{ Exception -> 0x053b }
        L_0x0545:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x040e }
            r8.<init>()     // Catch:{ Exception -> 0x040e }
            r8.append(r10)     // Catch:{ Exception -> 0x040e }
            java.lang.String r10 = r15.o1()     // Catch:{ Exception -> 0x040e }
            r8.append(r10)     // Catch:{ Exception -> 0x040e }
            r8.append(r13)     // Catch:{ Exception -> 0x040e }
            java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x040e }
            r8.append(r0)     // Catch:{ Exception -> 0x040e }
            java.lang.String r0 = r8.toString()     // Catch:{ Exception -> 0x040e }
            android.util.Log.w(r14, r0)     // Catch:{ Exception -> 0x040e }
            goto L_0x0597
        L_0x0566:
            java.lang.String r0 = r15.o1()     // Catch:{ Exception -> 0x0576 }
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ Exception -> 0x0576 }
            android.net.ProxyInfo r0 = android.net.ProxyInfo.buildPacProxy(r0)     // Catch:{ Exception -> 0x0576 }
            r3.setRecommendedGlobalProxy(r5, r0)     // Catch:{ Exception -> 0x0576 }
            goto L_0x0597
        L_0x0576:
            r0 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x040e }
            r8.<init>()     // Catch:{ Exception -> 0x040e }
            r8.append(r10)     // Catch:{ Exception -> 0x040e }
            java.lang.String r10 = r15.o1()     // Catch:{ Exception -> 0x040e }
            r8.append(r10)     // Catch:{ Exception -> 0x040e }
            r8.append(r13)     // Catch:{ Exception -> 0x040e }
            java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x040e }
            r8.append(r0)     // Catch:{ Exception -> 0x040e }
            java.lang.String r0 = r8.toString()     // Catch:{ Exception -> 0x040e }
            android.util.Log.w(r14, r0)     // Catch:{ Exception -> 0x040e }
        L_0x0597:
            java.lang.String r0 = "mdmDisableAppsFromUnknownSources"
            r8 = 1
            boolean r0 = r2.n(r0, r8)     // Catch:{ Exception -> 0x05b1 }
            java.lang.String r8 = "install_non_market_apps"
            java.lang.String r10 = "no_install_unknown_sources"
            if (r0 == 0) goto L_0x05b3
            r3.addUserRestriction(r5, r10)     // Catch:{ Exception -> 0x05b1 }
            boolean r0 = n2.a.B0()     // Catch:{ Exception -> 0x05b1 }
            if (r0 != 0) goto L_0x05bf
            r3.setSecureSetting(r5, r8, r7)     // Catch:{ Exception -> 0x05b1 }
            goto L_0x05bf
        L_0x05b1:
            r0 = move-exception
            goto L_0x05c1
        L_0x05b3:
            r3.clearUserRestriction(r5, r10)     // Catch:{ Exception -> 0x05b1 }
            boolean r0 = n2.a.B0()     // Catch:{ Exception -> 0x05b1 }
            if (r0 != 0) goto L_0x05bf
            r3.setSecureSetting(r5, r8, r1)     // Catch:{ Exception -> 0x05b1 }
        L_0x05bf:
            r8 = 0
            goto L_0x05da
        L_0x05c1:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x040e }
            r8.<init>()     // Catch:{ Exception -> 0x040e }
            java.lang.String r10 = "Failed to set MDM policy: "
            r8.append(r10)     // Catch:{ Exception -> 0x040e }
            java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x040e }
            r8.append(r0)     // Catch:{ Exception -> 0x040e }
            java.lang.String r0 = r8.toString()     // Catch:{ Exception -> 0x040e }
            android.util.Log.w(r14, r0)     // Catch:{ Exception -> 0x040e }
            goto L_0x05bf
        L_0x05da:
            boolean r0 = r2.n(r11, r8)     // Catch:{ Exception -> 0x040e }
            java.lang.String r8 = "no_physical_media"
            java.lang.String r10 = "no_usb_file_transfer"
            if (r0 == 0) goto L_0x05eb
            r3.addUserRestriction(r5, r10)     // Catch:{ Exception -> 0x040e }
            r3.addUserRestriction(r5, r8)     // Catch:{ Exception -> 0x040e }
            goto L_0x05f1
        L_0x05eb:
            r3.clearUserRestriction(r5, r10)     // Catch:{ Exception -> 0x040e }
            r3.clearUserRestriction(r5, r8)     // Catch:{ Exception -> 0x040e }
        L_0x05f1:
            java.lang.String r0 = "mdmDisableVolumeButtons"
            r8 = 0
            boolean r0 = r2.n(r0, r8)     // Catch:{ Exception -> 0x040e }
            java.lang.String r10 = "no_adjust_volume"
            if (r0 == 0) goto L_0x0600
            r3.addUserRestriction(r5, r10)     // Catch:{ Exception -> 0x040e }
            goto L_0x0603
        L_0x0600:
            r3.clearUserRestriction(r5, r10)     // Catch:{ Exception -> 0x040e }
        L_0x0603:
            java.lang.String r0 = "mdmPasswordQuality"
            java.lang.String r0 = r2.r(r0, r7)     // Catch:{ Exception -> 0x0622 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x0622 }
            if (r0 <= 0) goto L_0x0627
            r3.setPasswordQuality(r5, r0)     // Catch:{ Exception -> 0x0622 }
            java.lang.String r7 = "mdmMinimumPasswordLength"
            java.lang.String r1 = r2.r(r7, r1)     // Catch:{ Exception -> 0x061d }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ Exception -> 0x061d }
            goto L_0x061e
        L_0x061d:
            r1 = 0
        L_0x061e:
            r3.setPasswordMinimumLength(r5, r1)     // Catch:{ Exception -> 0x0622 }
            goto L_0x0627
        L_0x0622:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ Exception -> 0x040e }
            r0 = 0
        L_0x0627:
            boolean r1 = r3.isActivePasswordSufficient()     // Catch:{ Exception -> 0x040e }
            if (r1 != 0) goto L_0x0646
            if (r0 <= 0) goto L_0x0646
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x0641 }
            java.lang.String r1 = "android.app.action.SET_NEW_PASSWORD"
            r0.<init>(r1)     // Catch:{ Exception -> 0x0641 }
            r1 = 1015(0x3f7, float:1.422E-42)
            r9.startActivityForResult(r0, r1)     // Catch:{ Exception -> 0x0641 }
            java.lang.String r0 = "Please set the lock screen protection according to the device security policy"
            n2.a.b1(r9, r0)     // Catch:{ Exception -> 0x0641 }
            goto L_0x0649
        L_0x0641:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ Exception -> 0x040e }
            goto L_0x0649
        L_0x0646:
            d(r29)     // Catch:{ Exception -> 0x040e }
        L_0x0649:
            java.lang.String r0 = "mdmSystemAppsToEnable"
            java.lang.Object r1 = r15.f9767W     // Catch:{ Exception -> 0x040e }
            Z1.c r1 = (Z1.c) r1     // Catch:{ Exception -> 0x040e }
            java.lang.String r0 = r1.r(r0, r4)     // Catch:{ Exception -> 0x040e }
            java.lang.String[] r0 = n2.a.e1(r0)     // Catch:{ Exception -> 0x040e }
            int r1 = r0.length     // Catch:{ Exception -> 0x040e }
            r7 = 0
        L_0x0659:
            if (r7 >= r1) goto L_0x06a5
            r8 = r0[r7]     // Catch:{ Exception -> 0x040e }
            java.lang.String r8 = r8.trim()     // Catch:{ Exception -> 0x066e }
            boolean r10 = r8.isEmpty()     // Catch:{ Exception -> 0x066e }
            if (r10 != 0) goto L_0x066a
            r3.enableSystemApp(r5, r8)     // Catch:{ Exception -> 0x066e }
        L_0x066a:
            r11 = r16
        L_0x066c:
            r8 = 1
            goto L_0x0695
        L_0x066e:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x040e }
            r10.<init>()     // Catch:{ Exception -> 0x040e }
            r11 = r16
            r10.append(r11)     // Catch:{ Exception -> 0x040e }
            r10.append(r8)     // Catch:{ Exception -> 0x040e }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x040e }
            android.util.Log.e(r14, r10)     // Catch:{ Exception -> 0x040e }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x040e }
            r10.<init>()     // Catch:{ Exception -> 0x040e }
            r10.append(r11)     // Catch:{ Exception -> 0x040e }
            r10.append(r8)     // Catch:{ Exception -> 0x040e }
            java.lang.String r8 = r10.toString()     // Catch:{ Exception -> 0x040e }
            n2.a.b1(r9, r8)     // Catch:{ Exception -> 0x040e }
            goto L_0x066c
        L_0x0695:
            int r7 = r7 + r8
            r16 = r11
            goto L_0x0659
        L_0x0699:
            r0 = move-exception
            r9 = r1
            goto L_0x012b
        L_0x069d:
            r0.printStackTrace()
            java.lang.String r0 = "Failed setting MDM device policy"
            n2.a.b1(r9, r0)
        L_0x06a5:
            java.lang.String r0 = "mdmApkToInstallTime"
            java.lang.String r1 = r2.r(r0, r4)
            boolean r1 = r1.isEmpty()
            r3 = 8654(0x21ce, float:1.2127E-41)
            java.lang.String r5 = "jobscheduler"
            if (r1 != 0) goto L_0x06ca
            java.lang.String r0 = r2.r(r0, r4)
            java.lang.String r1 = "mdmApkUpdate"
            r6.v0(r1, r0)
            int r0 = de.ozerov.fully.AiJobService.f9790U
            java.lang.Object r0 = r9.getSystemService(r5)
            android.app.job.JobScheduler r0 = (android.app.job.JobScheduler) r0
            r0.cancel(r3)
            goto L_0x06e2
        L_0x06ca:
            de.ozerov.fully.C0752p.e(r29)
            int r0 = r15.l1()
            if (r0 <= 0) goto L_0x06d7
            de.ozerov.fully.AiJobService.a(r29)
            goto L_0x06e2
        L_0x06d7:
            int r0 = de.ozerov.fully.AiJobService.f9790U
            java.lang.Object r0 = r9.getSystemService(r5)
            android.app.job.JobScheduler r0 = (android.app.job.JobScheduler) r0
            r0.cancel(r3)
        L_0x06e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.I1.b(de.ozerov.fully.FullyActivity):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, de.ozerov.fully.G1] */
    public static void c(Activity activity, String str) {
        if (a.C0()) {
            ((DevicePolicyManager) activity.getSystemService("device_policy")).clearApplicationUserData(DeviceOwnerReceiver.a(activity), str, activity.getMainExecutor(), new Object());
        }
    }

    public static void d(FullyActivity fullyActivity) {
        k kVar = new k((Context) fullyActivity, 1);
        if (C0794w0.Z(fullyActivity)) {
            c cVar = (c) kVar.f9767W;
            if (!cVar.r("emmHiddenPackages", "").isEmpty()) {
                DevicePolicyManager devicePolicyManager = (DevicePolicyManager) fullyActivity.getSystemService("device_policy");
                ComponentName a8 = DeviceOwnerReceiver.a(fullyActivity);
                for (String str : cVar.r("emmHiddenPackages", "").split(",")) {
                    devicePolicyManager.setApplicationHidden(a8, str, false);
                    Log.i("I1", "Package " + str + " is going to be enabled");
                }
                kVar.V2("emmHiddenPackages", "");
            }
        }
    }

    public static void e(FullyActivity fullyActivity) {
        k kVar = new k((Context) fullyActivity, 1);
        if (C0794w0.Z(fullyActivity) && kVar.n1().booleanValue()) {
            DevicePolicyManager devicePolicyManager = (DevicePolicyManager) fullyActivity.getSystemService("device_policy");
            ComponentName a8 = DeviceOwnerReceiver.a(fullyActivity);
            try {
                HashSet hashSet = new HashSet();
                if (fullyActivity.f9921J0.i()) {
                    hashSet.addAll(Arrays.asList(a.e1(((c) kVar.f9767W).r("mdmAppLockTaskWhitelist", ""))));
                    hashSet.addAll(f10008a);
                    String str = f10009b;
                    if (str != null) {
                        hashSet.add(str);
                    }
                }
                hashSet.add(fullyActivity.getPackageName());
                devicePolicyManager.setLockTaskPackages(a8, (String[]) hashSet.toArray(new String[0]));
            } catch (Exception e) {
                g.x(e, new StringBuilder("Failed setLockTaskPackages due to "), "I1");
            }
        }
    }
}
