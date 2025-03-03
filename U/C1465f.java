package u;

import B7.e;
import F.i;
import P0.g;
import a0.j;
import a1.C0412c;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.camera.lifecycle.c;
import com.bumptech.glide.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import v.b;

/* renamed from: u.f  reason: case insensitive filesystem */
public final class C1465f extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15613a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f15614b;

    /* renamed from: c  reason: collision with root package name */
    public Object f15615c;

    public C1465f(int i) {
        this.f15613a = i;
        switch (i) {
            case 3:
                this.f15614b = d.i(new c(22, this));
                return;
            default:
                this.f15615c = null;
                this.f15614b = new HashMap();
                return;
        }
    }

    public void a(CaptureRequest captureRequest, List list) {
        HashMap hashMap = (HashMap) this.f15614b;
        List list2 = (List) hashMap.get(captureRequest);
        if (list2 != null) {
            ArrayList arrayList = new ArrayList(list2.size() + list.size());
            arrayList.addAll(list);
            arrayList.addAll(list2);
            hashMap.put(captureRequest, arrayList);
            return;
        }
        hashMap.put(captureRequest, list);
    }

    public void b() {
        j jVar = (j) this.f15615c;
        if (jVar != null) {
            jVar.a((Object) null);
            this.f15615c = null;
        }
    }

    public List c(CaptureRequest captureRequest) {
        List list = (List) ((HashMap) this.f15614b).get(captureRequest);
        if (list != null) {
            return list;
        }
        return Collections.emptyList();
    }

    public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j7) {
        switch (this.f15613a) {
            case 1:
                for (CameraCaptureSession.CaptureCallback k8 : c(captureRequest)) {
                    k8.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j7);
                }
                return;
            case 2:
                ((i) this.f15615c).execute(new v.d(this, cameraCaptureSession, captureRequest, surface, j7));
                return;
            default:
                super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j7);
                return;
        }
    }

    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        switch (this.f15613a) {
            case 0:
                ((i) this.f15615c).execute(new C0412c((Object) this, 19, (Object) totalCaptureResult));
                return;
            case 1:
                for (CameraCaptureSession.CaptureCallback onCaptureCompleted : c(captureRequest)) {
                    onCaptureCompleted.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                }
                return;
            case 2:
                ((i) this.f15615c).execute(new e(this, cameraCaptureSession, captureRequest, totalCaptureResult, 8));
                return;
            default:
                b();
                return;
        }
    }

    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        switch (this.f15613a) {
            case 1:
                for (CameraCaptureSession.CaptureCallback onCaptureFailed : c(captureRequest)) {
                    onCaptureFailed.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                }
                return;
            case 2:
                ((i) this.f15615c).execute(new e(this, cameraCaptureSession, captureRequest, captureFailure, 10));
                return;
            case 3:
                b();
                return;
            default:
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                return;
        }
    }

    public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        switch (this.f15613a) {
            case 1:
                for (CameraCaptureSession.CaptureCallback onCaptureProgressed : c(captureRequest)) {
                    onCaptureProgressed.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                }
                return;
            case 2:
                ((i) this.f15615c).execute(new e(this, cameraCaptureSession, captureRequest, captureResult, 9));
                return;
            default:
                super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                return;
        }
    }

    public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        switch (this.f15613a) {
            case 1:
                for (List<CameraCaptureSession.CaptureCallback> it : ((HashMap) this.f15614b).values()) {
                    for (CameraCaptureSession.CaptureCallback onCaptureSequenceAborted : it) {
                        onCaptureSequenceAborted.onCaptureSequenceAborted(cameraCaptureSession, i);
                    }
                }
                C1447G g8 = (C1447G) this.f15615c;
                if (g8 != null) {
                    g8.a();
                    return;
                }
                return;
            case 2:
                ((i) this.f15615c).execute(new g((Object) this, (AutoCloseable) cameraCaptureSession, i, 6));
                return;
            case 3:
                b();
                return;
            default:
                super.onCaptureSequenceAborted(cameraCaptureSession, i);
                return;
        }
    }

    public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j7) {
        switch (this.f15613a) {
            case 1:
                for (List<CameraCaptureSession.CaptureCallback> it : ((HashMap) this.f15614b).values()) {
                    for (CameraCaptureSession.CaptureCallback onCaptureSequenceCompleted : it) {
                        onCaptureSequenceCompleted.onCaptureSequenceCompleted(cameraCaptureSession, i, j7);
                    }
                }
                C1447G g8 = (C1447G) this.f15615c;
                if (g8 != null) {
                    g8.a();
                    return;
                }
                return;
            case 2:
                ((i) this.f15615c).execute(new v.c(this, cameraCaptureSession, i, j7));
                return;
            case 3:
                b();
                return;
            default:
                super.onCaptureSequenceCompleted(cameraCaptureSession, i, j7);
                return;
        }
    }

    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j7, long j8) {
        switch (this.f15613a) {
            case 1:
                for (CameraCaptureSession.CaptureCallback onCaptureStarted : c(captureRequest)) {
                    onCaptureStarted.onCaptureStarted(cameraCaptureSession, captureRequest, j7, j8);
                }
                return;
            case 2:
                ((i) this.f15615c).execute(new b(this, cameraCaptureSession, captureRequest, j7, j8));
                return;
            case 3:
                b();
                return;
            default:
                super.onCaptureStarted(cameraCaptureSession, captureRequest, j7, j8);
                return;
        }
    }

    public C1465f(i iVar, CameraCaptureSession.CaptureCallback captureCallback) {
        this.f15613a = 2;
        this.f15615c = iVar;
        this.f15614b = captureCallback;
    }

    public C1465f(i iVar) {
        this.f15613a = 0;
        this.f15614b = new HashSet();
        this.f15615c = iVar;
    }
}
