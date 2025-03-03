package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: androidx.fragment.app.n  reason: case insensitive filesystem */
public final class C0463n implements DialogInterface.OnCancelListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ r f8013U;

    public C0463n(r rVar) {
        this.f8013U = rVar;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        r rVar = this.f8013U;
        Dialog dialog = rVar.f8029a1;
        if (dialog != null) {
            rVar.onCancel(dialog);
        }
    }
}
