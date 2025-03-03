package X5;

import S5.C0163c;
import S5.C0185n;
import S5.C0187o;
import S5.D0;
import T5.B0;
import T5.C0245f0;
import T5.Y;
import V5.a;
import e6.r;
import g6.B;
import g6.n0;
import java.util.List;

/* renamed from: X5.d  reason: case insensitive filesystem */
public abstract class C0353d extends C0245f0 {
    public static final C0352c COMPOSITE_CUMULATOR = new C0351b();
    public static final C0352c MERGE_CUMULATOR = new C0350a();
    C0185n cumulation;
    private C0352c cumulator = MERGE_CUMULATOR;
    private byte decodeState = 0;
    private int discardAfterReads = 16;
    private boolean firedChannelRead;
    private boolean first;
    private int numReads;
    private boolean selfFiredChannelRead;
    private boolean singleDecode;

    public C0353d() {
        ensureNotSharable();
    }

    private void channelInputClosed(Y y8, boolean z) {
        C0360k newInstance = C0360k.newInstance();
        try {
            channelInputClosed(y8, (List<Object>) newInstance);
            try {
                C0185n nVar = this.cumulation;
                if (nVar != null) {
                    nVar.release();
                    this.cumulation = null;
                }
                int size = newInstance.size();
                fireChannelRead(y8, newInstance, size);
                if (size > 0) {
                    y8.fireChannelReadComplete();
                }
                if (z) {
                    y8.fireChannelInactive();
                }
                newInstance.recycle();
            } catch (Throwable th) {
                newInstance.recycle();
                throw th;
            }
        } catch (C0364o e) {
            throw e;
        } catch (Exception e8) {
            throw new C0364o((Throwable) e8);
        } catch (Throwable th2) {
            newInstance.recycle();
            throw th2;
        }
    }

    public static C0185n expandCumulation(C0187o oVar, C0185n nVar, C0185n nVar2) {
        int readableBytes = nVar.readableBytes();
        int readableBytes2 = nVar2.readableBytes();
        int i = readableBytes + readableBytes2;
        C0163c cVar = (C0163c) oVar;
        C0185n nVar3 = cVar.buffer(cVar.calculateNewCapacity(i, Integer.MAX_VALUE));
        try {
            nVar3.setBytes(0, nVar3, nVar3.readerIndex(), readableBytes).setBytes(readableBytes, nVar2, nVar2.readerIndex(), readableBytes2).writerIndex(i);
            nVar2.readerIndex(nVar2.writerIndex());
            return nVar3;
        } finally {
            nVar3.release();
        }
    }

    public static void fireChannelRead(Y y8, List<Object> list, int i) {
        if (list instanceof C0360k) {
            fireChannelRead(y8, (C0360k) list, i);
            return;
        }
        for (int i8 = 0; i8 < i; i8++) {
            y8.fireChannelRead(list.get(i8));
        }
    }

    public int actualReadableBytes() {
        return internalBuffer().readableBytes();
    }

    public void callDecode(Y y8, C0185n nVar, List<Object> list) {
        while (nVar.isReadable()) {
            try {
                int size = list.size();
                if (size > 0) {
                    fireChannelRead(y8, list, size);
                    list.clear();
                    if (y8.isRemoved()) {
                        return;
                    }
                }
                int readableBytes = nVar.readableBytes();
                decodeRemovalReentryProtection(y8, nVar, list);
                if (!y8.isRemoved()) {
                    if (list.isEmpty()) {
                        if (readableBytes == nVar.readableBytes()) {
                            return;
                        }
                    } else if (readableBytes == nVar.readableBytes()) {
                        throw new C0364o(n0.simpleClassName(getClass()) + ".decode() did not read anything but decoded a message.");
                    } else if (isSingleDecode()) {
                        return;
                    }
                } else {
                    return;
                }
            } catch (C0364o e) {
                throw e;
            } catch (Exception e8) {
                throw new C0364o((Throwable) e8);
            }
        }
    }

    public void channelInactive(Y y8) {
        channelInputClosed(y8, true);
    }

