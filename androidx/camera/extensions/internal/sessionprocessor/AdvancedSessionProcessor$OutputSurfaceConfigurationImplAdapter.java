package androidx.camera.extensions.internal.sessionprocessor;

import D.C0057m0;
import androidx.camera.extensions.impl.advanced.OutputSurfaceConfigurationImpl;
import androidx.camera.extensions.impl.advanced.OutputSurfaceImpl;

class AdvancedSessionProcessor$OutputSurfaceConfigurationImplAdapter implements OutputSurfaceConfigurationImpl {
    private final OutputSurfaceImpl mAnalysisOutputSurface;
    private final OutputSurfaceImpl mCaptureOutputSurface;
    private final OutputSurfaceImpl mPostviewOutputSurface;
    private final OutputSurfaceImpl mPreviewOutputSurface;

    public AdvancedSessionProcessor$OutputSurfaceConfigurationImplAdapter(C0057m0 m0Var) {
        throw null;
    }

    public OutputSurfaceImpl getImageAnalysisOutputSurface() {
        return this.mAnalysisOutputSurface;
    }

    public OutputSurfaceImpl getImageCaptureOutputSurface() {
        return this.mCaptureOutputSurface;
    }

    public OutputSurfaceImpl getPostviewOutputSurface() {
        return this.mPostviewOutputSurface;
    }

    public OutputSurfaceImpl getPreviewOutputSurface() {
        return this.mPreviewOutputSurface;
    }
}
