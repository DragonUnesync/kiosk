package h2;

import Y.e;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* renamed from: h2.l  reason: case insensitive filesystem */
public final class C1071l extends C1072m {

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f12567a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f12568b;

    /* renamed from: c  reason: collision with root package name */
    public float f12569c;

    /* renamed from: d  reason: collision with root package name */
    public float f12570d;
    public float e;

    /* renamed from: f  reason: collision with root package name */
    public float f12571f;

    /* renamed from: g  reason: collision with root package name */
    public float f12572g;

    /* renamed from: h  reason: collision with root package name */
    public float f12573h;
    public float i;

    /* renamed from: j  reason: collision with root package name */
    public final Matrix f12574j;

    /* renamed from: k  reason: collision with root package name */
    public String f12575k;

    public C1071l() {
        this.f12567a = new Matrix();
        this.f12568b = new ArrayList();
        this.f12569c = 0.0f;
        this.f12570d = 0.0f;
        this.e = 0.0f;
        this.f12571f = 1.0f;
        this.f12572g = 1.0f;
        this.f12573h = 0.0f;
        this.i = 0.0f;
        this.f12574j = new Matrix();
        this.f12575k = null;
    }

    public final boolean a() {
        int i8 = 0;
        while (true) {
            ArrayList arrayList = this.f12568b;
            if (i8 >= arrayList.size()) {
                return false;
            }
            if (((C1072m) arrayList.get(i8)).a()) {
                return true;
            }
            i8++;
        }
    }

    public final boolean b(int[] iArr) {
        int i8 = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.f12568b;
            if (i8 >= arrayList.size()) {
                return z;
            }
            z |= ((C1072m) arrayList.get(i8)).b(iArr);
            i8++;
        }
    }

    public final void c() {
        Matrix matrix = this.f12574j;
        matrix.reset();
        matrix.postTranslate(-this.f12570d, -this.e);
        matrix.postScale(this.f12571f, this.f12572g);
        matrix.postRotate(this.f12569c, 0.0f, 0.0f);
        matrix.postTranslate(this.f12573h + this.f12570d, this.i + this.e);
    }

    public String getGroupName() {
        return this.f12575k;
    }

    public Matrix getLocalMatrix() {
        return this.f12574j;
    }

    public float getPivotX() {
        return this.f12570d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.f12569c;
    }

    public float getScaleX() {
        return this.f12571f;
    }

    public float getScaleY() {
        return this.f12572g;
    }

    public float getTranslateX() {
        return this.f12573h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f8) {
        if (f8 != this.f12570d) {
            this.f12570d = f8;
            c();
        }
    }

    public void setPivotY(float f8) {
        if (f8 != this.e) {
            this.e = f8;
            c();
        }
    }

    public void setRotation(float f8) {
        if (f8 != this.f12569c) {
            this.f12569c = f8;
            c();
        }
    }

    public void setScaleX(float f8) {
        if (f8 != this.f12571f) {
            this.f12571f = f8;
            c();
        }
    }

    public void setScaleY(float f8) {
        if (f8 != this.f12572g) {
            this.f12572g = f8;
            c();
        }
    }

    public void setTranslateX(float f8) {
        if (f8 != this.f12573h) {
            this.f12573h = f8;
            c();
        }
    }

    public void setTranslateY(float f8) {
        if (f8 != this.i) {
            this.i = f8;
            c();
        }
    }

    /* JADX WARNING: type inference failed for: r4v5, types: [h2.k, h2.n] */
    public C1071l(C1071l lVar, e eVar) {
        C1073n nVar;
        this.f12567a = new Matrix();
        this.f12568b = new ArrayList();
        this.f12569c = 0.0f;
        this.f12570d = 0.0f;
        this.e = 0.0f;
        this.f12571f = 1.0f;
        this.f12572g = 1.0f;
        this.f12573h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.f12574j = matrix;
        this.f12575k = null;
        this.f12569c = lVar.f12569c;
        this.f12570d = lVar.f12570d;
        this.e = lVar.e;
        this.f12571f = lVar.f12571f;
        this.f12572g = lVar.f12572g;
        this.f12573h = lVar.f12573h;
        this.i = lVar.i;
        String str = lVar.f12575k;
        this.f12575k = str;
        if (str != null) {
            eVar.put(str, this);
        }
        matrix.set(lVar.f12574j);
        ArrayList arrayList = lVar.f12568b;
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            Object obj = arrayList.get(i8);
            if (obj instanceof C1071l) {
                this.f12568b.add(new C1071l((C1071l) obj, eVar));
            } else {
                if (obj instanceof C1070k) {
                    C1070k kVar = (C1070k) obj;
                    ? nVar2 = new C1073n(kVar);
                    nVar2.e = 0.0f;
                    nVar2.f12560g = 1.0f;
                    nVar2.f12561h = 1.0f;
                    nVar2.i = 0.0f;
                    nVar2.f12562j = 1.0f;
                    nVar2.f12563k = 0.0f;
                    nVar2.f12564l = Paint.Cap.BUTT;
                    nVar2.f12565m = Paint.Join.MITER;
                    nVar2.f12566n = 4.0f;
                    nVar2.f12558d = kVar.f12558d;
                    nVar2.e = kVar.e;
                    nVar2.f12560g = kVar.f12560g;
                    nVar2.f12559f = kVar.f12559f;
                    nVar2.f12578c = kVar.f12578c;
                    nVar2.f12561h = kVar.f12561h;
                    nVar2.i = kVar.i;
                    nVar2.f12562j = kVar.f12562j;
                    nVar2.f12563k = kVar.f12563k;
                    nVar2.f12564l = kVar.f12564l;
                    nVar2.f12565m = kVar.f12565m;
                    nVar2.f12566n = kVar.f12566n;
                    nVar = nVar2;
                } else if (obj instanceof C1069j) {
                    nVar = new C1073n((C1069j) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f12568b.add(nVar);
                String str2 = nVar.f12577b;
                if (str2 != null) {
                    eVar.put(str2, nVar);
                }
            }
        }
    }
}
