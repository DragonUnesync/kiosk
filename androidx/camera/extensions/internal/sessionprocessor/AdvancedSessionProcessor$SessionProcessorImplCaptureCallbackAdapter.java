package androidx.camera.extensions.internal.sessionprocessor;

import D.D0;
import D.H0;
import android.hardware.camera2.CaptureResult;
import androidx.camera.extensions.impl.advanced.SessionProcessorImpl;
import java.util.Collections;
import java.util.Map;

class AdvancedSessionProcessor$SessionProcessorImplCaptureCallbackAdapter implements SessionProcessorImpl.CaptureCallback {
    private final D0 mCaptureCallback;
    private final AdvancedSessionProcessor$ExtensionMetadataMonitor mExtensionMetadataMonitor;
    private long mOnCaptureStartedTimestamp;
    private final H0 mTagBundle;
    private boolean mWillReceiveOnCaptureCompleted;

    public AdvancedSessionProcessor$SessionProcessorImplCaptureCallbackAdapter(D0 d02, H0 h02, boolean z) {
        this(d02, h02, (AdvancedSessionProcessor$ExtensionMetadataMonitor) null, z);
    }

    public void onCaptureCompleted(long j7, int i, Map<CaptureResult.Key, Object> map) {
        AdvancedSessionProcessor$ExtensionMetadataMonitor advancedSessionProcessor$ExtensionMetadataMonitor = this.mExtensionMetadataMonitor;
        if (advancedSessionProcessor$ExtensionMetadataMonitor != null) {
            advancedSessionProcessor$ExtensionMetadataMonitor.checkExtensionMetadata(map);
        }
        if (this.mWillReceiveOnCaptureCompleted) {
            this.mCaptureCallback.getClass();
            this.mCaptureCallback.getClass();
        }
    }

    public void onCaptureFailed(int i) {
        this.mCaptureCallback.getClass();
    }

    public void onCaptureProcessProgressed(int i) {
        this.mCaptureCallback.getClass();
    }

    public void onCaptureProcessStarted(int i) {
        this.mCaptureCallback.getClass();
    }

    public void onCaptureSequenceAborted(int i) {
        this.mCaptureCallback.getClass();
    }

    public void onCaptureSequenceCompleted(int i) {
        if (!this.mWillReceiveOnCaptureCompleted) {
            D0 d02 = this.mCaptureCallback;
            Collections.emptyMap();
            d02.getClass();
            this.mCaptureCallback.getClass();
        }
    }

    public void onCaptureStarted(int i, long j7) {
        this.mOnCaptureStartedTimestamp = j7;
        this.mCaptureCallback.getClass();
    }

    public AdvancedSessionProcessor$SessionProcessorImplCaptureCallbackAdapter(D0 d02, H0 h02, AdvancedSessionProcessor$ExtensionMetadataMonitor advancedSessionProcessor$ExtensionMetadataMonitor, boolean z) {
        this.mOnCaptureStartedTimestamp = -1;
        this.mTagBundle = h02;
        this.mExtensionMetadataMonitor = advancedSessionProcessor$ExtensionMetadataMonitor;
        this.mWillReceiveOnCaptureCompleted = z;
    }
}
