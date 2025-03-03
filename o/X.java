package o;

import Q0.g;
import T0.g0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import d4.k;
import g.C0940a;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import x0.C1595a;
import x0.C1596b;

public final class X {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f13896a;

    /* renamed from: b  reason: collision with root package name */
    public g0 f13897b;

    /* renamed from: c  reason: collision with root package name */
    public g0 f13898c;

    /* renamed from: d  reason: collision with root package name */
    public g0 f13899d;
    public g0 e;

    /* renamed from: f  reason: collision with root package name */
    public g0 f13900f;

    /* renamed from: g  reason: collision with root package name */
    public g0 f13901g;

    /* renamed from: h  reason: collision with root package name */
    public g0 f13902h;
    public final C1270g0 i;

    /* renamed from: j  reason: collision with root package name */
    public int f13903j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f13904k = -1;

    /* renamed from: l  reason: collision with root package name */
    public Typeface f13905l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f13906m;

    public X(TextView textView) {
        this.f13896a = textView;
        this.i = new C1270g0(textView);
    }

    public static g0 c(Context context, C1292s sVar, int i8) {
        ColorStateList i9;
        synchronized (sVar) {
            i9 = sVar.f14067a.i(context, i8);
        }
        if (i9 == null) {
            return null;
        }
        g0 g0Var = new g0(3);
        g0Var.f4840d = true;
        g0Var.f4838b = i9;
        return g0Var;
    }

