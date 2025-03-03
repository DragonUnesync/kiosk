package k1;

import H3.O;
import M0.b0;
import P0.l;
import P0.z;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: k1.i  reason: case insensitive filesystem */
public final class C1140i extends b0 {

    /* renamed from: A  reason: collision with root package name */
    public final SparseBooleanArray f12953A;

    /* renamed from: s  reason: collision with root package name */
    public boolean f12954s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f12955t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f12956u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f12957v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f12958w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f12959x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f12960y;
    public final SparseArray z;

    public C1140i(Context context) {
        Point point;
        String str;
        CaptioningManager captioningManager;
        int i = z.f3748a;
        if ((i >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.f2910o = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.f2909n = O.r(locale.toLanguageTag());
            }
        }
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && z.N(context)) {
            if (i < 28) {
                str = z.E("sys.display-size");
            } else {
                str = z.E("vendor.display-size");
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    String[] split = str.trim().split("x", -1);
                    if (split.length == 2) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            point = new Point(parseInt, parseInt2);
                            d(point.x, point.y);
                            this.z = new SparseArray();
                            this.f12953A = new SparseBooleanArray();
                            e();
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                l.o("Util", "Invalid display size: " + str);
            }
            if ("Sony".equals(z.f3750c) && z.f3751d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                point = new Point(3840, 2160);
                d(point.x, point.y);
                this.z = new SparseArray();
                this.f12953A = new SparseBooleanArray();
                e();
            }
        }
        point = new Point();
        if (i >= 23) {
            Display.Mode m8 = display.getMode();
            point.x = m8.getPhysicalWidth();
            point.y = m8.getPhysicalHeight();
        } else {
            display.getRealSize(point);
        }
        d(point.x, point.y);
        this.z = new SparseArray();
        this.f12953A = new SparseBooleanArray();
        e();
    }

    public final b0 c(String[] strArr) {
        super.c(strArr);
        return this;
    }

    public final b0 d(int i, int i8) {
        super.d(i, i8);
        return this;
    }

    public final void e() {
        this.f12954s = true;
        this.f12955t = true;
        this.f12956u = true;
        this.f12957v = true;
        this.f12958w = true;
        this.f12959x = true;
        this.f12960y = true;
    }

    public final void f(int i) {
        this.f2913r.remove(Integer.valueOf(i));
    }

    public C1140i(C1141j jVar) {
        b(jVar);
        this.f12954s = jVar.f12963s;
        this.f12955t = jVar.f12964t;
        this.f12956u = jVar.f12965u;
        this.f12957v = jVar.f12966v;
        this.f12958w = jVar.f12967w;
        this.f12959x = jVar.f12968x;
        this.f12960y = jVar.f12969y;
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        while (true) {
            SparseArray sparseArray2 = jVar.z;
            if (i < sparseArray2.size()) {
                sparseArray.put(sparseArray2.keyAt(i), new HashMap((Map) sparseArray2.valueAt(i)));
                i++;
            } else {
                this.z = sparseArray;
                this.f12953A = jVar.f12962A.clone();
                return;
            }
        }
    }

    public C1140i() {
        this.z = new SparseArray();
        this.f12953A = new SparseBooleanArray();
        e();
    }
}
