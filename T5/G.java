package T5;

import S5.C0163c;
import S5.C0185n;
import S5.C0187o;
import e6.I;
import g6.Y;
import h6.C1082c;
import h6.d;
import java.util.ArrayDeque;

public abstract class G {
    private static final C1082c logger = d.getInstance((Class<?>) G.class);
    private final ArrayDeque<Object> bufAndListenerPairs;
    private int readableBytes;
    private final m1 tracker;

    public G(K k8, int i) {
        m1 m1Var;
        this.bufAndListenerPairs = new ArrayDeque<>(i);
        if (k8 == null) {
            m1Var = null;
        } else {
            m1Var = m1.newTracker(k8);
        }
        this.tracker = m1Var;
    }

    private void decrementReadableBytes(int i) {
        this.readableBytes -= i;
        m1 m1Var = this.tracker;
        if (m1Var != null) {
            m1Var.decrementPendingOutboundBytes((long) i);
        }
    }

    private void incrementReadableBytes(int i) {
        int i8 = this.readableBytes;
        int i9 = i8 + i;
        if (i9 >= i8) {
            this.readableBytes = i9;
            m1 m1Var = this.tracker;
            if (m1Var != null) {
                m1Var.incrementPendingOutboundBytes((long) i);
                return;
            }
            return;
        }
        throw new IllegalStateException("buffer queue length overflow: " + this.readableBytes + " + " + i);
    }

    private void releaseAndCompleteAll(P p3) {
        Throwable th = null;
        while (true) {
            Object poll = this.bufAndListenerPairs.poll();
            if (poll == null) {
                break;
            }
            try {
                if (poll instanceof C0185n) {
                    C0185n nVar = (C0185n) poll;
                    decrementReadableBytes(nVar.readableBytes());
                    I.safeRelease(nVar);
                } else {
                    ((U) poll).operationComplete(p3);
                }
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else {
                    logger.info("Throwable being suppressed because Throwable {} is already pending", th, th2);
                }
            }
        }
        if (th != null) {
            throw new IllegalStateException(th);
        }
    }

    private static U toChannelFutureListener(C0274u0 u0Var) {
        if (u0Var.isVoid()) {
            return null;
        }
        return new Y0(u0Var);
    }

    public final void add(C0185n nVar) {
        add(nVar, (U) null);
    }

    public final void addFirst(C0185n nVar, C0274u0 u0Var) {
        addFirst(nVar, toChannelFutureListener(u0Var));
    }

    public abstract C0185n compose(C0187o oVar, C0185n nVar, C0185n nVar2);

    public abstract C0185n composeFirst(C0187o oVar, C0185n nVar);

    public final C0185n copyAndCompose(C0187o oVar, C0185n nVar, C0185n nVar2) {
        C0163c cVar = (C0163c) oVar;
        C0185n ioBuffer = cVar.ioBuffer(nVar2.readableBytes() + nVar.readableBytes());
        try {
            ioBuffer.writeBytes(nVar).writeBytes(nVar2);
        } catch (Throwable th) {
            ioBuffer.release();
            I.safeRelease(nVar2);
            Y.throwException(th);
        }
        nVar.release();
        nVar2.release();
        return ioBuffer;
    }

    public final boolean isEmpty() {
        return this.bufAndListenerPairs.isEmpty();
    }

