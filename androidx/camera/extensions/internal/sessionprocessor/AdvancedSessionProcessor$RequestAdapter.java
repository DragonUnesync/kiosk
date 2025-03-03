package androidx.camera.extensions.internal.sessionprocessor;

import A.h;
import D.K;
import D.u0;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.extensions.impl.advanced.RequestProcessorImpl;
import java.util.ArrayList;
import java.util.List;

class AdvancedSessionProcessor$RequestAdapter implements u0 {
    private final RequestProcessorImpl.Request mImplRequest;
    private final K mParameters;
    private final List<Integer> mTargetOutputConfigIds;
    private final int mTemplateId;

    public AdvancedSessionProcessor$RequestAdapter(RequestProcessorImpl.Request request) {
        this.mImplRequest = request;
        ArrayList arrayList = new ArrayList();
        for (Integer add : request.getTargetOutputConfigIds()) {
            arrayList.add(add);
        }
        this.mTargetOutputConfigIds = arrayList;
        h hVar = new h(3);
        for (CaptureRequest.Key key : request.getParameters().keySet()) {
            hVar.f(key, request.getParameters().get(key));
        }
        this.mParameters = hVar.d();
        this.mTemplateId = request.getTemplateId().intValue();
    }

    public RequestProcessorImpl.Request getImplRequest() {
        return this.mImplRequest;
    }

    public K getParameters() {
        return this.mParameters;
    }

    public List<Integer> getTargetOutputConfigIds() {
        return this.mTargetOutputConfigIds;
    }

    public int getTemplateId() {
        return this.mTemplateId;
    }
}
