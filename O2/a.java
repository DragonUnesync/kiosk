package O2;

import A1.d;
import B2.k;
import D2.D;
import E2.b;
import E2.g;
import F2.c;
import K1.i;
import android.content.Context;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import u.C1477r;

public final class a implements k {

    /* renamed from: f  reason: collision with root package name */
    public static final i f3602f = new i(11);

    /* renamed from: g  reason: collision with root package name */
    public static final c f3603g = new c(1);

    /* renamed from: a  reason: collision with root package name */
    public final Context f3604a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f3605b;

    /* renamed from: c  reason: collision with root package name */
    public final c f3606c = f3603g;

    /* renamed from: d  reason: collision with root package name */
    public final i f3607d;
    public final d e;

    public a(Context context, ArrayList arrayList, b bVar, g gVar) {
        i iVar = f3602f;
        this.f3604a = context.getApplicationContext();
        this.f3605b = arrayList;
        this.f3607d = iVar;
        this.e = new d(bVar, 24, gVar);
    }

    public static int d(A2.b bVar, int i, int i8) {
        int i9;
        int min = Math.min(bVar.f51g / i8, bVar.f50f / i);
        if (min == 0) {
            i9 = 0;
        } else {
            i9 = Integer.highestOneBit(min);
        }
        int max = Math.max(1, i9);
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            StringBuilder e8 = C1477r.e("Downsampling GIF, sampleSize: ", max, ", target dimens: [", i, "x");
            e8.append(i8);
            e8.append("], actual dimens: [");
            e8.append(bVar.f50f);
            e8.append("x");
            e8.append(bVar.f51g);
            e8.append("]");
            Log.v("BufferGifDecoder", e8.toString());
        }
        return max;
    }

    public final D a(Object obj, int i, int i8, B2.i iVar) {
        A2.c cVar;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        c cVar2 = this.f3606c;
        synchronized (cVar2) {
            try {
                A2.c cVar3 = (A2.c) cVar2.f1514a.poll();
                if (cVar3 == null) {
                    cVar3 = new A2.c();
                }
                cVar = cVar3;
                cVar.f56b = null;
                Arrays.fill(cVar.f55a, (byte) 0);
                cVar.f57c = new A2.b();
                cVar.f58d = 0;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                cVar.f56b = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                cVar.f56b.order(ByteOrder.LITTLE_ENDIAN);
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        try {
            return c(byteBuffer, i, i8, cVar, iVar);
        } finally {
            this.f3606c.c(cVar);
        }
    }

    public final boolean b(Object obj, B2.i iVar) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        if (((Boolean) iVar.c(h.f3640b)).booleanValue() || N7.a.o(this.f3605b, byteBuffer) != ImageHeaderParser$ImageType.GIF) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final M2.b c(java.nio.ByteBuffer r17, int r18, int r19, A2.c r20, B2.i r21) {
        /*
            r16 = this;
            r1 = r16
            r0 = 1
            java.lang.String r2 = "Decoded GIF from stream in "
            java.lang.String r3 = "BufferGifDecoder"
            int r4 = W2.h.f6165b
            long r4 = android.os.SystemClock.elapsedRealtimeNanos()
            r6 = 2
            A2.b r7 = r20.b()     // Catch:{ all -> 0x00b7 }
            int r8 = r7.f48c     // Catch:{ all -> 0x00b7 }
            r9 = 0
            if (r8 <= 0) goto L_0x00b9
            int r8 = r7.f47b     // Catch:{ all -> 0x00b7 }
            if (r8 == 0) goto L_0x001d
            goto L_0x00b9
        L_0x001d:
            B2.h r8 = O2.h.f3639a     // Catch:{ all -> 0x00b7 }
            r10 = r21
            java.lang.Object r8 = r10.c(r8)     // Catch:{ all -> 0x00b7 }
            B2.a r10 = B2.a.f379V     // Catch:{ all -> 0x00b7 }
            if (r8 != r10) goto L_0x0033
            android.graphics.Bitmap$Config r8 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ all -> 0x0030 }
        L_0x002b:
            r13 = r18
            r14 = r19
            goto L_0x0036
        L_0x0030:
            r0 = move-exception
            goto L_0x00d3
        L_0x0033:
            android.graphics.Bitmap$Config r8 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x00b7 }
            goto L_0x002b
        L_0x0036:
            int r10 = d(r7, r13, r14)     // Catch:{ all -> 0x00b7 }
            K1.i r11 = r1.f3607d     // Catch:{ all -> 0x00b7 }
            A1.d r12 = r1.e     // Catch:{ all -> 0x00b7 }
            r11.getClass()     // Catch:{ all -> 0x00b7 }
            A2.d r15 = new A2.d     // Catch:{ all -> 0x00b7 }
            r11 = r17
            r15.<init>(r12, r7, r11, r10)     // Catch:{ all -> 0x00b7 }
            r15.c(r8)     // Catch:{ all -> 0x00b7 }
            int r7 = r15.f67k     // Catch:{ all -> 0x00b7 }
            int r7 = r7 + r0
            A2.b r8 = r15.f68l     // Catch:{ all -> 0x00b7 }
            int r8 = r8.f48c     // Catch:{ all -> 0x00b7 }
            int r7 = r7 % r8
            r15.f67k = r7     // Catch:{ all -> 0x00b7 }
            android.graphics.Bitmap r7 = r15.b()     // Catch:{ all -> 0x00b7 }
            if (r7 != 0) goto L_0x0075
            boolean r0 = android.util.Log.isLoggable(r3, r6)
            if (r0 == 0) goto L_0x0074
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            double r4 = W2.h.a(r4)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r3, r0)
        L_0x0074:
            return r9
        L_0x0075:
            O2.c r8 = new O2.c     // Catch:{ all -> 0x00b7 }
            android.content.Context r9 = r1.f3604a     // Catch:{ all -> 0x00b7 }
            O2.b r12 = new O2.b     // Catch:{ all -> 0x00b7 }
            O2.g r11 = new O2.g     // Catch:{ all -> 0x00b7 }
            com.bumptech.glide.b r9 = com.bumptech.glide.b.a(r9)     // Catch:{ all -> 0x00b7 }
            r10 = r11
            r6 = r11
            r11 = r9
            r9 = r12
            r12 = r15
            r13 = r18
            r14 = r19
            r15 = r7
            r10.<init>(r11, r12, r13, r14, r15)     // Catch:{ all -> 0x00b7 }
            r7 = 0
            r9.<init>(r7, r6)     // Catch:{ all -> 0x00b7 }
            r8.<init>(r9)     // Catch:{ all -> 0x00b7 }
            M2.b r6 = new M2.b     // Catch:{ all -> 0x00b7 }
            r6.<init>(r8, r0)     // Catch:{ all -> 0x00b7 }
            r7 = 2
            boolean r0 = android.util.Log.isLoggable(r3, r7)
            if (r0 == 0) goto L_0x00b4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            double r4 = W2.h.a(r4)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r3, r0)
        L_0x00b4:
            return r6
        L_0x00b5:
            r6 = 2
            goto L_0x00d3
        L_0x00b7:
            r0 = move-exception
            goto L_0x00b5
        L_0x00b9:
            boolean r0 = android.util.Log.isLoggable(r3, r6)
            if (r0 == 0) goto L_0x00d2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            double r4 = W2.h.a(r4)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r3, r0)
        L_0x00d2:
            return r9
        L_0x00d3:
            boolean r6 = android.util.Log.isLoggable(r3, r6)
            if (r6 == 0) goto L_0x00ec
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r2)
            double r4 = W2.h.a(r4)
            r6.append(r4)
            java.lang.String r2 = r6.toString()
            android.util.Log.v(r3, r2)
        L_0x00ec:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: O2.a.c(java.nio.ByteBuffer, int, int, A2.c, B2.i):M2.b");
    }
}
