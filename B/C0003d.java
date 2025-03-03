package B;

import B3.q;
import D.N;
import D.O;
import D6.j;
import F.e;
import F.i;
import P6.f;
import T6.a;
import T6.c;
import a0.m;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.b;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.bumptech.glide.d;
import java.io.Reader;
import java.io.StringWriter;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import m0.C1199e;
import o.O0;
import org.altbeacon.beacon.service.RangedBeacon;
import p2.g;
import p2.u;
import t2.k;
import t2.l;
import u2.n;
import v0.C1512J;
import y2.C1627b;

/* renamed from: B.d  reason: case insensitive filesystem */
public abstract class C0003d {
    public static void A(C1199e[] eVarArr, Path path) {
        int i;
        int i8;
        int i9;
        char c8;
        int i10;
        C1199e eVar;
        int i11;
        char c9;
        int i12;
        int i13;
        C1199e eVar2;
        boolean z;
        boolean z6;
        float f8;
        float f9;
        int i14;
        char c10;
        int i15;
        int i16;
        float f10;
        float f11;
        boolean z8;
        boolean z9;
        int i17;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        C1199e[] eVarArr2 = eVarArr;
        Path path2 = path;
        float[] fArr = new float[6];
        int length = eVarArr2.length;
        char c11 = 'm';
        int i18 = 0;
        while (i18 < length) {
            C1199e eVar3 = eVarArr2[i18];
            char c12 = eVar3.f13321a;
            float f22 = fArr[0];
            float f23 = fArr[1];
            float f24 = fArr[2];
            float f25 = fArr[3];
            float f26 = fArr[4];
            float f27 = fArr[5];
            switch (c12) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path2.moveTo(f26, f27);
                    f22 = f26;
                    f24 = f22;
                    f23 = f27;
                    f25 = f23;
                    break;
            }
            i = 2;
            float f28 = f26;
            float f29 = f27;
            float f30 = f22;
            float f31 = f23;
            int i19 = 0;
            while (true) {
                float[] fArr2 = eVar3.f13322b;
                if (i19 < fArr2.length) {
                    if (c12 != 'A') {
                        if (c12 != 'C') {
                            if (c12 == 'H') {
                                float[] fArr3 = fArr2;
                                i8 = i19;
                                c8 = c12;
                                i9 = i18;
                                i10 = length;
                                eVar = eVar3;
                                path2.lineTo(fArr3[i8], f31);
                                f30 = fArr3[i8];
                            } else if (c12 == 'Q') {
                                float[] fArr4 = fArr2;
                                i14 = i19;
                                c10 = c12;
                                i15 = i18;
                                i16 = length;
                                eVar = eVar3;
                                int i20 = i14 + 1;
                                int i21 = i14 + 2;
                                int i22 = i14 + 3;
                                path2.quadTo(fArr4[i14], fArr4[i20], fArr4[i21], fArr4[i22]);
                                f10 = fArr4[i14];
                                f11 = fArr4[i20];
                                f30 = fArr4[i21];
                                f31 = fArr4[i22];
                            } else if (c12 == 'V') {
                                float[] fArr5 = fArr2;
                                i8 = i19;
                                c8 = c12;
                                i9 = i18;
                                i10 = length;
                                eVar = eVar3;
                                path2.lineTo(f30, fArr5[i8]);
                                f31 = fArr5[i8];
                            } else if (c12 != 'a') {
                                if (c12 != 'c') {
                                    if (c12 == 'h') {
                                        float[] fArr6 = fArr2;
                                        i8 = i19;
                                        float f32 = f31;
                                        path2.rLineTo(fArr6[i8], 0.0f);
                                        f30 += fArr6[i8];
                                    } else if (c12 == 'q') {
                                        float[] fArr7 = fArr2;
                                        i8 = i19;
                                        float f33 = f31;
                                        float f34 = f30;
                                        int i23 = i8 + 1;
                                        int i24 = i8 + 2;
                                        int i25 = i8 + 3;
                                        path2.rQuadTo(fArr7[i8], fArr7[i23], fArr7[i24], fArr7[i25]);
                                        float f35 = f34 + fArr7[i8];
                                        float f36 = f34 + fArr7[i24];
                                        f31 = f33 + fArr7[i25];
                                        f25 = fArr7[i23] + f33;
                                        f24 = f35;
                                        c8 = c12;
                                        i9 = i18;
                                        i10 = length;
                                        f30 = f36;
                                    } else if (c12 == 'v') {
                                        float[] fArr8 = fArr2;
                                        i8 = i19;
                                        float f37 = f30;
                                        path2.rLineTo(0.0f, fArr8[i8]);
                                        f31 += fArr8[i8];
                                    } else if (c12 != 'L') {
                                        if (c12 == 'M') {
                                            float[] fArr9 = fArr2;
                                            i8 = i19;
                                            f30 = fArr9[i8];
                                            f31 = fArr9[i8 + 1];
                                            if (i8 > 0) {
                                                path2.lineTo(f30, f31);
                                            } else {
                                                path2.moveTo(f30, f31);
                                            }
                                        } else if (c12 != 'S') {
                                            if (c12 == 'T') {
                                                float[] fArr10 = fArr2;
                                                i17 = i19;
                                                float f38 = f31;
                                                float f39 = f30;
                                                if (c11 == 'q' || c11 == 't' || c11 == 'Q' || c11 == 'T') {
                                                    f12 = (f39 * 2.0f) - f24;
                                                    f13 = (f38 * 2.0f) - f25;
                                                } else {
                                                    f12 = f39;
                                                    f13 = f38;
                                                }
                                                int i26 = i17 + 1;
                                                path2.quadTo(f12, f13, fArr10[i17], fArr10[i26]);
                                                f14 = fArr10[i17];
                                                f15 = fArr10[i26];
                                            } else if (c12 == 'l') {
                                                float[] fArr11 = fArr2;
                                                i8 = i19;
                                                int i27 = i8 + 1;
                                                path2.rLineTo(fArr11[i8], fArr11[i27]);
                                                f30 += fArr11[i8];
                                                f31 += fArr11[i27];
                                            } else if (c12 == 'm') {
                                                float[] fArr12 = fArr2;
                                                i8 = i19;
                                                float f40 = fArr12[i8];
                                                f30 += f40;
                                                float f41 = fArr12[i8 + 1];
                                                f31 += f41;
                                                if (i8 > 0) {
                                                    path2.rLineTo(f40, f41);
                                                } else {
                                                    path2.rMoveTo(f40, f41);
                                                }
                                            } else if (c12 == 's') {
                                                if (c11 == 'c' || c11 == 's' || c11 == 'C' || c11 == 'S') {
                                                    float f42 = f30 - f24;
                                                    f19 = f31 - f25;
                                                    f18 = f42;
                                                } else {
                                                    f19 = 0.0f;
                                                    f18 = 0.0f;
                                                }
                                                float f43 = fArr2[i19];
                                                int i28 = i19 + 1;
                                                float f44 = fArr2[i28];
                                                int i29 = i19 + 2;
                                                int i30 = i19 + 3;
                                                float[] fArr13 = fArr2;
                                                i17 = i19;
                                                float f45 = f19;
                                                float f46 = f43;
                                                float f47 = f44;
                                                float f48 = f31;
                                                float f49 = f30;
                                                path.rCubicTo(f18, f45, f46, f47, fArr2[i29], fArr2[i30]);
                                                f12 = f49 + fArr13[i17];
                                                f13 = f48 + fArr13[i28];
                                                f14 = f49 + fArr13[i29];
                                                f15 = fArr13[i30] + f48;
                                            } else if (c12 != 't') {
                                                i8 = i19;
                                            } else {
                                                if (c11 == 'q' || c11 == 't' || c11 == 'Q' || c11 == 'T') {
                                                    f20 = f30 - f24;
                                                    f21 = f31 - f25;
                                                } else {
                                                    f21 = 0;
                                                    f20 = 0;
                                                }
                                                int i31 = i19 + 1;
                                                path2.rQuadTo(f20, f21, fArr2[i19], fArr2[i31]);
                                                float f50 = f20 + f30;
                                                float f51 = f21 + f31;
                                                f30 += fArr2[i19];
                                                f31 += fArr2[i31];
                                                f25 = f51;
                                                i8 = i19;
                                                c8 = c12;
                                                i9 = i18;
                                                i10 = length;
                                                f24 = f50;
                                            }
                                            f25 = f13;
                                            f24 = f12;
                                            c8 = c12;
                                            i9 = i18;
                                            i10 = length;
                                            f30 = f14;
                                            f31 = f15;
                                        } else {
                                            float[] fArr14 = fArr2;
                                            i8 = i19;
                                            float f52 = f31;
                                            float f53 = f30;
                                            if (c11 == 'c' || c11 == 's' || c11 == 'C' || c11 == 'S') {
                                                f16 = (f52 * 2.0f) - f25;
                                                f17 = (f53 * 2.0f) - f24;
                                            } else {
                                                f17 = f53;
                                                f16 = f52;
                                            }
                                            int i32 = i8 + 1;
                                            int i33 = i8 + 2;
                                            int i34 = i8 + 3;
                                            path.cubicTo(f17, f16, fArr14[i8], fArr14[i32], fArr14[i33], fArr14[i34]);
                                            float f54 = fArr14[i8];
                                            float f55 = fArr14[i32];
                                            f30 = fArr14[i33];
                                            f31 = fArr14[i34];
                                            f25 = f55;
                                            f24 = f54;
                                        }
                                        f29 = f31;
                                        f28 = f30;
                                    } else {
                                        float[] fArr15 = fArr2;
                                        i8 = i19;
                                        int i35 = i8 + 1;
                                        path2.lineTo(fArr15[i8], fArr15[i35]);
                                        f30 = fArr15[i8];
                                        f31 = fArr15[i35];
                                    }
                                    c8 = c12;
                                    i9 = i18;
                                    i10 = length;
                                } else {
                                    float[] fArr16 = fArr2;
                                    i17 = i19;
                                    float f56 = f31;
                                    float f57 = f30;
                                    int i36 = i17 + 2;
                                    int i37 = i17 + 3;
                                    int i38 = i17 + 4;
                                    int i39 = i17 + 5;
                                    path.rCubicTo(fArr16[i17], fArr16[i17 + 1], fArr16[i36], fArr16[i37], fArr16[i38], fArr16[i39]);
                                    f12 = f57 + fArr16[i36];
                                    f13 = f56 + fArr16[i37];
                                    f14 = f57 + fArr16[i38];
                                    f15 = fArr16[i39] + f56;
                                    f25 = f13;
                                    f24 = f12;
                                    c8 = c12;
                                    i9 = i18;
                                    i10 = length;
                                    f30 = f14;
                                    f31 = f15;
                                }
                                eVar = eVar3;
                            } else {
                                float[] fArr17 = fArr2;
                                i11 = i19;
                                float f58 = f31;
                                float f59 = f30;
                                int i40 = i11 + 5;
                                float f60 = fArr17[i40] + f59;
                                int i41 = i11 + 6;
                                float f61 = fArr17[i41] + f58;
                                float f62 = fArr17[i11];
                                float f63 = fArr17[i11 + 1];
                                float f64 = fArr17[i11 + 2];
                                if (fArr17[i11 + 3] != 0.0f) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                if (fArr17[i11 + 4] != 0.0f) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                c9 = c12;
                                float f65 = f64;
                                i13 = length;
                                eVar2 = eVar3;
                                i12 = i18;
                                C1199e.a(path, f59, f58, f60, f61, f62, f63, f65, z8, z9);
                                f8 = f59 + fArr17[i40];
                                f9 = f58 + fArr17[i41];
                            }
                            i19 = i8 + i;
                            C1199e[] eVarArr3 = eVarArr;
                            eVar3 = eVar;
                            length = i10;
                            c11 = c8;
                            c12 = c11;
                            i18 = i9;
                        } else {
                            float[] fArr18 = fArr2;
                            i14 = i19;
                            c10 = c12;
                            i15 = i18;
                            i16 = length;
                            eVar = eVar3;
                            int i42 = i14 + 2;
                            int i43 = i14 + 3;
                            int i44 = i14 + 4;
                            int i45 = i14 + 5;
                            path.cubicTo(fArr18[i14], fArr18[i14 + 1], fArr18[i42], fArr18[i43], fArr18[i44], fArr18[i45]);
                            f30 = fArr18[i44];
                            f31 = fArr18[i45];
                            f10 = fArr18[i42];
                            f11 = fArr18[i43];
                        }
                        f24 = f10;
                        f25 = f11;
                        i19 = i8 + i;
                        C1199e[] eVarArr32 = eVarArr;
                        eVar3 = eVar;
                        length = i10;
                        c11 = c8;
                        c12 = c11;
                        i18 = i9;
                    } else {
                        float[] fArr19 = fArr2;
                        i11 = i19;
                        float f66 = f31;
                        float f67 = f30;
                        c9 = c12;
                        i12 = i18;
                        i13 = length;
                        eVar2 = eVar3;
                        int i46 = i11 + 5;
                        float f68 = fArr19[i46];
                        int i47 = i11 + 6;
                        float f69 = fArr19[i47];
                        float f70 = fArr19[i11];
                        float f71 = fArr19[i11 + 1];
                        float f72 = fArr19[i11 + 2];
                        if (fArr19[i11 + 3] != 0.0f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (fArr19[i11 + 4] != 0.0f) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        C1199e.a(path, f67, f66, f68, f69, f70, f71, f72, z, z6);
                        f8 = fArr19[i46];
                        f9 = fArr19[i47];
                    }
                    f25 = f31;
                    f24 = f30;
                    i19 = i8 + i;
                    C1199e[] eVarArr322 = eVarArr;
                    eVar3 = eVar;
                    length = i10;
                    c11 = c8;
                    c12 = c11;
                    i18 = i9;
                } else {
                    fArr[0] = f30;
                    fArr[1] = f31;
                    fArr[2] = f24;
                    fArr[3] = f25;
                    fArr[4] = f28;
                    fArr[5] = f29;
                    c11 = eVar3.f13321a;
                    i18++;
                    eVarArr2 = eVarArr;
                    length = length;
                }
            }
        }
    }

