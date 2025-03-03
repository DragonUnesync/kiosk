package u2;

import java.util.Arrays;
import m2.C1208a;

public final class c extends C1490a {

    /* renamed from: U  reason: collision with root package name */
    public final C1491b f15746U;

    public c(C1491b bVar) {
        if (!bVar.f16382U) {
            this.f15746U = bVar;
            return;
        }
        throw new C1208a((Exception) null, "mutable instance");
    }

    public final String a() {
        return this.f15746U.g("{", "}", true);
    }

    public final int d(C1490a aVar) {
        return this.f15746U.compareTo(((c) aVar).f15746U);
    }

    public final String e() {
        return "array";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f15746U.equals(((c) obj).f15746U);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f15746U.f16371V);
    }

    public final String toString() {
        return this.f15746U.g("array{", "}", false);
    }
}
