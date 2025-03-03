package de.ozerov.fully;

import B.j0;
import Q.h;
import android.app.Activity;
import android.content.DialogInterface;
import android.net.Uri;
import d4.k;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: de.ozerov.fully.m1  reason: case insensitive filesystem */
public final /* synthetic */ class C0736m1 implements DialogInterface.OnClickListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10794U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Object f10795V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ Object f10796W;

    public /* synthetic */ C0736m1(Object obj, int i, Object obj2) {
        this.f10794U = i;
        this.f10795V = obj;
        this.f10796W = obj2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f10794U) {
            case 0:
                C0686e eVar = (C0686e) this.f10795V;
                eVar.getClass();
                Uri.Builder buildUpon = Uri.parse("https://license.fully-kiosk.com/license/move").buildUpon();
                h hVar = (h) eVar.f10605b;
                String uri = buildUpon.appendQueryParameter("devid", ((k) hVar.f4006W).f1()).appendQueryParameter("devid2", (String) this.f10796W).build().toString();
                FullyActivity fullyActivity = (FullyActivity) hVar.f4005V;
                fullyActivity.f9917F0.n(uri, false);
                dialogInterface.cancel();
                fullyActivity.C();
                return;
            case 1:
                C0686e eVar2 = (C0686e) this.f10795V;
                h hVar2 = (h) eVar2.f10605b;
                ((k) hVar2.f4006W).T2("");
                if (eVar2 instanceof C0748o1) {
                    h.f(hVar2, (JSONObject) this.f10796W);
                }
                dialogInterface.cancel();
                return;
            case 2:
                j0 j0Var = (j0) this.f10795V;
                Activity activity = (Activity) j0Var.f266W;
                if (!activity.isDestroyed() && !activity.isFinishing()) {
                    dialogInterface.dismiss();
                }
                j0Var.f265V = false;
                j0Var.q((ArrayList) this.f10796W);
                return;
            default:
                j0 j0Var2 = (j0) this.f10795V;
                Activity activity2 = (Activity) j0Var2.f266W;
                if (!activity2.isDestroyed() && !activity2.isFinishing()) {
                    dialogInterface.dismiss();
                }
                j0Var2.f265V = false;
                Runnable runnable = (Runnable) this.f10796W;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
