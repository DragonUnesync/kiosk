package B5;

import java.util.EnumSet;
import u5.C1496c;

public enum a implements C1496c {
    SUCCESS(L4.a.SUCCESS);
    

    /* renamed from: W  reason: collision with root package name */
    public static final a[] f461W = null;

    /* renamed from: U  reason: collision with root package name */
    public final int f463U;

    static {
        a aVar;
        a aVar2;
        a aVar3;
        a aVar4;
        a aVar5;
        a aVar6;
        a aVar7;
        f461W = values();
        EnumSet.of(aVar, new a[]{aVar2, aVar3, aVar4, aVar5, aVar6, aVar7});
    }

    /* access modifiers changed from: public */
    a(L4.a aVar) {
        this.f463U = aVar.f2706U;
    }

    public final int b() {
        return this.f463U;
    }
}
