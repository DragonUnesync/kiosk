package o;

import androidx.appcompat.widget.ActionBarContextView;
import v0.C1515M;

/* renamed from: o.a  reason: case insensitive filesystem */
public final class C1257a implements C1515M {

    /* renamed from: a  reason: collision with root package name */
    public boolean f13909a = false;

    /* renamed from: b  reason: collision with root package name */
    public int f13910b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ActionBarContextView f13911c;

    public C1257a(ActionBarContextView actionBarContextView) {
        this.f13911c = actionBarContextView;
    }

    public final void a() {
        if (!this.f13909a) {
            ActionBarContextView actionBarContextView = this.f13911c;
            actionBarContextView.f7401c0 = null;
            C1257a.super.setVisibility(this.f13910b);
        }
    }

    public final void b() {
        this.f13909a = true;
    }

    public final void c() {
        C1257a.super.setVisibility(0);
        this.f13909a = false;
    }
}
