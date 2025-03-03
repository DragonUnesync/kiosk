package u;

import A3.c;
import F.i;
import android.hardware.camera2.CameraDevice;
import de.ozerov.fully.M2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: u.D  reason: case insensitive filesystem */
public final class C1444D extends CameraDevice.StateCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15492a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f15493b;

    public C1444D(C1455O o2) {
        this.f15492a = 1;
        this.f15493b = o2;
    }

    private final void c(CameraDevice cameraDevice) {
    }

    public void a() {
        ArrayList i;
        synchronized (((C1455O) this.f15493b).f15530b) {
            i = ((C1455O) this.f15493b).i();
            ((LinkedHashSet) ((C1455O) this.f15493b).e).clear();
            ((LinkedHashSet) ((C1455O) this.f15493b).f15531c).clear();
            ((LinkedHashSet) ((C1455O) this.f15493b).f15532d).clear();
        }
        Iterator it = i.iterator();
        while (it.hasNext()) {
            Y y8 = (Y) it.next();
            y8.q();
            y8.f15586u.l();
        }
    }

    public void b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        synchronized (((C1455O) this.f15493b).f15530b) {
            linkedHashSet.addAll((LinkedHashSet) ((C1455O) this.f15493b).e);
            linkedHashSet.addAll((LinkedHashSet) ((C1455O) this.f15493b).f15531c);
        }
        ((i) ((C1455O) this.f15493b).f15529a).execute(new M2(17, (Object) linkedHashSet));
    }

    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.f15492a) {
            case 0:
                Iterator it = ((ArrayList) this.f15493b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onClosed(cameraDevice);
                }
                return;
            default:
                b();
                a();
                return;
        }
    }

    public final void onDisconnected(CameraDevice cameraDevice) {
        switch (this.f15492a) {
            case 0:
                Iterator it = ((ArrayList) this.f15493b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onDisconnected(cameraDevice);
                }
                return;
            default:
                b();
                a();
                return;
        }
    }

    public final void onError(CameraDevice cameraDevice, int i) {
        switch (this.f15492a) {
            case 0:
                Iterator it = ((ArrayList) this.f15493b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onError(cameraDevice, i);
                }
                return;
            default:
                b();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                synchronized (((C1455O) this.f15493b).f15530b) {
                    linkedHashSet.addAll((LinkedHashSet) ((C1455O) this.f15493b).e);
                    linkedHashSet.addAll((LinkedHashSet) ((C1455O) this.f15493b).f15531c);
                }
                ((i) ((C1455O) this.f15493b).f15529a).execute(new c(i, 10, (Object) linkedHashSet));
                a();
                return;
        }
    }

    public final void onOpened(CameraDevice cameraDevice) {
        switch (this.f15492a) {
            case 0:
                Iterator it = ((ArrayList) this.f15493b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onOpened(cameraDevice);
                }
                return;
            default:
                return;
        }
    }

    public C1444D(ArrayList arrayList) {
        this.f15492a = 0;
        this.f15493b = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CameraDevice.StateCallback stateCallback = (CameraDevice.StateCallback) it.next();
            if (!(stateCallback instanceof C1445E)) {
                ((ArrayList) this.f15493b).add(stateCallback);
            }
        }
    }
}
