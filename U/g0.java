package u;

import B.C0022x;
import B.W;
import B.a0;
import B.b0;
import B.j0;
import B.p0;
import B.q0;
import C.e;
import D.Z;
import D.y0;
import D7.b;
import E.c;
import F.h;
import G.i;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.ImageWriter;
import android.util.Size;
import j$.util.Objects;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import v.k;

public final class g0 implements e0 {

    /* renamed from: U  reason: collision with root package name */
    public final k f15616U;

    /* renamed from: V  reason: collision with root package name */
    public final q0 f15617V;

    /* renamed from: W  reason: collision with root package name */
    public boolean f15618W = false;

    /* renamed from: X  reason: collision with root package name */
    public final boolean f15619X = false;

    /* renamed from: Y  reason: collision with root package name */
    public final boolean f15620Y = false;

    /* renamed from: Z  reason: collision with root package name */
    public j0 f15621Z;

    /* renamed from: a0  reason: collision with root package name */
    public a0 f15622a0;

    /* renamed from: b0  reason: collision with root package name */
    public p0 f15623b0;

    /* renamed from: c0  reason: collision with root package name */
    public ImageWriter f15624c0;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g0(v.k r7) {
        /*
            r6 = this;
            r6.<init>()
            r0 = 0
            r6.f15618W = r0
            r6.f15619X = r0
            r6.f15620Y = r0
            r6.f15616U = r7
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES
            java.lang.Object r7 = r7.a(r1)
            int[] r7 = (int[]) r7
            r1 = 1
            if (r7 == 0) goto L_0x0025
            int r2 = r7.length
            r3 = 0
        L_0x0019:
            if (r3 >= r2) goto L_0x0025
            r4 = r7[r3]
            r5 = 4
            if (r4 != r5) goto L_0x0022
            r7 = 1
            goto L_0x0026
        L_0x0022:
            int r3 = r3 + 1
            goto L_0x0019
        L_0x0025:
            r7 = 0
        L_0x0026:
            r6.f15619X = r7
            D.s0 r7 = x.C1594a.f16229a
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk> r2 = androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk.class
            D.o0 r7 = r7.j(r2)
            if (r7 == 0) goto L_0x0033
            r0 = 1
        L_0x0033:
            r6.f15620Y = r0
            B.q0 r7 = new B.q0
            l1.j r0 = new l1.j
            r1 = 4
            r0.<init>(r1)
            r7.<init>((l1.j) r0)
            r6.f15617V = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u.g0.<init>(v.k):void");
    }

    public final void a(y0 y0Var) {
        boolean isEmpty;
        HashMap hashMap;
        StreamConfigurationMap streamConfigurationMap;
        int[] e;
        q0 q0Var = this.f15617V;
        while (true) {
            synchronized (q0Var.f301W) {
                isEmpty = ((ArrayDeque) q0Var.f300V).isEmpty();
            }
            if (!isEmpty) {
                ((W) q0Var.o()).close();
            } else {
                p0 p0Var = this.f15623b0;
                StreamConfigurationMap streamConfigurationMap2 = null;
                if (p0Var != null) {
                    j0 j0Var = this.f15621Z;
                    if (j0Var != null) {
                        i.d(p0Var.e).d(new e(j0Var, 2), b.H());
                        this.f15621Z = null;
                    }
                    p0Var.a();
                    this.f15623b0 = null;
                }
                ImageWriter imageWriter = this.f15624c0;
                if (imageWriter != null) {
                    imageWriter.close();
                    this.f15624c0 = null;
                }
                if (this.f15618W) {
                    y0Var.f959b.f264U = 1;
                    return;
                } else if (this.f15620Y) {
                    y0Var.f959b.f264U = 1;
                    return;
                } else {
                    try {
                        streamConfigurationMap2 = (StreamConfigurationMap) this.f15616U.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                    } catch (AssertionError e8) {
                        h.l("ZslControlImpl", "Failed to retrieve StreamConfigurationMap, error = " + e8.getMessage());
                    }
                    if (streamConfigurationMap2 == null || streamConfigurationMap2.getInputFormats() == null) {
                        hashMap = new HashMap();
                    } else {
                        hashMap = new HashMap();
                        for (int i : streamConfigurationMap2.getInputFormats()) {
                            Size[] f8 = streamConfigurationMap2.getInputSizes(i);
                            if (f8 != null) {
                                Arrays.sort(f8, new c(true));
                                hashMap.put(Integer.valueOf(i), f8[0]);
                            }
                        }
                    }
                    if (this.f15619X && !hashMap.isEmpty() && hashMap.containsKey(34) && (streamConfigurationMap = (StreamConfigurationMap) this.f15616U.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (e = streamConfigurationMap.getValidOutputFormatsForInput(34)) != null) {
                        for (int i8 : e) {
                            if (i8 == 256) {
                                Size size = (Size) hashMap.get(34);
                                b0 b0Var = new b0(size.getWidth(), size.getHeight(), 34, 9);
                                this.f15622a0 = b0Var.f217V;
                                this.f15621Z = new j0((Z) b0Var);
                                b0Var.E(new androidx.camera.lifecycle.c(19, this), b.z());
                                p0 p0Var2 = new p0(this.f15621Z.j(), new Size(this.f15621Z.c(), this.f15621Z.b()), 34);
                                this.f15623b0 = p0Var2;
                                j0 j0Var2 = this.f15621Z;
                                L3.b d8 = i.d(p0Var2.e);
                                Objects.requireNonNull(j0Var2);
                                d8.d(new e(j0Var2, 2), b.H());
                                y0Var.b(this.f15623b0, C0022x.f360d, -1);
                                a0 a0Var = this.f15622a0;
                                y0Var.f959b.d(a0Var);
                                ArrayList arrayList = y0Var.e;
                                if (!arrayList.contains(a0Var)) {
                                    arrayList.add(a0Var);
                                }
                                C1442B b8 = new C1442B(2, this);
                                ArrayList arrayList2 = y0Var.f961d;
                                if (!arrayList2.contains(b8)) {
                                    arrayList2.add(b8);
                                }
                                f0.c();
                                y0Var.f963g = f0.a(this.f15621Z.c(), this.f15621Z.b(), this.f15621Z.t());
                                return;
                            }
                        }
                    }
                    y0Var.f959b.f264U = 1;
                    return;
                }
            }
        }
        while (true) {
        }
    }

    public final void b(boolean z) {
    }

    public final void c(boolean z) {
        this.f15618W = z;
    }
}
