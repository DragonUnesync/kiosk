package de.ozerov.fully;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import androidx.appcompat.widget.Toolbar;

/* renamed from: de.ozerov.fully.c2  reason: case insensitive filesystem */
public final /* synthetic */ class C0677c2 implements DialogInterface.OnDismissListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ C0695f2 f10578U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Toolbar f10579V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ Dialog f10580W;

    public /* synthetic */ C0677c2(C0695f2 f2Var, Toolbar toolbar, Dialog dialog) {
        this.f10578U = f2Var;
        this.f10579V = toolbar;
        this.f10580W = dialog;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        int i = C0695f2.f10625d0;
        this.f10578U.g();
        this.f10579V.setNavigationOnClickListener((View.OnClickListener) null);
        this.f10580W.setOnDismissListener((DialogInterface.OnDismissListener) null);
    }
}
