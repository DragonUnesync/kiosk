package T7;

import N.e;
import Q0.d;

public final class J extends d {

    /* renamed from: W  reason: collision with root package name */
    public final StringBuilder f5096W = new StringBuilder();

    /* renamed from: X  reason: collision with root package name */
    public String f5097X;

    /* renamed from: Y  reason: collision with root package name */
    public boolean f5098Y = false;

    public J() {
        super(4, 2);
    }

    public final void p() {
        d.q(this.f5096W);
        this.f5097X = null;
        this.f5098Y = false;
    }

    public final void r(char c8) {
        String str = this.f5097X;
        StringBuilder sb = this.f5096W;
        if (str != null) {
            sb.append(str);
            this.f5097X = null;
        }
        sb.append(c8);
    }

    public final void t(String str) {
        String str2 = this.f5097X;
        StringBuilder sb = this.f5096W;
        if (str2 != null) {
            sb.append(str2);
            this.f5097X = null;
        }
        if (sb.length() == 0) {
            this.f5097X = str;
        } else {
            sb.append(str);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<!--");
        String str = this.f5097X;
        if (str == null) {
            str = this.f5096W.toString();
        }
        return e.A(sb, str, "-->");
    }
}
