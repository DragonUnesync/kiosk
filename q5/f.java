package Q5;

import G3.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f4138a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public static final int f4139b = 4;

    /* renamed from: c  reason: collision with root package name */
    public static final e f4140c = c("sh");

    /* renamed from: d  reason: collision with root package name */
    public static final e f4141d = c("su");

    public static void a(i iVar) {
        synchronized (f.class) {
            b(iVar);
        }
    }

    public static void b(i iVar) {
        int i;
        for (String str : (String[]) f4138a.keySet().toArray(new String[0])) {
            ArrayList arrayList = (ArrayList) f4138a.get(str);
            if (arrayList != null) {
                if (j.b(str)) {
                    i = f4139b;
                } else {
                    i = 1;
                }
                int i8 = 0;
                int i9 = 0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    i iVar2 = (i) arrayList.get(size);
                    if (!iVar2.u() || iVar2 == iVar) {
                        arrayList.remove(size);
                    } else {
                        i8++;
                        if (!iVar2.f4151G0) {
                            i9++;
                        }
                    }
                }
                if (i8 > i && i9 > 1) {
                    int min = Math.min(i9 - 1, i8 - i);
                    for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                        i iVar3 = (i) arrayList.get(size2);
                        if (!iVar3.f4151G0 && iVar3.t()) {
                            arrayList.remove(size2);
                            iVar3.q(true);
                            min--;
                            if (min == 0) {
                                break;
                            }
                        }
                    }
                }
                if (arrayList.size() == 0) {
                    f4138a.remove(str);
                }
            }
        }
    }

    public static e c(String str) {
        e eVar;
        e eVar2;
        Locale locale = Locale.ENGLISH;
        if (str.toUpperCase(locale).equals("SH") && (eVar2 = f4140c) != null) {
            return eVar2;
        }
        if (!str.toUpperCase(locale).equals("SU") || (eVar = f4141d) == null) {
            return new e(str, false);
        }
        return eVar;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [Q5.a, java.lang.Object] */
    public static i d(String str) {
        ? obj;
        Locale locale = Locale.ENGLISH;
        synchronized (f.class) {
            obj = new Object();
            obj.f4123b = null;
            obj.f4124c = "sh";
            obj.f4122a = false;
            obj.f4125d = new LinkedList();
            obj.e = new HashMap();
            obj.f4122a = true;
        }
        obj.f4124c = str;
        return new i(obj);
    }
}
