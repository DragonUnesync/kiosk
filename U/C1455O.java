package u;

import B.C;
import B.C0022x;
import B.p0;
import D.C0;
import D.y0;
import D.z0;
import D2.o;
import G.h;
import G.i;
import H3.O;
import H3.n0;
import L3.b;
import M0.Q;
import M0.V;
import M0.X;
import P0.z;
import Q0.g;
import T0.C0232y;
import Z1.c;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import d4.k;
import de.ozerov.fully.FullyActivity;
import de.ozerov.fully.G;
import de.ozerov.fully.K2;
import h1.C1031B;
import j0.f;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import m0.C1195a;
import n2.a;
import o.C1292s;
import o.O0;
import o.d1;
import org.altbeacon.beacon.BeaconManager;
import org.altbeacon.beacon.BeaconParser;
import org.altbeacon.beacon.Region;
import org.altbeacon.beacon.service.ArmaRssiFilter;
import org.altbeacon.beacon.service.RunningAverageRssiFilter;

/* renamed from: u.O  reason: case insensitive filesystem */
public final class C1455O {

    /* renamed from: a  reason: collision with root package name */
    public Object f15529a;

    /* renamed from: b  reason: collision with root package name */
    public Object f15530b;

    /* renamed from: c  reason: collision with root package name */
    public Object f15531c;

    /* renamed from: d  reason: collision with root package name */
    public Object f15532d;
    public Object e;

    /* renamed from: f  reason: collision with root package name */
    public Object f15533f;

    public /* synthetic */ C1455O(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.f15529a = obj;
        this.f15530b = obj2;
        this.f15531c = obj3;
        this.f15532d = obj4;
        this.e = obj5;
        this.f15533f = obj6;
    }

    public static boolean b(int[] iArr, int i) {
        for (int i8 : iArr) {
            if (i8 == i) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList c(Context context, int i) {
        int c8 = d1.c(context, 2130968816);
        int b8 = d1.b(context, 2130968813);
        int b9 = C1195a.b(c8, i);
        int b10 = C1195a.b(c8, i);
        return new ColorStateList(new int[][]{d1.f13946b, d1.f13948d, d1.f13947c, d1.f13949f}, new int[]{b8, b9, b10, i});
    }

    public static C1031B e(Q q7, O o2, C1031B b8, V v4) {
        Object obj;
        int i;
        C0232y yVar = (C0232y) q7;
        X z = yVar.z();
        int w2 = yVar.w();
        if (z.p()) {
            obj = null;
        } else {
            obj = z.l(w2);
        }
        if (yVar.G() || z.p()) {
            i = -1;
        } else {
            i = z.f(w2, v4, false).b(z.O(yVar.x()) - v4.e);
        }
        for (int i8 = 0; i8 < o2.size(); i8++) {
            C1031B b9 = (C1031B) o2.get(i8);
            if (k(b9, obj, yVar.G(), yVar.t(), yVar.u(), i)) {
                return b9;
            }
        }
        if (o2.isEmpty() && b8 != null) {
            if (k(b8, obj, yVar.G(), yVar.t(), yVar.u(), i)) {
                return b8;
            }
        }
        return null;
    }

    public static LayerDrawable h(O0 o02, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable f8 = o02.f(context, 2131230823);
        Drawable f9 = o02.f(context, 2131230824);
        if ((f8 instanceof BitmapDrawable) && f8.getIntrinsicWidth() == dimensionPixelSize && f8.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable2 = (BitmapDrawable) f8;
            bitmapDrawable = new BitmapDrawable(bitmapDrawable2.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            f8.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            f8.draw(canvas);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
            bitmapDrawable = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
        if ((f9 instanceof BitmapDrawable) && f9.getIntrinsicWidth() == dimensionPixelSize && f9.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) f9;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            f9.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            f9.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable2, bitmapDrawable3, bitmapDrawable});
        layerDrawable.setId(0, 16908288);
        layerDrawable.setId(1, 16908303);
        layerDrawable.setId(2, 16908301);
        return layerDrawable;
    }

    public static boolean k(C1031B b8, Object obj, boolean z, int i, int i8, int i9) {
        if (!b8.f12277a.equals(obj)) {
            return false;
        }
        int i10 = b8.f12278b;
        if ((z && i10 == i && b8.f12279c == i8) || (!z && i10 == -1 && b8.e == i9)) {
            return true;
        }
        return false;
    }

    public static void m(Drawable drawable, int i, PorterDuff.Mode mode) {
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = C1292s.f14065b;
        }
        mutate.setColorFilter(C1292s.c(i, mode));
    }

    public void a(o oVar, C1031B b8, X x8) {
        if (b8 != null) {
            if (x8.b(b8.f12277a) != -1) {
                oVar.n(b8, x8);
                return;
            }
            X x9 = (X) ((n0) this.f15531c).get(b8);
            if (x9 != null) {
                oVar.n(b8, x9);
            }
        }
    }

    public C0 d() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        Size size = (Size) this.f15532d;
        surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
        Surface surface = new Surface(surfaceTexture);
        y0 d8 = y0.d((C1454N) this.f15531c, size);
        d8.f959b.f264U = 1;
        p0 p0Var = new p0(surface);
        this.f15529a = p0Var;
        b d9 = i.d(p0Var.e);
        K2 k22 = new K2((Object) surface, 29, (Object) surfaceTexture);
        d9.d(new h(d9, 0, k22), D7.b.l());
        d8.b((p0) this.f15529a, C0022x.f360d, -1);
        z0 z0Var = (z0) this.f15533f;
        if (z0Var != null) {
            z0Var.b();
        }
        z0 z0Var2 = new z0(new C(4, this));
        this.f15533f = z0Var2;
        d8.f962f = z0Var2;
        return d8.c();
    }

