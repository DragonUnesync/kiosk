package de.ozerov.fully;

import android.view.View;
import android.widget.CheckBox;

/* renamed from: de.ozerov.fully.v  reason: case insensitive filesystem */
public final /* synthetic */ class C0787v implements View.OnClickListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ C0793w f10999U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ T f11000V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ CheckBox f11001W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ int f11002X;

    public /* synthetic */ C0787v(C0793w wVar, T t8, CheckBox checkBox, int i) {
        this.f10999U = wVar;
        this.f11000V = t8;
        this.f11001W = checkBox;
        this.f11002X = i;
    }

    public final void onClick(View view) {
        C0793w wVar = this.f10999U;
        wVar.getClass();
        this.f11000V.f10352f = this.f11001W.isChecked();
        C0686e eVar = wVar.f11016U;
        if (((C0805y) eVar.f10605b).f11106r1) {
            int i = 0;
            while (true) {
                C0805y yVar = (C0805y) eVar.f10605b;
                if (i < yVar.f11108v1.size()) {
                    if (i != this.f11002X) {
                        ((T) yVar.f11108v1.get(i)).f10352f = false;
                    }
                    i++;
                } else {
                    wVar.notifyDataSetChanged();
                    return;
                }
            }
        }
    }
}
