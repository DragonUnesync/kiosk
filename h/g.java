package H;

import A.f;
import A.h;
import B.C0011l;
import B.C0022x;
import B.E;
import B.P;
import B.T;
import B.Z;
import B.f0;
import B.v0;
import D.C0032a;
import D.C0036c;
import D.C0038d;
import D.C0041e0;
import D.C0048i;
import D.C0050j;
import D.C0053k0;
import D.C0059n0;
import D.C0065t;
import D.C0068w;
import D.C0069x;
import D.C0071z;
import D.K;
import D.L0;
import D.N0;
import D.O0;
import D.U;
import D.V;
import D.W;
import D.X;
import D.w0;
import D6.r;
import D7.b;
import K1.k;
import N.e;
import Q.d;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import de.ozerov.fully.K2;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import n2.a;
import u.C1441A;
import u.C1459T;
import u.C1477r;

public final class g implements C0011l {

    /* renamed from: U  reason: collision with root package name */
    public final C0071z f1771U;

    /* renamed from: V  reason: collision with root package name */
    public final C0071z f1772V;

    /* renamed from: W  reason: collision with root package name */
    public final K2 f1773W;

    /* renamed from: X  reason: collision with root package name */
    public final C1441A f1774X;

    /* renamed from: Y  reason: collision with root package name */
    public final a f1775Y;

    /* renamed from: Z  reason: collision with root package name */
    public final ArrayList f1776Z = new ArrayList();

    /* renamed from: a0  reason: collision with root package name */
    public final ArrayList f1777a0 = new ArrayList();

    /* renamed from: b0  reason: collision with root package name */
    public final k f1778b0;

    /* renamed from: c0  reason: collision with root package name */
    public List f1779c0 = Collections.emptyList();

    /* renamed from: d0  reason: collision with root package name */
    public final f f1780d0;

    /* renamed from: e0  reason: collision with root package name */
    public final Object f1781e0 = new Object();

    /* renamed from: f0  reason: collision with root package name */
    public boolean f1782f0 = true;

    /* renamed from: g0  reason: collision with root package name */
    public K f1783g0 = null;

    /* renamed from: h0  reason: collision with root package name */
    public v0 f1784h0;

    /* renamed from: i0  reason: collision with root package name */
    public d f1785i0;

    /* renamed from: j0  reason: collision with root package name */
    public final w0 f1786j0;

    /* renamed from: k0  reason: collision with root package name */
    public final w0 f1787k0;

    /* renamed from: l0  reason: collision with root package name */
    public final Z f1788l0;

    /* renamed from: m0  reason: collision with root package name */
    public final Z f1789m0;

