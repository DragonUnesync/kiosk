package o;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import h.C1016d;
import h.C1019g;
import h.C1020h;

/* renamed from: o.I  reason: case insensitive filesystem */
public final class C1256I implements O, DialogInterface.OnClickListener {

    /* renamed from: U  reason: collision with root package name */
    public C1020h f13842U;

    /* renamed from: V  reason: collision with root package name */
    public J f13843V;

    /* renamed from: W  reason: collision with root package name */
    public CharSequence f13844W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ P f13845X;

    public C1256I(P p3) {
        this.f13845X = p3;
    }

    public final int a() {
        return 0;
    }

    public final boolean b() {
        C1020h hVar = this.f13842U;
        if (hVar != null) {
            return hVar.isShowing();
        }
        return false;
    }

    public final Drawable d() {
        return null;
    }

    public final void dismiss() {
        C1020h hVar = this.f13842U;
        if (hVar != null) {
            hVar.dismiss();
            this.f13842U = null;
        }
    }

    public final void f(CharSequence charSequence) {
        this.f13844W = charSequence;
    }

    public final void g(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    public final void h(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    public final void i(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    public final void j(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    public final void k(int i, int i8) {
        if (this.f13843V != null) {
            P p3 = this.f13845X;
            C1019g gVar = new C1019g(p3.getPopupContext());
            CharSequence charSequence = this.f13844W;
            if (charSequence != null) {
                gVar.setTitle(charSequence);
            }
            J j7 = this.f13843V;
            int selectedItemPosition = p3.getSelectedItemPosition();
            C1016d dVar = gVar.f12206a;
            dVar.f12173k = j7;
            dVar.f12174l = this;
            dVar.f12177o = selectedItemPosition;
            dVar.f12176n = true;
            C1020h create = gVar.create();
            this.f13842U = create;
            AlertController$RecycleListView alertController$RecycleListView = create.f12210Z.e;
            alertController$RecycleListView.setTextDirection(i);
            alertController$RecycleListView.setTextAlignment(i8);
            this.f13842U.show();
        }
    }

    public final int m() {
        return 0;
    }

    public final CharSequence n() {
        return this.f13844W;
    }

    public final void o(ListAdapter listAdapter) {
        this.f13843V = (J) listAdapter;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        P p3 = this.f13845X;
        p3.setSelection(i);
        if (p3.getOnItemClickListener() != null) {
            p3.performItemClick((View) null, i, this.f13843V.getItemId(i));
        }
        dismiss();
    }
}
