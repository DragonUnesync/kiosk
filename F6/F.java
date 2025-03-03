package f6;

import g6.C0977j;
import g6.Z;

public final class F implements Runnable {
    final /* synthetic */ G this$0;

    public F(G g8) {
        this.this$0 = g8;
    }

    public void run() {
        while (true) {
            Runnable takeTask = this.this$0.takeTask();
            if (takeTask != null) {
                try {
                    C0911a.runTask(takeTask);
                } catch (Throwable th) {
                    G.logger.warn("Unexpected exception from the global event executor: ", th);
                }
                if (takeTask != this.this$0.quietPeriodTask) {
                    continue;
                }
            }
            G g8 = this.this$0;
            Z z = g8.scheduledTaskQueue;
            if (g8.taskQueue.isEmpty() && (z == null || ((C0977j) z).size() == 1)) {
                this.this$0.started.compareAndSet(true, false);
                if (this.this$0.taskQueue.isEmpty() || !this.this$0.started.compareAndSet(false, true)) {
                    return;
                }
            }
        }
    }
}
