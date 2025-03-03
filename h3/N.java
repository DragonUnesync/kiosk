package H3;

import Q7.g;
import java.util.Iterator;
import java.util.ListIterator;

public final class N extends O {

    /* renamed from: W  reason: collision with root package name */
    public final transient int f2023W;

    /* renamed from: X  reason: collision with root package name */
    public final transient int f2024X;

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ O f2025Y;

    public N(O o2, int i, int i8) {
        this.f2025Y = o2;
        this.f2023W = i;
        this.f2024X = i8;
    }

    public final Object[] d() {
        return this.f2025Y.d();
    }

    public final int e() {
        return this.f2025Y.f() + this.f2023W + this.f2024X;
    }

    public final int f() {
        return this.f2025Y.f() + this.f2023W;
    }

    public final boolean g() {
        return true;
    }

    public final Object get(int i) {
        g.f(i, this.f2024X);
        return this.f2025Y.get(i + this.f2023W);
    }

    public final Iterator iterator() {
        return listIterator(0);
    }

    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final int size() {
        return this.f2024X;
    }

    /* renamed from: v */
    public final O subList(int i, int i8) {
        g.i(i, i8, this.f2024X);
        int i9 = this.f2023W;
        return this.f2025Y.subList(i + i9, i8 + i9);
    }

    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
