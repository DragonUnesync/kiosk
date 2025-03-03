package m;

import Q0.g;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import n.o;
import n.p;
import n.t;
import o0.C1308a;
import v0.C1538k;

/* renamed from: m.g  reason: case insensitive filesystem */
public final class C1188g {

    /* renamed from: A  reason: collision with root package name */
    public CharSequence f13273A;

    /* renamed from: B  reason: collision with root package name */
    public CharSequence f13274B;

    /* renamed from: C  reason: collision with root package name */
    public ColorStateList f13275C = null;

    /* renamed from: D  reason: collision with root package name */
    public PorterDuff.Mode f13276D = null;

    /* renamed from: E  reason: collision with root package name */
    public final /* synthetic */ C1189h f13277E;

    /* renamed from: a  reason: collision with root package name */
    public final Menu f13278a;

    /* renamed from: b  reason: collision with root package name */
    public int f13279b;

    /* renamed from: c  reason: collision with root package name */
    public int f13280c;

    /* renamed from: d  reason: collision with root package name */
    public int f13281d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f13282f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f13283g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f13284h;
    public int i;

    /* renamed from: j  reason: collision with root package name */
    public int f13285j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f13286k;

    /* renamed from: l  reason: collision with root package name */
    public CharSequence f13287l;

    /* renamed from: m  reason: collision with root package name */
    public int f13288m;

    /* renamed from: n  reason: collision with root package name */
    public char f13289n;

    /* renamed from: o  reason: collision with root package name */
    public int f13290o;

    /* renamed from: p  reason: collision with root package name */
    public char f13291p;

    /* renamed from: q  reason: collision with root package name */
    public int f13292q;

    /* renamed from: r  reason: collision with root package name */
    public int f13293r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f13294s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f13295t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f13296u;

    /* renamed from: v  reason: collision with root package name */
    public int f13297v;

    /* renamed from: w  reason: collision with root package name */
    public int f13298w;

    /* renamed from: x  reason: collision with root package name */
    public String f13299x;

    /* renamed from: y  reason: collision with root package name */
    public String f13300y;
    public p z;

    public C1188g(C1189h hVar, Menu menu) {
        this.f13277E = hVar;
        this.f13278a = menu;
        this.f13279b = 0;
        this.f13280c = 0;
        this.f13281d = 0;
        this.e = 0;
        this.f13282f = true;
        this.f13283g = true;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f13277E.f13304c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e8) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e8);
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r0v33, types: [android.view.MenuItem$OnMenuItemClickListener, m.f, java.lang.Object] */
    public final void b(MenuItem menuItem) {
        boolean z6;
        MenuItem enabled = menuItem.setChecked(this.f13294s).setVisible(this.f13295t).setEnabled(this.f13296u);
        boolean z8 = false;
        if (this.f13293r >= 1) {
            z6 = true;
        } else {
            z6 = false;
        }
        enabled.setCheckable(z6).setTitleCondensed(this.f13287l).setIcon(this.f13288m);
        int i8 = this.f13297v;
        if (i8 >= 0) {
            menuItem.setShowAsAction(i8);
        }
        String str = this.f13300y;
        C1189h hVar = this.f13277E;
        if (str != null) {
            if (!hVar.f13304c.isRestricted()) {
                if (hVar.f13305d == null) {
                    hVar.f13305d = C1189h.a(hVar.f13304c);
                }
                Object obj = hVar.f13305d;
                String str2 = this.f13300y;
                ? obj2 = new Object();
                obj2.f13271a = obj;
                Class<?> cls = obj.getClass();
                try {
                    obj2.f13272b = cls.getMethod(str2, C1187f.f13270c);
                    menuItem.setOnMenuItemClickListener(obj2);
                } catch (Exception e8) {
                    StringBuilder s8 = g.s("Couldn't resolve menu item onClick handler ", str2, " in class ");
                    s8.append(cls.getName());
                    InflateException inflateException = new InflateException(s8.toString());
                    inflateException.initCause(e8);
                    throw inflateException;
                }
            } else {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        if (this.f13293r >= 2) {
            if (menuItem instanceof o) {
                o oVar = (o) menuItem;
                oVar.f13526r0 = (oVar.f13526r0 & -5) | 4;
            } else if (menuItem instanceof t) {
                t tVar = (t) menuItem;
                try {
                    Method method = tVar.f13541X;
                    C1308a aVar = tVar.f13540W;
                    if (method == null) {
                        tVar.f13541X = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
                    }
                    tVar.f13541X.invoke(aVar, new Object[]{Boolean.TRUE});
                } catch (Exception e9) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e9);
                }
            }
        }
        String str3 = this.f13299x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, C1189h.e, hVar.f13302a));
            z8 = true;
        }
        int i9 = this.f13298w;
        if (i9 > 0) {
            if (!z8) {
                menuItem.setActionView(i9);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        p pVar = this.z;
        if (pVar != null) {
            if (menuItem instanceof C1308a) {
                ((C1308a) menuItem).b(pVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f13273A;
        boolean z9 = menuItem instanceof C1308a;
        if (z9) {
            ((C1308a) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C1538k.d(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f13274B;
        if (z9) {
            ((C1308a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C1538k.h(menuItem, charSequence2);
        }
        char c8 = this.f13289n;
        int i10 = this.f13290o;
        if (z9) {
            ((C1308a) menuItem).setAlphabeticShortcut(c8, i10);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C1538k.c(menuItem, c8, i10);
        }
        char c9 = this.f13291p;
        int i11 = this.f13292q;
        if (z9) {
            ((C1308a) menuItem).setNumericShortcut(c9, i11);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C1538k.g(menuItem, c9, i11);
        }
        PorterDuff.Mode mode = this.f13276D;
        if (mode != null) {
            if (z9) {
                ((C1308a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                C1538k.f(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f13275C;
        if (colorStateList == null) {
            return;
        }
        if (z9) {
            ((C1308a) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C1538k.e(menuItem, colorStateList);
        }
    }
}
