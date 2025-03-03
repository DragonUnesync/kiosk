package T0;

import M0.X;
import P0.v;
import P0.z;
import R0.A;
import U0.d;
import U0.j;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import h1.C1035a;
import h1.C1054u;
import h1.C1057x;
import h1.C1059z;
import h1.b0;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import y.C1609a;
import z3.c;
import z3.e;
import z3.g;
import z3.k;
import z3.m;
import z3.t;

public final class W {

    /* renamed from: a  reason: collision with root package name */
    public boolean f4738a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f4739b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f4740c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f4741d;
    public final Object e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f4742f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f4743g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f4744h;
    public final Object i;

    /* renamed from: j  reason: collision with root package name */
    public final Object f4745j;

    /* renamed from: k  reason: collision with root package name */
    public Object f4746k;

    /* renamed from: l  reason: collision with root package name */
    public Object f4747l;

    public W() {
        this.f4739b = new t[4];
        this.f4740c = new Matrix[4];
        this.f4741d = new Matrix[4];
        this.e = new PointF();
        this.f4742f = new Path();
        this.f4743g = new Path();
        this.f4744h = new t();
        this.i = new float[2];
        this.f4745j = new float[2];
        this.f4746k = new Path();
        this.f4747l = new Path();
        this.f4738a = true;
        for (int i8 = 0; i8 < 4; i8++) {
            ((t[]) this.f4739b)[i8] = new t();
            ((Matrix[]) this.f4740c)[i8] = new Matrix();
            ((Matrix[]) this.f4741d)[i8] = new Matrix();
        }
    }

    public X a(int i8, ArrayList arrayList, b0 b0Var) {
        if (!arrayList.isEmpty()) {
            this.f4746k = b0Var;
            for (int i9 = i8; i9 < arrayList.size() + i8; i9++) {
                V v4 = (V) arrayList.get(i9 - i8);
                ArrayList arrayList2 = (ArrayList) this.f4740c;
                if (i9 > 0) {
                    V v8 = (V) arrayList2.get(i9 - 1);
                    v4.f4737d = v8.f4734a.f12528o.f12507b.o() + v8.f4737d;
                    v4.e = false;
                    v4.f4736c.clear();
                } else {
                    v4.f4737d = 0;
                    v4.e = false;
                    v4.f4736c.clear();
                }
                int o2 = v4.f4734a.f12528o.f12507b.o();
                for (int i10 = i9; i10 < arrayList2.size(); i10++) {
                    ((V) arrayList2.get(i10)).f4737d += o2;
                }
                arrayList2.add(i9, v4);
                ((HashMap) this.e).put(v4.f4735b, v4);
                if (this.f4738a) {
                    g(v4);
                    if (((IdentityHashMap) this.f4741d).isEmpty()) {
                        ((HashSet) this.f4744h).add(v4);
                    } else {
                        U u3 = (U) ((HashMap) this.f4742f).get(v4);
                        if (u3 != null) {
                            u3.f4731a.c(u3.f4732b);
                        }
                    }
                }
            }
        }
        return c();
    }

