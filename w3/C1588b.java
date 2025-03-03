package w3;

import android.graphics.Typeface;
import com.bumptech.glide.d;
import l0.C1169b;

/* renamed from: w3.b  reason: case insensitive filesystem */
public final class C1588b extends C1169b {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ d f16197h;
    public final /* synthetic */ C1590d i;

    public C1588b(C1590d dVar, d dVar2) {
        this.i = dVar;
        this.f16197h = dVar2;
    }

    public final void h(int i8) {
        this.i.f16211m = true;
        this.f16197h.m(i8);
    }

    public final void i(Typeface typeface) {
        C1590d dVar = this.i;
        dVar.f16212n = Typeface.create(typeface, dVar.f16203c);
        dVar.f16211m = true;
        this.f16197h.n(dVar.f16212n, false);
    }
}
