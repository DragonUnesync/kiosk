package u4;

import N.e;
import S5.C0185n;
import g7.C0996d;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import k5.b;

public class d implements b {

    /* renamed from: X  reason: collision with root package name */
    public static final d f15781X = new d("MQTT".getBytes(StandardCharsets.UTF_8));

    /* renamed from: U  reason: collision with root package name */
    public byte[] f15782U;

    /* renamed from: V  reason: collision with root package name */
    public String f15783V;

    /* renamed from: W  reason: collision with root package name */
    public int f15784W;

    public d(byte[] bArr) {
        this.f15782U = bArr;
    }

    public static void a(String str, String str2) {
        if (str.length() * 3 > 65535) {
            int length = str.length();
            int i = length;
            int i8 = 0;
            while (i8 < length) {
                char charAt = str.charAt(i8);
                if (charAt > 127) {
                    int i9 = i + 1;
                    if (charAt > 2047) {
                        i += 2;
                        if (Character.isHighSurrogate(charAt)) {
                            i8++;
                        }
                    } else {
                        i = i9;
                    }
                }
                i8++;
            }
            if (i > 65535) {
                StringBuilder B8 = e.B(str2, " [");
                B8.append(str.substring(0, 10));
                B8.append("...] must not be longer than 65535 bytes, but was ");
                throw new IllegalArgumentException(e.z(B8, i, " bytes."));
            }
        }
    }

    public static void b(String str, String str2) {
        int i = 0;
        boolean z = false;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt == 0) {
                throw new IllegalArgumentException(str2 + " [" + str + "] must not contain null character (U+0000), found at index " + i + ".");
            } else if (z == Character.isLowSurrogate(charAt)) {
                z = Character.isHighSurrogate(charAt);
                i++;
            } else {
                throw new IllegalArgumentException(str2 + " [" + str + "] must not contain unmatched UTF-16 surrogate, found at index " + i + ".");
            }
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(" [");
            sb.append(str);
            sb.append("] must not contain unmatched UTF-16 surrogate, found at index ");
            sb.append(str.length() - 1);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static d c(C0185n nVar) {
        byte[] k8 = D7.b.k(nVar);
        if (k8 != null && k8.length <= 65535 && !f(k8)) {
            return new d(k8);
        }
        return null;
    }

    public static boolean f(byte[] bArr) {
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            int i8 = i + 1;
            byte b8 = bArr[i];
            if (b8 < 0) {
                if (b8 >= -32) {
                    if (b8 >= -16) {
                        int i9 = i + 3;
                        if (i9 < length) {
                            int i10 = i + 2;
                            byte b9 = bArr[i8];
                            if (b9 <= -65) {
                                if (b8 == -16 && b9 < -112) {
                                    j11 = (long) i10;
                                    j7 = j11 - Long.MIN_VALUE;
                                    break;
                                } else if ((b8 == -12 && b9 > -113) || b8 > -12) {
                                    j9 = (long) i10;
                                    j10 = -1152921504606846976L;
                                } else if (bArr[i10] > -65) {
                                    j8 = (long) i9;
                                } else {
                                    i += 4;
                                    if (bArr[i9] > -65) {
                                        j8 = (long) i;
                                    }
                                }
                            } else {
                                j8 = (long) i10;
                            }
                            j7 = j8 - 4611686018427387904L;
                            break;
                        }
                    } else {
                        int i11 = i + 2;
                        if (i11 < length) {
                            byte b10 = bArr[i8];
                            if (b10 <= -65) {
                                if (b8 == -32 && b10 < -96) {
                                    j11 = (long) i11;
                                    j7 = j11 - Long.MIN_VALUE;
                                    break;
                                } else if (b8 != -19 || b10 < -96) {
                                    i += 3;
                                    if (bArr[i11] > -65) {
                                        j8 = (long) i;
                                        j7 = j8 - 4611686018427387904L;
                                        break;
                                    }
                                } else {
                                    j9 = (long) i11;
                                    j10 = -2305843009213693952L;
                                }
                            } else {
                                j8 = (long) i11;
                                j7 = j8 - 4611686018427387904L;
                                break;
                            }
                        }
                    }
                    j7 = j9 + j10;
                    break;
                } else if (i8 != length) {
                    if (b8 < -62) {
                        j11 = (long) i8;
                        j7 = j11 - Long.MIN_VALUE;
                        break;
                    }
                    i += 2;
                    if (bArr[i8] > -65) {
                        j8 = (long) i;
                        j7 = j8 - 4611686018427387904L;
                        break;
                    }
                }
                j8 = (long) i8;
                j7 = j8 - 4611686018427387904L;
                break;
            }
            i = i8;
        }
        j7 = 0;
        if (j7 != 0) {
            return true;
        }
        for (byte b11 : bArr) {
            if (b11 == 0) {
                return true;
            }
        }
        return false;
    }

    public static d g(String str, String str2) {
        C0996d.r(str, str2);
        a(str, str2);
        b(str, str2);
        return new d(str);
    }

    public final int compareTo(Object obj) {
        return toString().compareTo(((b) obj).toString());
    }

    public final void d(C0185n nVar) {
        byte[] h5 = h();
        nVar.writeShort(h5.length);
        nVar.writeBytes(h5);
    }

    public final int e() {
        return h().length + 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.f15783V;
        String str2 = dVar.f15783V;
        if (str != null && str2 != null) {
            return str.equals(str2);
        }
        byte[] bArr = this.f15782U;
        byte[] bArr2 = dVar.f15782U;
        if (bArr == null || bArr2 == null) {
            return toString().equals(dVar.toString());
        }
        return Arrays.equals(bArr, bArr2);
    }

    public final byte[] h() {
        byte[] bArr = this.f15782U;
        if (bArr == null) {
            String str = this.f15783V;
            if (str == null) {
                return h();
            }
            bArr = str.getBytes(StandardCharsets.UTF_8);
            this.f15782U = bArr;
            int i = this.f15784W + 1;
            this.f15784W = i;
            if (i < 3) {
                this.f15783V = null;
            }
        }
        return bArr;
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        String str = this.f15783V;
        if (str != null) {
            return str;
        }
        byte[] bArr = this.f15782U;
        if (bArr == null) {
            return toString();
        }
        String str2 = new String(bArr, StandardCharsets.UTF_8);
        this.f15783V = str2;
        int i = this.f15784W + 1;
        this.f15784W = i;
        if (i < 3) {
            this.f15782U = null;
        }
        return str2;
    }

    public d(String str) {
        this.f15783V = str;
    }
}