    public void b(k kVar, float f8, RectF rectF, C1609a aVar, Path path) {
        Matrix[] matrixArr;
        Matrix[] matrixArr2;
        t[] tVarArr;
        int i8;
        float[] fArr;
        e eVar;
        c cVar;
        com.bumptech.glide.c cVar2;
        int i9;
        W w2 = this;
        k kVar2 = kVar;
        RectF rectF2 = rectF;
        C1609a aVar2 = aVar;
        Path path2 = path;
        path.rewind();
        Path path3 = (Path) w2.f4742f;
        path3.rewind();
        Path path4 = (Path) w2.f4743g;
        path4.rewind();
        path4.addRect(rectF2, Path.Direction.CW);
        int i10 = 0;
        while (true) {
            matrixArr = (Matrix[]) w2.f4741d;
            matrixArr2 = (Matrix[]) w2.f4740c;
            tVarArr = (t[]) w2.f4739b;
            i8 = 4;
            fArr = (float[]) w2.i;
            if (i10 >= 4) {
                break;
            }
            if (i10 == 1) {
                cVar = kVar2.f16506g;
            } else if (i10 == 2) {
                cVar = kVar2.f16507h;
            } else if (i10 != 3) {
                cVar = kVar2.f16505f;
            } else {
                cVar = kVar2.e;
            }
            if (i10 == 1) {
                cVar2 = kVar2.f16503c;
            } else if (i10 == 2) {
                cVar2 = kVar2.f16504d;
            } else if (i10 != 3) {
                cVar2 = kVar2.f16502b;
            } else {
                cVar2 = kVar2.f16501a;
            }
            t tVar = tVarArr[i10];
            cVar2.getClass();
            cVar2.n(tVar, f8, cVar.a(rectF2));
            int i11 = i10 + 1;
            float f9 = (float) ((i11 % 4) * 90);
            matrixArr2[i10].reset();
            PointF pointF = (PointF) w2.e;
            if (i10 == 1) {
                i9 = i11;
                pointF.set(rectF2.right, rectF2.bottom);
            } else if (i10 == 2) {
                i9 = i11;
                pointF.set(rectF2.left, rectF2.bottom);
            } else if (i10 != 3) {
                i9 = i11;
                pointF.set(rectF2.right, rectF2.top);
            } else {
                i9 = i11;
                pointF.set(rectF2.left, rectF2.top);
            }
            matrixArr2[i10].setTranslate(pointF.x, pointF.y);
            matrixArr2[i10].preRotate(f9);
            t tVar2 = tVarArr[i10];
            fArr[0] = tVar2.f16529b;
            fArr[1] = tVar2.f16530c;
            matrixArr2[i10].mapPoints(fArr);
            matrixArr[i10].reset();
            matrixArr[i10].setTranslate(fArr[0], fArr[1]);
            matrixArr[i10].preRotate(f9);
            i10 = i9;
        }
        int i12 = 0;
        while (i12 < i8) {
            t tVar3 = tVarArr[i12];
            tVar3.getClass();
            fArr[0] = 0.0f;
            fArr[1] = tVar3.f16528a;
            matrixArr2[i12].mapPoints(fArr);
            if (i12 == 0) {
                path2.moveTo(fArr[0], fArr[1]);
            } else {
                path2.lineTo(fArr[0], fArr[1]);
            }
            tVarArr[i12].b(matrixArr2[i12], path2);
            if (aVar2 != null) {
                t tVar4 = tVarArr[i12];
                Matrix matrix = matrixArr2[i12];
                g gVar = (g) aVar2.f16325a;
                BitSet bitSet = gVar.f16472X;
                tVar4.getClass();
                bitSet.set(i12, false);
                tVar4.a(tVar4.e);
                gVar.f16470V[i12] = new m(new ArrayList(tVar4.f16533g), new Matrix(matrix));
            }
            int i13 = i12 + 1;
            int i14 = i13 % 4;
            t tVar5 = tVarArr[i12];
            fArr[0] = tVar5.f16529b;
            fArr[1] = tVar5.f16530c;
            matrixArr2[i12].mapPoints(fArr);
            t tVar6 = tVarArr[i14];
            tVar6.getClass();
            float[] fArr2 = (float[]) w2.f4745j;
            fArr2[0] = 0.0f;
            fArr2[1] = tVar6.f16528a;
            matrixArr2[i14].mapPoints(fArr2);
            int i15 = i13;
            float max = Math.max(((float) Math.hypot((double) (fArr[0] - fArr2[0]), (double) (fArr[1] - fArr2[1]))) - 0.001f, 0.0f);
            t tVar7 = tVarArr[i12];
            fArr[0] = tVar7.f16529b;
            fArr[1] = tVar7.f16530c;
            matrixArr2[i12].mapPoints(fArr);
            if (i12 == 1 || i12 == 3) {
                Math.abs(rectF.centerX() - fArr[0]);
            } else {
                Math.abs(rectF.centerY() - fArr[1]);
            }
            t tVar8 = (t) w2.f4744h;
            tVar8.d(0.0f, 270.0f, 0.0f);
            if (i12 == 1) {
                eVar = kVar2.f16509k;
            } else if (i12 == 2) {
                eVar = kVar2.f16510l;
            } else if (i12 != 3) {
                eVar = kVar2.f16508j;
            } else {
                eVar = kVar2.i;
            }
            eVar.getClass();
            tVar8.c(max, 0.0f);
            Path path5 = (Path) w2.f4746k;
            path5.reset();
            tVar8.b(matrixArr[i12], path5);
            if (!w2.f4738a || (!w2.f(path5, i12) && !w2.f(path5, i14))) {
                tVar8.b(matrixArr[i12], path2);
            } else {
                path5.op(path5, path4, Path.Op.DIFFERENCE);
                fArr[0] = 0.0f;
                fArr[1] = tVar8.f16528a;
                matrixArr[i12].mapPoints(fArr);
                path3.moveTo(fArr[0], fArr[1]);
                tVar8.b(matrixArr[i12], path3);
            }
            if (aVar2 != null) {
                Matrix matrix2 = matrixArr[i12];
                g gVar2 = (g) aVar2.f16325a;
                gVar2.f16472X.set(i12 + 4, false);
                tVar8.a(tVar8.e);
                gVar2.f16471W[i12] = new m(new ArrayList(tVar8.f16533g), new Matrix(matrix2));
            }
            i8 = 4;
            w2 = this;
            RectF rectF3 = rectF;
            i12 = i15;
        }
        path.close();
        path3.close();
        if (!path3.isEmpty()) {
            path2.op(path3, Path.Op.UNION);
        }
    }

