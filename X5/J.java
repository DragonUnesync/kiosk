package X5;

import S5.C0163c;
import S5.C0185n;
import S5.C0189p;
import S5.D0;
import S5.E;
import T5.B0;
import T5.C0270s0;
import T5.P;
import T5.U;
import T5.Y;
import e6.I;
import g6.B;
import java.util.List;

public abstract class J extends K {
    private boolean aggregating;
    private U continueResponseWriteListener;
    private Y ctx;
    private C0189p currentMessage;
    private boolean handleIncompleteAggregateDuringClose = true;
    private boolean handlingOversizedMessage;
    private final int maxContentLength;
    private int maxCumulationBufferComponents = 1024;

    public J(int i) {
        validateMaxContentLength(i);
        this.maxContentLength = i;
    }

    private static void appendPartialContent(E e, C0185n nVar) {
        if (nVar.isReadable()) {
            e.addComponent(true, nVar.retain());
        }
    }

    private void finishAggregation0(C0189p pVar) {
        this.aggregating = false;
        finishAggregation(pVar);
    }

    private void invokeHandleOversizedMessage(Y y8, Object obj) {
        this.handlingOversizedMessage = true;
        this.currentMessage = null;
        this.handleIncompleteAggregateDuringClose = false;
        try {
            handleOversizedMessage(y8, obj);
        } finally {
            I.release(obj);
        }
    }

    private void releaseCurrentMessage() {
        C0189p pVar = this.currentMessage;
        if (pVar != null) {
            pVar.release();
            this.currentMessage = null;
            this.handlingOversizedMessage = false;
            this.aggregating = false;
        }
    }

    private static void validateMaxContentLength(int i) {
        B.checkPositiveOrZero(i, "maxContentLength");
    }

    public boolean acceptInboundMessage(Object obj) {
        if (!super.acceptInboundMessage(obj) || isAggregated(obj)) {
            return false;
        }
        if (isStartMessage(obj)) {
            return true;
        }
        if (!this.aggregating || !isContentMessage(obj)) {
            return false;
        }
        return true;
    }

    public abstract void aggregate(C0189p pVar, C0189p pVar2);

    public abstract C0189p beginAggregation(Object obj, C0185n nVar);

    public void channelInactive(Y y8) {
        if (this.aggregating && this.handleIncompleteAggregateDuringClose) {
            y8.fireExceptionCaught(new M("Channel closed while still aggregating message"));
        }
        try {
            super.channelInactive(y8);
        } finally {
            releaseCurrentMessage();
        }
    }

    public void channelReadComplete(Y y8) {
        if (this.currentMessage != null && !((B0) y8.channel().config()).isAutoRead()) {
            y8.read();
        }
        y8.fireChannelReadComplete();
    }

    public abstract boolean closeAfterContinueResponse(Object obj);

    public void decode(Y y8, Object obj, List<Object> list) {
        C0189p pVar;
        boolean z = true;
        if (isStartMessage(obj)) {
            this.aggregating = true;
            this.handlingOversizedMessage = false;
            C0189p pVar2 = this.currentMessage;
            if (pVar2 == null) {
                Object newContinueResponse = newContinueResponse(obj, this.maxContentLength, y8.pipeline());
                if (newContinueResponse != null) {
                    U u3 = this.continueResponseWriteListener;
                    if (u3 == null) {
                        u3 = new I(this, y8);
                        this.continueResponseWriteListener = u3;
                    }
                    boolean closeAfterContinueResponse = closeAfterContinueResponse(newContinueResponse);
                    this.handlingOversizedMessage = ignoreContentAfterContinueResponse(newContinueResponse);
                    P addListener = y8.writeAndFlush(newContinueResponse).addListener(u3);
                    if (closeAfterContinueResponse) {
                        this.handleIncompleteAggregateDuringClose = false;
                        addListener.addListener(U.CLOSE);
                        return;
                    } else if (this.handlingOversizedMessage) {
                        return;
                    }
                } else if (isContentLengthInvalid(obj, this.maxContentLength)) {
                    invokeHandleOversizedMessage(y8, obj);
                    return;
                }
                if (!(obj instanceof C0366q) || ((C0366q) obj).decoderResult().isSuccess()) {
                    E compositeBuffer = ((C0163c) y8.alloc()).compositeBuffer(this.maxCumulationBufferComponents);
                    if (obj instanceof C0189p) {
                        appendPartialContent(compositeBuffer, ((C0189p) obj).content());
                    }
                    this.currentMessage = beginAggregation(obj, compositeBuffer);
                    return;
                }
                if (obj instanceof C0189p) {
                    pVar = beginAggregation(obj, ((C0189p) obj).content().retain());
                } else {
                    pVar = beginAggregation(obj, D0.EMPTY_BUFFER);
                }
                finishAggregation0(pVar);
                list.add(pVar);
                return;
            }
            pVar2.release();
            this.currentMessage = null;
            throw new H();
        } else if (isContentMessage(obj)) {
            C0189p pVar3 = this.currentMessage;
            if (pVar3 != null) {
                E e = (E) pVar3.content();
                C0189p pVar4 = (C0189p) obj;
                if (e.readableBytes() > this.maxContentLength - pVar4.content().readableBytes()) {
                    invokeHandleOversizedMessage(y8, this.currentMessage);
                    return;
                }
                appendPartialContent(e, pVar4.content());
                aggregate(this.currentMessage, pVar4);
                if (pVar4 instanceof C0366q) {
                    C0365p decoderResult = ((C0366q) pVar4).decoderResult();
                    if (!decoderResult.isSuccess()) {
                        C0189p pVar5 = this.currentMessage;
                        if (pVar5 instanceof C0366q) {
                            ((C0366q) pVar5).setDecoderResult(C0365p.failure(decoderResult.cause()));
                        }
                    } else {
                        z = isLastContentMessage(pVar4);
                    }
                } else {
                    z = isLastContentMessage(pVar4);
                }
                if (z) {
                    finishAggregation0(this.currentMessage);
                    list.add(this.currentMessage);
                    this.currentMessage = null;
                }
            }
        } else {
            throw new H();
        }
    }

    public abstract void finishAggregation(C0189p pVar);

    public abstract void handleOversizedMessage(Y y8, Object obj);

    public void handlerAdded(Y y8) {
        this.ctx = y8;
    }

    public void handlerRemoved(Y y8) {
        try {
            super.handlerRemoved(y8);
        } finally {
            releaseCurrentMessage();
        }
    }

    public abstract boolean ignoreContentAfterContinueResponse(Object obj);

    public abstract boolean isAggregated(Object obj);

    public abstract boolean isContentLengthInvalid(Object obj, int i);

    public abstract boolean isContentMessage(Object obj);

    public abstract boolean isLastContentMessage(C0189p pVar);

    public abstract boolean isStartMessage(Object obj);

    public abstract Object newContinueResponse(Object obj, int i, C0270s0 s0Var);
}
