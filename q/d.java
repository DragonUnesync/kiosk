package Q;

import A.h;
import B.C0002c;
import B.Z;
import B.j0;
import B.n0;
import B.q0;
import B.t0;
import B.v0;
import B7.g;
import D.C0;
import D.C0041e0;
import D.C0048i;
import D.C0053k0;
import D.C0054l;
import D.C0071z;
import D.I;
import D.K;
import D.K0;
import D.L0;
import D.O0;
import D.V;
import D.X;
import D.y0;
import D.z0;
import M.c;
import M.k;
import M.m;
import N.e;
import N.f;
import O.b;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.util.Log;
import android.util.Size;
import g7.l;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import n2.a;
import t.C1412a;
import u.C1441A;

public final class d extends v0 {

    /* renamed from: A  reason: collision with root package name */
    public z0 f3973A;

    /* renamed from: o  reason: collision with root package name */
    public final e f3974o;

    /* renamed from: p  reason: collision with root package name */
    public final g f3975p;

    /* renamed from: q  reason: collision with root package name */
    public final Z f3976q;

    /* renamed from: r  reason: collision with root package name */
    public final Z f3977r;

    /* renamed from: s  reason: collision with root package name */
    public q0 f3978s;

    /* renamed from: t  reason: collision with root package name */
    public C7.d f3979t;

    /* renamed from: u  reason: collision with root package name */
    public k f3980u;

    /* renamed from: v  reason: collision with root package name */
    public k f3981v;

    /* renamed from: w  reason: collision with root package name */
    public k f3982w;

    /* renamed from: x  reason: collision with root package name */
    public k f3983x;

    /* renamed from: y  reason: collision with root package name */
    public y0 f3984y;
    public y0 z;

    public d(C0071z zVar, C0071z zVar2, Z z6, Z z8, HashSet hashSet, C1441A a8) {
        super(H(hashSet));
        this.f3974o = H(hashSet);
        this.f3976q = z6;
        this.f3977r = z8;
        this.f3975p = new g(zVar, zVar2, hashSet, a8, new g(15));
    }

    public static ArrayList G(v0 v0Var) {
        ArrayList arrayList = new ArrayList();
        if (v0Var instanceof d) {
            Iterator it = ((d) v0Var).f3975p.f3991U.iterator();
            while (it.hasNext()) {
                arrayList.add(((v0) it.next()).f340f.k());
            }
        } else {
            arrayList.add(v0Var.f340f.k());
        }
        return arrayList;
    }

