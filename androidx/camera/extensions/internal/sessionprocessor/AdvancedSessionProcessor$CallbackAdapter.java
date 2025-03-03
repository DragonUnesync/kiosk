package androidx.camera.extensions.internal.sessionprocessor;

import D.C0060o;
import D.C0064s;
import D.u0;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.extensions.impl.advanced.RequestProcessorImpl;
import n2.a;

class AdvancedSessionProcessor$CallbackAdapter {
    private final RequestProcessorImpl.Callback mCallback;

    public AdvancedSessionProcessor$CallbackAdapter(RequestProcessorImpl.Callback callback) {
        this.mCallback = callback;
    }

    private RequestProcessorImpl.Request getImplRequest(u0 u0Var) {
        a.i(u0Var instanceof AdvancedSessionProcessor$RequestAdapter);
        return ((AdvancedSessionProcessor$RequestAdapter) u0Var).getImplRequest();
    }

    public void onCaptureBufferLost(u0 u0Var, long j7, int i) {
        this.mCallback.onCaptureBufferLost(getImplRequest(u0Var), j7, i);
    }

    public void onCaptureCompleted(u0 u0Var, C0064s sVar) {
        CaptureResult e = sVar.e();
        a.h("CaptureResult in cameraCaptureResult is not a TotalCaptureResult", e instanceof TotalCaptureResult);
        this.mCallback.onCaptureCompleted(getImplRequest(u0Var), (TotalCaptureResult) e);
    }

    public void onCaptureFailed(u0 u0Var, C0060o oVar) {
        Object a8 = oVar.a();
        a.h("CameraCaptureFailure does not contain CaptureFailure.", a8 instanceof CaptureFailure);
        this.mCallback.onCaptureFailed(getImplRequest(u0Var), (CaptureFailure) a8);
    }

    public void onCaptureProgressed(u0 u0Var, C0064s sVar) {
        boolean z;
        CaptureResult e = sVar.e();
        if (e != null) {
            z = true;
        } else {
            z = false;
        }
        a.h("Cannot get CaptureResult from the cameraCaptureResult ", z);
        this.mCallback.onCaptureProgressed(getImplRequest(u0Var), e);
    }

    public void onCaptureSequenceAborted(int i) {
        this.mCallback.onCaptureSequenceAborted(i);
    }

    public void onCaptureSequenceCompleted(int i, long j7) {
        this.mCallback.onCaptureSequenceCompleted(i, j7);
    }

    public void onCaptureStarted(u0 u0Var, long j7, long j8) {
        this.mCallback.onCaptureStarted(getImplRequest(u0Var), j7, j8);
    }
}
