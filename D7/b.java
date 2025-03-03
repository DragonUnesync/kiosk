package D7;

import D.p0;
import D2.o;
import F.e;
import F.h;
import P6.f;
import Q7.g;
import S5.C0185n;
import S7.p;
import U7.q;
import W6.a;
import W6.l;
import Y6.s;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
import androidx.camera.lifecycle.c;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bumptech.glide.d;
import h1.C1048n;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.InputStream;
import java.net.ProtocolException;
import java.nio.BufferUnderflowException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import l7.C1181a;
import l7.i;
import m0.C1195a;
import org.altbeacon.bluetooth.Pdu;
import r.C1366a;
import r0.C1374h;
import v.k;
import x.C1594a;

public abstract class b implements C1366a {
    public b() {
        new ConcurrentHashMap();
    }

    public static boolean A(int i) {
        double d8;
        double d9;
        double d10;
        if (i != 0) {
            ThreadLocal threadLocal = C1195a.f13315a;
            double[] dArr = (double[]) threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int red = Color.red(i);
            int green = Color.green(i);
            int blue = Color.blue(i);
            if (dArr.length == 3) {
                double d11 = ((double) red) / 255.0d;
                if (d11 < 0.04045d) {
                    d8 = d11 / 12.92d;
                } else {
                    d8 = Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
                }
                double d12 = ((double) green) / 255.0d;
                if (d12 < 0.04045d) {
                    d9 = d12 / 12.92d;
                } else {
                    d9 = Math.pow((d12 + 0.055d) / 1.055d, 2.4d);
                }
                double d13 = ((double) blue) / 255.0d;
                if (d13 < 0.04045d) {
                    d10 = d13 / 12.92d;
                } else {
                    d10 = Math.pow((d13 + 0.055d) / 1.055d, 2.4d);
                }
                dArr[0] = ((0.1805d * d10) + (0.3576d * d9) + (0.4124d * d8)) * 100.0d;
                double d14 = ((0.0722d * d10) + (0.7152d * d9) + (0.2126d * d8)) * 100.0d;
                dArr[1] = d14;
                double d15 = d10 * 0.9505d;
                dArr[2] = (d15 + (d9 * 0.1192d) + (d8 * 0.0193d)) * 100.0d;
                if (d14 / 100.0d > 0.5d) {
                    return true;
                }
            } else {
                throw new IllegalArgumentException("outXyz must have a length of 3.");
            }
        }
        return false;
    }

