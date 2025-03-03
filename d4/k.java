package d4;

import B.C0003d;
import B6.a;
import G3.e;
import H3.C0103u;
import H3.L;
import H3.O;
import H3.i0;
import M0.C0123k;
import M0.J;
import P6.f;
import Q0.g;
import R0.h;
import Z1.c;
import android.content.ClipDescription;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.preference.PreferenceManager;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ImageView;
import d0.d;
import de.ozerov.fully.C0767r3;
import de.ozerov.fully.C0794w0;
import de.ozerov.fully.K2;
import de.ozerov.fully.MyApplication;
import de.ozerov.fully.P;
import de.ozerov.fully.P1;
import de.ozerov.fully.Q1;
import e0.C0818b;
import g7.C0996d;
import h1.Q;
import java.io.EOFException;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import k2.C1160q;
import m4.C1214b;
import n7.C1247a;
import o.C1292s;
import o.S;
import o4.C1318a;
import org.acra.ErrorReporter;
import org.acra.interaction.ReportInteraction;
import p1.l;
import p1.o;
import p1.r;
import p2.v;
import p4.C1342a;
import r7.C1395d;
import t2.C1419a;
import t2.C1420b;
import t2.C1424f;
import t2.C1425g;
import t2.p;
import u.C1476q;
import u.C1479t;
import v.i;
import v7.b;
import x0.C1600f;

public final class k implements a, C1600f {

    /* renamed from: Y  reason: collision with root package name */
    public static k f9764Y;

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f9765U;

    /* renamed from: V  reason: collision with root package name */
    public final Object f9766V;

    /* renamed from: W  reason: collision with root package name */
    public Object f9767W;

    /* renamed from: X  reason: collision with root package name */
    public Object f9768X;

    public /* synthetic */ k(int i, Object obj) {
        this.f9765U = i;
        this.f9766V = obj;
    }

