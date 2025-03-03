package u;

import D.C0;
import D.C0054l;
import D.H0;
import D.I;
import F.h;
import K.b;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import de.ozerov.fully.K2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import n2.a;

/* renamed from: u.w  reason: case insensitive filesystem */
public final class C1482w extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15727a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f15728b;

    public C1482w(C0054l lVar) {
        this.f15727a = 1;
        if (lVar != null) {
            this.f15728b = lVar;
            return;
        }
        throw new NullPointerException("cameraCaptureCallback is null");
    }

    public static int a(CaptureRequest captureRequest) {
        Integer num;
        if ((captureRequest.getTag() instanceof H0) && (num = (Integer) ((H0) captureRequest.getTag()).f785a.get("CAPTURE_CONFIG_ID_KEY")) != null) {
            return num.intValue();
        }
        return -1;
    }

    public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j7) {
        switch (this.f15727a) {
            case 0:
                Iterator it = ((ArrayList) this.f15728b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j7);
                }
                return;
            default:
                super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j7);
                return;
        }
    }

    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        H0 h02;
        switch (this.f15727a) {
            case 0:
                Iterator it = ((ArrayList) this.f15728b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                }
                return;
            case 1:
                super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                Object tag = captureRequest.getTag();
                if (tag != null) {
                    a.h("The tagBundle object from the CaptureResult is not a TagBundle object.", tag instanceof H0);
                    h02 = (H0) tag;
                } else {
                    h02 = H0.f784b;
                }
                ((C0054l) this.f15728b).b(a(captureRequest), new K2((Object) h02, 25, (Object) totalCaptureResult));
                return;
            default:
                synchronized (((C1449I) this.f15728b).f15498a) {
                    try {
                        C0 c02 = ((C1449I) this.f15728b).f15502f;
                        if (c02 != null) {
                            I i = c02.f752g;
                            h.j("CaptureSession", "Submit FLASH_MODE_OFF request");
                            C1449I i8 = (C1449I) this.f15728b;
                            i8.f15509n.getClass();
                            i8.i(Collections.singletonList(b.c(i)));
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [D.o, java.lang.Object] */
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        switch (this.f15727a) {
            case 0:
                Iterator it = ((ArrayList) this.f15728b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                }
                return;
            case 1:
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                ((C0054l) this.f15728b).c(a(captureRequest), new Object());
                return;
            default:
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                return;
        }
    }

    public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        switch (this.f15727a) {
            case 0:
                Iterator it = ((ArrayList) this.f15728b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                }
                return;
            default:
                super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                return;
        }
    }

    public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        switch (this.f15727a) {
            case 0:
                Iterator it = ((ArrayList) this.f15728b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureSequenceAborted(cameraCaptureSession, i);
                }
                return;
            default:
                super.onCaptureSequenceAborted(cameraCaptureSession, i);
                return;
        }
    }

    public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j7) {
        switch (this.f15727a) {
            case 0:
                Iterator it = ((ArrayList) this.f15728b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureSequenceCompleted(cameraCaptureSession, i, j7);
                }
                return;
            default:
                super.onCaptureSequenceCompleted(cameraCaptureSession, i, j7);
                return;
        }
    }

    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j7, long j8) {
        switch (this.f15727a) {
            case 0:
                Iterator it = ((ArrayList) this.f15728b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureStarted(cameraCaptureSession, captureRequest, j7, j8);
                }
                return;
            case 1:
                super.onCaptureStarted(cameraCaptureSession, captureRequest, j7, j8);
                ((C0054l) this.f15728b).d(a(captureRequest));
                return;
            default:
                super.onCaptureStarted(cameraCaptureSession, captureRequest, j7, j8);
                return;
        }
    }

    public C1482w(List list) {
        this.f15727a = 0;
        this.f15728b = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraCaptureSession.CaptureCallback captureCallback = (CameraCaptureSession.CaptureCallback) it.next();
            if (!(captureCallback instanceof C1483x)) {
                ((ArrayList) this.f15728b).add(captureCallback);
            }
        }
    }

    public C1482w(C1449I i) {
        this.f15727a = 2;
        this.f15728b = i;
    }
}
