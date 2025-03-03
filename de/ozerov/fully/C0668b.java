package de.ozerov.fully;

import T2.b;
import Z1.c;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.appcompat.widget.Toolbar;
import d4.k;

/* renamed from: de.ozerov.fully.b  reason: case insensitive filesystem */
public final class C0668b extends b {

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ Toolbar f10556X;

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C0674c f10557Y;

    public C0668b(C0674c cVar, Toolbar toolbar) {
        this.f10557Y = cVar;
        this.f10556X = toolbar;
    }

    public final void b(Drawable drawable) {
        C0674c cVar = this.f10557Y;
        this.f10556X.setBackground(new ColorDrawable(cVar.f10574b.i()));
        StringBuilder sb = new StringBuilder("Failed to load background image from ");
        k kVar = cVar.f10574b;
        sb.append(kVar.N2(((c) kVar.f9767W).r("actionBarBgUrl", "")));
        Log.w("c", sb.toString());
    }

    public final void g(Drawable drawable) {
        k kVar = this.f10557Y.f10574b;
        kVar.N2(((c) kVar.f9767W).r("actionBarBgUrl", ""));
    }

    public final void i(Object obj) {
        this.f10556X.setBackground((Drawable) obj);
    }
}
