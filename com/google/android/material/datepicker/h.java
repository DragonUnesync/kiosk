package com.google.android.material.datepicker;

import androidx.recyclerview.widget.C0513y;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f0;

public final class h extends LinearLayoutManager {

    /* renamed from: y0  reason: collision with root package name */
    public final /* synthetic */ int f9286y0;

    /* renamed from: z0  reason: collision with root package name */
    public final /* synthetic */ k f9287z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(k kVar, int i, int i8) {
        super(i);
        this.f9287z0 = kVar;
        this.f9286y0 = i8;
    }

    public final void L0(RecyclerView recyclerView, int i) {
        C0513y yVar = new C0513y(recyclerView.getContext());
        yVar.f8547a = i;
        M0(yVar);
    }

    public final void O0(f0 f0Var, int[] iArr) {
        int i = this.f9286y0;
        k kVar = this.f9287z0;
        if (i == 0) {
            iArr[0] = kVar.f9298W0.getWidth();
            iArr[1] = kVar.f9298W0.getWidth();
            return;
        }
        iArr[0] = kVar.f9298W0.getHeight();
        iArr[1] = kVar.f9298W0.getHeight();
    }
}
