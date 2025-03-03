package S5;

import e6.C0851j;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;

public abstract class G extends C0165d {
    private final C0185n buffer;

    public G(C0185n nVar) {
        this(nVar, nVar.readerIndex(), nVar.writerIndex());
    }

    public C0187o alloc() {
        return unwrap().alloc();
    }

    public byte[] array() {
        return unwrap().array();
    }

    public int arrayOffset() {
        return unwrap().arrayOffset();
    }

    public int capacity() {
        return unwrap().capacity();
    }

    public int forEachByte(int i, int i8, C0851j jVar) {
        return unwrap().forEachByte(i, i8, jVar);
    }

    public byte getByte(int i) {
        return unwrap().getByte(i);
    }

    public C0185n getBytes(int i, C0185n nVar, int i8, int i9) {
        unwrap().getBytes(i, nVar, i8, i9);
        return this;
    }

    public int getInt(int i) {
        return unwrap().getInt(i);
    }

    public int getIntLE(int i) {
        return unwrap().getIntLE(i);
    }

    public long getLong(int i) {
        return unwrap().getLong(i);
    }

    public long getLongLE(int i) {
        return unwrap().getLongLE(i);
    }

    public short getShort(int i) {
        return unwrap().getShort(i);
    }

    public short getShortLE(int i) {
        return unwrap().getShortLE(i);
    }

    public int getUnsignedMedium(int i) {
        return unwrap().getUnsignedMedium(i);
    }

    public boolean hasArray() {
        return unwrap().hasArray();
    }

    public boolean hasMemoryAddress() {
        return unwrap().hasMemoryAddress();
    }

    public boolean isDirect() {
        return unwrap().isDirect();
    }

    public long memoryAddress() {
        return unwrap().memoryAddress();
    }

    public int nioBufferCount() {
        return unwrap().nioBufferCount();
    }

    public ByteBuffer[] nioBuffers(int i, int i8) {
        return unwrap().nioBuffers(i, i8);
    }

    @Deprecated
    public ByteOrder order() {
        return unwrap().order();
    }

    public C0185n setByte(int i, int i8) {
        unwrap().setByte(i, i8);
        return this;
    }

    public C0185n setBytes(int i, byte[] bArr, int i8, int i9) {
        unwrap().setBytes(i, bArr, i8, i9);
        return this;
    }

    public C0185n setInt(int i, int i8) {
        unwrap().setInt(i, i8);
        return this;
    }

    public C0185n setLong(int i, long j7) {
        unwrap().setLong(i, j7);
        return this;
    }

    public C0185n setMedium(int i, int i8) {
        unwrap().setMedium(i, i8);
        return this;
    }

    public C0185n setShort(int i, int i8) {
        unwrap().setShort(i, i8);
        return this;
    }

    public C0185n slice(int i, int i8) {
        return unwrap().slice(i, i8);
    }

    public C0185n unwrap() {
        return this.buffer;
    }

    public G(C0185n nVar, int i, int i8) {
        super(nVar.maxCapacity());
        if (nVar instanceof G) {
            this.buffer = ((G) nVar).buffer;
        } else if (nVar instanceof C0171g) {
            this.buffer = nVar.unwrap();
        } else {
            this.buffer = nVar;
        }
        setIndex(i, i8);
        markReaderIndex();
        markWriterIndex();
    }

    public C0185n capacity(int i) {
        unwrap().capacity(i);
        return this;
    }

    public C0185n getBytes(int i, byte[] bArr, int i8, int i9) {
        unwrap().getBytes(i, bArr, i8, i9);
        return this;
    }

    public C0185n setBytes(int i, C0185n nVar, int i8, int i9) {
        unwrap().setBytes(i, nVar, i8, i9);
        return this;
    }

    public C0185n getBytes(int i, ByteBuffer byteBuffer) {
        unwrap().getBytes(i, byteBuffer);
        return this;
    }

    public C0185n setBytes(int i, ByteBuffer byteBuffer) {
        unwrap().setBytes(i, byteBuffer);
        return this;
    }

    public int getBytes(int i, GatheringByteChannel gatheringByteChannel, int i8) {
        return unwrap().getBytes(i, gatheringByteChannel, i8);
    }

    public int setBytes(int i, ScatteringByteChannel scatteringByteChannel, int i8) {
        return unwrap().setBytes(i, scatteringByteChannel, i8);
    }
}
