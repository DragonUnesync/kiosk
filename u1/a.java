package U1;

import B7.g;
import D1.h;
import M0.H;
import M1.d;
import M1.k;
import M1.l;
import N.e;
import O0.b;
import P0.c;
import P0.r;
import P0.z;
import java.io.EOFException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

public final class a implements l {

    /* renamed from: U  reason: collision with root package name */
    public final r f5375U;

    public a(int i) {
        switch (i) {
            case 1:
                this.f5375U = new r(10);
                return;
            default:
                this.f5375U = new r();
                return;
        }
    }

    public void D(byte[] bArr, int i, int i8, k kVar, c cVar) {
        boolean z;
        b bVar;
        boolean z6;
        int i9 = i;
        r rVar = this.f5375U;
        rVar.F(i9 + i8, bArr);
        rVar.H(i9);
        ArrayList arrayList = new ArrayList();
        while (rVar.a() > 0) {
            if (rVar.a() >= 8) {
                z = true;
            } else {
                z = false;
            }
            P0.l.c("Incomplete Mp4Webvtt Top Level box header found.", z);
            int i10 = rVar.i();
            if (rVar.i() == 1987343459) {
                int i11 = i10 - 8;
                CharSequence charSequence = null;
                O0.a aVar = null;
                while (i11 > 0) {
                    if (i11 >= 8) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    P0.l.c("Incomplete vtt cue box header found.", z6);
                    int i12 = rVar.i();
                    int i13 = rVar.i();
                    int i14 = i12 - 8;
                    byte[] bArr2 = rVar.f3732a;
                    int i15 = rVar.f3733b;
                    int i16 = z.f3748a;
                    String str = new String(bArr2, i15, i14, StandardCharsets.UTF_8);
                    rVar.I(i14);
                    i11 = (i11 - 8) - i14;
                    if (i13 == 1937011815) {
                        h hVar = new h();
                        i.e(str, hVar);
                        aVar = hVar.a();
                    } else if (i13 == 1885436268) {
                        charSequence = i.f((String) null, Collections.emptyList(), str.trim());
                    }
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (aVar != null) {
                    aVar.f3495a = charSequence;
                    bVar = aVar.a();
                } else {
                    Pattern pattern = i.f5415a;
                    h hVar2 = new h();
                    hVar2.f5408c = charSequence;
                    bVar = hVar2.a().a();
                }
                arrayList.add(bVar);
            } else {
                rVar.I(i10 - 8);
            }
        }
        cVar.accept(new M1.a(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    public /* synthetic */ void a() {
    }

    public H b(p1.l lVar, g gVar) {
        r rVar = this.f5375U;
        H h5 = null;
        int i = 0;
        while (true) {
            try {
                lVar.r(rVar.f3732a, 0, 10, false);
                rVar.H(0);
                if (rVar.y() != 4801587) {
                    break;
                }
                rVar.I(3);
                int u3 = rVar.u();
                int i8 = u3 + 10;
                if (h5 == null) {
                    byte[] bArr = new byte[i8];
                    System.arraycopy(rVar.f3732a, 0, bArr, 0, 10);
                    lVar.r(bArr, 10, u3, false);
                    h5 = new h(gVar).H(i8, bArr);
                } else {
                    lVar.b(u3, false);
                }
                i += i8;
            } catch (EOFException unused) {
            }
        }
        lVar.f14410Z = 0;
        lVar.b(i, false);
        return h5;
    }

    public /* synthetic */ d o(byte[] bArr, int i, int i8) {
        return e.o(this, bArr, i8);
    }

    public int y() {
        return 2;
    }
}
