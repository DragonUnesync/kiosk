package androidx.activity;

import android.os.Bundle;
import androidx.fragment.app.L;
import androidx.lifecycle.C0485l;
import b2.C0525d;
import h.C1022j;
import java.util.ArrayList;
import java.util.HashMap;

public final /* synthetic */ class e implements C0525d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7278a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f7279b;

    public /* synthetic */ e(int i, Object obj) {
        this.f7278a = i;
        this.f7279b = obj;
    }

    public final Bundle a() {
        switch (this.f7278a) {
            case 0:
                Bundle bundle = new Bundle();
                g gVar = ((C1022j) this.f7279b).f7297e0;
                gVar.getClass();
                HashMap hashMap = gVar.f7336b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(hashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(hashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(gVar.f7338d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) gVar.f7340g.clone());
                return bundle;
            case 1:
                C1022j jVar = (C1022j) this.f7279b;
                do {
                } while (C1022j.n(jVar.l()));
                jVar.f12213n0.d(C0485l.ON_STOP);
                return new Bundle();
            default:
                return ((L) this.f7279b).X();
        }
    }
}
