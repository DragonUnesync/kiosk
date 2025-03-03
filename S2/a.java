package S2;

import B2.h;
import B2.i;
import D2.n;
import K2.e;
import K2.s;
import O2.d;
import V2.b;
import W2.c;
import W2.m;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.f;
import e2.C0832e;

public abstract class a implements Cloneable {

    /* renamed from: U  reason: collision with root package name */
    public int f4449U;

    /* renamed from: V  reason: collision with root package name */
    public n f4450V = n.f1134d;

    /* renamed from: W  reason: collision with root package name */
    public f f4451W = f.f8995W;

    /* renamed from: X  reason: collision with root package name */
    public int f4452X;

    /* renamed from: Y  reason: collision with root package name */
    public C0832e f4453Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f4454Z = true;

    /* renamed from: a0  reason: collision with root package name */
    public int f4455a0 = -1;

    /* renamed from: b0  reason: collision with root package name */
    public int f4456b0 = -1;

    /* renamed from: c0  reason: collision with root package name */
    public B2.f f4457c0 = V2.a.f5971b;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f4458d0;

    /* renamed from: e0  reason: collision with root package name */
    public i f4459e0 = new i();

    /* renamed from: f0  reason: collision with root package name */
    public c f4460f0 = new Y.i((Object) null);

    /* renamed from: g0  reason: collision with root package name */
    public Class f4461g0 = Object.class;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f4462h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f4463i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f4464j0 = true;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f4465k0;

    public static boolean i(int i, int i8) {
        if ((i & i8) != 0) {
            return true;
        }
        return false;
    }

    public a a(a aVar) {
        if (this.f4463i0) {
            return clone().a(aVar);
        }
        int i = aVar.f4449U;
        if (i(aVar.f4449U, 1048576)) {
            this.f4465k0 = aVar.f4465k0;
        }
        if (i(aVar.f4449U, 4)) {
            this.f4450V = aVar.f4450V;
        }
        if (i(aVar.f4449U, 8)) {
            this.f4451W = aVar.f4451W;
        }
        if (i(aVar.f4449U, 16)) {
            this.f4452X = 0;
            this.f4449U &= -33;
        }
        if (i(aVar.f4449U, 32)) {
            this.f4452X = aVar.f4452X;
            this.f4449U &= -17;
        }
        if (i(aVar.f4449U, 64)) {
            this.f4453Y = aVar.f4453Y;
            this.f4449U &= -129;
        }
        if (i(aVar.f4449U, 128)) {
            this.f4453Y = null;
            this.f4449U &= -65;
        }
        if (i(aVar.f4449U, 256)) {
            this.f4454Z = aVar.f4454Z;
        }
        if (i(aVar.f4449U, 512)) {
            this.f4456b0 = aVar.f4456b0;
            this.f4455a0 = aVar.f4455a0;
        }
        if (i(aVar.f4449U, 1024)) {
            this.f4457c0 = aVar.f4457c0;
        }
        if (i(aVar.f4449U, 4096)) {
            this.f4461g0 = aVar.f4461g0;
        }
        if (i(aVar.f4449U, 8192)) {
            this.f4449U &= -16385;
        }
        if (i(aVar.f4449U, 16384)) {
            this.f4449U &= -8193;
        }
        if (i(aVar.f4449U, 131072)) {
            this.f4458d0 = aVar.f4458d0;
        }
        if (i(aVar.f4449U, 2048)) {
            this.f4460f0.putAll(aVar.f4460f0);
            this.f4464j0 = aVar.f4464j0;
        }
        this.f4449U |= aVar.f4449U;
        this.f4459e0.f388b.g(aVar.f4459e0.f388b);
        r();
        return this;
    }

