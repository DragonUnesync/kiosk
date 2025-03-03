package f7;

import D6.h;
import J1.d;
import P6.f;
import Z6.b;
import java.io.IOException;
import java.util.ArrayList;
import l7.i;
import l7.q;
import org.altbeacon.bluetooth.Pdu;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public int f11703a = 4096;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f11704b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final q f11705c;

    /* renamed from: d  reason: collision with root package name */
    public C0939b[] f11706d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public int f11707f;

    /* renamed from: g  reason: collision with root package name */
    public int f11708g;

    public c(r rVar) {
        this.f11705c = new q(rVar);
        this.f11706d = new C0939b[8];
        this.e = 7;
    }

    public final int a(int i) {
        int i8;
        int i9 = 0;
        if (i > 0) {
            int length = this.f11706d.length;
            while (true) {
                length--;
                i8 = this.e;
                if (length < i8 || i <= 0) {
                    C0939b[] bVarArr = this.f11706d;
                    System.arraycopy(bVarArr, i8 + 1, bVarArr, i8 + 1 + i9, this.f11707f);
                    this.e += i9;
                } else {
                    C0939b bVar = this.f11706d[length];
                    f.b(bVar);
                    int i10 = bVar.f11702c;
                    i -= i10;
                    this.f11708g -= i10;
                    this.f11707f--;
                    i9++;
                }
            }
            C0939b[] bVarArr2 = this.f11706d;
            System.arraycopy(bVarArr2, i8 + 1, bVarArr2, i8 + 1 + i9, this.f11707f);
            this.e += i9;
        }
        return i9;
    }

    public final i b(int i) {
        if (i >= 0) {
            C0939b[] bVarArr = e.f11716a;
            if (i <= bVarArr.length - 1) {
                return bVarArr[i].f11700a;
            }
        }
        int length = this.e + 1 + (i - e.f11716a.length);
        if (length >= 0) {
            C0939b[] bVarArr2 = this.f11706d;
            if (length < bVarArr2.length) {
                C0939b bVar = bVarArr2[length];
                f.b(bVar);
                return bVar.f11700a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void c(C0939b bVar) {
        this.f11704b.add(bVar);
        int i = this.f11703a;
        int i8 = bVar.f11702c;
        if (i8 > i) {
            C0939b[] bVarArr = this.f11706d;
            h.F(0, bVarArr.length, bVarArr);
            this.e = this.f11706d.length - 1;
            this.f11707f = 0;
            this.f11708g = 0;
            return;
        }
        a((this.f11708g + i8) - i);
        int i9 = this.f11707f + 1;
        C0939b[] bVarArr2 = this.f11706d;
        if (i9 > bVarArr2.length) {
            C0939b[] bVarArr3 = new C0939b[(bVarArr2.length * 2)];
            System.arraycopy(bVarArr2, 0, bVarArr3, bVarArr2.length, bVarArr2.length);
            this.e = this.f11706d.length - 1;
            this.f11706d = bVarArr3;
        }
        int i10 = this.e;
        this.e = i10 - 1;
        this.f11706d[i10] = bVar;
        this.f11707f++;
        this.f11708g += i8;
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [l7.f, java.lang.Object] */
    public final i d() {
        boolean z;
        int i;
        q qVar = this.f11705c;
        byte m8 = qVar.m();
        byte[] bArr = b.f6982a;
        byte b8 = m8 & Pdu.MANUFACTURER_DATA_PDU_TYPE;
        int i8 = 0;
        if ((m8 & 128) == 128) {
            z = true;
        } else {
            z = false;
        }
        long e8 = (long) e(b8, 127);
        if (!z) {
            return qVar.n(e8);
        }
        ? obj = new Object();
        int[] iArr = y.f11808a;
        f.e(qVar, "source");
        d dVar = y.f11810c;
        d dVar2 = dVar;
        int i9 = 0;
        for (long j7 = 0; j7 < e8; j7++) {
            int m9 = qVar.m();
            byte[] bArr2 = b.f6982a;
            i8 = (i8 << 8) | (m9 & 255);
            i9 += 8;
            while (i9 >= 8) {
                d[] dVarArr = (d[]) dVar2.f2353W;
                f.b(dVarArr);
                dVar2 = dVarArr[(i8 >>> (i9 - 8)) & 255];
                f.b(dVar2);
                if (((d[]) dVar2.f2353W) == null) {
                    obj.z(dVar2.f2351U);
                    i9 -= dVar2.f2352V;
                    dVar2 = dVar;
                } else {
                    i9 -= 8;
                }
            }
        }
        while (i9 > 0) {
            d[] dVarArr2 = (d[]) dVar2.f2353W;
            f.b(dVarArr2);
            d dVar3 = dVarArr2[(i8 << (8 - i9)) & 255];
            f.b(dVar3);
            if (((d[]) dVar3.f2353W) != null || (i = dVar3.f2352V) > i9) {
                break;
            }
            obj.z(dVar3.f2351U);
            i9 -= i;
            dVar2 = dVar;
        }
        return obj.p(obj.f13216V);
    }

    public final int e(int i, int i8) {
        int i9 = i & i8;
        if (i9 < i8) {
            return i9;
        }
        int i10 = 0;
        while (true) {
            byte m8 = this.f11705c.m();
            byte[] bArr = b.f6982a;
            byte b8 = m8 & Pdu.MANUFACTURER_DATA_PDU_TYPE;
            if ((m8 & 128) == 0) {
                return i8 + (b8 << i10);
            }
            i8 += (m8 & Byte.MAX_VALUE) << i10;
            i10 += 7;
        }
    }
}
