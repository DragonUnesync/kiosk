package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.a  reason: case insensitive filesystem */
public final class C0490a {

    /* renamed from: a  reason: collision with root package name */
    public int f8362a;

    /* renamed from: b  reason: collision with root package name */
    public int f8363b;

    /* renamed from: c  reason: collision with root package name */
    public Object f8364c;

    /* renamed from: d  reason: collision with root package name */
    public int f8365d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0490a)) {
            return false;
        }
        C0490a aVar = (C0490a) obj;
        int i = this.f8362a;
        if (i != aVar.f8362a) {
            return false;
        }
        if (i == 8 && Math.abs(this.f8365d - this.f8363b) == 1 && this.f8365d == aVar.f8363b && this.f8363b == aVar.f8365d) {
            return true;
        }
        if (this.f8365d != aVar.f8365d || this.f8363b != aVar.f8363b) {
            return false;
        }
        Object obj2 = this.f8364c;
        if (obj2 != null) {
            if (!obj2.equals(aVar.f8364c)) {
                return false;
            }
        } else if (aVar.f8364c != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f8362a * 31) + this.f8363b) * 31) + this.f8365d;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f8362a;
        if (i == 1) {
            str = "add";
        } else if (i == 2) {
            str = "rm";
        } else if (i == 4) {
            str = "up";
        } else if (i != 8) {
            str = "??";
        } else {
            str = "mv";
        }
        sb.append(str);
        sb.append(",s:");
        sb.append(this.f8363b);
        sb.append("c:");
        sb.append(this.f8365d);
        sb.append(",p:");
        sb.append(this.f8364c);
        sb.append("]");
        return sb.toString();
    }
}
