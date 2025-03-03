package S5;

import e6.C0851j;
import e6.L;
import e6.P;
import e6.U;
import g6.p0;
import h6.C1082c;
import h6.d;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;

/* renamed from: S5.l  reason: case insensitive filesystem */
public final class C0181l extends z0 {
    private static final boolean ACQUIRE_AND_RELEASE_ONLY;
    private static final C1082c logger;

    static {
        Class<C0181l> cls = C0181l.class;
        C1082c instance = d.getInstance((Class<?>) cls);
        logger = instance;
        boolean z = p0.getBoolean("io.netty.leakDetection.acquireAndReleaseOnly", false);
        ACQUIRE_AND_RELEASE_ONLY = z;
        if (instance.isDebugEnabled()) {
            instance.debug("-D{}: {}", "io.netty.leakDetection.acquireAndReleaseOnly", Boolean.valueOf(z));
        }
        P.addExclusions(cls, "touch", "recordLeakNonRefCountingOperation");
    }

    public C0181l(C0185n nVar, U u3) {
        super(nVar, u3);
    }

    public static void recordLeakNonRefCountingOperation(U u3) {
        if (!ACQUIRE_AND_RELEASE_ONLY) {
            ((L) u3).record();
        }
    }

    public C0185n asReadOnly() {
        recordLeakNonRefCountingOperation(this.leak);
        return super.asReadOnly();
    }

