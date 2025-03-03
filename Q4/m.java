package q4;

import D2.o;
import E5.a;
import L4.c;
import Q0.g;
import S5.C0185n;
import o4.C1319b;
import o4.C1320c;
import o4.d;
import o4.f;
import u4.C1493b;
import x5.C1607b;

public final class m implements d {
    public final c a(int i, C0185n nVar, C1319b bVar) {
        a aVar;
        f.a(0, i);
        if (nVar.readableBytes() >= 3) {
            int readUnsignedShort = nVar.readUnsignedShort();
            int f8 = b.f(nVar);
            int readerIndex = nVar.readerIndex();
            u4.d dVar = null;
            o oVar = null;
            while (true) {
                int readerIndex2 = nVar.readerIndex() - readerIndex;
                if (readerIndex2 < f8) {
                    int e = b.e(nVar);
                    if (e == 31) {
                        dVar = b.g(dVar, nVar, bVar);
                    } else if (e == 38) {
                        oVar = b.j(oVar, nVar, bVar);
                    } else {
                        throw b.n(e);
                    }
                } else if (readerIndex2 == f8) {
                    int readableBytes = nVar.readableBytes();
                    if (readableBytes != 0) {
                        o c8 = g.c(readableBytes);
                        int i8 = 0;
                        while (i8 < readableBytes) {
                            short readUnsignedByte = nVar.readUnsignedByte();
                            a[] aVarArr = a.f1372V;
                            int length = aVarArr.length;
                            int i9 = 0;
                            while (true) {
                                if (i9 >= length) {
                                    aVar = null;
                                    break;
                                }
                                aVar = aVarArr[i9];
                                if (aVar.f1374U == readUnsignedByte) {
                                    break;
                                }
                                i9++;
                            }
                            if (aVar != null) {
                                c8.a(aVar);
                                i8++;
                            } else {
                                throw b.o();
                            }
                        }
                        return new L4.f(readUnsignedShort, c8.b(), dVar, C1493b.a(oVar));
                    }
                    throw new C1320c(C1607b.PROTOCOL_ERROR, "must contain at least one reason code");
                } else {
                    throw b.k();
                }
            }
        } else {
            throw f.d();
        }
    }
}
