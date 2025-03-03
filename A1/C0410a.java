package a1;

import D6.k;
import E.e;
import Y6.s;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.L;
import c1.j;
import c1.n;
import c1.t;
import com.bumptech.glide.b;
import com.bumptech.glide.c;
import com.bumptech.glide.manager.f;
import com.bumptech.glide.manager.g;
import com.bumptech.glide.manager.h;
import com.bumptech.glide.o;
import de.ozerov.fully.ProvisioningActivity;
import f1.C0886E;
import f1.C0887F;
import f1.C0890c;
import f3.C0899a;
import g2.C0943A;
import g2.C0944B;
import h.C1022j;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l1.r;
import n2.a;
import u.C1455O;
import z3.C1646a;

/* renamed from: a1.a  reason: case insensitive filesystem */
public class C0410a implements r, t, j, g, f {

    /* renamed from: V  reason: collision with root package name */
    public static boolean f7018V = true;

    /* renamed from: W  reason: collision with root package name */
    public static Method f7019W = null;

    /* renamed from: X  reason: collision with root package name */
    public static boolean f7020X = false;

    /* renamed from: Y  reason: collision with root package name */
    public static Field f7021Y = null;

    /* renamed from: Z  reason: collision with root package name */
    public static boolean f7022Z = false;

    /* renamed from: a0  reason: collision with root package name */
    public static boolean f7023a0 = true;

    /* renamed from: b0  reason: collision with root package name */
    public static boolean f7024b0 = true;

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f7025U;

    public /* synthetic */ C0410a(int i) {
        this.f7025U = i;
    }

