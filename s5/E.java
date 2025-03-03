package S5;

import N.e;
import e6.C0851j;
import e6.r;
import g6.B;
import g6.C0978k;
import g6.d0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import org.altbeacon.bluetooth.Pdu;
import u.C1477r;

public class E extends C0175i implements Iterable {
    static final B BYTE_ARRAY_WRAPPER = new C0208z();
    static final B BYTE_BUFFER_WRAPPER = new A();
    private static final Iterator<C0185n> EMPTY_ITERATOR = Collections.emptyList().iterator();
    private static final ByteBuffer EMPTY_NIO_BUFFER = D0.EMPTY_BUFFER.nioBuffer();
    private final C0187o alloc;
    private int componentCount;
    /* access modifiers changed from: private */
    public C[] components;
    private final boolean direct;
    private boolean freed;
    private C lastAccessed;
    private final int maxNumComponents;

    private E(C0187o oVar, boolean z, int i, int i8) {
        super(Integer.MAX_VALUE);
        this.alloc = (C0187o) B.checkNotNull(oVar, "alloc");
        if (i >= 1) {
            this.direct = z;
            this.maxNumComponents = i;
            this.components = newCompArray(i8, i);
            return;
        }
        throw new IllegalArgumentException(C1477r.c(i, "maxNumComponents: ", " (expected: >= 1)"));
    }

    private void addComp(int i, C c8) {
        shiftComps(i, 1);
        this.components[i] = c8;
    }

    private int addComponent0(boolean z, int i, C0185n nVar) {
        try {
            checkComponentIndex(i);
            C newComponent = newComponent(ensureAccessible(nVar), 0);
            int length = newComponent.length();
            checkForOverflow(capacity(), length);
            addComp(i, newComponent);
            if (length > 0 && i < this.componentCount - 1) {
                updateComponentOffsets(i);
            } else if (i > 0) {
                newComponent.reposition(this.components[i - 1].endOffset);
            }
            if (z) {
                this.writerIndex += length;
            }
            return i;
        } catch (Throwable th) {
            if (0 == 0) {
                nVar.release();
            }
            throw th;
        }
    }

    private C0185n allocBuffer(int i) {
        if (this.direct) {
            return ((C0163c) alloc()).directBuffer(i);
        }
        return ((C0163c) alloc()).heapBuffer(i);
    }

    private void checkComponentIndex(int i) {
        ensureAccessible();
        if (i < 0 || i > this.componentCount) {
            throw new IndexOutOfBoundsException(String.format("cIndex: %d (expected: >= 0 && <= numComponents(%d))", new Object[]{Integer.valueOf(i), Integer.valueOf(this.componentCount)}));
        }
    }

    private static void checkForOverflow(int i, int i8) {
        if (i + i8 < 0) {
            throw new IllegalArgumentException(e.v("Can't increase by ", i8, " as capacity(", i, ") would overflow 2147483647"));
        }
    }

    private void clearComps() {
        removeCompRange(0, this.componentCount);
    }

    private void consolidate0(int i, int i8) {
        int i9;
        if (i8 > 1) {
            int i10 = i + i8;
            if (i != 0) {
                i9 = this.components[i].offset;
            } else {
                i9 = 0;
            }
            C0185n allocBuffer = allocBuffer(this.components[i10 - 1].endOffset - i9);
            for (int i11 = i; i11 < i10; i11++) {
                this.components[i11].transferTo(allocBuffer);
            }
            this.lastAccessed = null;
            removeCompRange(i + 1, i10);
            this.components[i] = newComponent(allocBuffer, 0);
            if (i != 0 || i8 != this.componentCount) {
                updateComponentOffsets(i);
            }
        }
    }

    private void consolidateIfNeeded() {
        int i = this.componentCount;
        if (i > this.maxNumComponents) {
            consolidate0(0, i);
        }
    }

    private static C0185n ensureAccessible(C0185n nVar) {
        if (!C0159a.checkAccessible || nVar.isAccessible()) {
            return nVar;
        }
        throw new r(0);
    }

    private C findComponent(int i) {
        C c8 = this.lastAccessed;
        if (c8 == null || i < c8.offset || i >= c8.endOffset) {
            checkIndex(i);
            return findIt(i);
        }
        ensureAccessible();
        return c8;
    }

    private C findComponent0(int i) {
        C c8 = this.lastAccessed;
        if (c8 == null || i < c8.offset || i >= c8.endOffset) {
            return findIt(i);
        }
        return c8;
    }

