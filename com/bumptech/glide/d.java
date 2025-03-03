package com.bumptech.glide;

import B3.l;
import D.F;
import E.e;
import H3.i0;
import M0.C0129q;
import M0.I;
import M0.r;
import M1.a;
import P0.c;
import P0.z;
import P6.f;
import a0.k;
import a0.m;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraCharacteristics;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import c1.i;
import c1.n;
import c1.s;
import c1.v;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import s3.C1404a;
import v.C1502a;
import v0.C1510H;
import v0.C1553z;
import z3.g;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static Field f8977a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f8978b;

    /* renamed from: c  reason: collision with root package name */
    public static Class f8979c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f8980d;
    public static Field e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f8981f;

    /* renamed from: g  reason: collision with root package name */
    public static Field f8982g;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f8983h;

    public static void a(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = e.z(drawable).mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                drawable.setTintList(colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static final boolean b(byte[] bArr, int i, byte[] bArr2, int i8, int i9) {
        f.e(bArr, "a");
        f.e(bArr2, "b");
        for (int i10 = 0; i10 < i9; i10++) {
            if (bArr[i10 + i] != bArr2[i10 + i8]) {
                return false;
            }
        }
        return true;
    }

    public static final void c(long j7, long j8, long j9) {
        if ((j8 | j9) < 0 || j8 > j7 || j7 - j8 < j9) {
            throw new ArrayIndexOutOfBoundsException("size=" + j7 + " offset=" + j8 + " byteCount=" + j9);
        }
    }

    public static ImageView.ScaleType d(int i) {
        if (i == 0) {
            return ImageView.ScaleType.FIT_XY;
        }
        if (i == 1) {
            return ImageView.ScaleType.FIT_START;
        }
        if (i == 2) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        if (i == 3) {
            return ImageView.ScaleType.FIT_END;
        }
        if (i == 5) {
            return ImageView.ScaleType.CENTER_CROP;
        }
        if (i != 6) {
            return ImageView.ScaleType.CENTER;
        }
        return ImageView.ScaleType.CENTER_INSIDE;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [com.bumptech.glide.c, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v2, types: [com.bumptech.glide.c, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v3, types: [com.bumptech.glide.c, java.lang.Object] */
    public static c e(int i) {
        if (i == 0) {
            return new Object();
        }
        if (i != 1) {
            return new Object();
        }
        return new Object();
    }

    public static int f(boolean z) {
        List k8;
        try {
            C0129q qVar = new C0129q();
            qVar.f2999m = I.o("video/avc");
            r rVar = new r(qVar);
            if (rVar.f3036n != null) {
                i0 g8 = v.g(i.f8795V, rVar, z, false);
                int i = 0;
                while (i < g8.f2075X) {
                    if (((n) g8.get(i)).f8800d == null || ((n) g8.get(i)).f8800d.getVideoCapabilities() == null || (k8 = ((n) g8.get(i)).f8800d.getVideoCapabilities().getSupportedPerformancePoints()) == null || k8.isEmpty()) {
                        i++;
                    } else {
                        l.l();
                        MediaCodecInfo.VideoCapabilities.PerformancePoint d8 = l.d();
                        for (int i8 = 0; i8 < k8.size(); i8++) {
                            if (l.f(k8.get(i8)).covers(d8)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (s unused) {
        }
        return 0;
    }

    public static void g(Object obj) {
        LongSparseArray longSparseArray;
        if (!f8980d) {
            try {
                f8979c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e8) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e8);
            }
            f8980d = true;
        }
        Class cls = f8979c;
        if (cls != null) {
            if (!f8981f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e9) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e9);
                }
                f8981f = true;
            }
            Field field = e;
            if (field != null) {
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException e10) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e10);
                    longSparseArray = null;
                }
                if (longSparseArray != null) {
                    longSparseArray.clear();
                }
            }
        }
    }

    public static Context h(Context context) {
        int g8;
        Context applicationContext = context.getApplicationContext();
        int i = Build.VERSION.SDK_INT;
        if (i >= 34 && (g8 = F.g(context)) != F.g(applicationContext)) {
            applicationContext = F.a(applicationContext, g8);
        }
        if (i < 30) {
            return applicationContext;
        }
        String b8 = E.d.b(context);
        if (!Objects.equals(b8, E.d.b(applicationContext))) {
            return E.d.a(applicationContext, b8);
        }
        return applicationContext;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [a0.j, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v0, types: [a0.n, java.lang.Object] */
    public static m i(k kVar) {
        ? obj = new Object();
        obj.f7013c = new Object();
        m mVar = new m(obj);
        obj.f7012b = mVar;
        obj.f7011a = kVar.getClass();
        try {
            Object h5 = kVar.h(obj);
            if (h5 != null) {
                obj.f7011a = h5;
            }
        } catch (Exception e8) {
            mVar.f7017V.i(e8);
        }
        return mVar;
    }

    public static boolean j(String str, v.r rVar) {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        try {
            int[] iArr = (int[]) rVar.b(str).a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i : iArr) {
                    if (i == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (C1502a e8) {
            throw new Exception(new Exception(e8));
        }
    }

    public static Paint k(Context context) {
        Paint paint = new Paint();
        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), 2131230856);
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        paint.setShader(new BitmapShader(decodeResource, tileMode, tileMode));
        paint.setStrokeWidth(TypedValue.applyDimension(1, 1.5f, context.getResources().getDisplayMetrics()));
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        return paint;
    }

    public static Paint l(Context context) {
        Paint paint = new Paint();
        paint.setColor(-8355712);
        paint.setStrokeWidth(TypedValue.applyDimension(1, 1.5f, context.getResources().getDisplayMetrics()));
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        return paint;
    }

    public static void o(M1.d dVar, int i, c cVar) {
        long s8 = dVar.s(i);
        List X3 = dVar.X(s8);
        if (!X3.isEmpty()) {
            if (i != dVar.s0() - 1) {
                long s9 = dVar.s(i + 1) - dVar.s(i);
                if (s9 > 0) {
                    cVar.accept(new a(X3, s8, s9));
                    return;
                }
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0187, code lost:
        r1 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01b1 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList p(P0.r r28) {
        /*
            r0 = r28
            int r1 = r28.v()
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            r1 = 7
            r0.I(r1)
            int r3 = r28.i()
            r4 = 1684433976(0x64666c38, float:1.7002196E22)
            r5 = 1
            if (r3 != r4) goto L_0x0037
            P0.r r3 = new P0.r
            r3.<init>()
            java.util.zip.Inflater r4 = new java.util.zip.Inflater
            r4.<init>(r5)
            boolean r0 = P0.z.I(r0, r3, r4)     // Catch:{ all -> 0x0031 }
            if (r0 != 0) goto L_0x002c
            r4.end()
            return r2
        L_0x002c:
            r4.end()
            r0 = r3
            goto L_0x003d
        L_0x0031:
            r0 = move-exception
            r1 = r0
            r4.end()
            throw r1
        L_0x0037:
            r4 = 1918990112(0x72617720, float:4.465801E30)
            if (r3 == r4) goto L_0x003d
            return r2
        L_0x003d:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r0.f3733b
            int r6 = r0.f3734c
        L_0x0046:
            if (r4 >= r6) goto L_0x01ca
            int r7 = r0.i()
            int r7 = r7 + r4
            if (r7 <= r4) goto L_0x01b1
            if (r7 <= r6) goto L_0x0053
            goto L_0x01b1
        L_0x0053:
            int r4 = r0.i()
            r8 = 1835365224(0x6d657368, float:4.438224E27)
            if (r4 != r8) goto L_0x01b9
            int r4 = r0.i()
            r8 = 10000(0x2710, float:1.4013E-41)
            if (r4 <= r8) goto L_0x006d
        L_0x0064:
            r1 = r2
            r28 = r3
            r19 = r6
        L_0x0069:
            r20 = 1
            goto L_0x01af
        L_0x006d:
            float[] r8 = new float[r4]
            r10 = 0
        L_0x0070:
            if (r10 >= r4) goto L_0x007f
            int r11 = r0.i()
            float r11 = java.lang.Float.intBitsToFloat(r11)
            r8[r10] = r11
            int r10 = r10 + 1
            goto L_0x0070
        L_0x007f:
            int r10 = r0.i()
            r11 = 32000(0x7d00, float:4.4842E-41)
            if (r10 <= r11) goto L_0x0088
            goto L_0x0064
        L_0x0088:
            r11 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r13 = java.lang.Math.log(r11)
            r28 = r3
            double r2 = (double) r4
            double r2 = r2 * r11
            double r2 = java.lang.Math.log(r2)
            double r2 = r2 / r13
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            N1.f r3 = new N1.f
            byte[] r9 = r0.f3732a
            int r15 = r9.length
            r3.<init>((int) r15, (byte[]) r9)
            int r9 = r0.f3733b
            r15 = 8
            int r9 = r9 * 8
            r3.r(r9)
            int r9 = r10 * 5
            float[] r9 = new float[r9]
            r11 = 5
            int[] r12 = new int[r11]
            r15 = 0
            r18 = 0
        L_0x00b8:
            if (r15 >= r10) goto L_0x00e8
            r1 = 0
        L_0x00bb:
            if (r1 >= r11) goto L_0x00e3
            r19 = r12[r1]
            int r20 = r3.i(r2)
            int r21 = r20 >> 1
            r11 = r20 & 1
            int r11 = -r11
            r11 = r21 ^ r11
            int r11 = r11 + r19
            if (r11 >= r4) goto L_0x00df
            if (r11 >= 0) goto L_0x00d1
            goto L_0x00df
        L_0x00d1:
            int r19 = r18 + 1
            r20 = r8[r11]
            r9[r18] = r20
            r12[r1] = r11
            int r1 = r1 + 1
            r18 = r19
            r11 = 5
            goto L_0x00bb
        L_0x00df:
            r19 = r6
            r1 = 0
            goto L_0x0069
        L_0x00e3:
            int r15 = r15 + 1
            r1 = 7
            r11 = 5
            goto L_0x00b8
        L_0x00e8:
            int r1 = r3.g()
            r2 = 7
            int r1 = r1 + r2
            r1 = r1 & -8
            r3.r(r1)
            r1 = 32
            int r4 = r3.i(r1)
            C3.r[] r8 = new C3.r[r4]
            r11 = 0
        L_0x00fc:
            if (r11 >= r4) goto L_0x01a6
            r12 = 8
            int r15 = r3.i(r12)
            int r2 = r3.i(r12)
            int r12 = r3.i(r1)
            r1 = 128000(0x1f400, float:1.79366E-40)
            if (r12 <= r1) goto L_0x0112
            goto L_0x00df
        L_0x0112:
            r19 = r6
            double r5 = (double) r10
            r16 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r5 = r5 * r16
            double r5 = java.lang.Math.log(r5)
            double r5 = r5 / r13
            double r5 = java.lang.Math.ceil(r5)
            int r5 = (int) r5
            int r6 = r12 * 3
            float[] r6 = new float[r6]
            int r1 = r12 * 2
            float[] r1 = new float[r1]
            r21 = r1
            r1 = 0
            r22 = 0
        L_0x0130:
            if (r1 >= r12) goto L_0x0189
            int r23 = r3.i(r5)
            int r24 = r23 >> 1
            r25 = r3
            r20 = 1
            r3 = r23 & 1
            r27 = r21
            r21 = r4
            r4 = r27
            int r3 = -r3
            r3 = r24 ^ r3
            int r3 = r3 + r22
            if (r3 < 0) goto L_0x014d
            if (r3 < r10) goto L_0x0150
        L_0x014d:
            r20 = 1
            goto L_0x0187
        L_0x0150:
            int r22 = r1 * 3
            int r23 = r3 * 5
            r24 = r9[r23]
            r6[r22] = r24
            int r24 = r22 + 1
            int r26 = r23 + 1
            r26 = r9[r26]
            r6[r24] = r26
            int r22 = r22 + 2
            int r24 = r23 + 2
            r24 = r9[r24]
            r6[r22] = r24
            int r22 = r1 * 2
            int r24 = r23 + 3
            r24 = r9[r24]
            r4[r22] = r24
            r20 = 1
            int r22 = r22 + 1
            int r23 = r23 + 4
            r23 = r9[r23]
            r4[r22] = r23
            int r1 = r1 + 1
            r22 = r3
            r3 = r25
            r27 = r21
            r21 = r4
            r4 = r27
            goto L_0x0130
        L_0x0187:
            r1 = 0
            goto L_0x01af
        L_0x0189:
            r25 = r3
            r20 = 1
            r27 = r21
            r21 = r4
            r4 = r27
            C3.r r1 = new C3.r
            r1.<init>(r15, r6, r4, r2)
            r8[r11] = r1
            int r11 = r11 + 1
            r6 = r19
            r4 = r21
            r1 = 32
            r2 = 7
            r5 = 1
            goto L_0x00fc
        L_0x01a6:
            r19 = r6
            r20 = 1
            o1.e r1 = new o1.e
            r1.<init>(r8)
        L_0x01af:
            if (r1 != 0) goto L_0x01b3
        L_0x01b1:
            r2 = 0
            goto L_0x01cb
        L_0x01b3:
            r2 = r28
            r2.add(r1)
            goto L_0x01be
        L_0x01b9:
            r2 = r3
            r19 = r6
            r20 = 1
        L_0x01be:
            r0.H(r7)
            r3 = r2
            r4 = r7
            r6 = r19
            r1 = 7
            r2 = 0
            r5 = 1
            goto L_0x0046
        L_0x01ca:
            r2 = r3
        L_0x01cb:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.d.p(P0.r):java.util.ArrayList");
    }

    public static void q(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int[] drawableState = textInputLayout.getDrawableState();
            int[] drawableState2 = checkableImageButton.getDrawableState();
            int length = drawableState.length;
            int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
            System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
            int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
            Drawable mutate = e.z(drawable).mutate();
            mutate.setTintList(ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a7, code lost:
        if (r6 < 0) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a9, code lost:
        if (r8 == false) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ab, code lost:
        r8 = (int) r5[r6];
        r11 = r6 + 1;
        r12 = (int) r5[r11];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b3, code lost:
        if (r8 < -1) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b5, code lost:
        if (r8 > r9) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b7, code lost:
        if (r12 < -1) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b9, code lost:
        if (r12 > r15) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00bb, code lost:
        if (r8 != -1) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00bd, code lost:
        r5[r6] = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00bf, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c1, code lost:
        if (r8 != r9) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c3, code lost:
        r5[r6] = (float) (r9 - 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c9, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ca, code lost:
        if (r12 != -1) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00cc, code lost:
        r5[r11] = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ce, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d0, code lost:
        if (r12 != r15) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d2, code lost:
        r5[r11] = (float) (r15 - 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d8, code lost:
        r6 = r6 - 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00dd, code lost:
        throw M3.h.f3144W;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00de, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00df, code lost:
        if (r6 >= r1) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ed, code lost:
        if (r0.b((int) r5[r6], (int) r5[r6 + 1]) == false) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ef, code lost:
        r4.f(r6 / 2, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00f4, code lost:
        r6 = r6 + 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f9, code lost:
        throw M3.h.f3144W;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00fa, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0096  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static S3.b r(S3.b r17, int r18, int r19, S3.f r20) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            if (r1 <= 0) goto L_0x00ff
            if (r2 <= 0) goto L_0x00ff
            S3.b r4 = new S3.b
            r4.<init>(r1, r2)
            int r1 = r1 * 2
            float[] r5 = new float[r1]
            r7 = 0
        L_0x0016:
            if (r7 >= r2) goto L_0x00fe
            float r8 = (float) r7
            r9 = 1056964608(0x3f000000, float:0.5)
            float r8 = r8 + r9
            r10 = 0
        L_0x001d:
            if (r10 >= r1) goto L_0x002c
            int r11 = r10 / 2
            float r11 = (float) r11
            float r11 = r11 + r9
            r5[r10] = r11
            int r11 = r10 + 1
            r5[r11] = r8
            int r10 = r10 + 2
            goto L_0x001d
        L_0x002c:
            int r8 = r1 + -1
            r9 = 0
        L_0x002f:
            if (r9 >= r8) goto L_0x0064
            r10 = r5[r9]
            int r11 = r9 + 1
            r12 = r5[r11]
            float r13 = r3.f4526c
            float r13 = r13 * r10
            float r14 = r3.f4528f
            float r14 = r14 * r12
            float r14 = r14 + r13
            float r13 = r3.i
            float r14 = r14 + r13
            float r13 = r3.f4524a
            float r13 = r13 * r10
            float r15 = r3.f4527d
            float r15 = r15 * r12
            float r15 = r15 + r13
            float r13 = r3.f4529g
            float r15 = r15 + r13
            float r15 = r15 / r14
            r5[r9] = r15
            float r13 = r3.f4525b
            float r13 = r13 * r10
            float r10 = r3.e
            float r10 = r10 * r12
            float r10 = r10 + r13
            float r12 = r3.f4530h
            float r10 = r10 + r12
            float r10 = r10 / r14
            r5[r11] = r10
            int r9 = r9 + 2
            goto L_0x002f
        L_0x0064:
            int r9 = r0.f4505U
            r10 = 1
            r11 = 0
            r12 = 1
        L_0x0069:
            r13 = 0
            r14 = -1
            int r15 = r0.f4506V
            if (r11 >= r8) goto L_0x00a4
            if (r12 == 0) goto L_0x00a4
            r12 = r5[r11]
            int r12 = (int) r12
            int r16 = r11 + 1
            r6 = r5[r16]
            int r6 = (int) r6
            if (r12 < r14) goto L_0x00a1
            if (r12 > r9) goto L_0x00a1
            if (r6 < r14) goto L_0x00a1
            if (r6 > r15) goto L_0x00a1
            if (r12 != r14) goto L_0x0087
            r5[r11] = r13
        L_0x0085:
            r12 = 1
            goto L_0x0090
        L_0x0087:
            if (r12 != r9) goto L_0x008f
            int r12 = r9 + -1
            float r12 = (float) r12
            r5[r11] = r12
            goto L_0x0085
        L_0x008f:
            r12 = 0
        L_0x0090:
            if (r6 != r14) goto L_0x0096
            r5[r16] = r13
        L_0x0094:
            r12 = 1
            goto L_0x009e
        L_0x0096:
            if (r6 != r15) goto L_0x009e
            int r15 = r15 + -1
            float r6 = (float) r15
            r5[r16] = r6
            goto L_0x0094
        L_0x009e:
            int r11 = r11 + 2
            goto L_0x0069
        L_0x00a1:
            M3.h r0 = M3.h.f3144W
            throw r0
        L_0x00a4:
            int r6 = r1 + -2
            r8 = 1
        L_0x00a7:
            if (r6 < 0) goto L_0x00de
            if (r8 == 0) goto L_0x00de
            r8 = r5[r6]
            int r8 = (int) r8
            int r11 = r6 + 1
            r12 = r5[r11]
            int r12 = (int) r12
            if (r8 < r14) goto L_0x00db
            if (r8 > r9) goto L_0x00db
            if (r12 < r14) goto L_0x00db
            if (r12 > r15) goto L_0x00db
            if (r8 != r14) goto L_0x00c1
            r5[r6] = r13
        L_0x00bf:
            r8 = 1
            goto L_0x00ca
        L_0x00c1:
            if (r8 != r9) goto L_0x00c9
            int r8 = r9 + -1
            float r8 = (float) r8
            r5[r6] = r8
            goto L_0x00bf
        L_0x00c9:
            r8 = 0
        L_0x00ca:
            if (r12 != r14) goto L_0x00d0
            r5[r11] = r13
        L_0x00ce:
            r8 = 1
            goto L_0x00d8
        L_0x00d0:
            if (r12 != r15) goto L_0x00d8
            int r8 = r15 + -1
            float r8 = (float) r8
            r5[r11] = r8
            goto L_0x00ce
        L_0x00d8:
            int r6 = r6 + -2
            goto L_0x00a7
        L_0x00db:
            M3.h r0 = M3.h.f3144W
            throw r0
        L_0x00de:
            r6 = 0
        L_0x00df:
            if (r6 >= r1) goto L_0x00fa
            r8 = r5[r6]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00f7 }
            int r8 = (int) r8     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00f7 }
            int r9 = r6 + 1
            r9 = r5[r9]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00f7 }
            int r9 = (int) r9     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00f7 }
            boolean r8 = r0.b(r8, r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00f7 }
            if (r8 == 0) goto L_0x00f4
            int r8 = r6 / 2
            r4.f(r8, r7)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x00f7 }
        L_0x00f4:
            int r6 = r6 + 2
            goto L_0x00df
        L_0x00f7:
            M3.h r0 = M3.h.f3144W
            throw r0
        L_0x00fa:
            int r7 = r7 + 1
            goto L_0x0016
        L_0x00fe:
            return r4
        L_0x00ff:
            M3.h r0 = M3.h.f3144W
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.d.r(S3.b, int, int, S3.f):S3.b");
    }

    public static void s(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean z;
        WeakHashMap weakHashMap = C1510H.f15874a;
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z6 = false;
        int i = 1;
        if (onLongClickListener != null) {
            z = true;
        } else {
            z = false;
        }
        if (hasOnClickListeners || z) {
            z6 = true;
        }
        checkableImageButton.setFocusable(z6);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z);
        if (!z6) {
            i = 2;
        }
        checkableImageButton.setImportantForAccessibility(i);
    }

    public static void t(View view, g gVar) {
        C1404a aVar = gVar.f16469U.f16455b;
        if (aVar != null && aVar.f15083a) {
            float f8 = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                WeakHashMap weakHashMap = C1510H.f15874a;
                f8 += C1553z.e((View) parent);
            }
            z3.f fVar = gVar.f16469U;
            if (fVar.f16463l != f8) {
                fVar.f16463l = f8;
                gVar.m();
            }
        }
    }

    public static String u(int i) {
        Object[] objArr = {Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Double.valueOf(((double) Color.alpha(i)) / 255.0d)};
        int i8 = z.f3748a;
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", objArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005a A[LOOP:0: B:21:0x0054->B:23:0x005a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void v(M1.d r13, M1.k r14, P0.c r15) {
        /*
            long r0 = r14.f3088a
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L_0x000e
            r5 = 0
            goto L_0x0027
        L_0x000e:
            int r5 = r13.c(r0)
            r6 = -1
            if (r5 != r6) goto L_0x0019
            int r5 = r13.s0()
        L_0x0019:
            if (r5 <= 0) goto L_0x0027
            int r6 = r5 + -1
            long r6 = r13.s(r6)
            int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r8 != 0) goto L_0x0027
            int r5 = r5 + -1
        L_0x0027:
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x0052
            int r2 = r13.s0()
            if (r5 >= r2) goto L_0x0052
            java.util.List r7 = r13.X(r0)
            long r2 = r13.s(r5)
            boolean r6 = r7.isEmpty()
            if (r6 != 0) goto L_0x0052
            long r8 = r14.f3088a
            int r6 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x0052
            M1.a r12 = new M1.a
            long r10 = r2 - r8
            r6 = r12
            r6.<init>(r7, r8, r10)
            r15.accept(r12)
            r2 = 1
            goto L_0x0053
        L_0x0052:
            r2 = 0
        L_0x0053:
            r3 = r5
        L_0x0054:
            int r6 = r13.s0()
            if (r3 >= r6) goto L_0x0060
            o(r13, r3, r15)
            int r3 = r3 + 1
            goto L_0x0054
        L_0x0060:
            boolean r14 = r14.f3089b
            if (r14 == 0) goto L_0x0089
            if (r2 == 0) goto L_0x0068
            int r5 = r5 + -1
        L_0x0068:
            if (r4 >= r5) goto L_0x0070
            o(r13, r4, r15)
            int r4 = r4 + 1
            goto L_0x0068
        L_0x0070:
            if (r2 == 0) goto L_0x0089
            M1.a r14 = new M1.a
            java.util.List r7 = r13.X(r0)
            long r8 = r13.s(r5)
            long r2 = r13.s(r5)
            long r10 = r0 - r2
            r6 = r14
            r6.<init>(r7, r8, r10)
            r15.accept(r14)
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.d.v(M1.d, M1.k, P0.c):void");
    }

    public abstract void m(int i);

    public abstract void n(Typeface typeface, boolean z);
}
