package v;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.util.ArrayMap;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final i f15868a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayMap f15869b = new ArrayMap(4);

    public r(i iVar) {
        this.f15868a = iVar;
    }

    public static r a(Context context, Handler handler) {
        i iVar;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            iVar = new i(context, (i) null);
        } else if (i >= 29) {
            iVar = new i(context, (i) null);
        } else if (i >= 28) {
            iVar = new i(context, (i) null);
        } else {
            iVar = new i(context, new i(handler));
        }
        return new r(iVar);
    }

    public final k b(String str) {
        k kVar;
        synchronized (this.f15869b) {
            kVar = (k) this.f15869b.get(str);
            if (kVar == null) {
                try {
                    k kVar2 = new k(this.f15868a.d(str), str);
                    this.f15869b.put(str, kVar2);
                    kVar = kVar2;
                } catch (AssertionError e) {
                    throw new C1502a(e.getMessage(), e);
                }
            }
        }
        return kVar;
    }
}
