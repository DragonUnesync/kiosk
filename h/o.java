package h;

import F.a;
import Y.f;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import q0.C1357d;

public abstract class o {

    /* renamed from: U  reason: collision with root package name */
    public static final n f12221U = new n(new a(3));

    /* renamed from: V  reason: collision with root package name */
    public static int f12222V = -100;

    /* renamed from: W  reason: collision with root package name */
    public static C1357d f12223W = null;

    /* renamed from: X  reason: collision with root package name */
    public static C1357d f12224X = null;

    /* renamed from: Y  reason: collision with root package name */
    public static Boolean f12225Y = null;

    /* renamed from: Z  reason: collision with root package name */
    public static boolean f12226Z = false;

    /* renamed from: a0  reason: collision with root package name */
    public static final f f12227a0 = new f(0);

    /* renamed from: b0  reason: collision with root package name */
    public static final Object f12228b0 = new Object();

    /* renamed from: c0  reason: collision with root package name */
    public static final Object f12229c0 = new Object();

    public static boolean c(Context context) {
        int i;
        if (f12225Y == null) {
            try {
                int i8 = C1005F.f12111U;
                if (Build.VERSION.SDK_INT >= 24) {
                    i = C1004E.a() | 128;
                } else {
                    i = 640;
                }
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, C1005F.class), i).metaData;
                if (bundle != null) {
                    f12225Y = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f12225Y = Boolean.FALSE;
            }
        }
        return f12225Y.booleanValue();
    }

    public static void f(C1000A a8) {
        synchronized (f12228b0) {
            try {
                f fVar = f12227a0;
                fVar.getClass();
                Y.a aVar = new Y.a(fVar);
                while (aVar.hasNext()) {
                    o oVar = (o) ((WeakReference) aVar.next()).get();
                    if (oVar == a8 || oVar == null) {
                        aVar.remove();
                    }
                }
            } finally {
            }
        }
    }

    public static void k(int i) {
        if (i != -1 && i != 0 && i != 1 && i != 2 && i != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
        } else if (f12222V != i) {
            f12222V = i;
            synchronized (f12228b0) {
                try {
                    f fVar = f12227a0;
                    fVar.getClass();
                    Y.a aVar = new Y.a(fVar);
                    while (aVar.hasNext()) {
                        o oVar = (o) ((WeakReference) aVar.next()).get();
                        if (oVar != null) {
                            ((C1000A) oVar).m(true, true);
                        }
                    }
                } finally {
                }
            }
        }
    }

    public abstract void a();

    public abstract void b();

    public abstract void d();

    public abstract void e();

    public abstract boolean g(int i);

    public abstract void h(int i);

    public abstract void i(View view);

    public abstract void j(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void l(CharSequence charSequence);
}
