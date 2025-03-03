package Q5;

import P6.f;
import Y6.t;
import Y6.u;
import Y6.v;
import c7.C0624d;
import c7.C0625e;
import c7.h;
import c7.j;
import d7.C0659d;
import e5.b;
import f7.C0937B;
import f7.C0938a;
import g7.C0996d;
import java.io.IOException;
import java.nio.ByteBuffer;
import l7.q;
import r5.C1390a;
import u4.C1492a;
import u4.C1493b;
import u4.d;
import y5.C1635a;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f4122a;

    /* renamed from: b  reason: collision with root package name */
    public Object f4123b;

    /* renamed from: c  reason: collision with root package name */
    public Object f4124c;

    /* renamed from: d  reason: collision with root package name */
    public Object f4125d = C1390a.f14949a;
    public Object e;

    public a(b bVar) {
        this.e = bVar;
    }

    public IOException a(boolean z, boolean z6, IOException iOException) {
        if (iOException != null) {
            f(iOException);
        }
        h hVar = (h) this.f4123b;
        if (z6) {
            if (iOException != null) {
                f.e(hVar, "call");
            } else {
                f.e(hVar, "call");
            }
        }
        if (z) {
            if (iOException != null) {
                f.e(hVar, "call");
            } else {
                f.e(hVar, "call");
            }
        }
        return hVar.f(this, z6, z, iOException);
    }

    public v b(u uVar) {
        C0659d dVar = (C0659d) this.f4125d;
        try {
            uVar.f6744Z.b("Content-Type");
            long d8 = dVar.d(uVar);
            return new v(d8, new q(new C0624d(this, dVar.b(uVar), d8)), 1);
        } catch (IOException e8) {
            f.e((h) this.f4123b, "call");
            f(e8);
            throw e8;
        }
    }

    public t c(boolean z) {
        try {
            t f8 = ((C0659d) this.f4125d).f(z);
            if (f8 != null) {
                f8.f6738m = this;
            }
            return f8;
        } catch (IOException e8) {
            f.e((h) this.f4123b, "call");
            f(e8);
            throw e8;
        }
    }

    public void d() {
        C0996d.r((C1492a) this.f4123b, "Topic");
        ((b) this.e).apply(new W4.a(new V4.a((C1492a) this.f4123b, (ByteBuffer) this.f4124c, (k5.a) this.f4125d, this.f4122a, Long.MAX_VALUE, (C1635a) null, (d) null, (C1492a) null, (ByteBuffer) null, C1493b.f15776c)));
    }

    public a e(String str) {
        int i = C1492a.f15775Z;
        C0996d.o(str, "Topic");
        d.a(str, "Topic");
        d.b(str, "Topic");
        int indexOf = str.indexOf(35);
        if (indexOf == -1) {
            int indexOf2 = str.indexOf(43);
            if (indexOf2 == -1) {
                this.f4123b = new d(str);
                return this;
            }
            throw new IllegalArgumentException("Topic [" + str + "] must not contain single level wildcard (+), found at index " + indexOf2 + ".");
        }
        throw new IllegalArgumentException("Topic [" + str + "] must not contain multi level wildcard (#), found at index " + indexOf + ".");
    }

    public void f(IOException iOException) {
        boolean z;
        this.f4122a = true;
        ((C0625e) this.f4124c).e(iOException);
        j h5 = ((C0659d) this.f4125d).h();
        h hVar = (h) this.f4123b;
        synchronized (h5) {
            try {
                f.e(hVar, "call");
                if (!(iOException instanceof C0937B)) {
                    if (h5.f8943g != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z || (iOException instanceof C0938a)) {
                        h5.f8945j = true;
                        if (h5.f8948m == 0) {
                            j.d(hVar.f8923U, h5.f8939b, iOException);
                            h5.f8947l++;
                        }
                    }
                } else if (((C0937B) iOException).f11695U == 8) {
                    int i = h5.f8949n + 1;
                    h5.f8949n = i;
                    if (i > 1) {
                        h5.f8945j = true;
                        h5.f8947l++;
                    }
                } else if (((C0937B) iOException).f11695U != 9 || !hVar.f8935g0) {
                    h5.f8945j = true;
                    h5.f8947l++;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }
}
