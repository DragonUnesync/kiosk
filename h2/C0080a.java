package H2;

import android.content.res.AssetManager;

/* renamed from: H2.a  reason: case insensitive filesystem */
public final class C0080a implements r {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f1941U;

    /* renamed from: V  reason: collision with root package name */
    public final AssetManager f1942V;

    public /* synthetic */ C0080a(AssetManager assetManager, int i) {
        this.f1941U = i;
        this.f1942V = assetManager;
    }

    public final q m0(w wVar) {
        switch (this.f1941U) {
            case 0:
                return new C0081b(this.f1942V, 0, this);
            default:
                return new C0081b(this.f1942V, 0, this);
        }
    }
}
