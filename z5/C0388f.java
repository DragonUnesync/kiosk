package Z5;

import S5.C0185n;
import S5.C0206y;
import e6.r;
import g6.B;

/* renamed from: Z5.f  reason: case insensitive filesystem */
public final class C0388f extends C0398p implements C0405x {
    private final C0185n content;
    private int hash;
    private final L trailingHeader;

    public C0388f(r0 r0Var, T t8, String str, C0185n nVar) {
        this(r0Var, t8, str, nVar, true);
    }

    public C0185n content() {
        return this.content;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0388f)) {
            return false;
        }
        C0388f fVar = (C0388f) obj;
        if (!super.equals(fVar) || !content().equals(fVar.content()) || !trailingHeaders().equals(fVar.trailingHeaders())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i8 = this.hash;
        if (i8 != 0) {
            return i8;
        }
        if (C0206y.isAccessible(content())) {
            try {
                i = content().hashCode() + 31;
            } catch (r unused) {
            }
            int hashCode = trailingHeaders().hashCode();
            int hashCode2 = super.hashCode() + ((hashCode + (i * 31)) * 31);
            this.hash = hashCode2;
            return hashCode2;
        }
        i = 31;
        int hashCode3 = trailingHeaders().hashCode();
        int hashCode22 = super.hashCode() + ((hashCode3 + (i * 31)) * 31);
        this.hash = hashCode22;
        return hashCode22;
    }

    public int refCnt() {
        return this.content.refCnt();
    }

    public boolean release() {
        return this.content.release();
    }

    public String toString() {
        return P.appendFullRequest(new StringBuilder(256), this).toString();
    }

    public L trailingHeaders() {
        return this.trailingHeader;
    }

    public C0388f(r0 r0Var, T t8, String str, C0185n nVar, boolean z) {
        super(r0Var, t8, str, z);
        this.content = (C0185n) B.checkNotNull(nVar, "content");
        this.trailingHeader = new C0395m(z);
    }

    public C0405x touch(Object obj) {
        this.content.touch(obj);
        return this;
    }
}
