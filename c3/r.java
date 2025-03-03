package C3;

import P0.l;
import java.util.Arrays;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public int f615a;

    /* renamed from: b  reason: collision with root package name */
    public int f616b;

    /* renamed from: c  reason: collision with root package name */
    public Object f617c;

    /* renamed from: d  reason: collision with root package name */
    public Object f618d;

    public r() {
        this.f617c = new long[10];
        this.f618d = new Object[10];
    }

    public synchronized void a(Object obj, long j7) {
        int i = this.f616b;
        if (i > 0) {
            if (j7 <= ((long[]) this.f617c)[((this.f615a + i) - 1) % ((Object[]) this.f618d).length]) {
                b();
            }
        }
        c();
        int i8 = this.f615a;
        int i9 = this.f616b;
        Object[] objArr = (Object[]) this.f618d;
        int length = (i8 + i9) % objArr.length;
        ((long[]) this.f617c)[length] = j7;
        objArr[length] = obj;
        this.f616b = i9 + 1;
    }

    public synchronized void b() {
        this.f615a = 0;
        this.f616b = 0;
        Arrays.fill((Object[]) this.f618d, (Object) null);
    }

    public void c() {
        int length = ((Object[]) this.f618d).length;
        if (this.f616b >= length) {
            int i = length * 2;
            long[] jArr = new long[i];
            Object[] objArr = new Object[i];
            int i8 = this.f615a;
            int i9 = length - i8;
            System.arraycopy((long[]) this.f617c, i8, jArr, 0, i9);
            System.arraycopy((Object[]) this.f618d, this.f615a, objArr, 0, i9);
            int i10 = this.f615a;
            if (i10 > 0) {
                System.arraycopy((long[]) this.f617c, 0, jArr, i9, i10);
                System.arraycopy((Object[]) this.f618d, 0, objArr, i9, this.f615a);
            }
            this.f617c = jArr;
            this.f618d = objArr;
            this.f615a = 0;
        }
    }

    public Object d(long j7, boolean z) {
        Object obj = null;
        long j8 = Long.MAX_VALUE;
        while (this.f616b > 0) {
            long j9 = j7 - ((long[]) this.f617c)[this.f615a];
            if (j9 < 0 && (z || (-j9) >= j8)) {
                break;
            }
            obj = g();
            j8 = j9;
        }
        return obj;
    }

    public synchronized Object e() {
        Object obj;
        if (this.f616b == 0) {
            obj = null;
        } else {
            obj = g();
        }
        return obj;
    }

    public synchronized Object f(long j7) {
        return d(j7, true);
    }

    public Object g() {
        boolean z;
        if (this.f616b > 0) {
            z = true;
        } else {
            z = false;
        }
        l.j(z);
        Object[] objArr = (Object[]) this.f618d;
        int i = this.f615a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f615a = (i + 1) % objArr.length;
        this.f616b--;
        return obj;
    }

    public synchronized int h() {
        return this.f616b;
    }

    public r(int i, float[] fArr, float[] fArr2, int i8) {
        this.f615a = i;
        l.d(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
        this.f617c = fArr;
        this.f618d = fArr2;
        this.f616b = i8;
    }

    public r(r rVar) {
        float[] fArr = (float[]) rVar.f617c;
        this.f615a = fArr.length / 3;
        this.f617c = l.m(fArr);
        this.f618d = l.m((float[]) rVar.f618d);
        int i = rVar.f616b;
        if (i == 1) {
            this.f616b = 5;
        } else if (i != 2) {
            this.f616b = 4;
        } else {
            this.f616b = 6;
        }
    }
}
