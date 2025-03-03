package t7;

import D2.t;
import D6.k;
import P6.f;
import T6.c;
import W6.b;
import W6.d;
import W6.l;
import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import org.acra.file.Directory;

/* renamed from: t7.h  reason: case insensitive filesystem */
public final class C1440h extends Directory {
    public final File getFile(Context context, String str) {
        ArrayList arrayList;
        f.e(context, "context");
        f.e(str, "fileName");
        String[] strArr = {File.separator};
        String str2 = strArr[0];
        if (str2.length() == 0) {
            t tVar = new t(1, d.j0(str, strArr, false, 2));
            ArrayList arrayList2 = new ArrayList(k.M(tVar));
            Iterator it = tVar.iterator();
            while (true) {
                b bVar = (b) it;
                if (!bVar.hasNext()) {
                    arrayList = arrayList2;
                    break;
                }
                arrayList2.add(d.p0(str, (c) bVar.next()));
            }
        } else {
            arrayList = d.n0(2, str, str2, false);
        }
        if (arrayList.size() == 1) {
            return new File(str);
        }
        File[] listRoots = File.listRoots();
        D6.b g8 = f.g(listRoots);
        while (g8.hasNext()) {
            File file = (File) g8.next();
            Object obj = arrayList.get(0);
            String path = file.getPath();
            f.d(path, "getPath(...)");
            String str3 = File.separator;
            f.d(str3, "separator");
            if (f.a(obj, l.Y(path, str3, ""))) {
                return new File(file, (String) arrayList.get(1));
            }
        }
        return new File(listRoots[0], str);
    }
}
