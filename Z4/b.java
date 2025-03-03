package z4;

import l6.g;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final g f16535a;

    /* renamed from: b  reason: collision with root package name */
    public final C1647a f16536b;

    /* renamed from: c  reason: collision with root package name */
    public final int f16537c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f16538d;

    /* JADX WARNING: type inference failed for: r1v1, types: [z4.a, java.lang.Object] */
    public b(g gVar) {
        this.f16535a = gVar;
        this.f16536b = new Object();
        this.f16537c = 0;
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [z4.a, java.lang.Object] */
    public b(b bVar) {
        if (bVar == null) {
            this.f16535a = null;
            this.f16536b = new Object();
            this.f16537c = 0;
            return;
        }
        this.f16535a = bVar.f16535a;
        this.f16536b = bVar.f16536b;
        this.f16537c = bVar.f16537c + 1;
    }
}
