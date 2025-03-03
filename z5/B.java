package Z5;

import T5.Y;
import java.util.List;

public final class B extends j0 {
    final /* synthetic */ C this$0;
    boolean upgraded;

    private B(C c8) {
        this.this$0 = c8;
    }

    public void encode(Y y8, Object obj, List<Object> list) {
        if (this.upgraded) {
            list.add(obj);
            return;
        }
        if (obj instanceof i0) {
            this.this$0.queue.offer(((i0) obj).method());
        }
        super.encode(y8, obj, list);
        if (this.this$0.failOnMissingResponse && !this.this$0.done && (obj instanceof t0)) {
            this.this$0.requestResponseCounter.incrementAndGet();
        }
    }
}