    public static boolean C(c cVar) {
        Boolean bool;
        try {
            bool = (Boolean) ((k) cVar.f7669V).a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        } catch (BufferUnderflowException e) {
            if (C1594a.f16229a.j(FlashAvailabilityBufferUnderflowQuirk.class) != null) {
                h.j("FlashAvailability", String.format("Device is known to throw an exception while checking flash availability. Flash is not available. [Manufacturer: %s, Model: %s, API Level: %d].", new Object[]{Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)}));
            } else {
                h.m("FlashAvailability", String.format("Exception thrown while checking for flash availability on device not known to throw exceptions during this check. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, API Level: %d].\nFlash is not available.", new Object[]{Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)}), e);
            }
            bool = Boolean.FALSE;
        }
        if (bool == null) {
            h.I("FlashAvailability", "Characteristics did not contain key FLASH_INFO_AVAILABLE. Flash is not available.");
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static int F(float f8, int i, int i8) {
        return C1195a.b(C1195a.d(i8, Math.round(((float) Color.alpha(i8)) * f8)), i);
    }

    public static String[] G(Context context, String str, Bundle bundle) {
        if (!bundle.containsKey(str)) {
            return new String[0];
        }
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            h.I("QuirkSettingsLoader", "Resource ID not found for key: ".concat(str));
            return new String[0];
        }
        try {
            return context.getResources().getStringArray(i);
        } catch (Resources.NotFoundException e) {
            h.J("QuirkSettingsLoader", "Quirk class names resource not found: " + i, e);
            return new String[0];
        }
    }

    public static e H() {
        if (h.f1406U != null) {
            return h.f1406U;
        }
        synchronized (h.class) {
            try {
                if (h.f1406U == null) {
                    h.f1406U = new e(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return h.f1406U;
    }

    public static o I(String str) {
        int i;
        String str2;
        f.e(str, "statusLine");
        boolean a02 = l.a0(str, "HTTP/1.", false);
        s sVar = s.HTTP_1_0;
        if (a02) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt == 1) {
                    sVar = s.HTTP_1_1;
                } else {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
            }
        } else if (l.a0(str, "ICY ", false)) {
            i = 4;
        } else {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int i8 = i + 3;
        if (str.length() >= i8) {
            try {
                String substring = str.substring(i, i8);
                f.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                int parseInt = Integer.parseInt(substring);
                if (str.length() <= i8) {
                    str2 = "";
                } else if (str.charAt(i8) == ' ') {
                    str2 = str.substring(i + 4);
                    f.d(str2, "this as java.lang.String).substring(startIndex)");
                } else {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                return new o((Object) sVar, parseInt, str2, 9);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
        } else {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public static String J(X509Certificate x509Certificate) {
        StringBuilder sb = new StringBuilder("sha256/");
        i iVar = i.f13217X;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        f.d(encoded, "publicKey.encoded");
        int length = encoded.length;
        int i = 0;
        d.c((long) encoded.length, (long) 0, (long) length);
        E.e.g(length, encoded.length);
        byte[] copyOfRange = Arrays.copyOfRange(encoded, 0, length);
        f.d(copyOfRange, "copyOfRange(...)");
        i iVar2 = new i(copyOfRange);
        MessageDigest instance = MessageDigest.getInstance("SHA-256");
        instance.update(copyOfRange, 0, iVar2.a());
        byte[] digest = instance.digest();
        f.b(digest);
        new i(digest);
        byte[] bArr = C1181a.f13201a;
        f.e(bArr, "map");
        byte[] bArr2 = new byte[(((digest.length + 2) / 3) * 4)];
        int length2 = digest.length - (digest.length % 3);
        int i8 = 0;
        while (i < length2) {
            byte b8 = digest[i];
            int i9 = i + 2;
            byte b9 = digest[i + 1];
            i += 3;
            byte b10 = digest[i9];
            bArr2[i8] = bArr[(b8 & Pdu.MANUFACTURER_DATA_PDU_TYPE) >> 2];
            bArr2[i8 + 1] = bArr[((b8 & 3) << 4) | ((b9 & Pdu.MANUFACTURER_DATA_PDU_TYPE) >> 4)];
            int i10 = i8 + 3;
            bArr2[i8 + 2] = bArr[((b9 & 15) << 2) | ((b10 & Pdu.MANUFACTURER_DATA_PDU_TYPE) >> 6)];
            i8 += 4;
            bArr2[i10] = bArr[b10 & 63];
        }
        int length3 = digest.length - length2;
        if (length3 == 1) {
            byte b11 = digest[i];
            bArr2[i8] = bArr[(b11 & Pdu.MANUFACTURER_DATA_PDU_TYPE) >> 2];
            bArr2[1 + i8] = bArr[(b11 & 3) << 4];
            bArr2[2 + i8] = 61;
            bArr2[i8 + 3] = 61;
        } else if (length3 == 2) {
            int i11 = i + 1;
            byte b12 = digest[i];
            byte b13 = digest[i11];
            bArr2[i8] = bArr[(b12 & Pdu.MANUFACTURER_DATA_PDU_TYPE) >> 2];
            bArr2[1 + i8] = bArr[((b12 & 3) << 4) | ((b13 & Pdu.MANUFACTURER_DATA_PDU_TYPE) >> 4)];
            bArr2[i8 + 2] = bArr[(b13 & 15) << 2];
            bArr2[i8 + 3] = 61;
        }
        sb.append(new String(bArr2, a.f6191a));
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.HashSet K(java.lang.String[] r8) {
        /*
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            int r1 = r8.length
            r2 = 0
        L_0x0007:
            if (r2 >= r1) goto L_0x004a
            r3 = r8[r2]
            java.lang.String r4 = "QuirkSettingsLoader"
            java.lang.Class r5 = java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException -> 0x002f }
            java.lang.Class<D.o0> r6 = D.C0061o0.class
            boolean r6 = r6.isAssignableFrom(r5)     // Catch:{ ClassNotFoundException -> 0x002f }
            if (r6 == 0) goto L_0x001a
            goto L_0x0042
        L_0x001a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x002f }
            r5.<init>()     // Catch:{ ClassNotFoundException -> 0x002f }
            r5.append(r3)     // Catch:{ ClassNotFoundException -> 0x002f }
            java.lang.String r6 = " does not implement the Quirk interface."
            r5.append(r6)     // Catch:{ ClassNotFoundException -> 0x002f }
            java.lang.String r5 = r5.toString()     // Catch:{ ClassNotFoundException -> 0x002f }
            F.h.I(r4, r5)     // Catch:{ ClassNotFoundException -> 0x002f }
            goto L_0x0041
        L_0x002f:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Class not found: "
            r6.<init>(r7)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            F.h.J(r4, r3, r5)
        L_0x0041:
            r5 = 0
        L_0x0042:
            if (r5 == 0) goto L_0x0047
            r0.add(r5)
        L_0x0047:
            int r2 = r2 + 1
            goto L_0x0007
        L_0x004a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: D7.b.K(java.lang.String[]):java.util.HashSet");
    }

    public static void P(q qVar, p pVar) {
        int i;
        g.D(pVar);
        p pVar2 = pVar;
        int i8 = 0;
        while (pVar2 != null) {
            p pVar3 = pVar2.f4578U;
            if (pVar3 != null) {
                i = pVar3.g();
            } else {
                i = 0;
            }
            p p3 = pVar2.p();
            qVar.r0(pVar2, i8);
            if (pVar3 != null && pVar2.f4578U == null) {
                if (i == pVar3.g()) {
                    pVar2 = (p) pVar3.k().get(pVar2.f4579V);
                } else if (p3 == null) {
                    i8--;
                    pVar2 = pVar3;
                } else {
                    pVar2 = p3;
                }
            }
            if (pVar2.g() > 0) {
                pVar2 = (p) pVar2.k().get(0);
                i8++;
            } else {
                while (pVar2.p() == null && i8 > 0) {
                    qVar.n0(pVar2, i8);
                    pVar2 = pVar2.f4578U;
                    i8--;
                }
                qVar.n0(pVar2, i8);
                if (pVar2 != pVar) {
                    pVar2 = pVar2.p();
                } else {
                    return;
                }
            }
        }
    }

    public static p0 a(Context context, Bundle bundle) {
        boolean z = bundle.getBoolean("androidx.camera.core.quirks.DEFAULT_QUIRK_ENABLED", true);
        String[] G8 = G(context, "androidx.camera.core.quirks.FORCE_ENABLED", bundle);
        String[] G9 = G(context, "androidx.camera.core.quirks.FORCE_DISABLED", bundle);
        h.j("QuirkSettingsLoader", "Loaded quirk settings from metadata:");
        h.j("QuirkSettingsLoader", "  KEY_DEFAULT_QUIRK_ENABLED = " + z);
        h.j("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_ENABLED = " + Arrays.toString(G8));
        h.j("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_DISABLED = " + Arrays.toString(G9));
        return new p0(z, new HashSet(K(G8)), new HashSet(K(G9)));
    }

    public static void e(String str, long j7) {
        if (j7 < 0) {
            throw new IllegalArgumentException(str + " (" + j7 + ") must be >= 0");
        }
    }

    public static byte[] k(C0185n nVar) {
        int readUnsignedShort;
        if (nVar.readableBytes() < 2 || nVar.readableBytes() < (readUnsignedShort = nVar.readUnsignedShort())) {
            return null;
        }
        byte[] bArr = new byte[readUnsignedShort];
        nVar.readBytes(bArr);
        return bArr;
    }

    public static F.a l() {
        if (F.a.f1390V != null) {
            return F.a.f1390V;
        }
        synchronized (F.a.class) {
            try {
                if (F.a.f1390V == null) {
                    F.a.f1390V = new F.a(0);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return F.a.f1390V;
    }

    public static int n(Context context, int i, int i8) {
        Integer num;
        int i9;
        TypedValue B8 = android.support.v4.media.session.b.B(context, i);
        if (B8 != null) {
            int i10 = B8.resourceId;
            if (i10 != 0) {
                i9 = j0.f.b(context, i10);
            } else {
                i9 = B8.data;
            }
            num = Integer.valueOf(i9);
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return i8;
    }

    public static int o(View view, int i) {
        Context context = view.getContext();
        TypedValue D8 = android.support.v4.media.session.b.D(i, view.getContext(), view.getClass().getCanonicalName());
        int i8 = D8.resourceId;
        if (i8 != 0) {
            return j0.f.b(context, i8);
        }
        return D8.data;
    }

    public static Set p() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", (Class[]) null).invoke((Object) null, (Object[]) null);
            if (invoke == null) {
                return Collections.emptySet();
            }
            Set<Object> set = (Set) invoke;
            for (Object obj : set) {
                if (!(obj instanceof int[])) {
                    return Collections.emptySet();
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.emptySet();
        }
    }

    public static final Class s(U6.b bVar) {
        f.e(bVar, "<this>");
        Class a8 = ((P6.c) bVar).a();
        if (!a8.isPrimitive()) {
            return a8;
        }
        String name = a8.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (!name.equals("double")) {
                    return a8;
                }
                return Double.class;
            case 104431:
                if (!name.equals("int")) {
                    return a8;
                }
                return Integer.class;
            case 3039496:
                if (!name.equals("byte")) {
                    return a8;
                }
                return Byte.class;
            case 3052374:
                if (!name.equals("char")) {
                    return a8;
                }
                return Character.class;
            case 3327612:
                if (!name.equals("long")) {
                    return a8;
                }
                return Long.class;
            case 3625364:
                if (!name.equals("void")) {
                    return a8;
                }
                return Void.class;
            case 64711720:
                if (!name.equals("boolean")) {
                    return a8;
                }
                return Boolean.class;
            case 97526364:
                if (!name.equals("float")) {
                    return a8;
                }
                return Float.class;
            case 109413500:
                if (!name.equals("short")) {
                    return a8;
                }
                return Short.class;
            default:
                return a8;
        }
    }

    public static F.f y() {
        if (F.f.f1400W != null) {
            return F.f.f1400W;
        }
        synchronized (F.f.class) {
            try {
                if (F.f.f1400W == null) {
                    F.f.f1400W = new F.f();
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return F.f.f1400W;
    }

    public static F.g z() {
        if (F.g.f1403W != null) {
            return F.g.f1403W;
        }
        synchronized (F.g.class) {
            try {
                if (F.g.f1403W == null) {
                    F.g.f1403W = new F.g();
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return F.g.f1403W;
    }

    public abstract boolean B(float f8);

    public abstract boolean D(View view);

    public abstract boolean E(float f8, float f9);

    public void L() {
    }

    public abstract boolean M(View view, float f8);

    public abstract void N();

    public abstract void O();

    public abstract void Q(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i8);

    public abstract int b(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float c(int i);

    public boolean d() {
        return false;
    }

    public abstract Typeface f(Context context, l0.e eVar, Resources resources, int i);

    public abstract Typeface g(Context context, C1374h[] hVarArr, int i);

    public Typeface h(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface i(Context context, InputStream inputStream) {
        File s8 = G5.s.s(context);
        if (s8 == null) {
            return null;
        }
        try {
            if (!G5.s.h(s8, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(s8.getPath());
            s8.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            s8.delete();
        }
    }

    public Typeface j(Context context, Resources resources, int i, String str, int i8) {
        File s8 = G5.s.s(context);
        if (s8 == null) {
            return null;
        }
        try {
            if (!G5.s.g(s8, resources, i)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(s8.getPath());
            s8.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            s8.delete();
        }
    }

    public C1374h m(C1374h[] hVarArr, int i) {
        int i8;
        boolean z;
        int i9;
        new C1048n(6);
        if ((i & 1) == 0) {
            i8 = 400;
        } else {
            i8 = 700;
        }
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        C1374h hVar = null;
        int i10 = Integer.MAX_VALUE;
        for (C1374h hVar2 : hVarArr) {
            int abs = Math.abs(hVar2.f14811c - i8) * 2;
            if (hVar2.f14812d == z) {
                i9 = 0;
            } else {
                i9 = 1;
            }
            int i11 = abs + i9;
            if (hVar == null || i10 > i11) {
                hVar = hVar2;
                i10 = i11;
            }
        }
        return hVar;
    }

    public abstract int q();

    public abstract int r();

    public abstract int t();

    public abstract int u();

    public abstract int v(View view);

    public abstract int w(CoordinatorLayout coordinatorLayout);

    public abstract int x();
}
