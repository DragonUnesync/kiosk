package b5;

import L4.i;
import Q0.g;

/* renamed from: b5.a  reason: case insensitive filesystem */
public final class C0532a extends i {
    public final int e;

    public C0532a(b bVar, int i, int i8) {
        super(bVar, i);
        this.e = i8;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("MqttStatefulSubscribe{");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.c());
        int i = this.e;
        if (i == -1) {
            str = "";
        } else {
            str = g.m(i, "subscriptionIdentifier=");
        }
        sb2.append(str);
        sb.append(sb2.toString());
        sb.append('}');
        return sb.toString();
    }
}
