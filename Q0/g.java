package Q0;

import D2.o;
import M0.C0129q;
import M0.r;
import N.e;
import P0.l;
import android.preference.Preference;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import de.ozerov.fully.F3;
import e5.c;
import g7.C0996d;
import i5.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import m4.d;
import m4.f;
import p1.G;
import u4.C1492a;

public abstract /* synthetic */ class g {
    public static /* synthetic */ String A(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String B(int i) {
        if (i == 1) {
            return "NONE";
        }
        if (i != 2) {
            return i != 3 ? "null" : "REMOVING";
        }
        return "ADDING";
    }

    public static /* synthetic */ String C(int i) {
        if (i == 1) {
            return "REMOVED";
        }
        if (i == 2) {
            return "VISIBLE";
        }
        if (i != 3) {
            return i != 4 ? "null" : "INVISIBLE";
        }
        return "GONE";
    }

    public static boolean a(p pVar, Collection collection) {
        C0996d.r(collection, "Collection");
        for (Object contains : collection) {
            if (!pVar.contains(contains)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [android.view.ViewParent] */
    /* JADX WARNING: type inference failed for: r5v7, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(int r5, android.view.View r6, android.view.ViewGroup r7) {
        /*
            java.lang.String r0 = "view"
            P6.f.e(r6, r0)
            java.lang.String r0 = "container"
            P6.f.e(r7, r0)
            int r5 = u.C1477r.h(r5)
            r0 = 0
            r1 = 2
            java.lang.String r2 = "FragmentManager"
            if (r5 == 0) goto L_0x00af
            r3 = 1
            java.lang.String r4 = "SpecialEffectsController: Setting view "
            if (r5 == r3) goto L_0x0061
            if (r5 == r1) goto L_0x0040
            r7 = 3
            if (r5 == r7) goto L_0x0020
            goto L_0x00de
        L_0x0020:
            boolean r5 = android.util.Log.isLoggable(r2, r1)
            if (r5 == 0) goto L_0x003a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            r5.append(r6)
            java.lang.String r7 = " to INVISIBLE"
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            android.util.Log.v(r2, r5)
        L_0x003a:
            r5 = 4
            r6.setVisibility(r5)
            goto L_0x00de
        L_0x0040:
            boolean r5 = android.util.Log.isLoggable(r2, r1)
            if (r5 == 0) goto L_0x005a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            r5.append(r6)
            java.lang.String r7 = " to GONE"
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            android.util.Log.v(r2, r5)
        L_0x005a:
            r5 = 8
            r6.setVisibility(r5)
            goto L_0x00de
        L_0x0061:
            boolean r5 = android.util.Log.isLoggable(r2, r1)
            if (r5 == 0) goto L_0x007b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            r5.append(r6)
            java.lang.String r3 = " to VISIBLE"
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            android.util.Log.v(r2, r5)
        L_0x007b:
            android.view.ViewParent r5 = r6.getParent()
            boolean r3 = r5 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x0086
            r0 = r5
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
        L_0x0086:
            if (r0 != 0) goto L_0x00aa
            boolean r5 = android.util.Log.isLoggable(r2, r1)
            if (r5 == 0) goto L_0x00a7
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "SpecialEffectsController: Adding view "
            r5.<init>(r0)
            r5.append(r6)
            java.lang.String r0 = " to Container "
            r5.append(r0)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            android.util.Log.v(r2, r5)
        L_0x00a7:
            r7.addView(r6)
        L_0x00aa:
            r5 = 0
            r6.setVisibility(r5)
            goto L_0x00de
        L_0x00af:
            android.view.ViewParent r5 = r6.getParent()
            boolean r7 = r5 instanceof android.view.ViewGroup
            if (r7 == 0) goto L_0x00ba
            r0 = r5
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
        L_0x00ba:
            if (r0 == 0) goto L_0x00de
            boolean r5 = android.util.Log.isLoggable(r2, r1)
            if (r5 == 0) goto L_0x00db
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "SpecialEffectsController: Removing view "
            r5.<init>(r7)
            r5.append(r6)
            java.lang.String r7 = " from container "
            r5.append(r7)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            android.util.Log.v(r2, r5)
        L_0x00db:
            r0.removeView(r6)
        L_0x00de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.g.b(int, android.view.View, android.view.ViewGroup):void");
    }

    public static o c(int i) {
        o oVar = new o(14, (byte) 0);
        if (i > 1) {
            oVar.f1139X = new Object[i];
        }
        return oVar;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, e5.c] */
    public static c d() {
        ? obj = new Object();
        obj.f11265a = "localhost";
        obj.f11266b = -1;
        obj.e = C1492a.f15774Y;
        obj.f11269f = f.f13379d;
        obj.f11270g = d.f13375c;
        return obj;
    }

    public static int e(int i, int i8, int i9, int i10) {
        return i | i8 | i9 | 128 | i10;
    }

    public static int f(int i) {
        return i & 384;
    }

    public static int g(int i) {
        return i & 64;
    }

    public static /* synthetic */ boolean h(int i) {
        if (i == 1 || i == 2 || i == 3) {
            return false;
        }
        if (i == 4 || i == 5) {
            return true;
        }
        throw null;
    }

    public static boolean i(int i, boolean z) {
        int i8 = i & 7;
        if (i8 == 4 || (z && i8 == 3)) {
            return true;
        }
        return false;
    }

    public static float j(float f8, float f9, float f10, float f11) {
        return ((f8 - f9) * f10) + f11;
    }

    public static ClassCastException k(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static Object l(int i, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i);
    }

    public static String m(int i, String str) {
        return str + i;
    }

    public static String n(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.exceptionLabel());
        return sb.toString();
    }

    public static String o(StringBuilder sb, long j7, String str) {
        sb.append(j7);
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder p(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder q(Preference preference, boolean z) {
        preference.setEnabled(z);
        return new StringBuilder();
    }

    public static StringBuilder r(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static StringBuilder s(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static /* synthetic */ void t(int i, String str) {
        if (i == 0) {
            throw new IllegalArgumentException(e.y("The parameter '", str, "' must not be null."));
        }
    }

    public static void u(int i, String str, String str2) {
        l.B(str2, str + i);
    }

    public static void v(C0129q qVar, G g8) {
        g8.c(new r(qVar));
    }

    public static void w(Preference preference, StringBuilder sb, String str) {
        sb.append(preference.getSummary());
        sb.append(str);
        preference.setSummary(sb.toString());
    }

    public static void x(Exception exc, StringBuilder sb, String str) {
        sb.append(exc.getMessage());
        Log.e(str, sb.toString());
    }

    public static void y(String str, String str2, ArrayList arrayList) {
        arrayList.add(new F3(str, str2));
    }

    public static void z(Exception exc, StringBuilder sb, String str) {
        sb.append(exc.getMessage());
        Log.w(str, sb.toString());
    }
}
