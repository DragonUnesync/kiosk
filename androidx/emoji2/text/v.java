package androidx.emoji2.text;

import B3.q;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;
import n2.a;

public final class v extends ReplacementSpan {

    /* renamed from: a  reason: collision with root package name */
    public final Paint.FontMetricsInt f7827a = new Paint.FontMetricsInt();

    /* renamed from: b  reason: collision with root package name */
    public final u f7828b;

    /* renamed from: c  reason: collision with root package name */
    public short f7829c = -1;

    /* renamed from: d  reason: collision with root package name */
    public float f7830d = 1.0f;
    public TextPaint e;

    public v(u uVar) {
        a.l(uVar, "rasterizer cannot be null");
        this.f7828b = uVar;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i8, float f8, int i9, int i10, int i11, Paint paint) {
        CharSequence charSequence2 = charSequence;
        TextPaint textPaint = paint;
        TextPaint textPaint2 = null;
        if (charSequence2 instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence2).getSpans(i, i8, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (!(characterStyleArr.length == 1 && characterStyleArr[0] == this)) {
                    TextPaint textPaint3 = this.e;
                    if (textPaint3 == null) {
                        textPaint3 = new TextPaint();
                        this.e = textPaint3;
                    }
                    textPaint2 = textPaint3;
                    textPaint2.set(textPaint);
                    for (CharacterStyle updateDrawState : characterStyleArr) {
                        updateDrawState.updateDrawState(textPaint2);
                    }
                }
            }
            if (textPaint instanceof TextPaint) {
                textPaint2 = (TextPaint) textPaint;
            }
        } else if (textPaint instanceof TextPaint) {
            textPaint2 = (TextPaint) textPaint;
        }
        if (!(textPaint2 == null || textPaint2.bgColor == 0)) {
            int color = textPaint2.getColor();
            Paint.Style style = textPaint2.getStyle();
            textPaint2.setColor(textPaint2.bgColor);
            textPaint2.setStyle(Paint.Style.FILL);
            canvas.drawRect(f8, (float) i9, f8 + ((float) this.f7829c), (float) i11, textPaint2);
            textPaint2.setStyle(style);
            textPaint2.setColor(color);
        }
        j.a().getClass();
        float f9 = (float) i10;
        if (textPaint2 != null) {
            textPaint = textPaint2;
        }
        u uVar = this.f7828b;
        q qVar = uVar.f7825b;
        Typeface typeface = textPaint.getTypeface();
        textPaint.setTypeface((Typeface) qVar.f452X);
        canvas.drawText((char[]) qVar.f450V, uVar.f7824a * 2, 2, f8, f9, textPaint);
        textPaint.setTypeface(typeface);
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i8, Paint.FontMetricsInt fontMetricsInt) {
        short s8;
        Paint.FontMetricsInt fontMetricsInt2 = this.f7827a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = ((float) Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent)) * 1.0f;
        u uVar = this.f7828b;
        D0.a c8 = uVar.c();
        int a8 = c8.a(14);
        short s9 = 0;
        if (a8 != 0) {
            s8 = ((ByteBuffer) c8.f980d).getShort(a8 + c8.f977a);
        } else {
            s8 = 0;
        }
        this.f7830d = abs / ((float) s8);
        D0.a c9 = uVar.c();
        int a9 = c9.a(14);
        if (a9 != 0) {
            ((ByteBuffer) c9.f980d).getShort(a9 + c9.f977a);
        }
        D0.a c10 = uVar.c();
        int a10 = c10.a(12);
        if (a10 != 0) {
            s9 = ((ByteBuffer) c10.f980d).getShort(a10 + c10.f977a);
        }
        short s10 = (short) ((int) (((float) s9) * this.f7830d));
        this.f7829c = s10;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s10;
    }
}
