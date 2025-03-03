package androidx.fragment.app;

import B3.q;
import C0.e;
import F.h;
import P6.f;
import Q0.g;
import R2.c;
import a1.C0410a;
import android.app.Activity;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.d;
import androidx.activity.u;
import androidx.lifecycle.C0486m;
import androidx.lifecycle.P;
import androidx.lifecycle.r;
import d4.k;
import h.C1022j;
import j$.util.DesugarCollections;
import j0.m;
import j0.n;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import u.C1477r;
import v0.C1537j;

public final class L {

    /* renamed from: A  reason: collision with root package name */
    public final F f7857A;

    /* renamed from: B  reason: collision with root package name */
    public final C0410a f7858B;

    /* renamed from: C  reason: collision with root package name */
    public d f7859C;

    /* renamed from: D  reason: collision with root package name */
    public d f7860D;

    /* renamed from: E  reason: collision with root package name */
    public d f7861E;

    /* renamed from: F  reason: collision with root package name */
    public ArrayDeque f7862F;

    /* renamed from: G  reason: collision with root package name */
    public boolean f7863G;

    /* renamed from: H  reason: collision with root package name */
    public boolean f7864H;

    /* renamed from: I  reason: collision with root package name */
    public boolean f7865I;

    /* renamed from: J  reason: collision with root package name */
    public boolean f7866J;

    /* renamed from: K  reason: collision with root package name */
    public boolean f7867K;

    /* renamed from: L  reason: collision with root package name */
    public ArrayList f7868L;

    /* renamed from: M  reason: collision with root package name */
    public ArrayList f7869M;

    /* renamed from: N  reason: collision with root package name */
    public ArrayList f7870N;

    /* renamed from: O  reason: collision with root package name */
    public N f7871O;

    /* renamed from: P  reason: collision with root package name */
    public final e f7872P;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f7873a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public boolean f7874b;

    /* renamed from: c  reason: collision with root package name */
    public final q f7875c = new q(11);

    /* renamed from: d  reason: collision with root package name */
    public ArrayList f7876d = new ArrayList();
    public ArrayList e;

    /* renamed from: f  reason: collision with root package name */
    public final A f7877f = new A(this);

    /* renamed from: g  reason: collision with root package name */
    public u f7878g;

    /* renamed from: h  reason: collision with root package name */
    public C0450a f7879h = null;
    public boolean i = false;

    /* renamed from: j  reason: collision with root package name */
    public final D f7880j = new D(this);

    /* renamed from: k  reason: collision with root package name */
    public final AtomicInteger f7881k = new AtomicInteger();

    /* renamed from: l  reason: collision with root package name */
    public final Map f7882l = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: m  reason: collision with root package name */
    public final Map f7883m = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList f7884n;

    /* renamed from: o  reason: collision with root package name */
    public final c f7885o;

    /* renamed from: p  reason: collision with root package name */
    public final CopyOnWriteArrayList f7886p;

    /* renamed from: q  reason: collision with root package name */
    public final B f7887q;

    /* renamed from: r  reason: collision with root package name */
    public final B f7888r;

    /* renamed from: s  reason: collision with root package name */
    public final B f7889s;

    /* renamed from: t  reason: collision with root package name */
    public final B f7890t;

    /* renamed from: u  reason: collision with root package name */
    public final E f7891u;

    /* renamed from: v  reason: collision with root package name */
    public int f7892v;

    /* renamed from: w  reason: collision with root package name */
    public C0472x f7893w;

    /* renamed from: x  reason: collision with root package name */
    public h f7894x;

    /* renamed from: y  reason: collision with root package name */
    public C0470v f7895y;
    public C0470v z;

    public L() {
        DesugarCollections.synchronizedMap(new HashMap());
        this.f7884n = new ArrayList();
        this.f7885o = new c(this);
        this.f7886p = new CopyOnWriteArrayList();
        this.f7887q = new B(this, 0);
        this.f7888r = new B(this, 1);
        this.f7889s = new B(this, 2);
        this.f7890t = new B(this, 3);
        this.f7891u = new E(this);
        this.f7892v = -1;
        this.f7857A = new F(this);
        this.f7858B = new C0410a(5);
        this.f7862F = new ArrayDeque();
        this.f7872P = new e(14, this);
    }

    public static HashSet E(C0450a aVar) {
        HashSet hashSet = new HashSet();
        for (int i8 = 0; i8 < aVar.f7955a.size(); i8++) {
            C0470v vVar = ((S) aVar.f7955a.get(i8)).f7929b;
            if (vVar != null && aVar.f7960g) {
                hashSet.add(vVar);
            }
        }
        return hashSet;
    }

