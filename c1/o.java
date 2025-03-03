package c1;

import M0.r;

public final class o extends Exception {

    /* renamed from: U  reason: collision with root package name */
    public final String f8804U;

    /* renamed from: V  reason: collision with root package name */
    public final boolean f8805V;

    /* renamed from: W  reason: collision with root package name */
    public final n f8806W;

    /* renamed from: X  reason: collision with root package name */
    public final String f8807X;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public o(r rVar, s sVar, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + rVar, sVar, rVar.f3036n, z, (n) null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i));
    }

    public o(String str, Throwable th, String str2, boolean z, n nVar, String str3) {
        super(str, th);
        this.f8804U = str2;
        this.f8805V = z;
        this.f8806W = nVar;
        this.f8807X = str3;
    }
}
