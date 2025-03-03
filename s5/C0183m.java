package S5;

import e6.C0851j;
import e6.L;
import e6.U;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;
import java.util.Iterator;

/* renamed from: S5.m  reason: case insensitive filesystem */
public final class C0183m extends A0 {
    public C0183m(E e, U u3) {
        super(e, u3);
    }

    public E addComponent(boolean z, C0185n nVar) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.addComponent(z, nVar);
    }

    public E addFlattenedComponents(boolean z, C0185n nVar) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.addFlattenedComponents(z, nVar);
    }

    public C0185n asReadOnly() {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.asReadOnly();
    }

    public E discardReadComponents() {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.discardReadComponents();
    }

    public C0185n duplicate() {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.duplicate();
    }

    public int forEachByte(int i, int i8, C0851j jVar) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.forEachByte(i, i8, jVar);
    }

    public byte getByte(int i) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.getByte(i);
    }

    public int getInt(int i) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.getInt(i);
    }

    public int getIntLE(int i) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.getIntLE(i);
    }

    public long getLong(int i) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.getLong(i);
    }

    public long getLongLE(int i) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.getLongLE(i);
    }

    public int getMedium(int i) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.getMedium(i);
    }

    public short getShort(int i) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.getShort(i);
    }

    public short getShortLE(int i) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.getShortLE(i);
    }

    public short getUnsignedByte(int i) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.getUnsignedByte(i);
    }

    public long getUnsignedInt(int i) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.getUnsignedInt(i);
    }

    public long getUnsignedIntLE(int i) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.getUnsignedIntLE(i);
    }

    public int getUnsignedMedium(int i) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.getUnsignedMedium(i);
    }

    public int getUnsignedShort(int i) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.getUnsignedShort(i);
    }

    public int indexOf(int i, int i8, byte b8) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.indexOf(i, i8, b8);
    }

    public ByteBuffer internalNioBuffer(int i, int i8) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.internalNioBuffer(i, i8);
    }

    public boolean isReadOnly() {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.isReadOnly();
    }

    public Iterator<C0185n> iterator() {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.iterator();
    }

    public ByteBuffer nioBuffer() {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.nioBuffer();
    }

    public int nioBufferCount() {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.nioBufferCount();
    }

    public ByteBuffer[] nioBuffers() {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.nioBuffers();
    }

    public C0185n order(ByteOrder byteOrder) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.order(byteOrder);
    }

    public byte readByte() {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.readByte();
    }

    public int readInt() {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.readInt();
    }

    public long readLong() {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.readLong();
    }

    public C0185n readRetainedSlice(int i) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.readRetainedSlice(i);
    }

    public short readShort() {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.readShort();
    }

    public C0185n readSlice(int i) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.readSlice(i);
    }

    public short readUnsignedByte() {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.readUnsignedByte();
    }

    public long readUnsignedInt() {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.readUnsignedInt();
    }

    public int readUnsignedShort() {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.readUnsignedShort();
    }

    public boolean release() {
        ((L) this.leak).record();
        return super.release();
    }

    public C0185n retainedDuplicate() {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.retainedDuplicate();
    }

    public C0185n retainedSlice() {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.retainedSlice();
    }

    public int setCharSequence(int i, CharSequence charSequence, Charset charset) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.setCharSequence(i, charSequence, charset);
    }

    public C0185n slice() {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.slice();
    }

    public String toString(Charset charset) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.toString(charset);
    }

    public int writeCharSequence(CharSequence charSequence, Charset charset) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.writeCharSequence(charSequence, charset);
    }

    public E capacity(int i) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.capacity(i);
    }

    public E discardSomeReadBytes() {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.discardSomeReadBytes();
    }

    public E ensureWritable(int i) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.ensureWritable(i);
    }

    public C0181l newLeakAwareByteBuf(C0185n nVar, C0185n nVar2, U u3) {
        return new C0181l(nVar, nVar2, u3);
    }

    public E retain() {
        ((L) this.leak).record();
        return super.retain();
    }

    public E setByte(int i, int i8) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.setByte(i, i8);
    }

    public E setInt(int i, int i8) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.setInt(i, i8);
    }

    public E setLong(int i, long j7) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.setLong(i, j7);
    }

    public E setMedium(int i, int i8) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.setMedium(i, i8);
    }

    public E setShort(int i, int i8) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.setShort(i, i8);
    }

    public E setZero(int i, int i8) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.setZero(i, i8);
    }

    public E skipBytes(int i) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.skipBytes(i);
    }

    public E writeByte(int i) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.writeByte(i);
    }

    public E writeInt(int i) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.writeInt(i);
    }

    public E writeLong(long j7) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.writeLong(j7);
    }

    public E writeMedium(int i) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.writeMedium(i);
    }

    public E writeShort(int i) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.writeShort(i);
    }

    public E addComponent(boolean z, int i, C0185n nVar) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.addComponent(z, i, nVar);
    }

    public ByteBuffer nioBuffer(int i, int i8) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.nioBuffer(i, i8);
    }

    public ByteBuffer[] nioBuffers(int i, int i8) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.nioBuffers(i, i8);
    }

    public C0185n retainedSlice(int i, int i8) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.retainedSlice(i, i8);
    }

    public C0185n slice(int i, int i8) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.slice(i, i8);
    }

    public String toString(int i, int i8, Charset charset) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.toString(i, i8, charset);
    }

    public E touch(Object obj) {
        ((L) this.leak).record(obj);
        return this;
    }

    public int ensureWritable(int i, boolean z) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.ensureWritable(i, z);
    }

    public E getBytes(int i, C0185n nVar, int i8, int i9) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.getBytes(i, nVar, i8, i9);
    }

    public E setBytes(int i, C0185n nVar, int i8, int i9) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.setBytes(i, nVar, i8, i9);
    }

    public E getBytes(int i, byte[] bArr, int i8, int i9) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.getBytes(i, bArr, i8, i9);
    }

    public C0185n readBytes(int i) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.readBytes(i);
    }

    public E setBytes(int i, byte[] bArr) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.setBytes(i, bArr);
    }

    public E writeBytes(C0185n nVar) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.writeBytes(nVar);
    }

    public E getBytes(int i, ByteBuffer byteBuffer) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.getBytes(i, byteBuffer);
    }

    public E readBytes(C0185n nVar) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.readBytes(nVar);
    }

    public E setBytes(int i, byte[] bArr, int i8, int i9) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.setBytes(i, bArr, i8, i9);
    }

    public E writeBytes(C0185n nVar, int i) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.writeBytes(nVar, i);
    }

    public int getBytes(int i, GatheringByteChannel gatheringByteChannel, int i8) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.getBytes(i, gatheringByteChannel, i8);
    }

    public E readBytes(C0185n nVar, int i) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.readBytes(nVar, i);
    }

    public E setBytes(int i, ByteBuffer byteBuffer) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.setBytes(i, byteBuffer);
    }

    public E writeBytes(C0185n nVar, int i, int i8) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.writeBytes(nVar, i, i8);
    }

    public E readBytes(C0185n nVar, int i, int i8) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.readBytes(nVar, i, i8);
    }

    public int setBytes(int i, ScatteringByteChannel scatteringByteChannel, int i8) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.setBytes(i, scatteringByteChannel, i8);
    }

    public E writeBytes(byte[] bArr) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.writeBytes(bArr);
    }

    public E readBytes(byte[] bArr) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.readBytes(bArr);
    }

    public E writeBytes(byte[] bArr, int i, int i8) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.writeBytes(bArr, i, i8);
    }

    public E readBytes(byte[] bArr, int i, int i8) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.readBytes(bArr, i, i8);
    }

    public E writeBytes(ByteBuffer byteBuffer) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.writeBytes(byteBuffer);
    }

    public E readBytes(ByteBuffer byteBuffer) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.readBytes(byteBuffer);
    }

    public int writeBytes(ScatteringByteChannel scatteringByteChannel, int i) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.writeBytes(scatteringByteChannel, i);
    }

    public int readBytes(GatheringByteChannel gatheringByteChannel, int i) {
        C0181l.recordLeakNonRefCountingOperation(this.leak);
        return super.readBytes(gatheringByteChannel, i);
    }
}
