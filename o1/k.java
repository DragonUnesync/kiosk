package o1;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.WindowManager;
import de.ozerov.fully.M2;
import java.util.concurrent.CopyOnWriteArrayList;
import n1.p;

public final class k extends GLSurfaceView {

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ int f14187i0 = 0;

    /* renamed from: U  reason: collision with root package name */
    public final CopyOnWriteArrayList f14188U = new CopyOnWriteArrayList();

    /* renamed from: V  reason: collision with root package name */
    public final SensorManager f14189V;

    /* renamed from: W  reason: collision with root package name */
    public final Sensor f14190W;

    /* renamed from: a0  reason: collision with root package name */
    public final C1312d f14191a0;

    /* renamed from: b0  reason: collision with root package name */
    public final Handler f14192b0 = new Handler(Looper.getMainLooper());

    /* renamed from: c0  reason: collision with root package name */
    public final i f14193c0;

    /* renamed from: d0  reason: collision with root package name */
    public SurfaceTexture f14194d0;

    /* renamed from: e0  reason: collision with root package name */
    public Surface f14195e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f14196f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f14197g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f14198h0;

    public k(Context context) {
        super(context, (AttributeSet) null);
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.f14189V = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.f14190W = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        i iVar = new i();
        this.f14193c0 = iVar;
        j jVar = new j(this, iVar);
        l lVar = new l(context, jVar);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.f14191a0 = new C1312d(windowManager.getDefaultDisplay(), lVar, jVar);
        this.f14196f0 = true;
        setEGLContextClientVersion(2);
        setRenderer(jVar);
        setOnTouchListener(lVar);
    }

    public final void a() {
        boolean z;
        if (!this.f14196f0 || !this.f14197g0) {
            z = false;
        } else {
            z = true;
        }
        Sensor sensor = this.f14190W;
        if (sensor != null && z != this.f14198h0) {
            C1312d dVar = this.f14191a0;
            SensorManager sensorManager = this.f14189V;
            if (z) {
                sensorManager.registerListener(dVar, sensor, 0);
            } else {
                sensorManager.unregisterListener(dVar);
            }
            this.f14198h0 = z;
        }
    }

    public C1309a getCameraMotionListener() {
        return this.f14193c0;
    }

    public p getVideoFrameMetadataListener() {
        return this.f14193c0;
    }

    public Surface getVideoSurface() {
        return this.f14195e0;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f14192b0.post(new M2(11, (Object) this));
    }

    public final void onPause() {
        this.f14197g0 = false;
        a();
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
        this.f14197g0 = true;
        a();
    }

    public void setDefaultStereoMode(int i) {
        this.f14193c0.f14173e0 = i;
    }

    public void setUseSensorRotation(boolean z) {
        this.f14196f0 = z;
        a();
    }
}
