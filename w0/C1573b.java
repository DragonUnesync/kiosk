package w0;

import B.B;
import C3.n;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import com.bumptech.glide.c;
import java.util.WeakHashMap;
import v0.C1510H;

/* renamed from: w0.b  reason: case insensitive filesystem */
public final class C1573b implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final B f16180a;

    public C1573b(B b8) {
        this.f16180a = b8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1573b)) {
            return false;
        }
        return this.f16180a.equals(((C1573b) obj).f16180a);
    }

    public final int hashCode() {
        return this.f16180a.hashCode();
    }

    public final void onTouchExplorationStateChanged(boolean z) {
        int i;
        n nVar = (n) this.f16180a.f141V;
        AutoCompleteTextView autoCompleteTextView = nVar.f601h;
        if (autoCompleteTextView != null && !c.q(autoCompleteTextView)) {
            if (z) {
                i = 2;
            } else {
                i = 1;
            }
            WeakHashMap weakHashMap = C1510H.f15874a;
            nVar.f643d.setImportantForAccessibility(i);
        }
    }
}
