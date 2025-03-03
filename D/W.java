package D;

import java.util.ArrayList;
import java.util.List;

public abstract /* synthetic */ class W {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f866a = 0;

    static {
        C0036c cVar = X.i;
    }

    public static int a(X x8) {
        return ((Integer) x8.o0(X.f868k, -1)).intValue();
    }

    public static ArrayList b(X x8) {
        List list = (List) x8.o0(X.f875r, (Object) null);
        if (list != null) {
            return new ArrayList(list);
        }
        return null;
    }

    public static int c(X x8) {
        return ((Integer) x8.o0(X.f869l, -1)).intValue();
    }

    public static int d(X x8, int i) {
        return ((Integer) x8.o0(X.f867j, Integer.valueOf(i))).intValue();
    }

    public static void e(X x8) {
        boolean z;
        boolean r8 = x8.r();
        if (x8.i() != null) {
            z = true;
        } else {
            z = false;
        }
        if (r8 && z) {
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        } else if (x8.T() == null) {
        } else {
            if (r8 || z) {
                throw new IllegalArgumentException("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }
}
