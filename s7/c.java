package S7;

import C6.b;
import Q7.g;
import R7.h;
import T7.E;
import j$.util.Objects;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;

public final class c implements Iterable, Cloneable {

    /* renamed from: U  reason: collision with root package name */
    public int f4544U = 0;

    /* renamed from: V  reason: collision with root package name */
    public String[] f4545V = new String[3];

    /* renamed from: W  reason: collision with root package name */
    public Object[] f4546W = new Object[3];

    public static boolean m(String str) {
        if (str.length() <= 1 || str.charAt(0) != '/') {
            return false;
        }
        return true;
    }

    public final void b(c cVar) {
        boolean z;
        int i = cVar.f4544U;
        if (i != 0) {
            d(this.f4544U + i);
            if (this.f4544U != 0) {
                z = true;
            } else {
                z = false;
            }
            b bVar = new b(cVar);
            while (bVar.hasNext()) {
                a aVar = (a) bVar.next();
                String str = "";
                if (z) {
                    String str2 = aVar.f4539V;
                    if (str2 != null) {
                        str = str2;
                    }
                    n(aVar.f4538U, str);
                    aVar.f4540W = this;
                } else {
                    String str3 = aVar.f4538U;
                    String str4 = aVar.f4539V;
                    if (str4 != null) {
                        str = str4;
                    }
                    c(str3, str);
                }
            }
        }
    }

    public final void c(String str, Serializable serializable) {
        d(this.f4544U + 1);
        String[] strArr = this.f4545V;
        int i = this.f4544U;
        strArr[i] = str;
        this.f4546W[i] = serializable;
        this.f4544U = i + 1;
    }

    public final void d(int i) {
        boolean z;
        if (i >= this.f4544U) {
            z = true;
        } else {
            z = false;
        }
        g.v(z);
        String[] strArr = this.f4545V;
        int length = strArr.length;
        if (length < i) {
            int i8 = 3;
            if (length >= 3) {
                i8 = this.f4544U * 2;
            }
            if (i <= i8) {
                i = i8;
            }
            this.f4545V = (String[]) Arrays.copyOf(strArr, i);
            this.f4546W = Arrays.copyOf(this.f4546W, i);
        }
    }

    /* renamed from: e */
    public final c clone() {
        try {
            c cVar = (c) super.clone();
            cVar.f4544U = this.f4544U;
            cVar.f4545V = (String[]) Arrays.copyOf(this.f4545V, this.f4544U);
            cVar.f4546W = Arrays.copyOf(this.f4546W, this.f4544U);
            return cVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f4544U != cVar.f4544U) {
            return false;
        }
        for (int i = 0; i < this.f4544U; i++) {
            int k8 = cVar.k(this.f4545V[i]);
            if (k8 == -1 || !Objects.equals(this.f4546W[i], cVar.f4546W[k8])) {
                return false;
            }
        }
        return true;
    }

    public final int f(E e) {
        boolean z;
        int i = 0;
        if (this.f4544U == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return 0;
        }
        boolean z6 = e.f5082b;
        int i8 = 0;
        while (i < this.f4544U) {
            String str = this.f4545V[i];
            i++;
            int i9 = i;
            while (i9 < this.f4544U) {
                if ((z6 && str.equals(this.f4545V[i9])) || (!z6 && str.equalsIgnoreCase(this.f4545V[i9]))) {
                    i8++;
                    o(i9);
                    i9--;
                }
                i9++;
            }
        }
        return i8;
    }

    public final String g(String str) {
        Object obj;
        int k8 = k(str);
        if (k8 == -1 || (obj = this.f4546W[k8]) == null) {
            return "";
        }
        return (String) obj;
    }

    public final String h(String str) {
        Object obj;
        int l8 = l(str);
        if (l8 == -1 || (obj = this.f4546W[l8]) == null) {
            return "";
        }
        return (String) obj;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f4546W) + (((this.f4544U * 31) + Arrays.hashCode(this.f4545V)) * 31);
    }

    public final boolean i(String str) {
        if (k(str) != -1) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        return new b(this);
    }

    public final void j(StringBuilder sb, g gVar) {
        String a8;
        int i = this.f4544U;
        for (int i8 = 0; i8 < i; i8++) {
            String str = this.f4545V[i8];
            if (!m(str) && (a8 = a.a(gVar.f4552Z, str)) != null) {
                a.b(a8, (String) this.f4546W[i8], sb.append(' '), gVar);
            }
        }
    }

    public final int k(String str) {
        g.D(str);
        for (int i = 0; i < this.f4544U; i++) {
            if (str.equals(this.f4545V[i])) {
                return i;
            }
        }
        return -1;
    }

    public final int l(String str) {
        g.D(str);
        for (int i = 0; i < this.f4544U; i++) {
            if (str.equalsIgnoreCase(this.f4545V[i])) {
                return i;
            }
        }
        return -1;
    }

    public final void n(String str, String str2) {
        g.D(str);
        int k8 = k(str);
        if (k8 != -1) {
            this.f4546W[k8] = str2;
        } else {
            c(str, str2);
        }
    }

    public final void o(int i) {
        int i8 = this.f4544U;
        if (i < i8) {
            int i9 = (i8 - i) - 1;
            if (i9 > 0) {
                String[] strArr = this.f4545V;
                int i10 = i + 1;
                System.arraycopy(strArr, i10, strArr, i, i9);
                Object[] objArr = this.f4546W;
                System.arraycopy(objArr, i10, objArr, i, i9);
            }
            int i11 = this.f4544U - 1;
            this.f4544U = i11;
            this.f4545V[i11] = null;
            this.f4546W[i11] = null;
            return;
        }
        throw new IllegalArgumentException("Must be false");
    }

    public final String toString() {
        StringBuilder b8 = h.b();
        try {
            j(b8, new h().f4553d0);
            return h.h(b8);
        } catch (IOException e) {
            throw new b((Throwable) e, 3);
        }
    }
}
