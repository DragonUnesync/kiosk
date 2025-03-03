package Z1;

import P0.g;
import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import d4.k;
import de.ozerov.fully.C0767r3;
import de.ozerov.fully.C0794w0;
import de.ozerov.fully.FullyActivity;
import de.ozerov.fully.V4;
import de.ozerov.fully.i5;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f6946a = false;

    /* renamed from: b  reason: collision with root package name */
    public final Object f6947b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f6948c;

    /* renamed from: d  reason: collision with root package name */
    public Object f6949d;
    public Object e;

    /* renamed from: f  reason: collision with root package name */
    public Object f6950f;

    /* renamed from: g  reason: collision with root package name */
    public Object f6951g;

    /* renamed from: h  reason: collision with root package name */
    public Object f6952h;

    public a(FullyActivity fullyActivity) {
        this.f6947b = fullyActivity;
        this.f6948c = new k((Context) fullyActivity, 1);
    }

    public void a() {
        boolean y02 = n2.a.y0();
        FullyActivity fullyActivity = (FullyActivity) this.f6947b;
        if (!y02 || Settings.canDrawOverlays(fullyActivity)) {
            C0767r3 r3Var = (C0767r3) this.f6950f;
            if (r3Var != null) {
                r3Var.e();
            }
        } else {
            ((FrameLayout) fullyActivity.findViewById(2131362224)).setVisibility(8);
        }
        fullyActivity.f9921J0.c();
        fullyActivity.f9960y1.e(false, false);
        C0794w0.q0(0, "OverlayContentManager", "Maintenance mode disabled");
        this.f6946a = false;
    }

    public void b() {
        boolean y02 = n2.a.y0();
        k kVar = (k) this.f6948c;
        FullyActivity fullyActivity = (FullyActivity) this.f6947b;
        if (!y02 || Settings.canDrawOverlays(fullyActivity)) {
            if (((C0767r3) this.f6950f) == null) {
                C0767r3 r3Var = new C0767r3(fullyActivity);
                this.f6950f = r3Var;
                r3Var.g(2131558506);
                C0767r3 r3Var2 = (C0767r3) this.f6950f;
                r3Var2.f10916d = false;
                r3Var2.e = true;
                r3Var2.f10915c.setVisibility(0);
                C0767r3 r3Var3 = (C0767r3) this.f6950f;
                r3Var3.f10921k = true;
                r3Var3.f10926p = "maintenanceMode";
            }
            ((TextView) ((C0767r3) this.f6950f).f10915c.findViewById(2131362225)).setText(kVar.O2(((c) kVar.f9767W).r("maintenanceText", ((Context) kVar.f9768X).getResources().getString(2131951800))));
            ((C0767r3) this.f6950f).j();
        } else {
            FrameLayout frameLayout = (FrameLayout) fullyActivity.findViewById(2131362224);
            frameLayout.setVisibility(0);
            ((TextView) frameLayout.findViewById(2131362225)).setText(kVar.O2(((c) kVar.f9767W).r("maintenanceText", ((Context) kVar.f9768X).getResources().getString(2131951800))));
            frameLayout.requestFocus();
        }
        fullyActivity.f9916E0.a();
        fullyActivity.f9916E0.f10159c.setTouchModeAbove(2);
        fullyActivity.f9960y1.e(false, false);
        C0794w0.q0(0, "OverlayContentManager", "Maintenance mode enabled");
        this.f6946a = true;
    }

    public FileInputStream c(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e8) {
            String message = e8.getMessage();
            if (message != null && message.contains("compressed")) {
                ((d) this.f6948c).l();
            }
            return null;
        }
    }

    public void d(int i, Serializable serializable) {
        ((Executor) this.f6947b).execute(new g((Object) this, i, (Object) serializable, 1));
    }

    public void e(String str) {
        String str2;
        if (str == null) {
            str2 = "";
        } else {
            str2 = ((k) this.f6948c).O2(str.trim());
        }
        boolean y02 = n2.a.y0();
        FullyActivity fullyActivity = (FullyActivity) this.f6947b;
        if (!y02 || Settings.canDrawOverlays(fullyActivity)) {
            if (str2.length() > 0) {
                if (((C0767r3) this.f6951g) == null) {
                    C0767r3 r3Var = new C0767r3(fullyActivity);
                    this.f6951g = r3Var;
                    r3Var.g(2131558523);
                    C0767r3 r3Var2 = (C0767r3) this.f6951g;
                    r3Var2.f10916d = true;
                    r3Var2.e = true;
                    r3Var2.f10920j = 80;
                    r3Var2.f10918g = -2;
                    r3Var2.f10919h = -2;
                    r3Var2.f10915c.setVisibility(0);
                    C0767r3 r3Var3 = (C0767r3) this.f6951g;
                    r3Var3.f10921k = true;
                    r3Var3.f10926p = "overlayMessage";
                }
                ((TextView) ((C0767r3) this.f6951g).f10915c.findViewById(2131362260)).setText(str2);
                ((C0767r3) this.f6951g).j();
                return;
            }
            C0767r3 r3Var4 = (C0767r3) this.f6951g;
            if (r3Var4 != null) {
                r3Var4.e();
            }
        } else if (str2.length() > 0) {
            FrameLayout frameLayout = (FrameLayout) fullyActivity.findViewById(2131362259);
            ((TextView) frameLayout.findViewById(2131362260)).setText(str2);
            frameLayout.setVisibility(0);
        } else {
            ((FrameLayout) fullyActivity.findViewById(2131362259)).setVisibility(8);
        }
    }

    public void f(String str) {
        if (n2.a.y0() && !Settings.canDrawOverlays((FullyActivity) this.f6947b)) {
            Log.w("OverlayContentManager", "No permissions granted to show an overlay");
        } else if (!str.isEmpty()) {
            if (((V4) this.f6949d) == null) {
                this.f6949d = new V4((FullyActivity) this.f6947b);
            }
            ((V4) this.f6949d).a();
            if (((i5) this.e) == null) {
                this.e = new i5((FullyActivity) this.f6947b, (V4) this.f6949d);
            }
            i5 i5Var = (i5) this.e;
            boolean z = i5Var.f10714h;
            FrameLayout frameLayout = i5Var.e;
            if (z) {
                frameLayout.setVisibility(0);
            } else {
                frameLayout.setVisibility(4);
            }
            i5 i5Var2 = (i5) this.e;
            i5Var2.i = false;
            i5Var2.f10715j = false;
            i5Var2.y(false);
            i5 i5Var3 = (i5) this.e;
            i5Var3.f10720o = false;
            i5Var3.f10725t = 0;
            i5Var3.n(str, false);
            C0767r3 r3Var = (C0767r3) this.f6952h;
            int i = 80;
            if (r3Var == null) {
                C0767r3 r3Var2 = new C0767r3((FullyActivity) this.f6947b);
                this.f6952h = r3Var2;
                r3Var2.h(((i5) this.e).f10712f);
                C0767r3 r3Var3 = (C0767r3) this.f6952h;
                r3Var3.f10916d = true;
                r3Var3.e = true;
                if (((c) ((k) this.f6948c).f9767W).r("webOverlayGravity", "0").equals("0")) {
                    i = 48;
                }
                r3Var3.f10920j = i;
                C0767r3 r3Var4 = (C0767r3) this.f6952h;
                r3Var4.f10918g = -1;
                r3Var4.f10919h = -2;
                r3Var4.f10915c.setVisibility(0);
                C0767r3 r3Var5 = (C0767r3) this.f6952h;
                r3Var5.f10921k = true;
                r3Var5.f10926p = "webOverlay";
            } else {
                if (((c) ((k) this.f6948c).f9767W).r("webOverlayGravity", "0").equals("0")) {
                    i = 48;
                }
                r3Var.f10920j = i;
                C0767r3 r3Var6 = (C0767r3) this.f6952h;
                if (r3Var6.f10915c != null && r3Var6.f10923m) {
                    ((WindowManager) r3Var6.f10914b.getApplicationContext().getSystemService("window")).updateViewLayout(r3Var6.f10915c, r3Var6.d());
                }
            }
            ((C0767r3) this.f6952h).j();
        } else {
            C0767r3 r3Var7 = (C0767r3) this.f6952h;
            if (r3Var7 != null) {
                r3Var7.e();
            }
        }
    }

    public a(AssetManager assetManager, Executor executor, d dVar, String str, File file) {
        this.f6947b = executor;
        this.f6948c = dVar;
        this.f6951g = str;
        this.f6950f = file;
        int i = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i >= 24 && i <= 34) {
            switch (i) {
                case 24:
                case 25:
                    bArr = e.f6962h;
                    break;
                case 26:
                    bArr = e.f6961g;
                    break;
                case 27:
                    bArr = e.f6960f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = e.e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = e.f6959d;
                    break;
            }
        }
        this.f6949d = bArr;
    }
}
