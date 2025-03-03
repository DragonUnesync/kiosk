package n1;

import S0.i;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;

public final class n extends GLSurfaceView implements o {

    /* renamed from: V  reason: collision with root package name */
    public static final /* synthetic */ int f13663V = 0;

    /* renamed from: U  reason: collision with root package name */
    public final m f13664U;

    public n(Context context) {
        super(context, (AttributeSet) null);
        m mVar = new m(this);
        this.f13664U = mVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(mVar);
        setRenderMode(0);
    }

    @Deprecated
    public o getVideoDecoderOutputBufferRenderer() {
        return this;
    }

    public void setOutputBuffer(i iVar) {
        m mVar = this.f13664U;
        if (mVar.f13661Z.getAndSet(iVar) == null) {
            mVar.f13656U.requestRender();
            return;
        }
        throw new ClassCastException();
    }
}
