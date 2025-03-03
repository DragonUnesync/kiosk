package m;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import n.C1221B;

/* renamed from: m.e  reason: case insensitive filesystem */
public final class C1186e extends ActionMode {

    /* renamed from: a  reason: collision with root package name */
    public final Context f13268a;

    /* renamed from: b  reason: collision with root package name */
    public final C1182a f13269b;

    public C1186e(Context context, C1182a aVar) {
        this.f13268a = context;
        this.f13269b = aVar;
    }

    public final void finish() {
        this.f13269b.a();
    }

    public final View getCustomView() {
        return this.f13269b.b();
    }

    public final Menu getMenu() {
        return new C1221B(this.f13268a, this.f13269b.c());
    }

    public final MenuInflater getMenuInflater() {
        return this.f13269b.d();
    }

    public final CharSequence getSubtitle() {
        return this.f13269b.e();
    }

    public final Object getTag() {
        return this.f13269b.f13255U;
    }

    public final CharSequence getTitle() {
        return this.f13269b.f();
    }

    public final boolean getTitleOptionalHint() {
        return this.f13269b.f13256V;
    }

    public final void invalidate() {
        this.f13269b.g();
    }

    public final boolean isTitleOptional() {
        return this.f13269b.h();
    }

    public final void setCustomView(View view) {
        this.f13269b.i(view);
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.f13269b.k(charSequence);
    }

    public final void setTag(Object obj) {
        this.f13269b.f13255U = obj;
    }

    public final void setTitle(CharSequence charSequence) {
        this.f13269b.m(charSequence);
    }

    public final void setTitleOptionalHint(boolean z) {
        this.f13269b.n(z);
    }

    public final void setSubtitle(int i) {
        this.f13269b.j(i);
    }

    public final void setTitle(int i) {
        this.f13269b.l(i);
    }
}
