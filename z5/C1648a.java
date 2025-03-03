package z5;

import L4.a;
import java.util.EnumSet;
import u5.C1496c;

/* renamed from: z5.a  reason: case insensitive filesystem */
public enum C1648a implements C1496c {
    SUCCESS(a.SUCCESS);
    

    /* renamed from: W  reason: collision with root package name */
    public static final C1648a[] f16560W = null;

    /* renamed from: U  reason: collision with root package name */
    public final int f16562U;

    static {
        C1648a aVar;
        C1648a aVar2;
        C1648a aVar3;
        C1648a aVar4;
        C1648a aVar5;
        C1648a aVar6;
        C1648a aVar7;
        f16560W = values();
        EnumSet.of(aVar, new C1648a[]{aVar2, aVar3, aVar4, aVar5, aVar6, aVar7});
    }

    /* access modifiers changed from: public */
    C1648a(a aVar) {
        this.f16562U = aVar.f2706U;
    }

    public final int b() {
        return this.f16562U;
    }
}
