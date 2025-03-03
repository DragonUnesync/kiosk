package v0;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* renamed from: v0.W  reason: case insensitive filesystem */
public abstract class C1524W {

    /* renamed from: a  reason: collision with root package name */
    public static final Field f15905a;

    /* renamed from: b  reason: collision with root package name */
    public static final Field f15906b;

    /* renamed from: c  reason: collision with root package name */
    public static final Field f15907c;

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f15908d = true;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f15905a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f15906b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f15907c = declaredField3;
            declaredField3.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e.getMessage(), e);
        }
    }
}
