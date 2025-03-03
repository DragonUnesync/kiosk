package l0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.SparseArray;
import java.util.WeakHashMap;

public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f13083a = new ThreadLocal();

    /* renamed from: b  reason: collision with root package name */
    public static final WeakHashMap f13084b = new WeakHashMap(0);

    /* renamed from: c  reason: collision with root package name */
    public static final Object f13085c = new Object();

    public static void a(j jVar, int i, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f13085c) {
            try {
                WeakHashMap weakHashMap = f13084b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(jVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(jVar, sparseArray);
                }
                sparseArray.append(i, new i(colorStateList, jVar.f13081a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00df A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface b(android.content.Context r16, int r17, android.util.TypedValue r18, int r19, l0.C1169b r20, boolean r21, boolean r22) {
        /*
            r10 = r17
            r0 = r18
            r7 = r19
            r11 = r20
            android.content.res.Resources r8 = r16.getResources()
            r1 = 1
            r8.getValue(r10, r0, r1)
            java.lang.String r12 = "ResourcesCompat"
            java.lang.CharSequence r1 = r0.string
            if (r1 == 0) goto L_0x0102
            java.lang.String r13 = r1.toString()
            java.lang.String r1 = "res/"
            boolean r1 = r13.startsWith(r1)
            r14 = 0
            r15 = -3
            if (r1 != 0) goto L_0x002b
            if (r11 == 0) goto L_0x00dd
            r11.a(r15)
            goto L_0x00dd
        L_0x002b:
            int r1 = r0.assetCookie
            N5.c r9 = m0.C1200f.f13324b
            java.lang.String r1 = m0.C1200f.b(r8, r10, r13, r1, r7)
            java.lang.Object r1 = r9.h(r1)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0053
            if (r11 == 0) goto L_0x0050
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r0.<init>(r2)
            a1.c r2 = new a1.c
            r3 = 11
            r2.<init>((java.lang.Object) r11, (int) r3, (java.lang.Object) r1)
            r0.post(r2)
        L_0x0050:
            r14 = r1
            goto L_0x00dd
        L_0x0053:
            if (r22 == 0) goto L_0x0057
            goto L_0x00dd
        L_0x0057:
            java.lang.String r1 = r13.toLowerCase()     // Catch:{ XmlPullParserException -> 0x007b, IOException -> 0x0079 }
            java.lang.String r2 = ".xml"
            boolean r1 = r1.endsWith(r2)     // Catch:{ XmlPullParserException -> 0x007b, IOException -> 0x0079 }
            if (r1 == 0) goto L_0x0090
            android.content.res.XmlResourceParser r1 = r8.getXml(r10)     // Catch:{ XmlPullParserException -> 0x007b, IOException -> 0x0079 }
            l0.d r2 = l0.C1169b.j(r1, r8)     // Catch:{ XmlPullParserException -> 0x007b, IOException -> 0x0079 }
            if (r2 != 0) goto L_0x007d
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r12, r0)     // Catch:{ XmlPullParserException -> 0x007b, IOException -> 0x0079 }
            if (r11 == 0) goto L_0x00dd
            r11.a(r15)     // Catch:{ XmlPullParserException -> 0x007b, IOException -> 0x0079 }
            goto L_0x00dd
        L_0x0079:
            r0 = move-exception
            goto L_0x00c5
        L_0x007b:
            r0 = move-exception
            goto L_0x00cf
        L_0x007d:
            int r6 = r0.assetCookie     // Catch:{ XmlPullParserException -> 0x007b, IOException -> 0x0079 }
            r1 = r16
            r3 = r8
            r4 = r17
            r5 = r13
            r7 = r19
            r8 = r20
            r9 = r21
            android.graphics.Typeface r14 = m0.C1200f.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ XmlPullParserException -> 0x007b, IOException -> 0x0079 }
            goto L_0x00dd
        L_0x0090:
            int r0 = r0.assetCookie     // Catch:{ XmlPullParserException -> 0x007b, IOException -> 0x0079 }
            D7.b r1 = m0.C1200f.f13323a     // Catch:{ XmlPullParserException -> 0x007b, IOException -> 0x0079 }
            r2 = r16
            r3 = r8
            r4 = r17
            r5 = r13
            r6 = r19
            android.graphics.Typeface r1 = r1.j(r2, r3, r4, r5, r6)     // Catch:{ XmlPullParserException -> 0x007b, IOException -> 0x0079 }
            if (r1 == 0) goto L_0x00a9
            java.lang.String r0 = m0.C1200f.b(r8, r10, r13, r0, r7)     // Catch:{ XmlPullParserException -> 0x007b, IOException -> 0x0079 }
            r9.l(r0, r1)     // Catch:{ XmlPullParserException -> 0x007b, IOException -> 0x0079 }
        L_0x00a9:
            if (r11 == 0) goto L_0x0050
            if (r1 == 0) goto L_0x00c1
            android.os.Handler r0 = new android.os.Handler     // Catch:{ XmlPullParserException -> 0x007b, IOException -> 0x0079 }
            android.os.Looper r2 = android.os.Looper.getMainLooper()     // Catch:{ XmlPullParserException -> 0x007b, IOException -> 0x0079 }
            r0.<init>(r2)     // Catch:{ XmlPullParserException -> 0x007b, IOException -> 0x0079 }
            a1.c r2 = new a1.c     // Catch:{ XmlPullParserException -> 0x007b, IOException -> 0x0079 }
            r3 = 11
            r2.<init>((java.lang.Object) r11, (int) r3, (java.lang.Object) r1)     // Catch:{ XmlPullParserException -> 0x007b, IOException -> 0x0079 }
            r0.post(r2)     // Catch:{ XmlPullParserException -> 0x007b, IOException -> 0x0079 }
            goto L_0x0050
        L_0x00c1:
            r11.a(r15)     // Catch:{ XmlPullParserException -> 0x007b, IOException -> 0x0079 }
            goto L_0x0050
        L_0x00c5:
            java.lang.String r1 = "Failed to read xml resource "
            java.lang.String r1 = r1.concat(r13)
            android.util.Log.e(r12, r1, r0)
            goto L_0x00d8
        L_0x00cf:
            java.lang.String r1 = "Failed to parse xml resource "
            java.lang.String r1 = r1.concat(r13)
            android.util.Log.e(r12, r1, r0)
        L_0x00d8:
            if (r11 == 0) goto L_0x00dd
            r11.a(r15)
        L_0x00dd:
            if (r14 != 0) goto L_0x0101
            if (r11 != 0) goto L_0x0101
            if (r22 == 0) goto L_0x00e4
            goto L_0x0101
        L_0x00e4:
            android.content.res.Resources$NotFoundException r0 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Font resource ID #0x"
            r1.<init>(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r17)
            r1.append(r2)
            java.lang.String r2 = " could not be retrieved."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0101:
            return r14
        L_0x0102:
            android.content.res.Resources$NotFoundException r1 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Resource \""
            r2.<init>(r3)
            java.lang.String r3 = r8.getResourceName(r10)
            r2.append(r3)
            java.lang.String r3 = "\" ("
            r2.append(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r17)
            r2.append(r3)
            java.lang.String r3 = ") is not a Font: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.l.b(android.content.Context, int, android.util.TypedValue, int, l0.b, boolean, boolean):android.graphics.Typeface");
    }
}
