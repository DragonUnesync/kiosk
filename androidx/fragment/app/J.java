package androidx.fragment.app;

import java.util.ArrayList;

public final class J implements I {

    /* renamed from: a  reason: collision with root package name */
    public final int f7853a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7854b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ L f7855c;

    public J(L l8, int i, int i8) {
        this.f7855c = l8;
        this.f7853a = i;
        this.f7854b = i8;
    }

    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        L l8 = this.f7855c;
        C0470v vVar = l8.z;
        int i = this.f7853a;
        if (vVar == null || i >= 0 || !vVar.i().S(-1, 0)) {
            return l8.T(arrayList, arrayList2, i, this.f7854b);
        }
        return false;
    }
}
