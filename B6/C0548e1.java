package b6;

import e6.C0842a;
import e6.C0854m;

/* renamed from: b6.e1  reason: case insensitive filesystem */
public class C0548e1 extends C0842a {
    private static final C0854m pool = new C0545d1();

    public /* synthetic */ C0548e1(int i, String str, C0545d1 d1Var) {
        this(i, str);
    }

    private C0548e1(int i, String str) {
        super(i, str);
    }

    public C0548e1(String str) {
        this(pool.nextId(), str);
    }
}
