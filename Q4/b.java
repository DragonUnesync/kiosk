package q4;

import D2.o;
import G5.s;
import Q0.g;
import S5.C0185n;
import h1.C1048n;
import java.nio.ByteBuffer;
import o4.C1319b;
import o4.C1320c;
import o4.f;
import u4.c;
import u4.d;
import x5.C1607b;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final C1048n f14758a = new C1048n(23);

    /* renamed from: b  reason: collision with root package name */
    public static final C1048n f14759b = new C1048n(24);

    /* renamed from: c  reason: collision with root package name */
    public static final C1048n f14760c = new C1048n(25);

    /* renamed from: d  reason: collision with root package name */
    public static final C1048n f14761d = new C1048n(26);
    public static final C1048n e = new C1048n(27);

    /* renamed from: f  reason: collision with root package name */
    public static final C1048n f14762f = new C1048n(28);

    /* renamed from: g  reason: collision with root package name */
    public static final C1048n f14763g = new C1048n(29);

    /* renamed from: h  reason: collision with root package name */
    public static final k f14764h = new k(0);
    public static final k i = new k(1);

    /* renamed from: j  reason: collision with root package name */
    public static final k f14765j = new k(2);

    public static boolean a(boolean z, String str, C0185n nVar) {
        if (z) {
            throw l(str);
        } else if (nVar.readableBytes() >= 1) {
            byte readByte = nVar.readByte();
            if (readByte == 0) {
                return false;
            }
            if (readByte == 1) {
                return true;
            }
            throw new C1320c(C1607b.PROTOCOL_ERROR, "malformed boolean for ".concat(str));
        } else {
            throw k();
        }
    }

    public static void b(String str, C1319b bVar) {
        if (!bVar.f14270b) {
            throw new C1320c(C1607b.PROTOCOL_ERROR, str.concat(" must not be included if problem information is not requested"));
        }
    }

    public static void c(C0185n nVar) {
        int j7 = s.j(nVar);
        if (j7 < 0) {
            throw k();
        } else if (nVar.readableBytes() == j7) {
        } else {
            if (nVar.readableBytes() < j7) {
                throw f.d();
            }
            throw new C1320c("must not have a payload");
        }
    }

    public static ByteBuffer d(ByteBuffer byteBuffer, String str, C0185n nVar) {
        int readUnsignedShort;
        if (byteBuffer == null) {
            ByteBuffer byteBuffer2 = null;
            if (nVar.readableBytes() >= 2 && nVar.readableBytes() >= (readUnsignedShort = nVar.readUnsignedShort())) {
                byteBuffer2 = ByteBuffer.allocate(readUnsignedShort);
                nVar.readBytes(byteBuffer2);
                byteBuffer2.position(0);
            }
            if (byteBuffer2 != null) {
                return byteBuffer2;
            }
            throw new C1320c("malformed binary data for ".concat(str));
        }
        throw l(str);
    }

    public static int e(C0185n nVar) {
        int j7 = s.j(nVar);
        if (j7 >= 0) {
            return j7;
        }
        throw new C1320c("malformed property identifier");
    }

    public static int f(C0185n nVar) {
        int j7 = s.j(nVar);
        if (j7 < 0) {
            throw k();
        } else if (nVar.readableBytes() >= j7) {
            return j7;
        } else {
            throw f.d();
        }
    }

    public static d g(d dVar, C0185n nVar, C1319b bVar) {
        b("reason string", bVar);
        return h(dVar, "reason string", nVar);
    }

    public static d h(d dVar, String str, C0185n nVar) {
        if (dVar == null) {
            d c8 = d.c(nVar);
            if (c8 != null) {
                return c8;
            }
            throw new C1320c("malformed UTF-8 string for ".concat(str));
        }
        throw l(str);
    }

    public static o i(o oVar, C0185n nVar) {
        d c8;
        d c9 = d.c(nVar);
        c cVar = null;
        if (!(c9 == null || (c8 = d.c(nVar)) == null)) {
            cVar = new c(c9, c8);
        }
        if (cVar != null) {
            if (oVar == null) {
                oVar = new o(14, (byte) 0);
            }
            oVar.a(cVar);
            return oVar;
        }
        throw new C1320c("malformed user property");
    }

    public static o j(o oVar, C0185n nVar, C1319b bVar) {
        b("user property", bVar);
        return i(oVar, nVar);
    }

    public static C1320c k() {
        return new C1320c("malformed properties length");
    }

    public static C1320c l(String str) {
        return new C1320c(C1607b.PROTOCOL_ERROR, str.concat(" must not be included more than once"));
    }

    public static int m(boolean z, String str, C0185n nVar) {
        if (z) {
            throw l(str);
        } else if (nVar.readableBytes() >= 2) {
            return nVar.readUnsignedShort();
        } else {
            throw k();
        }
    }

    public static C1320c n(int i8) {
        return new C1320c(g.m(i8, "wrong property with identifier "));
    }

    public static C1320c o() {
        return new C1320c("wrong reason code");
    }
}
