package v;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import java.util.HashMap;
import k2.C1160q;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f15854a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final C1160q f15855b;

    /* renamed from: c  reason: collision with root package name */
    public final String f15856c;

    /* renamed from: d  reason: collision with root package name */
    public d4.k f15857d = null;

    public k(CameraCharacteristics cameraCharacteristics, String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f15855b = new C1160q(22, (Object) cameraCharacteristics);
        } else {
            this.f15855b = new C1160q(22, (Object) cameraCharacteristics);
        }
        this.f15856c = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(android.hardware.camera2.CameraCharacteristics.Key r3) {
        /*
            r2 = this;
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0013
            k2.q r0 = r2.f15855b
            java.lang.Object r0 = r0.f13026V
            android.hardware.camera2.CameraCharacteristics r0 = (android.hardware.camera2.CameraCharacteristics) r0
            java.lang.Object r3 = r0.get(r3)
            return r3
        L_0x0013:
            monitor-enter(r2)
            java.util.HashMap r0 = r2.f15854a     // Catch:{ all -> 0x001e }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x001e }
            if (r0 == 0) goto L_0x0020
            monitor-exit(r2)     // Catch:{ all -> 0x001e }
            return r0
        L_0x001e:
            r3 = move-exception
            goto L_0x0033
        L_0x0020:
            k2.q r0 = r2.f15855b     // Catch:{ all -> 0x001e }
            java.lang.Object r0 = r0.f13026V     // Catch:{ all -> 0x001e }
            android.hardware.camera2.CameraCharacteristics r0 = (android.hardware.camera2.CameraCharacteristics) r0     // Catch:{ all -> 0x001e }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x001e }
            if (r0 == 0) goto L_0x0031
            java.util.HashMap r1 = r2.f15854a     // Catch:{ all -> 0x001e }
            r1.put(r3, r0)     // Catch:{ all -> 0x001e }
        L_0x0031:
            monitor-exit(r2)     // Catch:{ all -> 0x001e }
            return r0
        L_0x0033:
            monitor-exit(r2)     // Catch:{ all -> 0x001e }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: v.k.a(android.hardware.camera2.CameraCharacteristics$Key):java.lang.Object");
    }

    public final d4.k b() {
        if (this.f15857d == null) {
            try {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap != null) {
                    this.f15857d = new d4.k(streamConfigurationMap, new i(this.f15856c));
                } else {
                    throw new IllegalArgumentException("StreamConfigurationMap is null!");
                }
            } catch (AssertionError | NullPointerException e) {
                throw new IllegalArgumentException(e.getMessage());
            }
        }
        return this.f15857d;
    }
}
