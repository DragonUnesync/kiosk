package w;

import F.h;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import j$.util.Objects;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final List f16163a;

    /* renamed from: b  reason: collision with root package name */
    public final Size f16164b;

    /* renamed from: c  reason: collision with root package name */
    public final int f16165c;

    /* renamed from: d  reason: collision with root package name */
    public final int f16166d;
    public String e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f16167f = false;

    /* renamed from: g  reason: collision with root package name */
    public long f16168g = 1;

    public q(Surface surface) {
        Size size;
        int i;
        Class<Surface> cls = Surface.class;
        int i8 = 0;
        this.f16163a = Collections.singletonList(surface);
        try {
            Method declaredMethod = Class.forName("android.hardware.camera2.legacy.LegacyCameraDevice").getDeclaredMethod("getSurfaceSize", new Class[]{cls});
            declaredMethod.setAccessible(true);
            size = (Size) declaredMethod.invoke((Object) null, new Object[]{surface});
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e8) {
            h.m("OutputConfigCompat", "Unable to retrieve surface size.", e8);
            size = null;
        }
        this.f16164b = size;
        try {
            Method declaredMethod2 = Class.forName("android.hardware.camera2.legacy.LegacyCameraDevice").getDeclaredMethod("detectSurfaceType", new Class[]{cls});
            if (Build.VERSION.SDK_INT < 22) {
                declaredMethod2.setAccessible(true);
            }
            i8 = ((Integer) declaredMethod2.invoke((Object) null, new Object[]{surface})).intValue();
        } catch (ClassNotFoundException e9) {
            e = e9;
            h.m("OutputConfigCompat", "Unable to retrieve surface format.", e);
            this.f16165c = i8;
            i = ((Integer) cls.getDeclaredMethod("getGenerationId", (Class[]) null).invoke(surface, (Object[]) null)).intValue();
            this.f16166d = i;
        } catch (NoSuchMethodException e10) {
            e = e10;
            h.m("OutputConfigCompat", "Unable to retrieve surface format.", e);
            this.f16165c = i8;
            i = ((Integer) cls.getDeclaredMethod("getGenerationId", (Class[]) null).invoke(surface, (Object[]) null)).intValue();
            this.f16166d = i;
        } catch (IllegalAccessException e11) {
            e = e11;
            h.m("OutputConfigCompat", "Unable to retrieve surface format.", e);
            this.f16165c = i8;
            i = ((Integer) cls.getDeclaredMethod("getGenerationId", (Class[]) null).invoke(surface, (Object[]) null)).intValue();
            this.f16166d = i;
        } catch (InvocationTargetException e12) {
            e = e12;
            h.m("OutputConfigCompat", "Unable to retrieve surface format.", e);
            this.f16165c = i8;
            i = ((Integer) cls.getDeclaredMethod("getGenerationId", (Class[]) null).invoke(surface, (Object[]) null)).intValue();
            this.f16166d = i;
        }
        this.f16165c = i8;
        try {
            i = ((Integer) cls.getDeclaredMethod("getGenerationId", (Class[]) null).invoke(surface, (Object[]) null)).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e13) {
            h.m("OutputConfigCompat", "Unable to retrieve surface generation id.", e13);
            i = -1;
        }
        this.f16166d = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (!this.f16164b.equals(qVar.f16164b) || this.f16165c != qVar.f16165c || this.f16166d != qVar.f16166d || this.f16167f != qVar.f16167f || this.f16168g != qVar.f16168g || !Objects.equals(this.e, qVar.e)) {
            return false;
        }
        List list = this.f16163a;
        int size = list.size();
        List list2 = qVar.f16163a;
        int min = Math.min(size, list2.size());
        for (int i = 0; i < min; i++) {
            if (list.get(i) != list2.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f16163a.hashCode() ^ 31;
        int i8 = this.f16166d ^ ((hashCode << 5) - hashCode);
        int hashCode2 = this.f16164b.hashCode() ^ ((i8 << 5) - i8);
        int i9 = this.f16165c ^ ((hashCode2 << 5) - hashCode2);
        boolean z = this.f16167f ^ ((i9 << 5) - i9);
        int i10 = ((z ? 1 : 0) << true) - z;
        String str = this.e;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i11 = i ^ i10;
        int i12 = (i11 << 5) - i11;
        long j7 = this.f16168g;
        return ((int) (j7 ^ (j7 >>> 32))) ^ i12;
    }
}
