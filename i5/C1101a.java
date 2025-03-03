package i5;

import C4.f;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: i5.a  reason: case insensitive filesystem */
public final class C1101a implements Iterator {

    /* renamed from: U  reason: collision with root package name */
    public Object[] f12726U;

    /* renamed from: V  reason: collision with root package name */
    public int f12727V;

    /* renamed from: W  reason: collision with root package name */
    public int f12728W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ C1102b f12729X;

    public C1101a(C1102b bVar) {
        this.f12729X = bVar;
        a();
    }

    public final void a() {
        C1102b bVar = this.f12729X;
        this.f12726U = bVar.f12732W;
        this.f12727V = bVar.f12734Y;
        this.f12728W = 0;
    }

    public final boolean hasNext() {
        if (this.f12728W < this.f12729X.f12735Z) {
            return true;
        }
        return false;
    }

    public final Object next() {
        f fVar = this.f12729X.f12730U;
        if (fVar == null) {
            Object[] objArr = this.f12726U;
            if (objArr != null) {
                Object obj = objArr[this.f12727V];
                if (obj != null) {
                    if (obj.getClass() == Object[].class) {
                        Object[] objArr2 = (Object[]) obj;
                        this.f12726U = objArr2;
                        this.f12727V = 1;
                        obj = objArr2[0];
                    } else {
                        int i = this.f12727V + 1;
                        this.f12727V = i;
                        if (i == 32) {
                            this.f12727V = 0;
                        }
                    }
                    this.f12728W++;
                    return obj;
                }
                throw new NoSuchElementException();
            }
            throw new NoSuchElementException();
        } else if (this.f12728W <= 0) {
            this.f12728W = 1;
            return fVar;
        } else {
            throw new NoSuchElementException();
        }
    }

    public final void remove() {
        int i;
        Object obj;
        int i8;
        for (int i9 = 0; i9 < this.f12728W; i9++) {
            C1102b bVar = this.f12729X;
            if (bVar.f12730U != null) {
                bVar.f12735Z = 0;
                bVar.f12730U = null;
            } else {
                Object[] objArr = bVar.f12732W;
                if (!(objArr == null || (obj = objArr[i]) == null)) {
                    objArr[(i = bVar.f12734Y)] = null;
                    if (obj.getClass() == Object[].class) {
                        Object[] objArr2 = (Object[]) obj;
                        bVar.f12732W = objArr2;
                        Object obj2 = objArr2[0];
                        objArr2[0] = null;
                        i8 = 1;
                    } else {
                        i8 = i + 1;
                        if (i8 == 32) {
                            i8 = 0;
                        }
                    }
                    bVar.f12735Z--;
                    bVar.f12734Y = i8;
                }
            }
        }
        this.f12728W = 0;
    }
}
