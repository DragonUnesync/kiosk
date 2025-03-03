package u4;

import D2.o;
import S5.C0185n;
import i5.k;
import i5.p;

/* renamed from: u4.b  reason: case insensitive filesystem */
public final class C1493b {

    /* renamed from: c  reason: collision with root package name */
    public static final C1493b f15776c = new C1493b(k.f12748U);

    /* renamed from: a  reason: collision with root package name */
    public final Object f15777a;

    /* renamed from: b  reason: collision with root package name */
    public int f15778b = -1;

    public C1493b(p pVar) {
        this.f15777a = pVar;
    }

    public static C1493b a(o oVar) {
        C1493b bVar = f15776c;
        if (oVar == null) {
            return bVar;
        }
        p b8 = oVar.b();
        if (b8.isEmpty()) {
            return bVar;
        }
        return new C1493b(b8);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List, java.lang.Object, i5.p] */
    public final void b(C0185n nVar) {
        int i = 0;
        while (true) {
            ? r12 = this.f15777a;
            if (i < r12.size()) {
                c cVar = (c) r12.get(i);
                cVar.getClass();
                nVar.writeByte(38);
                cVar.f15779U.d(nVar);
                cVar.f15780V.d(nVar);
                i++;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.List, java.lang.Object, i5.p] */
    public final int c() {
        if (this.f15778b == -1) {
            int i = 0;
            int i8 = 0;
            while (true) {
                ? r22 = this.f15777a;
                if (i >= r22.size()) {
                    break;
                }
                c cVar = (c) r22.get(i);
                i8 += cVar.f15780V.e() + cVar.f15779U.e() + 1;
                i++;
            }
            this.f15778b = i8;
        }
        return this.f15778b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1493b)) {
            return false;
        }
        return this.f15777a.equals(((C1493b) obj).f15777a);
    }

    public final int hashCode() {
        return this.f15777a.hashCode();
    }

    public final String toString() {
        return this.f15777a.toString();
    }
}
