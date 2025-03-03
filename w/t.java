package w;

import F.i;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import u.C1442B;

public final class t implements u {

    /* renamed from: a  reason: collision with root package name */
    public final List f16172a;

    /* renamed from: b  reason: collision with root package name */
    public final C1442B f16173b;

    /* renamed from: c  reason: collision with root package name */
    public final i f16174c;

    /* renamed from: d  reason: collision with root package name */
    public h f16175d = null;

    public t(ArrayList arrayList, i iVar, C1442B b8) {
        this.f16172a = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        this.f16173b = b8;
        this.f16174c = iVar;
    }

    public final Object a() {
        return null;
    }

    public final int b() {
        return 0;
    }

    public final CameraCaptureSession.StateCallback c() {
        return this.f16173b;
    }

    public final List d() {
        return this.f16172a;
    }

    public final h e() {
        return this.f16175d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            if (Objects.equals(this.f16175d, tVar.f16175d)) {
                List list = this.f16172a;
                int size = list.size();
                List list2 = tVar.f16172a;
                if (size == list2.size()) {
                    for (int i = 0; i < list.size(); i++) {
                        if (!((i) list.get(i)).equals(list2.get(i))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final Executor f() {
        return this.f16174c;
    }

    public final void g(h hVar) {
        this.f16175d = hVar;
    }

    public final void h(CaptureRequest captureRequest) {
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f16172a.hashCode() ^ 31;
        int i8 = (hashCode << 5) - hashCode;
        h hVar = this.f16175d;
        if (hVar == null) {
            i = 0;
        } else {
            i = hVar.f16152a.hashCode();
        }
        int i9 = i ^ i8;
        return (i9 << 5) - i9;
    }
}
