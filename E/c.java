package E;

import android.util.Size;
import java.util.Comparator;

public final class c implements Comparator {

    /* renamed from: U  reason: collision with root package name */
    public final boolean f1286U;

    public c(boolean z) {
        this.f1286U = z;
    }

    public final int compare(Object obj, Object obj2) {
        Size size = (Size) obj;
        Size size2 = (Size) obj2;
        int signum = Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
        if (this.f1286U) {
            return signum * -1;
        }
        return signum;
    }
}
