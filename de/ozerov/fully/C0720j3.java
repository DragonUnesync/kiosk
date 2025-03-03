package de.ozerov.fully;

import B.j0;
import android.app.Activity;
import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: de.ozerov.fully.j3  reason: case insensitive filesystem */
public final /* synthetic */ class C0720j3 implements DialogInterface.OnClickListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ j0 f10748U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ ArrayList f10749V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ Runnable f10750W;

    public /* synthetic */ C0720j3(j0 j0Var, ArrayList arrayList, Runnable runnable) {
        this.f10748U = j0Var;
        this.f10749V = arrayList;
        this.f10750W = runnable;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        j0 j0Var = this.f10748U;
        Activity activity = (Activity) j0Var.f266W;
        if (!activity.isDestroyed() && !activity.isFinishing()) {
            dialogInterface.dismiss();
        }
        j0Var.f265V = false;
        Iterator it = this.f10749V.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            num.intValue();
            String str = (String) ((HashMap) j0Var.f269Z).get(num);
            if (str != null) {
                j0Var.g(str);
            }
        }
        Runnable runnable = this.f10750W;
        if (runnable != null) {
            runnable.run();
        }
    }
}
