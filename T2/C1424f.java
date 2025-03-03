package t2;

import v2.e;
import y2.C1632g;

/* renamed from: t2.f  reason: case insensitive filesystem */
public abstract class C1424f implements C1632g {

    /* renamed from: U  reason: collision with root package name */
    public final n f15196U;

    /* renamed from: V  reason: collision with root package name */
    public final p f15197V;

    /* renamed from: W  reason: collision with root package name */
    public final k f15198W;

    /* renamed from: X  reason: collision with root package name */
    public final l f15199X;

    public C1424f(n nVar, p pVar, k kVar, l lVar) {
        if (nVar == null) {
            throw new NullPointerException("opcode == null");
        } else if (pVar == null) {
            throw new NullPointerException("position == null");
        } else if (lVar != null) {
            this.f15196U = nVar;
            this.f15197V = pVar;
            this.f15198W = kVar;
            this.f15199X = lVar;
        } else {
            throw new NullPointerException("sources == null");
        }
    }

    public final String a() {
        String e = e();
        StringBuilder sb = new StringBuilder(80);
        sb.append(this.f15197V);
        sb.append(": ");
        n nVar = this.f15196U;
        String str = nVar.f15214g;
        if (str == null) {
            str = nVar.toString();
        }
        sb.append(str);
        if (e != null) {
            sb.append("(");
            sb.append(e);
            sb.append(")");
        }
        k kVar = this.f15198W;
        if (kVar == null) {
            sb.append(" .");
        } else {
            sb.append(" ");
            sb.append(kVar.h(true));
        }
        sb.append(" <-");
        l lVar = this.f15199X;
        int length = lVar.f16371V.length;
        if (length == 0) {
            sb.append(" .");
        } else {
            for (int i = 0; i < length; i++) {
                sb.append(" ");
                sb.append(((k) lVar.e(i)).h(true));
            }
        }
        return sb.toString();
    }

    public abstract void b(C1423e eVar);

    public abstract e d();

    public String e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        String e = e();
        StringBuilder sb = new StringBuilder(80);
        sb.append("Insn{");
        sb.append(this.f15197V);
        sb.append(' ');
        sb.append(this.f15196U);
        if (e != null) {
            sb.append(' ');
            sb.append(e);
        }
        sb.append(" :: ");
        k kVar = this.f15198W;
        if (kVar != null) {
            sb.append(kVar);
            sb.append(" <- ");
        }
        sb.append(this.f15199X);
        sb.append('}');
        return sb.toString();
    }
}