    public g(C0071z zVar, C0071z zVar2, w0 w0Var, w0 w0Var2, k kVar, K2 k22, C1441A a8) {
        Z z = Z.f207a;
        this.f1771U = zVar;
        this.f1772V = zVar2;
        this.f1788l0 = z;
        this.f1789m0 = z;
        this.f1778b0 = kVar;
        this.f1773W = k22;
        this.f1774X = a8;
        f fVar = w0Var.f957c;
        this.f1780d0 = fVar;
        fVar.V();
        this.f1786j0 = w0Var;
        this.f1787k0 = w0Var2;
        this.f1775Y = w(w0Var, w0Var2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean C(D.C0048i r4, D.C0 r5) {
        /*
            D.I r0 = r5.f752g
            D.k0 r0 = r0.f789b
            t.a r4 = r4.f907d
            r4.getClass()
            java.util.Set r1 = N.e.n(r4)
            int r1 = r1.size()
            D.I r5 = r5.f752g
            D.k0 r5 = r5.f789b
            java.util.Set r5 = r5.J()
            int r5 = r5.size()
            r2 = 1
            if (r1 == r5) goto L_0x0021
            return r2
        L_0x0021:
            java.util.Set r5 = N.e.n(r4)
            java.util.Iterator r5 = r5.iterator()
        L_0x0029:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x004c
            java.lang.Object r1 = r5.next()
            D.c r1 = (D.C0036c) r1
            java.util.TreeMap r3 = r0.f920U
            boolean r3 = r3.containsKey(r1)
            if (r3 == 0) goto L_0x004b
            java.lang.Object r3 = r0.b0(r1)
            java.lang.Object r1 = N.e.p(r4, r1)
            boolean r1 = j$.util.Objects.equals(r3, r1)
            if (r1 != 0) goto L_0x0029
        L_0x004b:
            return r2
        L_0x004c:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: H.g.C(D.i, D.C0):boolean");
    }

    public static ArrayList H(List list, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(list);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((v0) it.next()).getClass();
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                throw Q0.g.k(it2);
            }
        }
        return arrayList2;
    }

    public static Matrix q(Rect rect, Size size) {
        boolean z;
        if (rect.width() <= 0 || rect.height() <= 0) {
            z = false;
        } else {
            z = true;
        }
        a.h("Cannot compute viewport crop rects zero sized sensor rect.", z);
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, (float) size.getWidth(), (float) size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    public static T t() {
        Object obj;
        Object obj2;
        Object obj3;
        E e = new E(1);
        C0036c cVar = l.f1802E;
        C0041e0 e0Var = e.f145b;
        e0Var.e(cVar, "ImageCapture-Extra");
        C0036c cVar2 = U.f856X;
        e0Var.getClass();
        Object obj4 = null;
        try {
            obj = e0Var.b0(cVar2);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num != null) {
            e0Var.e(V.f864g, num);
        } else {
            P p3 = T.f195x;
            try {
                obj3 = e0Var.b0(U.f857Y);
            } catch (IllegalArgumentException unused2) {
                obj3 = null;
            }
            if (Objects.equals(obj3, 1)) {
                e0Var.e(V.f864g, 4101);
                e0Var.e(V.f865h, C0022x.f359c);
            } else {
                e0Var.e(V.f864g, 256);
            }
        }
        U u3 = new U(C0053k0.a(e0Var));
        W.e(u3);
        T t8 = new T(u3);
        try {
            obj2 = e0Var.b0(X.f870m);
        } catch (IllegalArgumentException unused3) {
            obj2 = null;
        }
        Size size = (Size) obj2;
        if (size != null) {
            new Rational(size.getWidth(), size.getHeight());
        }
        C0036c cVar3 = h.f1790D;
        Object z = b.z();
        try {
            z = e0Var.b0(cVar3);
        } catch (IllegalArgumentException unused4) {
        }
        a.l((Executor) z, "The IO executor can't be null");
        C0036c cVar4 = U.f855W;
        if (e0Var.f920U.containsKey(cVar4)) {
            Integer num2 = (Integer) e0Var.b0(cVar4);
            if (num2 == null || !(num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
                throw new IllegalArgumentException("The flash mode is not allowed to set: " + num2);
            } else if (num2.intValue() == 3) {
                try {
                    obj4 = e0Var.b0(U.f861c0);
                } catch (IllegalArgumentException unused5) {
                }
                if (obj4 == null) {
                    throw new IllegalArgumentException("The flash mode is not allowed to set to FLASH_MODE_SCREEN without setting ScreenFlash");
                }
            }
        }
        return t8;
    }

    public static a w(w0 w0Var, w0 w0Var2) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(w0Var.f846a.e());
        if (w0Var2 == null) {
            str = "";
        } else {
            str = w0Var2.f846a.e();
        }
        sb.append(str);
        return new a(sb.toString(), (C0038d) w0Var.f957c.f17V);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [H.f, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v4, types: [B.v0, B.f0] */
    public static HashMap y(ArrayList arrayList, O0 o02, C1441A a8) {
        L0 l02;
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v0 v0Var = (v0) it.next();
            if (v0Var instanceof d) {
                d dVar = (d) v0Var;
                C0059n0 n0Var = new C0059n0(C0053k0.a(new E(2).f145b));
                W.e(n0Var);
                ? v0Var2 = new v0(n0Var);
                v0Var2.f240p = f0.f238w;
                L0 e = v0Var2.e(false, o02);
                if (e == null) {
                    l02 = null;
                } else {
                    C0041e0 c8 = C0041e0.c(e);
                    c8.f920U.remove(l.f1803F);
                    l02 = ((h) dVar.j(c8)).b();
                }
            } else {
                l02 = v0Var.e(false, o02);
            }
            L0 e8 = v0Var.e(true, a8);
            ? obj = new Object();
            obj.f1769a = l02;
            obj.f1770b = e8;
            hashMap.put(v0Var, obj);
        }
        return hashMap;
    }

    public final List A() {
        ArrayList arrayList;
        synchronized (this.f1781e0) {
            arrayList = new ArrayList(this.f1776Z);
        }
        return arrayList;
    }

    public final void B() {
        synchronized (this.f1781e0) {
            this.f1780d0.V();
        }
    }

    public final boolean D() {
        boolean z;
        synchronized (this.f1781e0) {
            f fVar = this.f1780d0;
            fVar.getClass();
            z = false;
            if (((Integer) ((C0053k0) fVar.x()).o0(C0065t.f951b, 0)).intValue() == 1) {
                z = true;
            }
        }
        return z;
    }

    public final void E(ArrayList arrayList) {
        boolean z;
        synchronized (this.f1781e0) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.f1776Z);
            linkedHashSet.removeAll(arrayList);
            C0071z zVar = this.f1772V;
            boolean z6 = false;
            if (zVar != null) {
                z = true;
            } else {
                z = false;
            }
            if (zVar != null) {
                z6 = true;
            }
            J(linkedHashSet, z, z6);
        }
    }

