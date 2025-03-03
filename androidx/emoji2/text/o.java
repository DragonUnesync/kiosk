package androidx.emoji2.text;

import D0.a;
import java.nio.ByteBuffer;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public int f7803a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final r f7804b;

    /* renamed from: c  reason: collision with root package name */
    public r f7805c;

    /* renamed from: d  reason: collision with root package name */
    public r f7806d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public int f7807f;

    public o(r rVar) {
        this.f7804b = rVar;
        this.f7805c = rVar;
    }

    public final void a() {
        this.f7803a = 1;
        this.f7805c = this.f7804b;
        this.f7807f = 0;
    }

    public final boolean b() {
        a c8 = this.f7805c.f7818b.c();
        int a8 = c8.a(6);
        if ((a8 == 0 || ((ByteBuffer) c8.f980d).get(a8 + c8.f977a) == 0) && this.e != 65039) {
            return false;
        }
        return true;
    }
}
