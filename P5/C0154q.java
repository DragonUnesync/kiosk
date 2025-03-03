package P5;

import de.ozerov.fully.C0794w0;
import de.ozerov.fully.C0800x0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import n2.a;

/* renamed from: P5.q  reason: case insensitive filesystem */
public final class C0154q extends C0148k {
    public final K a() {
        ArrayList arrayList = this.f3895t;
        if (!this.f3891p) {
            return null;
        }
        String str = "fully-single-app-stats-" + a.H() + ".csv";
        try {
            C0794w0.P0(C0794w0.f11018b);
            ArrayList E8 = C0794w0.E(65000);
            if (E8 != null) {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(this.f3879b.getCacheDir(), str));
                fileOutputStream.write(C0800x0.b().getBytes());
                Iterator it = E8.iterator();
                while (it.hasNext()) {
                    fileOutputStream.write(((C0800x0) it.next()).c().getBytes());
                }
                fileOutputStream.close();
                K g8 = P.g(J.OK, P.c(str), new FileInputStream(new File(this.f3879b.getCacheDir(), str)));
                D d8 = this.i;
                if (d8 != null) {
                    d8.c(g8);
                }
                g8.k("content-disposition", "attachment; filename=\"" + str + "\"");
                return g8;
            }
            arrayList.add("No stats found");
            return null;
        } catch (Exception unused) {
            arrayList.add("Failed to download " + str);
            return null;
        }
    }
}
