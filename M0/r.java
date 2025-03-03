package M0;

import H3.C0103u;
import H3.O;
import N.e;
import P0.l;
import P0.z;
import Q0.g;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

public final class r {

    /* renamed from: A  reason: collision with root package name */
    public final int f3012A;

    /* renamed from: B  reason: collision with root package name */
    public final C0121i f3013B;

    /* renamed from: C  reason: collision with root package name */
    public final int f3014C;

    /* renamed from: D  reason: collision with root package name */
    public final int f3015D;

    /* renamed from: E  reason: collision with root package name */
    public final int f3016E;

    /* renamed from: F  reason: collision with root package name */
    public final int f3017F;

    /* renamed from: G  reason: collision with root package name */
    public final int f3018G;

    /* renamed from: H  reason: collision with root package name */
    public final int f3019H;

    /* renamed from: I  reason: collision with root package name */
    public final int f3020I;

    /* renamed from: J  reason: collision with root package name */
    public final int f3021J;

    /* renamed from: K  reason: collision with root package name */
    public final int f3022K;

    /* renamed from: L  reason: collision with root package name */
    public final int f3023L;

    /* renamed from: M  reason: collision with root package name */
    public int f3024M;

    /* renamed from: a  reason: collision with root package name */
    public final String f3025a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3026b;

    /* renamed from: c  reason: collision with root package name */
    public final O f3027c;

    /* renamed from: d  reason: collision with root package name */
    public final String f3028d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3029f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3030g;

    /* renamed from: h  reason: collision with root package name */
    public final int f3031h;
    public final int i;

    /* renamed from: j  reason: collision with root package name */
    public final int f3032j;

    /* renamed from: k  reason: collision with root package name */
    public final String f3033k;

    /* renamed from: l  reason: collision with root package name */
    public final H f3034l;

    /* renamed from: m  reason: collision with root package name */
    public final String f3035m;

    /* renamed from: n  reason: collision with root package name */
    public final String f3036n;

    /* renamed from: o  reason: collision with root package name */
    public final int f3037o;

    /* renamed from: p  reason: collision with root package name */
    public final int f3038p;

    /* renamed from: q  reason: collision with root package name */
    public final List f3039q;

    /* renamed from: r  reason: collision with root package name */
    public final C0126n f3040r;

    /* renamed from: s  reason: collision with root package name */
    public final long f3041s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f3042t;

    /* renamed from: u  reason: collision with root package name */
    public final int f3043u;

    /* renamed from: v  reason: collision with root package name */
    public final int f3044v;

    /* renamed from: w  reason: collision with root package name */
    public final float f3045w;

    /* renamed from: x  reason: collision with root package name */
    public final int f3046x;

    /* renamed from: y  reason: collision with root package name */
    public final float f3047y;
    public final byte[] z;

    static {
        new C0129q().a();
        z.J(0);
        z.J(1);
        z.J(2);
        z.J(3);
        z.J(4);
        e.D(5, 6, 7, 8, 9);
        e.D(10, 11, 12, 13, 14);
        e.D(15, 16, 17, 18, 19);
        e.D(20, 21, 22, 23, 24);
        e.D(25, 26, 27, 28, 29);
        z.J(30);
        z.J(31);
        z.J(32);
        z.J(33);
    }

