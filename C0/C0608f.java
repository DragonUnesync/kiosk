package c0;

import P6.f;

/* renamed from: c0.f  reason: case insensitive filesystem */
public class C0608f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8733a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f8734b;

    /* renamed from: c  reason: collision with root package name */
    public int f8735c;

    public C0608f(int i) {
        this.f8733a = 1;
        if (i > 0) {
            this.f8734b = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public Object a() {
        switch (this.f8733a) {
            case 0:
                int i = this.f8735c;
                if (i <= 0) {
                    return null;
                }
                int i8 = i - 1;
                Object[] objArr = this.f8734b;
                Object obj = objArr[i8];
                objArr[i8] = null;
                this.f8735c = i - 1;
                return obj;
            default:
                int i9 = this.f8735c;
                if (i9 <= 0) {
                    return null;
                }
                int i10 = i9 - 1;
                Object[] objArr2 = this.f8734b;
                Object obj2 = objArr2[i10];
                f.c(obj2, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
                objArr2[i10] = null;
                this.f8735c--;
                return obj2;
        }
    }

    public void b(C0605c cVar) {
        int i = this.f8735c;
        Object[] objArr = this.f8734b;
        if (i < objArr.length) {
            objArr[i] = cVar;
            this.f8735c = i + 1;
        }
    }

    public boolean c(Object obj) {
        Object[] objArr;
        boolean z;
        f.e(obj, "instance");
        int i = this.f8735c;
        int i8 = 0;
        while (true) {
            objArr = this.f8734b;
            if (i8 >= i) {
                z = false;
                break;
            } else if (objArr[i8] == obj) {
                z = true;
                break;
            } else {
                i8++;
            }
        }
        if (!z) {
            int i9 = this.f8735c;
            if (i9 >= objArr.length) {
                return false;
            }
            objArr[i9] = obj;
            this.f8735c = i9 + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    public C0608f() {
        this.f8733a = 0;
        this.f8734b = new Object[256];
    }
}
