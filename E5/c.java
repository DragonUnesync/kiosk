package e5;

import D2.o;
import J4.a;
import de.ozerov.fully.K2;
import e6.C0862v;
import g7.C0996d;
import i5.k;
import i5.p;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import m4.C1213a;
import m4.C1214b;
import m4.d;
import m4.e;
import m4.f;
import m4.g;
import u.C1477r;
import u4.C1492a;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public Serializable f11265a;

    /* renamed from: b  reason: collision with root package name */
    public int f11266b;

    /* renamed from: c  reason: collision with root package name */
    public e f11267c;

    /* renamed from: d  reason: collision with root package name */
    public g f11268d;
    public C1492a e;

    /* renamed from: f  reason: collision with root package name */
    public f f11269f;

    /* renamed from: g  reason: collision with root package name */
    public d f11270g;

    /* renamed from: h  reason: collision with root package name */
    public a f11271h;
    public o i;

    /* renamed from: j  reason: collision with root package name */
    public o f11272j;

    /* renamed from: k  reason: collision with root package name */
    public M4.c f11273k;

    public final K2 a() {
        C1213a aVar;
        p pVar;
        p pVar2;
        p b8;
        InetSocketAddress inetSocketAddress;
        M4.c cVar = this.f11273k;
        if (cVar == null) {
            aVar = C1213a.f13354b;
        } else {
            aVar = new C1213a(cVar);
        }
        C1492a aVar2 = this.e;
        f fVar = this.f11269f;
        if (fVar == null) {
            Serializable serializable = this.f11265a;
            int i8 = 443;
            if (serializable instanceof InetAddress) {
                InetAddress inetAddress = (InetAddress) this.f11265a;
                int i9 = this.f11266b;
                if (i9 != -1) {
                    i8 = i9;
                } else if (this.f11267c == null) {
                    if (this.f11268d == null) {
                        i8 = 1883;
                    } else {
                        i8 = 80;
                    }
                } else if (this.f11268d == null) {
                    i8 = 8883;
                }
                inetSocketAddress = new InetSocketAddress(inetAddress, i8);
            } else {
                String str = (String) serializable;
                int i10 = this.f11266b;
                if (i10 != -1) {
                    i8 = i10;
                } else if (this.f11267c == null) {
                    if (this.f11268d == null) {
                        i8 = 1883;
                    } else {
                        i8 = 80;
                    }
                } else if (this.f11268d == null) {
                    i8 = 8883;
                }
                byte[] createByteArrayFromIpAddressString = C0862v.createByteArrayFromIpAddressString(str);
                if (createByteArrayFromIpAddressString != null) {
                    try {
                        inetSocketAddress = new InetSocketAddress(InetAddress.getByAddress(createByteArrayFromIpAddressString), i8);
                    } catch (UnknownHostException unused) {
                    }
                }
                inetSocketAddress = InetSocketAddress.createUnresolved(str, i8);
            }
            fVar = new f(inetSocketAddress, this.f11267c, this.f11268d);
        }
        f fVar2 = fVar;
        o oVar = this.i;
        p pVar3 = k.f12748U;
        if (oVar == null) {
            pVar = pVar3;
        } else {
            pVar = oVar.b();
        }
        o oVar2 = this.f11272j;
        if (oVar2 == null) {
            a aVar3 = this.f11271h;
            if (aVar3 != null) {
                pVar3 = new i5.f(1, aVar3);
            }
            pVar2 = pVar3;
        } else {
            a aVar4 = this.f11271h;
            if (aVar4 == null) {
                b8 = oVar2.b();
            } else {
                o oVar3 = new o(14, (byte) 0);
                oVar3.a(aVar4);
                p b9 = this.f11272j.b();
                int size = b9.size();
                if (size != 0) {
                    int i11 = 0;
                    if (size != 1) {
                        int i12 = oVar3.f1137V + size;
                        Object[] e8 = oVar3.e(i12);
                        while (i11 < size) {
                            Object obj = b9.get(i11);
                            C0996d.r(obj, "Immutable list");
                            e8[oVar3.f1137V + i11] = obj;
                            i11++;
                            size = size;
                        }
                        oVar3.f1137V = i12;
                    } else {
                        oVar3.a(b9.get(0));
                    }
                }
                b8 = oVar3.b();
            }
            pVar2 = b8;
        }
        return new K2(new C1213a(new C1213a(new C1214b(aVar2, fVar2, this.f11270g, aVar, pVar, pVar2))));
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [u4.d, u4.a] */
    public final void b(String str) {
        int i8 = C1492a.f15775Z;
        C0996d.r(str, "Client identifier");
        u4.d.a(str, "Client identifier");
        u4.d.b(str, "Client identifier");
        this.e = new u4.d(str);
    }

    public final void c(int i8) {
        this.f11269f = null;
        long j7 = (long) i8;
        if (j7 < 0 || j7 > 65535) {
            throw new IllegalArgumentException(C1477r.c(i8, "Server port must not exceed the value range of unsigned short [0, 65535], but was ", "."));
        }
        this.f11266b = i8;
    }
}
