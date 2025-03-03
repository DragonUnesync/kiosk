package z3;

import B.Q;
import B.q0;
import B2.f;
import B2.g;
import B6.a;
import D.C0068w;
import D.K;
import D.y0;
import D2.C;
import E2.b;
import F2.i;
import H2.q;
import H2.r;
import H2.w;
import H2.y;
import T5.M;
import android.graphics.Bitmap;
import android.graphics.Rect;
import com.samsung.android.knox.EnterpriseDeviceManager;
import java.io.File;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import r.C1366a;

public class e implements g, a, C0068w, X2.a, b, F2.a, C1366a, r {

    /* renamed from: V  reason: collision with root package name */
    public static e f16452V;

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f16453U;

    public /* synthetic */ e(int i) {
        this.f16453U = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0045, code lost:
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0075, code lost:
        if (r11 != false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0082, code lost:
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L_0x0085;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m(E0.b r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            r0 = 0
            if (r8 == 0) goto L_0x00ef
            if (r9 < 0) goto L_0x00ef
            if (r10 >= 0) goto L_0x0009
            goto L_0x00ef
        L_0x0009:
            int r1 = android.text.Selection.getSelectionStart(r8)
            int r2 = android.text.Selection.getSelectionEnd(r8)
            r3 = -1
            if (r1 == r3) goto L_0x00ef
            if (r2 == r3) goto L_0x00ef
            if (r1 == r2) goto L_0x001a
            goto L_0x00ef
        L_0x001a:
            r4 = 1
            if (r11 == 0) goto L_0x00a5
            int r9 = java.lang.Math.max(r9, r0)
            int r11 = r8.length()
            if (r1 < 0) goto L_0x002c
            if (r11 >= r1) goto L_0x002a
            goto L_0x002c
        L_0x002a:
            if (r9 >= 0) goto L_0x002e
        L_0x002c:
            r1 = -1
            goto L_0x005d
        L_0x002e:
            r11 = 0
        L_0x002f:
            if (r9 != 0) goto L_0x0032
            goto L_0x005d
        L_0x0032:
            int r1 = r1 + -1
            if (r1 >= 0) goto L_0x003b
            if (r11 == 0) goto L_0x0039
            goto L_0x002c
        L_0x0039:
            r1 = 0
            goto L_0x005d
        L_0x003b:
            char r5 = r8.charAt(r1)
            if (r11 == 0) goto L_0x004b
            boolean r11 = java.lang.Character.isHighSurrogate(r5)
            if (r11 != 0) goto L_0x0048
            goto L_0x002c
        L_0x0048:
            int r9 = r9 + -1
            goto L_0x002e
        L_0x004b:
            boolean r6 = java.lang.Character.isSurrogate(r5)
            if (r6 != 0) goto L_0x0054
            int r9 = r9 + -1
            goto L_0x002f
        L_0x0054:
            boolean r11 = java.lang.Character.isHighSurrogate(r5)
            if (r11 == 0) goto L_0x005b
            goto L_0x002c
        L_0x005b:
            r11 = 1
            goto L_0x002f
        L_0x005d:
            int r9 = java.lang.Math.max(r10, r0)
            int r10 = r8.length()
            if (r2 < 0) goto L_0x006c
            if (r10 >= r2) goto L_0x006a
            goto L_0x006c
        L_0x006a:
            if (r9 >= 0) goto L_0x006e
        L_0x006c:
            r10 = -1
            goto L_0x00a0
        L_0x006e:
            r11 = 0
        L_0x006f:
            if (r9 != 0) goto L_0x0073
            r10 = r2
            goto L_0x00a0
        L_0x0073:
            if (r2 < r10) goto L_0x0078
            if (r11 == 0) goto L_0x00a0
            goto L_0x006c
        L_0x0078:
            char r5 = r8.charAt(r2)
            if (r11 == 0) goto L_0x008a
            boolean r11 = java.lang.Character.isLowSurrogate(r5)
            if (r11 != 0) goto L_0x0085
            goto L_0x006c
        L_0x0085:
            int r9 = r9 + -1
            int r2 = r2 + 1
            goto L_0x006e
        L_0x008a:
            boolean r6 = java.lang.Character.isSurrogate(r5)
            if (r6 != 0) goto L_0x0095
            int r9 = r9 + -1
            int r2 = r2 + 1
            goto L_0x006f
        L_0x0095:
            boolean r11 = java.lang.Character.isLowSurrogate(r5)
            if (r11 == 0) goto L_0x009c
            goto L_0x006c
        L_0x009c:
            int r2 = r2 + 1
            r11 = 1
            goto L_0x006f
        L_0x00a0:
            if (r1 == r3) goto L_0x00ef
            if (r10 != r3) goto L_0x00b3
            goto L_0x00ef
        L_0x00a5:
            int r1 = r1 - r9
            int r1 = java.lang.Math.max(r1, r0)
            int r2 = r2 + r10
            int r9 = r8.length()
            int r10 = java.lang.Math.min(r2, r9)
        L_0x00b3:
            java.lang.Class<androidx.emoji2.text.v> r9 = androidx.emoji2.text.v.class
            java.lang.Object[] r9 = r8.getSpans(r1, r10, r9)
            androidx.emoji2.text.v[] r9 = (androidx.emoji2.text.v[]) r9
            if (r9 == 0) goto L_0x00ef
            int r11 = r9.length
            if (r11 <= 0) goto L_0x00ef
            int r11 = r9.length
            r2 = 0
        L_0x00c2:
            if (r2 >= r11) goto L_0x00d9
            r3 = r9[r2]
            int r5 = r8.getSpanStart(r3)
            int r3 = r8.getSpanEnd(r3)
            int r1 = java.lang.Math.min(r5, r1)
            int r10 = java.lang.Math.max(r3, r10)
            int r2 = r2 + 1
            goto L_0x00c2
        L_0x00d9:
            int r9 = java.lang.Math.max(r1, r0)
            int r11 = r8.length()
            int r10 = java.lang.Math.min(r10, r11)
            r7.beginBatchEdit()
            r8.delete(r9, r10)
            r7.endBatchEdit()
            r0 = 1
        L_0x00ef:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.e.m(E0.b, android.text.Editable, int, int, boolean):boolean");
    }

    public void D() {
    }

    public /* synthetic */ void K(Q q7) {
    }

    public Rect O() {
        return new Rect();
    }

    public void V(int i) {
    }

    public void a(y0 y0Var) {
    }

    public Object apply(Object obj) {
        return obj;
    }

    public File b(f fVar) {
        return null;
    }

    public void c(byte[] bArr, Object obj, MessageDigest messageDigest) {
    }

    public void clear() {
    }

    public Object d() {
        switch (this.f16453U) {
            case EnterpriseDeviceManager.KNOX_2_6:
                return new C();
            default:
                try {
                    return new i(MessageDigest.getInstance("SHA-256"));
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(e);
                }
        }
    }

    public Bitmap e(int i, int i8, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i8, config);
    }

    public K f() {
        return null;
    }

    public Bitmap g(int i, int i8, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i8, config);
    }

    public Object get() {
        switch (this.f16453U) {
            case 13:
                return new C4.a();
            default:
                return new M();
        }
    }

    public void h(Bitmap bitmap) {
        bitmap.recycle();
    }

    public void i(f fVar, q0 q0Var) {
    }

    public void j(K k8) {
    }

    public void k(int i) {
    }

    public void l() {
    }

    public q m0(w wVar) {
        return new y(wVar.b(H2.g.class, InputStream.class), 1);
    }
}
