package a6;

import N.e;
import Q0.g;
import S5.C0185n;
import S5.D0;
import T5.U;
import T5.Y;
import X5.C0353d;
import X5.P;
import g6.B;
import h6.C1082c;
import h6.d;
import java.nio.ByteOrder;

/* renamed from: a6.o  reason: case insensitive filesystem */
public class C0447o extends C0353d implements H {
    private static final C1082c logger = d.getInstance((Class<?>) C0447o.class);
    private final C0432F config;
    private int fragmentedFramesCount;
    private boolean frameFinalFlag;
    private boolean frameMasked;
    private int frameOpcode;
    private int framePayloadLen1;
    private long framePayloadLength;
    private int frameRsv;
    private int mask;
    private boolean receivedClosingHandshake;
    private C0446n state;

    public C0447o(boolean z, boolean z6, int i, boolean z8) {
        this(C0432F.newBuilder().expectMaskedFrames(z).allowExtensions(z6).maxFramePayloadLength(i).allowMaskMismatch(z8).build());
    }

    private void protocolViolation(Y y8, C0185n nVar, String str) {
        protocolViolation(y8, nVar, C0429C.PROTOCOL_ERROR, str);
    }

    private static int toFrameLength(long j7) {
        if (j7 <= 2147483647L) {
            return (int) j7;
        }
        throw new P(e.w("Length:", j7));
    }

    private void unmask(C0185n nVar) {
        int readerIndex = nVar.readerIndex();
        int writerIndex = nVar.writerIndex();
        ByteOrder order = nVar.order();
        int i = this.mask;
        long j7 = ((long) i) & 4294967295L;
        long j8 = j7 | (j7 << 32);
        int i8 = writerIndex - 7;
        while (readerIndex < i8) {
            nVar.setLong(readerIndex, nVar.getLong(readerIndex) ^ j8);
            readerIndex += 8;
        }
        if (readerIndex < writerIndex - 3) {
            nVar.setInt(readerIndex, nVar.getInt(readerIndex) ^ ((int) j8));
            readerIndex += 4;
        }
        if (order == ByteOrder.LITTLE_ENDIAN) {
            i = Integer.reverseBytes(i);
        }
        int i9 = 0;
        while (readerIndex < writerIndex) {
            nVar.setByte(readerIndex, N.byteAtIndex(i, i9 & 3) ^ nVar.getByte(readerIndex));
            readerIndex++;
            i9++;
        }
    }

