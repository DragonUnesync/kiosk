package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

public final class q implements AdapterView.OnItemClickListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f9341U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ s f9342V;

    public q(s sVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f9342V = sVar;
        this.f9341U = materialCalendarGridView;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j7) {
        MaterialCalendarGridView materialCalendarGridView = this.f9341U;
        p a8 = materialCalendarGridView.a();
        if (i >= a8.a() && i <= a8.c()) {
            if (materialCalendarGridView.a().getItem(i).longValue() >= ((k) this.f9342V.f9346b.f6955V).f9293R0.f9270W.f9277U) {
                throw null;
            }
        }
    }
}
