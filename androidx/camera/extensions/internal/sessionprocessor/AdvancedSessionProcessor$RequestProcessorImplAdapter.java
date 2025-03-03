package androidx.camera.extensions.internal.sessionprocessor;

import D.v0;
import androidx.camera.extensions.impl.advanced.ImageProcessorImpl;
import androidx.camera.extensions.impl.advanced.RequestProcessorImpl;
import java.util.ArrayList;
import java.util.List;

class AdvancedSessionProcessor$RequestProcessorImplAdapter implements RequestProcessorImpl {
    private final v0 mRequestProcessor;
    final /* synthetic */ a this$0;

    public AdvancedSessionProcessor$RequestProcessorImplAdapter(a aVar, v0 v0Var) {
    }

    public void abortCaptures() {
        throw null;
    }

    public void setImageProcessor(int i, ImageProcessorImpl imageProcessorImpl) {
        new AdvancedSessionProcessor$ImageProcessorAdapter(imageProcessorImpl);
        throw null;
    }

    public int setRepeating(RequestProcessorImpl.Request request, RequestProcessorImpl.Callback callback) {
        new AdvancedSessionProcessor$RequestAdapter(request);
        new AdvancedSessionProcessor$CallbackAdapter(callback);
        throw null;
    }

    public void stopRepeating() {
        throw null;
    }

    public int submit(RequestProcessorImpl.Request request, RequestProcessorImpl.Callback callback) {
        new AdvancedSessionProcessor$RequestAdapter(request);
        new AdvancedSessionProcessor$CallbackAdapter(callback);
        throw null;
    }

    public int submit(List<RequestProcessorImpl.Request> list, RequestProcessorImpl.Callback callback) {
        ArrayList arrayList = new ArrayList();
        for (RequestProcessorImpl.Request advancedSessionProcessor$RequestAdapter : list) {
            arrayList.add(new AdvancedSessionProcessor$RequestAdapter(advancedSessionProcessor$RequestAdapter));
        }
        new AdvancedSessionProcessor$CallbackAdapter(callback);
        throw null;
    }
}