    public static short D(g gVar, int i) {
        if ((i & 255) == i) {
            int i8 = gVar.f14462b.f14466a;
            if ((i8 & 255) == i8) {
                return (short) (i8 | (i << 8));
            }
            throw new IllegalArgumentException("opcode out of range 0..255");
        }
        throw new IllegalArgumentException("arg out of range 0..255");
    }

    public static final boolean E(String str) {
        f.e(str, "method");
        if (str.equals("GET") || str.equals("HEAD")) {
            return false;
        }
        return true;
    }

    public static final String F(Reader reader) {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int read = reader.read(cArr);
        while (read >= 0) {
            stringWriter.write(cArr, 0, read);
            read = reader.read(cArr);
        }
        String stringWriter2 = stringWriter.toString();
        f.d(stringWriter2, "toString(...)");
        return stringWriter2;
    }

    public static String G(l lVar) {
        int length = lVar.f16371V.length;
        StringBuilder sb = new StringBuilder((length * 5) + 2);
        sb.append('{');
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(((k) lVar.e(i)).g());
        }
        sb.append('}');
        return sb.toString();
    }

    public static String H(l lVar) {
        int i;
        int i8;
        int length = lVar.f16371V.length;
        StringBuilder sb = new StringBuilder(30);
        sb.append("{");
        if (length != 0) {
            if (length != 1) {
                k kVar = (k) lVar.e(length - 1);
                if (kVar.d() == 2 && (i = kVar.f15204U) != (i8 = i + 1)) {
                    kVar = k.e(i8, kVar.f15205V);
                }
                sb.append(((k) lVar.e(0)).g());
                sb.append("..");
                sb.append(kVar.g());
            } else {
                sb.append(((k) lVar.e(0)).g());
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public static int I(Context context, int i, int i8) {
        TypedValue B8 = b.B(context, i);
        if (B8 == null || B8.type != 16) {
            return i8;
        }
        return B8.data;
    }

    public static TimeInterpolator J(Context context, int i, Interpolator interpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type == 3) {
            String valueOf = String.valueOf(typedValue.string);
            if (!w(valueOf, "cubic-bezier") && !w(valueOf, "path")) {
                return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
            }
            if (w(valueOf, "cubic-bezier")) {
                String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
                if (split.length == 4) {
                    return new PathInterpolator(s(split, 0), s(split, 1), s(split, 2), s(split, 3));
                }
                throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
            } else if (w(valueOf, "path")) {
                return new PathInterpolator(m(valueOf.substring(5, valueOf.length() - 1)));
            } else {
                throw new IllegalArgumentException("Invalid motion easing type: ".concat(valueOf));
            }
        } else {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
    }

    public static long K(long j7, long j8) {
        boolean z;
        boolean z6;
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j8) + Long.numberOfLeadingZeros(j8) + Long.numberOfLeadingZeros(~j7) + Long.numberOfLeadingZeros(j7);
        if (numberOfLeadingZeros > 65) {
            return j7 * j8;
        }
        long j9 = ((j7 ^ j8) >>> 63) + Long.MAX_VALUE;
        boolean z8 = false;
        if (numberOfLeadingZeros < 64) {
            z = true;
        } else {
            z = false;
        }
        int i = (j7 > 0 ? 1 : (j7 == 0 ? 0 : -1));
        if (i < 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (j8 == Long.MIN_VALUE) {
            z8 = true;
        }
        if (z || (z8 & z6)) {
            return j9;
        }
        long j10 = j7 * j8;
        if (i == 0 || j10 / j7 == j8) {
            return j10;
        }
        return j9;
    }

    public static a L(c cVar, int i) {
        boolean z;
        f.e(cVar, "<this>");
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Integer valueOf = Integer.valueOf(i);
        if (z) {
            if (cVar.f5008W <= 0) {
                i = -i;
            }
            return new a(cVar.f5006U, cVar.f5007V, i);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
    }

    public static m M(List list, i iVar, e eVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(G.i.d(((N) it.next()).c()));
        }
        return d.i(new O(d.i(new G.g(new G.m(new ArrayList(arrayList), false, D7.b.l()), eVar, RangedBeacon.DEFAULT_MAX_TRACKING_AGE)), iVar, list, 0));
    }

    public static boolean N(int i) {
        if (i == (i & 255)) {
            return true;
        }
        return false;
    }

    public static boolean O(int i) {
        if (i == (i & 15)) {
            return true;
        }
        return false;
    }

    public static boolean P(int i) {
        if (i == (65535 & i)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [T6.c, T6.a] */
    public static c Q(int i, int i8) {
        if (i8 > Integer.MIN_VALUE) {
            return new a(i, i8 - 1, 1);
        }
        c cVar = c.f5013X;
        return c.f5013X;
    }

    public static String a(p2.k kVar) {
        int m8 = ((u) kVar).m();
        int i = 0;
        if (m8 == ((short) m8)) {
            char[] cArr = new char[5];
            if (m8 < 0) {
                cArr[0] = '-';
                m8 = -m8;
            } else {
                cArr[0] = '+';
            }
            while (i < 4) {
                cArr[4 - i] = Character.forDigit(m8 & 15, 16);
                m8 >>= 4;
                i++;
            }
            return new String(cArr);
        }
        char[] cArr2 = new char[9];
        if (m8 < 0) {
            cArr2[0] = '-';
            m8 = -m8;
        } else {
            cArr2[0] = '+';
        }
        while (i < 8) {
            cArr2[8 - i] = Character.forDigit(m8 & 15, 16);
            m8 >>= 4;
            i++;
        }
        return new String(cArr2);
    }

    public static String c(p2.k kVar) {
        int e = ((u) kVar).e.e();
        if (e == ((char) e)) {
            return b.P(e);
        }
        return b.Q(e);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [V6.d, F6.a, java.lang.Object] */
    public static final void d(View view) {
        f.e(view, "<this>");
        ? obj = new Object();
        C1512J j7 = new C1512J(view, obj);
        j7.f15883W = obj;
        obj.f5995X = j7;
        while (obj.hasNext()) {
            View view2 = (View) obj.next();
            A0.a aVar = (A0.a) view2.getTag(2131362386);
            if (aVar == null) {
                aVar = new A0.a();
                view2.setTag(2131362386, aVar);
            }
            ArrayList arrayList = aVar.f23a;
            int K4 = j.K(arrayList);
            if (-1 < K4) {
                arrayList.get(K4).getClass();
                throw new ClassCastException();
            }
        }
    }

    public static boolean e(C1199e[] eVarArr, C1199e[] eVarArr2) {
        if (eVarArr == null || eVarArr2 == null || eVarArr.length != eVarArr2.length) {
            return false;
        }
        for (int i = 0; i < eVarArr.length; i++) {
            C1199e eVar = eVarArr[i];
            char c8 = eVar.f13321a;
            C1199e eVar2 = eVarArr2[i];
            if (c8 != eVar2.f13321a || eVar.f13322b.length != eVar2.f13322b.length) {
                return false;
            }
        }
        return true;
    }

    public static long f(long j7, long j8) {
        boolean z;
        long j9 = j7 + j8;
        boolean z6 = false;
        if ((j7 ^ j8) < 0) {
            z = true;
        } else {
            z = false;
        }
        if ((j7 ^ j9) >= 0) {
            z6 = true;
        }
        if (z || z6) {
            return j9;
        }
        StringBuilder sb = new StringBuilder("overflow: checkedAdd(");
        sb.append(j7);
        sb.append(", ");
        throw new ArithmeticException(Q0.g.o(sb, j8, ")"));
    }

    public static short h(int i, int i8) {
        if ((i & 255) != i) {
            throw new IllegalArgumentException("low out of range 0..255");
        } else if ((i8 & 255) == i8) {
            return (short) (i | (i8 << 8));
        } else {
            throw new IllegalArgumentException("high out of range 0..255");
        }
    }

    public static int i(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static float[] k(float[] fArr, int i) {
        if (i >= 0) {
            int length = fArr.length;
            if (length >= 0) {
                int min = Math.min(i, length);
                float[] fArr2 = new float[i];
                System.arraycopy(fArr, 0, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0085, code lost:
        r13 = false;
        r15 = true;
        r16 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008f, code lost:
        r13 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0098 A[Catch:{ NumberFormatException -> 0x00ac }, LOOP:3: B:22:0x006a->B:41:0x0098, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0097 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static m0.C1199e[] l(java.lang.String r17) {
        /*
            r0 = r17
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r4 = 1
            r5 = 0
        L_0x000a:
            int r6 = r17.length()
            if (r4 >= r6) goto L_0x00e0
        L_0x0010:
            int r6 = r17.length()
            r7 = 69
            r8 = 101(0x65, float:1.42E-43)
            if (r4 >= r6) goto L_0x0036
            char r6 = r0.charAt(r4)
            int r9 = r6 + -65
            int r10 = r6 + -90
            int r10 = r10 * r9
            if (r10 <= 0) goto L_0x002e
            int r9 = r6 + -97
            int r10 = r6 + -122
            int r10 = r10 * r9
            if (r10 > 0) goto L_0x0033
        L_0x002e:
            if (r6 == r8) goto L_0x0033
            if (r6 == r7) goto L_0x0033
            goto L_0x0036
        L_0x0033:
            int r4 = r4 + 1
            goto L_0x0010
        L_0x0036:
            java.lang.String r5 = r0.substring(r5, r4)
            java.lang.String r5 = r5.trim()
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L_0x00d9
            char r6 = r5.charAt(r2)
            r9 = 122(0x7a, float:1.71E-43)
            if (r6 == r9) goto L_0x00cb
            char r6 = r5.charAt(r2)
            r9 = 90
            if (r6 != r9) goto L_0x0056
            goto L_0x00cb
        L_0x0056:
            int r6 = r5.length()     // Catch:{ NumberFormatException -> 0x00ac }
            float[] r6 = new float[r6]     // Catch:{ NumberFormatException -> 0x00ac }
            int r9 = r5.length()     // Catch:{ NumberFormatException -> 0x00ac }
            r10 = 1
            r11 = 0
        L_0x0062:
            if (r10 >= r9) goto L_0x00b6
            r12 = r10
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
        L_0x006a:
            int r3 = r5.length()     // Catch:{ NumberFormatException -> 0x00ac }
            if (r12 >= r3) goto L_0x009c
            char r3 = r5.charAt(r12)     // Catch:{ NumberFormatException -> 0x00ac }
            r2 = 32
            if (r3 == r2) goto L_0x0093
            if (r3 == r7) goto L_0x0091
            if (r3 == r8) goto L_0x0091
            switch(r3) {
                case 44: goto L_0x0093;
                case 45: goto L_0x008a;
                case 46: goto L_0x0080;
                default: goto L_0x007f;
            }     // Catch:{ NumberFormatException -> 0x00ac }
        L_0x007f:
            goto L_0x008f
        L_0x0080:
            if (r14 != 0) goto L_0x0085
            r13 = 0
            r14 = 1
            goto L_0x0095
        L_0x0085:
            r13 = 0
            r15 = 1
            r16 = 1
            goto L_0x0095
        L_0x008a:
            if (r12 == r10) goto L_0x008f
            if (r13 != 0) goto L_0x008f
            goto L_0x0085
        L_0x008f:
            r13 = 0
            goto L_0x0095
        L_0x0091:
            r13 = 1
            goto L_0x0095
        L_0x0093:
            r13 = 0
            r15 = 1
        L_0x0095:
            if (r15 == 0) goto L_0x0098
            goto L_0x009c
        L_0x0098:
            int r12 = r12 + 1
            r2 = 0
            goto L_0x006a
        L_0x009c:
            if (r10 >= r12) goto L_0x00ae
            int r2 = r11 + 1
            java.lang.String r3 = r5.substring(r10, r12)     // Catch:{ NumberFormatException -> 0x00ac }
            float r3 = java.lang.Float.parseFloat(r3)     // Catch:{ NumberFormatException -> 0x00ac }
            r6[r11] = r3     // Catch:{ NumberFormatException -> 0x00ac }
            r11 = r2
            goto L_0x00ae
        L_0x00ac:
            r0 = move-exception
            goto L_0x00bd
        L_0x00ae:
            if (r16 == 0) goto L_0x00b3
            r10 = r12
        L_0x00b1:
            r2 = 0
            goto L_0x0062
        L_0x00b3:
            int r10 = r12 + 1
            goto L_0x00b1
        L_0x00b6:
            float[] r2 = k(r6, r11)     // Catch:{ NumberFormatException -> 0x00ac }
            r3 = r2
            r2 = 0
            goto L_0x00cd
        L_0x00bd:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "error in parsing \""
            java.lang.String r3 = "\""
            java.lang.String r2 = N.e.y(r2, r5, r3)
            r1.<init>(r2, r0)
            throw r1
        L_0x00cb:
            float[] r3 = new float[r2]
        L_0x00cd:
            char r5 = r5.charAt(r2)
            m0.e r2 = new m0.e
            r2.<init>(r5, r3)
            r1.add(r2)
        L_0x00d9:
            int r2 = r4 + 1
            r5 = r4
            r4 = r2
            r2 = 0
            goto L_0x000a
        L_0x00e0:
            int r4 = r4 - r5
            r2 = 1
            if (r4 != r2) goto L_0x00fa
            int r2 = r17.length()
            if (r5 >= r2) goto L_0x00fa
            char r0 = r0.charAt(r5)
            r2 = 0
            float[] r3 = new float[r2]
            m0.e r4 = new m0.e
            r4.<init>(r0, r3)
            r1.add(r4)
            goto L_0x00fb
        L_0x00fa:
            r2 = 0
        L_0x00fb:
            m0.e[] r0 = new m0.C1199e[r2]
            java.lang.Object[] r0 = r1.toArray(r0)
            m0.e[] r0 = (m0.C1199e[]) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: B.C0003d.l(java.lang.String):m0.e[]");
    }

    public static Path m(String str) {
        Path path = new Path();
        try {
            A(l(str), path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing ".concat(str), e);
        }
    }

    public static C1199e[] n(C1199e[] eVarArr) {
        C1199e[] eVarArr2 = new C1199e[eVarArr.length];
        for (int i = 0; i < eVarArr.length; i++) {
            eVarArr2[i] = new C1199e(eVarArr[i]);
        }
        return eVarArr2;
    }

    public static long o(long j7, long j8, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j9 = j7 / j8;
        long j10 = j7 - (j8 * j9);
        int i = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (i == 0) {
            return j9;
        }
        int i8 = ((int) ((j7 ^ j8) >> 63)) | 1;
        switch (J3.e.f2504a[roundingMode.ordinal()]) {
            case 1:
                if (i == 0) {
                    return j9;
                }
                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
            case 2:
                return j9;
            case 3:
                if (i8 >= 0) {
                    return j9;
                }
                break;
            case 4:
                break;
            case 5:
                if (i8 <= 0) {
                    return j9;
                }
                break;
            case 6:
            case 7:
            case 8:
                long abs = Math.abs(j10);
                int i9 = ((abs - (Math.abs(j8) - abs)) > 0 ? 1 : ((abs - (Math.abs(j8) - abs)) == 0 ? 0 : -1));
                if (i9 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j9) == 0)) {
                        return j9;
                    }
                } else if (i9 <= 0) {
                    return j9;
                }
                break;
            default:
                throw new AssertionError();
        }
        return j9 + ((long) i8);
    }

    public static long p(long j7, long j8) {
        D7.b.e("a", j7);
        D7.b.e("b", j8);
        if (j7 == 0) {
            return j8;
        }
        if (j8 == 0) {
            return j7;
        }
        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j7);
        long j9 = j7 >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(j8);
        long j10 = j8 >> numberOfTrailingZeros2;
        while (j9 != j10) {
            long j11 = j9 - j10;
            long j12 = (j11 >> 63) & j11;
            long j13 = (j11 - j12) - j12;
            j10 += j12;
            j9 = j13 >> Long.numberOfTrailingZeros(j13);
        }
        return j9 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0257, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x051c, code lost:
        if ("gta8wifi".equalsIgnoreCase(r3) == false) goto L_0x0520;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x059a, code lost:
        if (r14.toLowerCase(r7).startsWith("sp") == false) goto L_0x059d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x05a9, code lost:
        if ("FIG-LX1".equalsIgnoreCase(r3) == false) goto L_0x05ac;
     */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x0529  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x0549  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x054b  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x0554  */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x058a  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x05b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static D.s0 q(v.k r14) {
        /*
            D.q0 r0 = D.q0.f941c
            r0.getClass()
            D.f0 r0 = r0.f942a     // Catch:{ ExecutionException -> 0x05db, InterruptedException -> 0x05d9 }
            G.k r0 = r0.f()     // Catch:{ ExecutionException -> 0x05db, InterruptedException -> 0x05d9 }
            java.lang.Object r0 = r0.get()     // Catch:{ ExecutionException -> 0x05db, InterruptedException -> 0x05d9 }
            D.p0 r0 = (D.p0) r0     // Catch:{ ExecutionException -> 0x05db, InterruptedException -> 0x05d9 }
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL
            java.lang.Object r3 = r14.a(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L_0x002b
            int r3 = r3.intValue()
            if (r3 != r4) goto L_0x002b
            r3 = 1
            goto L_0x002c
        L_0x002b:
            r3 = 0
        L_0x002c:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk> r7 = androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk.class
            boolean r3 = r0.a(r7, r3)
            if (r3 == 0) goto L_0x003c
            androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk r3 = new androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk
            r3.<init>(r14)
            r1.add(r3)
        L_0x003c:
            java.lang.Object r3 = r14.a(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L_0x0052
            int r3 = r3.intValue()
            if (r3 != r4) goto L_0x0052
            int r3 = android.os.Build.VERSION.SDK_INT
            r7 = 21
            if (r3 != r7) goto L_0x0052
            r3 = 1
            goto L_0x0053
        L_0x0052:
            r3 = 0
        L_0x0053:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk> r7 = androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk.class
            boolean r3 = r0.a(r7, r3)
            if (r3 == 0) goto L_0x0063
            androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk r3 = new androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk
            r3.<init>()
            r1.add(r3)
        L_0x0063:
            java.util.HashSet r3 = androidx.camera.camera2.internal.compat.quirk.JpegHalCorruptImageQuirk.f7632a
            java.lang.String r7 = android.os.Build.DEVICE
            java.util.Locale r8 = java.util.Locale.US
            java.lang.String r7 = r7.toLowerCase(r8)
            boolean r3 = r3.contains(r7)
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.JpegHalCorruptImageQuirk> r7 = androidx.camera.camera2.internal.compat.quirk.JpegHalCorruptImageQuirk.class
            boolean r3 = r0.a(r7, r3)
            if (r3 == 0) goto L_0x0081
            androidx.camera.camera2.internal.compat.quirk.JpegHalCorruptImageQuirk r3 = new androidx.camera.camera2.internal.compat.quirk.JpegHalCorruptImageQuirk
            r3.<init>()
            r1.add(r3)
        L_0x0081:
            java.util.HashSet r3 = androidx.camera.camera2.internal.compat.quirk.JpegCaptureDownsizingQuirk.f7631a
            java.lang.String r7 = android.os.Build.MODEL
            java.lang.String r9 = r7.toLowerCase(r8)
            boolean r3 = r3.contains(r9)
            if (r3 == 0) goto L_0x009f
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r3 = r14.a(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r3 != 0) goto L_0x009f
            r3 = 1
            goto L_0x00a0
        L_0x009f:
            r3 = 0
        L_0x00a0:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.JpegCaptureDownsizingQuirk> r9 = androidx.camera.camera2.internal.compat.quirk.JpegCaptureDownsizingQuirk.class
            boolean r3 = r0.a(r9, r3)
            if (r3 == 0) goto L_0x00b0
            androidx.camera.camera2.internal.compat.quirk.JpegCaptureDownsizingQuirk r3 = new androidx.camera.camera2.internal.compat.quirk.JpegCaptureDownsizingQuirk
            r3.<init>()
            r1.add(r3)
        L_0x00b0:
            java.lang.Object r3 = r14.a(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L_0x00c0
            int r3 = r3.intValue()
            if (r3 != r4) goto L_0x00c0
            r3 = 1
            goto L_0x00c1
        L_0x00c0:
            r3 = 0
        L_0x00c1:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk> r9 = androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk.class
            boolean r3 = r0.a(r9, r3)
            if (r3 == 0) goto L_0x00d4
            androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk r3 = new androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk
            r3.<init>()
            r14.b()
            r1.add(r3)
        L_0x00d4:
            java.lang.String r3 = android.os.Build.HARDWARE
            java.lang.String r9 = "samsungexynos7420"
            boolean r9 = r9.equalsIgnoreCase(r3)
            if (r9 != 0) goto L_0x00e6
            java.lang.String r9 = "universal7420"
            boolean r3 = r9.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x00f6
        L_0x00e6:
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r3 = r14.a(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r3 != r6) goto L_0x00f6
            r3 = 1
            goto L_0x00f7
        L_0x00f6:
            r3 = 0
        L_0x00f7:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk> r9 = androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk.class
            boolean r3 = r0.a(r9, r3)
            if (r3 == 0) goto L_0x0107
            androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk r3 = new androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk
            r3.<init>()
            r1.add(r3)
        L_0x0107:
            java.lang.Object r3 = r14.a(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 23
            if (r9 <= r10) goto L_0x011d
            if (r3 == 0) goto L_0x011d
            int r3 = r3.intValue()
            if (r3 != r4) goto L_0x011d
            r3 = 1
            goto L_0x011e
        L_0x011d:
            r3 = 0
        L_0x011e:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk> r11 = androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk.class
            boolean r3 = r0.a(r11, r3)
            if (r3 == 0) goto L_0x012e
            androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk r3 = new androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk
            r3.<init>()
            r1.add(r3)
        L_0x012e:
            r3 = 29
            if (r9 <= r10) goto L_0x0144
            if (r9 >= r3) goto L_0x0144
            java.lang.Object r2 = r14.a(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L_0x0144
            int r2 = r2.intValue()
            if (r2 != r4) goto L_0x0144
            r2 = 1
            goto L_0x0145
        L_0x0144:
            r2 = 0
        L_0x0145:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk> r9 = androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk.class
            boolean r2 = r0.a(r9, r2)
            if (r2 == 0) goto L_0x0155
            androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk r2 = new androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk
            r2.<init>()
            r1.add(r2)
        L_0x0155:
            java.util.List r2 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureWashedOutImageQuirk.f7626a
            java.lang.String r2 = r7.toUpperCase(r8)
            java.util.List r9 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureWashedOutImageQuirk.f7626a
            boolean r2 = r9.contains(r2)
            if (r2 == 0) goto L_0x0173
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r2 = r14.a(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 != r6) goto L_0x0173
            r2 = 1
            goto L_0x0174
        L_0x0173:
            r2 = 0
        L_0x0174:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.ImageCaptureWashedOutImageQuirk> r9 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureWashedOutImageQuirk.class
            boolean r2 = r0.a(r9, r2)
            if (r2 == 0) goto L_0x0184
            androidx.camera.camera2.internal.compat.quirk.ImageCaptureWashedOutImageQuirk r2 = new androidx.camera.camera2.internal.compat.quirk.ImageCaptureWashedOutImageQuirk
            r2.<init>()
            r1.add(r2)
        L_0x0184:
            java.util.List r2 = androidx.camera.camera2.internal.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk.f7612a
            java.lang.String r2 = r7.toUpperCase(r8)
            java.util.List r8 = androidx.camera.camera2.internal.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk.f7612a
            boolean r2 = r8.contains(r2)
            if (r2 == 0) goto L_0x01a2
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r2 = r14.a(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 != r6) goto L_0x01a2
            r2 = 1
            goto L_0x01a3
        L_0x01a2:
            r2 = 0
        L_0x01a3:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk> r8 = androidx.camera.camera2.internal.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk.class
            boolean r2 = r0.a(r8, r2)
            if (r2 == 0) goto L_0x01b3
            androidx.camera.camera2.internal.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk r2 = new androidx.camera.camera2.internal.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk
            r2.<init>()
            r1.add(r2)
        L_0x01b3:
            java.lang.String r2 = android.os.Build.BRAND
            java.lang.String r8 = "motorola"
            boolean r9 = r8.equalsIgnoreCase(r2)
            java.lang.String r10 = "samsung"
            if (r9 == 0) goto L_0x01c8
            java.lang.String r9 = "MotoG3"
            boolean r9 = r9.equalsIgnoreCase(r7)
            if (r9 == 0) goto L_0x01c8
            goto L_0x0214
        L_0x01c8:
            boolean r9 = r10.equalsIgnoreCase(r2)
            if (r9 == 0) goto L_0x01d7
            java.lang.String r9 = "SM-G532F"
            boolean r9 = r9.equalsIgnoreCase(r7)
            if (r9 == 0) goto L_0x01d7
            goto L_0x0214
        L_0x01d7:
            boolean r9 = r10.equalsIgnoreCase(r2)
            if (r9 == 0) goto L_0x01e6
            java.lang.String r9 = "SM-J700F"
            boolean r9 = r9.equalsIgnoreCase(r7)
            if (r9 == 0) goto L_0x01e6
            goto L_0x0214
        L_0x01e6:
            boolean r9 = r10.equalsIgnoreCase(r2)
            if (r9 == 0) goto L_0x01f5
            java.lang.String r9 = "SM-A920F"
            boolean r9 = r9.equalsIgnoreCase(r7)
            if (r9 == 0) goto L_0x01f5
            goto L_0x0214
        L_0x01f5:
            boolean r9 = r10.equalsIgnoreCase(r2)
            if (r9 == 0) goto L_0x0204
            java.lang.String r9 = "SM-J415F"
            boolean r9 = r9.equalsIgnoreCase(r7)
            if (r9 == 0) goto L_0x0204
            goto L_0x0214
        L_0x0204:
            java.lang.String r9 = "xiaomi"
            boolean r2 = r9.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x0216
            java.lang.String r2 = "Mi A1"
            boolean r2 = r2.equalsIgnoreCase(r7)
            if (r2 == 0) goto L_0x0216
        L_0x0214:
            r2 = 1
            goto L_0x0217
        L_0x0216:
            r2 = 0
        L_0x0217:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.YuvImageOnePixelShiftQuirk> r7 = androidx.camera.camera2.internal.compat.quirk.YuvImageOnePixelShiftQuirk.class
            boolean r2 = r0.a(r7, r2)
            if (r2 == 0) goto L_0x0227
            androidx.camera.camera2.internal.compat.quirk.YuvImageOnePixelShiftQuirk r2 = new androidx.camera.camera2.internal.compat.quirk.YuvImageOnePixelShiftQuirk
            r2.<init>()
            r1.add(r2)
        L_0x0227:
            java.util.List r2 = androidx.camera.camera2.internal.compat.quirk.FlashTooSlowQuirk.f7620a
            java.util.Iterator r2 = r2.iterator()
        L_0x022d:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x0257
            java.lang.Object r7 = r2.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r9 = android.os.Build.MODEL
            java.util.Locale r11 = java.util.Locale.US
            java.lang.String r9 = r9.toUpperCase(r11)
            boolean r7 = r9.startsWith(r7)
            if (r7 == 0) goto L_0x022d
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r2 = r14.a(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 != r6) goto L_0x0257
            r2 = 1
            goto L_0x0258
        L_0x0257:
            r2 = 0
        L_0x0258:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.FlashTooSlowQuirk> r7 = androidx.camera.camera2.internal.compat.quirk.FlashTooSlowQuirk.class
            boolean r2 = r0.a(r7, r2)
            if (r2 == 0) goto L_0x0268
            androidx.camera.camera2.internal.compat.quirk.FlashTooSlowQuirk r2 = new androidx.camera.camera2.internal.compat.quirk.FlashTooSlowQuirk
            r2.<init>()
            r1.add(r2)
        L_0x0268:
            java.lang.String r2 = android.os.Build.BRAND
            java.lang.String r7 = "SAMSUNG"
            boolean r2 = r2.equalsIgnoreCase(r7)
            if (r2 == 0) goto L_0x0288
            int r2 = android.os.Build.VERSION.SDK_INT
            r7 = 33
            if (r2 >= r7) goto L_0x0288
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r2 = r14.a(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 != 0) goto L_0x0288
            r2 = 1
            goto L_0x0289
        L_0x0288:
            r2 = 0
        L_0x0289:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk> r7 = androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk.class
            boolean r2 = r0.a(r7, r2)
            if (r2 == 0) goto L_0x0299
            androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk r2 = new androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk
            r2.<init>()
            r1.add(r2)
        L_0x0299:
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL
            java.lang.Object r7 = r14.a(r2)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L_0x02ab
            int r7 = r7.intValue()
            if (r7 != r4) goto L_0x02ab
            r7 = 1
            goto L_0x02ac
        L_0x02ab:
            r7 = 0
        L_0x02ac:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk> r9 = androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk.class
            boolean r7 = r0.a(r9, r7)
            if (r7 == 0) goto L_0x02bc
            androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk r7 = new androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk
            r7.<init>()
            r1.add(r7)
        L_0x02bc:
            java.lang.Object r7 = r14.a(r2)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L_0x02cc
            int r7 = r7.intValue()
            if (r7 != r4) goto L_0x02cc
            r7 = 1
            goto L_0x02cd
        L_0x02cc:
            r7 = 0
        L_0x02cd:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk> r9 = androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk.class
            boolean r7 = r0.a(r9, r7)
            if (r7 == 0) goto L_0x02dd
            androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk r7 = new androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk
            r7.<init>()
            r1.add(r7)
        L_0x02dd:
            java.lang.Object r7 = r14.a(r2)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L_0x02ed
            int r7 = r7.intValue()
            if (r7 != r4) goto L_0x02ed
            r7 = 1
            goto L_0x02ee
        L_0x02ed:
            r7 = 0
        L_0x02ee:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk> r9 = androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk.class
            boolean r7 = r0.a(r9, r7)
            if (r7 == 0) goto L_0x02fe
            androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk r7 = new androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk
            r7.<init>()
            r1.add(r7)
        L_0x02fe:
            java.util.List r7 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFlashNotFireQuirk.f7623a
            java.lang.String r7 = android.os.Build.MODEL
            java.util.Locale r9 = java.util.Locale.US
            java.lang.String r11 = r7.toLowerCase(r9)
            java.util.List r12 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFlashNotFireQuirk.f7624b
            boolean r11 = r12.contains(r11)
            if (r11 == 0) goto L_0x0320
            android.hardware.camera2.CameraCharacteristics$Key r11 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r11 = r14.a(r11)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            if (r11 != 0) goto L_0x0320
            r11 = 1
            goto L_0x0321
        L_0x0320:
            r11 = 0
        L_0x0321:
            java.util.List r12 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFlashNotFireQuirk.f7623a
            java.lang.String r13 = r7.toLowerCase(r9)
            boolean r12 = r12.contains(r13)
            if (r11 != 0) goto L_0x0332
            if (r12 == 0) goto L_0x0330
            goto L_0x0332
        L_0x0330:
            r11 = 0
            goto L_0x0333
        L_0x0332:
            r11 = 1
        L_0x0333:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.ImageCaptureFlashNotFireQuirk> r12 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFlashNotFireQuirk.class
            boolean r11 = r0.a(r12, r11)
            if (r11 == 0) goto L_0x0343
            androidx.camera.camera2.internal.compat.quirk.ImageCaptureFlashNotFireQuirk r11 = new androidx.camera.camera2.internal.compat.quirk.ImageCaptureFlashNotFireQuirk
            r11.<init>()
            r1.add(r11)
        L_0x0343:
            java.util.List r11 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk.f7627a
            java.lang.String r11 = r7.toLowerCase(r9)
            java.util.List r12 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk.f7627a
            boolean r11 = r12.contains(r11)
            if (r11 == 0) goto L_0x0361
            android.hardware.camera2.CameraCharacteristics$Key r11 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r11 = r14.a(r11)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            if (r11 != r6) goto L_0x0361
            r11 = 1
            goto L_0x0362
        L_0x0361:
            r11 = 0
        L_0x0362:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk> r12 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk.class
            boolean r11 = r0.a(r12, r11)
            if (r11 == 0) goto L_0x0372
            androidx.camera.camera2.internal.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk r11 = new androidx.camera.camera2.internal.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk
            r11.<init>()
            r1.add(r11)
        L_0x0372:
            java.util.List r11 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk.f7621a
            java.lang.String r7 = r7.toLowerCase(r9)
            java.util.List r9 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk.f7621a
            boolean r7 = r9.contains(r7)
            if (r7 == 0) goto L_0x0390
            android.hardware.camera2.CameraCharacteristics$Key r7 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r7 = r14.a(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r7 != 0) goto L_0x0390
            r7 = 1
            goto L_0x0391
        L_0x0390:
            r7 = 0
        L_0x0391:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk> r9 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk.class
            boolean r7 = r0.a(r9, r7)
            if (r7 == 0) goto L_0x03a1
            androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk r7 = new androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk
            r7.<init>()
            r1.add(r7)
        L_0x03a1:
            java.lang.Object r2 = r14.a(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L_0x03b1
            int r2 = r2.intValue()
            if (r2 != r4) goto L_0x03b1
            r2 = 1
            goto L_0x03b2
        L_0x03b1:
            r2 = 0
        L_0x03b2:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk> r4 = androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk.class
            boolean r2 = r0.a(r4, r2)
            if (r2 == 0) goto L_0x03c2
            androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk r2 = new androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk
            r2.<init>()
            r1.add(r2)
        L_0x03c2:
            java.util.List r2 = androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk.f7636a
            java.util.Iterator r2 = r2.iterator()
        L_0x03c8:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x03f2
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r7 = android.os.Build.MODEL
            java.util.Locale r9 = java.util.Locale.US
            java.lang.String r7 = r7.toUpperCase(r9)
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L_0x03c8
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r2 = r14.a(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 != 0) goto L_0x03f2
            r2 = 1
            goto L_0x03f3
        L_0x03f2:
            r2 = 0
        L_0x03f3:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk> r4 = androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk.class
            boolean r2 = r0.a(r4, r2)
            if (r2 == 0) goto L_0x0403
            androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk r2 = new androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk
            r2.<init>()
            r1.add(r2)
        L_0x0403:
            java.lang.String r2 = android.os.Build.MANUFACTURER
            java.lang.String r4 = "HUAWEI"
            boolean r7 = r4.equalsIgnoreCase(r2)
            if (r7 == 0) goto L_0x0418
            java.lang.String r7 = "HUAWEI ALE-L04"
            java.lang.String r9 = android.os.Build.MODEL
            boolean r7 = r7.equalsIgnoreCase(r9)
            if (r7 == 0) goto L_0x0418
            goto L_0x0470
        L_0x0418:
            java.lang.String r7 = "Samsung"
            boolean r9 = r7.equalsIgnoreCase(r2)
            if (r9 == 0) goto L_0x042b
            java.lang.String r9 = "sm-j320f"
            java.lang.String r11 = android.os.Build.MODEL
            boolean r9 = r9.equalsIgnoreCase(r11)
            if (r9 == 0) goto L_0x042b
            goto L_0x0470
        L_0x042b:
            boolean r9 = r7.equalsIgnoreCase(r2)
            if (r9 == 0) goto L_0x043c
            java.lang.String r9 = "sm-j700f"
            java.lang.String r11 = android.os.Build.MODEL
            boolean r9 = r9.equalsIgnoreCase(r11)
            if (r9 == 0) goto L_0x043c
            goto L_0x0470
        L_0x043c:
            boolean r9 = r7.equalsIgnoreCase(r2)
            if (r9 == 0) goto L_0x044d
            java.lang.String r9 = "sm-j111f"
            java.lang.String r11 = android.os.Build.MODEL
            boolean r9 = r9.equalsIgnoreCase(r11)
            if (r9 == 0) goto L_0x044d
            goto L_0x0470
        L_0x044d:
            java.lang.String r9 = "OPPO"
            boolean r9 = r9.equalsIgnoreCase(r2)
            if (r9 == 0) goto L_0x0460
            java.lang.String r9 = "A37F"
            java.lang.String r11 = android.os.Build.MODEL
            boolean r9 = r9.equalsIgnoreCase(r11)
            if (r9 == 0) goto L_0x0460
            goto L_0x0470
        L_0x0460:
            boolean r7 = r7.equalsIgnoreCase(r2)
            if (r7 == 0) goto L_0x0472
            java.lang.String r7 = "sm-j510fn"
            java.lang.String r9 = android.os.Build.MODEL
            boolean r7 = r7.equalsIgnoreCase(r9)
            if (r7 == 0) goto L_0x0472
        L_0x0470:
            r7 = 1
            goto L_0x0473
        L_0x0472:
            r7 = 0
        L_0x0473:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.PreviewStretchWhenVideoCaptureIsBoundQuirk> r9 = androidx.camera.camera2.internal.compat.quirk.PreviewStretchWhenVideoCaptureIsBoundQuirk.class
            boolean r7 = r0.a(r9, r7)
            if (r7 == 0) goto L_0x0483
            androidx.camera.camera2.internal.compat.quirk.PreviewStretchWhenVideoCaptureIsBoundQuirk r7 = new androidx.camera.camera2.internal.compat.quirk.PreviewStretchWhenVideoCaptureIsBoundQuirk
            r7.<init>()
            r1.add(r7)
        L_0x0483:
            java.lang.String r7 = "Huawei"
            boolean r2 = r7.equalsIgnoreCase(r2)
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk> r7 = androidx.camera.camera2.internal.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk.class
            boolean r2 = r0.a(r7, r2)
            if (r2 == 0) goto L_0x0499
            androidx.camera.camera2.internal.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk r2 = new androidx.camera.camera2.internal.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk
            r2.<init>()
            r1.add(r2)
        L_0x0499:
            java.lang.String r2 = android.os.Build.BRAND
            java.lang.String r7 = "blu"
            boolean r7 = r7.equalsIgnoreCase(r2)
            java.lang.String r9 = "itel"
            if (r7 == 0) goto L_0x04b1
            java.lang.String r7 = "studio x10"
            java.lang.String r11 = android.os.Build.MODEL
            boolean r7 = r7.equalsIgnoreCase(r11)
            if (r7 == 0) goto L_0x04b1
            goto L_0x051e
        L_0x04b1:
            boolean r7 = r9.equalsIgnoreCase(r2)
            if (r7 == 0) goto L_0x04c2
            java.lang.String r7 = "itel w6004"
            java.lang.String r11 = android.os.Build.MODEL
            boolean r7 = r7.equalsIgnoreCase(r11)
            if (r7 == 0) goto L_0x04c2
            goto L_0x051e
        L_0x04c2:
            java.lang.String r7 = "vivo"
            boolean r7 = r7.equalsIgnoreCase(r2)
            if (r7 == 0) goto L_0x04d5
            java.lang.String r7 = "vivo 1805"
            java.lang.String r11 = android.os.Build.MODEL
            boolean r7 = r7.equalsIgnoreCase(r11)
            if (r7 == 0) goto L_0x04d5
            goto L_0x051e
        L_0x04d5:
            java.lang.String r7 = "positivo"
            boolean r7 = r7.equalsIgnoreCase(r2)
            if (r7 == 0) goto L_0x04e8
            java.lang.String r7 = "twist 2 pro"
            java.lang.String r11 = android.os.Build.MODEL
            boolean r7 = r7.equalsIgnoreCase(r11)
            if (r7 == 0) goto L_0x04e8
            goto L_0x051e
        L_0x04e8:
            java.lang.String r7 = android.os.Build.MODEL
            java.lang.String r11 = "pixel 4 xl"
            boolean r11 = r11.equalsIgnoreCase(r7)
            if (r11 == 0) goto L_0x04f7
            int r11 = android.os.Build.VERSION.SDK_INT
            if (r11 != r3) goto L_0x04f7
            goto L_0x051e
        L_0x04f7:
            boolean r3 = r8.equalsIgnoreCase(r2)
            if (r3 == 0) goto L_0x0506
            java.lang.String r3 = "moto e13"
            boolean r3 = r3.equalsIgnoreCase(r7)
            if (r3 == 0) goto L_0x0506
            goto L_0x051e
        L_0x0506:
            boolean r3 = r10.equalsIgnoreCase(r2)
            if (r3 == 0) goto L_0x0520
            java.lang.String r3 = android.os.Build.DEVICE
            java.lang.String r7 = "gta8"
            boolean r7 = r7.equalsIgnoreCase(r3)
            if (r7 != 0) goto L_0x051e
            java.lang.String r7 = "gta8wifi"
            boolean r3 = r7.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0520
        L_0x051e:
            r3 = 1
            goto L_0x0521
        L_0x0520:
            r3 = 0
        L_0x0521:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk> r7 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.class
            boolean r3 = r0.a(r7, r3)
            if (r3 == 0) goto L_0x0531
            androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk r3 = new androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk
            r3.<init>()
            r1.add(r3)
        L_0x0531:
            java.lang.String r3 = android.os.Build.MODEL
            java.lang.String r7 = "Pixel 8"
            boolean r7 = r7.equalsIgnoreCase(r3)
            if (r7 == 0) goto L_0x054b
            android.hardware.camera2.CameraCharacteristics$Key r7 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r14 = r14.a(r7)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            if (r14 != 0) goto L_0x054b
            r14 = 1
            goto L_0x054c
        L_0x054b:
            r14 = 0
        L_0x054c:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.TemporalNoiseQuirk> r7 = androidx.camera.camera2.internal.compat.quirk.TemporalNoiseQuirk.class
            boolean r14 = r0.a(r7, r14)
            if (r14 == 0) goto L_0x055c
            androidx.camera.camera2.internal.compat.quirk.TemporalNoiseQuirk r14 = new androidx.camera.camera2.internal.compat.quirk.TemporalNoiseQuirk
            r14.<init>()
            r1.add(r14)
        L_0x055c:
            java.util.HashSet r14 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk.f7622a
            java.util.Locale r7 = java.util.Locale.US
            java.lang.String r8 = r3.toLowerCase(r7)
            boolean r14 = r14.contains(r8)
            if (r14 != 0) goto L_0x05ab
            int r14 = android.os.Build.VERSION.SDK_INT
            r8 = 31
            if (r14 < r8) goto L_0x057c
            java.lang.String r14 = "Spreadtrum"
            java.lang.String r8 = android.os.Build.SOC_MANUFACTURER
            boolean r14 = r14.equalsIgnoreCase(r8)
            if (r14 != 0) goto L_0x05ab
        L_0x057c:
            java.lang.String r14 = android.os.Build.HARDWARE
            java.lang.String r8 = r14.toLowerCase(r7)
            java.lang.String r10 = "ums"
            boolean r8 = r8.startsWith(r10)
            if (r8 != 0) goto L_0x05ab
            boolean r8 = r9.equalsIgnoreCase(r2)
            if (r8 == 0) goto L_0x059d
            java.lang.String r14 = r14.toLowerCase(r7)
            java.lang.String r7 = "sp"
            boolean r14 = r14.startsWith(r7)
            if (r14 == 0) goto L_0x059d
            goto L_0x05ab
        L_0x059d:
            boolean r14 = r4.equalsIgnoreCase(r2)
            if (r14 == 0) goto L_0x05ac
            java.lang.String r14 = "FIG-LX1"
            boolean r14 = r14.equalsIgnoreCase(r3)
            if (r14 == 0) goto L_0x05ac
        L_0x05ab:
            r5 = 1
        L_0x05ac:
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk> r14 = androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk.class
            boolean r14 = r0.a(r14, r5)
            if (r14 == 0) goto L_0x05bc
            androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk r14 = new androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk
            r14.<init>()
            r1.add(r14)
        L_0x05bc:
            D.s0 r14 = new D.s0
            r14.<init>((java.util.List) r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "camera2 CameraQuirks = "
            r0.<init>(r1)
            java.lang.String r1 = D.s0.o(r14)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "CameraQuirks"
            F.h.j(r1, r0)
            return r14
        L_0x05d9:
            r14 = move-exception
            goto L_0x05dc
        L_0x05db:
            r14 = move-exception
        L_0x05dc:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "Unexpected error in QuirkSettings StateObservable"
            r0.<init>(r1, r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: B.C0003d.q(v.k):D.s0");
    }

    public static Drawable r(Context context, int i) {
        return O0.d().f(context, i);
    }

    public static float s(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static boolean w(String str, String str2) {
        if (!str.startsWith(str2.concat("(")) || !str.endsWith(")")) {
            return false;
        }
        return true;
    }

    public static String x(n nVar, int i) {
        long j7;
        StringBuilder sb = new StringBuilder(20);
        sb.append("#");
        if (nVar instanceof u2.m) {
            j7 = ((u2.m) nVar).f15757U;
        } else {
            j7 = (long) nVar.g();
        }
        if (i == 4) {
            sb.append(new String(new char[]{Character.forDigit(((int) j7) & 15, 16)}));
        } else if (i == 8) {
            sb.append(b.O((int) j7));
        } else if (i == 16) {
            sb.append(b.P((int) j7));
        } else if (i == 32) {
            sb.append(b.Q((int) j7));
        } else if (i == 64) {
            sb.append(b.R(j7));
        } else {
            throw new RuntimeException("shouldn't happen");
        }
        return sb.toString();
    }

    public static String y(n nVar) {
        StringBuilder sb = new StringBuilder(100);
        sb.append('#');
        if (nVar instanceof u2.k) {
            sb.append("null");
        } else {
            sb.append(nVar.e());
            sb.append(' ');
            sb.append(nVar.a());
        }
        return sb.toString();
    }

    public static int z(int i, int i8) {
        if ((i & 15) != i) {
            throw new IllegalArgumentException("low out of range 0..15");
        } else if ((i8 & 15) == i8) {
            return i | (i8 << 4);
        } else {
            throw new IllegalArgumentException("high out of range 0..15");
        }
    }

    public abstract void B(Throwable th);

    public abstract void C(q qVar);

    public abstract void R(C1627b bVar, p2.k kVar);

    public boolean b(u uVar) {
        return this instanceof q2.b;
    }

    public abstract int g();

    public BitSet j(g gVar) {
        return new BitSet();
    }

    public abstract String t(p2.k kVar);

    public abstract String u(p2.k kVar);

    public abstract boolean v(g gVar);
}
