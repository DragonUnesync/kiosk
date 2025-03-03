package p4;

import D2.o;
import D5.a;
import L4.c;
import Q0.g;
import S5.C0185n;
import i5.p;
import o4.C1319b;
import o4.C1320c;
import o4.d;
import o4.f;
import s5.C1406a;
import u4.C1493b;

public final class j implements d {
    public final c a(int i, C0185n nVar, C1319b bVar) {
        a aVar;
        f.a(0, i);
        if (nVar.readableBytes() >= 3) {
            int readUnsignedShort = nVar.readUnsignedShort();
            int readableBytes = nVar.readableBytes();
            o c8 = g.c(readableBytes);
            int i8 = 0;
            while (true) {
                C1406a aVar2 = null;
                if (i8 < readableBytes) {
                    short readUnsignedByte = nVar.readUnsignedByte();
                    if (readUnsignedByte == 0) {
                        aVar2 = C1406a.f15115U;
                    } else if (readUnsignedByte == 1) {
                        aVar2 = C1406a.f15116V;
                    } else if (readUnsignedByte == 2) {
                        aVar2 = C1406a.f15117W;
                    } else if (readUnsignedByte == 128) {
                        aVar2 = C1406a.f15118X;
                    }
                    if (aVar2 != null) {
                        c8.a(aVar2);
                        i8++;
                    } else {
                        throw new C1320c("wrong return code");
                    }
                } else {
                    p b8 = c8.b();
                    o c9 = g.c(b8.size());
                    for (int i9 = 0; i9 < b8.size(); i9++) {
                        int ordinal = ((C1406a) b8.get(i9)).ordinal();
                        if (ordinal == 0) {
                            aVar = a.GRANTED_QOS_0;
                        } else if (ordinal == 1) {
                            aVar = a.GRANTED_QOS_1;
                        } else if (ordinal == 2) {
                            aVar = a.GRANTED_QOS_2;
                        } else if (ordinal == 3) {
                            aVar = a.UNSPECIFIED_ERROR;
                        } else {
                            throw new IllegalStateException();
                        }
                        c9.a(aVar);
                    }
                    return new L4.f(readUnsignedShort, c9.b(), (u4.d) null, C1493b.f15776c);
                }
            }
        } else {
            throw f.d();
        }
    }
}