    public static k K2(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new k(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public static void e(SharedPreferences.Editor editor, boolean z) {
        if (z) {
            try {
                editor.commit();
            } catch (Exception e) {
                g.x(e, new StringBuilder("Failed to save the setting due to "), "k");
            }
        } else {
            editor.apply();
        }
    }

    public static int h(int i, int i8, S3.a aVar) {
        int i9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            if (aVar.a(i + i10)) {
                i9 |= 1 << ((i8 - i10) - 1);
            }
        }
        return i9;
    }

    public Boolean A() {
        return Boolean.valueOf(((c) this.f9767W).n("detectIBeacons", false));
    }

    public Boolean A0() {
        return Boolean.valueOf(((c) this.f9767W).n("knoxDisableGoogleCrashReport", false));
    }

    public Boolean A1() {
        return Boolean.valueOf(((c) this.f9767W).n("nfcCardReader", false));
    }

    public String A2() {
        return N2(((c) this.f9767W).r("webOverlayUrl", ""));
    }

    public String B() {
        return O2(((c) this.f9767W).r("deviceName", ""));
    }

    public Boolean B0() {
        return Boolean.valueOf(((c) this.f9767W).n("knoxDisableHeadphoneState", false));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x014c, code lost:
        if (r1 != 35) goto L_0x037a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0150, code lost:
        r2.add(new android.util.Size(720, 720));
        r2.add(new android.util.Size(400, 400));
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01cb, code lost:
        r2.add(new android.util.Size(4128, 3096));
        r2.add(new android.util.Size(4128, 2322));
        r2.add(new android.util.Size(3088, 3088));
        r2.add(new android.util.Size(3264, 2448));
        r2.add(new android.util.Size(3264, 1836));
        r2.add(new android.util.Size(2048, 1536));
        r2.add(new android.util.Size(2048, 1152));
        r2.add(new android.util.Size(1920, 1080));
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0223, code lost:
        if (r1 != 35) goto L_0x037a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0227, code lost:
        r2.add(new android.util.Size(3264, 2448));
        r2.add(new android.util.Size(3264, 1836));
        r2.add(new android.util.Size(2448, 2448));
        r2.add(new android.util.Size(1920, 1920));
        r2.add(new android.util.Size(2048, 1536));
        r2.add(new android.util.Size(2048, 1152));
        r2.add(new android.util.Size(1920, 1080));
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x02a4, code lost:
        r2.add(new android.util.Size(4128, 3096));
        r2.add(new android.util.Size(4128, 2322));
        r2.add(new android.util.Size(3088, 3088));
        r2.add(new android.util.Size(3264, 2448));
        r2.add(new android.util.Size(3264, 1836));
        r2.add(new android.util.Size(2048, 1536));
        r2.add(new android.util.Size(2048, 1152));
        r2.add(new android.util.Size(1920, 1080));
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x02fc, code lost:
        if (r1 != 35) goto L_0x037a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0300, code lost:
        r2.add(new android.util.Size(2576, 1932));
        r2.add(new android.util.Size(2560, 1440));
        r2.add(new android.util.Size(1920, 1920));
        r2.add(new android.util.Size(2048, 1536));
        r2.add(new android.util.Size(2048, 1152));
        r2.add(new android.util.Size(1920, 1080));
        r2 = r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Size[] B1(int r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = 1
            r3 = 0
            java.lang.Object r4 = r0.f9768X
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r17)
            boolean r5 = r4.containsKey(r5)
            if (r5 == 0) goto L_0x0033
            java.lang.Integer r2 = java.lang.Integer.valueOf(r17)
            java.lang.Object r2 = r4.get(r2)
            android.util.Size[] r2 = (android.util.Size[]) r2
            if (r2 != 0) goto L_0x0022
            r1 = 0
            goto L_0x0032
        L_0x0022:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            java.lang.Object r1 = r4.get(r1)
            android.util.Size[] r1 = (android.util.Size[]) r1
            java.lang.Object r1 = r1.clone()
            android.util.Size[] r1 = (android.util.Size[]) r1
        L_0x0032:
            return r1
        L_0x0033:
            java.lang.Object r5 = r0.f9766V
            k2.q r5 = (k2.C1160q) r5
            android.util.Size[] r5 = r5.I(r1)
            if (r5 == 0) goto L_0x03a8
            int r6 = r5.length
            if (r6 != 0) goto L_0x0042
            goto L_0x03a8
        L_0x0042:
            java.lang.Object r6 = r0.f9767W
            v.i r6 = (v.i) r6
            r6.getClass()
            java.util.ArrayList r7 = new java.util.ArrayList
            java.util.List r5 = java.util.Arrays.asList(r5)
            r7.<init>(r5)
            java.lang.Object r5 = r6.f15852V
            androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk r5 = (androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk) r5
            r8 = 720(0x2d0, float:1.009E-42)
            r9 = 1080(0x438, float:1.513E-42)
            r10 = 1440(0x5a0, float:2.018E-42)
            r11 = 34
            if (r5 != 0) goto L_0x0061
            goto L_0x0097
        L_0x0061:
            if (r1 != r11) goto L_0x008b
            java.lang.String r5 = "motorola"
            java.lang.String r12 = android.os.Build.BRAND
            boolean r5 = r5.equalsIgnoreCase(r12)
            if (r5 == 0) goto L_0x008b
            java.lang.String r5 = "moto e5 play"
            java.lang.String r12 = android.os.Build.MODEL
            boolean r5 = r5.equalsIgnoreCase(r12)
            if (r5 == 0) goto L_0x008b
            android.util.Size r5 = new android.util.Size
            r5.<init>(r10, r9)
            android.util.Size r12 = new android.util.Size
            r13 = 960(0x3c0, float:1.345E-42)
            r12.<init>(r13, r8)
            r13 = 2
            android.util.Size[] r13 = new android.util.Size[r13]
            r13[r3] = r5
            r13[r2] = r12
            goto L_0x008d
        L_0x008b:
            android.util.Size[] r13 = new android.util.Size[r3]
        L_0x008d:
            int r5 = r13.length
            if (r5 <= 0) goto L_0x0097
            java.util.List r5 = java.util.Arrays.asList(r13)
            r7.addAll(r5)
        L_0x0097:
            java.lang.Object r5 = r6.f15853W
            G3.e r5 = (G3.e) r5
            r5.getClass()
            D.s0 r6 = x.C1594a.f16229a
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk> r12 = androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk.class
            D.o0 r6 = r6.j(r12)
            androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk r6 = (androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk) r6
            if (r6 != 0) goto L_0x00b1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            goto L_0x037a
        L_0x00b1:
            java.lang.String r5 = r5.f1639U
            java.lang.String r6 = android.os.Build.BRAND
            java.lang.String r12 = "OnePlus"
            boolean r13 = r12.equalsIgnoreCase(r6)
            if (r13 == 0) goto L_0x00c9
            java.lang.String r13 = "OnePlus6"
            java.lang.String r14 = android.os.Build.DEVICE
            boolean r13 = r13.equalsIgnoreCase(r14)
            if (r13 == 0) goto L_0x00c9
            r13 = 1
            goto L_0x00ca
        L_0x00c9:
            r13 = 0
        L_0x00ca:
            r14 = 3000(0xbb8, float:4.204E-42)
            r15 = 4000(0xfa0, float:5.605E-42)
            r2 = 3120(0xc30, float:4.372E-42)
            r3 = 4160(0x1040, float:5.83E-42)
            r10 = 256(0x100, float:3.59E-43)
            java.lang.String r9 = "0"
            if (r13 == 0) goto L_0x00f8
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L_0x00f5
            if (r1 != r10) goto L_0x00f5
            android.util.Size r5 = new android.util.Size
            r5.<init>(r3, r2)
            r6.add(r5)
            android.util.Size r2 = new android.util.Size
            r2.<init>(r15, r14)
            r6.add(r2)
        L_0x00f5:
            r2 = r6
            goto L_0x037a
        L_0x00f8:
            boolean r12 = r12.equalsIgnoreCase(r6)
            if (r12 == 0) goto L_0x0126
            java.lang.String r12 = "OnePlus6T"
            java.lang.String r13 = android.os.Build.DEVICE
            boolean r12 = r12.equalsIgnoreCase(r13)
            if (r12 == 0) goto L_0x0126
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L_0x00f5
            if (r1 != r10) goto L_0x00f5
            android.util.Size r5 = new android.util.Size
            r5.<init>(r3, r2)
            r6.add(r5)
            android.util.Size r2 = new android.util.Size
            r2.<init>(r15, r14)
            r6.add(r2)
            goto L_0x00f5
        L_0x0126:
            java.lang.String r2 = "HUAWEI"
            boolean r2 = r2.equalsIgnoreCase(r6)
            if (r2 == 0) goto L_0x013a
            java.lang.String r2 = "HWANE"
            java.lang.String r3 = android.os.Build.DEVICE
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L_0x013a
            r2 = 1
            goto L_0x013b
        L_0x013a:
            r2 = 0
        L_0x013b:
            r3 = 35
            if (r2 == 0) goto L_0x0164
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L_0x037a
            if (r1 == r11) goto L_0x0150
            if (r1 == r3) goto L_0x0150
            goto L_0x037a
        L_0x0150:
            android.util.Size r3 = new android.util.Size
            r3.<init>(r8, r8)
            r2.add(r3)
            android.util.Size r3 = new android.util.Size
            r5 = 400(0x190, float:5.6E-43)
            r3.<init>(r5, r5)
            r2.add(r3)
            goto L_0x037a
        L_0x0164:
            boolean r2 = androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk.c()
            java.lang.String r8 = "1"
            r13 = 3088(0xc10, float:4.327E-42)
            r14 = 4128(0x1020, float:5.785E-42)
            r15 = 2322(0x912, float:3.254E-42)
            r12 = 2448(0x990, float:3.43E-42)
            r10 = 1152(0x480, float:1.614E-42)
            if (r2 == 0) goto L_0x026d
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            boolean r6 = r5.equals(r9)
            if (r6 == 0) goto L_0x021b
            if (r1 == r11) goto L_0x01cb
            if (r1 != r3) goto L_0x037a
            android.util.Size r3 = new android.util.Size
            r3.<init>(r14, r15)
            r2.add(r3)
            android.util.Size r3 = new android.util.Size
            r3.<init>(r13, r13)
            r2.add(r3)
            android.util.Size r3 = new android.util.Size
            r5 = 3264(0xcc0, float:4.574E-42)
            r3.<init>(r5, r12)
            r2.add(r3)
            android.util.Size r3 = new android.util.Size
            r6 = 1836(0x72c, float:2.573E-42)
            r3.<init>(r5, r6)
            r2.add(r3)
            android.util.Size r3 = new android.util.Size
            r5 = 2048(0x800, float:2.87E-42)
            r6 = 1536(0x600, float:2.152E-42)
            r3.<init>(r5, r6)
            r2.add(r3)
            android.util.Size r3 = new android.util.Size
            r3.<init>(r5, r10)
            r2.add(r3)
            android.util.Size r3 = new android.util.Size
            r5 = 1080(0x438, float:1.513E-42)
            r6 = 1920(0x780, float:2.69E-42)
            r3.<init>(r6, r5)
            r2.add(r3)
            goto L_0x037a
        L_0x01cb:
            android.util.Size r3 = new android.util.Size
            r5 = 3096(0xc18, float:4.338E-42)
            r3.<init>(r14, r5)
            r2.add(r3)
            android.util.Size r3 = new android.util.Size
            r3.<init>(r14, r15)
            r2.add(r3)
            android.util.Size r3 = new android.util.Size
            r3.<init>(r13, r13)
            r2.add(r3)
            android.util.Size r3 = new android.util.Size
            r5 = 3264(0xcc0, float:4.574E-42)
            r3.<init>(r5, r12)
            r2.add(r3)
            android.util.Size r3 = new android.util.Size
            r6 = 1836(0x72c, float:2.573E-42)
            r3.<init>(r5, r6)
            r2.add(r3)
            android.util.Size r3 = new android.util.Size
            r5 = 2048(0x800, float:2.87E-42)
            r6 = 1536(0x600, float:2.152E-42)
            r3.<init>(r5, r6)
            r2.add(r3)
            android.util.Size r3 = new android.util.Size
            r3.<init>(r5, r10)
            r2.add(r3)
            android.util.Size r3 = new android.util.Size
            r5 = 1080(0x438, float:1.513E-42)
            r6 = 1920(0x780, float:2.69E-42)
            r3.<init>(r6, r5)
            r2.add(r3)
            goto L_0x037a
        L_0x021b:
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L_0x037a
            if (r1 == r11) goto L_0x0227
            if (r1 == r3) goto L_0x0227
            goto L_0x037a
        L_0x0227:
            android.util.Size r3 = new android.util.Size
            r5 = 3264(0xcc0, float:4.574E-42)
            r3.<init>(r5, r12)
            r2.add(r3)
            android.util.Size r3 = new android.util.Size
            r6 = 1836(0x72c, float:2.573E-42)
            r3.<init>(r5, r6)
            r2.add(r3)
            android.util.Size r3 = new android.util.Size
            r3.<init>(r12, r12)
            r2.add(r3)
            android.util.Size r3 = new android.util.Size
            r5 = 1920(0x780, float:2.69E-42)
            r3.<init>(r5, r5)
            r2.add(r3)
            android.util.Size r3 = new android.util.Size
            r6 = 2048(0x800, float:2.87E-42)
            r8 = 1536(0x600, float:2.152E-42)
            r3.<init>(r6, r8)
            r2.add(r3)
            android.util.Size r3 = new android.util.Size
            r3.<init>(r6, r10)
            r2.add(r3)
            android.util.Size r3 = new android.util.Size
            r6 = 1080(0x438, float:1.513E-42)
            r3.<init>(r5, r6)
            r2.add(r3)
            goto L_0x037a
        L_0x026d:
            boolean r2 = androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk.b()
            if (r2 == 0) goto L_0x0341
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            boolean r6 = r5.equals(r9)
            if (r6 == 0) goto L_0x02f4
            if (r1 == r11) goto L_0x02a4
            if (r1 != r3) goto L_0x037a
            android.util.Size r3 = new android.util.Size
            r5 = 2048(0x800, float:2.87E-42)
            r6 = 1536(0x600, float:2.152E-42)
            r3.<init>(r5, r6)
            r2.add(r3)
            android.util.Size r3 = new android.util.Size
            r3.<init>(r5, r10)
            r2.add(r3)
            android.util.Size r3 = new android.util.Size
            r5 = 1080(0x438, float:1.513E-42)
            r6 = 1920(0x780, float:2.69E-42)
            r3.<init>(r6, r5)
            r2.add(r3)
            goto L_0x037a
        L_0x02a4:
            android.util.Size r3 = new android.util.Size
            r5 = 3096(0xc18, float:4.338E-42)
            r3.<init>(r14, r5)
            r2.add(r3)
            android.util.Size r3 = new android.util.Size
            r3.<init>(r14, r15)
            r2.add(r3)
            android.util.Size r3 = new android.util.Size
            r3.<init>(r13, r13)
            r2.add(r3)
            android.util.Size r3 = new android.util.Size
            r5 = 3264(0xcc0, float:4.574E-42)
            r3.<init>(r5, r12)
            r2.add(r3)
            android.util.Size r3 = new android.util.Size
            r6 = 1836(0x72c, float:2.573E-42)
            r3.<init>(r5, r6)
            r2.add(r3)
            android.util.Size r3 = new android.util.Size
            r5 = 2048(0x800, float:2.87E-42)
            r6 = 1536(0x600, float:2.152E-42)
            r3.<init>(r5, r6)
            r2.add(r3)
            android.util.Size r3 = new android.util.Size
            r3.<init>(r5, r10)
            r2.add(r3)
            android.util.Size r3 = new android.util.Size
            r5 = 1080(0x438, float:1.513E-42)
            r6 = 1920(0x780, float:2.69E-42)
            r3.<init>(r6, r5)
            r2.add(r3)
            goto L_0x037a
        L_0x02f4:
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L_0x037a
            if (r1 == r11) goto L_0x0300
            if (r1 == r3) goto L_0x0300
            goto L_0x037a
        L_0x0300:
            android.util.Size r3 = new android.util.Size
            r5 = 2576(0xa10, float:3.61E-42)
            r6 = 1932(0x78c, float:2.707E-42)
            r3.<init>(r5, r6)
            r2.add(r3)
            android.util.Size r3 = new android.util.Size
            r5 = 2560(0xa00, float:3.587E-42)
            r6 = 1440(0x5a0, float:2.018E-42)
            r3.<init>(r5, r6)
            r2.add(r3)
            android.util.Size r3 = new android.util.Size
            r5 = 1920(0x780, float:2.69E-42)
            r3.<init>(r5, r5)
            r2.add(r3)
            android.util.Size r3 = new android.util.Size
            r6 = 2048(0x800, float:2.87E-42)
            r8 = 1536(0x600, float:2.152E-42)
            r3.<init>(r6, r8)
            r2.add(r3)
            android.util.Size r3 = new android.util.Size
            r3.<init>(r6, r10)
            r2.add(r3)
            android.util.Size r3 = new android.util.Size
            r6 = 1080(0x438, float:1.513E-42)
            r3.<init>(r5, r6)
            r2.add(r3)
            goto L_0x037a
        L_0x0341:
            java.lang.String r2 = "REDMI"
            boolean r2 = r2.equalsIgnoreCase(r6)
            if (r2 == 0) goto L_0x036f
            java.lang.String r2 = "joyeuse"
            java.lang.String r3 = android.os.Build.DEVICE
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L_0x036f
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            boolean r3 = r5.equals(r9)
            if (r3 == 0) goto L_0x037a
            r3 = 256(0x100, float:3.59E-43)
            if (r1 != r3) goto L_0x037a
            android.util.Size r3 = new android.util.Size
            r5 = 9280(0x2440, float:1.3004E-41)
            r6 = 6944(0x1b20, float:9.73E-42)
            r3.<init>(r5, r6)
            r2.add(r3)
            goto L_0x037a
        L_0x036f:
            java.lang.String r2 = "ExcludedSupportedSizesQuirk"
            java.lang.String r3 = "Cannot retrieve list of supported sizes to exclude on this device."
            F.h.I(r2, r3)
            java.util.List r2 = java.util.Collections.emptyList()
        L_0x037a:
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x0381
            goto L_0x0384
        L_0x0381:
            r7.removeAll(r2)
        L_0x0384:
            boolean r2 = r7.isEmpty()
            if (r2 == 0) goto L_0x0391
            java.lang.String r2 = "OutputSizesCorrector"
            java.lang.String r3 = "Sizes array becomes empty after excluding problematic output sizes."
            F.h.I(r2, r3)
        L_0x0391:
            r2 = 0
            android.util.Size[] r2 = new android.util.Size[r2]
            java.lang.Object[] r2 = r7.toArray(r2)
            android.util.Size[] r2 = (android.util.Size[]) r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            r4.put(r1, r2)
            java.lang.Object r1 = r2.clone()
            android.util.Size[] r1 = (android.util.Size[]) r1
            return r1
        L_0x03a8:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Retrieved output sizes array is null or empty for format "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "StreamConfigurationMapCompat"
            F.h.I(r2, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.k.B1(int):android.util.Size[]");
    }

    public Boolean B2() {
        return Boolean.valueOf(((c) this.f9767W).n("websiteIntegration", false));
    }

    public Boolean C() {
        return Boolean.valueOf(((c) this.f9767W).n("disableHomeButton", true));
    }

    public Boolean C0() {
        return Boolean.valueOf(((c) this.f9767W).n("knoxDisableHomeButton", false));
    }

    public Boolean C1() {
        return Boolean.valueOf(((c) this.f9767W).n("pageTransitions", false));
    }

    public Boolean C2() {
        return Boolean.valueOf(((c) this.f9767W).n("webviewDebugging", false));
    }

    public Boolean D() {
        return Boolean.valueOf(((c) this.f9767W).n("disableOtherApps", true));
    }

    public Boolean D0() {
        return Boolean.valueOf(((c) this.f9767W).n("knoxDisableMicrophoneState", false));
    }

    public Boolean D1() {
        return Boolean.valueOf(((c) this.f9767W).n("playMedia", false));
    }

    public Boolean D2() {
        return Boolean.valueOf(((c) this.f9767W).n("webviewRequestFocus", true));
    }

    public Boolean E() {
        c cVar = (c) this.f9767W;
        return Boolean.valueOf(cVar.n("disablePowerButton", cVar.n("disableHardwareButtons", true)));
    }

    public Boolean E0() {
        return Boolean.valueOf(((c) this.f9767W).n("knoxDisableMtp", false));
    }

    public Boolean E1() {
        return Boolean.valueOf(((c) this.f9767W).n("preventSleepWhileScreenOff", false));
    }

    public String E2() {
        return ((c) this.f9767W).r("wifiSelectorSSID", "");
    }

    public Boolean F() {
        return Boolean.valueOf(((c) this.f9767W).n("disableStatusBar", true));
    }

    public Boolean F0() {
        return Boolean.valueOf(((c) this.f9767W).n("knoxDisableMultiUser", false));
    }

    public Boolean F1() {
        return Boolean.valueOf(((c) this.f9767W).n("readNfcTag", false));
    }

    public String F2() {
        return ((c) this.f9767W).r("wifiSSID", "");
    }

    public Boolean G() {
        c cVar = (c) this.f9767W;
        return Boolean.valueOf(cVar.n("disableVolumeButtons", cVar.n("disableHardwareButtons", true)));
    }

    public Boolean G0() {
        return Boolean.valueOf(((c) this.f9767W).n("knoxDisableMultiWindowMode", false));
    }

    public Boolean G1() {
        return Boolean.valueOf(((c) this.f9767W).n("recreateTabsOnReload", false));
    }

    public synchronized void G2() {
        C0767r3 r3Var = (C0767r3) this.f9767W;
        if (r3Var != null) {
            r3Var.e();
        }
    }

    public String H() {
        return ((c) this.f9767W).r("displayMode", "0");
    }

    public Boolean H0() {
        return Boolean.valueOf(((c) this.f9767W).n("knoxDisableNonMarketApps", false));
    }

    public int H1() {
        try {
            return Integer.parseInt(((c) this.f9767W).r("reloadEachSeconds", "0"));
        } catch (Exception unused) {
            return 0;
        }
    }

    public void H2(h hVar, Uri uri, Map map, long j7, long j8, Q q7) {
        boolean z;
        l lVar = new l(hVar, j7, j8);
        this.f9768X = lVar;
        if (((o) this.f9767W) == null) {
            o[] a8 = ((r) this.f9766V).a(uri, map);
            L l8 = O.l(a8.length);
            boolean z6 = true;
            if (a8.length == 1) {
                this.f9767W = a8[0];
            } else {
                int length = a8.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    o oVar = a8[i];
                    try {
                        if (oVar.h(lVar)) {
                            this.f9767W = oVar;
                            lVar.f14410Z = 0;
                            break;
                        }
                        l8.d(oVar.f());
                        if (((o) this.f9767W) != null || lVar.f14408X == j7) {
                            z = true;
                        } else {
                            z = false;
                        }
                        P0.l.j(z);
                        lVar.f14410Z = 0;
                        i++;
                    } catch (EOFException unused) {
                        if (((o) this.f9767W) != null || lVar.f14408X == j7) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } catch (Throwable th) {
                        if (((o) this.f9767W) == null && lVar.f14408X != j7) {
                            z6 = false;
                        }
                        P0.l.j(z6);
                        lVar.f14410Z = 0;
                        throw th;
                    }
                }
                if (((o) this.f9767W) == null) {
                    uri.getClass();
                    i0 g8 = l8.g();
                    J j9 = new J("None of the available extractors (" + new e(", ").c(C0103u.z(O.n(a8), new U0.c(24))) + ") could read the stream.", (Exception) null, false, 1);
                    O.m(g8);
                    throw j9;
                }
            }
            ((o) this.f9767W).l(q7);
        }
    }

    public Drawable I(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f9767W;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return typedArray.getDrawable(i);
        }
        return C0003d.r((Context) this.f9766V, resourceId);
    }

