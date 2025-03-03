package v;

public class m extends i {
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0049, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004f, code lost:
        throw new v.C1502a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
        throw new v.C1502a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0038, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:2:0x002d, B:9:0x0045] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(w.v r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f15852V
            android.hardware.camera2.CameraDevice r0 = (android.hardware.camera2.CameraDevice) r0
            v.i.b(r0, r6)
            v.f r1 = new v.f
            w.u r6 = r6.f16176a
            java.util.concurrent.Executor r2 = r6.f()
            android.hardware.camera2.CameraCaptureSession$StateCallback r3 = r6.c()
            r1.<init>(r2, r3)
            java.util.List r2 = r6.d()
            java.util.ArrayList r2 = v.i.j(r2)
            java.lang.Object r3 = r5.f15853W
            v.h r3 = (v.h) r3
            r3.getClass()
            w.h r4 = r6.e()
            android.os.Handler r3 = r3.f15850a
            if (r4 == 0) goto L_0x003a
            w.e r6 = r4.f16152a     // Catch:{ CameraAccessException -> 0x0038 }
            android.hardware.camera2.params.InputConfiguration r6 = r6.f16151a     // Catch:{ CameraAccessException -> 0x0038 }
            r6.getClass()     // Catch:{ CameraAccessException -> 0x0038 }
            r0.createReprocessableCaptureSession(r6, r2, r1, r3)     // Catch:{ CameraAccessException -> 0x0038 }
            goto L_0x0048
        L_0x0038:
            r6 = move-exception
            goto L_0x0050
        L_0x003a:
            int r6 = r6.b()     // Catch:{ CameraAccessException -> 0x0038 }
            r4 = 1
            if (r6 != r4) goto L_0x0045
            r0.createConstrainedHighSpeedCaptureSession(r2, r1, r3)     // Catch:{ CameraAccessException -> 0x0038 }
            goto L_0x0048
        L_0x0045:
            r0.createCaptureSession(r2, r1, r3)     // Catch:{ CameraAccessException -> 0x0049 }
        L_0x0048:
            return
        L_0x0049:
            r6 = move-exception
            v.a r0 = new v.a     // Catch:{ CameraAccessException -> 0x0038 }
            r0.<init>((android.hardware.camera2.CameraAccessException) r6)     // Catch:{ CameraAccessException -> 0x0038 }
            throw r0     // Catch:{ CameraAccessException -> 0x0038 }
        L_0x0050:
            v.a r0 = new v.a
            r0.<init>((android.hardware.camera2.CameraAccessException) r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v.m.c(w.v):void");
    }
}
