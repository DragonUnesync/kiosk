package b6;

import java.util.Enumeration;
import java.util.Iterator;

/* renamed from: b6.c0  reason: case insensitive filesystem */
public final class C0541c0 implements Enumeration {
    private final Iterator<C0547e0> ids;
    final /* synthetic */ C0544d0 this$0;

    public C0541c0(C0544d0 d0Var) {
        this.this$0 = d0Var;
        this.ids = d0Var.sessionCache.getIds().iterator();
    }

    public boolean hasMoreElements() {
        return this.ids.hasNext();
    }

    public byte[] nextElement() {
        return this.ids.next().cloneBytes();
    }
}
