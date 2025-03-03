package k2;

import F.h;
import G.c;
import V0.C0336a;
import V0.C0337b;
import V0.i;
import W1.e;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipDescription;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Size;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.Surface;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.E;
import com.samsung.android.knox.EnterpriseDeviceManager;
import de.ozerov.fully.G3;
import h.C1006G;
import java.io.IOException;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import l1.k;
import l1.m;
import l1.p;
import l3.C1173a;
import m1.C1207b;
import n.C1224E;
import n.C1231g;
import n.x;
import n1.C1240e;
import n1.y;
import n2.a;
import o.C1277k;
import o.C1283n;
import o.H0;
import o.Y;
import o.h1;
import o.l1;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import r2.C1387f;
import r2.l;
import r2.o;
import r2.v;
import r2.z;
import s0.C1402b;
import u.C1449I;
import u.C1455O;
import u.C1477r;
import u.c0;
import u2.C1490a;
import u2.q;
import u2.t;
import u2.u;
import v0.C1530c;
import v0.C1532e;
import v0.C1533f;
import w.d;
import w0.C1576e;
import w0.C1577f;
import x0.C1599e;

/* renamed from: k2.q  reason: case insensitive filesystem */
public class C1160q implements C1159p, C1173a, k, H0, y, x, n.k, Y, c, c0, C1530c, C1532e {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f13025U;

    /* renamed from: V  reason: collision with root package name */
    public Object f13026V;

    public /* synthetic */ C1160q(int i, Object obj) {
        this.f13025U = i;
        this.f13026V = obj;
    }

    public static C1160q G(v.k kVar) {
        DynamicRangeProfiles b8;
        boolean z;
        int i = Build.VERSION.SDK_INT;
        C1160q qVar = null;
        if (i >= 33 && (b8 = C0337b.b(kVar.a(CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES))) != null) {
            if (i >= 33) {
                z = true;
            } else {
                z = false;
            }
            a.m("DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher.", z);
            qVar = new C1160q(27, (Object) new w.c(b8));
        }
        if (qVar == null) {
            return d.f16149a;
        }
        return qVar;
    }

    public static final void J(Activity activity) {
        ((G3) new C1160q(activity).f13026V).c();
    }

