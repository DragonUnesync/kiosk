package R0;

import H3.i0;
import P0.l;
import P0.z;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import l1.h;

/* renamed from: R0.c  reason: case insensitive filesystem */
public abstract class C0158c implements h {

    /* renamed from: U  reason: collision with root package name */
    public final boolean f4250U;

    /* renamed from: V  reason: collision with root package name */
    public final ArrayList f4251V = new ArrayList(1);

    /* renamed from: W  reason: collision with root package name */
    public int f4252W;

    /* renamed from: X  reason: collision with root package name */
    public l f4253X;

    public C0158c(boolean z) {
        this.f4250U = z;
    }

    public final void b(int i) {
        boolean z;
        l lVar = this.f4253X;
        int i8 = z.f3748a;
        for (int i9 = 0; i9 < this.f4252W; i9++) {
            boolean z6 = this.f4250U;
            h hVar = (h) ((A) this.f4251V.get(i9));
            synchronized (hVar) {
                i0 i0Var = h.f13114n;
                if (!z6 || (lVar.f4283h & 8) == 8) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    hVar.f13127h += (long) i;
                }
            }
        }
    }

    public final void e() {
        boolean z;
        boolean z6;
        l lVar = this.f4253X;
        int i = z.f3748a;
        for (int i8 = 0; i8 < this.f4252W; i8++) {
            boolean z8 = this.f4250U;
            h hVar = (h) ((A) this.f4251V.get(i8));
            synchronized (hVar) {
                try {
                    i0 i0Var = h.f13114n;
                    if (!z8 || (lVar.f4283h & 8) == 8) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        if (hVar.f13125f > 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        l.j(z6);
                        hVar.f13123c.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        int i9 = (int) (elapsedRealtime - hVar.f13126g);
                        hVar.i += (long) i9;
                        long j7 = hVar.f13128j;
                        long j8 = hVar.f13127h;
                        hVar.f13128j = j7 + j8;
                        if (i9 > 0) {
                            hVar.e.a((int) Math.sqrt((double) j8), (((float) j8) * 8000.0f) / ((float) i9));
                            if (hVar.i < 2000) {
                                if (hVar.f13128j >= 524288) {
                                }
                                hVar.c(i9, hVar.f13127h, hVar.f13129k);
                                hVar.f13126g = elapsedRealtime;
                                hVar.f13127h = 0;
                            }
                            hVar.f13129k = (long) hVar.e.b();
                            hVar.c(i9, hVar.f13127h, hVar.f13129k);
                            hVar.f13126g = elapsedRealtime;
                            hVar.f13127h = 0;
                        }
                        hVar.f13125f--;
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
        }
        this.f4253X = null;
    }

    public final void g() {
        for (int i = 0; i < this.f4252W; i++) {
            ((A) this.f4251V.get(i)).getClass();
        }
    }

    public final void h(l lVar) {
        boolean z;
        this.f4253X = lVar;
        for (int i = 0; i < this.f4252W; i++) {
            boolean z6 = this.f4250U;
            h hVar = (h) ((A) this.f4251V.get(i));
            synchronized (hVar) {
                try {
                    i0 i0Var = h.f13114n;
                    if (!z6 || (lVar.f4283h & 8) == 8) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        if (hVar.f13125f == 0) {
                            hVar.f13123c.getClass();
                            hVar.f13126g = SystemClock.elapsedRealtime();
                        }
                        hVar.f13125f++;
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
        }
    }

    public Map j() {
        return Collections.emptyMap();
    }

    public final void o(A a8) {
        a8.getClass();
        ArrayList arrayList = this.f4251V;
        if (!arrayList.contains(a8)) {
            arrayList.add(a8);
            this.f4252W++;
        }
    }
}
