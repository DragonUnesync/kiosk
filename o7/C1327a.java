package o7;

import P6.f;
import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import n2.a;
import n7.C1247a;
import org.acra.ErrorReporter;
import r7.C1395d;

/* renamed from: o7.a  reason: case insensitive filesystem */
public final class C1327a {
    public static ArrayList a(Context context, C1395d dVar) {
        Uri uri;
        f.e(context, "context");
        f.e(dVar, "configuration");
        ArrayList arrayList = new ArrayList();
        for (String str : dVar.f14972n0) {
            try {
                uri = Uri.parse(str);
            } catch (Exception e) {
                ErrorReporter errorReporter = C1247a.f13789a;
                ErrorReporter errorReporter2 = C1247a.f13789a;
                a.B("Failed to parse Uri " + str, e);
                uri = null;
            }
            if (uri != null) {
                arrayList.add(uri);
            }
        }
        return arrayList;
    }
}
