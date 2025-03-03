package g2;

import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import java.util.HashMap;

/* renamed from: g2.f  reason: case insensitive filesystem */
public final class C0953f extends p {

    /* renamed from: A0  reason: collision with root package name */
    public static final C0949b f11939A0;

    /* renamed from: B0  reason: collision with root package name */
    public static final C0949b f11940B0;

    /* renamed from: w0  reason: collision with root package name */
    public static final String[] f11941w0 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: x0  reason: collision with root package name */
    public static final C0949b f11942x0;

    /* renamed from: y0  reason: collision with root package name */
    public static final C0949b f11943y0;

    /* renamed from: z0  reason: collision with root package name */
    public static final C0949b f11944z0;

    static {
        Class<PointF> cls = PointF.class;
        f11942x0 = new C0949b(cls, "topLeft", 0);
        f11943y0 = new C0949b(cls, "bottomRight", 1);
        f11944z0 = new C0949b(cls, "bottomRight", 2);
        f11939A0 = new C0949b(cls, "topLeft", 3);
        f11940B0 = new C0949b(cls, "position", 4);
    }

    public static void L(x xVar) {
        View view = xVar.f12001b;
        if (view.isLaidOut() || view.getWidth() != 0 || view.getHeight() != 0) {
            HashMap hashMap = xVar.f12000a;
            hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            hashMap.put("android:changeBounds:parent", xVar.f12001b.getParent());
        }
    }

    public final void d(x xVar) {
        L(xVar);
    }

