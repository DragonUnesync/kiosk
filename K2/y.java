package K2;

import E2.b;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.Log;
import java.util.concurrent.locks.Lock;

public abstract class y {

    /* renamed from: a  reason: collision with root package name */
    public static final Paint f2653a = new Paint(6);

    /* renamed from: b  reason: collision with root package name */
    public static final Lock f2654b;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.util.concurrent.locks.ReentrantLock} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.util.concurrent.locks.ReentrantLock} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.util.concurrent.locks.ReentrantLock} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = 6
            r0.<init>(r1)
            f2653a = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = 7
            r0.<init>(r1)
            java.util.HashSet r0 = new java.util.HashSet
            java.lang.String r27 = "XT1072"
            java.lang.String r28 = "XT1077"
            java.lang.String r2 = "XT1085"
            java.lang.String r3 = "XT1092"
            java.lang.String r4 = "XT1093"
            java.lang.String r5 = "XT1094"
            java.lang.String r6 = "XT1095"
            java.lang.String r7 = "XT1096"
            java.lang.String r8 = "XT1097"
            java.lang.String r9 = "XT1098"
            java.lang.String r10 = "XT1031"
            java.lang.String r11 = "XT1028"
            java.lang.String r12 = "XT937C"
            java.lang.String r13 = "XT1032"
            java.lang.String r14 = "XT1008"
            java.lang.String r15 = "XT1033"
            java.lang.String r16 = "XT1035"
            java.lang.String r17 = "XT1034"
            java.lang.String r18 = "XT939G"
            java.lang.String r19 = "XT1039"
            java.lang.String r20 = "XT1040"
            java.lang.String r21 = "XT1042"
            java.lang.String r22 = "XT1045"
            java.lang.String r23 = "XT1063"
            java.lang.String r24 = "XT1064"
            java.lang.String r25 = "XT1068"
            java.lang.String r26 = "XT1069"
            java.lang.String r29 = "XT1078"
            java.lang.String r30 = "XT1079"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30}
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.<init>(r2)
            java.lang.String r2 = android.os.Build.MODEL
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x0063
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            goto L_0x0068
        L_0x0063:
            K2.x r0 = new K2.x
            r0.<init>()
        L_0x0068:
            f2654b = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r1)
            android.graphics.PorterDuffXfermode r1 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            r1.<init>(r2)
            r0.setXfermode(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.y.<clinit>():void");
    }

    public static void a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = f2654b;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f2653a);
            canvas.setBitmap((Bitmap) null);
        } finally {
            lock.unlock();
        }
    }

    public static Bitmap b(b bVar, Bitmap bitmap, int i, int i8) {
        Bitmap.Config config;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i8) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size matches input, returning input");
            }
            return bitmap;
        }
        float min = Math.min(((float) i) / ((float) bitmap.getWidth()), ((float) i8) / ((float) bitmap.getHeight()));
        int round = Math.round(((float) bitmap.getWidth()) * min);
        int round2 = Math.round(((float) bitmap.getHeight()) * min);
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "adjusted target size matches input, returning input");
            }
            return bitmap;
        }
        int width = (int) (((float) bitmap.getWidth()) * min);
        int height = (int) (((float) bitmap.getHeight()) * min);
        if (bitmap.getConfig() != null) {
            config = bitmap.getConfig();
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap g8 = bVar.g(width, height, config);
        g8.setHasAlpha(bitmap.hasAlpha());
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "request: " + i + "x" + i8);
            Log.v("TransformationUtils", "toFit:   " + bitmap.getWidth() + "x" + bitmap.getHeight());
            Log.v("TransformationUtils", "toReuse: " + g8.getWidth() + "x" + g8.getHeight());
            StringBuilder sb = new StringBuilder("minPct:   ");
            sb.append(min);
            Log.v("TransformationUtils", sb.toString());
        }
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        a(bitmap, g8, matrix);
        return g8;
    }
}
