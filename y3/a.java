package Y3;

import A1.d;
import M3.h;
import M3.j;
import M3.l;
import M3.m;
import M3.n;
import S3.b;
import W3.c;
import java.text.DecimalFormat;
import java.util.EnumMap;
import org.altbeacon.bluetooth.Pdu;

public final class a implements j {

    /* renamed from: b  reason: collision with root package name */
    public static final n[] f6587b = new n[0];

    /* renamed from: a  reason: collision with root package name */
    public final c f6588a = new c(1);

    public final void a() {
    }

    public final l b(d dVar, EnumMap enumMap) {
        int[] iArr;
        byte[] bArr;
        String str;
        b x8 = dVar.x();
        int i = x8.f4505U;
        int i8 = x8.f4506V;
        int i9 = i8;
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < i8; i12++) {
            int i13 = 0;
            while (true) {
                int i14 = x8.f4507W;
                if (i13 >= i14) {
                    break;
                }
                int i15 = x8.f4508X[(i14 * i12) + i13];
                if (i15 != 0) {
                    if (i12 < i9) {
                        i9 = i12;
                    }
                    if (i12 > i10) {
                        i10 = i12;
                    }
                    int i16 = i13 << 5;
                    if (i16 < i) {
                        int i17 = 0;
                        while ((i15 << (31 - i17)) == 0) {
                            i17++;
                        }
                        int i18 = i16 + i17;
                        if (i18 < i) {
                            i = i18;
                        }
                    }
                    if (i16 + 31 > i11) {
                        int i19 = 31;
                        while ((i15 >>> i19) == 0) {
                            i19--;
                        }
                        int i20 = i16 + i19;
                        if (i20 > i11) {
                            i11 = i20;
                        }
                    }
                }
                i13++;
            }
        }
        if (i11 < i || i10 < i9) {
            iArr = null;
        } else {
            iArr = new int[]{i, i9, (i11 - i) + 1, (i10 - i9) + 1};
        }
        if (iArr != null) {
            int i21 = iArr[0];
            int i22 = iArr[1];
            int i23 = iArr[2];
            int i24 = iArr[3];
            int[] iArr2 = new int[33];
            int i25 = 0;
            for (int i26 = 33; i25 < i26; i26 = 33) {
                int i27 = (((i24 / 2) + (i25 * i24)) / i26) + i22;
                for (int i28 = 0; i28 < 30; i28++) {
                    if (x8.b((((((i25 & 1) * i23) / 2) + ((i23 / 2) + (i28 * i23))) / 30) + i21, i27)) {
                        int i29 = (i28 / 32) + i25;
                        iArr2[i29] = iArr2[i29] | (1 << (i28 & 31));
                    }
                }
                i25++;
            }
            c cVar = this.f6588a;
            cVar.getClass();
            byte[] bArr2 = new byte[144];
            for (int i30 = 0; i30 < 33; i30++) {
                int[] iArr3 = Z3.a.f6977a[i30];
                for (int i31 = 0; i31 < 30; i31++) {
                    int i32 = iArr3[i31];
                    if (i32 >= 0 && ((iArr2[(i31 / 32) + i30] >>> (i31 & 31)) & 1) != 0) {
                        int i33 = i32 / 6;
                        bArr2[i33] = (byte) (bArr2[i33] | ((byte) (1 << (5 - (i32 % 6)))));
                    }
                }
            }
            cVar.a(bArr2, 0, 10, 10, 0);
            byte b8 = bArr2[0] & 15;
            if (b8 == 2 || b8 == 3 || b8 == 4) {
                c cVar2 = cVar;
                byte[] bArr3 = bArr2;
                cVar2.a(bArr3, 20, 84, 40, 1);
                cVar2.a(bArr3, 20, 84, 40, 2);
                bArr = new byte[94];
            } else if (b8 == 5) {
                c cVar3 = cVar;
                byte[] bArr4 = bArr2;
                cVar3.a(bArr4, 20, 68, 56, 1);
                cVar3.a(bArr4, 20, 68, 56, 2);
                bArr = new byte[78];
            } else {
                throw M3.d.a();
            }
            System.arraycopy(bArr2, 0, bArr, 0, 10);
            System.arraycopy(bArr2, 20, bArr, 10, bArr.length - 10);
            StringBuilder sb = new StringBuilder(144);
            if (b8 == 2 || b8 == 3) {
                if (b8 == 2) {
                    str = new DecimalFormat("0000000000".substring(0, Z3.a.a(bArr, new byte[]{39, 40, 41, 42, 31, 32}))).format((long) Z3.a.a(bArr, new byte[]{Pdu.GATT_SERVICE_UUID_128_BIT_PDU_TYPE, 34, 35, 36, 25, 26, 27, 28, 29, 30, 19, 20, 21, Pdu.GATT_SERVICE_UUID_PDU_TYPE, 23, 24, 13, 14, 15, 16, 17, 18, 7, 8, 9, 10, 11, 12, 1, 2}));
                } else {
                    String[] strArr = Z3.a.f6978b;
                    str = String.valueOf(new char[]{strArr[0].charAt(Z3.a.a(bArr, new byte[]{39, 40, 41, 42, 31, 32})), strArr[0].charAt(Z3.a.a(bArr, new byte[]{Pdu.GATT_SERVICE_UUID_128_BIT_PDU_TYPE, 34, 35, 36, 25, 26})), strArr[0].charAt(Z3.a.a(bArr, new byte[]{27, 28, 29, 30, 19, 20})), strArr[0].charAt(Z3.a.a(bArr, new byte[]{21, Pdu.GATT_SERVICE_UUID_PDU_TYPE, 23, 24, 13, 14})), strArr[0].charAt(Z3.a.a(bArr, new byte[]{15, 16, 17, 18, 7, 8})), strArr[0].charAt(Z3.a.a(bArr, new byte[]{9, 10, 11, 12, 1, 2}))});
                }
                DecimalFormat decimalFormat = new DecimalFormat("000");
                String format = decimalFormat.format((long) Z3.a.a(bArr, new byte[]{53, 54, 43, 44, 45, 46, 47, 48, 37, 38}));
                String format2 = decimalFormat.format((long) Z3.a.a(bArr, new byte[]{55, 56, 57, 58, 59, 60, 49, 50, 51, 52}));
                sb.append(Z3.a.b(bArr, 10, 84));
                if (sb.toString().startsWith("[)>\u001e01\u001d")) {
                    sb.insert(9, str + 29 + format + 29 + format2 + 29);
                } else {
                    sb.insert(0, str + 29 + format + 29 + format2 + 29);
                }
            } else if (b8 == 4) {
                sb.append(Z3.a.b(bArr, 1, 93));
            } else if (b8 == 5) {
                sb.append(Z3.a.b(bArr, 1, 77));
            }
            String sb2 = sb.toString();
            String valueOf = String.valueOf(b8);
            l lVar = new l(sb2, bArr, f6587b, M3.a.f3115d0);
            if (valueOf != null) {
                lVar.b(m.f3155W, valueOf);
            }
            return lVar;
        }
        throw h.f3144W;
    }
}
