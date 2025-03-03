package d6;

import f6.C0929t;
import f6.L;
import g6.m0;
import java.net.UnknownHostException;

/* renamed from: d6.f  reason: case insensitive filesystem */
public final class C0650f extends C0651g {
    public C0650f(C0929t tVar) {
        super(tVar);
    }

    public void doResolve(String str, L l8) {
        try {
            l8.setSuccess(m0.addressByName(str));
        } catch (UnknownHostException e) {
            l8.setFailure(e);
        }
    }
}
