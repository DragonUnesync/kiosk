package r7;

import android.os.Looper;
import org.acra.config.LimitingReportAdministrator;
import org.acra.interaction.ToastInteraction;

public final /* synthetic */ class p implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f15065U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Looper f15066V;

    public /* synthetic */ p(Looper looper, int i) {
        this.f15065U = i;
        this.f15066V = looper;
    }

    public final void run() {
        switch (this.f15065U) {
            case 0:
                LimitingReportAdministrator.notifyReportDropped$lambda$8$lambda$7(this.f15066V);
                return;
            default:
                ToastInteraction.performInteraction$lambda$0(this.f15066V);
                return;
        }
    }
}
