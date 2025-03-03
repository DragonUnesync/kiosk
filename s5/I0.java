package S5;

public final class I0 extends R0 {
    public I0(L0 l02, int i, int i8) {
        super(l02, i, i8);
    }

    public byte[] allocateArray(int i) {
        byte[] allocateArray = super.allocateArray(i);
        ((L0) alloc()).incrementHeap(allocateArray.length);
        return allocateArray;
    }

    public void freeArray(byte[] bArr) {
        int length = bArr.length;
        super.freeArray(bArr);
        ((L0) alloc()).decrementHeap(length);
    }
}
