package b6;

import e6.C0844c;
import e6.J;
import e6.L;

public final class A0 extends C0844c {
    final /* synthetic */ F0 this$0;

    public A0(F0 f02) {
        this.this$0 = f02;
    }

    public void deallocate() {
        this.this$0.destroy();
        if (this.this$0.leak != null) {
            ((L) this.this$0.leak).close(this.this$0);
        }
    }

    public J touch(Object obj) {
        if (this.this$0.leak != null) {
            ((L) this.this$0.leak).record(obj);
        }
        return this.this$0;
    }
}
