package f1;

import P0.l;
import P0.z;
import R0.C0158c;
import android.net.Uri;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: f1.E  reason: case insensitive filesystem */
public final class C0886E extends C0158c implements C0890c {

    /* renamed from: Y  reason: collision with root package name */
    public final LinkedBlockingQueue f11492Y = new LinkedBlockingQueue();

    /* renamed from: Z  reason: collision with root package name */
    public final long f11493Z = 8000;

    /* renamed from: a0  reason: collision with root package name */
    public byte[] f11494a0 = new byte[0];

    /* renamed from: b0  reason: collision with root package name */
    public int f11495b0 = -1;

    public C0886E() {
        super(true);
    }

    public final String a() {
        boolean z;
        if (this.f11495b0 != -1) {
            z = true;
        } else {
            z = false;
        }
        l.j(z);
        int i = this.f11495b0;
        int i8 = z.f3748a;
        Locale locale = Locale.US;
        return "RTP/AVP/TCP;unicast;interleaved=" + i + "-" + (this.f11495b0 + 1);
    }

    public final void close() {
    }

    public final int d() {
        return this.f11495b0;
    }

    public final long f(R0.l lVar) {
        this.f11495b0 = lVar.f4277a.getPort();
        return -1;
    }

    public final boolean n() {
        return false;
    }

    public final Uri p() {
        return null;
    }

    public final C0886E u() {
        return this;
    }

    public final int x(byte[] bArr, int i, int i8) {
        if (i8 == 0) {
            return 0;
        }
        int min = Math.min(i8, this.f11494a0.length);
        System.arraycopy(this.f11494a0, 0, bArr, i, min);
        byte[] bArr2 = this.f11494a0;
        this.f11494a0 = Arrays.copyOfRange(bArr2, min, bArr2.length);
        if (min == i8) {
            return min;
        }
        try {
            byte[] bArr3 = (byte[]) this.f11492Y.poll(this.f11493Z, TimeUnit.MILLISECONDS);
            if (bArr3 == null) {
                return -1;
            }
            int min2 = Math.min(i8 - min, bArr3.length);
            System.arraycopy(bArr3, 0, bArr, i + min, min2);
            if (min2 < bArr3.length) {
                this.f11494a0 = Arrays.copyOfRange(bArr3, min2, bArr3.length);
            }
            return min + min2;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return -1;
        }
    }
}
