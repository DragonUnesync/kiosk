package X5;

import S5.C0185n;
import S5.D0;
import T5.Y;
import e6.X;
import g6.n0;
import java.util.List;

public abstract class N extends C0353d {
    static final X REPLAY = X.valueOf(N.class, "REPLAY");
    private int checkpoint;
    private final O replayable;
    private Object state;

    public N() {
        this((Object) null);
    }

    public void callDecode(Y y8, C0185n nVar, List<Object> list) {
        this.replayable.setCumulation(nVar);
        while (nVar.isReadable()) {
            try {
                int readerIndex = nVar.readerIndex();
                this.checkpoint = readerIndex;
                int size = list.size();
                if (size > 0) {
                    C0353d.fireChannelRead(y8, list, size);
                    list.clear();
                    if (!y8.isRemoved()) {
                        size = 0;
                    } else {
                        return;
                    }
                }
                Object obj = this.state;
                int readableBytes = nVar.readableBytes();
                try {
                    decodeRemovalReentryProtection(y8, this.replayable, list);
                    if (!y8.isRemoved()) {
                        if (size != list.size()) {
                            if (readerIndex == nVar.readerIndex()) {
                                if (obj == this.state) {
                                    throw new C0364o(n0.simpleClassName(getClass()) + ".decode() method must consume the inbound data or change its state if it decoded something.");
                                }
                            }
                            if (isSingleDecode()) {
                                return;
                            }
                        } else if (readableBytes != nVar.readableBytes()) {
                            continue;
                        } else if (obj == this.state) {
                            throw new C0364o(n0.simpleClassName(getClass()) + ".decode() must consume the inbound data or change its state if it did not decode anything.");
                        }
                    } else {
                        return;
                    }
                } catch (X e) {
                    e.expect(REPLAY);
                    if (!y8.isRemoved()) {
                        int i = this.checkpoint;
                        if (i >= 0) {
                            nVar.readerIndex(i);
                            return;
                        }
                        return;
                    }
                    return;
                }
            } catch (C0364o e8) {
                throw e8;
            } catch (Exception e9) {
                throw new C0364o((Throwable) e9);
            }
        }
    }

    public final void channelInputClosed(Y y8, List<Object> list) {
        try {
            this.replayable.terminate();
            if (this.cumulation != null) {
                callDecode(y8, internalBuffer(), list);
            } else {
                this.replayable.setCumulation(D0.EMPTY_BUFFER);
            }
            decodeLast(y8, this.replayable, list);
        } catch (X e) {
            e.expect(REPLAY);
        }
    }

    public N(Object obj) {
        this.replayable = new O();
        this.checkpoint = -1;
        this.state = obj;
    }
}