    public static void h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i8;
        int i9;
        CharSequence charSequence;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 && inputConnection != null) {
            CharSequence text = textView.getText();
            if (i10 >= 30) {
                C1595a.a(editorInfo, text);
                return;
            }
            text.getClass();
            if (i10 >= 30) {
                C1595a.a(editorInfo, text);
                return;
            }
            int i11 = editorInfo.initialSelStart;
            int i12 = editorInfo.initialSelEnd;
            if (i11 > i12) {
                i8 = i12;
            } else {
                i8 = i11;
            }
            if (i11 <= i12) {
                i11 = i12;
            }
            int length = text.length();
            if (i8 < 0 || i11 > length) {
                C1596b.a(editorInfo, (CharSequence) null, 0, 0);
                return;
            }
            int i13 = editorInfo.inputType & 4095;
            if (i13 == 129 || i13 == 225 || i13 == 18) {
                C1596b.a(editorInfo, (CharSequence) null, 0, 0);
            } else if (length <= 2048) {
                C1596b.a(editorInfo, text, i8, i11);
            } else {
                int i14 = i11 - i8;
                if (i14 > 1024) {
                    i9 = 0;
                } else {
                    i9 = i14;
                }
                int i15 = 2048 - i9;
                int min = Math.min(text.length() - i11, i15 - Math.min(i8, (int) (((double) i15) * 0.8d)));
                int min2 = Math.min(i8, i15 - min);
                int i16 = i8 - min2;
                if (Character.isLowSurrogate(text.charAt(i16))) {
                    i16++;
                    min2--;
                }
                if (Character.isHighSurrogate(text.charAt((i11 + min) - 1))) {
                    min--;
                }
                int i17 = min2 + i9;
                int i18 = i17 + min;
                if (i9 != i14) {
                    charSequence = TextUtils.concat(new CharSequence[]{text.subSequence(i16, i16 + min2), text.subSequence(i11, min + i11)});
                } else {
                    charSequence = text.subSequence(i16, i18 + i16);
                }
                C1596b.a(editorInfo, charSequence, min2, i17);
            }
        }
    }

    public final void a(Drawable drawable, g0 g0Var) {
        if (drawable != null && g0Var != null) {
            C1292s.e(drawable, g0Var, this.f13896a.getDrawableState());
        }
    }

    public final void b() {
        g0 g0Var = this.f13897b;
        TextView textView = this.f13896a;
        if (!(g0Var == null && this.f13898c == null && this.f13899d == null && this.e == null)) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f13897b);
            a(compoundDrawables[1], this.f13898c);
            a(compoundDrawables[2], this.f13899d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f13900f != null || this.f13901g != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f13900f);
            a(compoundDrawablesRelative[2], this.f13901g);
        }
    }

    public final ColorStateList d() {
        g0 g0Var = this.f13902h;
        if (g0Var != null) {
            return (ColorStateList) g0Var.f4838b;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        g0 g0Var = this.f13902h;
        if (g0Var != null) {
            return (PorterDuff.Mode) g0Var.e;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:113:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0287  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02e1  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x02f1  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0326  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x032d  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0335  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x033a  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0343  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0349  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0351  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0356  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x035f  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0364  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x036c  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0371  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x03c8  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x03ce  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x03d4  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x03da  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x03e8  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x041c  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x044f  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x046d  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0476  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x047b  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x0484  */
    /* JADX WARNING: Removed duplicated region for block: B:279:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0120  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(android.util.AttributeSet r29, int r30) {
        /*
            r28 = this;
            r0 = r28
            r7 = r29
            r8 = r30
            android.widget.TextView r9 = r0.f13896a
            android.content.Context r10 = r9.getContext()
            o.s r11 = o.C1292s.a()
            int[] r3 = g.C0940a.f11820h
            d4.k r12 = d4.k.K2(r10, r7, r3, r8)
            android.content.Context r2 = r9.getContext()
            java.lang.Object r1 = r12.f9767W
            r5 = r1
            android.content.res.TypedArray r5 = (android.content.res.TypedArray) r5
            r1 = r9
            r4 = r29
            r6 = r30
            v0.C1510H.o(r1, r2, r3, r4, r5, r6)
            java.lang.Object r1 = r12.f9767W
            android.content.res.TypedArray r1 = (android.content.res.TypedArray) r1
            r13 = 0
            r14 = -1
            int r2 = r1.getResourceId(r13, r14)
            r15 = 3
            boolean r3 = r1.hasValue(r15)
            if (r3 == 0) goto L_0x0042
            int r3 = r1.getResourceId(r15, r13)
            T0.g0 r3 = c(r10, r11, r3)
            r0.f13897b = r3
        L_0x0042:
            r6 = 1
            boolean r3 = r1.hasValue(r6)
            if (r3 == 0) goto L_0x0053
            int r3 = r1.getResourceId(r6, r13)
            T0.g0 r3 = c(r10, r11, r3)
            r0.f13898c = r3
        L_0x0053:
            r5 = 4
            boolean r3 = r1.hasValue(r5)
            if (r3 == 0) goto L_0x0064
            int r3 = r1.getResourceId(r5, r13)
            T0.g0 r3 = c(r10, r11, r3)
            r0.f13899d = r3
        L_0x0064:
            r4 = 2
            boolean r3 = r1.hasValue(r4)
            if (r3 == 0) goto L_0x0075
            int r3 = r1.getResourceId(r4, r13)
            T0.g0 r3 = c(r10, r11, r3)
            r0.e = r3
        L_0x0075:
            r3 = 5
            boolean r16 = r1.hasValue(r3)
            if (r16 == 0) goto L_0x0086
            int r4 = r1.getResourceId(r3, r13)
            T0.g0 r4 = c(r10, r11, r4)
            r0.f13900f = r4
        L_0x0086:
            r4 = 6
            boolean r17 = r1.hasValue(r4)
            if (r17 == 0) goto L_0x0097
            int r1 = r1.getResourceId(r4, r13)
            T0.g0 r1 = c(r10, r11, r1)
            r0.f13901g = r1
        L_0x0097:
            r12.M2()
            android.text.method.TransformationMethod r1 = r9.getTransformationMethod()
            boolean r1 = r1 instanceof android.text.method.PasswordTransformationMethod
            int[] r12 = g.C0940a.f11835x
            r6 = 23
            r4 = 14
            if (r2 == r14) goto L_0x0125
            d4.k r3 = new d4.k
            android.content.res.TypedArray r2 = r10.obtainStyledAttributes(r2, r12)
            r3.<init>((android.content.Context) r10, (android.content.res.TypedArray) r2)
            if (r1 != 0) goto L_0x00c0
            boolean r22 = r2.hasValue(r4)
            if (r22 == 0) goto L_0x00c0
            boolean r22 = r2.getBoolean(r4, r13)
            r23 = 1
            goto L_0x00c4
        L_0x00c0:
            r22 = 0
            r23 = 0
        L_0x00c4:
            r0.n(r10, r3)
            int r14 = android.os.Build.VERSION.SDK_INT
            if (r14 >= r6) goto L_0x00f9
            boolean r24 = r2.hasValue(r15)
            if (r24 == 0) goto L_0x00d6
            android.content.res.ColorStateList r24 = r3.v(r15)
            goto L_0x00d8
        L_0x00d6:
            r24 = 0
        L_0x00d8:
            boolean r25 = r2.hasValue(r5)
            if (r25 == 0) goto L_0x00e4
            android.content.res.ColorStateList r25 = r3.v(r5)
            r5 = 5
            goto L_0x00e7
        L_0x00e4:
            r5 = 5
            r25 = 0
        L_0x00e7:
            boolean r17 = r2.hasValue(r5)
            if (r17 == 0) goto L_0x00f4
            android.content.res.ColorStateList r26 = r3.v(r5)
            r5 = 15
            goto L_0x0100
        L_0x00f4:
            r5 = 15
        L_0x00f6:
            r26 = 0
            goto L_0x0100
        L_0x00f9:
            r5 = 15
            r24 = 0
            r25 = 0
            goto L_0x00f6
        L_0x0100:
            boolean r20 = r2.hasValue(r5)
            if (r20 == 0) goto L_0x010d
            java.lang.String r27 = r2.getString(r5)
            r5 = 26
            goto L_0x0111
        L_0x010d:
            r5 = 26
            r27 = 0
        L_0x0111:
            if (r14 < r5) goto L_0x0120
            r5 = 13
            boolean r14 = r2.hasValue(r5)
            if (r14 == 0) goto L_0x0120
            java.lang.String r2 = r2.getString(r5)
            goto L_0x0121
        L_0x0120:
            r2 = 0
        L_0x0121:
            r3.M2()
            goto L_0x0132
        L_0x0125:
            r2 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
        L_0x0132:
            d4.k r3 = new d4.k
            android.content.res.TypedArray r5 = r10.obtainStyledAttributes(r7, r12, r8, r13)
            r3.<init>((android.content.Context) r10, (android.content.res.TypedArray) r5)
            if (r1 != 0) goto L_0x014c
            boolean r12 = r5.hasValue(r4)
            if (r12 == 0) goto L_0x014c
            boolean r22 = r5.getBoolean(r4, r13)
            r4 = r22
            r23 = 1
            goto L_0x014e
        L_0x014c:
            r4 = r22
        L_0x014e:
            int r12 = android.os.Build.VERSION.SDK_INT
            if (r12 >= r6) goto L_0x0172
            boolean r6 = r5.hasValue(r15)
            if (r6 == 0) goto L_0x015c
            android.content.res.ColorStateList r24 = r3.v(r15)
        L_0x015c:
            r6 = 4
            boolean r14 = r5.hasValue(r6)
            if (r14 == 0) goto L_0x0167
            android.content.res.ColorStateList r25 = r3.v(r6)
        L_0x0167:
            r14 = 5
            boolean r17 = r5.hasValue(r14)
            if (r17 == 0) goto L_0x0172
            android.content.res.ColorStateList r26 = r3.v(r14)
        L_0x0172:
            r6 = r24
            r14 = r25
            r15 = r26
            r13 = 15
            boolean r24 = r5.hasValue(r13)
            if (r24 == 0) goto L_0x0184
            java.lang.String r27 = r5.getString(r13)
        L_0x0184:
            r19 = r2
            r13 = r27
            r2 = 26
            if (r12 < r2) goto L_0x019d
            r2 = 13
            boolean r21 = r5.hasValue(r2)
            if (r21 == 0) goto L_0x0198
            java.lang.String r19 = r5.getString(r2)
        L_0x0198:
            r2 = r19
            r19 = r11
            goto L_0x01a0
        L_0x019d:
            r2 = 13
            goto L_0x0198
        L_0x01a0:
            r11 = 28
            if (r12 < r11) goto L_0x01b6
            r11 = 0
            boolean r22 = r5.hasValue(r11)
            if (r22 == 0) goto L_0x01b6
            r7 = -1
            int r5 = r5.getDimensionPixelSize(r11, r7)
            if (r5 != 0) goto L_0x01b6
            r5 = 0
            r9.setTextSize(r11, r5)
        L_0x01b6:
            r0.n(r10, r3)
            r3.M2()
            if (r6 == 0) goto L_0x01c1
            r9.setTextColor(r6)
        L_0x01c1:
            if (r14 == 0) goto L_0x01c6
            r9.setHintTextColor(r14)
        L_0x01c6:
            if (r15 == 0) goto L_0x01cb
            r9.setLinkTextColor(r15)
        L_0x01cb:
            if (r1 != 0) goto L_0x01d2
            if (r23 == 0) goto L_0x01d2
            r9.setAllCaps(r4)
        L_0x01d2:
            android.graphics.Typeface r1 = r0.f13905l
            if (r1 == 0) goto L_0x01e4
            int r3 = r0.f13904k
            r4 = -1
            if (r3 != r4) goto L_0x01e1
            int r3 = r0.f13903j
            r9.setTypeface(r1, r3)
            goto L_0x01e4
        L_0x01e1:
            r9.setTypeface(r1)
        L_0x01e4:
            if (r2 == 0) goto L_0x01e9
            o.V.d(r9, r2)
        L_0x01e9:
            r7 = 24
            if (r13 == 0) goto L_0x01f6
            if (r12 < r7) goto L_0x01f8
            android.os.LocaleList r1 = o.U.a(r13)
            o.U.b(r9, r1)
        L_0x01f6:
            r2 = 0
            goto L_0x0208
        L_0x01f8:
            java.lang.String r1 = ","
            java.lang.String[] r1 = r13.split(r1)
            r2 = 0
            r1 = r1[r2]
            java.util.Locale r1 = o.T.a(r1)
            r9.setTextLocale(r1)
        L_0x0208:
            int[] r11 = g.C0940a.i
            o.g0 r12 = r0.i
            android.content.Context r13 = r12.f13963j
            r14 = r29
            android.content.res.TypedArray r15 = r13.obtainStyledAttributes(r14, r11, r8, r2)
            android.widget.TextView r1 = r12.i
            android.content.Context r2 = r1.getContext()
            r3 = 13
            r4 = 15
            r5 = 5
            r6 = 0
            r7 = 13
            r3 = r11
            r7 = 2
            r4 = r29
            r7 = 5
            r5 = r15
            r6 = r30
            v0.C1510H.o(r1, r2, r3, r4, r5, r6)
            boolean r1 = r15.hasValue(r7)
            if (r1 == 0) goto L_0x023a
            r1 = 0
            int r2 = r15.getInt(r7, r1)
            r12.f13956a = r2
        L_0x023a:
            r1 = 4
            boolean r2 = r15.hasValue(r1)
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 == 0) goto L_0x0249
            float r1 = r15.getDimension(r1, r3)
        L_0x0247:
            r2 = 2
            goto L_0x024c
        L_0x0249:
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x0247
        L_0x024c:
            boolean r4 = r15.hasValue(r2)
            if (r4 == 0) goto L_0x0258
            float r4 = r15.getDimension(r2, r3)
            r2 = 1
            goto L_0x025b
        L_0x0258:
            r2 = 1
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x025b:
            boolean r5 = r15.hasValue(r2)
            if (r5 == 0) goto L_0x0267
            float r5 = r15.getDimension(r2, r3)
        L_0x0265:
            r6 = 3
            goto L_0x026a
        L_0x0267:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x0265
        L_0x026a:
            boolean r8 = r15.hasValue(r6)
            if (r8 == 0) goto L_0x02a1
            r8 = 0
            int r7 = r15.getResourceId(r6, r8)
            if (r7 <= 0) goto L_0x02a1
            android.content.res.Resources r6 = r15.getResources()
            android.content.res.TypedArray r6 = r6.obtainTypedArray(r7)
            int r7 = r6.length()
            int[] r8 = new int[r7]
            if (r7 <= 0) goto L_0x029e
            r3 = 0
        L_0x0288:
            if (r3 >= r7) goto L_0x0295
            r2 = -1
            int r18 = r6.getDimensionPixelSize(r3, r2)
            r8[r3] = r18
            int r3 = r3 + 1
            r2 = 1
            goto L_0x0288
        L_0x0295:
            int[] r2 = o.C1270g0.b(r8)
            r12.f13960f = r2
            r12.i()
        L_0x029e:
            r6.recycle()
        L_0x02a1:
            r15.recycle()
            boolean r2 = r12.j()
            if (r2 == 0) goto L_0x02e1
            int r2 = r12.f13956a
            r3 = 1
            if (r2 != r3) goto L_0x02e4
            boolean r2 = r12.f13961g
            if (r2 != 0) goto L_0x02dd
            android.content.res.Resources r2 = r13.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r6 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r6 != 0) goto L_0x02c9
            r4 = 1094713344(0x41400000, float:12.0)
            r6 = 2
            float r4 = android.util.TypedValue.applyDimension(r6, r4, r2)
            goto L_0x02ca
        L_0x02c9:
            r6 = 2
        L_0x02ca:
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L_0x02d4
            r5 = 1121976320(0x42e00000, float:112.0)
            float r5 = android.util.TypedValue.applyDimension(r6, r5, r2)
        L_0x02d4:
            int r2 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x02da
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x02da:
            r12.k(r4, r5, r1)
        L_0x02dd:
            r12.h()
            goto L_0x02e4
        L_0x02e1:
            r1 = 0
            r12.f13956a = r1
        L_0x02e4:
            boolean r1 = o.w1.f14106c
            if (r1 == 0) goto L_0x0317
            int r1 = r12.f13956a
            if (r1 == 0) goto L_0x0317
            int[] r1 = r12.f13960f
            int r2 = r1.length
            if (r2 <= 0) goto L_0x0317
            int r2 = o.V.a(r9)
            float r2 = (float) r2
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0313
            float r1 = r12.f13959d
            int r1 = java.lang.Math.round(r1)
            float r2 = r12.e
            int r2 = java.lang.Math.round(r2)
            float r3 = r12.f13958c
            int r3 = java.lang.Math.round(r3)
            r4 = 0
            o.V.b(r9, r1, r2, r3, r4)
            goto L_0x0317
        L_0x0313:
            r4 = 0
            o.V.c(r9, r1, r4)
        L_0x0317:
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r14, r11)
            r2 = 8
            r3 = -1
            int r2 = r1.getResourceId(r2, r3)
            r4 = r19
            if (r2 == r3) goto L_0x032d
            android.graphics.drawable.Drawable r2 = r4.b(r10, r2)
        L_0x032a:
            r5 = 13
            goto L_0x032f
        L_0x032d:
            r2 = 0
            goto L_0x032a
        L_0x032f:
            int r5 = r1.getResourceId(r5, r3)
            if (r5 == r3) goto L_0x033a
            android.graphics.drawable.Drawable r5 = r4.b(r10, r5)
            goto L_0x033b
        L_0x033a:
            r5 = 0
        L_0x033b:
            r6 = 9
            int r6 = r1.getResourceId(r6, r3)
            if (r6 == r3) goto L_0x0349
            android.graphics.drawable.Drawable r6 = r4.b(r10, r6)
        L_0x0347:
            r7 = 6
            goto L_0x034b
        L_0x0349:
            r6 = 0
            goto L_0x0347
        L_0x034b:
            int r7 = r1.getResourceId(r7, r3)
            if (r7 == r3) goto L_0x0356
            android.graphics.drawable.Drawable r7 = r4.b(r10, r7)
            goto L_0x0357
        L_0x0356:
            r7 = 0
        L_0x0357:
            r8 = 10
            int r8 = r1.getResourceId(r8, r3)
            if (r8 == r3) goto L_0x0364
            android.graphics.drawable.Drawable r8 = r4.b(r10, r8)
            goto L_0x0365
        L_0x0364:
            r8 = 0
        L_0x0365:
            r11 = 7
            int r11 = r1.getResourceId(r11, r3)
            if (r11 == r3) goto L_0x0371
            android.graphics.drawable.Drawable r3 = r4.b(r10, r11)
            goto L_0x0372
        L_0x0371:
            r3 = 0
        L_0x0372:
            if (r8 != 0) goto L_0x03c1
            if (r3 == 0) goto L_0x0377
            goto L_0x03c1
        L_0x0377:
            if (r2 != 0) goto L_0x037f
            if (r5 != 0) goto L_0x037f
            if (r6 != 0) goto L_0x037f
            if (r7 == 0) goto L_0x03e0
        L_0x037f:
            android.graphics.drawable.Drawable[] r3 = r9.getCompoundDrawablesRelative()
            r4 = 0
            r8 = r3[r4]
            if (r8 != 0) goto L_0x038d
            r11 = 2
            r12 = r3[r11]
            if (r12 == 0) goto L_0x038f
        L_0x038d:
            r4 = 3
            goto L_0x03ae
        L_0x038f:
            android.graphics.drawable.Drawable[] r3 = r9.getCompoundDrawables()
            if (r2 == 0) goto L_0x0396
            goto L_0x0398
        L_0x0396:
            r2 = r3[r4]
        L_0x0398:
            if (r5 == 0) goto L_0x039b
            goto L_0x039e
        L_0x039b:
            r4 = 1
            r5 = r3[r4]
        L_0x039e:
            if (r6 == 0) goto L_0x03a1
            goto L_0x03a4
        L_0x03a1:
            r4 = 2
            r6 = r3[r4]
        L_0x03a4:
            if (r7 == 0) goto L_0x03a7
            goto L_0x03aa
        L_0x03a7:
            r4 = 3
            r7 = r3[r4]
        L_0x03aa:
            r9.setCompoundDrawablesWithIntrinsicBounds(r2, r5, r6, r7)
            goto L_0x03e0
        L_0x03ae:
            if (r5 == 0) goto L_0x03b1
            goto L_0x03b4
        L_0x03b1:
            r2 = 1
            r5 = r3[r2]
        L_0x03b4:
            if (r7 == 0) goto L_0x03b8
        L_0x03b6:
            r2 = 2
            goto L_0x03bb
        L_0x03b8:
            r7 = r3[r4]
            goto L_0x03b6
        L_0x03bb:
            r2 = r3[r2]
            r9.setCompoundDrawablesRelativeWithIntrinsicBounds(r8, r5, r2, r7)
            goto L_0x03e0
        L_0x03c1:
            android.graphics.drawable.Drawable[] r2 = r9.getCompoundDrawablesRelative()
            if (r8 == 0) goto L_0x03c8
            goto L_0x03cb
        L_0x03c8:
            r4 = 0
            r8 = r2[r4]
        L_0x03cb:
            if (r5 == 0) goto L_0x03ce
            goto L_0x03d1
        L_0x03ce:
            r4 = 1
            r5 = r2[r4]
        L_0x03d1:
            if (r3 == 0) goto L_0x03d4
            goto L_0x03d7
        L_0x03d4:
            r3 = 2
            r3 = r2[r3]
        L_0x03d7:
            if (r7 == 0) goto L_0x03da
            goto L_0x03dd
        L_0x03da:
            r4 = 3
            r7 = r2[r4]
        L_0x03dd:
            r9.setCompoundDrawablesRelativeWithIntrinsicBounds(r8, r5, r3, r7)
        L_0x03e0:
            r2 = 11
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x0414
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x03fc
            r3 = 0
            int r3 = r1.getResourceId(r2, r3)
            if (r3 == 0) goto L_0x03fc
            android.content.res.ColorStateList r3 = j0.f.c(r10, r3)
            if (r3 == 0) goto L_0x03fc
            goto L_0x0400
        L_0x03fc:
            android.content.res.ColorStateList r3 = r1.getColorStateList(r2)
        L_0x0400:
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 24
            if (r2 < r4) goto L_0x040a
            I.a.p(r9, r3)
            goto L_0x0414
        L_0x040a:
            boolean r2 = r9 instanceof y0.k
            if (r2 == 0) goto L_0x0414
            r2 = r9
            y0.k r2 = (y0.k) r2
            r2.setSupportCompoundDrawablesTintList(r3)
        L_0x0414:
            r2 = 12
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x043a
            r3 = -1
            int r2 = r1.getInt(r2, r3)
            r3 = 0
            android.graphics.PorterDuff$Mode r2 = o.C1286o0.c(r2, r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 24
            if (r3 < r4) goto L_0x0430
            I.a.q(r9, r2)
            goto L_0x043a
        L_0x0430:
            boolean r3 = r9 instanceof y0.k
            if (r3 == 0) goto L_0x043a
            r3 = r9
            y0.k r3 = (y0.k) r3
            r3.setSupportCompoundDrawablesTintMode(r2)
        L_0x043a:
            r2 = -1
            r3 = 15
            int r3 = r1.getDimensionPixelSize(r3, r2)
            r4 = 18
            int r4 = r1.getDimensionPixelSize(r4, r2)
            r2 = 19
            boolean r5 = r1.hasValue(r2)
            if (r5 == 0) goto L_0x046d
            android.util.TypedValue r5 = r1.peekValue(r2)
            if (r5 == 0) goto L_0x0465
            int r6 = r5.type
            r7 = 5
            if (r6 != r7) goto L_0x0465
            int r2 = r5.data
            r7 = r2 & 15
            float r2 = android.util.TypedValue.complexToFloat(r2)
            r5 = r7
            r7 = -1
            goto L_0x0471
        L_0x0465:
            r7 = -1
            int r2 = r1.getDimensionPixelSize(r2, r7)
            float r2 = (float) r2
        L_0x046b:
            r5 = -1
            goto L_0x0471
        L_0x046d:
            r7 = -1
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x046b
        L_0x0471:
            r1.recycle()
            if (r3 == r7) goto L_0x0479
            N7.a.s(r9, r3)
        L_0x0479:
            if (r4 == r7) goto L_0x047e
            N7.a.t(r9, r4)
        L_0x047e:
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x04a8
            if (r5 != r7) goto L_0x048b
            int r1 = (int) r2
            N7.a.u(r9, r1)
            goto L_0x04a8
        L_0x048b:
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 34
            if (r1 < r3) goto L_0x0495
            D.F.k(r9, r5, r2)
            goto L_0x04a8
        L_0x0495:
            android.content.res.Resources r1 = r9.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = android.util.TypedValue.applyDimension(r5, r2, r1)
            int r1 = java.lang.Math.round(r1)
            N7.a.u(r9, r1)
        L_0x04a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.X.f(android.util.AttributeSet, int):void");
    }

    public final void g(Context context, int i8) {
        String string;
        ColorStateList v4;
        ColorStateList v8;
        ColorStateList v9;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i8, C0940a.f11835x);
        k kVar = new k(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f13896a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        int i9 = Build.VERSION.SDK_INT;
        if (i9 < 23) {
            if (obtainStyledAttributes.hasValue(3) && (v9 = kVar.v(3)) != null) {
                textView.setTextColor(v9);
            }
            if (obtainStyledAttributes.hasValue(5) && (v8 = kVar.v(5)) != null) {
                textView.setLinkTextColor(v8);
            }
            if (obtainStyledAttributes.hasValue(4) && (v4 = kVar.v(4)) != null) {
                textView.setHintTextColor(v4);
            }
        }
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, kVar);
        if (i9 >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            V.d(textView, string);
        }
        kVar.M2();
        Typeface typeface = this.f13905l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f13903j);
        }
    }

    public final void i(int i8, int i9, int i10, int i11) {
        C1270g0 g0Var = this.i;
        if (g0Var.j()) {
            DisplayMetrics displayMetrics = g0Var.f13963j.getResources().getDisplayMetrics();
            g0Var.k(TypedValue.applyDimension(i11, (float) i8, displayMetrics), TypedValue.applyDimension(i11, (float) i9, displayMetrics), TypedValue.applyDimension(i11, (float) i10, displayMetrics));
            if (g0Var.h()) {
                g0Var.a();
            }
        }
    }

    public final void j(int[] iArr, int i8) {
        C1270g0 g0Var = this.i;
        if (g0Var.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i8 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = g0Var.f13963j.getResources().getDisplayMetrics();
                    for (int i9 = 0; i9 < length; i9++) {
                        iArr2[i9] = Math.round(TypedValue.applyDimension(i8, (float) iArr[i9], displayMetrics));
                    }
                }
                g0Var.f13960f = C1270g0.b(iArr2);
                if (!g0Var.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                g0Var.f13961g = false;
            }
            if (g0Var.h()) {
                g0Var.a();
            }
        }
    }

    public final void k(int i8) {
        C1270g0 g0Var = this.i;
        if (!g0Var.j()) {
            return;
        }
        if (i8 == 0) {
            g0Var.f13956a = 0;
            g0Var.f13959d = -1.0f;
            g0Var.e = -1.0f;
            g0Var.f13958c = -1.0f;
            g0Var.f13960f = new int[0];
            g0Var.f13957b = false;
        } else if (i8 == 1) {
            DisplayMetrics displayMetrics = g0Var.f13963j.getResources().getDisplayMetrics();
            g0Var.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (g0Var.h()) {
                g0Var.a();
            }
        } else {
            throw new IllegalArgumentException(g.m(i8, "Unknown auto-size text type: "));
        }
    }

    public final void l(ColorStateList colorStateList) {
        boolean z;
        if (this.f13902h == null) {
            this.f13902h = new g0(3);
        }
        g0 g0Var = this.f13902h;
        g0Var.f4838b = colorStateList;
        if (colorStateList != null) {
            z = true;
        } else {
            z = false;
        }
        g0Var.f4840d = z;
        this.f13897b = g0Var;
        this.f13898c = g0Var;
        this.f13899d = g0Var;
        this.e = g0Var;
        this.f13900f = g0Var;
        this.f13901g = g0Var;
    }

    public final void m(PorterDuff.Mode mode) {
        boolean z;
        if (this.f13902h == null) {
            this.f13902h = new g0(3);
        }
        g0 g0Var = this.f13902h;
        g0Var.e = mode;
        if (mode != null) {
            z = true;
        } else {
            z = false;
        }
        g0Var.f4839c = z;
        this.f13897b = g0Var;
        this.f13898c = g0Var;
        this.f13899d = g0Var;
        this.e = g0Var;
        this.f13900f = g0Var;
        this.f13901g = g0Var;
    }

    public final void n(Context context, k kVar) {
        String string;
        boolean z;
        boolean z6;
        int i8 = this.f13903j;
        TypedArray typedArray = (TypedArray) kVar.f9767W;
        this.f13903j = typedArray.getInt(2, i8);
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 28) {
            int i10 = typedArray.getInt(11, -1);
            this.f13904k = i10;
            if (i10 != -1) {
                this.f13903j &= 2;
            }
        }
        int i11 = 10;
        boolean z8 = false;
        if (typedArray.hasValue(10) || typedArray.hasValue(12)) {
            this.f13905l = null;
            if (typedArray.hasValue(12)) {
                i11 = 12;
            }
            int i12 = this.f13904k;
            int i13 = this.f13903j;
            if (!context.isRestricted()) {
                try {
                    Typeface R3 = kVar.R(i11, this.f13903j, new S(this, i12, i13, new WeakReference(this.f13896a)));
                    if (R3 != null) {
                        if (i9 < 28 || this.f13904k == -1) {
                            this.f13905l = R3;
                        } else {
                            Typeface create = Typeface.create(R3, 0);
                            int i14 = this.f13904k;
                            if ((this.f13903j & 2) != 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            this.f13905l = W.a(create, i14, z6);
                        }
                    }
                    if (this.f13905l == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.f13906m = z;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f13905l == null && (string = typedArray.getString(i11)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.f13904k == -1) {
                    this.f13905l = Typeface.create(string, this.f13903j);
                    return;
                }
                Typeface create2 = Typeface.create(string, 0);
                int i15 = this.f13904k;
                if ((this.f13903j & 2) != 0) {
                    z8 = true;
                }
                this.f13905l = W.a(create2, i15, z8);
            }
        } else if (typedArray.hasValue(1)) {
            this.f13906m = false;
            int i16 = typedArray.getInt(1, 1);
            if (i16 == 1) {
                this.f13905l = Typeface.SANS_SERIF;
            } else if (i16 == 2) {
                this.f13905l = Typeface.SERIF;
            } else if (i16 == 3) {
                this.f13905l = Typeface.MONOSPACE;
            }
        }
    }
}
