package Y6;

import D6.i;
import E6.a;
import R.e;
import T0.g0;
import Z6.b;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

public final class h {
    public static final h e;

    /* renamed from: f  reason: collision with root package name */
    public static final h f6637f = new h(false, false, (String[]) null, (String[]) null);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f6638a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f6639b;

    /* renamed from: c  reason: collision with root package name */
    public final String[] f6640c;

    /* renamed from: d  reason: collision with root package name */
    public final String[] f6641d;

    static {
        g gVar = g.f6633r;
        g gVar2 = g.f6634s;
        g gVar3 = g.f6635t;
        g gVar4 = g.f6627l;
        g gVar5 = g.f6629n;
        g gVar6 = g.f6628m;
        g gVar7 = g.f6630o;
        g gVar8 = g.f6632q;
        g gVar9 = g.f6631p;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, g.f6625j, g.f6626k, g.f6624h, g.i, g.f6622f, g.f6623g, g.e};
        g0 g0Var = new g0(2);
        g0Var.b((g[]) Arrays.copyOf(new g[]{gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9}, 9));
        x xVar = x.TLS_1_3;
        x xVar2 = x.TLS_1_2;
        g0Var.e(xVar, xVar2);
        if (g0Var.f4839c) {
            g0Var.f4840d = true;
            g0Var.a();
            g0 g0Var2 = new g0(2);
            g0Var2.b((g[]) Arrays.copyOf(gVarArr, 16));
            g0Var2.e(xVar, xVar2);
            if (g0Var2.f4839c) {
                g0Var2.f4840d = true;
                e = g0Var2.a();
                g0 g0Var3 = new g0(2);
                g0Var3.b((g[]) Arrays.copyOf(gVarArr, 16));
                g0Var3.e(xVar, xVar2, x.TLS_1_1, x.TLS_1_0);
                if (g0Var3.f4839c) {
                    g0Var3.f4840d = true;
                    g0Var3.a();
                    return;
                }
                throw new IllegalArgumentException("no TLS extensions for cleartext connections");
            }
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        throw new IllegalArgumentException("no TLS extensions for cleartext connections");
    }

    public h(boolean z, boolean z6, String[] strArr, String[] strArr2) {
        this.f6638a = z;
        this.f6639b = z6;
        this.f6640c = strArr;
        this.f6641d = strArr2;
    }

    public final List a() {
        String[] strArr = this.f6640c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String c8 : strArr) {
            arrayList.add(g.f6619b.c(c8));
        }
        return i.U(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.f6638a) {
            return false;
        }
        String[] strArr = this.f6641d;
        if (strArr != null && !b.i(strArr, sSLSocket.getEnabledProtocols(), a.f1375V)) {
            return false;
        }
        String[] strArr2 = this.f6640c;
        if (strArr2 == null || b.i(strArr2, sSLSocket.getEnabledCipherSuites(), g.f6620c)) {
            return true;
        }
        return false;
    }

    public final List c() {
        String[] strArr = this.f6641d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String f8 : strArr) {
            arrayList.add(e.f(f8));
        }
        return i.U(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        h hVar = (h) obj;
        boolean z = hVar.f6638a;
        boolean z6 = this.f6638a;
        if (z6 != z) {
            return false;
        }
        if (!z6 || (Arrays.equals(this.f6640c, hVar.f6640c) && Arrays.equals(this.f6641d, hVar.f6641d) && this.f6639b == hVar.f6639b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        if (!this.f6638a) {
            return 17;
        }
        int i8 = 0;
        String[] strArr = this.f6640c;
        if (strArr != null) {
            i = Arrays.hashCode(strArr);
        } else {
            i = 0;
        }
        int i9 = (527 + i) * 31;
        String[] strArr2 = this.f6641d;
        if (strArr2 != null) {
            i8 = Arrays.hashCode(strArr2);
        }
        return ((i9 + i8) * 31) + (this.f6639b ^ true ? 1 : 0);
    }

    public final String toString() {
        if (!this.f6638a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f6639b + ')';
    }
}
