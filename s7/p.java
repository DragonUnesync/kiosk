package S7;

import Q7.g;
import R2.c;
import R7.b;
import R7.h;
import T7.E;
import g7.C0996d;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

public abstract class p implements Cloneable {

    /* renamed from: W  reason: collision with root package name */
    public static final List f4577W = Collections.emptyList();

    /* renamed from: U  reason: collision with root package name */
    public p f4578U;

    /* renamed from: V  reason: collision with root package name */
    public int f4579V;

    public static void n(StringBuilder sb, int i, g gVar) {
        boolean z;
        boolean z6;
        String str;
        Appendable append = sb.append(10);
        int i8 = i * gVar.f4550X;
        String[] strArr = h.f4371a;
        if (i8 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i9 = gVar.f4551Y;
            if (i9 >= -1) {
                z6 = true;
            } else {
                z6 = false;
            }
            g.v(z6);
            if (i9 != -1) {
                i8 = Math.min(i8, i9);
            }
            if (i8 < 21) {
                str = h.f4371a[i8];
            } else {
                char[] cArr = new char[i8];
                for (int i10 = 0; i10 < i8; i10++) {
                    cArr[i10] = ' ';
                }
                str = String.valueOf(cArr);
            }
            append.append(str);
            return;
        }
        throw new IllegalArgumentException("width must be >= 0");
    }

    public final void A(k kVar) {
        boolean z;
        g.D(kVar);
        if (this.f4578U == null) {
            this.f4578U = kVar.f4578U;
        }
        g.D(this.f4578U);
        p pVar = this.f4578U;
        pVar.getClass();
        if (this.f4578U == pVar) {
            z = true;
        } else {
            z = false;
        }
        g.v(z);
        if (this != kVar) {
            p pVar2 = kVar.f4578U;
            if (pVar2 != null) {
                pVar2.z(kVar);
            }
            int i = this.f4579V;
            pVar.k().set(i, kVar);
            kVar.f4578U = pVar;
            kVar.f4579V = i;
            this.f4578U = null;
        }
    }

    public p B() {
        p pVar = this;
        while (true) {
            p pVar2 = pVar.f4578U;
            if (pVar2 == null) {
                return pVar;
            }
            pVar = pVar2;
        }
    }

    public String a(String str) {
        g.A(str);
        String str2 = "";
        if (!m() || e().l(str) == -1) {
            return str2;
        }
        String f8 = f();
        String h5 = e().h(str);
        Pattern pattern = h.f4374d;
        String replaceAll = pattern.matcher(f8).replaceAll(str2);
        String replaceAll2 = pattern.matcher(h5).replaceAll(str2);
        try {
            try {
                return h.i(new URL(replaceAll), replaceAll2).toExternalForm();
            } catch (MalformedURLException unused) {
                if (h.f4373c.matcher(replaceAll2).find()) {
                    str2 = replaceAll2;
                }
                return str2;
            }
        } catch (MalformedURLException unused2) {
            return new URL(replaceAll2).toExternalForm();
        }
    }

    public final void b(int i, p... pVarArr) {
        boolean z;
        g.D(pVarArr);
        if (pVarArr.length != 0) {
            List k8 = k();
            p v4 = pVarArr[0].v();
            if (v4 != null && v4.g() == pVarArr.length) {
                List k9 = v4.k();
                int length = pVarArr.length;
                while (true) {
                    int i8 = length - 1;
                    if (length <= 0) {
                        if (g() == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        v4.j();
                        k8.addAll(i, Arrays.asList(pVarArr));
                        int length2 = pVarArr.length;
                        while (true) {
                            int i9 = length2 - 1;
                            if (length2 <= 0) {
                                break;
                            }
                            pVarArr[i9].f4578U = this;
                            length2 = i9;
                        }
                        if (!z || pVarArr[0].f4579V != 0) {
                            x(i);
                            return;
                        }
                        return;
                    } else if (pVarArr[i8] != k9.get(i8)) {
                        break;
                    } else {
                        length = i8;
                    }
                }
            }
            int length3 = pVarArr.length;
            int i10 = 0;
            while (i10 < length3) {
                if (pVarArr[i10] != null) {
                    i10++;
                } else {
                    throw new IllegalArgumentException("Array must not contain any null objects");
                }
            }
            for (p pVar : pVarArr) {
                pVar.getClass();
                p pVar2 = pVar.f4578U;
                if (pVar2 != null) {
                    pVar2.z(pVar);
                }
                pVar.f4578U = this;
            }
            k8.addAll(i, Arrays.asList(pVarArr));
            x(i);
        }
    }

    public String c(String str) {
        g.D(str);
        if (!m()) {
            return "";
        }
        String h5 = e().h(str);
        if (h5.length() > 0) {
            return h5;
        }
        if (str.startsWith("abs:")) {
            return a(str.substring(4));
        }
        return "";
    }

    public void d(String str, String str2) {
        E e = (E) C0996d.t(this).f302X;
        e.getClass();
        String trim = str.trim();
        if (!e.f5082b) {
            trim = b.a(trim);
        }
        c e8 = e();
        int l8 = e8.l(trim);
        if (l8 != -1) {
            e8.f4546W[l8] = str2;
            if (!e8.f4545V[l8].equals(trim)) {
                e8.f4545V[l8] = trim;
                return;
            }
            return;
        }
        e8.c(trim, str2);
    }

    public abstract c e();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return false;
    }

