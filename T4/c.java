package t4;

import D2.j;
import G5.s;
import L4.h;
import O4.a;
import O4.b;
import S5.C0163c;
import S5.C0185n;
import S5.C0187o;
import java.nio.ByteBuffer;
import u4.C1492a;
import u4.C1493b;
import u4.d;
import u5.C1495b;

public final class c extends r4.c {

    /* renamed from: b  reason: collision with root package name */
    public static final int f15473b = (C1495b.f15785U.a() << 4);

    public final C0185n a(L4.c cVar, j jVar) {
        int i;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        j jVar2 = jVar;
        O4.c cVar2 = (O4.c) cVar;
        h hVar = (h) cVar2.f2711c;
        a aVar = (a) hVar;
        if (aVar.f3650f == 0) {
            i = 0;
        } else {
            i = 5;
        }
        b bVar = b.f3653h;
        b bVar2 = aVar.f3651g;
        if (bVar2 != bVar) {
            if (bVar2.f3654a == 65535) {
                i11 = 0;
            } else {
                i11 = 3;
            }
            int i16 = i11 + i;
            if (((long) 268435460) == 268435460) {
                i12 = 0;
            } else {
                i12 = 5;
            }
            int i17 = i12 + i16;
            if (bVar2.f3657d == 0) {
                i13 = 0;
            } else {
                i13 = 3;
            }
            int i18 = i13 + i17;
            if (!bVar2.f3659g) {
                i14 = 0;
            } else {
                i14 = 2;
            }
            int i19 = i14 + i18;
            if (bVar2.f3658f) {
                i15 = 0;
            } else {
                i15 = 2;
            }
            i = i19 + i15;
        }
        int c8 = ((C1493b) hVar.f2711c).c() + i;
        M4.b bVar3 = cVar2.e;
        if (bVar3 != null) {
            int e = bVar3.f3168a.e() + 1 + c8;
            ByteBuffer byteBuffer = bVar3.f3169b;
            if (byteBuffer == null) {
                i10 = 0;
            } else {
                i10 = byteBuffer.remaining() + 3;
            }
            c8 = i10 + e;
        }
        a aVar2 = (a) hVar;
        C1492a aVar3 = cVar2.f3660d;
        int e8 = aVar3.e() + 10;
        M4.c cVar3 = aVar2.f3652h;
        if (cVar3 != null) {
            int e9 = cVar3.f3170a.e() + e8;
            ByteBuffer byteBuffer2 = cVar3.f3171b;
            if (byteBuffer2 == null) {
                i9 = 0;
            } else {
                i9 = byteBuffer2.remaining() + 2;
            }
            e8 = i9 + e9;
        }
        int n4 = s.n(c8) + c8 + e8;
        int n5 = s.n(n4) + n4 + 1;
        int i20 = 0;
        while (true) {
            int i21 = jVar2.f1093U;
            C1493b bVar4 = (C1493b) hVar.f2711c;
            if (n5 > i21) {
                int i22 = i20 + 1;
                if (i22 != 0) {
                    if (i22 != 1) {
                        c8 = -1;
                    } else {
                        c8 -= bVar4.c();
                    }
                }
                if (c8 >= 0) {
                    int n8 = s.n(c8) + c8 + e8;
                    n5 = s.n(n8) + n8 + 1;
                    i20 = i22;
                    n4 = n8;
                } else {
                    throw r4.c.b(cVar2, n5, jVar2.f1093U);
                }
            } else {
                C0185n ioBuffer = ((C0163c) ((C0187o) jVar2.f1094V)).ioBuffer(n5, n5);
                ioBuffer.writeByte(f15473b);
                s.m(ioBuffer, n4);
                d.f15781X.d(ioBuffer);
                ioBuffer.writeByte(5);
                if (cVar3 != null) {
                    i8 = 128;
                    if (cVar3.f3171b != null) {
                        i8 = 128 | 64;
                    }
                } else {
                    i8 = 0;
                }
                if (aVar2.e) {
                    i8 |= 2;
                }
                ioBuffer.writeByte(i8);
                ioBuffer.writeShort(aVar2.f3649d);
                s.m(ioBuffer, c8);
                b.a(17, aVar2.f3650f, 0, ioBuffer);
                if (bVar3 != null) {
                    ioBuffer.writeByte(21);
                    bVar3.f3168a.d(ioBuffer);
                    ByteBuffer byteBuffer3 = bVar3.f3169b;
                    if (byteBuffer3 != null) {
                        ioBuffer.writeByte(22);
                        ioBuffer.writeShort(byteBuffer3.remaining());
                        ioBuffer.writeBytes(byteBuffer3.duplicate());
                    }
                }
                b bVar5 = aVar2.f3651g;
                if (bVar5 != bVar) {
                    int i23 = bVar5.f3654a;
                    if (i23 != 65535) {
                        ioBuffer.writeByte(33);
                        ioBuffer.writeShort(i23);
                    }
                    b.a(39, (long) 268435460, 268435460, ioBuffer);
                    int i24 = bVar5.f3657d;
                    if (i24 != 0) {
                        ioBuffer.writeByte(34);
                        ioBuffer.writeShort(i24);
                    }
                    boolean z = bVar5.f3659g;
                    if (z) {
                        ioBuffer.writeByte(25);
                        ioBuffer.writeByte(z ? 1 : 0);
                    }
                    boolean z6 = bVar5.f3658f;
                    if (!z6) {
                        ioBuffer.writeByte(23);
                        ioBuffer.writeByte(z6 ? 1 : 0);
                    }
                }
                if (i20 == 0) {
                    bVar4.b(ioBuffer);
                }
                aVar3.d(ioBuffer);
                if (cVar3 != null) {
                    cVar3.f3170a.d(ioBuffer);
                    ByteBuffer byteBuffer4 = cVar3.f3171b;
                    if (byteBuffer4 != null) {
                        ioBuffer.writeShort(byteBuffer4.remaining());
                        ioBuffer.writeBytes(byteBuffer4.duplicate());
                    }
                }
                return ioBuffer;
            }
        }
    }
}
