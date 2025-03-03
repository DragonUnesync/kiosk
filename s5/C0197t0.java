package S5;

import g6.C0965A;
import g6.C0989w;
import g6.Y;
import java.nio.ByteBuffer;

/* renamed from: S5.t0  reason: case insensitive filesystem */
public final class C0197t0 extends C0170f0 {
    private static final C0965A RECYCLER = C0965A.newPool(new C0195s0());
    private long memoryAddress;

    public /* synthetic */ C0197t0(C0989w wVar, int i, C0195s0 s0Var) {
        this(wVar, i);
    }

    private long addr(int i) {
        return this.memoryAddress + ((long) i);
    }

    private void initMemoryAddress() {
        this.memoryAddress = Y.directBufferAddress((ByteBuffer) this.memory) + ((long) this.offset);
    }

    public static C0197t0 newInstance(int i) {
        C0197t0 t0Var = (C0197t0) RECYCLER.get();
        t0Var.reuse(i);
        return t0Var;
    }

    public byte _getByte(int i) {
        return U0.getByte(addr(i));
    }

    public int _getInt(int i) {
        return U0.getInt(addr(i));
    }

    public int _getIntLE(int i) {
        return U0.getIntLE(addr(i));
    }

    public long _getLong(int i) {
        return U0.getLong(addr(i));
    }

    public long _getLongLE(int i) {
        return U0.getLongLE(addr(i));
    }

    public short _getShort(int i) {
        return U0.getShort(addr(i));
    }

    public short _getShortLE(int i) {
        return U0.getShortLE(addr(i));
    }

    public int _getUnsignedMedium(int i) {
        return U0.getUnsignedMedium(addr(i));
    }

    public void _setByte(int i, int i8) {
        U0.setByte(addr(i), (byte) i8);
    }

    public void _setInt(int i, int i8) {
        U0.setInt(addr(i), i8);
    }

    public void _setLong(int i, long j7) {
        U0.setLong(addr(i), j7);
    }

    public void _setMedium(int i, int i8) {
        U0.setMedium(addr(i), i8);
    }

    public void _setShort(int i, int i8) {
        U0.setShort(addr(i), i8);
    }

    public byte[] array() {
        throw new UnsupportedOperationException("direct buffer");
    }

    public int arrayOffset() {
        throw new UnsupportedOperationException("direct buffer");
    }

    public C0185n getBytes(int i, C0185n nVar, int i8, int i9) {
        U0.getBytes((C0159a) this, addr(i), i, nVar, i8, i9);
        return this;
    }

    public boolean hasArray() {
        return false;
    }

    public boolean hasMemoryAddress() {
        return true;
    }

    public void init(T t8, ByteBuffer byteBuffer, long j7, int i, int i8, int i9, C0168e0 e0Var) {
        super.init(t8, byteBuffer, j7, i, i8, i9, e0Var);
        initMemoryAddress();
    }

    public void initUnpooled(T t8, int i) {
        super.initUnpooled(t8, i);
        initMemoryAddress();
    }

    public boolean isDirect() {
        return true;
    }

    public long memoryAddress() {
        ensureAccessible();
        return this.memoryAddress;
    }

    public C0 newSwappedByteBuf() {
        if (Y.isUnaligned()) {
            return new V0(this);
        }
        return super.newSwappedByteBuf();
    }

    public C0185n setBytes(int i, C0185n nVar, int i8, int i9) {
        U0.setBytes((C0159a) this, addr(i), i, nVar, i8, i9);
        return this;
    }

    public C0185n setZero(int i, int i8) {
        checkIndex(i, i8);
        U0.setZero(addr(i), i8);
        return this;
    }

    private C0197t0(C0989w wVar, int i) {
        super(wVar, i);
    }

    public C0185n getBytes(int i, byte[] bArr, int i8, int i9) {
        U0.getBytes((C0159a) this, addr(i), i, bArr, i8, i9);
        return this;
    }

    public ByteBuffer newInternalNioBuffer(ByteBuffer byteBuffer) {
        return byteBuffer.duplicate();
    }

    public C0185n setBytes(int i, byte[] bArr, int i8, int i9) {
        U0.setBytes((C0159a) this, addr(i), i, bArr, i8, i9);
        return this;
    }

    public C0185n getBytes(int i, ByteBuffer byteBuffer) {
        U0.getBytes(this, addr(i), i, byteBuffer);
        return this;
    }

    public C0185n setBytes(int i, ByteBuffer byteBuffer) {
        U0.setBytes(this, addr(i), i, byteBuffer);
        return this;
    }
}
