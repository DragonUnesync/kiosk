package d3;

import Z2.a;
import android.view.View;
import b3.C0530c;
import java.util.Set;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f9722U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ g f9723V;

    public /* synthetic */ c(g gVar, int i) {
        this.f9722U = i;
        this.f9723V = gVar;
    }

    public final void onClick(View view) {
        switch (this.f9722U) {
            case 0:
                g gVar = this.f9723V;
                gVar.getClass();
                Set<String> keySet = C0530c.f8663a.keySet();
                String[] strArr = new String[keySet.size()];
                int i = 0;
                for (String str : keySet) {
                    strArr[i] = str;
                    i++;
                }
                a aVar = gVar.f9739b0;
                if (aVar != null) {
                    aVar.d(strArr);
                }
                gVar.dismiss();
                return;
            default:
                g gVar2 = this.f9723V;
                f fVar = gVar2.f9747j0;
                if (fVar != null) {
                    fVar.cancel(true);
                }
                gVar2.cancel();
                return;
        }
    }
}
