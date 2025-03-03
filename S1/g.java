package S1;

import android.text.Layout;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public String f4432a;

    /* renamed from: b  reason: collision with root package name */
    public int f4433b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4434c;

    /* renamed from: d  reason: collision with root package name */
    public int f4435d;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public int f4436f = -1;

    /* renamed from: g  reason: collision with root package name */
    public int f4437g = -1;

    /* renamed from: h  reason: collision with root package name */
    public int f4438h = -1;
    public int i = -1;

    /* renamed from: j  reason: collision with root package name */
    public int f4439j = -1;

    /* renamed from: k  reason: collision with root package name */
    public float f4440k;

    /* renamed from: l  reason: collision with root package name */
    public String f4441l;

    /* renamed from: m  reason: collision with root package name */
    public int f4442m = -1;

    /* renamed from: n  reason: collision with root package name */
    public int f4443n = -1;

    /* renamed from: o  reason: collision with root package name */
    public Layout.Alignment f4444o;

    /* renamed from: p  reason: collision with root package name */
    public Layout.Alignment f4445p;

    /* renamed from: q  reason: collision with root package name */
    public int f4446q = -1;

    /* renamed from: r  reason: collision with root package name */
    public b f4447r;

    /* renamed from: s  reason: collision with root package name */
    public float f4448s = Float.MAX_VALUE;

    public final void a(g gVar) {
        int i8;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f4434c && gVar.f4434c) {
                this.f4433b = gVar.f4433b;
                this.f4434c = true;
            }
            if (this.f4438h == -1) {
                this.f4438h = gVar.f4438h;
            }
            if (this.i == -1) {
                this.i = gVar.i;
            }
            if (this.f4432a == null && (str = gVar.f4432a) != null) {
                this.f4432a = str;
            }
            if (this.f4436f == -1) {
                this.f4436f = gVar.f4436f;
            }
            if (this.f4437g == -1) {
                this.f4437g = gVar.f4437g;
            }
            if (this.f4443n == -1) {
                this.f4443n = gVar.f4443n;
            }
            if (this.f4444o == null && (alignment2 = gVar.f4444o) != null) {
                this.f4444o = alignment2;
            }
            if (this.f4445p == null && (alignment = gVar.f4445p) != null) {
                this.f4445p = alignment;
            }
            if (this.f4446q == -1) {
                this.f4446q = gVar.f4446q;
            }
            if (this.f4439j == -1) {
                this.f4439j = gVar.f4439j;
                this.f4440k = gVar.f4440k;
            }
            if (this.f4447r == null) {
                this.f4447r = gVar.f4447r;
            }
            if (this.f4448s == Float.MAX_VALUE) {
                this.f4448s = gVar.f4448s;
            }
            if (!this.e && gVar.e) {
                this.f4435d = gVar.f4435d;
                this.e = true;
            }
            if (this.f4442m == -1 && (i8 = gVar.f4442m) != -1) {
                this.f4442m = i8;
            }
        }
    }
}
