package Z0;

import H3.M;
import H3.O;
import H3.P;
import H3.i0;
import M0.Y;
import M0.r;
import P0.l;
import P0.z;
import R0.A;
import R0.g;
import R0.h;
import U0.j;
import a1.e;
import a1.f;
import android.net.Uri;
import android.util.Pair;
import h1.C1036b;
import i1.C1092e;
import i1.k;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k1.C1134c;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final c f6789a;

    /* renamed from: b  reason: collision with root package name */
    public final h f6790b;

    /* renamed from: c  reason: collision with root package name */
    public final h f6791c;

    /* renamed from: d  reason: collision with root package name */
    public final P f6792d;
    public final Uri[] e;

    /* renamed from: f  reason: collision with root package name */
    public final r[] f6793f;

    /* renamed from: g  reason: collision with root package name */
    public final e f6794g;

    /* renamed from: h  reason: collision with root package name */
    public final Y f6795h;
    public final List i;

    /* renamed from: j  reason: collision with root package name */
    public final P f6796j = new P(27);

    /* renamed from: k  reason: collision with root package name */
    public final j f6797k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f6798l;

    /* renamed from: m  reason: collision with root package name */
    public byte[] f6799m = z.f3752f;

    /* renamed from: n  reason: collision with root package name */
    public C1036b f6800n;

    /* renamed from: o  reason: collision with root package name */
    public Uri f6801o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f6802p;

    /* renamed from: q  reason: collision with root package name */
    public k1.r f6803q;

    /* renamed from: r  reason: collision with root package name */
    public long f6804r = -9223372036854775807L;

    /* renamed from: s  reason: collision with root package name */
    public boolean f6805s;

    /* JADX WARNING: type inference failed for: r3v1, types: [Z0.g, k1.c, k1.r] */
    public i(c cVar, e eVar, Uri[] uriArr, r[] rVarArr, P p3, A a8, P p8, List list, j jVar) {
        this.f6789a = cVar;
        this.f6794g = eVar;
        this.e = uriArr;
        this.f6793f = rVarArr;
        this.f6792d = p8;
        this.i = list;
        this.f6797k = jVar;
        h g8 = ((g) p3.f2027U).g();
        this.f6790b = g8;
        if (a8 != null) {
            g8.o(a8);
        }
        this.f6791c = ((g) p3.f2027U).g();
        this.f6795h = new Y("", rVarArr);
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < uriArr.length; i8++) {
            if ((rVarArr[i8].f3029f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i8));
            }
        }
        Y y8 = this.f6795h;
        int[] y9 = E.e.y(arrayList);
        ? cVar2 = new C1134c(y8, y9);
        cVar2.f6784g = cVar2.a(y8.f2888d[y9[0]]);
        this.f6803q = cVar2;
    }

    public final k[] a(j jVar, long j7) {
        int i8;
        int i9;
        boolean z;
        List list;
        j jVar2 = jVar;
        if (jVar2 == null) {
            i8 = -1;
        } else {
            i8 = this.f6795h.b(jVar2.f12662X);
        }
        int length = this.f6803q.length();
        k[] kVarArr = new k[length];
        boolean z6 = false;
        int i10 = 0;
        while (i10 < length) {
            int g8 = this.f6803q.g(i10);
            Uri uri = this.e[g8];
            e eVar = this.f6794g;
            if (!eVar.c(uri)) {
                kVarArr[i10] = k.f12708Q;
                i9 = i10;
            } else {
                a1.k a8 = eVar.a(z6, uri);
                a8.getClass();
                long j8 = a8.f7082h - eVar.f7056h0;
                if (g8 != i8) {
                    z = true;
                } else {
                    z = false;
                }
                long j9 = j8;
                i9 = i10;
                a1.k kVar = a8;
                Pair c8 = c(jVar, z, a8, j8, j7);
                long longValue = ((Long) c8.first).longValue();
                int intValue = ((Integer) c8.second).intValue();
                int i11 = (int) (longValue - kVar.f7084k);
                if (i11 >= 0) {
                    O o2 = kVar.f7091r;
                    if (o2.size() >= i11) {
                        ArrayList arrayList = new ArrayList();
                        if (i11 < o2.size()) {
                            if (intValue != -1) {
                                a1.h hVar = (a1.h) o2.get(i11);
                                if (intValue == 0) {
                                    arrayList.add(hVar);
                                } else if (intValue < hVar.f7063g0.size()) {
                                    O o8 = hVar.f7063g0;
                                    arrayList.addAll(o8.subList(intValue, o8.size()));
                                }
                                i11++;
                            }
                            arrayList.addAll(o2.subList(i11, o2.size()));
                            intValue = 0;
                        }
                        if (kVar.f7087n != -9223372036854775807L) {
                            if (intValue == -1) {
                                intValue = 0;
                            }
                            O o9 = kVar.f7092s;
                            if (intValue < o9.size()) {
                                arrayList.addAll(o9.subList(intValue, o9.size()));
                            }
                        }
                        list = DesugarCollections.unmodifiableList(arrayList);
                        kVarArr[i9] = new f(j9, list);
                    }
                }
                M m8 = O.f2026V;
                list = i0.f2073Y;
                kVarArr[i9] = new f(j9, list);
            }
            i10 = i9 + 1;
            z6 = false;
        }
        return kVarArr;
    }

    public final int b(j jVar) {
        O o2;
        if (jVar.f6816i0 == -1) {
            return 1;
        }
        a1.k a8 = this.f6794g.a(false, this.e[this.f6795h.b(jVar.f12662X)]);
        a8.getClass();
        int i8 = (int) (jVar.f12707d0 - a8.f7084k);
        if (i8 < 0) {
            return 1;
        }
        O o8 = a8.f7091r;
        if (i8 < o8.size()) {
            o2 = ((a1.h) o8.get(i8)).f7063g0;
        } else {
            o2 = a8.f7092s;
        }
        int size = o2.size();
        int i9 = jVar.f6816i0;
        if (i9 >= size) {
            return 2;
        }
        f fVar = (f) o2.get(i9);
        if (fVar.f7058g0) {
            return 0;
        }
        if (Objects.equals(Uri.parse(l.y(a8.f7111a, fVar.f7064U)), jVar.f12660V.f4277a)) {
            return 1;
        }
        return 2;
    }

    public final Pair c(j jVar, boolean z, a1.k kVar, long j7, long j8) {
        O o2;
        long j9;
        boolean z6 = true;
        int i8 = -1;
        if (jVar == null || z) {
            long j10 = kVar.f7094u + j7;
            if (jVar != null && !this.f6802p) {
                j8 = jVar.f12665a0;
            }
            boolean z8 = kVar.f7088o;
            long j11 = kVar.f7084k;
            O o8 = kVar.f7091r;
            if (!z8 && j8 >= j10) {
                return new Pair(Long.valueOf(j11 + ((long) o8.size())), -1);
            }
            long j12 = j8 - j7;
            Long valueOf = Long.valueOf(j12);
            int i9 = 0;
            if (this.f6794g.f7055g0 && jVar != null) {
                z6 = false;
            }
            int c8 = z.c(o8, valueOf, z6);
            long j13 = ((long) c8) + j11;
            if (c8 >= 0) {
                a1.h hVar = (a1.h) o8.get(c8);
                O o9 = kVar.f7092s;
                if (j12 < hVar.f7068Y + hVar.f7066W) {
                    o2 = hVar.f7063g0;
                } else {
                    o2 = o9;
                }
                while (true) {
                    if (i9 >= o2.size()) {
                        break;
                    }
                    f fVar = (f) o2.get(i9);
                    if (j12 >= fVar.f7068Y + fVar.f7066W) {
                        i9++;
                    } else if (fVar.f7057f0) {
                        if (o2 == o9) {
                            j9 = 1;
                        } else {
                            j9 = 0;
                        }
                        j13 += j9;
                        i8 = i9;
                    }
                }
            }
            return new Pair(Long.valueOf(j13), Integer.valueOf(i8));
        }
        boolean z9 = jVar.f6808B0;
        long j14 = jVar.f12707d0;
        int i10 = jVar.f6816i0;
        if (!z9) {
            return new Pair(Long.valueOf(j14), Integer.valueOf(i10));
        }
        if (i10 == -1) {
            j14 = jVar.a();
        }
        Long valueOf2 = Long.valueOf(j14);
        if (i10 != -1) {
            i8 = i10 + 1;
        }
        return new Pair(valueOf2, Integer.valueOf(i8));
    }

    public final e d(Uri uri, int i8, boolean z) {
        Uri uri2 = uri;
        if (uri2 == null) {
            return null;
        }
        P p3 = this.f6796j;
        byte[] bArr = (byte[]) ((d) p3.f2027U).remove(uri2);
        if (bArr != null) {
            byte[] bArr2 = (byte[]) ((d) p3.f2027U).put(uri2, bArr);
            return null;
        }
        R0.l lVar = new R0.l(uri, 1, (byte[]) null, Collections.emptyMap(), 0, -1, (String) null, 1);
        r rVar = this.f6793f[i8];
        int n4 = this.f6803q.n();
        Object r8 = this.f6803q.r();
        byte[] bArr3 = this.f6799m;
        C1092e eVar = new C1092e(this.f6791c, lVar, 3, rVar, n4, r8, -9223372036854775807L, -9223372036854775807L);
        if (bArr3 == null) {
            bArr3 = z.f3752f;
        }
        eVar.f6779d0 = bArr3;
        return eVar;
    }
}
