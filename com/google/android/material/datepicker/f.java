package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

public final class f implements View.OnClickListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f9282U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ s f9283V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ k f9284W;

    public /* synthetic */ f(k kVar, s sVar, int i) {
        this.f9282U = i;
        this.f9284W = kVar;
        this.f9283V = sVar;
    }

    public final void onClick(View view) {
        switch (this.f9282U) {
            case 0:
                k kVar = this.f9284W;
                int Z02 = ((LinearLayoutManager) kVar.f9298W0.getLayoutManager()).Z0() - 1;
                if (Z02 >= 0) {
                    Calendar a8 = w.a(this.f9283V.f9345a.f9268U.f9329U);
                    a8.add(2, Z02);
                    kVar.O(new o(a8));
                    return;
                }
                return;
            default:
                k kVar2 = this.f9284W;
                int Y02 = ((LinearLayoutManager) kVar2.f9298W0.getLayoutManager()).Y0() + 1;
                if (Y02 < kVar2.f9298W0.getAdapter().getItemCount()) {
                    Calendar a9 = w.a(this.f9283V.f9345a.f9268U.f9329U);
                    a9.add(2, Y02);
                    kVar2.O(new o(a9));
                    return;
                }
                return;
        }
    }
}
