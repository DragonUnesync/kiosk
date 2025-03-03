package T7;

import Q0.d;
import R7.b;
import S7.c;

public abstract class O extends d {

    /* renamed from: W  reason: collision with root package name */
    public String f5104W;

    /* renamed from: X  reason: collision with root package name */
    public String f5105X;

    /* renamed from: Y  reason: collision with root package name */
    public boolean f5106Y = false;

    /* renamed from: Z  reason: collision with root package name */
    public c f5107Z;

    /* renamed from: a0  reason: collision with root package name */
    public String f5108a0;

    /* renamed from: b0  reason: collision with root package name */
    public final StringBuilder f5109b0 = new StringBuilder();

    /* renamed from: c0  reason: collision with root package name */
    public boolean f5110c0 = false;

    /* renamed from: d0  reason: collision with root package name */
    public String f5111d0;

    /* renamed from: e0  reason: collision with root package name */
    public final StringBuilder f5112e0 = new StringBuilder();

    /* renamed from: f0  reason: collision with root package name */
    public boolean f5113f0 = false;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f5114g0 = false;

    public O(int i, i1 i1Var) {
        super(i, 2);
        i1Var.getClass();
    }

    /* renamed from: A */
    public O p() {
        this.f5104W = null;
        this.f5105X = null;
        this.f5106Y = false;
        this.f5107Z = null;
        B();
        return this;
    }

    public final void B() {
        d.q(this.f5109b0);
        this.f5108a0 = null;
        this.f5110c0 = false;
        d.q(this.f5112e0);
        this.f5111d0 = null;
        this.f5114g0 = false;
        this.f5113f0 = false;
    }

    public final void r(char c8, int i, int i8) {
        x(i, i8);
        this.f5112e0.append(c8);
    }

    public final void t(int i, int i8, String str) {
        x(i, i8);
        StringBuilder sb = this.f5112e0;
        if (sb.length() == 0) {
            this.f5111d0 = str;
        } else {
            sb.append(str);
        }
    }

    public final void u(int i, int i8, int[] iArr) {
        x(i, i8);
        for (int appendCodePoint : iArr) {
            this.f5112e0.appendCodePoint(appendCodePoint);
        }
    }

    public final void v(String str) {
        String replace = str.replace(0, 65533);
        String str2 = this.f5104W;
        if (str2 != null) {
            replace = str2.concat(replace);
        }
        this.f5104W = replace;
        this.f5105X = b.a(replace.trim());
    }

    public final void w(int i, int i8) {
        this.f5110c0 = true;
        String str = this.f5108a0;
        if (str != null) {
            this.f5109b0.append(str);
            this.f5108a0 = null;
        }
    }

    public final void x(int i, int i8) {
        this.f5113f0 = true;
        String str = this.f5111d0;
        if (str != null) {
            this.f5112e0.append(str);
            this.f5111d0 = null;
        }
    }

    public final void y(String str) {
        this.f5104W = str;
        this.f5105X = b.a(str.trim());
    }

    public final void z() {
        String str;
        String str2;
        if (this.f5107Z == null) {
            this.f5107Z = new c();
        }
        if (this.f5110c0 && this.f5107Z.f4544U < 512) {
            StringBuilder sb = this.f5109b0;
            if (sb.length() > 0) {
                str = sb.toString();
            } else {
                str = this.f5108a0;
            }
            String trim = str.trim();
            if (trim.length() > 0) {
                if (this.f5113f0) {
                    StringBuilder sb2 = this.f5112e0;
                    if (sb2.length() > 0) {
                        str2 = sb2.toString();
                    } else {
                        str2 = this.f5111d0;
                    }
                } else if (this.f5114g0) {
                    str2 = "";
                } else {
                    str2 = null;
                }
                this.f5107Z.c(trim, str2);
            }
        }
        B();
    }
}
