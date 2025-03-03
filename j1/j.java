package J1;

import O7.b;
import P0.r;
import P0.z;
import org.altbeacon.bluetooth.Pdu;
import p1.G;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final G f2368a;

    /* renamed from: b  reason: collision with root package name */
    public final t f2369b = new t();

    /* renamed from: c  reason: collision with root package name */
    public final r f2370c = new r();

    /* renamed from: d  reason: collision with root package name */
    public u f2371d;
    public g e;

    /* renamed from: f  reason: collision with root package name */
    public int f2372f;

    /* renamed from: g  reason: collision with root package name */
    public int f2373g;

    /* renamed from: h  reason: collision with root package name */
    public int f2374h;
    public int i;

    /* renamed from: j  reason: collision with root package name */
    public final r f2375j = new r(1);

    /* renamed from: k  reason: collision with root package name */
    public final r f2376k = new r();

    /* renamed from: l  reason: collision with root package name */
    public boolean f2377l;

    public j(G g8, u uVar, g gVar) {
        this.f2368a = g8;
        this.f2371d = uVar;
        this.e = gVar;
        this.f2371d = uVar;
        this.e = gVar;
        g8.c(uVar.f2486a.f2462g);
        e();
    }

    public final int a() {
        int i8;
        if (!this.f2377l) {
            i8 = this.f2371d.f2491g[this.f2372f];
        } else if (this.f2369b.f2478j[this.f2372f]) {
            i8 = 1;
        } else {
            i8 = 0;
        }
        if (b() != null) {
            return i8 | b.MAX_POW2;
        }
        return i8;
    }

    public final s b() {
        if (!this.f2377l) {
            return null;
        }
        t tVar = this.f2369b;
        g gVar = tVar.f2471a;
        int i8 = z.f3748a;
        int i9 = gVar.f2360a;
        s sVar = tVar.f2481m;
        if (sVar == null) {
            sVar = this.f2371d.f2486a.f2466l[i9];
        }
        if (sVar == null || !sVar.f2467a) {
            return null;
        }
        return sVar;
    }

    public final boolean c() {
        this.f2372f++;
        if (!this.f2377l) {
            return false;
        }
        int i8 = this.f2373g + 1;
        this.f2373g = i8;
        int[] iArr = this.f2369b.f2476g;
        int i9 = this.f2374h;
        if (i8 != iArr[i9]) {
            return true;
        }
        this.f2374h = i9 + 1;
        this.f2373g = 0;
        return false;
    }

    public final int d(int i8, int i9) {
        r rVar;
        boolean z;
        boolean z6;
        int i10;
        s b8 = b();
        if (b8 == null) {
            return 0;
        }
        t tVar = this.f2369b;
        int i11 = b8.f2470d;
        if (i11 != 0) {
            rVar = tVar.f2482n;
        } else {
            int i12 = z.f3748a;
            byte[] bArr = b8.e;
            int length = bArr.length;
            r rVar2 = this.f2376k;
            rVar2.F(length, bArr);
            i11 = bArr.length;
            rVar = rVar2;
        }
        int i13 = this.f2372f;
        if (!tVar.f2479k || !tVar.f2480l[i13]) {
            z = false;
        } else {
            z = true;
        }
        if (z || i9 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        r rVar3 = this.f2375j;
        byte[] bArr2 = rVar3.f3732a;
        if (z6) {
            i10 = 128;
        } else {
            i10 = 0;
        }
        bArr2[0] = (byte) (i10 | i11);
        rVar3.H(0);
        G g8 = this.f2368a;
        g8.f(rVar3, 1, 1);
        g8.f(rVar, i11, 1);
        if (!z6) {
            return i11 + 1;
        }
        r rVar4 = this.f2370c;
        if (!z) {
            rVar4.E(8);
            byte[] bArr3 = rVar4.f3732a;
            bArr3[0] = 0;
            bArr3[1] = 1;
            bArr3[2] = (byte) 0;
            bArr3[3] = (byte) (i9 & 255);
            bArr3[4] = (byte) ((i8 >> 24) & 255);
            bArr3[5] = (byte) ((i8 >> 16) & 255);
            bArr3[6] = (byte) ((i8 >> 8) & 255);
            bArr3[7] = (byte) (i8 & 255);
            g8.f(rVar4, 8, 1);
            return i11 + 9;
        }
        r rVar5 = tVar.f2482n;
        int B8 = rVar5.B();
        rVar5.I(-2);
        int i14 = (B8 * 6) + 2;
        if (i9 != 0) {
            rVar4.E(i14);
            byte[] bArr4 = rVar4.f3732a;
            rVar5.g(bArr4, 0, i14);
            int i15 = (((bArr4[2] & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 8) | (bArr4[3] & Pdu.MANUFACTURER_DATA_PDU_TYPE)) + i9;
            bArr4[2] = (byte) ((i15 >> 8) & 255);
            bArr4[3] = (byte) (i15 & 255);
        } else {
            rVar4 = rVar5;
        }
        g8.f(rVar4, i14, 1);
        return i11 + 1 + i14;
    }

    public final void e() {
        t tVar = this.f2369b;
        tVar.f2474d = 0;
        tVar.f2484p = 0;
        tVar.f2485q = false;
        tVar.f2479k = false;
        tVar.f2483o = false;
        tVar.f2481m = null;
        this.f2372f = 0;
        this.f2374h = 0;
        this.f2373g = 0;
        this.i = 0;
        this.f2377l = false;
    }
}
