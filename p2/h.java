package p2;

import Q0.t;
import java.io.IOException;
import java.io.StringWriter;
import m2.C1208a;
import y2.C1627b;
import y2.C1628c;
import y2.C1629d;

public final class h extends C1628c {

    /* renamed from: W  reason: collision with root package name */
    public final int f14465W;

    public h(int i, int i8) {
        super(i);
        this.f14465W = i8;
    }

    public final int h() {
        int length = this.f16371V.length;
        if (length == 0) {
            return 0;
        }
        g gVar = (g) e(length - 1);
        return gVar.b() + gVar.e();
    }

    public final void i(C1627b bVar) {
        int i;
        int i8 = bVar.f16368c;
        int length = this.f16371V.length;
        int i9 = 0;
        if (bVar.d()) {
            for (int i10 = 0; i10 < length; i10++) {
                g gVar = (g) e(i10);
                int b8 = gVar.b() * 2;
                String str = null;
                if (b8 != 0) {
                    int i11 = bVar.f16370f;
                    int i12 = bVar.e - ((i11 / 2) + ((i11 * 2) + 8));
                    String g8 = gVar.g();
                    if (g8 != null) {
                        String str2 = "  " + gVar.f() + ": ";
                        int length2 = str2.length();
                        if (i12 == 0) {
                            i = g8.length();
                        } else {
                            i = i12 - length2;
                        }
                        StringWriter stringWriter = new StringWriter((str2.length() + g8.length()) * 3);
                        t tVar = new t(stringWriter, length2, i, "");
                        try {
                            ((C1629d) tVar.e).write(str2);
                            ((C1629d) tVar.f4078f).write(g8);
                            StringBuffer stringBuffer = (StringBuffer) tVar.f4077d;
                            StringBuffer stringBuffer2 = (StringBuffer) tVar.f4076c;
                            C1629d dVar = (C1629d) tVar.f4078f;
                            C1629d dVar2 = (C1629d) tVar.e;
                            try {
                                t.b(stringBuffer2, dVar2);
                                t.b(stringBuffer, dVar);
                                tVar.j();
                                t.b(stringBuffer2, dVar2);
                                while (stringBuffer2.length() != 0) {
                                    dVar.write(10);
                                    tVar.j();
                                }
                                t.b(stringBuffer, dVar);
                                while (stringBuffer.length() != 0) {
                                    dVar2.write(10);
                                    tVar.j();
                                }
                                str = stringWriter.toString();
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        } catch (IOException e8) {
                            throw new RuntimeException("shouldn't happen", e8);
                        }
                    }
                }
                if (str != null) {
                    bVar.b(b8, str);
                } else if (b8 != 0) {
                    bVar.b(b8, "");
                }
            }
        }
        while (i9 < length) {
            g gVar2 = (g) e(i9);
            try {
                gVar2.l(bVar);
                i9++;
            } catch (RuntimeException e9) {
                throw C1208a.a(e9, "...while writing " + gVar2);
            }
        }
        int i13 = (bVar.f16368c - i8) / 2;
        if (i13 != h()) {
            throw new RuntimeException("write length mismatch; expected " + h() + " but actually wrote " + i13);
        }
    }
}
