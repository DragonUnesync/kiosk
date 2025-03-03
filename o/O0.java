package o;

import N5.c;
import Y.g;
import Y.i;
import Y.j;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.TypedValue;
import h2.C1077r;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import u.C1455O;

public final class O0 {

    /* renamed from: h  reason: collision with root package name */
    public static final PorterDuff.Mode f13864h = PorterDuff.Mode.SRC_IN;
    public static O0 i;

    /* renamed from: j  reason: collision with root package name */
    public static final M0 f13865j = new c(6);

    /* renamed from: a  reason: collision with root package name */
    public WeakHashMap f13866a;

    /* renamed from: b  reason: collision with root package name */
    public i f13867b;

    /* renamed from: c  reason: collision with root package name */
    public j f13868c;

    /* renamed from: d  reason: collision with root package name */
    public final WeakHashMap f13869d = new WeakHashMap(0);
    public TypedValue e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f13870f;

    /* renamed from: g  reason: collision with root package name */
    public C1455O f13871g;

    public static synchronized O0 d() {
        O0 o02;
        synchronized (O0.class) {
            try {
                if (i == null) {
                    O0 o03 = new O0();
                    i = o03;
                    j(o03);
                }
                o02 = i;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return o02;
    }

    public static synchronized PorterDuffColorFilter h(int i8, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (O0.class) {
            M0 m02 = f13865j;
            m02.getClass();
            int i9 = (31 + i8) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) m02.h(Integer.valueOf(mode.hashCode() + i9));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i8, mode);
                PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) m02.l(Integer.valueOf(mode.hashCode() + i9), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    public static void j(O0 o02) {
        if (Build.VERSION.SDK_INT < 24) {
            o02.a("vector", new N0(3));
            o02.a("animated-vector", new N0(2));
            o02.a("animated-selector", new N0(1));
            o02.a("drawable", new N0(0));
        }
    }

    public final void a(String str, N0 n02) {
        if (this.f13867b == null) {
            this.f13867b = new i((Object) null);
        }
        this.f13867b.put(str, n02);
    }

    public final synchronized void b(Context context, long j7, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                g gVar = (g) this.f13869d.get(context);
                if (gVar == null) {
                    gVar = new g();
                    this.f13869d.put(context, gVar);
                }
                gVar.g(new WeakReference(constantState), j7);
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final Drawable c(Context context, int i8) {
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        context.getResources().getValue(i8, typedValue, true);
        long j7 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable e8 = e(context, j7);
        if (e8 != null) {
            return e8;
        }
        LayerDrawable layerDrawable = null;
        if (this.f13871g != null) {
            if (i8 == 2131230776) {
                layerDrawable = new LayerDrawable(new Drawable[]{f(context, 2131230775), f(context, 2131230777)});
            } else if (i8 == 2131230811) {
                layerDrawable = C1455O.h(this, context, 2131165243);
            } else if (i8 == 2131230810) {
                layerDrawable = C1455O.h(this, context, 2131165244);
            } else if (i8 == 2131230812) {
                layerDrawable = C1455O.h(this, context, 2131165245);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j7, layerDrawable);
        }
        return layerDrawable;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        r5 = r0.f6302W;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0042, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.drawable.Drawable e(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap r0 = r3.f13869d     // Catch:{ all -> 0x0028 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0028 }
            Y.g r0 = (Y.g) r0     // Catch:{ all -> 0x0028 }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.d(r5)     // Catch:{ all -> 0x0028 }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x0028 }
            if (r2 == 0) goto L_0x0041
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0028 }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x0028 }
            if (r2 == 0) goto L_0x002a
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0028 }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x0028 }
            monitor-exit(r3)
            return r4
        L_0x0028:
            r4 = move-exception
            goto L_0x0043
        L_0x002a:
            long[] r4 = r0.f6301V     // Catch:{ all -> 0x0028 }
            int r2 = r0.f6303X     // Catch:{ all -> 0x0028 }
            int r4 = Z.a.b(r4, r2, r5)     // Catch:{ all -> 0x0028 }
            if (r4 < 0) goto L_0x0041
            java.lang.Object[] r5 = r0.f6302W     // Catch:{ all -> 0x0028 }
            r6 = r5[r4]     // Catch:{ all -> 0x0028 }
            java.lang.Object r2 = Y.h.f6304a     // Catch:{ all -> 0x0028 }
            if (r6 == r2) goto L_0x0041
            r5[r4] = r2     // Catch:{ all -> 0x0028 }
            r4 = 1
            r0.f6300U = r4     // Catch:{ all -> 0x0028 }
        L_0x0041:
            monitor-exit(r3)
            return r1
        L_0x0043:
            monitor-exit(r3)     // Catch:{ all -> 0x0028 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.O0.e(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    public final synchronized Drawable f(Context context, int i8) {
        return g(context, i8, false);
    }

