package R0;

import M0.J;
import P0.l;
import P0.z;
import android.net.Uri;
import android.util.Base64;
import j$.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import u.C1477r;

public final class f extends C0158c {

    /* renamed from: Y  reason: collision with root package name */
    public l f4260Y;

    /* renamed from: Z  reason: collision with root package name */
    public byte[] f4261Z;

    /* renamed from: a0  reason: collision with root package name */
    public int f4262a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f4263b0;

    public final void close() {
        if (this.f4261Z != null) {
            this.f4261Z = null;
            e();
        }
        this.f4260Y = null;
    }

    public final long f(l lVar) {
        g();
        this.f4260Y = lVar;
        Uri normalizeScheme = lVar.f4277a.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        boolean equals = "data".equals(scheme);
        l.c("Unsupported scheme: " + scheme, equals);
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        int i = z.f3748a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length == 2) {
            String str = split[1];
            if (split[0].contains(";base64")) {
                try {
                    this.f4261Z = Base64.decode(str, 0);
                } catch (IllegalArgumentException e) {
                    throw new J(C1477r.d("Error while parsing Base64 encoded string: ", str), e, true, 0);
                }
            } else {
                this.f4261Z = URLDecoder.decode(str, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
            }
            byte[] bArr = this.f4261Z;
            long j7 = lVar.e;
            if (j7 <= ((long) bArr.length)) {
                int i8 = (int) j7;
                this.f4262a0 = i8;
                int length = bArr.length - i8;
                this.f4263b0 = length;
                long j8 = lVar.f4281f;
                int i9 = (j8 > -1 ? 1 : (j8 == -1 ? 0 : -1));
                if (i9 != 0) {
                    this.f4263b0 = (int) Math.min((long) length, j8);
                }
                h(lVar);
                if (i9 != 0) {
                    return j8;
                }
                return (long) this.f4263b0;
            }
            this.f4261Z = null;
            throw new i(2008);
        }
        throw new J("Unexpected URI format: " + normalizeScheme, (Exception) null, true, 0);
    }

    public final Uri p() {
        l lVar = this.f4260Y;
        if (lVar != null) {
            return lVar.f4277a;
        }
        return null;
    }

    public final int x(byte[] bArr, int i, int i8) {
        if (i8 == 0) {
            return 0;
        }
        int i9 = this.f4263b0;
        if (i9 == 0) {
            return -1;
        }
        int min = Math.min(i8, i9);
        byte[] bArr2 = this.f4261Z;
        int i10 = z.f3748a;
        System.arraycopy(bArr2, this.f4262a0, bArr, i, min);
        this.f4262a0 += min;
        this.f4263b0 -= min;
        b(min);
        return min;
    }
}
