package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import n2.a;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Object f7647a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final LongSparseArray f7648b = new LongSparseArray();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f7649c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final LongSparseArray f7650d = new LongSparseArray();

    public final void a(TotalCaptureResult totalCaptureResult, int i) {
        long j7;
        synchronized (this.f7647a) {
            try {
                Long l8 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
                if (l8 != null) {
                    j7 = l8.longValue();
                } else {
                    j7 = -1;
                }
                if (j7 != -1) {
                    LongSparseArray longSparseArray = this.f7648b;
                    List list = (List) longSparseArray.get(j7);
                    if (list == null) {
                        list = new ArrayList();
                        longSparseArray.put(j7, list);
                    }
                    list.add(totalCaptureResult);
                    this.f7649c.put(totalCaptureResult, Integer.valueOf(i));
                    e();
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final void b() {
        synchronized (this.f7647a) {
            try {
                this.f7648b.clear();
                int i = 0;
                while (i < this.f7650d.size()) {
                    Iterator it = ((List) this.f7650d.get(this.f7650d.keyAt(i))).iterator();
                    if (!it.hasNext()) {
                        i++;
                    } else if (it.next() == null) {
                        throw null;
                    } else {
                        throw new ClassCastException();
                    }
                }
                this.f7650d.clear();
                this.f7649c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.f7647a) {
        }
    }

    public final void d() {
        synchronized (this.f7647a) {
            throw null;
        }
    }

    public final void e() {
        long j7;
        boolean z;
        synchronized (this.f7647a) {
            try {
                int size = this.f7648b.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    List list = (List) this.f7648b.valueAt(size);
                    if (!list.isEmpty()) {
                        TotalCaptureResult totalCaptureResult = (TotalCaptureResult) list.get(0);
                        Long l8 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
                        if (l8 != null) {
                            j7 = l8.longValue();
                        } else {
                            j7 = -1;
                        }
                        if (j7 == this.f7648b.keyAt(size)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        a.m((String) null, z);
                        List list2 = (List) this.f7650d.get(j7);
                        if (list2 != null && !list2.isEmpty()) {
                            if (list2.get(0) == null) {
                                LongSparseArray longSparseArray = this.f7650d;
                                List list3 = (List) longSparseArray.get(j7);
                                if (list3 != null) {
                                    list3.remove((Object) null);
                                    if (list3.isEmpty()) {
                                        longSparseArray.remove(j7);
                                    }
                                }
                                list.remove(totalCaptureResult);
                                if (list.isEmpty()) {
                                    this.f7648b.removeAt(size);
                                }
                            } else {
                                throw new ClassCastException();
                            }
                        }
                    }
                    size--;
                }
                f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0093, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0095, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f7647a
            monitor-enter(r0)
            android.util.LongSparseArray r1 = r7.f7650d     // Catch:{ all -> 0x0063 }
            int r1 = r1.size()     // Catch:{ all -> 0x0063 }
            if (r1 == 0) goto L_0x0094
            android.util.LongSparseArray r1 = r7.f7648b     // Catch:{ all -> 0x0063 }
            int r1 = r1.size()     // Catch:{ all -> 0x0063 }
            if (r1 != 0) goto L_0x0015
            goto L_0x0094
        L_0x0015:
            android.util.LongSparseArray r1 = r7.f7650d     // Catch:{ all -> 0x0063 }
            r2 = 0
            long r3 = r1.keyAt(r2)     // Catch:{ all -> 0x0063 }
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0063 }
            android.util.LongSparseArray r5 = r7.f7648b     // Catch:{ all -> 0x0063 }
            long r5 = r5.keyAt(r2)     // Catch:{ all -> 0x0063 }
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0063 }
            boolean r1 = r2.equals(r1)     // Catch:{ all -> 0x0063 }
            r1 = r1 ^ 1
            n2.a.i(r1)     // Catch:{ all -> 0x0063 }
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0076
            android.util.LongSparseArray r1 = r7.f7650d     // Catch:{ all -> 0x0063 }
            int r1 = r1.size()     // Catch:{ all -> 0x0063 }
            int r1 = r1 + -1
        L_0x003f:
            if (r1 < 0) goto L_0x0092
            android.util.LongSparseArray r2 = r7.f7650d     // Catch:{ all -> 0x0063 }
            long r2 = r2.keyAt(r1)     // Catch:{ all -> 0x0063 }
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x0073
            android.util.LongSparseArray r2 = r7.f7650d     // Catch:{ all -> 0x0063 }
            java.lang.Object r2 = r2.valueAt(r1)     // Catch:{ all -> 0x0063 }
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x0063 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0063 }
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0063 }
            if (r3 != 0) goto L_0x0065
            android.util.LongSparseArray r2 = r7.f7650d     // Catch:{ all -> 0x0063 }
            r2.removeAt(r1)     // Catch:{ all -> 0x0063 }
            goto L_0x0073
        L_0x0063:
            r1 = move-exception
            goto L_0x0096
        L_0x0065:
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0063 }
            if (r1 != 0) goto L_0x006d
            r1 = 0
            throw r1     // Catch:{ all -> 0x0063 }
        L_0x006d:
            java.lang.ClassCastException r1 = new java.lang.ClassCastException     // Catch:{ all -> 0x0063 }
            r1.<init>()     // Catch:{ all -> 0x0063 }
            throw r1     // Catch:{ all -> 0x0063 }
        L_0x0073:
            int r1 = r1 + -1
            goto L_0x003f
        L_0x0076:
            android.util.LongSparseArray r1 = r7.f7648b     // Catch:{ all -> 0x0063 }
            int r1 = r1.size()     // Catch:{ all -> 0x0063 }
            int r1 = r1 + -1
        L_0x007e:
            if (r1 < 0) goto L_0x0092
            android.util.LongSparseArray r2 = r7.f7648b     // Catch:{ all -> 0x0063 }
            long r5 = r2.keyAt(r1)     // Catch:{ all -> 0x0063 }
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x008f
            android.util.LongSparseArray r2 = r7.f7648b     // Catch:{ all -> 0x0063 }
            r2.removeAt(r1)     // Catch:{ all -> 0x0063 }
        L_0x008f:
            int r1 = r1 + -1
            goto L_0x007e
        L_0x0092:
            monitor-exit(r0)     // Catch:{ all -> 0x0063 }
            return
        L_0x0094:
            monitor-exit(r0)     // Catch:{ all -> 0x0063 }
            return
        L_0x0096:
            monitor-exit(r0)     // Catch:{ all -> 0x0063 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.extensions.internal.sessionprocessor.b.f():void");
    }

    public final void g(e eVar) {
        synchronized (this.f7647a) {
        }
    }
}
