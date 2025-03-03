package a6;

import g6.B;

/* renamed from: a6.E  reason: case insensitive filesystem */
public final class C0431E {
    private boolean allowExtensions;
    private boolean allowMaskMismatch;
    private boolean closeOnProtocolViolation;
    private boolean expectMaskedFrames;
    private int maxFramePayloadLength;
    private boolean withUTF8Validator;

    public C0431E allowExtensions(boolean z) {
        this.allowExtensions = z;
        return this;
    }

    public C0431E allowMaskMismatch(boolean z) {
        this.allowMaskMismatch = z;
        return this;
    }

    public C0432F build() {
        return new C0432F(this.maxFramePayloadLength, this.expectMaskedFrames, this.allowMaskMismatch, this.allowExtensions, this.closeOnProtocolViolation, this.withUTF8Validator);
    }

    public C0431E expectMaskedFrames(boolean z) {
        this.expectMaskedFrames = z;
        return this;
    }

    public C0431E maxFramePayloadLength(int i) {
        this.maxFramePayloadLength = i;
        return this;
    }

    private C0431E(C0432F f8) {
        B.checkNotNull(f8, "decoderConfig");
        this.maxFramePayloadLength = f8.maxFramePayloadLength();
        this.expectMaskedFrames = f8.expectMaskedFrames();
        this.allowMaskMismatch = f8.allowMaskMismatch();
        this.allowExtensions = f8.allowExtensions();
        this.closeOnProtocolViolation = f8.closeOnProtocolViolation();
        this.withUTF8Validator = f8.withUTF8Validator();
    }
}
