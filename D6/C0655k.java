package d6;

import f6.C0909B;
import f6.C0911a;
import f6.C0929t;
import f6.L;
import g6.B;

/* renamed from: d6.k  reason: case insensitive filesystem */
public abstract class C0655k implements C0654j {
    private final C0929t executor;

    public C0655k(C0929t tVar) {
        this.executor = (C0929t) B.checkNotNull(tVar, "executor");
    }

    public void close() {
    }

    public abstract void doResolve(String str, L l8);

    public C0929t executor() {
        return this.executor;
    }

    public final C0909B resolve(String str) {
        return resolve(str, ((C0911a) executor()).newPromise());
    }

    public C0909B resolve(String str, L l8) {
        B.checkNotNull(l8, "promise");
        try {
            doResolve(str, l8);
            return l8;
        } catch (Exception e) {
            return l8.setFailure(e);
        }
    }
}
