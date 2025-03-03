package de.ozerov.fully;

import R2.c;
import android.content.DialogInterface;
import android.webkit.WebStorage;
import androidx.appcompat.widget.SwitchCompat;
import java.util.Iterator;
import n2.a;

public final /* synthetic */ class K1 implements DialogInterface.OnClickListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ c f10040U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ SwitchCompat f10041V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ SwitchCompat f10042W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ SwitchCompat f10043X;

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ SwitchCompat f10044Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ SwitchCompat f10045Z;

    /* renamed from: a0  reason: collision with root package name */
    public final /* synthetic */ SwitchCompat f10046a0;

    public /* synthetic */ K1(c cVar, SwitchCompat switchCompat, SwitchCompat switchCompat2, SwitchCompat switchCompat3, SwitchCompat switchCompat4, SwitchCompat switchCompat5, SwitchCompat switchCompat6) {
        this.f10040U = cVar;
        this.f10041V = switchCompat;
        this.f10042W = switchCompat2;
        this.f10043X = switchCompat3;
        this.f10044Y = switchCompat4;
        this.f10045Z = switchCompat5;
        this.f10046a0 = switchCompat6;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        boolean z;
        c cVar = this.f10040U;
        boolean isChecked = this.f10041V.isChecked();
        boolean z6 = true;
        FullyActivity fullyActivity = (FullyActivity) cVar.f4336V;
        if (isChecked) {
            fullyActivity.f9928Q0.b(true, (Runnable) null);
            z = true;
        } else {
            z = false;
        }
        if (this.f10042W.isChecked()) {
            Iterator it = fullyActivity.f9917F0.f10710c.iterator();
            while (it.hasNext()) {
                ((g5) it.next()).f10664g.f10123c0 = true;
            }
            z = true;
        }
        if (this.f10043X.isChecked()) {
            try {
                WebStorage.getInstance().deleteAllData();
                z = true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (this.f10044Y.isChecked()) {
            fullyActivity.f9917F0.c();
            z = true;
        }
        if (this.f10045Z.isChecked()) {
            Iterator it2 = fullyActivity.f9917F0.f10710c.iterator();
            while (it2.hasNext()) {
                MyWebView myWebView = ((g5) it2.next()).f10664g;
                if (myWebView != null) {
                    myWebView.clearFormData();
                }
            }
            z = true;
        }
        if (this.f10046a0.isChecked()) {
            MyWebView.e(fullyActivity);
        } else {
            z6 = z;
        }
        if (z6) {
            a.b1(fullyActivity, "Clearing selected items");
        } else {
            a.b1(fullyActivity, "Nothing selected");
        }
        dialogInterface.cancel();
    }
}
