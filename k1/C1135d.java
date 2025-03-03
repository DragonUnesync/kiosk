package k1;

import H3.L;
import H3.O;
import H3.i0;
import M0.Y;

/* renamed from: k1.d  reason: case insensitive filesystem */
public final /* synthetic */ class C1135d implements m {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ p f12925U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ C1141j f12926V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ boolean f12927W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ int[] f12928X;

    public /* synthetic */ C1135d(p pVar, C1141j jVar, boolean z, int[] iArr) {
        this.f12925U = pVar;
        this.f12926V = jVar;
        this.f12927W = z;
        this.f12928X = iArr;
    }

    public final i0 c(int i, Y y8, int[] iArr) {
        p pVar = this.f12925U;
        pVar.getClass();
        C1136e eVar = new C1136e(pVar);
        int i8 = this.f12928X[i];
        L j7 = O.j();
        Y y9 = y8;
        for (int i9 = 0; i9 < y9.f2885a; i9++) {
            int i10 = i;
            Y y10 = y8;
            int i11 = i9;
            j7.a(new C1137f(i10, y10, i11, this.f12926V, iArr[i9], this.f12927W, eVar, i8));
        }
        return j7.g();
    }
}
