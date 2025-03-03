package N1;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

public final class e {

    /* renamed from: A  reason: collision with root package name */
    public static final boolean[] f3315A = {false, false, false, true, true, true, false};

    /* renamed from: B  reason: collision with root package name */
    public static final int[] f3316B;

    /* renamed from: C  reason: collision with root package name */
    public static final int[] f3317C = {0, 1, 2, 3, 4, 3, 4};

    /* renamed from: D  reason: collision with root package name */
    public static final int[] f3318D = {0, 0, 0, 0, 0, 3, 3};

    /* renamed from: E  reason: collision with root package name */
    public static final int[] f3319E;

    /* renamed from: v  reason: collision with root package name */
    public static final int f3320v = c(2, 2, 2, 0);

    /* renamed from: w  reason: collision with root package name */
    public static final int f3321w;

    /* renamed from: x  reason: collision with root package name */
    public static final int[] f3322x = {0, 0, 0, 0, 0, 2, 0};

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f3323y = {0, 0, 0, 0, 0, 0, 2};
    public static final int[] z = {3, 3, 3, 3, 3, 3, 1};

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f3324a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final SpannableStringBuilder f3325b = new SpannableStringBuilder();

    /* renamed from: c  reason: collision with root package name */
    public boolean f3326c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3327d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3328f;

    /* renamed from: g  reason: collision with root package name */
    public int f3329g;

    /* renamed from: h  reason: collision with root package name */
    public int f3330h;
    public int i;

    /* renamed from: j  reason: collision with root package name */
    public int f3331j;

    /* renamed from: k  reason: collision with root package name */
    public int f3332k;

    /* renamed from: l  reason: collision with root package name */
    public int f3333l;

    /* renamed from: m  reason: collision with root package name */
    public int f3334m;

    /* renamed from: n  reason: collision with root package name */
    public int f3335n;

    /* renamed from: o  reason: collision with root package name */
    public int f3336o;

    /* renamed from: p  reason: collision with root package name */
    public int f3337p;

    /* renamed from: q  reason: collision with root package name */
    public int f3338q;

    /* renamed from: r  reason: collision with root package name */
    public int f3339r;

    /* renamed from: s  reason: collision with root package name */
    public int f3340s;

    /* renamed from: t  reason: collision with root package name */
    public int f3341t;

    /* renamed from: u  reason: collision with root package name */
    public int f3342u;

    static {
        int c8 = c(0, 0, 0, 0);
        f3321w = c8;
        int c9 = c(0, 0, 0, 3);
        int i8 = c8;
        int i9 = c8;
        f3316B = new int[]{c8, c9, i8, i9, c9, c8, c8};
        f3319E = new int[]{c8, c8, i8, i9, c8, c9, c9};
    }

    public e() {
        d();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int c(int r4, int r5, int r6, int r7) {
        /*
            r0 = 4
            P0.l.g(r4, r0)
            P0.l.g(r5, r0)
            P0.l.g(r6, r0)
            P0.l.g(r7, r0)
            r0 = 0
            r1 = 1
            r2 = 255(0xff, float:3.57E-43)
            if (r7 == 0) goto L_0x001b
            if (r7 == r1) goto L_0x001b
            r3 = 2
            if (r7 == r3) goto L_0x0020
            r3 = 3
            if (r7 == r3) goto L_0x001e
        L_0x001b:
            r7 = 255(0xff, float:3.57E-43)
            goto L_0x0022
        L_0x001e:
            r7 = 0
            goto L_0x0022
        L_0x0020:
            r7 = 127(0x7f, float:1.78E-43)
        L_0x0022:
            if (r4 <= r1) goto L_0x0027
            r4 = 255(0xff, float:3.57E-43)
            goto L_0x0028
        L_0x0027:
            r4 = 0
        L_0x0028:
            if (r5 <= r1) goto L_0x002d
            r5 = 255(0xff, float:3.57E-43)
            goto L_0x002e
        L_0x002d:
            r5 = 0
        L_0x002e:
            if (r6 <= r1) goto L_0x0032
            r0 = 255(0xff, float:3.57E-43)
        L_0x0032:
            int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: N1.e.c(int, int, int, int):int");
    }

    public final void a(char c8) {
        SpannableStringBuilder spannableStringBuilder = this.f3325b;
        if (c8 == 10) {
            ArrayList arrayList = this.f3324a;
            arrayList.add(b());
            spannableStringBuilder.clear();
            if (this.f3336o != -1) {
                this.f3336o = 0;
            }
            if (this.f3337p != -1) {
                this.f3337p = 0;
            }
            if (this.f3338q != -1) {
                this.f3338q = 0;
            }
            if (this.f3340s != -1) {
                this.f3340s = 0;
            }
            while (true) {
                if (arrayList.size() >= this.f3331j || arrayList.size() >= 15) {
                    arrayList.remove(0);
                } else {
                    this.f3342u = arrayList.size();
                    return;
                }
            }
        } else {
            spannableStringBuilder.append(c8);
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f3325b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f3336o != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f3336o, length, 33);
            }
            if (this.f3337p != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f3337p, length, 33);
            }
            if (this.f3338q != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f3339r), this.f3338q, length, 33);
            }
            if (this.f3340s != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f3341t), this.f3340s, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f3324a.clear();
        this.f3325b.clear();
        this.f3336o = -1;
        this.f3337p = -1;
        this.f3338q = -1;
        this.f3340s = -1;
        this.f3342u = 0;
        this.f3326c = false;
        this.f3327d = false;
        this.e = 4;
        this.f3328f = false;
        this.f3329g = 0;
        this.f3330h = 0;
        this.i = 0;
        this.f3331j = 15;
        this.f3332k = 0;
        this.f3333l = 0;
        this.f3334m = 0;
        int i8 = f3321w;
        this.f3335n = i8;
        this.f3339r = f3320v;
        this.f3341t = i8;
    }

    public final void e(boolean z6, boolean z8) {
        int i8 = this.f3336o;
        SpannableStringBuilder spannableStringBuilder = this.f3325b;
        if (i8 != -1) {
            if (!z6) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f3336o, spannableStringBuilder.length(), 33);
                this.f3336o = -1;
            }
        } else if (z6) {
            this.f3336o = spannableStringBuilder.length();
        }
        if (this.f3337p != -1) {
            if (!z8) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f3337p, spannableStringBuilder.length(), 33);
                this.f3337p = -1;
            }
        } else if (z8) {
            this.f3337p = spannableStringBuilder.length();
        }
    }

    public final void f(int i8, int i9) {
        int i10 = this.f3338q;
        SpannableStringBuilder spannableStringBuilder = this.f3325b;
        if (!(i10 == -1 || this.f3339r == i8)) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f3339r), this.f3338q, spannableStringBuilder.length(), 33);
        }
        if (i8 != f3320v) {
            this.f3338q = spannableStringBuilder.length();
            this.f3339r = i8;
        }
        if (!(this.f3340s == -1 || this.f3341t == i9)) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f3341t), this.f3340s, spannableStringBuilder.length(), 33);
        }
        if (i9 != f3321w) {
            this.f3340s = spannableStringBuilder.length();
            this.f3341t = i9;
        }
    }
}
