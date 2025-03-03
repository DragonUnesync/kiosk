package h1;

import B6.a;
import D2.j;
import M0.J;
import P6.f;
import R0.s;
import R0.v;
import W1.e;
import Z6.b;
import android.os.SystemClock;
import com.samsung.android.knox.EnterpriseDeviceManager;
import i1.k;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.NoSuchElementException;
import l1.m;
import l1.o;
import l7.i;
import m1.C1207b;
import m7.C1219b;
import n.x;
import n1.y;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.altbeacon.beacon.BeaconManager;
import org.altbeacon.bluetooth.Pdu;
import p1.C1337g;
import p1.G;
import p1.n;
import p1.q;
import p1.z;

/* renamed from: h1.n  reason: case insensitive filesystem */
public final class C1048n implements k, m, y, x, a, C1337g, q {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f12496U;

    public /* synthetic */ C1048n(int i) {
        this.f12496U = i;
    }

    public static final String i(byte[] bArr, byte[][] bArr2, int i) {
        int i8;
        boolean z;
        byte b8;
        int i9;
        byte[] bArr3 = bArr;
        byte[][] bArr4 = bArr2;
        int i10 = -1;
        byte[] bArr5 = PublicSuffixDatabase.e;
        int length = bArr3.length;
        int i11 = 0;
        while (i11 < length) {
            int i12 = (i11 + length) / 2;
            while (i12 > i10 && bArr3[i12] != 10) {
                i12 += i10;
            }
            int i13 = i12 + 1;
            int i14 = 1;
            while (true) {
                i8 = i13 + i14;
                if (bArr3[i8] == 10) {
                    break;
                }
                i14++;
            }
            int i15 = i8 - i13;
            int i16 = i;
            boolean z6 = false;
            int i17 = 0;
            int i18 = 0;
            while (true) {
                if (z6) {
                    b8 = 46;
                    z = false;
                } else {
                    byte b9 = bArr4[i16][i17];
                    byte[] bArr6 = b.f6982a;
                    byte b10 = b9 & Pdu.MANUFACTURER_DATA_PDU_TYPE;
                    z = z6;
                    b8 = b10;
                }
                byte b11 = bArr3[i13 + i18];
                byte[] bArr7 = b.f6982a;
                i9 = b8 - (b11 & Pdu.MANUFACTURER_DATA_PDU_TYPE);
                if (i9 != 0) {
                    break;
                }
                i18++;
                i17++;
                if (i18 == i15) {
                    break;
                } else if (bArr4[i16].length != i17) {
                    z6 = z;
                } else if (i16 == bArr4.length - 1) {
                    break;
                } else {
                    i16++;
                    z6 = true;
                    i17 = -1;
                }
            }
            if (i9 >= 0) {
                if (i9 <= 0) {
                    int i19 = i15 - i18;
                    int length2 = bArr4[i16].length - i17;
                    int length3 = bArr4.length;
                    for (int i20 = i16 + 1; i20 < length3; i20++) {
                        length2 += bArr4[i20].length;
                    }
                    if (length2 >= i19) {
                        if (length2 <= i19) {
                            Charset charset = StandardCharsets.UTF_8;
                            f.d(charset, "UTF_8");
                            return new String(bArr3, i13, i15, charset);
                        }
                    }
                }
                i11 = i8 + 1;
                i10 = -1;
            }
            length = i12;
            i10 = -1;
        }
        return null;
    }

    public static i k(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i8 = i * 2;
                bArr[i] = (byte) (C1219b.a(str.charAt(i8 + 1)) + (C1219b.a(str.charAt(i8)) << 4));
            }
            return new i(bArr);
        }
        throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
    }

    public static i m(String str) {
        f.e(str, "<this>");
        byte[] bytes = str.getBytes(W6.a.f6191a);
        f.d(bytes, "this as java.lang.String).getBytes(charset)");
        i iVar = new i(bytes);
        iVar.f13220W = str;
        return iVar;
    }

    private final void o() {
    }

    public static e p(l1.i iVar, j jVar) {
        int i;
        IOException iOException = (IOException) jVar.f1094V;
        if (!(iOException instanceof v) || ((i = ((v) iOException).f4313X) != 403 && i != 404 && i != 410 && i != 416 && i != 500 && i != 503)) {
            return null;
        }
        if (iVar.a(1)) {
            return new e(1, BeaconManager.DEFAULT_BACKGROUND_BETWEEN_SCAN_PERIOD);
        }
        if (iVar.a(2)) {
            return new e(2, 60000);
        }
        return null;
    }

    public static long s(j jVar) {
        Throwable th = (IOException) jVar.f1094V;
        if (!(th instanceof J) && !(th instanceof FileNotFoundException) && !(th instanceof s) && !(th instanceof o)) {
            int i = R0.i.f4264V;
            while (th != null) {
                if (!(th instanceof R0.i) || ((R0.i) th).f4265U != 2008) {
                    th = th.getCause();
                }
            }
            return (long) Math.min((jVar.f1093U - 1) * 1000, 5000);
        }
        return -9223372036854775807L;
    }

    private final void t(z zVar) {
    }

    public void a(n.m mVar, boolean z) {
    }

    public long b() {
        throw new NoSuchElementException();
    }

    public void c() {
        synchronized (C1207b.f13343a) {
            Object obj = C1207b.f13344b;
            synchronized (obj) {
                if (!C1207b.f13345c) {
                    long a8 = C1207b.a();
                    synchronized (obj) {
                        SystemClock.elapsedRealtime();
                        C1207b.f13346d = a8;
                        C1207b.f13345c = true;
                    }
                }
            }
        }
    }

    public long d() {
        throw new NoSuchElementException();
    }

    public void e() {
    }

    public long f(long j7) {
        return j7;
    }

    public void g() {
        switch (this.f12496U) {
            case 13:
                throw new UnsupportedOperationException();
            default:
                return;
        }
    }

    public Object get() {
        switch (this.f12496U) {
            case 11:
                return new Object();
            case EnterpriseDeviceManager.KNOX_2_4:
                return new Object();
            case EnterpriseDeviceManager.KNOX_2_4_1:
                return new Object();
            case EnterpriseDeviceManager.KNOX_2_5:
                return new Object();
            case EnterpriseDeviceManager.KNOX_2_5_1:
                return new Object();
            case EnterpriseDeviceManager.KNOX_2_6:
                return new Object();
            case EnterpriseDeviceManager.KNOX_2_7:
                return new Object();
            case 21:
                return new Object();
            case 22:
                return new Object();
            case 23:
                return new Object();
            case 24:
                return new Object();
            case 25:
                return new Object();
            case 26:
                return new Object();
            case 27:
                return new Object();
            case 28:
                return new Object();
            default:
                return new Object();
        }
    }

    public void h() {
    }

    public void j() {
    }

    public void l(z zVar) {
        switch (this.f12496U) {
            case 13:
                throw new UnsupportedOperationException();
            default:
                return;
        }
    }

    public boolean n(n.m mVar) {
        return false;
    }

    public boolean next() {
        return false;
    }

    public G q(int i, int i8) {
        switch (this.f12496U) {
            case 13:
                throw new UnsupportedOperationException();
            default:
                return new n();
        }
    }

    public int r(int i) {
        if (i == 7) {
            return 6;
        }
        return 3;
    }
}
