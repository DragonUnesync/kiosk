package Z5;

import java.util.Iterator;

/* renamed from: Z5.j  reason: case insensitive filesystem */
public final class C0392j implements Iterator {
    final /* synthetic */ C0395m this$0;
    final /* synthetic */ Iterator val$itr;

    public C0392j(C0395m mVar, Iterator it) {
        this.this$0 = mVar;
        this.val$itr = it;
    }

    public boolean hasNext() {
        return this.val$itr.hasNext();
    }

    public void remove() {
        this.val$itr.remove();
    }

    public String next() {
        return ((CharSequence) this.val$itr.next()).toString();
    }
}
