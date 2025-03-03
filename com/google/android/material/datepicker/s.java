package com.google.android.material.datepicker;

import Z1.c;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.F;
import androidx.recyclerview.widget.S;
import androidx.recyclerview.widget.j0;
import java.util.Calendar;

public final class s extends F {

    /* renamed from: a  reason: collision with root package name */
    public final b f9345a;

    /* renamed from: b  reason: collision with root package name */
    public final c f9346b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9347c;

    public s(ContextThemeWrapper contextThemeWrapper, b bVar, c cVar) {
        int i;
        o oVar = bVar.f9268U;
        o oVar2 = bVar.f9271X;
        if (oVar.f9329U.compareTo(oVar2.f9329U) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (oVar2.f9329U.compareTo(bVar.f9269V.f9329U) <= 0) {
            int dimensionPixelSize = contextThemeWrapper.getResources().getDimensionPixelSize(2131165857) * p.f9336X;
            if (m.U(contextThemeWrapper, 16843277)) {
                i = contextThemeWrapper.getResources().getDimensionPixelSize(2131165857);
            } else {
                i = 0;
            }
            this.f9347c = dimensionPixelSize + i;
            this.f9345a = bVar;
            this.f9346b = cVar;
            setHasStableIds(true);
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    public final int getItemCount() {
        return this.f9345a.f9274a0;
    }

    public final long getItemId(int i) {
        Calendar a8 = w.a(this.f9345a.f9268U.f9329U);
        a8.add(2, i);
        a8.set(5, 1);
        Calendar a9 = w.a(a8);
        a9.get(2);
        a9.get(1);
        a9.getMaximum(7);
        a9.getActualMaximum(5);
        a9.getTimeInMillis();
        return a9.getTimeInMillis();
    }

    public final void onBindViewHolder(j0 j0Var, int i) {
        r rVar = (r) j0Var;
        b bVar = this.f9345a;
        Calendar a8 = w.a(bVar.f9268U.f9329U);
        a8.add(2, i);
        o oVar = new o(a8);
        rVar.f9343a.setText(oVar.w());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) rVar.f9344b.findViewById(2131362266);
        if (materialCalendarGridView.a() == null || !oVar.equals(materialCalendarGridView.a().f9338U)) {
            new p(oVar, bVar);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    public final j0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(2131558539, viewGroup, false);
        if (!m.U(viewGroup.getContext(), 16843277)) {
            return new r(linearLayout, false);
        }
        linearLayout.setLayoutParams(new S(-1, this.f9347c));
        return new r(linearLayout, true);
    }
}
