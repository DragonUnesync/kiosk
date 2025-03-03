package androidx.fragment.app;

import B3.q;
import android.util.Log;
import androidx.activity.result.a;
import androidx.activity.result.b;
import java.util.ArrayList;
import java.util.Map;

public final class C implements b {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f7836U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ L f7837V;

    public /* synthetic */ C(L l8, int i) {
        this.f7836U = i;
        this.f7837V = l8;
    }

    public final void b(Object obj) {
        int i;
        switch (this.f7836U) {
            case 0:
                Map map = (Map) obj;
                String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i8 = 0; i8 < arrayList.size(); i8++) {
                    if (((Boolean) arrayList.get(i8)).booleanValue()) {
                        i = 0;
                    } else {
                        i = -1;
                    }
                    iArr[i8] = i;
                }
                L l8 = this.f7837V;
                H h5 = (H) l8.f7862F.pollFirst();
                if (h5 == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    return;
                }
                q qVar = l8.f7875c;
                String str = h5.f7851U;
                if (qVar.B(str) == null) {
                    Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    return;
                }
                return;
            case 1:
                a aVar = (a) obj;
                L l9 = this.f7837V;
                H h8 = (H) l9.f7862F.pollLast();
                if (h8 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    return;
                }
                q qVar2 = l9.f7875c;
                String str2 = h8.f7851U;
                C0470v B8 = qVar2.B(str2);
                if (B8 == null) {
                    Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                    return;
                }
                B8.u(h8.f7852V, aVar.f7324U, aVar.f7325V);
                return;
            default:
                a aVar2 = (a) obj;
                L l10 = this.f7837V;
                H h9 = (H) l10.f7862F.pollFirst();
                if (h9 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    return;
                }
                q qVar3 = l10.f7875c;
                String str3 = h9.f7851U;
                C0470v B9 = qVar3.B(str3);
                if (B9 == null) {
                    Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                    return;
                }
                B9.u(h9.f7852V, aVar2.f7324U, aVar2.f7325V);
                return;
        }
    }
}
