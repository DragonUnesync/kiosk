package de.ozerov.fully;

import Z2.a;
import android.content.Intent;
import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: de.ozerov.fully.h1  reason: case insensitive filesystem */
public final /* synthetic */ class C0706h1 implements D, a, C0799x {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ C0718j1 f10686U;

    public /* synthetic */ C0706h1(C0718j1 j1Var) {
        this.f10686U = j1Var;
    }

    public void d(String[] strArr) {
        C0718j1 j1Var = this.f10686U;
        j1Var.getClass();
        for (String str : strArr) {
            new Intent("android.intent.action.VIEW").setData(Uri.parse(str));
            C0664a1 a1Var = new C0664a1();
            a1Var.f10544b = Uri.fromFile(new File(n2.a.Y0(j1Var.f9850f1, str))).toString();
            C0664a1.b(a1Var, j1Var.f9850f1);
            j1Var.f10743m1.add(a1Var);
        }
        if (strArr.length > 0) {
            j1Var.f10744n1.notifyDataSetChanged();
            C0664a1.d(j1Var.f9850f1, j1Var.f10743m1);
            j1Var.f10745o1.getRecyclerView().scrollToPosition(j1Var.f10743m1.size() - 1);
        }
    }

    public void i(String str) {
        C0718j1 j1Var = this.f10686U;
        j1Var.getClass();
        String a8 = P.a(str);
        if (P.I(a8)) {
            C0664a1 a1Var = new C0664a1();
            a1Var.f10544b = a8;
            new C0711i0(1, j1Var).execute(new C0664a1[]{a1Var});
            return;
        }
        n2.a.a1(1, j1Var.f9850f1, "Wrong URL dismissed");
    }

    public void k(ArrayList arrayList) {
        C0718j1 j1Var = this.f10686U;
        j1Var.f10743m1.size();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            T t8 = (T) it.next();
            C0664a1 a1Var = new C0664a1();
            a1Var.f10543a = t8.f10349b;
            a1Var.f10545c = t8.f10348a;
            a1Var.e = t8.e;
            a1Var.f10547f = 1;
            j1Var.f10743m1.add(a1Var);
        }
        if (!arrayList.isEmpty()) {
            j1Var.f10744n1.notifyDataSetChanged();
            C0664a1.d(j1Var.f9850f1, j1Var.f10743m1);
            j1Var.f10745o1.getRecyclerView().scrollToPosition(j1Var.f10743m1.size() - 1);
        }
    }
}