    public void channelRead(Y y8, Object obj) {
        boolean z;
        C0185n nVar;
        if (obj instanceof C0185n) {
            this.selfFiredChannelRead = true;
            C0360k newInstance = C0360k.newInstance();
            try {
                if (this.cumulation == null) {
                    z = true;
                } else {
                    z = false;
                }
                this.first = z;
                C0352c cVar = this.cumulator;
                C0187o alloc = y8.alloc();
                if (this.first) {
                    nVar = D0.EMPTY_BUFFER;
                } else {
                    nVar = this.cumulation;
                }
                C0185n cumulate = cVar.cumulate(alloc, nVar, (C0185n) obj);
                this.cumulation = cumulate;
                callDecode(y8, cumulate, newInstance);
                try {
                    C0185n nVar2 = this.cumulation;
                    if (nVar2 == null || nVar2.isReadable()) {
                        int i = this.numReads + 1;
                        this.numReads = i;
                        if (i >= this.discardAfterReads) {
                            this.numReads = 0;
                            discardSomeReadBytes();
                        }
                    } else {
                        this.numReads = 0;
                        this.cumulation.release();
                        this.cumulation = null;
                    }
                    int size = newInstance.size();
                    this.firedChannelRead |= newInstance.insertSinceRecycled();
                    fireChannelRead(y8, newInstance, size);
                    newInstance.recycle();
                } catch (r e) {
                    throw new r(getClass().getSimpleName().concat("#decode() might have released its input buffer, or passed it down the pipeline without a retain() call, which is not allowed."), (Throwable) e);
                } catch (Throwable th) {
                    newInstance.recycle();
                    throw th;
                }
            } catch (r e8) {
                throw new r(getClass().getSimpleName().concat("#decode() might have released its input buffer, or passed it down the pipeline without a retain() call, which is not allowed."), (Throwable) e8);
            } catch (C0364o e9) {
                throw e9;
            } catch (Exception e10) {
                throw new C0364o((Throwable) e10);
            } catch (Throwable th2) {
                newInstance.recycle();
                throw th2;
            }
        } else {
            y8.fireChannelRead(obj);
        }
    }

    public void channelReadComplete(Y y8) {
        this.numReads = 0;
        discardSomeReadBytes();
        if (this.selfFiredChannelRead && !this.firedChannelRead && !((B0) y8.channel().config()).isAutoRead()) {
            y8.read();
        }
        this.firedChannelRead = false;
        y8.fireChannelReadComplete();
    }

    public abstract void decode(Y y8, C0185n nVar, List<Object> list);

    public void decodeLast(Y y8, C0185n nVar, List<Object> list) {
        if (nVar.isReadable()) {
            decodeRemovalReentryProtection(y8, nVar, list);
        }
    }

    public final void decodeRemovalReentryProtection(Y y8, C0185n nVar, List<Object> list) {
        byte b8 = 1;
        this.decodeState = b8;
        try {
            decode(y8, nVar, list);
        } finally {
            if (this.decodeState != 2) {
                b8 = 0;
            }
            this.decodeState = 0;
            if (b8 != 0) {
                fireChannelRead(y8, list, list.size());
                list.clear();
                handlerRemoved(y8);
            }
        }
    }

    public final void discardSomeReadBytes() {
        C0185n nVar = this.cumulation;
        if (nVar != null && !this.first && nVar.refCnt() == 1) {
            this.cumulation.discardSomeReadBytes();
        }
    }

    public final void handlerRemoved(Y y8) {
        if (this.decodeState == 1) {
            this.decodeState = 2;
            return;
        }
        C0185n nVar = this.cumulation;
        if (nVar != null) {
            this.cumulation = null;
            this.numReads = 0;
            if (nVar.readableBytes() > 0) {
                y8.fireChannelRead(nVar);
                y8.fireChannelReadComplete();
            } else {
                nVar.release();
            }
        }
        handlerRemoved0(y8);
    }

    public void handlerRemoved0(Y y8) {
    }

    public C0185n internalBuffer() {
        C0185n nVar = this.cumulation;
        if (nVar != null) {
            return nVar;
        }
        return D0.EMPTY_BUFFER;
    }

    public boolean isSingleDecode() {
        return this.singleDecode;
    }

    public void setCumulator(C0352c cVar) {
        this.cumulator = (C0352c) B.checkNotNull(cVar, "cumulator");
    }

    public void userEventTriggered(Y y8, Object obj) {
        if (obj instanceof a) {
            channelInputClosed(y8, false);
        }
        super.userEventTriggered(y8, obj);
    }

    public static void fireChannelRead(Y y8, C0360k kVar, int i) {
        for (int i8 = 0; i8 < i; i8++) {
            y8.fireChannelRead(kVar.getUnsafe(i8));
        }
    }

    public void channelInputClosed(Y y8, List<Object> list) {
        C0185n nVar = this.cumulation;
        if (nVar != null) {
            callDecode(y8, nVar, list);
            if (!y8.isRemoved()) {
                C0185n nVar2 = this.cumulation;
                if (nVar2 == null) {
                    nVar2 = D0.EMPTY_BUFFER;
                }
                decodeLast(y8, nVar2, list);
                return;
            }
            return;
        }
        decodeLast(y8, D0.EMPTY_BUFFER, list);
    }
}
