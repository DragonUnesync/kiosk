package G3;

import M0.g0;
import T0.C0218j;
import U0.f;
import android.util.Base64;

public final /* synthetic */ class k implements i {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f1652U;

    public /* synthetic */ k(int i) {
        this.f1652U = i;
    }

    public final Object get() {
        switch (this.f1652U) {
            case 0:
                throw new IllegalStateException();
            case 1:
                return new C0218j();
            case 2:
                byte[] bArr = new byte[12];
                f.i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            default:
                try {
                    Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                    Object invoke = cls.getMethod("build", (Class[]) null).invoke(cls.getConstructor((Class[]) null).newInstance((Object[]) null), (Object[]) null);
                    invoke.getClass();
                    return (g0) invoke;
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
        }
    }
}