    public Boolean I0() {
        return Boolean.valueOf(((c) this.f9767W).n("knoxDisableOtaUpgrades", false));
    }

    public int I1() {
        try {
            return Integer.parseInt(((c) this.f9767W).r("reloadPageFailure", "0"));
        } catch (Exception unused) {
            return 0;
        }
    }

    public boolean I2(int i) {
        int i8;
        int i9 = i + 1;
        S3.a aVar = (S3.a) this.f9766V;
        if (i9 > aVar.f4504V) {
            return false;
        }
        int i10 = 0;
        while (i10 < 5 && (i8 = i10 + i) < aVar.f4504V) {
            if (i10 == 2) {
                if (!aVar.a(i + 2)) {
                    return false;
                }
            } else if (aVar.a(i8)) {
                return false;
            }
            i10++;
        }
        return true;
    }

    public Drawable J(int i) {
        int resourceId;
        Drawable g8;
        if (!((TypedArray) this.f9767W).hasValue(i) || (resourceId = ((TypedArray) this.f9767W).getResourceId(i, 0)) == 0) {
            return null;
        }
        C1292s a8 = C1292s.a();
        Context context = (Context) this.f9766V;
        synchronized (a8) {
            g8 = a8.f14067a.g(context, resourceId, true);
        }
        return g8;
    }

    public Boolean J0() {
        return Boolean.valueOf(((c) this.f9767W).n("knoxDisablePowerButton", false));
    }

    public Boolean J1() {
        return Boolean.valueOf(((c) this.f9767W).n("remoteAdmin", false));
    }

    public boolean J2(T3.a aVar, d dVar, boolean z) {
        boolean z6;
        boolean z8;
        boolean z9;
        boolean z10;
        int[] iArr = dVar.f9613c0;
        int i = iArr[0];
        C0818b bVar = (C0818b) this.f9767W;
        bVar.f11129a = i;
        boolean z11 = true;
        bVar.f11130b = iArr[1];
        bVar.f11131c = dVar.l();
        bVar.f11132d = dVar.i();
        bVar.i = false;
        bVar.f11136j = z;
        if (bVar.f11129a == 3) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (bVar.f11130b == 3) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (!z6 || dVar.f9593L <= 0.0f) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (!z8 || dVar.f9593L <= 0.0f) {
            z10 = false;
        } else {
            z10 = true;
        }
        int[] iArr2 = dVar.f9620l;
        if (z9 && iArr2[0] == 4) {
            bVar.f11129a = 1;
        }
        if (z10 && iArr2[1] == 4) {
            bVar.f11130b = 1;
        }
        aVar.d(dVar, bVar);
        dVar.y(bVar.e);
        dVar.v(bVar.f11133f);
        dVar.f9631w = bVar.f11135h;
        int i8 = bVar.f11134g;
        dVar.f9597P = i8;
        if (i8 <= 0) {
            z11 = false;
        }
        dVar.f9631w = z11;
        bVar.f11136j = false;
        return bVar.i;
    }

    public Boolean K() {
        return Boolean.valueOf(((c) this.f9767W).n("enableDebugMessages", false));
    }

    public Boolean K0() {
        return Boolean.valueOf(((c) this.f9767W).n("knoxDisablePowerOff", false));
    }

    public String K1() {
        return ((c) this.f9767W).r("remoteAdminPassword", "");
    }

    public Boolean L() {
        return Boolean.valueOf(((c) this.f9767W).n("enableLocalhost", false));
    }

    public Boolean L0() {
        return Boolean.valueOf(((c) this.f9767W).n("knoxDisablePowerSavingMode", false));
    }

    public String L1() {
        String str;
        c cVar = (c) this.f9767W;
        if (cVar.n("enableDownload", false)) {
            str = "1";
        } else {
            str = "0";
        }
        return cVar.r("remoteFileMode", str);
    }

