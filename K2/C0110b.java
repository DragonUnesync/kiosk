package K2;

import B2.h;
import B2.i;
import B2.l;
import E2.g;

/* renamed from: K2.b  reason: case insensitive filesystem */
public final class C0110b implements l {

    /* renamed from: V  reason: collision with root package name */
    public static final h f2601V = h.a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");

    /* renamed from: W  reason: collision with root package name */
    public static final h f2602W = new h("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", (Object) null, h.e);

    /* renamed from: U  reason: collision with root package name */
    public final g f2603U;

    public C0110b(g gVar) {
        this.f2603U = gVar;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c0 A[SYNTHETIC, Splitter:B:42:0x00c0] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e(java.lang.Object r9, java.io.File r10, B2.i r11) {
        /*
            r8 = this;
            D2.D r9 = (D2.D) r9
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r9 = r9.get()
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            B2.h r1 = f2602W
            java.lang.Object r2 = r11.c(r1)
            android.graphics.Bitmap$CompressFormat r2 = (android.graphics.Bitmap.CompressFormat) r2
            if (r2 == 0) goto L_0x0015
            goto L_0x0020
        L_0x0015:
            boolean r2 = r9.hasAlpha()
            if (r2 == 0) goto L_0x001e
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG
            goto L_0x0020
        L_0x001e:
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG
        L_0x0020:
            r9.getWidth()
            r9.getHeight()
            int r3 = W2.h.f6165b
            long r3 = android.os.SystemClock.elapsedRealtimeNanos()
            B2.h r5 = f2601V
            java.lang.Object r5 = r11.c(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r6 = 0
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0062 }
            r7.<init>(r10)     // Catch:{ IOException -> 0x0062 }
            E2.g r10 = r8.f2603U
            if (r10 == 0) goto L_0x0051
            com.bumptech.glide.load.data.c r6 = new com.bumptech.glide.load.data.c     // Catch:{ IOException -> 0x004f, all -> 0x004d }
            r6.<init>(r7, r10)     // Catch:{ IOException -> 0x004f, all -> 0x004d }
            goto L_0x0052
        L_0x0048:
            r6 = r7
            goto L_0x00be
        L_0x004b:
            r6 = r7
            goto L_0x0063
        L_0x004d:
            r9 = move-exception
            goto L_0x0048
        L_0x004f:
            r10 = move-exception
            goto L_0x004b
        L_0x0051:
            r6 = r7
        L_0x0052:
            r9.compress(r2, r5, r6)     // Catch:{ IOException -> 0x0062 }
            r6.close()     // Catch:{ IOException -> 0x0062 }
            r6.close()     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            goto L_0x005e
        L_0x005c:
            r9 = move-exception
            goto L_0x00c4
        L_0x005e:
            r10 = 1
            goto L_0x0075
        L_0x0060:
            r9 = move-exception
            goto L_0x00be
        L_0x0062:
            r10 = move-exception
        L_0x0063:
            r5 = 3
            boolean r5 = android.util.Log.isLoggable(r0, r5)     // Catch:{ all -> 0x0060 }
            if (r5 == 0) goto L_0x006f
            java.lang.String r5 = "Failed to encode Bitmap"
            android.util.Log.d(r0, r5, r10)     // Catch:{ all -> 0x0060 }
        L_0x006f:
            if (r6 == 0) goto L_0x0074
            r6.close()     // Catch:{ IOException -> 0x0074, all -> 0x005c }
        L_0x0074:
            r10 = 0
        L_0x0075:
            r5 = 2
            boolean r5 = android.util.Log.isLoggable(r0, r5)
            if (r5 == 0) goto L_0x00bd
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Compressed with type: "
            r5.<init>(r6)
            r5.append(r2)
            java.lang.String r2 = " of size "
            r5.append(r2)
            int r2 = W2.m.c(r9)
            r5.append(r2)
            java.lang.String r2 = " in "
            r5.append(r2)
            double r2 = W2.h.a(r3)
            r5.append(r2)
            java.lang.String r2 = ", options format: "
            r5.append(r2)
            java.lang.Object r11 = r11.c(r1)
            r5.append(r11)
            java.lang.String r11 = ", hasAlpha: "
            r5.append(r11)
            boolean r9 = r9.hasAlpha()
            r5.append(r9)
            java.lang.String r9 = r5.toString()
            android.util.Log.v(r0, r9)
        L_0x00bd:
            return r10
        L_0x00be:
            if (r6 == 0) goto L_0x00c5
            r6.close()     // Catch:{ IOException -> 0x00c5, all -> 0x005c }
            goto L_0x00c5
        L_0x00c4:
            throw r9
        L_0x00c5:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.C0110b.e(java.lang.Object, java.io.File, B2.i):boolean");
    }

    public final int q(i iVar) {
        return 2;
    }
}
