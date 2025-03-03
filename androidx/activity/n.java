package androidx.activity;

import O6.a;
import P6.g;
import androidx.fragment.app.D;
import java.util.ListIterator;

public final class n extends g implements a {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f7310U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ u f7311V;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(u uVar, int i) {
        super(0);
        this.f7310U = i;
        this.f7311V = uVar;
    }

    public final Object invoke() {
        Object obj;
        switch (this.f7310U) {
            case 0:
                this.f7311V.b();
                return C6.g.f721c;
            case 1:
                u uVar = this.f7311V;
                D d8 = uVar.f7351c;
                if (d8 == null) {
                    D6.g gVar = uVar.f7350b;
                    ListIterator listIterator = gVar.listIterator(gVar.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            obj = listIterator.previous();
                            if (((D) obj).f7838a) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    d8 = (D) obj;
                }
                uVar.f7351c = null;
                if (d8 != null) {
                    d8.a();
                }
                return C6.g.f721c;
            default:
                this.f7311V.b();
                return C6.g.f721c;
        }
    }
}
