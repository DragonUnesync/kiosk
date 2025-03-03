package o;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* renamed from: o.t0  reason: case insensitive filesystem */
public abstract class C1295t0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Field f14077a;

    static {
        Field field = null;
        try {
            field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            field.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        f14077a = field;
    }
}
