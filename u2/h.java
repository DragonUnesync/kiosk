package u2;

import v2.c;

public final class h extends p {
    public final int d(C1490a aVar) {
        p pVar = (p) aVar;
        int b8 = this.f15759U.compareTo(pVar.f15759U);
        r rVar = this.f15760V;
        if (b8 == 0) {
            b8 = rVar.f15763U.compareTo(pVar.f15760V.f15763U);
        }
        if (b8 != 0) {
            return b8;
        }
        return rVar.f15764V.compareTo(((h) aVar).f15760V.f15764V);
    }

    public final String e() {
        return "field";
    }

    public final c getType() {
        return c.f(this.f15760V.f15764V.f15766U);
    }
}
