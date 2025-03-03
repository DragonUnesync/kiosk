package androidx.activity.result;

import G5.s;
import android.os.Bundle;
import androidx.camera.lifecycle.c;
import androidx.lifecycle.C0485l;
import androidx.lifecycle.C0489p;
import androidx.lifecycle.r;
import java.util.HashMap;

class ActivityResultRegistry$1 implements C0489p {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ String f7320U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ c f7321V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ s f7322W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ g f7323X;

    public ActivityResultRegistry$1(g gVar, String str, c cVar, s sVar) {
        this.f7323X = gVar;
        this.f7320U = str;
        this.f7321V = cVar;
        this.f7322W = sVar;
    }

    public final void c(r rVar, C0485l lVar) {
        boolean equals = C0485l.ON_START.equals(lVar);
        String str = this.f7320U;
        g gVar = this.f7323X;
        if (equals) {
            HashMap hashMap = gVar.e;
            c cVar = this.f7321V;
            s sVar = this.f7322W;
            hashMap.put(str, new e(cVar, sVar));
            HashMap hashMap2 = gVar.f7339f;
            if (hashMap2.containsKey(str)) {
                Object obj = hashMap2.get(str);
                hashMap2.remove(str);
                cVar.b(obj);
            }
            Bundle bundle = gVar.f7340g;
            a aVar = (a) bundle.getParcelable(str);
            if (aVar != null) {
                bundle.remove(str);
                cVar.b(sVar.w(aVar.f7324U, aVar.f7325V));
            }
        } else if (C0485l.ON_STOP.equals(lVar)) {
            gVar.e.remove(str);
        } else if (C0485l.ON_DESTROY.equals(lVar)) {
            gVar.f(str);
        }
    }
}
