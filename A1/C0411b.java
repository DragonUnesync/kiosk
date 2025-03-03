package a1;

import D2.j;
import P0.z;
import W1.e;
import android.net.Uri;
import android.os.SystemClock;
import h1.C1048n;
import java.util.HashMap;
import java.util.List;
import l1.i;

/* renamed from: a1.b  reason: case insensitive filesystem */
public final class C0411b implements s {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ e f7026U;

    public C0411b(e eVar) {
        this.f7026U = eVar;
    }

    public final void a() {
        this.f7026U.f7047Y.remove(this);
    }

    public final boolean c(Uri uri, j jVar, boolean z) {
        HashMap hashMap;
        C0413d dVar;
        e eVar = this.f7026U;
        if (eVar.f7054f0 == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            n nVar = eVar.f7052d0;
            int i = z.f3748a;
            List list = nVar.e;
            int i8 = 0;
            int i9 = 0;
            while (true) {
                int size = list.size();
                hashMap = eVar.f7046X;
                if (i8 >= size) {
                    break;
                }
                C0413d dVar2 = (C0413d) hashMap.get(((m) list.get(i8)).f7099a);
                if (dVar2 != null && elapsedRealtime < dVar2.f7037b0) {
                    i9++;
                }
                i8++;
            }
            i iVar = new i(1, 0, eVar.f7052d0.e.size(), i9);
            eVar.f7045W.getClass();
            e p3 = C1048n.p(iVar, jVar);
            if (!(p3 == null || p3.f6147a != 2 || (dVar = (C0413d) hashMap.get(uri)) == null)) {
                C0413d.a(dVar, p3.f6148b);
            }
        }
        return false;
    }
}
