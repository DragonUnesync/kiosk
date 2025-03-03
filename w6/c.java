package W6;

import O6.p;
import P6.f;
import P6.g;
import java.util.Iterator;

public final class c implements V6.c {

    /* renamed from: a  reason: collision with root package name */
    public final String f6198a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6199b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6200c;

    /* renamed from: d  reason: collision with root package name */
    public final g f6201d;

    public c(String str, int i, int i8, p pVar) {
        f.e(str, "input");
        this.f6198a = str;
        this.f6199b = i;
        this.f6200c = i8;
        this.f6201d = (g) pVar;
    }

    public final Iterator iterator() {
        return new b(this);
    }
}
