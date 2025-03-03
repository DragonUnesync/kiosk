package de.ozerov.fully;

import D.C0051j0;
import android.database.MatrixCursor;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import o.X0;
import o.Y0;
import z0.C1643e;

/* renamed from: de.ozerov.fully.t  reason: case insensitive filesystem */
public final class C0775t implements Y0, X0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0805y f10955a;

    public /* synthetic */ C0775t(C0805y yVar) {
        this.f10955a = yVar;
    }

    public void a(String str) {
        boolean z;
        C0805y yVar = this.f10955a;
        C1643e eVar = yVar.f11110y1;
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"_id", "label", "component", "package"});
        try {
            if (str.length() > 1) {
                ArrayList X3 = yVar.X(str);
                Collections.sort(X3, new C0051j0(10));
                if (X3.size() > 20) {
                    z = true;
                } else {
                    z = false;
                }
                Iterator it = X3.iterator();
                int i = 0;
                while (it.hasNext()) {
                    T t8 = (T) it.next();
                    if (z) {
                        if (t8.f10353g > 2) {
                        }
                    }
                    int i8 = i + 1;
                    Integer valueOf = Integer.valueOf(i);
                    String str2 = t8.f10348a;
                    String str3 = t8.f10349b;
                    matrixCursor.addRow(new Object[]{valueOf, str2, str3, str3.split("/")[0]});
                    i = i8;
                }
            }
        } catch (Exception e) {
            Log.e("y", "Failed to lookup " + str, e);
        }
        eVar.a(matrixCursor);
    }

    public void b() {
        C0805y yVar = this.f10955a;
        if (yVar.f11110y1.f16406W.getCount() > 0) {
            C0805y.W(yVar, 0);
        }
        yVar.f11103o1.clearFocus();
    }

    public void c(int i) {
        C0805y yVar = this.f10955a;
        C0805y.W(yVar, i);
        yVar.f11103o1.clearFocus();
    }
}
