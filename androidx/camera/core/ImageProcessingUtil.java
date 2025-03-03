package androidx.camera.core;

import B.N;
import B.V;
import B.W;
import D.Z;
import F.h;
import I.a;
import android.graphics.Bitmap;
import android.media.Image;
import android.media.ImageWriter;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Locale;
import u.C1477r;

public abstract class ImageProcessingUtil {

    /* renamed from: a  reason: collision with root package name */
    public static int f7640a;

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    public static void a(W w2) {
        if (!e(w2)) {
            h.l("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return;
        }
        int c8 = w2.c();
        int b8 = w2.b();
        int U8 = w2.d()[0].U();
        int U9 = w2.d()[1].U();
        int U10 = w2.d()[2].U();
        int O8 = w2.d()[0].O();
        int O9 = w2.d()[1].O();
        if (nativeShiftPixel(w2.d()[0].L(), U8, w2.d()[1].L(), U9, w2.d()[2].L(), U10, O8, O9, c8, b8, O8, O9, O9) != 0) {
            h.l("ImageProcessingUtil", "One pixel shift for YUV failure");
        }
    }

    public static Bitmap b(W w2) {
        if (w2.getFormat() == 35) {
            int c8 = w2.c();
            int b8 = w2.b();
            int U8 = w2.d()[0].U();
            int U9 = w2.d()[1].U();
            int U10 = w2.d()[2].U();
            int O8 = w2.d()[0].O();
            int O9 = w2.d()[1].O();
            Bitmap createBitmap = Bitmap.createBitmap(w2.c(), w2.b(), Bitmap.Config.ARGB_8888);
            int rowBytes = createBitmap.getRowBytes();
            if (nativeConvertAndroid420ToBitmap(w2.d()[0].L(), U8, w2.d()[1].L(), U9, w2.d()[2].L(), U10, O8, O9, createBitmap, rowBytes, c8, b8) == 0) {
                return createBitmap;
            }
            throw new UnsupportedOperationException("YUV to RGB conversion failed");
        }
        throw new IllegalArgumentException("Input image format must be YUV_420_888");
    }

    public static N c(W w2, Z z, ByteBuffer byteBuffer, int i, boolean z6) {
        int i8;
        int i9;
        int i10;
        int i11 = i;
        if (!e(w2)) {
            h.l("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (i11 == 0 || i11 == 90 || i11 == 180 || i11 == 270) {
            Surface j7 = z.j();
            int c8 = w2.c();
            int b8 = w2.b();
            int U8 = w2.d()[0].U();
            int U9 = w2.d()[1].U();
            int U10 = w2.d()[2].U();
            int O8 = w2.d()[0].O();
            int O9 = w2.d()[1].O();
            if (z6) {
                i8 = O8;
            } else {
                i8 = 0;
            }
            if (z6) {
                i9 = O9;
            } else {
                i9 = 0;
            }
            if (z6) {
                i10 = O9;
            } else {
                i10 = 0;
            }
            String str = "ImageProcessingUtil";
            if (nativeConvertAndroid420ToABGR(w2.d()[0].L(), U8, w2.d()[1].L(), U9, w2.d()[2].L(), U10, O8, O9, j7, byteBuffer, c8, b8, i8, i9, i10, i) != 0) {
                h.l(str, "YUV to RGB conversion failure");
                return null;
            }
            String str2 = str;
            if (Log.isLoggable("MH", 3)) {
                Locale locale = Locale.US;
                int i12 = f7640a;
                h.j(str2, "Image processing performance profiling, duration: [" + (System.currentTimeMillis() - currentTimeMillis) + "], image count: " + i12);
                f7640a = f7640a + 1;
            }
            W o2 = z.o();
            if (o2 == null) {
                h.l(str2, "YUV to RGB acquireLatestImage failure");
                return null;
            }
            N n4 = new N(o2);
            n4.k(new V(o2, w2, 0));
            return n4;
        }
        h.l("ImageProcessingUtil", "Unsupported rotation degrees for rotate RGB");
        return null;
    }

    public static void d(Bitmap bitmap, ByteBuffer byteBuffer, int i) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    public static boolean e(W w2) {
        if (w2.getFormat() == 35 && w2.d().length == 3) {
            return true;
        }
        return false;
    }

    public static N f(W w2, Z z, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        String str;
        int i8 = i;
        if (!e(w2)) {
            h.l("ImageProcessingUtil", "Unsupported format for rotate YUV");
            return null;
        } else if (i8 == 0 || i8 == 90 || i8 == 180 || i8 == 270) {
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 23 && i8 > 0) {
                int c8 = w2.c();
                int b8 = w2.b();
                int U8 = w2.d()[0].U();
                int U9 = w2.d()[1].U();
                int U10 = w2.d()[2].U();
                int O8 = w2.d()[1].O();
                if (i9 >= 23) {
                    Image c9 = a.c(imageWriter);
                    if (c9 != null) {
                        Image image = c9;
                        String str2 = "ImageProcessingUtil";
                        if (nativeRotateYUV(w2.d()[0].L(), U8, w2.d()[1].L(), U9, w2.d()[2].L(), U10, O8, c9.getPlanes()[0].getBuffer(), c9.getPlanes()[0].getRowStride(), c9.getPlanes()[0].getPixelStride(), c9.getPlanes()[1].getBuffer(), c9.getPlanes()[1].getRowStride(), c9.getPlanes()[1].getPixelStride(), c9.getPlanes()[2].getBuffer(), c9.getPlanes()[2].getRowStride(), c9.getPlanes()[2].getPixelStride(), byteBuffer, byteBuffer2, byteBuffer3, c8, b8, i) != 0) {
                            str = str2;
                            h.l(str, "rotate YUV failure");
                            return null;
                        }
                        int i10 = Build.VERSION.SDK_INT;
                        if (i10 >= 23) {
                            a.n(imageWriter, image);
                            W o2 = z.o();
                            if (o2 == null) {
                                h.l(str2, "YUV rotation acquireLatestImage failure");
                                return null;
                            }
                            N n4 = new N(o2);
                            n4.k(new V(o2, w2, 1));
                            return n4;
                        }
                        throw new RuntimeException(C1477r.c(i10, "Unable to call queueInputImage() on API ", ". Version 23 or higher required."));
                    }
                } else {
                    throw new RuntimeException(C1477r.c(i9, "Unable to call dequeueInputImage() on API ", ". Version 23 or higher required."));
                }
            }
            str = "ImageProcessingUtil";
            h.l(str, "rotate YUV failure");
            return null;
        } else {
            h.l("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
            return null;
        }
    }

    public static void g(byte[] bArr, Surface surface) {
        surface.getClass();
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            h.l("ImageProcessingUtil", "Failed to enqueue JPEG image.");
        }
    }

    private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i8, ByteBuffer byteBuffer3, int i9, int i10, int i11, Surface surface, ByteBuffer byteBuffer4, int i12, int i13, int i14, int i15, int i16, int i17);

    private static native int nativeConvertAndroid420ToBitmap(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i8, ByteBuffer byteBuffer3, int i9, int i10, int i11, Bitmap bitmap, int i12, int i13, int i14);

    private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i, int i8, int i9, int i10, boolean z);

    private static native int nativeRotateYUV(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i8, ByteBuffer byteBuffer3, int i9, int i10, ByteBuffer byteBuffer4, int i11, int i12, ByteBuffer byteBuffer5, int i13, int i14, ByteBuffer byteBuffer6, int i15, int i16, ByteBuffer byteBuffer7, ByteBuffer byteBuffer8, ByteBuffer byteBuffer9, int i17, int i18, int i19);

    private static native int nativeShiftPixel(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i8, ByteBuffer byteBuffer3, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16);

    private static native int nativeWriteJpegToSurface(byte[] bArr, Surface surface);
}
