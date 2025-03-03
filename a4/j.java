package a4;

import M3.h;
import M3.k;
import M3.l;
import M3.m;
import M3.n;
import S3.a;
import java.util.ArrayList;
import java.util.EnumMap;

public final class j {

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f7209c = {1, 1, 2};

    /* renamed from: a  reason: collision with root package name */
    public final Object f7210a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f7211b;

    public j(int i) {
        switch (i) {
            case 1:
                this.f7210a = new ArrayList();
                this.f7211b = new ArrayList();
                return;
            default:
                this.f7210a = new i(1);
                this.f7211b = new i(0);
                return;
        }
    }

    public void a(int[] iArr, String str) {
        ((ArrayList) this.f7210a).add(iArr);
        ((ArrayList) this.f7211b).add(str);
    }

    public l b(int i, int i8, a aVar) {
        EnumMap enumMap;
        int i9 = i;
        a aVar2 = aVar;
        int[] m8 = k.m(aVar2, i8, false, f7209c, new int[3]);
        try {
            return ((i) this.f7211b).a(i9, aVar2, m8);
        } catch (k unused) {
            i iVar = (i) this.f7210a;
            StringBuilder sb = iVar.f7208b;
            sb.setLength(0);
            int[] iArr = iVar.f7207a;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            int i10 = m8[1];
            int i11 = 0;
            for (int i12 = 0; i12 < 2 && i10 < aVar2.f4504V; i12++) {
                int i13 = k.i(aVar2, iArr, i10, k.f7214g);
                sb.append((char) ((i13 % 10) + 48));
                for (int i14 : iArr) {
                    i10 += i14;
                }
                if (i13 >= 10) {
                    i11 |= 1 << (1 - i12);
                }
                if (i12 != 1) {
                    i10 = aVar2.c(aVar2.b(i10));
                }
            }
            if (sb.length() != 2) {
                throw h.f3144W;
            } else if (Integer.parseInt(sb.toString()) % 4 == i11) {
                String sb2 = sb.toString();
                if (sb2.length() != 2) {
                    enumMap = null;
                } else {
                    enumMap = new EnumMap(m.class);
                    enumMap.put(m.f3156X, Integer.valueOf(sb2));
                }
                float f8 = (float) i9;
                l lVar = new l(sb2, (byte[]) null, new n[]{new n(((float) (m8[0] + m8[1])) / 2.0f, f8), new n((float) i10, f8)}, M3.a.f3122k0);
                if (enumMap != null) {
                    lVar.a(enumMap);
                }
                return lVar;
            } else {
                throw h.f3144W;
            }
        }
    }
}
