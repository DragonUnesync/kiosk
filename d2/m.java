package D2;

import B.q0;
import B2.i;
import B2.k;
import P2.a;
import android.util.Log;
import com.bumptech.glide.load.data.g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final Class f1128a;

    /* renamed from: b  reason: collision with root package name */
    public final List f1129b;

    /* renamed from: c  reason: collision with root package name */
    public final a f1130c;

    /* renamed from: d  reason: collision with root package name */
    public final q0 f1131d;
    public final String e;

    public m(Class cls, Class cls2, Class cls3, List list, a aVar, q0 q0Var) {
        this.f1128a = cls;
        this.f1129b = list;
        this.f1130c = aVar;
        this.f1131d = q0Var;
        this.e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: D2.C} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: D2.F} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: D2.f} */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b8, code lost:
        if (r0 == 3) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ba, code lost:
        if (r0 == 1) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00bd, code lost:
        if (r1 != 2) goto L_0x00c0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final D2.D a(int r18, int r19, B2.i r20, D2.j r21, com.bumptech.glide.load.data.g r22) {
        /*
            r17 = this;
            r7 = r17
            r0 = r21
            B.q0 r8 = r7.f1131d
            java.lang.Object r1 = r8.a()
            r9 = r1
            java.util.List r9 = (java.util.List) r9
            r1 = r17
            r2 = r22
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r9
            D2.D r1 = r1.b(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0147 }
            r8.A(r9)
            java.lang.Object r2 = r0.f1094V
            D2.l r2 = (D2.l) r2
            r2.getClass()
            java.lang.Object r3 = r1.get()
            java.lang.Class r15 = r3.getClass()
            r3 = 4
            int r0 = r0.f1093U
            D2.i r4 = r2.f1098U
            r5 = 0
            if (r0 == r3) goto L_0x0046
            B2.m r3 = r4.e(r15)
            com.bumptech.glide.e r6 = r2.f1105b0
            int r8 = r2.f1109f0
            int r9 = r2.f1110g0
            D2.D r6 = r3.b(r6, r1, r8, r9)
            r14 = r3
            goto L_0x0048
        L_0x0046:
            r6 = r1
            r14 = r5
        L_0x0048:
            boolean r3 = r1.equals(r6)
            if (r3 != 0) goto L_0x0051
            r1.e()
        L_0x0051:
            com.bumptech.glide.e r1 = r4.f1079c
            com.bumptech.glide.i r1 = r1.b()
            D.s0 r1 = r1.f9002d
            java.lang.Class r3 = r6.d()
            B2.l r1 = r1.i(r3)
            if (r1 == 0) goto L_0x0089
            com.bumptech.glide.e r1 = r4.f1079c
            com.bumptech.glide.i r1 = r1.b()
            r1.getClass()
            java.lang.Class r3 = r6.d()
            D.s0 r1 = r1.f9002d
            B2.l r5 = r1.i(r3)
            if (r5 == 0) goto L_0x007f
            B2.i r1 = r2.f1112i0
            int r1 = r5.q(r1)
            goto L_0x008a
        L_0x007f:
            com.bumptech.glide.h r0 = new com.bumptech.glide.h
            java.lang.Class r1 = r6.d()
            r0.<init>(r1)
            throw r0
        L_0x0089:
            r1 = 3
        L_0x008a:
            B2.f r3 = r2.f1118o0
            java.util.ArrayList r8 = r4.b()
            int r9 = r8.size()
            r13 = 0
            r10 = 0
        L_0x0096:
            r12 = 1
            if (r10 >= r9) goto L_0x00ac
            java.lang.Object r11 = r8.get(r10)
            H2.p r11 = (H2.p) r11
            B2.f r11 = r11.f1974a
            boolean r11 = r11.equals(r3)
            if (r11 == 0) goto L_0x00a9
            r3 = 1
            goto L_0x00ad
        L_0x00a9:
            int r10 = r10 + 1
            goto L_0x0096
        L_0x00ac:
            r3 = 0
        L_0x00ad:
            D2.n r8 = r2.f1111h0
            int r8 = r8.f1135a
            switch(r8) {
                case 0: goto L_0x00c0;
                case 1: goto L_0x00c0;
                default: goto L_0x00b4;
            }
        L_0x00b4:
            r8 = 1
            if (r3 != 0) goto L_0x00ba
            r3 = 3
            if (r0 == r3) goto L_0x00bc
        L_0x00ba:
            if (r0 != r8) goto L_0x00c0
        L_0x00bc:
            r0 = 2
            if (r1 != r0) goto L_0x00c0
            goto L_0x00c1
        L_0x00c0:
            r8 = 0
        L_0x00c1:
            if (r8 == 0) goto L_0x013e
            if (r5 == 0) goto L_0x0130
            int r0 = u.C1477r.h(r1)
            if (r0 == 0) goto L_0x010d
            if (r0 != r12) goto L_0x00ed
            D2.F r0 = new D2.F
            com.bumptech.glide.e r1 = r4.f1079c
            E2.g r9 = r1.f8985a
            B2.f r10 = r2.f1118o0
            B2.f r11 = r2.f1106c0
            int r1 = r2.f1109f0
            int r3 = r2.f1110g0
            B2.i r4 = r2.f1112i0
            r8 = r0
            r18 = r0
            r0 = 1
            r12 = r1
            r1 = 0
            r13 = r3
            r16 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r1 = r18
            r3 = 0
            goto L_0x0118
        L_0x00ed:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r2 = 1
            if (r1 == r2) goto L_0x0101
            r2 = 2
            if (r1 == r2) goto L_0x00fe
            r2 = 3
            if (r1 == r2) goto L_0x00fb
            java.lang.String r1 = "null"
            goto L_0x0103
        L_0x00fb:
            java.lang.String r1 = "NONE"
            goto L_0x0103
        L_0x00fe:
            java.lang.String r1 = "TRANSFORMED"
            goto L_0x0103
        L_0x0101:
            java.lang.String r1 = "SOURCE"
        L_0x0103:
            java.lang.String r2 = "Unknown strategy: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x010d:
            r0 = 1
            r3 = 0
            D2.f r1 = new D2.f
            B2.f r4 = r2.f1118o0
            B2.f r8 = r2.f1106c0
            r1.<init>(r4, r8)
        L_0x0118:
            B.q0 r4 = D2.C.f1029Y
            java.lang.Object r4 = r4.a()
            D2.C r4 = (D2.C) r4
            r4.f1033X = r3
            r4.f1032W = r0
            r4.f1031V = r6
            B.q0 r0 = r2.f1103Z
            r0.f300V = r1
            r0.f301W = r5
            r0.f302X = r4
            r6 = r4
            goto L_0x013e
        L_0x0130:
            com.bumptech.glide.h r0 = new com.bumptech.glide.h
            java.lang.Object r1 = r6.get()
            java.lang.Class r1 = r1.getClass()
            r0.<init>(r1)
            throw r0
        L_0x013e:
            P2.a r0 = r7.f1130c
            r1 = r20
            D2.D r0 = r0.d(r6, r1)
            return r0
        L_0x0147:
            r0 = move-exception
            r1 = r0
            r8.A(r9)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: D2.m.a(int, int, B2.i, D2.j, com.bumptech.glide.load.data.g):D2.D");
    }

    public final D b(g gVar, int i, int i8, i iVar, List list) {
        List list2 = this.f1129b;
        int size = list2.size();
        D d8 = null;
        for (int i9 = 0; i9 < size; i9++) {
            k kVar = (k) list2.get(i9);
            try {
                if (kVar.b(gVar.a(), iVar)) {
                    d8 = kVar.a(gVar.a(), i, i8, iVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e8) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + kVar, e8);
                }
                list.add(e8);
            }
            if (d8 != null) {
                break;
            }
        }
        if (d8 != null) {
            return d8;
        }
        throw new y(this.e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f1128a + ", decoders=" + this.f1129b + ", transcoder=" + this.f1130c + '}';
    }
}
