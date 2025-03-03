package w3;

import android.graphics.Typeface;
import com.bumptech.glide.d;
import k2.C1160q;
import t3.b;

/* renamed from: w3.a  reason: case insensitive filesystem */
public final class C1587a extends d {
    public final Typeface i;

    /* renamed from: j  reason: collision with root package name */
    public final C1160q f16195j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f16196k;

    public C1587a(C1160q qVar, Typeface typeface) {
        this.i = typeface;
        this.f16195j = qVar;
    }

    public final void m(int i8) {
        if (!this.f16196k) {
            b bVar = (b) this.f16195j.f13026V;
            if (bVar.j(this.i)) {
                bVar.h(false);
            }
        }
    }

    public final void n(Typeface typeface, boolean z) {
        if (!this.f16196k) {
            b bVar = (b) this.f16195j.f13026V;
            if (bVar.j(typeface)) {
                bVar.h(false);
            }
        }
    }
}
