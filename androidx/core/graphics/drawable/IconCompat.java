package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import androidx.versionedparcelable.CustomVersionedParcelable;

public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k  reason: collision with root package name */
    public static final PorterDuff.Mode f7739k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a  reason: collision with root package name */
    public int f7740a = -1;

    /* renamed from: b  reason: collision with root package name */
    public Object f7741b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f7742c = null;

    /* renamed from: d  reason: collision with root package name */
    public Parcelable f7743d = null;
    public int e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f7744f = 0;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f7745g = null;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f7746h = f7739k;
    public String i = null;

    /* renamed from: j  reason: collision with root package name */
    public String f7747j;

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x010e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r8 = this;
            r0 = 0
            int r1 = r8.f7740a
            r2 = -1
            if (r1 != r2) goto L_0x000d
            java.lang.Object r0 = r8.f7741b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L_0x000d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Icon(typ="
            r1.<init>(r3)
            int r3 = r8.f7740a
            switch(r3) {
                case 1: goto L_0x002b;
                case 2: goto L_0x0028;
                case 3: goto L_0x0025;
                case 4: goto L_0x0022;
                case 5: goto L_0x001f;
                case 6: goto L_0x001c;
                default: goto L_0x0019;
            }
        L_0x0019:
            java.lang.String r3 = "UNKNOWN"
            goto L_0x002d
        L_0x001c:
            java.lang.String r3 = "URI_MASKABLE"
            goto L_0x002d
        L_0x001f:
            java.lang.String r3 = "BITMAP_MASKABLE"
            goto L_0x002d
        L_0x0022:
            java.lang.String r3 = "URI"
            goto L_0x002d
        L_0x0025:
            java.lang.String r3 = "DATA"
            goto L_0x002d
        L_0x0028:
            java.lang.String r3 = "RESOURCE"
            goto L_0x002d
        L_0x002b:
            java.lang.String r3 = "BITMAP"
        L_0x002d:
            r1.append(r3)
            int r3 = r8.f7740a
            switch(r3) {
                case 1: goto L_0x00da;
                case 2: goto L_0x005d;
                case 3: goto L_0x0043;
                case 4: goto L_0x0037;
                case 5: goto L_0x00da;
                case 6: goto L_0x0037;
                default: goto L_0x0035;
            }
        L_0x0035:
            goto L_0x00fa
        L_0x0037:
            java.lang.String r0 = " uri="
            r1.append(r0)
            java.lang.Object r0 = r8.f7741b
            r1.append(r0)
            goto L_0x00fa
        L_0x0043:
            java.lang.String r0 = " len="
            r1.append(r0)
            int r0 = r8.e
            r1.append(r0)
            int r0 = r8.f7744f
            if (r0 == 0) goto L_0x00fa
            java.lang.String r0 = " off="
            r1.append(r0)
            int r0 = r8.f7744f
            r1.append(r0)
            goto L_0x00fa
        L_0x005d:
            java.lang.String r3 = " pkg="
            r1.append(r3)
            java.lang.String r3 = r8.f7747j
            r1.append(r3)
            java.lang.String r3 = " id="
            r1.append(r3)
            int r3 = r8.f7740a
            if (r3 != r2) goto L_0x00ae
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 23
            if (r2 < r4) goto L_0x00ae
            java.lang.Object r3 = r8.f7741b
            java.lang.String r4 = "Unable to get icon resource"
            java.lang.String r5 = "IconCompat"
            r6 = 28
            if (r2 < r6) goto L_0x0085
            int r2 = k0.C1131a.e(r3)
            goto L_0x00b3
        L_0x0085:
            java.lang.Class r2 = r3.getClass()     // Catch:{ IllegalAccessException -> 0x009f, InvocationTargetException -> 0x009d, NoSuchMethodException -> 0x009b }
            java.lang.String r6 = "getResId"
            r7 = 0
            java.lang.reflect.Method r2 = r2.getMethod(r6, r7)     // Catch:{ IllegalAccessException -> 0x009f, InvocationTargetException -> 0x009d, NoSuchMethodException -> 0x009b }
            java.lang.Object r2 = r2.invoke(r3, r7)     // Catch:{ IllegalAccessException -> 0x009f, InvocationTargetException -> 0x009d, NoSuchMethodException -> 0x009b }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ IllegalAccessException -> 0x009f, InvocationTargetException -> 0x009d, NoSuchMethodException -> 0x009b }
            int r2 = r2.intValue()     // Catch:{ IllegalAccessException -> 0x009f, InvocationTargetException -> 0x009d, NoSuchMethodException -> 0x009b }
            goto L_0x00b3
        L_0x009b:
            r2 = move-exception
            goto L_0x00a1
        L_0x009d:
            r2 = move-exception
            goto L_0x00a6
        L_0x009f:
            r2 = move-exception
            goto L_0x00aa
        L_0x00a1:
            android.util.Log.e(r5, r4, r2)
        L_0x00a4:
            r2 = 0
            goto L_0x00b3
        L_0x00a6:
            android.util.Log.e(r5, r4, r2)
            goto L_0x00a4
        L_0x00aa:
            android.util.Log.e(r5, r4, r2)
            goto L_0x00a4
        L_0x00ae:
            r2 = 2
            if (r3 != r2) goto L_0x00c6
            int r2 = r8.e
        L_0x00b3:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r2
            java.lang.String r0 = "0x%08x"
            java.lang.String r0 = java.lang.String.format(r0, r3)
            r1.append(r0)
            goto L_0x00fa
        L_0x00c6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "called getResId() on "
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00da:
            java.lang.String r0 = " size="
            r1.append(r0)
            java.lang.Object r0 = r8.f7741b
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            int r0 = r0.getWidth()
            r1.append(r0)
            java.lang.String r0 = "x"
            r1.append(r0)
            java.lang.Object r0 = r8.f7741b
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            int r0 = r0.getHeight()
            r1.append(r0)
        L_0x00fa:
            android.content.res.ColorStateList r0 = r8.f7745g
            if (r0 == 0) goto L_0x0108
            java.lang.String r0 = " tint="
            r1.append(r0)
            android.content.res.ColorStateList r0 = r8.f7745g
            r1.append(r0)
        L_0x0108:
            android.graphics.PorterDuff$Mode r0 = r8.f7746h
            android.graphics.PorterDuff$Mode r2 = f7739k
            if (r0 == r2) goto L_0x0118
            java.lang.String r0 = " mode="
            r1.append(r0)
            android.graphics.PorterDuff$Mode r0 = r8.f7746h
            r1.append(r0)
        L_0x0118:
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.toString():java.lang.String");
    }
}
