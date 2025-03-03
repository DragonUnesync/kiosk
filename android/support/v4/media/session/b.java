package android.support.v4.media.session;

import A.h;
import D.C0036c;
import D.C0048i;
import D.C0053k0;
import D.C0064s;
import D.I;
import D.N;
import P6.f;
import W6.a;
import W6.d;
import W6.l;
import android.content.Context;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.hardware.Camera;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.util.Range;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import de.ozerov.fully.K2;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.FileNotFoundException;
import java.net.IDN;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import m.C1182a;
import org.altbeacon.bluetooth.Pdu;
import y.C1610b;

public abstract class b {
    public static TypedValue B(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean C(Context context, int i, boolean z) {
        TypedValue B8 = B(context, i);
        if (B8 == null || B8.type != 18) {
            return z;
        }
        if (B8.data != 0) {
            return true;
        }
        return false;
    }

    public static TypedValue D(int i, Context context, String str) {
        TypedValue B8 = B(context, i);
        if (B8 != null) {
            return B8;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i)}));
    }

    /* JADX WARNING: type inference failed for: r9v8, types: [l7.f, java.lang.Object] */
    public static final String N(String str) {
        InetAddress inetAddress;
        f.e(str, "<this>");
        int i = 0;
        int i8 = -1;
        if (d.c0(str, ":")) {
            if (!l.a0(str, "[", false) || !str.endsWith("]")) {
                inetAddress = j(0, str.length(), str);
            } else {
                inetAddress = j(1, str.length() - 1, str);
            }
            if (inetAddress == null) {
                return null;
            }
            byte[] address = inetAddress.getAddress();
            if (address.length == 16) {
                int i9 = 0;
                int i10 = 0;
                while (i9 < address.length) {
                    int i11 = i9;
                    while (i11 < 16 && address[i11] == 0 && address[i11 + 1] == 0) {
                        i11 += 2;
                    }
                    int i12 = i11 - i9;
                    if (i12 > i10 && i12 >= 4) {
                        i8 = i9;
                        i10 = i12;
                    }
                    i9 = i11 + 2;
                }
                ? obj = new Object();
                while (i < address.length) {
                    if (i == i8) {
                        obj.z(58);
                        i += i10;
                        if (i == 16) {
                            obj.z(58);
                        }
                    } else {
                        if (i > 0) {
                            obj.z(58);
                        }
                        byte b8 = address[i];
                        byte[] bArr = Z6.b.f6982a;
                        obj.A((long) (((b8 & 255) << 8) | (address[i + 1] & Pdu.MANUFACTURER_DATA_PDU_TYPE)));
                        i += 2;
                    }
                }
                return obj.s(obj.f13216V, a.f6191a);
            } else if (address.length == 4) {
                return inetAddress.getHostAddress();
            } else {
                throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
            }
        } else {
            try {
                String ascii = IDN.toASCII(str);
                f.d(ascii, "toASCII(host)");
                Locale locale = Locale.US;
                f.d(locale, "US");
                String lowerCase = ascii.toLowerCase(locale);
                f.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (int i13 = 0; i13 < length; i13++) {
                    char charAt = lowerCase.charAt(i13);
                    if (f.f(charAt, 31) <= 0) {
                        return null;
                    }
                    if (f.f(charAt, 127) >= 0) {
                        return null;
                    }
                    if (d.f0(" #%/:?@[\\]", charAt, 0, false, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    public static String O(int i) {
        char[] cArr = new char[2];
        for (int i8 = 0; i8 < 2; i8++) {
            cArr[1 - i8] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    public static String P(int i) {
        char[] cArr = new char[4];
        for (int i8 = 0; i8 < 4; i8++) {
            cArr[3 - i8] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    public static String Q(int i) {
        char[] cArr = new char[8];
        for (int i8 = 0; i8 < 8; i8++) {
            cArr[7 - i8] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    public static String R(long j7) {
        char[] cArr = new char[16];
        for (int i = 0; i < 16; i++) {
            cArr[15 - i] = Character.forDigit(((int) j7) & 15, 16);
            j7 >>= 4;
        }
        return new String(cArr);
    }

    public static Bundle S(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(b.class.getClassLoader());
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public static int T(int i) {
        int i8 = i >> 7;
        int i9 = 0;
        while (i8 != 0) {
            i8 >>= 7;
            i9++;
        }
        return i9 + 1;
    }

    public static void U() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Must be called from the main thread.");
        }
    }

    public static void a(StringBuilder sb, Object obj, O6.l lVar) {
        boolean z;
        if (lVar != null) {
            sb.append((CharSequence) lVar.a(obj));
            return;
        }
        if (obj == null) {
            z = true;
        } else {
            z = obj instanceof CharSequence;
        }
        if (z) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append(String.valueOf(obj));
        }
    }

    public static void b(CaptureRequest.Builder builder, C0053k0 k0Var) {
        A.f c8 = h.e(k0Var).c();
        for (C0036c cVar : c8.x().J()) {
            CaptureRequest.Key key = cVar.f890c;
            try {
                builder.set(key, c8.x().b0(cVar));
            } catch (IllegalArgumentException unused) {
                F.h.l("Camera2CaptureRequestBuilder", "CaptureRequest.Key is not supported: " + key);
            }
        }
    }

    public static void c(CaptureRequest.Builder builder, int i, C1610b bVar) {
        Map map;
        if (i != 3 || !bVar.f16326a) {
            if (i != 4) {
                bVar.getClass();
            } else if (bVar.f16327b) {
                HashMap hashMap = new HashMap();
                hashMap.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 2);
                map = DesugarCollections.unmodifiableMap(hashMap);
            }
            map = Collections.emptyMap();
        } else {
            HashMap hashMap2 = new HashMap();
            hashMap2.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 1);
            map = DesugarCollections.unmodifiableMap(hashMap2);
        }
        for (Map.Entry entry : map.entrySet()) {
            builder.set((CaptureRequest.Key) entry.getKey(), entry.getValue());
        }
    }

    public static CaptureRequest d(I i, CameraDevice cameraDevice, HashMap hashMap, boolean z, C1610b bVar) {
        CaptureRequest.Builder builder;
        int i8;
        C0064s sVar;
        if (cameraDevice == null) {
            return null;
        }
        List<N> unmodifiableList = DesugarCollections.unmodifiableList(i.f788a);
        ArrayList arrayList = new ArrayList();
        for (N n4 : unmodifiableList) {
            Surface surface = (Surface) hashMap.get(n4);
            if (surface != null) {
                arrayList.add(surface);
            } else {
                throw new IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        int i9 = Build.VERSION.SDK_INT;
        int i10 = i.f790c;
        if (i9 < 23 || i10 != 5 || (sVar = i.f793g) == null || !(sVar.e() instanceof TotalCaptureResult)) {
            F.h.j("Camera2CaptureRequestBuilder", "createCaptureRequest");
            if (i10 == 5) {
                if (z) {
                    i8 = 1;
                } else {
                    i8 = 2;
                }
                builder = cameraDevice.createCaptureRequest(i8);
            } else {
                builder = cameraDevice.createCaptureRequest(i10);
            }
        } else {
            F.h.j("Camera2CaptureRequestBuilder", "createReprocessCaptureRequest");
            builder = I.a.b(cameraDevice, (TotalCaptureResult) sVar.e());
        }
        c(builder, i10, bVar);
        C0036c cVar = I.f787j;
        Object obj = C0048i.f903f;
        C0053k0 k0Var = i.f789b;
        try {
            obj = k0Var.b0(cVar);
        } catch (IllegalArgumentException unused) {
        }
        Range range = (Range) obj;
        Objects.requireNonNull(range);
        Object obj2 = C0048i.f903f;
        if (!range.equals(obj2)) {
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
            try {
                obj2 = k0Var.b0(I.f787j);
            } catch (IllegalArgumentException unused2) {
            }
            Range range2 = (Range) obj2;
            Objects.requireNonNull(range2);
            builder.set(key, range2);
        }
        if (i.a() == 1 || i.b() == 1) {
            builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
        } else if (i.a() == 2) {
            builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 2);
        } else if (i.b() == 2) {
            builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
        }
        C0036c cVar2 = I.f786h;
        TreeMap treeMap = k0Var.f920U;
        if (treeMap.containsKey(cVar2)) {
            builder.set(CaptureRequest.JPEG_ORIENTATION, (Integer) k0Var.b0(cVar2));
        }
        C0036c cVar3 = I.i;
        if (treeMap.containsKey(cVar3)) {
            builder.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) k0Var.b0(cVar3)).byteValue()));
        }
        b(builder, k0Var);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            builder.addTarget((Surface) it.next());
        }
        builder.setTag(i.f792f);
        return builder.build();
    }

    public static CaptureRequest e(I i, CameraDevice cameraDevice, C1610b bVar) {
        if (cameraDevice == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder("template type = ");
        int i8 = i.f790c;
        sb.append(i8);
        F.h.j("Camera2CaptureRequestBuilder", sb.toString());
        CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(i8);
        c(createCaptureRequest, i8, bVar);
        b(createCaptureRequest, i.f789b);
        return createCaptureRequest.build();
    }

    public static int h(int i, int i8) {
        int i9 = i - i8;
        if (i9 > i8) {
            int i10 = i9;
            i9 = i8;
            i8 = i10;
        }
        int i11 = 1;
        int i12 = 1;
        while (i > i8) {
            i11 *= i;
            if (i12 <= i9) {
                i11 /= i12;
                i12++;
            }
            i--;
        }
        while (i12 <= i9) {
            i11 /= i12;
            i12++;
        }
        return i11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        g7.l.c(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        throw r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void i(android.content.Context r2, java.io.FilterOutputStream r3, android.net.Uri r4) {
        /*
            java.lang.String r0 = "context"
            P6.f.e(r2, r0)
            java.lang.String r0 = "uri"
            P6.f.e(r4, r0)
            android.content.ContentResolver r2 = r2.getContentResolver()
            java.io.InputStream r2 = r2.openInputStream(r4)
            if (r2 == 0) goto L_0x0033
            r4 = 8192(0x2000, float:1.14794E-41)
            byte[] r4 = new byte[r4]     // Catch:{ all -> 0x002c }
            int r0 = r2.read(r4)     // Catch:{ all -> 0x002c }
        L_0x001c:
            if (r0 < 0) goto L_0x0027
            r1 = 0
            r3.write(r4, r1, r0)     // Catch:{ all -> 0x002c }
            int r0 = r2.read(r4)     // Catch:{ all -> 0x002c }
            goto L_0x001c
        L_0x0027:
            r3 = 0
            g7.l.c(r2, r3)
            return
        L_0x002c:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x002e }
        L_0x002e:
            r4 = move-exception
            g7.l.c(r2, r3)
            throw r4
        L_0x0033:
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Could not open "
            r3.<init>(r0)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.b.i(android.content.Context, java.io.FilterOutputStream, android.net.Uri):void");
    }

    public static final InetAddress j(int i, int i8, String str) {
        int i9 = i8;
        String str2 = str;
        int i10 = 16;
        byte[] bArr = new byte[16];
        boolean z = false;
        int i11 = 0;
        int i12 = -1;
        int i13 = -1;
        int i14 = i;
        while (true) {
            if (i14 >= i9) {
                break;
            } else if (i11 == i10) {
                return null;
            } else {
                int i15 = i14 + 2;
                if (i15 > i9 || !l.Z(i14, str2, "::", z)) {
                    if (i11 != 0) {
                        if (l.Z(i14, str2, ":", z)) {
                            i14++;
                        } else {
                            if (l.Z(i14, str2, ".", z)) {
                                int i16 = i11 - 2;
                                int i17 = i16;
                                loop1:
                                while (true) {
                                    if (i13 < i9) {
                                        if (i17 == i10) {
                                            break;
                                        }
                                        if (i17 != i16) {
                                            if (str2.charAt(i13) != '.') {
                                                break;
                                            }
                                            i13++;
                                        }
                                        int i18 = i13;
                                        int i19 = 0;
                                        while (true) {
                                            if (i18 >= i9) {
                                                break;
                                            }
                                            char charAt = str2.charAt(i18);
                                            if (f.f(charAt, 48) >= 0 && f.f(charAt, 57) <= 0) {
                                                if ((i19 == 0 && i13 != i18) || (i19 = ((i19 * 10) + charAt) - 48) > 255) {
                                                    break loop1;
                                                }
                                                i18++;
                                            } else {
                                                break;
                                            }
                                        }
                                        if (i18 - i13 == 0) {
                                            break;
                                        }
                                        bArr[i17] = (byte) i19;
                                        i17++;
                                        i13 = i18;
                                        i10 = 16;
                                    } else if (i17 == i11 + 2) {
                                        i11 += 2;
                                    }
                                }
                            }
                            return null;
                        }
                    }
                    i13 = i14;
                } else if (i12 != -1) {
                    return null;
                } else {
                    i11 += 2;
                    i12 = i11;
                    if (i15 == i9) {
                        break;
                    }
                    i13 = i15;
                }
                i14 = i13;
                int i20 = 0;
                while (i14 < i9) {
                    int q7 = Z6.b.q(str2.charAt(i14));
                    if (q7 == -1) {
                        break;
                    }
                    i20 = (i20 << 4) + q7;
                    i14++;
                }
                int i21 = i14 - i13;
                if (i21 == 0 || i21 > 4) {
                    return null;
                }
                int i22 = i11 + 1;
                bArr[i11] = (byte) ((i20 >>> 8) & 255);
                i11 += 2;
                bArr[i22] = (byte) (i20 & 255);
                i10 = 16;
                z = false;
            }
        }
        if (i11 != 16) {
            if (i12 == -1) {
                return null;
            }
            int i23 = i11 - i12;
            System.arraycopy(bArr, i12, bArr, 16 - i23, i23);
            Arrays.fill(bArr, i12, (16 - i11) + i12, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    public static int l(int i) {
        boolean z;
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras == 0) {
            Log.w("android.support.v4.media.session.b", "No cameras!");
            return -1;
        }
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i = 0;
            while (i < numberOfCameras) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i, cameraInfo);
                if (cameraInfo.facing == 0) {
                    break;
                }
                i++;
            }
        }
        if (i < numberOfCameras) {
            return i;
        }
        if (z) {
            return -1;
        }
        return 0;
    }

    public static String n(Context context, Uri uri) {
        int columnIndex;
        f.e(context, "context");
        f.e(uri, "uri");
        Cursor query = context.getContentResolver().query(uri, new String[]{"_display_name"}, (String) null, (String[]) null, (String) null);
        if (query != null) {
            try {
                if (!query.moveToFirst() || (columnIndex = query.getColumnIndex("_display_name")) == -1) {
                    query.close();
                } else {
                    String string = query.getString(columnIndex);
                    f.d(string, "getString(...)");
                    return string;
                }
            } finally {
                query.close();
            }
        }
        throw new FileNotFoundException("Could not resolve filename of " + uri);
    }

    public static int o(int[] iArr, int i, boolean z) {
        int[] iArr2 = iArr;
        int i8 = i;
        int i9 = 0;
        for (int i10 : iArr2) {
            i9 += i10;
        }
        int length = iArr2.length;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = length - 1;
            if (i11 >= i14) {
                return i12;
            }
            int i15 = 1 << i11;
            i13 |= i15;
            int i16 = 1;
            while (i16 < iArr2[i11]) {
                int i17 = i9 - i16;
                int i18 = length - i11;
                int i19 = i18 - 2;
                int h5 = h(i17 - 1, i19);
                if (z && i13 == 0) {
                    int i20 = i18 - 1;
                    if (i17 - i20 >= i20) {
                        h5 -= h(i17 - i18, i19);
                    }
                }
                if (i18 - 1 > 1) {
                    int i21 = i17 - i19;
                    int i22 = 0;
                    while (i21 > i8) {
                        i22 += h((i17 - i21) - 1, i18 - 3);
                        i21--;
                        int[] iArr3 = iArr;
                    }
                    h5 -= (i14 - i11) * i22;
                } else if (i17 > i8) {
                    h5--;
                }
                i12 += h5;
                i16++;
                i13 &= ~i15;
                iArr2 = iArr;
            }
            i9 -= i16;
            i11++;
            iArr2 = iArr;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int r(java.lang.String r23) {
        /*
            r0 = 21
            r1 = 20
            r2 = 19
            r3 = 18
            r4 = 17
            r5 = 16
            r6 = 15
            r7 = 14
            r8 = 13
            r9 = 12
            r12 = 9
            r13 = 8
            r14 = 7
            r15 = 6
            r16 = 5
            r17 = 4
            r18 = 3
            r19 = 1
            r20 = 0
            r21 = -1
            if (r23 != 0) goto L_0x0029
            return r21
        L_0x0029:
            java.lang.String r11 = M0.I.o(r23)
            r11.getClass()
            int r22 = r11.hashCode()
            switch(r22) {
                case -2123537834: goto L_0x01d5;
                case -1662384011: goto L_0x01c9;
                case -1662384007: goto L_0x01bd;
                case -1662095187: goto L_0x01b1;
                case -1606874997: goto L_0x01a5;
                case -1487656890: goto L_0x0199;
                case -1487464693: goto L_0x018d;
                case -1487464690: goto L_0x0181;
                case -1487394660: goto L_0x0173;
                case -1487018032: goto L_0x0165;
                case -1248337486: goto L_0x0157;
                case -1079884372: goto L_0x0149;
                case -1004728940: goto L_0x013b;
                case -879272239: goto L_0x012d;
                case -879258763: goto L_0x011f;
                case -387023398: goto L_0x0111;
                case -43467528: goto L_0x0103;
                case 13915911: goto L_0x00f5;
                case 187078296: goto L_0x00e7;
                case 187078297: goto L_0x00d9;
                case 187078669: goto L_0x00cb;
                case 187090232: goto L_0x00bd;
                case 187091926: goto L_0x00af;
                case 187099443: goto L_0x00a2;
                case 1331848029: goto L_0x0095;
                case 1503095341: goto L_0x0088;
                case 1504578661: goto L_0x007b;
                case 1504619009: goto L_0x006e;
                case 1504824762: goto L_0x0061;
                case 1504831518: goto L_0x0054;
                case 1505118770: goto L_0x0047;
                case 2039520277: goto L_0x003a;
                default: goto L_0x0037;
            }
        L_0x0037:
            r10 = -1
            goto L_0x01e0
        L_0x003a:
            java.lang.String r10 = "video/x-matroska"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0043
            goto L_0x0037
        L_0x0043:
            r10 = 31
            goto L_0x01e0
        L_0x0047:
            java.lang.String r10 = "audio/webm"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0050
            goto L_0x0037
        L_0x0050:
            r10 = 30
            goto L_0x01e0
        L_0x0054:
            java.lang.String r10 = "audio/mpeg"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x005d
            goto L_0x0037
        L_0x005d:
            r10 = 29
            goto L_0x01e0
        L_0x0061:
            java.lang.String r10 = "audio/midi"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x006a
            goto L_0x0037
        L_0x006a:
            r10 = 28
            goto L_0x01e0
        L_0x006e:
            java.lang.String r10 = "audio/flac"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0077
            goto L_0x0037
        L_0x0077:
            r10 = 27
            goto L_0x01e0
        L_0x007b:
            java.lang.String r10 = "audio/eac3"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0084
            goto L_0x0037
        L_0x0084:
            r10 = 26
            goto L_0x01e0
        L_0x0088:
            java.lang.String r10 = "audio/3gpp"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0091
            goto L_0x0037
        L_0x0091:
            r10 = 25
            goto L_0x01e0
        L_0x0095:
            java.lang.String r10 = "video/mp4"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x009e
            goto L_0x0037
        L_0x009e:
            r10 = 24
            goto L_0x01e0
        L_0x00a2:
            java.lang.String r10 = "audio/wav"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00ab
            goto L_0x0037
        L_0x00ab:
            r10 = 23
            goto L_0x01e0
        L_0x00af:
            java.lang.String r10 = "audio/ogg"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00b9
            goto L_0x0037
        L_0x00b9:
            r10 = 22
            goto L_0x01e0
        L_0x00bd:
            java.lang.String r10 = "audio/mp4"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00c7
            goto L_0x0037
        L_0x00c7:
            r10 = 21
            goto L_0x01e0
        L_0x00cb:
            java.lang.String r10 = "audio/amr"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00d5
            goto L_0x0037
        L_0x00d5:
            r10 = 20
            goto L_0x01e0
        L_0x00d9:
            java.lang.String r10 = "audio/ac4"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00e3
            goto L_0x0037
        L_0x00e3:
            r10 = 19
            goto L_0x01e0
        L_0x00e7:
            java.lang.String r10 = "audio/ac3"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00f1
            goto L_0x0037
        L_0x00f1:
            r10 = 18
            goto L_0x01e0
        L_0x00f5:
            java.lang.String r10 = "video/x-flv"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00ff
            goto L_0x0037
        L_0x00ff:
            r10 = 17
            goto L_0x01e0
        L_0x0103:
            java.lang.String r10 = "application/webm"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x010d
            goto L_0x0037
        L_0x010d:
            r10 = 16
            goto L_0x01e0
        L_0x0111:
            java.lang.String r10 = "audio/x-matroska"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x011b
            goto L_0x0037
        L_0x011b:
            r10 = 15
            goto L_0x01e0
        L_0x011f:
            java.lang.String r10 = "image/png"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0129
            goto L_0x0037
        L_0x0129:
            r10 = 14
            goto L_0x01e0
        L_0x012d:
            java.lang.String r10 = "image/bmp"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0137
            goto L_0x0037
        L_0x0137:
            r10 = 13
            goto L_0x01e0
        L_0x013b:
            java.lang.String r10 = "text/vtt"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0145
            goto L_0x0037
        L_0x0145:
            r10 = 12
            goto L_0x01e0
        L_0x0149:
            java.lang.String r10 = "video/x-msvideo"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0153
            goto L_0x0037
        L_0x0153:
            r10 = 11
            goto L_0x01e0
        L_0x0157:
            java.lang.String r10 = "application/mp4"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0161
            goto L_0x0037
        L_0x0161:
            r10 = 10
            goto L_0x01e0
        L_0x0165:
            java.lang.String r10 = "image/webp"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x016f
            goto L_0x0037
        L_0x016f:
            r10 = 9
            goto L_0x01e0
        L_0x0173:
            java.lang.String r10 = "image/jpeg"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x017d
            goto L_0x0037
        L_0x017d:
            r10 = 8
            goto L_0x01e0
        L_0x0181:
            java.lang.String r10 = "image/heif"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x018b
            goto L_0x0037
        L_0x018b:
            r10 = 7
            goto L_0x01e0
        L_0x018d:
            java.lang.String r10 = "image/heic"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0197
            goto L_0x0037
        L_0x0197:
            r10 = 6
            goto L_0x01e0
        L_0x0199:
            java.lang.String r10 = "image/avif"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x01a3
            goto L_0x0037
        L_0x01a3:
            r10 = 5
            goto L_0x01e0
        L_0x01a5:
            java.lang.String r10 = "audio/amr-wb"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x01af
            goto L_0x0037
        L_0x01af:
            r10 = 4
            goto L_0x01e0
        L_0x01b1:
            java.lang.String r10 = "video/webm"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x01bb
            goto L_0x0037
        L_0x01bb:
            r10 = 3
            goto L_0x01e0
        L_0x01bd:
            java.lang.String r10 = "video/mp2t"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x01c7
            goto L_0x0037
        L_0x01c7:
            r10 = 2
            goto L_0x01e0
        L_0x01c9:
            java.lang.String r10 = "video/mp2p"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x01d3
            goto L_0x0037
        L_0x01d3:
            r10 = 1
            goto L_0x01e0
        L_0x01d5:
            java.lang.String r10 = "audio/eac3-joc"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x01df
            goto L_0x0037
        L_0x01df:
            r10 = 0
        L_0x01e0:
            switch(r10) {
                case 0: goto L_0x01fc;
                case 1: goto L_0x01f9;
                case 2: goto L_0x01f6;
                case 3: goto L_0x01f5;
                case 4: goto L_0x01f4;
                case 5: goto L_0x01f3;
                case 6: goto L_0x01f2;
                case 7: goto L_0x01f2;
                case 8: goto L_0x01f1;
                case 9: goto L_0x01f0;
                case 10: goto L_0x01ef;
                case 11: goto L_0x01ee;
                case 12: goto L_0x01ed;
                case 13: goto L_0x01ec;
                case 14: goto L_0x01eb;
                case 15: goto L_0x01f5;
                case 16: goto L_0x01f5;
                case 17: goto L_0x01ea;
                case 18: goto L_0x01fc;
                case 19: goto L_0x01e9;
                case 20: goto L_0x01f4;
                case 21: goto L_0x01ef;
                case 22: goto L_0x01e8;
                case 23: goto L_0x01e7;
                case 24: goto L_0x01ef;
                case 25: goto L_0x01f4;
                case 26: goto L_0x01fc;
                case 27: goto L_0x01e6;
                case 28: goto L_0x01e5;
                case 29: goto L_0x01e4;
                case 30: goto L_0x01f5;
                case 31: goto L_0x01f5;
                default: goto L_0x01e3;
            }
        L_0x01e3:
            return r21
        L_0x01e4:
            return r14
        L_0x01e5:
            return r6
        L_0x01e6:
            return r17
        L_0x01e7:
            return r9
        L_0x01e8:
            return r12
        L_0x01e9:
            return r19
        L_0x01ea:
            return r16
        L_0x01eb:
            return r4
        L_0x01ec:
            return r2
        L_0x01ed:
            return r8
        L_0x01ee:
            return r5
        L_0x01ef:
            return r13
        L_0x01f0:
            return r3
        L_0x01f1:
            return r7
        L_0x01f2:
            return r1
        L_0x01f3:
            return r0
        L_0x01f4:
            return r18
        L_0x01f5:
            return r15
        L_0x01f6:
            r0 = 11
            return r0
        L_0x01f9:
            r0 = 10
            return r0
        L_0x01fc:
            return r20
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.b.r(java.lang.String):int");
    }

    public static int s(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        if (lastPathSegment.endsWith(".avi")) {
            return 16;
        }
        if (lastPathSegment.endsWith(".png")) {
            return 17;
        }
        if (lastPathSegment.endsWith(".webp")) {
            return 18;
        }
        if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
            return 19;
        }
        if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
            return 20;
        }
        if (lastPathSegment.endsWith(".avif")) {
            return 21;
        }
        return -1;
    }

    public static boolean u(Uri uri) {
        if (uri == null || !"content".equals(uri.getScheme()) || !"media".equals(uri.getAuthority())) {
            return false;
        }
        return true;
    }

    public static void w(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
    }

    public boolean A() {
        return false;
    }

    public abstract void E(Drawable drawable);

    public abstract void F(boolean z);

    public abstract void G(boolean z);

    public abstract void H(Drawable drawable);

    public abstract void I(boolean z);

    public abstract void J(CharSequence charSequence);

    public abstract void K(CharSequence charSequence);

    public abstract void L();

    public C1182a M(K2 k22) {
        return null;
    }

    public boolean f() {
        return false;
    }

    public abstract boolean g();

    public abstract void k(boolean z);

    public abstract int m();

    public abstract Context p();

    public abstract void q();

    public boolean t() {
        return false;
    }

    public abstract void v();

    public void x() {
    }

    public abstract boolean y(int i, KeyEvent keyEvent);

    public boolean z(KeyEvent keyEvent) {
        return false;
    }
}
