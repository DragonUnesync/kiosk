package androidx.lifecycle;

import P6.f;
import android.view.View;
import b2.C0525d;
import b2.C0526e;
import b2.C0527f;
import com.woxthebox.draglistview.R;
import java.util.Iterator;
import java.util.Map;
import q.C1349b;
import q.C1353f;

public abstract class J {

    /* renamed from: a  reason: collision with root package name */
    public static final N f8119a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final N f8120b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static final N f8121c = new Object();

    public static final void a(C0527f fVar) {
        C0525d dVar;
        C0486m mVar = fVar.e().f8156c;
        if (mVar == C0486m.f8146V || mVar == C0486m.f8147W) {
            C0526e a8 = fVar.a();
            a8.getClass();
            Iterator it = ((C1353f) a8.f8651d).iterator();
            while (true) {
                C1349b bVar = (C1349b) it;
                if (!bVar.hasNext()) {
                    dVar = null;
                    break;
                }
                Map.Entry entry = (Map.Entry) bVar.next();
                f.d(entry, "components");
                dVar = (C0525d) entry.getValue();
                if (f.a((String) entry.getKey(), "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    break;
                }
            }
            if (dVar == null) {
                K k8 = new K(fVar.a(), (P) fVar);
                fVar.a().e("androidx.lifecycle.internal.SavedStateHandlesProvider", k8);
                fVar.e().a(new SavedStateHandleAttacher(k8));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static final void b(View view, r rVar) {
        f.e(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, rVar);
    }
}
