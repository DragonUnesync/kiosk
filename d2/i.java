package D2;

import B2.b;
import B2.f;
import B2.m;
import D.s0;
import H2.p;
import H2.q;
import H3.C0105w;
import R2.a;
import W2.c;
import com.bumptech.glide.e;
import com.bumptech.glide.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f1077a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f1078b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public e f1079c;

    /* renamed from: d  reason: collision with root package name */
    public Object f1080d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public int f1081f;

    /* renamed from: g  reason: collision with root package name */
    public Class f1082g;

    /* renamed from: h  reason: collision with root package name */
    public p f1083h;
    public B2.i i;

    /* renamed from: j  reason: collision with root package name */
    public c f1084j;

    /* renamed from: k  reason: collision with root package name */
    public Class f1085k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1086l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1087m;

    /* renamed from: n  reason: collision with root package name */
    public f f1088n;

    /* renamed from: o  reason: collision with root package name */
    public com.bumptech.glide.f f1089o;

    /* renamed from: p  reason: collision with root package name */
    public n f1090p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f1091q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f1092r;

    public final ArrayList a() {
        boolean z = this.f1087m;
        ArrayList arrayList = this.f1078b;
        if (!z) {
            this.f1087m = true;
            arrayList.clear();
            ArrayList b8 = b();
            int size = b8.size();
            for (int i8 = 0; i8 < size; i8++) {
                p pVar = (p) b8.get(i8);
                if (!arrayList.contains(pVar.f1974a)) {
                    arrayList.add(pVar.f1974a);
                }
                int i9 = 0;
                while (true) {
                    List list = pVar.f1975b;
                    if (i9 >= list.size()) {
                        break;
                    }
                    if (!arrayList.contains(list.get(i9))) {
                        arrayList.add(list.get(i9));
                    }
                    i9++;
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        boolean z = this.f1086l;
        ArrayList arrayList = this.f1077a;
        if (!z) {
            this.f1086l = true;
            arrayList.clear();
            List g8 = this.f1079c.b().g(this.f1080d);
            int size = g8.size();
            for (int i8 = 0; i8 < size; i8++) {
                p a8 = ((q) g8.get(i8)).a(this.f1080d, this.e, this.f1081f, this.i);
                if (a8 != null) {
                    arrayList.add(a8);
                }
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: W2.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: W2.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: W2.k} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final D2.B c(java.lang.Class r11) {
        /*
            r10 = this;
            com.bumptech.glide.e r0 = r10.f1079c
            com.bumptech.glide.i r0 = r0.b()
            java.lang.Class r7 = r10.f1082g
            java.lang.Class r8 = r10.f1085k
            R2.b r1 = r0.i
            java.util.concurrent.atomic.AtomicReference r2 = r1.f4334b
            r3 = 0
            java.lang.Object r2 = r2.getAndSet(r3)
            W2.k r2 = (W2.k) r2
            if (r2 != 0) goto L_0x001c
            W2.k r2 = new W2.k
            r2.<init>()
        L_0x001c:
            r2.f6169a = r11
            r2.f6170b = r7
            r2.f6171c = r8
            Y.e r4 = r1.f4333a
            monitor-enter(r4)
            Y.e r5 = r1.f4333a     // Catch:{ all -> 0x0062 }
            java.lang.Object r5 = r5.get(r2)     // Catch:{ all -> 0x0062 }
            D2.B r5 = (D2.B) r5     // Catch:{ all -> 0x0062 }
            monitor-exit(r4)     // Catch:{ all -> 0x0062 }
            java.util.concurrent.atomic.AtomicReference r1 = r1.f4334b
            r1.set(r2)
            R2.b r1 = r0.i
            r1.getClass()
            D2.B r1 = R2.b.f4332c
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0041
            goto L_0x0061
        L_0x0041:
            if (r5 != 0) goto L_0x0060
            java.util.ArrayList r5 = r0.e(r11, r7, r8)
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L_0x004e
            goto L_0x005a
        L_0x004e:
            D2.B r9 = new D2.B
            B.q0 r6 = r0.f9006j
            r1 = r9
            r2 = r11
            r3 = r7
            r4 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r3 = r9
        L_0x005a:
            R2.b r0 = r0.i
            r0.a(r11, r7, r8, r3)
            goto L_0x0061
        L_0x0060:
            r3 = r5
        L_0x0061:
            return r3
        L_0x0062:
            r11 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0062 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: D2.i.c(java.lang.Class):D2.B");
    }

    public final b d(Object obj) {
        b bVar;
        s0 s0Var = this.f1079c.b().f9000b;
        Class<?> cls = obj.getClass();
        synchronized (s0Var) {
            Iterator it = s0Var.f949a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    bVar = null;
                    break;
                }
                a aVar = (a) it.next();
                if (aVar.f4330a.isAssignableFrom(cls)) {
                    bVar = aVar.f4331b;
                    break;
                }
            }
        }
        if (bVar != null) {
            return bVar;
        }
        Class<?> cls2 = obj.getClass();
        throw new g("Failed to find source encoder for data class: " + cls2);
    }

    public final m e(Class cls) {
        m mVar = (m) this.f1084j.get(cls);
        if (mVar == null) {
            Iterator it = ((C0105w) this.f1084j.entrySet()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    mVar = (m) entry.getValue();
                    break;
                }
            }
        }
        if (mVar != null) {
            return mVar;
        }
        if (!this.f1084j.isEmpty() || !this.f1091q) {
            return J2.c.f2499b;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }
}
