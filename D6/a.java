package D6;

import B.C0020v;
import O6.l;
import P6.f;
import P6.g;
import T6.c;
import W6.d;
import android.app.Service;
import android.content.Context;

public final class a extends g implements l {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f1251U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Object f1252V;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i, Object obj) {
        super(1);
        this.f1251U = i;
        this.f1252V = obj;
    }

    public final Object a(Object obj) {
        switch (this.f1251U) {
            case 0:
                if (obj == ((e) this.f1252V)) {
                    return "(this Collection)";
                }
                return String.valueOf(obj);
            case 1:
                c cVar = (c) obj;
                f.e(cVar, "it");
                return d.p0((String) this.f1252V, cVar);
            case 2:
                C0020v vVar = (C0020v) obj;
                androidx.camera.lifecycle.d dVar = androidx.camera.lifecycle.d.f7670g;
                f.d(vVar, "cameraX");
                dVar.f7674d = vVar;
                Context h5 = com.bumptech.glide.d.h((Service) this.f1252V);
                f.d(h5, "getApplicationContext(context)");
                dVar.e = h5;
                return dVar;
            default:
                Void voidR = (Void) obj;
                return ((C0020v) this.f1252V).f334j;
        }
    }
}
