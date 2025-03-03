package w3;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.bumptech.glide.d;

/* renamed from: w3.c  reason: case insensitive filesystem */
public final class C1589c extends d {
    public final /* synthetic */ Context i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ TextPaint f16198j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ d f16199k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ C1590d f16200l;

    public C1589c(C1590d dVar, Context context, TextPaint textPaint, d dVar2) {
        this.f16200l = dVar;
        this.i = context;
        this.f16198j = textPaint;
        this.f16199k = dVar2;
    }

    public final void m(int i8) {
        this.f16199k.m(i8);
    }

    public final void n(Typeface typeface, boolean z) {
        this.f16200l.g(this.i, this.f16198j, typeface);
        this.f16199k.n(typeface, z);
    }
}
