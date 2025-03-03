package M0;

import H3.O;
import P0.z;
import j$.util.Objects;

public final class E {

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f2792a;

    /* renamed from: b  reason: collision with root package name */
    public CharSequence f2793b;

    /* renamed from: c  reason: collision with root package name */
    public CharSequence f2794c;

    /* renamed from: d  reason: collision with root package name */
    public CharSequence f2795d;
    public CharSequence e;

    /* renamed from: f  reason: collision with root package name */
    public byte[] f2796f;

    /* renamed from: g  reason: collision with root package name */
    public Integer f2797g;

    /* renamed from: h  reason: collision with root package name */
    public Integer f2798h;
    public Integer i;

    /* renamed from: j  reason: collision with root package name */
    public Integer f2799j;

    /* renamed from: k  reason: collision with root package name */
    public Boolean f2800k;

    /* renamed from: l  reason: collision with root package name */
    public Integer f2801l;

    /* renamed from: m  reason: collision with root package name */
    public Integer f2802m;

    /* renamed from: n  reason: collision with root package name */
    public Integer f2803n;

    /* renamed from: o  reason: collision with root package name */
    public Integer f2804o;

    /* renamed from: p  reason: collision with root package name */
    public Integer f2805p;

    /* renamed from: q  reason: collision with root package name */
    public Integer f2806q;

    /* renamed from: r  reason: collision with root package name */
    public CharSequence f2807r;

    /* renamed from: s  reason: collision with root package name */
    public CharSequence f2808s;

    /* renamed from: t  reason: collision with root package name */
    public CharSequence f2809t;

    /* renamed from: u  reason: collision with root package name */
    public CharSequence f2810u;

    /* renamed from: v  reason: collision with root package name */
    public CharSequence f2811v;

    /* renamed from: w  reason: collision with root package name */
    public Integer f2812w;

    /* renamed from: x  reason: collision with root package name */
    public O f2813x;

    public final void a(int i8, byte[] bArr) {
        if (this.f2796f != null) {
            Integer valueOf = Integer.valueOf(i8);
            int i9 = z.f3748a;
            if (!valueOf.equals(3) && Objects.equals(this.f2797g, 3)) {
                return;
            }
        }
        this.f2796f = (byte[]) bArr.clone();
        this.f2797g = Integer.valueOf(i8);
    }

    public final void b(CharSequence charSequence) {
        this.f2810u = charSequence;
    }

    public final void c(Integer num) {
        this.f2803n = num;
    }

    public final void d(Integer num) {
        this.f2802m = num;
    }

    public final void e(Integer num) {
        this.f2801l = num;
    }
}
