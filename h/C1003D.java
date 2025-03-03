package h;

import Y.i;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import o.C1249B;
import o.C1260b0;
import o.C1285o;
import o.C1287p;
import o.C1289q;

/* renamed from: h.D  reason: case insensitive filesystem */
public class C1003D {

    /* renamed from: b  reason: collision with root package name */
    public static final Class[] f12104b = {Context.class, AttributeSet.class};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f12105c = {16843375};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f12106d = {16844160};
    public static final int[] e = {16844156};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f12107f = {16844148};

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f12108g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h  reason: collision with root package name */
    public static final i f12109h = new i((Object) null);

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f12110a = new Object[2];

    public C1285o a(Context context, AttributeSet attributeSet) {
        return new C1285o(context, attributeSet);
    }

    public C1287p b(Context context, AttributeSet attributeSet) {
        return new C1287p(context, attributeSet, 2130968734);
    }

    public C1289q c(Context context, AttributeSet attributeSet) {
        return new C1289q(context, attributeSet, 2130968752);
    }

    public C1249B d(Context context, AttributeSet attributeSet) {
        return new C1249B(context, attributeSet);
    }

    public C1260b0 e(Context context, AttributeSet attributeSet) {
        return new C1260b0(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String str3;
        i iVar = f12109h;
        Constructor<? extends U> constructor = (Constructor) iVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f12104b);
            iVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f12110a);
    }
}
