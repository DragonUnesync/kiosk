package l7;

import D6.h;
import P6.f;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f13239a;

    /* renamed from: b  reason: collision with root package name */
    public int f13240b;

    /* renamed from: c  reason: collision with root package name */
    public int f13241c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f13242d;
    public final boolean e;

    /* renamed from: f  reason: collision with root package name */
    public r f13243f;

    /* renamed from: g  reason: collision with root package name */
    public r f13244g;

    public r() {
        this.f13239a = new byte[8192];
        this.e = true;
        this.f13242d = false;
    }

    public final r a() {
        r rVar = this.f13243f;
        if (rVar == this) {
            rVar = null;
        }
        r rVar2 = this.f13244g;
        f.b(rVar2);
        rVar2.f13243f = this.f13243f;
        r rVar3 = this.f13243f;
        f.b(rVar3);
        rVar3.f13244g = this.f13244g;
        this.f13243f = null;
        this.f13244g = null;
        return rVar;
    }

    public final void b(r rVar) {
        f.e(rVar, "segment");
        rVar.f13244g = this;
        rVar.f13243f = this.f13243f;
        r rVar2 = this.f13243f;
        f.b(rVar2);
        rVar2.f13244g = rVar;
        this.f13243f = rVar;
    }

    public final r c() {
        this.f13242d = true;
        return new r(this.f13239a, this.f13240b, this.f13241c, true);
    }

    public final void d(r rVar, int i) {
        f.e(rVar, "sink");
        if (rVar.e) {
            int i8 = rVar.f13241c;
            int i9 = i8 + i;
            byte[] bArr = rVar.f13239a;
            if (i9 > 8192) {
                if (!rVar.f13242d) {
                    int i10 = rVar.f13240b;
                    if (i9 - i10 <= 8192) {
                        h.D(bArr, 0, bArr, i10, i8);
                        rVar.f13241c -= rVar.f13240b;
                        rVar.f13240b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            int i11 = rVar.f13241c;
            int i12 = this.f13240b;
            h.D(this.f13239a, i11, bArr, i12, i12 + i);
            rVar.f13241c += i;
            this.f13240b += i;
            return;
        }
        throw new IllegalStateException("only owner can write");
    }

    public r(byte[] bArr, int i, int i8, boolean z) {
        f.e(bArr, "data");
        this.f13239a = bArr;
        this.f13240b = i;
        this.f13241c = i8;
        this.f13242d = z;
        this.e = false;
    }
}
