package de.ozerov.fully;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

public final class O1 implements SensorEventListener {

    /* renamed from: r  reason: collision with root package name */
    public static final AtomicBoolean f10197r = new AtomicBoolean(false);

    /* renamed from: s  reason: collision with root package name */
    public static volatile long f10198s = 0;

    /* renamed from: t  reason: collision with root package name */
    public static volatile long f10199t = 0;

    /* renamed from: a  reason: collision with root package name */
    public final FullyActivity f10200a;

    /* renamed from: b  reason: collision with root package name */
    public float f10201b = 0.3f;

    /* renamed from: c  reason: collision with root package name */
    public float f10202c = 0.8f;

    /* renamed from: d  reason: collision with root package name */
    public SensorManager f10203d = null;
    public Sensor e = null;

    /* renamed from: f  reason: collision with root package name */
    public Sensor f10204f = null;

    /* renamed from: g  reason: collision with root package name */
    public final float[] f10205g = new float[3];

    /* renamed from: h  reason: collision with root package name */
    public final float[] f10206h = new float[3];
    public final float[] i = new float[3];

    /* renamed from: j  reason: collision with root package name */
    public final float[] f10207j = new float[9];

    /* renamed from: k  reason: collision with root package name */
    public final float[] f10208k = new float[3];

    /* renamed from: l  reason: collision with root package name */
    public final float[] f10209l = new float[3];

    /* renamed from: m  reason: collision with root package name */
    public boolean f10210m = false;

    /* renamed from: n  reason: collision with root package name */
    public boolean f10211n = false;

    /* renamed from: o  reason: collision with root package name */
    public int f10212o;

    /* renamed from: p  reason: collision with root package name */
    public int f10213p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f10214q;

    public O1(FullyActivity fullyActivity) {
        this.f10200a = fullyActivity;
    }