    public final void F() {
        synchronized (this.f1781e0) {
            try {
                if (this.f1783g0 != null) {
                    this.f1771U.m().j(this.f1783g0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void G() {
        r rVar = r.f1269U;
        synchronized (this.f1781e0) {
            this.f1779c0 = rVar;
        }
    }

    public final void I() {
        synchronized (this.f1781e0) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0131, code lost:
        r4 = (D.C0048i) r0.get(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void J(java.util.LinkedHashSet r19, boolean r20, boolean r21) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            java.lang.Object r9 = r7.f1781e0
            monitor-enter(r9)
            r18.s(r19)     // Catch:{ all -> 0x009d }
            if (r20 != 0) goto L_0x000f
            r18.B()     // Catch:{ all -> 0x009d }
        L_0x000f:
            Q.d r0 = r18.u(r19, r20)     // Catch:{ all -> 0x009d }
            B.v0 r10 = r7.p(r8, r0)     // Catch:{ all -> 0x009d }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x009d }
            r11.<init>(r8)     // Catch:{ all -> 0x009d }
            if (r10 == 0) goto L_0x0021
            r11.add(r10)     // Catch:{ all -> 0x009d }
        L_0x0021:
            if (r0 == 0) goto L_0x002d
            r11.add(r0)     // Catch:{ all -> 0x009d }
            Q.g r1 = r0.f3975p     // Catch:{ all -> 0x009d }
            java.util.HashSet r1 = r1.f3991U     // Catch:{ all -> 0x009d }
            r11.removeAll(r1)     // Catch:{ all -> 0x009d }
        L_0x002d:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x009d }
            r12.<init>(r11)     // Catch:{ all -> 0x009d }
            java.util.ArrayList r1 = r7.f1777a0     // Catch:{ all -> 0x009d }
            r12.removeAll(r1)     // Catch:{ all -> 0x009d }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x009d }
            r13.<init>(r11)     // Catch:{ all -> 0x009d }
            java.util.ArrayList r1 = r7.f1777a0     // Catch:{ all -> 0x009d }
            r13.retainAll(r1)     // Catch:{ all -> 0x009d }
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x009d }
            java.util.ArrayList r1 = r7.f1777a0     // Catch:{ all -> 0x009d }
            r14.<init>(r1)     // Catch:{ all -> 0x009d }
            r14.removeAll(r11)     // Catch:{ all -> 0x009d }
            A.f r1 = r7.f1780d0     // Catch:{ all -> 0x009d }
            r1.getClass()     // Catch:{ all -> 0x009d }
            D.M0 r2 = D.O0.f841a     // Catch:{ all -> 0x009d }
            D.c r3 = D.C0065t.f950a     // Catch:{ all -> 0x009d }
            D.K r1 = r1.x()     // Catch:{ all -> 0x009d }
            D.k0 r1 = (D.C0053k0) r1     // Catch:{ all -> 0x009d }
            java.lang.Object r1 = r1.o0(r3, r2)     // Catch:{ all -> 0x009d }
            D.O0 r1 = (D.O0) r1     // Catch:{ all -> 0x009d }
            u.A r2 = r7.f1774X     // Catch:{ all -> 0x009d }
            java.util.HashMap r15 = y(r12, r1, r2)     // Catch:{ all -> 0x009d }
            java.util.Map r16 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x009d }
            int r2 = r18.x()     // Catch:{ IllegalArgumentException -> 0x00a0 }
            D.z r1 = r7.f1771U     // Catch:{ IllegalArgumentException -> 0x00a0 }
            D.x r3 = r1.l()     // Catch:{ IllegalArgumentException -> 0x00a0 }
            r1 = r18
            r4 = r12
            r5 = r13
            r6 = r15
            java.util.HashMap r6 = r1.r(r2, r3, r4, r5, r6)     // Catch:{ IllegalArgumentException -> 0x00a0 }
            D.z r1 = r7.f1772V     // Catch:{ IllegalArgumentException -> 0x00a0 }
            if (r1 == 0) goto L_0x00a3
            int r2 = r18.x()     // Catch:{ IllegalArgumentException -> 0x00a0 }
            D.z r1 = r7.f1772V     // Catch:{ IllegalArgumentException -> 0x00a0 }
            j$.util.Objects.requireNonNull(r1)     // Catch:{ IllegalArgumentException -> 0x00a0 }
            D.x r3 = r1.l()     // Catch:{ IllegalArgumentException -> 0x00a0 }
            r1 = r18
            r4 = r12
            r5 = r13
            r17 = r0
            r0 = r6
            r6 = r15
            java.util.HashMap r16 = r1.r(r2, r3, r4, r5, r6)     // Catch:{ IllegalArgumentException -> 0x00a0 }
        L_0x009a:
            r1 = r16
            goto L_0x00a7
        L_0x009d:
            r0 = move-exception
            goto L_0x0205
        L_0x00a0:
            r0 = move-exception
            goto L_0x01f0
        L_0x00a3:
            r17 = r0
            r0 = r6
            goto L_0x009a
        L_0x00a7:
            r7.K(r0, r11)     // Catch:{ all -> 0x009d }
            java.util.List r2 = r7.f1779c0     // Catch:{ all -> 0x009d }
            java.util.ArrayList r2 = H(r2, r11)     // Catch:{ all -> 0x009d }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x009d }
            r3.<init>(r8)     // Catch:{ all -> 0x009d }
            r3.removeAll(r11)     // Catch:{ all -> 0x009d }
            java.util.ArrayList r2 = H(r2, r3)     // Catch:{ all -> 0x009d }
            int r3 = r2.size()     // Catch:{ all -> 0x009d }
            if (r3 <= 0) goto L_0x00d5
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x009d }
            java.lang.String r4 = "Unused effects: "
            r3.<init>(r4)     // Catch:{ all -> 0x009d }
            r3.append(r2)     // Catch:{ all -> 0x009d }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x009d }
            java.lang.String r3 = "CameraUseCaseAdapter"
            F.h.I(r3, r2)     // Catch:{ all -> 0x009d }
        L_0x00d5:
            java.util.Iterator r2 = r14.iterator()     // Catch:{ all -> 0x009d }
        L_0x00d9:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x009d }
            if (r3 == 0) goto L_0x00eb
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x009d }
            B.v0 r3 = (B.v0) r3     // Catch:{ all -> 0x009d }
            D.z r4 = r7.f1771U     // Catch:{ all -> 0x009d }
            r3.A(r4)     // Catch:{ all -> 0x009d }
            goto L_0x00d9
        L_0x00eb:
            D.z r2 = r7.f1771U     // Catch:{ all -> 0x009d }
            r2.g(r14)     // Catch:{ all -> 0x009d }
            D.z r2 = r7.f1772V     // Catch:{ all -> 0x009d }
            if (r2 == 0) goto L_0x0115
            java.util.Iterator r2 = r14.iterator()     // Catch:{ all -> 0x009d }
        L_0x00f8:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x009d }
            if (r3 == 0) goto L_0x010d
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x009d }
            B.v0 r3 = (B.v0) r3     // Catch:{ all -> 0x009d }
            D.z r4 = r7.f1772V     // Catch:{ all -> 0x009d }
            j$.util.Objects.requireNonNull(r4)     // Catch:{ all -> 0x009d }
            r3.A(r4)     // Catch:{ all -> 0x009d }
            goto L_0x00f8
        L_0x010d:
            D.z r2 = r7.f1772V     // Catch:{ all -> 0x009d }
            j$.util.Objects.requireNonNull(r2)     // Catch:{ all -> 0x009d }
            r2.g(r14)     // Catch:{ all -> 0x009d }
        L_0x0115:
            boolean r2 = r14.isEmpty()     // Catch:{ all -> 0x009d }
            if (r2 == 0) goto L_0x015a
            java.util.Iterator r2 = r13.iterator()     // Catch:{ all -> 0x009d }
        L_0x011f:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x009d }
            if (r3 == 0) goto L_0x015a
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x009d }
            B.v0 r3 = (B.v0) r3     // Catch:{ all -> 0x009d }
            boolean r4 = r0.containsKey(r3)     // Catch:{ all -> 0x009d }
            if (r4 == 0) goto L_0x011f
            java.lang.Object r4 = r0.get(r3)     // Catch:{ all -> 0x009d }
            D.i r4 = (D.C0048i) r4     // Catch:{ all -> 0x009d }
            t.a r5 = r4.f907d     // Catch:{ all -> 0x009d }
            if (r5 == 0) goto L_0x011f
            D.C0 r6 = r3.f346m     // Catch:{ all -> 0x009d }
            boolean r4 = C(r4, r6)     // Catch:{ all -> 0x009d }
            if (r4 == 0) goto L_0x011f
            D.i r4 = r3.u(r5)     // Catch:{ all -> 0x009d }
            r3.f341g = r4     // Catch:{ all -> 0x009d }
            boolean r4 = r7.f1782f0     // Catch:{ all -> 0x009d }
            if (r4 == 0) goto L_0x011f
            D.z r4 = r7.f1771U     // Catch:{ all -> 0x009d }
            r4.i(r3)     // Catch:{ all -> 0x009d }
            D.z r4 = r7.f1772V     // Catch:{ all -> 0x009d }
            if (r4 == 0) goto L_0x011f
            r4.i(r3)     // Catch:{ all -> 0x009d }
            goto L_0x011f
        L_0x015a:
            java.util.Iterator r2 = r12.iterator()     // Catch:{ all -> 0x009d }
        L_0x015e:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x009d }
            if (r3 == 0) goto L_0x01b0
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x009d }
            B.v0 r3 = (B.v0) r3     // Catch:{ all -> 0x009d }
            java.lang.Object r4 = r15.get(r3)     // Catch:{ all -> 0x009d }
            H.f r4 = (H.f) r4     // Catch:{ all -> 0x009d }
            j$.util.Objects.requireNonNull(r4)     // Catch:{ all -> 0x009d }
            D.z r5 = r7.f1772V     // Catch:{ all -> 0x009d }
            if (r5 == 0) goto L_0x0196
            D.z r6 = r7.f1771U     // Catch:{ all -> 0x009d }
            D.L0 r13 = r4.f1769a     // Catch:{ all -> 0x009d }
            D.L0 r4 = r4.f1770b     // Catch:{ all -> 0x009d }
            r3.a(r6, r5, r13, r4)     // Catch:{ all -> 0x009d }
            java.lang.Object r4 = r0.get(r3)     // Catch:{ all -> 0x009d }
            D.i r4 = (D.C0048i) r4     // Catch:{ all -> 0x009d }
            r4.getClass()     // Catch:{ all -> 0x009d }
            java.lang.Object r5 = r1.get(r3)     // Catch:{ all -> 0x009d }
            D.i r5 = (D.C0048i) r5     // Catch:{ all -> 0x009d }
            D.i r4 = r3.v(r4, r5)     // Catch:{ all -> 0x009d }
            r3.f341g = r4     // Catch:{ all -> 0x009d }
            goto L_0x015e
        L_0x0196:
            D.z r5 = r7.f1771U     // Catch:{ all -> 0x009d }
            D.L0 r6 = r4.f1769a     // Catch:{ all -> 0x009d }
            D.L0 r4 = r4.f1770b     // Catch:{ all -> 0x009d }
            r13 = 0
            r3.a(r5, r13, r6, r4)     // Catch:{ all -> 0x009d }
            java.lang.Object r4 = r0.get(r3)     // Catch:{ all -> 0x009d }
            D.i r4 = (D.C0048i) r4     // Catch:{ all -> 0x009d }
            r4.getClass()     // Catch:{ all -> 0x009d }
            D.i r4 = r3.v(r4, r13)     // Catch:{ all -> 0x009d }
            r3.f341g = r4     // Catch:{ all -> 0x009d }
            goto L_0x015e
        L_0x01b0:
            boolean r0 = r7.f1782f0     // Catch:{ all -> 0x009d }
            if (r0 == 0) goto L_0x01c0
            D.z r0 = r7.f1771U     // Catch:{ all -> 0x009d }
            r0.h(r12)     // Catch:{ all -> 0x009d }
            D.z r0 = r7.f1772V     // Catch:{ all -> 0x009d }
            if (r0 == 0) goto L_0x01c0
            r0.h(r12)     // Catch:{ all -> 0x009d }
        L_0x01c0:
            java.util.Iterator r0 = r12.iterator()     // Catch:{ all -> 0x009d }
        L_0x01c4:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x009d }
            if (r1 == 0) goto L_0x01d4
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x009d }
            B.v0 r1 = (B.v0) r1     // Catch:{ all -> 0x009d }
            r1.o()     // Catch:{ all -> 0x009d }
            goto L_0x01c4
        L_0x01d4:
            java.util.ArrayList r0 = r7.f1776Z     // Catch:{ all -> 0x009d }
            r0.clear()     // Catch:{ all -> 0x009d }
            java.util.ArrayList r0 = r7.f1776Z     // Catch:{ all -> 0x009d }
            r0.addAll(r8)     // Catch:{ all -> 0x009d }
            java.util.ArrayList r0 = r7.f1777a0     // Catch:{ all -> 0x009d }
            r0.clear()     // Catch:{ all -> 0x009d }
            java.util.ArrayList r0 = r7.f1777a0     // Catch:{ all -> 0x009d }
            r0.addAll(r11)     // Catch:{ all -> 0x009d }
            r7.f1784h0 = r10     // Catch:{ all -> 0x009d }
            r0 = r17
            r7.f1785i0 = r0     // Catch:{ all -> 0x009d }
            monitor-exit(r9)     // Catch:{ all -> 0x009d }
            return
        L_0x01f0:
            if (r20 != 0) goto L_0x0204
            r18.B()     // Catch:{ all -> 0x009d }
            K1.k r1 = r7.f1778b0     // Catch:{ all -> 0x009d }
            int r1 = r1.f2580U     // Catch:{ all -> 0x009d }
            r2 = 2
            if (r1 == r2) goto L_0x0204
            r0 = 1
            r1 = r21
            r7.J(r8, r0, r1)     // Catch:{ all -> 0x009d }
            monitor-exit(r9)     // Catch:{ all -> 0x009d }
            return
        L_0x0204:
            throw r0     // Catch:{ all -> 0x009d }
        L_0x0205:
            monitor-exit(r9)     // Catch:{ all -> 0x009d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: H.g.J(java.util.LinkedHashSet, boolean, boolean):void");
    }

    public final void K(HashMap hashMap, ArrayList arrayList) {
        synchronized (this.f1781e0) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    v0 v0Var = (v0) it.next();
                    Rect O8 = this.f1771U.m().O();
                    C0048i iVar = (C0048i) hashMap.get(v0Var);
                    iVar.getClass();
                    v0Var.x(q(O8, iVar.f904a));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C0069x a() {
        return this.f1786j0;
    }

    public final void c(List list) {
        boolean z;
        synchronized (this.f1781e0) {
            try {
                this.f1771U.o(this.f1780d0);
                C0071z zVar = this.f1772V;
                if (zVar != null) {
                    zVar.o(this.f1780d0);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.f1776Z);
                linkedHashSet.addAll(list);
                C0071z zVar2 = this.f1772V;
                boolean z6 = false;
                if (zVar2 != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (zVar2 != null) {
                    z6 = true;
                }
                J(linkedHashSet, z, z6);
            } catch (IllegalArgumentException e) {
                throw new Exception(e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        synchronized (this.f1781e0) {
            try {
                if (!this.f1782f0) {
                    if (!this.f1777a0.isEmpty()) {
                        this.f1771U.o(this.f1780d0);
                        C0071z zVar = this.f1772V;
                        if (zVar != null) {
                            zVar.o(this.f1780d0);
                        }
                    }
                    this.f1771U.h(this.f1777a0);
                    C0071z zVar2 = this.f1772V;
                    if (zVar2 != null) {
                        zVar2.h(this.f1777a0);
                    }
                    F();
                    Iterator it = this.f1777a0.iterator();
                    while (it.hasNext()) {
                        ((v0) it.next()).o();
                    }
                    this.f1782f0 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i() {
        synchronized (this.f1781e0) {
            C0068w m8 = this.f1771U.m();
            this.f1783g0 = m8.f();
            m8.D();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: B.T} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: B.T} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: B.T} */
    /* JADX WARNING: type inference failed for: r8v13, types: [B.v0, B.f0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final B.v0 p(java.util.LinkedHashSet r8, Q.d r9) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f1781e0
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0015 }
            r1.<init>(r8)     // Catch:{ all -> 0x0015 }
            if (r9 == 0) goto L_0x0018
            r1.add(r9)     // Catch:{ all -> 0x0015 }
            Q.g r8 = r9.f3975p     // Catch:{ all -> 0x0015 }
            java.util.HashSet r8 = r8.f3991U     // Catch:{ all -> 0x0015 }
            r1.removeAll(r8)     // Catch:{ all -> 0x0015 }
            goto L_0x0018
        L_0x0015:
            r8 = move-exception
            goto L_0x00b3
        L_0x0018:
            boolean r8 = r7.D()     // Catch:{ all -> 0x0015 }
            if (r8 == 0) goto L_0x00b0
            java.util.Iterator r8 = r1.iterator()     // Catch:{ all -> 0x0015 }
            r9 = 0
            r2 = 0
            r3 = 0
        L_0x0025:
            boolean r4 = r8.hasNext()     // Catch:{ all -> 0x0015 }
            r5 = 1
            if (r4 == 0) goto L_0x0043
            java.lang.Object r4 = r8.next()     // Catch:{ all -> 0x0015 }
            B.v0 r4 = (B.v0) r4     // Catch:{ all -> 0x0015 }
            boolean r6 = r4 instanceof B.f0     // Catch:{ all -> 0x0015 }
            if (r6 != 0) goto L_0x0041
            boolean r6 = r4 instanceof Q.d     // Catch:{ all -> 0x0015 }
            if (r6 == 0) goto L_0x003b
            goto L_0x0041
        L_0x003b:
            boolean r4 = r4 instanceof B.T     // Catch:{ all -> 0x0015 }
            if (r4 == 0) goto L_0x0025
            r2 = 1
            goto L_0x0025
        L_0x0041:
            r3 = 1
            goto L_0x0025
        L_0x0043:
            if (r2 == 0) goto L_0x007e
            if (r3 != 0) goto L_0x007e
            B.v0 r8 = r7.f1784h0     // Catch:{ all -> 0x0015 }
            boolean r9 = r8 instanceof B.f0     // Catch:{ all -> 0x0015 }
            if (r9 == 0) goto L_0x004e
            goto L_0x00b1
        L_0x004e:
            B.E r8 = new B.E     // Catch:{ all -> 0x0015 }
            r9 = 2
            r8.<init>(r9)     // Catch:{ all -> 0x0015 }
            java.lang.String r9 = "Preview-Extra"
            D.c r1 = H.l.f1802E     // Catch:{ all -> 0x0015 }
            D.e0 r2 = r8.f145b     // Catch:{ all -> 0x0015 }
            r2.e(r1, r9)     // Catch:{ all -> 0x0015 }
            D.n0 r9 = new D.n0     // Catch:{ all -> 0x0015 }
            D.e0 r8 = r8.f145b     // Catch:{ all -> 0x0015 }
            D.k0 r8 = D.C0053k0.a(r8)     // Catch:{ all -> 0x0015 }
            r9.<init>(r8)     // Catch:{ all -> 0x0015 }
            D.W.e(r9)     // Catch:{ all -> 0x0015 }
            B.f0 r8 = new B.f0     // Catch:{ all -> 0x0015 }
            r8.<init>(r9)     // Catch:{ all -> 0x0015 }
            F.e r9 = B.f0.f238w     // Catch:{ all -> 0x0015 }
            r8.f240p = r9     // Catch:{ all -> 0x0015 }
            B7.g r9 = new B7.g     // Catch:{ all -> 0x0015 }
            r1 = 7
            r9.<init>((int) r1)     // Catch:{ all -> 0x0015 }
            r8.E(r9)     // Catch:{ all -> 0x0015 }
            goto L_0x00b1
        L_0x007e:
            java.util.Iterator r8 = r1.iterator()     // Catch:{ all -> 0x0015 }
            r1 = 0
        L_0x0083:
            boolean r2 = r8.hasNext()     // Catch:{ all -> 0x0015 }
            if (r2 == 0) goto L_0x00a0
            java.lang.Object r2 = r8.next()     // Catch:{ all -> 0x0015 }
            B.v0 r2 = (B.v0) r2     // Catch:{ all -> 0x0015 }
            boolean r3 = r2 instanceof B.f0     // Catch:{ all -> 0x0015 }
            if (r3 != 0) goto L_0x009e
            boolean r3 = r2 instanceof Q.d     // Catch:{ all -> 0x0015 }
            if (r3 == 0) goto L_0x0098
            goto L_0x009e
        L_0x0098:
            boolean r2 = r2 instanceof B.T     // Catch:{ all -> 0x0015 }
            if (r2 == 0) goto L_0x0083
            r1 = 1
            goto L_0x0083
        L_0x009e:
            r9 = 1
            goto L_0x0083
        L_0x00a0:
            if (r9 == 0) goto L_0x00b0
            if (r1 != 0) goto L_0x00b0
            B.v0 r8 = r7.f1784h0     // Catch:{ all -> 0x0015 }
            boolean r9 = r8 instanceof B.T     // Catch:{ all -> 0x0015 }
            if (r9 == 0) goto L_0x00ab
            goto L_0x00b1
        L_0x00ab:
            B.T r8 = t()     // Catch:{ all -> 0x0015 }
            goto L_0x00b1
        L_0x00b0:
            r8 = 0
        L_0x00b1:
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            return r8
        L_0x00b3:
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: H.g.p(java.util.LinkedHashSet, Q.d):B.v0");
    }

    public final HashMap r(int i, C0069x xVar, ArrayList arrayList, ArrayList arrayList2, HashMap hashMap) {
        Size size;
        K2 k22;
        Rect rect;
        boolean z;
        Size size2;
        C0050j jVar;
        C0069x xVar2 = xVar;
        ArrayList arrayList3 = new ArrayList();
        String e = xVar.e();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        Iterator it = arrayList2.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            size = null;
            k22 = this.f1773W;
            if (!hasNext) {
                break;
            }
            v0 v0Var = (v0) it.next();
            int A8 = v0Var.f340f.A();
            C0048i iVar = v0Var.f341g;
            if (iVar != null) {
                size2 = iVar.f904a;
            } else {
                size2 = null;
            }
            C1459T t8 = (C1459T) ((HashMap) k22.f10050V).get(e);
            if (t8 != null) {
                jVar = C0050j.b(i, A8, size2, t8.i(A8));
            } else {
                int i8 = i;
                jVar = null;
            }
            int A9 = v0Var.f340f.A();
            C0048i iVar2 = v0Var.f341g;
            if (iVar2 != null) {
                size = iVar2.f904a;
            }
            iVar2.getClass();
            C0032a aVar = new C0032a(jVar, A9, size, iVar2.f905b, d.G(v0Var), v0Var.f341g.f907d, v0Var.f340f.y());
            arrayList3.add(aVar);
            hashMap3.put(aVar, v0Var);
            hashMap2.put(v0Var, v0Var.f341g);
        }
        int i9 = i;
        if (!arrayList.isEmpty()) {
            HashMap hashMap4 = new HashMap();
            HashMap hashMap5 = new HashMap();
            try {
                rect = this.f1771U.m().O();
            } catch (NullPointerException unused) {
                rect = null;
            }
            if (rect != null) {
                size = E.f.d(rect);
            }
            j jVar2 = new j(xVar2, size);
            Iterator it2 = arrayList.iterator();
            boolean z6 = false;
            while (it2.hasNext()) {
                v0 v0Var2 = (v0) it2.next();
                f fVar = (f) hashMap.get(v0Var2);
                L0 l8 = v0Var2.l(xVar2, fVar.f1769a, fVar.f1770b);
                hashMap4.put(l8, v0Var2);
                hashMap5.put(l8, jVar2.b(l8));
                L0 l02 = v0Var2.f340f;
                if (l02 instanceof C0059n0) {
                    C0059n0 n0Var = (C0059n0) l02;
                    n0Var.getClass();
                    if (e.f(n0Var) == 2) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                }
            }
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z = false;
                    break;
                }
                v0 v0Var3 = (v0) it3.next();
                if (v0Var3 != null) {
                    if (!v0Var3.f340f.q0(L0.f807A)) {
                        Log.e("CameraUseCaseAdapter", v0Var3 + " UseCase does not have capture type.");
                    } else if (v0Var3.f340f.k() == N0.f833X) {
                        z = true;
                        break;
                    }
                }
            }
            k22.getClass();
            a.h("No new use cases to be bound.", !hashMap5.isEmpty());
            C1459T t9 = (C1459T) ((HashMap) k22.f10050V).get(e);
            if (t9 != null) {
                Pair g8 = t9.g(i, arrayList3, hashMap5, z6, z);
                for (Map.Entry entry : hashMap4.entrySet()) {
                    hashMap2.put((v0) entry.getValue(), (C0048i) ((Map) g8.first).get(entry.getKey()));
                }
                for (Map.Entry entry2 : ((Map) g8.second).entrySet()) {
                    if (hashMap3.containsKey(entry2.getKey())) {
                        hashMap2.put((v0) hashMap3.get(entry2.getKey()), (C0048i) entry2.getValue());
                    }
                }
            } else {
                throw new IllegalArgumentException(C1477r.d("No such camera id in supported combination list: ", e));
            }
        }
        return hashMap2;
    }

    public final void s(LinkedHashSet linkedHashSet) {
        boolean z;
        B();
        synchronized (this.f1781e0) {
            try {
                if (!this.f1779c0.isEmpty()) {
                    Iterator it = linkedHashSet.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        }
                        v0 v0Var = (v0) it.next();
                        if (v0Var instanceof T) {
                            L0 l02 = v0Var.f340f;
                            C0036c cVar = U.f857Y;
                            if (l02.q0(cVar)) {
                                Integer num = (Integer) l02.b0(cVar);
                                num.getClass();
                                z = true;
                                if (num.intValue() == 1) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    if (z) {
                        throw new IllegalArgumentException("Ultra HDR image capture does not support for use with CameraEffect.");
                    }
                }
            } finally {
            }
        }
    }

    public final d u(LinkedHashSet linkedHashSet, boolean z) {
        boolean z6;
        synchronized (this.f1781e0) {
            try {
                HashSet z8 = z(linkedHashSet, z);
                if (z8.size() < 2) {
                    B();
                    return null;
                }
                d dVar = this.f1785i0;
                if (dVar == null || !dVar.f3975p.f3991U.equals(z8)) {
                    int[] iArr = {1, 2, 4};
                    HashSet hashSet = new HashSet();
                    Iterator it = z8.iterator();
                    while (it.hasNext()) {
                        v0 v0Var = (v0) it.next();
                        int i = 0;
                        while (true) {
                            if (i < 3) {
                                int i8 = iArr[i];
                                Iterator it2 = v0Var.i().iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        z6 = false;
                                        break;
                                    }
                                    int intValue = ((Integer) it2.next()).intValue();
                                    if ((i8 & intValue) == intValue) {
                                        z6 = true;
                                        break;
                                    }
                                }
                                if (z6) {
                                    if (hashSet.contains(Integer.valueOf(i8))) {
                                        return null;
                                    }
                                    hashSet.add(Integer.valueOf(i8));
                                }
                                i++;
                            }
                        }
                    }
                    d dVar2 = new d(this.f1771U, this.f1772V, this.f1788l0, this.f1789m0, z8, this.f1774X);
                    return dVar2;
                }
                d dVar3 = this.f1785i0;
                Objects.requireNonNull(dVar3);
                return dVar3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void v() {
        synchronized (this.f1781e0) {
            try {
                if (this.f1782f0) {
                    this.f1771U.g(new ArrayList(this.f1777a0));
                    C0071z zVar = this.f1772V;
                    if (zVar != null) {
                        zVar.g(new ArrayList(this.f1777a0));
                    }
                    i();
                    this.f1782f0 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int x() {
        synchronized (this.f1781e0) {
            try {
                if (this.f1778b0.f2580U == 2) {
                    return 1;
                }
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final HashSet z(LinkedHashSet linkedHashSet, boolean z) {
        int i;
        HashSet hashSet = new HashSet();
        synchronized (this.f1781e0) {
            Iterator it = this.f1779c0.iterator();
            if (!it.hasNext()) {
                if (z) {
                    i = 3;
                } else {
                    i = 0;
                }
            } else if (it.next() == null) {
                throw null;
            } else {
                throw new ClassCastException();
            }
        }
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            v0 v0Var = (v0) it2.next();
            a.h("Only support one level of sharing for now.", !(v0Var instanceof d));
            Iterator it3 = v0Var.i().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                int intValue = ((Integer) it3.next()).intValue();
                if ((i & intValue) == intValue) {
                    hashSet.add(v0Var);
                    break;
                }
            }
        }
        return hashSet;
    }
}
