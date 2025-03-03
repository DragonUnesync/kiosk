package n1;

import H3.O;
import M0.C0129q;
import M0.I;
import M0.h0;
import M0.r;
import P0.m;
import P0.t;
import P0.v;
import P0.z;
import Z1.b;
import android.content.Context;
import android.media.MediaFormat;
import android.os.SystemClock;
import android.util.Pair;
import de.ozerov.fully.K2;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArraySet;
import k2.C1160q;

public final class l {

    /* renamed from: o  reason: collision with root package name */
    public static final b f13641o = new b(1);

    /* renamed from: a  reason: collision with root package name */
    public final C1244i f13642a;

    /* renamed from: b  reason: collision with root package name */
    public final r f13643b;

    /* renamed from: c  reason: collision with root package name */
    public final v f13644c;

    /* renamed from: d  reason: collision with root package name */
    public final k f13645d;
    public final O e;

    /* renamed from: f  reason: collision with root package name */
    public final K2 f13646f;

    /* renamed from: g  reason: collision with root package name */
    public final t f13647g;

    /* renamed from: h  reason: collision with root package name */
    public final CopyOnWriteArraySet f13648h;
    public r i;

    /* renamed from: j  reason: collision with root package name */
    public p f13649j;

    /* renamed from: k  reason: collision with root package name */
    public v f13650k;

    /* renamed from: l  reason: collision with root package name */
    public Pair f13651l;

    /* renamed from: m  reason: collision with root package name */
    public int f13652m;

    /* renamed from: n  reason: collision with root package name */
    public int f13653n = 0;

    public l(V0.r rVar) {
        C1244i iVar = new C1244i(this, (Context) rVar.f5586b);
        this.f13642a = iVar;
        t tVar = (t) rVar.f5590g;
        this.f13647g = tVar;
        r rVar2 = (r) rVar.f5587c;
        this.f13643b = rVar2;
        rVar2.f13675k = tVar;
        v vVar = new v(new C1160q(9, (Object) this), rVar2);
        this.f13644c = vVar;
        k kVar = (k) rVar.e;
        P0.l.k(kVar);
        this.f13645d = kVar;
        this.e = (O) rVar.f5589f;
        this.f13646f = new K2(rVar2, vVar);
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.f13648h = copyOnWriteArraySet;
        copyOnWriteArraySet.add(iVar);
    }

    public static void a(l lVar, long j7, long j8) {
        r rVar;
        v vVar = lVar.f13644c;
        m mVar = vVar.f13702f;
        int i8 = mVar.f3720b;
        if (i8 != 0) {
            if (i8 != 0) {
                long j9 = ((long[]) mVar.f3722d)[mVar.f3719a];
                Long l8 = (Long) vVar.e.f(j9);
                r rVar2 = vVar.f13699b;
                if (!(l8 == null || l8.longValue() == vVar.i)) {
                    vVar.i = l8.longValue();
                    rVar2.d(2);
                }
                r rVar3 = rVar2;
                long j10 = j9;
                int a8 = vVar.f13699b.a(j9, j7, j8, vVar.i, false, vVar.f13700c);
                boolean z = true;
                l lVar2 = (l) vVar.f13698a.f13026V;
                if (a8 == 0 || a8 == 1) {
                    vVar.f13705j = j10;
                    long b8 = mVar.b();
                    h0 h0Var = (h0) vVar.f13701d.f(b8);
                    if (h0Var != null && !h0Var.equals(h0.f2952d) && !h0Var.equals(vVar.f13704h)) {
                        vVar.f13704h = h0Var;
                        C0129q qVar = new C0129q();
                        qVar.f3006t = h0Var.f2953a;
                        qVar.f3007u = h0Var.f2954b;
                        qVar.f2999m = I.o("video/raw");
                        lVar2.i = new r(qVar);
                        Iterator it = lVar2.f13648h.iterator();
                        while (it.hasNext()) {
                            C1244i iVar = (C1244i) it.next();
                            iVar.f13638m.execute(new C1243h(iVar, iVar.f13637l, h0Var));
                        }
                    }
                    r rVar4 = rVar3;
                    if (rVar4.f13670d == 3) {
                        z = false;
                    }
                    rVar4.f13670d = 3;
                    rVar4.f13675k.getClass();
                    rVar4.f13671f = z.O(SystemClock.elapsedRealtime());
                    if (z && lVar2.f13651l != null) {
                        Iterator it2 = lVar2.f13648h.iterator();
                        while (it2.hasNext()) {
                            C1244i iVar2 = (C1244i) it2.next();
                            iVar2.f13638m.execute(new C1243h(iVar2, iVar2.f13637l, 1));
                        }
                    }
                    if (lVar2.f13649j != null) {
                        r rVar5 = lVar2.i;
                        if (rVar5 == null) {
                            rVar = new r(new C0129q());
                        } else {
                            rVar = rVar5;
                        }
                        p pVar = lVar2.f13649j;
                        lVar2.f13647g.getClass();
                        pVar.c(b8, System.nanoTime(), rVar, (MediaFormat) null);
                    }
                    P0.l.k((Object) null);
                    throw null;
                } else if (a8 == 2 || a8 == 3 || a8 == 4) {
                    vVar.f13705j = j10;
                    mVar.b();
                    Iterator it3 = lVar2.f13648h.iterator();
                    while (it3.hasNext()) {
                        C1244i iVar3 = (C1244i) it3.next();
                        iVar3.f13638m.execute(new C1243h(iVar3, iVar3.f13637l, 2));
                    }
                    P0.l.k((Object) null);
                    throw null;
                } else if (a8 != 5) {
                    throw new IllegalStateException(String.valueOf(a8));
                }
            } else {
                throw new NoSuchElementException();
            }
        }
    }
}
