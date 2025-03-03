package Y1;

import W2.m;
import androidx.media3.ui.AspectRatioFrameLayout;
import com.bumptech.glide.j;
import com.bumptech.glide.manager.l;
import com.bumptech.glide.manager.n;
import com.bumptech.glide.manager.p;

/* renamed from: Y1.b  reason: case insensitive filesystem */
public final class C0369b implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f6377U;

    /* renamed from: V  reason: collision with root package name */
    public boolean f6378V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ Object f6379W;

    public /* synthetic */ C0369b(Object obj, boolean z, int i) {
        this.f6377U = i;
        this.f6379W = obj;
        this.f6378V = z;
    }

    public final void run() {
        Object obj = this.f6379W;
        switch (this.f6377U) {
            case 0:
                this.f6378V = false;
                int i = AspectRatioFrameLayout.f8205a0;
                ((AspectRatioFrameLayout) obj).getClass();
                return;
            case 1:
                n nVar = (n) obj;
                nVar.getClass();
                m.a();
                j jVar = nVar.f9068a;
                boolean z = jVar.f9007U;
                boolean z6 = this.f6378V;
                jVar.f9007U = z6;
                if (z != z6) {
                    ((l) jVar.f9008V).a(z6);
                    return;
                }
                return;
            default:
                ((p) obj).f9073V.a(this.f6378V);
                return;
        }
    }

    public C0369b(AspectRatioFrameLayout aspectRatioFrameLayout) {
        this.f6377U = 0;
        this.f6379W = aspectRatioFrameLayout;
    }
}