    public X c() {
        ArrayList arrayList = (ArrayList) this.f4740c;
        if (arrayList.isEmpty()) {
            return X.f2884a;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            V v4 = (V) arrayList.get(i9);
            v4.f4737d = i8;
            i8 += v4.f4734a.f12528o.f12507b.o();
        }
        return new c0(arrayList, (b0) this.f4746k);
    }

    public void d() {
        Iterator it = ((HashSet) this.f4744h).iterator();
        while (it.hasNext()) {
            V v4 = (V) it.next();
            if (v4.f4736c.isEmpty()) {
                U u3 = (U) ((HashMap) this.f4742f).get(v4);
                if (u3 != null) {
                    u3.f4731a.c(u3.f4732b);
                }
                it.remove();
            }
        }
    }

    public void e(V v4) {
        if (v4.e && v4.f4736c.isEmpty()) {
            U u3 = (U) ((HashMap) this.f4742f).remove(v4);
            u3.getClass();
            O o2 = u3.f4732b;
            C1035a aVar = u3.f4731a;
            aVar.o(o2);
            T t8 = u3.f4733c;
            aVar.r(t8);
            aVar.q(t8);
            ((HashSet) this.f4744h).remove(v4);
        }
    }

    public boolean f(Path path, int i8) {
        Path path2 = (Path) this.f4747l;
        path2.reset();
        ((t[]) this.f4739b)[i8].b(((Matrix[]) this.f4740c)[i8], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty()) {
            return true;
        }
        if (rectF.width() <= 1.0f || rectF.height() <= 1.0f) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [h1.F, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v4, types: [Y0.d, java.lang.Object] */
    public void g(V v4) {
        C1057x xVar = v4.f4734a;
        O o2 = new O(this);
        T t8 = new T(this, v4);
        ((HashMap) this.f4742f).put(v4, new U(xVar, o2, t8));
        int i8 = z.f3748a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, (Handler.Callback) null);
        xVar.getClass();
        Y0.e eVar = xVar.f12432c;
        eVar.getClass();
        ? obj = new Object();
        obj.f12290a = handler;
        obj.f12291b = t8;
        eVar.f6317c.add(obj);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        new Handler(myLooper2, (Handler.Callback) null);
        Y0.e eVar2 = xVar.f12433d;
        eVar2.getClass();
        ? obj2 = new Object();
        obj2.f6314a = t8;
        eVar2.f6317c.add(obj2);
        xVar.k(o2, (A) this.f4747l, (j) this.f4739b);
    }

    public void h(C1059z zVar) {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.f4741d;
        V v4 = (V) identityHashMap.remove(zVar);
        v4.getClass();
        v4.f4734a.n(zVar);
        v4.f4736c.remove(((C1054u) zVar).f12515U);
        if (!identityHashMap.isEmpty()) {
            d();
        }
        e(v4);
    }

    public void i(int i8, int i9) {
        for (int i10 = i9 - 1; i10 >= i8; i10--) {
            ArrayList arrayList = (ArrayList) this.f4740c;
            V v4 = (V) arrayList.remove(i10);
            ((HashMap) this.e).remove(v4.f4735b);
            int i11 = -v4.f4734a.f12528o.f12507b.o();
            for (int i12 = i10; i12 < arrayList.size(); i12++) {
                ((V) arrayList.get(i12)).f4737d += i11;
            }
            v4.e = true;
            if (this.f4738a) {
                e(v4);
            }
        }
    }

    public W(F f8, d dVar, v vVar, j jVar) {
        this.f4739b = jVar;
        this.f4743g = f8;
        this.f4746k = new b0();
        this.f4741d = new IdentityHashMap();
        this.e = new HashMap();
        this.f4740c = new ArrayList();
        this.i = dVar;
        this.f4745j = vVar;
        this.f4742f = new HashMap();
        this.f4744h = new HashSet();
    }
}
