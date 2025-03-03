package c0;

import java.util.Arrays;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public boolean f8741a;

    /* renamed from: b  reason: collision with root package name */
    public int f8742b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f8743c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f8744d = 0;
    public float e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f8745f = false;

    /* renamed from: g  reason: collision with root package name */
    public final float[] f8746g = new float[9];

    /* renamed from: h  reason: collision with root package name */
    public final float[] f8747h = new float[9];
    public C0605c[] i = new C0605c[16];

    /* renamed from: j  reason: collision with root package name */
    public int f8748j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f8749k = 0;

    /* renamed from: l  reason: collision with root package name */
    public int f8750l;

    public i(int i8) {
        this.f8750l = i8;
    }

    public final void a(C0605c cVar) {
        int i8 = 0;
        while (true) {
            int i9 = this.f8748j;
            if (i8 >= i9) {
                C0605c[] cVarArr = this.i;
                if (i9 >= cVarArr.length) {
                    this.i = (C0605c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
                }
                C0605c[] cVarArr2 = this.i;
                int i10 = this.f8748j;
                cVarArr2[i10] = cVar;
                this.f8748j = i10 + 1;
                return;
            } else if (this.i[i8] != cVar) {
                i8++;
            } else {
                return;
            }
        }
    }

    public final void b(C0605c cVar) {
        int i8 = this.f8748j;
        int i9 = 0;
        while (i9 < i8) {
            if (this.i[i9] == cVar) {
                while (i9 < i8 - 1) {
                    C0605c[] cVarArr = this.i;
                    int i10 = i9 + 1;
                    cVarArr[i9] = cVarArr[i10];
                    i9 = i10;
                }
                this.f8748j--;
                return;
            }
            i9++;
        }
    }

    public final void c() {
        this.f8750l = 5;
        this.f8744d = 0;
        this.f8742b = -1;
        this.f8743c = -1;
        this.e = 0.0f;
        this.f8745f = false;
        int i8 = this.f8748j;
        for (int i9 = 0; i9 < i8; i9++) {
            this.i[i9] = null;
        }
        this.f8748j = 0;
        this.f8749k = 0;
        this.f8741a = false;
        Arrays.fill(this.f8747h, 0.0f);
    }

    public final void d(C0605c cVar) {
        int i8 = this.f8748j;
        for (int i9 = 0; i9 < i8; i9++) {
            this.i[i9].h(cVar, false);
        }
        this.f8748j = 0;
    }

    public final String toString() {
        return "" + this.f8742b;
    }
}
