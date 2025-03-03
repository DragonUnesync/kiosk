package S5;

import Q0.g;
import e6.C0851j;
import e6.C0852k;
import e6.P;
import e6.S;
import e6.r;
import g6.B;
import g6.C0984q;
import g6.Y;
import g6.n0;
import g6.p0;
import h6.C1082c;
import h6.d;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;
import org.altbeacon.bluetooth.Pdu;

/* renamed from: S5.a  reason: case insensitive filesystem */
public abstract class C0159a extends C0185n {
    static final boolean checkAccessible;
    private static final boolean checkBounds;
    static final P leakDetector = S.instance().newResourceLeakDetector(C0185n.class);
    private static final C1082c logger;
    private int markedReaderIndex;
    private int markedWriterIndex;
    private int maxCapacity;
    int readerIndex;
    int writerIndex;

    static {
        C1082c instance = d.getInstance((Class<?>) C0159a.class);
        logger = instance;
        if (p0.contains("io.netty.buffer.checkAccessible")) {
            checkAccessible = p0.getBoolean("io.netty.buffer.checkAccessible", true);
        } else {
            checkAccessible = p0.getBoolean("io.netty.buffer.bytebuf.checkAccessible", true);
        }
        boolean z = p0.getBoolean("io.netty.buffer.checkBounds", true);
        checkBounds = z;
        if (instance.isDebugEnabled()) {
            instance.debug("-D{}: {}", "io.netty.buffer.checkAccessible", Boolean.valueOf(checkAccessible));
            instance.debug("-D{}: {}", "io.netty.buffer.checkBounds", Boolean.valueOf(z));
        }
    }

    public C0159a(int i) {
        B.checkPositiveOrZero(i, "maxCapacity");
        this.maxCapacity = i;
    }

    private static void checkIndexBounds(int i, int i8, int i9) {
        if (i < 0 || i > i8 || i8 > i9) {
            throw new IndexOutOfBoundsException(String.format("readerIndex: %d, writerIndex: %d (expected: 0 <= readerIndex <= writerIndex <= capacity(%d))", new Object[]{Integer.valueOf(i), Integer.valueOf(i8), Integer.valueOf(i9)}));
        }
    }

    private static void checkRangeBounds(String str, int i, int i8, int i9) {
        if (C0984q.isOutOfBounds(i, i8, i9)) {
            throw new IndexOutOfBoundsException(String.format("%s: %d, length: %d (expected: range(0, %d))", new Object[]{str, Integer.valueOf(i), Integer.valueOf(i8), Integer.valueOf(i9)}));
        }
    }

    private static void checkReadableBounds(C0185n nVar, int i) {
        if (i > nVar.readableBytes()) {
            throw new IndexOutOfBoundsException(String.format("length(%d) exceeds src.readableBytes(%d) where src is: %s", new Object[]{Integer.valueOf(i), Integer.valueOf(nVar.readableBytes()), nVar}));
        }
    }

    private void checkReadableBytes0(int i) {
        ensureAccessible();
        if (checkBounds && this.readerIndex > this.writerIndex - i) {
            throw new IndexOutOfBoundsException(String.format("readerIndex(%d) + length(%d) exceeds writerIndex(%d): %s", new Object[]{Integer.valueOf(this.readerIndex), Integer.valueOf(i), Integer.valueOf(this.writerIndex), this}));
        }
    }

    private int setCharSequence0(int i, CharSequence charSequence, Charset charset, boolean z) {
        if (charset.equals(C0852k.UTF_8)) {
            int utf8MaxBytes = C0206y.utf8MaxBytes(charSequence);
            if (z) {
                ensureWritable0(utf8MaxBytes);
                checkIndex0(i, utf8MaxBytes);
            } else {
                checkIndex(i, utf8MaxBytes);
            }
            return C0206y.writeUtf8(this, i, utf8MaxBytes, charSequence, charSequence.length());
        } else if (charset.equals(C0852k.US_ASCII) || charset.equals(C0852k.ISO_8859_1)) {
            int length = charSequence.length();
            if (z) {
                ensureWritable0(length);
                checkIndex0(i, length);
            } else {
                checkIndex(i, length);
            }
            return C0206y.writeAscii(this, i, charSequence, length);
        } else {
            byte[] bytes = charSequence.toString().getBytes(charset);
            if (z) {
                ensureWritable0(bytes.length);
            }
            setBytes(i, bytes);
            return bytes.length;
        }
    }

