package Z5;

import S5.C0163c;
import S5.C0185n;
import S5.C0206y;
import S5.D0;
import T5.C0274u0;
import T5.Y;
import X5.B;
import X5.L;
import e6.C0852k;
import e6.I;
import f6.O;
import g6.n0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class h0 extends L {
    private static final C0185n CRLF_BUF = D0.unreleasableBuffer(D0.directBuffer(2).writeByte(13).writeByte(10)).asReadOnly();
    private static final byte[] ZERO_CRLF_CRLF;
    private static final C0185n ZERO_CRLF_CRLF_BUF;
    private float headersEncodedSizeAccumulator = 256.0f;
    private final List<Object> out = new ArrayList();
    private int state = 0;
    private float trailersEncodedSizeAccumulator = 256.0f;

    static {
        byte[] bArr = {48, 13, 10, 13, 10};
        ZERO_CRLF_CRLF = bArr;
        ZERO_CRLF_CRLF_BUF = D0.unreleasableBuffer(D0.directBuffer(bArr.length).writeBytes(bArr)).asReadOnly();
    }

    private static void addEncodedLengthHex(Y y8, long j7, List<Object> list) {
        String hexString = Long.toHexString(j7);
        C0185n buffer = ((C0163c) y8.alloc()).buffer(hexString.length() + 2);
        buffer.writeCharSequence(hexString, C0852k.US_ASCII);
        C0206y.writeShortBE(buffer, 3338);
        list.add(buffer);
    }

    private static boolean bypassEncoderIfEmpty(C0185n nVar, List<Object> list) {
        if (nVar.isReadable()) {
            return false;
        }
        list.add(nVar.retain());
        return true;
    }

    private void encodeByteBufAndTrailers(int i, Y y8, List<Object> list, C0185n nVar, L l8) {
        if (i != 1) {
            if (i == 2) {
                encodeChunkedHttpContent(y8, nVar, l8, list);
                return;
            } else if (i != 3) {
                throw new Error();
            }
        } else if (nVar.isReadable()) {
            list.add(nVar.retain());
            return;
        }
        list.add(D0.EMPTY_BUFFER);
    }

    private void encodeByteBufContent(Y y8, C0185n nVar, List<Object> list) {
        try {
            if (!bypassEncoderIfEmpty(nVar, list)) {
                encodeByteBufAndTrailers(this.state, y8, list, nVar, (L) null);
                nVar.release();
            }
        } finally {
            nVar.release();
        }
    }

    private void encodeByteBufHttpContent(int i, Y y8, C0185n nVar, C0185n nVar2, L l8, List<Object> list) {
        if (i != 1) {
            if (i == 2) {
                list.add(nVar);
                encodeChunkedHttpContent(y8, nVar2, l8, list);
                return;
            } else if (i != 3) {
                throw new Error();
            }
        } else if (encodeContentNonChunk(list, nVar, nVar2)) {
            return;
        }
        list.add(nVar);
    }

    private void encodeChunkedHttpContent(Y y8, C0185n nVar, L l8, List<Object> list) {
        int readableBytes = nVar.readableBytes();
        if (readableBytes > 0) {
            addEncodedLengthHex(y8, (long) readableBytes, list);
            list.add(nVar.retain());
            list.add(CRLF_BUF.duplicate());
        }
        if (l8 != null) {
            encodeTrailingHeaders(y8, l8, list);
        } else if (readableBytes == 0) {
            list.add(nVar.retain());
        }
    }

    private static boolean encodeContentNonChunk(List<Object> list, C0185n nVar, C0185n nVar2) {
        int readableBytes = nVar2.readableBytes();
        if (readableBytes <= 0) {
            return false;
        }
        if (nVar.writableBytes() >= readableBytes) {
            nVar.writeBytes(nVar2);
            list.add(nVar);
            return true;
        }
        list.add(nVar);
        list.add(nVar2.retain());
        return true;
    }

    private static int encodeEmptyLastHttpContent(int i, List<Object> list) {
        if (i != 1) {
            if (i == 2) {
                list.add(ZERO_CRLF_CRLF_BUF.duplicate());
                return 0;
            } else if (i != 3) {
                throw new Error();
            }
        }
        list.add(D0.EMPTY_BUFFER);
        return 0;
    }

    private void encodeFullHttpMessage(Y y8, Object obj, List<Object> list) {
        int i;
        C0404w wVar = (C0404w) obj;
        try {
            int i8 = this.state;
            if (i8 != 0) {
                throwUnexpectedMessageTypeEx(obj, i8);
            }
            N n4 = (N) obj;
            C0185n buffer = ((C0163c) y8.alloc()).buffer((int) this.headersEncodedSizeAccumulator);
            encodeInitialLine(buffer, n4);
            boolean z = true;
            if (isContentAlwaysEmpty(n4)) {
                i = 3;
            } else if (q0.isTransferEncodingChunked(n4)) {
                i = 2;
            } else {
                i = 1;
            }
            if (i != 3) {
                z = false;
            }
            sanitizeHeadersBeforeEncode(n4, z);
            encodeHeaders(n4.headers(), buffer);
            C0206y.writeShortBE(buffer, 3338);
            this.headersEncodedSizeAccumulator = (this.headersEncodedSizeAccumulator * 0.8f) + (((float) padSizeForAccumulation(buffer.readableBytes())) * 0.2f);
            encodeByteBufHttpContent(i, y8, buffer, wVar.content(), wVar.trailingHeaders(), list);
            wVar.release();
        } catch (Throwable th) {
            wVar.release();
            throw th;
        }
    }

    private void encodeHttpContent(Y y8, D d8, List<Object> list) {
        try {
            encodeByteBufAndTrailers(this.state, y8, list, d8.content(), (L) null);
        } finally {
            d8.release();
        }
    }

    private void encodeHttpMessageLastContent(Y y8, N n4, List<Object> list) {
        t0 t0Var = (t0) n4;
        try {
            int i = this.state;
            if (i != 0) {
                throwUnexpectedMessageTypeEx(n4, i);
            }
            Y y9 = y8;
            encodeByteBufHttpContent(this.state, y9, encodeInitHttpMessage(y8, n4), t0Var.content(), t0Var.trailingHeaders(), list);
            this.state = 0;
            t0Var.release();
        } catch (Throwable th) {
            t0Var.release();
            throw th;
        }
    }

    private void encodeHttpMessageNotLastContent(Y y8, N n4, List<Object> list) {
        D d8 = (D) n4;
        try {
            int i = this.state;
            if (i != 0) {
                throwUnexpectedMessageTypeEx(n4, i);
            }
            Y y9 = y8;
            encodeByteBufHttpContent(this.state, y9, encodeInitHttpMessage(y8, n4), d8.content(), (L) null, list);
            d8.release();
        } catch (Throwable th) {
            d8.release();
            throw th;
        }
    }

    private C0185n encodeInitHttpMessage(Y y8, N n4) {
        int i;
        C0185n buffer = ((C0163c) y8.alloc()).buffer((int) this.headersEncodedSizeAccumulator);
        encodeInitialLine(buffer, n4);
        boolean z = true;
        if (isContentAlwaysEmpty(n4)) {
            i = 3;
        } else if (q0.isTransferEncodingChunked(n4)) {
            i = 2;
        } else {
            i = 1;
        }
        this.state = i;
        if (i != 3) {
            z = false;
        }
        sanitizeHeadersBeforeEncode(n4, z);
        encodeHeaders(n4.headers(), buffer);
        C0206y.writeShortBE(buffer, 3338);
        this.headersEncodedSizeAccumulator = (this.headersEncodedSizeAccumulator * 0.8f) + (((float) padSizeForAccumulation(buffer.readableBytes())) * 0.2f);
        return buffer;
    }

    private void encodeJustHttpMessage(Y y8, N n4, List<Object> list) {
        try {
            int i = this.state;
            if (i != 0) {
                throwUnexpectedMessageTypeEx(n4, i);
            }
            list.add(encodeInitHttpMessage(y8, n4));
            I.release(n4);
        } catch (Throwable th) {
            I.release(n4);
            throw th;
        }
    }

    private void encodeLastHttpContent(Y y8, t0 t0Var, List<Object> list) {
        try {
            encodeByteBufAndTrailers(this.state, y8, list, t0Var.content(), t0Var.trailingHeaders());
            this.state = 0;
        } finally {
            t0Var.release();
        }
    }

    private void encodeNotHttpMessageContentTypes(Y y8, Object obj, List<Object> list) {
        if (this.state == 0) {
            try {
                if (!(obj instanceof C0185n) || !bypassEncoderIfEmpty((C0185n) obj, list)) {
                    throwUnexpectedMessageTypeEx(obj, 0);
                    I.release(obj);
                } else {
                    return;
                }
            } finally {
                I.release(obj);
            }
        }
        if (obj == t0.EMPTY_LAST_CONTENT) {
            this.state = encodeEmptyLastHttpContent(this.state, list);
        } else if (obj instanceof t0) {
            encodeLastHttpContent(y8, (t0) obj, list);
        } else if (obj instanceof D) {
            encodeHttpContent(y8, (D) obj, list);
        } else if (obj instanceof C0185n) {
            encodeByteBufContent(y8, (C0185n) obj, list);
        } else {
            try {
                throwUnexpectedMessageTypeEx(obj, this.state);
            } finally {
                I.release(obj);
            }
        }
    }

    private void encodeTrailingHeaders(Y y8, L l8, List<Object> list) {
        if (l8.isEmpty()) {
            list.add(ZERO_CRLF_CRLF_BUF.duplicate());
            return;
        }
        C0185n buffer = ((C0163c) y8.alloc()).buffer((int) this.trailersEncodedSizeAccumulator);
        C0206y.writeMediumBE(buffer, 3149066);
        encodeHeaders(l8, buffer);
        C0206y.writeShortBE(buffer, 3338);
        this.trailersEncodedSizeAccumulator = (this.trailersEncodedSizeAccumulator * 0.8f) + (((float) padSizeForAccumulation(buffer.readableBytes())) * 0.2f);
        list.add(buffer);
    }

    private static int padSizeForAccumulation(int i) {
        return (i << 2) / 3;
    }

    private static void throwUnexpectedMessageTypeEx(Object obj, int i) {
        throw new IllegalStateException("unexpected message type: " + n0.simpleClassName(obj) + ", state: " + i);
    }

    private static void writeOutList(Y y8, List<Object> list, C0274u0 u0Var) {
        int size = list.size();
        if (size == 1) {
            try {
                y8.write(list.get(0), u0Var);
            } finally {
                list.clear();
            }
        } else if (size > 1) {
            if (u0Var == y8.voidPromise()) {
                writeVoidPromise(y8, list);
            } else {
                writePromiseCombiner(y8, list, u0Var);
            }
        }
    }

    private static void writePromiseCombiner(Y y8, List<Object> list, C0274u0 u0Var) {
        O o2 = new O(y8.executor());
        for (int i = 0; i < list.size(); i++) {
            o2.add(y8.write(list.get(i)));
        }
        o2.finish(u0Var);
    }

    private static void writeVoidPromise(Y y8, List<Object> list) {
        C0274u0 voidPromise = y8.voidPromise();
        for (int i = 0; i < list.size(); i++) {
            y8.write(list.get(i), voidPromise);
        }
    }

    public boolean acceptOutboundMessage(Object obj) {
        if (obj == D0.EMPTY_BUFFER || obj == t0.EMPTY_LAST_CONTENT || (obj instanceof C0404w) || (obj instanceof N) || (obj instanceof t0) || (obj instanceof D) || (obj instanceof C0185n)) {
            return true;
        }
        return false;
    }

    public void encode(Y y8, Object obj, List<Object> list) {
        C0185n nVar = D0.EMPTY_BUFFER;
        if (obj == nVar) {
            list.add(nVar);
        } else if (obj instanceof C0404w) {
            encodeFullHttpMessage(y8, obj, list);
        } else if (obj instanceof N) {
            try {
                N n4 = (N) obj;
                if (n4 instanceof t0) {
                    encodeHttpMessageLastContent(y8, n4, list);
                } else if (n4 instanceof D) {
                    encodeHttpMessageNotLastContent(y8, n4, list);
                } else {
                    encodeJustHttpMessage(y8, n4, list);
                }
            } catch (Exception e) {
                I.release(obj);
                throw e;
            }
        } else {
            encodeNotHttpMessageContentTypes(y8, obj, list);
        }
    }

    public void encodeHeaders(L l8, C0185n nVar) {
        Iterator<Map.Entry<CharSequence, CharSequence>> iteratorCharSequence = l8.iteratorCharSequence();
        while (iteratorCharSequence.hasNext()) {
            Map.Entry next = iteratorCharSequence.next();
            M.encoderHeader((CharSequence) next.getKey(), (CharSequence) next.getValue(), nVar);
        }
    }

    public abstract void encodeInitialLine(C0185n nVar, N n4);

    public boolean isContentAlwaysEmpty(N n4) {
        return false;
    }

    public void sanitizeHeadersBeforeEncode(N n4, boolean z) {
    }

    public void write(Y y8, Object obj, C0274u0 u0Var) {
        try {
            if (acceptOutboundMessage(obj)) {
                encode(y8, obj, this.out);
                if (this.out.isEmpty()) {
                    throw new B(n0.simpleClassName((Object) this) + " must produce at least one message.");
                }
            } else {
                y8.write(obj, u0Var);
            }
            writeOutList(y8, this.out, u0Var);
        } catch (B e) {
            throw e;
        } catch (Throwable th) {
            writeOutList(y8, this.out, u0Var);
            throw th;
        }
    }
}
