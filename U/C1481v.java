package u;

import A.f;
import A4.d;
import B.C0003d;
import B.C0004e;
import B.C0005f;
import D.C0054l;
import D.C0069x;
import D.s0;
import F.h;
import Q0.g;
import a1.C0412c;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Log;
import android.util.Pair;
import android.util.Size;
import androidx.lifecycle.x;
import com.bumptech.glide.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import n2.a;
import v.k;
import v.r;

/* renamed from: u.v  reason: case insensitive filesystem */
public final class C1481v implements C0069x {

    /* renamed from: a  reason: collision with root package name */
    public final String f15720a;

    /* renamed from: b  reason: collision with root package name */
    public final k f15721b;

    /* renamed from: c  reason: collision with root package name */
    public final f f15722c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f15723d = new Object();
    public C1467h e;

    /* renamed from: f  reason: collision with root package name */
    public final C1480u f15724f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList f15725g = null;

    /* renamed from: h  reason: collision with root package name */
    public final s0 f15726h;

    public C1481v(String str, r rVar) {
        str.getClass();
        this.f15720a = str;
        k b8 = rVar.b(str);
        this.f15721b = b8;
        f fVar = new f(0, false);
        fVar.f17V = this;
        this.f15722c = fVar;
        this.f15726h = C0003d.q(b8);
        new HashMap();
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            h.I("Camera2EncoderProfilesProvider", "Camera id is not an integer: " + str + ", unable to create Camera2EncoderProfilesProvider");
        }
        this.f15724f = new C1480u(new C0004e(5, (C0005f) null));
    }

    public final void a(C1467h hVar) {
        String str;
        synchronized (this.f15723d) {
            try {
                this.e = hVar;
                ArrayList arrayList = this.f15725g;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        C1467h hVar2 = this.e;
                        hVar2.getClass();
                        hVar2.f15626V.execute(new d(hVar2, (Executor) pair.second, (C0054l) pair.first, 14));
                    }
                    this.f15725g = null;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        Integer num = (Integer) this.f15721b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        num.getClass();
        int intValue = num.intValue();
        if (intValue == 0) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
        } else if (intValue == 1) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
        } else if (intValue == 2) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
        } else if (intValue == 3) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
        } else if (intValue != 4) {
            str = g.m(intValue, "Unknown value: ");
        } else {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
        }
        String d8 = C1477r.d("Device Level: ", str);
        String G8 = h.G("Camera2CameraInfo");
        if (h.u(4, G8)) {
            Log.i(G8, d8);
        }
    }

    public final x b() {
        return this.f15724f;
    }

    public final int c() {
        return g(0);
    }

    public final int d() {
        boolean z;
        Integer num = (Integer) this.f15721b.a(CameraCharacteristics.LENS_FACING);
        if (num != null) {
            z = true;
        } else {
            z = false;
        }
        a.h("Unable to get the lens facing of the camera.", z);
        int intValue = num.intValue();
        if (intValue == 0) {
            return 0;
        }
        if (intValue == 1) {
            return 1;
        }
        if (intValue == 2) {
            return 2;
        }
        throw new IllegalArgumentException(C1477r.c(intValue, "The given lens facing integer: ", " can not be recognized."));
    }

    public final String e() {
        return this.f15720a;
    }

    public final String f() {
        Integer num = (Integer) this.f15721b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        num.getClass();
        if (num.intValue() == 2) {
            return "androidx.camera.camera2.legacy";
        }
        return "androidx.camera.camera2";
    }

    public final int g(int i) {
        Integer num = (Integer) this.f15721b.a(CameraCharacteristics.SENSOR_ORIENTATION);
        num.getClass();
        int intValue = num.intValue();
        int z = c.z(i);
        boolean z6 = true;
        if (1 != d()) {
            z6 = false;
        }
        return c.p(z, intValue, z6);
    }

    public final C0069x h() {
        return this;
    }

    public final void i(C0054l lVar) {
        synchronized (this.f15723d) {
            try {
                C1467h hVar = this.e;
                if (hVar == null) {
                    ArrayList arrayList = this.f15725g;
                    if (arrayList != null) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (((Pair) it.next()).first == lVar) {
                                it.remove();
                            }
                        }
                        return;
                    }
                    return;
                }
                hVar.f15626V.execute(new C0412c((Object) hVar, 17, (Object) lVar));
            } finally {
            }
        }
    }

    public final void j(F.a aVar, U.c cVar) {
        synchronized (this.f15723d) {
            try {
                C1467h hVar = this.e;
                if (hVar == null) {
                    if (this.f15725g == null) {
                        this.f15725g = new ArrayList();
                    }
                    this.f15725g.add(new Pair(cVar, aVar));
                    return;
                }
                hVar.f15626V.execute(new d(hVar, aVar, cVar, 14));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final s0 k() {
        return this.f15726h;
    }

    public final List l(int i) {
        Size[] B12 = this.f15721b.b().B1(i);
        if (B12 != null) {
            return Arrays.asList(B12);
        }
        return Collections.emptyList();
    }
}
