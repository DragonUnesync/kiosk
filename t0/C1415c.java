package t0;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import j$.util.Objects;
import k2.C1148e;

/* renamed from: t0.c  reason: case insensitive filesystem */
public final class C1415c {

    /* renamed from: a  reason: collision with root package name */
    public final TextPaint f15173a;

    /* renamed from: b  reason: collision with root package name */
    public final TextDirectionHeuristic f15174b;

    /* renamed from: c  reason: collision with root package name */
    public final int f15175c;

    /* renamed from: d  reason: collision with root package name */
    public final int f15176d;

    public C1415c(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i8) {
        if (Build.VERSION.SDK_INT >= 29) {
            C1148e.g(textPaint).setBreakStrategy(i).setHyphenationFrequency(i8).setTextDirection(textDirectionHeuristic).build();
        }
        this.f15173a = textPaint;
        this.f15174b = textDirectionHeuristic;
        this.f15175c = i;
        this.f15176d = i8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0086, code lost:
        if (r3.getTextLocales().equals(r5.getTextLocales()) == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0095, code lost:
        if (r3.getTextLocale().equals(r5.getTextLocale()) == false) goto L_0x0018;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c1 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof t0.C1415c
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            t0.c r8 = (t0.C1415c) r8
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r1 < r3) goto L_0x0022
            int r3 = r8.f15175c
            int r4 = r7.f15175c
            if (r4 == r3) goto L_0x001b
        L_0x0018:
            r1 = 0
            goto L_0x00b7
        L_0x001b:
            int r3 = r7.f15176d
            int r4 = r8.f15176d
            if (r3 == r4) goto L_0x0022
            goto L_0x0018
        L_0x0022:
            android.text.TextPaint r3 = r7.f15173a
            float r4 = r3.getTextSize()
            android.text.TextPaint r5 = r8.f15173a
            float r5 = r5.getTextSize()
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x0033
            goto L_0x0018
        L_0x0033:
            float r4 = r3.getTextScaleX()
            android.text.TextPaint r5 = r8.f15173a
            float r6 = r5.getTextScaleX()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0042
            goto L_0x0018
        L_0x0042:
            float r4 = r3.getTextSkewX()
            float r6 = r5.getTextSkewX()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x004f
            goto L_0x0018
        L_0x004f:
            float r4 = r3.getLetterSpacing()
            float r6 = r5.getLetterSpacing()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x005c
            goto L_0x0018
        L_0x005c:
            java.lang.String r4 = r3.getFontFeatureSettings()
            java.lang.String r6 = r5.getFontFeatureSettings()
            boolean r4 = android.text.TextUtils.equals(r4, r6)
            if (r4 != 0) goto L_0x006b
            goto L_0x0018
        L_0x006b:
            int r4 = r3.getFlags()
            int r6 = r5.getFlags()
            if (r4 == r6) goto L_0x0076
            goto L_0x0018
        L_0x0076:
            r4 = 24
            if (r1 < r4) goto L_0x0089
            android.os.LocaleList r1 = r3.getTextLocales()
            android.os.LocaleList r4 = r5.getTextLocales()
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0098
            goto L_0x0018
        L_0x0089:
            java.util.Locale r1 = r3.getTextLocale()
            java.util.Locale r4 = r5.getTextLocale()
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0098
            goto L_0x0018
        L_0x0098:
            android.graphics.Typeface r1 = r3.getTypeface()
            if (r1 != 0) goto L_0x00a6
            android.graphics.Typeface r1 = r5.getTypeface()
            if (r1 == 0) goto L_0x00b6
            goto L_0x0018
        L_0x00a6:
            android.graphics.Typeface r1 = r3.getTypeface()
            android.graphics.Typeface r3 = r5.getTypeface()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x00b6
            goto L_0x0018
        L_0x00b6:
            r1 = 1
        L_0x00b7:
            if (r1 != 0) goto L_0x00ba
            return r2
        L_0x00ba:
            android.text.TextDirectionHeuristic r1 = r7.f15174b
            android.text.TextDirectionHeuristic r8 = r8.f15174b
            if (r1 != r8) goto L_0x00c1
            goto L_0x00c2
        L_0x00c1:
            r0 = 0
        L_0x00c2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.C1415c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        TextDirectionHeuristic textDirectionHeuristic = this.f15174b;
        int i = Build.VERSION.SDK_INT;
        int i8 = this.f15176d;
        int i9 = this.f15175c;
        TextPaint textPaint = this.f15173a;
        if (i >= 24) {
            return Objects.hash(new Object[]{Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i9), Integer.valueOf(i8)});
        }
        return Objects.hash(new Object[]{Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocale(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i9), Integer.valueOf(i8)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f15173a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        int i = Build.VERSION.SDK_INT;
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        if (i >= 24) {
            sb.append(", textLocale=" + textPaint.getTextLocales());
        } else {
            sb.append(", textLocale=" + textPaint.getTextLocale());
        }
        sb.append(", typeface=" + textPaint.getTypeface());
        if (i >= 26) {
            sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        }
        sb.append(", textDir=" + this.f15174b);
        sb.append(", breakStrategy=" + this.f15175c);
        sb.append(", hyphenationFrequency=" + this.f15176d);
        sb.append("}");
        return sb.toString();
    }

    public C1415c(PrecomputedText.Params params) {
        this.f15173a = params.getTextPaint();
        this.f15174b = params.getTextDirection();
        this.f15175c = params.getBreakStrategy();
        this.f15176d = params.getHyphenationFrequency();
    }
}
