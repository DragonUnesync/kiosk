package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import androidx.lifecycle.A;
import androidx.lifecycle.r;

/* renamed from: androidx.fragment.app.p  reason: case insensitive filesystem */
public final class C0465p implements A {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r f8015a;

    public C0465p(r rVar) {
        this.f8015a = rVar;
    }

    public final void a(Object obj) {
        if (((r) obj) != null) {
            r rVar = this.f8015a;
            if (rVar.f8025W0) {
                View L8 = rVar.L();
                if (L8.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                } else if (rVar.f8029a1 != null) {
                    if (Log.isLoggable("FragmentManager", 3)) {
                        Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + rVar.f8029a1);
                    }
                    rVar.f8029a1.setContentView(L8);
                }
            }
        }
    }
}
