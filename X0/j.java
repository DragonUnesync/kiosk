package X0;

import P0.l;
import Q0.g;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final long f6251a;

    /* renamed from: b  reason: collision with root package name */
    public final long f6252b;

    /* renamed from: c  reason: collision with root package name */
    public final String f6253c;

    /* renamed from: d  reason: collision with root package name */
    public int f6254d;

    public j(long j7, long j8, String str) {
        this.f6253c = str == null ? "" : str;
        this.f6251a = j7;
        this.f6252b = j8;
    }

    public final j a(j jVar, String str) {
        long j7;
        long j8;
        long j9;
        j jVar2 = jVar;
        String str2 = str;
        String y8 = l.y(str2, this.f6253c);
        if (jVar2 == null || !y8.equals(l.y(str2, jVar2.f6253c))) {
            return null;
        }
        long j10 = jVar2.f6252b;
        long j11 = this.f6252b;
        if (j11 != -1) {
            long j12 = this.f6251a;
            if (j12 + j11 == jVar2.f6251a) {
                if (j10 == -1) {
                    j9 = -1;
                } else {
                    j9 = j11 + j10;
                }
                return new j(j12, j9, y8);
            }
            j7 = -1;
        } else {
            j7 = -1;
        }
        if (j10 != j7) {
            long j13 = jVar2.f6251a;
            if (j13 + j10 == this.f6251a) {
                if (j11 == -1) {
                    j8 = -1;
                } else {
                    j8 = j10 + j11;
                }
                return new j(j13, j8, y8);
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f6251a == jVar.f6251a && this.f6252b == jVar.f6252b && this.f6253c.equals(jVar.f6253c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f6254d == 0) {
            this.f6254d = this.f6253c.hashCode() + ((((527 + ((int) this.f6251a)) * 31) + ((int) this.f6252b)) * 31);
        }
        return this.f6254d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RangedUri(referenceUri=");
        sb.append(this.f6253c);
        sb.append(", start=");
        sb.append(this.f6251a);
        sb.append(", length=");
        return g.o(sb, this.f6252b, ")");
    }
}
