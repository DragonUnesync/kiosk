package B3;

import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import de.ozerov.fully.B1;
import de.ozerov.fully.C0670b1;
import de.ozerov.fully.C0674c;
import de.ozerov.fully.C0676c1;
import de.ozerov.fully.C0695f2;
import de.ozerov.fully.C0723k0;
import de.ozerov.fully.C0744n3;
import de.ozerov.fully.C0750o3;
import de.ozerov.fully.C0783u1;
import de.ozerov.fully.C0788v0;
import de.ozerov.fully.C0789v1;
import de.ozerov.fully.C0795w1;
import de.ozerov.fully.C1;
import de.ozerov.fully.F3;
import de.ozerov.fully.P2;
import de.ozerov.fully.P4;
import de.ozerov.fully.ProvisioningActivity;
import de.ozerov.fully.Q2;
import de.ozerov.fully.Q4;
import java.util.ArrayList;
import n2.a;

public final /* synthetic */ class m implements View.OnClickListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f436U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Object f437V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ Object f438W;

    public /* synthetic */ m(Object obj, int i, Object obj2) {
        this.f436U = i;
        this.f437V = obj;
        this.f438W = obj2;
    }

    public final void onClick(View view) {
        Object obj = this.f438W;
        Object obj2 = this.f437V;
        switch (this.f436U) {
            case 0:
                n nVar = (n) obj2;
                nVar.getClass();
                ((View.OnClickListener) obj).onClick(view);
                nVar.a(1);
                return;
            case 1:
                ((C0674c) obj2).c((MenuItem) obj);
                return;
            case 2:
                C0676c1.c((C0676c1) obj2, (C0670b1) obj);
                return;
            case 3:
                C0795w1 w1Var = (C0795w1) obj2;
                w1Var.getClass();
                int adapterPosition = ((C0789v1) obj).getAdapterPosition();
                if (adapterPosition >= 0) {
                    ArrayList arrayList = w1Var.f11040c;
                    if (arrayList.size() > adapterPosition) {
                        ((C0783u1) arrayList.get(adapterPosition)).f10990d = !((C0783u1) arrayList.get(adapterPosition)).f10990d;
                        w1Var.notifyDataSetChanged();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                C0795w1 w1Var2 = (C0795w1) obj2;
                w1Var2.getClass();
                int adapterPosition2 = ((C1) obj).getAdapterPosition();
                if (adapterPosition2 >= 0) {
                    ArrayList arrayList2 = w1Var2.f11040c;
                    if (arrayList2.size() > adapterPosition2) {
                        ((B1) arrayList2.get(adapterPosition2)).f9798f = !((B1) arrayList2.get(adapterPosition2)).f9798f;
                        w1Var2.notifyDataSetChanged();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                int i = C0695f2.f10625d0;
                C0695f2 f2Var = (C0695f2) obj2;
                f2Var.getClass();
                f2Var.b(((C0788v0) ((ArrayList) obj).get(0)).f11004b);
                return;
            case 6:
                F3 f32 = (F3) obj;
                int i8 = C0695f2.f10625d0;
                C0695f2 f2Var2 = (C0695f2) obj2;
                f2Var2.getClass();
                try {
                    f2Var2.f10627V.startActivity(f32.f9894d);
                    return;
                } catch (Exception e) {
                    Log.e("f2", "Can't open intent " + a.o0(f32.f9894d) + " due to " + e.getMessage());
                    return;
                }
            case 7:
                Q2.b((Q2) obj2, (P2) obj);
                return;
            case 8:
                int i9 = ProvisioningActivity.f10263k0;
                ProvisioningActivity provisioningActivity = (ProvisioningActivity) obj2;
                provisioningActivity.getClass();
                String trim = ((EditText) obj).getText().toString().trim();
                if (!trim.isEmpty()) {
                    provisioningActivity.d();
                    new C0723k0(provisioningActivity, trim).execute(new Void[0]);
                    return;
                }
                return;
            case 9:
                C0750o3.b((C0750o3) obj2, (C0744n3) obj);
                return;
            default:
                Q4.b((Q4) obj2, (P4) obj);
                return;
        }
    }
}
