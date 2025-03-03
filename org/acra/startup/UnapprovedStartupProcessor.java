package org.acra.startup;

import C7.a;
import C7.e;
import P6.f;
import Q0.g;
import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p1.E;
import r7.C1395d;

public class UnapprovedStartupProcessor implements StartupProcessor {
    public /* bridge */ /* synthetic */ boolean enabled(C1395d dVar) {
        E.a(dVar);
        return true;
    }

    public void processReports(Context context, C1395d dVar, List<a> list) {
        f.e(context, "context");
        f.e(dVar, "config");
        f.e(list, "reports");
        if (dVar.f14959a0) {
            ArrayList arrayList = new ArrayList();
            for (a next : list) {
                if (!next.f724b) {
                    arrayList.add(next);
                }
            }
            if (!arrayList.isEmpty()) {
                if (arrayList.size() > 1) {
                    e eVar = new e(0);
                    if (arrayList.size() > 1) {
                        Collections.sort(arrayList, eVar);
                    }
                }
                int size = arrayList.size() - 1;
                for (int i = 0; i < size; i++) {
                    ((a) arrayList.get(i)).f725c = true;
                }
                ((a) g.l(1, arrayList)).f726d = true;
            }
        }
    }
}
