package c7;

import H3.n0;
import M0.J;
import P0.l;
import P0.z;
import P6.f;
import Q0.g;
import Y6.a;
import Y6.o;
import f1.C0888a;
import f1.C0889b;
import f7.C0937B;
import f7.C0938a;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: c7.e  reason: case insensitive filesystem */
public final class C0625e {

    /* renamed from: a  reason: collision with root package name */
    public int f8914a;

    /* renamed from: b  reason: collision with root package name */
    public int f8915b;

    /* renamed from: c  reason: collision with root package name */
    public int f8916c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f8917d;
    public final Object e;

    /* renamed from: f  reason: collision with root package name */
    public final Cloneable f8918f;

    /* renamed from: g  reason: collision with root package name */
    public Object f8919g;

    /* renamed from: h  reason: collision with root package name */
    public Object f8920h;
    public Object i;

    public C0625e(k kVar, a aVar, h hVar) {
        f.e(kVar, "connectionPool");
        f.e(hVar, "call");
        this.f8917d = kVar;
        this.e = aVar;
        this.f8918f = hVar;
    }

    public static String b(String str, int i8, int i9, int i10) {
        int i11 = z.f3748a;
        Locale locale = Locale.US;
        return i8 + " " + str + "/" + i9 + "/" + i10;
    }

