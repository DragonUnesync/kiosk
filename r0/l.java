package R0;

import M0.D;
import N.e;
import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

public final class l {
    public static final /* synthetic */ int i = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Uri f4277a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4278b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f4279c;

    /* renamed from: d  reason: collision with root package name */
    public final Map f4280d;
    public final long e;

    /* renamed from: f  reason: collision with root package name */
    public final long f4281f;

    /* renamed from: g  reason: collision with root package name */
    public final String f4282g;

    /* renamed from: h  reason: collision with root package name */
    public final int f4283h;

    static {
        D.a("media3.datasource");
    }

    public l(Uri uri, int i8, byte[] bArr, Map map, long j7, long j8, String str, int i9) {
        boolean z;
        boolean z6;
        boolean z8 = false;
        if (j7 >= 0) {
            z = true;
        } else {
            z = false;
        }
        P0.l.d(z);
        if (j7 >= 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        P0.l.d(z6);
        P0.l.d((j8 > 0 || j8 == -1) ? true : z8);
        uri.getClass();
        this.f4277a = uri;
        this.f4278b = i8;
        this.f4279c = (bArr == null || bArr.length == 0) ? null : bArr;
        this.f4280d = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.e = j7;
        this.f4281f = j8;
        this.f4282g = str;
        this.f4283h = i9;
    }

    public final l a(long j7) {
        long j8 = this.f4281f;
        long j9 = -1;
        if (j8 != -1) {
            j9 = j8 - j7;
        }
        long j10 = j9;
        if (j7 == 0 && j8 == j10) {
            return this;
        }
        byte[] bArr = this.f4279c;
        int i8 = this.f4283h;
        return new l(this.f4277a, this.f4278b, bArr, this.f4280d, this.e + j7, j10, this.f4282g, i8);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DataSpec[");
        int i8 = this.f4278b;
        if (i8 == 1) {
            str = "GET";
        } else if (i8 == 2) {
            str = "POST";
        } else if (i8 == 3) {
            str = "HEAD";
        } else {
            throw new IllegalStateException();
        }
        sb.append(str);
        sb.append(" ");
        sb.append(this.f4277a);
        sb.append(", ");
        sb.append(this.e);
        sb.append(", ");
        sb.append(this.f4281f);
        sb.append(", ");
        sb.append(this.f4282g);
        sb.append(", ");
        return e.z(sb, this.f4283h, "]");
    }
}
