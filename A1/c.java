package A1;

import M0.H;
import N1.f;
import P0.r;
import Q7.g;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import y1.C1625a;
import z1.C1644a;

public final class c extends g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f33a;

    public /* synthetic */ c(int i) {
        this.f33a = i;
    }

    public static b H(r rVar) {
        String q7 = rVar.q();
        q7.getClass();
        String q8 = rVar.q();
        q8.getClass();
        return new b(q7, q8, rVar.p(), rVar.p(), Arrays.copyOfRange(rVar.f3732a, rVar.f3733b, rVar.f3734c));
    }

    public final H q(C1625a aVar, ByteBuffer byteBuffer) {
        switch (this.f33a) {
            case 0:
                return new H(H(new r(byteBuffer.limit(), byteBuffer.array())));
            default:
                if (byteBuffer.get() == 116) {
                    f fVar = new f(byteBuffer.limit(), byteBuffer.array());
                    int i = 12;
                    fVar.u(12);
                    int f8 = fVar.f() + fVar.i(12);
                    int i8 = 4;
                    int i9 = f8 - 4;
                    fVar.u(44);
                    fVar.v(fVar.i(12));
                    fVar.u(16);
                    ArrayList arrayList = new ArrayList();
                    while (fVar.f() < i9) {
                        fVar.u(48);
                        int i10 = fVar.i(8);
                        fVar.u(i8);
                        int f9 = fVar.f() + fVar.i(i);
                        String str = null;
                        String str2 = null;
                        while (fVar.f() < f9) {
                            int i11 = fVar.i(8);
                            int i12 = fVar.i(8);
                            int f10 = fVar.f() + i12;
                            if (i11 == 2) {
                                int i13 = fVar.i(16);
                                fVar.u(8);
                                if (i13 == 3) {
                                    while (fVar.f() < f10) {
                                        int i14 = fVar.i(8);
                                        Charset charset = StandardCharsets.US_ASCII;
                                        byte[] bArr = new byte[i14];
                                        fVar.l(i14, bArr);
                                        String str3 = new String(bArr, charset);
                                        int i15 = fVar.i(8);
                                        for (int i16 = 0; i16 < i15; i16++) {
                                            fVar.v(fVar.i(8));
                                        }
                                        str = str3;
                                    }
                                }
                            } else if (i11 == 21) {
                                Charset charset2 = StandardCharsets.US_ASCII;
                                byte[] bArr2 = new byte[i12];
                                fVar.l(i12, bArr2);
                                str2 = new String(bArr2, charset2);
                            }
                            fVar.r(f10 * 8);
                        }
                        fVar.r(f9 * 8);
                        if (!(str == null || str2 == null)) {
                            arrayList.add(new C1644a(i10, str.concat(str2)));
                        }
                        i = 12;
                        i8 = 4;
                    }
                    if (!arrayList.isEmpty()) {
                        return new H((List) arrayList);
                    }
                }
                return null;
        }
    }
}
