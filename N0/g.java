package N0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

public final class g implements d {

    /* renamed from: b  reason: collision with root package name */
    public int f3265b;

    /* renamed from: c  reason: collision with root package name */
    public float f3266c;

    /* renamed from: d  reason: collision with root package name */
    public float f3267d;
    public b e;

    /* renamed from: f  reason: collision with root package name */
    public b f3268f;

    /* renamed from: g  reason: collision with root package name */
    public b f3269g;

    /* renamed from: h  reason: collision with root package name */
    public b f3270h;
    public boolean i;

    /* renamed from: j  reason: collision with root package name */
    public f f3271j;

    /* renamed from: k  reason: collision with root package name */
    public ByteBuffer f3272k;

    /* renamed from: l  reason: collision with root package name */
    public ShortBuffer f3273l;

    /* renamed from: m  reason: collision with root package name */
    public ByteBuffer f3274m;

    /* renamed from: n  reason: collision with root package name */
    public long f3275n;

    /* renamed from: o  reason: collision with root package name */
    public long f3276o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f3277p;

    public final void a() {
        this.f3266c = 1.0f;
        this.f3267d = 1.0f;
        b bVar = b.e;
        this.e = bVar;
        this.f3268f = bVar;
        this.f3269g = bVar;
        this.f3270h = bVar;
        ByteBuffer byteBuffer = d.f3237a;
        this.f3272k = byteBuffer;
        this.f3273l = byteBuffer.asShortBuffer();
        this.f3274m = byteBuffer;
        this.f3265b = -1;
        this.i = false;
        this.f3271j = null;
        this.f3275n = 0;
        this.f3276o = 0;
        this.f3277p = false;
    }

    public final ByteBuffer b() {
        f fVar = this.f3271j;
        if (fVar != null) {
            int i8 = fVar.f3254m;
            int i9 = fVar.f3245b;
            int i10 = i8 * i9 * 2;
            if (i10 > 0) {
                if (this.f3272k.capacity() < i10) {
                    ByteBuffer order = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
                    this.f3272k = order;
                    this.f3273l = order.asShortBuffer();
                } else {
                    this.f3272k.clear();
                    this.f3273l.clear();
                }
                ShortBuffer shortBuffer = this.f3273l;
                int min = Math.min(shortBuffer.remaining() / i9, fVar.f3254m);
                int i11 = min * i9;
                shortBuffer.put(fVar.f3253l, 0, i11);
                int i12 = fVar.f3254m - min;
                fVar.f3254m = i12;
                short[] sArr = fVar.f3253l;
                System.arraycopy(sArr, i11, sArr, 0, i12 * i9);
                this.f3276o += (long) i10;
                this.f3272k.limit(i10);
                this.f3274m = this.f3272k;
            }
        }
        ByteBuffer byteBuffer = this.f3274m;
        this.f3274m = d.f3237a;
        return byteBuffer;
    }

    public final void c() {
        f fVar = this.f3271j;
        if (fVar != null) {
            int i8 = fVar.f3252k;
            float f8 = fVar.f3246c;
            float f9 = fVar.f3247d;
            int i9 = fVar.f3259r;
            int i10 = fVar.f3254m + ((int) ((((((((double) (i8 - i9)) / ((double) (f8 / f9))) + ((double) i9)) + fVar.f3264w) + ((double) fVar.f3256o)) / ((double) (fVar.e * f9))) + 0.5d));
            fVar.f3264w = 0.0d;
            short[] sArr = fVar.f3251j;
            int i11 = fVar.f3250h * 2;
            fVar.f3251j = fVar.c(sArr, i8, i11 + i8);
            int i12 = 0;
            while (true) {
                int i13 = fVar.f3245b;
                if (i12 >= i11 * i13) {
                    break;
                }
                fVar.f3251j[(i13 * i8) + i12] = 0;
                i12++;
            }
            fVar.f3252k = i11 + fVar.f3252k;
            fVar.f();
            if (fVar.f3254m > i10) {
                fVar.f3254m = i10;
            }
            fVar.f3252k = 0;
            fVar.f3259r = 0;
            fVar.f3256o = 0;
        }
        this.f3277p = true;
    }

    public final boolean d() {
        f fVar;
        if (!this.f3277p || ((fVar = this.f3271j) != null && fVar.f3254m * fVar.f3245b * 2 != 0)) {
            return false;
        }
        return true;
    }

    public final void e(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            f fVar = this.f3271j;
            fVar.getClass();
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f3275n += (long) remaining;
            int remaining2 = asShortBuffer.remaining();
            int i8 = fVar.f3245b;
            int i9 = remaining2 / i8;
            short[] c8 = fVar.c(fVar.f3251j, fVar.f3252k, i9);
            fVar.f3251j = c8;
            asShortBuffer.get(c8, fVar.f3252k * i8, ((i9 * i8) * 2) / 2);
            fVar.f3252k += i9;
            fVar.f();
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    public final b f(b bVar) {
        if (bVar.f3235c == 2) {
            int i8 = this.f3265b;
            if (i8 == -1) {
                i8 = bVar.f3233a;
            }
            this.e = bVar;
            b bVar2 = new b(i8, bVar.f3234b, 2);
            this.f3268f = bVar2;
            this.i = true;
            return bVar2;
        }
        throw new c(bVar);
    }

    public final void flush() {
        if (isActive()) {
            b bVar = this.e;
            this.f3269g = bVar;
            b bVar2 = this.f3268f;
            this.f3270h = bVar2;
            if (this.i) {
                this.f3271j = new f(bVar.f3233a, bVar.f3234b, this.f3266c, this.f3267d, bVar2.f3233a);
            } else {
                f fVar = this.f3271j;
                if (fVar != null) {
                    fVar.f3252k = 0;
                    fVar.f3254m = 0;
                    fVar.f3256o = 0;
                    fVar.f3257p = 0;
                    fVar.f3258q = 0;
                    fVar.f3259r = 0;
                    fVar.f3260s = 0;
                    fVar.f3261t = 0;
                    fVar.f3262u = 0;
                    fVar.f3263v = 0;
                    fVar.f3264w = 0.0d;
                }
            }
        }
        this.f3274m = d.f3237a;
        this.f3275n = 0;
        this.f3276o = 0;
        this.f3277p = false;
    }

    public final boolean isActive() {
        if (this.f3268f.f3233a == -1 || (Math.abs(this.f3266c - 1.0f) < 1.0E-4f && Math.abs(this.f3267d - 1.0f) < 1.0E-4f && this.f3268f.f3233a == this.e.f3233a)) {
            return false;
        }
        return true;
    }
}
