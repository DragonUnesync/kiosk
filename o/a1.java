package o;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

public final class a1 extends TouchDelegate {

    /* renamed from: a  reason: collision with root package name */
    public final View f13913a;

    /* renamed from: b  reason: collision with root package name */
    public final Rect f13914b;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f13915c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f13916d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f13917f;

    public a1(View view, Rect rect, Rect rect2) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f13914b = rect3;
        Rect rect4 = new Rect();
        this.f13916d = rect4;
        Rect rect5 = new Rect();
        this.f13915c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i = -scaledTouchSlop;
        rect4.inset(i, i);
        rect5.set(rect2);
        this.f13913a = view;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            float r0 = r8.getX()
            int r0 = (int) r0
            float r1 = r8.getY()
            int r1 = (int) r1
            int r2 = r8.getAction()
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 == r5) goto L_0x0022
            if (r2 == r3) goto L_0x0022
            r6 = 3
            if (r2 == r6) goto L_0x001b
            goto L_0x003c
        L_0x001b:
            boolean r2 = r7.f13917f
            r7.f13917f = r4
        L_0x001f:
            r5 = r2
        L_0x0020:
            r2 = 1
            goto L_0x003e
        L_0x0022:
            boolean r2 = r7.f13917f
            if (r2 == 0) goto L_0x001f
            android.graphics.Rect r6 = r7.f13916d
            boolean r6 = r6.contains(r0, r1)
            if (r6 != 0) goto L_0x001f
            r5 = r2
            r2 = 0
            goto L_0x003e
        L_0x0031:
            android.graphics.Rect r2 = r7.f13914b
            boolean r2 = r2.contains(r0, r1)
            if (r2 == 0) goto L_0x003c
            r7.f13917f = r5
            goto L_0x0020
        L_0x003c:
            r2 = 1
            r5 = 0
        L_0x003e:
            if (r5 == 0) goto L_0x006b
            android.graphics.Rect r4 = r7.f13915c
            android.view.View r5 = r7.f13913a
            if (r2 == 0) goto L_0x005c
            boolean r2 = r4.contains(r0, r1)
            if (r2 != 0) goto L_0x005c
            int r0 = r5.getWidth()
            int r0 = r0 / r3
            float r0 = (float) r0
            int r1 = r5.getHeight()
            int r1 = r1 / r3
            float r1 = (float) r1
            r8.setLocation(r0, r1)
            goto L_0x0067
        L_0x005c:
            int r2 = r4.left
            int r0 = r0 - r2
            float r0 = (float) r0
            int r2 = r4.top
            int r1 = r1 - r2
            float r1 = (float) r1
            r8.setLocation(r0, r1)
        L_0x0067:
            boolean r4 = r5.dispatchTouchEvent(r8)
        L_0x006b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.a1.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
