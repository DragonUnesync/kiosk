package h0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import g0.C0941a;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import u.C1477r;

/* renamed from: h0.d  reason: case insensitive filesystem */
public final class C1029d extends ViewGroup.MarginLayoutParams {

    /* renamed from: a  reason: collision with root package name */
    public C1026a f12261a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f12262b = false;

    /* renamed from: c  reason: collision with root package name */
    public final int f12263c = 0;

    /* renamed from: d  reason: collision with root package name */
    public final int f12264d = 0;
    public final int e = -1;

    /* renamed from: f  reason: collision with root package name */
    public final int f12265f = -1;

    /* renamed from: g  reason: collision with root package name */
    public int f12266g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f12267h = 0;
    public int i;

    /* renamed from: j  reason: collision with root package name */
    public int f12268j;

    /* renamed from: k  reason: collision with root package name */
    public View f12269k;

    /* renamed from: l  reason: collision with root package name */
    public View f12270l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f12271m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f12272n;

    /* renamed from: o  reason: collision with root package name */
    public final Rect f12273o = new Rect();

    public C1029d() {
        super(-2, -2);
    }

    public final boolean a(int i8) {
        if (i8 == 0) {
            return this.f12271m;
        }
        if (i8 != 1) {
            return false;
        }
        return this.f12272n;
    }

    public C1029d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C1026a aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0941a.f11838b);
        this.f12263c = obtainStyledAttributes.getInteger(0, 0);
        this.f12265f = obtainStyledAttributes.getResourceId(1, -1);
        this.f12264d = obtainStyledAttributes.getInteger(2, 0);
        this.e = obtainStyledAttributes.getInteger(6, -1);
        this.f12266g = obtainStyledAttributes.getInt(5, 0);
        this.f12267h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f12262b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f7705q0;
            if (TextUtils.isEmpty(string)) {
                aVar = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f7705q0;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f7707s0;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f7706r0);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    aVar = (C1026a) constructor.newInstance(new Object[]{context, attributeSet});
                } catch (Exception e8) {
                    throw new RuntimeException(C1477r.d("Could not inflate Behavior subclass ", string), e8);
                }
            }
            this.f12261a = aVar;
        }
        obtainStyledAttributes.recycle();
        C1026a aVar2 = this.f12261a;
        if (aVar2 != null) {
            aVar2.c(this);
        }
    }

    public C1029d(C1029d dVar) {
        super(dVar);
    }

    public C1029d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    public C1029d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }
}
