package com.journeyapps.barcodescanner;

import G5.e;
import G5.f;
import G5.v;
import M3.n;
import Q3.g;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

public class ViewfinderView extends View {

    /* renamed from: i0  reason: collision with root package name */
    public static final int[] f9525i0 = {0, 64, 128, 192, 255, 192, 128, 64};

    /* renamed from: U  reason: collision with root package name */
    public final Paint f9526U = new Paint(1);

    /* renamed from: V  reason: collision with root package name */
    public int f9527V;

    /* renamed from: W  reason: collision with root package name */
    public final int f9528W;

    /* renamed from: a0  reason: collision with root package name */
    public final int f9529a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f9530b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f9531c0;

    /* renamed from: d0  reason: collision with root package name */
    public ArrayList f9532d0;

    /* renamed from: e0  reason: collision with root package name */
    public ArrayList f9533e0;

    /* renamed from: f0  reason: collision with root package name */
    public f f9534f0;

    /* renamed from: g0  reason: collision with root package name */
    public Rect f9535g0;

    /* renamed from: h0  reason: collision with root package name */
    public v f9536h0;

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = getResources();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g.f4119b);
        this.f9527V = obtainStyledAttributes.getColor(4, resources.getColor(2131100472));
        obtainStyledAttributes.getColor(1, resources.getColor(2131100468));
        this.f9528W = obtainStyledAttributes.getColor(2, resources.getColor(2131100471));
        this.f9529a0 = obtainStyledAttributes.getColor(0, resources.getColor(2131100464));
        this.f9530b0 = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
        this.f9531c0 = 0;
        this.f9532d0 = new ArrayList(20);
        this.f9533e0 = new ArrayList(20);
    }

    public final void onDraw(Canvas canvas) {
        v vVar;
        f fVar = this.f9534f0;
        if (fVar != null) {
            Rect framingRect = fVar.getFramingRect();
            v previewSize = this.f9534f0.getPreviewSize();
            if (!(framingRect == null || previewSize == null)) {
                this.f9535g0 = framingRect;
                this.f9536h0 = previewSize;
            }
        }
        Rect rect = this.f9535g0;
        if (rect != null && (vVar = this.f9536h0) != null) {
            int width = getWidth();
            int height = getHeight();
            Paint paint = this.f9526U;
            paint.setColor(this.f9527V);
            float f8 = (float) width;
            Paint paint2 = paint;
            canvas.drawRect(0.0f, 0.0f, f8, (float) rect.top, paint2);
            canvas.drawRect(0.0f, (float) rect.top, (float) rect.left, (float) (rect.bottom + 1), paint2);
            float f9 = f8;
            canvas.drawRect((float) (rect.right + 1), (float) rect.top, f9, (float) (rect.bottom + 1), paint2);
            canvas.drawRect(0.0f, (float) (rect.bottom + 1), f9, (float) height, paint2);
            if (this.f9530b0) {
                paint.setColor(this.f9528W);
                paint.setAlpha(f9525i0[this.f9531c0]);
                this.f9531c0 = (this.f9531c0 + 1) % 8;
                int height2 = (rect.height() / 2) + rect.top;
                canvas.drawRect((float) (rect.left + 2), (float) (height2 - 1), (float) (rect.right - 1), (float) (height2 + 2), paint);
            }
            float width2 = ((float) getWidth()) / ((float) vVar.f1735U);
            float height3 = ((float) getHeight()) / ((float) vVar.f1736V);
            boolean isEmpty = this.f9533e0.isEmpty();
            int i = this.f9529a0;
            if (!isEmpty) {
                paint.setAlpha(80);
                paint.setColor(i);
                Iterator it = this.f9533e0.iterator();
                while (it.hasNext()) {
                    n nVar = (n) it.next();
                    canvas.drawCircle((float) ((int) (nVar.f3164a * width2)), (float) ((int) (nVar.f3165b * height3)), 3.0f, paint);
                }
                this.f9533e0.clear();
            }
            if (!this.f9532d0.isEmpty()) {
                paint.setAlpha(160);
                paint.setColor(i);
                Iterator it2 = this.f9532d0.iterator();
                while (it2.hasNext()) {
                    n nVar2 = (n) it2.next();
                    canvas.drawCircle((float) ((int) (nVar2.f3164a * width2)), (float) ((int) (nVar2.f3165b * height3)), 6.0f, paint);
                }
                ArrayList arrayList = this.f9532d0;
                ArrayList arrayList2 = this.f9533e0;
                this.f9532d0 = arrayList2;
                this.f9533e0 = arrayList;
                arrayList2.clear();
            }
            postInvalidateDelayed(80, rect.left - 6, rect.top - 6, rect.right + 6, rect.bottom + 6);
        }
    }

    public void setCameraPreview(f fVar) {
        this.f9534f0 = fVar;
        fVar.f1677g0.add(new e(2, this));
    }

    public void setLaserVisibility(boolean z) {
        this.f9530b0 = z;
    }

    public void setMaskColor(int i) {
        this.f9527V = i;
    }
}
