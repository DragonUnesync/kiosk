package i5;

import java.util.List;
import java.util.ListIterator;

public final class e extends f {

    /* renamed from: W  reason: collision with root package name */
    public final int f12739W;

    /* renamed from: X  reason: collision with root package name */
    public final int f12740X;

    public e(int i, int i8, Object[] objArr) {
        super(0, objArr);
        this.f12739W = i;
        this.f12740X = i8;
    }

    public final p a() {
        return new f(0, toArray());
    }

    public final int b() {
        return this.f12739W;
    }

    public final int c() {
        return this.f12740X;
    }

    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return e(i);
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i8) {
        return f(i, i8);
    }
}
