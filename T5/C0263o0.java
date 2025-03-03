package T5;

import S5.C0185n;
import S5.C0189p;
import e6.I;
import f6.C0934y;
import f6.d0;
import g6.C0969b0;
import g6.p0;
import h6.C1082c;
import h6.d;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* renamed from: T5.o0  reason: case insensitive filesystem */
public final class C0263o0 {
    static final int CHANNEL_OUTBOUND_BUFFER_ENTRY_OVERHEAD = p0.getInt("io.netty.transport.outboundBufferEntrySizeOverhead", 96);
    private static final C0934y NIO_BUFFERS = new C0253j0();
    private static final AtomicLongFieldUpdater<C0263o0> TOTAL_PENDING_SIZE_UPDATER;
    private static final AtomicIntegerFieldUpdater<C0263o0> UNWRITABLE_UPDATER;
    private static final C1082c logger;
    private final K channel;
    private volatile Runnable fireChannelWritabilityChangedTask;
    private int flushed;
    private C0261n0 flushedEntry;
    private boolean inFail;
    private int nioBufferCount;
    private long nioBufferSize;
    private C0261n0 tailEntry;
    private volatile long totalPendingSize;
    private C0261n0 unflushedEntry;
    private volatile int unwritable;

    static {
        Class<C0263o0> cls = C0263o0.class;
        logger = d.getInstance((Class<?>) cls);
        TOTAL_PENDING_SIZE_UPDATER = AtomicLongFieldUpdater.newUpdater(cls, "totalPendingSize");
        UNWRITABLE_UPDATER = AtomicIntegerFieldUpdater.newUpdater(cls, "unwritable");
    }

    public C0263o0(C0260n nVar) {
        this.channel = nVar;
    }

    private void clearNioBuffers() {
        int i = this.nioBufferCount;
        if (i > 0) {
            this.nioBufferCount = 0;
            Arrays.fill((Object[]) NIO_BUFFERS.get(), 0, i, (Object) null);
        }
    }

    private static ByteBuffer[] expandNioBufferArray(ByteBuffer[] byteBufferArr, int i, int i8) {
        int length = byteBufferArr.length;
        do {
            length <<= 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
        } while (i > length);
        ByteBuffer[] byteBufferArr2 = new ByteBuffer[length];
        System.arraycopy(byteBufferArr, 0, byteBufferArr2, 0, i8);
        return byteBufferArr2;
    }

    private void fireChannelWritabilityChanged(boolean z) {
        C0270s0 pipeline = ((C0260n) this.channel).pipeline();
        if (z) {
            Runnable runnable = this.fireChannelWritabilityChangedTask;
            if (runnable == null) {
                runnable = new C0255k0(this, pipeline);
                this.fireChannelWritabilityChangedTask = runnable;
            }
            ((d0) this.channel.eventLoop()).execute(runnable);
            return;
        }
        ((O0) pipeline).fireChannelWritabilityChanged();
    }

    private boolean isFlushedEntry(C0261n0 n0Var) {
        if (n0Var == null || n0Var == this.unflushedEntry) {
            return false;
        }
        return true;
    }

    private boolean remove0(Throwable th, boolean z) {
        C0261n0 n0Var = this.flushedEntry;
        if (n0Var == null) {
            clearNioBuffers();
            return false;
        }
        Object obj = n0Var.msg;
        C0274u0 u0Var = n0Var.promise;
        int i = n0Var.pendingSize;
        removeEntry(n0Var);
        if (!n0Var.cancelled) {
            I.safeRelease(obj);
            safeFail(u0Var, th);
            decrementPendingOutboundBytes((long) i, false, z);
        }
        n0Var.unguardedRecycle();
        return true;
    }

    private void removeEntry(C0261n0 n0Var) {
        int i = this.flushed - 1;
        this.flushed = i;
        if (i == 0) {
            this.flushedEntry = null;
            if (n0Var == this.tailEntry) {
                this.tailEntry = null;
                this.unflushedEntry = null;
                return;
            }
            return;
        }
        this.flushedEntry = n0Var.next;
    }

    private static void safeFail(C0274u0 u0Var, Throwable th) {
        C1082c cVar;
        if (u0Var instanceof v1) {
            cVar = null;
        } else {
            cVar = logger;
        }
        C0969b0.tryFailure(u0Var, th, cVar);
    }

    private static void safeSuccess(C0274u0 u0Var) {
        C1082c cVar;
        if (u0Var instanceof v1) {
            cVar = null;
        } else {
            cVar = logger;
        }
        C0969b0.trySuccess(u0Var, null, cVar);
    }

    private void setUnwritable(boolean z) {
        int i;
        do {
            i = this.unwritable;
        } while (!UNWRITABLE_UPDATER.compareAndSet(this, i, i | 1));
        if (i == 0) {
            fireChannelWritabilityChanged(z);
        }
    }

