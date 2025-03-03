package de.ozerov.fully;

import T2.g;
import android.graphics.drawable.Drawable;
import android.util.Log;
import n2.a;

/* renamed from: de.ozerov.fully.m  reason: case insensitive filesystem */
public final class C0734m {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10792a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f10793b;

    public /* synthetic */ C0734m(int i, Object obj) {
        this.f10792a = i;
        this.f10793b = obj;
    }

    public final void a() {
        Object obj = this.f10793b;
        switch (this.f10792a) {
            case 0:
                ((C0740n) ((C0734m) obj).f10793b).f10832p = null;
                return;
            default:
                StringBuilder sb = new StringBuilder("onLoadFailed ");
                C0740n nVar = (C0740n) obj;
                sb.append(nVar.f10830n);
                Log.e("n", sb.toString());
                nVar.d();
                a.b1(nVar.f10819a, "Failed loading media: " + nVar.f10830n);
                nVar.e();
                return;
        }
    }

    public final void b(Object obj, g gVar) {
        Object obj2 = this.f10793b;
        switch (this.f10792a) {
            case 0:
                Drawable drawable = (Drawable) obj;
                C0740n nVar = (C0740n) ((C0734m) obj2).f10793b;
                nVar.f10832p = nVar.f10831o;
                return;
            default:
                Drawable drawable2 = (Drawable) obj;
                C0740n nVar2 = (C0740n) obj2;
                nVar2.d();
                nVar2.f10824g.setAlpha(0.0f);
                nVar2.f10823f.animate().alpha(1.0f).setDuration((long) nVar2.f10840x);
                nVar2.f10828l = false;
                W2 w2 = nVar2.f10816F;
                if (w2 != null) {
                    w2.run();
                }
                gVar.h(new C0728l(this));
                return;
        }
    }
}
