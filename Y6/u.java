package Y6;

import C7.d;
import P6.f;
import Q5.a;
import com.samsung.android.knox.accounts.HostAuth;
import java.io.Closeable;

public final class u implements Closeable {

    /* renamed from: U  reason: collision with root package name */
    public final d f6739U;

    /* renamed from: V  reason: collision with root package name */
    public final s f6740V;

    /* renamed from: W  reason: collision with root package name */
    public final String f6741W;

    /* renamed from: X  reason: collision with root package name */
    public final int f6742X;

    /* renamed from: Y  reason: collision with root package name */
    public final l f6743Y;

    /* renamed from: Z  reason: collision with root package name */
    public final m f6744Z;

    /* renamed from: a0  reason: collision with root package name */
    public final v f6745a0;

    /* renamed from: b0  reason: collision with root package name */
    public final u f6746b0;

    /* renamed from: c0  reason: collision with root package name */
    public final u f6747c0;

    /* renamed from: d0  reason: collision with root package name */
    public final u f6748d0;

    /* renamed from: e0  reason: collision with root package name */
    public final long f6749e0;

    /* renamed from: f0  reason: collision with root package name */
    public final long f6750f0;

    /* renamed from: g0  reason: collision with root package name */
    public final a f6751g0;

    public u(d dVar, s sVar, String str, int i, l lVar, m mVar, v vVar, u uVar, u uVar2, u uVar3, long j7, long j8, a aVar) {
        f.e(dVar, "request");
        f.e(sVar, HostAuth.PROTOCOL);
        f.e(str, "message");
        this.f6739U = dVar;
        this.f6740V = sVar;
        this.f6741W = str;
        this.f6742X = i;
        this.f6743Y = lVar;
        this.f6744Z = mVar;
        this.f6745a0 = vVar;
        this.f6746b0 = uVar;
        this.f6747c0 = uVar2;
        this.f6748d0 = uVar3;
        this.f6749e0 = j7;
        this.f6750f0 = j8;
        this.f6751g0 = aVar;
    }

    public final void close() {
        v vVar = this.f6745a0;
        if (vVar != null) {
            vVar.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, Y6.t] */
    public final t k() {
        ? obj = new Object();
        obj.f6728a = this.f6739U;
        obj.f6729b = this.f6740V;
        obj.f6730c = this.f6742X;
        obj.f6731d = this.f6741W;
        obj.e = this.f6743Y;
        obj.f6732f = this.f6744Z.d();
        obj.f6733g = this.f6745a0;
        obj.f6734h = this.f6746b0;
        obj.i = this.f6747c0;
        obj.f6735j = this.f6748d0;
        obj.f6736k = this.f6749e0;
        obj.f6737l = this.f6750f0;
        obj.f6738m = this.f6751g0;
        return obj;
    }

    public final String toString() {
        return "Response{protocol=" + this.f6740V + ", code=" + this.f6742X + ", message=" + this.f6741W + ", url=" + ((o) this.f6739U.f732V) + '}';
    }
}