    private void setWritable(boolean z) {
        int i;
        int i8;
        do {
            i = this.unwritable;
            i8 = i & -2;
        } while (!UNWRITABLE_UPDATER.compareAndSet(this, i, i8));
        if (i != 0 && i8 == 0) {
            fireChannelWritabilityChanged(z);
        }
    }

    private static long total(Object obj) {
        int readableBytes;
        if (obj instanceof C0185n) {
            readableBytes = ((C0185n) obj).readableBytes();
        } else if (!(obj instanceof C0189p)) {
            return -1;
        } else {
            readableBytes = ((C0189p) obj).content().readableBytes();
        }
        return (long) readableBytes;
    }

    public void addFlush() {
        C0261n0 n0Var = this.unflushedEntry;
        if (n0Var != null) {
            if (this.flushedEntry == null) {
                this.flushedEntry = n0Var;
            }
            do {
                this.flushed++;
                if (!n0Var.promise.setUncancellable()) {
                    decrementPendingOutboundBytes((long) n0Var.cancel(), false, true);
                }
                n0Var = n0Var.next;
            } while (n0Var != null);
            this.unflushedEntry = null;
        }
    }

    public void addMessage(Object obj, int i, C0274u0 u0Var) {
        C0261n0 newInstance = C0261n0.newInstance(obj, i, total(obj), u0Var);
        C0261n0 n0Var = this.tailEntry;
        if (n0Var == null) {
            this.flushedEntry = null;
        } else {
            n0Var.next = newInstance;
        }
        this.tailEntry = newInstance;
        if (this.unflushedEntry == null) {
            this.unflushedEntry = newInstance;
        }
        incrementPendingOutboundBytes((long) newInstance.pendingSize, false);
    }

    public void close(Throwable th, boolean z) {
        if (this.inFail) {
            ((d0) this.channel.eventLoop()).execute(new C0257l0(this, th, z));
            return;
        }
        this.inFail = true;
        if (!z && this.channel.isOpen()) {
            throw new IllegalStateException("close() must be invoked after the channel is closed.");
        } else if (isEmpty()) {
            try {
                for (C0261n0 n0Var = this.unflushedEntry; n0Var != null; n0Var = n0Var.unguardedRecycleAndGetNext()) {
                    TOTAL_PENDING_SIZE_UPDATER.addAndGet(this, (long) (-n0Var.pendingSize));
                    if (!n0Var.cancelled) {
                        I.safeRelease(n0Var.msg);
                        safeFail(n0Var.promise, th);
                    }
                }
                this.inFail = false;
                clearNioBuffers();
            } catch (Throwable th2) {
                this.inFail = false;
                throw th2;
            }
        } else {
            throw new IllegalStateException("close() must be invoked after all flushed writes are handled.");
        }
    }

    public Object current() {
        C0261n0 n0Var = this.flushedEntry;
        if (n0Var == null) {
            return null;
        }
        return n0Var.msg;
    }

    public void decrementPendingOutboundBytes(long j7) {
        decrementPendingOutboundBytes(j7, true, true);
    }

    public void failFlushed(Throwable th, boolean z) {
        if (!this.inFail) {
            boolean z6 = true;
            z6 = false;
            try {
                do {
                } while (remove0(th, z));
                this.inFail = z6;
            } finally {
                this.inFail = z6;
            }
        }
    }

    public void incrementPendingOutboundBytes(long j7) {
        incrementPendingOutboundBytes(j7, true);
    }

    public boolean isEmpty() {
        if (this.flushed == 0) {
            return true;
        }
        return false;
    }

    public boolean isWritable() {
        if (this.unwritable == 0) {
            return true;
        }
        return false;
    }

    public int nioBufferCount() {
        return this.nioBufferCount;
    }

