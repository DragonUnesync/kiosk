package androidx.lifecycle;

import android.os.Bundle;

public final class SavedStateHandleAttacher implements C0489p {

    /* renamed from: U  reason: collision with root package name */
    public final K f8134U;

    public SavedStateHandleAttacher(K k8) {
        this.f8134U = k8;
    }

    public final void c(r rVar, C0485l lVar) {
        if (lVar == C0485l.ON_CREATE) {
            rVar.e().f(this);
            K k8 = this.f8134U;
            if (!k8.f8123b) {
                Bundle c8 = k8.f8122a.c("androidx.lifecycle.internal.SavedStateHandlesProvider");
                Bundle bundle = new Bundle();
                Bundle bundle2 = k8.f8124c;
                if (bundle2 != null) {
                    bundle.putAll(bundle2);
                }
                if (c8 != null) {
                    bundle.putAll(c8);
                }
                k8.f8124c = bundle;
                k8.f8123b = true;
                L l8 = (L) k8.f8125d.a();
                return;
            }
            return;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + lVar).toString());
    }
}
