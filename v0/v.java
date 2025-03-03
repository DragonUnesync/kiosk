package V0;

import W2.i;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.altbeacon.beacon.BeaconManager;
import u.C1478s;

public class v {

    /* renamed from: a  reason: collision with root package name */
    public long f5606a;

    /* renamed from: b  reason: collision with root package name */
    public long f5607b;

    /* renamed from: c  reason: collision with root package name */
    public Object f5608c;

    public v(long j7) {
        this.f5608c = new LinkedHashMap(100, 0.75f, true);
        this.f5606a = j7;
    }

    public synchronized Object a(Object obj) {
        Object obj2;
        i iVar = (i) ((LinkedHashMap) this.f5608c).get(obj);
        if (iVar != null) {
            obj2 = iVar.f6166a;
        } else {
            obj2 = null;
        }
        return obj2;
    }

    public int b() {
        if (!((C1478s) this.f5608c).c()) {
            return 700;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f5607b == -1) {
            this.f5607b = uptimeMillis;
        }
        long j7 = uptimeMillis - this.f5607b;
        if (j7 <= 120000) {
            return 1000;
        }
        if (j7 <= BeaconManager.DEFAULT_BACKGROUND_BETWEEN_SCAN_PERIOD) {
            return 2000;
        }
        return 4000;
    }

    public int c() {
        boolean c8 = ((C1478s) this.f5608c).c();
        long j7 = this.f5606a;
        if (!c8) {
            if (j7 > 0) {
                return Math.min((int) j7, 10000);
            }
            return 10000;
        } else if (j7 > 0) {
            return Math.min((int) j7, 1800000);
        } else {
            return 1800000;
        }
    }

    public int d(Object obj) {
        return 1;
    }

    public void e(Object obj, Object obj2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004f, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.Object f(java.lang.Object r8, java.lang.Object r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            int r0 = r7.d(r9)     // Catch:{ all -> 0x0012 }
            long r1 = (long) r0     // Catch:{ all -> 0x0012 }
            long r3 = r7.f5606a     // Catch:{ all -> 0x0012 }
            r5 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 < 0) goto L_0x0014
            r7.e(r8, r9)     // Catch:{ all -> 0x0012 }
            monitor-exit(r7)
            return r5
        L_0x0012:
            r8 = move-exception
            goto L_0x0050
        L_0x0014:
            if (r9 == 0) goto L_0x001b
            long r3 = r7.f5607b     // Catch:{ all -> 0x0012 }
            long r3 = r3 + r1
            r7.f5607b = r3     // Catch:{ all -> 0x0012 }
        L_0x001b:
            java.lang.Object r1 = r7.f5608c     // Catch:{ all -> 0x0012 }
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch:{ all -> 0x0012 }
            if (r9 != 0) goto L_0x0023
            r2 = r5
            goto L_0x0028
        L_0x0023:
            W2.i r2 = new W2.i     // Catch:{ all -> 0x0012 }
            r2.<init>(r0, r9)     // Catch:{ all -> 0x0012 }
        L_0x0028:
            java.lang.Object r0 = r1.put(r8, r2)     // Catch:{ all -> 0x0012 }
            W2.i r0 = (W2.i) r0     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x0045
            long r1 = r7.f5607b     // Catch:{ all -> 0x0012 }
            int r3 = r0.f6167b     // Catch:{ all -> 0x0012 }
            long r3 = (long) r3     // Catch:{ all -> 0x0012 }
            long r1 = r1 - r3
            r7.f5607b = r1     // Catch:{ all -> 0x0012 }
            java.lang.Object r1 = r0.f6166a     // Catch:{ all -> 0x0012 }
            boolean r9 = r1.equals(r9)     // Catch:{ all -> 0x0012 }
            if (r9 != 0) goto L_0x0045
            java.lang.Object r9 = r0.f6166a     // Catch:{ all -> 0x0012 }
            r7.e(r8, r9)     // Catch:{ all -> 0x0012 }
        L_0x0045:
            long r8 = r7.f5606a     // Catch:{ all -> 0x0012 }
            r7.h(r8)     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x004e
            java.lang.Object r5 = r0.f6166a     // Catch:{ all -> 0x0012 }
        L_0x004e:
            monitor-exit(r7)
            return r5
        L_0x0050:
            monitor-exit(r7)     // Catch:{ all -> 0x0012 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: V0.v.f(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public void g(Exception exc) {
        boolean z;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.f5608c) == null) {
            this.f5608c = exc;
        }
        if (this.f5606a == -9223372036854775807L) {
            synchronized (y.f5611j0) {
                if (y.f5613l0 > 0) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (!z) {
                this.f5606a = 200 + elapsedRealtime;
            }
        }
        long j7 = this.f5606a;
        if (j7 == -9223372036854775807L || elapsedRealtime < j7) {
            this.f5607b = elapsedRealtime + 50;
            return;
        }
        Exception exc2 = (Exception) this.f5608c;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = (Exception) this.f5608c;
        this.f5608c = null;
        this.f5606a = -9223372036854775807L;
        this.f5607b = -9223372036854775807L;
        throw exc3;
    }

    public synchronized void h(long j7) {
        while (this.f5607b > j7) {
            Iterator it = ((LinkedHashMap) this.f5608c).entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            i iVar = (i) entry.getValue();
            this.f5607b -= (long) iVar.f6167b;
            Object key = entry.getKey();
            it.remove();
            e(key, iVar.f6166a);
        }
    }

    public v() {
        this.f5606a = -9223372036854775807L;
        this.f5607b = -9223372036854775807L;
    }
}