    public abstract byte _getByte(int i);

    public abstract int _getInt(int i);

    public abstract int _getIntLE(int i);

    public abstract long _getLong(int i);

    public abstract long _getLongLE(int i);

    public abstract short _getShort(int i);

    public abstract short _getShortLE(int i);

    public abstract int _getUnsignedMedium(int i);

    public abstract void _setByte(int i, int i8);

    public abstract void _setInt(int i, int i8);

    public abstract void _setLong(int i, long j7);

    public abstract void _setMedium(int i, int i8);

    public abstract void _setShort(int i, int i8);

    public final void adjustMarkers(int i) {
        int i8 = this.markedReaderIndex;
        if (i8 <= i) {
            this.markedReaderIndex = 0;
            int i9 = this.markedWriterIndex;
            if (i9 <= i) {
                this.markedWriterIndex = 0;
            } else {
                this.markedWriterIndex = i9 - i;
            }
        } else {
            this.markedReaderIndex = i8 - i;
            this.markedWriterIndex -= i;
        }
    }

    public C0185n asReadOnly() {
        if (isReadOnly()) {
            return this;
        }
        return D0.unmodifiableBuffer(this);
    }

    public final void checkDstIndex(int i, int i8, int i9, int i10) {
        checkIndex(i, i8);
        if (checkBounds) {
            checkRangeBounds("dstIndex", i9, i8, i10);
        }
    }

    public final void checkIndex(int i) {
        checkIndex(i, 1);
    }

    public final void checkIndex0(int i, int i8) {
        if (checkBounds) {
            checkRangeBounds("index", i, i8, capacity());
        }
    }

    public final void checkNewCapacity(int i) {
        ensureAccessible();
        if (!checkBounds) {
            return;
        }
        if (i < 0 || i > maxCapacity()) {
            StringBuilder p3 = g.p(i, "newCapacity: ", " (expected: 0-");
            p3.append(maxCapacity());
            p3.append(')');
            throw new IllegalArgumentException(p3.toString());
        }
    }

    public final void checkReadableBytes(int i) {
        checkReadableBytes0(B.checkPositiveOrZero(i, "minimumReadableBytes"));
    }

    public final void checkSrcIndex(int i, int i8, int i9, int i10) {
        checkIndex(i, i8);
        if (checkBounds) {
            checkRangeBounds("srcIndex", i9, i8, i10);
        }
    }

    public C0185n clear() {
        this.writerIndex = 0;
        this.readerIndex = 0;
        return this;
    }

    public final void discardMarks() {
        this.markedWriterIndex = 0;
        this.markedReaderIndex = 0;
    }

    public C0185n discardSomeReadBytes() {
        int i = this.readerIndex;
        if (i > 0) {
            if (i == this.writerIndex) {
                ensureAccessible();
                adjustMarkers(this.readerIndex);
                this.readerIndex = 0;
                this.writerIndex = 0;
                return this;
            } else if (i >= (capacity() >>> 1)) {
                int i8 = this.readerIndex;
                setBytes(0, (C0185n) this, i8, this.writerIndex - i8);
                int i9 = this.writerIndex;
                int i10 = this.readerIndex;
                this.writerIndex = i9 - i10;
                adjustMarkers(i10);
                this.readerIndex = 0;
                return this;
            }
        }
        ensureAccessible();
        return this;
    }

    public C0185n duplicate() {
        ensureAccessible();
        return new N0(this);
    }

    public final void ensureAccessible() {
        if (checkAccessible && !isAccessible()) {
            throw new r(0);
        }
    }

    public C0185n ensureWritable(int i) {
        ensureWritable0(B.checkPositiveOrZero(i, "minWritableBytes"));
        return this;
    }

