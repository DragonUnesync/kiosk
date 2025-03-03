package androidx.emoji2.text;

import B.C0003d;
import B.q0;
import B3.q;
import D7.b;
import a1.C0410a;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class d extends C0003d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f7781a;

    public d(e eVar) {
        this.f7781a = eVar;
    }

    public final void B(Throwable th) {
        this.f7781a.f7782a.d(th);
    }

    /* JADX INFO: finally extract failed */
    public final void C(q qVar) {
        Set<int[]> set;
        e eVar = this.f7781a;
        eVar.f7784c = qVar;
        q qVar2 = eVar.f7784c;
        j jVar = eVar.f7782a;
        C0410a aVar = jVar.f7798g;
        c cVar = jVar.i;
        if (Build.VERSION.SDK_INT >= 34) {
            set = m.a();
        } else {
            set = b.p();
        }
        eVar.f7783b = new q0(qVar2, aVar, cVar, (Set) set);
        j jVar2 = eVar.f7782a;
        jVar2.getClass();
        ArrayList arrayList = new ArrayList();
        jVar2.f7793a.writeLock().lock();
        try {
            jVar2.f7795c = 1;
            arrayList.addAll(jVar2.f7794b);
            jVar2.f7794b.clear();
            jVar2.f7793a.writeLock().unlock();
            jVar2.f7796d.post(new h((List) arrayList, jVar2.f7795c, (Throwable) null));
        } catch (Throwable th) {
            jVar2.f7793a.writeLock().unlock();
            throw th;
        }
    }
}
