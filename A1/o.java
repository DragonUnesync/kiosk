package a1;

import e1.C0827a;
import j$.util.DesugarCollections;
import java.util.List;

public abstract class o implements C0827a {

    /* renamed from: a  reason: collision with root package name */
    public final String f7111a;

    /* renamed from: b  reason: collision with root package name */
    public final List f7112b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f7113c;

    public o(String str, List list, boolean z) {
        this.f7111a = str;
        this.f7112b = DesugarCollections.unmodifiableList(list);
        this.f7113c = z;
    }
}
