package Z5;

import X5.C0354e;
import X5.C0363n;
import java.util.Calendar;
import java.util.Date;

/* renamed from: Z5.k  reason: case insensitive filesystem */
public final class C0393k extends C0354e {
    static final C0393k INSTANCE = new C0393k();

    private C0393k() {
    }

    public CharSequence convertObject(Object obj) {
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        if (obj instanceof Date) {
            return C0363n.format((Date) obj);
        }
        if (obj instanceof Calendar) {
            return C0363n.format(((Calendar) obj).getTime());
        }
        return obj.toString();
    }
}
