package E0;

import android.text.Editable;
import androidx.emoji2.text.t;

public final class a extends Editable.Factory {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f1295a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static volatile a f1296b;

    /* renamed from: c  reason: collision with root package name */
    public static Class f1297c;

    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f1297c;
        if (cls != null) {
            return new t(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
