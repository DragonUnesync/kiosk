package Q7;

import B.W;
import M0.H;
import M0.J;
import N.e;
import P0.r;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Base64;
import android.view.View;
import androidx.camera.core.ImageProcessingUtil;
import androidx.emoji2.text.f;
import androidx.recyclerview.widget.Q;
import androidx.recyclerview.widget.f0;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.List;
import l5.C1179a;
import n2.a;
import n7.C1247a;
import org.acra.ErrorReporter;
import p1.l;
import r7.C1395d;
import y1.C1625a;

public abstract class g {
    public static void A(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("String must not be empty");
        }
    }

    public static void B(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void C(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException(e.y("The '", str2, "' parameter must not be empty."));
        }
    }

    public static void D(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Object must not be null");
        }
    }

    public static void E(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(e.y("The parameter '", str, "' must not be null."));
        }
    }

    public static W1.e G(int i, l lVar, r rVar) {
        W1.e b8 = W1.e.b(lVar, rVar);
        while (true) {
            int i8 = b8.f6147a;
            if (i8 == i) {
                return b8;
            }
            Q0.g.u(i8, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
            long j7 = b8.f6148b;
            long j8 = 8 + j7;
            if (j7 % 2 != 0) {
                j8 = 9 + j7;
            }
            if (j8 <= 2147483647L) {
                lVar.m((int) j8);
                b8 = W1.e.b(lVar, rVar);
            } else {
                throw J.c("Chunk is too large (~2GB+) to skip; id: " + i8);
            }
        }
    }

    public static String a(int i, int i8, String str) {
        if (i < 0) {
            return R.e.n("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i8 >= 0) {
            return R.e.n("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i8));
        } else {
            throw new IllegalArgumentException(Q0.g.m(i8, "negative size: "));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (r10.right <= r12.left) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        if (r10.top >= r12.bottom) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (r10.left >= r12.right) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r10.bottom <= r12.top) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(int r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12) {
        /*
            boolean r0 = c(r9, r10, r11)
            boolean r1 = c(r9, r10, r12)
            r2 = 0
            if (r1 != 0) goto L_0x0078
            if (r0 != 0) goto L_0x000f
            goto L_0x0078
        L_0x000f:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r3 = 33
            r4 = 66
            r5 = 17
            r6 = 1
            if (r9 == r5) goto L_0x003d
            if (r9 == r3) goto L_0x0036
            if (r9 == r4) goto L_0x002f
            if (r9 != r1) goto L_0x0029
            int r7 = r10.bottom
            int r8 = r12.top
            if (r7 > r8) goto L_0x0077
            goto L_0x0043
        L_0x0029:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L_0x002f:
            int r7 = r10.right
            int r8 = r12.left
            if (r7 > r8) goto L_0x0077
            goto L_0x0043
        L_0x0036:
            int r7 = r10.top
            int r8 = r12.bottom
            if (r7 < r8) goto L_0x0077
            goto L_0x0043
        L_0x003d:
            int r7 = r10.left
            int r8 = r12.right
            if (r7 < r8) goto L_0x0077
        L_0x0043:
            if (r9 == r5) goto L_0x0077
            if (r9 != r4) goto L_0x0048
            goto L_0x0077
        L_0x0048:
            int r11 = x(r9, r10, r11)
            if (r9 == r5) goto L_0x006a
            if (r9 == r3) goto L_0x0065
            if (r9 == r4) goto L_0x0060
            if (r9 != r1) goto L_0x005a
            int r9 = r12.bottom
            int r10 = r10.bottom
        L_0x0058:
            int r9 = r9 - r10
            goto L_0x006f
        L_0x005a:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L_0x0060:
            int r9 = r12.right
            int r10 = r10.right
            goto L_0x0058
        L_0x0065:
            int r9 = r10.top
            int r10 = r12.top
            goto L_0x0058
        L_0x006a:
            int r9 = r10.left
            int r10 = r12.left
            goto L_0x0058
        L_0x006f:
            int r9 = java.lang.Math.max(r6, r9)
            if (r11 >= r9) goto L_0x0076
            r2 = 1
        L_0x0076:
            return r2
        L_0x0077:
            return r6
        L_0x0078:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Q7.g.b(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static boolean c(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            if (rect2.right < rect.left || rect2.left > rect.right) {
                return false;
            }
            return true;
        }
        if (rect2.bottom < rect.top || rect2.top > rect.bottom) {
            return false;
        }
        return true;
    }

    public static void d(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void e(boolean z, String str, long j7) {
        if (!z) {
            throw new IllegalArgumentException(R.e.n(str, Long.valueOf(j7)));
        }
    }

    public static void f(int i, int i8) {
        String str;
        if (i < 0 || i >= i8) {
            if (i < 0) {
                str = R.e.n("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else if (i8 >= 0) {
                str = R.e.n("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i8));
            } else {
                throw new IllegalArgumentException(Q0.g.m(i8, "negative size: "));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    public static boolean g(l lVar) {
        r rVar = new r(8);
        int i = W1.e.b(lVar, rVar).f6147a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        lVar.r(rVar.f3732a, 0, 4, false);
        rVar.H(0);
        int i8 = rVar.i();
        if (i8 == 1463899717) {
            return true;
        }
        P0.l.o("WavHeaderReader", "Unsupported form type: " + i8);
        return false;
    }

    public static void h(int i, int i8) {
        if (i < 0 || i > i8) {
            throw new IndexOutOfBoundsException(a(i, i8, "index"));
        }
    }

    public static void i(int i, int i8, int i9) {
        String str;
        if (i < 0 || i8 < i || i8 > i9) {
            if (i < 0 || i > i9) {
                str = a(i, i9, "start index");
            } else if (i8 < 0 || i8 > i9) {
                str = a(i8, i9, "end index");
            } else {
                str = R.e.n("end index (%s) must not be less than start index (%s)", Integer.valueOf(i8), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    public static void j(String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    public static int l(f0 f0Var, f fVar, View view, View view2, Q q7, boolean z) {
        if (q7.G() == 0 || f0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(Q.S(view) - Q.S(view2)) + 1;
        }
        return Math.min(fVar.l(), fVar.b(view2) - fVar.e(view));
    }

    public static int m(f0 f0Var, f fVar, View view, View view2, Q q7, boolean z, boolean z6) {
        int i;
        if (q7.G() == 0 || f0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(Q.S(view), Q.S(view2));
        int max = Math.max(Q.S(view), Q.S(view2));
        if (z6) {
            i = Math.max(0, (f0Var.b() - max) - 1);
        } else {
            i = Math.max(0, min);
        }
        if (!z) {
            return i;
        }
        return Math.round((((float) i) * (((float) Math.abs(fVar.b(view2) - fVar.e(view))) / ((float) (Math.abs(Q.S(view) - Q.S(view2)) + 1)))) + ((float) (fVar.k() - fVar.e(view))));
    }

    public static int n(f0 f0Var, f fVar, View view, View view2, Q q7, boolean z) {
        if (q7.G() == 0 || f0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return f0Var.b();
        }
        return (int) ((((float) (fVar.b(view2) - fVar.e(view))) / ((float) (Math.abs(Q.S(view) - Q.S(view2)) + 1))) * ((float) f0Var.b()));
    }

    public static Bitmap o(W w2) {
        int format = w2.getFormat();
        if (format == 1) {
            Bitmap createBitmap = Bitmap.createBitmap(w2.c(), w2.b(), Bitmap.Config.ARGB_8888);
            w2.d()[0].L().rewind();
            ImageProcessingUtil.d(createBitmap, w2.d()[0].L(), w2.d()[0].U());
            return createBitmap;
        } else if (format == 35) {
            return ImageProcessingUtil.b(w2);
        } else {
            if (format == 256 || format == 4101) {
                int format2 = w2.getFormat();
                if (format2 == 256 || format2 == 4101) {
                    ByteBuffer L8 = w2.d()[0].L();
                    int capacity = L8.capacity();
                    byte[] bArr = new byte[capacity];
                    L8.rewind();
                    L8.get(bArr);
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, capacity, (BitmapFactory.Options) null);
                    if (decodeByteArray != null) {
                        return decodeByteArray;
                    }
                    throw new UnsupportedOperationException("Decode jpeg byte array failed");
                }
                throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + w2.getFormat());
            }
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + w2.getFormat() + ", only ImageFormat.YUV_420_888 and PixelFormat.RGBA_8888 are supported");
        }
    }

    public static Bitmap r(int i, byte[] bArr) {
        int i8 = 0;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i, (BitmapFactory.Options) null);
        if (decodeByteArray != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                F0.g gVar = new F0.g(byteArrayInputStream);
                byteArrayInputStream.close();
                switch (gVar.c(1, "Orientation")) {
                    case 3:
                    case 4:
                        i8 = 180;
                        break;
                    case 5:
                    case 8:
                        i8 = 270;
                        break;
                    case 6:
                    case 7:
                        i8 = 90;
                        break;
                }
                if (i8 == 0) {
                    return decodeByteArray;
                }
                Matrix matrix = new Matrix();
                matrix.postRotate((float) i8);
                return Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            throw J.a(new IllegalStateException(), "Could not decode image data");
        }
        throw th;
    }

    public static final void s(File file) {
        if (!file.delete()) {
            ErrorReporter errorReporter = C1247a.f13789a;
            a.m1("Could not delete file: " + file);
        }
    }

    public static Serializable t(String str) {
        Class<C1395d> cls = C1395d.class;
        if (str != null) {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(Base64.decode(str, 0)));
                try {
                    Object readObject = objectInputStream.readObject();
                    if (cls.isInstance(readObject)) {
                        Serializable cast = cls.cast(readObject);
                        g7.l.c(objectInputStream, (Throwable) null);
                        return cast;
                    }
                    g7.l.c(objectInputStream, (Throwable) null);
                } catch (Throwable th) {
                    g7.l.c(objectInputStream, th);
                    throw th;
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e8) {
                e8.printStackTrace();
            }
        }
        return null;
    }

    public static boolean u(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            int i8 = rect.right;
            int i9 = rect2.right;
            if ((i8 > i9 || rect.left >= i9) && rect.left > rect2.left) {
                return true;
            }
            return false;
        } else if (i == 33) {
            int i10 = rect.bottom;
            int i11 = rect2.bottom;
            if ((i10 > i11 || rect.top >= i11) && rect.top > rect2.top) {
                return true;
            }
            return false;
        } else if (i == 66) {
            int i12 = rect.left;
            int i13 = rect2.left;
            if ((i12 < i13 || rect.right <= i13) && rect.right < rect2.right) {
                return true;
            }
            return false;
        } else if (i == 130) {
            int i14 = rect.top;
            int i15 = rect2.top;
            if ((i14 < i15 || rect.bottom <= i15) && rect.bottom < rect2.bottom) {
                return true;
            }
            return false;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    public static void v(boolean z) {
        if (!z) {
            throw new IllegalArgumentException("Must be true");
        }
    }

    public static boolean w(int i) {
        int i8;
        if (i < -1) {
            return false;
        }
        if (i == -1 || (i8 = i & 255) == 0 || i8 == 255 || (i & 65280) == 0) {
            return true;
        }
        return false;
    }

    public static int x(int i, Rect rect, Rect rect2) {
        int i8;
        int i9;
        if (i == 17) {
            i8 = rect.left;
            i9 = rect2.right;
        } else if (i == 33) {
            i8 = rect.top;
            i9 = rect2.bottom;
        } else if (i == 66) {
            i8 = rect2.left;
            i9 = rect.right;
        } else if (i == 130) {
            i8 = rect2.top;
            i9 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return Math.max(0, i8 - i9);
    }

    public static int y(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.bumptech.glide.g, l5.a] */
    public static C1179a z() {
        return new com.bumptech.glide.g("MQTT client is not connected.", (Throwable) null);
    }

    public abstract void F(String str);

    public abstract List k(String str, List list);

    public H p(C1625a aVar) {
        boolean z;
        ByteBuffer byteBuffer = aVar.f4386Y;
        byteBuffer.getClass();
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z = true;
        } else {
            z = false;
        }
        P0.l.d(z);
        return q(aVar, byteBuffer);
    }

    public abstract H q(C1625a aVar, ByteBuffer byteBuffer);
}
