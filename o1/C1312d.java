package o1;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import com.bumptech.glide.j;

/* renamed from: o1.d  reason: case insensitive filesystem */
public final class C1312d implements SensorEventListener {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f14142a = new float[16];

    /* renamed from: b  reason: collision with root package name */
    public final float[] f14143b = new float[16];

    /* renamed from: c  reason: collision with root package name */
    public final float[] f14144c = new float[16];

    /* renamed from: d  reason: collision with root package name */
    public final float[] f14145d = new float[3];
    public final Display e;

    /* renamed from: f  reason: collision with root package name */
    public final C1311c[] f14146f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f14147g;

    public C1312d(Display display, C1311c... cVarArr) {
        this.e = display;
        this.f14146f = cVarArr;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f14142a;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.e.getRotation();
        float[] fArr3 = this.f14143b;
        if (rotation != 0) {
            int i8 = 129;
            if (rotation != 1) {
                i = 130;
                if (rotation != 2) {
                    if (rotation == 3) {
                        i8 = 130;
                        i = 1;
                    } else {
                        throw new IllegalStateException();
                    }
                }
            } else {
                i8 = 2;
                i = 129;
            }
            System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
            SensorManager.remapCoordinateSystem(fArr3, i8, i, fArr2);
        }
        SensorManager.remapCoordinateSystem(fArr2, 1, 131, fArr3);
        float[] fArr4 = this.f14145d;
        SensorManager.getOrientation(fArr3, fArr4);
        float f8 = fArr4[2];
        Matrix.rotateM(fArr2, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        boolean z = this.f14147g;
        float[] fArr5 = this.f14144c;
        if (!z) {
            j.f(fArr5, fArr2);
            this.f14147g = true;
        }
        System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
        Matrix.multiplyMM(fArr2, 0, fArr3, 0, fArr5, 0);
        C1311c[] cVarArr = this.f14146f;
        for (int i9 = 0; i9 < 2; i9++) {
            cVarArr[i9].a(fArr2, f8);
        }
    }
}
