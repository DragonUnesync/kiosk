package N0;

import H3.i0;
import P0.l;
import java.nio.ByteBuffer;
import java.util.ArrayList;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final i0 f3229a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f3230b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public ByteBuffer[] f3231c = new ByteBuffer[0];

    /* renamed from: d  reason: collision with root package name */
    public boolean f3232d;

    public a(i0 i0Var) {
        this.f3229a = i0Var;
        b bVar = b.e;
        this.f3232d = false;
    }

    public final b a(b bVar) {
        if (!bVar.equals(b.e)) {
            int i = 0;
            while (true) {
                i0 i0Var = this.f3229a;
                if (i >= i0Var.size()) {
                    return bVar;
                }
                d dVar = (d) i0Var.get(i);
                b f8 = dVar.f(bVar);
                if (dVar.isActive()) {
                    l.j(!f8.equals(b.e));
                    bVar = f8;
                }
                i++;
            }
        } else {
            throw new c(bVar);
        }
    }

    public final void b() {
        ArrayList arrayList = this.f3230b;
        arrayList.clear();
        this.f3232d = false;
        int i = 0;
        while (true) {
            i0 i0Var = this.f3229a;
            if (i >= i0Var.size()) {
                break;
            }
            d dVar = (d) i0Var.get(i);
            dVar.flush();
            if (dVar.isActive()) {
                arrayList.add(dVar);
            }
            i++;
        }
        this.f3231c = new ByteBuffer[arrayList.size()];
        for (int i8 = 0; i8 <= c(); i8++) {
            this.f3231c[i8] = ((d) arrayList.get(i8)).b();
        }
    }

    public final int c() {
        return this.f3231c.length - 1;
    }

    public final boolean d() {
        if (!this.f3232d || !((d) this.f3230b.get(c())).d() || this.f3231c[c()].hasRemaining()) {
            return false;
        }
        return true;
    }

    public final boolean e() {
        return !this.f3230b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        i0 i0Var = this.f3229a;
        if (i0Var.size() != aVar.f3229a.size()) {
            return false;
        }
        for (int i = 0; i < i0Var.size(); i++) {
            if (i0Var.get(i) != aVar.f3229a.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final void f(ByteBuffer byteBuffer) {
        boolean z;
        ByteBuffer byteBuffer2;
        boolean z6;
        for (boolean z8 = true; z8; z8 = z) {
            z = false;
            for (int i = 0; i <= c(); i++) {
                if (!this.f3231c[i].hasRemaining()) {
                    ArrayList arrayList = this.f3230b;
                    d dVar = (d) arrayList.get(i);
                    if (!dVar.d()) {
                        if (i > 0) {
                            byteBuffer2 = this.f3231c[i - 1];
                        } else if (byteBuffer.hasRemaining()) {
                            byteBuffer2 = byteBuffer;
                        } else {
                            byteBuffer2 = d.f3237a;
                        }
                        dVar.e(byteBuffer2);
                        this.f3231c[i] = dVar.b();
                        if (((long) byteBuffer2.remaining()) - ((long) byteBuffer2.remaining()) > 0 || this.f3231c[i].hasRemaining()) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        z |= z6;
                    } else if (!this.f3231c[i].hasRemaining() && i < c()) {
                        ((d) arrayList.get(i + 1)).c();
                    }
                }
            }
        }
    }

    public final int hashCode() {
        return this.f3229a.hashCode();
    }
}