    public final void g(x xVar) {
        L(xVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: android.animation.AnimatorSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: android.animation.ObjectAnimator} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator k(android.widget.FrameLayout r19, g2.x r20, g2.x r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            r2 = r21
            if (r1 == 0) goto L_0x000a
            if (r2 != 0) goto L_0x000e
        L_0x000a:
            r1 = r0
            r0 = 0
            goto L_0x0144
        L_0x000e:
            java.util.HashMap r1 = r1.f12000a
            java.util.HashMap r7 = r2.f12000a
            java.lang.String r8 = "android:changeBounds:parent"
            java.lang.Object r9 = r1.get(r8)
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            java.lang.Object r8 = r7.get(r8)
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            if (r9 == 0) goto L_0x0024
            if (r8 != 0) goto L_0x0028
        L_0x0024:
            r1 = r0
            r0 = 0
            goto L_0x0144
        L_0x0028:
            java.lang.String r8 = "android:changeBounds:bounds"
            java.lang.Object r9 = r1.get(r8)
            android.graphics.Rect r9 = (android.graphics.Rect) r9
            java.lang.Object r8 = r7.get(r8)
            android.graphics.Rect r8 = (android.graphics.Rect) r8
            int r10 = r9.left
            int r11 = r8.left
            int r12 = r9.top
            int r13 = r8.top
            int r14 = r9.right
            int r15 = r8.right
            int r9 = r9.bottom
            int r8 = r8.bottom
            int r6 = r14 - r10
            int r4 = r9 - r12
            int r3 = r15 - r11
            int r5 = r8 - r13
            java.lang.String r0 = "android:changeBounds:clip"
            java.lang.Object r1 = r1.get(r0)
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            java.lang.Object r0 = r7.get(r0)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            if (r6 == 0) goto L_0x0060
            if (r4 != 0) goto L_0x0064
        L_0x0060:
            if (r3 == 0) goto L_0x0075
            if (r5 == 0) goto L_0x0075
        L_0x0064:
            if (r10 != r11) goto L_0x006b
            if (r12 == r13) goto L_0x0069
            goto L_0x006b
        L_0x0069:
            r7 = 0
            goto L_0x006c
        L_0x006b:
            r7 = 1
        L_0x006c:
            if (r14 != r15) goto L_0x0070
            if (r9 == r8) goto L_0x0076
        L_0x0070:
            r16 = 1
            int r7 = r7 + 1
            goto L_0x0076
        L_0x0075:
            r7 = 0
        L_0x0076:
            if (r1 == 0) goto L_0x0081
            boolean r17 = r1.equals(r0)
            if (r17 == 0) goto L_0x007f
            goto L_0x0081
        L_0x007f:
            r0 = 1
            goto L_0x0086
        L_0x0081:
            if (r1 != 0) goto L_0x0087
            if (r0 == 0) goto L_0x0087
            goto L_0x007f
        L_0x0086:
            int r7 = r7 + r0
        L_0x0087:
            if (r7 <= 0) goto L_0x0141
            android.view.View r0 = r2.f12001b
            g2.z.a(r0, r10, r12, r14, r9)
            r1 = 2
            if (r7 != r1) goto L_0x00f4
            if (r6 != r3) goto L_0x00ac
            if (r4 != r5) goto L_0x00ac
            r1 = r18
            a1.a r2 = r1.p0
            float r3 = (float) r10
            float r4 = (float) r12
            float r5 = (float) r11
            float r6 = (float) r13
            r2.getClass()
            android.graphics.Path r2 = a1.C0410a.p(r3, r4, r5, r6)
            g2.b r3 = f11940B0
            android.animation.ObjectAnimator r2 = g2.C0956i.a(r0, r3, r2)
            goto L_0x0122
        L_0x00ac:
            r1 = r18
            g2.e r2 = new g2.e
            r2.<init>(r0)
            a1.a r3 = r1.p0
            float r4 = (float) r10
            float r5 = (float) r12
            float r6 = (float) r11
            float r7 = (float) r13
            r3.getClass()
            android.graphics.Path r3 = a1.C0410a.p(r4, r5, r6, r7)
            g2.b r4 = f11942x0
            android.animation.ObjectAnimator r3 = g2.C0956i.a(r2, r4, r3)
            a1.a r4 = r1.p0
            float r5 = (float) r14
            float r6 = (float) r9
            float r7 = (float) r15
            float r8 = (float) r8
            r4.getClass()
            android.graphics.Path r4 = a1.C0410a.p(r5, r6, r7, r8)
            g2.b r5 = f11943y0
            android.animation.ObjectAnimator r4 = g2.C0956i.a(r2, r5, r4)
            android.animation.AnimatorSet r5 = new android.animation.AnimatorSet
            r5.<init>()
            r6 = 2
            android.animation.Animator[] r6 = new android.animation.Animator[r6]
            r7 = 0
            r6[r7] = r3
            r3 = 1
            r6[r3] = r4
            r5.playTogether(r6)
            g2.c r3 = new g2.c
            r3.<init>(r2)
            r5.addListener(r3)
            r2 = r5
            goto L_0x0122
        L_0x00f4:
            r1 = r18
            if (r10 != r11) goto L_0x010f
            if (r12 == r13) goto L_0x00fb
            goto L_0x010f
        L_0x00fb:
            a1.a r2 = r1.p0
            float r3 = (float) r14
            float r4 = (float) r9
            float r5 = (float) r15
            float r6 = (float) r8
            r2.getClass()
            android.graphics.Path r2 = a1.C0410a.p(r3, r4, r5, r6)
            g2.b r3 = f11944z0
            android.animation.ObjectAnimator r2 = g2.C0956i.a(r0, r3, r2)
            goto L_0x0122
        L_0x010f:
            a1.a r2 = r1.p0
            float r3 = (float) r10
            float r4 = (float) r12
            float r5 = (float) r11
            float r6 = (float) r13
            r2.getClass()
            android.graphics.Path r2 = a1.C0410a.p(r3, r4, r5, r6)
            g2.b r3 = f11939A0
            android.animation.ObjectAnimator r2 = g2.C0956i.a(r0, r3, r2)
        L_0x0122:
            android.view.ViewParent r3 = r0.getParent()
            boolean r3 = r3 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x0140
            android.view.ViewParent r0 = r0.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r3 = 1
            R.e.u(r0, r3)
            g2.p r3 = r18.o()
            g2.d r4 = new g2.d
            r4.<init>(r0)
            r3.a(r4)
        L_0x0140:
            return r2
        L_0x0141:
            r1 = r18
            r0 = 0
        L_0x0144:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.C0953f.k(android.widget.FrameLayout, g2.x, g2.x):android.animation.Animator");
    }

    public final String[] q() {
        return f11941w0;
    }
}
