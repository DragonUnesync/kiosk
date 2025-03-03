package O0;

import P0.z;
import android.os.Bundle;
import android.text.Spanned;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final String f3545a = Integer.toString(0, 36);

    /* renamed from: b  reason: collision with root package name */
    public static final String f3546b = Integer.toString(1, 36);

    /* renamed from: c  reason: collision with root package name */
    public static final String f3547c = Integer.toString(2, 36);

    /* renamed from: d  reason: collision with root package name */
    public static final String f3548d = Integer.toString(3, 36);
    public static final String e = Integer.toString(4, 36);

    static {
        int i = z.f3748a;
    }

    public static Bundle a(Spanned spanned, Object obj, int i, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f3545a, spanned.getSpanStart(obj));
        bundle2.putInt(f3546b, spanned.getSpanEnd(obj));
        bundle2.putInt(f3547c, spanned.getSpanFlags(obj));
        bundle2.putInt(f3548d, i);
        if (bundle != null) {
            bundle2.putBundle(e, bundle);
        }
        return bundle2;
    }
}
