package de.ozerov.fully;

import D.C0051j0;
import android.database.MatrixCursor;
import android.util.Log;
import androidx.appcompat.widget.SearchView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import o.X0;
import o.Y0;
import z0.C1643e;

/* renamed from: de.ozerov.fully.e2  reason: case insensitive filesystem */
public final class C0689e2 implements Y0, X0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SearchView f10609a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0695f2 f10610b;

    public /* synthetic */ C0689e2(C0695f2 f2Var, SearchView searchView) {
        this.f10610b = f2Var;
        this.f10609a = searchView;
    }

    public void a(String str) {
        boolean z;
        C0695f2 f2Var = this.f10610b;
        C1643e eVar = f2Var.f10630Y;
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"_id", "keyChain", "path", "title", "summary"});
        try {
            if (str.length() > 1) {
                C0770s0 s0Var = f2Var.f10627V.f9932U0;
                s0Var.getClass();
                ArrayList f8 = C0770s0.f(str.toLowerCase(), s0Var.f10938a, "", "");
                Collections.sort(f8, new C0051j0(14));
                if (f8.size() > 20) {
                    z = true;
                } else {
                    z = false;
                }
                Iterator it = f8.iterator();
                int i = 0;
                while (it.hasNext()) {
                    C0788v0 v0Var = (C0788v0) it.next();
                    if (z) {
                        if (v0Var.f11003a > 2) {
                        }
                    }
                    int i8 = i + 1;
                    Integer valueOf = Integer.valueOf(i);
                    String str2 = v0Var.f11004b;
                    String str3 = v0Var.f11006d;
                    if (str3.isEmpty()) {
                        str3 = "Main Settings Screen";
                    }
                    matrixCursor.addRow(new Object[]{valueOf, str2, str3, v0Var.f11005c, v0Var.e});
                    i = i8;
                }
            }
        } catch (Exception e) {
            Log.e("f2", "Failed to lookup " + str, e);
        }
        eVar.a(matrixCursor);
    }

    public void b() {
        int i = C0695f2.f10625d0;
        C0695f2 f2Var = this.f10610b;
        if (f2Var.f10630Y.f16406W.getCount() > 0) {
            C0695f2.a(f2Var, 0);
        }
        this.f10609a.clearFocus();
    }

    public void c(int i) {
        int i8 = C0695f2.f10625d0;
        C0695f2.a(this.f10610b, i);
        this.f10609a.clearFocus();
    }
}
