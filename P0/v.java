package P0;

import android.os.Handler;
import java.util.ArrayList;

public final class v {

    /* renamed from: b  reason: collision with root package name */
    public static final ArrayList f3740b = new ArrayList(50);

    /* renamed from: a  reason: collision with root package name */
    public final Handler f3741a;

    public v(Handler handler) {
        this.f3741a = handler;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: P0.u} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: P0.u} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: P0.u} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static P0.u b() {
        /*
            java.util.ArrayList r0 = f3740b
            monitor-enter(r0)
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x000f }
            if (r1 == 0) goto L_0x0011
            P0.u r1 = new P0.u     // Catch:{ all -> 0x000f }
            r1.<init>()     // Catch:{ all -> 0x000f }
            goto L_0x001d
        L_0x000f:
            r1 = move-exception
            goto L_0x001f
        L_0x0011:
            int r1 = r0.size()     // Catch:{ all -> 0x000f }
            int r1 = r1 + -1
            java.lang.Object r1 = r0.remove(r1)     // Catch:{ all -> 0x000f }
            P0.u r1 = (P0.u) r1     // Catch:{ all -> 0x000f }
        L_0x001d:
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            return r1
        L_0x001f:
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: P0.v.b():P0.u");
    }

    public final u a(int i, Object obj) {
        u b8 = b();
        b8.f3739a = this.f3741a.obtainMessage(i, obj);
        return b8;
    }

    public final boolean c(Runnable runnable) {
        return this.f3741a.post(runnable);
    }

    public final void d(int i) {
        boolean z;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        l.d(z);
        this.f3741a.removeMessages(i);
    }

    public final boolean e(int i) {
        return this.f3741a.sendEmptyMessage(i);
    }
}
