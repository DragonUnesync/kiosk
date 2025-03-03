package z3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;
import y3.C1633a;

public final class m extends s {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ArrayList f16512c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Matrix f16513d;

    public m(ArrayList arrayList, Matrix matrix) {
        this.f16512c = arrayList;
        this.f16513d = matrix;
    }

    public final void a(Matrix matrix, C1633a aVar, int i, Canvas canvas) {
        Iterator it = this.f16512c.iterator();
        while (it.hasNext()) {
            ((s) it.next()).a(this.f16513d, aVar, i, canvas);
        }
    }
}