    public static e H(HashSet hashSet) {
        C0041e0 b8 = C0041e0.b();
        new h(b8);
        b8.e(V.f864g, 34);
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            v0 v0Var = (v0) it.next();
            if (v0Var.f340f.q0(L0.f807A)) {
                arrayList.add(v0Var.f340f.k());
            } else {
                Log.e("StreamSharing", "A child does not have capture type.");
            }
        }
        b8.e(e.f3985V, arrayList);
        b8.e(X.f869l, 2);
        return new e(C0053k0.a(b8));
    }

    public final void C() {
        z0 z0Var = this.f3973A;
        if (z0Var != null) {
            z0Var.b();
            this.f3973A = null;
        }
        k kVar = this.f3980u;
        if (kVar != null) {
            kVar.b();
            this.f3980u = null;
        }
        k kVar2 = this.f3981v;
        if (kVar2 != null) {
            kVar2.b();
            this.f3981v = null;
        }
        k kVar3 = this.f3982w;
        if (kVar3 != null) {
            kVar3.b();
            this.f3982w = null;
        }
        k kVar4 = this.f3983x;
        if (kVar4 != null) {
            kVar4.b();
            this.f3983x = null;
        }
        q0 q0Var = this.f3978s;
        if (q0Var != null) {
            ((c) q0Var.f300V).e();
            l.n(new A.d(20, q0Var));
            this.f3978s = null;
        }
        C7.d dVar = this.f3979t;
        if (dVar != null) {
            ((f) dVar.f732V).d();
            l.n(new A.d(22, dVar));
            this.f3979t = null;
        }
    }

    public final List D(String str, String str2, L0 l02, C0048i iVar, C0048i iVar2) {
        boolean z6;
        boolean z8;
        boolean z9;
        boolean z10;
        C0048i iVar3 = iVar;
        C0048i iVar4 = iVar2;
        l.a();
        g gVar = this.f3975p;
        if (iVar4 == null) {
            E(str, str2, l02, iVar, (C0048i) null);
            C0071z b8 = b();
            Objects.requireNonNull(b8);
            this.f3978s = new q0((Object) b8, 11, (Object) new c(iVar3.f905b));
            if (this.i != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            k kVar = this.f3982w;
            int h02 = ((X) this.f340f).h0(0);
            gVar.getClass();
            HashMap hashMap = new HashMap();
            Iterator it = gVar.f3991U.iterator();
            while (it.hasNext()) {
                v0 v0Var = (v0) it.next();
                hashMap.put(v0Var, gVar.q(v0Var, gVar.f4001e0, gVar.f3996Z, kVar, h02, z9));
                gVar = gVar;
            }
            g gVar2 = gVar;
            q0 q0Var = this.f3978s;
            k kVar2 = this.f3982w;
            ArrayList arrayList = new ArrayList(hashMap.values());
            if (kVar2 != null) {
                q0Var.getClass();
                l.a();
                q0Var.f302X = new HashMap();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    b bVar = (b) it2.next();
                    m mVar = (m) q0Var.f302X;
                    Rect rect = bVar.f3470d;
                    Matrix matrix = new Matrix(kVar2.f2760b);
                    RectF rectF = new RectF(rect);
                    RectF rectF2 = E.f.f1294a;
                    float f8 = (float) 0;
                    Size size = bVar.e;
                    RectF rectF3 = new RectF(f8, f8, (float) size.getWidth(), (float) size.getHeight());
                    int i = bVar.f3471f;
                    boolean z11 = bVar.f3472g;
                    matrix.postConcat(E.f.a(rectF, rectF3, i, z11));
                    a.i(E.f.c(E.f.e(E.f.d(rect), i), false, size));
                    Rect rect2 = new Rect(0, 0, size.getWidth(), size.getHeight());
                    C7.d a8 = kVar2.f2764g.a();
                    a8.f732V = size;
                    C0048i d8 = a8.d();
                    int i8 = kVar2.i - i;
                    if (kVar2.e != z11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    mVar.put(bVar, new k(bVar.f3468b, bVar.f3469c, d8, matrix, false, rect2, i8, -1, z10));
                }
                t0 c8 = kVar2.c((C0071z) q0Var.f301W, true);
                c cVar = (c) q0Var.f300V;
                if (cVar.f2723Y.get()) {
                    c8.c();
                } else {
                    cVar.b(new C0002c((Object) cVar, 11, (Object) c8), new n0(c8, 1));
                }
                for (Map.Entry entry : ((m) q0Var.f302X).entrySet()) {
                    q0Var.j(kVar2, entry);
                    k kVar3 = (k) entry.getValue();
                    A4.d dVar = new A4.d(q0Var, kVar2, entry, 4);
                    kVar3.getClass();
                    l.a();
                    kVar3.a();
                    kVar3.f2769m.add(dVar);
                }
                kVar2.f2771o.add(new C.d(1, (m) q0Var.f302X));
                m mVar2 = (m) q0Var.f302X;
                HashMap hashMap2 = new HashMap();
                for (Map.Entry entry2 : hashMap.entrySet()) {
                    hashMap2.put((v0) entry2.getKey(), (k) mVar2.get(entry2.getValue()));
                }
                gVar2.u(hashMap2);
                Object[] objArr = {this.f3984y.c()};
                ArrayList arrayList2 = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList2.add(obj);
                return DesugarCollections.unmodifiableList(arrayList2);
            }
            throw new NullPointerException("Null surfaceEdge");
        }
        g gVar3 = gVar;
        E(str, str2, l02, iVar, iVar2);
        Matrix matrix2 = this.f343j;
        C0071z h5 = h();
        Objects.requireNonNull(h5);
        boolean j7 = h5.j();
        Rect rect3 = this.i;
        if (rect3 == null) {
            Size size2 = iVar4.f904a;
            rect3 = new Rect(0, 0, size2.getWidth(), size2.getHeight());
        }
        Rect rect4 = rect3;
        C0071z h8 = h();
        Objects.requireNonNull(h8);
        int g8 = g(h8, false);
        C0071z h9 = h();
        Objects.requireNonNull(h9);
        k kVar4 = new k(3, 34, iVar2, matrix2, j7, rect4, g8, -1, k(h9));
        this.f3981v = kVar4;
        Objects.requireNonNull(h());
        this.f3983x = kVar4;
        y0 F8 = F(this.f3981v, l02, iVar4);
        this.z = F8;
        z0 z0Var = this.f3973A;
        if (z0Var != null) {
            z0Var.b();
        }
        g gVar4 = gVar3;
        z0 z0Var2 = new z0(new c(this, str, str2, l02, iVar, iVar2));
        this.f3973A = z0Var2;
        F8.f962f = z0Var2;
        this.f3979t = new C7.d(b(), h(), new f(iVar3.f905b, this.f3976q, this.f3977r));
        if (this.i != null) {
            z6 = true;
        } else {
            z6 = false;
        }
        k kVar5 = this.f3982w;
        k kVar6 = this.f3983x;
        int h03 = ((X) this.f340f).h0(0);
        gVar4.getClass();
        HashMap hashMap3 = new HashMap();
        Iterator it3 = gVar4.f3991U.iterator();
        while (it3.hasNext()) {
            v0 v0Var2 = (v0) it3.next();
            v0 v0Var3 = v0Var2;
            g gVar5 = gVar4;
            boolean z12 = z6;
            b q7 = gVar4.q(v0Var3, gVar4.f4001e0, gVar4.f3996Z, kVar5, h03, z12);
            C0071z zVar = gVar5.f3997a0;
            Objects.requireNonNull(zVar);
            hashMap3.put(v0Var2, new N.a(q7, gVar5.q(v0Var3, gVar5.f4002f0, zVar, kVar6, h03, z12)));
            gVar4 = gVar5;
        }
        g gVar6 = gVar4;
        C7.d dVar2 = this.f3979t;
        N.b bVar2 = new N.b(this.f3982w, this.f3983x, new ArrayList(hashMap3.values()));
        dVar2.getClass();
        l.a();
        dVar2.f736Z = bVar2;
        dVar2.f735Y = new HashMap();
        N.b bVar3 = (N.b) dVar2.f736Z;
        k kVar7 = bVar3.f3202a;
        Iterator it4 = bVar3.f3204c.iterator();
        while (it4.hasNext()) {
            N.a aVar = (N.a) it4.next();
            m mVar3 = (m) dVar2.f735Y;
            b bVar4 = aVar.f3200a;
            Matrix matrix3 = new Matrix();
            Size d9 = E.f.d(bVar4.f3470d);
            int i9 = bVar4.f3471f;
            Size e = E.f.e(d9, i9);
            Size size3 = bVar4.e;
            a.i(E.f.c(e, false, size3));
            Rect rect5 = new Rect(0, 0, size3.getWidth(), size3.getHeight());
            C7.d a9 = kVar7.f2764g.a();
            a9.f732V = size3;
            C0048i d10 = a9.d();
            int i10 = kVar7.i - i9;
            if (kVar7.e != bVar4.f3472g) {
                z8 = true;
            } else {
                z8 = false;
            }
            mVar3.put(aVar, new k(bVar4.f3468b, bVar4.f3469c, d10, matrix3, false, rect5, i10, -1, z8));
        }
        t0 c9 = kVar7.c((C0071z) dVar2.f733W, true);
        f fVar = (f) dVar2.f732V;
        fVar.c(c9);
        k kVar8 = bVar3.f3203b;
        fVar.c(kVar8.c((C0071z) dVar2.f734X, false));
        for (Map.Entry entry3 : ((m) dVar2.f735Y).entrySet()) {
            C0071z zVar2 = (C0071z) dVar2.f733W;
            C0071z zVar3 = (C0071z) dVar2.f734X;
            dVar2.i(zVar2, zVar3, kVar7, kVar8, entry3);
            k kVar9 = (k) entry3.getValue();
            N.g gVar7 = new N.g(dVar2, zVar2, zVar3, kVar7, kVar8, entry3, 0);
            kVar9.getClass();
            l.a();
            kVar9.a();
            kVar9.f2769m.add(gVar7);
        }
        m mVar4 = (m) dVar2.f735Y;
        HashMap hashMap4 = new HashMap();
        for (Map.Entry entry4 : hashMap3.entrySet()) {
            hashMap4.put((v0) entry4.getKey(), (k) mVar4.get(entry4.getValue()));
        }
        gVar6.u(hashMap4);
        Object[] objArr2 = {this.f3984y.c(), this.z.c()};
        ArrayList arrayList3 = new ArrayList(2);
        for (int i11 = 0; i11 < 2; i11++) {
            Object obj2 = objArr2[i11];
            Objects.requireNonNull(obj2);
            arrayList3.add(obj2);
        }
        return DesugarCollections.unmodifiableList(arrayList3);
    }

    public final void E(String str, String str2, L0 l02, C0048i iVar, C0048i iVar2) {
        C0048i iVar3 = iVar;
        Matrix matrix = this.f343j;
        C0071z b8 = b();
        Objects.requireNonNull(b8);
        boolean j7 = b8.j();
        Size size = iVar3.f904a;
        Rect rect = this.i;
        if (rect == null) {
            rect = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        Rect rect2 = rect;
        C0071z b9 = b();
        Objects.requireNonNull(b9);
        int g8 = g(b9, false);
        C0071z b10 = b();
        Objects.requireNonNull(b10);
        k kVar = new k(3, 34, iVar, matrix, j7, rect2, g8, -1, k(b10));
        this.f3980u = kVar;
        Objects.requireNonNull(b());
        this.f3982w = kVar;
        y0 F8 = F(this.f3980u, l02, iVar3);
        this.f3984y = F8;
        z0 z0Var = this.f3973A;
        if (z0Var != null) {
            z0Var.b();
        }
        z0 z0Var2 = new z0(new c(this, str, str2, l02, iVar, iVar2));
        this.f3973A = z0Var2;
        F8.f962f = z0Var2;
    }

    public final y0 F(k kVar, L0 l02, C0048i iVar) {
        y0 d8 = y0.d(l02, iVar.f904a);
        g gVar = this.f3975p;
        Iterator it = gVar.f3991U.iterator();
        int i = -1;
        while (it.hasNext()) {
            int i8 = ((v0) it.next()).f340f.M().f752g.f790c;
            Integer valueOf = Integer.valueOf(i);
            List list = C0.i;
            if (list.indexOf(valueOf) < list.indexOf(Integer.valueOf(i8))) {
                i = i8;
            }
        }
        j0 j0Var = d8.f959b;
        if (i != -1) {
            j0Var.f264U = i;
        }
        Iterator it2 = gVar.f3991U.iterator();
        while (it2.hasNext()) {
            C0 c8 = y0.d(((v0) it2.next()).f340f, iVar.f904a).c();
            I i9 = c8.f752g;
            j0Var.a(i9.f791d);
            for (C0054l lVar : c8.e) {
                j0Var.d(lVar);
                ArrayList arrayList = d8.e;
                if (!arrayList.contains(lVar)) {
                    arrayList.add(lVar);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback : c8.f750d) {
                ArrayList arrayList2 = d8.f961d;
                if (!arrayList2.contains(stateCallback)) {
                    arrayList2.add(stateCallback);
                }
            }
            for (CameraDevice.StateCallback stateCallback2 : c8.f749c) {
                ArrayList arrayList3 = d8.f960c;
                if (!arrayList3.contains(stateCallback2)) {
                    arrayList3.add(stateCallback2);
                }
            }
            j0Var.e(i9.f789b);
        }
        kVar.getClass();
        l.a();
        kVar.a();
        a.m("Consumer can only be linked once.", !kVar.f2766j);
        kVar.f2766j = true;
        d8.b(kVar.f2768l, iVar.f905b, -1);
        j0Var.d(gVar.f3998b0);
        C1412a aVar = iVar.f907d;
        if (aVar != null) {
            j0Var.e(aVar);
        }
        return d8;
    }

    public final L0 e(boolean z6, O0 o02) {
        e eVar = this.f3974o;
        eVar.getClass();
        K a8 = o02.a(e.c(eVar), 1);
        if (z6) {
            a8 = e.I(a8, eVar.f3986U);
        }
        if (a8 == null) {
            return null;
        }
        return ((h) j(a8)).b();
    }

    public final Set i() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    public final K0 j(K k8) {
        return new h(C0041e0.c(k8));
    }

    public final void p() {
        g gVar = this.f3975p;
        Iterator it = gVar.f3991U.iterator();
        while (it.hasNext()) {
            v0 v0Var = (v0) it.next();
            f fVar = (f) gVar.f3993W.get(v0Var);
            Objects.requireNonNull(fVar);
            v0Var.a(fVar, (C0071z) null, (L0) null, v0Var.e(true, gVar.f3995Y));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final D.L0 r(D.C0069x r13, D.K0 r14) {
        /*
            r12 = this;
            D.d0 r13 = r14.a()
            Q.g r0 = r12.f3975p
            Q.b r1 = r0.f4001e0
            D.x r2 = r1.f3966f
            r3 = 34
            java.util.List r2 = r2.l(r3)
            java.util.HashSet r4 = r1.f3965d
            java.util.Iterator r5 = r4.iterator()
        L_0x0016:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0033
            java.lang.Object r6 = r5.next()
            D.L0 r6 = (D.L0) r6
            boolean r7 = r6.R()
            if (r7 == 0) goto L_0x0029
            goto L_0x0016
        L_0x0029:
            boolean r7 = r6 instanceof D.X
            if (r7 == 0) goto L_0x0016
            D.X r6 = (D.X) r6
            r6.T()
            goto L_0x0016
        L_0x0033:
            D.c r5 = D.X.f873p
            r6 = r13
            D.k0 r6 = (D.C0053k0) r6
            r6.getClass()
            r7 = 0
            java.lang.Object r5 = r6.b0(r5)     // Catch:{ IllegalArgumentException -> 0x0041 }
            goto L_0x0043
        L_0x0041:
            r5 = r7
        L_0x0043:
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L_0x0073
            java.util.Iterator r2 = r5.iterator()
        L_0x004b:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x006e
            java.lang.Object r5 = r2.next()
            android.util.Pair r5 = (android.util.Pair) r5
            java.lang.Object r6 = r5.first
            java.lang.Integer r6 = (java.lang.Integer) r6
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x004b
            java.lang.Object r2 = r5.second
            android.util.Size[] r2 = (android.util.Size[]) r2
            java.util.List r2 = java.util.Arrays.asList(r2)
            goto L_0x0073
        L_0x006e:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0073:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x0081:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0095
            java.lang.Object r6 = r4.next()
            D.L0 r6 = (D.L0) r6
            java.util.List r6 = r1.b(r6)
            r5.addAll(r6)
            goto L_0x0081
        L_0x0095:
            java.util.Iterator r4 = r5.iterator()
        L_0x0099:
            boolean r5 = r4.hasNext()
            r6 = 0
            android.util.Rational r8 = r1.f3964c
            if (r5 == 0) goto L_0x00b7
            java.lang.Object r5 = r4.next()
            android.util.Size r5 = (android.util.Size) r5
            boolean r5 = E.b.a(r8, r5)
            if (r5 != 0) goto L_0x0099
            android.util.Rational r4 = r1.f3963b
            java.util.ArrayList r4 = r1.f(r4, r2, r6)
            r3.addAll(r4)
        L_0x00b7:
            java.util.ArrayList r4 = r1.f(r8, r2, r6)
            r3.addAll(r4)
            java.util.ArrayList r4 = r1.e(r2, r6)
            r3.addAll(r4)
            boolean r4 = r3.isEmpty()
            r5 = 1
            java.lang.String r8 = "ResolutionsMerger"
            if (r4 == 0) goto L_0x00da
            java.lang.String r4 = "Failed to find a parent resolution that does not result in double-cropping, this might due to camera not supporting 4:3 and 16:9resolutions or a strict ResolutionSelector settings. Starting resolution selection process with resolutions that might have a smaller FOV."
            F.h.I(r8, r4)
            java.util.ArrayList r1 = r1.e(r2, r5)
            r3.addAll(r1)
        L_0x00da:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Parent resolutions: "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            F.h.j(r8, r1)
            D.c r1 = D.X.f875r
            D.e0 r13 = (D.C0041e0) r13
            r13.e(r1, r3)
            D.c r1 = D.L0.f814w
            java.util.HashSet r2 = r0.f3999c0
            java.util.Iterator r3 = r2.iterator()
            r4 = 0
        L_0x00fb:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x0110
            java.lang.Object r8 = r3.next()
            D.L0 r8 = (D.L0) r8
            int r8 = r8.N()
            int r4 = java.lang.Math.max(r4, r8)
            goto L_0x00fb
        L_0x0110:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r13.e(r1, r3)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0120:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0134
            java.lang.Object r3 = r2.next()
            D.L0 r3 = (D.L0) r3
            B.x r3 = r3.n()
            r1.add(r3)
            goto L_0x0120
        L_0x0134:
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x013c
            goto L_0x01de
        L_0x013c:
            java.lang.Object r2 = r1.get(r6)
            B.x r2 = (B.C0022x) r2
            int r3 = r2.f364a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r2 = r2.f365b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4 = 1
        L_0x014f:
            int r8 = r1.size()
            if (r4 >= r8) goto L_0x01d1
            java.lang.Object r8 = r1.get(r4)
            B.x r8 = (B.C0022x) r8
            int r9 = r8.f364a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            boolean r11 = r3.equals(r10)
            if (r11 == 0) goto L_0x016d
        L_0x016b:
            r3 = r9
            goto L_0x01a7
        L_0x016d:
            boolean r10 = r9.equals(r10)
            if (r10 == 0) goto L_0x0174
            goto L_0x01a7
        L_0x0174:
            r10 = 2
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto L_0x018a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r5)
            boolean r11 = r9.equals(r11)
            if (r11 != 0) goto L_0x018a
            goto L_0x016b
        L_0x018a:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            boolean r10 = r9.equals(r10)
            if (r10 == 0) goto L_0x019f
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
            boolean r10 = r3.equals(r10)
            if (r10 != 0) goto L_0x019f
            goto L_0x01a7
        L_0x019f:
            boolean r9 = r3.equals(r9)
            if (r9 == 0) goto L_0x01a6
            goto L_0x01a7
        L_0x01a6:
            r3 = r7
        L_0x01a7:
            int r8 = r8.f365b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            boolean r10 = r2.equals(r9)
            if (r10 == 0) goto L_0x01b9
            r2 = r8
            goto L_0x01c8
        L_0x01b9:
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x01c0
            goto L_0x01c8
        L_0x01c0:
            boolean r8 = r2.equals(r8)
            if (r8 == 0) goto L_0x01c7
            goto L_0x01c8
        L_0x01c7:
            r2 = r7
        L_0x01c8:
            if (r3 == 0) goto L_0x01de
            if (r2 != 0) goto L_0x01cd
            goto L_0x01de
        L_0x01cd:
            int r4 = r4 + 1
            goto L_0x014f
        L_0x01d1:
            B.x r7 = new B.x
            int r1 = r3.intValue()
            int r2 = r2.intValue()
            r7.<init>(r1, r2)
        L_0x01de:
            if (r7 == 0) goto L_0x022b
            D.c r1 = D.V.f865h
            r13.e(r1, r7)
            java.util.HashSet r0 = r0.f3991U
            java.util.Iterator r0 = r0.iterator()
        L_0x01eb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0226
            java.lang.Object r1 = r0.next()
            B.v0 r1 = (B.v0) r1
            D.L0 r2 = r1.f340f
            int r2 = r2.l()
            if (r2 == 0) goto L_0x020e
            D.c r2 = D.L0.f809C
            D.L0 r3 = r1.f340f
            int r3 = r3.l()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r13.e(r2, r3)
        L_0x020e:
            D.L0 r2 = r1.f340f
            int r2 = r2.B()
            if (r2 == 0) goto L_0x01eb
            D.c r2 = D.L0.f808B
            D.L0 r1 = r1.f340f
            int r1 = r1.B()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r13.e(r2, r1)
            goto L_0x01eb
        L_0x0226:
            D.L0 r13 = r14.b()
            return r13
        L_0x022b:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "Failed to merge child dynamic ranges, can not find a dynamic range that satisfies all children."
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: Q.d.r(D.x, D.K0):D.L0");
    }

    public final void s() {
        Iterator it = this.f3975p.f3991U.iterator();
        while (it.hasNext()) {
            v0 v0Var = (v0) it.next();
            v0Var.s();
            v0Var.q();
        }
    }

    public final void t() {
        Iterator it = this.f3975p.f3991U.iterator();
        while (it.hasNext()) {
            ((v0) it.next()).t();
        }
    }

    public final C0048i u(C1412a aVar) {
        this.f3984y.a(aVar);
        Object[] objArr = {this.f3984y.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        B(DesugarCollections.unmodifiableList(arrayList));
        C7.d a8 = this.f341g.a();
        a8.f735Y = aVar;
        return a8.d();
    }

    public final C0048i v(C0048i iVar, C0048i iVar2) {
        String e;
        String d8 = d();
        if (h() == null) {
            e = null;
        } else {
            e = h().l().e();
        }
        String str = e;
        B(D(d8, str, this.f340f, iVar, iVar2));
        m();
        return iVar;
    }

    public final void w() {
        C();
        g gVar = this.f3975p;
        Iterator it = gVar.f3991U.iterator();
        while (it.hasNext()) {
            v0 v0Var = (v0) it.next();
            f fVar = (f) gVar.f3993W.get(v0Var);
            Objects.requireNonNull(fVar);
            v0Var.A(fVar);
        }
    }
}
