package Z5;

import S5.C0185n;
import T5.Y;
import X5.M;
import java.util.List;

public final class A extends l0 {
    final /* synthetic */ C this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public A(C c8, int i, int i8, int i9, boolean z) {
        super(i, i8, i9, z);
        this.this$0 = c8;
    }

    private void decrement(Object obj) {
        if (obj != null && (obj instanceof t0)) {
            this.this$0.requestResponseCounter.decrementAndGet();
        }
    }

    public void channelInactive(Y y8) {
        super.channelInactive(y8);
        if (this.this$0.failOnMissingResponse) {
            long j7 = this.this$0.requestResponseCounter.get();
            if (j7 > 0) {
                y8.fireExceptionCaught(new M("channel gone inactive with " + j7 + " missing response(s)"));
            }
        }
    }

    public void decode(Y y8, C0185n nVar, List<Object> list) {
        if (this.this$0.done) {
            int actualReadableBytes = actualReadableBytes();
            if (actualReadableBytes != 0) {
                list.add(nVar.readBytes(actualReadableBytes));
                return;
            }
            return;
        }
        super.decode(y8, nVar, list);
        if (this.this$0.failOnMissingResponse) {
            int size = list.size();
            for (int size2 = list.size(); size2 < size; size2++) {
                decrement(list.get(size2));
            }
        }
    }

    public boolean isContentAlwaysEmpty(N n4) {
        T t8 = (T) this.this$0.queue.poll();
        m0 status = ((k0) n4).status();
        p0 codeClass = status.codeClass();
        int code = status.code();
        if (codeClass == p0.INFORMATIONAL) {
            return super.isContentAlwaysEmpty(n4);
        }
        if (t8 != null) {
            char charAt = t8.name().charAt(0);
            if (charAt != 'C') {
                if (charAt == 'H' && T.HEAD.equals(t8)) {
                    return true;
                }
            } else if (code == 200 && T.CONNECT.equals(t8)) {
                if (!this.this$0.parseHttpAfterConnectRequest) {
                    boolean unused = this.this$0.done = true;
                    this.this$0.queue.clear();
                }
                return true;
            }
        }
        return super.isContentAlwaysEmpty(n4);
    }
}
