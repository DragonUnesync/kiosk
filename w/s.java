package w;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.SessionConfiguration;
import j$.util.Objects;
import java.util.List;
import java.util.concurrent.Executor;

public final class s implements u {

    /* renamed from: a  reason: collision with root package name */
    public final SessionConfiguration f16170a;

    /* renamed from: b  reason: collision with root package name */
    public final List f16171b;

    /* JADX WARNING: type inference failed for: r1v4, types: [w.r] */
    /* JADX WARNING: type inference failed for: r1v5, types: [w.r] */
    /* JADX WARNING: type inference failed for: r1v6, types: [w.r] */
    /* JADX WARNING: type inference failed for: r1v7, types: [w.r] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public s(java.util.ArrayList r4, F.i r5, u.C1442B r6) {
        /*
            r3 = this;
            android.hardware.camera2.params.SessionConfiguration r0 = new android.hardware.camera2.params.SessionConfiguration
            java.util.ArrayList r4 = w.v.a(r4)
            r1 = 0
            r0.<init>(r1, r4, r5, r6)
            r3.<init>()
            r3.f16170a = r0
            java.util.List r4 = r0.getOutputConfigurations()
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = r4.size()
            r5.<init>(r6)
            java.util.Iterator r4 = r4.iterator()
        L_0x0020:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0076
            java.lang.Object r6 = r4.next()
            android.hardware.camera2.params.OutputConfiguration r6 = (android.hardware.camera2.params.OutputConfiguration) r6
            r0 = 0
            if (r6 != 0) goto L_0x0030
            goto L_0x0072
        L_0x0030:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 < r2) goto L_0x003c
            w.p r1 = new w.p
            r1.<init>((java.lang.Object) r6)
            goto L_0x006a
        L_0x003c:
            r2 = 28
            if (r1 < r2) goto L_0x004b
            w.o r1 = new w.o
            w.n r2 = new w.n
            r2.<init>(r6)
            r1.<init>((java.lang.Object) r2)
            goto L_0x006a
        L_0x004b:
            r2 = 26
            if (r1 < r2) goto L_0x005a
            w.m r1 = new w.m
            w.l r2 = new w.l
            r2.<init>(r6)
            r1.<init>((java.lang.Object) r2)
            goto L_0x006a
        L_0x005a:
            r2 = 24
            if (r1 < r2) goto L_0x0069
            w.k r1 = new w.k
            w.j r2 = new w.j
            r2.<init>(r6)
            r1.<init>((java.lang.Object) r2)
            goto L_0x006a
        L_0x0069:
            r1 = r0
        L_0x006a:
            if (r1 != 0) goto L_0x006d
            goto L_0x0072
        L_0x006d:
            w.i r0 = new w.i
            r0.<init>(r1)
        L_0x0072:
            r5.add(r0)
            goto L_0x0020
        L_0x0076:
            java.util.List r4 = j$.util.DesugarCollections.unmodifiableList(r5)
            r3.f16171b = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w.s.<init>(java.util.ArrayList, F.i, u.B):void");
    }

    public final Object a() {
        return this.f16170a;
    }

    public final int b() {
        return this.f16170a.getSessionType();
    }

    public final CameraCaptureSession.StateCallback c() {
        return this.f16170a.getStateCallback();
    }

    public final List d() {
        return this.f16171b;
    }

    public final h e() {
        return h.a(this.f16170a.getInputConfiguration());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        return Objects.equals(this.f16170a, ((s) obj).f16170a);
    }

    public final Executor f() {
        return this.f16170a.getExecutor();
    }

    public final void g(h hVar) {
        this.f16170a.setInputConfiguration(hVar.f16152a.f16151a);
    }

    public final void h(CaptureRequest captureRequest) {
        this.f16170a.setSessionParameters(captureRequest);
    }

    public final int hashCode() {
        return this.f16170a.hashCode();
    }
}
