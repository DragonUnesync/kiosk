package t4;

import D2.j;
import G5.s;
import L4.h;
import S5.C0163c;
import S5.C0185n;
import S5.C0187o;
import S5.D0;
import V4.a;
import i5.n;
import java.nio.ByteBuffer;
import s4.f;
import u4.C1492a;
import u4.C1493b;
import u4.d;
import u5.C1495b;
import y5.C1635a;

public final class l extends f {

    /* renamed from: c  reason: collision with root package name */
    public static final int f15479c = (C1495b.f15787W.a() << 4);

    public static void n(V4.f fVar, C0185n nVar, int i, int i8, int i9) {
        int i10;
        V4.f fVar2 = fVar;
        C0185n nVar2 = nVar;
        a aVar = (a) ((h) fVar2.f2711c);
        int i11 = 0;
        if (fVar2.e) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        int ordinal = i10 | (aVar.f5976f.ordinal() << 1);
        if (aVar.f5977g) {
            ordinal |= 1;
        }
        nVar.writeByte(f15479c | ordinal);
        s.m(nVar, i);
        a aVar2 = (a) ((h) fVar2.f2711c);
        int i12 = fVar2.f5987f;
        if ((i12 & 65535) == 0 || (65536 & i12) != 0) {
            aVar2.f5975d.d(nVar);
        } else {
            nVar.writeShort(0);
        }
        if (aVar2.f5976f != k5.a.f13047U) {
            nVar.writeShort(fVar2.f2712d);
        }
        s.m(nVar, i8);
        b.a(2, aVar2.f5978h, Long.MAX_VALUE, nVar);
        C1635a aVar3 = aVar2.i;
        if (aVar3 != null) {
            nVar.writeByte(1);
            nVar.writeByte(aVar3.ordinal());
        }
        d dVar = aVar2.f5979j;
        if (dVar != null) {
            nVar.writeByte(3);
            dVar.d(nVar);
        }
        C1492a aVar4 = aVar2.f5980k;
        if (aVar4 != null) {
            nVar.writeByte(8);
            aVar4.d(nVar);
        }
        ByteBuffer byteBuffer = aVar2.f5981l;
        if (byteBuffer != null) {
            nVar.writeByte(9);
            nVar.writeShort(byteBuffer.remaining());
            nVar.writeBytes(byteBuffer.duplicate());
        }
        if (i9 == 0) {
            fVar.b().b(nVar);
        }
        int i13 = i12 & 65535;
        if (i13 != 0) {
            nVar.writeByte(35);
            nVar.writeShort(i13);
        }
        while (true) {
            n nVar3 = fVar2.f5988g;
            if (i11 >= nVar3.size()) {
                break;
            }
            int i14 = nVar3.get(i11);
            nVar.writeByte(11);
            s.m(nVar, i14);
            i11++;
        }
        ByteBuffer byteBuffer2 = aVar2.e;
        if (byteBuffer2 != null && !byteBuffer2.isDirect()) {
            nVar.writeBytes(byteBuffer2.duplicate());
        }
    }

    public final C0185n e(h hVar, j jVar, int i, int i8, int i9, int i10) {
        V4.f fVar = (V4.f) hVar;
        ByteBuffer byteBuffer = ((a) ((h) fVar.f2711c)).e;
        if (byteBuffer == null || !byteBuffer.isDirect()) {
            C0185n ioBuffer = ((C0163c) ((C0187o) jVar.f1094V)).ioBuffer(i, i);
            n(fVar, ioBuffer, i8, i9, i10);
            return ioBuffer;
        }
        int remaining = i - byteBuffer.remaining();
        C0185n ioBuffer2 = ((C0163c) ((C0187o) jVar.f1094V)).ioBuffer(remaining, remaining);
        n(fVar, ioBuffer2, i8, i9, i10);
        return D0.wrappedUnmodifiableBuffer(ioBuffer2, D0.wrappedBuffer(byteBuffer));
    }

    public final /* bridge */ /* synthetic */ void g(h hVar, C0185n nVar, int i, int i8, int i9) {
        n((V4.f) hVar, nVar, i, i8, i9);
    }

    public final int i(h hVar) {
        int i;
        int i8;
        int i9;
        V4.f fVar = (V4.f) hVar;
        a aVar = (a) ((h) fVar.f2711c);
        int i10 = 0;
        if (aVar.f5978h == Long.MAX_VALUE) {
            i = 0;
        } else {
            i = 5;
        }
        if (aVar.i == null) {
            i8 = 0;
        } else {
            i8 = 2;
        }
        int b8 = b.b(aVar.f5980k) + b.b(aVar.f5979j) + i + i8;
        int i11 = 3;
        ByteBuffer byteBuffer = aVar.f5981l;
        if (byteBuffer == null) {
            i9 = 0;
        } else {
            i9 = byteBuffer.remaining() + 3;
        }
        int c8 = ((C1493b) ((h) fVar.f2711c).f2711c).c() + i9 + b8;
        if ((fVar.f5987f & 65535) == 0) {
            i11 = 0;
        }
        int i12 = i11 + c8;
        while (true) {
            n nVar = fVar.f5988g;
            if (i10 >= nVar.size()) {
                return i12;
            }
            i12 += s.n(nVar.get(i10)) + 1;
            i10++;
        }
    }

    public final int m(h hVar) {
        int i;
        V4.f fVar = (V4.f) hVar;
        a aVar = (a) ((h) fVar.f2711c);
        int i8 = fVar.f5987f;
        if ((65535 & i8) == 0 || (i8 & 65536) != 0) {
            i = aVar.f5975d.e();
        } else {
            i = 2;
        }
        if (aVar.f5976f != k5.a.f13047U) {
            i += 2;
        }
        ByteBuffer byteBuffer = aVar.e;
        if (byteBuffer != null) {
            return i + byteBuffer.remaining();
        }
        return i;
    }
}
