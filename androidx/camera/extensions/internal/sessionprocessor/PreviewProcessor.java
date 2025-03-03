package androidx.camera.extensions.internal.sessionprocessor;

import F.h;
import R.a;
import R.b;
import R.e;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.camera.extensions.impl.PreviewImageProcessorImpl;
import androidx.camera.extensions.impl.ProcessResultImpl;
import java.util.List;

class PreviewProcessor {
    private static final String TAG = "PreviewProcessor";
    private final b mCaptureResultImageMatcher = new b();
    private boolean mIsClosed = false;
    private boolean mIsPaused = false;
    private final Object mLock = new Object();
    private final PreviewImageProcessorImpl mPreviewImageProcessor;

    public interface OnCaptureResultCallback {
        void onCaptureResult(long j7, List<Pair<CaptureResult.Key, Object>> list);
    }

    public PreviewProcessor(PreviewImageProcessorImpl previewImageProcessorImpl, Surface surface, Size size) {
        this.mPreviewImageProcessor = previewImageProcessorImpl;
        previewImageProcessorImpl.onResolutionUpdate(size);
        previewImageProcessorImpl.onOutputSurface(surface, 1);
        previewImageProcessorImpl.onImageFormatUpdate(35);
    }

    private /* synthetic */ void lambda$start$0(final OnCaptureResultCallback onCaptureResultCallback, c cVar, TotalCaptureResult totalCaptureResult, int i) {
        synchronized (this.mLock) {
            try {
                if (this.mIsClosed || this.mIsPaused) {
                    cVar.a();
                    h.j(TAG, "Ignore image in closed or paused state");
                    return;
                }
                a aVar = a.f4223Y;
                if (!b.c(aVar) || !e.m(aVar)) {
                    this.mPreviewImageProcessor.process(cVar.get(), totalCaptureResult);
                } else {
                    this.mPreviewImageProcessor.process(cVar.get(), totalCaptureResult, new ProcessResultImpl() {
                        public void onCaptureCompleted(long j7, List<Pair<CaptureResult.Key, Object>> list) {
                            onCaptureResultCallback.onCaptureResult(j7, list);
                        }

                        public void onCaptureProcessProgressed(int i) {
                        }
                    }, D7.b.z());
                }
                cVar.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void close() {
        synchronized (this.mLock) {
            this.mIsClosed = true;
            this.mCaptureResultImageMatcher.b();
            this.mCaptureResultImageMatcher.c();
        }
    }

    public void notifyCaptureResult(TotalCaptureResult totalCaptureResult) {
        this.mCaptureResultImageMatcher.a(totalCaptureResult, 0);
    }

    public void notifyImage(c cVar) {
        this.mCaptureResultImageMatcher.d();
        throw null;
    }

    public void pause() {
        synchronized (this.mLock) {
            this.mIsPaused = true;
        }
    }

    public void resume() {
        synchronized (this.mLock) {
            this.mIsPaused = false;
        }
    }

    public void start(OnCaptureResultCallback onCaptureResultCallback) {
        synchronized (this.mCaptureResultImageMatcher.f7647a) {
        }
    }
}
