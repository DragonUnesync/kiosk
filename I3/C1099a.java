package i3;

import B3.f;
import B3.k;
import B3.q;
import R.e;
import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;
import v0.C1510H;

/* renamed from: i3.a  reason: case insensitive filesystem */
public final class C1099a extends e {

    /* renamed from: c  reason: collision with root package name */
    public int f12722c;

    /* renamed from: d  reason: collision with root package name */
    public int f12723d = -1;
    public final /* synthetic */ SwipeDismissBehavior e;

    public C1099a(SwipeDismissBehavior swipeDismissBehavior) {
        this.e = swipeDismissBehavior;
    }

    public final int b(View view, int i) {
        boolean z;
        int i8;
        int i9;
        int width;
        WeakHashMap weakHashMap = C1510H.f15874a;
        if (view.getLayoutDirection() == 1) {
            z = true;
        } else {
            z = false;
        }
        int i10 = this.e.e;
        if (i10 != 0) {
            if (i10 != 1) {
                i9 = this.f12722c - view.getWidth();
                i8 = view.getWidth() + this.f12722c;
            } else if (z) {
                i9 = this.f12722c;
                width = view.getWidth();
            } else {
                i9 = this.f12722c - view.getWidth();
                i8 = this.f12722c;
            }
            return Math.min(Math.max(i9, i), i8);
        } else if (z) {
            i9 = this.f12722c - view.getWidth();
            i8 = this.f12722c;
            return Math.min(Math.max(i9, i), i8);
        } else {
            i9 = this.f12722c;
            width = view.getWidth();
        }
        i8 = width + i9;
        return Math.min(Math.max(i9, i), i8);
    }

    public final int c(View view, int i) {
        return view.getTop();
    }

    public final int j(View view) {
        return view.getWidth();
    }

    public final void o(View view, int i) {
        this.f12723d = i;
        this.f12722c = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.e;
            swipeDismissBehavior.f9159d = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f9159d = false;
        }
    }

    public final void p(int i) {
        f fVar = this.e.f9157b;
        if (fVar != null) {
            k kVar = fVar.f398U;
            if (i == 0) {
                q.K().h0(kVar.f435t);
            } else if (i == 1 || i == 2) {
                q.K().Y(kVar.f435t);
            }
        }
    }

    public final void q(View view, int i, int i8) {
        SwipeDismissBehavior swipeDismissBehavior = this.e;
        float width = ((float) view.getWidth()) * swipeDismissBehavior.f9160f;
        float width2 = ((float) view.getWidth()) * swipeDismissBehavior.f9161g;
        float abs = (float) Math.abs(i - this.f12722c);
        if (abs <= width) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - width) / (width2 - width))), 1.0f));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0054, code lost:
        if (java.lang.Math.abs(r5) >= java.lang.Math.round(((float) r9.getWidth()) * 0.5f)) goto L_0x0056;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0084  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = 2
            r0 = -1
            r8.f12723d = r0
            int r0 = r9.getWidth()
            r1 = 0
            r2 = 1
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r8.e
            r4 = 0
            int r5 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r5 == 0) goto L_0x0039
            java.util.WeakHashMap r6 = v0.C1510H.f15874a
            int r6 = r9.getLayoutDirection()
            if (r6 != r2) goto L_0x001b
            r6 = 1
            goto L_0x001c
        L_0x001b:
            r6 = 0
        L_0x001c:
            int r7 = r3.e
            if (r7 != r11) goto L_0x0021
            goto L_0x0056
        L_0x0021:
            if (r7 != 0) goto L_0x002d
            if (r6 == 0) goto L_0x002a
            int r5 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r5 >= 0) goto L_0x006a
            goto L_0x0056
        L_0x002a:
            if (r5 <= 0) goto L_0x006a
            goto L_0x0056
        L_0x002d:
            if (r7 != r2) goto L_0x006a
            if (r6 == 0) goto L_0x0034
            if (r5 <= 0) goto L_0x006a
            goto L_0x0056
        L_0x0034:
            int r5 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r5 >= 0) goto L_0x006a
            goto L_0x0056
        L_0x0039:
            int r5 = r9.getLeft()
            int r6 = r8.f12722c
            int r5 = r5 - r6
            int r6 = r9.getWidth()
            float r6 = (float) r6
            r3.getClass()
            r7 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 * r7
            int r6 = java.lang.Math.round(r6)
            int r5 = java.lang.Math.abs(r5)
            if (r5 < r6) goto L_0x006a
        L_0x0056:
            int r10 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r10 < 0) goto L_0x0065
            int r10 = r9.getLeft()
            int r1 = r8.f12722c
            if (r10 >= r1) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            int r1 = r1 + r0
            goto L_0x006d
        L_0x0065:
            int r10 = r8.f12722c
            int r1 = r10 - r0
            goto L_0x006d
        L_0x006a:
            int r1 = r8.f12722c
            r2 = 0
        L_0x006d:
            C0.f r10 = r3.f9156a
            int r0 = r9.getTop()
            boolean r10 = r10.o(r1, r0)
            if (r10 == 0) goto L_0x0084
            P5.M r10 = new P5.M
            r10.<init>(r11, r3, r9, r2)
            java.util.WeakHashMap r11 = v0.C1510H.f15874a
            r9.postOnAnimation(r10)
            goto L_0x008d
        L_0x0084:
            if (r2 == 0) goto L_0x008d
            B3.f r10 = r3.f9157b
            if (r10 == 0) goto L_0x008d
            r10.a(r9)
        L_0x008d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.C1099a.r(android.view.View, float, float):void");
    }

    public final boolean w(View view, int i) {
        int i8 = this.f12723d;
        if ((i8 == -1 || i8 == i) && this.e.r(view)) {
            return true;
        }
        return false;
    }
}
