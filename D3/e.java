package d3;

import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
import de.ozerov.fully.S4;
import o.C1297u0;
import o.G0;

public final class e implements AdapterView.OnItemSelectedListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f9726U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Object f9727V;

    public /* synthetic */ e(int i, Object obj) {
        this.f9726U = i;
        this.f9727V = obj;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j7) {
        C1297u0 u0Var;
        switch (this.f9726U) {
            case 0:
                ((g) this.f9727V).f9746i0 = view;
                return;
            case 1:
                ((S4) this.f9727V).W();
                return;
            case 2:
                if (i != -1 && (u0Var = ((G0) this.f9727V).f13819W) != null) {
                    u0Var.setListSelectionHidden(false);
                    return;
                }
                return;
            default:
                ((SearchView) this.f9727V).q(i);
                return;
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
        Object obj = this.f9727V;
        switch (this.f9726U) {
            case 0:
                int i = g.f9731m0;
                Log.d("g", "onNothingSelected");
                ((g) obj).f9746i0 = null;
                return;
            case 1:
                ((S4) obj).W();
                return;
            default:
                return;
        }
    }
}