    public static ArrayList g(List list) {
        P6.f.e(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((s) next) != s.HTTP_1_0) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(k.M(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((s) it.next()).f6727U);
        }
        return arrayList2;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [l7.f, java.lang.Object] */
    public static byte[] l(List list) {
        P6.f.e(list, "protocols");
        ? obj = new Object();
        Iterator it = g(list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            obj.z(str.length());
            obj.D(str);
        }
        return obj.o(obj.f13216V);
    }

    public static C0410a m(Context context, int i) {
        boolean z;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        a.h("Cannot create a CalendarItemStyle with a styleResId of 0", z);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C0899a.f11659m);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        c.j(context, obtainStyledAttributes, 4);
        c.j(context, obtainStyledAttributes, 9);
        c.j(context, obtainStyledAttributes, 7);
        obtainStyledAttributes.getDimensionPixelSize(8, 0);
        z3.k.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new C1646a((float) 0)).a();
        obtainStyledAttributes.recycle();
        C0410a aVar = new C0410a(19);
        a.k(rect.left);
        a.k(rect.top);
        a.k(rect.right);
        a.k(rect.bottom);
        return aVar;
    }

    public static MediaCodec o(C1455O o2) {
        StringBuilder sb = new StringBuilder("createCodec:");
        String str = ((n) o2.f15529a).f8797a;
        sb.append(str);
        Trace.beginSection(sb.toString());
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return createByCodecName;
    }

    public static Path p(float f8, float f9, float f10, float f11) {
        Path path = new Path();
        path.moveTo(f8, f9);
        path.lineTo(f10, f11);
        return path;
    }

    public static boolean s() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    public void A(View view, Matrix matrix) {
        if (f7024b0) {
            try {
                C0944B.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f7024b0 = false;
            }
        }
    }

    public void a(h hVar) {
        hVar.j();
    }

    public void b(h hVar) {
    }

    public MediaCodecInfo c(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    public void d(C1022j jVar) {
    }

    public boolean e(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    public int f() {
        return MediaCodecList.getCodecCount();
    }

    public boolean h(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if (!"secure-playback".equals(str) || !"video/avc".equals(str2)) {
            return false;
        }
        return true;
    }

    public r i(n nVar, k kVar) {
        return new q(nVar, kVar);
    }

    public boolean j() {
        return false;
    }

    public o k(b bVar, g gVar, C0410a aVar, Context context) {
        switch (this.f7025U) {
            case 10:
                return new o(bVar, gVar, aVar, context);
            default:
                return new o(bVar, gVar, aVar, context);
        }
    }

    public C0890c n(int i) {
        int i8;
        switch (this.f7025U) {
            case 25:
                C0886E e = new C0886E();
                e.f(e.o(i * 2));
                return e;
            default:
                C0887F f8 = new C0887F();
                C0887F f9 = new C0887F();
                boolean z = false;
                try {
                    f8.f11496U.f(e.o(0));
                    int d8 = f8.d();
                    if (d8 % 2 == 0) {
                        z = true;
                    }
                    if (z) {
                        i8 = d8 + 1;
                    } else {
                        i8 = d8 - 1;
                    }
                    f9.f11496U.f(e.o(i8));
                    if (z) {
                        f8.f11497V = f9;
                        return f8;
                    }
                    f9.f11497V = f8;
                    return f9;
                } catch (IOException e8) {
                    R.e.d(f8);
                    R.e.d(f9);
                    throw e8;
                }
        }
    }

    public Signature[] q(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public float r(View view) {
        if (f7018V) {
            try {
                return C0943A.a(view);
            } catch (NoSuchMethodError unused) {
                f7018V = false;
            }
        }
        return view.getAlpha();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c1.k t(u.C1455O r6) {
        /*
            r5 = this;
            r0 = 0
            android.media.MediaCodec r0 = o(r6)     // Catch:{ IOException -> 0x0023, RuntimeException -> 0x0021 }
            java.lang.String r1 = "configureCodec"
            android.os.Trace.beginSection(r1)     // Catch:{ IOException -> 0x0023, RuntimeException -> 0x0021 }
            java.lang.Object r1 = r6.f15532d     // Catch:{ IOException -> 0x0023, RuntimeException -> 0x0021 }
            android.view.Surface r1 = (android.view.Surface) r1     // Catch:{ IOException -> 0x0023, RuntimeException -> 0x0021 }
            if (r1 != 0) goto L_0x0025
            java.lang.Object r2 = r6.f15529a     // Catch:{ IOException -> 0x0023, RuntimeException -> 0x0021 }
            c1.n r2 = (c1.n) r2     // Catch:{ IOException -> 0x0023, RuntimeException -> 0x0021 }
            boolean r2 = r2.f8803h     // Catch:{ IOException -> 0x0023, RuntimeException -> 0x0021 }
            if (r2 == 0) goto L_0x0025
            int r2 = P0.z.f3748a     // Catch:{ IOException -> 0x0023, RuntimeException -> 0x0021 }
            r3 = 35
            if (r2 < r3) goto L_0x0025
            r2 = 8
            goto L_0x0026
        L_0x0021:
            r6 = move-exception
            goto L_0x0049
        L_0x0023:
            r6 = move-exception
            goto L_0x0049
        L_0x0025:
            r2 = 0
        L_0x0026:
            java.lang.Object r3 = r6.f15530b     // Catch:{ IOException -> 0x0023, RuntimeException -> 0x0021 }
            android.media.MediaFormat r3 = (android.media.MediaFormat) r3     // Catch:{ IOException -> 0x0023, RuntimeException -> 0x0021 }
            java.lang.Object r4 = r6.e     // Catch:{ IOException -> 0x0023, RuntimeException -> 0x0021 }
            android.media.MediaCrypto r4 = (android.media.MediaCrypto) r4     // Catch:{ IOException -> 0x0023, RuntimeException -> 0x0021 }
            r0.configure(r3, r1, r4, r2)     // Catch:{ IOException -> 0x0023, RuntimeException -> 0x0021 }
            android.os.Trace.endSection()     // Catch:{ IOException -> 0x0023, RuntimeException -> 0x0021 }
            java.lang.String r1 = "startCodec"
            android.os.Trace.beginSection(r1)     // Catch:{ IOException -> 0x0023, RuntimeException -> 0x0021 }
            r0.start()     // Catch:{ IOException -> 0x0023, RuntimeException -> 0x0021 }
            android.os.Trace.endSection()     // Catch:{ IOException -> 0x0023, RuntimeException -> 0x0021 }
            R2.c r1 = new R2.c     // Catch:{ IOException -> 0x0023, RuntimeException -> 0x0021 }
            java.lang.Object r6 = r6.f15533f     // Catch:{ IOException -> 0x0023, RuntimeException -> 0x0021 }
            B.q0 r6 = (B.q0) r6     // Catch:{ IOException -> 0x0023, RuntimeException -> 0x0021 }
            r1.<init>((android.media.MediaCodec) r0, (B.q0) r6)     // Catch:{ IOException -> 0x0023, RuntimeException -> 0x0021 }
            return r1
        L_0x0049:
            if (r0 == 0) goto L_0x004e
            r0.release()
        L_0x004e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.C0410a.t(u.O):c1.k");
    }

    public boolean u(CharSequence charSequence) {
        return false;
    }

    public void v(View view, int i, int i8, int i9, int i10) {
        if (!f7020X) {
            Class<View> cls = View.class;
            try {
                Class cls2 = Integer.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("setFrame", new Class[]{cls2, cls2, cls2, cls2});
                f7019W = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi19", "Failed to retrieve setFrame method", e);
            }
            f7020X = true;
        }
        Method method = f7019W;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{Integer.valueOf(i), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10)});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e8) {
                throw new RuntimeException(e8.getCause());
            }
        }
    }

    public void w(View view, float f8) {
        if (f7018V) {
            try {
                C0943A.b(view, f8);
                return;
            } catch (NoSuchMethodError unused) {
                f7018V = false;
            }
        }
        view.setAlpha(f8);
    }

    public r x() {
        return new q(n.f7104l, (k) null);
    }

    public void y(View view, int i) {
        if (!f7022Z) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f7021Y = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f7022Z = true;
        }
        Field field = f7021Y;
        if (field != null) {
            try {
                f7021Y.setInt(view, i | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void z(View view, Matrix matrix) {
        if (f7023a0) {
            try {
                C0944B.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f7023a0 = false;
            }
        }
    }

    public C0410a(ProvisioningActivity provisioningActivity) {
        this.f7025U = 23;
    }

    public C0410a(R2.c cVar, L l8) {
        this.f7025U = 17;
    }
}
