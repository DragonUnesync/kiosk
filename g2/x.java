package g2;

import N.e;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f12000a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final View f12001b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f12002c = new ArrayList();

    public x(View view) {
        this.f12001b = view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = (g2.x) r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof g2.x
            if (r0 == 0) goto L_0x0018
            g2.x r3 = (g2.x) r3
            android.view.View r0 = r3.f12001b
            android.view.View r1 = r2.f12001b
            if (r1 != r0) goto L_0x0018
            java.util.HashMap r0 = r2.f12000a
            java.util.HashMap r3 = r3.f12000a
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0018
            r3 = 1
            return r3
        L_0x0018:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.x.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.f12000a.hashCode() + (this.f12001b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder B8 = e.B("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        B8.append(this.f12001b);
        B8.append("\n");
        String x8 = e.x(B8.toString(), "    values:");
        HashMap hashMap = this.f12000a;
        for (String str : hashMap.keySet()) {
            x8 = x8 + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return x8;
    }
}
