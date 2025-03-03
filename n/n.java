package n;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import h.C1020h;

public final class n implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, x {

    /* renamed from: U  reason: collision with root package name */
    public C1224E f13501U;

    /* renamed from: V  reason: collision with root package name */
    public C1020h f13502V;

    /* renamed from: W  reason: collision with root package name */
    public i f13503W;

    public final void a(m mVar, boolean z) {
        C1020h hVar;
        if ((z || mVar == this.f13501U) && (hVar = this.f13502V) != null) {
            hVar.dismiss();
        }
    }

    public final boolean n(m mVar) {
        return false;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        i iVar = this.f13503W;
        if (iVar.f13470Z == null) {
            iVar.f13470Z = new h(iVar);
        }
        this.f13501U.q(iVar.f13470Z.getItem(i), (y) null, 0);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f13503W.a(this.f13501U, true);
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        C1224E e = this.f13501U;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f13502V.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f13502V.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                e.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return e.performShortcut(i, keyEvent, 0);
    }
}