    public C0185n capacity(int i) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.capacity(i);
    }

    public C0185n discardSomeReadBytes() {
        recordLeakNonRefCountingOperation(this.leak);
        return super.discardSomeReadBytes();
    }

    public C0185n duplicate() {
        recordLeakNonRefCountingOperation(this.leak);
        return super.duplicate();
    }

    public C0185n ensureWritable(int i) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.ensureWritable(i);
    }

    public int forEachByte(int i, int i8, C0851j jVar) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.forEachByte(i, i8, jVar);
    }

    public byte getByte(int i) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.getByte(i);
    }

    public C0185n getBytes(int i, C0185n nVar, int i8, int i9) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.getBytes(i, nVar, i8, i9);
    }

    public int getInt(int i) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.getInt(i);
    }

    public int getIntLE(int i) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.getIntLE(i);
    }

    public long getLong(int i) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.getLong(i);
    }

    public long getLongLE(int i) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.getLongLE(i);
    }

    public int getMedium(int i) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.getMedium(i);
    }

    public short getShort(int i) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.getShort(i);
    }

    public short getShortLE(int i) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.getShortLE(i);
    }

    public short getUnsignedByte(int i) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.getUnsignedByte(i);
    }

    public long getUnsignedInt(int i) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.getUnsignedInt(i);
    }

    public long getUnsignedIntLE(int i) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.getUnsignedIntLE(i);
    }

    public int getUnsignedMedium(int i) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.getUnsignedMedium(i);
    }

    public int getUnsignedShort(int i) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.getUnsignedShort(i);
    }

    public int indexOf(int i, int i8, byte b8) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.indexOf(i, i8, b8);
    }

    public ByteBuffer internalNioBuffer(int i, int i8) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.internalNioBuffer(i, i8);
    }

    public ByteBuffer nioBuffer() {
        recordLeakNonRefCountingOperation(this.leak);
        return super.nioBuffer();
    }

    public int nioBufferCount() {
        recordLeakNonRefCountingOperation(this.leak);
        return super.nioBufferCount();
    }

    public ByteBuffer[] nioBuffers() {
        recordLeakNonRefCountingOperation(this.leak);
        return super.nioBuffers();
    }

    public C0185n order(ByteOrder byteOrder) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.order(byteOrder);
    }

    public byte readByte() {
        recordLeakNonRefCountingOperation(this.leak);
        return super.readByte();
    }

    public C0185n readBytes(int i) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.readBytes(i);
    }

    public int readInt() {
        recordLeakNonRefCountingOperation(this.leak);
        return super.readInt();
    }

    public long readLong() {
        recordLeakNonRefCountingOperation(this.leak);
        return super.readLong();
    }

    public C0185n readRetainedSlice(int i) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.readRetainedSlice(i);
    }

    public short readShort() {
        recordLeakNonRefCountingOperation(this.leak);
        return super.readShort();
    }

    public C0185n readSlice(int i) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.readSlice(i);
    }

    public short readUnsignedByte() {
        recordLeakNonRefCountingOperation(this.leak);
        return super.readUnsignedByte();
    }

    public long readUnsignedInt() {
        recordLeakNonRefCountingOperation(this.leak);
        return super.readUnsignedInt();
    }

    public int readUnsignedShort() {
        recordLeakNonRefCountingOperation(this.leak);
        return super.readUnsignedShort();
    }

    public boolean release() {
        ((L) this.leak).record();
        return super.release();
    }

    public C0185n retain() {
        ((L) this.leak).record();
        return super.retain();
    }

    public C0185n retainedDuplicate() {
        recordLeakNonRefCountingOperation(this.leak);
        return super.retainedDuplicate();
    }

    public C0185n retainedSlice() {
        recordLeakNonRefCountingOperation(this.leak);
        return super.retainedSlice();
    }

    public C0185n setByte(int i, int i8) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.setByte(i, i8);
    }

    public C0185n setBytes(int i, C0185n nVar, int i8, int i9) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.setBytes(i, nVar, i8, i9);
    }

    public int setCharSequence(int i, CharSequence charSequence, Charset charset) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.setCharSequence(i, charSequence, charset);
    }

    public C0185n setInt(int i, int i8) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.setInt(i, i8);
    }

    public C0185n setLong(int i, long j7) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.setLong(i, j7);
    }

    public C0185n setMedium(int i, int i8) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.setMedium(i, i8);
    }

    public C0185n setShort(int i, int i8) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.setShort(i, i8);
    }

    public C0185n setZero(int i, int i8) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.setZero(i, i8);
    }

    public C0185n skipBytes(int i) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.skipBytes(i);
    }

    public C0185n slice() {
        recordLeakNonRefCountingOperation(this.leak);
        return super.slice();
    }

    public String toString(Charset charset) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.toString(charset);
    }

    public C0185n writeByte(int i) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.writeByte(i);
    }

    public C0185n writeBytes(C0185n nVar) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.writeBytes(nVar);
    }

    public int writeCharSequence(CharSequence charSequence, Charset charset) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.writeCharSequence(charSequence, charset);
    }

    public C0185n writeInt(int i) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.writeInt(i);
    }

    public C0185n writeLong(long j7) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.writeLong(j7);
    }

    public C0185n writeMedium(int i) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.writeMedium(i);
    }

    public C0185n writeShort(int i) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.writeShort(i);
    }

    public C0181l(C0185n nVar, C0185n nVar2, U u3) {
        super(nVar, nVar2, u3);
    }

    public C0181l newLeakAwareByteBuf(C0185n nVar, C0185n nVar2, U u3) {
        return new C0181l(nVar, nVar2, u3);
    }

    public C0185n touch(Object obj) {
        ((L) this.leak).record(obj);
        return this;
    }

    public int ensureWritable(int i, boolean z) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.ensureWritable(i, z);
    }

    public C0185n getBytes(int i, byte[] bArr, int i8, int i9) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.getBytes(i, bArr, i8, i9);
    }

    public ByteBuffer nioBuffer(int i, int i8) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.nioBuffer(i, i8);
    }

    public ByteBuffer[] nioBuffers(int i, int i8) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.nioBuffers(i, i8);
    }

    public C0185n readBytes(C0185n nVar) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.readBytes(nVar);
    }

    public C0185n setBytes(int i, byte[] bArr, int i8, int i9) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.setBytes(i, bArr, i8, i9);
    }

    public C0185n slice(int i, int i8) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.slice(i, i8);
    }

    public C0185n writeBytes(C0185n nVar, int i, int i8) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.writeBytes(nVar, i, i8);
    }

    public C0185n getBytes(int i, ByteBuffer byteBuffer) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.getBytes(i, byteBuffer);
    }

    public C0185n readBytes(byte[] bArr) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.readBytes(bArr);
    }

    public C0185n setBytes(int i, ByteBuffer byteBuffer) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.setBytes(i, byteBuffer);
    }

    public C0185n writeBytes(byte[] bArr) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.writeBytes(bArr);
    }

    public int getBytes(int i, GatheringByteChannel gatheringByteChannel, int i8) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.getBytes(i, gatheringByteChannel, i8);
    }

    public C0185n readBytes(ByteBuffer byteBuffer) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.readBytes(byteBuffer);
    }

    public int setBytes(int i, ScatteringByteChannel scatteringByteChannel, int i8) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.setBytes(i, scatteringByteChannel, i8);
    }

    public C0185n writeBytes(byte[] bArr, int i, int i8) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.writeBytes(bArr, i, i8);
    }

    public int readBytes(GatheringByteChannel gatheringByteChannel, int i) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.readBytes(gatheringByteChannel, i);
    }

    public C0185n writeBytes(ByteBuffer byteBuffer) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.writeBytes(byteBuffer);
    }

    public int writeBytes(ScatteringByteChannel scatteringByteChannel, int i) {
        recordLeakNonRefCountingOperation(this.leak);
        return super.writeBytes(scatteringByteChannel, i);
    }
}
