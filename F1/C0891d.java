package f1;

import A4.d;
import P0.z;
import R.e;
import a1.C0410a;
import android.os.Handler;
import androidx.camera.lifecycle.c;
import de.ozerov.fully.K2;
import l1.m;
import p1.l;

/* renamed from: f1.d  reason: case insensitive filesystem */
public final class C0891d implements m {

    /* renamed from: U  reason: collision with root package name */
    public final int f11510U;

    /* renamed from: V  reason: collision with root package name */
    public final t f11511V;

    /* renamed from: W  reason: collision with root package name */
    public final c f11512W;

    /* renamed from: X  reason: collision with root package name */
    public final K2 f11513X;

    /* renamed from: Y  reason: collision with root package name */
    public final Handler f11514Y = z.m((Handler.Callback) null);

    /* renamed from: Z  reason: collision with root package name */
    public final C0410a f11515Z;

    /* renamed from: a0  reason: collision with root package name */
    public C0890c f11516a0;

    /* renamed from: b0  reason: collision with root package name */
    public C0892e f11517b0;

    /* renamed from: c0  reason: collision with root package name */
    public l f11518c0;

    /* renamed from: d0  reason: collision with root package name */
    public volatile boolean f11519d0;

    /* renamed from: e0  reason: collision with root package name */
    public volatile long f11520e0;

    /* renamed from: f0  reason: collision with root package name */
    public volatile long f11521f0;

    public C0891d(int i, t tVar, c cVar, K2 k22, C0410a aVar) {
        this.f11510U = i;
        this.f11511V = tVar;
        this.f11512W = cVar;
        this.f11513X = k22;
        this.f11515Z = aVar;
        this.f11520e0 = -9223372036854775807L;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [M0.u, java.lang.Object] */
    public final void c() {
        if (this.f11519d0) {
            this.f11519d0 = false;
        }
        try {
            if (this.f11516a0 == null) {
                C0890c n4 = this.f11515Z.n(this.f11510U);
                this.f11516a0 = n4;
                this.f11514Y.post(new d(this, n4.a(), this.f11516a0, 13));
                C0890c cVar = this.f11516a0;
                cVar.getClass();
                this.f11518c0 = new l(cVar, 0, -1);
                C0892e eVar = new C0892e(this.f11511V.f11615a, this.f11510U);
                this.f11517b0 = eVar;
                eVar.l(this.f11513X);
            }
            while (!this.f11519d0) {
                if (this.f11520e0 != -9223372036854775807L) {
                    C0892e eVar2 = this.f11517b0;
                    eVar2.getClass();
                    eVar2.a(this.f11521f0, this.f11520e0);
                    this.f11520e0 = -9223372036854775807L;
                }
                C0892e eVar3 = this.f11517b0;
                eVar3.getClass();
                l lVar = this.f11518c0;
                lVar.getClass();
                if (eVar3.e(lVar, new Object()) == -1) {
                    break;
                }
            }
            this.f11519d0 = false;
            C0890c cVar2 = this.f11516a0;
            cVar2.getClass();
            if (cVar2.n()) {
                e.d(this.f11516a0);
                this.f11516a0 = null;
            }
        } catch (Throwable th) {
            C0890c cVar3 = this.f11516a0;
            cVar3.getClass();
            if (cVar3.n()) {
                e.d(this.f11516a0);
                this.f11516a0 = null;
            }
            throw th;
        }
    }

    public final void e() {
        this.f11519d0 = true;
    }
}
