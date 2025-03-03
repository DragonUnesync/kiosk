package p4;

import D7.b;
import L4.c;
import S5.C0185n;
import i5.h;
import java.nio.ByteBuffer;
import k5.a;
import o4.C1319b;
import o4.C1320c;
import o4.d;
import o4.f;
import u4.C1492a;
import u4.C1493b;
import x5.C1607b;
import y5.C1635a;

public final class i implements d {
    public final c a(int i, C0185n nVar, C1319b bVar) {
        boolean z;
        boolean z6;
        C1492a aVar;
        int i8;
        ByteBuffer byteBuffer;
        int i9 = i;
        if ((i9 & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        a c8 = f.c(i9, z);
        if ((i9 & 1) != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (nVar.readableBytes() >= 2) {
            int i10 = C1492a.f15775Z;
            byte[] k8 = b.k(nVar);
            if (k8 == null) {
                aVar = null;
            } else {
                aVar = C1492a.i(k8);
            }
            if (aVar != null) {
                if (c8 == a.f13047U) {
                    i8 = -1;
                } else if (nVar.readableBytes() >= 2) {
                    i8 = nVar.readUnsignedShort();
                } else {
                    throw f.d();
                }
                int readableBytes = nVar.readableBytes();
                if (readableBytes > 0) {
                    bVar.getClass();
                    ByteBuffer allocate = ByteBuffer.allocate(readableBytes);
                    nVar.readBytes(allocate);
                    allocate.position(0);
                    byteBuffer = allocate;
                } else {
                    byteBuffer = null;
                }
                return new V4.f(new V4.a(aVar, byteBuffer, c8, z6, Long.MAX_VALUE, (C1635a) null, (u4.d) null, (C1492a) null, (ByteBuffer) null, C1493b.f15776c), i8, z, 0, h.f12745a);
            }
            throw new C1320c(C1607b.TOPIC_NAME_INVALID, "malformed topic");
        }
        throw f.d();
    }
}
