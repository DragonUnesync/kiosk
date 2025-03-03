package d6;

import f6.C0929t;

/* renamed from: d6.e  reason: case insensitive filesystem */
public final class C0649e extends C0648d {
    public static final C0649e INSTANCE = new C0649e();

    private C0649e() {
    }

    public C0646b newResolver(C0929t tVar) {
        return new C0650f(tVar).asAddressResolver();
    }
}
