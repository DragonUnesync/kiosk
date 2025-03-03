package D2;

import G3.h;
import H3.C0103u;
import H3.I;
import H3.M;
import H3.P;
import H3.Q;
import H3.S;
import H3.l0;
import H3.n0;
import H3.x0;
import I5.a;
import M0.C0132u;
import M0.J;
import P0.r;
import P0.w;
import P0.z;
import R0.g;
import Y6.s;
import Z1.c;
import android.content.ContentResolver;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Shader;
import android.net.Uri;
import android.provider.Settings;
import android.util.SparseArray;
import de.ozerov.fully.C0767r3;
import de.ozerov.fully.C0794w0;
import de.ozerov.fully.FullyActivity;
import f1.x;
import f1.y;
import g7.C0996d;
import i1.C1091d;
import i5.f;
import i5.k;
import i5.p;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m5.C1217b;
import n1.C1240e;
import org.altbeacon.bluetooth.Pdu;
import p1.C1332b;
import p1.i;
import p1.l;
import p1.t;

public final class o implements i {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f1136U;

    /* renamed from: V  reason: collision with root package name */
    public int f1137V;

    /* renamed from: W  reason: collision with root package name */
    public Object f1138W;

    /* renamed from: X  reason: collision with root package name */
    public Object f1139X;

