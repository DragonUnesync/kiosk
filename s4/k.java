package s4;

import D2.j;
import G5.s;
import L4.c;
import L4.h;
import S5.C0163c;
import S5.C0185n;
import S5.C0187o;
import S5.D0;
import V4.a;
import V4.f;
import java.nio.ByteBuffer;
import p5.C1344a;

public final class k extends f {

    /* renamed from: c  reason: collision with root package name */
    public static final int f15112c = (C1344a.f14658W.a() << 4);

    public static void n(f fVar, C0185n nVar, int i) {
        int i8;
        a aVar = (a) ((h) fVar.f2711c);
        if (fVar.e) {
            i8 = 8;
        } else {
            i8 = 0;
        }
        int ordinal = i8 | (aVar.f5976f.ordinal() << 1);
        if (aVar.f5977g) {
            ordinal |= 1;
        }
        nVar.writeByte(f15112c | ordinal);
        s.m(nVar, i);
        a aVar2 = (a) ((h) fVar.f2711c);
        aVar2.f5975d.d(nVar);
        if (aVar2.f5976f != k5.a.f13047U) {
            nVar.writeShort(fVar.f2712d);
        }
        ByteBuffer byteBuffer = aVar2.e;
        if (byteBuffer != null && !byteBuffer.isDirect()) {
            nVar.writeBytes(byteBuffer.duplicate());
        }
    }

    public final C0185n c(c cVar, j jVar, int i, int i8) {
        f fVar = (f) cVar;
        ByteBuffer byteBuffer = ((a) ((h) fVar.f2711c)).e;
        if (byteBuffer == null || !byteBuffer.isDirect()) {
            C0185n ioBuffer = ((C0163c) ((C0187o) jVar.f1094V)).ioBuffer(i, i);
            n(fVar, ioBuffer, i8);
            return ioBuffer;
        }
        int remaining = i - byteBuffer.remaining();
        C0185n ioBuffer2 = ((C0163c) ((C0187o) jVar.f1094V)).ioBuffer(remaining, remaining);
        n(fVar, ioBuffer2, i8);
        return D0.wrappedUnmodifiableBuffer(ioBuffer2, D0.wrappedBuffer(byteBuffer));
    }

    public final /* bridge */ /* synthetic */ void f(c cVar, C0185n nVar, int i) {
        n((f) cVar, nVar, i);
    }

    public final int l(c cVar) {
        a aVar = (a) ((h) ((f) cVar).f2711c);
        int e = aVar.f5975d.e();
        if (aVar.f5976f != k5.a.f13047U) {
            e += 2;
        }
        ByteBuffer byteBuffer = aVar.e;
        if (byteBuffer != null) {
            return e + byteBuffer.remaining();
        }
        return e;
    }
}
