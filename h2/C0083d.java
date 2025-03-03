package H2;

import W2.b;
import android.util.Log;
import com.bumptech.glide.f;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.e;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: H2.d  reason: case insensitive filesystem */
public final class C0083d implements e {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f1948U;

    /* renamed from: V  reason: collision with root package name */
    public final Object f1949V;

    public /* synthetic */ C0083d(int i, Object obj) {
        this.f1948U = i;
        this.f1949V = obj;
    }

    private final void c() {
    }

    private final void d() {
    }

    private final void g() {
    }

    private final void h() {
    }

    public final Class a() {
        switch (this.f1948U) {
            case 0:
                return ByteBuffer.class;
            default:
                return this.f1949V.getClass();
        }
    }

    public final void b() {
        int i = this.f1948U;
    }

    public final void cancel() {
        int i = this.f1948U;
    }

    public final int e() {
        switch (this.f1948U) {
            case 0:
                return 1;
            default:
                return 1;
        }
    }

    public final void f(f fVar, d dVar) {
        switch (this.f1948U) {
            case 0:
                try {
                    dVar.d(b.a((File) this.f1949V));
                    return;
                } catch (IOException e) {
                    if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                        Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e);
                    }
                    dVar.c(e);
                    return;
                }
            default:
                dVar.d(this.f1949V);
                return;
        }
    }
}
