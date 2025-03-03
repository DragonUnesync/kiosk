package m;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* renamed from: m.f  reason: case insensitive filesystem */
public final class C1187f implements MenuItem.OnMenuItemClickListener {

    /* renamed from: c  reason: collision with root package name */
    public static final Class[] f13270c = {MenuItem.class};

    /* renamed from: a  reason: collision with root package name */
    public Object f13271a;

    /* renamed from: b  reason: collision with root package name */
    public Method f13272b;

    public final boolean onMenuItemClick(MenuItem menuItem) {
        Method method = this.f13272b;
        try {
            Class<?> returnType = method.getReturnType();
            Class<?> cls = Boolean.TYPE;
            Object obj = this.f13271a;
            if (returnType == cls) {
                return ((Boolean) method.invoke(obj, new Object[]{menuItem})).booleanValue();
            }
            method.invoke(obj, new Object[]{menuItem});
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