    public /* synthetic */ o(int i, byte b8) {
        this.f1136U = i;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [android.graphics.Shader] */
    /* JADX WARNING: type inference failed for: r15v14, types: [android.graphics.RadialGradient] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r10v21, types: [android.graphics.LinearGradient] */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01c8, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r3.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static D2.o d(android.content.res.Resources r29, int r30, android.content.res.Resources.Theme r31) {
        /*
            r0 = r29
            r1 = r31
            java.lang.String r2 = "gradient"
            android.content.res.XmlResourceParser r3 = r29.getXml(r30)
            android.util.AttributeSet r4 = android.util.Xml.asAttributeSet(r3)
        L_0x000e:
            int r5 = r3.next()
            r6 = 2
            r7 = 1
            if (r5 == r6) goto L_0x0019
            if (r5 == r7) goto L_0x0019
            goto L_0x000e
        L_0x0019:
            if (r5 != r6) goto L_0x028b
            java.lang.String r5 = r3.getName()
            r5.getClass()
            r8 = 0
            boolean r9 = r5.equals(r2)
            if (r9 != 0) goto L_0x005d
            java.lang.String r2 = "selector"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x003f
            android.content.res.ColorStateList r0 = l0.C1170c.b(r0, r3, r4, r1)
            D2.o r1 = new D2.o
            int r2 = r0.getDefaultColor()
            r1.<init>(r8, r0, r2)
            return r1
        L_0x003f:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": unsupported complex color tag "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x005d:
            java.lang.String r5 = r3.getName()
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x026d
            int[] r2 = i0.C1087a.f12635d
            android.content.res.TypedArray r2 = l0.C1169b.g(r0, r1, r4, r2)
            java.lang.String r5 = "startX"
            boolean r5 = l0.C1169b.d(r3, r5)
            r9 = 0
            if (r5 != 0) goto L_0x0078
            r11 = 0
            goto L_0x007f
        L_0x0078:
            r5 = 8
            float r5 = r2.getFloat(r5, r9)
            r11 = r5
        L_0x007f:
            java.lang.String r5 = "startY"
            boolean r5 = l0.C1169b.d(r3, r5)
            if (r5 != 0) goto L_0x0089
            r12 = 0
            goto L_0x0090
        L_0x0089:
            r5 = 9
            float r5 = r2.getFloat(r5, r9)
            r12 = r5
        L_0x0090:
            java.lang.String r5 = "endX"
            boolean r5 = l0.C1169b.d(r3, r5)
            if (r5 != 0) goto L_0x009a
            r13 = 0
            goto L_0x00a1
        L_0x009a:
            r5 = 10
            float r5 = r2.getFloat(r5, r9)
            r13 = r5
        L_0x00a1:
            java.lang.String r5 = "endY"
            boolean r5 = l0.C1169b.d(r3, r5)
            if (r5 != 0) goto L_0x00ab
            r14 = 0
            goto L_0x00b2
        L_0x00ab:
            r5 = 11
            float r5 = r2.getFloat(r5, r9)
            r14 = r5
        L_0x00b2:
            java.lang.String r5 = "centerX"
            boolean r5 = l0.C1169b.d(r3, r5)
            r10 = 3
            if (r5 != 0) goto L_0x00bd
            r5 = 0
            goto L_0x00c1
        L_0x00bd:
            float r5 = r2.getFloat(r10, r9)
        L_0x00c1:
            java.lang.String r15 = "centerY"
            boolean r15 = l0.C1169b.d(r3, r15)
            if (r15 != 0) goto L_0x00cb
            r15 = 0
            goto L_0x00d0
        L_0x00cb:
            r15 = 4
            float r15 = r2.getFloat(r15, r9)
        L_0x00d0:
            java.lang.String r8 = "type"
            boolean r8 = l0.C1169b.d(r3, r8)
            r10 = 0
            if (r8 != 0) goto L_0x00db
            r8 = 0
            goto L_0x00df
        L_0x00db:
            int r8 = r2.getInt(r6, r10)
        L_0x00df:
            java.lang.String r6 = "startColor"
            boolean r6 = l0.C1169b.d(r3, r6)
            if (r6 != 0) goto L_0x00e9
            r6 = 0
            goto L_0x00ed
        L_0x00e9:
            int r6 = r2.getColor(r10, r10)
        L_0x00ed:
            java.lang.String r9 = "centerColor"
            boolean r19 = l0.C1169b.d(r3, r9)
            boolean r9 = l0.C1169b.d(r3, r9)
            if (r9 != 0) goto L_0x00fb
            r9 = 0
            goto L_0x0100
        L_0x00fb:
            r9 = 7
            int r9 = r2.getColor(r9, r10)
        L_0x0100:
            java.lang.String r7 = "endColor"
            boolean r7 = l0.C1169b.d(r3, r7)
            if (r7 != 0) goto L_0x010a
            r7 = 0
            goto L_0x0111
        L_0x010a:
            r7 = 1
            int r21 = r2.getColor(r7, r10)
            r7 = r21
        L_0x0111:
            java.lang.String r10 = "tileMode"
            boolean r10 = l0.C1169b.d(r3, r10)
            if (r10 != 0) goto L_0x011d
            r22 = r5
            r5 = 0
            goto L_0x0126
        L_0x011d:
            r10 = 6
            r22 = r5
            r5 = 0
            int r10 = r2.getInt(r10, r5)
            r5 = r10
        L_0x0126:
            java.lang.String r10 = "gradientRadius"
            boolean r10 = l0.C1169b.d(r3, r10)
            if (r10 != 0) goto L_0x0132
            r23 = r15
            r10 = 0
            goto L_0x013a
        L_0x0132:
            r10 = 5
            r23 = r15
            r15 = 0
            float r10 = r2.getFloat(r10, r15)
        L_0x013a:
            r2.recycle()
            int r2 = r3.getDepth()
            r15 = 1
            int r2 = r2 + r15
            java.util.ArrayList r15 = new java.util.ArrayList
            r24 = r10
            r10 = 20
            r15.<init>(r10)
            r25 = r14
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>(r10)
        L_0x0153:
            int r10 = r3.next()
            r26 = r13
            r13 = 1
            if (r10 == r13) goto L_0x01c9
            int r13 = r3.getDepth()
            r27 = r12
            if (r13 >= r2) goto L_0x0167
            r12 = 3
            if (r10 == r12) goto L_0x01cb
        L_0x0167:
            r12 = 2
            if (r10 == r12) goto L_0x016f
        L_0x016a:
            r13 = r26
            r12 = r27
            goto L_0x0153
        L_0x016f:
            if (r13 > r2) goto L_0x016a
            java.lang.String r10 = r3.getName()
            java.lang.String r12 = "item"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x017e
            goto L_0x016a
        L_0x017e:
            int[] r10 = i0.C1087a.e
            android.content.res.TypedArray r10 = l0.C1169b.g(r0, r1, r4, r10)
            r12 = 0
            boolean r13 = r10.hasValue(r12)
            r12 = 1
            boolean r20 = r10.hasValue(r12)
            if (r13 == 0) goto L_0x01ae
            if (r20 == 0) goto L_0x01ae
            r13 = 0
            int r21 = r10.getColor(r13, r13)
            r13 = 0
            float r28 = r10.getFloat(r12, r13)
            r10.recycle()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r21)
            r14.add(r10)
            java.lang.Float r10 = java.lang.Float.valueOf(r28)
            r15.add(r10)
            goto L_0x016a
        L_0x01ae:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01c9:
            r27 = r12
        L_0x01cb:
            int r0 = r14.size()
            if (r0 <= 0) goto L_0x01d7
            de.ozerov.fully.K2 r0 = new de.ozerov.fully.K2
            r0.<init>((java.util.ArrayList) r14, (java.util.ArrayList) r15)
            goto L_0x01d8
        L_0x01d7:
            r0 = 0
        L_0x01d8:
            if (r0 == 0) goto L_0x01dc
        L_0x01da:
            r1 = 1
            goto L_0x01ea
        L_0x01dc:
            if (r19 == 0) goto L_0x01e4
            de.ozerov.fully.K2 r0 = new de.ozerov.fully.K2
            r0.<init>((int) r6, (int) r9, (int) r7)
            goto L_0x01da
        L_0x01e4:
            de.ozerov.fully.K2 r0 = new de.ozerov.fully.K2
            r0.<init>((int) r6, (int) r7)
            goto L_0x01da
        L_0x01ea:
            if (r8 == r1) goto L_0x022a
            r2 = 2
            if (r8 == r2) goto L_0x0217
            android.graphics.LinearGradient r3 = new android.graphics.LinearGradient
            if (r5 == r1) goto L_0x01fd
            if (r5 == r2) goto L_0x01fa
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.CLAMP
        L_0x01f7:
            r17 = r1
            goto L_0x0200
        L_0x01fa:
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.MIRROR
            goto L_0x01f7
        L_0x01fd:
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.REPEAT
            goto L_0x01f7
        L_0x0200:
            java.lang.Object r1 = r0.f10050V
            r15 = r1
            int[] r15 = (int[]) r15
            java.lang.Object r0 = r0.f10051W
            r16 = r0
            float[] r16 = (float[]) r16
            r1 = 0
            r10 = r3
            r12 = r27
            r13 = r26
            r14 = r25
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x025e
        L_0x0217:
            r1 = 0
            android.graphics.SweepGradient r3 = new android.graphics.SweepGradient
            java.lang.Object r2 = r0.f10050V
            int[] r2 = (int[]) r2
            java.lang.Object r0 = r0.f10051W
            float[] r0 = (float[]) r0
            r9 = r22
            r15 = r23
            r3.<init>(r9, r15, r2, r0)
            goto L_0x025e
        L_0x022a:
            r9 = r22
            r15 = r23
            r1 = 0
            r2 = 0
            int r2 = (r24 > r2 ? 1 : (r24 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0265
            android.graphics.RadialGradient r3 = new android.graphics.RadialGradient
            r2 = 1
            if (r5 == r2) goto L_0x0244
            r2 = 2
            if (r5 == r2) goto L_0x0241
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.CLAMP
        L_0x023e:
            r21 = r2
            goto L_0x0247
        L_0x0241:
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.MIRROR
            goto L_0x023e
        L_0x0244:
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.REPEAT
            goto L_0x023e
        L_0x0247:
            java.lang.Object r2 = r0.f10050V
            r19 = r2
            int[] r19 = (int[]) r19
            java.lang.Object r0 = r0.f10051W
            r20 = r0
            float[] r20 = (float[]) r20
            r0 = r15
            r15 = r3
            r16 = r9
            r17 = r0
            r18 = r24
            r15.<init>(r16, r17, r18, r19, r20, r21)
        L_0x025e:
            D2.o r0 = new D2.o
            r2 = 0
            r0.<init>(r3, r2, r1)
            return r0
        L_0x0265:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "<gradient> tag requires 'gradientRadius' attribute with radial type"
            r0.<init>(r1)
            throw r0
        L_0x026d:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": invalid gradient color tag "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x028b:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "No start tag found"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: D2.o.d(android.content.res.Resources, int, android.content.res.Resources$Theme):D2.o");
    }

    private final /* synthetic */ void m() {
    }

    public void C() {
        switch (this.f1136U) {
            case 7:
                byte[] bArr = z.f3752f;
                r rVar = (r) this.f1139X;
                rVar.getClass();
                rVar.F(bArr.length, bArr);
                return;
            default:
                return;
        }
    }

    public void a(Object obj) {
        C0996d.r(obj, "Immutable list element");
        int i = this.f1137V;
        if (i == 0) {
            this.f1138W = obj;
            this.f1137V = 1;
            return;
        }
        int i8 = i + 1;
        e(i8)[this.f1137V] = obj;
        this.f1137V = i8;
    }

    public p b() {
        int i = this.f1137V;
        if (i == 0) {
            return k.f12748U;
        }
        if (i == 1) {
            return new f(1, this.f1138W);
        }
        Object[] objArr = (Object[]) this.f1139X;
        if (objArr.length == i) {
            return new f(0, objArr);
        }
        return new f(0, Arrays.copyOfRange(objArr, 0, i, Object[].class));
    }

    public n0 c() {
        S s8 = (S) this.f1139X;
        if (s8 == null) {
            n0 b8 = n0.b(this.f1137V, (Object[]) this.f1138W, this);
            S s9 = (S) this.f1139X;
            if (s9 == null) {
                return b8;
            }
            throw s9.a();
        }
        throw s8.a();
    }

    public Object[] e(int i) {
        Object[] objArr = (Object[]) this.f1139X;
        if (objArr == null) {
            this.f1139X = new Object[Math.max(4, i)];
        } else if (i > objArr.length) {
            int length = objArr.length;
            this.f1139X = Arrays.copyOf(objArr, Math.max(length + (length >> 1), i), Object[].class);
        }
        Object obj = this.f1138W;
        if (obj != null) {
            ((Object[]) this.f1139X)[0] = obj;
            this.f1138W = null;
        }
        return (Object[]) this.f1139X;
    }

    public long f(l lVar) {
        long j7;
        C0132u uVar;
        t tVar;
        boolean z;
        int g8;
        l lVar2 = lVar;
        while (true) {
            long s8 = lVar.s();
            j7 = lVar2.f14407W;
            uVar = (C0132u) this.f1139X;
            tVar = (t) this.f1138W;
            if (s8 >= j7 - 6) {
                break;
            }
            long s9 = lVar.s();
            int i = 2;
            byte[] bArr = new byte[2];
            lVar2.r(bArr, 0, 2, false);
            byte b8 = ((bArr[0] & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 8) | (bArr[1] & Pdu.MANUFACTURER_DATA_PDU_TYPE);
            int i8 = this.f1137V;
            if (b8 != i8) {
                lVar2.f14410Z = 0;
                lVar2.b((int) (s9 - lVar2.f14408X), false);
                z = false;
            } else {
                r rVar = new r(16);
                System.arraycopy(bArr, 0, rVar.f3732a, 0, 2);
                byte[] bArr2 = rVar.f3732a;
                int i9 = 0;
                while (i9 < 14 && (g8 = lVar2.g(bArr2, i + i9, 14 - i9)) != -1) {
                    i9 += g8;
                    i = 2;
                }
                rVar.G(i9);
                lVar2.f14410Z = 0;
                lVar2.b((int) (s9 - lVar2.f14408X), false);
                z = C1332b.c(rVar, tVar, i8, uVar);
            }
            if (z) {
                break;
            }
            lVar2.b(1, false);
        }
        if (lVar.s() < j7 - 6) {
            return uVar.f3050a;
        }
        lVar2.b((int) (j7 - lVar.s()), false);
        return tVar.f14430j;
    }

    public Object g(int i) {
        SparseArray sparseArray;
        if (this.f1137V == -1) {
            this.f1137V = 0;
        }
        while (true) {
            int i8 = this.f1137V;
            sparseArray = (SparseArray) this.f1138W;
            if (i8 > 0 && i < sparseArray.keyAt(i8)) {
                this.f1137V--;
            }
        }
        while (this.f1137V < sparseArray.size() - 1 && i >= sparseArray.keyAt(this.f1137V + 1)) {
            this.f1137V++;
        }
        return sparseArray.valueAt(this.f1137V);
    }

    public float h(float f8) {
        float[] fArr = (float[]) this.f1138W;
        int HSVToColor = Color.HSVToColor(new float[]{fArr[0], fArr[1], f8});
        float green = ((float) Color.green(HSVToColor)) * 0.7152f;
        return ((((float) Color.blue(HSVToColor)) * 0.0722f) + (green + (((float) Color.red(HSVToColor)) * 0.2126f))) / 255.0f;
    }

    public C1217b i() {
        return (P) this.f1139X;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.io.IOException, B2.c] */
    public y j(int i, String str, Map map, Uri uri) {
        f1.k kVar = (f1.k) this.f1139X;
        String str2 = kVar.f11556W;
        int i8 = this.f1137V;
        this.f1137V = i8 + 1;
        c cVar = new c(i8, str2, str);
        if (kVar.f11567h0 != null) {
            P0.l.k(kVar.f11563d0);
            try {
                cVar.e("Authorization", kVar.f11567h0.i(kVar.f11563d0, uri, i));
            } catch (J e) {
                f1.k.m(kVar, new IOException(e));
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            cVar.e((String) entry.getKey(), (String) entry.getValue());
        }
        return new y(uri, i, new f1.l(cVar), "");
    }

    public boolean k() {
        ColorStateList colorStateList;
        if (((Shader) this.f1138W) != null || (colorStateList = (ColorStateList) this.f1139X) == null || !colorStateList.isStateful()) {
            return false;
        }
        return true;
    }

    public void l(a aVar) {
        Iterator it = ((ArrayList) this.f1139X).iterator();
        while (it.hasNext()) {
            a aVar2 = (a) it.next();
            if (aVar2 != aVar) {
                aVar2.a(this);
            }
        }
    }

    public void n(Object obj, Object obj2) {
        int i = (this.f1137V + 1) * 2;
        Object[] objArr = (Object[]) this.f1138W;
        if (i > objArr.length) {
            this.f1138W = Arrays.copyOf(objArr, I.f(objArr.length, i));
        }
        C0103u.d(obj, obj2);
        Object[] objArr2 = (Object[]) this.f1138W;
        int i8 = this.f1137V;
        int i9 = i8 * 2;
        objArr2[i9] = obj;
        objArr2[i9 + 1] = obj2;
        this.f1137V = i8 + 1;
    }

    public void o() {
        P0.l.k((y) this.f1138W);
        f1.l lVar = ((y) this.f1138W).f11641c;
        HashMap hashMap = new HashMap();
        Q q7 = lVar.f11573a;
        x0 h5 = ((l0) q7.f2028X.keySet()).h();
        while (true) {
            M m8 = (M) h5;
            if (m8.hasNext()) {
                String str = (String) m8.next();
                if (!str.equals("CSeq") && !str.equals("User-Agent") && !str.equals("Session") && !str.equals("Authorization")) {
                    hashMap.put(str, (String) C0103u.l(q7.d(str)));
                }
            } else {
                y yVar = (y) this.f1138W;
                q(j(yVar.f11640b, ((f1.k) this.f1139X).f11564e0, hashMap, yVar.f11639a));
                return;
            }
        }
    }

    public void p(Uri uri, String str) {
        q(j(2, str, n0.b(1, new Object[]{"Accept", "application/sdp"}, (o) null), uri));
    }

    public void q(y yVar) {
        boolean z;
        String c8 = yVar.f11641c.c("CSeq");
        c8.getClass();
        int parseInt = Integer.parseInt(c8);
        f1.k kVar = (f1.k) this.f1139X;
        if (kVar.f11559Z.get(parseInt) == null) {
            z = true;
        } else {
            z = false;
        }
        P0.l.j(z);
        kVar.f11559Z.append(parseInt, yVar);
        kVar.f11562c0.l(x.g(yVar));
        this.f1138W = yVar;
    }

    public List r(CharSequence charSequence) {
        charSequence.getClass();
        A.f fVar = (A.f) this.f1139X;
        fVar.getClass();
        h hVar = new h(fVar, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (hVar.hasNext()) {
            arrayList.add((String) hVar.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void s(java.lang.String r11) {
        /*
            r10 = this;
            r0 = 3
            java.lang.String r1 = "4"
            java.lang.String r2 = "3"
            java.lang.String r3 = "2"
            r4 = 2
            r5 = -1
            r6 = 0
            r7 = 1
            r11.getClass()
            int r8 = r11.hashCode()
            switch(r8) {
                case 49: goto L_0x0032;
                case 50: goto L_0x0029;
                case 51: goto L_0x0020;
                case 52: goto L_0x0017;
                default: goto L_0x0015;
            }
        L_0x0015:
            r8 = -1
            goto L_0x003c
        L_0x0017:
            boolean r8 = r11.equals(r1)
            if (r8 != 0) goto L_0x001e
            goto L_0x0015
        L_0x001e:
            r8 = 3
            goto L_0x003c
        L_0x0020:
            boolean r8 = r11.equals(r2)
            if (r8 != 0) goto L_0x0027
            goto L_0x0015
        L_0x0027:
            r8 = 2
            goto L_0x003c
        L_0x0029:
            boolean r8 = r11.equals(r3)
            if (r8 != 0) goto L_0x0030
            goto L_0x0015
        L_0x0030:
            r8 = 1
            goto L_0x003c
        L_0x0032:
            java.lang.String r8 = "1"
            boolean r8 = r11.equals(r8)
            if (r8 != 0) goto L_0x003b
            goto L_0x0015
        L_0x003b:
            r8 = 0
        L_0x003c:
            switch(r8) {
                case 0: goto L_0x0049;
                case 1: goto L_0x0047;
                case 2: goto L_0x0044;
                case 3: goto L_0x0041;
                default: goto L_0x003f;
            }
        L_0x003f:
            r8 = -1
            goto L_0x004a
        L_0x0041:
            r8 = 8
            goto L_0x004a
        L_0x0044:
            r8 = 9
            goto L_0x004a
        L_0x0047:
            r8 = 0
            goto L_0x004a
        L_0x0049:
            r8 = 1
        L_0x004a:
            int r9 = r11.hashCode()
            switch(r9) {
                case 50: goto L_0x0065;
                case 51: goto L_0x005c;
                case 52: goto L_0x0053;
                default: goto L_0x0051;
            }
        L_0x0051:
            r11 = -1
            goto L_0x006d
        L_0x0053:
            boolean r11 = r11.equals(r1)
            if (r11 != 0) goto L_0x005a
            goto L_0x0051
        L_0x005a:
            r11 = 2
            goto L_0x006d
        L_0x005c:
            boolean r11 = r11.equals(r2)
            if (r11 != 0) goto L_0x0063
            goto L_0x0051
        L_0x0063:
            r11 = 1
            goto L_0x006d
        L_0x0065:
            boolean r11 = r11.equals(r3)
            if (r11 != 0) goto L_0x006c
            goto L_0x0051
        L_0x006c:
            r11 = 0
        L_0x006d:
            switch(r11) {
                case 0: goto L_0x0074;
                case 1: goto L_0x0072;
                case 2: goto L_0x0075;
                default: goto L_0x0070;
            }
        L_0x0070:
            r0 = 0
            goto L_0x0075
        L_0x0072:
            r0 = 2
            goto L_0x0075
        L_0x0074:
            r0 = 1
        L_0x0075:
            java.lang.Object r11 = r10.f1138W
            de.ozerov.fully.r3 r11 = (de.ozerov.fully.C0767r3) r11
            if (r11 == 0) goto L_0x0080
            int r1 = r10.f1137V
            if (r1 != r8) goto L_0x0080
            return
        L_0x0080:
            if (r11 == 0) goto L_0x0085
            r10.t()
        L_0x0085:
            de.ozerov.fully.r3 r11 = new de.ozerov.fully.r3
            java.lang.Object r1 = r10.f1139X
            de.ozerov.fully.FullyActivity r1 = (de.ozerov.fully.FullyActivity) r1
            r11.<init>(r1)
            r10.f1138W = r11
            android.widget.FrameLayout r2 = new android.widget.FrameLayout
            r2.<init>(r1)
            r11.h(r2)
            java.lang.Object r11 = r10.f1138W
            de.ozerov.fully.r3 r11 = (de.ozerov.fully.C0767r3) r11
            r11.f10916d = r7
            r11.e = r7
            r11.i = r8
            r11.f10921k = r7
            r11.f10918g = r7
            r11.f10919h = r7
            r2 = 8388661(0x800035, float:1.1755018E-38)
            r11.f10920j = r2
            java.lang.String r2 = "orientationChanger"
            r11.f10926p = r2
            r11.j()
            r10.f1137V = r8
            android.content.ContentResolver r11 = r1.getContentResolver()     // Catch:{ Exception -> 0x00c7 }
            int r1 = de.ozerov.fully.C0794w0.f11027m     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r2 = "user_rotation"
            if (r1 != r5) goto L_0x00c9
            int r1 = android.provider.Settings.System.getInt(r11, r2)     // Catch:{ Exception -> 0x00c7 }
            de.ozerov.fully.C0794w0.f11027m = r1     // Catch:{ Exception -> 0x00c7 }
            goto L_0x00c9
        L_0x00c7:
            r11 = move-exception
            goto L_0x00d2
        L_0x00c9:
            java.lang.String r1 = "accelerometer_rotation"
            android.provider.Settings.System.putInt(r11, r1, r6)     // Catch:{ Exception -> 0x00c7 }
            android.provider.Settings.System.putInt(r11, r2, r0)     // Catch:{ Exception -> 0x00c7 }
            goto L_0x00d5
        L_0x00d2:
            r11.printStackTrace()
        L_0x00d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D2.o.s(java.lang.String):void");
    }

    public void t() {
        C0767r3 r3Var = (C0767r3) this.f1138W;
        if (r3Var != null) {
            r3Var.b();
            this.f1138W = null;
            try {
                ContentResolver contentResolver = ((FullyActivity) this.f1139X).getContentResolver();
                Settings.System.putInt(contentResolver, "accelerometer_rotation", 1);
                Settings.System.putInt(contentResolver, "user_rotation", C0794w0.f11027m);
                C0794w0.f11027m = -1;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public String toString() {
        switch (this.f1136U) {
            case 9:
                StringBuilder sb = new StringBuilder();
                if (((s) this.f1138W) == s.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.f1137V);
                sb.append(' ');
                sb.append((String) this.f1139X);
                String sb2 = sb.toString();
                P6.f.d(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            default:
                return super.toString();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0102  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p1.C1338h w(p1.l r22, long r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            int r2 = r0.f1136U
            switch(r2) {
                case 7: goto L_0x0054;
                default: goto L_0x0009;
            }
        L_0x0009:
            long r7 = r1.f14408X
            long r5 = r21.f(r22)
            long r13 = r22.s()
            java.lang.Object r2 = r0.f1138W
            p1.t r2 = (p1.t) r2
            int r2 = r2.f14425c
            r3 = 6
            int r2 = java.lang.Math.max(r3, r2)
            r3 = 0
            r1.b(r2, r3)
            long r17 = r21.f(r22)
            long r19 = r22.s()
            int r1 = (r5 > r23 ? 1 : (r5 == r23 ? 0 : -1))
            if (r1 > 0) goto L_0x003f
            int r1 = (r17 > r23 ? 1 : (r17 == r23 ? 0 : -1))
            if (r1 <= 0) goto L_0x003f
            p1.h r1 = new p1.h
            r10 = 0
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = r1
            r9.<init>(r10, r11, r13)
            goto L_0x0053
        L_0x003f:
            int r1 = (r17 > r23 ? 1 : (r17 == r23 ? 0 : -1))
            if (r1 > 0) goto L_0x004c
            p1.h r1 = new p1.h
            r16 = -2
            r15 = r1
            r15.<init>(r16, r17, r19)
            goto L_0x0053
        L_0x004c:
            p1.h r1 = new p1.h
            r4 = -1
            r3 = r1
            r3.<init>(r4, r5, r7)
        L_0x0053:
            return r1
        L_0x0054:
            long r6 = r1.f14408X
            r2 = 112800(0x1b8a0, float:1.58066E-40)
            long r2 = (long) r2
            long r4 = r1.f14407W
            long r4 = r4 - r6
            long r2 = java.lang.Math.min(r2, r4)
            int r3 = (int) r2
            java.lang.Object r2 = r0.f1139X
            P0.r r2 = (P0.r) r2
            r2.E(r3)
            byte[] r4 = r2.f3732a
            r5 = 0
            r1.r(r4, r5, r3, r5)
            int r1 = r2.f3734c
            r3 = -1
            r10 = r3
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0079:
            int r5 = r2.a()
            r12 = 188(0xbc, float:2.63E-43)
            if (r5 < r12) goto L_0x0094
            byte[] r5 = r2.f3732a
            int r12 = r2.f3733b
        L_0x0085:
            if (r12 >= r1) goto L_0x0090
            byte r13 = r5[r12]
            r8 = 71
            if (r13 == r8) goto L_0x0090
            int r12 = r12 + 1
            goto L_0x0085
        L_0x0090:
            int r5 = r12 + 188
            if (r5 <= r1) goto L_0x009a
        L_0x0094:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x00f4
        L_0x009a:
            int r3 = r0.f1137V
            long r3 = E.e.t(r2, r12, r3)
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r13 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r13 == 0) goto L_0x00ef
            java.lang.Object r13 = r0.f1138W
            P0.w r13 = (P0.w) r13
            long r18 = r13.b(r3)
            int r3 = (r18 > r23 ? 1 : (r18 == r23 ? 0 : -1))
            if (r3 <= 0) goto L_0x00d2
            int r1 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x00c3
            p1.h r1 = new p1.h
            r3 = -1
            r2 = r1
            r4 = r18
            r2.<init>(r3, r4, r6)
            goto L_0x0104
        L_0x00c3:
            long r12 = r6 + r10
            p1.h r1 = new p1.h
            r9 = 0
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = r1
            r8.<init>(r9, r10, r12)
            goto L_0x0104
        L_0x00d2:
            r3 = 100000(0x186a0, double:4.94066E-319)
            long r3 = r18 + r3
            int r8 = (r3 > r23 ? 1 : (r3 == r23 ? 0 : -1))
            if (r8 <= 0) goto L_0x00eb
            long r1 = (long) r12
            long r12 = r6 + r1
            p1.h r1 = new p1.h
            r9 = 0
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = r1
            r8.<init>(r9, r10, r12)
            goto L_0x0104
        L_0x00eb:
            long r3 = (long) r12
            r10 = r3
            r14 = r18
        L_0x00ef:
            r2.H(r5)
            long r3 = (long) r5
            goto L_0x0079
        L_0x00f4:
            int r5 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r5 == 0) goto L_0x0102
            long r16 = r6 + r3
            p1.h r1 = new p1.h
            r13 = -2
            r12 = r1
            r12.<init>(r13, r14, r16)
            goto L_0x0104
        L_0x0102:
            p1.h r1 = p1.C1338h.f14390d
        L_0x0104:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: D2.o.w(p1.l, long):p1.h");
    }

    public /* synthetic */ o(int i, int i8, Object obj, Object obj2) {
        this.f1136U = i8;
        this.f1137V = i;
        this.f1138W = obj;
        this.f1139X = obj2;
    }

    public /* synthetic */ o(int i, Object obj) {
        this.f1136U = i;
        this.f1139X = obj;
    }

    public /* synthetic */ o(Object obj, int i, String str, int i8) {
        this.f1136U = i8;
        this.f1138W = obj;
        this.f1137V = i;
        this.f1139X = str;
    }

    public o() {
        this.f1136U = 4;
        float[] fArr = {0.0f, 0.0f, 0.0f};
        this.f1138W = fArr;
        this.f1139X = new ArrayList();
        Color.colorToHSV(0, fArr);
        this.f1137V = Color.alpha(0);
    }

    public o(U0.c cVar) {
        this.f1136U = 13;
        this.f1138W = new SparseArray();
        this.f1139X = cVar;
        this.f1137V = -1;
    }

    public o(Shader shader, ColorStateList colorStateList, int i) {
        this.f1136U = 15;
        this.f1138W = shader;
        this.f1139X = colorStateList;
        this.f1137V = i;
    }

    public o(t tVar, int i) {
        this.f1136U = 17;
        this.f1138W = tVar;
        this.f1137V = i;
        this.f1139X = new Object();
    }

    public o(int i, w wVar) {
        this.f1136U = 7;
        this.f1137V = i;
        this.f1138W = wVar;
        this.f1139X = new r();
    }

    public o(g gVar) {
        this.f1136U = 8;
        this.f1139X = C1091d.f12648d0;
        this.f1138W = gVar;
        this.f1137V = 1;
    }

    public o(A.f fVar) {
        this.f1136U = 1;
        this.f1139X = fVar;
        this.f1138W = G3.c.f1638U;
        this.f1137V = Integer.MAX_VALUE;
    }

    public o(int i) {
        this.f1136U = 2;
        this.f1138W = new Object[(i * 2)];
        this.f1137V = 0;
    }

    public o(p pVar) {
        this.f1136U = 0;
        this.f1139X = X2.c.a(150, new A.f(10, (Object) this));
        this.f1138W = pVar;
    }

    public o(C1240e eVar, c1.k kVar, int i, long j7) {
        this.f1136U = 16;
        this.f1139X = eVar;
        this.f1138W = kVar;
        this.f1137V = i;
    }
}
