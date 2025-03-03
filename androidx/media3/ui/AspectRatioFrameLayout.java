package androidx.media3.ui;

import Y1.C;
import Y1.C0368a;
import Y1.C0369b;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: a0  reason: collision with root package name */
    public static final /* synthetic */ int f8205a0 = 0;

    /* renamed from: U  reason: collision with root package name */
    public final C0369b f8206U;

    /* renamed from: V  reason: collision with root package name */
    public float f8207V;

    /* renamed from: W  reason: collision with root package name */
    public int f8208W = 0;

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C.f6321a, 0, 0);
            try {
                this.f8208W = obtainStyledAttributes.getInt(0, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f8206U = new C0369b(this);
    }

    public int getResizeMode() {
        return this.f8208W;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            super.onMeasure(r9, r10)
            float r9 = r8.f8207V
            r10 = 0
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 > 0) goto L_0x000b
            return
        L_0x000b:
            int r9 = r8.getMeasuredWidth()
            int r0 = r8.getMeasuredHeight()
            float r1 = (float) r9
            float r2 = (float) r0
            float r3 = r1 / r2
            float r4 = r8.f8207V
            float r4 = r4 / r3
            r3 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 - r3
            float r3 = java.lang.Math.abs(r4)
            r5 = 1
            r6 = 1008981770(0x3c23d70a, float:0.01)
            Y1.b r7 = r8.f8206U
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 > 0) goto L_0x0039
            boolean r9 = r7.f6378V
            if (r9 != 0) goto L_0x0038
            r7.f6378V = r5
            java.lang.Object r9 = r7.f6379W
            androidx.media3.ui.AspectRatioFrameLayout r9 = (androidx.media3.ui.AspectRatioFrameLayout) r9
            r9.post(r7)
        L_0x0038:
            return
        L_0x0039:
            int r3 = r8.f8208W
            if (r3 == 0) goto L_0x005b
            if (r3 == r5) goto L_0x0058
            r6 = 2
            if (r3 == r6) goto L_0x0055
            r6 = 4
            if (r3 == r6) goto L_0x0046
            goto L_0x0065
        L_0x0046:
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r10 <= 0) goto L_0x0050
            float r9 = r8.f8207V
        L_0x004c:
            float r2 = r2 * r9
            int r9 = (int) r2
            goto L_0x0065
        L_0x0050:
            float r10 = r8.f8207V
        L_0x0052:
            float r1 = r1 / r10
            int r0 = (int) r1
            goto L_0x0065
        L_0x0055:
            float r9 = r8.f8207V
            goto L_0x004c
        L_0x0058:
            float r10 = r8.f8207V
            goto L_0x0052
        L_0x005b:
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r10 <= 0) goto L_0x0062
            float r10 = r8.f8207V
            goto L_0x0052
        L_0x0062:
            float r9 = r8.f8207V
            goto L_0x004c
        L_0x0065:
            boolean r10 = r7.f6378V
            if (r10 != 0) goto L_0x0072
            r7.f6378V = r5
            java.lang.Object r10 = r7.f6379W
            androidx.media3.ui.AspectRatioFrameLayout r10 = (androidx.media3.ui.AspectRatioFrameLayout) r10
            r10.post(r7)
        L_0x0072:
            r10 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r10)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r10)
            super.onMeasure(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.AspectRatioFrameLayout.onMeasure(int, int):void");
    }

    public void setAspectRatio(float f8) {
        if (this.f8207V != f8) {
            this.f8207V = f8;
            requestLayout();
        }
    }

    public void setAspectRatioListener(C0368a aVar) {
    }

    public void setResizeMode(int i) {
        if (this.f8208W != i) {
            this.f8208W = i;
            requestLayout();
        }
    }
}
