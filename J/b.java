package j;

import E.e;
import Y.g;
import Y.h;
import Y.j;
import Z.a;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.util.StateSet;

public final class b extends Drawable.ConstantState {

    /* renamed from: A  reason: collision with root package name */
    public boolean f12765A;

    /* renamed from: B  reason: collision with root package name */
    public ColorFilter f12766B;

    /* renamed from: C  reason: collision with root package name */
    public boolean f12767C;

    /* renamed from: D  reason: collision with root package name */
    public ColorStateList f12768D;

    /* renamed from: E  reason: collision with root package name */
    public PorterDuff.Mode f12769E;

    /* renamed from: F  reason: collision with root package name */
    public boolean f12770F;

    /* renamed from: G  reason: collision with root package name */
    public boolean f12771G;

    /* renamed from: H  reason: collision with root package name */
    public int[][] f12772H;

    /* renamed from: I  reason: collision with root package name */
    public g f12773I;

    /* renamed from: J  reason: collision with root package name */
    public j f12774J;

    /* renamed from: a  reason: collision with root package name */
    public final e f12775a;

    /* renamed from: b  reason: collision with root package name */
    public Resources f12776b;

    /* renamed from: c  reason: collision with root package name */
    public int f12777c;

    /* renamed from: d  reason: collision with root package name */
    public int f12778d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public SparseArray f12779f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable[] f12780g;

    /* renamed from: h  reason: collision with root package name */
    public int f12781h;
    public boolean i = false;

    /* renamed from: j  reason: collision with root package name */
    public boolean f12782j;

    /* renamed from: k  reason: collision with root package name */
    public Rect f12783k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f12784l = false;

    /* renamed from: m  reason: collision with root package name */
    public boolean f12785m;

    /* renamed from: n  reason: collision with root package name */
    public int f12786n;

    /* renamed from: o  reason: collision with root package name */
    public int f12787o;

    /* renamed from: p  reason: collision with root package name */
    public int f12788p;

    /* renamed from: q  reason: collision with root package name */
    public int f12789q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f12790r;

    /* renamed from: s  reason: collision with root package name */
    public int f12791s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f12792t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f12793u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f12794v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f12795w = true;

    /* renamed from: x  reason: collision with root package name */
    public int f12796x;

    /* renamed from: y  reason: collision with root package name */
    public int f12797y = 0;
    public int z = 0;

