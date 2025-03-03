package i5;

import C4.f;
import java.util.Iterator;

/* renamed from: i5.b  reason: case insensitive filesystem */
public final class C1102b implements Iterable {

    /* renamed from: U  reason: collision with root package name */
    public f f12730U;

    /* renamed from: V  reason: collision with root package name */
    public Object[] f12731V;

    /* renamed from: W  reason: collision with root package name */
    public Object[] f12732W;

    /* renamed from: X  reason: collision with root package name */
    public int f12733X;

    /* renamed from: Y  reason: collision with root package name */
    public int f12734Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f12735Z;

    public final void b(f fVar) {
        int i = this.f12735Z;
        if (i == 0) {
            this.f12735Z = 1;
            this.f12730U = fVar;
            return;
        }
        if (i == 1) {
            if (this.f12731V == null) {
                Object[] objArr = new Object[32];
                this.f12732W = objArr;
                this.f12731V = objArr;
            }
            f fVar2 = this.f12730U;
            if (fVar2 != null) {
                this.f12735Z = 0;
                this.f12730U = null;
                c(fVar2);
            }
        }
        c(fVar);
    }

    public final void c(f fVar) {
        Object[] objArr = this.f12731V;
        int i = this.f12733X;
        if (i == 32 || (objArr == this.f12732W && objArr[i] != null)) {
            if (this.f12735Z >= 32) {
                Object[] objArr2 = new Object[32];
                int i8 = i - 1;
                Object obj = objArr[i8];
                objArr[i8] = objArr2;
                objArr2[0] = obj;
                this.f12731V = objArr2;
                objArr = objArr2;
                i = 1;
            } else {
                i = 0;
            }
        }
        objArr[i] = fVar;
        this.f12733X = i + 1;
        this.f12735Z++;
    }

    public final Iterator iterator() {
        return new C1101a(this);
    }
}