    public final void releaseAndFailAll(C0268r0 r0Var, Throwable th) {
        releaseAndCompleteAll(r0Var.newFailedFuture(th));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        r6.bufAndListenerPairs.addFirst(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        if (r1 <= 0) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0044, code lost:
        r0 = r3.readRetainedSlice(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0048, code lost:
        if (r2 != null) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004a, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0050, code lost:
        r2 = compose(r7, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0051, code lost:
        r1 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final S5.C0185n remove(S5.C0187o r7, int r8, T5.C0274u0 r9) {
        /*
            r6 = this;
            java.lang.String r0 = "bytes"
            g6.B.checkPositiveOrZero((int) r8, (java.lang.String) r0)
            java.lang.String r0 = "aggregatePromise"
            g6.B.checkNotNull(r9, r0)
            java.util.ArrayDeque<java.lang.Object> r0 = r6.bufAndListenerPairs
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0017
            S5.n r7 = r6.removeEmptyValue()
            return r7
        L_0x0017:
            int r0 = r6.readableBytes
            int r8 = java.lang.Math.min(r8, r0)
            r0 = 0
            r1 = r8
            r2 = r0
        L_0x0020:
            java.util.ArrayDeque<java.lang.Object> r3 = r6.bufAndListenerPairs     // Catch:{ all -> 0x0033 }
            java.lang.Object r3 = r3.poll()     // Catch:{ all -> 0x0033 }
            if (r3 != 0) goto L_0x0029
            goto L_0x0075
        L_0x0029:
            boolean r4 = r3 instanceof T5.U     // Catch:{ all -> 0x0033 }
            if (r4 == 0) goto L_0x0035
            T5.U r3 = (T5.U) r3     // Catch:{ all -> 0x0033 }
            r9.addListener(r3)     // Catch:{ all -> 0x0033 }
            goto L_0x0020
        L_0x0033:
            r7 = move-exception
            goto L_0x0069
        L_0x0035:
            S5.n r3 = (S5.C0185n) r3     // Catch:{ all -> 0x0033 }
            int r4 = r3.readableBytes()     // Catch:{ all -> 0x0053 }
            if (r4 <= r1) goto L_0x0056
            java.util.ArrayDeque<java.lang.Object> r0 = r6.bufAndListenerPairs     // Catch:{ all -> 0x0053 }
            r0.addFirst(r3)     // Catch:{ all -> 0x0053 }
            if (r1 <= 0) goto L_0x0075
            S5.n r0 = r3.readRetainedSlice(r1)     // Catch:{ all -> 0x0053 }
            if (r2 != 0) goto L_0x004c
            r2 = r0
            goto L_0x0051
        L_0x004c:
            S5.n r7 = r6.compose(r7, r2, r0)     // Catch:{ all -> 0x0033 }
            r2 = r7
        L_0x0051:
            r1 = 0
            goto L_0x0075
        L_0x0053:
            r7 = move-exception
            r0 = r3
            goto L_0x0069
        L_0x0056:
            int r1 = r1 - r4
            if (r2 != 0) goto L_0x0064
            int r5 = r6.readableBytes     // Catch:{ all -> 0x0053 }
            if (r4 != r5) goto L_0x005e
            goto L_0x0062
        L_0x005e:
            S5.n r3 = r6.composeFirst(r7, r3)     // Catch:{ all -> 0x0053 }
        L_0x0062:
            r2 = r3
            goto L_0x0020
        L_0x0064:
            S5.n r2 = r6.compose(r7, r2, r3)     // Catch:{ all -> 0x0053 }
            goto L_0x0020
        L_0x0069:
            e6.I.safeRelease(r0)
            e6.I.safeRelease(r2)
            r9.setFailure(r7)
            g6.Y.throwException(r7)
        L_0x0075:
            int r8 = r8 - r1
            r6.decrementReadableBytes(r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: T5.G.remove(S5.o, int, T5.u0):S5.n");
    }

    public abstract C0185n removeEmptyValue();

    public final C0185n removeFirst(C0274u0 u0Var) {
        Object poll = this.bufAndListenerPairs.poll();
        if (poll == null) {
            return null;
        }
        C0185n nVar = (C0185n) poll;
        decrementReadableBytes(nVar.readableBytes());
        Object peek = this.bufAndListenerPairs.peek();
        if (peek instanceof U) {
            u0Var.addListener((U) peek);
            this.bufAndListenerPairs.poll();
        }
        return nVar;
    }

    public final int size() {
        return this.bufAndListenerPairs.size();
    }

    public String toString() {
        return "bytes: " + this.readableBytes + " buffers: " + (size() >> 1);
    }

    public final void writeAndRemoveAll(Y y8) {
        C0185n nVar = null;
        Throwable th = null;
        while (true) {
            Object poll = this.bufAndListenerPairs.poll();
            if (poll == null) {
                if (nVar == null) {
                    break;
                }
                try {
                    decrementReadableBytes(nVar.readableBytes());
                    y8.write(nVar, y8.voidPromise());
                    break;
                } catch (Throwable th2) {
                    if (th == null) {
                        th = th2;
                    } else {
                        logger.info("Throwable being suppressed because Throwable {} is already pending", th, th2);
                    }
                }
            } else if (poll instanceof C0185n) {
                if (nVar != null) {
                    decrementReadableBytes(nVar.readableBytes());
                    y8.write(nVar, y8.voidPromise());
                }
                nVar = (C0185n) poll;
            } else {
                if (poll instanceof C0274u0) {
                    decrementReadableBytes(nVar.readableBytes());
                    y8.write(nVar, (C0274u0) poll);
                } else {
                    decrementReadableBytes(nVar.readableBytes());
                    y8.write(nVar).addListener((U) poll);
                }
                nVar = null;
            }
        }
        if (th != null) {
            throw new IllegalStateException(th);
        }
    }

    private void addFirst(C0185n nVar, U u3) {
        if (u3 != null) {
            this.bufAndListenerPairs.addFirst(u3);
        }
        this.bufAndListenerPairs.addFirst(nVar);
        incrementReadableBytes(nVar.readableBytes());
    }

    public final void add(C0185n nVar, C0274u0 u0Var) {
        add(nVar, toChannelFutureListener(u0Var));
    }

    public final void add(C0185n nVar, U u3) {
        this.bufAndListenerPairs.add(nVar);
        if (u3 != null) {
            this.bufAndListenerPairs.add(u3);
        }
        incrementReadableBytes(nVar.readableBytes());
    }
}
