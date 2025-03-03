package T0;

import G3.i;
import H3.i0;
import android.content.Context;
import android.media.AudioManager;
import h1.C1050p;
import k1.p;
import l1.g;
import l1.h;

/* renamed from: T0.b  reason: case insensitive filesystem */
public final /* synthetic */ class C0210b implements i {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f4777U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Context f4778V;

    public /* synthetic */ C0210b(Context context, int i) {
        this.f4777U = i;
        this.f4778V = context;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [p1.m, java.lang.Object] */
    public final Object get() {
        h hVar;
        switch (this.f4777U) {
            case 0:
                AudioManager audioManager = (AudioManager) this.f4778V.getApplicationContext().getSystemService("audio");
                audioManager.getClass();
                return audioManager;
            case 1:
                return new C0219k(this.f4778V);
            case 2:
                ? obj = new Object();
                obj.f14416c = new K1.i(9);
                obj.f14415b = true;
                return new C1050p(this.f4778V, obj);
            case 3:
                return new p(this.f4778V);
            default:
                Context context = this.f4778V;
                i0 i0Var = h.f13114n;
                synchronized (h.class) {
                    try {
                        if (h.f13120t == null) {
                            g gVar = new g(context);
                            h.f13120t = new h(gVar.f13110a, gVar.f13111b, gVar.f13112c, gVar.f13113d, gVar.e);
                        }
                        hVar = h.f13120t;
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                            break;
                        }
                    }
                }
                return hVar;
        }
    }
}
