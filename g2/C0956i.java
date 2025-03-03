package g2;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* renamed from: g2.i  reason: case insensitive filesystem */
public abstract class C0956i {
    public static <T, V> ObjectAnimator a(T t8, Property<T, V> property, Path path) {
        return ObjectAnimator.ofObject(t8, property, (TypeConverter) null, path);
    }
}
