package B3;

import B.C0003d;
import B.j0;
import B.p0;
import C0.e;
import C7.d;
import D.C0051j0;
import D.s0;
import D2.C0073b;
import D2.C0074c;
import D2.D;
import D2.v;
import D2.w;
import H3.C0103u;
import H3.M;
import H3.O;
import H3.i0;
import M1.l;
import P0.r;
import P1.a;
import P6.f;
import Y.g;
import Y.i;
import Y6.o;
import Z1.c;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.PowerManager;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.fragment.app.C0470v;
import androidx.fragment.app.N;
import androidx.fragment.app.Q;
import c0.C0608f;
import c7.h;
import com.samsung.android.knox.EnterpriseDeviceManager;
import de.ozerov.fully.C0726k3;
import de.ozerov.fully.C0746o;
import de.ozerov.fully.C0770s0;
import de.ozerov.fully.C0794w0;
import de.ozerov.fully.F1;
import de.ozerov.fully.FullyActivity;
import de.ozerov.fully.K2;
import de.ozerov.fully.O2;
import de.ozerov.fully.P;
import de.ozerov.fully.R1;
import e5.C0840a;
import g5.C0964c;
import g7.C0996d;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j5.b;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.lang.ref.ReferenceQueue;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import m.C1182a;
import m.C1186e;
import m4.C1213a;
import m4.C1214b;
import n.C1221B;
import n.m;
import n.t;
import n7.C1247a;
import o0.C1308a;
import org.acra.ErrorReporter;
import org.json.JSONException;
import org.json.JSONObject;
import p2.s;
import p2.u;
import p6.C1345a;
import r6.C1391a;
import s7.C1408a;
import t2.C1419a;
import t2.C1420b;
import t2.C1423e;
import t2.C1424f;
import t2.C1426h;
import t2.k;
import t2.n;
import t2.p;
import t6.C1432a;
import u.C1477r;
import u2.C1490a;
import u2.j;

public class q implements l, C1423e {

    /* renamed from: Y  reason: collision with root package name */
    public static q f447Y;

    /* renamed from: Z  reason: collision with root package name */
    public static PowerManager.WakeLock f448Z;

    /* renamed from: U  reason: collision with root package name */
    public Object f449U;

    /* renamed from: V  reason: collision with root package name */
    public Object f450V;

    /* renamed from: W  reason: collision with root package name */
    public Object f451W;

    /* renamed from: X  reason: collision with root package name */
    public Object f452X;