    public ArrayList f() {
        ArrayList arrayList;
        synchronized (this.f15530b) {
            arrayList = new ArrayList((LinkedHashSet) this.f15531c);
        }
        return arrayList;
    }

    public ArrayList g() {
        ArrayList arrayList;
        synchronized (this.f15530b) {
            arrayList = new ArrayList((LinkedHashSet) this.e);
        }
        return arrayList;
    }

    public ArrayList i() {
        ArrayList arrayList;
        synchronized (this.f15530b) {
            arrayList = new ArrayList();
            arrayList.addAll(f());
            arrayList.addAll(g());
        }
        return arrayList;
    }

    public ColorStateList j(Context context, int i) {
        if (i == 2131230780) {
            return f.c(context, 2131099669);
        }
        if (i == 2131230826) {
            return f.c(context, 2131099672);
        }
        if (i == 2131230825) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList d8 = d1.d(context, 2130968866);
            if (d8 == null || !d8.isStateful()) {
                iArr[0] = d1.f13946b;
                iArr2[0] = d1.b(context, 2130968866);
                iArr[1] = d1.e;
                iArr2[1] = d1.c(context, 2130968815);
                iArr[2] = d1.f13949f;
                iArr2[2] = d1.c(context, 2130968866);
            } else {
                int[] iArr3 = d1.f13946b;
                iArr[0] = iArr3;
                iArr2[0] = d8.getColorForState(iArr3, 0);
                iArr[1] = d1.e;
                iArr2[1] = d1.c(context, 2130968815);
                iArr[2] = d1.f13949f;
                iArr2[2] = d8.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        } else if (i == 2131230768) {
            return c(context, d1.c(context, 2130968813));
        } else {
            if (i == 2131230762) {
                return c(context, 0);
            }
            if (i == 2131230767) {
                return c(context, d1.c(context, 2130968811));
            }
            if (i == 2131230821 || i == 2131230822) {
                return f.c(context, 2131099671);
            }
            if (b((int[]) this.f15530b, i)) {
                return d1.d(context, 2130968817);
            }
            if (b((int[]) this.e, i)) {
                return f.c(context, 2131099668);
            }
            if (b((int[]) this.f15533f, i)) {
                return f.c(context, 2131099667);
            }
            if (i == 2131230818) {
                return f.c(context, 2131099670);
            }
            return null;
        }
    }

