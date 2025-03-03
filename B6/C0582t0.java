package b6;

import S5.C0185n;
import e6.C0844c;
import e6.r;
import g6.B;

/* renamed from: b6.t0  reason: case insensitive filesystem */
public final class C0582t0 extends C0844c implements C0578r0 {
    private final C0185n content;
    private final boolean sensitive;

    public C0582t0(C0185n nVar, boolean z) {
        this.content = (C0185n) B.checkNotNull(nVar, "content");
        this.sensitive = z;
    }

    public C0185n content() {
        int refCnt = refCnt();
        if (refCnt > 0) {
            return this.content;
        }
        throw new r(refCnt);
    }

    public void deallocate() {
        if (this.sensitive) {
            H1.zeroout(this.content);
        }
        this.content.release();
    }

    public boolean isSensitive() {
        return this.sensitive;
    }

    public C0582t0 touch(Object obj) {
        this.content.touch(obj);
        return this;
    }

    public C0582t0 retain() {
        return (C0582t0) super.retain();
    }
}
