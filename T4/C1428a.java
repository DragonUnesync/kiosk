package t4;

import G5.s;
import L4.h;
import M4.a;
import S5.C0185n;
import java.nio.ByteBuffer;
import u4.C1493b;
import u4.d;
import u5.C1495b;
import v5.C1561a;

/* renamed from: t4.a  reason: case insensitive filesystem */
public final class C1428a extends g {

    /* renamed from: c  reason: collision with root package name */
    public static final int f15465c = (C1495b.f15799i0.a() << 4);

    public final void g(h hVar, C0185n nVar, int i, int i8, int i9) {
        d dVar;
        a aVar = (a) hVar;
        nVar.writeByte(f15465c);
        s.m(nVar, i);
        nVar.writeByte(((C1561a) aVar.e).f16087U);
        s.m(nVar, i8);
        nVar.writeByte(21);
        aVar.f3166f.d(nVar);
        ByteBuffer byteBuffer = aVar.f3167g;
        if (byteBuffer != null) {
            nVar.writeByte(22);
            nVar.writeShort(byteBuffer.remaining());
            nVar.writeBytes(byteBuffer.duplicate());
        }
        if (i9 == 0 && (dVar = aVar.f2709d) != null) {
            nVar.writeByte(31);
            dVar.d(nVar);
        }
        if (i9 <= 1) {
            ((C1493b) aVar.f2711c).b(nVar);
        }
    }

    public final int i(h hVar) {
        int i;
        a aVar = (a) hVar;
        int e = aVar.f3166f.e() + 1;
        ByteBuffer byteBuffer = aVar.f3167g;
        if (byteBuffer == null) {
            i = 0;
        } else {
            i = byteBuffer.remaining() + 3;
        }
        return ((C1493b) aVar.f2711c).c() + b.b(aVar.f2709d) + i + e;
    }

    public final /* bridge */ /* synthetic */ int m(h hVar) {
        a aVar = (a) hVar;
        return 1;
    }
}
