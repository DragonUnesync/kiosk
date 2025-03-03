package D;

import A.f;
import B.C0010k;
import B.C0022x;
import B.s0;
import B.t0;
import F.h;
import G.a;
import H3.P;
import L3.b;
import P0.c;
import U.d;
import U.j;
import U.s;
import Y0.e;
import a0.k;
import a0.m;
import a0.n;
import android.app.ActivityManager;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.InputConfiguration;
import android.net.Uri;
import android.preference.Preference;
import android.preference.PreferenceScreen;
import android.util.ArrayMap;
import android.util.Size;
import android.view.Surface;
import android.view.View;
import android.widget.AdapterView;
import androidx.camera.view.PreviewView;
import de.ozerov.fully.C0663a0;
import de.ozerov.fully.C0695f2;
import de.ozerov.fully.C0698g;
import de.ozerov.fully.C0704h;
import de.ozerov.fully.C0780t4;
import de.ozerov.fully.C0794w0;
import de.ozerov.fully.D;
import de.ozerov.fully.MainActivity;
import g1.g;
import h1.C1031B;
import h1.G;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import t.C1412a;
import u.C1442B;
import u.C1448H;
import u.C1449I;
import u.C1477r;
import u.U;
import u.Y;
import w.i;
import w.v;

public final /* synthetic */ class O implements k, s0, D, c, a {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f837U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Object f838V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ Object f839W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ Object f840X;

    public /* synthetic */ O(Object obj, Object obj2, Object obj3, int i) {
        this.f837U = i;
        this.f838V = obj;
        this.f839W = obj2;
        this.f840X = obj3;
    }

    public void a() {
        d dVar;
        AtomicReference atomicReference = ((PreviewView) ((P) this.f838V).f2027U).f7683d0;
        while (true) {
            dVar = (d) this.f839W;
            if (!atomicReference.compareAndSet(dVar, (Object) null)) {
                if (atomicReference.get() != dVar) {
                    break;
                }
            } else {
                dVar.o(j.f5282U);
                break;
            }
        }
        G.d dVar2 = (G.d) dVar.f5261Z;
        if (dVar2 != null) {
            dVar2.cancel(false);
            dVar.f5261Z = null;
        }
        ((C0071z) this.f840X).b().i(dVar);
    }

    public void accept(Object obj) {
        ((G) obj).u(((e) this.f838V).f6315a, (C1031B) this.f839W, (g) this.f840X);
    }

    public b apply(Object obj) {
        b bVar;
        InputConfiguration inputConfiguration;
        boolean z;
        int i;
        C1449I i8 = (C1449I) this.f838V;
        C0 c02 = (C0) this.f839W;
        CameraDevice cameraDevice = (CameraDevice) this.f840X;
        List list = (List) obj;
        synchronized (i8.f15498a) {
            int h5 = C1477r.h(i8.i);
            if (!(h5 == 0 || h5 == 1)) {
                if (h5 == 2) {
                    i8.f15503g.clear();
                    for (int i9 = 0; i9 < list.size(); i9++) {
                        i8.f15503g.put((N) i8.f15504h.get(i9), (Surface) list.get(i9));
                    }
                    i8.i = 4;
                    h.j("CaptureSession", "Opening capture session.");
                    C1448H h8 = new C1448H(2, Arrays.asList(new U[]{i8.f15500c, new C1448H(1, c02.f750d)}));
                    I i10 = c02.f752g;
                    f fVar = new f(1, (Object) i10.f789b);
                    HashSet hashSet = new HashSet();
                    C0041e0.b();
                    ArrayList arrayList = new ArrayList();
                    C0045g0.a();
                    hashSet.addAll(i10.f788a);
                    C0041e0 c8 = C0041e0.c(i10.f789b);
                    int i11 = i10.f790c;
                    arrayList.addAll(i10.f791d);
                    boolean z6 = i10.e;
                    ArrayMap arrayMap = new ArrayMap();
                    H0 h02 = i10.f792f;
                    for (String str : h02.f785a.keySet()) {
                        arrayMap.put(str, h02.f785a.get(str));
                    }
                    H0 h03 = new H0(arrayMap);
                    ArrayList arrayList2 = new ArrayList();
                    String str2 = (String) ((K) fVar.f17V).o0(C1412a.f15164b0, (Object) null);
                    Iterator it = c02.f747a.iterator();
                    while (it.hasNext()) {
                        C0044g gVar = (C0044g) it.next();
                        i e = i8.e(gVar, i8.f15503g, str2);
                        String str3 = str2;
                        Iterator it2 = it;
                        if (i8.f15507l.containsKey(gVar.f899a)) {
                            z = z6;
                            i = i11;
                            e.f16153a.j(((Long) i8.f15507l.get(gVar.f899a)).longValue());
                        } else {
                            z = z6;
                            i = i11;
                        }
                        arrayList2.add(e);
                        str2 = str3;
                        i11 = i;
                        it = it2;
                        z6 = z;
                    }
                    boolean z8 = z6;
                    int i12 = i11;
                    ArrayList f8 = C1449I.f(arrayList2);
                    Y y8 = i8.f15501d;
                    y8.f15572f = h8;
                    v vVar = new v(f8, y8.f15571d, new C1442B(1, y8));
                    if (c02.f752g.f790c == 5 && (inputConfiguration = c02.f753h) != null) {
                        vVar.f16176a.g(w.h.a(inputConfiguration));
                    }
                    try {
                        ArrayList arrayList3 = new ArrayList(hashSet);
                        C0053k0 a8 = C0053k0.a(c8);
                        ArrayList arrayList4 = new ArrayList(arrayList);
                        H0 h04 = H0.f784b;
                        ArrayMap arrayMap2 = new ArrayMap();
                        for (String str4 : h03.f785a.keySet()) {
                            arrayMap2.put(str4, h03.f785a.get(str4));
                        }
                        H0 h05 = new H0(arrayMap2);
                        boolean z9 = z8;
                        CaptureRequest e8 = android.support.v4.media.session.b.e(new I(arrayList3, a8, i12, arrayList4, z8, h05, (C0064s) null), cameraDevice, i8.f15512q);
                        if (e8 != null) {
                            vVar.f16176a.h(e8);
                        }
                        bVar = i8.f15501d.p(cameraDevice, vVar, i8.f15504h);
                    } catch (CameraAccessException e9) {
                        bVar = new G.k(1, e9);
                    } catch (Throwable th) {
                        throw th;
                    }
                } else if (h5 != 4) {
                    bVar = new G.k(1, new CancellationException("openCaptureSession() not execute in state: ".concat(C1477r.j(i8.i))));
                }
            }
            bVar = new G.k(1, new IllegalStateException("openCaptureSession() should not be possible in state: ".concat(C1477r.j(i8.i))));
        }
        return bVar;
    }

    public void f(C0010k kVar) {
        boolean z;
        U.k kVar2;
        P p3 = (P) this.f838V;
        p3.getClass();
        h.j("PreviewView", "Preview transformation info updated. " + kVar);
        if (((C0071z) this.f839W).l().d() == 0) {
            z = true;
        } else {
            z = false;
        }
        PreviewView previewView = (PreviewView) p3.f2027U;
        U.e eVar = previewView.f7680a0;
        Size size = ((t0) this.f840X).f307b;
        eVar.getClass();
        h.j("PreviewTransform", "Transformation info set: " + kVar + " " + size + " " + z);
        eVar.f5263b = kVar.f271a;
        eVar.f5264c = kVar.f272b;
        int i = kVar.f273c;
        eVar.e = i;
        eVar.f5262a = size;
        eVar.f5266f = z;
        eVar.f5267g = kVar.f274d;
        eVar.f5265d = kVar.e;
        if (i == -1 || ((kVar2 = previewView.f7678V) != null && (kVar2 instanceof s))) {
            previewView.f7681b0 = true;
        } else {
            previewView.f7681b0 = false;
        }
        previewView.a();
    }

    public Object h(a0.j jVar) {
        switch (this.f837U) {
            case 0:
                m mVar = (m) this.f838V;
                A.d dVar = new A.d(11, mVar);
                F.i iVar = (F.i) this.f839W;
                n nVar = jVar.f7013c;
                if (nVar != null) {
                    nVar.d(dVar, iVar);
                }
                mVar.d(new G.h(mVar, 0, new P(jVar, 0)), iVar);
                return "surfaceList[" + ((List) this.f840X) + "]";
            case 1:
                M.c cVar = (M.c) this.f838V;
                cVar.getClass();
                cVar.b(new B7.e(cVar, (C0022x) this.f839W, (Map) this.f840X, jVar, 1), new C0663a0(5));
                return "Init GlRenderer";
            case 2:
                N.f fVar = (N.f) this.f838V;
                fVar.getClass();
                fVar.b(new B7.e(fVar, (C0022x) this.f839W, (Map) this.f840X, jVar, 2), new C0663a0(5));
                return "Init GlRenderer";
            default:
                ((d) this.f838V).getClass();
                C0069x xVar = (C0069x) this.f839W;
                U.c cVar2 = new U.c(jVar, xVar);
                ((ArrayList) this.f840X).add(cVar2);
                xVar.j(D7.b.l(), cVar2);
                return "waitForCaptureResult";
        }
    }

    public void i(String str) {
        switch (this.f837U) {
            case 6:
                C0704h hVar = (C0704h) this.f838V;
                hVar.getClass();
                if (!str.isEmpty()) {
                    C0780t4 t4Var = (C0780t4) hVar.f10683d.f6955V;
                    Intent intent = new Intent(t4Var, MainActivity.class);
                    intent.setData(Uri.parse((String) this.f840X));
                    intent.setAction("android.intent.action.VIEW");
                    intent.addFlags(268435456);
                    boolean B02 = n2.a.B0();
                    Bitmap bitmap = (Bitmap) this.f839W;
                    if (B02) {
                        ShortcutManager c8 = C0698g.c(t4Var.getSystemService(C0698g.d()));
                        if (!c8.isRequestPinShortcutSupported()) {
                            n2.a.b1(t4Var, "Default launcher doesn't support pinned shortcuts");
                            return;
                        } else if (C0794w0.g0(t4Var)) {
                            n2.a.b1(t4Var, "Can't put shortcuts while device is locked");
                            return;
                        } else {
                            try {
                                C0698g.e();
                                ShortcutInfo.Builder a8 = C0698g.a(t4Var, "id" + ((int) (Math.random() * 1000000.0d)));
                                a8.setShortLabel(str);
                                a8.setLongLabel("Open " + str + " in Fully");
                                if (bitmap != null) {
                                    int launcherLargeIconSize = ((ActivityManager) t4Var.getSystemService("activity")).getLauncherLargeIconSize();
                                    a8.setIcon(Icon.createWithBitmap(n2.a.X(bitmap, launcherLargeIconSize, launcherLargeIconSize)));
                                } else {
                                    a8.setIcon(Icon.createWithResource(t4Var, 2131755010));
                                }
                                a8.setIntent(intent);
                                c8.requestPinShortcut(a8.build(), (IntentSender) null);
                                return;
                            } catch (Exception e) {
                                e.printStackTrace();
                                n2.a.b1(t4Var, "Error when adding shortcut to Home Screen");
                                return;
                            }
                        }
                    } else {
                        try {
                            Intent intent2 = new Intent();
                            intent2.putExtra("android.intent.extra.shortcut.INTENT", intent);
                            intent2.putExtra("android.intent.extra.shortcut.NAME", str);
                            if (bitmap != null) {
                                int launcherLargeIconSize2 = ((ActivityManager) t4Var.getSystemService("activity")).getLauncherLargeIconSize();
                                intent2.putExtra("android.intent.extra.shortcut.ICON", n2.a.X(bitmap, launcherLargeIconSize2, launcherLargeIconSize2));
                            } else {
                                intent2.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(t4Var, 2131755010));
                            }
                            intent2.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
                            t4Var.sendBroadcast(intent2);
                            n2.a.b1(t4Var, "Look for a new Icon on your Home Screen");
                            return;
                        } catch (Exception e8) {
                            e8.printStackTrace();
                            n2.a.b1(t4Var, "Error when adding link to Home Screen");
                            return;
                        }
                    }
                } else {
                    return;
                }
            default:
                C0695f2 f2Var = (C0695f2) this.f838V;
                if (str.equals(((Z1.c) f2Var.f10626U.f9767W).r("superPin", ""))) {
                    n2.a.b1(f2Var.f10627V, "PIN accepted");
                    f2Var.f10631Z = false;
                    ((PreferenceScreen) this.f839W).onItemClick((AdapterView) null, (View) null, f2Var.findPreference(((Preference) this.f840X).getKey()).getOrder(), 0);
                    return;
                }
                n2.a.b1(f2Var.f10627V, "PIN wrong");
                return;
        }
    }
}
