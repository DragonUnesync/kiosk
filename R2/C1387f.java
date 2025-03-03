package r2;

import Q0.g;
import h1.C1048n;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.zip.Adler32;
import m2.C1208a;
import u2.C1490a;
import u2.h;
import u2.q;
import u2.t;
import u2.u;
import y2.C1627b;

/* renamed from: r2.f  reason: case insensitive filesystem */
public final class C1387f {

    /* renamed from: a  reason: collision with root package name */
    public final w f14883a;

    /* renamed from: b  reason: collision with root package name */
    public final w f14884b;

    /* renamed from: c  reason: collision with root package name */
    public final w f14885c;

    /* renamed from: d  reason: collision with root package name */
    public final w f14886d;
    public final z e;

    /* renamed from: f  reason: collision with root package name */
    public final z f14887f;

    /* renamed from: g  reason: collision with root package name */
    public final z f14888g;

    /* renamed from: h  reason: collision with root package name */
    public final l f14889h;
    public final v i;

    /* renamed from: j  reason: collision with root package name */
    public final C1385d f14890j;

    /* renamed from: k  reason: collision with root package name */
    public final w f14891k;

    /* renamed from: l  reason: collision with root package name */
    public final w f14892l;

    /* renamed from: m  reason: collision with root package name */
    public final z f14893m;

    /* renamed from: n  reason: collision with root package name */
    public final C1377A[] f14894n;

    /* renamed from: o  reason: collision with root package name */
    public int f14895o = -1;

    public C1387f(C1048n nVar) {
        z zVar = new z(this, 3);
        this.f14893m = zVar;
        w wVar = new w((String) null, this, 4, 1);
        this.f14884b = wVar;
        w wVar2 = new w("word_data", this, 4, 2);
        this.f14883a = wVar2;
        w wVar3 = new w("string_data", this, 1, 3);
        this.f14886d = wVar3;
        w wVar4 = new w((String) null, this, 1, 1);
        this.f14891k = wVar4;
        w wVar5 = new w("byte_data", this, 1, 2);
        this.f14892l = wVar5;
        z zVar2 = new z(this, 1);
        this.e = zVar2;
        z zVar3 = new z(this, 2);
        this.f14887f = zVar3;
        z zVar4 = new z(this, 0);
        this.f14888g = zVar4;
        l lVar = new l(this);
        this.f14889h = lVar;
        v vVar = new v(this);
        this.i = vVar;
        C1385d dVar = new C1385d(this);
        this.f14890j = dVar;
        w wVar6 = new w("map", this, 4, 1);
        this.f14885c = wVar6;
        this.f14894n = new C1377A[]{zVar, zVar2, zVar3, zVar4, lVar, vVar, dVar, wVar2, wVar, wVar3, wVar5, wVar4, wVar6};
    }

    public final void a(C1490a aVar) {
        if (aVar == null) {
            throw new NullPointerException("cst == null");
        } else if (aVar instanceof t) {
            this.e.o((t) aVar);
        } else if (aVar instanceof u) {
            this.f14887f.p((u) aVar);
        } else if (aVar instanceof q) {
            this.i.m((q) aVar);
        } else if (aVar instanceof h) {
            this.f14889h.m((h) aVar);
        }
    }

    public final byte[] b() {
        C1208a aVar;
        this.f14890j.d();
        this.f14891k.d();
        this.f14883a.d();
        this.f14892l.d();
        this.i.d();
        this.f14889h.d();
        this.f14888g.d();
        this.f14884b.d();
        this.f14887f.d();
        this.e.d();
        this.f14886d.d();
        this.f14893m.d();
        C1377A[] aArr = this.f14894n;
        int length = aArr.length;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            C1377A a8 = aArr[i10];
            if ((a8 != null && a8 != null) || !a8.c().isEmpty()) {
                if (i9 < 0) {
                    a8.getClass();
                    throw new IllegalArgumentException("fileOffset < 0");
                } else if (a8.f14853d < 0) {
                    int i11 = a8.f14852c - 1;
                    int i12 = (~i11) & (i9 + i11);
                    a8.f14853d = i12;
                    if (i12 >= i9) {
                        w wVar = this.f14885c;
                        if (a8 == wVar) {
                            try {
                                r.l(aArr, wVar);
                                wVar.d();
                            } catch (RuntimeException e8) {
                                throw C1208a.a(e8, "...while writing section " + i10);
                            }
                        }
                        if (a8 instanceof w) {
                            ((w) a8).m();
                        }
                        i9 = a8.h() + i12;
                    } else {
                        throw new RuntimeException(g.m(i10, "bogus placement for section "));
                    }
                } else {
                    throw new RuntimeException("fileOffset already set");
                }
            }
        }
        this.f14895o = i9;
        byte[] bArr = new byte[i9];
        C1627b bVar = new C1627b(bArr, false);
        while (i8 < length) {
            try {
                C1377A a9 = aArr[i8];
                if ((a9 != null && a9 != null) || !a9.c().isEmpty()) {
                    int b8 = a9.b() - bVar.f16368c;
                    if (b8 >= 0) {
                        bVar.n(b8);
                        a9.i(bVar);
                    } else {
                        throw new C1208a((Exception) null, "excess write of " + (-b8));
                    }
                }
                i8++;
            } catch (RuntimeException e9) {
                if (e9 instanceof C1208a) {
                    aVar = (C1208a) e9;
                } else {
                    aVar = new C1208a(e9, (String) null);
                }
                String m8 = g.m(i8, "...while writing section ");
                if (m8 != null) {
                    StringBuffer stringBuffer = aVar.f13347U;
                    stringBuffer.append(m8);
                    if (!m8.endsWith("\n")) {
                        stringBuffer.append(10);
                    }
                    throw aVar;
                }
                throw new NullPointerException("str == null");
            }
        }
        int i13 = bVar.f16368c;
        if (i13 == this.f14895o) {
            try {
                MessageDigest instance = MessageDigest.getInstance("SHA-1");
                instance.update(bArr, 32, i13 - 32);
                try {
                    int digest = instance.digest(bArr, 12, 20);
                    if (digest == 20) {
                        int i14 = bVar.f16368c;
                        Adler32 adler32 = new Adler32();
                        adler32.update(bArr, 12, i14 - 12);
                        int value = (int) adler32.getValue();
                        bArr[8] = (byte) value;
                        bArr[9] = (byte) (value >> 8);
                        bArr[10] = (byte) (value >> 16);
                        bArr[11] = (byte) (value >> 24);
                        return bVar.f16367b;
                    }
                    throw new RuntimeException("unexpected digest write: " + digest + " bytes");
                } catch (DigestException e10) {
                    throw new RuntimeException(e10);
                }
            } catch (NoSuchAlgorithmException e11) {
                throw new RuntimeException(e11);
            }
        } else {
            throw new RuntimeException("foreshortened write");
        }
    }
}
