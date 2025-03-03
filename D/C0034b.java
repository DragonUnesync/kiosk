package D;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: D.b  reason: case insensitive filesystem */
public final class C0034b {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f883a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f884b;

    public C0034b(Executor executor, Handler handler) {
        if (executor != null) {
            this.f883a = executor;
            if (handler != null) {
                this.f884b = handler;
                return;
            }
            throw new NullPointerException("Null schedulerHandler");
        }
        throw new NullPointerException("Null cameraExecutor");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0034b)) {
            return false;
        }
        C0034b bVar = (C0034b) obj;
        if (!this.f883a.equals(bVar.f883a) || !this.f884b.equals(bVar.f884b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f883a.hashCode() ^ 1000003) * 1000003) ^ this.f884b.hashCode();
    }

    public final String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.f883a + ", schedulerHandler=" + this.f884b + "}";
    }
}
