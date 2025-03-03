package s4;

import G5.s;
import L4.h;
import O4.a;
import S5.C0185n;
import java.nio.ByteBuffer;
import p5.C1344a;
import u4.d;

public final class c extends f {

    /* renamed from: c  reason: collision with root package name */
    public static final int f15098c = (C1344a.f14656U.a() << 4);

    public final void f(L4.c cVar, C0185n nVar, int i) {
        int i8;
        O4.c cVar2 = (O4.c) cVar;
        nVar.writeByte(f15098c);
        s.m(nVar, i);
        a aVar = (a) ((h) cVar2.f2711c);
        d.f15781X.d(nVar);
        nVar.writeByte(4);
        M4.c cVar3 = aVar.f3652h;
        if (cVar3 != null) {
            i8 = 128;
            if (cVar3.f3171b != null) {
                i8 = 128 | 64;
            }
        } else {
            i8 = 0;
        }
        if (aVar.e) {
            i8 |= 2;
        }
        nVar.writeByte(i8);
        nVar.writeShort(aVar.f3649d);
        cVar2.f3660d.d(nVar);
        a aVar2 = (a) ((h) cVar2.f2711c);
        aVar2.getClass();
        M4.c cVar4 = aVar2.f3652h;
        if (cVar4 != null) {
            cVar4.f3170a.d(nVar);
            ByteBuffer byteBuffer = cVar4.f3171b;
            if (byteBuffer != null) {
                nVar.writeShort(byteBuffer.remaining());
                nVar.writeBytes(byteBuffer.duplicate());
            }
        }
    }

    public final int l(L4.c cVar) {
        int i;
        O4.c cVar2 = (O4.c) cVar;
        int e = cVar2.f3660d.e() + 10;
        M4.c cVar3 = ((a) ((h) cVar2.f2711c)).f3652h;
        if (cVar3 == null) {
            return e;
        }
        int e8 = cVar3.f3170a.e() + e;
        ByteBuffer byteBuffer = cVar3.f3171b;
        if (byteBuffer == null) {
            i = 0;
        } else {
            i = byteBuffer.remaining() + 2;
        }
        return i + e8;
    }
}