    public void checkCloseFrameBody(Y y8, C0185n nVar) {
        if (nVar != null && nVar.isReadable()) {
            if (nVar.readableBytes() < 2) {
                protocolViolation(y8, nVar, C0429C.INVALID_PAYLOAD_DATA, "Invalid close frame body");
            }
            short s8 = nVar.getShort(nVar.readerIndex());
            if (!C0429C.isValidStatusCode(s8)) {
                protocolViolation(y8, nVar, g.m(s8, "Invalid close frame getStatus code: "));
            }
            if (nVar.readableBytes() > 2) {
                try {
                    new C0440h().check(nVar, nVar.readerIndex() + 2, nVar.readableBytes() - 2);
                } catch (C0436d e) {
                    protocolViolation(y8, nVar, e);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01ac, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01ad, code lost:
        r5 = logger;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01b3, code lost:
        if (r5.isTraceEnabled() == false) goto L_0x01c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01b5, code lost:
        r5.trace("Decoding WebSocket Frame length={}", (java.lang.Object) java.lang.Long.valueOf(r1.framePayloadLength));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01c0, code lost:
        r1.state = a6.C0446n.MASKING_KEY;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01c6, code lost:
        if (r1.frameMasked == false) goto L_0x01d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01cd, code lost:
        if (r20.readableBytes() >= 4) goto L_0x01d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01cf, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01d0, code lost:
        r1.mask = r20.readInt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01d6, code lost:
        r1.state = a6.C0446n.PAYLOAD;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01da, code lost:
        r10 = r1.framePayloadLength;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01e3, code lost:
        if (((long) r20.readableBytes()) >= r10) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01e5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01e6, code lost:
        r5 = S5.D0.EMPTY_BUFFER;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01ea, code lost:
        if (r10 <= 0) goto L_0x01fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:?, code lost:
        r5 = S5.C0206y.readBytes(r19.alloc(), r2, toFrameLength(r1.framePayloadLength));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01fb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01fe, code lost:
        r1.state = a6.C0446n.READING_FIRST;
        r2 = r1.frameMasked;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0208, code lost:
        if (r1.framePayloadLength <= 0) goto L_0x020c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x020a, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x020c, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x020e, code lost:
        if ((r2 & r8) == false) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0210, code lost:
        unmask(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0213, code lost:
        r2 = r1.frameOpcode;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0215, code lost:
        if (r2 != 9) goto L_0x0224;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0217, code lost:
        r3.add(new a6.C0437e(r1.frameFinalFlag, r1.frameRsv, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0223, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0224, code lost:
        if (r2 != 10) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0226, code lost:
        r3.add(new a6.C0438f(r1.frameFinalFlag, r1.frameRsv, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0232, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0235, code lost:
        if (r2 != 8) goto L_0x0249;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0237, code lost:
        r1.receivedClosingHandshake = true;
        checkCloseFrameBody(r0, r5);
        r3.add(new a6.C0434b(r1.frameFinalFlag, r1.frameRsv, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0248, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0249, code lost:
        r0 = r1.frameFinalFlag;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x024b, code lost:
        if (r0 == false) goto L_0x0251;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x024d, code lost:
        r1.fragmentedFramesCount = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0251, code lost:
        r1.fragmentedFramesCount++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0256, code lost:
        if (r2 != 1) goto L_0x0263;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0258, code lost:
        r3.add(new a6.C0439g(r0, r1.frameRsv, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0262, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0264, code lost:
        if (r2 != 2) goto L_0x0271;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0266, code lost:
        r3.add(new a6.C0433a(r0, r1.frameRsv, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0270, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0271, code lost:
        if (r2 != 0) goto L_0x027e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0273, code lost:
        r3.add(new a6.C0435c(r0, r1.frameRsv, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x027d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0291, code lost:
        throw new java.lang.UnsupportedOperationException("Cannot decode web socket frame with opcode: " + r1.frameOpcode);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0292, code lost:
        if (r5 != null) goto L_0x0294;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0294, code lost:
        r5.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0297, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007c, code lost:
        if (r20.isReadable() != false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007f, code lost:
        r5 = r20.readByte();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0085, code lost:
        if ((r5 & 128) == 0) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0087, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0089, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008a, code lost:
        r1.frameMasked = r9;
        r1.framePayloadLen1 = r5 & Byte.MAX_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0091, code lost:
        if (r1.frameRsv == 0) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0099, code lost:
        if (r1.config.allowExtensions() != false) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009b, code lost:
        protocolViolation(r0, r2, "RSV != 0 and no extension negotiated, RSV:" + r1.frameRsv);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ae, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b5, code lost:
        if (r1.config.allowMaskMismatch() != false) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bf, code lost:
        if (r1.config.expectMaskedFrames() == r1.frameMasked) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c1, code lost:
        protocolViolation(r0, r2, "received a frame that is not masked as expected");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c7, code lost:
        r5 = r1.frameOpcode;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ca, code lost:
        if (r5 <= 7) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ce, code lost:
        if (r1.frameFinalFlag != false) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d0, code lost:
        protocolViolation(r0, r2, "fragmented control frame");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d6, code lost:
        r9 = r1.framePayloadLen1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00da, code lost:
        if (r9 <= 125) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00dc, code lost:
        protocolViolation(r0, r2, "control frame with payload length > 125 octets");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e2, code lost:
        if (r5 == 8) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e4, code lost:
        if (r5 == 9) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e6, code lost:
        if (r5 == 10) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e8, code lost:
        protocolViolation(r0, r2, "control frame using reserved opcode " + r1.frameOpcode);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00fb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fc, code lost:
        if (r5 != 8) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00fe, code lost:
        if (r9 != 1) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0100, code lost:
        protocolViolation(r0, r2, "received close control frame with payload len 1");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0105, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0106, code lost:
        if (r5 == 0) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0108, code lost:
        if (r5 == 1) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x010a, code lost:
        if (r5 == 2) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x010c, code lost:
        protocolViolation(r0, r2, "data frame using reserved opcode " + r1.frameOpcode);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x011f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0120, code lost:
        r9 = r1.fragmentedFramesCount;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0122, code lost:
        if (r9 != 0) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0124, code lost:
        if (r5 != 0) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0126, code lost:
        protocolViolation(r0, r2, "received continuation data frame outside fragmented message");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x012b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x012c, code lost:
        if (r9 == 0) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x012e, code lost:
        if (r5 == 0) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0130, code lost:
        protocolViolation(r0, r2, "received non-continuation data frame while inside fragmented message");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0135, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0136, code lost:
        r1.state = a6.C0446n.READING_SIZE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x013a, code lost:
        r5 = r1.framePayloadLen1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0140, code lost:
        if (r5 != 126) goto L_0x015a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0146, code lost:
        if (r20.readableBytes() >= 2) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0148, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0149, code lost:
        r8 = (long) r20.readUnsignedShort();
        r1.framePayloadLength = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0154, code lost:
        if (r8 >= 126) goto L_0x0181;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0156, code lost:
        protocolViolation(r0, r2, "invalid data frame length (not using minimal length encoding)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0159, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x015a, code lost:
        if (r5 != 127) goto L_0x017e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0160, code lost:
        if (r20.readableBytes() >= 8) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0162, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0163, code lost:
        r8 = r20.readLong();
        r1.framePayloadLength = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x016b, code lost:
        if (r8 >= 0) goto L_0x0173;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x016d, code lost:
        protocolViolation(r0, r2, "invalid data frame length (negative length)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0172, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0178, code lost:
        if (r8 >= 65536) goto L_0x0181;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x017a, code lost:
        protocolViolation(r0, r2, "invalid data frame length (not using minimal length encoding)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x017d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x017e, code lost:
        r1.framePayloadLength = (long) r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x018c, code lost:
        if (r1.framePayloadLength <= ((long) r1.config.maxFramePayloadLength())) goto L_0x01ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x018e, code lost:
        protocolViolation(r0, r2, a6.C0429C.MESSAGE_TOO_BIG, "Max frame length of " + r1.config.maxFramePayloadLength() + " has been exceeded.");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void decode(T5.Y r19, S5.C0185n r20, java.util.List<java.lang.Object> r21) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r2 = r20
            r3 = r21
            java.lang.String r4 = "Cannot decode web socket frame with opcode: "
            boolean r5 = r1.receivedClosingHandshake
            if (r5 == 0) goto L_0x0016
            int r0 = r18.actualReadableBytes()
            r2.skipBytes(r0)
            return
        L_0x0016:
            int[] r5 = a6.C0445m.$SwitchMap$io$netty$handler$codec$http$websocketx$WebSocket08FrameDecoder$State
            a6.n r6 = r1.state
            int r6 = r6.ordinal()
            r5 = r5[r6]
            r6 = 10
            r7 = 9
            r8 = 127(0x7f, float:1.78E-43)
            r9 = 4
            r10 = 2
            r11 = 8
            r13 = 0
            r15 = 1
            switch(r5) {
                case 1: goto L_0x0042;
                case 2: goto L_0x0078;
                case 3: goto L_0x013a;
                case 4: goto L_0x01c4;
                case 5: goto L_0x01da;
                case 6: goto L_0x0038;
                default: goto L_0x0030;
            }
        L_0x0030:
            java.lang.Error r0 = new java.lang.Error
            java.lang.String r2 = "Shouldn't reach here."
            r0.<init>(r2)
            throw r0
        L_0x0038:
            boolean r0 = r20.isReadable()
            if (r0 == 0) goto L_0x0041
            r20.readByte()
        L_0x0041:
            return
        L_0x0042:
            boolean r5 = r20.isReadable()
            if (r5 != 0) goto L_0x0049
            return
        L_0x0049:
            r1.framePayloadLength = r13
            byte r5 = r20.readByte()
            r12 = r5 & 128(0x80, float:1.794E-43)
            if (r12 == 0) goto L_0x0055
            r12 = 1
            goto L_0x0056
        L_0x0055:
            r12 = 0
        L_0x0056:
            r1.frameFinalFlag = r12
            r12 = r5 & 112(0x70, float:1.57E-43)
            int r12 = r12 >> r9
            r1.frameRsv = r12
            r5 = r5 & 15
            r1.frameOpcode = r5
            h6.c r5 = logger
            boolean r12 = r5.isTraceEnabled()
            if (r12 == 0) goto L_0x0074
            int r12 = r1.frameOpcode
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.String r9 = "Decoding WebSocket Frame opCode={}"
            r5.trace((java.lang.String) r9, (java.lang.Object) r12)
        L_0x0074:
            a6.n r5 = a6.C0446n.READING_SECOND
            r1.state = r5
        L_0x0078:
            boolean r5 = r20.isReadable()
            if (r5 != 0) goto L_0x007f
            return
        L_0x007f:
            byte r5 = r20.readByte()
            r9 = r5 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0089
            r9 = 1
            goto L_0x008a
        L_0x0089:
            r9 = 0
        L_0x008a:
            r1.frameMasked = r9
            r5 = r5 & r8
            r1.framePayloadLen1 = r5
            int r5 = r1.frameRsv
            if (r5 == 0) goto L_0x00af
            a6.F r5 = r1.config
            boolean r5 = r5.allowExtensions()
            if (r5 != 0) goto L_0x00af
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "RSV != 0 and no extension negotiated, RSV:"
            r3.<init>(r4)
            int r4 = r1.frameRsv
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.protocolViolation((T5.Y) r0, (S5.C0185n) r2, (java.lang.String) r3)
            return
        L_0x00af:
            a6.F r5 = r1.config
            boolean r5 = r5.allowMaskMismatch()
            if (r5 != 0) goto L_0x00c7
            a6.F r5 = r1.config
            boolean r5 = r5.expectMaskedFrames()
            boolean r9 = r1.frameMasked
            if (r5 == r9) goto L_0x00c7
            java.lang.String r3 = "received a frame that is not masked as expected"
            r1.protocolViolation((T5.Y) r0, (S5.C0185n) r2, (java.lang.String) r3)
            return
        L_0x00c7:
            int r5 = r1.frameOpcode
            r9 = 7
            if (r5 <= r9) goto L_0x0106
            boolean r9 = r1.frameFinalFlag
            if (r9 != 0) goto L_0x00d6
            java.lang.String r3 = "fragmented control frame"
            r1.protocolViolation((T5.Y) r0, (S5.C0185n) r2, (java.lang.String) r3)
            return
        L_0x00d6:
            int r9 = r1.framePayloadLen1
            r12 = 125(0x7d, float:1.75E-43)
            if (r9 <= r12) goto L_0x00e2
            java.lang.String r3 = "control frame with payload length > 125 octets"
            r1.protocolViolation((T5.Y) r0, (S5.C0185n) r2, (java.lang.String) r3)
            return
        L_0x00e2:
            if (r5 == r11) goto L_0x00fc
            if (r5 == r7) goto L_0x00fc
            if (r5 == r6) goto L_0x00fc
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "control frame using reserved opcode "
            r3.<init>(r4)
            int r4 = r1.frameOpcode
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.protocolViolation((T5.Y) r0, (S5.C0185n) r2, (java.lang.String) r3)
            return
        L_0x00fc:
            if (r5 != r11) goto L_0x0136
            if (r9 != r15) goto L_0x0136
            java.lang.String r3 = "received close control frame with payload len 1"
            r1.protocolViolation((T5.Y) r0, (S5.C0185n) r2, (java.lang.String) r3)
            return
        L_0x0106:
            if (r5 == 0) goto L_0x0120
            if (r5 == r15) goto L_0x0120
            if (r5 == r10) goto L_0x0120
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "data frame using reserved opcode "
            r3.<init>(r4)
            int r4 = r1.frameOpcode
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.protocolViolation((T5.Y) r0, (S5.C0185n) r2, (java.lang.String) r3)
            return
        L_0x0120:
            int r9 = r1.fragmentedFramesCount
            if (r9 != 0) goto L_0x012c
            if (r5 != 0) goto L_0x012c
            java.lang.String r3 = "received continuation data frame outside fragmented message"
            r1.protocolViolation((T5.Y) r0, (S5.C0185n) r2, (java.lang.String) r3)
            return
        L_0x012c:
            if (r9 == 0) goto L_0x0136
            if (r5 == 0) goto L_0x0136
            java.lang.String r3 = "received non-continuation data frame while inside fragmented message"
            r1.protocolViolation((T5.Y) r0, (S5.C0185n) r2, (java.lang.String) r3)
            return
        L_0x0136:
            a6.n r5 = a6.C0446n.READING_SIZE
            r1.state = r5
        L_0x013a:
            int r5 = r1.framePayloadLen1
            r9 = 126(0x7e, float:1.77E-43)
            java.lang.String r12 = "invalid data frame length (not using minimal length encoding)"
            if (r5 != r9) goto L_0x015a
            int r5 = r20.readableBytes()
            if (r5 >= r10) goto L_0x0149
            return
        L_0x0149:
            int r5 = r20.readUnsignedShort()
            long r8 = (long) r5
            r1.framePayloadLength = r8
            r16 = 126(0x7e, double:6.23E-322)
            int r5 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r5 >= 0) goto L_0x0181
            r1.protocolViolation((T5.Y) r0, (S5.C0185n) r2, (java.lang.String) r12)
            return
        L_0x015a:
            if (r5 != r8) goto L_0x017e
            int r5 = r20.readableBytes()
            if (r5 >= r11) goto L_0x0163
            return
        L_0x0163:
            long r8 = r20.readLong()
            r1.framePayloadLength = r8
            int r5 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r5 >= 0) goto L_0x0173
            java.lang.String r3 = "invalid data frame length (negative length)"
            r1.protocolViolation((T5.Y) r0, (S5.C0185n) r2, (java.lang.String) r3)
            return
        L_0x0173:
            r16 = 65536(0x10000, double:3.2379E-319)
            int r5 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r5 >= 0) goto L_0x0181
            r1.protocolViolation((T5.Y) r0, (S5.C0185n) r2, (java.lang.String) r12)
            return
        L_0x017e:
            long r8 = (long) r5
            r1.framePayloadLength = r8
        L_0x0181:
            long r8 = r1.framePayloadLength
            a6.F r5 = r1.config
            int r5 = r5.maxFramePayloadLength()
            long r10 = (long) r5
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 <= 0) goto L_0x01ad
            a6.C r3 = a6.C0429C.MESSAGE_TOO_BIG
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Max frame length of "
            r4.<init>(r5)
            a6.F r5 = r1.config
            int r5 = r5.maxFramePayloadLength()
            r4.append(r5)
            java.lang.String r5 = " has been exceeded."
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r1.protocolViolation(r0, r2, r3, r4)
            return
        L_0x01ad:
            h6.c r5 = logger
            boolean r8 = r5.isTraceEnabled()
            if (r8 == 0) goto L_0x01c0
            long r8 = r1.framePayloadLength
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            java.lang.String r9 = "Decoding WebSocket Frame length={}"
            r5.trace((java.lang.String) r9, (java.lang.Object) r8)
        L_0x01c0:
            a6.n r5 = a6.C0446n.MASKING_KEY
            r1.state = r5
        L_0x01c4:
            boolean r5 = r1.frameMasked
            if (r5 == 0) goto L_0x01d6
            int r5 = r20.readableBytes()
            r8 = 4
            if (r5 >= r8) goto L_0x01d0
            return
        L_0x01d0:
            int r5 = r20.readInt()
            r1.mask = r5
        L_0x01d6:
            a6.n r5 = a6.C0446n.PAYLOAD
            r1.state = r5
        L_0x01da:
            int r5 = r20.readableBytes()
            long r8 = (long) r5
            long r10 = r1.framePayloadLength
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 >= 0) goto L_0x01e6
            return
        L_0x01e6:
            S5.n r5 = S5.D0.EMPTY_BUFFER
            int r8 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r8 <= 0) goto L_0x01fe
            S5.o r8 = r19.alloc()     // Catch:{ all -> 0x01fb }
            long r9 = r1.framePayloadLength     // Catch:{ all -> 0x01fb }
            int r9 = toFrameLength(r9)     // Catch:{ all -> 0x01fb }
            S5.n r5 = S5.C0206y.readBytes(r8, r2, r9)     // Catch:{ all -> 0x01fb }
            goto L_0x01fe
        L_0x01fb:
            r0 = move-exception
            goto L_0x0292
        L_0x01fe:
            a6.n r2 = a6.C0446n.READING_FIRST     // Catch:{ all -> 0x01fb }
            r1.state = r2     // Catch:{ all -> 0x01fb }
            boolean r2 = r1.frameMasked     // Catch:{ all -> 0x01fb }
            long r8 = r1.framePayloadLength     // Catch:{ all -> 0x01fb }
            int r10 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r10 <= 0) goto L_0x020c
            r8 = 1
            goto L_0x020d
        L_0x020c:
            r8 = 0
        L_0x020d:
            r2 = r2 & r8
            if (r2 == 0) goto L_0x0213
            r1.unmask(r5)     // Catch:{ all -> 0x01fb }
        L_0x0213:
            int r2 = r1.frameOpcode     // Catch:{ all -> 0x01fb }
            if (r2 != r7) goto L_0x0224
            a6.e r0 = new a6.e     // Catch:{ all -> 0x01fb }
            boolean r2 = r1.frameFinalFlag     // Catch:{ all -> 0x01fb }
            int r4 = r1.frameRsv     // Catch:{ all -> 0x01fb }
            r0.<init>(r2, r4, r5)     // Catch:{ all -> 0x01fb }
            r3.add(r0)     // Catch:{ all -> 0x01fb }
            return
        L_0x0224:
            if (r2 != r6) goto L_0x0233
            a6.f r0 = new a6.f     // Catch:{ all -> 0x01fb }
            boolean r2 = r1.frameFinalFlag     // Catch:{ all -> 0x01fb }
            int r4 = r1.frameRsv     // Catch:{ all -> 0x01fb }
            r0.<init>(r2, r4, r5)     // Catch:{ all -> 0x01fb }
            r3.add(r0)     // Catch:{ all -> 0x01fb }
            return
        L_0x0233:
            r6 = 8
            if (r2 != r6) goto L_0x0249
            r1.receivedClosingHandshake = r15     // Catch:{ all -> 0x01fb }
            r1.checkCloseFrameBody(r0, r5)     // Catch:{ all -> 0x01fb }
            a6.b r0 = new a6.b     // Catch:{ all -> 0x01fb }
            boolean r2 = r1.frameFinalFlag     // Catch:{ all -> 0x01fb }
            int r4 = r1.frameRsv     // Catch:{ all -> 0x01fb }
            r0.<init>(r2, r4, r5)     // Catch:{ all -> 0x01fb }
            r3.add(r0)     // Catch:{ all -> 0x01fb }
            return
        L_0x0249:
            boolean r0 = r1.frameFinalFlag     // Catch:{ all -> 0x01fb }
            if (r0 == 0) goto L_0x0251
            r6 = 0
            r1.fragmentedFramesCount = r6     // Catch:{ all -> 0x01fb }
            goto L_0x0256
        L_0x0251:
            int r6 = r1.fragmentedFramesCount     // Catch:{ all -> 0x01fb }
            int r6 = r6 + r15
            r1.fragmentedFramesCount = r6     // Catch:{ all -> 0x01fb }
        L_0x0256:
            if (r2 != r15) goto L_0x0263
            a6.g r2 = new a6.g     // Catch:{ all -> 0x01fb }
            int r4 = r1.frameRsv     // Catch:{ all -> 0x01fb }
            r2.<init>(r0, r4, r5)     // Catch:{ all -> 0x01fb }
            r3.add(r2)     // Catch:{ all -> 0x01fb }
            return
        L_0x0263:
            r6 = 2
            if (r2 != r6) goto L_0x0271
            a6.a r2 = new a6.a     // Catch:{ all -> 0x01fb }
            int r4 = r1.frameRsv     // Catch:{ all -> 0x01fb }
            r2.<init>(r0, r4, r5)     // Catch:{ all -> 0x01fb }
            r3.add(r2)     // Catch:{ all -> 0x01fb }
            return
        L_0x0271:
            if (r2 != 0) goto L_0x027e
            a6.c r2 = new a6.c     // Catch:{ all -> 0x01fb }
            int r4 = r1.frameRsv     // Catch:{ all -> 0x01fb }
            r2.<init>(r0, r4, r5)     // Catch:{ all -> 0x01fb }
            r3.add(r2)     // Catch:{ all -> 0x01fb }
            return
        L_0x027e:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch:{ all -> 0x01fb }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fb }
            r2.<init>(r4)     // Catch:{ all -> 0x01fb }
            int r3 = r1.frameOpcode     // Catch:{ all -> 0x01fb }
            r2.append(r3)     // Catch:{ all -> 0x01fb }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01fb }
            r0.<init>(r2)     // Catch:{ all -> 0x01fb }
            throw r0     // Catch:{ all -> 0x01fb }
        L_0x0292:
            if (r5 == 0) goto L_0x0297
            r5.release()
        L_0x0297:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.C0447o.decode(T5.Y, S5.n, java.util.List):void");
    }

    private void protocolViolation(Y y8, C0185n nVar, C0429C c8, String str) {
        protocolViolation(y8, nVar, new C0436d(c8, str));
    }

    private void protocolViolation(Y y8, C0185n nVar, C0436d dVar) {
        Object obj;
        this.state = C0446n.CORRUPT;
        int readableBytes = nVar.readableBytes();
        if (readableBytes > 0) {
            nVar.skipBytes(readableBytes);
        }
        if (y8.channel().isActive() && this.config.closeOnProtocolViolation()) {
            if (!this.receivedClosingHandshake) {
                C0429C closeStatus = dVar.closeStatus();
                String message = dVar.getMessage();
                if (message == null) {
                    message = closeStatus.reasonText();
                }
                obj = new C0434b(closeStatus, message);
            } else {
                obj = D0.EMPTY_BUFFER;
            }
            y8.writeAndFlush(obj).addListener(U.CLOSE);
        }
        throw dVar;
    }

    public C0447o(C0432F f8) {
        this.state = C0446n.READING_FIRST;
        this.config = (C0432F) B.checkNotNull(f8, "decoderConfig");
    }
}
