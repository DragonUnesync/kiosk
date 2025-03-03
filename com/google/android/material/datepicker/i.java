package com.google.android.material.datepicker;

import android.graphics.Canvas;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.N;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f0;
import java.util.Calendar;

public final class i extends N {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f9288a;

    public i(k kVar) {
        this.f9288a = kVar;
        w.c((Calendar) null);
        w.c((Calendar) null);
    }

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, f0 f0Var) {
        if ((recyclerView.getAdapter() instanceof y) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            y yVar = (y) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            this.f9288a.getClass();
            throw null;
        }
    }
}
