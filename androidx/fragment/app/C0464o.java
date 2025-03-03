package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: androidx.fragment.app.o  reason: case insensitive filesystem */
public final class C0464o implements DialogInterface.OnDismissListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ r f8014U;

    public C0464o(r rVar) {
        this.f8014U = rVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        r rVar = this.f8014U;
        Dialog dialog = rVar.f8029a1;
        if (dialog != null) {
            rVar.onDismiss(dialog);
        }
    }
}
