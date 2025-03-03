package de.ozerov.fully;

import android.content.DialogInterface;
import d4.k;

/* renamed from: de.ozerov.fully.v4  reason: case insensitive filesystem */
public final /* synthetic */ class C0792v4 implements DialogInterface.OnClickListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f11014U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ k f11015V;

    public /* synthetic */ C0792v4(k kVar, int i) {
        this.f11014U = i;
        this.f11015V = kVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f11014U) {
            case 0:
                this.f11015V.V2("lastVersionInfo", "1.17.1");
                C0798w4.a();
                return;
            default:
                this.f11015V.V2("lastVersionInfo", "1.17.1-review");
                C0798w4.a();
                return;
        }
    }
}
