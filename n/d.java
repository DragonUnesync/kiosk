package N;

import B.C0009j;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import u0.C1486a;

public final /* synthetic */ class d implements C1486a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f3209a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SurfaceTexture f3210b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Surface f3211c;

    public /* synthetic */ d(f fVar, SurfaceTexture surfaceTexture, Surface surface) {
        this.f3209a = fVar;
        this.f3210b = surfaceTexture;
        this.f3211c = surface;
    }

    public final void accept(Object obj) {
        C0009j jVar = (C0009j) obj;
        f fVar = this.f3209a;
        fVar.getClass();
        SurfaceTexture surfaceTexture = this.f3210b;
        surfaceTexture.setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener) null);
        surfaceTexture.release();
        this.f3211c.release();
        fVar.f3216Y--;
        fVar.a();
    }
}