    public static boolean L(C0470v vVar) {
        vVar.getClass();
        Iterator it = vVar.p0.f7875c.H().iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            C0470v vVar2 = (C0470v) it.next();
            if (vVar2 != null) {
                z6 = L(vVar2);
                continue;
            }
            if (z6) {
                return true;
            }
        }
        return false;
    }

    public static boolean N(C0470v vVar) {
        if (vVar == null) {
            return true;
        }
        if (!vVar.f8087x0 || (vVar.f8078n0 != null && !N(vVar.f8080q0))) {
            return false;
        }
        return true;
    }

    public static boolean O(C0470v vVar) {
        if (vVar == null) {
            return true;
        }
        L l8 = vVar.f8078n0;
        if (!vVar.equals(l8.z) || !O(l8.f7895y)) {
            return false;
        }
        return true;
    }

    public static void d0(C0470v vVar) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "show: " + vVar);
        }
        if (vVar.f8084u0) {
            vVar.f8084u0 = false;
            vVar.f8049E0 = !vVar.f8049E0;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v27, resolved type: androidx.fragment.app.v} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A(java.util.ArrayList r24, java.util.ArrayList r25, int r26, int r27) {
        /*
            r23 = this;
            r1 = r23
            r0 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            java.lang.Object r5 = r0.get(r3)
            androidx.fragment.app.a r5 = (androidx.fragment.app.C0450a) r5
            boolean r5 = r5.f7968p
            java.util.ArrayList r6 = r1.f7870N
            if (r6 != 0) goto L_0x001e
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r1.f7870N = r6
            goto L_0x0021
        L_0x001e:
            r6.clear()
        L_0x0021:
            java.util.ArrayList r6 = r1.f7870N
            B3.q r7 = r1.f7875c
            java.util.List r8 = r7.J()
            r6.addAll(r8)
            androidx.fragment.app.v r6 = r1.z
            r9 = r3
            r10 = 0
        L_0x0030:
            r11 = 1
            if (r9 >= r4) goto L_0x0187
            java.lang.Object r13 = r0.get(r9)
            androidx.fragment.app.a r13 = (androidx.fragment.app.C0450a) r13
            java.lang.Object r14 = r2.get(r9)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 != 0) goto L_0x0138
            java.util.ArrayList r14 = r1.f7870N
            r12 = 0
        L_0x0048:
            java.util.ArrayList r8 = r13.f7955a
            int r15 = r8.size()
            if (r12 >= r15) goto L_0x0135
            java.lang.Object r15 = r8.get(r12)
            androidx.fragment.app.S r15 = (androidx.fragment.app.S) r15
            int r3 = r15.f7928a
            if (r3 == r11) goto L_0x0083
            r11 = 2
            r2 = 9
            if (r3 == r11) goto L_0x00a1
            r11 = 3
            if (r3 == r11) goto L_0x0088
            r11 = 6
            if (r3 == r11) goto L_0x0088
            r11 = 7
            if (r3 == r11) goto L_0x0083
            r11 = 8
            if (r3 == r11) goto L_0x006d
            goto L_0x007e
        L_0x006d:
            androidx.fragment.app.S r3 = new androidx.fragment.app.S
            r11 = 0
            r3.<init>(r2, r6, r11)
            r8.add(r12, r3)
            r2 = 1
            r15.f7930c = r2
            int r12 = r12 + 1
            androidx.fragment.app.v r2 = r15.f7929b
            r6 = r2
        L_0x007e:
            r21 = r7
            r0 = 1
            goto L_0x0129
        L_0x0083:
            r21 = r7
            r0 = 1
            goto L_0x0124
        L_0x0088:
            androidx.fragment.app.v r3 = r15.f7929b
            r14.remove(r3)
            androidx.fragment.app.v r3 = r15.f7929b
            if (r3 != r6) goto L_0x007e
            androidx.fragment.app.S r6 = new androidx.fragment.app.S
            r6.<init>(r2, r3)
            r8.add(r12, r6)
            int r12 = r12 + 1
            r21 = r7
            r0 = 1
            r6 = 0
            goto L_0x0129
        L_0x00a1:
            androidx.fragment.app.v r3 = r15.f7929b
            int r11 = r3.f8082s0
            int r18 = r14.size()
            r17 = 1
            int r18 = r18 + -1
            r2 = r18
            r18 = 0
        L_0x00b1:
            if (r2 < 0) goto L_0x0111
            java.lang.Object r20 = r14.get(r2)
            r21 = r7
            r7 = r20
            androidx.fragment.app.v r7 = (androidx.fragment.app.C0470v) r7
            int r0 = r7.f8082s0
            if (r0 != r11) goto L_0x0105
            if (r7 != r3) goto L_0x00c9
            r19 = r11
            r0 = 1
            r18 = 1
            goto L_0x0108
        L_0x00c9:
            if (r7 != r6) goto L_0x00dd
            androidx.fragment.app.S r0 = new androidx.fragment.app.S
            r19 = r11
            r6 = 0
            r11 = 9
            r0.<init>(r11, r7, r6)
            r8.add(r12, r0)
            int r12 = r12 + 1
            r0 = 0
            r6 = 0
            goto L_0x00e2
        L_0x00dd:
            r19 = r11
            r0 = 0
            r11 = 9
        L_0x00e2:
            androidx.fragment.app.S r11 = new androidx.fragment.app.S
            r22 = r6
            r6 = 3
            r11.<init>(r6, r7, r0)
            int r0 = r15.f7931d
            r11.f7931d = r0
            int r0 = r15.f7932f
            r11.f7932f = r0
            int r0 = r15.e
            r11.e = r0
            int r0 = r15.f7933g
            r11.f7933g = r0
            r8.add(r12, r11)
            r14.remove(r7)
            r0 = 1
            int r12 = r12 + r0
            r6 = r22
            goto L_0x0108
        L_0x0105:
            r19 = r11
            r0 = 1
        L_0x0108:
            int r2 = r2 + -1
            r0 = r24
            r11 = r19
            r7 = r21
            goto L_0x00b1
        L_0x0111:
            r21 = r7
            r0 = 1
            if (r18 == 0) goto L_0x011c
            r8.remove(r12)
            int r12 = r12 + -1
            goto L_0x0129
        L_0x011c:
            r15.f7928a = r0
            r15.f7930c = r0
            r14.add(r3)
            goto L_0x0129
        L_0x0124:
            androidx.fragment.app.v r2 = r15.f7929b
            r14.add(r2)
        L_0x0129:
            int r12 = r12 + r0
            r0 = r24
            r2 = r25
            r3 = r26
            r7 = r21
            r11 = 1
            goto L_0x0048
        L_0x0135:
            r21 = r7
            goto L_0x0171
        L_0x0138:
            r21 = r7
            r0 = 1
            java.util.ArrayList r2 = r1.f7870N
            java.util.ArrayList r3 = r13.f7955a
            int r7 = r3.size()
            int r7 = r7 - r0
        L_0x0144:
            if (r7 < 0) goto L_0x0171
            java.lang.Object r8 = r3.get(r7)
            androidx.fragment.app.S r8 = (androidx.fragment.app.S) r8
            int r11 = r8.f7928a
            if (r11 == r0) goto L_0x0167
            r0 = 3
            if (r11 == r0) goto L_0x0161
            switch(r11) {
                case 6: goto L_0x0161;
                case 7: goto L_0x0168;
                case 8: goto L_0x015f;
                case 9: goto L_0x015c;
                case 10: goto L_0x0157;
                default: goto L_0x0156;
            }
        L_0x0156:
            goto L_0x016d
        L_0x0157:
            androidx.lifecycle.m r11 = r8.f7934h
            r8.i = r11
            goto L_0x016d
        L_0x015c:
            androidx.fragment.app.v r6 = r8.f7929b
            goto L_0x016d
        L_0x015f:
            r6 = 0
            goto L_0x016d
        L_0x0161:
            androidx.fragment.app.v r8 = r8.f7929b
            r2.add(r8)
            goto L_0x016d
        L_0x0167:
            r0 = 3
        L_0x0168:
            androidx.fragment.app.v r8 = r8.f7929b
            r2.remove(r8)
        L_0x016d:
            int r7 = r7 + -1
            r0 = 1
            goto L_0x0144
        L_0x0171:
            if (r10 != 0) goto L_0x017a
            boolean r0 = r13.f7960g
            if (r0 == 0) goto L_0x0178
            goto L_0x017a
        L_0x0178:
            r10 = 0
            goto L_0x017b
        L_0x017a:
            r10 = 1
        L_0x017b:
            int r9 = r9 + 1
            r0 = r24
            r2 = r25
            r3 = r26
            r7 = r21
            goto L_0x0030
        L_0x0187:
            r21 = r7
            java.util.ArrayList r0 = r1.f7870N
            r0.clear()
            if (r5 != 0) goto L_0x01cf
            int r0 = r1.f7892v
            r2 = 1
            if (r0 < r2) goto L_0x01cf
            r0 = r26
        L_0x0197:
            if (r0 >= r4) goto L_0x01cf
            r2 = r24
            java.lang.Object r3 = r2.get(r0)
            androidx.fragment.app.a r3 = (androidx.fragment.app.C0450a) r3
            java.util.ArrayList r3 = r3.f7955a
            java.util.Iterator r3 = r3.iterator()
        L_0x01a7:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x01ca
            java.lang.Object r5 = r3.next()
            androidx.fragment.app.S r5 = (androidx.fragment.app.S) r5
            androidx.fragment.app.v r5 = r5.f7929b
            if (r5 == 0) goto L_0x01c5
            androidx.fragment.app.L r6 = r5.f8078n0
            if (r6 == 0) goto L_0x01c5
            androidx.fragment.app.Q r5 = r1.g(r5)
            r6 = r21
            r6.S(r5)
            goto L_0x01c7
        L_0x01c5:
            r6 = r21
        L_0x01c7:
            r21 = r6
            goto L_0x01a7
        L_0x01ca:
            r6 = r21
            int r0 = r0 + 1
            goto L_0x0197
        L_0x01cf:
            r2 = r24
            r0 = r26
        L_0x01d3:
            r3 = -1
            if (r0 >= r4) goto L_0x03bf
            java.lang.Object r5 = r2.get(r0)
            androidx.fragment.app.a r5 = (androidx.fragment.app.C0450a) r5
            r6 = r25
            java.lang.Object r7 = r6.get(r0)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            java.lang.String r8 = "Unknown cmd: "
            if (r7 == 0) goto L_0x02dc
            r5.c(r3)
            java.util.ArrayList r3 = r5.f7955a
            int r7 = r3.size()
            r9 = 1
            int r7 = r7 - r9
        L_0x01f7:
            if (r7 < 0) goto L_0x03bb
            java.lang.Object r11 = r3.get(r7)
            androidx.fragment.app.S r11 = (androidx.fragment.app.S) r11
            androidx.fragment.app.v r12 = r11.f7929b
            if (r12 == 0) goto L_0x0244
            androidx.fragment.app.u r13 = r12.f8048D0
            if (r13 != 0) goto L_0x0208
            goto L_0x020e
        L_0x0208:
            androidx.fragment.app.u r13 = r12.g()
            r13.f8035a = r9
        L_0x020e:
            int r9 = r5.f7959f
            r13 = 8194(0x2002, float:1.1482E-41)
            r14 = 4097(0x1001, float:5.741E-42)
            if (r9 == r14) goto L_0x022e
            if (r9 == r13) goto L_0x022c
            r13 = 4100(0x1004, float:5.745E-42)
            r14 = 8197(0x2005, float:1.1486E-41)
            if (r9 == r14) goto L_0x022e
            r15 = 4099(0x1003, float:5.744E-42)
            if (r9 == r15) goto L_0x0229
            if (r9 == r13) goto L_0x0226
            r13 = 0
            goto L_0x022e
        L_0x0226:
            r13 = 8197(0x2005, float:1.1486E-41)
            goto L_0x022e
        L_0x0229:
            r13 = 4099(0x1003, float:5.744E-42)
            goto L_0x022e
        L_0x022c:
            r13 = 4097(0x1001, float:5.741E-42)
        L_0x022e:
            androidx.fragment.app.u r9 = r12.f8048D0
            if (r9 != 0) goto L_0x0235
            if (r13 != 0) goto L_0x0235
            goto L_0x023c
        L_0x0235:
            r12.g()
            androidx.fragment.app.u r9 = r12.f8048D0
            r9.f8039f = r13
        L_0x023c:
            r12.g()
            androidx.fragment.app.u r9 = r12.f8048D0
            r9.getClass()
        L_0x0244:
            int r9 = r11.f7928a
            androidx.fragment.app.L r13 = r5.f7970r
            switch(r9) {
                case 1: goto L_0x02c6;
                case 2: goto L_0x024b;
                case 3: goto L_0x02b7;
                case 4: goto L_0x02a5;
                case 5: goto L_0x0292;
                case 6: goto L_0x0283;
                case 7: goto L_0x0270;
                case 8: goto L_0x026b;
                case 9: goto L_0x0267;
                case 10: goto L_0x025f;
                default: goto L_0x024b;
            }
        L_0x024b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r8)
            int r3 = r11.f7928a
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x025f:
            androidx.lifecycle.m r9 = r11.f7934h
            r13.a0(r12, r9)
        L_0x0264:
            r9 = 1
            goto L_0x02d8
        L_0x0267:
            r13.b0(r12)
            goto L_0x0264
        L_0x026b:
            r9 = 0
            r13.b0(r9)
            goto L_0x0264
        L_0x0270:
            int r9 = r11.f7931d
            int r14 = r11.e
            int r15 = r11.f7932f
            int r11 = r11.f7933g
            r12.M(r9, r14, r15, r11)
            r9 = 1
            r13.Z(r12, r9)
            r13.h(r12)
            goto L_0x0264
        L_0x0283:
            int r9 = r11.f7931d
            int r14 = r11.e
            int r15 = r11.f7932f
            int r11 = r11.f7933g
            r12.M(r9, r14, r15, r11)
            r13.c(r12)
            goto L_0x0264
        L_0x0292:
            int r9 = r11.f7931d
            int r14 = r11.e
            int r15 = r11.f7932f
            int r11 = r11.f7933g
            r12.M(r9, r14, r15, r11)
            r9 = 1
            r13.Z(r12, r9)
            r13.K(r12)
            goto L_0x0264
        L_0x02a5:
            int r9 = r11.f7931d
            int r14 = r11.e
            int r15 = r11.f7932f
            int r11 = r11.f7933g
            r12.M(r9, r14, r15, r11)
            r13.getClass()
            d0(r12)
            goto L_0x0264
        L_0x02b7:
            int r9 = r11.f7931d
            int r14 = r11.e
            int r15 = r11.f7932f
            int r11 = r11.f7933g
            r12.M(r9, r14, r15, r11)
            r13.a(r12)
            goto L_0x0264
        L_0x02c6:
            int r9 = r11.f7931d
            int r14 = r11.e
            int r15 = r11.f7932f
            int r11 = r11.f7933g
            r12.M(r9, r14, r15, r11)
            r9 = 1
            r13.Z(r12, r9)
            r13.U(r12)
        L_0x02d8:
            int r7 = r7 + -1
            goto L_0x01f7
        L_0x02dc:
            r9 = 1
            r5.c(r9)
            java.util.ArrayList r3 = r5.f7955a
            int r7 = r3.size()
            r11 = 0
        L_0x02e7:
            if (r11 >= r7) goto L_0x03bb
            java.lang.Object r9 = r3.get(r11)
            androidx.fragment.app.S r9 = (androidx.fragment.app.S) r9
            androidx.fragment.app.v r12 = r9.f7929b
            if (r12 == 0) goto L_0x0317
            androidx.fragment.app.u r13 = r12.f8048D0
            if (r13 != 0) goto L_0x02f8
            goto L_0x02ff
        L_0x02f8:
            androidx.fragment.app.u r13 = r12.g()
            r14 = 0
            r13.f8035a = r14
        L_0x02ff:
            int r13 = r5.f7959f
            androidx.fragment.app.u r14 = r12.f8048D0
            if (r14 != 0) goto L_0x0308
            if (r13 != 0) goto L_0x0308
            goto L_0x030f
        L_0x0308:
            r12.g()
            androidx.fragment.app.u r14 = r12.f8048D0
            r14.f8039f = r13
        L_0x030f:
            r12.g()
            androidx.fragment.app.u r13 = r12.f8048D0
            r13.getClass()
        L_0x0317:
            int r13 = r9.f7928a
            androidx.fragment.app.L r14 = r5.f7970r
            switch(r13) {
                case 1: goto L_0x03a1;
                case 2: goto L_0x031e;
                case 3: goto L_0x0390;
                case 4: goto L_0x037f;
                case 5: goto L_0x036a;
                case 6: goto L_0x0359;
                case 7: goto L_0x0344;
                case 8: goto L_0x0340;
                case 9: goto L_0x033b;
                case 10: goto L_0x0332;
                default: goto L_0x031e;
            }
        L_0x031e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r8)
            int r3 = r9.f7928a
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0332:
            androidx.lifecycle.m r9 = r9.i
            r14.a0(r12, r9)
        L_0x0337:
            r16 = r3
            goto L_0x03b5
        L_0x033b:
            r9 = 0
            r14.b0(r9)
            goto L_0x0337
        L_0x0340:
            r14.b0(r12)
            goto L_0x0337
        L_0x0344:
            int r13 = r9.f7931d
            int r15 = r9.e
            r16 = r3
            int r3 = r9.f7932f
            int r9 = r9.f7933g
            r12.M(r13, r15, r3, r9)
            r3 = 0
            r14.Z(r12, r3)
            r14.c(r12)
            goto L_0x03b5
        L_0x0359:
            r16 = r3
            int r3 = r9.f7931d
            int r13 = r9.e
            int r15 = r9.f7932f
            int r9 = r9.f7933g
            r12.M(r3, r13, r15, r9)
            r14.h(r12)
            goto L_0x03b5
        L_0x036a:
            r16 = r3
            int r3 = r9.f7931d
            int r13 = r9.e
            int r15 = r9.f7932f
            int r9 = r9.f7933g
            r12.M(r3, r13, r15, r9)
            r3 = 0
            r14.Z(r12, r3)
            d0(r12)
            goto L_0x03b5
        L_0x037f:
            r16 = r3
            int r3 = r9.f7931d
            int r13 = r9.e
            int r15 = r9.f7932f
            int r9 = r9.f7933g
            r12.M(r3, r13, r15, r9)
            r14.K(r12)
            goto L_0x03b5
        L_0x0390:
            r16 = r3
            int r3 = r9.f7931d
            int r13 = r9.e
            int r15 = r9.f7932f
            int r9 = r9.f7933g
            r12.M(r3, r13, r15, r9)
            r14.U(r12)
            goto L_0x03b5
        L_0x03a1:
            r16 = r3
            int r3 = r9.f7931d
            int r13 = r9.e
            int r15 = r9.f7932f
            int r9 = r9.f7933g
            r12.M(r3, r13, r15, r9)
            r3 = 0
            r14.Z(r12, r3)
            r14.a(r12)
        L_0x03b5:
            int r11 = r11 + 1
            r3 = r16
            goto L_0x02e7
        L_0x03bb:
            int r0 = r0 + 1
            goto L_0x01d3
        L_0x03bf:
            r6 = r25
            int r0 = r4 + -1
            java.lang.Object r0 = r6.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.util.ArrayList r5 = r1.f7884n
            if (r10 == 0) goto L_0x044a
            boolean r7 = r5.isEmpty()
            if (r7 != 0) goto L_0x044a
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            java.util.Iterator r8 = r24.iterator()
        L_0x03e0:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x03f4
            java.lang.Object r9 = r8.next()
            androidx.fragment.app.a r9 = (androidx.fragment.app.C0450a) r9
            java.util.HashSet r9 = E(r9)
            r7.addAll(r9)
            goto L_0x03e0
        L_0x03f4:
            androidx.fragment.app.a r8 = r1.f7879h
            if (r8 != 0) goto L_0x044a
            java.util.Iterator r8 = r5.iterator()
        L_0x03fc:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0421
            java.lang.Object r9 = r8.next()
            if (r9 != 0) goto L_0x041b
            java.util.Iterator r9 = r7.iterator()
            boolean r11 = r9.hasNext()
            if (r11 != 0) goto L_0x0413
            goto L_0x03fc
        L_0x0413:
            java.lang.Object r0 = r9.next()
            androidx.fragment.app.v r0 = (androidx.fragment.app.C0470v) r0
            r0 = 0
            throw r0
        L_0x041b:
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>()
            throw r0
        L_0x0421:
            java.util.Iterator r8 = r5.iterator()
        L_0x0425:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x044a
            java.lang.Object r9 = r8.next()
            if (r9 != 0) goto L_0x0444
            java.util.Iterator r9 = r7.iterator()
            boolean r11 = r9.hasNext()
            if (r11 != 0) goto L_0x043c
            goto L_0x0425
        L_0x043c:
            java.lang.Object r0 = r9.next()
            androidx.fragment.app.v r0 = (androidx.fragment.app.C0470v) r0
            r0 = 0
            throw r0
        L_0x0444:
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>()
            throw r0
        L_0x044a:
            r7 = r26
        L_0x044c:
            if (r7 >= r4) goto L_0x0497
            java.lang.Object r8 = r2.get(r7)
            androidx.fragment.app.a r8 = (androidx.fragment.app.C0450a) r8
            if (r0 == 0) goto L_0x0476
            java.util.ArrayList r9 = r8.f7955a
            int r9 = r9.size()
            r11 = 1
            int r9 = r9 - r11
        L_0x045e:
            if (r9 < 0) goto L_0x0494
            java.util.ArrayList r11 = r8.f7955a
            java.lang.Object r11 = r11.get(r9)
            androidx.fragment.app.S r11 = (androidx.fragment.app.S) r11
            androidx.fragment.app.v r11 = r11.f7929b
            if (r11 == 0) goto L_0x0473
            androidx.fragment.app.Q r11 = r1.g(r11)
            r11.k()
        L_0x0473:
            int r9 = r9 + -1
            goto L_0x045e
        L_0x0476:
            java.util.ArrayList r8 = r8.f7955a
            java.util.Iterator r8 = r8.iterator()
        L_0x047c:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0494
            java.lang.Object r9 = r8.next()
            androidx.fragment.app.S r9 = (androidx.fragment.app.S) r9
            androidx.fragment.app.v r9 = r9.f7929b
            if (r9 == 0) goto L_0x047c
            androidx.fragment.app.Q r9 = r1.g(r9)
            r9.k()
            goto L_0x047c
        L_0x0494:
            int r7 = r7 + 1
            goto L_0x044c
        L_0x0497:
            int r7 = r1.f7892v
            r8 = 1
            r1.P(r7, r8)
            r7 = r26
            java.util.HashSet r8 = r1.f(r2, r7, r4)
            java.util.Iterator r8 = r8.iterator()
        L_0x04a7:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x04f9
            java.lang.Object r9 = r8.next()
            androidx.fragment.app.m r9 = (androidx.fragment.app.C0462m) r9
            r9.e = r0
            java.util.ArrayList r11 = r9.f8009b
            monitor-enter(r11)
            r9.m()     // Catch:{ all -> 0x04e9 }
            java.util.ArrayList r12 = r9.f8009b     // Catch:{ all -> 0x04e9 }
            int r13 = r12.size()     // Catch:{ all -> 0x04e9 }
            java.util.ListIterator r12 = r12.listIterator(r13)     // Catch:{ all -> 0x04e9 }
        L_0x04c5:
            boolean r13 = r12.hasPrevious()     // Catch:{ all -> 0x04e9 }
            if (r13 == 0) goto L_0x04eb
            java.lang.Object r13 = r12.previous()     // Catch:{ all -> 0x04e9 }
            r14 = r13
            androidx.fragment.app.W r14 = (androidx.fragment.app.W) r14     // Catch:{ all -> 0x04e9 }
            androidx.fragment.app.v r15 = r14.f7946c     // Catch:{ all -> 0x04e9 }
            android.view.View r15 = r15.f8045A0     // Catch:{ all -> 0x04e9 }
            java.lang.String r3 = "operation.fragment.mView"
            P6.f.d(r15, r3)     // Catch:{ all -> 0x04e9 }
            int r3 = N7.a.a(r15)     // Catch:{ all -> 0x04e9 }
            int r14 = r14.f7944a     // Catch:{ all -> 0x04e9 }
            r15 = 2
            if (r14 != r15) goto L_0x04e7
            if (r3 == r15) goto L_0x04e7
            goto L_0x04ec
        L_0x04e7:
            r3 = -1
            goto L_0x04c5
        L_0x04e9:
            r0 = move-exception
            goto L_0x04f7
        L_0x04eb:
            r13 = 0
        L_0x04ec:
            androidx.fragment.app.W r13 = (androidx.fragment.app.W) r13     // Catch:{ all -> 0x04e9 }
            r3 = 0
            r9.f8012f = r3     // Catch:{ all -> 0x04e9 }
            monitor-exit(r11)
            r9.f()
            r3 = -1
            goto L_0x04a7
        L_0x04f7:
            monitor-exit(r11)
            throw r0
        L_0x04f9:
            if (r7 >= r4) goto L_0x0539
            java.lang.Object r0 = r2.get(r7)
            androidx.fragment.app.a r0 = (androidx.fragment.app.C0450a) r0
            java.lang.Object r3 = r6.get(r7)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0515
            int r3 = r0.f7972t
            if (r3 < 0) goto L_0x0515
            r3 = -1
            r0.f7972t = r3
            goto L_0x0516
        L_0x0515:
            r3 = -1
        L_0x0516:
            java.util.ArrayList r8 = r0.f7969q
            if (r8 == 0) goto L_0x0535
            r11 = 0
        L_0x051b:
            java.util.ArrayList r8 = r0.f7969q
            int r8 = r8.size()
            if (r11 >= r8) goto L_0x0531
            java.util.ArrayList r8 = r0.f7969q
            java.lang.Object r8 = r8.get(r11)
            java.lang.Runnable r8 = (java.lang.Runnable) r8
            r8.run()
            int r11 = r11 + 1
            goto L_0x051b
        L_0x0531:
            r8 = 0
            r0.f7969q = r8
            goto L_0x0536
        L_0x0535:
            r8 = 0
        L_0x0536:
            int r7 = r7 + 1
            goto L_0x04f9
        L_0x0539:
            if (r10 == 0) goto L_0x0550
            int r0 = r5.size()
            if (r0 > 0) goto L_0x0542
            goto L_0x0550
        L_0x0542:
            r0 = 0
            java.lang.Object r0 = r5.get(r0)
            r0.getClass()
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>()
            throw r0
        L_0x0550:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.L.A(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    public final C0470v B(int i8) {
        q qVar = this.f7875c;
        ArrayList arrayList = (ArrayList) qVar.f449U;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0470v vVar = (C0470v) arrayList.get(size);
            if (vVar != null && vVar.f8081r0 == i8) {
                return vVar;
            }
        }
        for (Q q7 : ((HashMap) qVar.f450V).values()) {
            if (q7 != null) {
                C0470v vVar2 = q7.f7926c;
                if (vVar2.f8081r0 == i8) {
                    return vVar2;
                }
            }
        }
        return null;
    }

    public final C0470v C(String str) {
        q qVar = this.f7875c;
        if (str != null) {
            ArrayList arrayList = (ArrayList) qVar.f449U;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C0470v vVar = (C0470v) arrayList.get(size);
                if (vVar != null && str.equals(vVar.f8083t0)) {
                    return vVar;
                }
            }
        }
        if (str != null) {
            for (Q q7 : ((HashMap) qVar.f450V).values()) {
                if (q7 != null) {
                    C0470v vVar2 = q7.f7926c;
                    if (str.equals(vVar2.f8083t0)) {
                        return vVar2;
                    }
                }
            }
        } else {
            qVar.getClass();
        }
        return null;
    }

    public final void D() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            C0462m mVar = (C0462m) it.next();
            if (mVar.f8012f) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                mVar.f8012f = false;
                mVar.f();
            }
        }
    }

    public final C0450a F(int i8) {
        if (i8 != this.f7876d.size()) {
            return (C0450a) this.f7876d.get(i8);
        }
        C0450a aVar = this.f7879h;
        if (aVar != null) {
            return aVar;
        }
        throw new IndexOutOfBoundsException();
    }

    public final int G() {
        int i8;
        int size = this.f7876d.size();
        if (this.f7879h != null) {
            i8 = 1;
        } else {
            i8 = 0;
        }
        return size + i8;
    }

    public final ViewGroup H(C0470v vVar) {
        ViewGroup viewGroup = vVar.f8089z0;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (vVar.f8082s0 > 0 && this.f7894x.z()) {
            View y8 = this.f7894x.y(vVar.f8082s0);
            if (y8 instanceof ViewGroup) {
                return (ViewGroup) y8;
            }
        }
        return null;
    }

    public final F I() {
        C0470v vVar = this.f7895y;
        if (vVar != null) {
            return vVar.f8078n0.I();
        }
        return this.f7857A;
    }

    public final C0410a J() {
        C0470v vVar = this.f7895y;
        if (vVar != null) {
            return vVar.f8078n0.J();
        }
        return this.f7858B;
    }

    public final void K(C0470v vVar) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "hide: " + vVar);
        }
        if (!vVar.f8084u0) {
            vVar.f8084u0 = true;
            vVar.f8049E0 = true ^ vVar.f8049E0;
            c0(vVar);
        }
    }

    public final boolean M() {
        C0470v vVar = this.f7895y;
        if (vVar == null) {
            return true;
        }
        if (!vVar.p() || !this.f7895y.l().M()) {
            return false;
        }
        return true;
    }

    public final void P(int i8, boolean z6) {
        HashMap hashMap;
        C0472x xVar;
        if (this.f7893w == null && i8 != -1) {
            throw new IllegalStateException("No activity");
        } else if (z6 || i8 != this.f7892v) {
            this.f7892v = i8;
            q qVar = this.f7875c;
            Iterator it = ((ArrayList) qVar.f449U).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                hashMap = (HashMap) qVar.f450V;
                if (!hasNext) {
                    break;
                }
                Q q7 = (Q) hashMap.get(((C0470v) it.next()).f8063Y);
                if (q7 != null) {
                    q7.k();
                }
            }
            for (Q q8 : hashMap.values()) {
                if (q8 != null) {
                    q8.k();
                    C0470v vVar = q8.f7926c;
                    if (vVar.f8070f0 && !vVar.r()) {
                        qVar.T(q8);
                    }
                }
            }
            e0();
            if (this.f7863G && (xVar = this.f7893w) != null && this.f7892v == 7) {
                xVar.f8096h0.invalidateOptionsMenu();
                this.f7863G = false;
            }
        }
    }

    public final void Q() {
        if (this.f7893w != null) {
            this.f7864H = false;
            this.f7865I = false;
            this.f7871O.f7908f = false;
            for (C0470v vVar : this.f7875c.J()) {
                if (vVar != null) {
                    vVar.p0.Q();
                }
            }
        }
    }

    public final boolean R() {
        return S(-1, 0);
    }

    public final boolean S(int i8, int i9) {
        z(false);
        y(true);
        C0470v vVar = this.z;
        if (vVar != null && i8 < 0 && vVar.i().R()) {
            return true;
        }
        boolean T8 = T(this.f7868L, this.f7869M, i8, i9);
        if (T8) {
            this.f7874b = true;
            try {
                V(this.f7868L, this.f7869M);
            } finally {
                d();
            }
        }
        g0();
        if (this.f7867K) {
            this.f7867K = false;
            e0();
        }
        ((HashMap) this.f7875c.f450V).values().removeAll(Collections.singleton((Object) null));
        return T8;
    }

    public final boolean T(ArrayList arrayList, ArrayList arrayList2, int i8, int i9) {
        boolean z6;
        if ((i9 & 1) != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        int i10 = -1;
        if (!this.f7876d.isEmpty()) {
            if (i8 < 0) {
                i10 = z6 ? 0 : this.f7876d.size() - 1;
            } else {
                int size = this.f7876d.size() - 1;
                while (size >= 0) {
                    C0450a aVar = (C0450a) this.f7876d.get(size);
                    if (i8 >= 0 && i8 == aVar.f7972t) {
                        break;
                    }
                    size--;
                }
                if (size >= 0) {
                    if (z6) {
                        while (size > 0) {
                            C0450a aVar2 = (C0450a) this.f7876d.get(size - 1);
                            if (i8 < 0 || i8 != aVar2.f7972t) {
                                break;
                            }
                            size--;
                        }
                    } else if (size != this.f7876d.size() - 1) {
                        size++;
                    }
                }
                i10 = size;
            }
        }
        if (i10 < 0) {
            return false;
        }
        for (int size2 = this.f7876d.size() - 1; size2 >= i10; size2--) {
            arrayList.add((C0450a) this.f7876d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void U(C0470v vVar) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "remove: " + vVar + " nesting=" + vVar.f8077m0);
        }
        boolean r8 = vVar.r();
        if (!vVar.f8085v0 || !r8) {
            q qVar = this.f7875c;
            synchronized (((ArrayList) qVar.f449U)) {
                ((ArrayList) qVar.f449U).remove(vVar);
            }
            vVar.f8069e0 = false;
            if (L(vVar)) {
                this.f7863G = true;
            }
            vVar.f8070f0 = true;
            c0(vVar);
        }
    }

    public final void V(ArrayList arrayList, ArrayList arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                int size = arrayList.size();
                int i8 = 0;
                int i9 = 0;
                while (i8 < size) {
                    if (!((C0450a) arrayList.get(i8)).f7968p) {
                        if (i9 != i8) {
                            A(arrayList, arrayList2, i9, i8);
                        }
                        i9 = i8 + 1;
                        if (((Boolean) arrayList2.get(i8)).booleanValue()) {
                            while (i9 < size && ((Boolean) arrayList2.get(i9)).booleanValue() && !((C0450a) arrayList.get(i9)).f7968p) {
                                i9++;
                            }
                        }
                        A(arrayList, arrayList2, i8, i9);
                        i8 = i9 - 1;
                    }
                    i8++;
                }
                if (i9 != size) {
                    A(arrayList, arrayList2, i9, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    /* JADX WARNING: type inference failed for: r14v1, types: [androidx.fragment.app.S, java.lang.Object] */
    public final void W(Bundle bundle) {
        int i8;
        c cVar;
        boolean z6;
        Q q7;
        Bundle bundle2;
        Bundle bundle3;
        Bundle bundle4 = bundle;
        for (String next : bundle.keySet()) {
            if (next.startsWith("result_") && (bundle3 = bundle4.getBundle(next)) != null) {
                bundle3.setClassLoader(this.f7893w.f8093e0.getClassLoader());
                this.f7883m.put(next.substring(7), bundle3);
            }
        }
        HashMap hashMap = new HashMap();
        for (String next2 : bundle.keySet()) {
            if (next2.startsWith("fragment_") && (bundle2 = bundle4.getBundle(next2)) != null) {
                bundle2.setClassLoader(this.f7893w.f8093e0.getClassLoader());
                hashMap.put(next2.substring(9), bundle2);
            }
        }
        q qVar = this.f7875c;
        HashMap hashMap2 = (HashMap) qVar.f451W;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        M m8 = (M) bundle4.getParcelable("state");
        if (m8 != null) {
            HashMap hashMap3 = (HashMap) qVar.f450V;
            hashMap3.clear();
            Iterator it = m8.f7896U.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                i8 = 2;
                cVar = this.f7885o;
                if (!hasNext) {
                    break;
                }
                Bundle m02 = qVar.m0((String) it.next(), (Bundle) null);
                if (m02 != null) {
                    N n4 = this.f7871O;
                    C0470v vVar = (C0470v) n4.f7904a.get(((P) m02.getParcelable("state")).f7910V);
                    if (vVar != null) {
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + vVar);
                        }
                        q7 = new Q(cVar, qVar, vVar, m02);
                    } else {
                        q7 = new Q(this.f7885o, this.f7875c, this.f7893w.f8093e0.getClassLoader(), I(), m02);
                    }
                    C0470v vVar2 = q7.f7926c;
                    vVar2.f8060V = m02;
                    vVar2.f8078n0 = this;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "restoreSaveState: active (" + vVar2.f8063Y + "): " + vVar2);
                    }
                    q7.m(this.f7893w.f8093e0.getClassLoader());
                    qVar.S(q7);
                    q7.e = this.f7892v;
                }
            }
            N n5 = this.f7871O;
            n5.getClass();
            Iterator it2 = new ArrayList(n5.f7904a.values()).iterator();
            while (it2.hasNext()) {
                C0470v vVar3 = (C0470v) it2.next();
                if (hashMap3.get(vVar3.f8063Y) == null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Discarding retained Fragment " + vVar3 + " that was not found in the set of active Fragments " + m8.f7896U);
                    }
                    this.f7871O.e(vVar3);
                    vVar3.f8078n0 = this;
                    Q q8 = new Q(cVar, qVar, vVar3);
                    q8.e = 1;
                    q8.k();
                    vVar3.f8070f0 = true;
                    q8.k();
                }
            }
            ArrayList<String> arrayList = m8.f7897V;
            ((ArrayList) qVar.f449U).clear();
            if (arrayList != null) {
                for (String str : arrayList) {
                    C0470v A8 = qVar.A(str);
                    if (A8 != null) {
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + A8);
                        }
                        qVar.j(A8);
                    } else {
                        throw new IllegalStateException(N.e.y("No instantiated fragment for (", str, ")"));
                    }
                }
            }
            if (m8.f7898W != null) {
                this.f7876d = new ArrayList(m8.f7898W.length);
                int i9 = 0;
                while (true) {
                    C0451b[] bVarArr = m8.f7898W;
                    if (i9 >= bVarArr.length) {
                        break;
                    }
                    C0451b bVar = bVarArr[i9];
                    bVar.getClass();
                    C0450a aVar = new C0450a(this);
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        int[] iArr = bVar.f7973U;
                        if (i10 >= iArr.length) {
                            break;
                        }
                        ? obj = new Object();
                        int i12 = i10 + 1;
                        obj.f7928a = iArr[i10];
                        if (Log.isLoggable("FragmentManager", i8)) {
                            Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i11 + " base fragment #" + iArr[i12]);
                        }
                        obj.f7934h = C0486m.values()[bVar.f7975W[i11]];
                        obj.i = C0486m.values()[bVar.f7976X[i11]];
                        int i13 = i10 + 2;
                        if (iArr[i12] != 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        obj.f7930c = z6;
                        int i14 = iArr[i13];
                        obj.f7931d = i14;
                        int i15 = iArr[i10 + 3];
                        obj.e = i15;
                        int i16 = i10 + 5;
                        int i17 = iArr[i10 + 4];
                        obj.f7932f = i17;
                        i10 += 6;
                        int i18 = iArr[i16];
                        obj.f7933g = i18;
                        aVar.f7956b = i14;
                        aVar.f7957c = i15;
                        aVar.f7958d = i17;
                        aVar.e = i18;
                        aVar.b(obj);
                        i11++;
                        i8 = 2;
                    }
                    aVar.f7959f = bVar.f7977Y;
                    aVar.i = bVar.f7978Z;
                    aVar.f7960g = true;
                    aVar.f7962j = bVar.f7980b0;
                    aVar.f7963k = bVar.f7981c0;
                    aVar.f7964l = bVar.f7982d0;
                    aVar.f7965m = bVar.f7983e0;
                    aVar.f7966n = bVar.f7984f0;
                    aVar.f7967o = bVar.f7985g0;
                    aVar.f7968p = bVar.f7986h0;
                    aVar.f7972t = bVar.f7979a0;
                    int i19 = 0;
                    while (true) {
                        ArrayList arrayList2 = bVar.f7974V;
                        if (i19 >= arrayList2.size()) {
                            break;
                        }
                        String str2 = (String) arrayList2.get(i19);
                        if (str2 != null) {
                            ((S) aVar.f7955a.get(i19)).f7929b = qVar.A(str2);
                        }
                        i19++;
                    }
                    aVar.c(1);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        StringBuilder p3 = g.p(i9, "restoreAllState: back stack #", " (index ");
                        p3.append(aVar.f7972t);
                        p3.append("): ");
                        p3.append(aVar);
                        Log.v("FragmentManager", p3.toString());
                        PrintWriter printWriter = new PrintWriter(new U());
                        aVar.g("  ", printWriter, false);
                        printWriter.close();
                    }
                    this.f7876d.add(aVar);
                    i9++;
                    i8 = 2;
                }
            } else {
                this.f7876d = new ArrayList();
            }
            this.f7881k.set(m8.f7899X);
            String str3 = m8.f7900Y;
            if (str3 != null) {
                C0470v A9 = qVar.A(str3);
                this.z = A9;
                r(A9);
            }
            ArrayList arrayList3 = m8.f7901Z;
            if (arrayList3 != null) {
                for (int i20 = 0; i20 < arrayList3.size(); i20++) {
                    this.f7882l.put((String) arrayList3.get(i20), (C0452c) m8.f7902a0.get(i20));
                }
            }
            this.f7862F = new ArrayDeque(m8.f7903b0);
        }
    }

    /* JADX WARNING: type inference failed for: r3v8, types: [android.os.Parcelable, androidx.fragment.app.M, java.lang.Object] */
    public final Bundle X() {
        int i8;
        ArrayList arrayList;
        C0451b[] bVarArr;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        D();
        w();
        z(true);
        this.f7864H = true;
        this.f7871O.f7908f = true;
        q qVar = this.f7875c;
        qVar.getClass();
        HashMap hashMap = (HashMap) qVar.f450V;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        Iterator it = hashMap.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Q q7 = (Q) it.next();
            if (q7 != null) {
                C0470v vVar = q7.f7926c;
                String str = vVar.f8063Y;
                Bundle bundle3 = new Bundle();
                C0470v vVar2 = q7.f7926c;
                if (vVar2.f8059U == -1 && (bundle = vVar2.f8060V) != null) {
                    bundle3.putAll(bundle);
                }
                bundle3.putParcelable("state", new P(vVar2));
                if (vVar2.f8059U > -1) {
                    Bundle bundle4 = new Bundle();
                    vVar2.E(bundle4);
                    if (!bundle4.isEmpty()) {
                        bundle3.putBundle("savedInstanceState", bundle4);
                    }
                    q7.f7924a.V(vVar2, bundle4, false);
                    Bundle bundle5 = new Bundle();
                    vVar2.f8056L0.k(bundle5);
                    if (!bundle5.isEmpty()) {
                        bundle3.putBundle("registryState", bundle5);
                    }
                    Bundle X3 = vVar2.p0.X();
                    if (!X3.isEmpty()) {
                        bundle3.putBundle("childFragmentManager", X3);
                    }
                    if (vVar2.f8045A0 != null) {
                        q7.o();
                    }
                    SparseArray sparseArray = vVar2.f8061W;
                    if (sparseArray != null) {
                        bundle3.putSparseParcelableArray("viewState", sparseArray);
                    }
                    Bundle bundle6 = vVar2.f8062X;
                    if (bundle6 != null) {
                        bundle3.putBundle("viewRegistryState", bundle6);
                    }
                }
                Bundle bundle7 = vVar2.f8064Z;
                if (bundle7 != null) {
                    bundle3.putBundle("arguments", bundle7);
                }
                qVar.m0(str, bundle3);
                arrayList2.add(vVar.f8063Y);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Saved state of " + vVar + ": " + vVar.f8060V);
                }
            }
        }
        HashMap hashMap2 = (HashMap) this.f7875c.f451W;
        if (!hashMap2.isEmpty()) {
            q qVar2 = this.f7875c;
            synchronized (((ArrayList) qVar2.f449U)) {
                try {
                    if (((ArrayList) qVar2.f449U).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) qVar2.f449U).size());
                        Iterator it2 = ((ArrayList) qVar2.f449U).iterator();
                        while (it2.hasNext()) {
                            C0470v vVar3 = (C0470v) it2.next();
                            arrayList.add(vVar3.f8063Y);
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + vVar3.f8063Y + "): " + vVar3);
                            }
                        }
                    }
                } finally {
                    while (true) {
                    }
                }
            }
            int size = this.f7876d.size();
            if (size > 0) {
                bVarArr = new C0451b[size];
                for (i8 = 0; i8 < size; i8++) {
                    bVarArr[i8] = new C0451b((C0450a) this.f7876d.get(i8));
                    if (Log.isLoggable("FragmentManager", 2)) {
                        StringBuilder p3 = g.p(i8, "saveAllState: adding back stack #", ": ");
                        p3.append(this.f7876d.get(i8));
                        Log.v("FragmentManager", p3.toString());
                    }
                }
            } else {
                bVarArr = null;
            }
            ? obj = new Object();
            obj.f7900Y = null;
            ArrayList arrayList3 = new ArrayList();
            obj.f7901Z = arrayList3;
            ArrayList arrayList4 = new ArrayList();
            obj.f7902a0 = arrayList4;
            obj.f7896U = arrayList2;
            obj.f7897V = arrayList;
            obj.f7898W = bVarArr;
            obj.f7899X = this.f7881k.get();
            C0470v vVar4 = this.z;
            if (vVar4 != null) {
                obj.f7900Y = vVar4.f8063Y;
            }
            arrayList3.addAll(this.f7882l.keySet());
            arrayList4.addAll(this.f7882l.values());
            obj.f7903b0 = new ArrayList(this.f7862F);
            bundle2.putParcelable("state", obj);
            for (String str2 : this.f7883m.keySet()) {
                bundle2.putBundle(C1477r.d("result_", str2), (Bundle) this.f7883m.get(str2));
            }
            for (String str3 : hashMap2.keySet()) {
                bundle2.putBundle(C1477r.d("fragment_", str3), (Bundle) hashMap2.get(str3));
            }
        } else if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle2;
    }

    public final void Y() {
        synchronized (this.f7873a) {
            try {
                if (this.f7873a.size() == 1) {
                    this.f7893w.f8094f0.removeCallbacks(this.f7872P);
                    this.f7893w.f8094f0.post(this.f7872P);
                    g0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void Z(C0470v vVar, boolean z6) {
        ViewGroup H8 = H(vVar);
        if (H8 != null && (H8 instanceof FragmentContainerView)) {
            ((FragmentContainerView) H8).setDrawDisappearingViewsLast(!z6);
        }
    }

    public final Q a(C0470v vVar) {
        String str = vVar.f8051G0;
        if (str != null) {
            H0.d.c(vVar, str);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "add: " + vVar);
        }
        Q g8 = g(vVar);
        vVar.f8078n0 = this;
        q qVar = this.f7875c;
        qVar.S(g8);
        if (!vVar.f8085v0) {
            qVar.j(vVar);
            vVar.f8070f0 = false;
            if (vVar.f8045A0 == null) {
                vVar.f8049E0 = false;
            }
            if (L(vVar)) {
                this.f7863G = true;
            }
        }
        return g8;
    }

    public final void a0(C0470v vVar, C0486m mVar) {
        if (!vVar.equals(this.f7875c.A(vVar.f8063Y)) || !(vVar.f8079o0 == null || vVar.f8078n0 == this)) {
            throw new IllegalArgumentException("Fragment " + vVar + " is not an active fragment of FragmentManager " + this);
        }
        vVar.f8052H0 = mVar;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [androidx.fragment.app.v] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(androidx.fragment.app.C0472x r6, F.h r7, androidx.fragment.app.C0470v r8) {
        /*
            r5 = this;
            androidx.fragment.app.x r0 = r5.f7893w
            if (r0 != 0) goto L_0x01c9
            r5.f7893w = r6
            r5.f7894x = r7
            r5.f7895y = r8
            java.util.concurrent.CopyOnWriteArrayList r7 = r5.f7886p
            if (r8 == 0) goto L_0x0017
            androidx.fragment.app.G r0 = new androidx.fragment.app.G
            r0.<init>(r8)
            r7.add(r0)
            goto L_0x001e
        L_0x0017:
            boolean r0 = r6 instanceof androidx.fragment.app.O
            if (r0 == 0) goto L_0x001e
            r7.add(r6)
        L_0x001e:
            androidx.fragment.app.v r7 = r5.f7895y
            if (r7 == 0) goto L_0x0025
            r5.g0()
        L_0x0025:
            boolean r7 = r6 instanceof androidx.activity.v
            if (r7 == 0) goto L_0x003b
            h.j r7 = r6.f8096h0
            androidx.activity.u r7 = r7.i()
            r5.f7878g = r7
            if (r8 == 0) goto L_0x0035
            r0 = r8
            goto L_0x0036
        L_0x0035:
            r0 = r6
        L_0x0036:
            androidx.fragment.app.D r1 = r5.f7880j
            r7.a(r0, r1)
        L_0x003b:
            r7 = 0
            r0 = 1
            if (r8 == 0) goto L_0x005f
            androidx.fragment.app.L r6 = r8.f8078n0
            androidx.fragment.app.N r6 = r6.f7871O
            java.util.HashMap r1 = r6.f7905b
            java.lang.String r2 = r8.f8063Y
            java.lang.Object r2 = r1.get(r2)
            androidx.fragment.app.N r2 = (androidx.fragment.app.N) r2
            if (r2 != 0) goto L_0x005b
            androidx.fragment.app.N r2 = new androidx.fragment.app.N
            boolean r6 = r6.f7907d
            r2.<init>(r6)
            java.lang.String r6 = r8.f8063Y
            r1.put(r6, r2)
        L_0x005b:
            r5.f7871O = r2
            goto L_0x00d7
        L_0x005f:
            boolean r1 = r6 instanceof androidx.lifecycle.P
            if (r1 == 0) goto L_0x00d0
            h.j r6 = r6.f8096h0
            androidx.lifecycle.O r6 = r6.d()
            java.lang.String r1 = "store"
            P6.f.e(r6, r1)
            J0.a r1 = J0.a.f2337b
            java.lang.String r2 = "defaultCreationExtras"
            P6.f.e(r1, r2)
            java.lang.Class<androidx.fragment.app.N> r2 = androidx.fragment.app.N.class
            java.lang.String r3 = r2.getCanonicalName()
            if (r3 == 0) goto L_0x00c8
            java.lang.String r4 = "androidx.lifecycle.ViewModelProvider.DefaultKey:"
            java.lang.String r3 = r4.concat(r3)
            java.lang.String r4 = "key"
            P6.f.e(r3, r4)
            java.util.LinkedHashMap r6 = r6.f8131a
            java.lang.Object r4 = r6.get(r3)
            androidx.lifecycle.M r4 = (androidx.lifecycle.M) r4
            boolean r2 = r2.isInstance(r4)
            if (r2 == 0) goto L_0x009c
            java.lang.String r6 = "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get"
            P6.f.c(r4, r6)
            goto L_0x00c3
        L_0x009c:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.LinkedHashMap r1 = r1.f2338a
            r2.putAll(r1)
            androidx.lifecycle.N r1 = androidx.lifecycle.N.f8130b
            r2.put(r1, r3)
            androidx.fragment.app.N r1 = new androidx.fragment.app.N     // Catch:{ AbstractMethodError -> 0x00b2 }
            r1.<init>(r0)     // Catch:{ AbstractMethodError -> 0x00b2 }
        L_0x00b0:
            r4 = r1
            goto L_0x00b8
        L_0x00b2:
            androidx.fragment.app.N r1 = new androidx.fragment.app.N
            r1.<init>(r0)
            goto L_0x00b0
        L_0x00b8:
            java.lang.Object r6 = r6.put(r3, r4)
            androidx.lifecycle.M r6 = (androidx.lifecycle.M) r6
            if (r6 == 0) goto L_0x00c3
            r6.onCleared()
        L_0x00c3:
            androidx.fragment.app.N r4 = (androidx.fragment.app.N) r4
            r5.f7871O = r4
            goto L_0x00d7
        L_0x00c8:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Local and anonymous classes can not be ViewModels"
            r6.<init>(r7)
            throw r6
        L_0x00d0:
            androidx.fragment.app.N r6 = new androidx.fragment.app.N
            r6.<init>(r7)
            r5.f7871O = r6
        L_0x00d7:
            androidx.fragment.app.N r6 = r5.f7871O
            boolean r1 = r5.f7864H
            if (r1 != 0) goto L_0x00e1
            boolean r1 = r5.f7865I
            if (r1 == 0) goto L_0x00e2
        L_0x00e1:
            r7 = 1
        L_0x00e2:
            r6.f7908f = r7
            B3.q r7 = r5.f7875c
            r7.f452X = r6
            androidx.fragment.app.x r6 = r5.f7893w
            boolean r7 = r6 instanceof b2.C0527f
            if (r7 == 0) goto L_0x0108
            if (r8 != 0) goto L_0x0108
            b2.e r6 = r6.a()
            androidx.activity.e r7 = new androidx.activity.e
            r0 = 2
            r7.<init>(r0, r5)
            java.lang.String r0 = "android:support:fragments"
            r6.e(r0, r7)
            android.os.Bundle r6 = r6.c(r0)
            if (r6 == 0) goto L_0x0108
            r5.W(r6)
        L_0x0108:
            androidx.fragment.app.x r6 = r5.f7893w
            boolean r7 = r6 instanceof androidx.activity.result.h
            if (r7 == 0) goto L_0x0172
            h.j r6 = r6.f8096h0
            if (r8 == 0) goto L_0x0120
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = r8.f8063Y
            java.lang.String r1 = ":"
            java.lang.String r7 = N.e.A(r7, r0, r1)
            goto L_0x0122
        L_0x0120:
            java.lang.String r7 = ""
        L_0x0122:
            java.lang.String r0 = "FragmentManager:"
            java.lang.String r7 = u.C1477r.d(r0, r7)
            java.lang.String r0 = "StartActivityForResult"
            java.lang.String r0 = N.e.x(r7, r0)
            G5.s r1 = new G5.s
            r2 = 3
            r1.<init>(r2)
            androidx.fragment.app.C r2 = new androidx.fragment.app.C
            r3 = 1
            r2.<init>(r5, r3)
            androidx.activity.g r6 = r6.f7297e0
            androidx.activity.result.d r0 = r6.d(r0, r1, r2)
            r5.f7859C = r0
            java.lang.String r0 = "StartIntentSenderForResult"
            java.lang.String r0 = N.e.x(r7, r0)
            G5.s r1 = new G5.s
            r2 = 1
            r1.<init>(r2)
            androidx.fragment.app.C r2 = new androidx.fragment.app.C
            r3 = 2
            r2.<init>(r5, r3)
            androidx.activity.result.d r0 = r6.d(r0, r1, r2)
            r5.f7860D = r0
            java.lang.String r0 = "RequestPermissions"
            java.lang.String r7 = N.e.x(r7, r0)
            G5.s r0 = new G5.s
            r1 = 2
            r0.<init>(r1)
            androidx.fragment.app.C r1 = new androidx.fragment.app.C
            r2 = 0
            r1.<init>(r5, r2)
            androidx.activity.result.d r6 = r6.d(r7, r0, r1)
            r5.f7861E = r6
        L_0x0172:
            androidx.fragment.app.x r6 = r5.f7893w
            boolean r7 = r6 instanceof k0.d
            if (r7 == 0) goto L_0x017f
            h.j r6 = r6.f8096h0
            androidx.fragment.app.B r7 = r5.f7887q
            r6.g(r7)
        L_0x017f:
            androidx.fragment.app.x r6 = r5.f7893w
            boolean r7 = r6 instanceof k0.e
            if (r7 == 0) goto L_0x018e
            h.j r6 = r6.f8096h0
            androidx.fragment.app.B r7 = r5.f7888r
            java.util.concurrent.CopyOnWriteArrayList r6 = r6.f7299g0
            r6.add(r7)
        L_0x018e:
            androidx.fragment.app.x r6 = r5.f7893w
            boolean r7 = r6 instanceof j0.m
            if (r7 == 0) goto L_0x019d
            h.j r6 = r6.f8096h0
            androidx.fragment.app.B r7 = r5.f7889s
            java.util.concurrent.CopyOnWriteArrayList r6 = r6.f7301i0
            r6.add(r7)
        L_0x019d:
            androidx.fragment.app.x r6 = r5.f7893w
            boolean r7 = r6 instanceof j0.n
            if (r7 == 0) goto L_0x01ac
            h.j r6 = r6.f8096h0
            androidx.fragment.app.B r7 = r5.f7890t
            java.util.concurrent.CopyOnWriteArrayList r6 = r6.f7302j0
            r6.add(r7)
        L_0x01ac:
            androidx.fragment.app.x r6 = r5.f7893w
            boolean r7 = r6 instanceof v0.C1537j
            if (r7 == 0) goto L_0x01c8
            if (r8 != 0) goto L_0x01c8
            h.j r6 = r6.f8096h0
            androidx.fragment.app.E r7 = r5.f7891u
            d4.k r6 = r6.f7289W
            java.lang.Object r8 = r6.f9767W
            java.util.concurrent.CopyOnWriteArrayList r8 = (java.util.concurrent.CopyOnWriteArrayList) r8
            r8.add(r7)
            java.lang.Object r6 = r6.f9766V
            java.lang.Runnable r6 = (java.lang.Runnable) r6
            r6.run()
        L_0x01c8:
            return
        L_0x01c9:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Already attached"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.L.b(androidx.fragment.app.x, F.h, androidx.fragment.app.v):void");
    }

    public final void b0(C0470v vVar) {
        if (vVar != null) {
            if (!vVar.equals(this.f7875c.A(vVar.f8063Y)) || !(vVar.f8079o0 == null || vVar.f8078n0 == this)) {
                throw new IllegalArgumentException("Fragment " + vVar + " is not an active fragment of FragmentManager " + this);
            }
        }
        C0470v vVar2 = this.z;
        this.z = vVar;
        r(vVar2);
        r(this.z);
    }

    public final void c(C0470v vVar) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "attach: " + vVar);
        }
        if (vVar.f8085v0) {
            vVar.f8085v0 = false;
            if (!vVar.f8069e0) {
                this.f7875c.j(vVar);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "add from attach: " + vVar);
                }
                if (L(vVar)) {
                    this.f7863G = true;
                }
            }
        }
    }

    public final void c0(C0470v vVar) {
        int i8;
        int i9;
        int i10;
        int i11;
        ViewGroup H8 = H(vVar);
        if (H8 != null) {
            C0469u uVar = vVar.f8048D0;
            boolean z6 = false;
            if (uVar == null) {
                i8 = 0;
            } else {
                i8 = uVar.f8036b;
            }
            if (uVar == null) {
                i9 = 0;
            } else {
                i9 = uVar.f8037c;
            }
            int i12 = i9 + i8;
            if (uVar == null) {
                i10 = 0;
            } else {
                i10 = uVar.f8038d;
            }
            int i13 = i10 + i12;
            if (uVar == null) {
                i11 = 0;
            } else {
                i11 = uVar.e;
            }
            if (i11 + i13 > 0) {
                if (H8.getTag(2131362628) == null) {
                    H8.setTag(2131362628, vVar);
                }
                C0470v vVar2 = (C0470v) H8.getTag(2131362628);
                C0469u uVar2 = vVar.f8048D0;
                if (uVar2 != null) {
                    z6 = uVar2.f8035a;
                }
                if (vVar2.f8048D0 != null) {
                    vVar2.g().f8035a = z6;
                }
            }
        }
    }

    public final void d() {
        this.f7874b = false;
        this.f7869M.clear();
        this.f7868L.clear();
    }

    public final HashSet e() {
        C0462m mVar;
        HashSet hashSet = new HashSet();
        Iterator it = this.f7875c.G().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((Q) it.next()).f7926c.f8089z0;
            if (viewGroup != null) {
                f.e(J(), "factory");
                Object tag = viewGroup.getTag(2131362499);
                if (tag instanceof C0462m) {
                    mVar = (C0462m) tag;
                } else {
                    mVar = new C0462m(viewGroup);
                    viewGroup.setTag(2131362499, mVar);
                }
                hashSet.add(mVar);
            }
        }
        return hashSet;
    }

    public final void e0() {
        Iterator it = this.f7875c.G().iterator();
        while (it.hasNext()) {
            Q q7 = (Q) it.next();
            C0470v vVar = q7.f7926c;
            if (vVar.f8046B0) {
                if (this.f7874b) {
                    this.f7867K = true;
                } else {
                    vVar.f8046B0 = false;
                    q7.k();
                }
            }
        }
    }

    public final HashSet f(ArrayList arrayList, int i8, int i9) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i8 < i9) {
            Iterator it = ((C0450a) arrayList.get(i8)).f7955a.iterator();
            while (it.hasNext()) {
                C0470v vVar = ((S) it.next()).f7929b;
                if (!(vVar == null || (viewGroup = vVar.f8089z0) == null)) {
                    hashSet.add(C0462m.j(viewGroup, this));
                }
            }
            i8++;
        }
        return hashSet;
    }

    public final void f0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new U());
        C0472x xVar = this.f7893w;
        if (xVar != null) {
            try {
                xVar.f8096h0.dump("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e8) {
                Log.e("FragmentManager", "Failed dumping state", e8);
            }
        } else {
            try {
                v("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e9) {
                Log.e("FragmentManager", "Failed dumping state", e9);
            }
        }
        throw illegalStateException;
    }

    public final Q g(C0470v vVar) {
        String str = vVar.f8063Y;
        q qVar = this.f7875c;
        Q q7 = (Q) ((HashMap) qVar.f450V).get(str);
        if (q7 != null) {
            return q7;
        }
        Q q8 = new Q(this.f7885o, qVar, vVar);
        q8.m(this.f7893w.f8093e0.getClassLoader());
        q8.e = this.f7892v;
        return q8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        if (G() <= 0) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004a, code lost:
        if (O(r5.f7895y) == false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
        if (android.util.Log.isLoggable("FragmentManager", 3) == false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0056, code lost:
        android.util.Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + r5 + " enabled state is " + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0071, code lost:
        r0 = r5.f7880j;
        r0.f7838a = r4;
        r0 = r0.f7840c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0077, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0079, code lost:
        r0.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g0() {
        /*
            r5 = this;
            java.lang.String r0 = "FragmentManager "
            java.util.ArrayList r1 = r5.f7873a
            monitor-enter(r1)
            java.util.ArrayList r2 = r5.f7873a     // Catch:{ all -> 0x0039 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0039 }
            r3 = 3
            r4 = 1
            if (r2 != 0) goto L_0x003d
            androidx.fragment.app.D r2 = r5.f7880j     // Catch:{ all -> 0x0039 }
            r2.f7838a = r4     // Catch:{ all -> 0x0039 }
            androidx.activity.t r2 = r2.f7840c     // Catch:{ all -> 0x0039 }
            if (r2 == 0) goto L_0x001a
            r2.invoke()     // Catch:{ all -> 0x0039 }
        L_0x001a:
            java.lang.String r2 = "FragmentManager"
            boolean r2 = android.util.Log.isLoggable(r2, r3)     // Catch:{ all -> 0x0039 }
            if (r2 == 0) goto L_0x003b
            java.lang.String r2 = "FragmentManager"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0039 }
            r3.<init>(r0)     // Catch:{ all -> 0x0039 }
            r3.append(r5)     // Catch:{ all -> 0x0039 }
            java.lang.String r0 = " enabling OnBackPressedCallback, caused by non-empty pending actions"
            r3.append(r0)     // Catch:{ all -> 0x0039 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0039 }
            android.util.Log.d(r2, r0)     // Catch:{ all -> 0x0039 }
            goto L_0x003b
        L_0x0039:
            r0 = move-exception
            goto L_0x007d
        L_0x003b:
            monitor-exit(r1)     // Catch:{ all -> 0x0039 }
            return
        L_0x003d:
            monitor-exit(r1)     // Catch:{ all -> 0x0039 }
            int r0 = r5.G()
            if (r0 <= 0) goto L_0x004d
            androidx.fragment.app.v r0 = r5.f7895y
            boolean r0 = O(r0)
            if (r0 == 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r4 = 0
        L_0x004e:
            java.lang.String r0 = "FragmentManager"
            boolean r0 = android.util.Log.isLoggable(r0, r3)
            if (r0 == 0) goto L_0x0071
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "OnBackPressedCallback for FragmentManager "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r2 = " enabled state is "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r0, r1)
        L_0x0071:
            androidx.fragment.app.D r0 = r5.f7880j
            r0.f7838a = r4
            androidx.activity.t r0 = r0.f7840c
            if (r0 == 0) goto L_0x007c
            r0.invoke()
        L_0x007c:
            return
        L_0x007d:
            monitor-exit(r1)     // Catch:{ all -> 0x0039 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.L.g0():void");
    }

    public final void h(C0470v vVar) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "detach: " + vVar);
        }
        if (!vVar.f8085v0) {
            vVar.f8085v0 = true;
            if (vVar.f8069e0) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "remove from detach: " + vVar);
                }
                q qVar = this.f7875c;
                synchronized (((ArrayList) qVar.f449U)) {
                    ((ArrayList) qVar.f449U).remove(vVar);
                }
                vVar.f8069e0 = false;
                if (L(vVar)) {
                    this.f7863G = true;
                }
                c0(vVar);
            }
        }
    }

    public final void i(boolean z6) {
        if (!z6 || !(this.f7893w instanceof k0.d)) {
            for (C0470v vVar : this.f7875c.J()) {
                if (vVar != null) {
                    vVar.f8088y0 = true;
                    if (z6) {
                        vVar.p0.i(true);
                    }
                }
            }
            return;
        }
        f0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        throw null;
    }

    public final boolean j() {
        boolean z6;
        if (this.f7892v < 1) {
            return false;
        }
        for (C0470v vVar : this.f7875c.J()) {
            if (vVar != null) {
                if (!vVar.f8084u0) {
                    z6 = vVar.p0.j();
                } else {
                    z6 = false;
                }
                if (z6) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean k() {
        boolean z6;
        if (this.f7892v < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z8 = false;
        for (C0470v vVar : this.f7875c.J()) {
            if (vVar != null && N(vVar)) {
                if (!vVar.f8084u0) {
                    z6 = vVar.p0.k();
                } else {
                    z6 = false;
                }
                if (z6) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(vVar);
                    z8 = true;
                }
            }
        }
        if (this.e != null) {
            for (int i8 = 0; i8 < this.e.size(); i8++) {
                C0470v vVar2 = (C0470v) this.e.get(i8);
                if (arrayList == null || !arrayList.contains(vVar2)) {
                    vVar2.getClass();
                }
            }
        }
        this.e = arrayList;
        return z8;
    }

    public final void l() {
        boolean z6 = true;
        this.f7866J = true;
        z(true);
        w();
        C0472x xVar = this.f7893w;
        boolean z8 = xVar instanceof P;
        q qVar = this.f7875c;
        if (z8) {
            z6 = ((N) qVar.f452X).e;
        } else {
            C1022j jVar = xVar.f8093e0;
            if (jVar instanceof Activity) {
                z6 = true ^ jVar.isChangingConfigurations();
            }
        }
        if (z6) {
            for (C0452c cVar : this.f7882l.values()) {
                for (String c8 : cVar.f7987U) {
                    ((N) qVar.f452X).c(c8, false);
                }
            }
        }
        u(-1);
        C0472x xVar2 = this.f7893w;
        if (xVar2 instanceof k0.e) {
            C1022j jVar2 = xVar2.f8096h0;
            jVar2.f7299g0.remove(this.f7888r);
        }
        C0472x xVar3 = this.f7893w;
        if (xVar3 instanceof k0.d) {
            C1022j jVar3 = xVar3.f8096h0;
            jVar3.f7298f0.remove(this.f7887q);
        }
        C0472x xVar4 = this.f7893w;
        if (xVar4 instanceof m) {
            C1022j jVar4 = xVar4.f8096h0;
            jVar4.f7301i0.remove(this.f7889s);
        }
        C0472x xVar5 = this.f7893w;
        if (xVar5 instanceof n) {
            C1022j jVar5 = xVar5.f8096h0;
            jVar5.f7302j0.remove(this.f7890t);
        }
        C0472x xVar6 = this.f7893w;
        if ((xVar6 instanceof C1537j) && this.f7895y == null) {
            C1022j jVar6 = xVar6.f8096h0;
            E e8 = this.f7891u;
            k kVar = jVar6.f7289W;
            ((CopyOnWriteArrayList) kVar.f9767W).remove(e8);
            if (((HashMap) kVar.f9768X).remove(e8) == null) {
                ((Runnable) kVar.f9766V).run();
            } else {
                throw new ClassCastException();
            }
        }
        this.f7893w = null;
        this.f7894x = null;
        this.f7895y = null;
        if (this.f7878g != null) {
            Iterator it = this.f7880j.f7839b.iterator();
            while (it.hasNext()) {
                ((androidx.activity.c) it.next()).cancel();
            }
            this.f7878g = null;
        }
        d dVar = this.f7859C;
        if (dVar != null) {
            dVar.s();
            this.f7860D.s();
            this.f7861E.s();
        }
    }

    public final void m(boolean z6) {
        if (!z6 || !(this.f7893w instanceof k0.e)) {
            for (C0470v vVar : this.f7875c.J()) {
                if (vVar != null) {
                    vVar.f8088y0 = true;
                    if (z6) {
                        vVar.p0.m(true);
                    }
                }
            }
            return;
        }
        f0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        throw null;
    }

    public final void n(boolean z6, boolean z8) {
        if (!z8 || !(this.f7893w instanceof m)) {
            for (C0470v vVar : this.f7875c.J()) {
                if (vVar != null && z8) {
                    vVar.p0.n(z6, true);
                }
            }
            return;
        }
        f0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        throw null;
    }

    public final void o() {
        Iterator it = this.f7875c.H().iterator();
        while (it.hasNext()) {
            C0470v vVar = (C0470v) it.next();
            if (vVar != null) {
                vVar.q();
                vVar.p0.o();
            }
        }
    }

    public final boolean p() {
        boolean z6;
        if (this.f7892v < 1) {
            return false;
        }
        for (C0470v vVar : this.f7875c.J()) {
            if (vVar != null) {
                if (!vVar.f8084u0) {
                    z6 = vVar.p0.p();
                } else {
                    z6 = false;
                }
                if (z6) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void q() {
        if (this.f7892v >= 1) {
            for (C0470v vVar : this.f7875c.J()) {
                if (vVar != null && !vVar.f8084u0) {
                    vVar.p0.q();
                }
            }
        }
    }

    public final void r(C0470v vVar) {
        if (vVar != null) {
            if (vVar.equals(this.f7875c.A(vVar.f8063Y))) {
                vVar.f8078n0.getClass();
                boolean O8 = O(vVar);
                Boolean bool = vVar.f8068d0;
                if (bool == null || bool.booleanValue() != O8) {
                    vVar.f8068d0 = Boolean.valueOf(O8);
                    L l8 = vVar.p0;
                    l8.g0();
                    l8.r(l8.z);
                }
            }
        }
    }

    public final void s(boolean z6, boolean z8) {
        if (!z8 || !(this.f7893w instanceof n)) {
            for (C0470v vVar : this.f7875c.J()) {
                if (vVar != null && z8) {
                    vVar.p0.s(z6, true);
                }
            }
            return;
        }
        f0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        throw null;
    }

    public final boolean t() {
        boolean z6;
        if (this.f7892v < 1) {
            return false;
        }
        boolean z8 = false;
        for (C0470v vVar : this.f7875c.J()) {
            if (vVar != null && N(vVar)) {
                if (!vVar.f8084u0) {
                    z6 = vVar.p0.t();
                } else {
                    z6 = false;
                }
                if (z6) {
                    z8 = true;
                }
            }
        }
        return z8;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C0470v vVar = this.f7895y;
        if (vVar != null) {
            sb.append(vVar.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f7895y)));
            sb.append("}");
        } else {
            C0472x xVar = this.f7893w;
            if (xVar != null) {
                sb.append(xVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f7893w)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* JADX INFO: finally extract failed */
    public final void u(int i8) {
        try {
            this.f7874b = true;
            for (Q q7 : ((HashMap) this.f7875c.f450V).values()) {
                if (q7 != null) {
                    q7.e = i8;
                }
            }
            P(i8, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((C0462m) it.next()).i();
            }
            this.f7874b = false;
            z(true);
        } catch (Throwable th) {
            this.f7874b = false;
            throw th;
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        boolean z6;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        String str2;
        String x8 = N.e.x(str, "    ");
        q qVar = this.f7875c;
        qVar.getClass();
        String str3 = str + "    ";
        HashMap hashMap = (HashMap) qVar.f450V;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (Q q7 : hashMap.values()) {
                printWriter.print(str);
                if (q7 != null) {
                    C0470v vVar = q7.f7926c;
                    printWriter.println(vVar);
                    vVar.getClass();
                    printWriter.print(str3);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(vVar.f8081r0));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(vVar.f8082s0));
                    printWriter.print(" mTag=");
                    printWriter.println(vVar.f8083t0);
                    printWriter.print(str3);
                    printWriter.print("mState=");
                    printWriter.print(vVar.f8059U);
                    printWriter.print(" mWho=");
                    printWriter.print(vVar.f8063Y);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(vVar.f8077m0);
                    printWriter.print(str3);
                    printWriter.print("mAdded=");
                    printWriter.print(vVar.f8069e0);
                    printWriter.print(" mRemoving=");
                    printWriter.print(vVar.f8070f0);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(vVar.f8072h0);
                    printWriter.print(" mInLayout=");
                    printWriter.println(vVar.f8073i0);
                    printWriter.print(str3);
                    printWriter.print("mHidden=");
                    printWriter.print(vVar.f8084u0);
                    printWriter.print(" mDetached=");
                    printWriter.print(vVar.f8085v0);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(vVar.f8087x0);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(str3);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(vVar.f8086w0);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(vVar.f8047C0);
                    if (vVar.f8078n0 != null) {
                        printWriter.print(str3);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(vVar.f8078n0);
                    }
                    if (vVar.f8079o0 != null) {
                        printWriter.print(str3);
                        printWriter.print("mHost=");
                        printWriter.println(vVar.f8079o0);
                    }
                    if (vVar.f8080q0 != null) {
                        printWriter.print(str3);
                        printWriter.print("mParentFragment=");
                        printWriter.println(vVar.f8080q0);
                    }
                    if (vVar.f8064Z != null) {
                        printWriter.print(str3);
                        printWriter.print("mArguments=");
                        printWriter.println(vVar.f8064Z);
                    }
                    if (vVar.f8060V != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(vVar.f8060V);
                    }
                    if (vVar.f8061W != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(vVar.f8061W);
                    }
                    if (vVar.f8062X != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(vVar.f8062X);
                    }
                    C0470v vVar2 = vVar.f8065a0;
                    if (vVar2 == null) {
                        L l8 = vVar.f8078n0;
                        if (l8 == null || (str2 = vVar.f8066b0) == null) {
                            vVar2 = null;
                        } else {
                            vVar2 = l8.f7875c.A(str2);
                        }
                    }
                    if (vVar2 != null) {
                        printWriter.print(str3);
                        printWriter.print("mTarget=");
                        printWriter.print(vVar2);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(vVar.f8067c0);
                    }
                    printWriter.print(str3);
                    printWriter.print("mPopDirection=");
                    C0469u uVar = vVar.f8048D0;
                    if (uVar == null) {
                        z6 = false;
                    } else {
                        z6 = uVar.f8035a;
                    }
                    printWriter.println(z6);
                    C0469u uVar2 = vVar.f8048D0;
                    if (uVar2 == null) {
                        i8 = 0;
                    } else {
                        i8 = uVar2.f8036b;
                    }
                    if (i8 != 0) {
                        printWriter.print(str3);
                        printWriter.print("getEnterAnim=");
                        C0469u uVar3 = vVar.f8048D0;
                        if (uVar3 == null) {
                            i15 = 0;
                        } else {
                            i15 = uVar3.f8036b;
                        }
                        printWriter.println(i15);
                    }
                    C0469u uVar4 = vVar.f8048D0;
                    if (uVar4 == null) {
                        i9 = 0;
                    } else {
                        i9 = uVar4.f8037c;
                    }
                    if (i9 != 0) {
                        printWriter.print(str3);
                        printWriter.print("getExitAnim=");
                        C0469u uVar5 = vVar.f8048D0;
                        if (uVar5 == null) {
                            i14 = 0;
                        } else {
                            i14 = uVar5.f8037c;
                        }
                        printWriter.println(i14);
                    }
                    C0469u uVar6 = vVar.f8048D0;
                    if (uVar6 == null) {
                        i10 = 0;
                    } else {
                        i10 = uVar6.f8038d;
                    }
                    if (i10 != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopEnterAnim=");
                        C0469u uVar7 = vVar.f8048D0;
                        if (uVar7 == null) {
                            i13 = 0;
                        } else {
                            i13 = uVar7.f8038d;
                        }
                        printWriter.println(i13);
                    }
                    C0469u uVar8 = vVar.f8048D0;
                    if (uVar8 == null) {
                        i11 = 0;
                    } else {
                        i11 = uVar8.e;
                    }
                    if (i11 != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopExitAnim=");
                        C0469u uVar9 = vVar.f8048D0;
                        if (uVar9 == null) {
                            i12 = 0;
                        } else {
                            i12 = uVar9.e;
                        }
                        printWriter.println(i12);
                    }
                    if (vVar.f8089z0 != null) {
                        printWriter.print(str3);
                        printWriter.print("mContainer=");
                        printWriter.println(vVar.f8089z0);
                    }
                    if (vVar.f8045A0 != null) {
                        printWriter.print(str3);
                        printWriter.print("mView=");
                        printWriter.println(vVar.f8045A0);
                    }
                    if (vVar.j() != null) {
                        new A1.d((r) vVar, vVar.d()).o(str3, printWriter);
                    }
                    printWriter.print(str3);
                    printWriter.println("Child " + vVar.p0 + ":");
                    vVar.p0.v(N.e.x(str3, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = (ArrayList) qVar.f449U;
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i16 = 0; i16 < size2; i16++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i16);
                printWriter.print(": ");
                printWriter.println(((C0470v) arrayList.get(i16)).toString());
            }
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i17 = 0; i17 < size; i17++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i17);
                printWriter.print(": ");
                printWriter.println(((C0470v) this.e.get(i17)).toString());
            }
        }
        int size3 = this.f7876d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i18 = 0; i18 < size3; i18++) {
                C0450a aVar = (C0450a) this.f7876d.get(i18);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i18);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.g(x8, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f7881k.get());
        synchronized (this.f7873a) {
            try {
                int size4 = this.f7873a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i19 = 0; i19 < size4; i19++) {
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i19);
                        printWriter.print(": ");
                        printWriter.println((I) this.f7873a.get(i19));
                    }
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f7893w);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f7894x);
        if (this.f7895y != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f7895y);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f7892v);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f7864H);
        printWriter.print(" mStopped=");
        printWriter.print(this.f7865I);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f7866J);
        if (this.f7863G) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f7863G);
        }
    }

    public final void w() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((C0462m) it.next()).i();
        }
    }

    public final void x(I i8, boolean z6) {
        if (!z6) {
            if (this.f7893w == null) {
                if (this.f7866J) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (this.f7864H || this.f7865I) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f7873a) {
            try {
                if (this.f7893w != null) {
                    this.f7873a.add(i8);
                    Y();
                } else if (!z6) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void y(boolean z6) {
        if (this.f7874b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f7893w == null) {
            if (this.f7866J) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() != this.f7893w.f8094f0.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        } else if (!z6 && (this.f7864H || this.f7865I)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else if (this.f7868L == null) {
            this.f7868L = new ArrayList();
            this.f7869M = new ArrayList();
        }
    }

    public final boolean z(boolean z6) {
        boolean z8;
        C0450a aVar;
        y(z6);
        if (!this.i && (aVar = this.f7879h) != null) {
            aVar.f7971s = false;
            aVar.d();
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f7879h + " as part of execPendingActions for actions " + this.f7873a);
            }
            this.f7879h.e(false, false);
            this.f7873a.add(0, this.f7879h);
            Iterator it = this.f7879h.f7955a.iterator();
            while (it.hasNext()) {
                C0470v vVar = ((S) it.next()).f7929b;
                if (vVar != null) {
                    vVar.f8071g0 = false;
                }
            }
            this.f7879h = null;
        }
        boolean z9 = false;
        while (true) {
            ArrayList arrayList = this.f7868L;
            ArrayList arrayList2 = this.f7869M;
            synchronized (this.f7873a) {
                if (this.f7873a.isEmpty()) {
                    z8 = false;
                } else {
                    try {
                        int size = this.f7873a.size();
                        z8 = false;
                        for (int i8 = 0; i8 < size; i8++) {
                            z8 |= ((I) this.f7873a.get(i8)).a(arrayList, arrayList2);
                        }
                    } finally {
                        this.f7873a.clear();
                        this.f7893w.f8094f0.removeCallbacks(this.f7872P);
                    }
                }
            }
            if (z8) {
                z9 = true;
                this.f7874b = true;
                try {
                    V(this.f7868L, this.f7869M);
                } finally {
                    d();
                }
            } else {
                g0();
                if (this.f7867K) {
                    this.f7867K = false;
                    e0();
                }
                ((HashMap) this.f7875c.f450V).values().removeAll(Collections.singleton((Object) null));
                return z9;
            }
        }
    }
}