    public abstract String f();

    public abstract int g();

    /* renamed from: h */
    public p clone() {
        p i = i((p) null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(i);
        while (!linkedList.isEmpty()) {
            p pVar = (p) linkedList.remove();
            int g8 = pVar.g();
            for (int i8 = 0; i8 < g8; i8++) {
                List k8 = pVar.k();
                p i9 = ((p) k8.get(i8)).i(pVar);
                k8.set(i8, i9);
                linkedList.add(i9);
            }
        }
        return i;
    }

    public p i(p pVar) {
        int i;
        h hVar;
        try {
            p pVar2 = (p) super.clone();
            pVar2.f4578U = pVar;
            if (pVar == null) {
                i = 0;
            } else {
                i = this.f4579V;
            }
            pVar2.f4579V = i;
            if (pVar == null && !(this instanceof h)) {
                p B8 = B();
                if (B8 instanceof h) {
                    hVar = (h) B8;
                } else {
                    hVar = null;
                }
                if (hVar != null) {
                    h hVar2 = new h(hVar.f4559X.f5087W, hVar.f());
                    c cVar = hVar.f4562a0;
                    if (cVar != null) {
                        hVar2.f4562a0 = cVar.clone();
                    }
                    hVar2.f4553d0 = hVar.f4553d0.clone();
                    pVar2.f4578U = hVar2;
                    hVar2.k().add(pVar2);
                }
            }
            return pVar2;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public abstract p j();

    public abstract List k();

    public boolean l(String str) {
        g.D(str);
        if (!m()) {
            return false;
        }
        if (str.startsWith("abs:")) {
            String substring = str.substring(4);
            if (e().l(substring) != -1 && !a(substring).isEmpty()) {
                return true;
            }
        }
        if (e().l(str) != -1) {
            return true;
        }
        return false;
    }

    public abstract boolean m();

    public final boolean o(String str) {
        return r().equals(str);
    }

    public final p p() {
        p pVar = this.f4578U;
        if (pVar == null) {
            return null;
        }
        List k8 = pVar.k();
        int i = this.f4579V + 1;
        if (k8.size() > i) {
            return (p) k8.get(i);
        }
        return null;
    }

    public abstract String q();

    public String r() {
        return q();
    }

    public String s() {
        h hVar;
        StringBuilder b8 = h.b();
        p B8 = B();
        if (B8 instanceof h) {
            hVar = (h) B8;
        } else {
            hVar = null;
        }
        if (hVar == null) {
            hVar = new h();
        }
        D7.b.P(new c(b8, 4, hVar.f4553d0), this);
        return h.h(b8);
    }

    public abstract void t(StringBuilder sb, int i, g gVar);

    public String toString() {
        return s();
    }

    public abstract void u(StringBuilder sb, int i, g gVar);

    public p v() {
        return this.f4578U;
    }

    public final p w() {
        p pVar = this.f4578U;
        if (pVar != null && this.f4579V > 0) {
            return (p) pVar.k().get(this.f4579V - 1);
        }
        return null;
    }

    public final void x(int i) {
        int g8 = g();
        if (g8 != 0) {
            List k8 = k();
            while (i < g8) {
                ((p) k8.get(i)).f4579V = i;
                i++;
            }
        }
    }

    public final void y() {
        p pVar = this.f4578U;
        if (pVar != null) {
            pVar.z(this);
        }
    }

    public void z(p pVar) {
        boolean z;
        if (pVar.f4578U == this) {
            z = true;
        } else {
            z = false;
        }
        g.v(z);
        int i = pVar.f4579V;
        k().remove(i);
        x(i);
        pVar.f4578U = null;
    }
}