    public long nioBufferSize() {
        return this.nioBufferSize;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        r8 = (S5.C0185n) r8;
        r9 = r8.readerIndex();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.nio.ByteBuffer[] nioBuffers(int r17, long r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            g6.m r2 = g6.C0980m.get()
            f6.y r3 = NIO_BUFFERS
            java.lang.Object r3 = r3.get(r2)
            java.nio.ByteBuffer[] r3 = (java.nio.ByteBuffer[]) r3
            T5.n0 r4 = r0.flushedEntry
            r5 = 0
            r7 = 0
        L_0x0015:
            boolean r8 = r0.isFlushedEntry(r4)
            if (r8 == 0) goto L_0x0077
            java.lang.Object r8 = r4.msg
            boolean r9 = r8 instanceof S5.C0185n
            if (r9 == 0) goto L_0x0077
            boolean r9 = r4.cancelled
            if (r9 != 0) goto L_0x0074
            S5.n r8 = (S5.C0185n) r8
            int r9 = r8.readerIndex()
            int r10 = r8.writerIndex()
            int r10 = r10 - r9
            if (r10 <= 0) goto L_0x0074
            long r11 = (long) r10
            long r13 = r18 - r11
            int r15 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r15 >= 0) goto L_0x003c
            if (r7 == 0) goto L_0x003c
            goto L_0x0077
        L_0x003c:
            long r5 = r5 + r11
            int r11 = r4.count
            r12 = -1
            if (r11 != r12) goto L_0x0048
            int r11 = r8.nioBufferCount()
            r4.count = r11
        L_0x0048:
            int r12 = r7 + r11
            int r12 = java.lang.Math.min(r1, r12)
            int r13 = r3.length
            if (r12 <= r13) goto L_0x005a
            java.nio.ByteBuffer[] r3 = expandNioBufferArray(r3, r12, r7)
            f6.y r12 = NIO_BUFFERS
            r12.set(r2, r3)
        L_0x005a:
            r12 = 1
            if (r11 != r12) goto L_0x006d
            java.nio.ByteBuffer r11 = r4.buf
            if (r11 != 0) goto L_0x0067
            java.nio.ByteBuffer r11 = r8.internalNioBuffer(r9, r10)
            r4.buf = r11
        L_0x0067:
            int r8 = r7 + 1
            r3[r7] = r11
            r7 = r8
            goto L_0x0071
        L_0x006d:
            int r7 = nioBuffers(r4, r8, r3, r7, r1)
        L_0x0071:
            if (r7 < r1) goto L_0x0074
            goto L_0x0077
        L_0x0074:
            T5.n0 r4 = r4.next
            goto L_0x0015
        L_0x0077:
            r0.nioBufferCount = r7
            r0.nioBufferSize = r5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: T5.C0263o0.nioBuffers(int, long):java.nio.ByteBuffer[]");
    }

    public void progress(long j7) {
        C0261n0 n0Var = this.flushedEntry;
        C0274u0 u0Var = n0Var.promise;
        n0Var.progress += j7;
        u0Var.getClass();
    }

    public boolean remove() {
        C0261n0 n0Var = this.flushedEntry;
        if (n0Var == null) {
            clearNioBuffers();
            return false;
        }
        Object obj = n0Var.msg;
        C0274u0 u0Var = n0Var.promise;
        int i = n0Var.pendingSize;
        removeEntry(n0Var);
        if (!n0Var.cancelled) {
            I.safeRelease(obj);
            safeSuccess(u0Var);
            decrementPendingOutboundBytes((long) i, false, true);
        }
        n0Var.unguardedRecycle();
        return true;
    }

    public void removeBytes(long j7) {
        while (true) {
            Object current = current();
            if (!(current instanceof C0185n)) {
                break;
            }
            C0185n nVar = (C0185n) current;
            int readerIndex = nVar.readerIndex();
            long writerIndex = (long) (nVar.writerIndex() - readerIndex);
            if (writerIndex <= j7) {
                if (j7 != 0) {
                    progress(writerIndex);
                    j7 -= writerIndex;
                }
                remove();
            } else if (j7 != 0) {
                nVar.readerIndex(readerIndex + ((int) j7));
                progress(j7);
            }
        }
        clearNioBuffers();
    }

    public long totalPendingWriteBytes() {
        return this.totalPendingSize;
    }

    private void decrementPendingOutboundBytes(long j7, boolean z, boolean z6) {
        if (j7 != 0) {
            long addAndGet = TOTAL_PENDING_SIZE_UPDATER.addAndGet(this, -j7);
            if (z6 && addAndGet < ((long) ((B0) this.channel.config()).getWriteBufferLowWaterMark())) {
                setWritable(z);
            }
        }
    }

    private void incrementPendingOutboundBytes(long j7, boolean z) {
        if (j7 != 0 && TOTAL_PENDING_SIZE_UPDATER.addAndGet(this, j7) > ((long) ((B0) this.channel.config()).getWriteBufferHighWaterMark())) {
            setUnwritable(z);
        }
    }

    public void close(ClosedChannelException closedChannelException) {
        close(closedChannelException, false);
    }

    private static int nioBuffers(C0261n0 n0Var, C0185n nVar, ByteBuffer[] byteBufferArr, int i, int i8) {
        ByteBuffer byteBuffer;
        ByteBuffer[] byteBufferArr2 = n0Var.bufs;
        if (byteBufferArr2 == null) {
            byteBufferArr2 = nVar.nioBuffers();
            n0Var.bufs = byteBufferArr2;
        }
        int i9 = 0;
        while (i9 < byteBufferArr2.length && i < i8 && (byteBuffer = byteBufferArr2[i9]) != null) {
            if (byteBuffer.hasRemaining()) {
                byteBufferArr[i] = byteBuffer;
                i++;
            }
            i9++;
        }
        return i;
    }
}
