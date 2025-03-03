package b2;

import P6.f;
import android.os.Bundle;
import h.C1022j;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* renamed from: b2.a  reason: case insensitive filesystem */
public final class C0522a implements C0525d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8645a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Object f8646b;

    public C0522a(C0526e eVar) {
        f.e(eVar, "registry");
        this.f8646b = new LinkedHashSet();
        eVar.e("androidx.savedstate.Restarter", this);
    }

    public final Bundle a() {
        switch (this.f8645a) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("classes_to_restore", new ArrayList((LinkedHashSet) this.f8646b));
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                ((C1022j) this.f8646b).j().getClass();
                return bundle2;
        }
    }

    public C0522a(C1022j jVar) {
        this.f8646b = jVar;
    }
}
