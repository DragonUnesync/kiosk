package w0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: w0.a  reason: case insensitive filesystem */
public final class C1572a extends ClickableSpan {

    /* renamed from: a  reason: collision with root package name */
    public final int f16177a;

    /* renamed from: b  reason: collision with root package name */
    public final C1576e f16178b;

    /* renamed from: c  reason: collision with root package name */
    public final int f16179c;

    public C1572a(int i, C1576e eVar, int i8) {
        this.f16177a = i;
        this.f16178b = eVar;
        this.f16179c = i8;
    }

    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f16177a);
        this.f16178b.f16192a.performAction(this.f16179c, bundle);
    }
}
