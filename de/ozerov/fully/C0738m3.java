package de.ozerov.fully;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: de.ozerov.fully.m3  reason: case insensitive filesystem */
public final class C0738m3 implements AdapterView.OnItemSelectedListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ C0744n3 f10801U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ int f10802V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ C0750o3 f10803W;

    public C0738m3(C0750o3 o3Var, C0744n3 n3Var, int i) {
        this.f10803W = o3Var;
        this.f10801U = n3Var;
        this.f10802V = i;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j7) {
        this.f10801U.f10851c.requestFocus();
        ((C0726k3) this.f10803W.mItemList.get(this.f10802V)).f10774c = i;
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
