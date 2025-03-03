package de.ozerov.fully;

import android.view.View;

/* renamed from: de.ozerov.fully.l3  reason: case insensitive filesystem */
public final /* synthetic */ class C0732l3 implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10787a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0750o3 f10788b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0744n3 f10789c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f10790d;

    public /* synthetic */ C0732l3(C0750o3 o3Var, C0744n3 n3Var, int i, int i8) {
        this.f10787a = i8;
        this.f10788b = o3Var;
        this.f10789c = n3Var;
        this.f10790d = i;
    }

    public final void onFocusChange(View view, boolean z) {
        switch (this.f10787a) {
            case 0:
                C0750o3.a(this.f10788b, this.f10789c, this.f10790d, view, z);
                return;
            default:
                C0750o3.c(this.f10788b, this.f10789c, this.f10790d, view, z);
                return;
        }
    }
}
