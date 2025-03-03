package a0;

import java.util.concurrent.CancellationException;

/* renamed from: a0.a  reason: case insensitive filesystem */
public final class C0409a {

    /* renamed from: b  reason: collision with root package name */
    public static final C0409a f6987b;

    /* renamed from: c  reason: collision with root package name */
    public static final C0409a f6988c;

    /* renamed from: a  reason: collision with root package name */
    public final CancellationException f6989a;

    static {
        if (i.f7004X) {
            f6988c = null;
            f6987b = null;
            return;
        }
        f6988c = new C0409a(false, (CancellationException) null);
        f6987b = new C0409a(true, (CancellationException) null);
    }

    public C0409a(boolean z, CancellationException cancellationException) {
        this.f6989a = cancellationException;
    }
}
