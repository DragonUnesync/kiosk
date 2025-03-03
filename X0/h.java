package X0;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final String f6243a;

    /* renamed from: b  reason: collision with root package name */
    public final long f6244b;

    /* renamed from: c  reason: collision with root package name */
    public final List f6245c;

    /* renamed from: d  reason: collision with root package name */
    public final List f6246d;

    public h(String str, long j7, ArrayList arrayList, List list) {
        this.f6243a = str;
        this.f6244b = j7;
        this.f6245c = DesugarCollections.unmodifiableList(arrayList);
        this.f6246d = DesugarCollections.unmodifiableList(list);
    }
}
