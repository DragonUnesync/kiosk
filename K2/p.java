package K2;

import B.q0;
import B2.a;
import B2.h;
import B2.j;
import E2.b;
import E2.g;
import K1.i;
import W2.f;
import W2.m;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public final class p {

    /* renamed from: f  reason: collision with root package name */
    public static final h f2626f = h.a(a.f380W, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");

    /* renamed from: g  reason: collision with root package name */
    public static final h f2627g = new h("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", (Object) null, h.e);

    /* renamed from: h  reason: collision with root package name */
    public static final h f2628h;
    public static final h i;

    /* renamed from: j  reason: collision with root package name */
    public static final Set f2629j = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"image/vnd.wap.wbmp", "image/x-ico"})));

    /* renamed from: k  reason: collision with root package name */
    public static final i f2630k = new i(1);

    /* renamed from: l  reason: collision with root package name */
    public static final ArrayDeque f2631l = new ArrayDeque(0);

    /* renamed from: a  reason: collision with root package name */
    public final b f2632a;

    /* renamed from: b  reason: collision with root package name */
    public final DisplayMetrics f2633b;

    /* renamed from: c  reason: collision with root package name */
    public final g f2634c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f2635d;
    public final v e = v.a();

    static {
        n nVar = n.f2619b;
        Boolean bool = Boolean.FALSE;
        f2628h = h.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        i = h.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        DesugarCollections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        char[] cArr = m.f6173a;
    }

    public p(ArrayList arrayList, DisplayMetrics displayMetrics, b bVar, g gVar) {
        this.f2635d = arrayList;
        f.c(displayMetrics, "Argument must not be null");
        this.f2633b = displayMetrics;
        f.c(bVar, "Argument must not be null");
        this.f2632a = bVar;
        f.c(gVar, "Argument must not be null");
        this.f2634c = gVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:30|31) */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        throw r5;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x007c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap c(B.q0 r9, android.graphics.BitmapFactory.Options r10, K2.o r11, E2.b r12) {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r10.inJustDecodeBounds
            if (r1 != 0) goto L_0x0022
            r11.s()
            int r1 = r9.f299U
            switch(r1) {
                case 7: goto L_0x0022;
                case 8: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0022
        L_0x000f:
            java.lang.Object r1 = r9.f300V
            com.bumptech.glide.load.data.h r1 = (com.bumptech.glide.load.data.h) r1
            java.lang.Object r1 = r1.f9037V
            K2.w r1 = (K2.w) r1
            monitor-enter(r1)
            byte[] r2 = r1.f2647U     // Catch:{ all -> 0x001f }
            int r2 = r2.length     // Catch:{ all -> 0x001f }
            r1.f2649W = r2     // Catch:{ all -> 0x001f }
            monitor-exit(r1)
            goto L_0x0022
        L_0x001f:
            r9 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001f }
            throw r9
        L_0x0022:
            int r1 = r10.outWidth
            int r2 = r10.outHeight
            java.lang.String r3 = r10.outMimeType
            java.util.concurrent.locks.Lock r4 = K2.y.f2654b
            r4.lock()
            android.graphics.Bitmap r9 = r9.m(r10)     // Catch:{ IllegalArgumentException -> 0x0037 }
            r4.unlock()
            return r9
        L_0x0035:
            r9 = move-exception
            goto L_0x007e
        L_0x0037:
            r4 = move-exception
            java.io.IOException r5 = new java.io.IOException     // Catch:{ all -> 0x0035 }
            java.lang.String r6 = "Exception decoding bitmap, outWidth: "
            java.lang.String r7 = ", outHeight: "
            java.lang.String r8 = ", outMimeType: "
            java.lang.StringBuilder r1 = u.C1477r.e(r6, r1, r7, r2, r8)     // Catch:{ all -> 0x0035 }
            r1.append(r3)     // Catch:{ all -> 0x0035 }
            java.lang.String r2 = ", inBitmap: "
            r1.append(r2)     // Catch:{ all -> 0x0035 }
            android.graphics.Bitmap r2 = r10.inBitmap     // Catch:{ all -> 0x0035 }
            java.lang.String r2 = d(r2)     // Catch:{ all -> 0x0035 }
            r1.append(r2)     // Catch:{ all -> 0x0035 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0035 }
            r5.<init>(r1, r4)     // Catch:{ all -> 0x0035 }
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0068
            java.lang.String r1 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r1, r5)     // Catch:{ all -> 0x0035 }
        L_0x0068:
            android.graphics.Bitmap r0 = r10.inBitmap     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x007d
            r12.h(r0)     // Catch:{ IOException -> 0x007c }
            r0 = 0
            r10.inBitmap = r0     // Catch:{ IOException -> 0x007c }
            android.graphics.Bitmap r9 = c(r9, r10, r11, r12)     // Catch:{ IOException -> 0x007c }
            java.util.concurrent.locks.Lock r10 = K2.y.f2654b
            r10.unlock()
            return r9
        L_0x007c:
            throw r5     // Catch:{ all -> 0x0035 }
        L_0x007d:
            throw r5     // Catch:{ all -> 0x0035 }
        L_0x007e:
            java.util.concurrent.locks.Lock r10 = K2.y.f2654b
            r10.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.p.c(B.q0, android.graphics.BitmapFactory$Options, K2.o, E2.b):android.graphics.Bitmap");
    }

    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static void e(BitmapFactory.Options options) {
        f(options);
        ArrayDeque arrayDeque = f2631l;
        synchronized (arrayDeque) {
            arrayDeque.offer(options);
        }
    }

    public static void f(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final C0112d a(q0 q0Var, int i8, int i9, B2.i iVar, o oVar) {
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        boolean z;
        B2.i iVar2 = iVar;
        byte[] bArr = (byte[]) this.f2634c.d(byte[].class, 65536);
        synchronized (p.class) {
            ArrayDeque arrayDeque = f2631l;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                f(options);
            }
            options2 = options;
        }
        options2.inTempStorage = bArr;
        a aVar = (a) iVar2.c(f2626f);
        j jVar = (j) iVar2.c(f2627g);
        n nVar = (n) iVar2.c(n.f2623g);
        boolean booleanValue = ((Boolean) iVar2.c(f2628h)).booleanValue();
        h hVar = i;
        if (iVar2.c(hVar) == null || !((Boolean) iVar2.c(hVar)).booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        try {
            return C0112d.b(this.f2632a, b(q0Var, options2, nVar, aVar, jVar, z, i8, i9, booleanValue, oVar));
        } finally {
            e(options2);
            this.f2634c.h(bArr);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02a6  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02a8  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02ce  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x03a3  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x043c  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0442  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x046e  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x04ad  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x04bb  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x04c9  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x04cc  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x04d8  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0526  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x05ac  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0648 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap b(B.q0 r40, android.graphics.BitmapFactory.Options r41, K2.n r42, B2.a r43, B2.j r44, boolean r45, int r46, int r47, boolean r48, K2.o r49) {
        /*
            r39 = this;
            r1 = r39
            r2 = r40
            r3 = r41
            r0 = r42
            r4 = r43
            r5 = r44
            r6 = r46
            r7 = r47
            r8 = r49
            r12 = 0
            r13 = 1
            int r14 = W2.h.f6165b
            long r14 = android.os.SystemClock.elapsedRealtimeNanos()
            r3.inJustDecodeBounds = r13
            E2.b r10 = r1.f2632a
            c(r2, r3, r8, r10)
            r3.inJustDecodeBounds = r12
            int r9 = r3.outWidth
            int r11 = r3.outHeight
            int[] r9 = new int[]{r9, r11}
            r11 = r9[r12]
            r9 = r9[r13]
            java.lang.String r12 = r3.outMimeType
            r13 = -1
            if (r11 == r13) goto L_0x003c
            if (r9 != r13) goto L_0x0037
            goto L_0x003c
        L_0x0037:
            r13 = r45
            r19 = r14
            goto L_0x003f
        L_0x003c:
            r19 = r14
            r13 = 0
        L_0x003f:
            int r14 = r2.f299U
            switch(r14) {
                case 7: goto L_0x00c1;
                case 8: goto L_0x00a5;
                default: goto L_0x0044;
            }
        L_0x0044:
            java.lang.Object r14 = r2.f302X
            com.bumptech.glide.load.data.h r14 = (com.bumptech.glide.load.data.h) r14
            java.lang.Object r15 = r2.f300V
            E2.g r15 = (E2.g) r15
            r21 = r12
            java.lang.Object r12 = r2.f301W
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            int r5 = r12.size()
            r4 = 0
        L_0x0057:
            if (r4 >= r5) goto L_0x00a1
            java.lang.Object r22 = r12.get(r4)
            r45 = r5
            r5 = r22
            B2.e r5 = (B2.e) r5
            r22 = r12
            K2.w r12 = new K2.w     // Catch:{ all -> 0x0096 }
            r23 = r13
            java.io.FileInputStream r13 = new java.io.FileInputStream     // Catch:{ all -> 0x0096 }
            android.os.ParcelFileDescriptor r24 = r14.e()     // Catch:{ all -> 0x0096 }
            java.io.FileDescriptor r1 = r24.getFileDescriptor()     // Catch:{ all -> 0x0096 }
            r13.<init>(r1)     // Catch:{ all -> 0x0096 }
            r12.<init>(r13, r15)     // Catch:{ all -> 0x0096 }
            int r1 = r5.c(r12, r15)     // Catch:{ all -> 0x0093 }
            r12.l()
            r14.e()
            r5 = -1
            if (r1 == r5) goto L_0x0088
            goto L_0x0105
        L_0x0088:
            r1 = 1
            int r4 = r4 + r1
            r1 = r39
            r5 = r45
            r12 = r22
            r13 = r23
            goto L_0x0057
        L_0x0093:
            r0 = move-exception
            r10 = r12
            goto L_0x0098
        L_0x0096:
            r0 = move-exception
            r10 = 0
        L_0x0098:
            if (r10 == 0) goto L_0x009d
            r10.l()
        L_0x009d:
            r14.e()
            throw r0
        L_0x00a1:
            r23 = r13
            r1 = -1
            goto L_0x0105
        L_0x00a5:
            r21 = r12
            r23 = r13
            java.lang.Object r1 = r2.f300V
            com.bumptech.glide.load.data.h r1 = (com.bumptech.glide.load.data.h) r1
            java.lang.Object r1 = r1.f9037V
            K2.w r1 = (K2.w) r1
            r1.reset()
            java.lang.Object r4 = r2.f302X
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.lang.Object r5 = r2.f301W
            E2.g r5 = (E2.g) r5
            int r1 = N7.a.j(r4, r1, r5)
            goto L_0x0105
        L_0x00c1:
            r21 = r12
            r23 = r13
            java.lang.Object r1 = r2.f300V
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            java.nio.ByteBuffer r1 = W2.b.c(r1)
            java.lang.Object r4 = r2.f302X
            E2.g r4 = (E2.g) r4
            if (r1 != 0) goto L_0x00d5
        L_0x00d3:
            r14 = -1
            goto L_0x0104
        L_0x00d5:
            java.lang.Object r5 = r2.f301W
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r12 = r5.size()
            r13 = 0
        L_0x00de:
            if (r13 >= r12) goto L_0x0102
            java.lang.Object r14 = r5.get(r13)
            B2.e r14 = (B2.e) r14
            int r14 = r14.b(r1, r4)     // Catch:{ all -> 0x00f8 }
            r15 = 0
            java.nio.Buffer r18 = r1.position(r15)
            java.nio.ByteBuffer r18 = (java.nio.ByteBuffer) r18
            r15 = -1
            if (r14 == r15) goto L_0x00f5
            goto L_0x0104
        L_0x00f5:
            r14 = 1
            int r13 = r13 + r14
            goto L_0x00de
        L_0x00f8:
            r0 = move-exception
            r2 = r0
            r3 = 0
            java.nio.Buffer r0 = r1.position(r3)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            throw r2
        L_0x0102:
            r15 = -1
            goto L_0x00d3
        L_0x0104:
            r1 = r14
        L_0x0105:
            r4 = 90
            r5 = 270(0x10e, float:3.78E-43)
            switch(r1) {
                case 3: goto L_0x0114;
                case 4: goto L_0x0114;
                case 5: goto L_0x0111;
                case 6: goto L_0x0111;
                case 7: goto L_0x010e;
                case 8: goto L_0x010e;
                default: goto L_0x010c;
            }
        L_0x010c:
            r15 = 0
            goto L_0x0118
        L_0x010e:
            r15 = 270(0x10e, float:3.78E-43)
            goto L_0x0118
        L_0x0111:
            r15 = 90
            goto L_0x0118
        L_0x0114:
            r12 = 180(0xb4, float:2.52E-43)
            r15 = 180(0xb4, float:2.52E-43)
        L_0x0118:
            switch(r1) {
                case 2: goto L_0x011d;
                case 3: goto L_0x011d;
                case 4: goto L_0x011d;
                case 5: goto L_0x011d;
                case 6: goto L_0x011d;
                case 7: goto L_0x011d;
                case 8: goto L_0x011d;
                default: goto L_0x011b;
            }
        L_0x011b:
            r12 = 0
            goto L_0x011e
        L_0x011d:
            r12 = 1
        L_0x011e:
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 != r13) goto L_0x012b
            if (r15 == r4) goto L_0x0129
            if (r15 != r5) goto L_0x0127
            goto L_0x0129
        L_0x0127:
            r14 = r11
            goto L_0x012c
        L_0x0129:
            r14 = r9
            goto L_0x012c
        L_0x012b:
            r14 = r6
        L_0x012c:
            if (r7 != r13) goto L_0x0137
            if (r15 == r4) goto L_0x0135
            if (r15 != r5) goto L_0x0133
            goto L_0x0135
        L_0x0133:
            r13 = r9
            goto L_0x0138
        L_0x0135:
            r13 = r11
            goto L_0x0138
        L_0x0137:
            r13 = r7
        L_0x0138:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = r40.r()
            java.lang.String r4 = ", target density: "
            r24 = r1
            java.lang.String r1 = ", density: "
            java.lang.String r7 = "x"
            java.lang.String r6 = "Downsampler"
            r26 = r12
            java.lang.String r12 = "]"
            if (r11 <= 0) goto L_0x038e
            if (r9 > 0) goto L_0x015f
            r15 = r7
            r0 = r12
            r7 = r13
            r8 = 3
            r37 = r4
            r4 = r1
            r1 = r37
            r38 = r14
            r14 = r9
            r9 = r11
            r11 = r38
            goto L_0x039d
        L_0x015f:
            r17 = r12
            r12 = 90
            if (r15 == r12) goto L_0x0171
            r12 = 270(0x10e, float:3.78E-43)
            if (r15 != r12) goto L_0x016a
            goto L_0x0171
        L_0x016a:
            r45 = r1
            r27 = r4
            r1 = r9
            r12 = r11
            goto L_0x0177
        L_0x0171:
            r45 = r1
            r27 = r4
            r12 = r9
            r1 = r11
        L_0x0177:
            float r4 = r0.b(r12, r1, r14, r13)
            r25 = 0
            int r28 = (r4 > r25 ? 1 : (r4 == r25 ? 0 : -1))
            if (r28 <= 0) goto L_0x0349
            r28 = r15
            int r15 = r0.a(r12, r1, r14, r13)
            if (r15 == 0) goto L_0x0341
            r29 = r7
            float r7 = (float) r12
            r30 = r9
            float r9 = r4 * r7
            r32 = r13
            r31 = r14
            double r13 = (double) r9
            r33 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r13 = r13 + r33
            int r9 = (int) r13
            float r13 = (float) r1
            float r14 = r4 * r13
            r35 = r10
            r36 = r11
            double r10 = (double) r14
            double r10 = r10 + r33
            int r10 = (int) r10
            int r9 = r12 / r9
            int r10 = r1 / r10
            r11 = 1
            if (r15 != r11) goto L_0x01b1
            int r9 = java.lang.Math.max(r9, r10)
            goto L_0x01b5
        L_0x01b1:
            int r9 = java.lang.Math.min(r9, r10)
        L_0x01b5:
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 23
            if (r10 > r11) goto L_0x01c7
            java.util.Set r11 = f2629j
            java.lang.String r14 = r3.outMimeType
            boolean r11 = r11.contains(r14)
            if (r11 == 0) goto L_0x01c7
            r9 = 1
            goto L_0x01dc
        L_0x01c7:
            int r9 = java.lang.Integer.highestOneBit(r9)
            r11 = 1
            int r9 = java.lang.Math.max(r11, r9)
            if (r15 != r11) goto L_0x01dc
            float r14 = (float) r9
            r15 = 1065353216(0x3f800000, float:1.0)
            float r17 = r15 / r4
            int r14 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r14 >= 0) goto L_0x01dc
            int r9 = r9 << r11
        L_0x01dc:
            r3.inSampleSize = r9
            com.bumptech.glide.load.ImageHeaderParser$ImageType r11 = com.bumptech.glide.load.ImageHeaderParser$ImageType.JPEG
            if (r5 != r11) goto L_0x0205
            r11 = 8
            int r1 = java.lang.Math.min(r9, r11)
            float r1 = (float) r1
            float r7 = r7 / r1
            double r14 = (double) r7
            double r14 = java.lang.Math.ceil(r14)
            int r5 = (int) r14
            float r13 = r13 / r1
            double r12 = (double) r13
            double r12 = java.lang.Math.ceil(r12)
            int r1 = (int) r12
            int r7 = r9 / 8
            if (r7 <= 0) goto L_0x01fd
            int r5 = r5 / r7
            int r1 = r1 / r7
        L_0x01fd:
            r11 = r31
            r7 = r32
            r10 = r35
            goto L_0x0271
        L_0x0205:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r11 = com.bumptech.glide.load.ImageHeaderParser$ImageType.PNG
            if (r5 == r11) goto L_0x020d
            com.bumptech.glide.load.ImageHeaderParser$ImageType r11 = com.bumptech.glide.load.ImageHeaderParser$ImageType.PNG_A
            if (r5 != r11) goto L_0x0210
        L_0x020d:
            r10 = r35
            goto L_0x0261
        L_0x0210:
            boolean r5 = r5.isWebp()
            if (r5 == 0) goto L_0x0236
            r1 = 24
            if (r10 < r1) goto L_0x0226
            float r1 = (float) r9
            float r7 = r7 / r1
            int r5 = java.lang.Math.round(r7)
            float r13 = r13 / r1
            int r1 = java.lang.Math.round(r13)
            goto L_0x01fd
        L_0x0226:
            float r1 = (float) r9
            float r7 = r7 / r1
            double r10 = (double) r7
            double r10 = java.lang.Math.floor(r10)
            int r5 = (int) r10
            float r13 = r13 / r1
            double r10 = (double) r13
            double r10 = java.lang.Math.floor(r10)
            int r1 = (int) r10
            goto L_0x01fd
        L_0x0236:
            int r5 = r12 % r9
            if (r5 != 0) goto L_0x023e
            int r5 = r1 % r9
            if (r5 == 0) goto L_0x0240
        L_0x023e:
            r1 = 1
            goto L_0x0244
        L_0x0240:
            int r5 = r12 / r9
            int r1 = r1 / r9
            goto L_0x01fd
        L_0x0244:
            r3.inJustDecodeBounds = r1
            r10 = r35
            c(r2, r3, r8, r10)
            r5 = 0
            r3.inJustDecodeBounds = r5
            int r7 = r3.outWidth
            int r11 = r3.outHeight
            int[] r7 = new int[]{r7, r11}
            r11 = r7[r5]
            r5 = r7[r1]
            r1 = r5
            r5 = r11
        L_0x025c:
            r11 = r31
            r7 = r32
            goto L_0x0271
        L_0x0261:
            float r1 = (float) r9
            float r7 = r7 / r1
            double r11 = (double) r7
            double r11 = java.lang.Math.floor(r11)
            int r5 = (int) r11
            float r13 = r13 / r1
            double r11 = (double) r13
            double r11 = java.lang.Math.floor(r11)
            int r1 = (int) r11
            goto L_0x025c
        L_0x0271:
            float r0 = r0.b(r5, r1, r11, r7)
            double r12 = (double) r0
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 > 0) goto L_0x027f
            r16 = r12
            goto L_0x0281
        L_0x027f:
            double r16 = r14 / r12
        L_0x0281:
            r31 = 4746794007244308480(0x41dfffffffc00000, double:2.147483647E9)
            double r16 = r16 * r31
            long r14 = java.lang.Math.round(r16)
            int r15 = (int) r14
            r14 = r9
            double r8 = (double) r15
            double r8 = r8 * r12
            double r8 = r8 + r33
            int r8 = (int) r8
            float r9 = (float) r8
            float r15 = (float) r15
            float r9 = r9 / r15
            r42 = r14
            double r14 = (double) r9
            double r14 = r12 / r14
            double r8 = (double) r8
            double r14 = r14 * r8
            double r14 = r14 + r33
            int r8 = (int) r14
            r3.inTargetDensity = r8
            if (r0 > 0) goto L_0x02a8
            r14 = r12
            goto L_0x02ac
        L_0x02a8:
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r14 = r8 / r12
        L_0x02ac:
            double r14 = r14 * r31
            long r8 = java.lang.Math.round(r14)
            int r0 = (int) r8
            r3.inDensity = r0
            int r8 = r3.inTargetDensity
            if (r8 <= 0) goto L_0x02c2
            if (r0 <= 0) goto L_0x02c2
            if (r8 == r0) goto L_0x02c2
            r8 = 1
            r3.inScaled = r8
        L_0x02c0:
            r8 = 2
            goto L_0x02c8
        L_0x02c2:
            r8 = 0
            r3.inTargetDensity = r8
            r3.inDensity = r8
            goto L_0x02c0
        L_0x02c8:
            boolean r0 = android.util.Log.isLoggable(r6, r8)
            if (r0 == 0) goto L_0x0333
            java.lang.String r0 = "Calculate scaling, source: ["
            java.lang.String r8 = "], degreesToRotate: "
            r15 = r29
            r14 = r30
            r9 = r36
            java.lang.StringBuilder r0 = u.C1477r.e(r0, r9, r15, r14, r8)
            r8 = r28
            r0.append(r8)
            java.lang.String r8 = ", target: ["
            r0.append(r8)
            r0.append(r11)
            r0.append(r15)
            r0.append(r7)
            java.lang.String r8 = "], power of two scaled: ["
            r0.append(r8)
            r0.append(r5)
            r0.append(r15)
            r0.append(r1)
            java.lang.String r1 = "], exact scale factor: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = ", power of 2 sample size: "
            r0.append(r1)
            r1 = r42
            r0.append(r1)
            java.lang.String r1 = ", adjusted scale factor: "
            r0.append(r1)
            r0.append(r12)
            r1 = r27
            r0.append(r1)
            int r4 = r3.inTargetDensity
            r0.append(r4)
            r4 = r45
            r0.append(r4)
            int r5 = r3.inDensity
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r6, r0)
            goto L_0x033d
        L_0x0333:
            r4 = r45
            r1 = r27
            r15 = r29
            r14 = r30
            r9 = r36
        L_0x033d:
            r5 = r39
            goto L_0x03c7
        L_0x0341:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot round with null rounding"
            r0.<init>(r1)
            throw r0
        L_0x0349:
            r15 = r7
            r7 = r13
            r37 = r14
            r14 = r9
            r9 = r11
            r11 = r37
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Cannot scale with factor: "
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r3 = " from: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ", source: ["
            r2.append(r0)
            r2.append(r9)
            r2.append(r15)
            r2.append(r14)
            java.lang.String r0 = "], target: ["
            r2.append(r0)
            r2.append(r11)
            r2.append(r15)
            r2.append(r7)
            r0 = r17
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x038e:
            r15 = r7
            r0 = r12
            r7 = r13
            r37 = r4
            r4 = r1
            r1 = r37
            r38 = r14
            r14 = r9
            r9 = r11
            r11 = r38
            r8 = 3
        L_0x039d:
            boolean r12 = android.util.Log.isLoggable(r6, r8)
            if (r12 == 0) goto L_0x033d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r12 = "Unable to determine dimensions for: "
            r8.<init>(r12)
            r8.append(r5)
            java.lang.String r5 = " with target ["
            r8.append(r5)
            r8.append(r11)
            r8.append(r15)
            r8.append(r7)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            android.util.Log.d(r6, r0)
            goto L_0x033d
        L_0x03c7:
            K2.v r0 = r5.e
            r8 = r23
            r12 = r26
            boolean r0 = r0.c(r11, r7, r8, r12)
            if (r0 == 0) goto L_0x03dd
            android.graphics.Bitmap$Config r8 = android.graphics.Bitmap.Config.HARDWARE
            r3.inPreferredConfig = r8
            r8 = 0
            r3.inMutable = r8
            goto L_0x03de
        L_0x03dd:
            r8 = 0
        L_0x03de:
            if (r0 == 0) goto L_0x03e2
        L_0x03e0:
            r8 = 1
            goto L_0x0421
        L_0x03e2:
            B2.a r0 = B2.a.f378U
            r12 = r43
            if (r12 == r0) goto L_0x041c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = r40.r()     // Catch:{ IOException -> 0x03f1 }
            boolean r0 = r0.hasAlpha()     // Catch:{ IOException -> 0x03f1 }
            goto L_0x040b
        L_0x03f1:
            r0 = move-exception
            r13 = 3
            boolean r13 = android.util.Log.isLoggable(r6, r13)
            if (r13 == 0) goto L_0x040a
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r8 = "Cannot determine whether the image has alpha or not from header, format "
            r13.<init>(r8)
            r13.append(r12)
            java.lang.String r8 = r13.toString()
            android.util.Log.d(r6, r8, r0)
        L_0x040a:
            r0 = 0
        L_0x040b:
            if (r0 == 0) goto L_0x0410
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            goto L_0x0412
        L_0x0410:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565
        L_0x0412:
            r3.inPreferredConfig = r0
            android.graphics.Bitmap$Config r8 = android.graphics.Bitmap.Config.RGB_565
            if (r0 != r8) goto L_0x03e0
            r8 = 1
            r3.inDither = r8
            goto L_0x0421
        L_0x041c:
            r8 = 1
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            r3.inPreferredConfig = r0
        L_0x0421:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r9 < 0) goto L_0x042d
            if (r14 < 0) goto L_0x042d
            if (r48 == 0) goto L_0x042d
            r13 = r7
            r12 = r9
            goto L_0x04b3
        L_0x042d:
            int r7 = r3.inTargetDensity
            if (r7 <= 0) goto L_0x0439
            int r11 = r3.inDensity
            if (r11 <= 0) goto L_0x0439
            if (r7 == r11) goto L_0x0439
            r11 = 1
            goto L_0x043a
        L_0x0439:
            r11 = 0
        L_0x043a:
            if (r11 == 0) goto L_0x0442
            float r7 = (float) r7
            int r11 = r3.inDensity
            float r11 = (float) r11
            float r7 = r7 / r11
            goto L_0x0444
        L_0x0442:
            r7 = 1065353216(0x3f800000, float:1.0)
        L_0x0444:
            int r11 = r3.inSampleSize
            float r12 = (float) r9
            float r13 = (float) r11
            float r12 = r12 / r13
            r36 = r9
            double r8 = (double) r12
            double r8 = java.lang.Math.ceil(r8)
            int r8 = (int) r8
            float r9 = (float) r14
            float r9 = r9 / r13
            double r12 = (double) r9
            double r12 = java.lang.Math.ceil(r12)
            int r9 = (int) r12
            float r8 = (float) r8
            float r8 = r8 * r7
            int r8 = java.lang.Math.round(r8)
            float r9 = (float) r9
            float r9 = r9 * r7
            int r13 = java.lang.Math.round(r9)
            r9 = 2
            boolean r12 = android.util.Log.isLoggable(r6, r9)
            if (r12 == 0) goto L_0x04ad
            java.lang.String r9 = "Calculated target ["
            java.lang.String r12 = "] for source ["
            java.lang.StringBuilder r9 = u.C1477r.e(r9, r8, r15, r13, r12)
            r12 = r36
            r9.append(r12)
            r9.append(r15)
            r9.append(r14)
            r42 = r8
            java.lang.String r8 = "], sampleSize: "
            r9.append(r8)
            r9.append(r11)
            java.lang.String r8 = ", targetDensity: "
            r9.append(r8)
            int r8 = r3.inTargetDensity
            r9.append(r8)
            r9.append(r4)
            int r8 = r3.inDensity
            r9.append(r8)
            java.lang.String r8 = ", density multiplier: "
            r9.append(r8)
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            android.util.Log.v(r6, r7)
            goto L_0x04b1
        L_0x04ad:
            r42 = r8
            r12 = r36
        L_0x04b1:
            r11 = r42
        L_0x04b3:
            r7 = 26
            if (r11 <= 0) goto L_0x04d4
            if (r13 <= 0) goto L_0x04d4
            if (r0 < r7) goto L_0x04c9
            android.graphics.Bitmap$Config r8 = r3.inPreferredConfig
            android.graphics.Bitmap$Config r9 = android.graphics.Bitmap.Config.HARDWARE
            if (r8 != r9) goto L_0x04c4
            goto L_0x04d4
        L_0x04c4:
            android.graphics.Bitmap$Config r8 = r41.outConfig
            goto L_0x04ca
        L_0x04c9:
            r8 = 0
        L_0x04ca:
            if (r8 != 0) goto L_0x04ce
            android.graphics.Bitmap$Config r8 = r3.inPreferredConfig
        L_0x04ce:
            android.graphics.Bitmap r8 = r10.e(r11, r13, r8)
            r3.inBitmap = r8
        L_0x04d4:
            r8 = r44
            if (r8 == 0) goto L_0x0507
            r9 = 28
            if (r0 < r9) goto L_0x050a
            B2.j r0 = B2.j.f389U
            if (r8 != r0) goto L_0x04f3
            android.graphics.ColorSpace r0 = r41.outColorSpace
            if (r0 == 0) goto L_0x04f3
            android.graphics.ColorSpace r0 = r41.outColorSpace
            boolean r0 = r0.isWideGamut()
            if (r0 == 0) goto L_0x04f3
            r18 = 1
            goto L_0x04f5
        L_0x04f3:
            r18 = 0
        L_0x04f5:
            if (r18 == 0) goto L_0x04fc
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.DISPLAY_P3
            goto L_0x0500
        L_0x04fc:
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.SRGB
        L_0x0500:
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            r3.inPreferredColorSpace = r0
        L_0x0507:
            r7 = r49
            goto L_0x0518
        L_0x050a:
            if (r0 < r7) goto L_0x0507
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.SRGB
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            r3.inPreferredColorSpace = r0
            goto L_0x0507
        L_0x0518:
            android.graphics.Bitmap r0 = c(r2, r3, r7, r10)
            r7.r(r10, r0)
            r2 = 2
            boolean r2 = android.util.Log.isLoggable(r6, r2)
            if (r2 == 0) goto L_0x05aa
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r7 = "Decoded "
            r2.<init>(r7)
            java.lang.String r7 = d(r0)
            r2.append(r7)
            java.lang.String r7 = " from ["
            r2.append(r7)
            r2.append(r12)
            r2.append(r15)
            r2.append(r14)
            java.lang.String r7 = "] "
            r2.append(r7)
            r7 = r21
            r2.append(r7)
            java.lang.String r7 = " with inBitmap "
            r2.append(r7)
            android.graphics.Bitmap r7 = r3.inBitmap
            java.lang.String r7 = d(r7)
            r2.append(r7)
            java.lang.String r7 = " for ["
            r2.append(r7)
            r7 = r6
            r6 = r46
            r2.append(r6)
            r2.append(r15)
            r6 = r47
            r2.append(r6)
            java.lang.String r6 = "], sample size: "
            r2.append(r6)
            int r6 = r3.inSampleSize
            r2.append(r6)
            r2.append(r4)
            int r4 = r3.inDensity
            r2.append(r4)
            r2.append(r1)
            int r1 = r3.inTargetDensity
            r2.append(r1)
            java.lang.String r1 = ", thread: "
            r2.append(r1)
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r1 = r1.getName()
            r2.append(r1)
            java.lang.String r1 = ", duration: "
            r2.append(r1)
            double r3 = W2.h.a(r19)
            r2.append(r3)
            java.lang.String r1 = r2.toString()
            android.util.Log.v(r7, r1)
        L_0x05aa:
            if (r0 == 0) goto L_0x0648
            android.util.DisplayMetrics r1 = r5.f2633b
            int r1 = r1.densityDpi
            r0.setDensity(r1)
            switch(r24) {
                case 2: goto L_0x05b9;
                case 3: goto L_0x05b9;
                case 4: goto L_0x05b9;
                case 5: goto L_0x05b9;
                case 6: goto L_0x05b9;
                case 7: goto L_0x05b9;
                case 8: goto L_0x05b9;
                default: goto L_0x05b6;
            }
        L_0x05b6:
            r3 = r0
            goto L_0x063d
        L_0x05b9:
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r2 = 1127481344(0x43340000, float:180.0)
            r3 = 1119092736(0x42b40000, float:90.0)
            r4 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            switch(r24) {
                case 2: goto L_0x05f1;
                case 3: goto L_0x05ed;
                case 4: goto L_0x05e4;
                case 5: goto L_0x05db;
                case 6: goto L_0x05d7;
                case 7: goto L_0x05ce;
                case 8: goto L_0x05ca;
                default: goto L_0x05c9;
            }
        L_0x05c9:
            goto L_0x05f6
        L_0x05ca:
            r1.setRotate(r4)
            goto L_0x05f6
        L_0x05ce:
            r1.setRotate(r4)
            r4 = 1065353216(0x3f800000, float:1.0)
            r1.postScale(r6, r4)
            goto L_0x05f6
        L_0x05d7:
            r1.setRotate(r3)
            goto L_0x05f6
        L_0x05db:
            r4 = 1065353216(0x3f800000, float:1.0)
            r1.setRotate(r3)
            r1.postScale(r6, r4)
            goto L_0x05f6
        L_0x05e4:
            r4 = 1065353216(0x3f800000, float:1.0)
            r1.setRotate(r2)
            r1.postScale(r6, r4)
            goto L_0x05f6
        L_0x05ed:
            r1.setRotate(r2)
            goto L_0x05f6
        L_0x05f1:
            r4 = 1065353216(0x3f800000, float:1.0)
            r1.setScale(r6, r4)
        L_0x05f6:
            android.graphics.RectF r2 = new android.graphics.RectF
            int r3 = r0.getWidth()
            float r3 = (float) r3
            int r4 = r0.getHeight()
            float r4 = (float) r4
            r6 = 0
            r2.<init>(r6, r6, r3, r4)
            r1.mapRect(r2)
            float r3 = r2.width()
            int r3 = java.lang.Math.round(r3)
            float r4 = r2.height()
            int r4 = java.lang.Math.round(r4)
            android.graphics.Bitmap$Config r6 = r0.getConfig()
            if (r6 == 0) goto L_0x0624
            android.graphics.Bitmap$Config r6 = r0.getConfig()
            goto L_0x0626
        L_0x0624:
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888
        L_0x0626:
            android.graphics.Bitmap r3 = r10.g(r3, r4, r6)
            float r4 = r2.left
            float r4 = -r4
            float r2 = r2.top
            float r2 = -r2
            r1.postTranslate(r4, r2)
            boolean r2 = r0.hasAlpha()
            r3.setHasAlpha(r2)
            K2.y.a(r0, r3, r1)
        L_0x063d:
            boolean r1 = r0.equals(r3)
            if (r1 != 0) goto L_0x0646
            r10.h(r0)
        L_0x0646:
            r10 = r3
            goto L_0x0649
        L_0x0648:
            r10 = 0
        L_0x0649:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.p.b(B.q0, android.graphics.BitmapFactory$Options, K2.n, B2.a, B2.j, boolean, int, int, boolean, K2.o):android.graphics.Bitmap");
    }
}
