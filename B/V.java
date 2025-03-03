package B;

import androidx.camera.core.ImageProcessingUtil;

public final /* synthetic */ class V implements C0024z {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f205U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ W f206V;

    public /* synthetic */ V(W w2, W w4, int i) {
        this.f205U = i;
        this.f206V = w4;
    }

    public final void a(A a8) {
        W w2 = this.f206V;
        switch (this.f205U) {
            case 0:
                int i = ImageProcessingUtil.f7640a;
                if (w2 != null) {
                    w2.close();
                    return;
                }
                return;
            default:
                int i8 = ImageProcessingUtil.f7640a;
                w2.close();
                return;
        }
    }
}
