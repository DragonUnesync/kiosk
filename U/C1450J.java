package u;

import L.a;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.Size;
import android.view.Display;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;
import java.util.Locale;
import y.C1609a;
import y.C1611c;

/* renamed from: u.J  reason: case insensitive filesystem */
public final class C1450J {
    public static final Size e = new Size(1920, 1080);

    /* renamed from: f  reason: collision with root package name */
    public static final Size f15513f = new Size(320, 240);

    /* renamed from: g  reason: collision with root package name */
    public static final Size f15514g = new Size(640, 480);

    /* renamed from: h  reason: collision with root package name */
    public static final Object f15515h = new Object();
    public static volatile C1450J i;

    /* renamed from: a  reason: collision with root package name */
    public final DisplayManager f15516a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Size f15517b = null;

    /* renamed from: c  reason: collision with root package name */
    public final C1611c f15518c = new C1611c(0);

    /* renamed from: d  reason: collision with root package name */
    public final C1609a f15519d = new C1609a(1);

    public C1450J(Context context) {
        this.f15516a = (DisplayManager) context.getSystemService("display");
    }

    public static C1450J b(Context context) {
        if (i == null) {
            synchronized (f15515h) {
                try {
                    if (i == null) {
                        i = new C1450J(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return i;
    }

    public static Display d(Display[] displayArr, boolean z) {
        Display display = null;
        int i8 = -1;
        for (Display display2 : displayArr) {
            if (!z || display2.getState() != 1) {
                Point point = new Point();
                display2.getRealSize(point);
                int i9 = point.x * point.y;
                if (i9 > i8) {
                    display = display2;
                    i8 = i9;
                }
            }
        }
        return display;
    }

    public final Size a() {
        Size b8;
        Size size;
        Point point = new Point();
        c(false).getRealSize(point);
        Size size2 = new Size(point.x, point.y);
        Size size3 = a.f2673a;
        if (size2.getHeight() * size2.getWidth() < a.a(f15513f)) {
            if (((SmallDisplaySizeQuirk) this.f15519d.f16325a) != null) {
                size = (Size) SmallDisplaySizeQuirk.f7635a.get(Build.MODEL.toUpperCase(Locale.US));
            } else {
                size = null;
            }
            size2 = size;
            if (size2 == null) {
                size2 = f15514g;
            }
        }
        if (size2.getHeight() > size2.getWidth()) {
            size2 = new Size(size2.getHeight(), size2.getWidth());
        }
        int height = size2.getHeight() * size2.getWidth();
        Size size4 = e;
        if (height > size4.getHeight() * size4.getWidth()) {
            size2 = size4;
        }
        if (this.f15518c.f16328a == null || (b8 = ExtraCroppingQuirk.b(1)) == null) {
            return size2;
        }
        if (b8.getHeight() * b8.getWidth() > size2.getHeight() * size2.getWidth()) {
            return b8;
        }
        return size2;
    }

    public final Display c(boolean z) {
        Display[] displays = this.f15516a.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display d8 = d(displays, z);
        if (d8 == null && z) {
            d8 = d(displays, false);
        }
        if (d8 != null) {
            return d8;
        }
        throw new IllegalArgumentException("No display can be found from the input display manager!");
    }

    public final Size e() {
        if (this.f15517b != null) {
            return this.f15517b;
        }
        this.f15517b = a();
        return this.f15517b;
    }
}
