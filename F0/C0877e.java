package f0;

import android.view.ViewGroup;
import d0.d;
import d0.h;

/* renamed from: f0.e  reason: case insensitive filesystem */
public final class C0877e extends ViewGroup.MarginLayoutParams {

    /* renamed from: A  reason: collision with root package name */
    public float f11305A;

    /* renamed from: B  reason: collision with root package name */
    public String f11306B;

    /* renamed from: C  reason: collision with root package name */
    public int f11307C;

    /* renamed from: D  reason: collision with root package name */
    public float f11308D;

    /* renamed from: E  reason: collision with root package name */
    public float f11309E;

    /* renamed from: F  reason: collision with root package name */
    public int f11310F;

    /* renamed from: G  reason: collision with root package name */
    public int f11311G;

    /* renamed from: H  reason: collision with root package name */
    public int f11312H;

    /* renamed from: I  reason: collision with root package name */
    public int f11313I;

    /* renamed from: J  reason: collision with root package name */
    public int f11314J;

    /* renamed from: K  reason: collision with root package name */
    public int f11315K;

    /* renamed from: L  reason: collision with root package name */
    public int f11316L;

    /* renamed from: M  reason: collision with root package name */
    public int f11317M;

    /* renamed from: N  reason: collision with root package name */
    public float f11318N;

    /* renamed from: O  reason: collision with root package name */
    public float f11319O;

    /* renamed from: P  reason: collision with root package name */
    public int f11320P;

    /* renamed from: Q  reason: collision with root package name */
    public int f11321Q;

    /* renamed from: R  reason: collision with root package name */
    public int f11322R;

    /* renamed from: S  reason: collision with root package name */
    public boolean f11323S;

    /* renamed from: T  reason: collision with root package name */
    public boolean f11324T;

    /* renamed from: U  reason: collision with root package name */
    public String f11325U;

    /* renamed from: V  reason: collision with root package name */
    public boolean f11326V;

    /* renamed from: W  reason: collision with root package name */
    public boolean f11327W;

    /* renamed from: X  reason: collision with root package name */
    public boolean f11328X;

    /* renamed from: Y  reason: collision with root package name */
    public boolean f11329Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f11330Z;

    /* renamed from: a  reason: collision with root package name */
    public int f11331a;

    /* renamed from: a0  reason: collision with root package name */
    public int f11332a0;

    /* renamed from: b  reason: collision with root package name */
    public int f11333b;

    /* renamed from: b0  reason: collision with root package name */
    public int f11334b0;

    /* renamed from: c  reason: collision with root package name */
    public float f11335c;

    /* renamed from: c0  reason: collision with root package name */
    public int f11336c0;

    /* renamed from: d  reason: collision with root package name */
    public int f11337d;

    /* renamed from: d0  reason: collision with root package name */
    public int f11338d0;
    public int e;

    /* renamed from: e0  reason: collision with root package name */
    public int f11339e0;

    /* renamed from: f  reason: collision with root package name */
    public int f11340f;

    /* renamed from: f0  reason: collision with root package name */
    public int f11341f0;

    /* renamed from: g  reason: collision with root package name */
    public int f11342g;

    /* renamed from: g0  reason: collision with root package name */
    public float f11343g0;

    /* renamed from: h  reason: collision with root package name */
    public int f11344h;

    /* renamed from: h0  reason: collision with root package name */
    public int f11345h0;
    public int i;

    /* renamed from: i0  reason: collision with root package name */
    public int f11346i0;

    /* renamed from: j  reason: collision with root package name */
    public int f11347j;

    /* renamed from: j0  reason: collision with root package name */
    public float f11348j0;

    /* renamed from: k  reason: collision with root package name */
    public int f11349k;

    /* renamed from: k0  reason: collision with root package name */
    public d f11350k0;

    /* renamed from: l  reason: collision with root package name */
    public int f11351l;

