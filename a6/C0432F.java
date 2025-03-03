package a6;

/* renamed from: a6.F  reason: case insensitive filesystem */
public final class C0432F {
    static final C0432F DEFAULT = new C0432F(65536, true, false, false, true, true);
    private final boolean allowExtensions;
    private final boolean allowMaskMismatch;
    private final boolean closeOnProtocolViolation;
    private final boolean expectMaskedFrames;
    private final int maxFramePayloadLength;
    private final boolean withUTF8Validator;

    public static C0431E newBuilder() {
        return new C0431E(DEFAULT);
    }

    public boolean allowExtensions() {
        return this.allowExtensions;
    }

    public boolean allowMaskMismatch() {
        return this.allowMaskMismatch;
    }

    public boolean closeOnProtocolViolation() {
        return this.closeOnProtocolViolation;
    }

    public boolean expectMaskedFrames() {
        return this.expectMaskedFrames;
    }

    public int maxFramePayloadLength() {
        return this.maxFramePayloadLength;
    }

    public String toString() {
        return "WebSocketDecoderConfig [maxFramePayloadLength=" + this.maxFramePayloadLength + ", expectMaskedFrames=" + this.expectMaskedFrames + ", allowMaskMismatch=" + this.allowMaskMismatch + ", allowExtensions=" + this.allowExtensions + ", closeOnProtocolViolation=" + this.closeOnProtocolViolation + ", withUTF8Validator=" + this.withUTF8Validator + "]";
    }

    public boolean withUTF8Validator() {
        return this.withUTF8Validator;
    }

    private C0432F(int i, boolean z, boolean z6, boolean z8, boolean z9, boolean z10) {
        this.maxFramePayloadLength = i;
        this.expectMaskedFrames = z;
        this.allowMaskMismatch = z6;
        this.allowExtensions = z8;
        this.closeOnProtocolViolation = z9;
        this.withUTF8Validator = z10;
    }
}