    private C findIt(int i) {
        int i8 = this.componentCount;
        int i9 = 0;
        while (i9 <= i8) {
            int i10 = (i9 + i8) >>> 1;
            C c8 = this.components[i10];
            if (c8 == null) {
                throw new IllegalStateException("No component found for offset. Composite buffer layout might be outdated, e.g. from a discardReadBytes call.");
            } else if (i >= c8.endOffset) {
                i9 = i10 + 1;
            } else if (i < c8.offset) {
                i8 = i10 - 1;
            } else {
                this.lastAccessed = c8;
                return c8;
            }
        }
        throw new Error("should not reach here");
    }

    private static C[] newCompArray(int i, int i8) {
        return new C[Math.max(i, Math.min(16, i8))];
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private S5.C newComponent(S5.C0185n r10, int r11) {
        /*
            r9 = this;
            int r2 = r10.readerIndex()
            int r6 = r10.readableBytes()
            r0 = r10
        L_0x0009:
            boolean r1 = r0 instanceof S5.X0
            if (r1 != 0) goto L_0x0061
            boolean r1 = r0 instanceof S5.C0
            if (r1 == 0) goto L_0x0012
            goto L_0x0061
        L_0x0012:
            boolean r1 = r0 instanceof S5.C0177j
            if (r1 == 0) goto L_0x0025
            r1 = r0
            S5.j r1 = (S5.C0177j) r1
            r3 = 0
            int r1 = r1.idx(r3)
            int r1 = r1 + r2
            S5.n r0 = r0.unwrap()
        L_0x0023:
            r4 = r1
            goto L_0x0044
        L_0x0025:
            boolean r1 = r0 instanceof S5.C0193r0
            if (r1 == 0) goto L_0x0034
            r1 = r0
            S5.r0 r1 = (S5.C0193r0) r1
            int r1 = r1.adjustment
            int r1 = r1 + r2
            S5.n r0 = r0.unwrap()
            goto L_0x0023
        L_0x0034:
            boolean r1 = r0 instanceof S5.G
            if (r1 != 0) goto L_0x003f
            boolean r1 = r0 instanceof S5.C0186n0
            if (r1 == 0) goto L_0x003d
            goto L_0x003f
        L_0x003d:
            r4 = r2
            goto L_0x0044
        L_0x003f:
            S5.n r0 = r0.unwrap()
            goto L_0x003d
        L_0x0044:
            int r1 = r10.capacity()
            if (r1 != r6) goto L_0x004c
            r7 = r10
            goto L_0x004e
        L_0x004c:
            r1 = 0
            r7 = r1
        L_0x004e:
            S5.C r8 = new S5.C
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            S5.n r10 = r10.order(r1)
            S5.n r3 = r0.order(r1)
            r0 = r8
            r1 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r8
        L_0x0061:
            S5.n r0 = r0.unwrap()
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: S5.E.newComponent(S5.n, int):S5.C");
    }

    private void removeComp(int i) {
        removeCompRange(i, i + 1);
    }

    private void removeCompRange(int i, int i8) {
        if (i < i8) {
            int i9 = this.componentCount;
            if (i8 < i9) {
                C[] cArr = this.components;
                System.arraycopy(cArr, i8, cArr, i, i9 - i8);
            }
            int i10 = (i9 - i8) + i;
            for (int i11 = i10; i11 < i9; i11++) {
                this.components[i11] = null;
            }
            this.componentCount = i10;
        }
    }

    private void shiftComps(int i, int i8) {
        C[] cArr;
        int i9 = this.componentCount;
        int i10 = i9 + i8;
        C[] cArr2 = this.components;
        if (i10 > cArr2.length) {
            int max = Math.max((i9 >> 1) + i9, i10);
            if (i == i9) {
                cArr = (C[]) Arrays.copyOf(this.components, max, C[].class);
            } else {
                C[] cArr3 = new C[max];
                if (i > 0) {
                    System.arraycopy(this.components, 0, cArr3, 0, i);
                }
                if (i < i9) {
                    System.arraycopy(this.components, i, cArr3, i8 + i, i9 - i);
                }
                cArr = cArr3;
            }
            this.components = cArr;
        } else if (i < i9) {
            System.arraycopy(cArr2, i, cArr2, i8 + i, i9 - i);
        }
        this.componentCount = i10;
    }

    private int toComponentIndex0(int i) {
        int i8 = this.componentCount;
        int i9 = 0;
        if (i == 0) {
            for (int i10 = 0; i10 < i8; i10++) {
                if (this.components[i10].endOffset > 0) {
                    return i10;
                }
            }
        }
        if (i8 > 2) {
            while (i9 <= i8) {
                int i11 = (i9 + i8) >>> 1;
                C c8 = this.components[i11];
                if (i >= c8.endOffset) {
                    i9 = i11 + 1;
                } else if (i >= c8.offset) {
                    return i11;
                } else {
                    i8 = i11 - 1;
                }
            }
            throw new Error("should not reach here");
        } else if (i8 == 1 || i < this.components[0].endOffset) {
            return 0;
        } else {
            return 1;
        }
    }

    private void updateComponentOffsets(int i) {
        int i8;
        int i9 = this.componentCount;
        if (i9 > i) {
            if (i > 0) {
                i8 = this.components[i - 1].endOffset;
            } else {
                i8 = 0;
            }
            while (i < i9) {
                C c8 = this.components[i];
                c8.reposition(i8);
                i8 = c8.endOffset;
                i++;
            }
        }
    }

    public byte _getByte(int i) {
        C findComponent0 = findComponent0(i);
        return findComponent0.buf.getByte(findComponent0.idx(i));
    }

    public int _getInt(int i) {
        C findComponent0 = findComponent0(i);
        if (i + 4 <= findComponent0.endOffset) {
            return findComponent0.buf.getInt(findComponent0.idx(i));
        }
        if (order() == ByteOrder.BIG_ENDIAN) {
            return (_getShort(i + 2) & 65535) | ((_getShort(i) & 65535) << 16);
        }
        return ((_getShort(i + 2) & 65535) << 16) | (_getShort(i) & 65535);
    }

    public int _getIntLE(int i) {
        C findComponent0 = findComponent0(i);
        if (i + 4 <= findComponent0.endOffset) {
            return findComponent0.buf.getIntLE(findComponent0.idx(i));
        }
        if (order() == ByteOrder.BIG_ENDIAN) {
            return ((_getShortLE(i + 2) & 65535) << 16) | (_getShortLE(i) & 65535);
        }
        return (_getShortLE(i + 2) & 65535) | ((_getShortLE(i) & 65535) << 16);
    }

    public long _getLong(int i) {
        C findComponent0 = findComponent0(i);
        if (i + 8 <= findComponent0.endOffset) {
            return findComponent0.buf.getLong(findComponent0.idx(i));
        }
        if (order() == ByteOrder.BIG_ENDIAN) {
            return ((((long) _getInt(i)) & 4294967295L) << 32) | (((long) _getInt(i + 4)) & 4294967295L);
        }
        return (((long) _getInt(i)) & 4294967295L) | ((4294967295L & ((long) _getInt(i + 4))) << 32);
    }

    public long _getLongLE(int i) {
        C findComponent0 = findComponent0(i);
        if (i + 8 <= findComponent0.endOffset) {
            return findComponent0.buf.getLongLE(findComponent0.idx(i));
        }
        if (order() == ByteOrder.BIG_ENDIAN) {
            return (((long) _getIntLE(i)) & 4294967295L) | ((4294967295L & ((long) _getIntLE(i + 4))) << 32);
        }
        return ((((long) _getIntLE(i)) & 4294967295L) << 32) | (((long) _getIntLE(i + 4)) & 4294967295L);
    }

    public short _getShort(int i) {
        C findComponent0 = findComponent0(i);
        if (i + 2 <= findComponent0.endOffset) {
            return findComponent0.buf.getShort(findComponent0.idx(i));
        }
        if (order() == ByteOrder.BIG_ENDIAN) {
            return (short) ((_getByte(i + 1) & Pdu.MANUFACTURER_DATA_PDU_TYPE) | ((_getByte(i) & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 8));
        }
        return (short) (((_getByte(i + 1) & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 8) | (_getByte(i) & Pdu.MANUFACTURER_DATA_PDU_TYPE));
    }

    public short _getShortLE(int i) {
        C findComponent0 = findComponent0(i);
        if (i + 2 <= findComponent0.endOffset) {
            return findComponent0.buf.getShortLE(findComponent0.idx(i));
        }
        if (order() == ByteOrder.BIG_ENDIAN) {
            return (short) (((_getByte(i + 1) & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 8) | (_getByte(i) & Pdu.MANUFACTURER_DATA_PDU_TYPE));
        }
        return (short) ((_getByte(i + 1) & Pdu.MANUFACTURER_DATA_PDU_TYPE) | ((_getByte(i) & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 8));
    }

    public int _getUnsignedMedium(int i) {
        C findComponent0 = findComponent0(i);
        if (i + 3 <= findComponent0.endOffset) {
            return findComponent0.buf.getUnsignedMedium(findComponent0.idx(i));
        }
        if (order() == ByteOrder.BIG_ENDIAN) {
            return (_getByte(i + 2) & Pdu.MANUFACTURER_DATA_PDU_TYPE) | ((_getShort(i) & 65535) << 8);
        }
        return ((_getByte(i + 2) & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 16) | (_getShort(i) & 65535);
    }

    public void _setByte(int i, int i8) {
        C findComponent0 = findComponent0(i);
        findComponent0.buf.setByte(findComponent0.idx(i), i8);
    }

    public void _setInt(int i, int i8) {
        C findComponent0 = findComponent0(i);
        if (i + 4 <= findComponent0.endOffset) {
            findComponent0.buf.setInt(findComponent0.idx(i), i8);
        } else if (order() == ByteOrder.BIG_ENDIAN) {
            _setShort(i, (short) (i8 >>> 16));
            _setShort(i + 2, (short) i8);
        } else {
            _setShort(i, (short) i8);
            _setShort(i + 2, (short) (i8 >>> 16));
        }
    }

    public void _setLong(int i, long j7) {
        C findComponent0 = findComponent0(i);
        if (i + 8 <= findComponent0.endOffset) {
            findComponent0.buf.setLong(findComponent0.idx(i), j7);
        } else if (order() == ByteOrder.BIG_ENDIAN) {
            _setInt(i, (int) (j7 >>> 32));
            _setInt(i + 4, (int) j7);
        } else {
            _setInt(i, (int) j7);
            _setInt(i + 4, (int) (j7 >>> 32));
        }
    }

    public void _setMedium(int i, int i8) {
        C findComponent0 = findComponent0(i);
        if (i + 3 <= findComponent0.endOffset) {
            findComponent0.buf.setMedium(findComponent0.idx(i), i8);
        } else if (order() == ByteOrder.BIG_ENDIAN) {
            _setShort(i, (short) (i8 >> 8));
            _setByte(i + 2, (byte) i8);
        } else {
            _setShort(i, (short) i8);
            _setByte(i + 2, (byte) (i8 >>> 16));
        }
    }

    public void _setShort(int i, int i8) {
        C findComponent0 = findComponent0(i);
        if (i + 2 <= findComponent0.endOffset) {
            findComponent0.buf.setShort(findComponent0.idx(i), i8);
        } else if (order() == ByteOrder.BIG_ENDIAN) {
            _setByte(i, (byte) (i8 >>> 8));
            _setByte(i + 1, (byte) i8);
        } else {
            _setByte(i, (byte) i8);
            _setByte(i + 1, (byte) (i8 >>> 8));
        }
    }

    public E addComponent(boolean z, C0185n nVar) {
        return addComponent(z, this.componentCount, nVar);
    }

    public E addFlattenedComponents(boolean z, C0185n nVar) {
        E e;
        C[] cArr;
        int i;
        int i8;
        boolean z6 = z;
        C0185n nVar2 = nVar;
        B.checkNotNull(nVar2, "buffer");
        int readerIndex = nVar.readerIndex();
        int writerIndex = nVar.writerIndex();
        if (readerIndex == writerIndex) {
            nVar.release();
            return this;
        } else if (!(nVar2 instanceof E)) {
            addComponent0(z6, this.componentCount, nVar2);
            consolidateIfNeeded();
            return this;
        } else {
            if (nVar2 instanceof Y0) {
                e = (E) nVar.unwrap();
            } else {
                e = (E) nVar2;
            }
            int i9 = writerIndex - readerIndex;
            e.checkIndex(readerIndex, i9);
            C[] cArr2 = e.components;
            int i10 = this.componentCount;
            int i11 = this.writerIndex;
            try {
                int componentIndex0 = e.toComponentIndex0(readerIndex);
                int capacity = capacity();
                while (true) {
                    C c8 = cArr2[componentIndex0];
                    int max = Math.max(readerIndex, c8.offset);
                    int min = Math.min(writerIndex, c8.endOffset);
                    int i12 = min - max;
                    if (i12 > 0) {
                        int i13 = this.componentCount;
                        i = readerIndex;
                        C c9 = r10;
                        cArr = cArr2;
                        i8 = min;
                        C c10 = new C(c8.srcBuf.retain(), c8.srcIdx(max), c8.buf, c8.idx(max), capacity, i12, (C0185n) null);
                        addComp(i13, c9);
                    } else {
                        i = readerIndex;
                        cArr = cArr2;
                        i8 = min;
                    }
                    if (writerIndex == i8) {
                        break;
                    }
                    capacity += i12;
                    componentIndex0++;
                    C0185n nVar3 = nVar;
                    readerIndex = i;
                    cArr2 = cArr;
                }
                if (z6) {
                    this.writerIndex = i9 + i11;
                }
                consolidateIfNeeded();
                nVar.release();
                return this;
            } catch (Throwable th) {
                if (z6) {
                    this.writerIndex = i11;
                }
                for (int i14 = this.componentCount - 1; i14 >= i10; i14--) {
                    this.components[i14].free();
                    removeComp(i14);
                }
                throw th;
            }
        }
    }

    public C0187o alloc() {
        return this.alloc;
    }

    public byte[] array() {
        int i = this.componentCount;
        if (i == 0) {
            return C0978k.EMPTY_BYTES;
        }
        if (i == 1) {
            return this.components[0].buf.array();
        }
        throw new UnsupportedOperationException();
    }

    public int arrayOffset() {
        int i = this.componentCount;
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            C c8 = this.components[0];
            return c8.idx(c8.buf.arrayOffset());
        }
        throw new UnsupportedOperationException();
    }

    public void deallocate() {
        if (!this.freed) {
            this.freed = true;
            int i = this.componentCount;
            for (int i8 = 0; i8 < i; i8++) {
                this.components[i8].free();
            }
        }
    }

    public E discardReadComponents() {
        ensureAccessible();
        int readerIndex = readerIndex();
        if (readerIndex == 0) {
            return this;
        }
        int writerIndex = writerIndex();
        if (readerIndex == writerIndex && writerIndex == capacity()) {
            int i = this.componentCount;
            for (int i8 = 0; i8 < i; i8++) {
                this.components[i8].free();
            }
            this.lastAccessed = null;
            clearComps();
            setIndex(0, 0);
            adjustMarkers(readerIndex);
            return this;
        }
        int i9 = this.componentCount;
        C c8 = null;
        int i10 = 0;
        while (i10 < i9) {
            c8 = this.components[i10];
            if (c8.endOffset > readerIndex) {
                break;
            }
            c8.free();
            i10++;
        }
        if (i10 == 0) {
            return this;
        }
        C c9 = this.lastAccessed;
        if (c9 != null && c9.endOffset <= readerIndex) {
            this.lastAccessed = null;
        }
        removeCompRange(0, i10);
        int i11 = c8.offset;
        updateComponentOffsets(0);
        setIndex(readerIndex - i11, writerIndex - i11);
        adjustMarkers(i11);
        return this;
    }

    public int forEachByteAsc0(int i, int i8, C0851j jVar) {
        int i9;
        if (i8 <= i) {
            return -1;
        }
        int componentIndex0 = toComponentIndex0(i);
        int i10 = i8 - i;
        while (i10 > 0) {
            C c8 = this.components[componentIndex0];
            if (c8.offset != c8.endOffset) {
                C0185n nVar = c8.buf;
                int idx = c8.idx(i);
                int min = Math.min(i10, c8.endOffset - i);
                if (nVar instanceof C0159a) {
                    i9 = ((C0159a) nVar).forEachByteAsc0(idx, idx + min, jVar);
                } else {
                    i9 = nVar.forEachByte(idx, min, jVar);
                }
                if (i9 != -1) {
                    return i9 - c8.adjustment;
                }
                i += min;
                i10 -= min;
            }
            componentIndex0++;
        }
        return -1;
    }

    public byte getByte(int i) {
        C findComponent = findComponent(i);
        return findComponent.buf.getByte(findComponent.idx(i));
    }

    public boolean hasArray() {
        int i = this.componentCount;
        if (i == 0) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        return this.components[0].buf.hasArray();
    }

    public boolean hasMemoryAddress() {
        int i = this.componentCount;
        if (i == 0) {
            return D0.EMPTY_BUFFER.hasMemoryAddress();
        }
        if (i != 1) {
            return false;
        }
        return this.components[0].buf.hasMemoryAddress();
    }

    public C0185n internalComponent(int i) {
        checkComponentIndex(i);
        return this.components[i].slice();
    }

    public ByteBuffer internalNioBuffer(int i, int i8) {
        int i9 = this.componentCount;
        if (i9 == 0) {
            return EMPTY_NIO_BUFFER;
        }
        if (i9 == 1) {
            return this.components[0].internalNioBuffer(i, i8);
        }
        throw new UnsupportedOperationException();
    }

    public boolean isAccessible() {
        return !this.freed;
    }

    public boolean isDirect() {
        int i = this.componentCount;
        if (i == 0) {
            return false;
        }
        for (int i8 = 0; i8 < i; i8++) {
            if (!this.components[i8].buf.isDirect()) {
                return false;
            }
        }
        return true;
    }

    public Iterator<C0185n> iterator() {
        ensureAccessible();
        if (this.componentCount == 0) {
            return EMPTY_ITERATOR;
        }
        return new D(this, (C0208z) null);
    }

    public long memoryAddress() {
        int i = this.componentCount;
        if (i == 0) {
            return D0.EMPTY_BUFFER.memoryAddress();
        }
        if (i == 1) {
            C c8 = this.components[0];
            return c8.buf.memoryAddress() + ((long) c8.adjustment);
        }
        throw new UnsupportedOperationException();
    }

    public ByteBuffer nioBuffer(int i, int i8) {
        checkIndex(i, i8);
        int i9 = this.componentCount;
        if (i9 == 0) {
            return EMPTY_NIO_BUFFER;
        }
        if (i9 == 1) {
            C c8 = this.components[0];
            C0185n nVar = c8.buf;
            if (nVar.nioBufferCount() == 1) {
                return nVar.nioBuffer(c8.idx(i), i8);
            }
        }
        ByteBuffer[] nioBuffers = nioBuffers(i, i8);
        if (nioBuffers.length == 1) {
            return nioBuffers[0];
        }
        ByteBuffer order = ByteBuffer.allocate(i8).order(order());
        for (ByteBuffer put : nioBuffers) {
            order.put(put);
        }
        order.flip();
        return order;
    }

    public int nioBufferCount() {
        int i = this.componentCount;
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return this.components[0].buf.nioBufferCount();
        }
        int i8 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            i8 += this.components[i9].buf.nioBufferCount();
        }
        return i8;
    }

    public ByteBuffer[] nioBuffers(int i, int i8) {
        checkIndex(i, i8);
        if (i8 == 0) {
            return new ByteBuffer[]{EMPTY_NIO_BUFFER};
        }
        d0 newInstance = d0.newInstance(this.componentCount);
        try {
            int componentIndex0 = toComponentIndex0(i);
            while (i8 > 0) {
                C c8 = this.components[componentIndex0];
                C0185n nVar = c8.buf;
                int min = Math.min(i8, c8.endOffset - i);
                int nioBufferCount = nVar.nioBufferCount();
                if (nioBufferCount != 0) {
                    if (nioBufferCount != 1) {
                        Collections.addAll(newInstance, nVar.nioBuffers(c8.idx(i), min));
                    } else {
                        newInstance.add(nVar.nioBuffer(c8.idx(i), min));
                    }
                    i += min;
                    i8 -= min;
                    componentIndex0++;
                } else {
                    throw new UnsupportedOperationException();
                }
            }
            ByteBuffer[] byteBufferArr = (ByteBuffer[]) newInstance.toArray(C0978k.EMPTY_BYTE_BUFFERS);
            newInstance.recycle();
            return byteBufferArr;
        } catch (Throwable th) {
            newInstance.recycle();
            throw th;
        }
    }

    public int numComponents() {
        return this.componentCount;
    }

    public ByteOrder order() {
        return ByteOrder.BIG_ENDIAN;
    }

    public String toString() {
        String aVar = super.toString();
        StringBuilder B8 = e.B(aVar.substring(0, aVar.length() - 1), ", components=");
        B8.append(this.componentCount);
        B8.append(')');
        return B8.toString();
    }

    public C0185n unwrap() {
        return null;
    }

    public E addComponent(boolean z, int i, C0185n nVar) {
        B.checkNotNull(nVar, "buffer");
        addComponent0(z, i, nVar);
        consolidateIfNeeded();
        return this;
    }

    public int capacity() {
        int i = this.componentCount;
        if (i > 0) {
            return this.components[i - 1].endOffset;
        }
        return 0;
    }

    public E clear() {
        super.clear();
        return this;
    }

    public E discardSomeReadBytes() {
        return discardReadComponents();
    }

    public E ensureWritable(int i) {
        super.ensureWritable(i);
        return this;
    }

    public E readerIndex(int i) {
        super.readerIndex(i);
        return this;
    }

    public E retain() {
        super.retain();
        return this;
    }

    public E setByte(int i, int i8) {
        C findComponent = findComponent(i);
        findComponent.buf.setByte(findComponent.idx(i), i8);
        return this;
    }

    public E setIndex(int i, int i8) {
        super.setIndex(i, i8);
        return this;
    }

    public E setInt(int i, int i8) {
        checkIndex(i, 4);
        _setInt(i, i8);
        return this;
    }

    public E setLong(int i, long j7) {
        checkIndex(i, 8);
        _setLong(i, j7);
        return this;
    }

    public E setMedium(int i, int i8) {
        checkIndex(i, 3);
        _setMedium(i, i8);
        return this;
    }

    public E setShort(int i, int i8) {
        checkIndex(i, 2);
        _setShort(i, i8);
        return this;
    }

    public E setZero(int i, int i8) {
        super.setZero(i, i8);
        return this;
    }

    public E skipBytes(int i) {
        super.skipBytes(i);
        return this;
    }

    public E writeByte(int i) {
        ensureWritable0(1);
        int i8 = this.writerIndex;
        this.writerIndex = i8 + 1;
        _setByte(i8, i);
        return this;
    }

    public E writeInt(int i) {
        super.writeInt(i);
        return this;
    }

    public E writeLong(long j7) {
        super.writeLong(j7);
        return this;
    }

    public E writeMedium(int i) {
        super.writeMedium(i);
        return this;
    }

    public E writeShort(int i) {
        super.writeShort(i);
        return this;
    }

    public E writerIndex(int i) {
        super.writerIndex(i);
        return this;
    }

    public E touch(Object obj) {
        return this;
    }

    public E capacity(int i) {
        checkNewCapacity(i);
        int i8 = this.componentCount;
        int capacity = capacity();
        if (i > capacity) {
            int i9 = i - capacity;
            addComponent0(false, i8, allocBuffer(i9).setIndex(0, i9));
            if (this.componentCount >= this.maxNumComponents) {
                consolidateIfNeeded();
            }
        } else if (i < capacity) {
            this.lastAccessed = null;
            int i10 = i8 - 1;
            int i11 = capacity - i;
            while (true) {
                if (i10 < 0) {
                    break;
                }
                C c8 = this.components[i10];
                int length = c8.length();
                if (i11 < length) {
                    c8.endOffset -= i11;
                    C0185n access$100 = c8.slice;
                    if (access$100 != null) {
                        C0185n unused = c8.slice = access$100.slice(0, c8.length());
                    }
                } else {
                    c8.free();
                    i11 -= length;
                    i10--;
                }
            }
            removeCompRange(i10 + 1, i8);
            if (readerIndex() > i) {
                setIndex0(i, i);
            } else if (this.writerIndex > i) {
                this.writerIndex = i;
            }
        }
        return this;
    }

    public E getBytes(int i, byte[] bArr, int i8, int i9) {
        checkDstIndex(i, i9, i8, bArr.length);
        if (i9 == 0) {
            return this;
        }
        int componentIndex0 = toComponentIndex0(i);
        while (i9 > 0) {
            C c8 = this.components[componentIndex0];
            int min = Math.min(i9, c8.endOffset - i);
            c8.buf.getBytes(c8.idx(i), bArr, i8, min);
            i += min;
            i8 += min;
            i9 -= min;
            componentIndex0++;
        }
        return this;
    }

    public E setBytes(int i, byte[] bArr, int i8, int i9) {
        checkSrcIndex(i, i9, i8, bArr.length);
        if (i9 == 0) {
            return this;
        }
        int componentIndex0 = toComponentIndex0(i);
        while (i9 > 0) {
            C c8 = this.components[componentIndex0];
            int min = Math.min(i9, c8.endOffset - i);
            c8.buf.setBytes(c8.idx(i), bArr, i8, min);
            i += min;
            i8 += min;
            i9 -= min;
            componentIndex0++;
        }
        return this;
    }

    public E readBytes(C0185n nVar) {
        super.readBytes(nVar, nVar.writableBytes());
        return this;
    }

    public E writeBytes(C0185n nVar) {
        super.writeBytes(nVar, nVar.readableBytes());
        return this;
    }

    public E readBytes(C0185n nVar, int i) {
        super.readBytes(nVar, i);
        return this;
    }

    public E writeBytes(C0185n nVar, int i) {
        super.writeBytes(nVar, i);
        return this;
    }

    /* JADX INFO: finally extract failed */
    public E getBytes(int i, ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int remaining = byteBuffer.remaining();
        checkIndex(i, remaining);
        if (remaining == 0) {
            return this;
        }
        int componentIndex0 = toComponentIndex0(i);
        while (remaining > 0) {
            try {
                C c8 = this.components[componentIndex0];
                int min = Math.min(remaining, c8.endOffset - i);
                byteBuffer.limit(byteBuffer.position() + min);
                c8.buf.getBytes(c8.idx(i), byteBuffer);
                i += min;
                remaining -= min;
                componentIndex0++;
            } catch (Throwable th) {
                byteBuffer.limit(limit);
                throw th;
            }
        }
        byteBuffer.limit(limit);
        return this;
    }

    public E readBytes(C0185n nVar, int i, int i8) {
        super.readBytes(nVar, i, i8);
        return this;
    }

    public E writeBytes(C0185n nVar, int i, int i8) {
        super.writeBytes(nVar, i, i8);
        return this;
    }

    public E readBytes(byte[] bArr) {
        super.readBytes(bArr, 0, bArr.length);
        return this;
    }

    /* JADX INFO: finally extract failed */
    public E setBytes(int i, ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int remaining = byteBuffer.remaining();
        checkIndex(i, remaining);
        if (remaining == 0) {
            return this;
        }
        int componentIndex0 = toComponentIndex0(i);
        while (remaining > 0) {
            try {
                C c8 = this.components[componentIndex0];
                int min = Math.min(remaining, c8.endOffset - i);
                byteBuffer.limit(byteBuffer.position() + min);
                c8.buf.setBytes(c8.idx(i), byteBuffer);
                i += min;
                remaining -= min;
                componentIndex0++;
            } catch (Throwable th) {
                byteBuffer.limit(limit);
                throw th;
            }
        }
        byteBuffer.limit(limit);
        return this;
    }

    public E writeBytes(byte[] bArr) {
        super.writeBytes(bArr, 0, bArr.length);
        return this;
    }

    public E readBytes(byte[] bArr, int i, int i8) {
        super.readBytes(bArr, i, i8);
        return this;
    }

    public E writeBytes(byte[] bArr, int i, int i8) {
        super.writeBytes(bArr, i, i8);
        return this;
    }

    public E readBytes(ByteBuffer byteBuffer) {
        super.readBytes(byteBuffer);
        return this;
    }

    public E writeBytes(ByteBuffer byteBuffer) {
        super.writeBytes(byteBuffer);
        return this;
    }

    public E(C0187o oVar, boolean z, int i) {
        this(oVar, z, i, 0);
    }

    public E(C0187o oVar) {
        super(Integer.MAX_VALUE);
        this.alloc = oVar;
        this.direct = false;
        this.maxNumComponents = 0;
        this.components = null;
    }

    public ByteBuffer[] nioBuffers() {
        return nioBuffers(readerIndex(), readableBytes());
    }

    public E getBytes(int i, C0185n nVar, int i8, int i9) {
        checkDstIndex(i, i9, i8, nVar.capacity());
        if (i9 == 0) {
            return this;
        }
        int componentIndex0 = toComponentIndex0(i);
        while (i9 > 0) {
            C c8 = this.components[componentIndex0];
            int min = Math.min(i9, c8.endOffset - i);
            c8.buf.getBytes(c8.idx(i), nVar, i8, min);
            i += min;
            i8 += min;
            i9 -= min;
            componentIndex0++;
        }
        return this;
    }

    public E setBytes(int i, C0185n nVar, int i8, int i9) {
        checkSrcIndex(i, i9, i8, nVar.capacity());
        if (i9 == 0) {
            return this;
        }
        int componentIndex0 = toComponentIndex0(i);
        while (i9 > 0) {
            C c8 = this.components[componentIndex0];
            int min = Math.min(i9, c8.endOffset - i);
            c8.buf.setBytes(c8.idx(i), nVar, i8, min);
            i += min;
            i8 += min;
            i9 -= min;
            componentIndex0++;
        }
        return this;
    }

    public int getBytes(int i, GatheringByteChannel gatheringByteChannel, int i8) {
        if (nioBufferCount() == 1) {
            return gatheringByteChannel.write(internalNioBuffer(i, i8));
        }
        long write = gatheringByteChannel.write(nioBuffers(i, i8));
        if (write > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) write;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003c A[EDGE_INSN: B:17:0x003c->B:16:0x003c ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int setBytes(int r6, java.nio.channels.ScatteringByteChannel r7, int r8) {
        /*
            r5 = this;
            r5.checkIndex(r6, r8)
            if (r8 != 0) goto L_0x000c
            java.nio.ByteBuffer r6 = EMPTY_NIO_BUFFER
            int r6 = r7.read(r6)
            return r6
        L_0x000c:
            int r0 = r5.toComponentIndex0(r6)
            r1 = 0
        L_0x0011:
            S5.C[] r2 = r5.components
            r2 = r2[r0]
            int r3 = r2.endOffset
            int r3 = r3 - r6
            int r3 = java.lang.Math.min(r8, r3)
            if (r3 != 0) goto L_0x0021
        L_0x001e:
            int r0 = r0 + 1
            goto L_0x003a
        L_0x0021:
            S5.n r4 = r2.buf
            int r2 = r2.idx(r6)
            int r2 = r4.setBytes(r2, r7, r3)
            if (r2 != 0) goto L_0x002e
            goto L_0x003c
        L_0x002e:
            if (r2 >= 0) goto L_0x0034
            if (r1 != 0) goto L_0x003c
            r6 = -1
            return r6
        L_0x0034:
            int r6 = r6 + r2
            int r8 = r8 - r2
            int r1 = r1 + r2
            if (r2 != r3) goto L_0x003a
            goto L_0x001e
        L_0x003a:
            if (r8 > 0) goto L_0x0011
        L_0x003c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: S5.E.setBytes(int, java.nio.channels.ScatteringByteChannel, int):int");
    }

    public E setBytes(int i, byte[] bArr) {
        return setBytes(i, bArr, 0, bArr.length);
    }
}