    public C0889b a() {
        C0888a aVar;
        boolean z;
        String str;
        HashMap hashMap = (HashMap) this.f8918f;
        try {
            if (hashMap.containsKey("rtpmap")) {
                int i8 = z.f3748a;
                aVar = C0888a.a((String) hashMap.get("rtpmap"));
            } else {
                int i9 = this.f8915b;
                if (i9 < 96) {
                    z = true;
                } else {
                    z = false;
                }
                l.d(z);
                if (i9 == 0) {
                    str = b("PCMU", 0, 8000, 1);
                } else if (i9 == 8) {
                    str = b("PCMA", 8, 8000, 1);
                } else if (i9 == 10) {
                    str = b("L16", 10, 44100, 2);
                } else if (i9 == 11) {
                    str = b("L16", 11, 44100, 1);
                } else {
                    throw new IllegalStateException(g.m(i9, "Unsupported static paylod type "));
                }
                aVar = C0888a.a(str);
            }
            return new C0889b(this, n0.a(hashMap), aVar);
        } catch (J e8) {
            throw new IllegalStateException(e8);
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: Y6.w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: Y6.w} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01b9 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c7.j c(int r13, int r14, int r15, boolean r16, boolean r17) {
        /*
            r12 = this;
            r1 = r12
            r0 = 1
        L_0x0002:
            java.lang.Cloneable r2 = r1.f8918f
            c7.h r2 = (c7.h) r2
            boolean r2 = r2.f8935g0
            if (r2 != 0) goto L_0x0202
            java.lang.Cloneable r2 = r1.f8918f
            c7.h r2 = (c7.h) r2
            c7.j r2 = r2.f8930b0
            r3 = 0
            if (r2 == 0) goto L_0x0059
            monitor-enter(r2)
            boolean r4 = r2.f8945j     // Catch:{ all -> 0x0027 }
            if (r4 != 0) goto L_0x0029
            Y6.w r4 = r2.f8939b     // Catch:{ all -> 0x0027 }
            Y6.a r4 = r4.f6755a     // Catch:{ all -> 0x0027 }
            Y6.o r4 = r4.f6596h     // Catch:{ all -> 0x0027 }
            boolean r4 = r12.d(r4)     // Catch:{ all -> 0x0027 }
            if (r4 != 0) goto L_0x0025
            goto L_0x0029
        L_0x0025:
            r4 = r3
            goto L_0x0031
        L_0x0027:
            r0 = move-exception
            goto L_0x0057
        L_0x0029:
            java.lang.Cloneable r4 = r1.f8918f     // Catch:{ all -> 0x0027 }
            c7.h r4 = (c7.h) r4     // Catch:{ all -> 0x0027 }
            java.net.Socket r4 = r4.h()     // Catch:{ all -> 0x0027 }
        L_0x0031:
            monitor-exit(r2)
            java.lang.Cloneable r5 = r1.f8918f
            c7.h r5 = (c7.h) r5
            c7.j r5 = r5.f8930b0
            if (r5 == 0) goto L_0x0048
            if (r4 != 0) goto L_0x0040
        L_0x003c:
            r3 = r17
            goto L_0x01b3
        L_0x0040:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r0)
            throw r2
        L_0x0048:
            if (r4 == 0) goto L_0x004d
            Z6.b.d(r4)
        L_0x004d:
            java.lang.Cloneable r2 = r1.f8918f
            c7.h r2 = (c7.h) r2
            java.lang.String r4 = "call"
            P6.f.e(r2, r4)
            goto L_0x0059
        L_0x0057:
            monitor-exit(r2)
            throw r0
        L_0x0059:
            r2 = 0
            r1.f8914a = r2
            r1.f8915b = r2
            r1.f8916c = r2
            java.lang.Object r4 = r1.f8917d
            c7.k r4 = (c7.k) r4
            java.lang.Object r5 = r1.e
            Y6.a r5 = (Y6.a) r5
            java.lang.Cloneable r6 = r1.f8918f
            c7.h r6 = (c7.h) r6
            boolean r4 = r4.a(r5, r6, r3, r2)
            if (r4 == 0) goto L_0x0085
            java.lang.Cloneable r2 = r1.f8918f
            c7.h r2 = (c7.h) r2
            c7.j r2 = r2.f8930b0
            P6.f.b(r2)
            java.lang.Cloneable r3 = r1.f8918f
            c7.h r3 = (c7.h) r3
            java.lang.String r4 = "call"
            P6.f.e(r3, r4)
            goto L_0x003c
        L_0x0085:
            java.lang.Object r4 = r1.i
            Y6.w r4 = (Y6.w) r4
            if (r4 == 0) goto L_0x0090
            r1.i = r3
        L_0x008d:
            r5 = r3
            goto L_0x0129
        L_0x0090:
            java.lang.Object r4 = r1.f8919g
            D2.j r4 = (D2.j) r4
            if (r4 == 0) goto L_0x00c1
            boolean r4 = r4.p()
            if (r4 == 0) goto L_0x00c1
            java.lang.Object r2 = r1.f8919g
            D2.j r2 = (D2.j) r2
            P6.f.b(r2)
            boolean r4 = r2.p()
            if (r4 == 0) goto L_0x00bb
            int r4 = r2.f1093U
            int r5 = r4 + 1
            r2.f1093U = r5
            java.lang.Object r2 = r2.f1094V
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r2 = r2.get(r4)
            r4 = r2
            Y6.w r4 = (Y6.w) r4
            goto L_0x008d
        L_0x00bb:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L_0x00c1:
            java.lang.Object r4 = r1.f8920h
            c7.m r4 = (c7.m) r4
            if (r4 != 0) goto L_0x00da
            c7.m r4 = new c7.m
            java.lang.Object r5 = r1.e
            Y6.a r5 = (Y6.a) r5
            java.lang.Cloneable r6 = r1.f8918f
            c7.h r6 = (c7.h) r6
            Y6.r r7 = r6.f8923U
            Z1.c r7 = r7.f6719s0
            r4.<init>(r5, r7, r6)
            r1.f8920h = r4
        L_0x00da:
            D2.j r4 = r4.k()
            r1.f8919g = r4
            java.lang.Object r5 = r4.f1094V
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.Cloneable r6 = r1.f8918f
            c7.h r6 = (c7.h) r6
            boolean r6 = r6.f8935g0
            if (r6 != 0) goto L_0x01fa
            java.lang.Object r6 = r1.f8917d
            c7.k r6 = (c7.k) r6
            java.lang.Object r7 = r1.e
            Y6.a r7 = (Y6.a) r7
            java.lang.Cloneable r8 = r1.f8918f
            c7.h r8 = (c7.h) r8
            boolean r2 = r6.a(r7, r8, r5, r2)
            if (r2 == 0) goto L_0x0112
            java.lang.Cloneable r2 = r1.f8918f
            c7.h r2 = (c7.h) r2
            c7.j r2 = r2.f8930b0
            P6.f.b(r2)
            java.lang.Cloneable r3 = r1.f8918f
            c7.h r3 = (c7.h) r3
            java.lang.String r4 = "call"
            P6.f.e(r3, r4)
            goto L_0x003c
        L_0x0112:
            boolean r2 = r4.p()
            if (r2 == 0) goto L_0x01f4
            int r2 = r4.f1093U
            int r6 = r2 + 1
            r4.f1093U = r6
            java.lang.Object r4 = r4.f1094V
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.lang.Object r2 = r4.get(r2)
            r4 = r2
            Y6.w r4 = (Y6.w) r4
        L_0x0129:
            c7.j r2 = new c7.j
            java.lang.Object r6 = r1.f8917d
            c7.k r6 = (c7.k) r6
            r2.<init>(r6, r4)
            java.lang.Cloneable r6 = r1.f8918f
            c7.h r6 = (c7.h) r6
            r6.f8937i0 = r2
            java.lang.Cloneable r6 = r1.f8918f     // Catch:{ all -> 0x01ec }
            r11 = r6
            c7.h r11 = (c7.h) r11     // Catch:{ all -> 0x01ec }
            r6 = r2
            r7 = r13
            r8 = r14
            r9 = r15
            r10 = r16
            r6.c(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x01ec }
            java.lang.Cloneable r6 = r1.f8918f
            c7.h r6 = (c7.h) r6
            r6.f8937i0 = r3
            java.lang.Cloneable r3 = r1.f8918f
            c7.h r3 = (c7.h) r3
            Y6.r r3 = r3.f8923U
            Z1.c r3 = r3.f6719s0
            r3.m(r4)
            java.lang.Object r3 = r1.f8917d
            c7.k r3 = (c7.k) r3
            java.lang.Object r6 = r1.e
            Y6.a r6 = (Y6.a) r6
            java.lang.Cloneable r7 = r1.f8918f
            c7.h r7 = (c7.h) r7
            boolean r3 = r3.a(r6, r7, r5, r0)
            if (r3 == 0) goto L_0x0188
            java.lang.Cloneable r3 = r1.f8918f
            c7.h r3 = (c7.h) r3
            c7.j r3 = r3.f8930b0
            P6.f.b(r3)
            r1.i = r4
            java.net.Socket r2 = r2.f8941d
            P6.f.b(r2)
            Z6.b.d(r2)
            java.lang.Cloneable r2 = r1.f8918f
            c7.h r2 = (c7.h) r2
            java.lang.String r4 = "call"
            P6.f.e(r2, r4)
            r2 = r3
            goto L_0x003c
        L_0x0188:
            monitor-enter(r2)
            java.lang.Object r3 = r1.f8917d     // Catch:{ all -> 0x01e9 }
            c7.k r3 = (c7.k) r3     // Catch:{ all -> 0x01e9 }
            r3.getClass()     // Catch:{ all -> 0x01e9 }
            byte[] r4 = Z6.b.f6982a     // Catch:{ all -> 0x01e9 }
            java.util.concurrent.ConcurrentLinkedQueue r4 = r3.f8956d     // Catch:{ all -> 0x01e9 }
            r4.add(r2)     // Catch:{ all -> 0x01e9 }
            b7.c r4 = r3.f8954b     // Catch:{ all -> 0x01e9 }
            b7.b r3 = r3.f8955c     // Catch:{ all -> 0x01e9 }
            r5 = 0
            r4.c(r3, r5)     // Catch:{ all -> 0x01e9 }
            java.lang.Cloneable r3 = r1.f8918f     // Catch:{ all -> 0x01e9 }
            c7.h r3 = (c7.h) r3     // Catch:{ all -> 0x01e9 }
            r3.a(r2)     // Catch:{ all -> 0x01e9 }
            monitor-exit(r2)
            java.lang.Cloneable r3 = r1.f8918f
            c7.h r3 = (c7.h) r3
            java.lang.String r4 = "call"
            P6.f.e(r3, r4)
            goto L_0x003c
        L_0x01b3:
            boolean r4 = r2.j(r3)
            if (r4 == 0) goto L_0x01ba
            return r2
        L_0x01ba:
            r2.l()
            java.lang.Object r2 = r1.i
            Y6.w r2 = (Y6.w) r2
            if (r2 != 0) goto L_0x0002
            java.lang.Object r2 = r1.f8919g
            D2.j r2 = (D2.j) r2
            if (r2 == 0) goto L_0x01ce
            boolean r2 = r2.p()
            goto L_0x01cf
        L_0x01ce:
            r2 = 1
        L_0x01cf:
            if (r2 != 0) goto L_0x0002
            java.lang.Object r2 = r1.f8920h
            c7.m r2 = (c7.m) r2
            if (r2 == 0) goto L_0x01dc
            boolean r2 = r2.i()
            goto L_0x01dd
        L_0x01dc:
            r2 = 1
        L_0x01dd:
            if (r2 == 0) goto L_0x01e1
            goto L_0x0002
        L_0x01e1:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "exhausted all routes"
            r0.<init>(r2)
            throw r0
        L_0x01e9:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x01ec:
            r0 = move-exception
            java.lang.Cloneable r2 = r1.f8918f
            c7.h r2 = (c7.h) r2
            r2.f8937i0 = r3
            throw r0
        L_0x01f4:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L_0x01fa:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
        L_0x0202:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c7.C0625e.c(int, int, int, boolean, boolean):c7.j");
    }

    public boolean d(o oVar) {
        f.e(oVar, "url");
        o oVar2 = ((a) this.e).f6596h;
        if (oVar.e != oVar2.e || !f.a(oVar.f6672d, oVar2.f6672d)) {
            return false;
        }
        return true;
    }

    public void e(IOException iOException) {
        f.e(iOException, "e");
        this.i = null;
        if ((iOException instanceof C0937B) && ((C0937B) iOException).f11695U == 8) {
            this.f8914a++;
        } else if (iOException instanceof C0938a) {
            this.f8915b++;
        } else {
            this.f8916c++;
        }
    }

    public C0625e(String str, int i8, String str2, int i9) {
        this.f8917d = str;
        this.f8914a = i8;
        this.e = str2;
        this.f8915b = i9;
        this.f8918f = new HashMap();
        this.f8916c = -1;
    }
}
