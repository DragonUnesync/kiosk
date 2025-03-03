package Z5;

import Q0.g;
import S5.C0185n;
import S5.D0;
import T5.Y;
import X5.C0353d;
import X5.C0365p;
import X5.M;
import e6.C0847f;
import e6.C0851j;
import g6.B;
import g6.n0;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class g0 extends C0353d {
    /* access modifiers changed from: private */
    public static final boolean[] ISO_CONTROL_OR_WHITESPACE = new boolean[256];
    private static final boolean[] LATIN_WHITESPACE = new boolean[256];
    /* access modifiers changed from: private */
    public static final C0851j SKIP_CONTROL_CHARS_BYTES = new b0();
    private static final boolean[] SP_LENIENT_BYTES;
    private final boolean allowDuplicateContentLengths;
    private final boolean allowPartialChunks;
    private long chunkSize;
    private final boolean chunkedSupported;
    private long contentLength;
    /* access modifiers changed from: private */
    public f0 currentState;
    private final d0 headerParser;
    private final e0 lineParser;
    private final int maxChunkSize;
    private N message;
    private C0847f name;
    private final C0185n parserScratchBuffer;
    private final AtomicBoolean resetRequested;
    private t0 trailer;
    protected final boolean validateHeaders;
    private String value;

    static {
        boolean z;
        boolean[] zArr = new boolean[256];
        SP_LENIENT_BYTES = zArr;
        zArr[160] = true;
        zArr[137] = true;
        zArr[139] = true;
        zArr[140] = true;
        zArr[141] = true;
        for (byte b8 = Byte.MIN_VALUE; b8 < Byte.MAX_VALUE; b8 = (byte) (b8 + 1)) {
            LATIN_WHITESPACE[b8 + 128] = Character.isWhitespace(b8);
        }
        for (byte b9 = Byte.MIN_VALUE; b9 < Byte.MAX_VALUE; b9 = (byte) (b9 + 1)) {
            boolean[] zArr2 = ISO_CONTROL_OR_WHITESPACE;
            int i = b9 + 128;
            if (Character.isISOControl(b9) || isWhitespace(b9)) {
                z = true;
            } else {
                z = false;
            }
            zArr2[i] = z;
        }
    }

    public g0(int i, int i8, int i9, boolean z, boolean z6) {
        this(i, i8, i9, z, z6, 128);
    }

    private long contentLength() {
        if (this.contentLength == Long.MIN_VALUE) {
            this.contentLength = q0.getContentLength(this.message, -1);
        }
        return this.contentLength;
    }

    private static int findEndOfString(byte[] bArr, int i, int i8) {
        for (int i9 = i8 - 1; i9 > i; i9--) {
            if (!isWhitespace(bArr[i9])) {
                return i9 + 1;
            }
        }
        return 0;
    }

    private static int findNonSPLenient(byte[] bArr, int i, int i8) {
        while (i < i8) {
            byte b8 = bArr[i];
            if (isSPLenient(b8)) {
                i++;
            } else if (!isWhitespace(b8)) {
                return i;
            } else {
                throw new IllegalArgumentException("Invalid separator");
            }
        }
        return i8;
    }

    private static int findNonWhitespace(byte[] bArr, int i, int i8) {
        while (i < i8) {
            byte b8 = bArr[i];
            if (!isWhitespace(b8)) {
                return i;
            }
            if (isOWS(b8)) {
                i++;
            } else {
                StringBuilder p3 = g.p(b8, "Invalid separator, only a single space or horizontal tab allowed, but received a '", "' (0x");
                p3.append(Integer.toHexString(b8));
                p3.append(")");
                throw new IllegalArgumentException(p3.toString());
            }
        }
        return i8;
    }

    private static int findSPLenient(byte[] bArr, int i, int i8) {
        while (i < i8) {
            if (isSPLenient(bArr[i])) {
                return i;
            }
            i++;
        }
        return i8;
    }

    private static int getChunkSize(byte[] bArr, int i, int i8) {
        int skipWhiteSpaces = skipWhiteSpaces(bArr, i, i8);
        if (skipWhiteSpaces != i8) {
            int i9 = i + skipWhiteSpaces;
            int i10 = i8 - skipWhiteSpaces;
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                int i13 = i9 + i11;
                int decodeHexNibble = n0.decodeHexNibble(bArr[i13]);
                if (decodeHexNibble == -1) {
                    byte b8 = bArr[i13];
                    if (b8 != 59 && !isControlOrWhitespaceAsciiChar(b8)) {
                        throw new NumberFormatException();
                    } else if (i11 != 0) {
                        return i12;
                    } else {
                        throw new NumberFormatException();
                    }
                } else {
                    i12 = (i12 * 16) + decodeHexNibble;
                    i11++;
                }
            }
            return i12;
        }
        throw new NumberFormatException();
    }

    private D invalidChunk(C0185n nVar, Exception exc) {
        this.currentState = f0.BAD_MESSAGE;
        nVar.skipBytes(nVar.readableBytes());
        C0401t tVar = new C0401t(D0.EMPTY_BUFFER);
        tVar.setDecoderResult(C0365p.failure(exc));
        this.message = null;
        this.trailer = null;
        return tVar;
    }

    private N invalidMessage(C0185n nVar, Exception exc) {
        this.currentState = f0.BAD_MESSAGE;
        nVar.skipBytes(nVar.readableBytes());
        if (this.message == null) {
            this.message = createInvalidMessage();
        }
        this.message.setDecoderResult(C0365p.failure(exc));
        N n4 = this.message;
        this.message = null;
        return n4;
    }

    private static boolean isControlOrWhitespaceAsciiChar(byte b8) {
        return ISO_CONTROL_OR_WHITESPACE[b8 + 128];
    }

    private static boolean isOWS(byte b8) {
        if (b8 == 32 || b8 == 9) {
            return true;
        }
        return false;
    }

    private static boolean isSPLenient(byte b8) {
        return SP_LENIENT_BYTES[b8 + 128];
    }

    private static boolean isWhitespace(byte b8) {
        return LATIN_WHITESPACE[b8 + 128];
    }

    private static String langAsciiString(byte[] bArr, int i, int i8) {
        if (i8 == 0) {
            return "";
        }
        if (i != 0) {
            return new String(bArr, 0, i, i8);
        }
        if (i8 == bArr.length) {
            return new String(bArr, 0, 0, bArr.length);
        }
        return new String(bArr, 0, 0, i8);
    }

    private f0 readHeaders(C0185n nVar) {
        boolean z;
        N n4 = this.message;
        L headers = n4.headers();
        d0 d0Var = this.headerParser;
        C0185n parse = d0Var.parse(nVar);
        if (parse == null) {
            return null;
        }
        int readableBytes = parse.readableBytes();
        while (readableBytes > 0) {
            byte[] array = parse.array();
            int readerIndex = parse.readerIndex() + parse.arrayOffset();
            byte b8 = array[readerIndex];
            C0847f fVar = this.name;
            if (fVar == null || !(b8 == 32 || b8 == 9)) {
                if (fVar != null) {
                    headers.add((CharSequence) fVar, (Object) this.value);
                }
                splitHeader(array, readerIndex, readableBytes);
            } else {
                String trim = langAsciiString(array, readerIndex, readableBytes).trim();
                String str = this.value;
                this.value = str + ' ' + trim;
            }
            parse = d0Var.parse(nVar);
            if (parse == null) {
                return null;
            }
            readableBytes = parse.readableBytes();
        }
        C0847f fVar2 = this.name;
        if (fVar2 != null) {
            headers.add((CharSequence) fVar2, (Object) this.value);
        }
        this.name = null;
        this.value = null;
        n4.setDecoderResult(new O(this.lineParser.size, d0Var.size));
        C0847f fVar3 = G.CONTENT_LENGTH;
        List<String> all = headers.getAll((CharSequence) fVar3);
        if (!all.isEmpty()) {
            r0 protocolVersion = n4.protocolVersion();
            if (protocolVersion.majorVersion() < 1 || (protocolVersion.majorVersion() == 1 && protocolVersion.minorVersion() == 0)) {
                z = true;
            } else {
                z = false;
            }
            long normalizeAndGetContentLength = q0.normalizeAndGetContentLength(all, z, this.allowDuplicateContentLengths);
            this.contentLength = normalizeAndGetContentLength;
            if (normalizeAndGetContentLength != -1) {
                String trim2 = all.get(0).trim();
                if (all.size() > 1 || !trim2.equals(Long.toString(this.contentLength))) {
                    headers.set((CharSequence) fVar3, (Object) Long.valueOf(this.contentLength));
                }
            }
        }
        if (isContentAlwaysEmpty(n4)) {
            q0.setTransferEncodingChunked(n4, false);
            return f0.SKIP_CONTROL_CHARS;
        } else if (q0.isTransferEncodingChunked(n4)) {
            if (!all.isEmpty() && n4.protocolVersion() == r0.HTTP_1_1) {
                handleTransferEncodingChunkedWithContentLength(n4);
            }
            return f0.READ_CHUNK_SIZE;
        } else if (contentLength() >= 0) {
            return f0.READ_FIXED_LENGTH_CONTENT;
        } else {
            return f0.READ_VARIABLE_LENGTH_CONTENT;
        }
    }

    private t0 readTrailingHeaders(C0185n nVar) {
        d0 d0Var = this.headerParser;
        C0185n parse = d0Var.parse(nVar);
        if (parse == null) {
            return null;
        }
        t0 t0Var = this.trailer;
        int readableBytes = parse.readableBytes();
        if (readableBytes == 0 && t0Var == null) {
            return t0.EMPTY_LAST_CONTENT;
        }
        if (t0Var == null) {
            t0Var = new C0401t(D0.EMPTY_BUFFER, this.validateHeaders);
            this.trailer = t0Var;
        }
        C0847f fVar = null;
        while (readableBytes > 0) {
            byte[] array = parse.array();
            int readerIndex = parse.readerIndex() + parse.arrayOffset();
            byte b8 = array[readerIndex];
            if (fVar == null || !(b8 == 32 || b8 == 9)) {
                splitHeader(array, readerIndex, readableBytes);
                C0847f fVar2 = this.name;
                if (!G.CONTENT_LENGTH.contentEqualsIgnoreCase(fVar2) && !G.TRANSFER_ENCODING.contentEqualsIgnoreCase(fVar2) && !G.TRAILER.contentEqualsIgnoreCase(fVar2)) {
                    t0Var.trailingHeaders().add((CharSequence) fVar2, (Object) this.value);
                }
                fVar = this.name;
                this.name = null;
                this.value = null;
            } else {
                List<String> all = t0Var.trailingHeaders().getAll((CharSequence) fVar);
                if (!all.isEmpty()) {
                    int size = all.size() - 1;
                    all.set(size, all.get(size) + langAsciiString(array, readerIndex, parse.readableBytes()).trim());
                }
            }
            parse = d0Var.parse(nVar);
            if (parse == null) {
                return null;
            }
            readableBytes = parse.readableBytes();
        }
        this.trailer = null;
        return t0Var;
    }

    private void resetNow() {
        k0 k0Var;
        N n4 = this.message;
        this.message = null;
        this.name = null;
        this.value = null;
        this.contentLength = Long.MIN_VALUE;
        this.lineParser.reset();
        this.headerParser.reset();
        this.trailer = null;
        if (isDecodingRequest() || (k0Var = (k0) n4) == null || !isSwitchingToNonHttp1Protocol(k0Var)) {
            this.resetRequested.lazySet(false);
            this.currentState = f0.SKIP_CONTROL_CHARS;
            return;
        }
        this.currentState = f0.UPGRADED;
    }

    private static int skipWhiteSpaces(byte[] bArr, int i, int i8) {
        for (int i9 = 0; i9 < i8; i9++) {
            if (!isWhitespace(bArr[i + i9])) {
                return i9;
            }
        }
        return i8;
    }

    private void splitHeader(byte[] bArr, int i, int i8) {
        int i9 = i8 + i;
        int findNonWhitespace = findNonWhitespace(bArr, i, i9);
        boolean isDecodingRequest = isDecodingRequest();
        int i10 = findNonWhitespace;
        while (i10 < i9 && (r4 = bArr[i10]) != 58 && (isDecodingRequest || !isOWS(r4))) {
            i10++;
        }
        if (i10 != i9) {
            int i11 = i10;
            while (true) {
                if (i11 >= i9) {
                    break;
                } else if (bArr[i11] == 58) {
                    i11++;
                    break;
                } else {
                    i11++;
                }
            }
            this.name = splitHeaderName(bArr, findNonWhitespace, i10 - findNonWhitespace);
            int findNonWhitespace2 = findNonWhitespace(bArr, i11, i9);
            if (findNonWhitespace2 == i9) {
                this.value = "";
            } else {
                this.value = langAsciiString(bArr, findNonWhitespace2, findEndOfString(bArr, i, i9) - findNonWhitespace2);
            }
        } else {
            throw new IllegalArgumentException("No colon found");
        }
    }

    private String[] splitInitialLine(C0185n nVar) {
        String str;
        byte[] array = nVar.array();
        int readerIndex = nVar.readerIndex() + nVar.arrayOffset();
        int readableBytes = nVar.readableBytes() + readerIndex;
        int findNonSPLenient = findNonSPLenient(array, readerIndex, readableBytes);
        int findSPLenient = findSPLenient(array, findNonSPLenient, readableBytes);
        int findNonSPLenient2 = findNonSPLenient(array, findSPLenient, readableBytes);
        int findSPLenient2 = findSPLenient(array, findNonSPLenient2, readableBytes);
        int findNonSPLenient3 = findNonSPLenient(array, findSPLenient2, readableBytes);
        int findEndOfString = findEndOfString(array, Math.max(findNonSPLenient3 - 1, readerIndex), readableBytes);
        String splitFirstWordInitialLine = splitFirstWordInitialLine(array, findNonSPLenient, findSPLenient - findNonSPLenient);
        String splitSecondWordInitialLine = splitSecondWordInitialLine(array, findNonSPLenient2, findSPLenient2 - findNonSPLenient2);
        if (findNonSPLenient3 < findEndOfString) {
            str = splitThirdWordInitialLine(array, findNonSPLenient3, findEndOfString - findNonSPLenient3);
        } else {
            str = "";
        }
        return new String[]{splitFirstWordInitialLine, splitSecondWordInitialLine, str};
    }

    public abstract N createInvalidMessage();

    public abstract N createMessage(String[] strArr);

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01b1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c9, code lost:
        r8 = java.lang.Math.min((int) r7.chunkSize, r7.maxChunkSize);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d4, code lost:
        if (r7.allowPartialChunks != false) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00da, code lost:
        if (r9.readableBytes() >= r8) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00dc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00dd, code lost:
        r8 = java.lang.Math.min(r8, r9.readableBytes());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e5, code lost:
        if (r8 != 0) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e8, code lost:
        r0 = new Z5.C0390h(r9.readRetainedSlice(r8));
        r7.chunkSize -= (long) r8;
        r10.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00fe, code lost:
        if (r7.chunkSize == 0) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0100, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0101, code lost:
        r7.currentState = Z5.f0.READ_CHUNK_DELIMITER;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0105, code lost:
        r8 = r9.writerIndex();
        r10 = r9.readerIndex();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x010d, code lost:
        if (r8 <= r10) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x010f, code lost:
        r0 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0117, code lost:
        if (r9.getByte(r10) != 10) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0119, code lost:
        r7.currentState = Z5.f0.READ_CHUNK_SIZE;
        r10 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x011f, code lost:
        r10 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0121, code lost:
        r9.readerIndex(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0124, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        r0 = readHeaders(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0148, code lost:
        if (r0 != null) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x014a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x014b, code lost:
        r7.currentState = r0;
        r8 = r8[r0.ordinal()];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0154, code lost:
        if (r8 == 1) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0157, code lost:
        if (r8 == 2) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0159, code lost:
        r3 = contentLength();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x015f, code lost:
        if (r3 == 0) goto L_0x017c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0165, code lost:
        if (r3 != -1) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x016b, code lost:
        if (isDecodingRequest() == false) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x016e, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0170, code lost:
        r10.add(r7.message);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0177, code lost:
        if (r0 != Z5.f0.READ_FIXED_LENGTH_CONTENT) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0179, code lost:
        r7.chunkSize = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x017c, code lost:
        r10.add(r7.message);
        r10.add(Z5.t0.EMPTY_LAST_CONTENT);
        resetNow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0189, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x018c, code lost:
        if (r7.chunkedSupported == false) goto L_0x0194;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x018e, code lost:
        r10.add(r7.message);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0193, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x019b, code lost:
        throw new java.lang.IllegalArgumentException("Chunked messages not supported");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x019c, code lost:
        r10.add(r7.message);
        r10.add(Z5.t0.EMPTY_LAST_CONTENT);
        resetNow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01a9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01aa, code lost:
        r10.add(invalidMessage(r9, r8));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void decode(T5.Y r8, S5.C0185n r9, java.util.List<java.lang.Object> r10) {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicBoolean r8 = r7.resetRequested
            boolean r8 = r8.get()
            if (r8 == 0) goto L_0x000b
            r7.resetNow()
        L_0x000b:
            int[] r8 = Z5.c0.$SwitchMap$io$netty$handler$codec$http$HttpObjectDecoder$State
            Z5.f0 r0 = r7.currentState
            int r0 = r0.ordinal()
            r0 = r8[r0]
            r1 = 0
            switch(r0) {
                case 1: goto L_0x012d;
                case 2: goto L_0x009b;
                case 3: goto L_0x012d;
                case 4: goto L_0x0144;
                case 5: goto L_0x0082;
                case 6: goto L_0x0048;
                case 7: goto L_0x00c9;
                case 8: goto L_0x0105;
                case 9: goto L_0x0031;
                case 10: goto L_0x0029;
                case 11: goto L_0x001b;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x0030
        L_0x001b:
            int r8 = r9.readableBytes()
            if (r8 <= 0) goto L_0x0030
            S5.n r8 = r9.readBytes((int) r8)
            r10.add(r8)
            goto L_0x0030
        L_0x0029:
            int r8 = r9.readableBytes()
            r9.skipBytes(r8)
        L_0x0030:
            return
        L_0x0031:
            Z5.t0 r8 = r7.readTrailingHeaders(r9)     // Catch:{ Exception -> 0x003f }
            if (r8 != 0) goto L_0x0038
            return
        L_0x0038:
            r10.add(r8)     // Catch:{ Exception -> 0x003f }
            r7.resetNow()     // Catch:{ Exception -> 0x003f }
            return
        L_0x003f:
            r8 = move-exception
            Z5.D r8 = r7.invalidChunk(r9, r8)
            r10.add(r8)
            return
        L_0x0048:
            int r8 = r9.readableBytes()
            if (r8 != 0) goto L_0x004f
            return
        L_0x004f:
            int r0 = r7.maxChunkSize
            int r8 = java.lang.Math.min(r8, r0)
            long r3 = (long) r8
            long r5 = r7.chunkSize
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x005d
            int r8 = (int) r5
        L_0x005d:
            S5.n r9 = r9.readRetainedSlice(r8)
            long r3 = r7.chunkSize
            long r5 = (long) r8
            long r3 = r3 - r5
            r7.chunkSize = r3
            int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r8 != 0) goto L_0x0079
            Z5.t r8 = new Z5.t
            boolean r0 = r7.validateHeaders
            r8.<init>(r9, r0)
            r10.add(r8)
            r7.resetNow()
            goto L_0x0081
        L_0x0079:
            Z5.h r8 = new Z5.h
            r8.<init>(r9)
            r10.add(r8)
        L_0x0081:
            return
        L_0x0082:
            int r8 = r9.readableBytes()
            int r0 = r7.maxChunkSize
            int r8 = java.lang.Math.min(r8, r0)
            if (r8 <= 0) goto L_0x009a
            S5.n r8 = r9.readRetainedSlice(r8)
            Z5.h r9 = new Z5.h
            r9.<init>(r8)
            r10.add(r9)
        L_0x009a:
            return
        L_0x009b:
            Z5.e0 r8 = r7.lineParser     // Catch:{ Exception -> 0x00c3 }
            S5.n r8 = r8.parse(r9)     // Catch:{ Exception -> 0x00c3 }
            if (r8 != 0) goto L_0x00a4
            return
        L_0x00a4:
            byte[] r0 = r8.array()     // Catch:{ Exception -> 0x00c3 }
            int r3 = r8.arrayOffset()     // Catch:{ Exception -> 0x00c3 }
            int r4 = r8.readerIndex()     // Catch:{ Exception -> 0x00c3 }
            int r3 = r3 + r4
            int r8 = r8.readableBytes()     // Catch:{ Exception -> 0x00c3 }
            int r8 = getChunkSize(r0, r3, r8)     // Catch:{ Exception -> 0x00c3 }
            long r3 = (long) r8     // Catch:{ Exception -> 0x00c3 }
            r7.chunkSize = r3     // Catch:{ Exception -> 0x00c3 }
            if (r8 != 0) goto L_0x00c5
            Z5.f0 r8 = Z5.f0.READ_CHUNK_FOOTER     // Catch:{ Exception -> 0x00c3 }
            r7.currentState = r8     // Catch:{ Exception -> 0x00c3 }
            return
        L_0x00c3:
            r8 = move-exception
            goto L_0x0125
        L_0x00c5:
            Z5.f0 r8 = Z5.f0.READ_CHUNKED_CONTENT     // Catch:{ Exception -> 0x00c3 }
            r7.currentState = r8     // Catch:{ Exception -> 0x00c3 }
        L_0x00c9:
            long r3 = r7.chunkSize
            int r8 = (int) r3
            int r0 = r7.maxChunkSize
            int r8 = java.lang.Math.min(r8, r0)
            boolean r0 = r7.allowPartialChunks
            if (r0 != 0) goto L_0x00dd
            int r0 = r9.readableBytes()
            if (r0 >= r8) goto L_0x00dd
            return
        L_0x00dd:
            int r0 = r9.readableBytes()
            int r8 = java.lang.Math.min(r8, r0)
            if (r8 != 0) goto L_0x00e8
            return
        L_0x00e8:
            Z5.h r0 = new Z5.h
            S5.n r3 = r9.readRetainedSlice(r8)
            r0.<init>(r3)
            long r3 = r7.chunkSize
            long r5 = (long) r8
            long r3 = r3 - r5
            r7.chunkSize = r3
            r10.add(r0)
            long r3 = r7.chunkSize
            int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r8 == 0) goto L_0x0101
            return
        L_0x0101:
            Z5.f0 r8 = Z5.f0.READ_CHUNK_DELIMITER
            r7.currentState = r8
        L_0x0105:
            int r8 = r9.writerIndex()
            int r10 = r9.readerIndex()
        L_0x010d:
            if (r8 <= r10) goto L_0x0121
            int r0 = r10 + 1
            byte r10 = r9.getByte(r10)
            r1 = 10
            if (r10 != r1) goto L_0x011f
            Z5.f0 r8 = Z5.f0.READ_CHUNK_SIZE
            r7.currentState = r8
            r10 = r0
            goto L_0x0121
        L_0x011f:
            r10 = r0
            goto L_0x010d
        L_0x0121:
            r9.readerIndex(r10)
            return
        L_0x0125:
            Z5.D r8 = r7.invalidChunk(r9, r8)
            r10.add(r8)
            return
        L_0x012d:
            Z5.e0 r0 = r7.lineParser     // Catch:{ Exception -> 0x01b2 }
            S5.n r0 = r0.parse(r9)     // Catch:{ Exception -> 0x01b2 }
            if (r0 != 0) goto L_0x0136
            return
        L_0x0136:
            java.lang.String[] r0 = r7.splitInitialLine(r0)     // Catch:{ Exception -> 0x01b2 }
            Z5.N r0 = r7.createMessage(r0)     // Catch:{ Exception -> 0x01b2 }
            r7.message = r0     // Catch:{ Exception -> 0x01b2 }
            Z5.f0 r0 = Z5.f0.READ_HEADER     // Catch:{ Exception -> 0x01b2 }
            r7.currentState = r0     // Catch:{ Exception -> 0x01b2 }
        L_0x0144:
            Z5.f0 r0 = r7.readHeaders(r9)     // Catch:{ Exception -> 0x016e }
            if (r0 != 0) goto L_0x014b
            return
        L_0x014b:
            r7.currentState = r0     // Catch:{ Exception -> 0x016e }
            int r3 = r0.ordinal()     // Catch:{ Exception -> 0x016e }
            r8 = r8[r3]     // Catch:{ Exception -> 0x016e }
            r3 = 1
            if (r8 == r3) goto L_0x019c
            r3 = 2
            if (r8 == r3) goto L_0x018a
            long r3 = r7.contentLength()     // Catch:{ Exception -> 0x016e }
            int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r8 == 0) goto L_0x017c
            r1 = -1
            int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r8 != 0) goto L_0x0170
            boolean r8 = r7.isDecodingRequest()     // Catch:{ Exception -> 0x016e }
            if (r8 == 0) goto L_0x0170
            goto L_0x017c
        L_0x016e:
            r8 = move-exception
            goto L_0x01aa
        L_0x0170:
            Z5.N r8 = r7.message     // Catch:{ Exception -> 0x016e }
            r10.add(r8)     // Catch:{ Exception -> 0x016e }
            Z5.f0 r8 = Z5.f0.READ_FIXED_LENGTH_CONTENT     // Catch:{ Exception -> 0x016e }
            if (r0 != r8) goto L_0x017b
            r7.chunkSize = r3     // Catch:{ Exception -> 0x016e }
        L_0x017b:
            return
        L_0x017c:
            Z5.N r8 = r7.message     // Catch:{ Exception -> 0x016e }
            r10.add(r8)     // Catch:{ Exception -> 0x016e }
            Z5.t0 r8 = Z5.t0.EMPTY_LAST_CONTENT     // Catch:{ Exception -> 0x016e }
            r10.add(r8)     // Catch:{ Exception -> 0x016e }
            r7.resetNow()     // Catch:{ Exception -> 0x016e }
            return
        L_0x018a:
            boolean r8 = r7.chunkedSupported     // Catch:{ Exception -> 0x016e }
            if (r8 == 0) goto L_0x0194
            Z5.N r8 = r7.message     // Catch:{ Exception -> 0x016e }
            r10.add(r8)     // Catch:{ Exception -> 0x016e }
            return
        L_0x0194:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x016e }
            java.lang.String r0 = "Chunked messages not supported"
            r8.<init>(r0)     // Catch:{ Exception -> 0x016e }
            throw r8     // Catch:{ Exception -> 0x016e }
        L_0x019c:
            Z5.N r8 = r7.message     // Catch:{ Exception -> 0x016e }
            r10.add(r8)     // Catch:{ Exception -> 0x016e }
            Z5.t0 r8 = Z5.t0.EMPTY_LAST_CONTENT     // Catch:{ Exception -> 0x016e }
            r10.add(r8)     // Catch:{ Exception -> 0x016e }
            r7.resetNow()     // Catch:{ Exception -> 0x016e }
            return
        L_0x01aa:
            Z5.N r8 = r7.invalidMessage(r9, r8)
            r10.add(r8)
            return
        L_0x01b2:
            r8 = move-exception
            Z5.N r8 = r7.invalidMessage(r9, r8)
            r10.add(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Z5.g0.decode(T5.Y, S5.n, java.util.List):void");
    }

    public void decodeLast(Y y8, C0185n nVar, List<Object> list) {
        super.decodeLast(y8, nVar, list);
        if (this.resetRequested.get()) {
            resetNow();
        }
        N n4 = this.message;
        if (n4 != null) {
            boolean isTransferEncodingChunked = q0.isTransferEncodingChunked(n4);
            if (this.currentState == f0.READ_VARIABLE_LENGTH_CONTENT && !nVar.isReadable() && !isTransferEncodingChunked) {
                list.add(t0.EMPTY_LAST_CONTENT);
                resetNow();
            } else if (this.currentState == f0.READ_HEADER) {
                list.add(invalidMessage(D0.EMPTY_BUFFER, new M("Connection closed before received headers")));
                resetNow();
            } else {
                if (!isDecodingRequest() && !isTransferEncodingChunked && contentLength() <= 0) {
                    list.add(t0.EMPTY_LAST_CONTENT);
                }
                resetNow();
            }
        }
    }

    public void handleTransferEncodingChunkedWithContentLength(N n4) {
        n4.headers().remove((CharSequence) G.CONTENT_LENGTH);
        this.contentLength = Long.MIN_VALUE;
    }

    public void handlerRemoved0(Y y8) {
        try {
            this.parserScratchBuffer.release();
        } finally {
            super.handlerRemoved0(y8);
        }
    }

    public boolean isContentAlwaysEmpty(N n4) {
        if (!(n4 instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) n4;
        m0 status = k0Var.status();
        int code = status.code();
        if (status.codeClass() == p0.INFORMATIONAL) {
            if (code != 101 || k0Var.headers().contains((CharSequence) G.SEC_WEBSOCKET_ACCEPT) || !k0Var.headers().contains((CharSequence) G.UPGRADE, (CharSequence) K.WEBSOCKET, true)) {
                return true;
            }
            return false;
        } else if (code == 204 || code == 304) {
            return true;
        } else {
            return false;
        }
    }

    public abstract boolean isDecodingRequest();

    public boolean isSwitchingToNonHttp1Protocol(k0 k0Var) {
        if (k0Var.status().code() != m0.SWITCHING_PROTOCOLS.code()) {
            return false;
        }
        String str = k0Var.headers().get((CharSequence) G.UPGRADE);
        if (str == null || (!str.contains(r0.HTTP_1_0.text()) && !str.contains(r0.HTTP_1_1.text()))) {
            return true;
        }
        return false;
    }

    public void reset() {
        this.resetRequested.lazySet(true);
    }

    public String splitFirstWordInitialLine(byte[] bArr, int i, int i8) {
        return langAsciiString(bArr, i, i8);
    }

    public C0847f splitHeaderName(byte[] bArr, int i, int i8) {
        return new C0847f(bArr, i, i8, true);
    }

    public String splitSecondWordInitialLine(byte[] bArr, int i, int i8) {
        return langAsciiString(bArr, i, i8);
    }

    public String splitThirdWordInitialLine(byte[] bArr, int i, int i8) {
        return langAsciiString(bArr, i, i8);
    }

    public void userEventTriggered(Y y8, Object obj) {
        int i;
        if ((obj instanceof F) && ((i = c0.$SwitchMap$io$netty$handler$codec$http$HttpObjectDecoder$State[this.currentState.ordinal()]) == 2 || i == 5 || i == 6)) {
            reset();
        }
        super.userEventTriggered(y8, obj);
    }

    public g0(int i, int i8, int i9, boolean z, boolean z6, int i10) {
        this(i, i8, i9, z, z6, i10, false);
    }

    public g0(int i, int i8, int i9, boolean z, boolean z6, int i10, boolean z8) {
        this(i, i8, i9, z, z6, i10, z8, true);
    }

    public g0(int i, int i8, int i9, boolean z, boolean z6, int i10, boolean z8, boolean z9) {
        this.contentLength = Long.MIN_VALUE;
        this.resetRequested = new AtomicBoolean();
        this.currentState = f0.SKIP_CONTROL_CHARS;
        B.checkPositive(i, "maxInitialLineLength");
        B.checkPositive(i8, "maxHeaderSize");
        B.checkPositive(i9, "maxChunkSize");
        C0185n buffer = D0.buffer(i10);
        this.parserScratchBuffer = buffer;
        this.lineParser = new e0(this, buffer, i);
        this.headerParser = new d0(buffer, i8);
        this.maxChunkSize = i9;
        this.chunkedSupported = z;
        this.validateHeaders = z6;
        this.allowDuplicateContentLengths = z8;
        this.allowPartialChunks = z9;
    }
}
