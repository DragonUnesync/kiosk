package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: o.g0  reason: case insensitive filesystem */
public final class C1270g0 {

    /* renamed from: l  reason: collision with root package name */
    public static final RectF f13954l = new RectF();

    /* renamed from: m  reason: collision with root package name */
    public static final ConcurrentHashMap f13955m = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public int f13956a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f13957b = false;

    /* renamed from: c  reason: collision with root package name */
    public float f13958c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f13959d = -1.0f;
    public float e = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    public int[] f13960f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public boolean f13961g = false;

    /* renamed from: h  reason: collision with root package name */
    public TextPaint f13962h;
    public final TextView i;

    /* renamed from: j  reason: collision with root package name */
    public final Context f13963j;

    /* renamed from: k  reason: collision with root package name */
    public final C1268f0 f13964k;

    public C1270g0(TextView textView) {
        this.i = textView;
        this.f13963j = textView.getContext();
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 29) {
            this.f13964k = new C1266e0();
        } else if (i8 >= 23) {
            this.f13964k = new C1264d0();
        } else {
            this.f13964k = new C1268f0();
        }
    }

    public static int[] b(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i8 : iArr) {
            if (i8 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i8)) < 0) {
                arrayList.add(Integer.valueOf(i8));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i9 = 0; i9 < size; i9++) {
            iArr2[i9] = ((Integer) arrayList.get(i9)).intValue();
        }
        return iArr2;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f13955m;
            Method method = (Method) concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, (Class[]) null)) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
            }
            return method;
        } catch (Exception e8) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e8);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        android.util.Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + r2 + "() method", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        return r4;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object e(java.lang.String r2, java.lang.Object r3, java.lang.Object r4) {
        /*
            java.lang.reflect.Method r0 = d(r2)     // Catch:{ Exception -> 0x000c, all -> 0x000a }
            r1 = 0
            java.lang.Object r4 = r0.invoke(r3, r1)     // Catch:{ Exception -> 0x000c, all -> 0x000a }
            goto L_0x0027
        L_0x000a:
            r2 = move-exception
            goto L_0x000e
        L_0x000c:
            r3 = move-exception
            goto L_0x000f
        L_0x000e:
            throw r2
        L_0x000f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to invoke TextView#"
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = "() method"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "ACTVAutoSizeHelper"
            android.util.Log.w(r0, r2, r3)
        L_0x0027:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1270g0.e(java.lang.String, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final void a() {
        int i8;
        if (f()) {
            if (this.f13957b) {
                if (this.i.getMeasuredHeight() > 0 && this.i.getMeasuredWidth() > 0) {
                    if (this.f13964k.b(this.i)) {
                        i8 = 1048576;
                    } else {
                        i8 = (this.i.getMeasuredWidth() - this.i.getTotalPaddingLeft()) - this.i.getTotalPaddingRight();
                    }
                    int height = (this.i.getHeight() - this.i.getCompoundPaddingBottom()) - this.i.getCompoundPaddingTop();
                    if (i8 > 0 && height > 0) {
                        RectF rectF = f13954l;
                        synchronized (rectF) {
                            try {
                                rectF.setEmpty();
                                rectF.right = (float) i8;
                                rectF.bottom = (float) height;
                                float c8 = (float) c(rectF);
                                if (c8 != this.i.getTextSize()) {
                                    g(0, c8);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f13957b = true;
        }
    }

    public final int c(RectF rectF) {
        StaticLayout staticLayout;
        CharSequence transformation;
        RectF rectF2 = rectF;
        int length = this.f13960f.length;
        if (length != 0) {
            int i8 = length - 1;
            int i9 = 1;
            int i10 = 0;
            while (i9 <= i8) {
                int i11 = (i9 + i8) / 2;
                int i12 = this.f13960f[i11];
                TextView textView = this.i;
                CharSequence text = textView.getText();
                TransformationMethod transformationMethod = textView.getTransformationMethod();
                if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null)) {
                    text = transformation;
                }
                int maxLines = textView.getMaxLines();
                TextPaint textPaint = this.f13962h;
                if (textPaint == null) {
                    this.f13962h = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.f13962h.set(textView.getPaint());
                this.f13962h.setTextSize((float) i12);
                Layout.Alignment alignment = (Layout.Alignment) e("getLayoutAlignment", textView, Layout.Alignment.ALIGN_NORMAL);
                int round = Math.round(rectF2.right);
                if (Build.VERSION.SDK_INT >= 23) {
                    staticLayout = C1262c0.a(text, alignment, round, maxLines, this.i, this.f13962h, this.f13964k);
                } else {
                    staticLayout = new StaticLayout(text, this.f13962h, round, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
                }
                if ((maxLines == -1 || (staticLayout.getLineCount() <= maxLines && staticLayout.getLineEnd(staticLayout.getLineCount() - 1) == text.length())) && ((float) staticLayout.getHeight()) <= rectF2.bottom) {
                    int i13 = i11 + 1;
                    i10 = i9;
                    i9 = i13;
                } else {
                    i10 = i11 - 1;
                    i8 = i10;
                }
            }
            return this.f13960f[i10];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public final boolean f() {
        if (!j() || this.f13956a == 0) {
            return false;
        }
        return true;
    }

    public final void g(int i8, float f8) {
        Resources resources;
        Context context = this.f13963j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i8, f8, resources.getDisplayMetrics());
        TextView textView = this.i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean isInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f13957b = false;
                try {
                    Method d8 = d("nullLayouts");
                    if (d8 != null) {
                        d8.invoke(textView, (Object[]) null);
                    }
                } catch (Exception e8) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e8);
                }
                if (!isInLayout) {
                    textView.requestLayout();
                } else {
                    textView.forceLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean h() {
        if (!j() || this.f13956a != 1) {
            this.f13957b = false;
        } else {
            if (!this.f13961g || this.f13960f.length == 0) {
                int floor = ((int) Math.floor((double) ((this.e - this.f13959d) / this.f13958c))) + 1;
                int[] iArr = new int[floor];
                for (int i8 = 0; i8 < floor; i8++) {
                    iArr[i8] = Math.round((((float) i8) * this.f13958c) + this.f13959d);
                }
                this.f13960f = b(iArr);
            }
            this.f13957b = true;
        }
        return this.f13957b;
    }

    public final boolean i() {
        boolean z;
        int[] iArr = this.f13960f;
        int length = iArr.length;
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f13961g = z;
        if (z) {
            this.f13956a = 1;
            this.f13959d = (float) iArr[0];
            this.e = (float) iArr[length - 1];
            this.f13958c = -1.0f;
        }
        return z;
    }

    public final boolean j() {
        return !(this.i instanceof C1296u);
    }

    public final void k(float f8, float f9, float f10) {
        if (f8 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f8 + "px) is less or equal to (0px)");
        } else if (f9 <= f8) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f9 + "px) is less or equal to minimum auto-size text size (" + f8 + "px)");
        } else if (f10 > 0.0f) {
            this.f13956a = 1;
            this.f13959d = f8;
            this.e = f9;
            this.f13958c = f10;
            this.f13961g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f10 + "px) is less or equal to (0px)");
        }
    }
}