    /* renamed from: m  reason: collision with root package name */
    public int f11352m;

    /* renamed from: n  reason: collision with root package name */
    public int f11353n;

    /* renamed from: o  reason: collision with root package name */
    public float f11354o;

    /* renamed from: p  reason: collision with root package name */
    public int f11355p;

    /* renamed from: q  reason: collision with root package name */
    public int f11356q;

    /* renamed from: r  reason: collision with root package name */
    public int f11357r;

    /* renamed from: s  reason: collision with root package name */
    public int f11358s;

    /* renamed from: t  reason: collision with root package name */
    public int f11359t;

    /* renamed from: u  reason: collision with root package name */
    public int f11360u;

    /* renamed from: v  reason: collision with root package name */
    public int f11361v;

    /* renamed from: w  reason: collision with root package name */
    public int f11362w;

    /* renamed from: x  reason: collision with root package name */
    public int f11363x;

    /* renamed from: y  reason: collision with root package name */
    public int f11364y;
    public float z;

    public final void a() {
        this.f11329Y = false;
        this.f11326V = true;
        this.f11327W = true;
        int i8 = this.width;
        if (i8 == -2 && this.f11323S) {
            this.f11326V = false;
            if (this.f11312H == 0) {
                this.f11312H = 1;
            }
        }
        int i9 = this.height;
        if (i9 == -2 && this.f11324T) {
            this.f11327W = false;
            if (this.f11313I == 0) {
                this.f11313I = 1;
            }
        }
        if (i8 == 0 || i8 == -1) {
            this.f11326V = false;
            if (i8 == 0 && this.f11312H == 1) {
                this.width = -2;
                this.f11323S = true;
            }
        }
        if (i9 == 0 || i9 == -1) {
            this.f11327W = false;
            if (i9 == 0 && this.f11313I == 1) {
                this.height = -2;
                this.f11324T = true;
            }
        }
        if (this.f11335c != -1.0f || this.f11331a != -1 || this.f11333b != -1) {
            this.f11329Y = true;
            this.f11326V = true;
            this.f11327W = true;
            if (!(this.f11350k0 instanceof h)) {
                this.f11350k0 = new h();
            }
            ((h) this.f11350k0).B(this.f11322R);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void resolveLayoutDirection(int r10) {
        /*
            r9 = this;
            int r0 = r9.leftMargin
            int r1 = r9.rightMargin
            super.resolveLayoutDirection(r10)
            int r10 = r9.getLayoutDirection()
            r2 = 0
            r3 = 1
            if (r3 != r10) goto L_0x0011
            r10 = 1
            goto L_0x0012
        L_0x0011:
            r10 = 0
        L_0x0012:
            r4 = -1
            r9.f11336c0 = r4
            r9.f11338d0 = r4
            r9.f11332a0 = r4
            r9.f11334b0 = r4
            int r5 = r9.f11359t
            r9.f11339e0 = r5
            int r5 = r9.f11361v
            r9.f11341f0 = r5
            float r5 = r9.z
            r9.f11343g0 = r5
            int r6 = r9.f11331a
            r9.f11345h0 = r6
            int r7 = r9.f11333b
            r9.f11346i0 = r7
            float r8 = r9.f11335c
            r9.f11348j0 = r8
            if (r10 == 0) goto L_0x008e
            int r10 = r9.f11355p
            if (r10 == r4) goto L_0x003d
            r9.f11336c0 = r10
        L_0x003b:
            r2 = 1
            goto L_0x0044
        L_0x003d:
            int r10 = r9.f11356q
            if (r10 == r4) goto L_0x0044
            r9.f11338d0 = r10
            goto L_0x003b
        L_0x0044:
            int r10 = r9.f11357r
            if (r10 == r4) goto L_0x004b
            r9.f11334b0 = r10
            r2 = 1
        L_0x004b:
            int r10 = r9.f11358s
            if (r10 == r4) goto L_0x0052
            r9.f11332a0 = r10
            r2 = 1
        L_0x0052:
            int r10 = r9.f11363x
            if (r10 == r4) goto L_0x0058
            r9.f11341f0 = r10
        L_0x0058:
            int r10 = r9.f11364y
            if (r10 == r4) goto L_0x005e
            r9.f11339e0 = r10
        L_0x005e:
            r10 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L_0x0066
            float r2 = r10 - r5
            r9.f11343g0 = r2
        L_0x0066:
            boolean r2 = r9.f11329Y
            if (r2 == 0) goto L_0x00b2
            int r2 = r9.f11322R
            if (r2 != r3) goto L_0x00b2
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 == 0) goto L_0x007c
            float r10 = r10 - r8
            r9.f11348j0 = r10
            r9.f11345h0 = r4
            r9.f11346i0 = r4
            goto L_0x00b2
        L_0x007c:
            if (r6 == r4) goto L_0x0085
            r9.f11346i0 = r6
            r9.f11345h0 = r4
            r9.f11348j0 = r2
            goto L_0x00b2
        L_0x0085:
            if (r7 == r4) goto L_0x00b2
            r9.f11345h0 = r7
            r9.f11346i0 = r4
            r9.f11348j0 = r2
            goto L_0x00b2
        L_0x008e:
            int r10 = r9.f11355p
            if (r10 == r4) goto L_0x0094
            r9.f11334b0 = r10
        L_0x0094:
            int r10 = r9.f11356q
            if (r10 == r4) goto L_0x009a
            r9.f11332a0 = r10
        L_0x009a:
            int r10 = r9.f11357r
            if (r10 == r4) goto L_0x00a0
            r9.f11336c0 = r10
        L_0x00a0:
            int r10 = r9.f11358s
            if (r10 == r4) goto L_0x00a6
            r9.f11338d0 = r10
        L_0x00a6:
            int r10 = r9.f11363x
            if (r10 == r4) goto L_0x00ac
            r9.f11339e0 = r10
        L_0x00ac:
            int r10 = r9.f11364y
            if (r10 == r4) goto L_0x00b2
            r9.f11341f0 = r10
        L_0x00b2:
            int r10 = r9.f11357r
            if (r10 != r4) goto L_0x00fc
            int r10 = r9.f11358s
            if (r10 != r4) goto L_0x00fc
            int r10 = r9.f11356q
            if (r10 != r4) goto L_0x00fc
            int r10 = r9.f11355p
            if (r10 != r4) goto L_0x00fc
            int r10 = r9.f11340f
            if (r10 == r4) goto L_0x00d1
            r9.f11336c0 = r10
            int r10 = r9.rightMargin
            if (r10 > 0) goto L_0x00df
            if (r1 <= 0) goto L_0x00df
            r9.rightMargin = r1
            goto L_0x00df
        L_0x00d1:
            int r10 = r9.f11342g
            if (r10 == r4) goto L_0x00df
            r9.f11338d0 = r10
            int r10 = r9.rightMargin
            if (r10 > 0) goto L_0x00df
            if (r1 <= 0) goto L_0x00df
            r9.rightMargin = r1
        L_0x00df:
            int r10 = r9.f11337d
            if (r10 == r4) goto L_0x00ee
            r9.f11332a0 = r10
            int r10 = r9.leftMargin
            if (r10 > 0) goto L_0x00fc
            if (r0 <= 0) goto L_0x00fc
            r9.leftMargin = r0
            goto L_0x00fc
        L_0x00ee:
            int r10 = r9.e
            if (r10 == r4) goto L_0x00fc
            r9.f11334b0 = r10
            int r10 = r9.leftMargin
            if (r10 > 0) goto L_0x00fc
            if (r0 <= 0) goto L_0x00fc
            r9.leftMargin = r0
        L_0x00fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.C0877e.resolveLayoutDirection(int):void");
    }
}
