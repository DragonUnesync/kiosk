package u;

import a0.j;
import a0.k;
import a1.C0412c;
import com.bumptech.glide.c;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import v.C1502a;
import v.r;

/* renamed from: u.j  reason: case insensitive filesystem */
public final /* synthetic */ class C1469j implements k {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f15654U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ C1479t f15655V;

    public /* synthetic */ C1469j(C1479t tVar, int i) {
        this.f15654U = i;
        this.f15655V = tVar;
    }

    public Object h(j jVar) {
        switch (this.f15654U) {
            case 0:
                C1479t tVar = this.f15655V;
                tVar.getClass();
                try {
                    tVar.f15688W.execute(new C0412c((Object) tVar, 21, (Object) jVar));
                    return "isMeteringRepeatingAttached";
                } catch (RejectedExecutionException unused) {
                    jVar.b(new RuntimeException("Unable to check if MeteringRepeating is attached. Camera executor shut down."));
                    return "isMeteringRepeatingAttached";
                }
            default:
                C1479t tVar2 = this.f15655V;
                tVar2.getClass();
                try {
                    ArrayList arrayList = new ArrayList(tVar2.f15686U.u().b().f749c);
                    arrayList.add((C1444D) tVar2.f15708r0.f15533f);
                    arrayList.add(new C1472m(tVar2, jVar));
                    r rVar = tVar2.f15687V;
                    rVar.f15868a.f(tVar2.f15694c0.f15720a, tVar2.f15688W, c.g(arrayList));
                    return "configAndCloseTask";
                } catch (SecurityException | C1502a e) {
                    tVar2.u("Unable to open camera for configAndClose: " + e.getMessage(), e);
                    jVar.b(e);
                    return "configAndCloseTask";
                }
        }
    }
}
