package E;

import G5.v;
import H5.k;
import android.graphics.RectF;
import android.util.Rational;
import java.util.Comparator;

public final class a implements Comparator {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f1279U = 1;

    /* renamed from: V  reason: collision with root package name */
    public final Object f1280V;

    /* renamed from: W  reason: collision with root package name */
    public final Object f1281W;

    public a(k kVar, v vVar) {
        this.f1281W = kVar;
        this.f1280V = vVar;
    }

    public static float a(RectF rectF, RectF rectF2) {
        float f8;
        float f9;
        if (rectF.width() < rectF2.width()) {
            f8 = rectF.width();
        } else {
            f8 = rectF2.width();
        }
        if (rectF.height() < rectF2.height()) {
            f9 = rectF.height();
        } else {
            f9 = rectF2.height();
        }
        return f8 * f9;
    }

    public RectF b(Rational rational) {
        float floatValue = rational.floatValue();
        Rational rational2 = (Rational) this.f1281W;
        if (floatValue == rational2.floatValue()) {
            return new RectF(0.0f, 0.0f, (float) rational2.getNumerator(), (float) rational2.getDenominator());
        }
        if (rational.floatValue() > rational2.floatValue()) {
            return new RectF(0.0f, 0.0f, (float) rational2.getNumerator(), (((float) rational.getDenominator()) * ((float) rational2.getNumerator())) / ((float) rational.getNumerator()));
        }
        return new RectF(0.0f, 0.0f, (((float) rational.getNumerator()) * ((float) rational2.getDenominator())) / ((float) rational.getDenominator()), (float) rational2.getDenominator());
    }

    public final int compare(Object obj, Object obj2) {
        boolean z;
        switch (this.f1279U) {
            case 0:
                Rational rational = (Rational) obj;
                Rational rational2 = (Rational) obj2;
                boolean z6 = false;
                if (rational.equals(rational2)) {
                    return 0;
                }
                RectF b8 = b(rational);
                RectF b9 = b(rational2);
                RectF rectF = (RectF) this.f1280V;
                if (b8.width() < rectF.width() || b8.height() < rectF.height()) {
                    z = false;
                } else {
                    z = true;
                }
                if (b9.width() >= rectF.width() && b9.height() >= rectF.height()) {
                    z6 = true;
                }
                if (z && z6) {
                    return (int) Math.signum((b8.height() * b8.width()) - (b9.height() * b9.width()));
                } else if (z) {
                    return -1;
                } else {
                    if (z6) {
                        return 1;
                    }
                    return -((int) Math.signum(a(b8, rectF) - a(b9, rectF)));
                }
            default:
                v vVar = (v) this.f1280V;
                k kVar = (k) this.f1281W;
                return Float.compare(kVar.a((v) obj2, vVar), kVar.a((v) obj, vVar));
        }
    }

    public a(Rational rational, Rational rational2) {
        this.f1281W = rational2 == null ? new Rational(4, 3) : rational2;
        this.f1280V = b(rational);
    }
}
