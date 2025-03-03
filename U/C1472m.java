package u;

import B.C0022x;
import B.p0;
import C7.d;
import D.A0;
import D.C0;
import D.C0041e0;
import D.C0044g;
import D.C0045g0;
import D.C0053k0;
import D.C0064s;
import D.H0;
import D.I;
import D.s0;
import D7.b;
import F.e;
import F.i;
import G.f;
import P0.g;
import a0.j;
import a1.C0412c;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import android.util.ArrayMap;
import android.view.Surface;
import de.ozerov.fully.M2;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import v.l;

/* renamed from: u.m  reason: case insensitive filesystem */
public final class C1472m extends CameraDevice.StateCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15666a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final Object f15667b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f15668c;

    public C1472m(i iVar, CameraDevice.StateCallback stateCallback) {
        this.f15668c = iVar;
        this.f15667b = stateCallback;
    }

    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.f15666a) {
            case 0:
                ((C1479t) this.f15668c).u("openCameraConfigAndClose camera closed", (Throwable) null);
                ((j) this.f15667b).a((Object) null);
                return;
            default:
                ((i) this.f15668c).execute(new l(this, cameraDevice, 0));
                return;
        }
    }

    public final void onDisconnected(CameraDevice cameraDevice) {
        switch (this.f15666a) {
            case 0:
                ((C1479t) this.f15668c).u("openCameraConfigAndClose camera disconnected", (Throwable) null);
                ((j) this.f15667b).a((Object) null);
                return;
            default:
                ((i) this.f15668c).execute(new l(this, cameraDevice, 1));
                return;
        }
    }

    public final void onError(CameraDevice cameraDevice, int i) {
        switch (this.f15666a) {
            case 0:
                ((C1479t) this.f15668c).u("openCameraConfigAndClose camera error " + i, (Throwable) null);
                ((j) this.f15667b).a((Object) null);
                return;
            default:
                ((i) this.f15668c).execute(new g((Object) this, (AutoCloseable) cameraDevice, i, 7));
                return;
        }
    }

    public final void onOpened(CameraDevice cameraDevice) {
        CameraDevice cameraDevice2 = cameraDevice;
        Object obj = this.f15668c;
        switch (this.f15666a) {
            case 0:
                C1479t tVar = (C1479t) obj;
                tVar.u("openCameraConfigAndClose camera opened", (Throwable) null);
                C1449I i = new C1449I(tVar.f15715y0, new s0(Collections.emptyList()));
                SurfaceTexture surfaceTexture = new SurfaceTexture(0);
                surfaceTexture.setDefaultBufferSize(640, 480);
                Surface surface = new Surface(surfaceTexture);
                p0 p0Var = new p0(surface);
                G.i.d(p0Var.e).d(new C0412c((Object) surface, 20, (Object) surfaceTexture), b.l());
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                HashSet hashSet = new HashSet();
                C0041e0 b8 = C0041e0.b();
                ArrayList arrayList = new ArrayList();
                C0045g0 a8 = C0045g0.a();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                C0022x xVar = C0022x.f360d;
                d a9 = C0044g.a(p0Var);
                a9.f736Z = xVar;
                linkedHashSet.add(a9.b());
                tVar.u("Start configAndClose.", (Throwable) null);
                ArrayList arrayList5 = new ArrayList(linkedHashSet);
                ArrayList arrayList6 = new ArrayList(arrayList2);
                ArrayList arrayList7 = new ArrayList(arrayList3);
                ArrayList arrayList8 = new ArrayList(arrayList4);
                ArrayList arrayList9 = new ArrayList(hashSet);
                C0053k0 a10 = C0053k0.a(b8);
                ArrayList arrayList10 = new ArrayList(arrayList);
                H0 h02 = H0.f784b;
                ArrayMap arrayMap = new ArrayMap();
                ArrayMap arrayMap2 = a8.f785a;
                for (Iterator it = arrayMap2.keySet().iterator(); it.hasNext(); it = it) {
                    String str = (String) it.next();
                    arrayMap.put(str, arrayMap2.get(str));
                }
                C0 c02 = new C0(arrayList5, arrayList6, arrayList7, arrayList8, new I(arrayList9, a10, 1, arrayList10, false, new H0(arrayMap), (C0064s) null), (A0) null, (InputConfiguration) null, (C0044g) null);
                C1455O o2 = tVar.f15709s0;
                C1455O o8 = (C1455O) o2.f15532d;
                i iVar = (i) o2.f15529a;
                s0 s0Var = (s0) o2.f15533f;
                G.d a11 = G.d.a(com.bumptech.glide.d.i(new f(i.k(c02, cameraDevice2, new Y((s0) o2.e, s0Var, o8, iVar, (e) o2.f15530b, (Handler) o2.f15531c)), 0)));
                A.g gVar = new A.g(i, 17, p0Var);
                a11.getClass();
                i iVar2 = tVar.f15688W;
                G.b f8 = G.i.f(a11, gVar, iVar2);
                Objects.requireNonNull(cameraDevice);
                f8.d(new M2(14, (Object) cameraDevice2), iVar2);
                return;
            default:
                ((i) obj).execute(new l(this, cameraDevice2, 2));
                return;
        }
    }

    public C1472m(C1479t tVar, j jVar) {
        this.f15668c = tVar;
        this.f15667b = jVar;
    }
}
