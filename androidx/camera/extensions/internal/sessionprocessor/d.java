package androidx.camera.extensions.internal.sessionprocessor;

import androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor;
import java.util.HashMap;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ StillCaptureProcessor f7651U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ boolean f7652V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ HashMap f7653W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ StillCaptureProcessor.OnCaptureResultCallback f7654X;

    public /* synthetic */ d(StillCaptureProcessor stillCaptureProcessor, boolean z, HashMap hashMap, StillCaptureProcessor.OnCaptureResultCallback onCaptureResultCallback) {
        this.f7651U = stillCaptureProcessor;
        this.f7652V = z;
        this.f7653W = hashMap;
        this.f7654X = onCaptureResultCallback;
    }

    public final void run() {
        this.f7651U.lambda$process$1(this.f7652V, this.f7653W, this.f7654X);
    }
}
