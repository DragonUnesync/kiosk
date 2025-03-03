package D;

import B2.l;
import H3.C0103u;
import H3.M;
import H3.O;
import H3.i0;
import M1.a;
import P2.b;
import P2.c;
import P6.f;
import R2.e;
import W6.d;
import Y6.m;
import j1.C1116a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class s0 implements C1116a {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f949a;

    public s0(int i) {
        switch (i) {
            case 2:
                this.f949a = new ArrayList();
                return;
            case 3:
                this.f949a = new ArrayList();
                return;
            case 4:
                this.f949a = new ArrayList();
                return;
            case 5:
                this.f949a = new ArrayList(20);
                return;
            case 6:
                this.f949a = new ArrayList();
                return;
            default:
                this.f949a = new ArrayList();
                return;
        }
    }

    public static String o(s0 s0Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = s0Var.f949a.iterator();
        while (it.hasNext()) {
            arrayList.add(((C0061o0) it.next()).getClass().getSimpleName());
        }
        StringBuilder sb = new StringBuilder();
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            while (true) {
                sb.append((CharSequence) it2.next());
                if (!it2.hasNext()) {
                    break;
                }
                sb.append(" | ");
            }
        }
        return sb.toString();
    }

    public O a(long j7) {
        int l8 = l(j7);
        if (l8 == 0) {
            M m8 = O.f2026V;
            return i0.f2073Y;
        }
        a aVar = (a) this.f949a.get(l8 - 1);
        long j8 = aVar.f3067d;
        if (j8 == -9223372036854775807L || j7 < j8) {
            return aVar.f3064a;
        }
        M m9 = O.f2026V;
        return i0.f2073Y;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean b(M1.a r11, long r12) {
        /*
            r10 = this;
            long r0 = r11.f3065b
            r2 = 0
            r3 = 1
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x000f
            r6 = 1
            goto L_0x0010
        L_0x000f:
            r6 = 0
        L_0x0010:
            P0.l.d(r6)
            int r6 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r6 > 0) goto L_0x0023
            long r6 = r11.f3067d
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x0021
            int r4 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x0023
        L_0x0021:
            r4 = 1
            goto L_0x0024
        L_0x0023:
            r4 = 0
        L_0x0024:
            java.util.ArrayList r5 = r10.f949a
            int r6 = r5.size()
            int r6 = r6 - r3
        L_0x002b:
            if (r6 < 0) goto L_0x004e
            java.lang.Object r7 = r5.get(r6)
            M1.a r7 = (M1.a) r7
            long r7 = r7.f3065b
            int r9 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r9 < 0) goto L_0x003e
            int r6 = r6 + r3
            r5.add(r6, r11)
            return r4
        L_0x003e:
            java.lang.Object r7 = r5.get(r6)
            M1.a r7 = (M1.a) r7
            long r7 = r7.f3065b
            int r9 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r9 > 0) goto L_0x004b
            r4 = 0
        L_0x004b:
            int r6 = r6 + -1
            goto L_0x002b
        L_0x004e:
            r5.add(r2, r11)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: D.s0.b(M1.a, long):boolean");
    }

    public long c(long j7) {
        ArrayList arrayList = this.f949a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j7 < ((a) arrayList.get(0)).f3065b) {
            return ((a) arrayList.get(0)).f3065b;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            a aVar = (a) arrayList.get(i);
            if (j7 < aVar.f3065b) {
                long j8 = ((a) arrayList.get(i - 1)).f3067d;
                long j9 = aVar.f3065b;
                if (j8 == -9223372036854775807L || j8 <= j7 || j8 >= j9) {
                    return j9;
                }
                return j8;
            }
        }
        long j10 = ((a) C0103u.l(arrayList)).f3067d;
        if (j10 == -9223372036854775807L || j7 >= j10) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    public void clear() {
        this.f949a.clear();
    }

    public long d(long j7) {
        ArrayList arrayList = this.f949a;
        if (arrayList.isEmpty() || j7 < ((a) arrayList.get(0)).f3065b) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j8 = ((a) arrayList.get(i)).f3065b;
            int i8 = (j7 > j8 ? 1 : (j7 == j8 ? 0 : -1));
            if (i8 == 0) {
                return j8;
            }
            if (i8 < 0) {
                a aVar = (a) arrayList.get(i - 1);
                long j9 = aVar.f3067d;
                if (j9 == -9223372036854775807L || j9 > j7) {
                    return aVar.f3065b;
                }
                return j9;
            }
        }
        a aVar2 = (a) C0103u.l(arrayList);
        long j10 = aVar2.f3067d;
        if (j10 == -9223372036854775807L || j7 < j10) {
            return aVar2.f3065b;
        }
        return j10;
    }

    public void e(long j7) {
        int l8 = l(j7);
        if (l8 > 0) {
            this.f949a.subList(0, l8).clear();
        }
    }

    public void f(String str, String str2) {
        f.e(str, "name");
        f.e(str2, "value");
        ArrayList arrayList = this.f949a;
        arrayList.add(str);
        arrayList.add(d.s0(str2).toString());
    }

    public m g() {
        return new m((String[]) this.f949a.toArray(new String[0]));
    }

    public boolean h(Class cls) {
        Iterator it = this.f949a.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(((C0061o0) it.next()).getClass())) {
                return true;
            }
        }
        return false;
    }

    public synchronized l i(Class cls) {
        int size = this.f949a.size();
        for (int i = 0; i < size; i++) {
            e eVar = (e) this.f949a.get(i);
            if (eVar.f4341a.isAssignableFrom(cls)) {
                return eVar.f4342b;
            }
        }
        return null;
    }

    public C0061o0 j(Class cls) {
        Iterator it = this.f949a.iterator();
        while (it.hasNext()) {
            C0061o0 o0Var = (C0061o0) it.next();
            if (o0Var.getClass() == cls) {
                return o0Var;
            }
        }
        return null;
    }

    public synchronized P2.a k(Class cls, Class cls2) {
        boolean z;
        if (cls2.isAssignableFrom(cls)) {
            return c.f3772V;
        }
        Iterator it = this.f949a.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (!bVar.f3769a.isAssignableFrom(cls) || !cls2.isAssignableFrom(bVar.f3770b)) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                return bVar.f3771c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    public int l(long j7) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f949a;
            if (i >= arrayList.size()) {
                return arrayList.size();
            }
            if (j7 < ((a) arrayList.get(i)).f3065b) {
                return i;
            }
            i++;
        }
    }

    public synchronized ArrayList m(Class cls, Class cls2) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator it = this.f949a.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (!bVar.f3769a.isAssignableFrom(cls) || !cls2.isAssignableFrom(bVar.f3770b)) {
                z = false;
            } else {
                z = true;
            }
            if (z && !arrayList.contains(bVar.f3770b)) {
                arrayList.add(bVar.f3770b);
            }
        }
        return arrayList;
    }

    public void n(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f949a;
            if (i < arrayList.size()) {
                if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                    arrayList.remove(i);
                    arrayList.remove(i);
                    i -= 2;
                }
                i += 2;
            } else {
                return;
            }
        }
    }

    public s0(List list) {
        this.f949a = new ArrayList(list);
    }
}
