package D2;

import S2.f;
import java.util.ArrayList;

public final class r implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f1149U;

    /* renamed from: V  reason: collision with root package name */
    public final f f1150V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ u f1151W;

    public /* synthetic */ r(u uVar, f fVar, int i) {
        this.f1149U = i;
        this.f1151W = uVar;
        this.f1150V = fVar;
    }

    private final void a() {
        f fVar = this.f1150V;
        fVar.f4475b.a();
        synchronized (fVar.f4476c) {
            synchronized (this.f1151W) {
                try {
                    t tVar = this.f1151W.f1157U;
                    f fVar2 = this.f1150V;
                    tVar.getClass();
                    if (((ArrayList) tVar.f1155V).contains(new s(fVar2, W2.f.f6163b))) {
                        u uVar = this.f1151W;
                        f fVar3 = this.f1150V;
                        uVar.getClass();
                        fVar3.j(uVar.f1173k0, 5);
                    }
                    this.f1151W.d();
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
        }
    }

    public final void run() {
        switch (this.f1149U) {
            case 0:
                a();
                return;
            default:
                f fVar = this.f1150V;
                fVar.f4475b.a();
                synchronized (fVar.f4476c) {
                    synchronized (this.f1151W) {
                        try {
                            t tVar = this.f1151W.f1157U;
                            f fVar2 = this.f1150V;
                            tVar.getClass();
                            if (((ArrayList) tVar.f1155V).contains(new s(fVar2, W2.f.f6163b))) {
                                this.f1151W.f1175m0.a();
                                u uVar = this.f1151W;
                                f fVar3 = this.f1150V;
                                uVar.getClass();
                                fVar3.m(uVar.f1175m0, uVar.f1171i0, uVar.p0);
                                this.f1151W.j(this.f1150V);
                            }
                            this.f1151W.d();
                        } catch (Throwable th) {
                            while (true) {
                                throw th;
                                break;
                            }
                        }
                    }
                }
                return;
        }
    }
}
