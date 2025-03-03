package androidx.emoji2.text;

import com.google.android.material.datepicker.k;
import java.util.ArrayList;
import java.util.List;
import k2.C1160q;
import l0.C1169b;
import n2.a;

public final class h implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f7788U;

    /* renamed from: V  reason: collision with root package name */
    public final int f7789V;

    /* renamed from: W  reason: collision with root package name */
    public final Object f7790W;

    public /* synthetic */ h(int i, int i8, Object obj) {
        this.f7788U = i8;
        this.f7790W = obj;
        this.f7789V = i;
    }

    public final void run() {
        switch (this.f7788U) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f7790W;
                int size = arrayList.size();
                int i = 0;
                if (this.f7789V != 1) {
                    while (i < size) {
                        ((g) arrayList.get(i)).a();
                        i++;
                    }
                    return;
                }
                while (i < size) {
                    ((g) arrayList.get(i)).b();
                    i++;
                }
                return;
            case 1:
                ((k) this.f7790W).f9298W0.smoothScrollToPosition(this.f7789V);
                return;
            default:
                C1169b bVar = (C1169b) ((C1160q) this.f7790W).f13026V;
                if (bVar != null) {
                    bVar.h(this.f7789V);
                    return;
                }
                return;
        }
    }

    public h(List list, int i, Throwable th) {
        this.f7788U = 0;
        a.l(list, "initCallbacks cannot be null");
        this.f7790W = new ArrayList(list);
        this.f7789V = i;
    }
}
