package k4;

import M3.o;
import java.util.ArrayList;
import java.util.Iterator;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final S3.b f13033a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f13034b = new ArrayList(5);

    /* renamed from: c  reason: collision with root package name */
    public final int f13035c;

    /* renamed from: d  reason: collision with root package name */
    public final int f13036d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final int f13037f;

    /* renamed from: g  reason: collision with root package name */
    public final float f13038g;

    /* renamed from: h  reason: collision with root package name */
    public final int[] f13039h;
    public final o i;

    public b(S3.b bVar, int i8, int i9, int i10, int i11, float f8, o oVar) {
        this.f13033a = bVar;
        this.f13035c = i8;
        this.f13036d = i9;
        this.e = i10;
        this.f13037f = i11;
        this.f13038g = f8;
        this.f13039h = new int[3];
        this.i = oVar;
    }

    public final boolean a(int[] iArr) {
        float f8 = this.f13038g;
        float f9 = f8 / 2.0f;
        for (int i8 = 0; i8 < 3; i8++) {
            if (Math.abs(f8 - ((float) iArr[i8])) >= f9) {
                return false;
            }
        }
        return true;
    }

    public final a b(int i8, int i9, int[] iArr) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = i10 + i11 + i12;
        float f8 = ((float) (i9 - i12)) - (((float) i11) / 2.0f);
        int i14 = (int) f8;
        int i15 = i11 * 2;
        S3.b bVar = this.f13033a;
        int i16 = bVar.f4506V;
        int[] iArr2 = this.f13039h;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        int i17 = i8;
        while (i17 >= 0 && bVar.b(i14, i17)) {
            int i18 = iArr2[1];
            if (i18 > i15) {
                break;
            }
            iArr2[1] = i18 + 1;
            i17--;
        }
        float f9 = Float.NaN;
        if (i17 >= 0 && iArr2[1] <= i15) {
            while (i17 >= 0 && !bVar.b(i14, i17)) {
                int i19 = iArr2[0];
                if (i19 > i15) {
                    break;
                }
                iArr2[0] = i19 + 1;
                i17--;
            }
            if (iArr2[0] <= i15) {
                int i20 = i8 + 1;
                while (i20 < i16 && bVar.b(i14, i20)) {
                    int i21 = iArr2[1];
                    if (i21 > i15) {
                        break;
                    }
                    iArr2[1] = i21 + 1;
                    i20++;
                }
                if (i20 != i16 && iArr2[1] <= i15) {
                    while (i20 < i16 && !bVar.b(i14, i20)) {
                        int i22 = iArr2[2];
                        if (i22 > i15) {
                            break;
                        }
                        iArr2[2] = i22 + 1;
                        i20++;
                    }
                    int i23 = iArr2[2];
                    if (i23 <= i15 && Math.abs(((iArr2[0] + iArr2[1]) + i23) - i13) * 5 < i13 * 2 && a(iArr2)) {
                        f9 = ((float) (i20 - iArr2[2])) - (((float) iArr2[1]) / 2.0f);
                    }
                }
            }
        }
        if (Float.isNaN(f9)) {
            return null;
        }
        float f10 = ((float) ((iArr[0] + iArr[1]) + iArr[2])) / 3.0f;
        ArrayList arrayList = this.f13034b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (Math.abs(f9 - aVar.f3165b) <= f10) {
                float f11 = aVar.f3164a;
                if (Math.abs(f8 - f11) <= f10) {
                    float f12 = aVar.f13032c;
                    float abs = Math.abs(f10 - f12);
                    if (abs <= 1.0f || abs <= f12) {
                        return new a((f11 + f8) / 2.0f, (aVar.f3165b + f9) / 2.0f, (f12 + f10) / 2.0f);
                    }
                } else {
                    continue;
                }
            }
        }
        a aVar2 = new a(f8, f9, f10);
        arrayList.add(aVar2);
        o oVar = this.i;
        if (oVar == null) {
            return null;
        }
        oVar.a(aVar2);
        return null;
    }
}