    public boolean L2(File file) {
        f.e(file, "reportFile");
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        ArrayList arrayList = (ArrayList) this.f9768X;
        ArrayList arrayList2 = new ArrayList(D6.k.M(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(newCachedThreadPool.submit(new b((ReportInteraction) it.next(), this, file)));
        }
        Iterator it2 = arrayList2.iterator();
        boolean z = true;
        while (it2.hasNext()) {
            Future future = (Future) it2.next();
            do {
                try {
                    Object obj = future.get();
                    f.d(obj, "get(...)");
                    z &= ((Boolean) obj).booleanValue();
                } catch (InterruptedException unused) {
                } catch (ExecutionException e) {
                    ErrorReporter errorReporter = C1247a.f13789a;
                    n2.a.n1("Report interaction threw exception, will be ignored.", e);
                }
            } while (!future.isDone());
        }
        return z;
    }

    public Boolean M() {
        return Boolean.valueOf(((c) this.f9767W).n("enableQrScan", false));
    }

    public Boolean M0() {
        return Boolean.valueOf(((c) this.f9767W).n("knoxDisableRecentTaskButton", false));
    }

    public String M1() {
        String str;
        c cVar = (c) this.f9767W;
        if (cVar.n("showPdfFiles", false)) {
            str = "2";
        } else {
            str = "0";
        }
        return cVar.r("remotePdfFileMode", str);
    }

    public void M2() {
        ((TypedArray) this.f9767W).recycle();
    }

    public String N() {
        return N2(((c) this.f9767W).r("errorURL", ""));
    }

    public Boolean N0() {
        return Boolean.valueOf(((c) this.f9767W).n("knoxDisableSDCardWrite", false));
    }

    public Boolean N1() {
        return Boolean.valueOf(((c) this.f9767W).n("removeNavigationBar", false));
    }

    public String N2(String str) {
        if (str.contains("$appId")) {
            str = str.replace("$appId", "fully-single-app");
        }
        if (str.contains("$sn")) {
            str = str.replace("$sn", n2.a.k1(P.q((Context) this.f9768X)));
        }
        if (str.contains("$imei")) {
            str = str.replace("$imei", n2.a.k1(P.k((Context) this.f9768X)));
        }
        if (str.contains("$rap")) {
            str = str.replace("$rap", String.valueOf(P5.P.f3859s));
        }
        if (str.contains("$mac")) {
            str = str.replace("$mac", n2.a.k1(C0794w0.G((Context) this.f9768X, (String) null)));
        }
        if (str.contains("$ip4")) {
            str = str.replace("$ip4", n2.a.k1(C0794w0.C(true, false)));
        }
        if (str.contains("$ip6")) {
            str = str.replace("$ip6", n2.a.k1(C0794w0.C(false, false)));
        }
        if (str.contains("$ip")) {
            str = str.replace("$ip", n2.a.k1(C0794w0.B()));
        }
        if (str.contains("$ssid")) {
            str = str.replace("$ssid", n2.a.k1(C0794w0.U((Context) this.f9768X)));
        }
        if (str.contains("$bssid")) {
            str = str.replace("$bssid", n2.a.k1(C0794w0.S((Context) this.f9768X)));
        }
        if (str.contains("$hostname")) {
            str = str.replace("$hostname", n2.a.k1(C0794w0.f11024j));
        }
        if (str.contains("$hostname6")) {
            str = str.replace("$hostname6", n2.a.k1(C0794w0.f11025k));
        }
        if (str.contains("$locale")) {
            str = str.replace("$locale", n2.a.k1(((Context) this.f9768X).getResources().getConfiguration().locale.toString()));
        }
        if (str.contains("$deviceName")) {
            str = str.replace("$deviceName", n2.a.k1(C0794w0.t((Context) this.f9768X)));
        }
        if (str.contains("$deviceID")) {
            str = str.replace("$deviceID", P.i((Context) this.f9768X));
        }
        if (str.contains("$deviceId")) {
            str = str.replace("$deviceId", P.i((Context) this.f9768X));
        }
        if (str.contains("$customVariable")) {
            str = str.replace("$customVariable", n2.a.k1(((c) this.f9767W).r("customVariable", "")));
        }
        return n2.a.F((Context) this.f9768X, str);
    }

    public int O() {
        try {
            return Integer.parseInt(((c) this.f9767W).r("errorUrlOnDisconnection", "0"));
        } catch (Exception unused) {
            return 0;
        }
    }

    public Boolean O0() {
        return Boolean.valueOf(((c) this.f9767W).n("knoxDisableSafeMode", false));
    }

    public Boolean O1() {
        return Boolean.valueOf(((c) this.f9767W).n("removeStatusBar", false));
    }

    public String O2(String str) {
        if (str.contains("$appId")) {
            str = str.replace("$appId", "fully-single-app");
        }
        if (str.contains("$sn")) {
            str = str.replace("$sn", P.q((Context) this.f9768X));
        }
        if (str.contains("$imei")) {
            str = str.replace("$imei", P.k((Context) this.f9768X));
        }
        if (str.contains("$rap")) {
            str = str.replace("$rap", String.valueOf(P5.P.f3859s));
        }
        if (str.contains("$mac")) {
            str = str.replace("$mac", C0794w0.G((Context) this.f9768X, (String) null));
        }
        if (str.contains("$ip4")) {
            str = str.replace("$ip4", C0794w0.C(true, false));
        }
        if (str.contains("$ip6")) {
            str = str.replace("$ip6", C0794w0.C(false, false));
        }
        if (str.contains("$ip")) {
            str = str.replace("$ip", C0794w0.B());
        }
        if (str.contains("$ssid")) {
            str = str.replace("$ssid", C0794w0.U((Context) this.f9768X));
        }
        if (str.contains("$bssid")) {
            str = str.replace("$bssid", C0794w0.S((Context) this.f9768X));
        }
        if (str.contains("$hostname")) {
            str = str.replace("$hostname", C0794w0.f11024j);
        }
        if (str.contains("$hostname6")) {
            str = str.replace("$hostname6", C0794w0.f11025k);
        }
        if (str.contains("$locale")) {
            str = str.replace("$locale", ((Context) this.f9768X).getResources().getConfiguration().locale.toString());
        }
        if (str.contains("$deviceName")) {
            str = str.replace("$deviceName", C0794w0.t((Context) this.f9768X));
        }
        if (str.contains("$deviceID")) {
            str = str.replace("$deviceID", P.i((Context) this.f9768X));
        }
        if (str.contains("$deviceId")) {
            str = str.replace("$deviceId", P.i((Context) this.f9768X));
        }
        if (str.contains("$customVariable")) {
            str = str.replace("$customVariable", ((c) this.f9767W).r("customVariable", ""));
        }
        return n2.a.F((Context) this.f9768X, str);
    }

    public int P() {
        try {
            return Integer.parseInt(((c) this.f9767W).r("fadeInOutDuration", "0"));
        } catch (Exception unused) {
            return 0;
        }
    }

    public Boolean P0() {
        return Boolean.valueOf(((c) this.f9767W).n("knoxDisableScreenCapture", false));
    }

    public Boolean P1() {
        return Boolean.valueOf(((c) this.f9767W).n("restartOnCrash", true));
    }

    public void P2() {
        c cVar = (c) this.f9767W;
        String r8 = cVar.r("canonicalDeviceId", "");
        String f12 = f1();
        String r9 = cVar.r("licenseSignature", "");
        boolean n4 = cVar.n("isProvisioningCompleted", false);
        PreferenceManager.getDefaultSharedPreferences((Context) this.f9768X).edit().clear().commit();
        V2("canonicalDeviceId", r8);
        T2(f12);
        V2("licenseSignature", r9);
        R2("isProvisioningCompleted", n4);
        ((SharedPreferences) cVar.f6955V).contains("startURL");
        if (!((SharedPreferences) cVar.f6955V).contains("screensaverWallpaperURL")) {
            V2("screensaverWallpaperURL", "fully://color#000000");
        }
    }

    public Boolean Q() {
        return Boolean.valueOf(((c) this.f9767W).n("fileUploads", false));
    }

    public Boolean Q0() {
        return Boolean.valueOf(((c) this.f9767W).n("knoxDisableSettingsChanges", false));
    }

    public Boolean Q1() {
        return Boolean.valueOf(((c) this.f9767W).n("rootEnable", false));
    }

    public void Q2() {
        if (((c) this.f9767W).q("firstAppInstallVersionCode", 0) != 0) {
            return;
        }
        if (PreferenceManager.getDefaultSharedPreferences((Context) this.f9768X).getAll().size() > 20) {
            S2(1, "firstAppInstallVersionCode");
        } else {
            S2(101362, "firstAppInstallVersionCode");
        }
    }

    public Typeface R(int i, int i8, S s8) {
        int resourceId = ((TypedArray) this.f9767W).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f9768X) == null) {
            this.f9768X = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f9768X;
        ThreadLocal threadLocal = l0.l.f13083a;
        Context context = (Context) this.f9766V;
        if (context.isRestricted()) {
            return null;
        }
        return l0.l.b(context, resourceId, typedValue, i8, s8, true, false);
    }

    public Boolean R0() {
        return Boolean.valueOf(((c) this.f9767W).n("knoxDisableStatusBar", false));
    }

    public int R1() {
        try {
            return Integer.parseInt(((c) this.f9767W).r("screenBrightness", ""));
        } catch (Exception unused) {
            return -1;
        }
    }

    public void R2(String str, boolean z) {
        SharedPreferences.Editor edit = ((SharedPreferences) ((c) this.f9767W).f6955V).edit();
        edit.putBoolean(str, z);
        e(edit, false);
    }

    public Boolean S() {
        return Boolean.valueOf(((c) this.f9767W).n("forceScreenUnlock", false));
    }

    public Boolean S0() {
        return Boolean.valueOf(((c) this.f9767W).n("knoxDisableTaskManager", false));
    }

    public int S1() {
        try {
            return Integer.parseInt(((c) this.f9767W).r("screensaverBrightness", ""));
        } catch (Exception unused) {
            return -1;
        }
    }

    public void S2(int i, String str) {
        SharedPreferences.Editor edit = ((SharedPreferences) ((c) this.f9767W).f6955V).edit();
        edit.putInt(str, i);
        e(edit, false);
    }

    public String T() {
        String str;
        c cVar = (c) this.f9767W;
        if (cVar.n("disableHwAcceleration", false)) {
            str = "1";
        } else {
            str = "2";
        }
        return cVar.r("graphicsAccelerationMode", str);
    }

    public Boolean T0() {
        return Boolean.valueOf(((c) this.f9767W).n("knoxDisableUsbDebugging", false));
    }

    public Boolean T1() {
        return Boolean.valueOf(((c) this.f9767W).n("screensaverOtherApp", false));
    }

    public void T2(String str) {
        V2("licenseDeviceId", str);
    }

    public ImageView.ScaleType U() {
        try {
            return ImageView.ScaleType.values()[Integer.parseInt(((c) this.f9767W).r("imageScaleType", "3"))];
        } catch (Exception unused) {
            return ImageView.ScaleType.FIT_CENTER;
        }
    }

    public Boolean U0() {
        return Boolean.valueOf(((c) this.f9767W).n("knoxDisableUsbHostStorage", false));
    }

    public String U1() {
        return ((c) this.f9767W).r("screensaverOtherAppIntent", "");
    }

    public void U2(String str, long j7) {
        SharedPreferences.Editor edit = ((SharedPreferences) ((c) this.f9767W).f6955V).edit();
        edit.putLong(str, j7);
        e(edit, false);
    }

    public Boolean V() {
        return Boolean.valueOf(((c) this.f9767W).n("inUseWhileAudioPlaying", false));
    }

    public Boolean V0() {
        return Boolean.valueOf(((c) this.f9767W).n("knoxDisableUsbTethering", false));
    }

    public String V1() {
        return N2(((c) this.f9767W).r("screensaverURL", ""));
    }

    public void V2(String str, String str2) {
        SharedPreferences.Editor edit = ((SharedPreferences) ((c) this.f9767W).f6955V).edit();
        edit.putString(str, str2);
        e(edit, false);
    }

    public Boolean W() {
        return Boolean.valueOf(((c) this.f9767W).n("inUseWhileKeyboardVisible", false));
    }

    public Boolean W0() {
        return Boolean.valueOf(((c) this.f9767W).n("knoxDisableVideoRecord", false));
    }

    public Boolean W1() {
        return Boolean.valueOf(((c) this.f9767W).n("showActionBar", false));
    }

    public void W2(d0.e eVar, int i, int i8) {
        int i9 = eVar.f9598Q;
        int i10 = eVar.f9599R;
        eVar.f9598Q = 0;
        eVar.f9599R = 0;
        eVar.y(i);
        eVar.v(i8);
        if (i9 < 0) {
            eVar.f9598Q = 0;
        } else {
            eVar.f9598Q = i9;
        }
        if (i10 < 0) {
            eVar.f9599R = 0;
        } else {
            eVar.f9599R = i10;
        }
        ((d0.e) this.f9768X).E();
    }

    public int X() {
        return ((c) this.f9767W).q("inactiveTabsBgColor", ((Context) this.f9768X).getResources().getColor(2131099698));
    }

    public Boolean X0() {
        return Boolean.valueOf(((c) this.f9767W).n("knoxDisableVolumeButtons", false));
    }

    public Boolean X1() {
        return Boolean.valueOf(((c) this.f9767W).n("showAddressBar", false));
    }

    public int Y() {
        try {
            return Integer.parseInt(((c) this.f9767W).r("initialScale", "0"));
        } catch (Exception unused) {
            return 0;
        }
    }

