package A4;

import B.C0003d;
import B.q0;
import B.t0;
import D.C0035b0;
import D.C0054l;
import D2.G;
import F.h;
import F2.e;
import H3.L;
import H3.O;
import H3.P;
import H3.i0;
import L3.b;
import M.c;
import M.k;
import M0.Q;
import M0.V;
import N.f;
import P0.l;
import Q7.g;
import S4.a;
import T0.C0232y;
import T0.M;
import T5.C0260n;
import T5.O0;
import T5.Y;
import U.p;
import U.r;
import U.s;
import Y1.y;
import android.content.Context;
import android.content.Intent;
import android.hardware.camera2.CameraCaptureSession;
import android.os.Bundle;
import android.util.ArrayMap;
import android.util.Log;
import android.util.Size;
import android.view.AttachedSurfaceControl;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.window.SurfaceSyncGroup;
import androidx.emoji2.text.i;
import androidx.emoji2.text.q;
import androidx.fragment.app.C0455f;
import androidx.fragment.app.W;
import androidx.lifecycle.z;
import com.samsung.android.knox.EnterpriseDeviceManager;
import de.ozerov.fully.C0663a0;
import de.ozerov.fully.C0752p;
import de.ozerov.fully.MyWebView;
import de.ozerov.fully.V4;
import f1.C0886E;
import f1.C0890c;
import f1.C0891d;
import f1.n;
import g5.C0962a;
import h1.C1031B;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import org.acra.sender.LegacySenderService;
import r7.C1395d;
import u.C1455O;
import u.C1465f;
import u.C1467h;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f101U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Object f102V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ Object f103W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ Object f104X;

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i) {
        this.f101U = i;
        this.f102V = obj;
        this.f103W = obj2;
        this.f104X = obj3;
    }

    public final void run() {
        boolean z;
        switch (this.f101U) {
            case 0:
                g gVar = (g) this.f102V;
                Y y8 = gVar.f16289U;
                C0962a aVar = (C0962a) this.f104X;
                if (y8 == null || gVar.f116X != null) {
                    aVar.f12019U.a(g.z());
                    return;
                }
                gVar.f116X = g.f113Z;
                ((O0) ((C0260n) y8.channel()).pipeline()).fireUserEventTriggered(new a((a) this.f103W, aVar));
                return;
            case 1:
                int i = LegacySenderService.f14300U;
                LegacySenderService legacySenderService = (LegacySenderService) this.f102V;
                q0 q0Var = new q0((Context) legacySenderService, (C1395d) this.f103W);
                Bundle extras = ((Intent) this.f104X).getExtras();
                if (extras == null) {
                    extras = new Bundle();
                }
                q0Var.C(false, extras);
                legacySenderService.stopSelf();
                return;
            case 2:
                z zVar = (z) ((A1.d) this.f102V).f35V;
                C0035b0 b0Var = (C0035b0) this.f103W;
                if (b0Var != null) {
                    zVar.i(b0Var);
                }
                zVar.f((C0035b0) this.f104X);
                return;
            case 3:
                if (((c) this.f102V).f2728d0) {
                    ((Runnable) this.f103W).run();
                    return;
                } else {
                    ((Runnable) this.f104X).run();
                    return;
                }
            case 4:
                ((q0) this.f102V).j((k) this.f103W, (Map.Entry) this.f104X);
                return;
            case 5:
                if (((f) this.f102V).f3217Z) {
                    ((Runnable) this.f103W).run();
                    return;
                } else {
                    ((Runnable) this.f104X).run();
                    return;
                }
            case 6:
                M m8 = (M) this.f102V;
                m8.getClass();
                i0 g8 = ((L) this.f103W).g();
                U0.d dVar = m8.f4701c;
                Q q7 = dVar.f5330a0;
                q7.getClass();
                C1455O o2 = dVar.f5327X;
                o2.getClass();
                o2.f15530b = O.m(g8);
                if (!g8.isEmpty()) {
                    o2.e = (C1031B) g8.get(0);
                    C1031B b8 = (C1031B) this.f104X;
                    b8.getClass();
                    o2.f15533f = b8;
                }
                if (((C1031B) o2.f15532d) == null) {
                    o2.f15532d = C1455O.e(q7, (O) o2.f15530b, (C1031B) o2.e, (V) o2.f15529a);
                }
                o2.o(((C0232y) q7).z());
                return;
            case 7:
                r rVar = ((s) this.f102V).f5307f;
                rVar.a();
                boolean z6 = rVar.f5305a0;
                t0 t0Var = (t0) this.f103W;
                if (z6) {
                    rVar.f5305a0 = false;
                    t0Var.c();
                    t0Var.i.a((Object) null);
                    return;
                }
                rVar.f5300V = t0Var;
                rVar.f5302X = (D.O) this.f104X;
                Size size = t0Var.f307b;
                rVar.f5299U = size;
                rVar.f5304Z = false;
                if (!rVar.b()) {
                    h.j("SurfaceViewImpl", "Wait for new Surface creation.");
                    rVar.f5306b0.e.getHolder().setFixedSize(size.getWidth(), size.getHeight());
                    return;
                }
                return;
            case 8:
                P p3 = (P) this.f102V;
                p3.getClass();
                AttachedSurfaceControl h5 = ((SurfaceView) this.f103W).getRootSurfaceControl();
                if (h5 != null) {
                    SurfaceSyncGroup d8 = y.d();
                    p3.f2027U = d8;
                    l.j(d8.add(h5, new C0663a0(5)));
                    ((p) this.f104X).run();
                    h5.applyTransactionOnDraw(B3.l.j());
                    return;
                }
                return;
            case 9:
                e eVar = (e) this.f102V;
                C0003d dVar2 = (C0003d) this.f103W;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f104X;
                eVar.getClass();
                try {
                    q s8 = n2.a.s(eVar.f1521V);
                    if (s8 != null) {
                        androidx.emoji2.text.p pVar = (androidx.emoji2.text.p) ((i) s8.f7786b);
                        synchronized (pVar.f7811X) {
                            pVar.f7813Z = threadPoolExecutor;
                        }
                        ((i) s8.f7786b).a(new androidx.emoji2.text.k(dVar2, threadPoolExecutor));
                        return;
                    }
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                } catch (Throwable th) {
                    dVar2.B(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 10:
                ViewGroup viewGroup = (ViewGroup) this.f102V;
                P6.f.e(viewGroup, "$container");
                C0455f fVar = (C0455f) this.f104X;
                P6.f.e(fVar, "this$0");
                viewGroup.endViewTransition((View) this.f103W);
                ((W) fVar.f7996c.f1328V).c(fVar);
                return;
            case 11:
                Context context = (Context) this.f103W;
                d4.k kVar = (d4.k) this.f104X;
                C0752p.f10878c = "working";
                C0752p.f10877b = null;
                for (String trim : n2.a.e1((String) this.f102V)) {
                    String trim2 = trim.trim();
                    if (!trim2.isEmpty() && !trim2.startsWith("#")) {
                        if (kVar.l1() > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (C0752p.b(context, trim2, false, z)) {
                            C0752p.f10876a = null;
                            return;
                        }
                    }
                }
                C0752p.f10878c = "idle";
                C0752p.f10877b = null;
                C0752p.f10876a = null;
                return;
            case 12:
                ((V4) this.f102V).l((MyWebView) this.f103W, (String) this.f104X);
                return;
            case 13:
                n nVar = (n) ((C0891d) this.f102V).f11512W.f7669V;
                nVar.f11578c = (String) this.f103W;
                C0890c cVar = (C0890c) this.f104X;
                C0886E u3 = cVar.u();
                f1.p pVar2 = nVar.f11579d;
                if (u3 != null) {
                    f1.k kVar2 = pVar2.f11588X;
                    int d9 = cVar.d();
                    kVar2.f11562c0.f11628W.put(Integer.valueOf(d9), u3);
                    pVar2.p0 = true;
                }
                pVar2.z();
                return;
            case EnterpriseDeviceManager.KNOX_2_3 /*14*/:
                U.c cVar2 = ((C1467h) this.f102V).f15646q0;
                C0054l lVar = (C0054l) this.f104X;
                ((HashSet) cVar2.f5254b).add(lVar);
                ((ArrayMap) cVar2.f5255c).put(lVar, (Executor) this.f103W);
                return;
            case EnterpriseDeviceManager.KNOX_2_4 /*15*/:
                ((v.f) this.f102V).f15848a.onSurfacePrepared((CameraCaptureSession) this.f103W, (Surface) this.f104X);
                return;
            default:
                G g9 = (G) this.f102V;
                g9.getClass();
                Log.d("RequestMonitor", "RequestListener " + ((C1465f) this.f103W) + " done " + g9);
                ((List) g9.f1052V).remove((b) this.f104X);
                return;
        }
    }
}