    public final synchronized Drawable g(Context context, int i8, boolean z) {
        Drawable k8;
        try {
            if (!this.f13870f) {
                this.f13870f = true;
                Drawable f8 = f(context, 2131230838);
                if (f8 == null || (!(f8 instanceof C1077r) && !"android.graphics.drawable.VectorDrawable".equals(f8.getClass().getName()))) {
                    this.f13870f = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            k8 = k(context, i8);
            if (k8 == null) {
                k8 = c(context, i8);
            }
            if (k8 == null) {
                k8 = context.getDrawable(i8);
            }
            if (k8 != null) {
                k8 = n(context, i8, z, k8);
            }
            if (k8 != null) {
                C1286o0.a(k8);
            }
        } catch (Throwable th) {
            throw th;
        }
        return k8;
    }

    public final synchronized ColorStateList i(Context context, int i8) {
        ColorStateList colorStateList;
        j jVar;
        WeakHashMap weakHashMap = this.f13866a;
        ColorStateList colorStateList2 = null;
        if (weakHashMap == null || (jVar = (j) weakHashMap.get(context)) == null) {
            colorStateList = null;
        } else {
            colorStateList = (ColorStateList) jVar.c(i8);
        }
        if (colorStateList == null) {
            C1455O o2 = this.f13871g;
            if (o2 != null) {
                colorStateList2 = o2.j(context, i8);
            }
            if (colorStateList2 != null) {
                if (this.f13866a == null) {
                    this.f13866a = new WeakHashMap();
                }
                j jVar2 = (j) this.f13866a.get(context);
                if (jVar2 == null) {
                    jVar2 = new j();
                    this.f13866a.put(context, jVar2);
                }
                jVar2.a(i8, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0079 A[Catch:{ Exception -> 0x0095 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a2 A[Catch:{ Exception -> 0x0095 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable k(android.content.Context r11, int r12) {
        /*
            r10 = this;
            Y.i r0 = r10.f13867b
            r1 = 0
            if (r0 == 0) goto L_0x00b9
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00b9
            Y.j r0 = r10.f13868c
            java.lang.String r2 = "appcompat_skip_skip"
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r0.c(r12)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto L_0x0027
            if (r0 == 0) goto L_0x002f
            Y.i r3 = r10.f13867b
            java.lang.Object r0 = r3.get(r0)
            if (r0 != 0) goto L_0x002f
        L_0x0027:
            return r1
        L_0x0028:
            Y.j r0 = new Y.j
            r0.<init>()
            r10.f13868c = r0
        L_0x002f:
            android.util.TypedValue r0 = r10.e
            if (r0 != 0) goto L_0x003a
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r10.e = r0
        L_0x003a:
            android.util.TypedValue r0 = r10.e
            android.content.res.Resources r1 = r11.getResources()
            r3 = 1
            r1.getValue(r12, r0, r3)
            int r4 = r0.assetCookie
            long r4 = (long) r4
            r6 = 32
            long r4 = r4 << r6
            int r6 = r0.data
            long r6 = (long) r6
            long r4 = r4 | r6
            android.graphics.drawable.Drawable r6 = r10.e(r11, r4)
            if (r6 == 0) goto L_0x0055
            return r6
        L_0x0055:
            java.lang.CharSequence r7 = r0.string
            if (r7 == 0) goto L_0x00b1
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ".xml"
            boolean r7 = r7.endsWith(r8)
            if (r7 == 0) goto L_0x00b1
            android.content.res.XmlResourceParser r1 = r1.getXml(r12)     // Catch:{ Exception -> 0x0095 }
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r1)     // Catch:{ Exception -> 0x0095 }
        L_0x006d:
            int r8 = r1.next()     // Catch:{ Exception -> 0x0095 }
            r9 = 2
            if (r8 == r9) goto L_0x0077
            if (r8 == r3) goto L_0x0077
            goto L_0x006d
        L_0x0077:
            if (r8 != r9) goto L_0x00a2
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x0095 }
            Y.j r8 = r10.f13868c     // Catch:{ Exception -> 0x0095 }
            r8.a(r12, r3)     // Catch:{ Exception -> 0x0095 }
            Y.i r8 = r10.f13867b     // Catch:{ Exception -> 0x0095 }
            java.lang.Object r3 = r8.get(r3)     // Catch:{ Exception -> 0x0095 }
            o.N0 r3 = (o.N0) r3     // Catch:{ Exception -> 0x0095 }
            if (r3 == 0) goto L_0x0097
            android.content.res.Resources$Theme r8 = r11.getTheme()     // Catch:{ Exception -> 0x0095 }
            android.graphics.drawable.Drawable r6 = r3.a(r11, r1, r7, r8)     // Catch:{ Exception -> 0x0095 }
            goto L_0x0097
        L_0x0095:
            r11 = move-exception
            goto L_0x00aa
        L_0x0097:
            if (r6 == 0) goto L_0x00b1
            int r0 = r0.changingConfigurations     // Catch:{ Exception -> 0x0095 }
            r6.setChangingConfigurations(r0)     // Catch:{ Exception -> 0x0095 }
            r10.b(r11, r4, r6)     // Catch:{ Exception -> 0x0095 }
            goto L_0x00b1
        L_0x00a2:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x0095 }
            java.lang.String r0 = "No start tag found"
            r11.<init>(r0)     // Catch:{ Exception -> 0x0095 }
            throw r11     // Catch:{ Exception -> 0x0095 }
        L_0x00aa:
            java.lang.String r0 = "ResourceManagerInternal"
            java.lang.String r1 = "Exception while inflating drawable"
            android.util.Log.e(r0, r1, r11)
        L_0x00b1:
            if (r6 != 0) goto L_0x00b8
            Y.j r11 = r10.f13868c
            r11.a(r12, r2)
        L_0x00b8:
            return r6
        L_0x00b9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.O0.k(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    public final synchronized void l(Context context) {
        g gVar = (g) this.f13869d.get(context);
        if (gVar != null) {
            gVar.b();
        }
    }

    public final synchronized void m(C1455O o2) {
        this.f13871g = o2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable n(android.content.Context r8, int r9, boolean r10, android.graphics.drawable.Drawable r11) {
        /*
            r7 = this;
            android.content.res.ColorStateList r0 = r7.i(r8, r9)
            r1 = 0
            if (r0 == 0) goto L_0x0025
            android.graphics.drawable.Drawable r8 = r11.mutate()
            android.graphics.drawable.Drawable r11 = E.e.z(r8)
            r11.setTintList(r0)
            u.O r8 = r7.f13871g
            if (r8 != 0) goto L_0x0017
            goto L_0x001e
        L_0x0017:
            r8 = 2131230825(0x7f080069, float:1.8077714E38)
            if (r9 != r8) goto L_0x001e
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.MULTIPLY
        L_0x001e:
            if (r1 == 0) goto L_0x010e
            r11.setTintMode(r1)
            goto L_0x010e
        L_0x0025:
            u.O r0 = r7.f13871g
            if (r0 == 0) goto L_0x009b
            r0 = 2131230820(0x7f080064, float:1.8077704E38)
            r2 = 16908301(0x102000d, float:2.3877265E-38)
            r3 = 16908303(0x102000f, float:2.387727E-38)
            r4 = 16908288(0x1020000, float:2.387723E-38)
            r5 = 2130968815(0x7f0400ef, float:1.7546294E38)
            r6 = 2130968817(0x7f0400f1, float:1.7546298E38)
            if (r9 != r0) goto L_0x0064
            r9 = r11
            android.graphics.drawable.LayerDrawable r9 = (android.graphics.drawable.LayerDrawable) r9
            android.graphics.drawable.Drawable r10 = r9.findDrawableByLayerId(r4)
            int r0 = o.d1.c(r8, r6)
            android.graphics.PorterDuff$Mode r1 = o.C1292s.f14065b
            u.C1455O.m(r10, r0, r1)
            android.graphics.drawable.Drawable r10 = r9.findDrawableByLayerId(r3)
            int r0 = o.d1.c(r8, r6)
            u.C1455O.m(r10, r0, r1)
            android.graphics.drawable.Drawable r9 = r9.findDrawableByLayerId(r2)
            int r8 = o.d1.c(r8, r5)
            u.C1455O.m(r9, r8, r1)
            goto L_0x010e
        L_0x0064:
            r0 = 2131230811(0x7f08005b, float:1.8077685E38)
            if (r9 == r0) goto L_0x0073
            r0 = 2131230810(0x7f08005a, float:1.8077683E38)
            if (r9 == r0) goto L_0x0073
            r0 = 2131230812(0x7f08005c, float:1.8077687E38)
            if (r9 != r0) goto L_0x009b
        L_0x0073:
            r9 = r11
            android.graphics.drawable.LayerDrawable r9 = (android.graphics.drawable.LayerDrawable) r9
            android.graphics.drawable.Drawable r10 = r9.findDrawableByLayerId(r4)
            int r0 = o.d1.b(r8, r6)
            android.graphics.PorterDuff$Mode r1 = o.C1292s.f14065b
            u.C1455O.m(r10, r0, r1)
            android.graphics.drawable.Drawable r10 = r9.findDrawableByLayerId(r3)
            int r0 = o.d1.c(r8, r5)
            u.C1455O.m(r10, r0, r1)
            android.graphics.drawable.Drawable r9 = r9.findDrawableByLayerId(r2)
            int r8 = o.d1.c(r8, r5)
            u.C1455O.m(r9, r8, r1)
            goto L_0x010e
        L_0x009b:
            u.O r0 = r7.f13871g
            r2 = 0
            if (r0 == 0) goto L_0x0109
            android.graphics.PorterDuff$Mode r3 = o.C1292s.f14065b
            java.lang.Object r4 = r0.f15529a
            int[] r4 = (int[]) r4
            boolean r4 = u.C1455O.b(r4, r9)
            r5 = 1
            r6 = -1
            if (r4 == 0) goto L_0x00b4
            r9 = 2130968817(0x7f0400f1, float:1.7546298E38)
        L_0x00b1:
            r0 = -1
        L_0x00b2:
            r4 = 1
            goto L_0x00f2
        L_0x00b4:
            java.lang.Object r4 = r0.f15531c
            int[] r4 = (int[]) r4
            boolean r4 = u.C1455O.b(r4, r9)
            if (r4 == 0) goto L_0x00c2
            r9 = 2130968815(0x7f0400ef, float:1.7546294E38)
            goto L_0x00b1
        L_0x00c2:
            java.lang.Object r0 = r0.f15532d
            int[] r0 = (int[]) r0
            boolean r0 = u.C1455O.b(r0, r9)
            r4 = 16842801(0x1010031, float:2.3693695E-38)
            if (r0 == 0) goto L_0x00d5
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.MULTIPLY
        L_0x00d1:
            r9 = 16842801(0x1010031, float:2.3693695E-38)
            goto L_0x00b1
        L_0x00d5:
            r0 = 2131230797(0x7f08004d, float:1.8077657E38)
            if (r9 != r0) goto L_0x00e9
            r9 = 1109603123(0x42233333, float:40.8)
            int r9 = java.lang.Math.round(r9)
            r0 = 16842800(0x1010030, float:2.3693693E-38)
            r0 = r9
            r9 = 16842800(0x1010030, float:2.3693693E-38)
            goto L_0x00b2
        L_0x00e9:
            r0 = 2131230779(0x7f08003b, float:1.807762E38)
            if (r9 != r0) goto L_0x00ef
            goto L_0x00d1
        L_0x00ef:
            r9 = 0
            r0 = -1
            r4 = 0
        L_0x00f2:
            if (r4 == 0) goto L_0x0109
            android.graphics.drawable.Drawable r2 = r11.mutate()
            int r8 = o.d1.c(r8, r9)
            android.graphics.PorterDuffColorFilter r8 = o.C1292s.c(r8, r3)
            r2.setColorFilter(r8)
            if (r0 == r6) goto L_0x0108
            r2.setAlpha(r0)
        L_0x0108:
            r2 = 1
        L_0x0109:
            if (r2 != 0) goto L_0x010e
            if (r10 == 0) goto L_0x010e
            r11 = r1
        L_0x010e:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o.O0.n(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