    public final void ensureWritable0(int i) {
        boolean z;
        boolean z6;
        int i8;
        int writerIndex2 = writerIndex();
        int i9 = writerIndex2 + i;
        if (i9 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (i9 <= capacity()) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z && z6) {
            ensureAccessible();
        } else if (!checkBounds || (i9 >= 0 && i9 <= this.maxCapacity)) {
            int maxFastWritableBytes = maxFastWritableBytes();
            if (maxFastWritableBytes >= i) {
                i8 = writerIndex2 + maxFastWritableBytes;
            } else {
                i8 = ((C0163c) alloc()).calculateNewCapacity(i9, this.maxCapacity);
            }
            capacity(i8);
        } else {
            ensureAccessible();
            throw new IndexOutOfBoundsException(String.format("writerIndex(%d) + minWritableBytes(%d) exceeds maxCapacity(%d): %s", new Object[]{Integer.valueOf(writerIndex2), Integer.valueOf(i), Integer.valueOf(this.maxCapacity), this}));
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0185n) || !C0206y.equals(this, (C0185n) obj)) {
            return false;
        }
        return true;
    }

    public int forEachByte(int i, int i8, C0851j jVar) {
        checkIndex(i, i8);
        try {
            return forEachByteAsc0(i, i8 + i, jVar);
        } catch (Exception e) {
            Y.throwException(e);
            return -1;
        }
    }

    public int forEachByteAsc0(int i, int i8, C0851j jVar) {
        while (i < i8) {
            if (!jVar.process(_getByte(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public byte getByte(int i) {
        checkIndex(i);
        return _getByte(i);
    }

    public int getInt(int i) {
        checkIndex(i, 4);
        return _getInt(i);
    }

    public int getIntLE(int i) {
        checkIndex(i, 4);
        return _getIntLE(i);
    }

    public long getLong(int i) {
        checkIndex(i, 8);
        return _getLong(i);
    }

    public long getLongLE(int i) {
        checkIndex(i, 8);
        return _getLongLE(i);
    }

    public int getMedium(int i) {
        int unsignedMedium = getUnsignedMedium(i);
        if ((8388608 & unsignedMedium) != 0) {
            return unsignedMedium | -16777216;
        }
        return unsignedMedium;
    }

    public short getShort(int i) {
        checkIndex(i, 2);
        return _getShort(i);
    }

    public short getShortLE(int i) {
        checkIndex(i, 2);
        return _getShortLE(i);
    }

    public short getUnsignedByte(int i) {
        return (short) (getByte(i) & Pdu.MANUFACTURER_DATA_PDU_TYPE);
    }

    public long getUnsignedInt(int i) {
        return ((long) getInt(i)) & 4294967295L;
    }

    public long getUnsignedIntLE(int i) {
        return ((long) getIntLE(i)) & 4294967295L;
    }

    public int getUnsignedMedium(int i) {
        checkIndex(i, 3);
        return _getUnsignedMedium(i);
    }

    public int getUnsignedShort(int i) {
        return getShort(i) & 65535;
    }

    public int hashCode() {
        return C0206y.hashCode(this);
    }

    public int indexOf(int i, int i8, byte b8) {
        if (i <= i8) {
            return C0206y.firstIndexOf(this, i, i8, b8);
        }
        return C0206y.lastIndexOf(this, i, i8, b8);
    }

    public boolean isReadOnly() {
        return false;
    }

    public boolean isReadable() {
        if (this.writerIndex > this.readerIndex) {
            return true;
        }
        return false;
    }

    public boolean isWritable(int i) {
        if (capacity() - this.writerIndex >= i) {
            return true;
        }
        return false;
    }

    public C0185n markReaderIndex() {
        this.markedReaderIndex = this.readerIndex;
        return this;
    }

    public C0185n markWriterIndex() {
        this.markedWriterIndex = this.writerIndex;
        return this;
    }

    public int maxCapacity() {
        return this.maxCapacity;
    }

    public int maxWritableBytes() {
        return maxCapacity() - this.writerIndex;
    }

    public C0 newSwappedByteBuf() {
        return new C0(this);
    }

    public ByteBuffer nioBuffer() {
        return nioBuffer(this.readerIndex, readableBytes());
    }

    public ByteBuffer[] nioBuffers() {
        return nioBuffers(this.readerIndex, readableBytes());
    }

    public C0185n order(ByteOrder byteOrder) {
        if (byteOrder == order()) {
            return this;
        }
        B.checkNotNull(byteOrder, "endianness");
        return newSwappedByteBuf();
    }

    public byte readByte() {
        checkReadableBytes0(1);
        int i = this.readerIndex;
        byte _getByte = _getByte(i);
        this.readerIndex = i + 1;
        return _getByte;
    }

    public C0185n readBytes(int i) {
        checkReadableBytes(i);
        if (i == 0) {
            return D0.EMPTY_BUFFER;
        }
        C0185n buffer = ((C0163c) alloc()).buffer(i, this.maxCapacity);
        buffer.writeBytes((C0185n) this, this.readerIndex, i);
        this.readerIndex += i;
        return buffer;
    }

    public int readInt() {
        checkReadableBytes0(4);
        int _getInt = _getInt(this.readerIndex);
        this.readerIndex += 4;
        return _getInt;
    }

    public long readLong() {
        checkReadableBytes0(8);
        long _getLong = _getLong(this.readerIndex);
        this.readerIndex += 8;
        return _getLong;
    }

    public C0185n readRetainedSlice(int i) {
        checkReadableBytes(i);
        C0185n retainedSlice = retainedSlice(this.readerIndex, i);
        this.readerIndex += i;
        return retainedSlice;
    }

    public short readShort() {
        checkReadableBytes0(2);
        short _getShort = _getShort(this.readerIndex);
        this.readerIndex += 2;
        return _getShort;
    }

    public C0185n readSlice(int i) {
        checkReadableBytes(i);
        C0185n slice = slice(this.readerIndex, i);
        this.readerIndex += i;
        return slice;
    }

    public short readUnsignedByte() {
        return (short) (readByte() & Pdu.MANUFACTURER_DATA_PDU_TYPE);
    }

    public long readUnsignedInt() {
        return ((long) readInt()) & 4294967295L;
    }

    public int readUnsignedShort() {
        return readShort() & 65535;
    }

    public int readableBytes() {
        return this.writerIndex - this.readerIndex;
    }

    public int readerIndex() {
        return this.readerIndex;
    }

    public C0185n retainedDuplicate() {
        return duplicate().retain();
    }

    public C0185n retainedSlice() {
        return slice().retain();
    }

    public C0185n setByte(int i, int i8) {
        checkIndex(i);
        _setByte(i, i8);
        return this;
    }

    public C0185n setBytes(int i, byte[] bArr) {
        setBytes(i, bArr, 0, bArr.length);
        return this;
    }

    public int setCharSequence(int i, CharSequence charSequence, Charset charset) {
        return setCharSequence0(i, charSequence, charset, false);
    }

    public C0185n setIndex(int i, int i8) {
        if (checkBounds) {
            checkIndexBounds(i, i8, capacity());
        }
        setIndex0(i, i8);
        return this;
    }

    public final void setIndex0(int i, int i8) {
        this.readerIndex = i;
        this.writerIndex = i8;
    }

    public C0185n setInt(int i, int i8) {
        checkIndex(i, 4);
        _setInt(i, i8);
        return this;
    }

    public C0185n setLong(int i, long j7) {
        checkIndex(i, 8);
        _setLong(i, j7);
        return this;
    }

    public C0185n setMedium(int i, int i8) {
        checkIndex(i, 3);
        _setMedium(i, i8);
        return this;
    }

    public C0185n setShort(int i, int i8) {
        checkIndex(i, 2);
        _setShort(i, i8);
        return this;
    }

    public C0185n setZero(int i, int i8) {
        if (i8 == 0) {
            return this;
        }
        checkIndex(i, i8);
        int i9 = i8 & 7;
        for (int i10 = i8 >>> 3; i10 > 0; i10--) {
            _setLong(i, 0);
            i += 8;
        }
        if (i9 == 4) {
            _setInt(i, 0);
        } else if (i9 < 4) {
            while (i9 > 0) {
                _setByte(i, 0);
                i++;
                i9--;
            }
        } else {
            _setInt(i, 0);
            int i11 = i + 4;
            for (int i12 = i9 - 4; i12 > 0; i12--) {
                _setByte(i11, 0);
                i11++;
            }
        }
        return this;
    }

    public C0185n skipBytes(int i) {
        checkReadableBytes(i);
        this.readerIndex += i;
        return this;
    }

    public C0185n slice() {
        return slice(this.readerIndex, readableBytes());
    }

    public String toString(Charset charset) {
        return toString(this.readerIndex, readableBytes(), charset);
    }

    public final void trimIndicesToCapacity(int i) {
        if (writerIndex() > i) {
            setIndex0(Math.min(readerIndex(), i), i);
        }
    }

    public int writableBytes() {
        return capacity() - this.writerIndex;
    }

    public C0185n writeByte(int i) {
        ensureWritable0(1);
        int i8 = this.writerIndex;
        this.writerIndex = i8 + 1;
        _setByte(i8, i);
        return this;
    }

    public C0185n writeBytes(byte[] bArr, int i, int i8) {
        ensureWritable(i8);
        setBytes(this.writerIndex, bArr, i, i8);
        this.writerIndex += i8;
        return this;
    }

    public int writeCharSequence(CharSequence charSequence, Charset charset) {
        int charSequence0 = setCharSequence0(this.writerIndex, charSequence, charset, true);
        this.writerIndex += charSequence0;
        return charSequence0;
    }

    public C0185n writeInt(int i) {
        ensureWritable0(4);
        _setInt(this.writerIndex, i);
        this.writerIndex += 4;
        return this;
    }

    public C0185n writeLong(long j7) {
        ensureWritable0(8);
        _setLong(this.writerIndex, j7);
        this.writerIndex += 8;
        return this;
    }

    public C0185n writeMedium(int i) {
        ensureWritable0(3);
        _setMedium(this.writerIndex, i);
        this.writerIndex += 3;
        return this;
    }

    public C0185n writeShort(int i) {
        ensureWritable0(2);
        _setShort(this.writerIndex, i);
        this.writerIndex += 2;
        return this;
    }

    public int writerIndex() {
        return this.writerIndex;
    }

    public final void checkIndex(int i, int i8) {
        ensureAccessible();
        checkIndex0(i, i8);
    }

    public int compareTo(C0185n nVar) {
        return C0206y.compare(this, nVar);
    }

    public int ensureWritable(int i, boolean z) {
        int i8;
        ensureAccessible();
        B.checkPositiveOrZero(i, "minWritableBytes");
        if (i <= writableBytes()) {
            return 0;
        }
        int maxCapacity2 = maxCapacity();
        int writerIndex2 = writerIndex();
        if (i <= maxCapacity2 - writerIndex2) {
            int maxFastWritableBytes = maxFastWritableBytes();
            if (maxFastWritableBytes >= i) {
                i8 = writerIndex2 + maxFastWritableBytes;
            } else {
                i8 = ((C0163c) alloc()).calculateNewCapacity(writerIndex2 + i, maxCapacity2);
            }
            capacity(i8);
            return 2;
        } else if (!z || capacity() == maxCapacity2) {
            return 1;
        } else {
            capacity(maxCapacity2);
            return 3;
        }
    }

    public final void maxCapacity(int i) {
        this.maxCapacity = i;
    }

    public C0185n readerIndex(int i) {
        if (checkBounds) {
            checkIndexBounds(i, this.writerIndex, capacity());
        }
        this.readerIndex = i;
        return this;
    }

    public C0185n retainedSlice(int i, int i8) {
        return slice(i, i8).retain();
    }

    public C0185n slice(int i, int i8) {
        ensureAccessible();
        return new P0(this, i, i8);
    }

    public String toString(int i, int i8, Charset charset) {
        return C0206y.decodeString(this, i, i8, charset);
    }

    public C0185n writerIndex(int i) {
        if (checkBounds) {
            checkIndexBounds(this.readerIndex, i, capacity());
        }
        this.writerIndex = i;
        return this;
    }

    public String toString() {
        if (refCnt() == 0) {
            return n0.simpleClassName((Object) this) + "(freed)";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(n0.simpleClassName((Object) this));
        sb.append("(ridx: ");
        sb.append(this.readerIndex);
        sb.append(", widx: ");
        sb.append(this.writerIndex);
        sb.append(", cap: ");
        sb.append(capacity());
        if (this.maxCapacity != Integer.MAX_VALUE) {
            sb.append('/');
            sb.append(this.maxCapacity);
        }
        C0185n unwrap = unwrap();
        if (unwrap != null) {
            sb.append(", unwrapped: ");
            sb.append(unwrap);
        }
        sb.append(')');
        return sb.toString();
    }

    public final void checkDstIndex(int i, int i8, int i9) {
        checkReadableBytes(i);
        if (checkBounds) {
            checkRangeBounds("dstIndex", i8, i, i9);
        }
    }

    public C0185n writeBytes(byte[] bArr) {
        writeBytes(bArr, 0, bArr.length);
        return this;
    }

    public C0185n writeBytes(C0185n nVar) {
        writeBytes(nVar, nVar.readableBytes());
        return this;
    }

    public C0185n readBytes(byte[] bArr, int i, int i8) {
        checkReadableBytes(i8);
        getBytes(this.readerIndex, bArr, i, i8);
        this.readerIndex += i8;
        return this;
    }

    public C0185n writeBytes(C0185n nVar, int i) {
        if (checkBounds) {
            checkReadableBounds(nVar, i);
        }
        writeBytes(nVar, nVar.readerIndex(), i);
        nVar.readerIndex(nVar.readerIndex() + i);
        return this;
    }

    public C0185n readBytes(byte[] bArr) {
        readBytes(bArr, 0, bArr.length);
        return this;
    }

    public C0185n readBytes(C0185n nVar) {
        readBytes(nVar, nVar.writableBytes());
        return this;
    }

    public C0185n writeBytes(C0185n nVar, int i, int i8) {
        ensureWritable(i8);
        setBytes(this.writerIndex, nVar, i, i8);
        this.writerIndex += i8;
        return this;
    }

    public C0185n readBytes(C0185n nVar, int i) {
        if (!checkBounds || i <= nVar.writableBytes()) {
            readBytes(nVar, nVar.writerIndex(), i);
            nVar.writerIndex(nVar.writerIndex() + i);
            return this;
        }
        throw new IndexOutOfBoundsException(String.format("length(%d) exceeds dst.writableBytes(%d) where dst is: %s", new Object[]{Integer.valueOf(i), Integer.valueOf(nVar.writableBytes()), nVar}));
    }

    public C0185n writeBytes(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        ensureWritable0(remaining);
        setBytes(this.writerIndex, byteBuffer);
        this.writerIndex += remaining;
        return this;
    }

    public int writeBytes(ScatteringByteChannel scatteringByteChannel, int i) {
        ensureWritable(i);
        int bytes = setBytes(this.writerIndex, scatteringByteChannel, i);
        if (bytes > 0) {
            this.writerIndex += bytes;
        }
        return bytes;
    }

    public C0185n readBytes(C0185n nVar, int i, int i8) {
        checkReadableBytes(i8);
        getBytes(this.readerIndex, nVar, i, i8);
        this.readerIndex += i8;
        return this;
    }

    public C0185n readBytes(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        checkReadableBytes(remaining);
        getBytes(this.readerIndex, byteBuffer);
        this.readerIndex += remaining;
        return this;
    }

    public int readBytes(GatheringByteChannel gatheringByteChannel, int i) {
        checkReadableBytes(i);
        int bytes = getBytes(this.readerIndex, gatheringByteChannel, i);
        this.readerIndex += bytes;
        return bytes;
    }
}