    public void l(Y y8) {
        synchronized (this.f15530b) {
            ((LinkedHashSet) this.e).add(y8);
        }
    }

    public void n() {
        int i;
        k kVar = (k) this.f15531c;
        boolean booleanValue = kVar.y1().booleanValue();
        Region region = (Region) this.f15529a;
        G g8 = (G) this.f15533f;
        c cVar = (c) kVar.f9767W;
        if ((!booleanValue || cVar.r("movementBeaconList", "").trim().isEmpty() || kVar.x1() == 0.0f) && (!kVar.A().booleanValue() || !kVar.B2().booleanValue())) {
            BeaconManager beaconManager = (BeaconManager) this.f15532d;
            if (beaconManager != null) {
                beaconManager.stopRangingBeacons(region);
                ((BeaconManager) this.f15532d).removeRangeNotifier(g8);
                return;
            }
            return;
        }
        boolean r02 = a.r0();
        FullyActivity fullyActivity = (FullyActivity) this.f15530b;
        if (r02 && fullyActivity.checkSelfPermission("android.permission.BLUETOOTH_SCAN") != 0) {
            Log.w("O", "Bluetooth scan permission missing, not starting the beacon scan");
        } else if (!a.y0() || fullyActivity.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) {
            if (((BeaconManager) this.f15532d) == null) {
                BeaconManager instanceForApplication = BeaconManager.getInstanceForApplication(fullyActivity);
                this.f15532d = instanceForApplication;
                instanceForApplication.getBeaconParsers().add(new BeaconParser().setBeaconLayout("m:0-3=4c000215,i:4-19,i:20-21,i:22-23,p:24-24"));
                ((BeaconManager) this.f15532d).addRangeNotifier(g8);
            }
            try {
                i = Integer.parseInt(cVar.r("iBeaconRssiSampleExpiration", "10000"));
            } catch (Exception unused) {
                i = 0;
            }
            if (i > 0) {
                try {
                    BeaconManager.setRssiFilterImplClass(RunningAverageRssiFilter.class);
                    RunningAverageRssiFilter.setSampleExpirationMilliseconds((long) i);
                } catch (Exception e8) {
                    g.x(e8, new StringBuilder("Failed to start beacon scanning due to "), "O");
                    return;
                }
            } else {
                BeaconManager.setRssiFilterImplClass(ArmaRssiFilter.class);
            }
            ((BeaconManager) this.f15532d).startRangingBeacons(region);
        } else {
            Log.w("O", "Location permission missing, not starting the beacon scan");
        }
    }

    public void o(X x8) {
        o oVar = new o(4);
        if (((O) this.f15530b).isEmpty()) {
            a(oVar, (C1031B) this.e, x8);
            if (!N7.a.e((C1031B) this.f15533f, (C1031B) this.e)) {
                a(oVar, (C1031B) this.f15533f, x8);
            }
            if (!N7.a.e((C1031B) this.f15532d, (C1031B) this.e) && !N7.a.e((C1031B) this.f15532d, (C1031B) this.f15533f)) {
                a(oVar, (C1031B) this.f15532d, x8);
            }
        } else {
            for (int i = 0; i < ((O) this.f15530b).size(); i++) {
                a(oVar, (C1031B) ((O) this.f15530b).get(i), x8);
            }
            if (!((O) this.f15530b).contains((C1031B) this.f15532d)) {
                a(oVar, (C1031B) this.f15532d, x8);
            }
        }
        this.f15531c = oVar.c();
    }
}
