package p1;

import M0.C0129q;
import M0.H;
import M0.I;
import M0.r;
import N1.f;
import P0.z;
import de.ozerov.fully.K2;
import java.util.Collections;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final int f14423a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14424b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14425c;

    /* renamed from: d  reason: collision with root package name */
    public final int f14426d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final int f14427f;

    /* renamed from: g  reason: collision with root package name */
    public final int f14428g;

    /* renamed from: h  reason: collision with root package name */
    public final int f14429h;
    public final int i;

    /* renamed from: j  reason: collision with root package name */
    public final long f14430j;

    /* renamed from: k  reason: collision with root package name */
    public final K2 f14431k;

    /* renamed from: l  reason: collision with root package name */
    public final H f14432l;

    public t(int i8, byte[] bArr) {
        f fVar = new f(bArr.length, bArr);
        fVar.r(i8 * 8);
        this.f14423a = fVar.i(16);
        this.f14424b = fVar.i(16);
        this.f14425c = fVar.i(24);
        this.f14426d = fVar.i(24);
        int i9 = fVar.i(20);
        this.e = i9;
        this.f14427f = d(i9);
        this.f14428g = fVar.i(3) + 1;
        int i10 = fVar.i(5) + 1;
        this.f14429h = i10;
        this.i = a(i10);
        this.f14430j = fVar.k(36);
        this.f14431k = null;
        this.f14432l = null;
    }

    public static int a(int i8) {
        if (i8 == 8) {
            return 1;
        }
        if (i8 == 12) {
            return 2;
        }
        if (i8 == 16) {
            return 4;
        }
        if (i8 == 20) {
            return 5;
        }
        if (i8 != 24) {
            return -1;
        }
        return 6;
    }

    public static int d(int i8) {
        switch (i8) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long b() {
        long j7 = this.f14430j;
        if (j7 == 0) {
            return -9223372036854775807L;
        }
        return (j7 * 1000000) / ((long) this.e);
    }

    public final r c(byte[] bArr, H h5) {
        bArr[4] = Byte.MIN_VALUE;
        int i8 = this.f14426d;
        if (i8 <= 0) {
            i8 = -1;
        }
        H h8 = this.f14432l;
        if (h8 != null) {
            h5 = h8.v(h5);
        }
        C0129q qVar = new C0129q();
        qVar.f2999m = I.o("audio/flac");
        qVar.f3000n = i8;
        qVar.f2979B = this.f14428g;
        qVar.f2980C = this.e;
        qVar.f2981D = z.z(this.f14429h);
        qVar.f3002p = Collections.singletonList(bArr);
        qVar.f2997k = h5;
        return new r(qVar);
    }

    public t(int i8, int i9, int i10, int i11, int i12, int i13, int i14, long j7, K2 k22, H h5) {
        this.f14423a = i8;
        this.f14424b = i9;
        this.f14425c = i10;
        this.f14426d = i11;
        this.e = i12;
        this.f14427f = d(i12);
        this.f14428g = i13;
        this.f14429h = i14;
        this.i = a(i14);
        this.f14430j = j7;
        this.f14431k = k22;
        this.f14432l = h5;
    }
}
