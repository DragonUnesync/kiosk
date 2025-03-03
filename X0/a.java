package X0;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final long f6205a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6206b;

    /* renamed from: c  reason: collision with root package name */
    public final List f6207c;

    /* renamed from: d  reason: collision with root package name */
    public final List f6208d;
    public final List e;

    /* renamed from: f  reason: collision with root package name */
    public final List f6209f;

    public a(long j7, int i, ArrayList arrayList, List list, List list2, List list3) {
        this.f6205a = j7;
        this.f6206b = i;
        this.f6207c = DesugarCollections.unmodifiableList(arrayList);
        this.f6208d = DesugarCollections.unmodifiableList(list);
        this.e = DesugarCollections.unmodifiableList(list2);
        this.f6209f = DesugarCollections.unmodifiableList(list3);
    }
}