    private final void K(Throwable th) {
        synchronized (((C1449I) this.f13026V).f15498a) {
            try {
                ((C1449I) this.f13026V).f15501d.u();
                int h5 = C1477r.h(((C1449I) this.f13026V).i);
                if (h5 == 3 || h5 == 5 || h5 == 6) {
                    if (!(th instanceof CancellationException)) {
                        h.J("CaptureSession", "Opening session with fail ".concat(C1477r.j(((C1449I) this.f13026V).i)), th);
                        ((C1449I) this.f13026V).c();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void A(m mVar, long j7, long j8, boolean z) {
    }

    public void B(int i, float f8) {
    }

    public void C() {
    }

    public void D(int i) {
        ((ContentInfo.Builder) this.f13026V).setFlags(i);
    }

    public C1576e E(int i) {
        return null;
    }

    public C1576e F(int i) {
        return null;
    }

    public int H(C1490a aVar) {
        o oVar;
        C1387f fVar = (C1387f) this.f13026V;
        fVar.getClass();
        if (aVar instanceof t) {
            z zVar = fVar.e;
            if (aVar != null) {
                zVar.f();
                oVar = (o) ((TreeMap) zVar.f14942g).get((t) aVar);
                if (oVar == null) {
                    throw new IllegalArgumentException("not found");
                }
            } else {
                zVar.getClass();
                throw new NullPointerException("cst == null");
            }
        } else if (aVar instanceof u) {
            z zVar2 = fVar.f14887f;
            if (aVar != null) {
                zVar2.f();
                o oVar2 = (o) ((TreeMap) zVar2.f14942g).get(((u) aVar).f15772U);
                if (oVar2 != null) {
                    oVar = oVar2;
                } else {
                    throw new IllegalArgumentException("not found: " + aVar);
                }
            } else {
                zVar2.getClass();
                throw new NullPointerException("cst == null");
            }
        } else if (aVar instanceof q) {
            v vVar = fVar.i;
            if (aVar != null) {
                vVar.f();
                oVar = (o) vVar.f14929f.get((q) aVar);
                if (oVar == null) {
                    throw new IllegalArgumentException("not found");
                }
            } else {
                vVar.getClass();
                throw new NullPointerException("cst == null");
            }
        } else if (aVar instanceof u2.h) {
            l lVar = fVar.f14889h;
            if (aVar != null) {
                lVar.f();
                oVar = (o) lVar.f14902f.get((u2.h) aVar);
                if (oVar == null) {
                    throw new IllegalArgumentException("not found");
                }
            } else {
                lVar.getClass();
                throw new NullPointerException("cst == null");
            }
        } else {
            oVar = null;
        }
        if (oVar == null) {
            return -1;
        }
        return oVar.e();
    }

    public Size[] I(int i) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f13026V;
        if (i == 34) {
            return streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
        }
        return streamConfigurationMap.getOutputSizes(i);
    }

    public boolean L(int i, int i8, Bundle bundle) {
        return false;
    }

    public void a(n.m mVar, boolean z) {
        if (mVar instanceof C1224E) {
            ((C1224E) mVar).f13410t0.k().c(false);
        }
        x xVar = ((C1277k) this.f13026V).f13982Y;
        if (xVar != null) {
            xVar.a(mVar, z);
        }
    }

    public void b(TotalCaptureResult totalCaptureResult) {
    }

    public ClipData c() {
        return ((ContentInfo) this.f13026V).getClip();
    }

    public C1533f d() {
        return new C1533f(new C1160q(((ContentInfo.Builder) this.f13026V).build()));
    }

    public String[] e() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f13026V).getSupportedFeatures();
    }

    public /* bridge */ /* synthetic */ void f(Object obj) {
        switch (this.f13025U) {
            case EnterpriseDeviceManager.KNOX_2_5:
                Void voidR = (Void) obj;
                return;
            default:
                Void voidR2 = (Void) obj;
                return;
        }
    }

    public void g(int i) {
    }

    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) N7.a.c(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f13026V).getStatics());
    }

    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) N7.a.c(WebkitToCompatConverterBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f13026V).getWebkitToCompatConverter());
    }

    public void h() {
        C1240e eVar = (C1240e) this.f13026V;
        Surface surface = eVar.f13590J1;
        if (surface != null) {
            i iVar = eVar.f13614y1;
            Handler handler = iVar.f5527b;
            if (handler != null) {
                handler.post(new n1.x(iVar, surface, SystemClock.elapsedRealtime()));
            }
            eVar.f13593M1 = true;
        }
    }

    public void i(Bundle bundle) {
        ((ContentInfo.Builder) this.f13026V).setExtras(bundle);
    }

    public void j() {
        C1240e eVar = (C1240e) this.f13026V;
        if (eVar.f13590J1 != null) {
            eVar.F0(0, 1);
        }
    }

    public e k(m mVar, long j7, long j8, IOException iOException, int i) {
        ((W0.d) this.f13026V).f6038V.w(iOException);
        return p.f13148Y;
    }

    public void l(n.m mVar, n.o oVar) {
        ((C1231g) this.f13026V).f13443Z.removeCallbacksAndMessages(mVar);
    }

    public void m(A.h hVar) {
    }

    public boolean n(n.m mVar) {
        C1277k kVar = (C1277k) this.f13026V;
        if (mVar == kVar.f13980W) {
            return false;
        }
        ((C1224E) mVar).f13411u0.getClass();
        kVar.getClass();
        x xVar = kVar.f13982Y;
        if (xVar != null) {
            return xVar.n(mVar);
        }
        return false;
    }

    public float o() {
        Float f8 = (Float) ((v.k) this.f13026V).a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f8 != null && f8.floatValue() >= 1.0f) {
            return f8.floatValue();
        }
        return 1.0f;
    }

    public void p(m mVar, long j7, long j8) {
        boolean z;
        W0.d dVar = (W0.d) this.f13026V;
        synchronized (C1207b.f13344b) {
            z = C1207b.f13345c;
        }
        if (!z) {
            dVar.f6038V.w(new IOException(new ConcurrentModificationException()));
            return;
        }
        dVar.b();
    }

    public boolean q(n.m mVar, MenuItem menuItem) {
        boolean z;
        boolean z6;
        C1283n nVar = ((ActionMenuView) this.f13026V).f7455x0;
        if (nVar == null) {
            return false;
        }
        Toolbar toolbar = ((h1) nVar).f13971U;
        Iterator it = ((CopyOnWriteArrayList) toolbar.f7562D0.f9767W).iterator();
        while (true) {
            if (it.hasNext()) {
                if (((E) it.next()).f7842a.p()) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            z6 = true;
        } else {
            l1 l1Var = toolbar.f7564F0;
            if (l1Var != null) {
                z6 = ((C1006G) l1Var).f12112U.f12114b.f12236U.onMenuItemSelected(0, menuItem);
            } else {
                z6 = false;
            }
        }
        if (z6) {
            return true;
        }
        return false;
    }

    public int r() {
        return ((ContentInfo) this.f13026V).getFlags();
    }

    public void s(n.m mVar) {
        n.k kVar = ((ActionMenuView) this.f13026V).f7450s0;
        if (kVar != null) {
            kVar.s(mVar);
        }
    }

    public ContentInfo t() {
        return (ContentInfo) this.f13026V;
    }

    public String toString() {
        switch (this.f13025U) {
            case 26:
                return "ContentInfoCompat{" + ((ContentInfo) this.f13026V) + "}";
            default:
                return super.toString();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: n.f} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void u(n.m r8, n.o r9) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f13026V
            n.g r0 = (n.C1231g) r0
            android.os.Handler r1 = r0.f13443Z
            r2 = 0
            r1.removeCallbacksAndMessages(r2)
            java.util.ArrayList r1 = r0.f13445b0
            int r3 = r1.size()
            r4 = 0
        L_0x0011:
            r5 = -1
            if (r4 >= r3) goto L_0x0022
            java.lang.Object r6 = r1.get(r4)
            n.f r6 = (n.C1230f) r6
            n.m r6 = r6.f13437b
            if (r8 != r6) goto L_0x001f
            goto L_0x0023
        L_0x001f:
            int r4 = r4 + 1
            goto L_0x0011
        L_0x0022:
            r4 = -1
        L_0x0023:
            if (r4 != r5) goto L_0x0026
            return
        L_0x0026:
            int r4 = r4 + 1
            int r3 = r1.size()
            if (r4 >= r3) goto L_0x0035
            java.lang.Object r1 = r1.get(r4)
            r2 = r1
            n.f r2 = (n.C1230f) r2
        L_0x0035:
            n.e r1 = new n.e
            r1.<init>(r7, r2, r9, r8)
            long r2 = android.os.SystemClock.uptimeMillis()
            r4 = 200(0xc8, double:9.9E-322)
            long r2 = r2 + r4
            android.os.Handler r9 = r0.f13443Z
            r9.postAtTime(r1, r8, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.C1160q.u(n.m, n.o):void");
    }

    public void v(int i) {
    }

    public void w(Uri uri) {
        ((ContentInfo.Builder) this.f13026V).setLinkUri(uri);
    }

    public int x() {
        return ((ContentInfo) this.f13026V).getSource();
    }

    public float y() {
        return 1.0f;
    }

    public void z(Throwable th) {
        u.Y y8;
        switch (this.f13025U) {
            case EnterpriseDeviceManager.KNOX_2_5:
                K(th);
                return;
            default:
                u.Y y9 = (u.Y) this.f13026V;
                y9.q();
                y9.f15586u.l();
                C1455O o2 = y9.f15569b;
                Iterator it = o2.i().iterator();
                while (it.hasNext() && (y8 = (u.Y) it.next()) != y9) {
                    y8.q();
                    y8.f15586u.l();
                }
                synchronized (o2.f15530b) {
                    ((LinkedHashSet) o2.e).remove(y9);
                }
                return;
        }
    }

    public C1160q(F.i iVar) {
        this.f13025U = 20;
        this.f13026V = new AtomicInteger(0);
    }

    public C1160q(CameraCaptureSession cameraCaptureSession, Handler handler) {
        this.f13025U = 21;
        if (Build.VERSION.SDK_INT >= 28) {
            this.f13026V = new v.i(cameraCaptureSession, (v.h) null);
        } else {
            this.f13026V = new v.i(cameraCaptureSession, new v.h(handler));
        }
    }

    public C1160q(int i) {
        this.f13025U = i;
        switch (i) {
            case 4:
                return;
            case 28:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f13026V = new C1577f(this);
                    return;
                } else {
                    this.f13026V = new C1577f(this);
                    return;
                }
            default:
                this.f13026V = new CopyOnWriteArrayList();
                return;
        }
    }

    public C1160q(CameraDevice cameraDevice, Handler handler) {
        this.f13025U = 23;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            cameraDevice.getClass();
            this.f13026V = new v.i(cameraDevice, (v.h) null);
        } else if (i >= 24) {
            this.f13026V = new v.i(cameraDevice, new v.h(handler));
        } else if (i >= 23) {
            this.f13026V = new v.i(cameraDevice, new v.h(handler));
        } else {
            this.f13026V = new v.i(cameraDevice, new v.h(handler));
        }
    }

    public C1160q(Activity activity) {
        Object obj;
        this.f13025U = 15;
        if (Build.VERSION.SDK_INT >= 31) {
            obj = new C1402b(activity);
        } else {
            obj = new G3(activity);
        }
        this.f13026V = obj;
    }

    public C1160q(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f13025U = 29;
        if (Build.VERSION.SDK_INT >= 25) {
            this.f13026V = new C1599e(uri, clipDescription, uri2);
        } else {
            this.f13026V = new d4.k(uri, clipDescription, uri2, 16);
        }
    }

    public C1160q(ContentInfo contentInfo) {
        this.f13025U = 26;
        contentInfo.getClass();
        this.f13026V = C0336a.k(contentInfo);
    }

    public C1160q(ClipData clipData, int i) {
        this.f13025U = 25;
        this.f13026V = C0336a.i(clipData, i);
    }
}
