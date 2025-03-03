package T5;

import S5.C0187o;
import g6.B;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class B0 implements L {
    private static final AtomicIntegerFieldUpdater<B0> AUTOREAD_UPDATER;
    private static final g1 DEFAULT_MSG_SIZE_ESTIMATOR = V0.DEFAULT;
    private static final AtomicReferenceFieldUpdater<B0, w1> WATERMARK_UPDATER;
    private volatile C0187o allocator;
    private volatile boolean autoClose;
    private volatile int autoRead;
    protected final K channel;
    private volatile int connectTimeoutMillis;
    private volatile int maxMessagesPerWrite;
    private volatile g1 msgSizeEstimator;
    private volatile boolean pinEventExecutor;
    private volatile o1 rcvBufAllocator;
    private volatile w1 writeBufferWaterMark;
    private volatile int writeSpinCount;

    static {
        Class<B0> cls = B0.class;
        AUTOREAD_UPDATER = AtomicIntegerFieldUpdater.newUpdater(cls, "autoRead");
        WATERMARK_UPDATER = AtomicReferenceFieldUpdater.newUpdater(cls, w1.class, "writeBufferWaterMark");
    }

    public B0(K k8) {
        this(k8, new I());
    }

    private boolean getPinEventExecutorPerGroup() {
        return this.pinEventExecutor;
    }

    private L setPinEventExecutorPerGroup(boolean z) {
        this.pinEventExecutor = z;
        return this;
    }

    public void autoReadCleared() {
    }

    public C0187o getAllocator() {
        return this.allocator;
    }

    public int getConnectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    @Deprecated
    public int getMaxMessagesPerRead() {
        try {
            return ((S0) ((e1) getRecvByteBufAllocator())).maxMessagesPerRead();
        } catch (ClassCastException e) {
            throw new IllegalStateException("getRecvByteBufAllocator() must return an object of type MaxMessagesRecvByteBufAllocator", e);
        }
    }

    public int getMaxMessagesPerWrite() {
        return this.maxMessagesPerWrite;
    }

    public g1 getMessageSizeEstimator() {
        return this.msgSizeEstimator;
    }

    public <T> T getOption(C0251i0 i0Var) {
        B.checkNotNull(i0Var, "option");
        if (i0Var == C0251i0.CONNECT_TIMEOUT_MILLIS) {
            return Integer.valueOf(getConnectTimeoutMillis());
        }
        if (i0Var == C0251i0.MAX_MESSAGES_PER_READ) {
            return Integer.valueOf(getMaxMessagesPerRead());
        }
        if (i0Var == C0251i0.WRITE_SPIN_COUNT) {
            return Integer.valueOf(getWriteSpinCount());
        }
        if (i0Var == C0251i0.ALLOCATOR) {
            return getAllocator();
        }
        if (i0Var == C0251i0.RCVBUF_ALLOCATOR) {
            return getRecvByteBufAllocator();
        }
        if (i0Var == C0251i0.AUTO_READ) {
            return Boolean.valueOf(isAutoRead());
        }
        if (i0Var == C0251i0.AUTO_CLOSE) {
            return Boolean.valueOf(isAutoClose());
        }
        if (i0Var == C0251i0.WRITE_BUFFER_HIGH_WATER_MARK) {
            return Integer.valueOf(getWriteBufferHighWaterMark());
        }
        if (i0Var == C0251i0.WRITE_BUFFER_LOW_WATER_MARK) {
            return Integer.valueOf(getWriteBufferLowWaterMark());
        }
        if (i0Var == C0251i0.WRITE_BUFFER_WATER_MARK) {
            return getWriteBufferWaterMark();
        }
        if (i0Var == C0251i0.MESSAGE_SIZE_ESTIMATOR) {
            return getMessageSizeEstimator();
        }
        if (i0Var == C0251i0.SINGLE_EVENTEXECUTOR_PER_GROUP) {
            return Boolean.valueOf(getPinEventExecutorPerGroup());
        }
        if (i0Var == C0251i0.MAX_MESSAGES_PER_WRITE) {
            return Integer.valueOf(getMaxMessagesPerWrite());
        }
        return null;
    }

    public <T extends o1> T getRecvByteBufAllocator() {
        return this.rcvBufAllocator;
    }

    public int getWriteBufferHighWaterMark() {
        return this.writeBufferWaterMark.high();
    }

    public int getWriteBufferLowWaterMark() {
        return this.writeBufferWaterMark.low();
    }

    public w1 getWriteBufferWaterMark() {
        return this.writeBufferWaterMark;
    }

    public int getWriteSpinCount() {
        return this.writeSpinCount;
    }

    public boolean isAutoClose() {
        return this.autoClose;
    }

    public boolean isAutoRead() {
        if (this.autoRead == 1) {
            return true;
        }
        return false;
    }

    public L setAllocator(C0187o oVar) {
        this.allocator = (C0187o) B.checkNotNull(oVar, "allocator");
        return this;
    }

    public L setAutoClose(boolean z) {
        this.autoClose = z;
        return this;
    }

    public L setAutoRead(boolean z) {
        boolean z6 = true;
        if (AUTOREAD_UPDATER.getAndSet(this, z ? 1 : 0) != 1) {
            z6 = false;
        }
        if (z && !z6) {
            ((C0260n) this.channel).read();
        } else if (!z && z6) {
            autoReadCleared();
        }
        return this;
    }

    public L setConnectTimeoutMillis(int i) {
        B.checkPositiveOrZero(i, "connectTimeoutMillis");
        this.connectTimeoutMillis = i;
        return this;
    }

    @Deprecated
    public L setMaxMessagesPerRead(int i) {
        try {
            ((S0) ((e1) getRecvByteBufAllocator())).maxMessagesPerRead(i);
            return this;
        } catch (ClassCastException e) {
            throw new IllegalStateException("getRecvByteBufAllocator() must return an object of type MaxMessagesRecvByteBufAllocator", e);
        }
    }

    public L setMaxMessagesPerWrite(int i) {
        this.maxMessagesPerWrite = B.checkPositive(i, "maxMessagesPerWrite");
        return this;
    }

    public L setMessageSizeEstimator(g1 g1Var) {
        this.msgSizeEstimator = (g1) B.checkNotNull(g1Var, "estimator");
        return this;
    }

    public <T> boolean setOption(C0251i0 i0Var, T t8) {
        validate(i0Var, t8);
        if (i0Var == C0251i0.CONNECT_TIMEOUT_MILLIS) {
            setConnectTimeoutMillis(((Integer) t8).intValue());
            return true;
        } else if (i0Var == C0251i0.MAX_MESSAGES_PER_READ) {
            setMaxMessagesPerRead(((Integer) t8).intValue());
            return true;
        } else if (i0Var == C0251i0.WRITE_SPIN_COUNT) {
            setWriteSpinCount(((Integer) t8).intValue());
            return true;
        } else if (i0Var == C0251i0.ALLOCATOR) {
            setAllocator((C0187o) t8);
            return true;
        } else if (i0Var == C0251i0.RCVBUF_ALLOCATOR) {
            setRecvByteBufAllocator((o1) t8);
            return true;
        } else if (i0Var == C0251i0.AUTO_READ) {
            setAutoRead(((Boolean) t8).booleanValue());
            return true;
        } else if (i0Var == C0251i0.AUTO_CLOSE) {
            setAutoClose(((Boolean) t8).booleanValue());
            return true;
        } else if (i0Var == C0251i0.WRITE_BUFFER_HIGH_WATER_MARK) {
            setWriteBufferHighWaterMark(((Integer) t8).intValue());
            return true;
        } else if (i0Var == C0251i0.WRITE_BUFFER_LOW_WATER_MARK) {
            setWriteBufferLowWaterMark(((Integer) t8).intValue());
            return true;
        } else if (i0Var == C0251i0.WRITE_BUFFER_WATER_MARK) {
            setWriteBufferWaterMark((w1) t8);
            return true;
        } else if (i0Var == C0251i0.MESSAGE_SIZE_ESTIMATOR) {
            setMessageSizeEstimator((g1) t8);
            return true;
        } else if (i0Var == C0251i0.SINGLE_EVENTEXECUTOR_PER_GROUP) {
            setPinEventExecutorPerGroup(((Boolean) t8).booleanValue());
            return true;
        } else if (i0Var != C0251i0.MAX_MESSAGES_PER_WRITE) {
            return false;
        } else {
            setMaxMessagesPerWrite(((Integer) t8).intValue());
            return true;
        }
    }

    public L setRecvByteBufAllocator(o1 o1Var) {
        this.rcvBufAllocator = (o1) B.checkNotNull(o1Var, "allocator");
        return this;
    }

    public L setWriteBufferHighWaterMark(int i) {
        B.checkPositiveOrZero(i, "writeBufferHighWaterMark");
        while (true) {
            w1 w1Var = this.writeBufferWaterMark;
            if (i >= w1Var.low()) {
                AtomicReferenceFieldUpdater<B0, w1> atomicReferenceFieldUpdater = WATERMARK_UPDATER;
                w1 w1Var2 = new w1(w1Var.low(), i, false);
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, w1Var, w1Var2)) {
                        return this;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != w1Var) {
                    }
                }
            } else {
                throw new IllegalArgumentException("writeBufferHighWaterMark cannot be less than writeBufferLowWaterMark (" + w1Var.low() + "): " + i);
            }
        }
    }

    public L setWriteBufferLowWaterMark(int i) {
        B.checkPositiveOrZero(i, "writeBufferLowWaterMark");
        while (true) {
            w1 w1Var = this.writeBufferWaterMark;
            if (i <= w1Var.high()) {
                AtomicReferenceFieldUpdater<B0, w1> atomicReferenceFieldUpdater = WATERMARK_UPDATER;
                w1 w1Var2 = new w1(i, w1Var.high(), false);
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, w1Var, w1Var2)) {
                        return this;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != w1Var) {
                    }
                }
            } else {
                throw new IllegalArgumentException("writeBufferLowWaterMark cannot be greater than writeBufferHighWaterMark (" + w1Var.high() + "): " + i);
            }
        }
    }

    public L setWriteBufferWaterMark(w1 w1Var) {
        this.writeBufferWaterMark = (w1) B.checkNotNull(w1Var, "writeBufferWaterMark");
        return this;
    }

    public L setWriteSpinCount(int i) {
        B.checkPositive(i, "writeSpinCount");
        if (i == Integer.MAX_VALUE) {
            i--;
        }
        this.writeSpinCount = i;
        return this;
    }

    public <T> void validate(C0251i0 i0Var, T t8) {
        ((C0251i0) B.checkNotNull(i0Var, "option")).validate(t8);
    }

    public B0(K k8, o1 o1Var) {
        this.allocator = C0187o.DEFAULT;
        this.msgSizeEstimator = DEFAULT_MSG_SIZE_ESTIMATOR;
        this.connectTimeoutMillis = 30000;
        this.writeSpinCount = 16;
        this.maxMessagesPerWrite = Integer.MAX_VALUE;
        this.autoRead = 1;
        this.autoClose = true;
        this.writeBufferWaterMark = w1.DEFAULT;
        this.pinEventExecutor = true;
        setRecvByteBufAllocator(o1Var, k8.metadata());
        this.channel = k8;
    }

    private void setRecvByteBufAllocator(o1 o1Var, C0247g0 g0Var) {
        B.checkNotNull(o1Var, "allocator");
        B.checkNotNull(g0Var, "metadata");
        if (o1Var instanceof e1) {
            ((S0) ((e1) o1Var)).maxMessagesPerRead(g0Var.defaultMaxMessagesPerRead());
        }
        setRecvByteBufAllocator(o1Var);
    }
}
