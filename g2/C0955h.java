package g2;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.HashMap;

/* renamed from: g2.h  reason: case insensitive filesystem */
public final class C0955h extends p {

    /* renamed from: x0  reason: collision with root package name */
    public static final String[] f11947x0 = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: w0  reason: collision with root package name */
    public final int f11948w0;

    public C0955h(int i) {
        this();
        this.f11948w0 = i;
    }

    public static void L(x xVar) {
        int visibility = xVar.f12001b.getVisibility();
        HashMap hashMap = xVar.f12000a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = xVar.f12001b;
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    public static float N(x xVar, float f8) {
        Float f9;
        if (xVar == null || (f9 = (Float) xVar.f12000a.get("android:fade:transitionAlpha")) == null) {
            return f8;
        }
        return f9.floatValue();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [g2.J, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0095 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static g2.J O(g2.x r8, g2.x r9) {
        /*
            g2.J r0 = new g2.J
            r0.<init>()
            r1 = 0
            r0.f11920a = r1
            r0.f11921b = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L_0x002f
            java.util.HashMap r6 = r8.f12000a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L_0x002f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f11922c = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.e = r6
            goto L_0x0033
        L_0x002f:
            r0.f11922c = r3
            r0.e = r2
        L_0x0033:
            if (r9 == 0) goto L_0x0052
            java.util.HashMap r6 = r9.f12000a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L_0x0052
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.f11923d = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f11924f = r2
            goto L_0x0056
        L_0x0052:
            r0.f11923d = r3
            r0.f11924f = r2
        L_0x0056:
            r2 = 1
            if (r8 == 0) goto L_0x008a
            if (r9 == 0) goto L_0x008a
            int r8 = r0.f11922c
            int r9 = r0.f11923d
            if (r8 != r9) goto L_0x0068
            android.view.ViewGroup r3 = r0.e
            android.view.ViewGroup r4 = r0.f11924f
            if (r3 != r4) goto L_0x0068
            return r0
        L_0x0068:
            if (r8 == r9) goto L_0x0078
            if (r8 != 0) goto L_0x0071
            r0.f11921b = r1
            r0.f11920a = r2
            goto L_0x009f
        L_0x0071:
            if (r9 != 0) goto L_0x009f
            r0.f11921b = r2
            r0.f11920a = r2
            goto L_0x009f
        L_0x0078:
            android.view.ViewGroup r8 = r0.f11924f
            if (r8 != 0) goto L_0x0081
            r0.f11921b = r1
            r0.f11920a = r2
            goto L_0x009f
        L_0x0081:
            android.view.ViewGroup r8 = r0.e
            if (r8 != 0) goto L_0x009f
            r0.f11921b = r2
            r0.f11920a = r2
            goto L_0x009f
        L_0x008a:
            if (r8 != 0) goto L_0x0095
            int r8 = r0.f11923d
            if (r8 != 0) goto L_0x0095
            r0.f11921b = r2
            r0.f11920a = r2
            goto L_0x009f
        L_0x0095:
            if (r9 != 0) goto L_0x009f
            int r8 = r0.f11922c
            if (r8 != 0) goto L_0x009f
            r0.f11921b = r1
            r0.f11920a = r2
        L_0x009f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.C0955h.O(g2.x, g2.x):g2.J");
    }

    public final ObjectAnimator M(View view, float f8, float f9) {
        if (f8 == f9) {
            return null;
        }
        z.f12003a.w(view, f8);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, z.f12004b, new float[]{f9});
        C0954g gVar = new C0954g(view);
        ofFloat.addListener(gVar);
        o().a(gVar);
        return ofFloat;
    }

    public final void d(x xVar) {
        L(xVar);
    }

    public final void g(x xVar) {
        L(xVar);
        View view = xVar.f12001b;
        Float f8 = (Float) view.getTag(2131362594);
        if (f8 == null) {
            if (view.getVisibility() == 0) {
                f8 = Float.valueOf(z.f12003a.r(view));
            } else {
                f8 = Float.valueOf(0.0f);
            }
        }
        xVar.f12000a.put("android:fade:transitionAlpha", f8);
    }

    /* JADX WARNING: type inference failed for: r16v8, types: [android.view.ViewParent] */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        if (O(n(r3, false), r(r3, false)).f11920a != false) goto L_0x0049;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator k(android.widget.FrameLayout r21, g2.x r22, g2.x r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            int r4 = r0.f11948w0
            g2.J r5 = O(r22, r23)
            boolean r6 = r5.f11920a
            if (r6 == 0) goto L_0x001b
            android.view.ViewGroup r6 = r5.e
            if (r6 != 0) goto L_0x001f
            android.view.ViewGroup r6 = r5.f11924f
            if (r6 == 0) goto L_0x001b
            goto L_0x001f
        L_0x001b:
            r4 = r0
            r0 = 0
            goto L_0x02c7
        L_0x001f:
            boolean r6 = r5.f11921b
            r8 = 0
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = 0
            r11 = 1
            if (r6 == 0) goto L_0x0059
            r1 = r4 & 1
            if (r1 != r11) goto L_0x0049
            if (r3 != 0) goto L_0x002f
            goto L_0x0049
        L_0x002f:
            android.view.View r1 = r3.f12001b
            if (r2 != 0) goto L_0x004b
            android.view.ViewParent r3 = r1.getParent()
            android.view.View r3 = (android.view.View) r3
            g2.x r4 = r0.n(r3, r10)
            g2.x r3 = r0.r(r3, r10)
            g2.J r3 = O(r4, r3)
            boolean r3 = r3.f11920a
            if (r3 == 0) goto L_0x004b
        L_0x0049:
            r7 = 0
            goto L_0x0058
        L_0x004b:
            a1.a r3 = g2.z.f12003a
            r3.getClass()
            float r2 = N(r2, r8)
            android.animation.ObjectAnimator r7 = r0.M(r1, r2, r9)
        L_0x0058:
            return r7
        L_0x0059:
            int r5 = r5.f11923d
            r6 = 2
            r4 = r4 & r6
            if (r4 == r6) goto L_0x0063
        L_0x005f:
            r4 = r0
        L_0x0060:
            r7 = 0
            goto L_0x02c6
        L_0x0063:
            if (r2 != 0) goto L_0x0066
            goto L_0x005f
        L_0x0066:
            if (r3 == 0) goto L_0x006b
            android.view.View r4 = r3.f12001b
            goto L_0x006c
        L_0x006b:
            r4 = 0
        L_0x006c:
            android.view.View r12 = r2.f12001b
            r13 = 2131362433(0x7f0a0281, float:1.8344646E38)
            java.lang.Object r14 = r12.getTag(r13)
            android.view.View r14 = (android.view.View) r14
            if (r14 == 0) goto L_0x007f
            r18 = r5
            r7 = 0
            r10 = 1
            goto L_0x020a
        L_0x007f:
            if (r4 == 0) goto L_0x0096
            android.view.ViewParent r14 = r4.getParent()
            if (r14 != 0) goto L_0x0088
            goto L_0x0096
        L_0x0088:
            r14 = 4
            if (r5 != r14) goto L_0x008c
            goto L_0x008e
        L_0x008c:
            if (r12 != r4) goto L_0x0092
        L_0x008e:
            r14 = r4
            r4 = 0
        L_0x0090:
            r15 = 0
            goto L_0x009a
        L_0x0092:
            r4 = 0
            r14 = 0
            r15 = 1
            goto L_0x009a
        L_0x0096:
            if (r4 == 0) goto L_0x0092
            r14 = 0
            goto L_0x0090
        L_0x009a:
            if (r15 == 0) goto L_0x0204
            android.view.ViewParent r15 = r12.getParent()
            if (r15 != 0) goto L_0x00a8
            r18 = r5
            r7 = r14
            r14 = r12
            goto L_0x020a
        L_0x00a8:
            android.view.ViewParent r15 = r12.getParent()
            boolean r15 = r15 instanceof android.view.View
            if (r15 == 0) goto L_0x0204
            android.view.ViewParent r15 = r12.getParent()
            android.view.View r15 = (android.view.View) r15
            g2.x r7 = r0.r(r15, r11)
            g2.x r13 = r0.n(r15, r11)
            g2.J r7 = O(r7, r13)
            boolean r7 = r7.f11920a
            if (r7 != 0) goto L_0x01ef
            boolean r4 = g2.w.f11999a
            android.graphics.Matrix r4 = new android.graphics.Matrix
            r4.<init>()
            int r7 = r15.getScrollX()
            int r7 = -r7
            float r7 = (float) r7
            int r13 = r15.getScrollY()
            int r13 = -r13
            float r13 = (float) r13
            r4.setTranslate(r7, r13)
            a1.a r7 = g2.z.f12003a
            r7.z(r12, r4)
            r7.A(r1, r4)
            android.graphics.RectF r7 = new android.graphics.RectF
            int r13 = r12.getWidth()
            float r13 = (float) r13
            int r15 = r12.getHeight()
            float r15 = (float) r15
            r7.<init>(r8, r8, r13, r15)
            r4.mapRect(r7)
            float r13 = r7.left
            int r13 = java.lang.Math.round(r13)
            float r15 = r7.top
            int r15 = java.lang.Math.round(r15)
            float r8 = r7.right
            int r8 = java.lang.Math.round(r8)
            float r6 = r7.bottom
            int r6 = java.lang.Math.round(r6)
            android.widget.ImageView r11 = new android.widget.ImageView
            android.content.Context r10 = r12.getContext()
            r11.<init>(r10)
            android.widget.ImageView$ScaleType r10 = android.widget.ImageView.ScaleType.CENTER_CROP
            r11.setScaleType(r10)
            boolean r10 = r12.isAttachedToWindow()
            if (r1 == 0) goto L_0x012b
            boolean r16 = r21.isAttachedToWindow()
            if (r16 == 0) goto L_0x012b
            r16 = 1
            goto L_0x012d
        L_0x012b:
            r16 = 0
        L_0x012d:
            if (r10 != 0) goto L_0x0156
            if (r16 != 0) goto L_0x0138
            r18 = r5
            r16 = r14
            r0 = 0
            goto L_0x01d1
        L_0x0138:
            android.view.ViewParent r16 = r12.getParent()
            r9 = r16
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            int r16 = r9.indexOfChild(r12)
            r17 = r9
            android.view.ViewGroupOverlay r9 = r21.getOverlay()
            r9.add(r12)
            r9 = r17
            r19 = r16
            r16 = r14
            r14 = r19
            goto L_0x015a
        L_0x0156:
            r16 = r14
            r9 = 0
            r14 = 0
        L_0x015a:
            float r17 = r7.width()
            r18 = r5
            int r5 = java.lang.Math.round(r17)
            float r17 = r7.height()
            int r3 = java.lang.Math.round(r17)
            if (r5 <= 0) goto L_0x01c4
            if (r3 <= 0) goto L_0x01c4
            int r0 = r5 * r3
            float r0 = (float) r0
            r17 = 1233125376(0x49800000, float:1048576.0)
            float r0 = r17 / r0
            r2 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.min(r2, r0)
            float r2 = (float) r5
            float r2 = r2 * r0
            int r2 = java.lang.Math.round(r2)
            float r3 = (float) r3
            float r3 = r3 * r0
            int r3 = java.lang.Math.round(r3)
            float r5 = r7.left
            float r5 = -r5
            float r7 = r7.top
            float r7 = -r7
            r4.postTranslate(r5, r7)
            r4.postScale(r0, r0)
            boolean r0 = g2.w.f11999a
            if (r0 == 0) goto L_0x01b2
            android.graphics.Picture r0 = new android.graphics.Picture
            r0.<init>()
            android.graphics.Canvas r2 = r0.beginRecording(r2, r3)
            r2.concat(r4)
            r12.draw(r2)
            r0.endRecording()
            android.graphics.Bitmap r0 = g2.v.a(r0)
            goto L_0x01c5
        L_0x01b2:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2, r3, r0)
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r0)
            r2.concat(r4)
            r12.draw(r2)
            goto L_0x01c5
        L_0x01c4:
            r0 = 0
        L_0x01c5:
            if (r10 != 0) goto L_0x01d1
            android.view.ViewGroupOverlay r2 = r21.getOverlay()
            r2.remove(r12)
            r9.addView(r12, r14)
        L_0x01d1:
            if (r0 == 0) goto L_0x01d6
            r11.setImageBitmap(r0)
        L_0x01d6:
            int r0 = r8 - r13
            r2 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            int r3 = r6 - r15
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
            r11.measure(r0, r2)
            r11.layout(r13, r15, r8, r6)
            r14 = r11
        L_0x01eb:
            r7 = r16
            r10 = 0
            goto L_0x020a
        L_0x01ef:
            r18 = r5
            r16 = r14
            int r0 = r15.getId()
            android.view.ViewParent r2 = r15.getParent()
            if (r2 != 0) goto L_0x0208
            r2 = -1
            if (r0 == r2) goto L_0x0208
            r1.findViewById(r0)
            goto L_0x0208
        L_0x0204:
            r18 = r5
            r16 = r14
        L_0x0208:
            r14 = r4
            goto L_0x01eb
        L_0x020a:
            if (r14 == 0) goto L_0x0285
            r0 = r22
            if (r10 != 0) goto L_0x0243
            java.util.HashMap r2 = r0.f12000a
            java.lang.String r3 = "android:visibility:screenLocation"
            java.lang.Object r2 = r2.get(r3)
            int[] r2 = (int[]) r2
            r3 = 0
            r4 = r2[r3]
            r5 = 1
            r2 = r2[r5]
            r6 = 2
            int[] r6 = new int[r6]
            r1.getLocationOnScreen(r6)
            r3 = r6[r3]
            int r4 = r4 - r3
            int r3 = r14.getLeft()
            int r4 = r4 - r3
            r14.offsetLeftAndRight(r4)
            r3 = r6[r5]
            int r2 = r2 - r3
            int r3 = r14.getTop()
            int r2 = r2 - r3
            r14.offsetTopAndBottom(r2)
            android.view.ViewGroupOverlay r2 = r21.getOverlay()
            r2.add(r14)
        L_0x0243:
            a1.a r2 = g2.z.f12003a
            r2.getClass()
            r3 = 1065353216(0x3f800000, float:1.0)
            float r0 = N(r0, r3)
            r5 = 0
            r4 = r20
            android.animation.ObjectAnimator r7 = r4.M(r14, r0, r5)
            if (r7 != 0) goto L_0x0260
            r5 = r23
            float r0 = N(r5, r3)
            r2.w(r14, r0)
        L_0x0260:
            if (r10 != 0) goto L_0x02c6
            if (r7 != 0) goto L_0x026c
            android.view.ViewGroupOverlay r0 = r21.getOverlay()
            r0.remove(r14)
            goto L_0x02c6
        L_0x026c:
            r0 = 2131362433(0x7f0a0281, float:1.8344646E38)
            r12.setTag(r0, r14)
            g2.I r0 = new g2.I
            r0.<init>(r4, r1, r14, r12)
            r7.addListener(r0)
            r7.addPauseListener(r0)
            g2.p r1 = r20.o()
            r1.a(r0)
            goto L_0x02c6
        L_0x0285:
            r4 = r20
            r0 = r22
            r5 = r23
            if (r7 == 0) goto L_0x0060
            int r1 = r7.getVisibility()
            r2 = 0
            g2.z.b(r7, r2)
            a1.a r2 = g2.z.f12003a
            r2.getClass()
            r3 = 1065353216(0x3f800000, float:1.0)
            float r0 = N(r0, r3)
            r6 = 0
            android.animation.ObjectAnimator r0 = r4.M(r7, r0, r6)
            if (r0 != 0) goto L_0x02ae
            float r3 = N(r5, r3)
            r2.w(r7, r3)
        L_0x02ae:
            if (r0 == 0) goto L_0x02c2
            g2.H r1 = new g2.H
            r2 = r18
            r1.<init>(r7, r2)
            r0.addListener(r1)
            g2.p r2 = r20.o()
            r2.a(r1)
            goto L_0x02c5
        L_0x02c2:
            g2.z.b(r7, r1)
        L_0x02c5:
            r7 = r0
        L_0x02c6:
            return r7
        L_0x02c7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.C0955h.k(android.widget.FrameLayout, g2.x, g2.x):android.animation.Animator");
    }

    public final String[] q() {
        return f11947x0;
    }

    public final boolean t(x xVar, x xVar2) {
        if (xVar == null && xVar2 == null) {
            return false;
        }
        if (xVar != null && xVar2 != null && xVar2.f12000a.containsKey("android:visibility:visibility") != xVar.f12000a.containsKey("android:visibility:visibility")) {
            return false;
        }
        J O8 = O(xVar, xVar2);
        if (!O8.f11920a) {
            return false;
        }
        if (O8.f11922c == 0 || O8.f11923d == 0) {
            return true;
        }
        return false;
    }

    public C0955h() {
        this.f11948w0 = 3;
    }
}
