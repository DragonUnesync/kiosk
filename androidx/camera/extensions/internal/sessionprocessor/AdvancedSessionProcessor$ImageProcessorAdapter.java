package androidx.camera.extensions.internal.sessionprocessor;

import androidx.camera.extensions.impl.advanced.ImageProcessorImpl;

class AdvancedSessionProcessor$ImageProcessorAdapter {
    private final ImageProcessorImpl mImpl;

    public AdvancedSessionProcessor$ImageProcessorAdapter(ImageProcessorImpl imageProcessorImpl) {
        this.mImpl = imageProcessorImpl;
    }

    public void onNextImageAvailable(int i, long j7, c cVar, String str) {
        this.mImpl.onNextImageAvailable(i, j7, new AdvancedSessionProcessor$ImageReferenceImplAdapter(cVar), str);
    }
}