    public q(int i) {
        switch (i) {
            case 3:
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new C0073b(0));
                this.f450V = new HashMap();
                this.f451W = new ReferenceQueue();
                this.f449U = newSingleThreadExecutor;
                newSingleThreadExecutor.execute(new e(2, this));
                return;
            case 5:
                this.f449U = new r();
                this.f450V = new r();
                this.f451W = new a();
                return;
            case 7:
                Random random = new Random();
                this.f451W = new HashMap();
                this.f452X = random;
                this.f449U = new HashMap();
                this.f450V = new HashMap();
                return;
            case 8:
                this.f450V = new ArrayDeque();
                this.f451W = new ArrayDeque();
                this.f452X = new ArrayDeque();
                return;
            case 9:
                this.f452X = new LinkedHashMap();
                this.f450V = "GET";
                this.f451W = new s0(5);
                return;
            case 11:
                this.f449U = new ArrayList();
                this.f450V = new HashMap();
                this.f451W = new HashMap();
                return;
            case EnterpriseDeviceManager.KNOX_2_4_1 /*16*/:
                this.f449U = new i((Object) null);
                this.f450V = new SparseArray();
                this.f451W = new g();
                this.f452X = new i((Object) null);
                return;
            case EnterpriseDeviceManager.KNOX_2_5 /*17*/:
                this.f449U = new C0608f(10);
                this.f450V = new i((Object) null);
                this.f451W = new ArrayList();
                this.f452X = new HashSet();
                return;
            default:
                this.f449U = new Object();
                this.f450V = new Handler(Looper.getMainLooper(), new o(0, this));
                return;
        }
    }

    public static q K() {
        if (f447Y == null) {
            f447Y = new q(0);
        }
        return f447Y;
    }

    public static void e0() {
        try {
            PowerManager.WakeLock wakeLock = f448Z;
            if (wakeLock != null && wakeLock.isHeld()) {
                f448Z.release();
                Log.i("q", "Wakeup lock released #" + f448Z.hashCode());
                f448Z = null;
            }
        } catch (Exception e) {
            Q0.g.x(e, new StringBuilder("Error when removing wakeup wakelock due to "), "q");
        }
    }

    public static void g0(long j7, HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j7) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            hashMap.remove(arrayList.get(i));
        }
    }

    public static void s(String str, JSONObject jSONObject) {
        String concat = str.concat("Enc");
        if (jSONObject.optString(str).startsWith("enc_")) {
            try {
                String a8 = C0746o.a(jSONObject.getString(str).replace("enc_", ""));
                if (a8 != null) {
                    jSONObject.put(str, a8);
                    jSONObject.remove(concat);
                }
            } catch (Exception e) {
                Q0.g.x(e, Q0.g.s("Failed to decrypt ", str, " due to "), "FullySettingsExportImport");
            }
        } else if (jSONObject.has(str) && jSONObject.has(concat)) {
            jSONObject.remove(concat);
        } else if (jSONObject.optString(concat).startsWith("enc_")) {
            try {
                String a9 = C0746o.a(jSONObject.getString(concat).replace("enc_", ""));
                if (a9 != null) {
                    jSONObject.put(str, a9);
                    jSONObject.remove(concat);
                }
            } catch (Exception e8) {
                Q0.g.x(e8, Q0.g.s("Failed to decrypt ", concat, " due to "), "FullySettingsExportImport");
            }
        }
    }

    public static void s0(Context context, boolean z, boolean z6) {
        try {
            if (C0794w0.h0(context)) {
                if (!z) {
                    Log.w("q", "wakeUp no action because isScreenOn is already true");
                    return;
                }
            }
            e0();
            if (f448Z == null) {
                f448Z = ((PowerManager) context.getApplicationContext().getSystemService("power")).newWakeLock(805306378, "fully-single-app:WakeUpLock");
            }
            f448Z.acquire(15000);
            Log.i("q", "Wakeup lock acquired #" + f448Z.hashCode());
            if (z6) {
                e0();
            }
        } catch (Exception e) {
            n2.a.b1(context, "Error when waking up device");
            Q0.g.x(e, new StringBuilder("Error when waking up device due to "), "q");
        }
    }

    public static void v(String str, JSONObject jSONObject) {
        String concat = str.concat("Enc");
        if (!jSONObject.optString(str).isEmpty()) {
            try {
                String c8 = C0746o.c(jSONObject.getString(str));
                if (c8 != null) {
                    jSONObject.put(concat, "enc_".concat(c8));
                    jSONObject.remove(str);
                }
            } catch (Exception e) {
                Q0.g.x(e, Q0.g.s("Failed to encrypt ", str, " due to "), "FullySettingsExportImport");
            }
        }
    }

    public C0470v A(String str) {
        Q q7 = (Q) ((HashMap) this.f450V).get(str);
        if (q7 != null) {
            return q7.f7926c;
        }
        return null;
    }

    public C0470v B(String str) {
        for (Q q7 : ((HashMap) this.f450V).values()) {
            if (q7 != null) {
                C0470v vVar = q7.f7926c;
                if (!str.equals(vVar.f8063Y)) {
                    vVar = vVar.p0.f7875c.B(str);
                }
                if (vVar != null) {
                    return vVar;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: p2.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v52, resolved type: y2.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: p2.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: p2.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v100, resolved type: t2.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v24, resolved type: y2.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v105, resolved type: t2.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v106, resolved type: t2.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x032b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C() {
        /*
            r21 = this;
            r0 = r21
            r1 = 0
            r3 = 1
            java.lang.Object r4 = r0.f452X
            p2.h r4 = (p2.h) r4
            if (r4 == 0) goto L_0x000b
            return
        L_0x000b:
            java.lang.Object r4 = r0.f449U
            J1.e r4 = (J1.e) r4
            int r5 = r4.f2355V
            if (r5 >= 0) goto L_0x05a4
            java.lang.Object r5 = r4.f2358Y
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
            p2.i[] r6 = new p2.i[r5]
            r7 = 0
        L_0x001e:
            if (r7 >= r5) goto L_0x0030
            java.lang.Object r8 = r4.f2358Y
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.lang.Object r8 = r8.get(r7)
            p2.g r8 = (p2.g) r8
            p2.i r8 = r8.f14462b
            r6[r7] = r8
            int r7 = r7 + r3
            goto L_0x001e
        L_0x0030:
            r4.i(r6)
        L_0x0033:
            int r5 = r4.f2355V
            int r7 = r4.f2354U
            int r5 = r5 + r7
            int r8 = r4.f2356W
            int r5 = r5 + r8
            int r8 = r4.f2357X
            int r5 = r5 - r8
            java.lang.Object r9 = r4.f2358Y
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            java.util.Iterator r9 = r9.iterator()
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x004a:
            boolean r14 = r9.hasNext()
            if (r14 == 0) goto L_0x0083
            java.lang.Object r14 = r9.next()
            p2.g r14 = (p2.g) r14
            t2.l r14 = r14.f14464d
            r15 = 0
        L_0x0059:
            java.lang.Object[] r2 = r14.f16371V
            int r2 = r2.length
            if (r15 >= r2) goto L_0x004a
            java.lang.Object r2 = r14.e(r15)
            t2.k r2 = (t2.k) r2
            boolean r16 = r2.f()
            if (r16 == 0) goto L_0x0081
            int r2 = r2.f15204U
            if (r2 < r5) goto L_0x0071
            r16 = 1
            goto L_0x0073
        L_0x0071:
            r16 = 0
        L_0x0073:
            r2 = r2 & r3
            if (r2 != 0) goto L_0x007c
            if (r16 == 0) goto L_0x007a
            int r11 = r11 + r3
            goto L_0x0081
        L_0x007a:
            int r13 = r13 + r3
            goto L_0x0081
        L_0x007c:
            if (r16 == 0) goto L_0x0080
            int r10 = r10 + r3
            goto L_0x0081
        L_0x0080:
            int r12 = r12 + r3
        L_0x0081:
            int r15 = r15 + r3
            goto L_0x0059
        L_0x0083:
            if (r10 <= r11) goto L_0x008b
            if (r12 <= r13) goto L_0x008b
            r4.f()
            goto L_0x009d
        L_0x008b:
            if (r10 <= r11) goto L_0x0091
            r4.d()
            goto L_0x009d
        L_0x0091:
            if (r12 <= r13) goto L_0x00a3
            r4.f()
            if (r8 == 0) goto L_0x009d
            if (r11 <= r10) goto L_0x009d
            r4.d()
        L_0x009d:
            boolean r2 = r4.i(r6)
            if (r2 != 0) goto L_0x0033
        L_0x00a3:
            int r2 = r4.f2355V
            if (r2 != 0) goto L_0x00cf
            java.lang.Object r2 = r4.f2358Y
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r2 = r2.size()
            r5 = 0
        L_0x00b0:
            if (r5 >= r2) goto L_0x01e0
            java.lang.Object r8 = r4.f2358Y
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.lang.Object r8 = r8.get(r5)
            p2.g r8 = (p2.g) r8
            p2.i r9 = r8.f14462b
            r10 = r6[r5]
            if (r9 == r10) goto L_0x00cd
            java.lang.Object r9 = r4.f2358Y
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            p2.g r8 = r8.i(r10)
            r9.set(r5, r8)
        L_0x00cd:
            int r5 = r5 + r3
            goto L_0x00b0
        L_0x00cf:
            java.lang.Object r2 = r4.f2358Y
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r2 = r2.size()
            java.util.ArrayList r5 = new java.util.ArrayList
            int r8 = r2 * 2
            r5.<init>(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r9 = 0
        L_0x00e4:
            if (r9 >= r2) goto L_0x01de
            java.lang.Object r10 = r4.f2358Y
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            java.lang.Object r10 = r10.get(r9)
            p2.g r10 = (p2.g) r10
            p2.i r11 = r10.f14462b
            r12 = r6[r9]
            if (r12 == 0) goto L_0x00fe
            r17 = r2
            r18 = r6
            r0 = 0
            r1 = 0
            goto L_0x0197
        L_0x00fe:
            p2.i r12 = r4.g(r10)
            B.d r13 = r12.f14469d
            java.util.BitSet r13 = r13.j(r10)
            boolean r14 = r13.get(r1)
            p2.i r15 = r10.f14462b
            boolean r3 = r15.e
            if (r3 == 0) goto L_0x0115
            r13.set(r1)
        L_0x0115:
            t2.l r3 = r10.f14464d
            java.lang.Object[] r1 = r3.f16371V
            r17 = r2
            int r2 = r1.length
            int r18 = r13.cardinality()
            int r2 = r2 - r18
            if (r2 != 0) goto L_0x012c
            t2.l r1 = t2.l.f15206W
            r18 = r6
            r19 = r12
            r0 = 0
            goto L_0x0157
        L_0x012c:
            r18 = r6
            t2.l r6 = new t2.l
            r6.<init>(r2)
            r19 = r12
            r2 = 0
            r12 = 0
        L_0x0137:
            int r0 = r1.length
            if (r2 >= r0) goto L_0x014d
            boolean r0 = r13.get(r2)
            if (r0 != 0) goto L_0x014a
            java.lang.Object r0 = r3.e(r2)
            r6.f(r12, r0)
            r0 = 1
            int r12 = r12 + r0
            goto L_0x014b
        L_0x014a:
            r0 = 1
        L_0x014b:
            int r2 = r2 + r0
            goto L_0x0137
        L_0x014d:
            boolean r0 = r3.f16382U
            if (r0 != 0) goto L_0x0155
            r0 = 0
            r6.f16382U = r0
            goto L_0x0156
        L_0x0155:
            r0 = 0
        L_0x0156:
            r1 = r6
        L_0x0157:
            boolean r2 = r15.e
            if (r2 == 0) goto L_0x015e
            r13.set(r0, r14)
        L_0x015e:
            java.lang.Object[] r0 = r1.f16371V
            int r0 = r0.length
            t2.p r6 = r10.f14463c
            if (r0 != 0) goto L_0x0167
            r0 = 0
            goto L_0x016c
        L_0x0167:
            p2.l r0 = new p2.l
            r0.<init>(r6, r1)
        L_0x016c:
            if (r2 == 0) goto L_0x018c
            r1 = 0
            boolean r12 = r13.get(r1)
            if (r12 != 0) goto L_0x018c
            java.lang.Object r12 = r3.e(r1)
            t2.k r12 = (t2.k) r12
            int r14 = r12.f15204U
            if (r14 != 0) goto L_0x0181
            r14 = r12
            goto L_0x0187
        L_0x0181:
            v2.d r14 = r12.f15205V
            t2.k r14 = t2.k.e(r1, r14)
        L_0x0187:
            p2.t r1 = p2.g.h(r6, r12, r14)
            goto L_0x018d
        L_0x018c:
            r1 = 0
        L_0x018d:
            t2.l r2 = r3.j(r2, r13)
            p2.g r10 = r10.k(r2)
            r12 = r19
        L_0x0197:
            boolean r2 = r10 instanceof p2.e
            if (r2 == 0) goto L_0x019e
            r2 = r10
            p2.e r2 = (p2.e) r2
        L_0x019e:
            if (r0 == 0) goto L_0x01a3
            r5.add(r0)
        L_0x01a3:
            boolean r0 = r10 instanceof p2.v
            if (r0 != 0) goto L_0x01c4
            int r0 = r8.size()
            if (r0 <= 0) goto L_0x01c4
            java.util.Iterator r0 = r8.iterator()
        L_0x01b1:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x01c1
            java.lang.Object r2 = r0.next()
            p2.e r2 = (p2.e) r2
            r5.add(r2)
            goto L_0x01b1
        L_0x01c1:
            r8.clear()
        L_0x01c4:
            if (r12 == r11) goto L_0x01ca
            p2.g r10 = r10.i(r12)
        L_0x01ca:
            r5.add(r10)
            if (r1 == 0) goto L_0x01d2
            r5.add(r1)
        L_0x01d2:
            r0 = 1
            int r9 = r9 + r0
            r2 = r17
            r6 = r18
            r1 = 0
            r3 = 1
            r0 = r21
            goto L_0x00e4
        L_0x01de:
            r4.f2358Y = r5
        L_0x01e0:
            java.lang.Object r0 = r4.f2358Y
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L_0x01ea:
            if (r1 >= r0) goto L_0x020d
            java.lang.Object r3 = r4.f2358Y
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.lang.Object r3 = r3.get(r1)
            p2.g r3 = (p2.g) r3
            if (r2 < 0) goto L_0x0202
            r3.f14461a = r2
            int r3 = r3.b()
            int r2 = r2 + r3
            r3 = 1
            int r1 = r1 + r3
            goto L_0x01ea
        L_0x0202:
            r3.getClass()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "address < 0"
            r0.<init>(r1)
            throw r0
        L_0x020d:
            java.lang.Object r0 = r4.f2358Y
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L_0x0217:
            if (r2 >= r0) goto L_0x029f
            java.lang.Object r3 = r4.f2358Y
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.lang.Object r3 = r3.get(r2)
            p2.g r3 = (p2.g) r3
            boolean r5 = r3 instanceof p2.u
            if (r5 != 0) goto L_0x0228
            goto L_0x0235
        L_0x0228:
            p2.i r5 = r3.f14462b
            r6 = r3
            p2.u r6 = (p2.u) r6
            B.d r8 = r5.f14469d
            boolean r8 = r8.b(r6)
            if (r8 == 0) goto L_0x0238
        L_0x0235:
            r16 = 1
            goto L_0x028c
        L_0x0238:
            r1 = 40
            int r8 = r5.f14467b
            if (r8 != r1) goto L_0x025a
            p2.i r1 = r4.h(r3, r5)
            if (r1 == 0) goto L_0x0252
            java.lang.Object r5 = r4.f2358Y
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            p2.g r1 = r3.i(r1)
            r5.set(r2, r1)
            r16 = 1
            goto L_0x028b
        L_0x0252:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "method too long"
            r0.<init>(r1)
            throw r0
        L_0x025a:
            java.lang.Object r1 = r4.f2358Y     // Catch:{ IndexOutOfBoundsException -> 0x0297, ClassCastException -> 0x028f }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ IndexOutOfBoundsException -> 0x0297, ClassCastException -> 0x028f }
            r3 = 1
            int r5 = r2 + 1
            java.lang.Object r1 = r1.get(r5)     // Catch:{ IndexOutOfBoundsException -> 0x0297, ClassCastException -> 0x028f }
            p2.e r1 = (p2.e) r1     // Catch:{ IndexOutOfBoundsException -> 0x0297, ClassCastException -> 0x028f }
            p2.u r3 = new p2.u
            p2.i r8 = p2.j.f14494I
            t2.l r9 = t2.l.f15206W
            t2.p r10 = r6.f14463c
            p2.e r11 = r6.e
            r3.<init>(r8, r10, r9, r11)
            java.lang.Object r8 = r4.f2358Y
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            r8.set(r2, r3)
            java.lang.Object r3 = r4.f2358Y
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            p2.u r1 = r6.o(r1)
            r3.add(r2, r1)
            r16 = 1
            int r0 = r0 + 1
            r2 = r5
        L_0x028b:
            r1 = 1
        L_0x028c:
            int r2 = r2 + 1
            goto L_0x0217
        L_0x028f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "unpaired TargetInsn"
            r0.<init>(r1)
            throw r0
        L_0x0297:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "unpaired TargetInsn (dangling)"
            r0.<init>(r1)
            throw r0
        L_0x029f:
            if (r1 != 0) goto L_0x05a0
            java.lang.Object r0 = r4.f2358Y
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r4.f2355V
            int r1 = r1 + r7
            int r2 = r4.f2356W
            int r1 = r1 + r2
            int r2 = r0.size()
            p2.h r3 = new p2.h
            r3.<init>(r2, r1)
            r1 = 0
        L_0x02b5:
            if (r1 >= r2) goto L_0x02c3
            java.lang.Object r4 = r0.get(r1)
            p2.g r4 = (p2.g) r4
            r3.f(r1, r4)
            r4 = 1
            int r1 = r1 + r4
            goto L_0x02b5
        L_0x02c3:
            r1 = 0
            r3.f16382U = r1
            r0 = r21
            r0.f452X = r3
            int r1 = p2.q.f14630W
            int r1 = p2.n.f14629W
            java.lang.Object[] r1 = r3.f16371V
            int r1 = r1.length
            P0.q r2 = new P0.q
            r2.<init>((int) r1)
            r4 = 0
        L_0x02d7:
            if (r4 >= r1) goto L_0x03c1
            java.lang.Object r5 = r3.e(r4)
            p2.g r5 = (p2.g) r5
            boolean r6 = r5 instanceof p2.o
            if (r6 != 0) goto L_0x03b6
            boolean r6 = r5 instanceof p2.p
            if (r6 == 0) goto L_0x0327
            r6 = r5
            p2.p r6 = (p2.p) r6
            int r5 = r5.e()
            r6.getClass()
            r6 = 0
            int r7 = r6.f15204U
            t2.k r8 = P0.q.h(r6)
            r2.a(r5, r7)
            java.lang.Object r6 = r2.f3729d
            t2.m r6 = (t2.m) r6
            t2.k r6 = r6.e(r7)
            if (r6 != 0) goto L_0x0307
            r9 = 0
            goto L_0x0317
        L_0x0307:
            v2.d r9 = r8.f15205V
            v2.c r9 = r9.getType()
            v2.d r10 = r6.f15205V
            v2.c r10 = r10.getType()
            boolean r9 = r9.equals(r10)
        L_0x0317:
            if (r9 != 0) goto L_0x031e
            r8.getClass()
        L_0x031c:
            r9 = 0
            goto L_0x0325
        L_0x031e:
            int r9 = r8.f15204U
            int r10 = r6.f15204U
            if (r9 != r10) goto L_0x031c
            r9 = 1
        L_0x0325:
            if (r9 == 0) goto L_0x032b
        L_0x0327:
            r6 = 1
            r7 = 0
            goto L_0x03b3
        L_0x032b:
            java.lang.Object r1 = r2.f3729d
            t2.m r1 = (t2.m) r1
            t2.k[] r1 = r1.f15207V
            int r3 = r1.length
            r4 = 0
        L_0x0333:
            if (r4 >= r3) goto L_0x0350
            r9 = r1[r4]
            if (r9 != 0) goto L_0x033b
        L_0x0339:
            r9 = 1
            goto L_0x034e
        L_0x033b:
            v2.d r10 = r8.f15205V
            v2.c r10 = r10.getType()
            v2.d r11 = r9.f15205V
            v2.c r11 = r11.getType()
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x0339
            goto L_0x0351
        L_0x034e:
            int r4 = r4 + r9
            goto L_0x0333
        L_0x0350:
            r9 = 0
        L_0x0351:
            if (r9 == 0) goto L_0x0357
            r1 = 4
            r2.c(r5, r1, r9)
        L_0x0357:
            java.lang.Object r1 = r2.e
            int[] r1 = (int[]) r1
            r1 = r1[r7]
            if (r6 != 0) goto L_0x03ab
            if (r1 < 0) goto L_0x0373
            java.lang.Object r3 = r2.f3728c
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.lang.Object r1 = r3.get(r1)
            p2.m r1 = (p2.m) r1
            r1.getClass()
            if (r5 == 0) goto L_0x0371
            goto L_0x0373
        L_0x0371:
            r1 = 0
            throw r1
        L_0x0373:
            if (r7 <= 0) goto L_0x038c
            java.lang.Object r1 = r2.f3729d
            t2.m r1 = (t2.m) r1
            r3 = 1
            int r4 = r7 + -1
            t2.k r1 = r1.e(r4)
            if (r1 == 0) goto L_0x038c
            boolean r3 = r1.f()
            if (r3 == 0) goto L_0x038c
            r3 = 6
            r2.c(r5, r3, r1)
        L_0x038c:
            boolean r1 = r8.f()
            if (r1 == 0) goto L_0x03a3
            java.lang.Object r1 = r2.f3729d
            t2.m r1 = (t2.m) r1
            r6 = 1
            int r7 = r7 + r6
            t2.k r1 = r1.e(r7)
            if (r1 == 0) goto L_0x03a4
            r3 = 5
            r2.c(r5, r3, r1)
            goto L_0x03a4
        L_0x03a3:
            r6 = 1
        L_0x03a4:
            p2.m r1 = new p2.m
            r1.<init>(r5, r6, r8)
            r7 = 0
            throw r7
        L_0x03ab:
            r7 = 0
            p2.m r1 = new p2.m
            r2 = 3
            r1.<init>(r5, r2, r6)
            throw r7
        L_0x03b3:
            int r4 = r4 + r6
            goto L_0x02d7
        L_0x03b6:
            r7 = 0
            r1 = r5
            p2.o r1 = (p2.o) r1
            r5.e()
            r1.getClass()
            throw r7
        L_0x03c1:
            r1 = 2147483647(0x7fffffff, float:NaN)
            r3 = 0
            r2.a(r1, r3)
            java.lang.Object r1 = r2.f3728c
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r3 = r1.size()
            int r2 = r2.f3727b
            int r2 = r3 - r2
            if (r2 != 0) goto L_0x03d9
            int r1 = p2.n.f14629W
            goto L_0x0411
        L_0x03d9:
            p2.m[] r4 = new p2.m[r2]
            if (r3 != r2) goto L_0x03e1
            r1.toArray(r4)
            goto L_0x03fb
        L_0x03e1:
            java.util.Iterator r1 = r1.iterator()
            r3 = 0
        L_0x03e6:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x03fb
            java.lang.Object r5 = r1.next()
            p2.m r5 = (p2.m) r5
            if (r5 == 0) goto L_0x03e6
            r6 = 1
            int r7 = r3 + 1
            r4[r3] = r5
            r3 = r7
            goto L_0x03e6
        L_0x03fb:
            java.util.Arrays.sort(r4)
            p2.n r1 = new p2.n
            r1.<init>(r2)
            r3 = 0
        L_0x0404:
            if (r3 >= r2) goto L_0x040e
            r5 = r4[r3]
            r1.f(r3, r5)
            r5 = 1
            int r3 = r3 + r5
            goto L_0x0404
        L_0x040e:
            r3 = 0
            r1.f16382U = r3
        L_0x0411:
            java.lang.Object r1 = r0.f450V
            d4.k r1 = (d4.k) r1
            java.lang.Object r2 = r1.f9767W
            int[] r2 = (int[]) r2
            int r3 = r2.length
            java.lang.Object r4 = r1.f9766V
            d4.k r4 = (d4.k) r4
            java.lang.Object r4 = r4.f9766V
            t2.b r4 = (t2.C1420b) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r3)
            p2.b r6 = p2.C1340b.f14454W
            r7 = r6
            r6 = 0
            r8 = 0
            r9 = 0
        L_0x042d:
            java.lang.Object r10 = r1.f9768X
            d4.k r10 = (d4.k) r10
            if (r6 >= r3) goto L_0x054f
            r11 = r2[r6]
            t2.a r11 = r4.i(r11)
            t2.g r12 = r11.f15183b
            t2.f r13 = r12.h()
            t2.n r13 = r13.f15196U
            v2.b r13 = r13.f15212d
            java.lang.Object[] r13 = r13.f16371V
            int r13 = r13.length
            if (r13 == 0) goto L_0x053b
            y2.e r13 = r11.f15184c
            int r14 = r13.f16380W
            t2.f r12 = r12.h()
            v2.e r12 = r12.d()
            r15 = r12
            y2.c r15 = (y2.C1628c) r15
            java.lang.Object[] r15 = r15.f16371V
            int r15 = r15.length
            if (r15 != 0) goto L_0x0468
            p2.b r12 = p2.C1340b.f14454W
            r17 = r1
            r18 = r2
            r19 = r3
            r20 = r4
            goto L_0x04d5
        L_0x0468:
            r17 = r1
            r1 = -1
            r18 = r2
            int r2 = r11.f15185d
            if (r2 != r1) goto L_0x0473
            if (r14 != r15) goto L_0x0483
        L_0x0473:
            r19 = r3
            if (r2 == r1) goto L_0x048b
            r1 = 1
            int r3 = r15 + 1
            if (r14 != r3) goto L_0x0483
            int r1 = r13.f(r15)
            if (r2 != r1) goto L_0x0483
            goto L_0x048b
        L_0x0483:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "shouldn't happen: weird successors list"
            r1.<init>(r2)
            throw r1
        L_0x048b:
            r1 = 0
        L_0x048c:
            if (r1 >= r15) goto L_0x04a1
            v2.c r2 = r12.b(r1)
            v2.c r3 = v2.c.f16064o0
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x049e
            r2 = 1
            int r15 = r1 + 1
            goto L_0x04a1
        L_0x049e:
            r2 = 1
            int r1 = r1 + r2
            goto L_0x048c
        L_0x04a1:
            p2.b r1 = new p2.b
            r1.<init>(r15)
            r2 = 0
        L_0x04a7:
            if (r2 >= r15) goto L_0x04cf
            u2.u r3 = new u2.u
            v2.c r14 = r12.b(r2)
            r3.<init>(r14)
            int r14 = r13.f(r2)
            r20 = r4
            java.lang.Object r4 = r10.f9766V
            p2.e[] r4 = (p2.e[]) r4
            r4 = r4[r14]
            int r4 = r4.e()
            p2.a r14 = new p2.a
            r14.<init>(r3, r4)
            r1.f(r2, r14)
            r3 = 1
            int r2 = r2 + r3
            r4 = r20
            goto L_0x04a7
        L_0x04cf:
            r20 = r4
            r2 = 0
            r1.f16382U = r2
            r12 = r1
        L_0x04d5:
            java.lang.Object[] r1 = r7.f16371V
            int r1 = r1.length
            if (r1 != 0) goto L_0x04db
            goto L_0x0537
        L_0x04db:
            boolean r1 = r7.equals(r12)
            if (r1 == 0) goto L_0x050f
            if (r8 == 0) goto L_0x0507
            r10.getClass()
            java.lang.Object r1 = r10.f9767W
            p2.e[] r1 = (p2.e[]) r1
            int r2 = r8.f15182a
            r1 = r1[r2]
            int r1 = r1.e()
            java.lang.Object r2 = r10.f9768X
            p2.e[] r2 = (p2.e[]) r2
            int r3 = r11.f15182a
            r2 = r2[r3]
            int r2 = r2.e()
            int r2 = r2 - r1
            r1 = 65535(0xffff, float:9.1834E-41)
            if (r2 > r1) goto L_0x050f
            r9 = r11
        L_0x0505:
            r1 = 1
            goto L_0x0544
        L_0x0507:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "start == null"
            r1.<init>(r2)
            throw r1
        L_0x050f:
            java.lang.Object[] r1 = r7.f16371V
            int r1 = r1.length
            if (r1 == 0) goto L_0x0537
            r10.getClass()
            int r1 = r8.f15182a
            java.lang.Object r2 = r10.f9767W
            p2.e[] r2 = (p2.e[]) r2
            r1 = r2[r1]
            int r2 = r9.f15182a
            java.lang.Object r3 = r10.f9768X
            p2.e[] r3 = (p2.e[]) r3
            r2 = r3[r2]
            p2.c r3 = new p2.c
            int r1 = r1.e()
            int r2 = r2.e()
            r3.<init>(r1, r2, r7)
            r5.add(r3)
        L_0x0537:
            r8 = r11
            r9 = r8
            r7 = r12
            goto L_0x0505
        L_0x053b:
            r17 = r1
            r18 = r2
            r19 = r3
            r20 = r4
            goto L_0x0505
        L_0x0544:
            int r6 = r6 + r1
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            goto L_0x042d
        L_0x054f:
            java.lang.Object[] r1 = r7.f16371V
            int r1 = r1.length
            if (r1 == 0) goto L_0x0577
            r10.getClass()
            int r1 = r8.f15182a
            java.lang.Object r2 = r10.f9767W
            p2.e[] r2 = (p2.e[]) r2
            r1 = r2[r1]
            int r2 = r9.f15182a
            java.lang.Object r3 = r10.f9768X
            p2.e[] r3 = (p2.e[]) r3
            r2 = r3[r2]
            p2.c r3 = new p2.c
            int r1 = r1.e()
            int r2 = r2.e()
            r3.<init>(r1, r2, r7)
            r5.add(r3)
        L_0x0577:
            int r1 = r5.size()
            if (r1 != 0) goto L_0x0580
            p2.d r1 = p2.d.f14458W
            goto L_0x0598
        L_0x0580:
            p2.d r2 = new p2.d
            r2.<init>(r1)
            r3 = 0
        L_0x0586:
            if (r3 >= r1) goto L_0x0594
            java.lang.Object r4 = r5.get(r3)
            p2.c r4 = (p2.C1341c) r4
            r2.f(r3, r4)
            r6 = 1
            int r3 = r3 + r6
            goto L_0x0586
        L_0x0594:
            r3 = 0
            r2.f16382U = r3
            r1 = r2
        L_0x0598:
            r0.f451W = r1
            r1 = 0
            r0.f449U = r1
            r0.f450V = r1
            return
        L_0x05a0:
            r0 = r21
            goto L_0x01e0
        L_0x05a4:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "already processed"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: B3.q.C():void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x017d, code lost:
        r3 = r39;
        r2 = false;
        r11 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void D(byte[] r36, int r37, int r38, M1.k r39, P0.c r40) {
        /*
            r35 = this;
            r0 = r35
            r1 = r37
            int r2 = r1 + r38
            java.lang.Object r3 = r0.f449U
            P0.r r3 = (P0.r) r3
            r4 = r36
            r3.F(r2, r4)
            r3.H(r1)
            int r1 = r3.a()
            if (r1 <= 0) goto L_0x0042
            int r1 = r3.f()
            r2 = 120(0x78, float:1.68E-43)
            if (r1 != r2) goto L_0x0042
            java.lang.Object r1 = r0.f452X
            java.util.zip.Inflater r1 = (java.util.zip.Inflater) r1
            if (r1 != 0) goto L_0x002d
            java.util.zip.Inflater r1 = new java.util.zip.Inflater
            r1.<init>()
            r0.f452X = r1
        L_0x002d:
            java.lang.Object r1 = r0.f452X
            java.util.zip.Inflater r1 = (java.util.zip.Inflater) r1
            java.lang.Object r2 = r0.f450V
            P0.r r2 = (P0.r) r2
            boolean r1 = P0.z.I(r3, r2, r1)
            if (r1 == 0) goto L_0x0042
            byte[] r1 = r2.f3732a
            int r2 = r2.f3734c
            r3.F(r2, r1)
        L_0x0042:
            java.lang.Object r1 = r0.f451W
            P1.a r1 = (P1.a) r1
            r2 = 0
            r1.f3765d = r2
            r1.e = r2
            r1.f3766f = r2
            r1.f3767g = r2
            r1.f3768h = r2
            r1.i = r2
            P0.r r4 = r1.f3762a
            r4.E(r2)
            r1.f3764c = r2
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x005f:
            int r5 = r3.a()
            r7 = 3
            if (r5 < r7) goto L_0x0254
            int r5 = r3.f3734c
            int r8 = r3.v()
            int r9 = r3.B()
            int r10 = r3.f3733b
            int r10 = r10 + r9
            if (r10 <= r5) goto L_0x007d
            r3.H(r5)
            r16 = r6
            r11 = 0
            goto L_0x024b
        L_0x007d:
            r5 = 128(0x80, float:1.794E-43)
            int[] r12 = r1.f3763b
            if (r8 == r5) goto L_0x0183
            switch(r8) {
                case 20: goto L_0x00f9;
                case 21: goto L_0x00af;
                case 22: goto L_0x008c;
                default: goto L_0x0086;
            }
        L_0x0086:
            r39 = r3
            r16 = r6
            goto L_0x017d
        L_0x008c:
            r5 = 19
            if (r9 >= r5) goto L_0x0091
            goto L_0x0086
        L_0x0091:
            int r5 = r3.B()
            r1.f3765d = r5
            int r5 = r3.B()
            r1.e = r5
            r5 = 11
            r3.I(r5)
            int r5 = r3.B()
            r1.f3766f = r5
            int r5 = r3.B()
            r1.f3767g = r5
            goto L_0x0086
        L_0x00af:
            r8 = 4
            if (r9 >= r8) goto L_0x00b3
            goto L_0x0086
        L_0x00b3:
            r3.I(r7)
            int r7 = r3.v()
            r5 = r5 & r7
            if (r5 == 0) goto L_0x00bf
            r13 = 1
            goto L_0x00c0
        L_0x00bf:
            r13 = 0
        L_0x00c0:
            int r5 = r9 + -4
            if (r13 == 0) goto L_0x00e2
            r7 = 7
            if (r5 >= r7) goto L_0x00c8
            goto L_0x0086
        L_0x00c8:
            int r5 = r3.y()
            if (r5 >= r8) goto L_0x00cf
            goto L_0x0086
        L_0x00cf:
            int r7 = r3.B()
            r1.f3768h = r7
            int r7 = r3.B()
            r1.i = r7
            int r5 = r5 + -4
            r4.E(r5)
            int r5 = r9 + -11
        L_0x00e2:
            int r7 = r4.f3733b
            int r8 = r4.f3734c
            if (r7 >= r8) goto L_0x0086
            if (r5 <= 0) goto L_0x0086
            int r8 = r8 - r7
            int r5 = java.lang.Math.min(r5, r8)
            byte[] r8 = r4.f3732a
            r3.g(r8, r7, r5)
            int r7 = r7 + r5
            r4.H(r7)
            goto L_0x0086
        L_0x00f9:
            int r7 = r9 % 5
            r8 = 2
            if (r7 == r8) goto L_0x00ff
            goto L_0x0086
        L_0x00ff:
            r3.I(r8)
            java.util.Arrays.fill(r12, r2)
            int r9 = r9 / 5
            r7 = 0
        L_0x0108:
            if (r7 >= r9) goto L_0x0176
            int r8 = r3.v()
            int r14 = r3.v()
            int r15 = r3.v()
            int r16 = r3.v()
            int r17 = r3.v()
            double r13 = (double) r14
            int r15 = r15 - r5
            r38 = r12
            double r11 = (double) r15
            r18 = 4608992865850220347(0x3ff66e978d4fdf3b, double:1.402)
            double r18 = r18 * r11
            r39 = r3
            double r2 = r18 + r13
            int r2 = (int) r2
            int r3 = r16 + -128
            r16 = r6
            double r5 = (double) r3
            r19 = 4599871095020959050(0x3fd60663c74fb54a, double:0.34414)
            double r19 = r19 * r5
            double r19 = r13 - r19
            r21 = 4604607620821057148(0x3fe6da3c21187e7c, double:0.71414)
            double r11 = r11 * r21
            double r11 = r19 - r11
            int r3 = (int) r11
            r11 = 4610659197712347431(0x3ffc5a1cac083127, double:1.772)
            double r5 = r5 * r11
            double r5 = r5 + r13
            int r5 = (int) r5
            int r6 = r17 << 24
            r11 = 255(0xff, float:3.57E-43)
            r12 = 0
            int r2 = P0.z.i(r2, r12, r11)
            int r2 = r2 << 16
            r2 = r2 | r6
            int r3 = P0.z.i(r3, r12, r11)
            int r3 = r3 << 8
            r2 = r2 | r3
            int r3 = P0.z.i(r5, r12, r11)
            r2 = r2 | r3
            r38[r8] = r2
            int r7 = r7 + 1
            r12 = r38
            r3 = r39
            r6 = r16
            r2 = 0
            r5 = 128(0x80, float:1.794E-43)
            goto L_0x0108
        L_0x0176:
            r39 = r3
            r16 = r6
            r2 = 1
            r1.f3764c = r2
        L_0x017d:
            r3 = r39
            r2 = 0
            r11 = 0
            goto L_0x0248
        L_0x0183:
            r39 = r3
            r16 = r6
            r38 = r12
            int r2 = r1.f3765d
            if (r2 == 0) goto L_0x0233
            int r2 = r1.e
            if (r2 == 0) goto L_0x0233
            int r2 = r1.f3768h
            if (r2 == 0) goto L_0x0233
            int r2 = r1.i
            if (r2 == 0) goto L_0x0233
            int r2 = r4.f3734c
            if (r2 == 0) goto L_0x0233
            int r3 = r4.f3733b
            if (r3 != r2) goto L_0x0233
            boolean r2 = r1.f3764c
            if (r2 != 0) goto L_0x01a7
            goto L_0x0233
        L_0x01a7:
            r2 = 0
            r4.H(r2)
            int r2 = r1.f3768h
            int r3 = r1.i
            int r2 = r2 * r3
            int[] r3 = new int[r2]
            r12 = 0
        L_0x01b4:
            if (r12 >= r2) goto L_0x01ed
            int r5 = r4.v()
            if (r5 == 0) goto L_0x01c4
            int r6 = r12 + 1
            r5 = r38[r5]
            r3[r12] = r5
        L_0x01c2:
            r12 = r6
            goto L_0x01b4
        L_0x01c4:
            int r5 = r4.v()
            if (r5 == 0) goto L_0x01b4
            r6 = r5 & 64
            if (r6 != 0) goto L_0x01d1
            r6 = r5 & 63
            goto L_0x01da
        L_0x01d1:
            r6 = r5 & 63
            int r6 = r6 << 8
            int r7 = r4.v()
            r6 = r6 | r7
        L_0x01da:
            r5 = r5 & 128(0x80, float:1.794E-43)
            if (r5 != 0) goto L_0x01e2
            r5 = 0
            r7 = r38[r5]
            goto L_0x01e8
        L_0x01e2:
            int r5 = r4.v()
            r7 = r38[r5]
        L_0x01e8:
            int r6 = r6 + r12
            java.util.Arrays.fill(r3, r12, r6, r7)
            goto L_0x01c2
        L_0x01ed:
            int r2 = r1.f3768h
            int r5 = r1.i
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r21 = android.graphics.Bitmap.createBitmap(r3, r2, r5, r6)
            int r2 = r1.f3766f
            float r2 = (float) r2
            int r3 = r1.f3765d
            float r3 = (float) r3
            float r25 = r2 / r3
            int r2 = r1.f3767g
            float r2 = (float) r2
            int r5 = r1.e
            float r5 = (float) r5
            float r22 = r2 / r5
            int r2 = r1.f3768h
            float r2 = (float) r2
            float r29 = r2 / r3
            int r2 = r1.i
            float r2 = (float) r2
            float r30 = r2 / r5
            O0.b r11 = new O0.b
            r17 = r11
            r32 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r34 = 0
            r19 = 0
            r20 = r19
            r18 = r19
            r23 = 0
            r24 = 0
            r26 = 0
            r33 = -2147483648(0xffffffff80000000, float:-0.0)
            r27 = r33
            r28 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r31 = 0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r2 = 0
            goto L_0x0235
        L_0x0233:
            r2 = 0
            r11 = 0
        L_0x0235:
            r1.f3765d = r2
            r1.e = r2
            r1.f3766f = r2
            r1.f3767g = r2
            r1.f3768h = r2
            r1.i = r2
            r4.E(r2)
            r1.f3764c = r2
            r3 = r39
        L_0x0248:
            r3.H(r10)
        L_0x024b:
            r6 = r16
            if (r11 == 0) goto L_0x005f
            r6.add(r11)
            goto L_0x005f
        L_0x0254:
            M1.a r1 = new M1.a
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r5.<init>(r6, r7, r9)
            r2 = r40
            r2.accept(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B3.q.D(byte[], int, int, M1.k, P0.c):void");
    }

    public void E(h hVar) {
        f.e(hVar, "call");
        ArrayDeque arrayDeque = (ArrayDeque) this.f452X;
        synchronized (this) {
            if (!arrayDeque.remove(hVar)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        Z();
    }

    public C1186e F(C1182a aVar) {
        ArrayList arrayList = (ArrayList) this.f451W;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1186e eVar = (C1186e) arrayList.get(i);
            if (eVar != null && eVar.f13269b == aVar) {
                return eVar;
            }
        }
        C1186e eVar2 = new C1186e((Context) this.f450V, aVar);
        arrayList.add(eVar2);
        return eVar2;
    }

    public ArrayList G() {
        ArrayList arrayList = new ArrayList();
        for (Q q7 : ((HashMap) this.f450V).values()) {
            if (q7 != null) {
                arrayList.add(q7);
            }
        }
        return arrayList;
    }

    public ArrayList H() {
        ArrayList arrayList = new ArrayList();
        for (Q q7 : ((HashMap) this.f450V).values()) {
            if (q7 != null) {
                arrayList.add(q7.f7926c);
            } else {
                arrayList.add((Object) null);
            }
        }
        return arrayList;
    }

    public File I() {
        Activity activity = (Activity) this.f449U;
        File file = new File(n2.a.c0(activity, (String) null), "fully-single-app-auto-settings.json");
        if (file.exists() && file.canRead()) {
            return file;
        }
        File file2 = new File(n2.a.c0(activity, (String) null), "Contents/fully-single-app-auto-settings.json");
        if (!file2.exists() || !file2.canRead()) {
            return null;
        }
        return file2;
    }

    public List J() {
        ArrayList arrayList;
        if (((ArrayList) this.f449U).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.f449U)) {
            arrayList = new ArrayList((ArrayList) this.f449U);
        }
        return arrayList;
    }

    public k L() {
        int i = ((C1419a) this.f450V).f15185d;
        if (i < 0) {
            return null;
        }
        C1424f fVar = (C1424f) ((C1420b) ((s) this.f452X).f14632a.f9766V).i(i).f15183b.e(0);
        if (fVar.f15196U.f15209a != 56) {
            return null;
        }
        return fVar.f15198W;
    }

    public JSONObject M() {
        Map<String, ?> all = ((SharedPreferences) this.f450V).getAll();
        all.remove("defaultLauncher");
        all.remove("licenseSignature");
        all.remove("licenseDeviceId");
        all.remove("billingEmail");
        all.remove("canonicalDeviceId");
        all.remove("licenseVolumeKey");
        all.remove("volumeLicenseStatus");
        all.remove("hourCounter");
        all.remove("firstPingTime");
        all.remove("deviceSupportsUsageAccess");
        all.remove("cloudAccountDeviceAlias");
        all.remove("cloudAccountEmailAdded");
        all.remove("foregroundMillis");
        all.remove("knoxSettingsApplied");
        all.remove("App Restrictions");
        all.remove("bgsync_launch_next_online");
        all.remove("acra.legacyAlreadyConvertedTo4.8.0");
        all.remove("acra.legacyAlreadyConvertedToJson");
        all.remove("acra.lastVersionNr");
        all.remove("isSettingImportedFromAssets");
        all.remove("isDeviceOwner");
        all.remove("isProvisioningSettingsDone");
        all.remove("isProvisioningCompleted");
        all.remove("firstAppInstallVersionCode");
        all.remove("wifiSelectorSSID");
        all.remove("wifiSelectorKey");
        all.remove("contentZipFileLastModified");
        all.remove("loadContentZipFileLastUrl");
        all.remove("systemWallpaperLastUrl");
        all.remove("lockscreenWallpaperLastUrl");
        all.remove("lastFullyLogTransmittedId");
        all.remove("lastBootTime");
        all.remove("wssServiceToken");
        all.remove("lastManagedConfigJsonHash");
        C0770s0 s0Var = (C0770s0) this.f452X;
        Iterator it = C0770s0.c(s0Var.f10938a, 4).iterator();
        while (it.hasNext()) {
            all.remove((String) it.next());
        }
        Iterator it2 = s0Var.f10945j.iterator();
        while (it2.hasNext()) {
            all.remove((String) it2.next());
        }
        for (Map.Entry next : all.entrySet()) {
        }
        JSONObject jSONObject = new JSONObject(all);
        v("kioskPin", jSONObject);
        v("kioskWifiPin", jSONObject);
        v("remoteAdminPassword", jSONObject);
        return jSONObject;
    }

    public void N(String str, String str2) {
        f.e(str2, "value");
        s0 s0Var = (s0) this.f451W;
        s0Var.getClass();
        F.h.f(str);
        F.h.g(str2, str);
        s0Var.n(str);
        s0Var.f(str, str2);
    }

    public boolean O(File file, int i) {
        Activity activity = (Activity) this.f449U;
        if (n2.a.w0(activity, file) && !P.C()) {
            Log.e("FullySettingsExportImport", "External storage is not readable for " + file.getAbsolutePath() + " media state: " + Environment.getExternalStorageState());
            return false;
        } else if (n2.a.y0() && n2.a.w0(activity, file) && !n2.a.g0(activity)) {
            int i8 = i & 8;
            if (i8 != 0) {
                Log.w("FullySettingsExportImport", "Skip file auto-import while missing permissions");
                return false;
            } else if (i8 == 0) {
                Log.w("FullySettingsExportImport", "Skip file import while missing permissions");
                return false;
            } else {
                if ((i & 16) != 0) {
                    try {
                        activity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}, 1007);
                    } catch (Exception e) {
                        n2.a.b1(activity, "Failed to request file access permission");
                        Q0.g.z(e, new StringBuilder("Failed to request file access permission due to "), "FullySettingsExportImport");
                    }
                } else {
                    activity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}, 1006);
                }
                n2.a.b1(activity, "Please grant permissions and try again");
                return false;
            }
        } else if (!file.exists()) {
            if ((i & 4) != 0) {
                n2.a.a1(1, activity, "Settings file not found " + file.getAbsolutePath());
            }
            Log.w("FullySettingsExportImport", "Settings file not found " + file.getAbsolutePath());
            return false;
        } else {
            try {
                return P(new FileInputStream(file), file.getAbsolutePath(), i);
            } catch (Exception e8) {
                if ((i & 4) != 0) {
                    n2.a.a1(1, activity, "Error reading file " + file.getAbsolutePath());
                }
                Log.w("FullySettingsExportImport", "Error reading settings file " + file.getAbsolutePath() + " due to " + e8.getMessage());
                return false;
            }
        }
    }

    public boolean P(InputStream inputStream, String str, int i) {
        HashMap hashMap;
        Class<?> cls;
        String str2 = str;
        int i8 = i;
        Activity activity = (Activity) this.f449U;
        SharedPreferences sharedPreferences = (SharedPreferences) this.f450V;
        Map<String, ?> all = sharedPreferences.getAll();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        ArrayList c8 = C0770s0.c(((C0770s0) this.f452X).f10938a, 2);
        try {
            if (str.toLowerCase().endsWith(".json")) {
                String b8 = E7.f.b(inputStream, StandardCharsets.UTF_8);
                inputStream.close();
                JSONObject jSONObject = new JSONObject(b8);
                s("kioskPin", jSONObject);
                s("kioskWifiPin", jSONObject);
                s("remoteAdminPassword", jSONObject);
                hashMap = n2.a.J0(jSONObject);
            } else {
                hashMap = null;
            }
            if (hashMap != null) {
                try {
                    for (Map.Entry entry : hashMap.entrySet()) {
                        Object value = entry.getValue();
                        String str3 = (String) entry.getKey();
                        if (str3 != null) {
                            if (value != null) {
                                if (all.get(str3) != null) {
                                    cls = all.get(str3).getClass();
                                } else {
                                    cls = null;
                                }
                                if (!str3.equals("defaultLauncher") && !str3.equals("hourCounter") && !str3.equals("firstPingTime") && !str3.equals("deviceSupportsUsageAccess") && !str3.equals("licenseSignature") && !str3.equals("licenseDeviceId") && !str3.equals("canonicalDeviceId") && !str3.equals("licenseVolumeKey") && !str3.equals("isDeviceOwner")) {
                                    if (!str3.equals("lastManagedConfigJsonHash")) {
                                        if (i8 == 32) {
                                            if ((!str3.equals("kioskMode") || !(value instanceof Boolean) || !((Boolean) value).booleanValue()) && !str3.equals("remoteAdmin") && !str3.equals("remoteAdminScreenshot") && !str3.equals("remoteAdminCamshot") && !str3.equals("remoteAdminFileManagement") && !str3.equals("cloudService")) {
                                                if (str3.equals("remoteAdminPassword")) {
                                                }
                                            }
                                        }
                                        if (!c8.contains(str3)) {
                                            if (value instanceof Boolean) {
                                                if (cls != null) {
                                                    if (!cls.equals(Boolean.class)) {
                                                        throw new IllegalArgumentException("Type mismatch for " + str3);
                                                    }
                                                }
                                                edit.putBoolean(str3, ((Boolean) value).booleanValue());
                                            } else {
                                                Class<Float> cls2 = Float.class;
                                                Class<Integer> cls3 = Integer.class;
                                                if (value instanceof Double) {
                                                    if (cls != null) {
                                                        if (!cls.equals(cls3)) {
                                                            if (cls.equals(cls2)) {
                                                                edit.putFloat(str3, ((Double) value).floatValue());
                                                            } else {
                                                                throw new IllegalArgumentException("Type mismatch for " + str3);
                                                            }
                                                        }
                                                    }
                                                    edit.putInt(str3, ((Double) value).intValue());
                                                } else if (value instanceof Float) {
                                                    if (cls != null) {
                                                        if (!cls.equals(cls2)) {
                                                            throw new IllegalArgumentException();
                                                        }
                                                    }
                                                    edit.putFloat(str3, ((Float) value).floatValue());
                                                } else if (value instanceof Integer) {
                                                    if (cls != null) {
                                                        if (!cls.equals(cls3)) {
                                                            throw new IllegalArgumentException("Type mismatch for " + str3);
                                                        }
                                                    }
                                                    edit.putInt(str3, ((Integer) value).intValue());
                                                } else if (value instanceof Long) {
                                                    if (cls != null) {
                                                        if (!cls.equals(Long.class)) {
                                                            throw new IllegalArgumentException("Type mismatch for " + str3);
                                                        }
                                                    }
                                                    edit.putLong(str3, ((Long) value).longValue());
                                                } else if (value instanceof String) {
                                                    if (cls != null) {
                                                        if (!cls.equals(String.class)) {
                                                            throw new IllegalArgumentException("Type mismatch for " + str3);
                                                        }
                                                    }
                                                    edit.putString(str3, (String) value);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if ((i8 & 1) == 0) {
                        edit.commit();
                        if ((i8 & 2) != 0) {
                            n2.a.a1(0, activity, "Settings imported from " + str2);
                        }
                        String str4 = "Settings imported from " + str2 + " flags: " + i8;
                        Log.i("FullySettingsExportImport", str4);
                        C0794w0.q0(0, "FullySettingsExportImport", str4);
                    } else {
                        edit.clear();
                    }
                } catch (Exception e) {
                    if ((i8 & 4) != 0) {
                        n2.a.a1(1, activity, "Error importing settings from ".concat(str2));
                    }
                    Q0.g.x(e, Q0.g.s("Error importing settings from ", str2, " due to "), "FullySettingsExportImport");
                    return false;
                }
            }
            return true;
        } catch (Exception e8) {
            if ((i8 & 4) != 0) {
                n2.a.a1(1, activity, "Failed reading settings from " + str2);
            }
            Log.e("FullySettingsExportImport", "Failed reading settings from " + str2);
            e8.printStackTrace();
            return false;
        }
    }

    public boolean Q() {
        K2 k22;
        d4.k kVar = (d4.k) this.f449U;
        if (kVar == null || (k22 = (K2) kVar.f9767W) == null || ((C1214b) ((c) k22.f10051W).f6955V).b() != b.f12892W) {
            return false;
        }
        return true;
    }

    public boolean R(h hVar) {
        p pVar = (p) this.f451W;
        if (pVar == null || hVar == null || pVar.f444a.get() != hVar) {
            return false;
        }
        return true;
    }

    public void S(Q q7) {
        C0470v vVar = q7.f7926c;
        String str = vVar.f8063Y;
        HashMap hashMap = (HashMap) this.f450V;
        if (hashMap.get(str) == null) {
            hashMap.put(vVar.f8063Y, q7);
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Added fragment to active set " + vVar);
            }
        }
    }

    public void T(Q q7) {
        C0470v vVar = q7.f7926c;
        if (vVar.f8086w0) {
            ((N) this.f452X).e(vVar);
        }
        HashMap hashMap = (HashMap) this.f450V;
        if (hashMap.get(vVar.f8063Y) == q7 && ((Q) hashMap.put(vVar.f8063Y, (Object) null)) != null && Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + vVar);
        }
    }

    public void U(String str, Q7.g gVar) {
        f.e(str, "method");
        if (str.length() > 0) {
            if (gVar == null) {
                if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                    throw new IllegalArgumentException(N.e.y("method ", str, " must have a request body.").toString());
                }
            } else if (!C0003d.E(str)) {
                throw new IllegalArgumentException(N.e.y("method ", str, " must not have a request body.").toString());
            }
            this.f450V = str;
            return;
        }
        throw new IllegalArgumentException("method.isEmpty() == true");
    }

    public void V() {
        float f8;
        int i;
        String str;
        int i8;
        int i9;
        String str2;
        int i10;
        SharedPreferences sharedPreferences = (SharedPreferences) this.f450V;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        d4.k kVar = (d4.k) this.f451W;
        if (!kVar.g1().isEmpty() && kVar.g1().length() != 64 && kVar.g1().length() >= 8) {
            String g12 = kVar.g1();
            kVar.V2("licenseVolumeKey", n2.a.j0(g12));
            kVar.V2("volumeLicenseStatus", "Volume license " + g12.substring(0, 3) + "******* registered");
            if (kVar.y2().equals(g12)) {
                kVar.V2("volumeLicenseKey", n2.a.j0(g12));
            }
        }
        boolean contains = sharedPreferences.contains("accelerometerSensitivity");
        c cVar = (c) kVar.f9767W;
        if (contains) {
            try {
                i10 = Integer.parseInt(cVar.r("accelerometerSensitivity", "80"));
            } catch (Exception unused) {
                i10 = 0;
            }
            if (i10 != 0) {
                i10 = (i10 / 10) + 90;
            }
            edit.putString("accelerometerSensitivityV2", String.valueOf(i10));
            edit.remove("accelerometerSensitivity");
        }
        boolean contains2 = sharedPreferences.contains("mqttEnabled");
        Activity activity = (Activity) this.f449U;
        if (contains2 && kVar.z1().booleanValue() && !n2.a.z0()) {
            edit.putBoolean("mqttEnabled", false);
            n2.a.b1(activity, "MQTT support requires Android 7+");
        }
        if (sharedPreferences.contains("actionBarQrScanButtonUrl")) {
            String r8 = cVar.r("actionBarQrScanButtonUrl", "");
            if (!r8.isEmpty()) {
                edit.putBoolean("showQrScanButton", true);
                edit.putString("barcodeScanTargetUrl", r8);
            }
            edit.remove("actionBarQrScanButtonUrl");
        }
        if (sharedPreferences.contains("scrollingDragging")) {
            edit.putBoolean("webviewDragging", cVar.n("scrollingDragging", true));
            edit.putBoolean("webviewScrolling", cVar.n("scrollingDragging", true));
            edit.remove("scrollingDragging");
        }
        String str3 = "0";
        if (sharedPreferences.contains("enableDownload")) {
            if (cVar.n("enableDownload", false)) {
                str2 = "1";
            } else {
                str2 = str3;
            }
            kVar.V2("remoteFileMode", str2);
            kVar.R2("enableUrlOtherApps", cVar.n("enableDownload", false));
            edit.remove("enableDownload");
        }
        if (sharedPreferences.contains("timeToScreenOff")) {
            if (kVar.s1().booleanValue()) {
                try {
                    i9 = Integer.parseInt(cVar.r("timeToScreenOff", str3));
                } catch (Exception unused2) {
                }
                kVar.V2("timeToScreenOffV2", String.valueOf(i9));
                edit.remove("timeToScreenOff");
            }
            i9 = 0;
            kVar.V2("timeToScreenOffV2", String.valueOf(i9));
            edit.remove("timeToScreenOff");
        }
        if (sharedPreferences.contains("timeToScreensaver")) {
            if (kVar.s1().booleanValue()) {
                try {
                    i8 = Integer.parseInt(cVar.r("timeToScreensaver", str3));
                } catch (Exception unused3) {
                }
                kVar.V2("timeToScreensaverV2", String.valueOf(i8));
                edit.remove("timeToScreensaver");
            }
            i8 = 0;
            kVar.V2("timeToScreensaverV2", String.valueOf(i8));
            edit.remove("timeToScreensaver");
        }
        String str4 = "2";
        if (sharedPreferences.contains("showPdfFiles")) {
            if (cVar.n("showPdfFiles", false)) {
                str = str4;
            } else {
                str = str3;
            }
            kVar.V2("remotePdfFileMode", str);
            edit.remove("showPdfFiles");
        }
        if (sharedPreferences.contains("showLocalPdfFiles")) {
            if (cVar.n("showLocalPdfFiles", false)) {
                str3 = "1";
            }
            kVar.V2("localPdfFileMode", str3);
            edit.remove("showLocalPdfFiles");
        }
        if (sharedPreferences.contains("disableHwAcceleration")) {
            if (cVar.n("disableHwAcceleration", false)) {
                str4 = "1";
            }
            kVar.V2("graphicsAccelerationMode", str4);
            edit.remove("disableHwAcceleration");
        }
        if (sharedPreferences.contains("setFullScreen")) {
            kVar.R2("showNavigationBar", !cVar.n("setFullScreen", true));
            kVar.R2("showStatusBar", !cVar.n("setFullScreen", true));
            edit.remove("setFullScreen");
        }
        if (sharedPreferences.contains("disableHardwareButtons")) {
            kVar.R2("disablePowerButton", cVar.n("disableHardwareButtons", true));
            kVar.R2("disableVolumeButtons", cVar.n("disableHardwareButtons", true));
            edit.remove("disableHardwareButtons");
        }
        if (sharedPreferences.contains("webviewDarkMode")) {
            try {
                i = Integer.parseInt(cVar.r("webviewDarkMode", "1"));
            } catch (Exception unused4) {
                i = 1;
            }
            kVar.V2("appDarkMode", String.valueOf(i));
            edit.remove("webviewDarkMode");
        }
        if (sharedPreferences.contains("screensaverURL")) {
            String string = sharedPreferences.getString("screensaverURL", "");
            if (!string.isEmpty()) {
                if (string.startsWith("daydream:")) {
                    edit.putBoolean("screensaverDaydream", true);
                } else if (string.startsWith("dim:")) {
                    try {
                        f8 = 1.0f - (Float.valueOf(string.replace("dim:", "")).floatValue() / 100.0f);
                    } catch (Exception e) {
                        e.printStackTrace();
                        f8 = 1.0f;
                    }
                    if (f8 < 0.0f || f8 > 1.0f) {
                        f8 = 1.0f;
                    }
                    edit.putString("screensaverBrightness", String.valueOf(Math.round((1.0f - f8) * 255.0f)));
                } else {
                    O2 o2 = new O2();
                    o2.f10215a = string;
                    if (string.startsWith("rtsp:") || string.endsWith(".mp4") || string.endsWith(".webm") || string.endsWith(".mkv")) {
                        o2.f10216b = 1;
                    } else {
                        o2.f10216b = 0;
                    }
                    o2.f10223k = 1;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(o2);
                    O2.c(activity, "screensaverPlaylist", arrayList);
                }
            }
            edit.remove("screensaverURL");
        }
        if (sharedPreferences.contains("wakeupTime") || sharedPreferences.contains("sleepTime")) {
            C0726k3 k3Var = new C0726k3();
            k3Var.f10772a = cVar.r("sleepTime", "");
            k3Var.f10773b = cVar.r("wakeupTime", "");
            k3Var.f10774c = 8;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(k3Var);
            C0726k3.b(activity, arrayList2);
            edit.remove("wakeupTime");
            edit.remove("sleepTime");
        }
        edit.commit();
    }

    public boolean W(C1182a aVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f449U).onActionItemClicked(F(aVar), new t((Context) this.f450V, (C1308a) menuItem));
    }

    public boolean X(C1182a aVar, m mVar) {
        C1186e F8 = F(aVar);
        i iVar = (i) this.f452X;
        Menu menu = (Menu) iVar.get(mVar);
        if (menu == null) {
            menu = new C1221B((Context) this.f450V, mVar);
            iVar.put(mVar, menu);
        }
        return ((ActionMode.Callback) this.f449U).onCreateActionMode(F8, menu);
    }

    public void Y(h hVar) {
        synchronized (this.f449U) {
            try {
                if (R(hVar)) {
                    p pVar = (p) this.f451W;
                    if (!pVar.f446c) {
                        pVar.f446c = true;
                        ((Handler) this.f450V).removeCallbacksAndMessages(pVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void Z() {
        byte[] bArr = Z6.b.f6982a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.f450V).iterator();
                f.d(it, "readyAsyncCalls.iterator()");
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    } else if (((ArrayDeque) this.f451W).size() < 64) {
                        throw null;
                    }
                }
                i0();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayList.size() > 0) {
            if (arrayList.get(0) == null) {
                w();
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public /* synthetic */ void a() {
    }

    public void a0() {
        long j7;
        ByteBuffer byteBuffer;
        boolean Q2 = Q();
        d4.k kVar = (d4.k) this.f452X;
        if (Q2) {
            FullyActivity fullyActivity = (FullyActivity) this.f451W;
            JSONObject j8 = P.j(fullyActivity);
            n2.a.b(j8, fullyActivity.E());
            try {
                if (((c) kVar.f9767W).n("environmentSensorsEnabled", false)) {
                    j8.put("sensorInfo", fullyActivity.f9937Z0.a());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            String replace = kVar.O2(((c) kVar.f9767W).r("mqttDeviceInfoTopic", "$appId/deviceInfo/$deviceId")).replace("$event", "deviceInfo").replace("#", "").replace("+", "");
            n2.a.a(50, j8.toString());
            if (replace.isEmpty() || j8.toString() == null) {
                Log.w("q", "publishDeviceInfo ignored as topic/message is empty");
            } else {
                K2 k22 = (K2) ((d4.k) this.f449U).f9767W;
                k22.getClass();
                Q5.a aVar = new Q5.a(new e5.b(k22));
                aVar.e(replace);
                aVar.f4125d = k5.a.f13048V;
                aVar.f4122a = true;
                byte[] bytes = j8.toString().replace("\\/", "/").getBytes();
                if (bytes == null) {
                    byteBuffer = null;
                } else {
                    byteBuffer = ByteBuffer.wrap(bytes);
                }
                aVar.f4124c = byteBuffer;
                aVar.d();
            }
        }
        kVar.getClass();
        try {
            j7 = Long.parseLong(((c) kVar.f9767W).r("mqttDeviceInfoInterval", "60"));
        } catch (Exception unused) {
            j7 = 0;
        }
        if (j7 > 4) {
            Handler handler = (Handler) this.f450V;
            if (handler != null) {
                handler.removeCallbacksAndMessages((Object) null);
                this.f450V = null;
            }
            Handler handler2 = new Handler();
            this.f450V = handler2;
            handler2.postDelayed(new R1(this, 2), j7 * 1000);
        }
    }

    public void b(t2.q qVar) {
        boolean z;
        p2.g gVar;
        p pVar = qVar.f15197V;
        p2.i a8 = p2.r.a(qVar);
        n nVar = qVar.f15196U;
        if (nVar.e == 6) {
            k((p2.e) this.f451W);
            boolean z6 = nVar.f15213f;
            C1490a aVar = qVar.f15188Y;
            if (z6) {
                k(new p2.f(a8, pVar, qVar.f15199X, aVar));
                return;
            }
            k L8 = L();
            t2.l a9 = s.a(qVar, L8);
            boolean z8 = a8.e;
            boolean z9 = true;
            int i = nVar.f15209a;
            if (z8 || i == 43) {
                z = true;
            } else {
                z = false;
            }
            if (L8 == null) {
                z9 = false;
            }
            if (z == z9) {
                if (i != 41 || a8.f14466a == 35) {
                    gVar = new p2.f(a8, pVar, a9, aVar);
                } else {
                    gVar = new p2.g(a8, pVar, a9);
                }
                k(gVar);
                return;
            }
            throw new RuntimeException("Insn with result/move-result-pseudo mismatch " + qVar);
        }
        throw new RuntimeException("Expected BRANCH_THROW got " + nVar.e);
    }

    public void b0(String str, JSONObject jSONObject) {
        ByteBuffer byteBuffer;
        FullyActivity fullyActivity = (FullyActivity) this.f451W;
        fullyActivity.f9936Y0.getClass();
        if (Q()) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                jSONObject.put("deviceId", P.i(fullyActivity));
                jSONObject.put("event", str);
            } catch (Exception e) {
                e.printStackTrace();
            }
            d4.k kVar = (d4.k) this.f452X;
            String replace = kVar.O2(((c) kVar.f9767W).r("mqttEventTopic", "$appId/event/$event/$deviceId")).replace("$event", str).replace("#", "").replace("+", "");
            if (!replace.isEmpty()) {
                K2 k22 = (K2) ((d4.k) this.f449U).f9767W;
                k22.getClass();
                Q5.a aVar = new Q5.a(new e5.b(k22));
                aVar.e(replace);
                aVar.f4125d = k5.a.f13048V;
                aVar.f4122a = false;
                byte[] bytes = jSONObject.toString().replace("\\/", "/").getBytes();
                if (bytes == null) {
                    byteBuffer = null;
                } else {
                    byteBuffer = ByteBuffer.wrap(bytes);
                }
                aVar.f4124c = byteBuffer;
                aVar.d();
                return;
            }
            Log.w("q", "publishEvent ignored as topic is empty");
        }
    }

    public void c() {
        try {
            if (((PowerManager.WakeLock) this.f450V) == null) {
                this.f450V = ((PowerManager) ((Context) this.f452X).getApplicationContext().getSystemService("power")).newWakeLock(26, "fully-single-app:FullWakeLock");
            }
            if (!((PowerManager.WakeLock) this.f450V).isHeld()) {
                ((PowerManager.WakeLock) this.f450V).acquire();
            }
        } catch (Exception unused) {
            Log.e("q", "Error when acquiring full wakelock");
        }
    }

    public void c0() {
        try {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.f450V;
            if (wakeLock != null && wakeLock.isHeld()) {
                ((PowerManager.WakeLock) this.f450V).release();
            }
        } catch (Exception unused) {
            Log.e("q", "Error when releasing full wakelock");
        }
    }

    public void d(t2.i iVar) {
        p2.g gVar;
        n nVar = iVar.f15196U;
        int i = nVar.f15209a;
        if (i != 54 && i != 56) {
            p2.i a8 = p2.r.a(iVar);
            k kVar = iVar.f15198W;
            p pVar = iVar.f15197V;
            int i8 = nVar.e;
            if (!(i8 == 1 || i8 == 2)) {
                if (i8 == 3) {
                    return;
                }
                if (i8 == 4) {
                    gVar = new u(a8, pVar, s.a(iVar, kVar), ((p2.e[]) ((s) this.f452X).f14633b.f9766V)[((C1419a) this.f450V).f15184c.f(1)]);
                    k(gVar);
                } else if (i8 != 6) {
                    throw new RuntimeException("shouldn't happen");
                }
            }
            gVar = new p2.g(a8, pVar, s.a(iVar, kVar));
            k(gVar);
        }
    }

    public void d0() {
        try {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.f449U;
            if (wakeLock != null && wakeLock.isHeld()) {
                ((PowerManager.WakeLock) this.f449U).release();
            }
        } catch (Exception unused) {
            Log.e("q", "Error when releasing partial wakelock");
        }
    }

    public void e(boolean z) {
        try {
            if (((PowerManager.WakeLock) this.f449U) == null) {
                PowerManager powerManager = (PowerManager) ((Context) this.f452X).getApplicationContext().getSystemService("power");
                if (z) {
                    this.f449U = powerManager.newWakeLock(26, "fully-single-app:PartialWakeLock");
                } else {
                    this.f449U = powerManager.newWakeLock(1, "fully-single-app:PartialWakeLock");
                }
            }
            if (!((PowerManager.WakeLock) this.f449U).isHeld()) {
                ((PowerManager.WakeLock) this.f449U).acquire();
            }
        } catch (Exception unused) {
            Log.e("q", "Error when acquiring partial wakelock");
        }
    }

    public void f(t2.r rVar) {
        boolean z;
        p pVar = rVar.f15197V;
        p2.i a8 = p2.r.a(rVar);
        if (rVar.f15196U.e == 6) {
            k L8 = L();
            boolean z6 = a8.e;
            if (L8 != null) {
                z = true;
            } else {
                z = false;
            }
            if (z6 == z) {
                k((p2.e) this.f451W);
                k(new p2.g(a8, pVar, s.a(rVar, L8)));
                return;
            }
            throw new RuntimeException("Insn with result/move-result-pseudo mismatch" + rVar);
        }
        throw new RuntimeException("shouldn't happen");
    }

    public void f0() {
        try {
            WifiManager.WifiLock wifiLock = (WifiManager.WifiLock) this.f451W;
            if (wifiLock != null && wifiLock.isHeld()) {
                ((WifiManager.WifiLock) this.f451W).release();
            }
        } catch (Exception unused) {
            Log.e("q", "Error when releasing wifi wakelock");
        }
    }

    public void g() {
        try {
            if (((WifiManager.WifiLock) this.f451W) == null) {
                this.f451W = ((WifiManager) ((Context) this.f452X).getApplicationContext().getSystemService("wifi")).createWifiLock(1, "fully-single-app:WifiWakeLock");
            }
            if (!((WifiManager.WifiLock) this.f451W).isHeld()) {
                ((WifiManager.WifiLock) this.f451W).acquire();
            }
        } catch (Exception unused) {
            Log.e("q", "Error when acquiring Wifi wakelock");
        }
    }

    public void h(C1426h hVar) {
        p pVar = hVar.f15197V;
        p2.i a8 = p2.r.a(hVar);
        n nVar = hVar.f15196U;
        int i = nVar.f15209a;
        if (nVar.e == 1) {
            C1490a aVar = hVar.f15188Y;
            k kVar = hVar.f15198W;
            if (i == 3) {
                s sVar = (s) this.f452X;
                if (!sVar.f14638h) {
                    k(new p2.g(a8, pVar, t2.l.i(kVar, k.e((sVar.e - sVar.f14637g) + ((j) aVar).f15756U, kVar.f15205V.getType()))));
                    return;
                }
                return;
            }
            k(new p2.f(a8, pVar, s.a(hVar, kVar), aVar));
            return;
        }
        throw new RuntimeException("shouldn't happen");
    }

    public void h0(h hVar) {
        synchronized (this.f449U) {
            try {
                if (R(hVar)) {
                    p pVar = (p) this.f451W;
                    if (pVar.f446c) {
                        pVar.f446c = false;
                        j0(pVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void i(v vVar, w wVar) {
        C0074c cVar = (C0074c) ((HashMap) this.f450V).put(vVar, new C0074c(vVar, wVar, (ReferenceQueue) this.f451W));
        if (cVar != null) {
            cVar.f1065c = null;
            cVar.clear();
        }
    }

    public synchronized int i0() {
        return ((ArrayDeque) this.f451W).size() + ((ArrayDeque) this.f452X).size();
    }

    public void j(C0470v vVar) {
        if (!((ArrayList) this.f449U).contains(vVar)) {
            synchronized (((ArrayList) this.f449U)) {
                ((ArrayList) this.f449U).add(vVar);
            }
            vVar.f8069e0 = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + vVar);
    }

    public void j0(p pVar) {
        int i = pVar.f445b;
        if (i != -2) {
            if (i <= 0) {
                if (i == -1) {
                    i = 1500;
                } else {
                    i = 2750;
                }
            }
            Handler handler = (Handler) this.f450V;
            handler.removeCallbacksAndMessages(pVar);
            handler.sendMessageDelayed(Message.obtain(handler, 0, pVar), (long) i);
        }
    }

    public void k(p2.g gVar) {
        ((J1.e) ((K2) this.f449U).f10050V).b(gVar);
    }

    public X0.b k0(List list) {
        ArrayList l8 = l(list);
        if (l8.size() < 2) {
            return (X0.b) C0103u.k(l8, (String) null);
        }
        Collections.sort(l8, new C0051j0(7));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i8 = ((X0.b) l8.get(0)).f6212c;
        int i9 = 0;
        while (true) {
            if (i9 >= l8.size()) {
                break;
            }
            X0.b bVar = (X0.b) l8.get(i9);
            if (i8 == bVar.f6212c) {
                arrayList.add(new Pair(bVar.f6211b, Integer.valueOf(bVar.f6213d)));
                i9++;
            } else if (arrayList.size() == 1) {
                return (X0.b) l8.get(0);
            }
        }
        HashMap hashMap = (HashMap) this.f451W;
        X0.b bVar2 = (X0.b) hashMap.get(arrayList);
        if (bVar2 == null) {
            List subList = l8.subList(0, arrayList.size());
            int i10 = 0;
            for (int i11 = 0; i11 < subList.size(); i11++) {
                i10 += ((X0.b) subList.get(i11)).f6213d;
            }
            int nextInt = ((Random) this.f452X).nextInt(i10);
            int i12 = 0;
            while (true) {
                if (i >= subList.size()) {
                    bVar2 = (X0.b) C0103u.l(subList);
                    break;
                }
                X0.b bVar3 = (X0.b) subList.get(i);
                i12 += bVar3.f6213d;
                if (nextInt < i12) {
                    bVar2 = bVar3;
                    break;
                }
                i++;
            }
            hashMap.put(arrayList, bVar2);
        }
        return bVar2;
    }

    public ArrayList l(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = (HashMap) this.f449U;
        g0(elapsedRealtime, hashMap);
        HashMap hashMap2 = (HashMap) this.f450V;
        g0(elapsedRealtime, hashMap2);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            X0.b bVar = (X0.b) list.get(i);
            if (!hashMap.containsKey(bVar.f6211b) && !hashMap2.containsKey(Integer.valueOf(bVar.f6212c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void l0(s7.C1408a r10) {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object r1 = r9.f450V
            r7.d r1 = (r7.C1395d) r1
            java.lang.Object r2 = r9.f449U
            android.content.Context r2 = (android.content.Context) r2
            android.content.pm.PackageManager r3 = r2.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0029 }
            java.lang.String r4 = r2.getPackageName()     // Catch:{ NameNotFoundException -> 0x0029 }
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo(r4, r0)     // Catch:{ NameNotFoundException -> 0x0029 }
            int r3 = r3.flags     // Catch:{ NameNotFoundException -> 0x0029 }
            r3 = r3 & 2
            if (r3 <= 0) goto L_0x0029
            boolean r3 = r1.f14963e0
            if (r3 == 0) goto L_0x0020
            goto L_0x0029
        L_0x0020:
            org.acra.ErrorReporter r10 = n7.C1247a.f13789a
            java.lang.String r10 = "Not sending report because dev mode was detected and sendReportsInDevMode was false"
            n2.a.l0(r10)
            goto L_0x00f5
        L_0x0029:
            java.util.LinkedList r6 = new java.util.LinkedList
            r6.<init>()
            java.lang.Object r3 = r9.f451W
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.Iterator r4 = r3.iterator()
        L_0x0036:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0056
            java.lang.Object r5 = r4.next()
            B7.h r5 = (B7.h) r5
            org.acra.ErrorReporter r7 = n7.C1247a.f13789a     // Catch:{ i -> 0x004c }
            java.lang.Object r7 = r9.f452X     // Catch:{ i -> 0x004c }
            android.os.Bundle r7 = (android.os.Bundle) r7     // Catch:{ i -> 0x004c }
            r5.a(r2, r10, r7)     // Catch:{ i -> 0x004c }
            goto L_0x0036
        L_0x004c:
            r7 = move-exception
            r7.r r8 = new r7.r
            r8.<init>(r5, r7)
            r6.add(r8)
            goto L_0x0036
        L_0x0056:
            boolean r10 = r6.isEmpty()
            if (r10 == 0) goto L_0x0060
            org.acra.ErrorReporter r10 = n7.C1247a.f13789a
            goto L_0x00f5
        L_0x0060:
            java.lang.String r10 = "clazz"
            java.lang.Class r1 = r1.f14970l0
            P6.f.e(r1, r10)
            java.lang.String r10 = "Failed to create instance of class "
            java.lang.Object r10 = r1.newInstance()     // Catch:{ InstantiationException -> 0x007f, IllegalAccessException -> 0x006e }
            goto L_0x0090
        L_0x006e:
            r2 = move-exception
            org.acra.ErrorReporter r4 = n7.C1247a.f13789a
            org.acra.ErrorReporter r4 = n7.C1247a.f13789a
            java.lang.String r1 = r1.getName()
            java.lang.String r10 = r10.concat(r1)
            n2.a.B(r10, r2)
            goto L_0x008f
        L_0x007f:
            r2 = move-exception
            org.acra.ErrorReporter r4 = n7.C1247a.f13789a
            org.acra.ErrorReporter r4 = n7.C1247a.f13789a
            java.lang.String r1 = r1.getName()
            java.lang.String r10 = r10.concat(r1)
            n2.a.B(r10, r2)
        L_0x008f:
            r10 = 0
        L_0x0090:
            if (r10 != 0) goto L_0x0097
            r7.g r10 = new r7.g
            r10.<init>()
        L_0x0097:
            r7.g r10 = (r7.C1398g) r10
            int r10 = r3.size()
            int r1 = r6.size()
            if (r10 != r1) goto L_0x00ba
            boolean r10 = r3.isEmpty()
            if (r10 == 0) goto L_0x00aa
            goto L_0x00ba
        L_0x00aa:
            B7.i r10 = new B7.i
            java.lang.Object r0 = r6.get(r0)
            r7.r r0 = (r7.r) r0
            B7.i r0 = r0.f15068b
            java.lang.String r1 = "Policy marked this task as incomplete. ACRA will try to send this report again."
            r10.<init>(r1, r0)
            throw r10
        L_0x00ba:
            org.acra.ErrorReporter r10 = n7.C1247a.f13789a
            B7.g r4 = new B7.g
            r4.<init>((int) r0)
            r2 = 0
            r3 = 0
            r1 = 0
            r5 = 31
            r0 = r6
            java.lang.String r10 = D6.i.P(r0, r1, r2, r3, r4, r5)
            B7.g r4 = new B7.g
            r0 = 1
            r4.<init>((int) r0)
            r2 = 0
            r3 = 0
            java.lang.String r1 = "\n"
            r5 = 30
            r0 = r6
            java.lang.String r0 = D6.i.P(r0, r1, r2, r3, r4, r5)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "ReportSenders of classes ["
            r1.<init>(r2)
            r1.append(r10)
            java.lang.String r10 = "] failed, but Policy marked this task as complete. ACRA will not send this report again.\nSuppressed:\n"
            r1.append(r10)
            r1.append(r0)
            java.lang.String r10 = r1.toString()
            n2.a.m1(r10)
        L_0x00f5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B3.q.l0(s7.a):void");
    }

    public void m() {
        Activity activity = (Activity) this.f449U;
        O(new File(n2.a.c0(activity, (String) null), "fully-single-app-auto-settings.json"), 24);
        O(new File(n2.a.c0(activity, (String) null), "Contents/fully-single-app-auto-settings.json"), 24);
        O(new File(n2.a.c0(activity, (String) null), "fully-single-app-once-settings.json"), 24);
        O(new File(n2.a.c0(activity, (String) null), "Contents/fully-single-app-once-settings.json"), 24);
        new File(n2.a.c0(activity, (String) null), "fully-single-app-once-settings.json").delete();
        new File(n2.a.c0(activity, (String) null), "Contents/fully-single-app-once-settings.json").delete();
    }

    public Bundle m0(String str, Bundle bundle) {
        HashMap hashMap = (HashMap) this.f451W;
        if (bundle != null) {
            return (Bundle) hashMap.put(str, bundle);
        }
        return (Bundle) hashMap.remove(str);
    }

    public d n() {
        Map unmodifiableMap;
        o oVar = (o) this.f449U;
        if (oVar != null) {
            String str = (String) this.f450V;
            Y6.m g8 = ((s0) this.f451W).g();
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f452X;
            byte[] bArr = Z6.b.f6982a;
            f.e(linkedHashMap, "<this>");
            if (linkedHashMap.isEmpty()) {
                unmodifiableMap = D6.s.f1270U;
            } else {
                unmodifiableMap = DesugarCollections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
                f.d(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
            }
            return new d(oVar, str, g8, (Q7.g) null, unmodifiableMap);
        }
        throw new IllegalStateException("url == null");
    }

    public void n0(String str, String str2) {
        if (!str.equals("remote")) {
            String d8 = C1477r.d("Settings saved to ", str2);
            Activity activity = (Activity) this.f449U;
            n2.a.b1(activity, d8);
            d4.k kVar = (d4.k) this.f451W;
            if (!kVar.y2().equals("") || !kVar.d0().equals("") || !kVar.K1().equals("")) {
                n2.a.a1(1, activity, "Attention: Your keys, passwords or PINs are included in the setting file! Keep it secret!");
            }
        }
    }

    public /* synthetic */ M1.d o(byte[] bArr, int i, int i8) {
        return N.e.o(this, bArr, i8);
    }

    public void o0() {
        p pVar = (p) this.f452X;
        if (pVar != null) {
            this.f451W = pVar;
            this.f452X = null;
            h hVar = (h) pVar.f444a.get();
            if (hVar != null) {
                Handler handler = k.f416x;
                handler.sendMessage(handler.obtainMessage(0, hVar.f400a));
                return;
            }
            this.f451W = null;
        }
    }

    public boolean p(p pVar, int i) {
        h hVar = (h) pVar.f444a.get();
        if (hVar == null) {
            return false;
        }
        ((Handler) this.f450V).removeCallbacksAndMessages(pVar);
        Handler handler = k.f416x;
        handler.sendMessage(handler.obtainMessage(1, i, 0, hVar.f400a));
        return true;
    }

    /* JADX WARNING: type inference failed for: r2v6, types: [l6.g, g5.c, g5.b] */
    public void p0() {
        q0();
        if (!n2.a.z0()) {
            this.f449U = null;
            Log.w("q", "Android 7 and later is required for MQTT support");
            return;
        }
        d4.k kVar = new d4.k((Context) (FullyActivity) this.f451W, 2);
        this.f449U = kVar;
        kVar.f9768X = new R1(this, 0);
        K2 k22 = (K2) kVar.f9767W;
        if (k22 != null) {
            R4.a aVar = R4.a.f4343b;
            C0996d.p(aVar, R4.a.class, "Connect");
            CompletableFuture i = F1.i();
            O4.a aVar2 = aVar.f4344a;
            C0996d.p(aVar2, O4.a.class, "Connect");
            C1214b bVar = (C1214b) ((C1213a) ((C1213a) k22.f10050V).f13355a).f13355a;
            z4.e eVar = new z4.e(bVar, aVar2);
            l6.f fVar = bVar.f13357b.f13376b;
            C1345a.a(fVar, "scheduler is null");
            ? cVar = new C0964c();
            try {
                eVar.x(new C1432a(cVar, fVar));
                cVar.whenComplete(new C0840a(i, 2));
            } catch (NullPointerException e) {
                throw e;
            } catch (Throwable th) {
                R.e.v(th);
                NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
                nullPointerException.initCause(th);
                throw nullPointerException;
            }
        }
    }

    public void q(C0074c cVar) {
        synchronized (this) {
            ((HashMap) this.f450V).remove(cVar.f1063a);
            if (cVar.f1064b) {
                D d8 = cVar.f1065c;
                if (d8 != null) {
                    ((D2.q) this.f452X).f(cVar.f1063a, new w(d8, true, false, cVar.f1063a, (D2.q) this.f452X));
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [g5.c, l6.a, g5.b] */
    public void q0() {
        d4.k kVar = (d4.k) this.f449U;
        if (!(kVar == null || ((K2) kVar.f9767W) == null)) {
            ((AtomicBoolean) kVar.f9766V).set(true);
            K2 k22 = (K2) ((d4.k) this.f449U).f9767W;
            k22.getClass();
            CompletableFuture i = F1.i();
            S4.a aVar = T4.a.f5005a;
            C0996d.p(aVar, S4.a.class, "Disconnect");
            C1214b bVar = (C1214b) ((C1213a) ((C1213a) k22.f10050V).f13355a).f13355a;
            A1.d dVar = new A1.d(bVar, 1, aVar);
            l6.f fVar = bVar.f13357b.f13376b;
            C1345a.a(fVar, "scheduler is null");
            ? cVar = new C0964c();
            try {
                dVar.J(new C1391a(cVar, fVar));
                cVar.whenComplete(new C0840a(i, 0));
            } catch (NullPointerException e) {
                throw e;
            } catch (Throwable th) {
                R.e.v(th);
                C0996d.s(th);
                NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
                nullPointerException.initCause(th);
                throw nullPointerException;
            }
        }
        Handler handler = (Handler) this.f450V;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.f450V = null;
        }
    }

    public void r() {
        g7.l.a();
        A1.d dVar = (A1.d) this.f450V;
        dVar.getClass();
        g7.l.a();
        C.a aVar = (C.a) dVar.f36W;
        Objects.requireNonNull(aVar);
        j0 j0Var = (j0) dVar.f35V;
        Objects.requireNonNull(j0Var);
        p0 p0Var = aVar.f475a;
        Objects.requireNonNull(p0Var);
        p0Var.a();
        p0 p0Var2 = aVar.f475a;
        Objects.requireNonNull(p0Var2);
        G.i.d(p0Var2.e).d(new C.e(j0Var, 0), D7.b.H());
        p0 p0Var3 = aVar.f476b;
        if (p0Var3 != null) {
            p0Var3.a();
            G.i.d(aVar.f476b.e).d(new C.e((j0) null, 1), D7.b.H());
        }
        ((com.bumptech.glide.manager.q) this.f451W).getClass();
    }

    public void r0(String str) {
        f.e(str, "url");
        if (W6.l.a0(str, "ws:", true)) {
            String substring = str.substring(3);
            f.d(substring, "this as java.lang.String).substring(startIndex)");
            str = "http:".concat(substring);
        } else if (W6.l.a0(str, "wss:", true)) {
            String substring2 = str.substring(4);
            f.d(substring2, "this as java.lang.String).substring(startIndex)");
            str = "https:".concat(substring2);
        }
        f.e(str, "<this>");
        Y6.n nVar = new Y6.n();
        nVar.c((o) null, str);
        this.f449U = nVar.a();
    }

    public void t(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (!arrayList.contains(obj)) {
            if (!hashSet.contains(obj)) {
                hashSet.add(obj);
                ArrayList arrayList2 = (ArrayList) ((i) this.f450V).get(obj);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        t(arrayList2.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(obj);
                arrayList.add(obj);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    public boolean u(File file) {
        ErrorReporter errorReporter = C1247a.f13789a;
        n2.a.l0("Sending report " + file);
        try {
            l0(new C1408a(n2.a.R0(file)));
            Q7.g.s(file);
            return true;
        } catch (RuntimeException e) {
            ErrorReporter errorReporter2 = C1247a.f13789a;
            n2.a.B("Failed to send crash reports for " + file, e);
            Q7.g.s(file);
            return false;
        } catch (IOException e8) {
            ErrorReporter errorReporter3 = C1247a.f13789a;
            n2.a.B("Failed to send crash reports for " + file, e8);
            Q7.g.s(file);
            return false;
        } catch (JSONException e9) {
            ErrorReporter errorReporter4 = C1247a.f13789a;
            n2.a.B("Failed to send crash reports for " + file, e9);
            Q7.g.s(file);
            return false;
        } catch (B7.i e10) {
            ErrorReporter errorReporter5 = C1247a.f13789a;
            n2.a.B("Failed to send crash reports for " + file, e10);
            return false;
        }
    }

    public synchronized void w() {
        try {
            if (((ThreadPoolExecutor) this.f449U) == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                String str = Z6.b.f6986f + " Dispatcher";
                f.e(str, "name");
                this.f449U = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, timeUnit, synchronousQueue, new Z6.a(str, false));
            }
            f.b((ThreadPoolExecutor) this.f449U);
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public void x(File file, String str) {
        Activity activity = (Activity) this.f449U;
        if (n2.a.w0(activity, file)) {
            if (!P.B()) {
                Log.e("FullySettingsExportImport", "External storage is not writable for " + file.getAbsolutePath());
                n2.a.b1(activity, "External storage is not writable");
                return;
            } else if (!n2.a.h0(activity)) {
                if (!str.equals("remote")) {
                    activity.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}, 1006);
                    n2.a.b1(activity, "Please grant permissions and try again");
                    return;
                }
                return;
            }
        }
        try {
            z(new FileOutputStream(file));
            n0(str, file.getAbsolutePath());
        } catch (IOException e) {
            Log.e("FullySettingsExportImport", "Error writing settings to " + file.getAbsolutePath() + " due to " + e.getMessage());
            StringBuilder sb = new StringBuilder("Error writing settings to ");
            sb.append(file.getAbsolutePath());
            n2.a.b1(activity, sb.toString());
        }
    }

    public int y() {
        return 2;
    }

    public void z(FileOutputStream fileOutputStream) {
        try {
            String replace = M().toString(2).replace("\\/", "/");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            outputStreamWriter.append(replace);
            outputStreamWriter.close();
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (JSONException e) {
            Log.e("FullySettingsExportImport", "Failed to get JSON due to " + e.getMessage());
        }
    }

    public q(Activity activity) {
        this.f449U = activity;
        this.f451W = new d4.k((Context) activity, 1);
        this.f452X = new C0770s0(activity);
        this.f450V = PreferenceManager.getDefaultSharedPreferences(activity);
    }

    public q(Context context) {
        this.f452X = context;
    }

    public q(Typeface typeface, D0.b bVar) {
        int i;
        int i8;
        this.f452X = typeface;
        this.f449U = bVar;
        this.f451W = new androidx.emoji2.text.r(1024);
        int a8 = bVar.a(6);
        if (a8 != 0) {
            int i9 = a8 + bVar.f977a;
            i = ((ByteBuffer) bVar.f980d).getInt(((ByteBuffer) bVar.f980d).getInt(i9) + i9);
        } else {
            i = 0;
        }
        this.f450V = new char[(i * 2)];
        int a9 = bVar.a(6);
        if (a9 != 0) {
            int i10 = a9 + bVar.f977a;
            i8 = ((ByteBuffer) bVar.f980d).getInt(((ByteBuffer) bVar.f980d).getInt(i10) + i10);
        } else {
            i8 = 0;
        }
        for (int i11 = 0; i11 < i8; i11++) {
            androidx.emoji2.text.u uVar = new androidx.emoji2.text.u(this, i11);
            D0.a c8 = uVar.c();
            int a10 = c8.a(4);
            Character.toChars(a10 != 0 ? ((ByteBuffer) c8.f980d).getInt(a10 + c8.f977a) : 0, (char[]) this.f450V, i11 * 2);
            n2.a.h("invalid metadata codepoint length", uVar.b() > 0);
            ((androidx.emoji2.text.r) this.f451W).a(uVar, 0, uVar.b() - 1);
        }
    }

    public q(i0 i0Var, Q0.j jVar, Q0.j jVar2, Q0.j jVar3) {
        Object obj;
        if (i0Var != null) {
            obj = O.m(i0Var);
        } else {
            M m8 = O.f2026V;
            obj = i0.f2073Y;
        }
        this.f449U = obj;
        this.f450V = jVar;
        this.f451W = jVar2;
        this.f452X = jVar3;
    }
}
