package p1;

import M0.J;
import P0.a;
import P0.r;
import Q0.p;
import Q0.q;
import java.util.ArrayList;

/* renamed from: p1.d  reason: case insensitive filesystem */
public final class C1334d {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f14368a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14369b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14370c;

    /* renamed from: d  reason: collision with root package name */
    public final int f14371d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final int f14372f;

    /* renamed from: g  reason: collision with root package name */
    public final int f14373g;

    /* renamed from: h  reason: collision with root package name */
    public final int f14374h;
    public final int i;

    /* renamed from: j  reason: collision with root package name */
    public final int f14375j;

    /* renamed from: k  reason: collision with root package name */
    public final float f14376k;

    /* renamed from: l  reason: collision with root package name */
    public final String f14377l;

    public C1334d(ArrayList arrayList, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f8, String str) {
        this.f14368a = arrayList;
        this.f14369b = i8;
        this.f14370c = i9;
        this.f14371d = i10;
        this.e = i11;
        this.f14372f = i12;
        this.f14373g = i13;
        this.f14374h = i14;
        this.i = i15;
        this.f14375j = i16;
        this.f14376k = f8;
        this.f14377l = str;
    }

    public static C1334d a(r rVar) {
        String str;
        float f8;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        r rVar2 = rVar;
        try {
            rVar2.I(4);
            int v4 = (rVar.v() & 3) + 1;
            if (v4 != 3) {
                ArrayList arrayList = new ArrayList();
                int v8 = rVar.v() & 31;
                for (int i16 = 0; i16 < v8; i16++) {
                    int B8 = rVar.B();
                    int i17 = rVar2.f3733b;
                    rVar2.I(B8);
                    byte[] bArr = rVar2.f3732a;
                    byte[] bArr2 = a.f3688a;
                    byte[] bArr3 = new byte[(B8 + 4)];
                    System.arraycopy(a.f3688a, 0, bArr3, 0, 4);
                    System.arraycopy(bArr, i17, bArr3, 4, B8);
                    arrayList.add(bArr3);
                }
                int v9 = rVar.v();
                for (int i18 = 0; i18 < v9; i18++) {
                    int B9 = rVar.B();
                    int i19 = rVar2.f3733b;
                    rVar2.I(B9);
                    byte[] bArr4 = rVar2.f3732a;
                    byte[] bArr5 = a.f3688a;
                    byte[] bArr6 = new byte[(B9 + 4)];
                    System.arraycopy(a.f3688a, 0, bArr6, 0, 4);
                    System.arraycopy(bArr4, i19, bArr6, 4, B9);
                    arrayList.add(bArr6);
                }
                if (v8 > 0) {
                    p i20 = q.i((byte[]) arrayList.get(0), v4, ((byte[]) arrayList.get(0)).length);
                    int i21 = i20.e;
                    int i22 = i20.f4055f;
                    int i23 = i20.f4064p;
                    int i24 = i20.f4065q;
                    int i25 = i20.f4066r;
                    int i26 = i20.f4067s;
                    float f9 = i20.f4056g;
                    str = a.a(i20.f4051a, i20.f4052b, i20.f4053c);
                    i10 = i24;
                    i9 = i25;
                    i8 = i26;
                    f8 = f9;
                    i14 = i22;
                    i13 = i20.f4057h + 8;
                    i12 = i20.i + 8;
                    i11 = i23;
                    i15 = i21;
                } else {
                    str = null;
                    i15 = -1;
                    i14 = -1;
                    i13 = -1;
                    i12 = -1;
                    i11 = -1;
                    i10 = -1;
                    i9 = -1;
                    i8 = 16;
                    f8 = 1.0f;
                }
                return new C1334d(arrayList, v4, i15, i14, i13, i12, i11, i10, i9, i8, f8, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e8) {
            throw J.a(e8, "Error parsing AVC config");
        }
    }
}
