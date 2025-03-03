package u;

import A1.d;
import B.f0;
import android.text.TextUtils;
import d4.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import n2.a;

/* renamed from: u.k  reason: case insensitive filesystem */
public final /* synthetic */ class C1470k implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f15656U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ C1479t f15657V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ ArrayList f15658W;

    public /* synthetic */ C1470k(C1479t tVar, ArrayList arrayList, int i) {
        this.f15656U = i;
        this.f15657V = tVar;
        this.f15658W = arrayList;
    }

    public final void run() {
        k kVar;
        switch (this.f15656U) {
            case 0:
                C1479t tVar = this.f15657V;
                ArrayList arrayList = this.f15658W;
                tVar.getClass();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                boolean z = false;
                boolean z6 = false;
                while (it.hasNext()) {
                    C1461b bVar = (C1461b) it.next();
                    if (tVar.f15686U.F(bVar.f15594a)) {
                        d dVar = tVar.f15686U;
                        ((LinkedHashMap) dVar.f36W).remove(bVar.f15594a);
                        arrayList2.add(bVar.f15594a);
                        if (bVar.f15595b == f0.class) {
                            z6 = true;
                        }
                    }
                }
                if (!arrayList2.isEmpty()) {
                    tVar.u("Use cases [" + TextUtils.join(", ", arrayList2) + "] now DETACHED for camera", (Throwable) null);
                    if (z6) {
                        tVar.f15692a0.f15631a0.getClass();
                    }
                    tVar.q();
                    if (tVar.f15686U.w().isEmpty()) {
                        tVar.f15692a0.f15635e0.c(false);
                    } else {
                        tVar.M();
                    }
                    if (tVar.f15686U.v().isEmpty()) {
                        tVar.f15692a0.c();
                        tVar.E();
                        tVar.f15692a0.h(false);
                        tVar.f15697f0 = tVar.A();
                        tVar.u("Closing camera.", (Throwable) null);
                        switch (C1477r.h(tVar.f15685B0)) {
                            case 3:
                                if (tVar.f15695d0 == null) {
                                    z = true;
                                }
                                a.m((String) null, z);
                                tVar.F(3);
                                return;
                            case 5:
                            case 6:
                            case 7:
                                if (tVar.f15693b0.a() || ((kVar = (k) tVar.f15684A0.f10050V) != null && !((AtomicBoolean) kVar.f9767W).get())) {
                                    z = true;
                                }
                                tVar.f15684A0.o();
                                tVar.F(5);
                                if (z) {
                                    a.m((String) null, tVar.f15698g0.isEmpty());
                                    tVar.s();
                                    return;
                                }
                                return;
                            case 8:
                            case 9:
                                tVar.F(5);
                                tVar.r();
                                return;
                            default:
                                tVar.u("close() ignored due to being in state: ".concat(C1477r.i(tVar.f15685B0)), (Throwable) null);
                                return;
                        }
                    } else {
                        tVar.L();
                        tVar.E();
                        if (tVar.f15685B0 == 9) {
                            tVar.C();
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
            default:
                ArrayList arrayList3 = this.f15658W;
                C1479t tVar2 = this.f15657V;
                C1467h hVar = tVar2.f15692a0;
                try {
                    tVar2.I(arrayList3);
                    return;
                } finally {
                    hVar.c();
                }
        }
    }
}
