package k1;

import M0.Y;
import P0.l;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final Y f13005a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f13006b;

    public q(Y y8, int[] iArr) {
        if (iArr.length == 0) {
            l.p("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f13005a = y8;
        this.f13006b = iArr;
    }
}