    public b(b bVar, e eVar, Resources resources) {
        Resources resources2;
        int i8;
        this.f12775a = eVar;
        Rect rect = null;
        if (resources != null) {
            resources2 = resources;
        } else if (bVar != null) {
            resources2 = bVar.f12776b;
        } else {
            resources2 = null;
        }
        this.f12776b = resources2;
        if (bVar != null) {
            i8 = bVar.f12777c;
        } else {
            i8 = 0;
        }
        int i9 = f.f12810g0;
        i8 = resources != null ? resources.getDisplayMetrics().densityDpi : i8;
        i8 = i8 == 0 ? 160 : i8;
        this.f12777c = i8;
        if (bVar != null) {
            this.f12778d = bVar.f12778d;
            this.e = bVar.e;
            this.f12793u = true;
            this.f12794v = true;
            this.i = bVar.i;
            this.f12784l = bVar.f12784l;
            this.f12795w = bVar.f12795w;
            this.f12796x = bVar.f12796x;
            this.f12797y = bVar.f12797y;
            this.z = bVar.z;
            this.f12765A = bVar.f12765A;
            this.f12766B = bVar.f12766B;
            this.f12767C = bVar.f12767C;
            this.f12768D = bVar.f12768D;
            this.f12769E = bVar.f12769E;
            this.f12770F = bVar.f12770F;
            this.f12771G = bVar.f12771G;
            if (bVar.f12777c == i8) {
                if (bVar.f12782j) {
                    this.f12783k = bVar.f12783k != null ? new Rect(bVar.f12783k) : rect;
                    this.f12782j = true;
                }
                if (bVar.f12785m) {
                    this.f12786n = bVar.f12786n;
                    this.f12787o = bVar.f12787o;
                    this.f12788p = bVar.f12788p;
                    this.f12789q = bVar.f12789q;
                    this.f12785m = true;
                }
            }
            if (bVar.f12790r) {
                this.f12791s = bVar.f12791s;
                this.f12790r = true;
            }
            if (bVar.f12792t) {
                this.f12792t = true;
            }
            Drawable[] drawableArr = bVar.f12780g;
            this.f12780g = new Drawable[drawableArr.length];
            this.f12781h = bVar.f12781h;
            SparseArray sparseArray = bVar.f12779f;
            if (sparseArray != null) {
                this.f12779f = sparseArray.clone();
            } else {
                this.f12779f = new SparseArray(this.f12781h);
            }
            int i10 = this.f12781h;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f12779f.put(i11, constantState);
                    } else {
                        this.f12780g[i11] = drawableArr[i11];
                    }
                }
            }
        } else {
            this.f12780g = new Drawable[10];
            this.f12781h = 0;
        }
        if (bVar != null) {
            this.f12772H = bVar.f12772H;
        } else {
            this.f12772H = new int[this.f12780g.length][];
        }
        if (bVar != null) {
            this.f12773I = bVar.f12773I;
            this.f12774J = bVar.f12774J;
            return;
        }
        this.f12773I = new g();
        this.f12774J = new j();
    }

    public final int a(Drawable drawable) {
        int i8 = this.f12781h;
        if (i8 >= this.f12780g.length) {
            int i9 = i8 + 10;
            Drawable[] drawableArr = new Drawable[i9];
            Drawable[] drawableArr2 = this.f12780g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i8);
            }
            this.f12780g = drawableArr;
            int[][] iArr = new int[i9][];
            System.arraycopy(this.f12772H, 0, iArr, 0, i8);
            this.f12772H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f12775a);
        this.f12780g[i8] = drawable;
        this.f12781h++;
        this.e = drawable.getChangingConfigurations() | this.e;
        this.f12790r = false;
        this.f12792t = false;
        this.f12783k = null;
        this.f12782j = false;
        this.f12785m = false;
        this.f12793u = false;
        return i8;
    }

    public final void b() {
        this.f12785m = true;
        c();
        int i8 = this.f12781h;
        Drawable[] drawableArr = this.f12780g;
        this.f12787o = -1;
        this.f12786n = -1;
        this.f12789q = 0;
        this.f12788p = 0;
        for (int i9 = 0; i9 < i8; i9++) {
            Drawable drawable = drawableArr[i9];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f12786n) {
                this.f12786n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f12787o) {
                this.f12787o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f12788p) {
                this.f12788p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f12789q) {
                this.f12789q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f12779f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i8 = 0; i8 < size; i8++) {
                int keyAt = this.f12779f.keyAt(i8);
                Drawable[] drawableArr = this.f12780g;
                Drawable newDrawable = ((Drawable.ConstantState) this.f12779f.valueAt(i8)).newDrawable(this.f12776b);
                if (Build.VERSION.SDK_INT >= 23) {
                    e.v(newDrawable, this.f12796x);
                }
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f12775a);
                drawableArr[keyAt] = mutate;
            }
            this.f12779f = null;
        }
    }

    public final boolean canApplyTheme() {
        int i8 = this.f12781h;
        Drawable[] drawableArr = this.f12780g;
        for (int i9 = 0; i9 < i8; i9++) {
            Drawable drawable = drawableArr[i9];
            if (drawable == null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f12779f.get(i9);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            } else if (drawable.canApplyTheme()) {
                return true;
            }
        }
        return false;
    }

    public final Drawable d(int i8) {
        int indexOfKey;
        Drawable drawable = this.f12780g[i8];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f12779f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i8)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f12779f.valueAt(indexOfKey)).newDrawable(this.f12776b);
        if (Build.VERSION.SDK_INT >= 23) {
            e.v(newDrawable, this.f12796x);
        }
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f12775a);
        this.f12780g[i8] = mutate;
        this.f12779f.removeAt(indexOfKey);
        if (this.f12779f.size() == 0) {
            this.f12779f = null;
        }
        return mutate;
    }

    public final int e(int i8) {
        Object obj;
        if (i8 < 0) {
            return 0;
        }
        j jVar = this.f12774J;
        int i9 = 0;
        int a8 = a.a(jVar.f6311W, i8, jVar.f6309U);
        if (a8 >= 0 && (obj = jVar.f6310V[a8]) != h.f6305b) {
            i9 = obj;
        }
        return i9.intValue();
    }

    public final int f(int[] iArr) {
        int[][] iArr2 = this.f12772H;
        int i8 = this.f12781h;
        for (int i9 = 0; i9 < i8; i9++) {
            if (StateSet.stateSetMatches(iArr2[i9], iArr)) {
                return i9;
            }
        }
        return -1;
    }

    public final int getChangingConfigurations() {
        return this.f12778d | this.e;
    }

    public final Drawable newDrawable() {
        return new e(this, (Resources) null);
    }

    public final Drawable newDrawable(Resources resources) {
        return new e(this, resources);
    }
}
