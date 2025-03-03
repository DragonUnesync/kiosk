package Z5;

public abstract class l0 extends g0 {
    private static final m0 UNKNOWN_STATUS = new m0(999, "Unknown");

    public l0(int i, int i8, int i9, boolean z) {
        super(i, i8, i9, true, z);
    }

    public N createInvalidMessage() {
        return new C0389g(r0.HTTP_1_0, UNKNOWN_STATUS, this.validateHeaders);
    }

    public N createMessage(String[] strArr) {
        return new C0399q(r0.valueOf(strArr[0]), m0.valueOf(Integer.parseInt(strArr[1]), strArr[2]), this.validateHeaders);
    }

    public boolean isDecodingRequest() {
        return false;
    }
}
