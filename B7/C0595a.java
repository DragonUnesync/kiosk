package b7;

import P6.f;

/* renamed from: b7.a  reason: case insensitive filesystem */
public abstract class C0595a {

    /* renamed from: a  reason: collision with root package name */
    public final String f8685a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f8686b;

    /* renamed from: c  reason: collision with root package name */
    public C0597c f8687c;

    /* renamed from: d  reason: collision with root package name */
    public long f8688d = -1;

    public C0595a(String str, boolean z) {
        f.e(str, "name");
        this.f8685a = str;
        this.f8686b = z;
    }

    public abstract long a();

    public final String toString() {
        return this.f8685a;
    }
}