    public Boolean Y0() {
        return Boolean.valueOf(((c) this.f9767W).n("knoxDisableVpn", false));
    }

    public Boolean Y1() {
        return Boolean.valueOf(((c) this.f9767W).n("showCamPreview", false));
    }

    public Boolean Z() {
        return Boolean.valueOf(((c) this.f9767W).n("keepScreenOn", true));
    }

    public Boolean Z0() {
        return Boolean.valueOf(((c) this.f9767W).n("knoxDisableWiFi", false));
    }

    public Boolean Z1() {
        c cVar = (c) this.f9767W;
        return Boolean.valueOf(cVar.n("showNavigationBar", !cVar.n("setFullScreen", true)));
    }

    public Object a() {
        return null;
    }

    public Boolean a0() {
        return Boolean.valueOf(((c) this.f9767W).n("keepScreenOnAdvanced", false));
    }

    public Boolean a1() {
        return Boolean.valueOf(((c) this.f9767W).n("knoxDisableWifiDirect", false));
    }

    public Boolean a2() {
        return Boolean.valueOf(((c) this.f9767W).n("showNewTabButton", false));
    }

    public Uri b() {
        return (Uri) this.f9766V;
    }

    public String b0() {
        return ((c) this.f9767W).r("kioskExitGesture", ((Context) this.f9768X).getResources().getString(2131951775));
    }

    public Boolean b1() {
        return Boolean.valueOf(((c) this.f9767W).n("knoxDisableWifiTethering", false));
    }

    public Boolean b2() {
        return Boolean.valueOf(((c) this.f9767W).n("showProgressBar", true));
    }

    public void c() {
    }

    public Boolean c0() {
        return Boolean.valueOf(((c) this.f9767W).n("kioskMode", false));
    }

    public Boolean c1() {
        return Boolean.valueOf(((c) this.f9767W).n("knoxEnabled", false));
    }

    public Boolean c2() {
        c cVar = (c) this.f9767W;
        return Boolean.valueOf(cVar.n("showStatusBar", !cVar.n("setFullScreen", true)));
    }

    public Uri d() {
        return (Uri) this.f9768X;
    }

    public String d0() {
        return ((c) this.f9767W).r("kioskPin", "");
    }

    public Boolean d1() {
        return Boolean.valueOf(((c) this.f9767W).n("knoxHideStatusBar", false));
    }

    public Boolean d2() {
        return Boolean.valueOf(((c) this.f9767W).n("showTabCloseButtons", true));
    }

    public String e0() {
        return ((c) this.f9767W).r("kioskWifiPinAction", "0");
    }

    public Boolean e1() {
        return Boolean.valueOf(((c) this.f9767W).n("knoxSetForceAutoStartUpState", false));
    }

    public String e2() {
        return ((c) this.f9767W).r("singleAppIntent", "");
    }

    public String f(int i, StringBuilder sb) {
        String str;
        String str2 = null;
        while (true) {
            C0641h g8 = g(i, str2);
            String a8 = C0643j.a(g8.f9755W);
            if (a8 != null) {
                sb.append(a8);
            }
            if (g8.f9757Y) {
                str = String.valueOf(g8.f9756X);
            } else {
                str = null;
            }
            int i8 = g8.f4018V;
            if (i == i8) {
                return sb.toString();
            }
            i = i8;
            str2 = str;
        }
    }

    public Boolean f0() {
        return Boolean.valueOf(((c) this.f9767W).n("knoxActiveByKiosk", false));
    }

    public String f1() {
        return ((c) this.f9767W).r("licenseDeviceId", "");
    }

