package t5;

import L4.e;
import M4.a;
import u5.C1494a;

/* renamed from: t5.a  reason: case insensitive filesystem */
public final class C1429a extends C1431c {

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ int f15482V;

    /* renamed from: W  reason: collision with root package name */
    public final e f15483W;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1429a(e eVar, String str, int i) {
        super(str, (Throwable) null);
        this.f15482V = i;
        this.f15483W = eVar;
    }

    public final C1494a b() {
        switch (this.f15482V) {
            case 0:
                return (a) this.f15483W;
            case 1:
                return (P4.a) this.f15483W;
            case 2:
                return (X4.a) this.f15483W;
            default:
                return (Z4.a) this.f15483W;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1429a(X4.a aVar) {
        super("PUBACK contained an Error Code", (Throwable) null);
        this.f15482V = 2;
        this.f15483W = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1429a(Z4.a aVar) {
        super("PUBREC contained an Error Code", (Throwable) null);
        this.f15482V = 3;
        this.f15483W = aVar;
    }
}
