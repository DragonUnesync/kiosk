package androidx.recyclerview.widget;

import C7.e;
import android.os.Trace;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import q0.C1361h;

/* renamed from: androidx.recyclerview.widget.s  reason: case insensitive filesystem */
public final class C0507s implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public static final ThreadLocal f8513Y = new ThreadLocal();

    /* renamed from: Z  reason: collision with root package name */
    public static final e f8514Z = new e(1);

    /* renamed from: U  reason: collision with root package name */
    public ArrayList f8515U;

    /* renamed from: V  reason: collision with root package name */
    public long f8516V;

    /* renamed from: W  reason: collision with root package name */
    public long f8517W;

    /* renamed from: X  reason: collision with root package name */
    public ArrayList f8518X;

    public static j0 c(RecyclerView recyclerView, int i, long j7) {
        int h5 = recyclerView.mChildHelper.h();
        for (int i8 = 0; i8 < h5; i8++) {
            j0 childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.g(i8));
            if (childViewHolderInt.mPosition == i && !childViewHolderInt.isInvalid()) {
                return null;
            }
        }
        Z z = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            j0 l8 = z.l(i, j7);
            if (l8 != null) {
                if (!l8.isBound() || l8.isInvalid()) {
                    z.a(l8, false);
                } else {
                    z.i(l8.itemView);
                }
            }
            return l8;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i8) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.sDebugAssertionsEnabled && !this.f8515U.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            } else if (this.f8516V == 0) {
                this.f8516V = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        C0506q qVar = recyclerView.mPrefetchRegistry;
        qVar.f8491a = i;
        qVar.f8492b = i8;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: androidx.recyclerview.widget.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: androidx.recyclerview.widget.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: androidx.recyclerview.widget.r} */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0090, code lost:
        r3 = (androidx.recyclerview.widget.r) r5.get(r2);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(long r17) {
        /*
            r16 = this;
            r1 = r16
            r0 = 1
            java.util.ArrayList r2 = r1.f8515U
            int r3 = r2.size()
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x000c:
            if (r5 >= r3) goto L_0x0026
            java.lang.Object r7 = r2.get(r5)
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            int r8 = r7.getWindowVisibility()
            if (r8 != 0) goto L_0x0024
            androidx.recyclerview.widget.q r8 = r7.mPrefetchRegistry
            r8.b(r7, r4)
            androidx.recyclerview.widget.q r7 = r7.mPrefetchRegistry
            int r7 = r7.f8494d
            int r6 = r6 + r7
        L_0x0024:
            int r5 = r5 + r0
            goto L_0x000c
        L_0x0026:
            java.util.ArrayList r5 = r1.f8518X
            r5.ensureCapacity(r6)
            r6 = 0
            r7 = 0
        L_0x002d:
            if (r6 >= r3) goto L_0x0084
            java.lang.Object r8 = r2.get(r6)
            androidx.recyclerview.widget.RecyclerView r8 = (androidx.recyclerview.widget.RecyclerView) r8
            int r9 = r8.getWindowVisibility()
            if (r9 == 0) goto L_0x003c
            goto L_0x0082
        L_0x003c:
            androidx.recyclerview.widget.q r9 = r8.mPrefetchRegistry
            int r10 = r9.f8491a
            int r10 = java.lang.Math.abs(r10)
            int r11 = r9.f8492b
            int r11 = java.lang.Math.abs(r11)
            int r11 = r11 + r10
            r10 = 0
        L_0x004c:
            int r12 = r9.f8494d
            int r12 = r12 * 2
            if (r10 >= r12) goto L_0x0082
            int r12 = r5.size()
            if (r7 < r12) goto L_0x0061
            androidx.recyclerview.widget.r r12 = new androidx.recyclerview.widget.r
            r12.<init>()
            r5.add(r12)
            goto L_0x0067
        L_0x0061:
            java.lang.Object r12 = r5.get(r7)
            androidx.recyclerview.widget.r r12 = (androidx.recyclerview.widget.r) r12
        L_0x0067:
            int[] r13 = r9.f8493c
            int r14 = r10 + 1
            r14 = r13[r14]
            if (r14 > r11) goto L_0x0071
            r15 = 1
            goto L_0x0072
        L_0x0071:
            r15 = 0
        L_0x0072:
            r12.f8505a = r15
            r12.f8506b = r11
            r12.f8507c = r14
            r12.f8508d = r8
            r13 = r13[r10]
            r12.e = r13
            int r7 = r7 + r0
            int r10 = r10 + 2
            goto L_0x004c
        L_0x0082:
            int r6 = r6 + r0
            goto L_0x002d
        L_0x0084:
            C7.e r2 = f8514Z
            java.util.Collections.sort(r5, r2)
            r2 = 0
        L_0x008a:
            int r3 = r5.size()
            if (r2 >= r3) goto L_0x012d
            java.lang.Object r3 = r5.get(r2)
            androidx.recyclerview.widget.r r3 = (androidx.recyclerview.widget.r) r3
            androidx.recyclerview.widget.RecyclerView r6 = r3.f8508d
            if (r6 != 0) goto L_0x009c
            goto L_0x012d
        L_0x009c:
            boolean r7 = r3.f8505a
            if (r7 == 0) goto L_0x00a6
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x00a8
        L_0x00a6:
            r7 = r17
        L_0x00a8:
            int r9 = r3.e
            androidx.recyclerview.widget.j0 r6 = c(r6, r9, r7)
            if (r6 == 0) goto L_0x011d
            java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView> r7 = r6.mNestedRecyclerView
            if (r7 == 0) goto L_0x011d
            boolean r7 = r6.isBound()
            if (r7 == 0) goto L_0x011d
            boolean r7 = r6.isInvalid()
            if (r7 != 0) goto L_0x011d
            java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView> r6 = r6.mNestedRecyclerView
            java.lang.Object r6 = r6.get()
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            if (r6 != 0) goto L_0x00cb
            goto L_0x011d
        L_0x00cb:
            boolean r7 = r6.mDataSetHasChangedAfterLayout
            if (r7 == 0) goto L_0x00da
            androidx.recyclerview.widget.c r7 = r6.mChildHelper
            int r7 = r7.h()
            if (r7 == 0) goto L_0x00da
            r6.removeAndRecycleViews()
        L_0x00da:
            androidx.recyclerview.widget.q r7 = r6.mPrefetchRegistry
            r7.b(r6, r0)
            int r8 = r7.f8494d
            if (r8 == 0) goto L_0x011d
            java.lang.String r8 = "RV Nested Prefetch"
            int r9 = q0.C1361h.f14708a     // Catch:{ all -> 0x010f }
            android.os.Trace.beginSection(r8)     // Catch:{ all -> 0x010f }
            androidx.recyclerview.widget.f0 r8 = r6.mState     // Catch:{ all -> 0x010f }
            androidx.recyclerview.widget.F r9 = r6.mAdapter     // Catch:{ all -> 0x010f }
            r8.f8398d = r0     // Catch:{ all -> 0x010f }
            int r9 = r9.getItemCount()     // Catch:{ all -> 0x010f }
            r8.e = r9     // Catch:{ all -> 0x010f }
            r8.f8400g = r4     // Catch:{ all -> 0x010f }
            r8.f8401h = r4     // Catch:{ all -> 0x010f }
            r8.i = r4     // Catch:{ all -> 0x010f }
            r8 = 0
        L_0x00fd:
            int r9 = r7.f8494d     // Catch:{ all -> 0x010f }
            int r9 = r9 * 2
            if (r8 >= r9) goto L_0x0111
            int[] r9 = r7.f8493c     // Catch:{ all -> 0x010f }
            r9 = r9[r8]     // Catch:{ all -> 0x010f }
            r10 = r17
            c(r6, r9, r10)     // Catch:{ all -> 0x010f }
            int r8 = r8 + 2
            goto L_0x00fd
        L_0x010f:
            r0 = move-exception
            goto L_0x0117
        L_0x0111:
            r10 = r17
            android.os.Trace.endSection()
            goto L_0x011f
        L_0x0117:
            int r2 = q0.C1361h.f14708a
            android.os.Trace.endSection()
            throw r0
        L_0x011d:
            r10 = r17
        L_0x011f:
            r3.f8505a = r4
            r3.f8506b = r4
            r3.f8507c = r4
            r6 = 0
            r3.f8508d = r6
            r3.e = r4
            int r2 = r2 + r0
            goto L_0x008a
        L_0x012d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0507s.b(long):void");
    }

    public final void run() {
        try {
            int i = C1361h.f14708a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f8515U;
            if (arrayList.isEmpty()) {
                this.f8516V = 0;
                Trace.endSection();
                return;
            }
            int size = arrayList.size();
            long j7 = 0;
            for (int i8 = 0; i8 < size; i8++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i8);
                if (recyclerView.getWindowVisibility() == 0) {
                    j7 = Math.max(recyclerView.getDrawingTime(), j7);
                }
            }
            if (j7 == 0) {
                this.f8516V = 0;
                Trace.endSection();
                return;
            }
            b(TimeUnit.MILLISECONDS.toNanos(j7) + this.f8517W);
            this.f8516V = 0;
            Trace.endSection();
        } catch (Throwable th) {
            this.f8516V = 0;
            int i9 = C1361h.f14708a;
            Trace.endSection();
            throw th;
        }
    }
}