    public a b() {
        if (!this.f4462h0 || this.f4463i0) {
            this.f4463i0 = true;
            return j();
        }
        throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [Y.e, Y.i, W2.c] */
    /* renamed from: c */
    public a clone() {
        try {
            a aVar = (a) super.clone();
            i iVar = new i();
            aVar.f4459e0 = iVar;
            iVar.f388b.g(this.f4459e0.f388b);
            ? iVar2 = new Y.i((Object) null);
            aVar.f4460f0 = iVar2;
            iVar2.putAll(this.f4460f0);
            aVar.f4462h0 = false;
            aVar.f4463i0 = false;
            return aVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public a d(Class cls) {
        if (this.f4463i0) {
            return clone().d(cls);
        }
        this.f4461g0 = cls;
        this.f4449U |= 4096;
        r();
        return this;
    }

    public a e(n nVar) {
        if (this.f4463i0) {
            return clone().e(nVar);
        }
        this.f4450V = nVar;
        this.f4449U |= 4;
        r();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return h((a) obj);
        }
        return false;
    }

    public a f(K2.n nVar) {
        return s(K2.n.f2623g, nVar);
    }

    public a g() {
        if (this.f4463i0) {
            return clone().g();
        }
        this.f4452X = 2131230966;
        this.f4449U = (this.f4449U | 32) & -17;
        r();
        return this;
    }

    public final boolean h(a aVar) {
        aVar.getClass();
        if (Float.compare(1.0f, 1.0f) != 0 || this.f4452X != aVar.f4452X || !m.b((Object) null, (Object) null) || !m.b(this.f4453Y, aVar.f4453Y) || !m.b((Object) null, (Object) null) || this.f4454Z != aVar.f4454Z || this.f4455a0 != aVar.f4455a0 || this.f4456b0 != aVar.f4456b0 || this.f4458d0 != aVar.f4458d0 || !this.f4450V.equals(aVar.f4450V) || this.f4451W != aVar.f4451W || !this.f4459e0.equals(aVar.f4459e0) || !this.f4460f0.equals(aVar.f4460f0) || !this.f4461g0.equals(aVar.f4461g0) || !this.f4457c0.equals(aVar.f4457c0) || !m.b((Object) null, (Object) null)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        char[] cArr = m.f6173a;
        return m.h(m.h(m.h(m.h(m.h(m.h(m.h(m.g(0, m.g(0, m.g(1, m.g(this.f4458d0 ? 1 : 0, m.g(this.f4456b0, m.g(this.f4455a0, m.g(this.f4454Z ? 1 : 0, m.h(m.g(0, m.h(m.g(0, m.h(m.g(this.f4452X, m.g(Float.floatToIntBits(1.0f), 17)), (Object) null)), this.f4453Y)), (Object) null)))))))), this.f4450V), this.f4451W), this.f4459e0), this.f4460f0), this.f4461g0), this.f4457c0), (Object) null);
    }

    public a j() {
        this.f4462h0 = true;
        return this;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, K2.e] */
    public a k() {
        return n(K2.n.f2621d, new Object());
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, K2.e] */
    public a l() {
        a n4 = n(K2.n.f2620c, new Object());
        n4.f4464j0 = true;
        return n4;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, K2.e] */
    public a m() {
        a n4 = n(K2.n.f2619b, new Object());
        n4.f4464j0 = true;
        return n4;
    }

    public final a n(K2.n nVar, e eVar) {
        if (this.f4463i0) {
            return clone().n(nVar, eVar);
        }
        f(nVar);
        return v(eVar, false);
    }

    public a o(int i, int i8) {
        if (this.f4463i0) {
            return clone().o(i, i8);
        }
        this.f4456b0 = i;
        this.f4455a0 = i8;
        this.f4449U |= 512;
        r();
        return this;
    }

    public a p(C0832e eVar) {
        if (this.f4463i0) {
            return clone().p(eVar);
        }
        this.f4453Y = eVar;
        this.f4449U = (this.f4449U | 64) & -129;
        r();
        return this;
    }

    public a q() {
        f fVar = f.f8996X;
        if (this.f4463i0) {
            return clone().q();
        }
        this.f4451W = fVar;
        this.f4449U |= 8;
        r();
        return this;
    }

    public final void r() {
        if (this.f4462h0) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    public a s(h hVar, K2.n nVar) {
        if (this.f4463i0) {
            return clone().s(hVar, nVar);
        }
        W2.f.b(hVar);
        this.f4459e0.f388b.put(hVar, nVar);
        r();
        return this;
    }

    public a t(b bVar) {
        if (this.f4463i0) {
            return clone().t(bVar);
        }
        this.f4457c0 = bVar;
        this.f4449U |= 1024;
        r();
        return this;
    }

    public a u(boolean z) {
        if (this.f4463i0) {
            return clone().u(true);
        }
        this.f4454Z = !z;
        this.f4449U |= 256;
        r();
        return this;
    }

    public final a v(B2.m mVar, boolean z) {
        if (this.f4463i0) {
            return clone().v(mVar, z);
        }
        s sVar = new s(mVar, z);
        w(Bitmap.class, mVar, z);
        w(Drawable.class, sVar, z);
        w(BitmapDrawable.class, sVar, z);
        w(O2.c.class, new d(mVar), z);
        r();
        return this;
    }

    public final a w(Class cls, B2.m mVar, boolean z) {
        if (this.f4463i0) {
            return clone().w(cls, mVar, z);
        }
        W2.f.b(mVar);
        this.f4460f0.put(cls, mVar);
        int i = this.f4449U;
        this.f4449U = 67584 | i;
        this.f4464j0 = false;
        if (z) {
            this.f4449U = i | 198656;
            this.f4458d0 = true;
        }
        r();
        return this;
    }

    public a x() {
        if (this.f4463i0) {
            return clone().x();
        }
        this.f4465k0 = true;
        this.f4449U |= 1048576;
        r();
        return this;
    }
}
