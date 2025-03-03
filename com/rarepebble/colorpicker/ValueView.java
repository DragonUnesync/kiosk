package com.rarepebble.colorpicker;

import D2.o;
import I5.a;
import I5.c;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.AttributeSet;

public class ValueView extends c implements a {

    /* renamed from: h0  reason: collision with root package name */
    public final o f9556h0 = new o();

    public ValueView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(o oVar) {
        setPos(((float[]) this.f9556h0.f1138W)[2]);
        e();
        invalidate();
    }

    public final int b(float f8) {
        o oVar = this.f9556h0;
        if (oVar.h(((float[]) oVar.f1138W)[2]) * f8 > 0.5f) {
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
        int[] iArr = new int[max];
        float[] fArr = {0.0f, 0.0f, 0.0f};
        float[] fArr2 = (float[]) this.f9556h0.f1138W;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        fArr[2] = fArr2[2];
        for (int i9 = 0; i9 < max; i9++) {
            float f8 = ((float) i9) / ((float) max);
            if (!z) {
                f8 = 1.0f - f8;
            }
            fArr[2] = f8;
            iArr[i9] = Color.HSVToColor(fArr);
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
        o oVar = this.f9556h0;
        ((float[]) oVar.f1138W)[2] = f8;
        oVar.l(this);
    }
}
