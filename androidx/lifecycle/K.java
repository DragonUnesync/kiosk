package androidx.lifecycle;

import C6.e;
import P6.f;
import Y6.k;
import android.os.Bundle;
import b2.C0525d;
import b2.C0526e;
import g7.l;
import java.util.Iterator;
import java.util.Map;

public final class K implements C0525d {

    /* renamed from: a  reason: collision with root package name */
    public final C0526e f8122a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f8123b;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f8124c;

    /* renamed from: d  reason: collision with root package name */
    public final e f8125d;

    public K(C0526e eVar, P p3) {
        f.e(eVar, "savedStateRegistry");
        this.f8122a = eVar;
        this.f8125d = l.i(new k(2, p3));
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f8124c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        Iterator it = ((L) this.f8125d.a()).f8126a.entrySet().iterator();
        if (!it.hasNext()) {
            this.f8123b = false;
            return bundle;
        }
        Map.Entry entry = (Map.Entry) it.next();
        String str = (String) entry.getKey();
        entry.getValue().getClass();
        throw new ClassCastException();
    }
}
