package z3;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import y3.C1633a;

public final class o extends s {

    /* renamed from: c  reason: collision with root package name */
    public final q f16515c;

    /* renamed from: d  reason: collision with root package name */
    public final float f16516d;
    public final float e;

    public o(q qVar, float f8, float f9) {
        this.f16515c = qVar;
        this.f16516d = f8;
        this.e = f9;
    }

    public final void a(Matrix matrix, C1633a aVar, int i, Canvas canvas) {
        C1633a aVar2 = aVar;
        int i8 = i;
        Canvas canvas2 = canvas;
        q qVar = this.f16515c;
        float f8 = qVar.f16524c;
        float f9 = this.e;
        float f10 = qVar.f16523b;
        float f11 = this.f16516d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (f8 - f9), (double) (f10 - f11)), 0.0f);
        Matrix matrix2 = this.f16527a;
        matrix2.set(matrix);
        matrix2.preTranslate(f11, f9);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += (float) i8;
        rectF.offset(0.0f, (float) (-i8));
        int[] iArr = C1633a.i;
        iArr[0] = aVar2.f16390f;
        iArr[1] = aVar2.e;
        iArr[2] = aVar2.f16389d;
        Paint paint = aVar2.f16388c;
        float f12 = rectF.left;
        paint.setShader(new LinearGradient(f12, rectF.top, f12, rectF.bottom, iArr, C1633a.f16383j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas2.concat(matrix2);
        canvas2.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        q qVar = this.f16515c;
        return (float) Math.toDegrees(Math.atan((double) ((qVar.f16524c - this.e) / (qVar.f16523b - this.f16516d))));
    }
}
