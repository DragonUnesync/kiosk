package K1;

import B.Y;
import D.C0069x;
import F.h;
import N1.f;
import P0.l;
import P0.w;
import P0.z;
import V1.C;
import V1.C0347f;
import V1.E;
import V1.F;
import V1.G;
import V1.H;
import android.opengl.GLES20;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.bumptech.glide.d;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import n2.a;
import p1.q;
import u.C1481v;
import v.C1502a;
import v.r;

public final class k implements C {

    /* renamed from: U  reason: collision with root package name */
    public int f2580U;

    /* renamed from: V  reason: collision with root package name */
    public final Object f2581V;

    /* renamed from: W  reason: collision with root package name */
    public Object f2582W;

    /* renamed from: X  reason: collision with root package name */
    public Cloneable f2583X;

    /* renamed from: Y  reason: collision with root package name */
    public Object f2584Y;

    public k(r rVar) {
        this.f2580U = 0;
        this.f2582W = new HashMap();
        this.f2584Y = new HashSet();
        this.f2581V = new ArrayList();
        this.f2583X = new ArrayList();
        Set<Set> hashSet = new HashSet<>();
        try {
            hashSet = rVar.f15868a.e();
        } catch (C1502a unused) {
            h.l("Camera2CameraCoordinator", "Failed to get concurrent camera ids");
        }
        for (Set arrayList : hashSet) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            if (arrayList2.size() >= 2) {
                String str = (String) arrayList2.get(0);
                String str2 = (String) arrayList2.get(1);
                try {
                    if (d.j(str, rVar) && d.j(str2, rVar)) {
                        ((HashSet) this.f2584Y).add(new HashSet(Arrays.asList(new String[]{str, str2})));
                        HashMap hashMap = (HashMap) this.f2582W;
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, new ArrayList());
                        }
                        if (!hashMap.containsKey(str2)) {
                            hashMap.put(str2, new ArrayList());
                        }
                        ((List) hashMap.get(str)).add((String) arrayList2.get(1));
                        ((List) hashMap.get(str2)).add((String) arrayList2.get(0));
                    }
                } catch (Y unused2) {
                    h.j("Camera2CameraCoordinator", "Concurrent camera id pair: (" + str + ", " + str2 + ") is not backward compatible");
                }
            }
        }
    }

    public static void a(int i, int i8, String str) {
        int glCreateShader = GLES20.glCreateShader(i8);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        boolean z = false;
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 1) {
            z = true;
        }
        l.f(GLES20.glGetShaderInfoLog(glCreateShader) + ", source: \n" + str, z);
        GLES20.glAttachShader(i, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        l.e();
    }

    public void b(w wVar, q qVar, G g8) {
    }

    public void c() {
        if (((p2.d) this.f2582W) == null) {
            B3.q qVar = (B3.q) this.f2581V;
            qVar.C();
            this.f2582W = (p2.d) qVar.f451W;
        }
    }

    public int d(String str) {
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.f2580U, str);
        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        l.e();
        return glGetAttribLocation;
    }

    public void e(P0.r rVar) {
        w wVar;
        SparseBooleanArray sparseBooleanArray;
        SparseArray sparseArray;
        int i;
        int i8;
        w wVar2;
        int i9;
        H h5;
        int i10;
        int i11;
        int i12;
        SparseArray sparseArray2;
        P0.r rVar2 = rVar;
        if (rVar.v() == 2) {
            E e = (E) this.f2584Y;
            int i13 = e.f5694a;
            int i14 = 0;
            List list = e.f5696c;
            if (i13 == 1 || i13 == 2 || e.f5705n == 1) {
                wVar = (w) list.get(0);
            } else {
                wVar = new w(((w) list.get(0)).d());
                list.add(wVar);
            }
            if ((rVar.v() & 128) != 0) {
                rVar2.I(1);
                int B8 = rVar.B();
                int i15 = 3;
                rVar2.I(3);
                f fVar = (f) this.f2581V;
                rVar2.g(fVar.f3344b, 0, 2);
                fVar.r(0);
                fVar.u(3);
                e.f5711t = fVar.i(13);
                rVar2.g(fVar.f3344b, 0, 2);
                fVar.r(0);
                fVar.u(4);
                rVar2.I(fVar.i(12));
                C0347f fVar2 = e.f5698f;
                int i16 = e.f5694a;
                if (i16 == 2 && e.f5709r == null) {
                    H a8 = fVar2.a(21, new P0.q(21, (String) null, 0, (ArrayList) null, z.f3752f));
                    e.f5709r = a8;
                    if (a8 != null) {
                        a8.b(wVar, e.f5704m, new G(B8, 21, 8192));
                    }
                }
                SparseArray sparseArray3 = (SparseArray) this.f2582W;
                sparseArray3.clear();
                SparseIntArray sparseIntArray = (SparseIntArray) this.f2583X;
                sparseIntArray.clear();
                int a9 = rVar.a();
                while (true) {
                    sparseBooleanArray = e.i;
                    if (a9 <= 0) {
                        break;
                    }
                    rVar2.g(fVar.f3344b, i14, 5);
                    fVar.r(i14);
                    int i17 = fVar.i(8);
                    fVar.u(i15);
                    int i18 = fVar.i(13);
                    fVar.u(4);
                    int i19 = fVar.i(12);
                    int i20 = rVar2.f3733b;
                    int i21 = i20 + i19;
                    int i22 = -1;
                    String str = null;
                    ArrayList arrayList = null;
                    int i23 = 0;
                    f fVar3 = fVar;
                    while (rVar2.f3733b < i21) {
                        int v4 = rVar.v();
                        int v8 = rVar2.f3733b + rVar.v();
                        if (v8 > i21) {
                            break;
                        }
                        w wVar3 = wVar;
                        if (v4 == 5) {
                            long x8 = rVar.x();
                            if (x8 == 1094921523) {
                                i22 = 129;
                            } else if (x8 == 1161904947) {
                                i22 = 135;
                            } else if (x8 != 1094921524) {
                                if (x8 == 1212503619) {
                                    i22 = 36;
                                }
                            }
                            sparseArray2 = sparseArray3;
                            i12 = B8;
                            i11 = i18;
                            rVar2.I(v8 - rVar2.f3733b);
                            sparseArray3 = sparseArray2;
                            wVar = wVar3;
                            B8 = i12;
                            i18 = i11;
                        } else {
                            if (v4 == 106) {
                                sparseArray2 = sparseArray3;
                                i12 = B8;
                                i11 = i18;
                                i22 = 129;
                            } else if (v4 == 122) {
                                sparseArray2 = sparseArray3;
                                i12 = B8;
                                i11 = i18;
                                i22 = 135;
                            } else if (v4 == 127) {
                                int v9 = rVar.v();
                                if (v9 != 21) {
                                    if (v9 == 14) {
                                        i22 = 136;
                                    } else if (v9 == 33) {
                                        i22 = 139;
                                    }
                                    sparseArray2 = sparseArray3;
                                    i12 = B8;
                                    i11 = i18;
                                }
                            } else if (v4 == 123) {
                                sparseArray2 = sparseArray3;
                                i12 = B8;
                                i11 = i18;
                                i22 = 138;
                            } else if (v4 == 10) {
                                String trim = rVar2.t(3, StandardCharsets.UTF_8).trim();
                                i23 = rVar.v();
                                sparseArray2 = sparseArray3;
                                str = trim;
                                i12 = B8;
                                i11 = i18;
                            } else if (v4 == 89) {
                                ArrayList arrayList2 = new ArrayList();
                                while (rVar2.f3733b < v8) {
                                    String trim2 = rVar2.t(3, StandardCharsets.UTF_8).trim();
                                    rVar.v();
                                    SparseArray sparseArray4 = sparseArray3;
                                    byte[] bArr = new byte[4];
                                    rVar2.g(bArr, 0, 4);
                                    arrayList2.add(new F(trim2, bArr));
                                    sparseArray3 = sparseArray4;
                                    B8 = B8;
                                    i18 = i18;
                                }
                                sparseArray2 = sparseArray3;
                                i12 = B8;
                                i11 = i18;
                                arrayList = arrayList2;
                                i22 = 89;
                            } else {
                                sparseArray2 = sparseArray3;
                                i12 = B8;
                                i11 = i18;
                                if (v4 == 111) {
                                    i22 = 257;
                                }
                            }
                            rVar2.I(v8 - rVar2.f3733b);
                            sparseArray3 = sparseArray2;
                            wVar = wVar3;
                            B8 = i12;
                            i18 = i11;
                        }
                        i22 = 172;
                        sparseArray2 = sparseArray3;
                        i12 = B8;
                        i11 = i18;
                        rVar2.I(v8 - rVar2.f3733b);
                        sparseArray3 = sparseArray2;
                        wVar = wVar3;
                        B8 = i12;
                        i18 = i11;
                    }
                    SparseArray sparseArray5 = sparseArray3;
                    w wVar4 = wVar;
                    int i24 = B8;
                    int i25 = i18;
                    rVar2.H(i21);
                    P0.q qVar = new P0.q(i22, str, i23, arrayList, Arrays.copyOfRange(rVar2.f3732a, i20, i21));
                    if (i17 == 6 || i17 == 5) {
                        i17 = i22;
                    }
                    a9 -= i19 + 5;
                    if (i16 == 2) {
                        i9 = i17;
                    } else {
                        i9 = i25;
                    }
                    if (sparseBooleanArray.get(i9)) {
                        sparseArray3 = sparseArray5;
                    } else {
                        if (i16 == 2 && i17 == 21) {
                            h5 = e.f5709r;
                        } else {
                            h5 = fVar2.a(i17, qVar);
                        }
                        if (i16 == 2) {
                            i10 = i25;
                            if (i10 >= sparseIntArray.get(i9, 8192)) {
                                sparseArray3 = sparseArray5;
                            }
                        } else {
                            i10 = i25;
                        }
                        sparseIntArray.put(i9, i10);
                        sparseArray3 = sparseArray5;
                        sparseArray3.put(i9, h5);
                    }
                    fVar = fVar3;
                    wVar = wVar4;
                    B8 = i24;
                    i14 = 0;
                    i15 = 3;
                }
                w wVar5 = wVar;
                int i26 = B8;
                int size = sparseIntArray.size();
                int i27 = 0;
                while (true) {
                    sparseArray = e.f5700h;
                    if (i27 >= size) {
                        break;
                    }
                    int keyAt = sparseIntArray.keyAt(i27);
                    int valueAt = sparseIntArray.valueAt(i27);
                    sparseBooleanArray.put(keyAt, true);
                    e.f5701j.put(valueAt, true);
                    H h8 = (H) sparseArray3.valueAt(i27);
                    if (h8 != null) {
                        if (h8 != e.f5709r) {
                            q qVar2 = e.f5704m;
                            i8 = i26;
                            G g8 = new G(i8, keyAt, 8192);
                            wVar2 = wVar5;
                            h8.b(wVar2, qVar2, g8);
                        } else {
                            wVar2 = wVar5;
                            i8 = i26;
                        }
                        sparseArray.put(valueAt, h8);
                    } else {
                        wVar2 = wVar5;
                        i8 = i26;
                    }
                    i27++;
                    wVar5 = wVar2;
                    i26 = i8;
                }
                if (i16 == 2) {
                    if (!e.f5706o) {
                        e.f5704m.g();
                        e.f5705n = 0;
                        e.f5706o = true;
                    }
                    return;
                }
                sparseArray.remove(this.f2580U);
                if (i16 == 1) {
                    i = 0;
                } else {
                    i = e.f5705n - 1;
                }
                e.f5705n = i;
                if (i == 0) {
                    e.f5704m.g();
                    e.f5706o = true;
                }
            }
        }
    }

    public String f(String str) {
        HashMap hashMap = (HashMap) this.f2582W;
        if (!hashMap.containsKey(str)) {
            return null;
        }
        for (String str2 : (List) hashMap.get(str)) {
            Iterator it = ((ArrayList) this.f2583X).iterator();
            while (true) {
                if (it.hasNext()) {
                    C0069x h5 = ((C0069x) it.next()).h();
                    a.h("CameraInfo doesn't contain Camera2 implementation.", h5 instanceof C1481v);
                    if (str2.equals(((C1481v) ((C1481v) h5).f15722c.f17V).f15720a)) {
                        return str2;
                    }
                }
            }
        }
        return null;
    }

    public k(B3.q qVar) {
        this.f2581V = qVar;
        this.f2582W = null;
        this.f2583X = null;
        this.f2580U = 0;
        this.f2584Y = null;
    }

    public k(String str, String str2) {
        byte[] bArr;
        byte[] bArr2;
        int glCreateProgram = GLES20.glCreateProgram();
        this.f2580U = glCreateProgram;
        l.e();
        a(glCreateProgram, 35633, str);
        a(glCreateProgram, 35632, str2);
        GLES20.glLinkProgram(glCreateProgram);
        int i = 0;
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        int i8 = 1;
        boolean z = iArr[0] == 1;
        l.f("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(glCreateProgram), z);
        GLES20.glUseProgram(glCreateProgram);
        this.f2583X = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35721, iArr2, 0);
        this.f2581V = new i[iArr2[0]];
        int i9 = 0;
        while (i9 < iArr2[0]) {
            int i10 = this.f2580U;
            int[] iArr3 = new int[i8];
            GLES20.glGetProgramiv(i10, 35722, iArr3, 0);
            int i11 = iArr3[0];
            int[] iArr4 = new int[i8];
            int[] iArr5 = new int[i8];
            int[] iArr6 = new int[i8];
            byte[] bArr3 = new byte[i11];
            int i12 = i11;
            int i13 = i10;
            GLES20.glGetActiveAttrib(i10, i9, i11, iArr4, 0, iArr5, 0, iArr6, 0, bArr3, 0);
            int i14 = 0;
            while (true) {
                if (i14 >= i12) {
                    bArr2 = bArr3;
                    i14 = i12;
                    break;
                }
                bArr2 = bArr3;
                if (bArr2[i14] == 0) {
                    break;
                }
                i14++;
                bArr3 = bArr2;
            }
            String str3 = new String(bArr2, 0, i14);
            GLES20.glGetAttribLocation(i13, str3);
            i iVar = new i(13);
            ((i[]) this.f2581V)[i9] = iVar;
            ((HashMap) this.f2583X).put(str3, iVar);
            i9++;
            i8 = 1;
        }
        this.f2584Y = new HashMap();
        int[] iArr7 = new int[1];
        GLES20.glGetProgramiv(this.f2580U, 35718, iArr7, 0);
        this.f2582W = new i[iArr7[0]];
        for (int i15 = 0; i15 < iArr7[i]; i15++) {
            int i16 = this.f2580U;
            int[] iArr8 = new int[1];
            GLES20.glGetProgramiv(i16, 35719, iArr8, i);
            int i17 = iArr8[i];
            byte[] bArr4 = new byte[i17];
            int i18 = i17;
            GLES20.glGetActiveUniform(i16, i15, i17, new int[1], 0, new int[1], 0, new int[1], 0, bArr4, 0);
            int i19 = 0;
            while (true) {
                if (i19 >= i18) {
                    bArr = bArr4;
                    i19 = i18;
                    break;
                }
                bArr = bArr4;
                if (bArr[i19] == 0) {
                    break;
                }
                i19++;
                bArr4 = bArr;
            }
            i = 0;
            String str4 = new String(bArr, 0, i19);
            GLES20.glGetUniformLocation(i16, str4);
            i iVar2 = new i(14);
            ((i[]) this.f2582W)[i15] = iVar2;
            ((HashMap) this.f2584Y).put(str4, iVar2);
        }
        l.e();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Cloneable, byte[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public k(T3.a r1, k2.C1160q r2, byte[] r3, K.b[] r4, int r5) {
        /*
            r0 = this;
            r0.<init>()
            r0.f2581V = r1
            r0.f2582W = r2
            r0.f2583X = r3
            r0.f2584Y = r4
            r0.f2580U = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.k.<init>(T3.a, k2.q, byte[], K.b[], int):void");
    }

    public k(E e, int i) {
        this.f2584Y = e;
        this.f2581V = new f(5, new byte[5]);
        this.f2582W = new SparseArray();
        this.f2583X = new SparseIntArray();
        this.f2580U = i;
    }
}
