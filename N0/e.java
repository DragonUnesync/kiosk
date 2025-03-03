package N0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public abstract class e implements d {

    /* renamed from: b  reason: collision with root package name */
    public b f3238b;

    /* renamed from: c  reason: collision with root package name */
    public b f3239c;

    /* renamed from: d  reason: collision with root package name */
    public b f3240d;
    public b e;

    /* renamed from: f  reason: collision with root package name */
    public ByteBuffer f3241f;

    /* renamed from: g  reason: collision with root package name */
    public ByteBuffer f3242g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3243h;

    public e() {
        ByteBuffer byteBuffer = d.f3237a;
        this.f3241f = byteBuffer;
        this.f3242g = byteBuffer;
        b bVar = b.e;
        this.f3240d = bVar;
        this.e = bVar;
        this.f3238b = bVar;
        this.f3239c = bVar;
    }

    public final void a() {
        flush();
        this.f3241f = d.f3237a;
        b bVar = b.e;
        this.f3240d = bVar;
        this.e = bVar;
        this.f3238b = bVar;
        this.f3239c = bVar;
        j();
    }

    public ByteBuffer b() {
        ByteBuffer byteBuffer = this.f3242g;
        this.f3242g = d.f3237a;
        return byteBuffer;
    }

    public final void c() {
        this.f3243h = true;
        i();
    }

    public boolean d() {
        if (!this.f3243h || this.f3242g != d.f3237a) {
            return false;
        }
        return true;
    }

    public final b f(b bVar) {
        this.f3240d = bVar;
        this.e = g(bVar);
        if (isActive()) {
            return this.e;
        }
        return b.e;
    }

    public final void flush() {
        this.f3242g = d.f3237a;
        this.f3243h = false;
        this.f3238b = this.f3240d;
        this.f3239c = this.e;
        h();
    }

    public abstract b g(b bVar);

    public void h() {
    }

    public void i() {
    }

    public boolean isActive() {
        if (this.e != b.e) {
            return true;
        }
        return false;
    }

    public void j() {
    }

    public final ByteBuffer k(int i) {
        if (this.f3241f.capacity() < i) {
            this.f3241f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f3241f.clear();
        }
        ByteBuffer byteBuffer = this.f3241f;
        this.f3242g = byteBuffer;
        return byteBuffer;
    }
}
