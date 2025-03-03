package b6;

import e6.C0844c;
import e6.J;
import e6.L;

public final class G0 extends C0844c {
    final /* synthetic */ Q0 this$0;

    public G0(Q0 q02) {
        this.this$0 = q02;
    }

    public void deallocate() {
        this.this$0.shutdown();
        if (this.this$0.leak != null) {
            ((L) this.this$0.leak).close(this.this$0);
        }
        this.this$0.parentContext.release();
    }

    public J touch(Object obj) {
        if (this.this$0.leak != null) {
            ((L) this.this$0.leak).record(obj);
        }
        return this.this$0;
    }
}
