package J7;

import B.B;
import B7.g;
import I7.a;
import java.io.IOException;
import java.io.OutputStream;

public final class c extends OutputStream {

    /* renamed from: U  reason: collision with root package name */
    public final int f2522U = Integer.MAX_VALUE;

    /* renamed from: V  reason: collision with root package name */
    public final g f2523V;

    /* renamed from: W  reason: collision with root package name */
    public final a f2524W;

    /* renamed from: X  reason: collision with root package name */
    public long f2525X;

    /* renamed from: Y  reason: collision with root package name */
    public boolean f2526Y;

    public c(g gVar, B b8) {
        this.f2523V = gVar;
        this.f2524W = b8;
    }

    public final void close() {
        try {
            flush();
        } catch (IOException unused) {
        }
        ((OutputStream) this.f2524W.c(this)).close();
    }

    public final void flush() {
        ((OutputStream) this.f2524W.c(this)).flush();
    }

    public final void k(int i) {
        if (!this.f2526Y && this.f2525X + ((long) i) > ((long) this.f2522U)) {
            this.f2526Y = true;
            this.f2523V.b(this);
        }
    }

    public final void write(byte[] bArr) {
        k(bArr.length);
        ((OutputStream) this.f2524W.c(this)).write(bArr);
        this.f2525X += (long) bArr.length;
    }

    public final void write(byte[] bArr, int i, int i8) {
        k(i8);
        ((OutputStream) this.f2524W.c(this)).write(bArr, i, i8);
        this.f2525X += (long) i8;
    }

    public final void write(int i) {
        k(1);
        ((OutputStream) this.f2524W.c(this)).write(i);
        this.f2525X++;
    }
}
