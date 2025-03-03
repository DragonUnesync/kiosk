package f7;

import b7.C0595a;
import java.io.IOException;

public final class n extends C0595a {
    public final /* synthetic */ o e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f11735f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ long f11736g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(String str, o oVar, int i, long j7) {
        super(str, true);
        this.e = oVar;
        this.f11735f = i;
        this.f11736g = j7;
    }

    public final long a() {
        o oVar = this.e;
        try {
            oVar.f11759q0.s(this.f11735f, this.f11736g);
            return -1;
        } catch (IOException e8) {
            oVar.k(2, 2, e8);
            return -1;
        }
    }
}
