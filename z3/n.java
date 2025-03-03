package z3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import y3.C1633a;

public final class n extends s {

    /* renamed from: c  reason: collision with root package name */
    public final p f16514c;

    public n(p pVar) {
        this.f16514c = pVar;
    }

    public final void a(Matrix matrix, C1633a aVar, int i, Canvas canvas) {
        boolean z;
        C1633a aVar2 = aVar;
        int i8 = i;
        Canvas canvas2 = canvas;
        p pVar = this.f16514c;
        float f8 = pVar.f16521f;
        float f9 = pVar.f16522g;
        RectF rectF = new RectF(pVar.f16518b, pVar.f16519c, pVar.f16520d, pVar.e);
        aVar.getClass();
        if (f9 < 0.0f) {
            z = true;
        } else {
            z = false;
        }
        Path path = aVar2.f16391g;
        int[] iArr = C1633a.f16384k;
        if (z) {
            iArr[0] = 0;
            iArr[1] = aVar2.f16390f;
            iArr[2] = aVar2.e;
            iArr[3] = aVar2.f16389d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f8, f9);
            path.close();
            float f10 = (float) (-i8);
            rectF.inset(f10, f10);
            iArr[0] = 0;
            iArr[1] = aVar2.f16389d;
            iArr[2] = aVar2.e;
            iArr[3] = aVar2.f16390f;
        }
        float width = rectF.width() / 2.0f;
        if (width > 0.0f) {
            float f11 = 1.0f - (((float) i8) / width);
            float[] fArr = C1633a.f16385l;
            fArr[1] = f11;
            fArr[2] = ((1.0f - f11) / 2.0f) + f11;
            RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP);
            Paint paint = aVar2.f16387b;
            paint.setShader(radialGradient);
            canvas.save();
            canvas2.concat(matrix);
            canvas2.scale(1.0f, rectF.height() / rectF.width());
            if (!z) {
                canvas2.clipPath(path, Region.Op.DIFFERENCE);
                canvas2.drawPath(path, aVar2.f16392h);
            }
            canvas.drawArc(rectF, f8, f9, true, paint);
            canvas.restore();
        }
    }
}
