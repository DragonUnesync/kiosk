package de.ozerov.fully;

import G.l;
import android.app.AlertDialog;
import android.os.Handler;
import d4.k;
import n2.a;

/* renamed from: de.ozerov.fully.w4  reason: case insensitive filesystem */
public abstract class C0798w4 {

    /* renamed from: a  reason: collision with root package name */
    public static AlertDialog f11050a;

    /* renamed from: b  reason: collision with root package name */
    public static final Handler f11051b = new Handler();

    public static void a() {
        f11051b.removeCallbacksAndMessages((Object) null);
        AlertDialog alertDialog = f11050a;
        if (alertDialog != null && alertDialog.isShowing()) {
            f11050a.dismiss();
        }
        f11050a = null;
    }

    public static void b(boolean z, FullyActivity fullyActivity, k kVar) {
        if (z) {
            kVar.getClass();
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(fullyActivity);
        builder.setTitle("Fully updated to version 1.17.1");
        builder.setMessage(2131951970);
        builder.setCancelable(false);
        builder.setPositiveButton("Got it", new C0792v4(kVar, 0));
        builder.setNegativeButton("Show Later", new C0792v4(kVar, 1));
        a();
        AlertDialog create = builder.create();
        f11050a = create;
        a.Z0(create);
        f11051b.post(new l(f11050a.getButton(-1), kVar));
    }
}