    public static float a(float f8, float f9) {
        return (float) (3.141592653589793d - Math.abs((((double) Math.abs(f8 - f9)) % 6.283185307179586d) - 3.141592653589793d));
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0084 A[Catch:{ Exception -> 0x0095, all -> 0x0071 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void b() {
        /*
            r6 = this;
            r0 = 1
            monitor-enter(r6)
            d4.k r1 = new d4.k     // Catch:{ all -> 0x0071 }
            de.ozerov.fully.FullyActivity r2 = r6.f10200a     // Catch:{ all -> 0x0071 }
            r1.<init>((android.content.Context) r2, (int) r0)     // Catch:{ all -> 0x0071 }
            r2 = 0
            java.lang.Object r3 = r1.f9767W     // Catch:{ Exception -> 0x001b }
            Z1.c r3 = (Z1.c) r3     // Catch:{ Exception -> 0x001b }
            java.lang.String r4 = "accelerometerSensitivityV2"
            java.lang.String r5 = "90"
            java.lang.String r3 = r3.r(r4, r5)     // Catch:{ Exception -> 0x001b }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ Exception -> 0x001b }
            goto L_0x001c
        L_0x001b:
            r3 = 0
        L_0x001c:
            r6.f10212o = r3     // Catch:{ all -> 0x0071 }
            java.lang.Object r3 = r1.f9767W     // Catch:{ Exception -> 0x002f }
            Z1.c r3 = (Z1.c) r3     // Catch:{ Exception -> 0x002f }
            java.lang.String r4 = "compassSensitivity"
            java.lang.String r5 = "50"
            java.lang.String r3 = r3.r(r4, r5)     // Catch:{ Exception -> 0x002f }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ Exception -> 0x002f }
            goto L_0x0030
        L_0x002f:
            r3 = 0
        L_0x0030:
            r6.f10213p = r3     // Catch:{ all -> 0x0071 }
            java.lang.String r3 = "ignoreMovementWhenPlugged"
            java.lang.Object r1 = r1.f9767W     // Catch:{ all -> 0x0071 }
            Z1.c r1 = (Z1.c) r1     // Catch:{ all -> 0x0071 }
            boolean r1 = r1.n(r3, r2)     // Catch:{ all -> 0x0071 }
            r6.f10214q = r1     // Catch:{ all -> 0x0071 }
            r6.c()     // Catch:{ all -> 0x0071 }
            int r1 = r6.f10212o     // Catch:{ all -> 0x0071 }
            int r1 = 100 - r1
            float r1 = (float) r1     // Catch:{ all -> 0x0071 }
            r2 = 1106247680(0x41f00000, float:30.0)
            float r1 = r1 * r2
            r2 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r2
            r6.f10201b = r1     // Catch:{ all -> 0x0071 }
            int r1 = r6.f10213p     // Catch:{ all -> 0x0071 }
            int r1 = 100 - r1
            float r1 = (float) r1     // Catch:{ all -> 0x0071 }
            r3 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 * r3
            float r1 = r1 / r2
            r6.f10202c = r1     // Catch:{ all -> 0x0071 }
            de.ozerov.fully.FullyActivity r1 = r6.f10200a     // Catch:{ Exception -> 0x0095 }
            java.lang.String r2 = "sensor"
            java.lang.Object r1 = r1.getSystemService(r2)     // Catch:{ Exception -> 0x0095 }
            android.hardware.SensorManager r1 = (android.hardware.SensorManager) r1     // Catch:{ Exception -> 0x0095 }
            r6.f10203d = r1     // Catch:{ Exception -> 0x0095 }
            int r2 = r6.f10212o     // Catch:{ Exception -> 0x0095 }
            r3 = 3
            if (r2 != 0) goto L_0x0073
            int r2 = r6.f10213p     // Catch:{ Exception -> 0x0095 }
            if (r2 == 0) goto L_0x0080
            goto L_0x0073
        L_0x0071:
            r0 = move-exception
            goto L_0x00a1
        L_0x0073:
            android.hardware.Sensor r0 = r1.getDefaultSensor(r0)     // Catch:{ Exception -> 0x0095 }
            r6.e = r0     // Catch:{ Exception -> 0x0095 }
            if (r0 == 0) goto L_0x0080
            android.hardware.SensorManager r1 = r6.f10203d     // Catch:{ Exception -> 0x0095 }
            r1.registerListener(r6, r0, r3)     // Catch:{ Exception -> 0x0095 }
        L_0x0080:
            int r0 = r6.f10213p     // Catch:{ Exception -> 0x0095 }
            if (r0 == 0) goto L_0x009f
            android.hardware.SensorManager r0 = r6.f10203d     // Catch:{ Exception -> 0x0095 }
            r1 = 2
            android.hardware.Sensor r0 = r0.getDefaultSensor(r1)     // Catch:{ Exception -> 0x0095 }
            r6.f10204f = r0     // Catch:{ Exception -> 0x0095 }
            if (r0 == 0) goto L_0x009f
            android.hardware.SensorManager r1 = r6.f10203d     // Catch:{ Exception -> 0x0095 }
            r1.registerListener(r6, r0, r3)     // Catch:{ Exception -> 0x0095 }
            goto L_0x009f
        L_0x0095:
            java.lang.String r0 = "O1"
            java.lang.String r1 = "Failed to register sensor listeners"
            android.util.Log.e(r0, r1)     // Catch:{ all -> 0x0071 }
            r6.c()     // Catch:{ all -> 0x0071 }
        L_0x009f:
            monitor-exit(r6)
            return
        L_0x00a1:
            monitor-exit(r6)     // Catch:{ all -> 0x0071 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.O1.b():void");
    }

    public final synchronized void c() {
        try {
            SensorManager sensorManager = this.f10203d;
            if (sensorManager != null) {
                Sensor sensor = this.e;
                if (sensor != null) {
                    sensorManager.unregisterListener(this, sensor);
                    this.e = null;
                }
                Sensor sensor2 = this.f10204f;
                if (sensor2 != null) {
                    this.f10203d.unregisterListener(this, sensor2);
                    this.f10204f = null;
                }
                this.f10203d = null;
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final void onAccuracyChanged(Sensor sensor, int i8) {
        if (sensor != null && sensor.getType() == 2 && i8 == 0) {
            Log.e("O1", "Compass data unreliable");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x011e A[Catch:{ Exception -> 0x011c }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0137  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSensorChanged(android.hardware.SensorEvent r11) {
        /*
            r10 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = f10197r
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            android.hardware.Sensor r0 = r11.sensor
            int r0 = r0.getType()
            r3 = 2
            r4 = 0
            if (r0 != r2) goto L_0x0051
            float[] r0 = r11.values
            float[] r5 = r10.f10205g
            int r6 = r5.length
            java.lang.System.arraycopy(r0, r1, r5, r1, r6)
            float[] r0 = r10.f10205g
            r0 = r0[r1]
            float[] r5 = r10.i
            r5 = r5[r1]
            float r0 = r0 - r5
            float r0 = java.lang.Math.abs(r0)
            float[] r5 = r10.f10205g
            r5 = r5[r2]
            float[] r6 = r10.i
            r6 = r6[r2]
            float r5 = r5 - r6
            float r5 = java.lang.Math.abs(r5)
            float r5 = r5 + r0
            float[] r0 = r10.f10205g
            r0 = r0[r3]
            float[] r6 = r10.i
            r6 = r6[r3]
            float r0 = r0 - r6
            float r0 = java.lang.Math.abs(r0)
            float r0 = r0 + r5
            float[] r5 = r10.f10205g
            float[] r6 = r10.i
            int r7 = r6.length
            java.lang.System.arraycopy(r5, r1, r6, r1, r7)
            r4 = r0
        L_0x004f:
            r0 = 0
            goto L_0x00ac
        L_0x0051:
            android.hardware.Sensor r0 = r11.sensor
            int r0 = r0.getType()
            if (r0 != r3) goto L_0x004f
            float[] r0 = r11.values
            float[] r5 = r10.f10206h
            int r6 = r5.length
            java.lang.System.arraycopy(r0, r1, r5, r1, r6)
            float[] r0 = r10.f10207j
            float[] r5 = r10.f10205g
            float[] r6 = r10.f10206h
            r7 = 0
            android.hardware.SensorManager.getRotationMatrix(r0, r7, r5, r6)
            float[] r0 = r10.f10207j
            float[] r5 = r10.f10208k
            android.hardware.SensorManager.getOrientation(r0, r5)
            float[] r0 = r10.f10208k
            r0 = r0[r1]
            float[] r5 = r10.f10209l
            r5 = r5[r1]
            float r0 = a(r0, r5)
            float r0 = java.lang.Math.abs(r0)
            float[] r5 = r10.f10208k
            r5 = r5[r2]
            float[] r6 = r10.f10209l
            r6 = r6[r2]
            float r5 = a(r5, r6)
            float r5 = java.lang.Math.abs(r5)
            float r5 = r5 + r0
            float[] r0 = r10.f10208k
            r0 = r0[r3]
            float[] r6 = r10.f10209l
            r6 = r6[r3]
            float r0 = a(r0, r6)
            float r0 = java.lang.Math.abs(r0)
            float r0 = r0 + r5
            float[] r5 = r10.f10208k
            float[] r6 = r10.f10209l
            int r7 = r6.length
            java.lang.System.arraycopy(r5, r1, r6, r1, r7)
        L_0x00ac:
            int r5 = r10.f10212o
            if (r5 == 0) goto L_0x00c2
            boolean r5 = r10.f10210m
            if (r5 == 0) goto L_0x00c2
            android.hardware.Sensor r5 = r11.sensor
            int r5 = r5.getType()
            if (r5 != r2) goto L_0x00c2
            float r5 = r10.f10201b
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x00d8
        L_0x00c2:
            int r4 = r10.f10213p
            if (r4 == 0) goto L_0x012c
            boolean r4 = r10.f10211n
            if (r4 == 0) goto L_0x012c
            android.hardware.Sensor r4 = r11.sensor
            int r4 = r4.getType()
            if (r4 != r3) goto L_0x012c
            float r4 = r10.f10202c
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x012c
        L_0x00d8:
            long r4 = java.lang.System.currentTimeMillis()
            f10199t = r4
            long r4 = f10198s
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x00f3
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = f10198s
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 + r8
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x012c
        L_0x00f3:
            long r4 = java.lang.System.currentTimeMillis()
            f10198s = r4
            boolean r0 = r10.f10214q
            if (r0 == 0) goto L_0x0105
            de.ozerov.fully.FullyActivity r0 = r10.f10200a
            boolean r0 = de.ozerov.fully.P.H(r0)
            if (r0 != 0) goto L_0x012c
        L_0x0105:
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x011c }
            java.lang.String r4 = "com.fullykiosk.singleapp.action.movement_detected"
            r0.<init>(r4)     // Catch:{ Exception -> 0x011c }
            android.hardware.Sensor r4 = r11.sensor     // Catch:{ Exception -> 0x011c }
            int r4 = r4.getType()     // Catch:{ Exception -> 0x011c }
            java.lang.String r5 = "type"
            if (r4 != r2) goto L_0x011e
            java.lang.String r4 = "accelerometer"
            r0.putExtra(r5, r4)     // Catch:{ Exception -> 0x011c }
            goto L_0x0123
        L_0x011c:
            goto L_0x012c
        L_0x011e:
            java.lang.String r4 = "compass"
            r0.putExtra(r5, r4)     // Catch:{ Exception -> 0x011c }
        L_0x0123:
            de.ozerov.fully.FullyActivity r4 = r10.f10200a     // Catch:{ Exception -> 0x011c }
            L0.c r4 = L0.c.a(r4)     // Catch:{ Exception -> 0x011c }
            r4.c(r0)     // Catch:{ Exception -> 0x011c }
        L_0x012c:
            android.hardware.Sensor r0 = r11.sensor
            int r0 = r0.getType()
            if (r0 != r2) goto L_0x0137
            r10.f10210m = r2
            goto L_0x0141
        L_0x0137:
            android.hardware.Sensor r11 = r11.sensor
            int r11 = r11.getType()
            if (r11 != r3) goto L_0x0141
            r10.f10211n = r2
        L_0x0141:
            java.util.concurrent.atomic.AtomicBoolean r11 = f10197r
            r11.set(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.O1.onSensorChanged(android.hardware.SensorEvent):void");
    }
}
