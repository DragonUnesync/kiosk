package X5;

import S5.C0185n;
import S5.C0187o;

/* renamed from: X5.a  reason: case insensitive filesystem */
public final class C0350a implements C0352c {
    public C0185n cumulate(C0187o oVar, C0185n nVar, C0185n nVar2) {
        if (nVar == nVar2) {
            nVar2.release();
            return nVar;
        } else if (nVar.isReadable() || !nVar2.isContiguous()) {
            try {
                int readableBytes = nVar2.readableBytes();
                if (readableBytes <= nVar.maxWritableBytes()) {
                    if (readableBytes > nVar.maxFastWritableBytes()) {
                        if (nVar.refCnt() <= 1) {
                        }
                    }
                    if (!nVar.isReadOnly()) {
                        nVar.writeBytes(nVar2, nVar2.readerIndex(), readableBytes);
                        nVar2.readerIndex(nVar2.writerIndex());
                        nVar2.release();
                        return nVar;
                    }
                }
                C0185n expandCumulation = C0353d.expandCumulation(oVar, nVar, nVar2);
                nVar2.release();
                return expandCumulation;
            } catch (Throwable th) {
                nVar2.release();
                throw th;
            }
        } else {
            nVar.release();
            return nVar2;
        }
    }
}
