package r7;

import P6.e;
import P6.f;

public final class s implements C1392a {

    /* renamed from: U  reason: collision with root package name */
    public final boolean f15069U;

    /* renamed from: V  reason: collision with root package name */
    public final String f15070V;

    /* renamed from: W  reason: collision with root package name */
    public final int f15071W;

    public s(boolean z, String str, int i) {
        f.e(str, "text");
        this.f15069U = z;
        this.f15070V = str;
        this.f15071W = i;
    }

    public final boolean k() {
        return this.f15069U;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(boolean z, String str, int i, int i8, e eVar) {
        this((i8 & 1) != 0 ? true : z, str, (i8 & 4) != 0 ? 1 : i);
    }
}
