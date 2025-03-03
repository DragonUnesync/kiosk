package P0;

import D2.G;
import M0.C0128p;
import android.os.Handler;
import android.os.Message;
import java.util.Iterator;

public final /* synthetic */ class f implements Handler.Callback {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ k f3702U;

    public /* synthetic */ f(k kVar) {
        this.f3702U = kVar;
    }

    public final boolean handleMessage(Message message) {
        k kVar = this.f3702U;
        Iterator it = kVar.f3714d.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            if (!jVar.f3710d && jVar.f3709c) {
                C0128p d8 = jVar.f3708b.d();
                jVar.f3708b = new G(1);
                jVar.f3709c = false;
                kVar.f3713c.b(jVar.f3707a, d8);
            }
            if (kVar.f3712b.f3741a.hasMessages(1)) {
                break;
            }
        }
        return true;
    }
}
