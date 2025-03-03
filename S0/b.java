package S0;

import P0.z;
import R2.c;
import android.media.MediaCodec;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f4376a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f4377b;

    /* renamed from: c  reason: collision with root package name */
    public int f4378c;

    /* renamed from: d  reason: collision with root package name */
    public int[] f4379d;
    public int[] e;

    /* renamed from: f  reason: collision with root package name */
    public int f4380f;

    /* renamed from: g  reason: collision with root package name */
    public int f4381g;

    /* renamed from: h  reason: collision with root package name */
    public int f4382h;
    public final MediaCodec.CryptoInfo i;

    /* renamed from: j  reason: collision with root package name */
    public final c f4383j;

    public b() {
        c cVar;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.i = cryptoInfo;
        if (z.f3748a >= 24) {
            cVar = new c(cryptoInfo);
        } else {
            cVar = null;
        }
        this.f4383j = cVar;
    }
}
