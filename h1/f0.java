package h1;

import H3.O;
import H3.i0;
import M0.Y;
import P0.l;
import P0.z;

public final class f0 {

    /* renamed from: d  reason: collision with root package name */
    public static final f0 f12468d = new f0(new Y[0]);

    /* renamed from: a  reason: collision with root package name */
    public final int f12469a;

    /* renamed from: b  reason: collision with root package name */
    public final i0 f12470b;

    /* renamed from: c  reason: collision with root package name */
    public int f12471c;

    static {
        z.J(0);
    }

    public f0(Y... yArr) {
        this.f12470b = O.n(yArr);
        this.f12469a = yArr.length;
        int i = 0;
        while (true) {
            i0 i0Var = this.f12470b;
            if (i < i0Var.size()) {
                int i8 = i + 1;
                for (int i9 = i8; i9 < i0Var.size(); i9++) {
                    if (((Y) i0Var.get(i)).equals(i0Var.get(i9))) {
                        l.p("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                    }
                }
                i = i8;
            } else {
                return;
            }
        }
    }

    public final Y a(int i) {
        return (Y) this.f12470b.get(i);
    }

    public final int b(Y y8) {
        int indexOf = this.f12470b.indexOf(y8);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f0.class != obj.getClass()) {
            return false;
        }
        f0 f0Var = (f0) obj;
        if (this.f12469a != f0Var.f12469a || !this.f12470b.equals(f0Var.f12470b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f12471c == 0) {
            this.f12471c = this.f12470b.hashCode();
        }
        return this.f12471c;
    }
}
