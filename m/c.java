package M;

import B.C0022x;
import D.O;
import E.f;
import F.e;
import F.h;
import O.g;
import O.i;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import com.bumptech.glide.d;
import de.ozerov.fully.C0663a0;
import g7.C0996d;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import n2.a;

public final class c implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: U  reason: collision with root package name */
    public final e f2719U;

    /* renamed from: V  reason: collision with root package name */
    public final HandlerThread f2720V;

    /* renamed from: W  reason: collision with root package name */
    public final e f2721W;

    /* renamed from: X  reason: collision with root package name */
    public final Handler f2722X;

    /* renamed from: Y  reason: collision with root package name */
    public final AtomicBoolean f2723Y = new AtomicBoolean(false);

    /* renamed from: Z  reason: collision with root package name */
    public final float[] f2724Z = new float[16];

    /* renamed from: a0  reason: collision with root package name */
    public final float[] f2725a0 = new float[16];

    /* renamed from: b0  reason: collision with root package name */
    public final LinkedHashMap f2726b0 = new LinkedHashMap();

    /* renamed from: c0  reason: collision with root package name */
    public int f2727c0 = 0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f2728d0 = false;

    /* renamed from: e0  reason: collision with root package name */
    public final ArrayList f2729e0 = new ArrayList();

    public c(C0022x xVar) {
        Map emptyMap = Collections.emptyMap();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.f2720V = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f2722X = handler;
        this.f2721W = new e(handler);
        this.f2719U = new e();
        try {
            d.i(new O(this, xVar, emptyMap, 1)).get();
        } catch (InterruptedException | ExecutionException e) {
            e = e;
            e = e instanceof ExecutionException ? e.getCause() : e;
            if (e instanceof RuntimeException) {
                throw ((RuntimeException) e);
            }
            throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
        } catch (RuntimeException e8) {
            e();
            throw e8;
        }
    }

    public final void a() {
        if (this.f2728d0 && this.f2727c0 == 0) {
            LinkedHashMap linkedHashMap = this.f2726b0;
            for (l close : linkedHashMap.keySet()) {
                close.close();
            }
            Iterator it = this.f2729e0.iterator();
            if (!it.hasNext()) {
                linkedHashMap.clear();
                e eVar = this.f2719U;
                if (eVar.f2732a.getAndSet(false)) {
                    i.c(eVar.f2734c);
                    eVar.h();
                }
                this.f2720V.quit();
                return;
            }
            ((a) it.next()).getClass();
            new Exception("Failed to snapshot: DefaultSurfaceProcessor is released.");
            throw null;
        }
    }

    public final void b(Runnable runnable, Runnable runnable2) {
        try {
            this.f2721W.execute(new A4.d(this, runnable2, runnable, 3));
        } catch (RejectedExecutionException e) {
            h.J("DefaultSurfaceProcessor", "Unable to executor runnable", e);
            runnable2.run();
        }
    }

    public final void c(Exception exc) {
        ArrayList arrayList = this.f2729e0;
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            arrayList.clear();
        } else {
            ((a) it.next()).getClass();
            throw null;
        }
    }

    public final Bitmap d(Size size, float[] fArr, int i) {
        boolean z;
        int i8 = i;
        float[] fArr2 = (float[]) fArr.clone();
        C0996d.u(fArr2, (float) i8);
        C0996d.v(fArr2);
        Size e = f.e(size, i8);
        e eVar = this.f2719U;
        eVar.getClass();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(e.getHeight() * e.getWidth() * 4);
        if (allocateDirect.capacity() == e.getHeight() * e.getWidth() * 4) {
            z = true;
        } else {
            z = false;
        }
        a.h("ByteBuffer capacity is not equal to width * height * 4.", z);
        a.h("ByteBuffer is not direct.", allocateDirect.isDirect());
        int[] iArr = i.f3487a;
        int[] iArr2 = new int[1];
        GLES20.glGenTextures(1, iArr2, 0);
        i.b("glGenTextures");
        int i9 = iArr2[0];
        GLES20.glActiveTexture(33985);
        i.b("glActiveTexture");
        GLES20.glBindTexture(3553, i9);
        i.b("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, e.getWidth(), e.getHeight(), 0, 6407, 5121, (Buffer) null);
        i.b("glTexImage2D");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int[] iArr3 = new int[1];
        GLES20.glGenFramebuffers(1, iArr3, 0);
        i.b("glGenFramebuffers");
        int i10 = iArr3[0];
        GLES20.glBindFramebuffer(36160, i10);
        i.b("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i9, 0);
        i.b("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        i.b("glActiveTexture");
        GLES20.glBindTexture(36197, eVar.f2742m);
        i.b("glBindTexture");
        eVar.i = null;
        GLES20.glViewport(0, 0, e.getWidth(), e.getHeight());
        GLES20.glScissor(0, 0, e.getWidth(), e.getHeight());
        g gVar = eVar.f2740k;
        gVar.getClass();
        if (gVar instanceof O.h) {
            GLES20.glUniformMatrix4fv(((O.h) gVar).f3485f, 1, false, fArr2, 0);
            i.b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        i.b("glDrawArrays");
        GLES20.glReadPixels(0, 0, e.getWidth(), e.getHeight(), 6408, 5121, allocateDirect);
        i.b("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glDeleteTextures(1, new int[]{i9}, 0);
        i.b("glDeleteTextures");
        GLES20.glDeleteFramebuffers(1, new int[]{i10}, 0);
        i.b("glDeleteFramebuffers");
        int i11 = eVar.f2742m;
        GLES20.glActiveTexture(33984);
        i.b("glActiveTexture");
        GLES20.glBindTexture(36197, i11);
        i.b("glBindTexture");
        Bitmap createBitmap = Bitmap.createBitmap(e.getWidth(), e.getHeight(), Bitmap.Config.ARGB_8888);
        allocateDirect.rewind();
        ImageProcessingUtil.d(createBitmap, allocateDirect, e.getWidth() * 4);
        return createBitmap;
    }

    public final void e() {
        if (!this.f2723Y.getAndSet(true)) {
            b(new A.d(17, this), new C0663a0(5));
        }
    }

    public final void f(C6.f fVar) {
        ByteArrayOutputStream byteArrayOutputStream;
        ArrayList arrayList = this.f2729e0;
        if (!arrayList.isEmpty()) {
            if (fVar == null) {
                c(new Exception("Failed to snapshot: no JPEG Surface."));
                return;
            }
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                Iterator it = arrayList.iterator();
                if (!it.hasNext()) {
                    byteArrayOutputStream.close();
                    return;
                }
                ((a) it.next()).getClass();
                Bitmap d8 = d(fVar.f718V, fVar.f719W, 0);
                byteArrayOutputStream.reset();
                d8.compress(Bitmap.CompressFormat.JPEG, 0, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Surface surface = fVar.f717U;
                Objects.requireNonNull(byteArray);
                ImageProcessingUtil.g(byteArray, surface);
                throw null;
            } catch (IOException e) {
                c(e);
                return;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            return;
        }
        throw th;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        boolean z;
        if (!this.f2723Y.get()) {
            surfaceTexture.updateTexImage();
            float[] fArr = this.f2724Z;
            surfaceTexture.getTransformMatrix(fArr);
            C6.f fVar = null;
            while (true) {
                C6.f fVar2 = fVar;
                for (Map.Entry entry : this.f2726b0.entrySet()) {
                    Surface surface = (Surface) entry.getValue();
                    l lVar = (l) entry.getKey();
                    float[] fArr2 = lVar.f2776Y;
                    float[] fArr3 = this.f2725a0;
                    Matrix.multiplyMM(fArr3, 0, fArr, 0, fArr2, 0);
                    int i = lVar.f2774W;
                    if (i == 34) {
                        try {
                            this.f2719U.j(surfaceTexture.getTimestamp(), fArr3, surface);
                        } catch (RuntimeException e) {
                            h.m("DefaultSurfaceProcessor", "Failed to render with OpenGL.", e);
                        }
                    } else {
                        boolean z6 = true;
                        if (i == 256) {
                            z = true;
                        } else {
                            z = false;
                        }
                        a.m("Unsupported format: " + i, z);
                        if (fVar2 != null) {
                            z6 = false;
                        }
                        a.m("Only one JPEG output is supported.", z6);
                        fVar = new C6.f(surface, lVar.f2775X, (float[]) fArr3.clone());
                    }
                }
                try {
                    f(fVar2);
                    return;
                } catch (RuntimeException e8) {
                    c(e8);
                    return;
                }
            }
        }
    }
}
