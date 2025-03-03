package H5;

import D2.o;
import G5.v;
import Q3.a;
import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import android.os.Handler;
import android.support.v4.media.session.b;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class h {

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ int f2189m = 0;

    /* renamed from: a  reason: collision with root package name */
    public Camera f2190a;

    /* renamed from: b  reason: collision with root package name */
    public Camera.CameraInfo f2191b;

    /* renamed from: c  reason: collision with root package name */
    public b f2192c;

    /* renamed from: d  reason: collision with root package name */
    public a f2193d;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public String f2194f;

    /* renamed from: g  reason: collision with root package name */
    public i f2195g = new i();

    /* renamed from: h  reason: collision with root package name */
    public o f2196h;
    public v i;

    /* renamed from: j  reason: collision with root package name */
    public v f2197j;

    /* renamed from: k  reason: collision with root package name */
    public int f2198k = -1;

    /* renamed from: l  reason: collision with root package name */
    public final g f2199l = new g(this);

    public h(Context context) {
    }

    public final int a() {
        int i8;
        int i9 = this.f2196h.f1137V;
        int i10 = 0;
        if (i9 != 0) {
            if (i9 == 1) {
                i10 = 90;
            } else if (i9 == 2) {
                i10 = 180;
            } else if (i9 == 3) {
                i10 = 270;
            }
        }
        Camera.CameraInfo cameraInfo = this.f2191b;
        if (cameraInfo.facing == 1) {
            i8 = (360 - ((cameraInfo.orientation + i10) % 360)) % 360;
        } else {
            i8 = ((cameraInfo.orientation - i10) + 360) % 360;
        }
        Log.i("h", "Camera Display Orientation: " + i8);
        return i8;
    }

    public final void b() {
        if (this.f2190a != null) {
            try {
                int a8 = a();
                this.f2198k = a8;
                this.f2190a.setDisplayOrientation(a8);
            } catch (Exception unused) {
                Log.w("h", "Failed to set rotation.");
            }
            try {
                d(false);
            } catch (Exception unused2) {
                try {
                    d(true);
                } catch (Exception unused3) {
                    Log.w("h", "Camera rejected even safe-mode parameters! No configuration");
                }
            }
            Camera.Size previewSize = this.f2190a.getParameters().getPreviewSize();
            if (previewSize == null) {
                this.f2197j = this.i;
            } else {
                this.f2197j = new v(previewSize.width, previewSize.height);
            }
            this.f2199l.f2187b = this.f2197j;
            return;
        }
        throw new RuntimeException("Camera not open");
    }

    public final void c() {
        Camera camera;
        int l8 = b.l(this.f2195g.f2200a);
        if (l8 == -1) {
            camera = null;
        } else {
            camera = Camera.open(l8);
        }
        this.f2190a = camera;
        if (camera != null) {
            int l9 = b.l(this.f2195g.f2200a);
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            this.f2191b = cameraInfo;
            Camera.getCameraInfo(l9, cameraInfo);
            return;
        }
        throw new RuntimeException("Failed to open camera");
    }

    public final void d(boolean z) {
        String str;
        boolean z6;
        Camera.Parameters parameters = this.f2190a.getParameters();
        String str2 = this.f2194f;
        if (str2 == null) {
            this.f2194f = parameters.flatten();
        } else {
            parameters.unflatten(str2);
        }
        if (parameters == null) {
            Log.w("h", "Device error: no camera parameters are available. Proceeding without configuration.");
            return;
        }
        Log.i("h", "Initial camera parameters: " + parameters.flatten());
        if (z) {
            Log.w("h", "In camera config safe mode -- most settings will not be honored");
        }
        this.f2195g.getClass();
        int i8 = c.f2169a;
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        String a8 = c.a("focus mode", supportedFocusModes, "auto");
        if (!z && a8 == null) {
            a8 = c.a("focus mode", supportedFocusModes, "macro", "edof");
        }
        if (a8 != null) {
            if (a8.equals(parameters.getFocusMode())) {
                Log.i("CameraConfiguration", "Focus mode already set to ".concat(a8));
            } else {
                parameters.setFocusMode(a8);
            }
        }
        if (!z) {
            c.b(parameters, false);
            this.f2195g.getClass();
            this.f2195g.getClass();
            this.f2195g.getClass();
        }
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        ArrayList arrayList = new ArrayList();
        if (supportedPreviewSizes == null) {
            Camera.Size previewSize = parameters.getPreviewSize();
            if (previewSize != null) {
                arrayList.add(new v(previewSize.width, previewSize.height));
            }
        } else {
            for (Camera.Size next : supportedPreviewSizes) {
                arrayList.add(new v(next.width, next.height));
            }
        }
        int[] iArr = null;
        if (arrayList.size() == 0) {
            this.i = null;
        } else {
            o oVar = this.f2196h;
            int i9 = this.f2198k;
            if (i9 != -1) {
                if (i9 % 180 != 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                v vVar = (v) oVar.f1138W;
                if (vVar == null) {
                    vVar = null;
                } else if (z6) {
                    vVar = new v(vVar.f1736V, vVar.f1735U);
                }
                k kVar = (k) oVar.f1139X;
                kVar.getClass();
                if (vVar != null) {
                    Collections.sort(arrayList, new E.a(kVar, vVar));
                }
                Log.i("k", "Viewfinder size: " + vVar);
                Log.i("k", "Preview in order of preference: " + arrayList);
                v vVar2 = (v) arrayList.get(0);
                this.i = vVar2;
                parameters.setPreviewSize(vVar2.f1735U, vVar2.f1736V);
            } else {
                throw new IllegalStateException("Rotation not calculated yet. Call configure() first.");
            }
        }
        if (Build.DEVICE.equals("glass-1")) {
            List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
            StringBuilder sb = new StringBuilder("Supported FPS ranges: ");
            if (supportedPreviewFpsRange == null || supportedPreviewFpsRange.isEmpty()) {
                str = "[]";
            } else {
                StringBuilder sb2 = new StringBuilder("[");
                Iterator<int[]> it = supportedPreviewFpsRange.iterator();
                while (it.hasNext()) {
                    sb2.append(Arrays.toString(it.next()));
                    if (it.hasNext()) {
                        sb2.append(", ");
                    }
                }
                sb2.append(']');
                str = sb2.toString();
            }
            sb.append(str);
            Log.i("CameraConfiguration", sb.toString());
            if (supportedPreviewFpsRange != null && !supportedPreviewFpsRange.isEmpty()) {
                Iterator<int[]> it2 = supportedPreviewFpsRange.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    int[] next2 = it2.next();
                    int i10 = next2[0];
                    int i11 = next2[1];
                    if (i10 >= 10000 && i11 <= 20000) {
                        iArr = next2;
                        break;
                    }
                }
                if (iArr == null) {
                    Log.i("CameraConfiguration", "No suitable FPS range?");
                } else {
                    int[] iArr2 = new int[2];
                    parameters.getPreviewFpsRange(iArr2);
                    if (Arrays.equals(iArr2, iArr)) {
                        Log.i("CameraConfiguration", "FPS range already set to " + Arrays.toString(iArr));
                    } else {
                        Log.i("CameraConfiguration", "Setting FPS range to " + Arrays.toString(iArr));
                        parameters.setPreviewFpsRange(iArr[0], iArr[1]);
                    }
                }
            }
        }
        Log.i("h", "Final camera parameters: " + parameters.flatten());
        this.f2190a.setParameters(parameters);
    }

    public final void e(boolean z) {
        boolean z6;
        String flashMode;
        Camera camera = this.f2190a;
        if (camera != null) {
            try {
                Camera.Parameters parameters = camera.getParameters();
                if (parameters == null || (flashMode = parameters.getFlashMode()) == null || (!"on".equals(flashMode) && !"torch".equals(flashMode))) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                if (z != z6) {
                    b bVar = this.f2192c;
                    if (bVar != null) {
                        bVar.c();
                    }
                    Camera.Parameters parameters2 = this.f2190a.getParameters();
                    c.b(parameters2, z);
                    this.f2195g.getClass();
                    this.f2190a.setParameters(parameters2);
                    b bVar2 = this.f2192c;
                    if (bVar2 != null) {
                        bVar2.f2164a = false;
                        bVar2.b();
                    }
                }
            } catch (RuntimeException e8) {
                Log.e("h", "Failed to set torch", e8);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [Q3.a, java.lang.Object] */
    public final void f() {
        Camera camera = this.f2190a;
        if (camera != null && !this.e) {
            camera.startPreview();
            this.e = true;
            this.f2192c = new b(this.f2190a, this.f2195g);
            i iVar = this.f2195g;
            ? obj = new Object();
            obj.f4107a = this;
            obj.f4108b = new Handler();
            this.f2193d = obj;
            iVar.getClass();
        }
    }
}
