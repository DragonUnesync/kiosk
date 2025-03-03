package d6;

import f6.C0929t;

/* renamed from: d6.g  reason: case insensitive filesystem */
public abstract class C0651g extends C0655k {
    private volatile C0646b addressResolver;

    public C0651g(C0929t tVar) {
        super(tVar);
    }

    public C0646b asAddressResolver() {
        C0646b bVar = this.addressResolver;
        if (bVar == null) {
            synchronized (this) {
                try {
                    bVar = this.addressResolver;
                    if (bVar == null) {
                        bVar = new C0653i(executor(), this);
                        this.addressResolver = bVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return bVar;
    }
}
