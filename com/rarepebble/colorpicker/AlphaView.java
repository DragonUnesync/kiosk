package com.rarepebble.colorpicker;

import D2.o;
import I5.a;
import I5.c;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.AttributeSet;

public class AlphaView extends c implements a {

    /* renamed from: h0  reason: collision with root package name */
    public final o f9537h0 = new o();

    public AlphaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(o oVar) {
        setPos(((float) oVar.f1137V) / 255.0f);
        e();
        invalidate();
    }

    public final int b(float f8) {
        o oVar = this.f9537h0;
        if (((oVar.h(((float[]) oVar.f1138W)[2]) - 1.0f) * f8) + 1.0f > 0.5f) {
            return -16777216;
        }
        return -1;
    }

    public final Bitmap c(int i, int i8) {
        boolean z;
        if (i > i8) {
            z = true;
        } else {
            z = false;
        }
        int max = Math.max(i, i8);
        o oVar = this.f9537h0;
        int HSVToColor = Color.HSVToColor(oVar.f1137V, (float[]) oVar.f1138W);
        int[] iArr = new int[max];
        for (int i9 = 0; i9 < max; i9++) {
            float f8 = ((float) i9) / ((float) max);
            if (!z) {
                f8 = 1.0f - f8;
            }
            iArr[i9] = (((int) (f8 * 255.0f)) << 24) | (16777215 & HSVToColor);
        }
        if (!z) {
            i = 1;
        }
        if (z) {
            i8 = 1;
        }
        return Bitmap.createBitmap(iArr, i, i8, Bitmap.Config.ARGB_8888);
    }

    public final void d(float f8) {
        o oVar = this.f9537h0;
        oVar.f1137V = (int) (f8 * 255.0f);
        oVar.l(this);
    }
}
