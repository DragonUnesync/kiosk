package S0;

import M0.D;
import M0.r;
import N.e;
import Q0.d;
import java.nio.ByteBuffer;

public class f extends d {

    /* renamed from: W  reason: collision with root package name */
    public r f4384W;

    /* renamed from: X  reason: collision with root package name */
    public final b f4385X = new b();

    /* renamed from: Y  reason: collision with root package name */
    public ByteBuffer f4386Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f4387Z;

    /* renamed from: a0  reason: collision with root package name */
    public long f4388a0;

    /* renamed from: b0  reason: collision with root package name */
    public ByteBuffer f4389b0;

    /* renamed from: c0  reason: collision with root package name */
    public final int f4390c0;

    static {
        D.a("media3.decoder");
    }

    public f(int i) {
        this.f4390c0 = i;
    }

    public void r() {
        this.f4018V = 0;
        ByteBuffer byteBuffer = this.f4386Y;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f4389b0;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f4387Z = false;
    }

    public final ByteBuffer t(int i) {
        int i8;
        int i9 = this.f4390c0;
        if (i9 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i9 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f4386Y;
        if (byteBuffer == null) {
            i8 = 0;
        } else {
            i8 = byteBuffer.capacity();
        }
        throw new IllegalStateException(e.v("Buffer too small (", i8, " < ", i, ")"));
    }

    public final void u(int i) {
        ByteBuffer byteBuffer = this.f4386Y;
        if (byteBuffer == null) {
            this.f4386Y = t(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i8 = i + position;
        if (capacity >= i8) {
            this.f4386Y = byteBuffer;
            return;
        }
        ByteBuffer t8 = t(i8);
        t8.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            t8.put(byteBuffer);
        }
        this.f4386Y = t8;
    }

    public final void v() {
        ByteBuffer byteBuffer = this.f4386Y;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f4389b0;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
