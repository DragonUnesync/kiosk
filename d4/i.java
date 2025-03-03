package D4;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final String f1232a;

    /* renamed from: b  reason: collision with root package name */
    public int f1233b = 0;

    /* renamed from: c  reason: collision with root package name */
    public long f1234c = 1;

    /* renamed from: d  reason: collision with root package name */
    public long f1235d;
    public i e;

    /* renamed from: f  reason: collision with root package name */
    public i f1236f;

    public i(String str, long j7) {
        this.f1232a = str;
        this.f1235d = j7;
    }

    public final long a(long j7) {
        return Math.max(this.f1234c - Math.max((j7 - this.f1235d) - 8, 0), 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("{topic='");
        sb.append(this.f1232a);
        sb.append('\'');
        String str2 = "";
        if (this.f1233b == 0) {
            str = str2;
        } else {
            str = ", alias=" + (this.f1233b & 65535);
        }
        sb.append(str);
        if ((this.f1233b & 65536) != 0) {
            str2 = ", new ";
        }
        sb.append(str2);
        sb.append(", used = ");
        sb.append(this.f1234c);
        sb.append(", access = ");
        sb.append(this.f1235d);
        sb.append('}');
        return sb.toString();
    }
}
