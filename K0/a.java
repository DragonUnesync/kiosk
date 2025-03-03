package K0;

import Y.j;
import androidx.lifecycle.M;

public class a extends M {

    /* renamed from: a  reason: collision with root package name */
    public final j f2536a = new j();

    public final void onCleared() {
        super.onCleared();
        j jVar = this.f2536a;
        int i = jVar.f6311W;
        if (i <= 0) {
            Object[] objArr = jVar.f6310V;
            for (int i8 = 0; i8 < i; i8++) {
                objArr[i8] = null;
            }
            jVar.f6311W = 0;
            return;
        }
        jVar.f6310V[0].getClass();
        throw new ClassCastException();
    }
}
