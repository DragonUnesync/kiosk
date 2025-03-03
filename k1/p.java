package k1;

import D.C0051j0;
import H3.B;
import H3.O;
import H3.h0;
import H3.i0;
import M0.C0117e;
import M0.Y;
import M0.Z;
import M0.r;
import P0.l;
import P0.z;
import Q0.t;
import T0.F;
import android.content.Context;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import com.bumptech.glide.j;
import h1.C1048n;
import h1.f0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public final class p extends t {

    /* renamed from: j  reason: collision with root package name */
    public static final h0 f12999j = new B(new C0051j0(17));

    /* renamed from: c  reason: collision with root package name */
    public final Object f13000c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public final Context f13001d;
    public final C1048n e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f13002f;

    /* renamed from: g  reason: collision with root package name */
    public C1141j f13003g;

    /* renamed from: h  reason: collision with root package name */
    public final j f13004h;
    public C0117e i;

    public p(Context context) {
        j jVar;
        C1048n nVar = new C1048n(3);
        int i8 = C1141j.f12961B;
        C1141j jVar2 = new C1141j(new C1140i(context));
        this.f13001d = context.getApplicationContext();
        this.e = nVar;
        this.f13003g = jVar2;
        this.i = C0117e.f2938b;
        boolean N2 = z.N(context);
        this.f13002f = N2;
        if (!N2 && z.f3748a >= 32) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                jVar = null;
            } else {
                jVar = new j(audioManager.getSpatializer());
            }
            this.f13004h = jVar;
        }
        boolean z = this.f13003g.f12967w;
    }

    public static int b(int i8, int i9) {
        if (i8 == 0 || i8 != i9) {
            return Integer.bitCount(i8 & i9);
        }
        return Integer.MAX_VALUE;
    }

    public static void c(f0 f0Var, C1141j jVar, HashMap hashMap) {
        for (int i8 = 0; i8 < f0Var.f12469a; i8++) {
            Z z = (Z) jVar.f2932q.get(f0Var.a(i8));
            if (z != null) {
                Y y8 = z.f2889a;
                Z z6 = (Z) hashMap.get(Integer.valueOf(y8.f2887c));
                if (z6 == null || (z6.f2890b.isEmpty() && !z.f2890b.isEmpty())) {
                    hashMap.put(Integer.valueOf(y8.f2887c), z);
                }
            }
        }
    }

    public static int d(r rVar, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(rVar.f3028d)) {
            return 4;
        }
        String g8 = g(str);
        String g9 = g(rVar.f3028d);
        if (g9 == null || g8 == null) {
            if (!z || g9 != null) {
                return 0;
            }
            return 1;
        } else if (g9.startsWith(g8) || g8.startsWith(g9)) {
            return 3;
        } else {
            int i8 = z.f3748a;
            if (g9.split("-", 2)[0].equals(g8.split("-", 2)[0])) {
                return 2;
            }
            return 0;
        }
    }

    public static String g(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static Pair i(int i8, t tVar, int[][][] iArr, m mVar, Comparator comparator) {
        Object obj;
        t tVar2 = tVar;
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        while (i9 < tVar2.f4074a) {
            if (i8 == ((int[]) tVar2.f4075b)[i9]) {
                f0 f0Var = ((f0[]) tVar2.f4076c)[i9];
                int i10 = 0;
                while (i10 < f0Var.f12469a) {
                    Y a8 = f0Var.a(i10);
                    i0 c8 = mVar.c(i9, a8, iArr[i9][i10]);
                    int i11 = a8.f2885a;
                    boolean[] zArr = new boolean[i11];
                    int i12 = 0;
                    while (i12 < i11) {
                        n nVar = (n) c8.get(i12);
                        int a9 = nVar.a();
                        if (!zArr[i12] && a9 != 0) {
                            if (a9 == 1) {
                                obj = O.r(nVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(nVar);
                                int i13 = i12 + 1;
                                while (i13 < i11) {
                                    n nVar2 = (n) c8.get(i13);
                                    if (nVar2.a() == 2 && nVar.b(nVar2)) {
                                        arrayList2.add(nVar2);
                                        zArr[i13] = true;
                                    }
                                    i13++;
                                    t tVar3 = tVar;
                                }
                                obj = arrayList2;
                            }
                            arrayList.add(obj);
                        }
                        i12++;
                        t tVar4 = tVar;
                    }
                    i10++;
                    t tVar5 = tVar;
                }
            }
            m mVar2 = mVar;
            i9++;
            tVar2 = tVar;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i14 = 0; i14 < list.size(); i14++) {
            iArr2[i14] = ((n) list.get(i14)).f12982W;
        }
        n nVar3 = (n) list.get(0);
        return Pair.create(new q(nVar3.f12981V, iArr2), Integer.valueOf(nVar3.f12980U));
    }

    public final void a() {
        j jVar;
        C1142k kVar;
        synchronized (this.f13000c) {
            try {
                if (!(z.f3748a < 32 || (jVar = this.f13004h) == null || (kVar = (C1142k) jVar.f9010X) == null)) {
                    if (((Handler) jVar.f9009W) != null) {
                        ((Spatializer) jVar.f9008V).removeOnSpatializerStateChangedListener(kVar);
                        ((Handler) jVar.f9009W).removeCallbacksAndMessages((Object) null);
                        jVar.f9009W = null;
                        jVar.f9010X = null;
                    }
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.f13007a = null;
        this.f13008b = null;
    }

    public final C1141j e() {
        C1141j jVar;
        synchronized (this.f13000c) {
            jVar = this.f13003g;
        }
        return jVar;
    }

    public final void f() {
        boolean z;
        F f8;
        j jVar;
        synchronized (this.f13000c) {
            try {
                if (!this.f13003g.f12967w || this.f13002f || z.f3748a < 32 || (jVar = this.f13004h) == null || !jVar.f9007U) {
                    z = false;
                } else {
                    z = true;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (z && (f8 = this.f13007a) != null) {
            f8.f4646c0.e(10);
        }
    }

    public final void h() {
        synchronized (this.f13000c) {
            this.f13003g.getClass();
        }
    }

    public final void j(C1141j jVar) {
        boolean equals;
        jVar.getClass();
        synchronized (this.f13000c) {
            equals = this.f13003g.equals(jVar);
            this.f13003g = jVar;
        }
        if (!equals) {
            if (jVar.f12967w && this.f13001d == null) {
                l.B("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            F f8 = this.f13007a;
            if (f8 != null) {
                f8.f4646c0.e(10);
            }
        }
    }
}
