package R;

import P6.f;
import Q0.g;
import R0.h;
import T6.a;
import Y6.x;
import android.content.Context;
import android.os.Build;
import android.support.v4.media.session.b;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import b2.C0527f;
import g2.y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import n7.C1247a;
import org.acra.ErrorReporter;
import y2.C1627b;

public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static volatile e f4234a = null;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f4235b = true;

    public static void a(int i) {
        if (2 > i || i >= 37) {
            StringBuilder p3 = g.p(i, "radix ", " was not in valid range ");
            p3.append(new a(2, 36, 1));
            throw new IllegalArgumentException(p3.toString());
        }
    }

    public static void d(h hVar) {
        if (hVar != null) {
            try {
                hVar.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final boolean e(char c8, char c9, boolean z) {
        if (c8 == c9) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c8);
        char upperCase2 = Character.toUpperCase(c9);
        if (upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) {
            return true;
        }
        return false;
    }

    public static x f(String str) {
        f.e(str, "javaName");
        int hashCode = str.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return x.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return x.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return x.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return x.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return x.SSL_3_0;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
    }

    public static boolean g(int[] iArr, int i) {
        if ((iArr[i >> 5] & (1 << (i & 31))) != 0) {
            return true;
        }
        return false;
    }

    public static String h(int i) {
        ArrayList arrayList = new ArrayList();
        if ((i & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append("|");
            }
        }
        return sb.toString();
    }

    public static String l(int i, int i8, int i9) {
        StringBuilder sb = new StringBuilder(80);
        int i10 = (~i8) & i;
        int i11 = i & i8;
        if ((i11 & 1) != 0) {
            sb.append("|public");
        }
        if ((i11 & 2) != 0) {
            sb.append("|private");
        }
        if ((i11 & 4) != 0) {
            sb.append("|protected");
        }
        if ((i11 & 8) != 0) {
            sb.append("|static");
        }
        if ((i11 & 16) != 0) {
            sb.append("|final");
        }
        if ((i11 & 32) != 0) {
            if (i9 == 1) {
                sb.append("|super");
            } else {
                sb.append("|synchronized");
            }
        }
        if ((i11 & 64) != 0) {
            if (i9 == 3) {
                sb.append("|bridge");
            } else {
                sb.append("|volatile");
            }
        }
        if ((i11 & 128) != 0) {
            if (i9 == 3) {
                sb.append("|varargs");
            } else {
                sb.append("|transient");
            }
        }
        if ((i11 & 256) != 0) {
            sb.append("|native");
        }
        if ((i11 & 512) != 0) {
            sb.append("|interface");
        }
        if ((i11 & 1024) != 0) {
            sb.append("|abstract");
        }
        if ((i11 & 2048) != 0) {
            sb.append("|strictfp");
        }
        if ((i11 & 4096) != 0) {
            sb.append("|synthetic");
        }
        if ((i11 & 8192) != 0) {
            sb.append("|annotation");
        }
        if ((i11 & 16384) != 0) {
            sb.append("|enum");
        }
        if ((65536 & i11) != 0) {
            sb.append("|constructor");
        }
        if ((i11 & 131072) != 0) {
            sb.append("|declared_synchronized");
        }
        if (i10 != 0 || sb.length() == 0) {
            sb.append('|');
            sb.append(b.P(i10));
        }
        return sb.substring(1);
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [R.e, java.lang.Object] */
    public static boolean m(a aVar) {
        e eVar;
        int i;
        if (f4234a != null) {
            eVar = f4234a;
        } else {
            synchronized (e.class) {
                if (f4234a == null) {
                    try {
                        f4234a = new d();
                    } catch (NoClassDefFoundError unused) {
                        F.h.j("ExtenderVersion", "No versioning extender found. Falling back to default.");
                        f4234a = new Object();
                    }
                }
            }
            eVar = f4234a;
        }
        a i8 = eVar.i();
        int i9 = aVar.f4226U;
        int i10 = aVar.f4227V;
        int i11 = i8.f4226U;
        if (i11 == i9) {
            i = Integer.compare(i8.f4227V, i10);
        } else {
            i = Integer.compare(i11, i9);
        }
        if (i >= 0) {
            return true;
        }
        return false;
    }

    public static String n(String str, Object... objArr) {
        int indexOf;
        String str2;
        int i = 0;
        for (int i8 = 0; i8 < objArr.length; i8++) {
            Object obj = objArr[i8];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e) {
                    String str3 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str3, e);
                    StringBuilder s8 = g.s("<", str3, " threw ");
                    s8.append(e.getClass().getName());
                    s8.append(">");
                    str2 = s8.toString();
                }
            }
            objArr[i8] = str2;
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + str.length());
        int i9 = 0;
        while (i < objArr.length && (indexOf = str.indexOf("%s", i9)) != -1) {
            sb.append(str, i9, indexOf);
            sb.append(objArr[i]);
            i9 = indexOf + 2;
            i++;
        }
        sb.append(str, i9, str.length());
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i10 = i + 1; i10 < objArr.length; i10++) {
                sb.append(", ");
                sb.append(objArr[i10]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static final void s(int i, Context context, String str) {
        f.e(context, "context");
        try {
            Toast.makeText(context, str, i).show();
        } catch (RuntimeException e) {
            ErrorReporter errorReporter = C1247a.f13789a;
            n2.a.n1("Could not send crash Toast", e);
        }
    }

    public static final void t(View view, C0527f fVar) {
        f.e(view, "<this>");
        view.setTag(2131362625, fVar);
    }

    public static void u(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            y.b(viewGroup, z);
        } else if (f4235b) {
            try {
                y.b(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                f4235b = false;
            }
        }
    }

    public static void v(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        } else if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        } else if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    public static void x(C1627b bVar, int i, long j7) {
        int numberOfTrailingZeros = 64 - Long.numberOfTrailingZeros(j7);
        if (numberOfTrailingZeros == 0) {
            numberOfTrailingZeros = 1;
        }
        int i8 = (numberOfTrailingZeros + 7) >> 3;
        long j8 = j7 >> (64 - (i8 * 8));
        bVar.i(i | ((i8 - 1) << 5));
        while (i8 > 0) {
            bVar.i((byte) ((int) j8));
            j8 >>= 8;
            i8--;
        }
    }

    public static void y(C1627b bVar, int i, long j7) {
        int numberOfLeadingZeros = 64 - Long.numberOfLeadingZeros(j7);
        if (numberOfLeadingZeros == 0) {
            numberOfLeadingZeros = 1;
        }
        int i8 = (numberOfLeadingZeros + 7) >> 3;
        bVar.i(i | ((i8 - 1) << 5));
        while (i8 > 0) {
            bVar.i((byte) ((int) j7));
            j7 >>= 8;
            i8--;
        }
    }

    public abstract int b(View view, int i);

    public abstract int c(View view, int i);

    public abstract a i();

    public int j(View view) {
        return 0;
    }

    public int k() {
        return 0;
    }

    public void o(View view, int i) {
    }

    public abstract void p(int i);

    public abstract void q(View view, int i, int i8);

    public abstract void r(View view, float f8, float f9);

    public abstract boolean w(View view, int i);
}
