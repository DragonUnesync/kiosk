package de.ozerov.fully;

import android.view.View;
import android.widget.AdapterView;
import java.util.List;

public final class R4 implements AdapterView.OnItemSelectedListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ List f10321U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ S4 f10322V;

    public R4(S4 s42, List list) {
        this.f10322V = s42;
        this.f10321U = list;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j7) {
        this.f10322V.X(this.f10321U);
    }

    public final void onNothingSelected(AdapterView adapterView) {
        this.f10322V.X(this.f10321U);
    }
}
