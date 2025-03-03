package androidx.emoji2.text;

import android.util.SparseArray;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final SparseArray f7817a;

    /* renamed from: b  reason: collision with root package name */
    public u f7818b;

    public r(int i) {
        this.f7817a = new SparseArray(i);
    }

    public final void a(u uVar, int i, int i8) {
        r rVar;
        int a8 = uVar.a(i);
        SparseArray sparseArray = this.f7817a;
        if (sparseArray == null) {
            rVar = null;
        } else {
            rVar = (r) sparseArray.get(a8);
        }
        if (rVar == null) {
            rVar = new r(1);
            sparseArray.put(uVar.a(i), rVar);
        }
        if (i8 > i) {
            rVar.a(uVar, i + 1, i8);
        } else {
            rVar.f7818b = uVar;
        }
    }
}
