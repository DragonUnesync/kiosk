package K2;

import B2.h;
import B2.k;
import E2.b;
import K1.i;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.List;

public final class D implements k {

    /* renamed from: d  reason: collision with root package name */
    public static final h f2592d = new h("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new j(2));
    public static final h e = new h("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new j(3));

    /* renamed from: f  reason: collision with root package name */
    public static final i f2593f = new i(4);

    /* renamed from: g  reason: collision with root package name */
    public static final List f2594g = DesugarCollections.unmodifiableList(Arrays.asList(new String[]{"TP1A", "TD1A.220804.031"}));

    /* renamed from: a  reason: collision with root package name */
    public final i f2595a;

    /* renamed from: b  reason: collision with root package name */
    public final b f2596b;

    /* renamed from: c  reason: collision with root package name */
    public final i f2597c = f2593f;

    public D(b bVar, i iVar) {
        this.f2596b = bVar;
        this.f2595a = iVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final D2.D a(java.lang.Object r18, int r19, int r20, B2.i r21) {
        /*
            r17 = this;
            r10 = r17
            r0 = r21
            B2.h r1 = f2592d
            java.lang.Object r1 = r0.c(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r4 = r1.longValue()
            r1 = 0
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r3 >= 0) goto L_0x0029
            r1 = -1
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x001d
            goto L_0x0029
        L_0x001d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Requested frame must be non-negative, or DEFAULT_FRAME, given: "
            java.lang.String r1 = N.e.w(r1, r4)
            r0.<init>(r1)
            throw r0
        L_0x0029:
            B2.h r1 = e
            java.lang.Object r1 = r0.c(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 != 0) goto L_0x0038
            r1 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L_0x0038:
            B2.h r2 = K2.n.f2623g
            java.lang.Object r0 = r0.c(r2)
            K2.n r0 = (K2.n) r0
            if (r0 != 0) goto L_0x0044
            K2.n r0 = K2.n.f2622f
        L_0x0044:
            r9 = r0
            K1.i r0 = r10.f2597c
            r0.getClass()
            android.media.MediaMetadataRetriever r8 = new android.media.MediaMetadataRetriever
            r8.<init>()
            r7 = 29
            K1.i r0 = r10.f2595a     // Catch:{ all -> 0x00ad }
            int r0 = r0.f2568U     // Catch:{ all -> 0x00ad }
            switch(r0) {
                case 2: goto L_0x0071;
                case 3: goto L_0x0064;
                default: goto L_0x0058;
            }     // Catch:{ all -> 0x00ad }
        L_0x0058:
            r0 = r18
            android.os.ParcelFileDescriptor r0 = (android.os.ParcelFileDescriptor) r0     // Catch:{ all -> 0x00ad }
            java.io.FileDescriptor r0 = r0.getFileDescriptor()     // Catch:{ all -> 0x00ad }
            r8.setDataSource(r0)     // Catch:{ all -> 0x00ad }
            goto L_0x0085
        L_0x0064:
            r0 = r18
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0     // Catch:{ all -> 0x00ad }
            K2.C r2 = new K2.C     // Catch:{ all -> 0x00ad }
            r2.<init>(r0)     // Catch:{ all -> 0x00ad }
            r8.setDataSource(r2)     // Catch:{ all -> 0x00ad }
            goto L_0x0085
        L_0x0071:
            r0 = r18
            android.content.res.AssetFileDescriptor r0 = (android.content.res.AssetFileDescriptor) r0     // Catch:{ all -> 0x00ad }
            java.io.FileDescriptor r12 = r0.getFileDescriptor()     // Catch:{ all -> 0x00ad }
            long r13 = r0.getStartOffset()     // Catch:{ all -> 0x00ad }
            long r15 = r0.getLength()     // Catch:{ all -> 0x00ad }
            r11 = r8
            r11.setDataSource(r12, r13, r15)     // Catch:{ all -> 0x00ad }
        L_0x0085:
            int r6 = r1.intValue()     // Catch:{ all -> 0x00ad }
            r1 = r17
            r2 = r18
            r3 = r8
            r11 = 29
            r7 = r19
            r12 = r8
            r8 = r20
            android.graphics.Bitmap r0 = r1.c(r2, r3, r4, r6, r7, r8, r9)     // Catch:{ all -> 0x00ab }
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r11) goto L_0x00a1
            r12.release()
            goto L_0x00a4
        L_0x00a1:
            r12.release()
        L_0x00a4:
            E2.b r1 = r10.f2596b
            K2.d r0 = K2.C0112d.b(r1, r0)
            return r0
        L_0x00ab:
            r0 = move-exception
            goto L_0x00b1
        L_0x00ad:
            r0 = move-exception
            r12 = r8
            r11 = 29
        L_0x00b1:
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r11) goto L_0x00b9
            r12.release()
            goto L_0x00bc
        L_0x00b9:
            r12.release()
        L_0x00bc:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.D.a(java.lang.Object, int, int, B2.i):D2.D");
    }

    public final boolean b(Object obj, B2.i iVar) {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a4, code lost:
        if (r4 == null) goto L_0x00ad;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009c A[Catch:{ all -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01c6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap c(java.lang.Object r19, android.media.MediaMetadataRetriever r20, long r21, int r23, int r24, int r25, K2.n r26) {
        /*
            r18 = this;
            r7 = r20
            r1 = r24
            r2 = r25
            r3 = r26
            java.lang.String r0 = android.os.Build.DEVICE
            r8 = 3
            r9 = 0
            java.lang.String r10 = "VideoDecoder"
            if (r0 == 0) goto L_0x0026
            java.lang.String r4 = ".+_cheets|cheets_.+"
            boolean r0 = r0.matches(r4)
            if (r0 == 0) goto L_0x0026
            r0 = 12
            java.lang.String r0 = r7.extractMetadata(r0)     // Catch:{ all -> 0x0092 }
            java.lang.String r4 = "video/webm"
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x0092 }
            if (r0 != 0) goto L_0x002a
        L_0x0026:
            r6 = r18
            goto L_0x00ad
        L_0x002a:
            android.media.MediaExtractor r4 = new android.media.MediaExtractor     // Catch:{ all -> 0x0092 }
            r4.<init>()     // Catch:{ all -> 0x0092 }
            r6 = r18
            K1.i r0 = r6.f2595a     // Catch:{ all -> 0x008c }
            int r0 = r0.f2568U     // Catch:{ all -> 0x008c }
            switch(r0) {
                case 2: goto L_0x0051;
                case 3: goto L_0x0044;
                default: goto L_0x0038;
            }     // Catch:{ all -> 0x008c }
        L_0x0038:
            r0 = r19
            android.os.ParcelFileDescriptor r0 = (android.os.ParcelFileDescriptor) r0     // Catch:{ all -> 0x008c }
            java.io.FileDescriptor r0 = r0.getFileDescriptor()     // Catch:{ all -> 0x008c }
            r4.setDataSource(r0)     // Catch:{ all -> 0x008c }
            goto L_0x0065
        L_0x0044:
            r0 = r19
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0     // Catch:{ all -> 0x008c }
            K2.C r5 = new K2.C     // Catch:{ all -> 0x008c }
            r5.<init>(r0)     // Catch:{ all -> 0x008c }
            r4.setDataSource(r5)     // Catch:{ all -> 0x008c }
            goto L_0x0065
        L_0x0051:
            r0 = r19
            android.content.res.AssetFileDescriptor r0 = (android.content.res.AssetFileDescriptor) r0     // Catch:{ all -> 0x008c }
            java.io.FileDescriptor r12 = r0.getFileDescriptor()     // Catch:{ all -> 0x008c }
            long r13 = r0.getStartOffset()     // Catch:{ all -> 0x008c }
            long r15 = r0.getLength()     // Catch:{ all -> 0x008c }
            r11 = r4
            r11.setDataSource(r12, r13, r15)     // Catch:{ all -> 0x008c }
        L_0x0065:
            int r0 = r4.getTrackCount()     // Catch:{ all -> 0x008c }
            r5 = 0
        L_0x006a:
            if (r5 >= r0) goto L_0x008e
            android.media.MediaFormat r11 = r4.getTrackFormat(r5)     // Catch:{ all -> 0x008c }
            java.lang.String r12 = "mime"
            java.lang.String r11 = r11.getString(r12)     // Catch:{ all -> 0x008c }
            java.lang.String r12 = "video/x-vnd.on2.vp8"
            boolean r11 = r12.equals(r11)     // Catch:{ all -> 0x008c }
            if (r11 != 0) goto L_0x0081
            int r5 = r5 + 1
            goto L_0x006a
        L_0x0081:
            r4.release()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot decode VP8 video on CrOS."
            r0.<init>(r1)
            throw r0
        L_0x008c:
            r0 = move-exception
            goto L_0x0096
        L_0x008e:
            r4.release()
            goto L_0x00ad
        L_0x0092:
            r0 = move-exception
            r6 = r18
            r4 = r9
        L_0x0096:
            boolean r5 = android.util.Log.isLoggable(r10, r8)     // Catch:{ all -> 0x00a2 }
            if (r5 == 0) goto L_0x00a4
            java.lang.String r5 = "Exception trying to extract track info for a webm video on CrOS."
            android.util.Log.d(r10, r5, r0)     // Catch:{ all -> 0x00a2 }
            goto L_0x00a4
        L_0x00a2:
            r0 = move-exception
            goto L_0x00a7
        L_0x00a4:
            if (r4 == 0) goto L_0x00ad
            goto L_0x008e
        L_0x00a7:
            if (r4 == 0) goto L_0x00ac
            r4.release()
        L_0x00ac:
            throw r0
        L_0x00ad:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 27
            r11 = 24
            if (r0 < r4) goto L_0x0112
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r0) goto L_0x0112
            if (r2 == r0) goto L_0x0112
            K2.n r0 = K2.n.e
            if (r3 == r0) goto L_0x0112
            r0 = 18
            java.lang.String r0 = r7.extractMetadata(r0)     // Catch:{ all -> 0x0106 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x0106 }
            r4 = 19
            java.lang.String r4 = r7.extractMetadata(r4)     // Catch:{ all -> 0x0106 }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ all -> 0x0106 }
            java.lang.String r5 = r7.extractMetadata(r11)     // Catch:{ all -> 0x0106 }
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ all -> 0x0106 }
            r12 = 90
            if (r5 == r12) goto L_0x00e3
            r12 = 270(0x10e, float:3.78E-43)
            if (r5 != r12) goto L_0x00e8
        L_0x00e3:
            r17 = r4
            r4 = r0
            r0 = r17
        L_0x00e8:
            float r1 = r3.b(r0, r4, r1, r2)     // Catch:{ all -> 0x0106 }
            float r0 = (float) r0     // Catch:{ all -> 0x0106 }
            float r0 = r0 * r1
            int r5 = java.lang.Math.round(r0)     // Catch:{ all -> 0x0106 }
            float r0 = (float) r4     // Catch:{ all -> 0x0106 }
            float r1 = r1 * r0
            int r0 = java.lang.Math.round(r1)     // Catch:{ all -> 0x0106 }
            r1 = r20
            r2 = r21
            r4 = r23
            r6 = r0
            android.graphics.Bitmap r9 = r1.getScaledFrameAtTime(r2, r4, r5, r6)     // Catch:{ all -> 0x0106 }
            goto L_0x0112
        L_0x0106:
            r0 = move-exception
            boolean r1 = android.util.Log.isLoggable(r10, r8)
            if (r1 == 0) goto L_0x0112
            java.lang.String r1 = "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame"
            android.util.Log.d(r10, r1, r0)
        L_0x0112:
            if (r9 != 0) goto L_0x0118
            android.graphics.Bitmap r9 = r20.getFrameAtTime(r21, r23)
        L_0x0118:
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = "Pixel"
            boolean r0 = r0.startsWith(r1)
            r1 = 33
            if (r0 == 0) goto L_0x0143
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 != r1) goto L_0x0143
            java.util.List r0 = f2594g
            java.util.Iterator r0 = r0.iterator()
        L_0x012e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01c4
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = android.os.Build.ID
            boolean r1 = r2.startsWith(r1)
            if (r1 == 0) goto L_0x012e
            goto L_0x014b
        L_0x0143:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r0 < r2) goto L_0x01c4
            if (r0 >= r1) goto L_0x01c4
        L_0x014b:
            r0 = 36
            java.lang.String r0 = r7.extractMetadata(r0)     // Catch:{ NumberFormatException -> 0x01b8 }
            r1 = 35
            java.lang.String r1 = r7.extractMetadata(r1)     // Catch:{ NumberFormatException -> 0x01b8 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x01b8 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x01b8 }
            r2 = 7
            r3 = 6
            if (r0 == r2) goto L_0x0165
            if (r0 != r3) goto L_0x01c4
        L_0x0165:
            if (r1 != r3) goto L_0x01c4
            java.lang.String r0 = r7.extractMetadata(r11)     // Catch:{ NumberFormatException -> 0x01b8 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x01b8 }
            int r0 = java.lang.Math.abs(r0)     // Catch:{ NumberFormatException -> 0x01b8 }
            r1 = 180(0xb4, float:2.52E-43)
            if (r0 != r1) goto L_0x01c4
            boolean r0 = android.util.Log.isLoggable(r10, r8)
            if (r0 == 0) goto L_0x0182
            java.lang.String r0 = "Applying HDR 180 deg thumbnail correction"
            android.util.Log.d(r10, r0)
        L_0x0182:
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            int r1 = r9.getWidth()
            float r1 = (float) r1
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            int r3 = r9.getHeight()
            float r3 = (float) r3
            float r3 = r3 / r2
            r2 = 1127481344(0x43340000, float:180.0)
            r0.postRotate(r2, r1, r3)
            int r1 = r9.getWidth()
            int r2 = r9.getHeight()
            r3 = 0
            r4 = 1
            r5 = 0
            r19 = r9
            r20 = r5
            r21 = r3
            r22 = r1
            r23 = r2
            r24 = r0
            r25 = r4
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r19, r20, r21, r22, r23, r24, r25)
            goto L_0x01c4
        L_0x01b8:
            boolean r0 = android.util.Log.isLoggable(r10, r8)
            if (r0 == 0) goto L_0x01c4
            java.lang.String r0 = "Exception trying to extract HDR transfer function or rotation"
            android.util.Log.d(r10, r0)
        L_0x01c4:
            if (r9 == 0) goto L_0x01c7
            return r9
        L_0x01c7:
            C6.b r0 = new C6.b
            java.lang.String r1 = "MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details"
            r2 = 2
            r0.<init>((java.lang.String) r1, (int) r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.D.c(java.lang.Object, android.media.MediaMetadataRetriever, long, int, int, int, K2.n):android.graphics.Bitmap");
    }
}