    public int f2() {
        try {
            return Integer.parseInt(((c) this.f9767W).r("singleAppIntentDelay", "0"));
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:119:0x020b, code lost:
        r3 = r1.f2964b;
        r5 = r3 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0211, code lost:
        if (r5 <= r6.f4504V) goto L_0x0214;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0214, code lost:
        if (r3 >= r5) goto L_0x0239;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x021a, code lost:
        if (r6.a(r3) == false) goto L_0x0236;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0222, code lost:
        if (I2(r1.f2964b) == false) goto L_0x0242;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0224, code lost:
        r3 = r1.f2964b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0228, code lost:
        if ((r3 + 5) >= r13) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x022a, code lost:
        r1.f2964b = r3 + 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0230, code lost:
        r1.f2964b = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0233, code lost:
        r1.f2965c = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0236, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0239, code lost:
        r1.f2964b += 3;
        r1.f2965c = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0242, code lost:
        r5 = new D2.G((java.lang.Object) null, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x02cd, code lost:
        r3 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0305, code lost:
        r1.f2965c = 2;
        r1.f2964b += 4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x02ac  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x02b1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x02ed A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d4.C0641h g(int r19, java.lang.String r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            java.lang.Object r2 = r0.f9768X
            java.lang.StringBuilder r2 = (java.lang.StringBuilder) r2
            r3 = 0
            r2.setLength(r3)
            if (r1 == 0) goto L_0x0011
            r2.append(r1)
        L_0x0011:
            java.lang.Object r1 = r0.f9767W
            M0.k r1 = (M0.C0123k) r1
            r4 = r19
            r1.f2964b = r4
        L_0x0019:
            int r4 = r1.f2964b
            int r5 = r1.f2965c
            java.lang.Object r6 = r0.f9766V
            S3.a r6 = (S3.a) r6
            r7 = 36
            r9 = 5
            r11 = 2
            r16 = 47
            r12 = 58
            r13 = 32
            r14 = 15
            r15 = 63
            r3 = 16
            if (r5 != r11) goto L_0x0113
        L_0x0033:
            int r5 = r1.f2964b
            int r11 = r5 + 5
            int r8 = r6.f4504V
            if (r11 <= r8) goto L_0x003d
            goto L_0x00ce
        L_0x003d:
            int r11 = h(r5, r9, r6)
            r10 = 6
            if (r11 < r9) goto L_0x0047
            if (r11 >= r3) goto L_0x0047
            goto L_0x0055
        L_0x0047:
            int r11 = r5 + 6
            if (r11 <= r8) goto L_0x004d
            goto L_0x00ce
        L_0x004d:
            int r5 = h(r5, r10, r6)
            if (r5 < r3) goto L_0x00ce
            if (r5 >= r15) goto L_0x00ce
        L_0x0055:
            int r5 = r1.f2964b
            int r8 = h(r5, r9, r6)
            if (r8 != r14) goto L_0x0065
            d4.g r8 = new d4.g
            int r5 = r5 + 5
            r8.<init>(r7, r5)
            goto L_0x00b1
        L_0x0065:
            if (r8 < r9) goto L_0x0075
            if (r8 >= r14) goto L_0x0075
            d4.g r10 = new d4.g
            int r5 = r5 + 5
            int r8 = r8 + 43
            char r8 = (char) r8
            r10.<init>(r8, r5)
        L_0x0073:
            r8 = r10
            goto L_0x00b1
        L_0x0075:
            int r8 = h(r5, r10, r6)
            if (r8 < r13) goto L_0x0088
            if (r8 >= r12) goto L_0x0088
            d4.g r10 = new d4.g
            int r5 = r5 + 6
            int r8 = r8 + 33
            char r8 = (char) r8
            r10.<init>(r8, r5)
            goto L_0x0073
        L_0x0088:
            switch(r8) {
                case 58: goto L_0x00a7;
                case 59: goto L_0x00a4;
                case 60: goto L_0x00a1;
                case 61: goto L_0x009e;
                case 62: goto L_0x009b;
                default: goto L_0x008b;
            }
        L_0x008b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Decoding invalid alphanumeric value: "
            java.lang.String r3 = java.lang.String.valueOf(r8)
            java.lang.String r2 = r2.concat(r3)
            r1.<init>(r2)
            throw r1
        L_0x009b:
            r8 = 47
            goto L_0x00a9
        L_0x009e:
            r8 = 46
            goto L_0x00a9
        L_0x00a1:
            r8 = 45
            goto L_0x00a9
        L_0x00a4:
            r8 = 44
            goto L_0x00a9
        L_0x00a7:
            r8 = 42
        L_0x00a9:
            d4.g r10 = new d4.g
            int r5 = r5 + 6
            r10.<init>(r8, r5)
            goto L_0x0073
        L_0x00b1:
            int r5 = r8.f4018V
            r1.f2964b = r5
            char r8 = r8.f9754W
            if (r8 != r7) goto L_0x00c9
            d4.h r3 = new d4.h
            java.lang.String r6 = r2.toString()
            r3.<init>(r5, r6)
            D2.G r5 = new D2.G
            r6 = 1
            r5.<init>((java.lang.Object) r3, (boolean) r6)
            goto L_0x010d
        L_0x00c9:
            r2.append(r8)
            goto L_0x0033
        L_0x00ce:
            int r3 = r1.f2964b
            int r5 = r3 + 3
            int r7 = r6.f4504V
            if (r5 <= r7) goto L_0x00d7
            goto L_0x00df
        L_0x00d7:
            if (r3 >= r5) goto L_0x00fd
            boolean r7 = r6.a(r3)
            if (r7 == 0) goto L_0x00f9
        L_0x00df:
            int r3 = r1.f2964b
            boolean r3 = r0.I2(r3)
            if (r3 == 0) goto L_0x0106
            int r3 = r1.f2964b
            int r5 = r3 + 5
            if (r5 >= r8) goto L_0x00f3
            int r3 = r3 + 5
            r1.f2964b = r3
        L_0x00f1:
            r7 = 3
            goto L_0x00f6
        L_0x00f3:
            r1.f2964b = r8
            goto L_0x00f1
        L_0x00f6:
            r1.f2965c = r7
            goto L_0x0106
        L_0x00f9:
            r7 = 3
            int r3 = r3 + 1
            goto L_0x00d7
        L_0x00fd:
            r7 = 3
            int r3 = r1.f2964b
            int r3 = r3 + r7
            r1.f2964b = r3
            r3 = 1
            r1.f2965c = r3
        L_0x0106:
            D2.G r5 = new D2.G
            r3 = 0
            r6 = 0
            r5.<init>((java.lang.Object) r6, (boolean) r3)
        L_0x010d:
            boolean r3 = r5.f1051U
        L_0x010f:
            r6 = r5
            r5 = 0
            goto L_0x031b
        L_0x0113:
            r8 = 8
            r10 = 7
            r12 = 3
            if (r5 != r12) goto L_0x024e
        L_0x0119:
            int r5 = r1.f2964b
            int r12 = r5 + 5
            int r13 = r6.f4504V
            if (r12 <= r13) goto L_0x0123
            goto L_0x020b
        L_0x0123:
            int r12 = h(r5, r9, r6)
            r15 = 116(0x74, float:1.63E-43)
            r11 = 64
            if (r12 < r9) goto L_0x0130
            if (r12 >= r3) goto L_0x0130
            goto L_0x0151
        L_0x0130:
            int r12 = r5 + 7
            if (r12 <= r13) goto L_0x0136
            goto L_0x020b
        L_0x0136:
            int r12 = h(r5, r10, r6)
            if (r12 < r11) goto L_0x013f
            if (r12 >= r15) goto L_0x013f
            goto L_0x0151
        L_0x013f:
            int r12 = r5 + 8
            if (r12 <= r13) goto L_0x0145
            goto L_0x020b
        L_0x0145:
            int r5 = h(r5, r8, r6)
            r12 = 232(0xe8, float:3.25E-43)
            if (r5 < r12) goto L_0x020b
            r12 = 253(0xfd, float:3.55E-43)
            if (r5 >= r12) goto L_0x020b
        L_0x0151:
            int r5 = r1.f2964b
            int r12 = h(r5, r9, r6)
            if (r12 != r14) goto L_0x0162
            d4.g r11 = new d4.g
            int r5 = r5 + 5
            r11.<init>(r7, r5)
            goto L_0x01e9
        L_0x0162:
            if (r12 < r9) goto L_0x0172
            if (r12 >= r14) goto L_0x0172
            d4.g r11 = new d4.g
            int r5 = r5 + 5
            int r12 = r12 + 43
            char r12 = (char) r12
            r11.<init>(r12, r5)
            goto L_0x01e9
        L_0x0172:
            int r12 = h(r5, r10, r6)
            r13 = 90
            if (r12 < r11) goto L_0x0188
            if (r12 >= r13) goto L_0x0188
            d4.g r11 = new d4.g
            int r5 = r5 + 7
            int r12 = r12 + 1
            char r12 = (char) r12
            r11.<init>(r12, r5)
            goto L_0x01e9
        L_0x0188:
            if (r12 < r13) goto L_0x0197
            if (r12 >= r15) goto L_0x0197
            d4.g r11 = new d4.g
            int r5 = r5 + 7
            int r12 = r12 + 7
            char r12 = (char) r12
            r11.<init>(r12, r5)
            goto L_0x01e9
        L_0x0197:
            int r11 = h(r5, r8, r6)
            switch(r11) {
                case 232: goto L_0x01df;
                case 233: goto L_0x01dc;
                case 234: goto L_0x01d9;
                case 235: goto L_0x01d6;
                case 236: goto L_0x01d3;
                case 237: goto L_0x01d0;
                case 238: goto L_0x01cd;
                case 239: goto L_0x01ca;
                case 240: goto L_0x01c7;
                case 241: goto L_0x01c4;
                case 242: goto L_0x01c1;
                case 243: goto L_0x01be;
                case 244: goto L_0x01bb;
                case 245: goto L_0x01b8;
                case 246: goto L_0x01b5;
                case 247: goto L_0x01b2;
                case 248: goto L_0x01af;
                case 249: goto L_0x01ac;
                case 250: goto L_0x01a9;
                case 251: goto L_0x01a6;
                case 252: goto L_0x01a3;
                default: goto L_0x019e;
            }
        L_0x019e:
            M3.d r1 = M3.d.a()
            throw r1
        L_0x01a3:
            r11 = 32
            goto L_0x01e1
        L_0x01a6:
            r11 = 95
            goto L_0x01e1
        L_0x01a9:
            r11 = 63
            goto L_0x01e1
        L_0x01ac:
            r11 = 62
            goto L_0x01e1
        L_0x01af:
            r11 = 61
            goto L_0x01e1
        L_0x01b2:
            r11 = 60
            goto L_0x01e1
        L_0x01b5:
            r11 = 59
            goto L_0x01e1
        L_0x01b8:
            r11 = 58
            goto L_0x01e1
        L_0x01bb:
            r11 = 47
            goto L_0x01e1
        L_0x01be:
            r11 = 46
            goto L_0x01e1
        L_0x01c1:
            r11 = 45
            goto L_0x01e1
        L_0x01c4:
            r11 = 44
            goto L_0x01e1
        L_0x01c7:
            r11 = 43
            goto L_0x01e1
        L_0x01ca:
            r11 = 42
            goto L_0x01e1
        L_0x01cd:
            r11 = 41
            goto L_0x01e1
        L_0x01d0:
            r11 = 40
            goto L_0x01e1
        L_0x01d3:
            r11 = 39
            goto L_0x01e1
        L_0x01d6:
            r11 = 38
            goto L_0x01e1
        L_0x01d9:
            r11 = 37
            goto L_0x01e1
        L_0x01dc:
            r11 = 34
            goto L_0x01e1
        L_0x01df:
            r11 = 33
        L_0x01e1:
            d4.g r12 = new d4.g
            int r5 = r5 + 8
            r12.<init>(r11, r5)
            r11 = r12
        L_0x01e9:
            int r5 = r11.f4018V
            r1.f2964b = r5
            char r11 = r11.f9754W
            if (r11 != r7) goto L_0x0201
            d4.h r3 = new d4.h
            java.lang.String r6 = r2.toString()
            r3.<init>(r5, r6)
            D2.G r5 = new D2.G
            r6 = 1
            r5.<init>((java.lang.Object) r3, (boolean) r6)
            goto L_0x024a
        L_0x0201:
            r2.append(r11)
            r11 = 2
            r13 = 32
            r15 = 63
            goto L_0x0119
        L_0x020b:
            int r3 = r1.f2964b
            int r5 = r3 + 3
            int r7 = r6.f4504V
            if (r5 <= r7) goto L_0x0214
            goto L_0x021c
        L_0x0214:
            if (r3 >= r5) goto L_0x0239
            boolean r7 = r6.a(r3)
            if (r7 == 0) goto L_0x0236
        L_0x021c:
            int r3 = r1.f2964b
            boolean r3 = r0.I2(r3)
            if (r3 == 0) goto L_0x0242
            int r3 = r1.f2964b
            int r5 = r3 + 5
            if (r5 >= r13) goto L_0x0230
            int r3 = r3 + 5
            r1.f2964b = r3
        L_0x022e:
            r3 = 2
            goto L_0x0233
        L_0x0230:
            r1.f2964b = r13
            goto L_0x022e
        L_0x0233:
            r1.f2965c = r3
            goto L_0x0242
        L_0x0236:
            int r3 = r3 + 1
            goto L_0x0214
        L_0x0239:
            int r3 = r1.f2964b
            r5 = 3
            int r3 = r3 + r5
            r1.f2964b = r3
            r3 = 1
            r1.f2965c = r3
        L_0x0242:
            D2.G r3 = new D2.G
            r5 = 0
            r6 = 0
            r3.<init>((java.lang.Object) r6, (boolean) r5)
            r5 = r3
        L_0x024a:
            boolean r3 = r5.f1051U
            goto L_0x010f
        L_0x024e:
            int r3 = r1.f2964b
            int r5 = r3 + 7
            int r7 = r6.f4504V
            if (r5 <= r7) goto L_0x025e
            int r3 = r3 + 4
            if (r3 > r7) goto L_0x025c
        L_0x025a:
            r3 = 1
            goto L_0x0271
        L_0x025c:
            r3 = 0
            goto L_0x0271
        L_0x025e:
            r5 = r3
        L_0x025f:
            int r7 = r3 + 3
            if (r5 >= r7) goto L_0x026d
            boolean r7 = r6.a(r5)
            if (r7 == 0) goto L_0x026a
            goto L_0x025a
        L_0x026a:
            int r5 = r5 + 1
            goto L_0x025f
        L_0x026d:
            boolean r3 = r6.a(r7)
        L_0x0271:
            int r5 = r6.f4504V
            r7 = 4
            if (r3 == 0) goto L_0x02ed
            int r3 = r1.f2964b
            int r9 = r3 + 7
            r11 = 10
            if (r9 <= r5) goto L_0x0293
            int r3 = h(r3, r7, r6)
            if (r3 != 0) goto L_0x028a
            d4.i r3 = new d4.i
            r3.<init>(r5, r11, r11)
            goto L_0x02a2
        L_0x028a:
            d4.i r7 = new d4.i
            int r3 = r3 + -1
            r7.<init>(r5, r3, r11)
        L_0x0291:
            r3 = r7
            goto L_0x02a2
        L_0x0293:
            int r3 = h(r3, r10, r6)
            int r3 = r3 - r8
            int r5 = r3 / 11
            int r3 = r3 % 11
            d4.i r7 = new d4.i
            r7.<init>(r9, r5, r3)
            goto L_0x0291
        L_0x02a2:
            int r5 = r3.f4018V
            r1.f2964b = r5
            int r7 = r3.f9758W
            if (r7 != r11) goto L_0x02ac
            r9 = 1
            goto L_0x02ad
        L_0x02ac:
            r9 = 0
        L_0x02ad:
            int r3 = r3.f9759X
            if (r9 == 0) goto L_0x02d0
            if (r3 != r11) goto L_0x02bd
            d4.h r3 = new d4.h
            java.lang.String r6 = r2.toString()
            r3.<init>(r5, r6)
            goto L_0x02c7
        L_0x02bd:
            d4.h r6 = new d4.h
            java.lang.String r7 = r2.toString()
            r6.<init>(r5, r7, r3)
            r3 = r6
        L_0x02c7:
            D2.G r5 = new D2.G
            r6 = 1
            r5.<init>((java.lang.Object) r3, (boolean) r6)
        L_0x02cd:
            r3 = r5
            r5 = 0
            goto L_0x0314
        L_0x02d0:
            r2.append(r7)
            if (r3 != r11) goto L_0x02e7
            d4.h r3 = new d4.h
            int r5 = r1.f2964b
            java.lang.String r6 = r2.toString()
            r3.<init>(r5, r6)
            D2.G r5 = new D2.G
            r9 = 1
            r5.<init>((java.lang.Object) r3, (boolean) r9)
            goto L_0x02cd
        L_0x02e7:
            r9 = 1
            r2.append(r3)
            goto L_0x024e
        L_0x02ed:
            int r3 = r1.f2964b
            int r8 = r3 + 1
            if (r8 <= r5) goto L_0x02f4
            goto L_0x030d
        L_0x02f4:
            r8 = 0
        L_0x02f5:
            if (r8 >= r7) goto L_0x0305
            int r9 = r8 + r3
            if (r9 >= r5) goto L_0x0305
            boolean r9 = r6.a(r9)
            if (r9 == 0) goto L_0x0302
            goto L_0x030d
        L_0x0302:
            int r8 = r8 + 1
            goto L_0x02f5
        L_0x0305:
            r3 = 2
            r1.f2965c = r3
            int r3 = r1.f2964b
            int r3 = r3 + r7
            r1.f2964b = r3
        L_0x030d:
            D2.G r3 = new D2.G
            r5 = 0
            r6 = 0
            r3.<init>((java.lang.Object) r6, (boolean) r5)
        L_0x0314:
            boolean r6 = r3.f1051U
            r17 = r6
            r6 = r3
            r3 = r17
        L_0x031b:
            int r7 = r1.f2964b
            if (r4 == r7) goto L_0x0320
            goto L_0x0322
        L_0x0320:
            if (r3 == 0) goto L_0x0328
        L_0x0322:
            if (r3 == 0) goto L_0x0325
            goto L_0x0328
        L_0x0325:
            r3 = 0
            goto L_0x0019
        L_0x0328:
            java.lang.Object r1 = r6.f1052V
            d4.h r1 = (d4.C0641h) r1
            if (r1 == 0) goto L_0x033e
            boolean r3 = r1.f9757Y
            if (r3 == 0) goto L_0x033e
            d4.h r3 = new d4.h
            java.lang.String r2 = r2.toString()
            int r1 = r1.f9756X
            r3.<init>(r7, r2, r1)
            return r3
        L_0x033e:
            d4.h r1 = new d4.h
            java.lang.String r2 = r2.toString()
            r1.<init>(r7, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.k.g(int, java.lang.String):d4.h");
    }

    public String g0() {
        return ((c) this.f9767W).r("knoxApnConfig", "");
    }

    public String g1() {
        return ((c) this.f9767W).r("licenseVolumeKey", "");
    }

    public Boolean g2() {
        return Boolean.valueOf(((c) this.f9767W).n("kioskMode", false));
    }

    public Object get() {
        switch (this.f9765U) {
            case 8:
                return new C1318a((C1342a) ((a) this.f9766V).get(), (C1214b) ((M5.b) this.f9767W).f3175U, (O4.a) ((M5.b) this.f9768X).f3175U);
            default:
                return new x4.f((F4.c) ((a) this.f9766V).get(), (C4.e) ((a) this.f9767W).get(), (D4.c) ((a) this.f9768X).get());
        }
    }

    public ClipDescription getDescription() {
        return (ClipDescription) this.f9767W;
    }

    public Boolean h0() {
        return Boolean.valueOf(((c) this.f9767W).n("knoxDisableAirCommandMode", false));
    }

    public String h1() {
        return N2(((c) this.f9767W).r("loadContentZipFileUrl", ""));
    }

    public String h2() {
        c cVar = (c) this.f9767W;
        cVar.n("showAppLauncherOnStart", false);
        return N2(cVar.r("startURL", (String) this.f9766V).trim());
    }

    public int i() {
        return ((c) this.f9767W).q("actionBarBgColor", ((Context) this.f9768X).getResources().getColor(2131099714));
    }

    public Boolean i0() {
        return Boolean.valueOf(((c) this.f9767W).n("knoxDisableAirViewMode", false));
    }

    public String i1() {
        String str;
        c cVar = (c) this.f9767W;
        if (cVar.n("showLocalPdfFiles", false)) {
            str = "1";
        } else {
            str = "0";
        }
        return cVar.r("localPdfFileMode", str);
    }

    public String i2() {
        return ((c) this.f9767W).r("systemWallpaperLastUrl", "");
    }

    public int j() {
        return ((c) this.f9767W).q("actionBarFgColor", ((Context) this.f9768X).getResources().getColor(2131099718));
    }

    public Boolean j0() {
        return Boolean.valueOf(((c) this.f9767W).n("knoxDisableAirplaneMode", false));
    }

    public String j1() {
        return ((c) this.f9767W).r("lockscreenWallpaperLastUrl", "");
    }

    public String j2() {
        return N2(((c) this.f9767W).r("systemWallpaperUrl", ""));
    }

    public String k() {
        return N2(((c) this.f9767W).r("actionBarIconUrl", ""));
    }

    public Boolean k0() {
        return Boolean.valueOf(((c) this.f9767W).n("knoxDisableAndroidBeam", false));
    }

    public String k1() {
        return N2(((c) this.f9767W).r("lockscreenWallpaperUrl", ""));
    }

    public int k2() {
        return ((c) this.f9767W).q("tabsBgColor", ((Context) this.f9768X).getResources().getColor(2131099696));
    }

    public int l() {
        try {
            return Integer.parseInt(((c) this.f9767W).r("actionBarSize", "100"));
        } catch (Exception unused) {
            return 100;
        }
    }

    public Boolean l0() {
        return Boolean.valueOf(((c) this.f9767W).n("knoxDisableAudioRecord", false));
    }

    public int l1() {
        try {
            return Integer.parseInt(((c) this.f9767W).r("mdmApkToInstallInterval", "0"));
        } catch (Exception unused) {
            return 0;
        }
    }

    public int l2() {
        return ((c) this.f9767W).q("tabsFgColor", ((Context) this.f9768X).getResources().getColor(2131099699));
    }

    public int m() {
        int q7 = ((c) this.f9767W).q("firstAppInstallVersionCode", 0);
        if (q7 > 100000) {
            return q7 - 100000;
        }
        if (q7 > 90000) {
            return q7 - 90000;
        }
        return q7;
    }

    public Boolean m0() {
        return Boolean.valueOf(((c) this.f9767W).n("knoxDisableBackButton", false));
    }

    public Boolean m1() {
        return Boolean.valueOf(((c) this.f9767W).n("mdmDisableStatusBar", false));
    }

    public int m2() {
        try {
            return Integer.parseInt(((c) this.f9767W).r("tapsToPinDialogInSingleAppMode", ""));
        } catch (Exception unused) {
            return 7;
        }
    }

    public int n() {
        try {
            return Integer.parseInt(((c) this.f9767W).r("appDarkMode", "1"));
        } catch (Exception unused) {
            return 1;
        }
    }

    public Boolean n0() {
        return Boolean.valueOf(((c) this.f9767W).n("knoxDisableBackup", false));
    }

    public Boolean n1() {
        return Boolean.valueOf(((c) this.f9767W).n("mdmLockTask", false));
    }

    public int n2() {
        try {
            return Integer.parseInt(((c) this.f9767W).r("timeToClearLauncherAppData", "0"));
        } catch (Exception unused) {
            return 0;
        }
    }

    public long o() {
        try {
            return Long.parseLong(((c) this.f9767W).r("appRestartDelay", String.valueOf(100)));
        } catch (Exception unused) {
            return 100;
        }
    }

    public Boolean o0() {
        return Boolean.valueOf(((c) this.f9767W).n("knoxDisableBluetooth", false));
    }

    public String o1() {
        return ((c) this.f9767W).r("mdmProxyConfig", "");
    }

    public int o2() {
        try {
            return Integer.parseInt(((c) this.f9767W).r("timeToClearSingleAppData", "0"));
        } catch (Exception unused) {
            return 0;
        }
    }

    public Boolean p() {
        return Boolean.valueOf(((c) this.f9767W).n("audioRecordUploads", false));
    }

    public Boolean p0() {
        return Boolean.valueOf(((c) this.f9767W).n("knoxDisableBluetoothTethering", false));
    }

    public int p1() {
        try {
            return Integer.parseInt(((c) this.f9767W).r("mdmTimeToClearSingleAppData", "0"));
        } catch (Exception unused) {
            return 0;
        }
    }

    public int p2() {
        try {
            return Integer.parseInt(((c) this.f9767W).r("timeToGoBackground", "0"));
        } catch (Exception unused) {
            return 0;
        }
    }

    public String q() {
        return N2(((c) this.f9767W).r("barcodeScanTargetUrl", ""));
    }

    public Boolean q0() {
        return Boolean.valueOf(((c) this.f9767W).n("knoxDisableCamera", false));
    }

    public String q1() {
        return ((c) this.f9767W).r("motionCameraId", "");
    }

    public int q2() {
        try {
            return Integer.parseInt(((c) this.f9767W).r("timeToRegainFocus", "0"));
        } catch (Exception unused) {
            return 0;
        }
    }

    public int r() {
        try {
            return Integer.parseInt(((c) this.f9767W).r("batteryWarning", "0"));
        } catch (Exception unused) {
            return 0;
        }
    }

    public Boolean r0() {
        return Boolean.valueOf(((c) this.f9767W).n("knoxDisableCellularData", false));
    }

    public int r1() {
        try {
            return Integer.parseInt(((c) this.f9767W).r("motionCameraApi", "0"));
        } catch (Exception unused) {
            return 0;
        }
    }

    public int r2() {
        int i;
        try {
            boolean booleanValue = s1().booleanValue();
            String str = "0";
            c cVar = (c) this.f9767W;
            if (booleanValue) {
                try {
                    i = Integer.parseInt(cVar.r("timeToScreenOff", str));
                } catch (Exception unused) {
                    i = 0;
                }
                str = String.valueOf(i);
            }
            return Integer.parseInt(cVar.r("timeToScreenOffV2", str));
        } catch (Exception unused2) {
            return 0;
        }
    }

    public Boolean s() {
        return Boolean.valueOf(((c) this.f9767W).n("cameraCaptureUploads", false));
    }

    public Boolean s0() {
        return Boolean.valueOf(((c) this.f9767W).n("knoxDisableClipboard", false));
    }

    public Boolean s1() {
        return Boolean.valueOf(((c) this.f9767W).n("motionDetection", false));
    }

    public int s2() {
        int i;
        try {
            boolean booleanValue = s1().booleanValue();
            String str = "0";
            c cVar = (c) this.f9767W;
            if (booleanValue) {
                try {
                    i = Integer.parseInt(cVar.r("timeToScreensaver", str));
                } catch (Exception unused) {
                    i = 0;
                }
                str = String.valueOf(i);
            }
            return Integer.parseInt(cVar.r("timeToScreensaverV2", str));
        } catch (Exception unused2) {
            return 0;
        }
    }

    public String t() {
        return N2(((c) this.f9767W).r("clientCaUrl", ""));
    }

    public Boolean t0() {
        return Boolean.valueOf(((c) this.f9767W).n("knoxDisableClipboardShare", false));
    }

    public Boolean t1() {
        return Boolean.valueOf(((c) this.f9767W).n("motionDetectionAcoustic", false));
    }

    public int t2() {
        try {
            return Integer.parseInt(((c) this.f9767W).r("timeToShutdownOnPowerDisconnect", "0"));
        } catch (Exception unused) {
            return 0;
        }
    }

    public Boolean u() {
        return Boolean.valueOf(((c) this.f9767W).n("cloudService", false));
    }

    public Boolean u0() {
        return Boolean.valueOf(((c) this.f9767W).n("knoxDisableDataRoaming", false));
    }

    public int u1() {
        try {
            return Integer.parseInt(((c) this.f9767W).r("motionFps", "5"));
        } catch (Exception unused) {
            return 5;
        }
    }

    public Boolean u2() {
        return Boolean.valueOf(((c) this.f9767W).n("usageStatistics", false));
    }

    public ColorStateList v(int i) {
        int resourceId;
        ColorStateList c8;
        TypedArray typedArray = (TypedArray) this.f9767W;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (c8 = j0.f.c((Context) this.f9766V, resourceId)) == null) {
            return typedArray.getColorStateList(i);
        }
        return c8;
    }

    public Boolean v0() {
        return Boolean.valueOf(((c) this.f9767W).n("knoxDisableDeveloperMode", false));
    }

    public int v1() {
        try {
            return Integer.parseInt(((c) this.f9767W).r("motionSensitivity", "90"));
        } catch (Exception unused) {
            return 0;
        }
    }

    public String v2() {
        c cVar = (c) this.f9767W;
        String replace = cVar.r("userAgent", "0").trim().replace("\r\n", " ").replace("\n", " ");
        String replace2 = cVar.r("customUserAgent", "").trim().replace("\r\n", " ").replace("\n", " ");
        if (!replace.equals("custom")) {
            return replace;
        }
        if (!replace2.isEmpty()) {
            return replace2;
        }
        return "Fully Custom User Agent String";
    }

    public long w() {
        l lVar = (l) this.f9768X;
        if (lVar != null) {
            return lVar.f14408X;
        }
        return -1;
    }

    public Boolean w0() {
        return Boolean.valueOf(((c) this.f9767W).n("knoxDisableEdgeScreen", false));
    }

    public int w1() {
        try {
            return Integer.parseInt(((c) this.f9767W).r("motionSensitivityAcoustic", "90"));
        } catch (Exception unused) {
            return 0;
        }
    }

    public Boolean w2() {
        return Boolean.valueOf(((c) this.f9767W).n("videoCaptureUploads", false));
    }

    public int x() {
        try {
            return Integer.parseInt(((c) this.f9767W).r("darknessLevel", "10"));
        } catch (Exception unused) {
            return 0;
        }
    }

    public Boolean x0() {
        return Boolean.valueOf(((c) this.f9767W).n("knoxDisableFactoryReset", false));
    }

    public float x1() {
        try {
            return Float.parseFloat(((c) this.f9767W).r("movementBeaconDistance", "5"));
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    public int x2() {
        if (!n2.a.z0()) {
            return 1;
        }
        try {
            return Integer.parseInt(((c) this.f9767W).r("videoPlayerEngine", "0"));
        } catch (Exception unused) {
            return 0;
        }
    }

    public String y() {
        return ((c) this.f9767W).r("deniedPermissions", "");
    }

    public Boolean y0() {
        return Boolean.valueOf(((c) this.f9767W).n("knoxDisableFirmwareRecovery", false));
    }

    public Boolean y1() {
        return Boolean.valueOf(((c) this.f9767W).n("movementDetection", false));
    }

    public String y2() {
        return ((c) this.f9767W).r("volumeLicenseKey", "");
    }

    public int z() {
        try {
            return Integer.parseInt(((c) this.f9767W).r("detectFacesConfidence", "30"));
        } catch (Exception unused) {
            return 0;
        }
    }

    public Boolean z0() {
        return Boolean.valueOf(((c) this.f9767W).n("knoxDisableGoogleAccountsAutoSync", false));
    }

    public Boolean z1() {
        return Boolean.valueOf(((c) this.f9767W).n("mqttEnabled", false));
    }

    public String z2() {
        return ((c) this.f9767W).r("volumeLimits", "");
    }

    public /* synthetic */ k(Object obj, Object obj2, Object obj3, int i) {
        this.f9765U = i;
        this.f9766V = obj;
        this.f9767W = obj2;
        this.f9768X = obj3;
    }

    public k(Context context, int i) {
        String str;
        boolean z = true;
        this.f9765U = i;
        switch (i) {
            case 2:
                this.f9766V = new AtomicBoolean(false);
                k kVar = new k(context, 1);
                c cVar = (c) kVar.f9767W;
                Uri parse = Uri.parse(kVar.N2(cVar.r("mqttBrokerUrl", "")));
                String scheme = parse.getScheme();
                String host = parse.getHost();
                int port = parse.getPort();
                if (kVar.O2(cVar.r("mqttClientId", "")).isEmpty()) {
                    str = UUID.randomUUID().toString();
                } else {
                    str = kVar.O2(cVar.r("mqttClientId", ""));
                }
                if (scheme == null || host == null || host.length() <= 1 || port == -1 || port >= 65536) {
                    Log.w("k", "MQTT connection failed due to invalid URL");
                    n2.a.b1(context, "MQTT connection failed due to invalid URL");
                    this.f9767W = null;
                    return;
                }
                try {
                    e5.c d8 = g.d();
                    d8.b(str);
                    d8.f11269f = null;
                    C0996d.o(host, "Server host");
                    d8.f11265a = host;
                    d8.c(port);
                    u4.d g8 = u4.d.g(cVar.r("mqttBrokerUsername", ""), "Username");
                    byte[] bytes = cVar.r("mqttBrokerPassword", "").getBytes();
                    C0996d.r(bytes, "Password");
                    if (bytes.length > 65535) {
                        z = false;
                    }
                    if (z) {
                        M4.c cVar2 = new M4.c(g8, ByteBuffer.wrap(bytes));
                        C0996d.p(new N4.a(cVar2), N4.a.class, "Simple auth");
                        d8.f11273k = cVar2;
                        J4.a aVar = d8.f11271h;
                        int i8 = J4.a.f2505c;
                        int i9 = J4.a.f2505c;
                        if (aVar != null) {
                            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                            timeUnit.convert(aVar.f2506a, timeUnit);
                            timeUnit.convert(aVar.f2507b, timeUnit);
                        }
                        TimeUnit timeUnit2 = TimeUnit.SECONDS;
                        C0996d.r(timeUnit2, "Time unit");
                        J4.a aVar2 = new J4.a(timeUnit2.toNanos(10), timeUnit2.toNanos(60));
                        C0996d.q(aVar2, J4.a.class, "Automatic reconnect");
                        d8.f11271h = aVar2;
                        P1 p12 = new P1(this);
                        if (d8.i == null) {
                            d8.i = new D2.o(14, (byte) 0);
                        }
                        d8.i.a(p12);
                        Q1 q12 = new Q1(context, this);
                        if (d8.f11272j == null) {
                            d8.f11272j = new D2.o(14, (byte) 0);
                        }
                        d8.f11272j.a(q12);
                        if (!scheme.equalsIgnoreCase("ssl")) {
                            if (!scheme.equalsIgnoreCase("wss")) {
                                if (scheme.equalsIgnoreCase("tls")) {
                                }
                                if (scheme.equalsIgnoreCase("wss") || scheme.equalsIgnoreCase("ws")) {
                                    d8.f11269f = null;
                                    d8.f11268d = m4.g.f13383c;
                                }
                                this.f9767W = d8.a();
                                return;
                            }
                        }
                        d8.f11269f = null;
                        d8.f11267c = m4.e.f13377b;
                        d8.f11269f = null;
                        d8.f11268d = m4.g.f13383c;
                        this.f9767W = d8.a();
                        return;
                    }
                    throw new IllegalArgumentException("Password can not be encoded as binary data. Maximum length is 65535 bytes, but was " + bytes.length + " bytes.");
                } catch (Exception e) {
                    e = e;
                    Log.e("k", "Failed to init the MQTT client due to " + e.getMessage());
                    n2.a.b1(context, "Failed to init the MQTT client, please try an older version of Fully");
                    this.f9767W = null;
                    return;
                } catch (Error e8) {
                    e = e8;
                    Log.e("k", "Failed to init the MQTT client due to " + e.getMessage());
                    n2.a.b1(context, "Failed to init the MQTT client, please try an older version of Fully");
                    this.f9767W = null;
                    return;
                }
            default:
                this.f9768X = context;
                this.f9767W = new c(context);
                this.f9766V = context.getString(2131951676);
                return;
        }
    }

    public k(MyApplication myApplication, C1395d dVar) {
        this.f9765U = 15;
        this.f9766V = myApplication;
        this.f9767W = dVar;
        this.f9768X = ((x7.c) dVar.f14977t0).a(dVar, ReportInteraction.class);
    }

    public k(S3.a aVar) {
        this.f9765U = 0;
        C0123k kVar = new C0123k(7);
        kVar.f2964b = 0;
        kVar.f2965c = 1;
        this.f9767W = kVar;
        this.f9768X = new StringBuilder();
        this.f9766V = aVar;
    }

    public k(StreamConfigurationMap streamConfigurationMap, i iVar) {
        this.f9765U = 13;
        this.f9768X = new HashMap();
        new HashMap();
        new HashMap();
        if (Build.VERSION.SDK_INT >= 23) {
            this.f9766V = new C1160q(24, (Object) streamConfigurationMap);
        } else {
            this.f9766V = new C1160q(24, (Object) streamConfigurationMap);
        }
        this.f9767W = iVar;
    }

    public k(k kVar) {
        this.f9765U = 9;
        C1420b bVar = (C1420b) kVar.f9766V;
        int h5 = bVar.h();
        this.f9766V = new p2.e[h5];
        this.f9767W = new p2.e[h5];
        this.f9768X = new p2.e[h5];
        int length = bVar.f16371V.length;
        for (int i = 0; i < length; i++) {
            C1419a aVar = (C1419a) bVar.e(i);
            C1425g gVar = aVar.f15183b;
            v vVar = new v(((C1424f) gVar.e(0)).f15197V);
            int i8 = aVar.f15182a;
            ((p2.e[]) this.f9766V)[i8] = vVar;
            p pVar = gVar.h().f15197V;
            ((p2.e[]) this.f9767W)[i8] = new v(pVar);
            ((p2.e[]) this.f9768X)[i8] = new v(pVar);
        }
    }

    public k(C1420b bVar) {
        this.f9765U = 11;
        this.f9766V = bVar;
        this.f9767W = null;
        this.f9768X = null;
    }

    public k(k kVar, int[] iArr, k kVar2) {
        this.f9765U = 10;
        if (iArr == null) {
            throw new NullPointerException("order == null");
        } else if (kVar2 != null) {
            this.f9766V = kVar;
            this.f9767W = iArr;
            this.f9768X = kVar2;
        } else {
            throw new NullPointerException("addresses == null");
        }
    }

    public k(Runnable runnable) {
        this.f9765U = 14;
        this.f9767W = new CopyOnWriteArrayList();
        this.f9768X = new HashMap();
        this.f9766V = runnable;
    }

    public k(Context context, TypedArray typedArray) {
        this.f9765U = 7;
        this.f9766V = context;
        this.f9767W = typedArray;
    }

    public k(Context context, LocationManager locationManager) {
        this.f9765U = 5;
        this.f9768X = new Object();
        this.f9766V = context;
        this.f9767W = locationManager;
    }

    public k(d0.e eVar) {
        this.f9765U = 4;
        this.f9766V = new ArrayList();
        this.f9767W = new Object();
        this.f9768X = eVar;
    }

    public k(K2 k22) {
        this.f9765U = 12;
        this.f9768X = k22;
        this.f9767W = new AtomicBoolean(false);
        this.f9766V = ((C1479t) k22.f10051W).f15689X.schedule((Runnable) new C1476q(this, 0), 2000, TimeUnit.MILLISECONDS);
    }
}
