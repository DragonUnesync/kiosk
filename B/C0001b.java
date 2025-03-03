package B;

import D.Y;
import android.media.ImageReader;
import com.bumptech.glide.manager.q;
import java.util.concurrent.Executor;

/* renamed from: B.b  reason: case insensitive filesystem */
public final /* synthetic */ class C0001b implements ImageReader.OnImageAvailableListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q f213a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Executor f214b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Y f215c;

    public /* synthetic */ C0001b(q qVar, Executor executor, Y y8) {
        this.f213a = qVar;
        this.f214b = executor;
        this.f215c = y8;
    }

    public final void onImageAvailable(ImageReader imageReader) {
        q qVar = this.f213a;
        Executor executor = this.f214b;
        Y y8 = this.f215c;
        synchronized (qVar.f9082X) {
            try {
                if (!qVar.f9080V) {
                    executor.execute(new C0002c((Object) qVar, 0, (Object) y8));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
