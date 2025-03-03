package P0;

import N.e;
import Q0.g;
import android.media.MediaFormat;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f3718a = new Object();

    public static void A(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(g.m(i, "csd-"), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    public static void B(String str, String str2) {
        synchronized (f3718a) {
            Log.w(str, a(str2, (Throwable) null));
        }
    }

    public static void C(String str, String str2, Throwable th) {
        synchronized (f3718a) {
            Log.w(str, a(str2, th));
        }
    }

    public static String a(String str, Throwable th) {
        String str2;
        if (th != null) {
            synchronized (f3718a) {
                Throwable th2 = th;
                while (true) {
                    if (th2 == null) {
                        str2 = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (th2 instanceof UnknownHostException) {
                            str2 = "UnknownHostException (no network)";
                            break;
                        }
                        th2 = th2.getCause();
                    } catch (Throwable th3) {
                        while (true) {
                            throw th3;
                        }
                    }
                }
            }
        } else {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        StringBuilder B8 = e.B(str, "\n  ");
        B8.append(str2.replace("\n", "\n  "));
        B8.append(10);
        return B8.toString();
    }

    public static void b(int i, int i8) {
        GLES20.glBindTexture(i, i8);
        e();
        GLES20.glTexParameteri(i, 10240, 9729);
        e();
        GLES20.glTexParameteri(i, 10241, 9729);
        e();
        GLES20.glTexParameteri(i, 10242, 33071);
        e();
        GLES20.glTexParameteri(i, 10243, 33071);
        e();
    }

    public static void c(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void d(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void e() {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z) {
                sb.append(10);
            }
            String gluErrorString = GLU.gluErrorString(glGetError);
            if (gluErrorString == null) {
                gluErrorString = "error code: 0x" + Integer.toHexString(glGetError);
            }
            sb.append("glError: ");
            sb.append(gluErrorString);
            z = true;
        }
        if (z) {
            throw new Exception(sb.toString());
        }
    }

    public static void f(String str, boolean z) {
        if (!z) {
            throw new Exception(str);
        }
    }

    public static void g(int i, int i8) {
        if (i < 0 || i >= i8) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void h(Object obj) {
        obj.getClass();
    }

    public static void i(String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void j(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void k(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    public static void l(Object obj, String str) {
        if (obj == null) {
            throw new IllegalStateException(str);
        }
    }

    public static FloatBuffer m(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    public static void n(String str, String str2) {
        synchronized (f3718a) {
            Log.d(str, a(str2, (Throwable) null));
        }
    }

    public static void o(String str, String str2) {
        synchronized (f3718a) {
            Log.e(str, a(str2, (Throwable) null));
        }
    }

    public static void p(String str, String str2, Throwable th) {
        synchronized (f3718a) {
            Log.e(str, a(str2, th));
        }
    }

    public static String q(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static int[] r(String str) {
        int i;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i8 = indexOf4 + 2;
        if (i8 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i8) == '/') {
            i = str.indexOf(47, indexOf4 + 3);
            if (i == -1 || i > indexOf2) {
                i = indexOf2;
            }
        } else {
            i = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    public static void s(String str, String str2) {
        synchronized (f3718a) {
            Log.i(str, a(str2, (Throwable) null));
        }
    }

    public static boolean t(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getEventType() != 3 || !xmlPullParser.getName().equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean u(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() == 2) {
            return true;
        }
        return false;
    }

    public static boolean v(XmlPullParser xmlPullParser, String str) {
        if (!u(xmlPullParser) || !xmlPullParser.getName().equals(str)) {
            return false;
        }
        return true;
    }

    public static void w(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static String x(StringBuilder sb, int i, int i8) {
        int i9;
        int i10;
        int i11;
        if (i >= i8) {
            return sb.toString();
        }
        if (sb.charAt(i) == '/') {
            i++;
        }
        int i12 = i;
        int i13 = i12;
        while (i12 <= i8) {
            if (i12 == i8) {
                i9 = i12;
            } else if (sb.charAt(i12) == '/') {
                i9 = i12 + 1;
            } else {
                i12++;
            }
            int i14 = i13 + 1;
            if (i12 == i14 && sb.charAt(i13) == '.') {
                sb.delete(i13, i9);
                i8 -= i9 - i13;
            } else {
                if (i12 == i13 + 2 && sb.charAt(i13) == '.' && sb.charAt(i14) == '.') {
                    i10 = sb.lastIndexOf("/", i13 - 2) + 1;
                    if (i10 > i) {
                        i11 = i10;
                    } else {
                        i11 = i;
                    }
                    sb.delete(i11, i9);
                    i8 -= i9 - i11;
                } else {
                    i10 = i12 + 1;
                }
                i13 = i10;
            }
            i12 = i13;
        }
        return sb.toString();
    }

    public static String y(String str, String str2) {
        int i;
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] r8 = r(str2);
        if (r8[0] != -1) {
            sb.append(str2);
            x(sb, r8[1], r8[2]);
            return sb.toString();
        }
        int[] r9 = r(str);
        if (r8[3] == 0) {
            sb.append(str, 0, r9[3]);
            sb.append(str2);
            return sb.toString();
        } else if (r8[2] == 0) {
            sb.append(str, 0, r9[2]);
            sb.append(str2);
            return sb.toString();
        } else {
            int i8 = r8[1];
            if (i8 != 0) {
                int i9 = r9[0] + 1;
                sb.append(str, 0, i9);
                sb.append(str2);
                return x(sb, r8[1] + i9, i9 + r8[2]);
            } else if (str2.charAt(i8) == '/') {
                sb.append(str, 0, r9[1]);
                sb.append(str2);
                int i10 = r9[1];
                return x(sb, i10, r8[2] + i10);
            } else {
                int i11 = r9[0] + 2;
                int i12 = r9[1];
                if (i11 >= i12 || i12 != r9[2]) {
                    int lastIndexOf = str.lastIndexOf(47, r9[2] - 1);
                    if (lastIndexOf == -1) {
                        i = r9[1];
                    } else {
                        i = lastIndexOf + 1;
                    }
                    sb.append(str, 0, i);
                    sb.append(str2);
                    return x(sb, r9[1], i + r8[2]);
                }
                sb.append(str, 0, i12);
                sb.append('/');
                sb.append(str2);
                int i13 = r9[1];
                return x(sb, i13, r8[2] + i13 + 1);
            }
        }
    }

    public static Uri z(String str, String str2) {
        return Uri.parse(y(str, str2));
    }
}
