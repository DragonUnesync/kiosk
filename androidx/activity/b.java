package androidx.activity;

import P6.f;
import android.window.BackEvent;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final float f7273a;

    /* renamed from: b  reason: collision with root package name */
    public final float f7274b;

    /* renamed from: c  reason: collision with root package name */
    public final float f7275c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7276d;

    public b(BackEvent backEvent) {
        f.e(backEvent, "backEvent");
        a aVar = a.f7272a;
        float d8 = aVar.d(backEvent);
        float e = aVar.e(backEvent);
        float b8 = aVar.b(backEvent);
        int c8 = aVar.c(backEvent);
        this.f7273a = d8;
        this.f7274b = e;
        this.f7275c = b8;
        this.f7276d = c8;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f7273a + ", touchY=" + this.f7274b + ", progress=" + this.f7275c + ", swipeEdge=" + this.f7276d + '}';
    }
}
