package T7;

import B.q0;
import Q0.d;
import Q7.g;
import S7.h;
import S7.k;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class i1 {

    /* renamed from: a  reason: collision with root package name */
    public q0 f5243a;

    /* renamed from: b  reason: collision with root package name */
    public C0285a f5244b;

    /* renamed from: c  reason: collision with root package name */
    public Q f5245c;

    /* renamed from: d  reason: collision with root package name */
    public h f5246d;
    public ArrayList e;

    /* renamed from: f  reason: collision with root package name */
    public String f5247f;

    /* renamed from: g  reason: collision with root package name */
    public d f5248g;

    /* renamed from: h  reason: collision with root package name */
    public E f5249h;
    public HashMap i;

    /* renamed from: j  reason: collision with root package name */
    public N f5250j;

    /* renamed from: k  reason: collision with root package name */
    public final M f5251k = new O(3, this);

    public final k a() {
        int size = this.e.size();
        if (size > 0) {
            return (k) this.e.get(size - 1);
        }
        return this.f5246d;
    }

    public final boolean b(String str) {
        k a8;
        if (this.e.size() == 0 || (a8 = a()) == null) {
            return false;
        }
        G g8 = a8.f4559X;
        if (!g8.f5086V.equals(str) || !g8.f5087W.equals("http://www.w3.org/1999/xhtml")) {
            return false;
        }
        return true;
    }

    public String c() {
        return "http://www.w3.org/1999/xhtml";
    }

    public abstract E d();

    /* JADX WARNING: type inference failed for: r3v7, types: [Q0.d, T7.O, T7.N] */
    public void e(Reader reader, String str, q0 q0Var) {
        g.E(str, "baseUri");
        g.D(q0Var);
        h hVar = new h(((i1) q0Var.f300V).c(), str);
        this.f5246d = hVar;
        hVar.f4554e0 = q0Var;
        this.f5243a = q0Var;
        this.f5249h = (E) q0Var.f302X;
        C0285a aVar = new C0285a(reader);
        this.f5244b = aVar;
        ((D) q0Var.f301W).getClass();
        aVar.f5148j = null;
        this.f5245c = new Q(this);
        this.e = new ArrayList(32);
        this.i = new HashMap();
        ? o2 = new O(2, this);
        this.f5250j = o2;
        this.f5248g = o2;
        this.f5247f = str;
    }

    public final h f(Reader reader, String str, q0 q0Var) {
        d dVar;
        e(reader, str, q0Var);
        while (true) {
            if (this.f5248g.f4018V == 6) {
                ArrayList arrayList = this.e;
                if (arrayList == null) {
                    break;
                } else if (arrayList.isEmpty()) {
                    this.e = null;
                } else {
                    g();
                }
            } else {
                Q q7 = this.f5245c;
                while (!q7.e) {
                    q7.f5123c.d(q7, q7.f5121a);
                }
                StringBuilder sb = q7.f5126g;
                int length = sb.length();
                I i8 = q7.f5130l;
                if (length != 0) {
                    String sb2 = sb.toString();
                    sb.delete(0, sb.length());
                    i8.f5095W = sb2;
                    q7.f5125f = null;
                    dVar = i8;
                } else {
                    String str2 = q7.f5125f;
                    if (str2 != null) {
                        i8.f5095W = str2;
                        q7.f5125f = null;
                        dVar = i8;
                    } else {
                        q7.e = false;
                        dVar = q7.f5124d;
                    }
                }
                this.f5248g = dVar;
                h(dVar);
                dVar.p();
            }
        }
        C0285a aVar = this.f5244b;
        if (aVar != null) {
            aVar.d();
            this.f5244b = null;
            this.f5245c = null;
            this.e = null;
            this.i = null;
        }
        return this.f5246d;
    }

    public final k g() {
        return (k) this.e.remove(this.e.size() - 1);
    }

    public abstract boolean h(d dVar);

    public final boolean i(String str) {
        d dVar = this.f5248g;
        M m8 = this.f5251k;
        if (dVar == m8) {
            O o2 = new O(3, this);
            o2.y(str);
            return h(o2);
        }
        m8.p();
        m8.y(str);
        return h(m8);
    }

    public final void j(String str) {
        N n4 = this.f5250j;
        if (this.f5248g == n4) {
            O o2 = new O(2, this);
            o2.y(str);
            h(o2);
            return;
        }
        n4.p();
        n4.y(str);
        h(n4);
    }
}