    public r(C0129q qVar) {
        boolean z6;
        boolean z8;
        String str;
        this.f3025a = qVar.f2989a;
        String P8 = z.P(qVar.f2992d);
        this.f3028d = P8;
        int i8 = 0;
        if (qVar.f2991c.isEmpty() && qVar.f2990b != null) {
            this.f3027c = O.r(new C0131t(P8, qVar.f2990b));
            this.f3026b = qVar.f2990b;
        } else if (qVar.f2991c.isEmpty() || qVar.f2990b != null) {
            if (!qVar.f2991c.isEmpty() || qVar.f2990b != null) {
                int i9 = 0;
                while (true) {
                    if (i9 >= qVar.f2991c.size()) {
                        z8 = false;
                        break;
                    } else if (((C0131t) qVar.f2991c.get(i9)).f3049b.equals(qVar.f2990b)) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            z8 = true;
            l.j(z8);
            this.f3027c = qVar.f2991c;
            this.f3026b = qVar.f2990b;
        } else {
            O o2 = qVar.f2991c;
            this.f3027c = o2;
            Iterator it = o2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((C0131t) o2.get(0)).f3049b;
                    break;
                }
                C0131t tVar = (C0131t) it.next();
                if (TextUtils.equals(tVar.f3048a, P8)) {
                    str = tVar.f3049b;
                    break;
                }
            }
            this.f3026b = str;
        }
        this.e = qVar.e;
        if (qVar.f2994g == 0 || (qVar.f2993f & 32768) != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        l.i("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", z6);
        this.f3029f = qVar.f2993f;
        this.f3030g = qVar.f2994g;
        int i10 = qVar.f2995h;
        this.f3031h = i10;
        int i11 = qVar.i;
        this.i = i11;
        this.f3032j = i11 != -1 ? i11 : i10;
        this.f3033k = qVar.f2996j;
        this.f3034l = qVar.f2997k;
        this.f3035m = qVar.f2998l;
        this.f3036n = qVar.f2999m;
        this.f3037o = qVar.f3000n;
        this.f3038p = qVar.f3001o;
        List list = qVar.f3002p;
        this.f3039q = list == null ? Collections.emptyList() : list;
        C0126n nVar = qVar.f3003q;
        this.f3040r = nVar;
        this.f3041s = qVar.f3004r;
        this.f3042t = qVar.f3005s;
        this.f3043u = qVar.f3006t;
        this.f3044v = qVar.f3007u;
        this.f3045w = qVar.f3008v;
        int i12 = qVar.f3009w;
        this.f3046x = i12 == -1 ? 0 : i12;
        float f8 = qVar.f3010x;
        this.f3047y = f8 == -1.0f ? 1.0f : f8;
        this.z = qVar.f3011y;
        this.f3012A = qVar.z;
        this.f3013B = qVar.f2978A;
        this.f3014C = qVar.f2979B;
        this.f3015D = qVar.f2980C;
        this.f3016E = qVar.f2981D;
        int i13 = qVar.f2982E;
        this.f3017F = i13 == -1 ? 0 : i13;
        int i14 = qVar.f2983F;
        this.f3018G = i14 != -1 ? i14 : i8;
        this.f3019H = qVar.f2984G;
        this.f3020I = qVar.f2985H;
        this.f3021J = qVar.f2986I;
        this.f3022K = qVar.f2987J;
        int i15 = qVar.f2988K;
        if (i15 != 0 || nVar == null) {
            this.f3023L = i15;
        } else {
            this.f3023L = 1;
        }
    }

    public static String d(r rVar) {
        String str;
        String str2;
        String str3;
        int i8;
        if (rVar == null) {
            return "null";
        }
        G3.e eVar = new G3.e(String.valueOf(','));
        StringBuilder r8 = g.r("id=");
        r8.append(rVar.f3025a);
        r8.append(", mimeType=");
        r8.append(rVar.f3036n);
        String str4 = rVar.f3035m;
        if (str4 != null) {
            r8.append(", container=");
            r8.append(str4);
        }
        int i9 = rVar.f3032j;
        if (i9 != -1) {
            r8.append(", bitrate=");
            r8.append(i9);
        }
        String str5 = rVar.f3033k;
        if (str5 != null) {
            r8.append(", codecs=");
            r8.append(str5);
        }
        C0126n nVar = rVar.f3040r;
        if (nVar != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i10 = 0; i10 < nVar.f2976X; i10++) {
                UUID uuid = nVar.f2973U[i10].f2969V;
                if (uuid.equals(C0119g.f2944b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(C0119g.f2945c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(C0119g.e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(C0119g.f2946d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(C0119g.f2943a)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add("unknown (" + uuid + ")");
                }
            }
            r8.append(", drm=[");
            eVar.a(r8, linkedHashSet.iterator());
            r8.append(']');
        }
        int i11 = rVar.f3043u;
        if (!(i11 == -1 || (i8 = rVar.f3044v) == -1)) {
            r8.append(", res=");
            r8.append(i11);
            r8.append("x");
            r8.append(i8);
        }
        C0121i iVar = rVar.f3013B;
        if (iVar != null) {
            int i12 = iVar.f2961f;
            int i13 = iVar.e;
            if (!(i13 == -1 || i12 == -1) || iVar.d()) {
                r8.append(", color=");
                if (iVar.d()) {
                    String b8 = C0121i.b(iVar.f2957a);
                    String a8 = C0121i.a(iVar.f2958b);
                    String c8 = C0121i.c(iVar.f2959c);
                    Locale locale = Locale.US;
                    str2 = b8 + "/" + a8 + "/" + c8;
                } else {
                    str2 = "NA/NA/NA";
                }
                if (i13 == -1 || i12 == -1) {
                    str3 = "NA/NA";
                } else {
                    str3 = i13 + "/" + i12;
                }
                r8.append(str2 + "/" + str3);
            }
        }
        float f8 = rVar.f3045w;
        if (f8 != -1.0f) {
            r8.append(", fps=");
            r8.append(f8);
        }
        int i14 = rVar.f3014C;
        if (i14 != -1) {
            r8.append(", channels=");
            r8.append(i14);
        }
        int i15 = rVar.f3015D;
        if (i15 != -1) {
            r8.append(", sample_rate=");
            r8.append(i15);
        }
        String str6 = rVar.f3028d;
        if (str6 != null) {
            r8.append(", language=");
            r8.append(str6);
        }
        O o2 = rVar.f3027c;
        if (!o2.isEmpty()) {
            r8.append(", labels=[");
            eVar.a(r8, C0103u.z(o2, new B7.g(11)).iterator());
            r8.append("]");
        }
        int i16 = rVar.e;
        if (i16 != 0) {
            r8.append(", selectionFlags=[");
            int i17 = z.f3748a;
            ArrayList arrayList = new ArrayList();
            if ((i16 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i16 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i16 & 2) != 0) {
                arrayList.add("forced");
            }
            eVar.a(r8, arrayList.iterator());
            r8.append("]");
        }
        int i18 = rVar.f3029f;
        if (i18 != 0) {
            r8.append(", roleFlags=[");
            int i19 = z.f3748a;
            ArrayList arrayList2 = new ArrayList();
            if ((i18 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i18 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i18 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i18 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i18 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i18 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i18 & 64) != 0) {
                arrayList2.add("caption");
            }
            if ((i18 & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i18 & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i18 & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i18 & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i18 & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i18 & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i18 & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i18 & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if ((i18 & 32768) != 0) {
                arrayList2.add("auxiliary");
            }
            eVar.a(r8, arrayList2.iterator());
            r8.append("]");
        }
        if ((i18 & 32768) != 0) {
            r8.append(", auxiliaryTrackType=");
            int i20 = z.f3748a;
            int i21 = rVar.f3030g;
            if (i21 == 0) {
                str = "undefined";
            } else if (i21 == 1) {
                str = "original";
            } else if (i21 == 2) {
                str = "depth-linear";
            } else if (i21 == 3) {
                str = "depth-inverse";
            } else if (i21 == 4) {
                str = "depth metadata";
            } else {
                throw new IllegalStateException("Unsupported auxiliary track type");
            }
            r8.append(str);
        }
        return r8.toString();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [M0.q, java.lang.Object] */
    public final C0129q a() {
        ? obj = new Object();
        obj.f2989a = this.f3025a;
        obj.f2990b = this.f3026b;
        obj.f2991c = this.f3027c;
        obj.f2992d = this.f3028d;
        obj.e = this.e;
        obj.f2993f = this.f3029f;
        obj.f2995h = this.f3031h;
        obj.i = this.i;
        obj.f2996j = this.f3033k;
        obj.f2997k = this.f3034l;
        obj.f2998l = this.f3035m;
        obj.f2999m = this.f3036n;
        obj.f3000n = this.f3037o;
        obj.f3001o = this.f3038p;
        obj.f3002p = this.f3039q;
        obj.f3003q = this.f3040r;
        obj.f3004r = this.f3041s;
        obj.f3005s = this.f3042t;
        obj.f3006t = this.f3043u;
        obj.f3007u = this.f3044v;
        obj.f3008v = this.f3045w;
        obj.f3009w = this.f3046x;
        obj.f3010x = this.f3047y;
        obj.f3011y = this.z;
        obj.z = this.f3012A;
        obj.f2978A = this.f3013B;
        obj.f2979B = this.f3014C;
        obj.f2980C = this.f3015D;
        obj.f2981D = this.f3016E;
        obj.f2982E = this.f3017F;
        obj.f2983F = this.f3018G;
        obj.f2984G = this.f3019H;
        obj.f2985H = this.f3020I;
        obj.f2986I = this.f3021J;
        obj.f2987J = this.f3022K;
        obj.f2988K = this.f3023L;
        return obj;
    }

    public final int b() {
        int i8;
        int i9 = this.f3043u;
        if (i9 == -1 || (i8 = this.f3044v) == -1) {
            return -1;
        }
        return i9 * i8;
    }

    public final boolean c(r rVar) {
        List list = this.f3039q;
        if (list.size() != rVar.f3039q.size()) {
            return false;
        }
        for (int i8 = 0; i8 < list.size(); i8++) {
            if (!Arrays.equals((byte[]) list.get(i8), (byte[]) rVar.f3039q.get(i8))) {
                return false;
            }
        }
        return true;
    }

    public final r e(r rVar) {
        String str;
        float f8;
        String str2;
        C0126n nVar;
        int i8;
        int i9;
        r rVar2 = rVar;
        if (this == rVar2) {
            return this;
        }
        int i10 = I.i(this.f3036n);
        String str3 = rVar2.f3025a;
        String str4 = rVar2.f3026b;
        if (str4 == null) {
            str4 = this.f3026b;
        }
        O o2 = rVar2.f3027c;
        if (o2.isEmpty()) {
            o2 = this.f3027c;
        }
        if (!(i10 == 3 || i10 == 1) || (str = rVar2.f3028d) == null) {
            str = this.f3028d;
        }
        int i11 = this.f3031h;
        if (i11 == -1) {
            i11 = rVar2.f3031h;
        }
        int i12 = this.i;
        if (i12 == -1) {
            i12 = rVar2.i;
        }
        String str5 = this.f3033k;
        if (str5 == null) {
            String u3 = z.u(i10, rVar2.f3033k);
            if (z.a0(u3).length == 1) {
                str5 = u3;
            }
        }
        H h5 = rVar2.f3034l;
        H h8 = this.f3034l;
        if (h8 != null) {
            h5 = h8.v(h5);
        }
        float f9 = this.f3045w;
        if (f9 == -1.0f && i10 == 2) {
            f9 = rVar2.f3045w;
        }
        int i13 = this.e | rVar2.e;
        int i14 = this.f3029f | rVar2.f3029f;
        ArrayList arrayList = new ArrayList();
        C0126n nVar2 = rVar2.f3040r;
        if (nVar2 != null) {
            C0125m[] mVarArr = nVar2.f2973U;
            int length = mVarArr.length;
            f8 = f9;
            int i15 = 0;
            while (i15 < length) {
                int i16 = length;
                C0125m mVar = mVarArr[i15];
                C0125m[] mVarArr2 = mVarArr;
                if (mVar.f2972Y != null) {
                    arrayList.add(mVar);
                }
                i15++;
                length = i16;
                mVarArr = mVarArr2;
            }
            str2 = nVar2.f2975W;
        } else {
            f8 = f9;
            str2 = null;
        }
        C0126n nVar3 = this.f3040r;
        if (nVar3 != null) {
            if (str2 == null) {
                str2 = nVar3.f2975W;
            }
            int size = arrayList.size();
            C0125m[] mVarArr3 = nVar3.f2973U;
            int length2 = mVarArr3.length;
            int i17 = 0;
            while (true) {
                String str6 = str2;
                if (i17 >= length2) {
                    break;
                }
                C0125m mVar2 = mVarArr3[i17];
                C0125m[] mVarArr4 = mVarArr3;
                if (mVar2.f2972Y != null) {
                    int i18 = 0;
                    while (true) {
                        if (i18 >= size) {
                            i8 = size;
                            i9 = length2;
                            arrayList.add(mVar2);
                            break;
                        }
                        i8 = size;
                        i9 = length2;
                        if (((C0125m) arrayList.get(i18)).f2969V.equals(mVar2.f2969V)) {
                            break;
                        }
                        i18++;
                        length2 = i9;
                        size = i8;
                    }
                } else {
                    i8 = size;
                    i9 = length2;
                }
                i17++;
                str2 = str6;
                mVarArr3 = mVarArr4;
                length2 = i9;
                size = i8;
            }
        }
        if (arrayList.isEmpty()) {
            nVar = null;
        } else {
            nVar = new C0126n(str2, arrayList);
        }
        C0129q a8 = a();
        a8.f2989a = str3;
        a8.f2990b = str4;
        a8.f2991c = O.m(o2);
        a8.f2992d = str;
        a8.e = i13;
        a8.f2993f = i14;
        a8.f2995h = i11;
        a8.i = i12;
        a8.f2996j = str5;
        a8.f2997k = h5;
        a8.f3003q = nVar;
        a8.f3008v = f8;
        r rVar3 = rVar;
        a8.f2986I = rVar3.f3021J;
        a8.f2987J = rVar3.f3022K;
        return new r(a8);
    }

    public final boolean equals(Object obj) {
        int i8;
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        int i9 = this.f3024M;
        if ((i9 == 0 || (i8 = rVar.f3024M) == 0 || i9 == i8) && this.e == rVar.e && this.f3029f == rVar.f3029f && this.f3030g == rVar.f3030g && this.f3031h == rVar.f3031h && this.i == rVar.i && this.f3037o == rVar.f3037o && this.f3041s == rVar.f3041s && this.f3043u == rVar.f3043u && this.f3044v == rVar.f3044v && this.f3046x == rVar.f3046x && this.f3012A == rVar.f3012A && this.f3014C == rVar.f3014C && this.f3015D == rVar.f3015D && this.f3016E == rVar.f3016E && this.f3017F == rVar.f3017F && this.f3018G == rVar.f3018G && this.f3019H == rVar.f3019H && this.f3021J == rVar.f3021J && this.f3022K == rVar.f3022K && this.f3023L == rVar.f3023L && Float.compare(this.f3045w, rVar.f3045w) == 0 && Float.compare(this.f3047y, rVar.f3047y) == 0 && Objects.equals(this.f3025a, rVar.f3025a) && Objects.equals(this.f3026b, rVar.f3026b) && this.f3027c.equals(rVar.f3027c) && Objects.equals(this.f3033k, rVar.f3033k) && Objects.equals(this.f3035m, rVar.f3035m) && Objects.equals(this.f3036n, rVar.f3036n) && Objects.equals(this.f3028d, rVar.f3028d) && Arrays.equals(this.z, rVar.z) && Objects.equals(this.f3034l, rVar.f3034l) && Objects.equals(this.f3013B, rVar.f3013B) && Objects.equals(this.f3040r, rVar.f3040r) && c(rVar)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        if (this.f3024M == 0) {
            int i14 = 0;
            String str = this.f3025a;
            if (str == null) {
                i8 = 0;
            } else {
                i8 = str.hashCode();
            }
            int i15 = (527 + i8) * 31;
            String str2 = this.f3026b;
            if (str2 == null) {
                i9 = 0;
            } else {
                i9 = str2.hashCode();
            }
            int hashCode = (this.f3027c.hashCode() + ((i15 + i9) * 31)) * 31;
            String str3 = this.f3028d;
            if (str3 == null) {
                i10 = 0;
            } else {
                i10 = str3.hashCode();
            }
            int i16 = (((((((((((hashCode + i10) * 31) + this.e) * 31) + this.f3029f) * 31) + this.f3030g) * 31) + this.f3031h) * 31) + this.i) * 31;
            String str4 = this.f3033k;
            if (str4 == null) {
                i11 = 0;
            } else {
                i11 = str4.hashCode();
            }
            int i17 = (i16 + i11) * 31;
            H h5 = this.f3034l;
            if (h5 == null) {
                i12 = 0;
            } else {
                i12 = h5.hashCode();
            }
            int i18 = (i17 + i12) * 961;
            String str5 = this.f3035m;
            if (str5 == null) {
                i13 = 0;
            } else {
                i13 = str5.hashCode();
            }
            int i19 = (i18 + i13) * 31;
            String str6 = this.f3036n;
            if (str6 != null) {
                i14 = str6.hashCode();
            }
            int floatToIntBits = Float.floatToIntBits(this.f3045w);
            this.f3024M = ((((((((((((((((((((Float.floatToIntBits(this.f3047y) + ((((floatToIntBits + ((((((((((i19 + i14) * 31) + this.f3037o) * 31) + ((int) this.f3041s)) * 31) + this.f3043u) * 31) + this.f3044v) * 31)) * 31) + this.f3046x) * 31)) * 31) + this.f3012A) * 31) + this.f3014C) * 31) + this.f3015D) * 31) + this.f3016E) * 31) + this.f3017F) * 31) + this.f3018G) * 31) + this.f3019H) * 31) + this.f3021J) * 31) + this.f3022K) * 31) + this.f3023L;
        }
        return this.f3024M;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.f3025a);
        sb.append(", ");
        sb.append(this.f3026b);
        sb.append(", ");
        sb.append(this.f3035m);
        sb.append(", ");
        sb.append(this.f3036n);
        sb.append(", ");
        sb.append(this.f3033k);
        sb.append(", ");
        sb.append(this.f3032j);
        sb.append(", ");
        sb.append(this.f3028d);
        sb.append(", [");
        sb.append(this.f3043u);
        sb.append(", ");
        sb.append(this.f3044v);
        sb.append(", ");
        sb.append(this.f3045w);
        sb.append(", ");
        sb.append(this.f3013B);
        sb.append("], [");
        sb.append(this.f3014C);
        sb.append(", ");
        return e.z(sb, this.f3015D, "])");
    }
}
