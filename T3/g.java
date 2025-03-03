package t3;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;

public final class g {

    /* renamed from: l  reason: collision with root package name */
    public static final int f15443l;

    /* renamed from: m  reason: collision with root package name */
    public static boolean f15444m;

    /* renamed from: n  reason: collision with root package name */
    public static Constructor f15445n;

    /* renamed from: o  reason: collision with root package name */
    public static TextDirectionHeuristic f15446o;

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f15447a;

    /* renamed from: b  reason: collision with root package name */
    public final TextPaint f15448b;

    /* renamed from: c  reason: collision with root package name */
    public final int f15449c;

    /* renamed from: d  reason: collision with root package name */
    public int f15450d;
    public Layout.Alignment e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f  reason: collision with root package name */
    public int f15451f = Integer.MAX_VALUE;

    /* renamed from: g  reason: collision with root package name */
    public float f15452g = 1.0f;

    /* renamed from: h  reason: collision with root package name */
    public int f15453h = f15443l;
    public boolean i = true;

    /* renamed from: j  reason: collision with root package name */
    public boolean f15454j;

    /* renamed from: k  reason: collision with root package name */
    public TextUtils.TruncateAt f15455k = null;

    static {
        int i8;
        if (Build.VERSION.SDK_INT >= 23) {
            i8 = 1;
        } else {
            i8 = 0;
        }
        f15443l = i8;
    }

    public g(CharSequence charSequence, TextPaint textPaint, int i8) {
        this.f15447a = charSequence;
        this.f15448b = textPaint;
        this.f15449c = i8;
        this.f15450d = charSequence.length();
    }

    public final StaticLayout a() {
        boolean z;
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2;
        if (this.f15447a == null) {
            this.f15447a = "";
        }
        int max = Math.max(0, this.f15449c);
        CharSequence charSequence = this.f15447a;
        int i8 = this.f15451f;
        TextPaint textPaint = this.f15448b;
        if (i8 == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, (float) max, this.f15455k);
        }
        int min = Math.min(charSequence.length(), this.f15450d);
        this.f15450d = min;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 23) {
            if (this.f15454j && this.f15451f == 1) {
                this.e = Layout.Alignment.ALIGN_OPPOSITE;
            }
            StaticLayout.Builder b8 = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
            b8.setAlignment(this.e);
            b8.setIncludePad(this.i);
            if (this.f15454j) {
                textDirectionHeuristic2 = TextDirectionHeuristics.RTL;
            } else {
                textDirectionHeuristic2 = TextDirectionHeuristics.LTR;
            }
            b8.setTextDirection(textDirectionHeuristic2);
            TextUtils.TruncateAt truncateAt = this.f15455k;
            if (truncateAt != null) {
                b8.setEllipsize(truncateAt);
            }
            b8.setMaxLines(this.f15451f);
            float f8 = this.f15452g;
            if (f8 != 1.0f) {
                b8.setLineSpacing(0.0f, f8);
            }
            if (this.f15451f > 1) {
                b8.setHyphenationFrequency(this.f15453h);
            }
            return b8.build();
        }
        if (!f15444m) {
            try {
                if (!this.f15454j || i9 < 23) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                } else {
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                }
                f15446o = textDirectionHeuristic;
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(new Class[]{CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls});
                f15445n = declaredConstructor;
                declaredConstructor.setAccessible(true);
                f15444m = true;
            } catch (Exception e8) {
                throw new f(e8);
            }
        }
        try {
            Constructor constructor = f15445n;
            constructor.getClass();
            Integer valueOf = Integer.valueOf(this.f15450d);
            Integer valueOf2 = Integer.valueOf(max);
            Layout.Alignment alignment = this.e;
            TextDirectionHeuristic textDirectionHeuristic3 = f15446o;
            textDirectionHeuristic3.getClass();
            return (StaticLayout) constructor.newInstance(new Object[]{charSequence, 0, valueOf, textPaint, valueOf2, alignment, textDirectionHeuristic3, Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.i), null, Integer.valueOf(max), Integer.valueOf(this.f15451f)});
        } catch (Exception e9) {
            throw new f(e9);
        }
    }
}
